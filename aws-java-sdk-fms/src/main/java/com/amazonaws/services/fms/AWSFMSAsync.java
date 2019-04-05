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

import com.amazonaws.services.fms.model.*;

/**
 * Interface for accessing FMS asynchronously. Each asynchronous method will return a Java Future object representing
 * the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when
 * an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.fms.AbstractAWSFMSAsync} instead.
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
public interface AWSFMSAsync extends AWSFMS {

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
     * @return A Java Future containing the result of the AssociateAdminAccount operation returned by the service.
     * @sample AWSFMSAsync.AssociateAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AssociateAdminAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateAdminAccountResult> associateAdminAccountAsync(AssociateAdminAccountRequest associateAdminAccountRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateAdminAccount operation returned by the service.
     * @sample AWSFMSAsyncHandler.AssociateAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AssociateAdminAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateAdminAccountResult> associateAdminAccountAsync(AssociateAdminAccountRequest associateAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateAdminAccountRequest, AssociateAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Deletes an AWS Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS)
     * topic that is used to record AWS Firewall Manager SNS logs.
     * </p>
     * 
     * @param deleteNotificationChannelRequest
     * @return A Java Future containing the result of the DeleteNotificationChannel operation returned by the service.
     * @sample AWSFMSAsync.DeleteNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteNotificationChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotificationChannelResult> deleteNotificationChannelAsync(
            DeleteNotificationChannelRequest deleteNotificationChannelRequest);

    /**
     * <p>
     * Deletes an AWS Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS)
     * topic that is used to record AWS Firewall Manager SNS logs.
     * </p>
     * 
     * @param deleteNotificationChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteNotificationChannel operation returned by the service.
     * @sample AWSFMSAsyncHandler.DeleteNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteNotificationChannel" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteNotificationChannelResult> deleteNotificationChannelAsync(
            DeleteNotificationChannelRequest deleteNotificationChannelRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteNotificationChannelRequest, DeleteNotificationChannelResult> asyncHandler);

    /**
     * <p>
     * Permanently deletes an AWS Firewall Manager policy.
     * </p>
     * 
     * @param deletePolicyRequest
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AWSFMSAsync.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Permanently deletes an AWS Firewall Manager policy.
     * </p>
     * 
     * @param deletePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePolicy operation returned by the service.
     * @sample AWSFMSAsyncHandler.DeletePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeletePolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeletePolicyResult> deletePolicyAsync(DeletePolicyRequest deletePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, DeletePolicyResult> asyncHandler);

    /**
     * <p>
     * Disassociates the account that has been set as the AWS Firewall Manager administrator account. To set a different
     * account as the administrator account, you must submit an <code>AssociateAdminAccount</code> request .
     * </p>
     * 
     * @param disassociateAdminAccountRequest
     * @return A Java Future containing the result of the DisassociateAdminAccount operation returned by the service.
     * @sample AWSFMSAsync.DisassociateAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DisassociateAdminAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAdminAccountResult> disassociateAdminAccountAsync(DisassociateAdminAccountRequest disassociateAdminAccountRequest);

    /**
     * <p>
     * Disassociates the account that has been set as the AWS Firewall Manager administrator account. To set a different
     * account as the administrator account, you must submit an <code>AssociateAdminAccount</code> request .
     * </p>
     * 
     * @param disassociateAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateAdminAccount operation returned by the service.
     * @sample AWSFMSAsyncHandler.DisassociateAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DisassociateAdminAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateAdminAccountResult> disassociateAdminAccountAsync(DisassociateAdminAccountRequest disassociateAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateAdminAccountRequest, DisassociateAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Returns the AWS Organizations master account that is associated with AWS Firewall Manager as the AWS Firewall
     * Manager administrator.
     * </p>
     * 
     * @param getAdminAccountRequest
     * @return A Java Future containing the result of the GetAdminAccount operation returned by the service.
     * @sample AWSFMSAsync.GetAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAdminAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAdminAccountResult> getAdminAccountAsync(GetAdminAccountRequest getAdminAccountRequest);

    /**
     * <p>
     * Returns the AWS Organizations master account that is associated with AWS Firewall Manager as the AWS Firewall
     * Manager administrator.
     * </p>
     * 
     * @param getAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAdminAccount operation returned by the service.
     * @sample AWSFMSAsyncHandler.GetAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAdminAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAdminAccountResult> getAdminAccountAsync(GetAdminAccountRequest getAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetAdminAccountRequest, GetAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Returns detailed compliance information about the specified member account. Details include resources that are in
     * and out of compliance with the specified policy. Resources are considered non-compliant if the specified policy
     * has not been applied to them.
     * </p>
     * 
     * @param getComplianceDetailRequest
     * @return A Java Future containing the result of the GetComplianceDetail operation returned by the service.
     * @sample AWSFMSAsync.GetComplianceDetail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetComplianceDetail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetComplianceDetailResult> getComplianceDetailAsync(GetComplianceDetailRequest getComplianceDetailRequest);

    /**
     * <p>
     * Returns detailed compliance information about the specified member account. Details include resources that are in
     * and out of compliance with the specified policy. Resources are considered non-compliant if the specified policy
     * has not been applied to them.
     * </p>
     * 
     * @param getComplianceDetailRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComplianceDetail operation returned by the service.
     * @sample AWSFMSAsyncHandler.GetComplianceDetail
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetComplianceDetail" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetComplianceDetailResult> getComplianceDetailAsync(GetComplianceDetailRequest getComplianceDetailRequest,
            com.amazonaws.handlers.AsyncHandler<GetComplianceDetailRequest, GetComplianceDetailResult> asyncHandler);

    /**
     * <p>
     * Returns information about the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall
     * Manager SNS logs.
     * </p>
     * 
     * @param getNotificationChannelRequest
     * @return A Java Future containing the result of the GetNotificationChannel operation returned by the service.
     * @sample AWSFMSAsync.GetNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetNotificationChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetNotificationChannelResult> getNotificationChannelAsync(GetNotificationChannelRequest getNotificationChannelRequest);

    /**
     * <p>
     * Returns information about the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall
     * Manager SNS logs.
     * </p>
     * 
     * @param getNotificationChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetNotificationChannel operation returned by the service.
     * @sample AWSFMSAsyncHandler.GetNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetNotificationChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetNotificationChannelResult> getNotificationChannelAsync(GetNotificationChannelRequest getNotificationChannelRequest,
            com.amazonaws.handlers.AsyncHandler<GetNotificationChannelRequest, GetNotificationChannelResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified AWS Firewall Manager policy.
     * </p>
     * 
     * @param getPolicyRequest
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AWSFMSAsync.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Returns information about the specified AWS Firewall Manager policy.
     * </p>
     * 
     * @param getPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicy operation returned by the service.
     * @sample AWSFMSAsyncHandler.GetPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(GetPolicyRequest getPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler);

    /**
     * <p>
     * If you created a Shield Advanced policy, returns policy-level attack summary information in the event of a
     * potential DDoS attack.
     * </p>
     * 
     * @param getProtectionStatusRequest
     * @return A Java Future containing the result of the GetProtectionStatus operation returned by the service.
     * @sample AWSFMSAsync.GetProtectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetProtectionStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProtectionStatusResult> getProtectionStatusAsync(GetProtectionStatusRequest getProtectionStatusRequest);

    /**
     * <p>
     * If you created a Shield Advanced policy, returns policy-level attack summary information in the event of a
     * potential DDoS attack.
     * </p>
     * 
     * @param getProtectionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProtectionStatus operation returned by the service.
     * @sample AWSFMSAsyncHandler.GetProtectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetProtectionStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProtectionStatusResult> getProtectionStatusAsync(GetProtectionStatusRequest getProtectionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetProtectionStatusRequest, GetProtectionStatusResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <code>PolicyComplianceStatus</code> objects in the response. Use
     * <code>PolicyComplianceStatus</code> to get a summary of which member accounts are protected by the specified
     * policy.
     * </p>
     * 
     * @param listComplianceStatusRequest
     * @return A Java Future containing the result of the ListComplianceStatus operation returned by the service.
     * @sample AWSFMSAsync.ListComplianceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListComplianceStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListComplianceStatusResult> listComplianceStatusAsync(ListComplianceStatusRequest listComplianceStatusRequest);

    /**
     * <p>
     * Returns an array of <code>PolicyComplianceStatus</code> objects in the response. Use
     * <code>PolicyComplianceStatus</code> to get a summary of which member accounts are protected by the specified
     * policy.
     * </p>
     * 
     * @param listComplianceStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListComplianceStatus operation returned by the service.
     * @sample AWSFMSAsyncHandler.ListComplianceStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListComplianceStatus" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListComplianceStatusResult> listComplianceStatusAsync(ListComplianceStatusRequest listComplianceStatusRequest,
            com.amazonaws.handlers.AsyncHandler<ListComplianceStatusRequest, ListComplianceStatusResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListMemberAccounts operation returned by the service.
     * @sample AWSFMSAsync.ListMemberAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListMemberAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMemberAccountsResult> listMemberAccountsAsync(ListMemberAccountsRequest listMemberAccountsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMemberAccounts operation returned by the service.
     * @sample AWSFMSAsyncHandler.ListMemberAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListMemberAccounts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMemberAccountsResult> listMemberAccountsAsync(ListMemberAccountsRequest listMemberAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListMemberAccountsRequest, ListMemberAccountsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <code>PolicySummary</code> objects in the response.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return A Java Future containing the result of the ListPolicies operation returned by the service.
     * @sample AWSFMSAsync.ListPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest listPoliciesRequest);

    /**
     * <p>
     * Returns an array of <code>PolicySummary</code> objects in the response.
     * </p>
     * 
     * @param listPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPolicies operation returned by the service.
     * @sample AWSFMSAsyncHandler.ListPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListPolicies" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(ListPoliciesRequest listPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler);

    /**
     * <p>
     * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that AWS Firewall Manager uses to
     * record SNS logs.
     * </p>
     * 
     * @param putNotificationChannelRequest
     * @return A Java Future containing the result of the PutNotificationChannel operation returned by the service.
     * @sample AWSFMSAsync.PutNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutNotificationChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutNotificationChannelResult> putNotificationChannelAsync(PutNotificationChannelRequest putNotificationChannelRequest);

    /**
     * <p>
     * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that AWS Firewall Manager uses to
     * record SNS logs.
     * </p>
     * 
     * @param putNotificationChannelRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutNotificationChannel operation returned by the service.
     * @sample AWSFMSAsyncHandler.PutNotificationChannel
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutNotificationChannel" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutNotificationChannelResult> putNotificationChannelAsync(PutNotificationChannelRequest putNotificationChannelRequest,
            com.amazonaws.handlers.AsyncHandler<PutNotificationChannelRequest, PutNotificationChannelResult> asyncHandler);

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
     * @return A Java Future containing the result of the PutPolicy operation returned by the service.
     * @sample AWSFMSAsync.PutPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutPolicyResult> putPolicyAsync(PutPolicyRequest putPolicyRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutPolicy operation returned by the service.
     * @sample AWSFMSAsyncHandler.PutPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutPolicyResult> putPolicyAsync(PutPolicyRequest putPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutPolicyRequest, PutPolicyResult> asyncHandler);

}
