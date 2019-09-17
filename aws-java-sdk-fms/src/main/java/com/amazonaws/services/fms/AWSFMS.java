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
 * <fullname>AWS Firewall Manager</fullname>
 * <p>
 * This is the <i>AWS Firewall Manager API Reference</i>. This guide is for developers who need detailed information
 * about the AWS Firewall Manager API actions, data types, and errors. For detailed information about AWS Firewall
 * Manager features, see the <a href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-chapter.html">AWS
 * Firewall Manager Developer Guide</a>.
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
     * Sets the AWS Firewall Manager administrator account. AWS Firewall Manager must be associated with the master
     * account your AWS organization or associated with a member account that has the appropriate permissions. If the
     * account ID that you submit is not an AWS Organizations master account, AWS Firewall Manager will set the
     * appropriate permissions for the given member account.
     * </p>
     * <p>
     * The account that you associate with AWS Firewall Manager is called the AWS Firewall Manager administrator
     * account.
     * </p>
     * 
     * @param associateAdminAccountRequest
     * @return Result of the AssociateAdminAccount operation returned by the service.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do. For example, you might have submitted an
     *         <code>AssociateAdminAccount</code> request, but the account ID that you submitted was already set as the
     *         AWS Firewall Manager administrator.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.AssociateAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AssociateAdminAccount" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateAdminAccountResult associateAdminAccount(AssociateAdminAccountRequest associateAdminAccountRequest);

    /**
     * <p>
     * Deletes an AWS Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS)
     * topic that is used to record AWS Firewall Manager SNS logs.
     * </p>
     * 
     * @param deleteNotificationChannelRequest
     * @return Result of the DeleteNotificationChannel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do. For example, you might have submitted an
     *         <code>AssociateAdminAccount</code> request, but the account ID that you submitted was already set as the
     *         AWS Firewall Manager administrator.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.DeleteNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteNotificationChannel" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteNotificationChannelResult deleteNotificationChannel(DeleteNotificationChannelRequest deleteNotificationChannelRequest);

    /**
     * <p>
     * Permanently deletes an AWS Firewall Manager policy.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return Result of the DeletePolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do. For example, you might have submitted an
     *         <code>AssociateAdminAccount</code> request, but the account ID that you submitted was already set as the
     *         AWS Firewall Manager administrator.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    DeletePolicyResult deletePolicy(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Disassociates the account that has been set as the AWS Firewall Manager administrator account. To set a different
     * account as the administrator account, you must submit an <code>AssociateAdminAccount</code> request .
     * </p>
     * 
     * @param disassociateAdminAccountRequest
     * @return Result of the DisassociateAdminAccount operation returned by the service.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do. For example, you might have submitted an
     *         <code>AssociateAdminAccount</code> request, but the account ID that you submitted was already set as the
     *         AWS Firewall Manager administrator.
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
     * Returns the AWS Organizations master account that is associated with AWS Firewall Manager as the AWS Firewall
     * Manager administrator.
     * </p>
     * 
     * @param getAdminAccountRequest
     * @return Result of the GetAdminAccount operation returned by the service.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do. For example, you might have submitted an
     *         <code>AssociateAdminAccount</code> request, but the account ID that you submitted was already set as the
     *         AWS Firewall Manager administrator.
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
     * Returns detailed compliance information about the specified member account. Details include resources that are in
     * and out of compliance with the specified policy. Resources are considered non-compliant if the specified policy
     * has not been applied to them.
     * </p>
     * 
     * @param getComplianceDetailRequest
     * @return Result of the GetComplianceDetail operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetComplianceDetail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetComplianceDetail" target="_top">AWS API
     *      Documentation</a>
     */
    GetComplianceDetailResult getComplianceDetail(GetComplianceDetailRequest getComplianceDetailRequest);

    /**
     * <p>
     * Returns information about the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall
     * Manager SNS logs.
     * </p>
     * 
     * @param getNotificationChannelRequest
     * @return Result of the GetNotificationChannel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do. For example, you might have submitted an
     *         <code>AssociateAdminAccount</code> request, but the account ID that you submitted was already set as the
     *         AWS Firewall Manager administrator.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.GetNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetNotificationChannel" target="_top">AWS API
     *      Documentation</a>
     */
    GetNotificationChannelResult getNotificationChannel(GetNotificationChannelRequest getNotificationChannelRequest);

    /**
     * <p>
     * Returns information about the specified AWS Firewall Manager policy.
     * </p>
     * 
     * @param getPolicyRequest
     * @return Result of the GetPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do. For example, you might have submitted an
     *         <code>AssociateAdminAccount</code> request, but the account ID that you submitted was already set as the
     *         AWS Firewall Manager administrator.
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
     * potential DDoS attack.
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
     * Returns an array of <code>PolicyComplianceStatus</code> objects in the response. Use
     * <code>PolicyComplianceStatus</code> to get a summary of which member accounts are protected by the specified
     * policy.
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
     * Returns a <code>MemberAccounts</code> object that lists the member accounts in the administrator's AWS
     * organization.
     * </p>
     * <p>
     * The <code>ListMemberAccounts</code> must be submitted by the account that is set as the AWS Firewall Manager
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
     * Returns an array of <code>PolicySummary</code> objects in the response.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return Result of the ListPolicies operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do. For example, you might have submitted an
     *         <code>AssociateAdminAccount</code> request, but the account ID that you submitted was already set as the
     *         AWS Firewall Manager administrator.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>AWS WAF Developer Guide</i>.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    ListPoliciesResult listPolicies(ListPoliciesRequest listPoliciesRequest);

    /**
     * <p>
     * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that AWS Firewall Manager uses to
     * record SNS logs.
     * </p>
     * 
     * @param putNotificationChannelRequest
     * @return Result of the PutNotificationChannel operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do. For example, you might have submitted an
     *         <code>AssociateAdminAccount</code> request, but the account ID that you submitted was already set as the
     *         AWS Firewall Manager administrator.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.PutNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutNotificationChannel" target="_top">AWS API
     *      Documentation</a>
     */
    PutNotificationChannelResult putNotificationChannel(PutNotificationChannelRequest putNotificationChannelRequest);

    /**
     * <p>
     * Creates an AWS Firewall Manager policy.
     * </p>
     * <p>
     * Firewall Manager provides two types of policies: A Shield Advanced policy, which applies Shield Advanced
     * protection to specified accounts and resources, or a WAF policy, which contains a rule group and defines which
     * resources are to be protected by that rule group. A policy is specific to either WAF or Shield Advanced. If you
     * want to enforce both WAF rules and Shield Advanced protection across accounts, you can create multiple policies.
     * You can create one or more policies for WAF rules, and one or more policies for Shield Advanced.
     * </p>
     * <p>
     * You must be subscribed to Shield Advanced to create a Shield Advanced policy. For more information on subscribing
     * to Shield Advanced, see <a
     * href="https://docs.aws.amazon.com/waf/latest/DDOSAPIReference/API_CreateSubscription.html"
     * >CreateSubscription</a>.
     * </p>
     * 
     * @param putPolicyRequest
     * @return Result of the PutPolicy operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do. For example, you might have submitted an
     *         <code>AssociateAdminAccount</code> request, but the account ID that you submitted was already set as the
     *         AWS Firewall Manager administrator.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an AWS account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>AWS WAF Developer Guide</i>.
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
