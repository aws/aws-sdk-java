/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.fms.model.*;

/**
 * Interface for accessing FMS.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.fms.AbstractAWSFMS} instead.
 * </p>
 * <p>
 * <p>
 * This is the <i>Firewall Manager API Reference</i>. This guide is for developers who need detailed information about
 * the Firewall Manager API actions, data types, and errors. For detailed information about Firewall Manager features,
 * see the <a href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-chapter.html">Firewall Manager Developer
 * Guide</a>.
 * </p>
 * <p>
 * Some API actions require explicit resource permissions. For information, see the developer guide topic <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-api-permissions-ref.html">Firewall Manager required
 * permissions for API actions</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSFMS {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "fms";

    /**
     * <p>
     * Sets the Firewall Manager administrator account. The account must be a member of the organization in
     * Organizations whose resources you want to protect. Firewall Manager sets the permissions that allow the account
     * to administer your Firewall Manager policies.
     * </p>
     * <p>
     * The account that you associate with Firewall Manager is called the Firewall Manager administrator account.
     * </p>
     * 
     * @param associateAdminAccountRequest
     * @return Result of the AssociateAdminAccount operation returned by the service.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an Amazon Web Services account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>WAF Developer Guide</i>.
     * @sample AWSFMS.AssociateAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AssociateAdminAccount" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateAdminAccountResult associateAdminAccount(AssociateAdminAccountRequest associateAdminAccountRequest);

    /**
     * <p>
     * Permanently deletes an Firewall Manager applications list.
     * </p>
     * 
     * @param deleteAppsListRequest
     * @return Result of the DeleteAppsList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.DeleteAppsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteAppsList" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAppsListResult deleteAppsList(DeleteAppsListRequest deleteAppsListRequest);

    /**
     * <p>
     * Deletes an Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS) topic
     * that is used to record Firewall Manager SNS logs.
     * </p>
     * 
     * @param deleteNotificationChannelRequest
     * @return Result of the DeleteNotificationChannel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.DeleteNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteNotificationChannel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteNotificationChannelResult deleteNotificationChannel(DeleteNotificationChannelRequest deleteNotificationChannelRequest);

    /**
     * <p>
     * Permanently deletes an Firewall Manager policy.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an Amazon Web Services account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>WAF Developer Guide</i>.
     * @sample AWSFMS.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePolicyResult deletePolicy(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Permanently deletes an Firewall Manager protocols list.
     * </p>
     * 
     * @param deleteProtocolsListRequest
     * @return Result of the DeleteProtocolsList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.DeleteProtocolsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteProtocolsList" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProtocolsListResult deleteProtocolsList(DeleteProtocolsListRequest deleteProtocolsListRequest);

    /**
     * <p>
     * Disassociates the account that has been set as the Firewall Manager administrator account. To set a different
     * account as the administrator account, you must submit an <code>AssociateAdminAccount</code> request.
     * </p>
     * 
     * @param disassociateAdminAccountRequest
     * @return Result of the DisassociateAdminAccount operation returned by the service.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.DisassociateAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DisassociateAdminAccount" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateAdminAccountResult disassociateAdminAccount(DisassociateAdminAccountRequest disassociateAdminAccountRequest);

    /**
     * <p>
     * Returns the Organizations account that is associated with Firewall Manager as the Firewall Manager administrator.
     * </p>
     * 
     * @param getAdminAccountRequest
     * @return Result of the GetAdminAccount operation returned by the service.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAdminAccount" target="_top">AWS API
     *      Documentation</a>
     */
    GetAdminAccountResult getAdminAccount(GetAdminAccountRequest getAdminAccountRequest);

    /**
     * <p>
     * Returns information about the specified Firewall Manager applications list.
     * </p>
     * 
     * @param getAppsListRequest
     * @return Result of the GetAppsList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetAppsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAppsList" target="_top">AWS API
     *      Documentation</a>
     */
    GetAppsListResult getAppsList(GetAppsListRequest getAppsListRequest);

    /**
     * <p>
     * Returns detailed compliance information about the specified member account. Details include resources that are in
     * and out of compliance with the specified policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * Resources are considered noncompliant for WAF and Shield Advanced policies if the specified policy has not been
     * applied to them.
     * </p>
     * </li>
     * <li>
     * <p>
     * Resources are considered noncompliant for security group policies if they are in scope of the policy, they
     * violate one or more of the policy rules, and remediation is disabled or not possible.
     * </p>
     * </li>
     * <li>
     * <p>
     * Resources are considered noncompliant for Network Firewall policies if a firewall is missing in the VPC, if the
     * firewall endpoint isn't set up in an expected Availability Zone and subnet, if a subnet created by the Firewall
     * Manager doesn't have the expected route table, and for modifications to a firewall policy that violate the
     * Firewall Manager policy's rules.
     * </p>
     * </li>
     * <li>
     * <p>
     * Resources are considered noncompliant for DNS Firewall policies if a DNS Firewall rule group is missing from the
     * rule group associations for the VPC.
     * </p>
     * </li>
     * </ul>
     * 
     * @param getComplianceDetailRequest
     * @return Result of the GetComplianceDetail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @sample AWSFMS.GetComplianceDetail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetComplianceDetail" target="_top">AWS API
     *      Documentation</a>
     */
    GetComplianceDetailResult getComplianceDetail(GetComplianceDetailRequest getComplianceDetailRequest);

    /**
     * <p>
     * Information about the Amazon Simple Notification Service (SNS) topic that is used to record Firewall Manager SNS
     * logs.
     * </p>
     * 
     * @param getNotificationChannelRequest
     * @return Result of the GetNotificationChannel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetNotificationChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetNotificationChannelResult getNotificationChannel(GetNotificationChannelRequest getNotificationChannelRequest);

    /**
     * <p>
     * Returns information about the specified Firewall Manager policy.
     * </p>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidTypeException
     *         The value of the <code>Type</code> parameter is invalid.
     * @sample AWSFMS.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    GetPolicyResult getPolicy(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * If you created a Shield Advanced policy, returns policy-level attack summary information in the event of a
     * potential DDoS attack. Other policy types are currently unsupported.
     * </p>
     * 
     * @param getProtectionStatusRequest
     * @return Result of the GetProtectionStatus operation returned by the service.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetProtectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetProtectionStatus" target="_top">AWS API
     *      Documentation</a>
     */
    GetProtectionStatusResult getProtectionStatus(GetProtectionStatusRequest getProtectionStatusRequest);

    /**
     * <p>
     * Returns information about the specified Firewall Manager protocols list.
     * </p>
     * 
     * @param getProtocolsListRequest
     * @return Result of the GetProtocolsList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetProtocolsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetProtocolsList" target="_top">AWS API
     *      Documentation</a>
     */
    GetProtocolsListResult getProtocolsList(GetProtocolsListRequest getProtocolsListRequest);

    /**
     * <p>
     * Retrieves violations for a resource based on the specified Firewall Manager policy and Amazon Web Services
     * account.
     * </p>
     * 
     * @param getViolationDetailsRequest
     * @return Result of the GetViolationDetails operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetViolationDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetViolationDetails" target="_top">AWS API
     *      Documentation</a>
     */
    GetViolationDetailsResult getViolationDetails(GetViolationDetailsRequest getViolationDetailsRequest);

    /**
     * <p>
     * Returns an array of <code>AppsListDataSummary</code> objects.
     * </p>
     * 
     * @param listAppsListsRequest
     * @return Result of the ListAppsLists operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an Amazon Web Services account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>WAF Developer Guide</i>.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListAppsLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListAppsLists" target="_top">AWS API
     *      Documentation</a>
     */
    ListAppsListsResult listAppsLists(ListAppsListsRequest listAppsListsRequest);

    /**
     * <p>
     * Returns an array of <code>PolicyComplianceStatus</code> objects. Use <code>PolicyComplianceStatus</code> to get a
     * summary of which member accounts are protected by the specified policy.
     * </p>
     * 
     * @param listComplianceStatusRequest
     * @return Result of the ListComplianceStatus operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListComplianceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListComplianceStatus" target="_top">AWS API
     *      Documentation</a>
     */
    ListComplianceStatusResult listComplianceStatus(ListComplianceStatusRequest listComplianceStatusRequest);

    /**
     * <p>
     * Returns a <code>MemberAccounts</code> object that lists the member accounts in the administrator's Amazon Web
     * Services organization.
     * </p>
     * <p>
     * The <code>ListMemberAccounts</code> must be submitted by the account that is set as the Firewall Manager
     * administrator.
     * </p>
     * 
     * @param listMemberAccountsRequest
     * @return Result of the ListMemberAccounts operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListMemberAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListMemberAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    ListMemberAccountsResult listMemberAccounts(ListMemberAccountsRequest listMemberAccountsRequest);

    /**
     * <p>
     * Returns an array of <code>PolicySummary</code> objects.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return Result of the ListPolicies operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an Amazon Web Services account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>WAF Developer Guide</i>.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest);

    /**
     * <p>
     * Returns an array of <code>ProtocolsListDataSummary</code> objects.
     * </p>
     * 
     * @param listProtocolsListsRequest
     * @return Result of the ListProtocolsLists operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListProtocolsLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListProtocolsLists" target="_top">AWS API
     *      Documentation</a>
     */
    ListProtocolsListsResult listProtocolsLists(ListProtocolsListsRequest listProtocolsListsRequest);

    /**
     * <p>
     * Retrieves the list of tags for the specified Amazon Web Services resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @sample AWSFMS.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates an Firewall Manager applications list.
     * </p>
     * 
     * @param putAppsListRequest
     * @return Result of the PutAppsList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an Amazon Web Services account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>WAF Developer Guide</i>.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.PutAppsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutAppsList" target="_top">AWS API
     *      Documentation</a>
     */
    PutAppsListResult putAppsList(PutAppsListRequest putAppsListRequest);

    /**
     * <p>
     * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that Firewall Manager uses to record
     * SNS logs.
     * </p>
     * <p>
     * To perform this action outside of the console, you must configure the SNS topic to allow the Firewall Manager
     * role <code>AWSServiceRoleForFMS</code> to publish SNS logs. For more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-api-permissions-ref.html">Firewall Manager
     * required permissions for API actions</a> in the <i>Firewall Manager Developer Guide</i>.
     * </p>
     * 
     * @param putNotificationChannelRequest
     * @return Result of the PutNotificationChannel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.PutNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutNotificationChannel" target="_top">AWS API
     *      Documentation</a>
     */
    PutNotificationChannelResult putNotificationChannel(PutNotificationChannelRequest putNotificationChannelRequest);

    /**
     * <p>
     * Creates an Firewall Manager policy.
     * </p>
     * <p>
     * Firewall Manager provides the following types of policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An WAF policy (type WAFV2), which defines rule groups to run first in the corresponding WAF web ACL and rule
     * groups to run last in the web ACL.
     * </p>
     * </li>
     * <li>
     * <p>
     * An WAF Classic policy (type WAF), which defines a rule group.
     * </p>
     * </li>
     * <li>
     * <p>
     * A Shield Advanced policy, which applies Shield Advanced protection to specified accounts and resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * A security group policy, which manages VPC security groups across your Amazon Web Services organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Network Firewall policy, which provides firewall rules to filter network traffic in specified Amazon VPCs.
     * </p>
     * </li>
     * <li>
     * <p>
     * A DNS Firewall policy, which provides Route 53 Resolver DNS Firewall rules to filter DNS queries for specified
     * VPCs.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Each policy is specific to one of the types. If you want to enforce more than one policy type across accounts,
     * create multiple policies. You can create multiple policies for each type.
     * </p>
     * <p>
     * You must be subscribed to Shield Advanced to create a Shield Advanced policy. For more information about
     * subscribing to Shield Advanced, see <a
     * href="https://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_CreateSubscription.html"
     * >CreateSubscription</a>.
     * </p>
     * 
     * @param putPolicyRequest
     * @return Result of the PutPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an Amazon Web Services account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>WAF Developer Guide</i>.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidTypeException
     *         The value of the <code>Type</code> parameter is invalid.
     * @sample AWSFMS.PutPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    PutPolicyResult putPolicy(PutPolicyRequest putPolicyRequest);

    /**
     * <p>
     * Creates an Firewall Manager protocols list.
     * </p>
     * 
     * @param putProtocolsListRequest
     * @return Result of the PutProtocolsList operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an Amazon Web Services account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>WAF Developer Guide</i>.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.PutProtocolsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutProtocolsList" target="_top">AWS API
     *      Documentation</a>
     */
    PutProtocolsListResult putProtocolsList(PutProtocolsListRequest putProtocolsListRequest);

    /**
     * <p>
     * Adds one or more tags to an Amazon Web Services resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an Amazon Web Services account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>WAF Developer Guide</i>.
     * @sample AWSFMS.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from an Amazon Web Services resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @sample AWSFMS.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
