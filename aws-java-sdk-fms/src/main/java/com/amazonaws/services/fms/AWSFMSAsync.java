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
 * <p>
 * This is the <i>Firewall Manager API Reference</i>. This guide is for developers who need detailed information about
 * the Firewall Manager API actions, data types, and errors. For detailed information about Firewall Manager features,
 * see the <a href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-chapter.html">Firewall Manager Developer
 * Guide</a>.
 * </p>
 * <p>
 * Some API actions require explicit resource permissions. For information, see the developer guide topic <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/fms-security_iam_service-with-iam.html#fms-security_iam_service-with-iam-roles-service"
 * >Service roles for Firewall Manager</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSFMSAsync extends AWSFMS {

    /**
     * <p>
     * Sets a Firewall Manager default administrator account. The Firewall Manager default administrator account can
     * manage third-party firewalls and has full administrative scope that allows administration of all policy types,
     * accounts, organizational units, and Regions. This account must be a member account of the organization in
     * Organizations whose resources you want to protect.
     * </p>
     * <p>
     * For information about working with Firewall Manager administrator accounts, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/fms-administrators.html">Managing Firewall
     * Manager administrators</a> in the <i>Firewall Manager Developer Guide</i>.
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
     * Sets a Firewall Manager default administrator account. The Firewall Manager default administrator account can
     * manage third-party firewalls and has full administrative scope that allows administration of all policy types,
     * accounts, organizational units, and Regions. This account must be a member account of the organization in
     * Organizations whose resources you want to protect.
     * </p>
     * <p>
     * For information about working with Firewall Manager administrator accounts, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/fms-administrators.html">Managing Firewall
     * Manager administrators</a> in the <i>Firewall Manager Developer Guide</i>.
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
     * Sets the Firewall Manager policy administrator as a tenant administrator of a third-party firewall service. A
     * tenant is an instance of the third-party firewall service that's associated with your Amazon Web Services
     * customer account.
     * </p>
     * 
     * @param associateThirdPartyFirewallRequest
     * @return A Java Future containing the result of the AssociateThirdPartyFirewall operation returned by the service.
     * @sample AWSFMSAsync.AssociateThirdPartyFirewall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AssociateThirdPartyFirewall"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateThirdPartyFirewallResult> associateThirdPartyFirewallAsync(
            AssociateThirdPartyFirewallRequest associateThirdPartyFirewallRequest);

    /**
     * <p>
     * Sets the Firewall Manager policy administrator as a tenant administrator of a third-party firewall service. A
     * tenant is an instance of the third-party firewall service that's associated with your Amazon Web Services
     * customer account.
     * </p>
     * 
     * @param associateThirdPartyFirewallRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateThirdPartyFirewall operation returned by the service.
     * @sample AWSFMSAsyncHandler.AssociateThirdPartyFirewall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AssociateThirdPartyFirewall"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateThirdPartyFirewallResult> associateThirdPartyFirewallAsync(
            AssociateThirdPartyFirewallRequest associateThirdPartyFirewallRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateThirdPartyFirewallRequest, AssociateThirdPartyFirewallResult> asyncHandler);

    /**
     * <p>
     * Associate resources to a Firewall Manager resource set.
     * </p>
     * 
     * @param batchAssociateResourceRequest
     * @return A Java Future containing the result of the BatchAssociateResource operation returned by the service.
     * @sample AWSFMSAsync.BatchAssociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/BatchAssociateResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateResourceResult> batchAssociateResourceAsync(BatchAssociateResourceRequest batchAssociateResourceRequest);

    /**
     * <p>
     * Associate resources to a Firewall Manager resource set.
     * </p>
     * 
     * @param batchAssociateResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchAssociateResource operation returned by the service.
     * @sample AWSFMSAsyncHandler.BatchAssociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/BatchAssociateResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<BatchAssociateResourceResult> batchAssociateResourceAsync(BatchAssociateResourceRequest batchAssociateResourceRequest,
            com.amazonaws.handlers.AsyncHandler<BatchAssociateResourceRequest, BatchAssociateResourceResult> asyncHandler);

    /**
     * <p>
     * Disassociates resources from a Firewall Manager resource set.
     * </p>
     * 
     * @param batchDisassociateResourceRequest
     * @return A Java Future containing the result of the BatchDisassociateResource operation returned by the service.
     * @sample AWSFMSAsync.BatchDisassociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/BatchDisassociateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateResourceResult> batchDisassociateResourceAsync(
            BatchDisassociateResourceRequest batchDisassociateResourceRequest);

    /**
     * <p>
     * Disassociates resources from a Firewall Manager resource set.
     * </p>
     * 
     * @param batchDisassociateResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDisassociateResource operation returned by the service.
     * @sample AWSFMSAsyncHandler.BatchDisassociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/BatchDisassociateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisassociateResourceResult> batchDisassociateResourceAsync(
            BatchDisassociateResourceRequest batchDisassociateResourceRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDisassociateResourceRequest, BatchDisassociateResourceResult> asyncHandler);

    /**
     * <p>
     * Permanently deletes an Firewall Manager applications list.
     * </p>
     * 
     * @param deleteAppsListRequest
     * @return A Java Future containing the result of the DeleteAppsList operation returned by the service.
     * @sample AWSFMSAsync.DeleteAppsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteAppsList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppsListResult> deleteAppsListAsync(DeleteAppsListRequest deleteAppsListRequest);

    /**
     * <p>
     * Permanently deletes an Firewall Manager applications list.
     * </p>
     * 
     * @param deleteAppsListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAppsList operation returned by the service.
     * @sample AWSFMSAsyncHandler.DeleteAppsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteAppsList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppsListResult> deleteAppsListAsync(DeleteAppsListRequest deleteAppsListRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppsListRequest, DeleteAppsListResult> asyncHandler);

    /**
     * <p>
     * Deletes an Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS) topic
     * that is used to record Firewall Manager SNS logs.
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
     * Deletes an Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS) topic
     * that is used to record Firewall Manager SNS logs.
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
     * Permanently deletes an Firewall Manager policy.
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
     * Permanently deletes an Firewall Manager policy.
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
     * Permanently deletes an Firewall Manager protocols list.
     * </p>
     * 
     * @param deleteProtocolsListRequest
     * @return A Java Future containing the result of the DeleteProtocolsList operation returned by the service.
     * @sample AWSFMSAsync.DeleteProtocolsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteProtocolsList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProtocolsListResult> deleteProtocolsListAsync(DeleteProtocolsListRequest deleteProtocolsListRequest);

    /**
     * <p>
     * Permanently deletes an Firewall Manager protocols list.
     * </p>
     * 
     * @param deleteProtocolsListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProtocolsList operation returned by the service.
     * @sample AWSFMSAsyncHandler.DeleteProtocolsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteProtocolsList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProtocolsListResult> deleteProtocolsListAsync(DeleteProtocolsListRequest deleteProtocolsListRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProtocolsListRequest, DeleteProtocolsListResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified <a>ResourceSet</a>.
     * </p>
     * 
     * @param deleteResourceSetRequest
     * @return A Java Future containing the result of the DeleteResourceSet operation returned by the service.
     * @sample AWSFMSAsync.DeleteResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteResourceSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceSetResult> deleteResourceSetAsync(DeleteResourceSetRequest deleteResourceSetRequest);

    /**
     * <p>
     * Deletes the specified <a>ResourceSet</a>.
     * </p>
     * 
     * @param deleteResourceSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResourceSet operation returned by the service.
     * @sample AWSFMSAsyncHandler.DeleteResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteResourceSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceSetResult> deleteResourceSetAsync(DeleteResourceSetRequest deleteResourceSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceSetRequest, DeleteResourceSetResult> asyncHandler);

    /**
     * <p>
     * Disassociates an Firewall Manager administrator account. To set a different account as an Firewall Manager
     * administrator, submit a <a>PutAdminAccount</a> request. To set an account as a default administrator account, you
     * must submit an <a>AssociateAdminAccount</a> request.
     * </p>
     * <p>
     * Disassociation of the default administrator account follows the first in, last out principle. If you are the
     * default administrator, all Firewall Manager administrators within the organization must first disassociate their
     * accounts before you can disassociate your account.
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
     * Disassociates an Firewall Manager administrator account. To set a different account as an Firewall Manager
     * administrator, submit a <a>PutAdminAccount</a> request. To set an account as a default administrator account, you
     * must submit an <a>AssociateAdminAccount</a> request.
     * </p>
     * <p>
     * Disassociation of the default administrator account follows the first in, last out principle. If you are the
     * default administrator, all Firewall Manager administrators within the organization must first disassociate their
     * accounts before you can disassociate your account.
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
     * Disassociates a Firewall Manager policy administrator from a third-party firewall tenant. When you call
     * <code>DisassociateThirdPartyFirewall</code>, the third-party firewall vendor deletes all of the firewalls that
     * are associated with the account.
     * </p>
     * 
     * @param disassociateThirdPartyFirewallRequest
     * @return A Java Future containing the result of the DisassociateThirdPartyFirewall operation returned by the
     *         service.
     * @sample AWSFMSAsync.DisassociateThirdPartyFirewall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DisassociateThirdPartyFirewall"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateThirdPartyFirewallResult> disassociateThirdPartyFirewallAsync(
            DisassociateThirdPartyFirewallRequest disassociateThirdPartyFirewallRequest);

    /**
     * <p>
     * Disassociates a Firewall Manager policy administrator from a third-party firewall tenant. When you call
     * <code>DisassociateThirdPartyFirewall</code>, the third-party firewall vendor deletes all of the firewalls that
     * are associated with the account.
     * </p>
     * 
     * @param disassociateThirdPartyFirewallRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateThirdPartyFirewall operation returned by the
     *         service.
     * @sample AWSFMSAsyncHandler.DisassociateThirdPartyFirewall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DisassociateThirdPartyFirewall"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateThirdPartyFirewallResult> disassociateThirdPartyFirewallAsync(
            DisassociateThirdPartyFirewallRequest disassociateThirdPartyFirewallRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateThirdPartyFirewallRequest, DisassociateThirdPartyFirewallResult> asyncHandler);

    /**
     * <p>
     * Returns the Organizations account that is associated with Firewall Manager as the Firewall Manager default
     * administrator.
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
     * Returns the Organizations account that is associated with Firewall Manager as the Firewall Manager default
     * administrator.
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
     * Returns information about the specified account's administrative scope. The administrative scope defines the
     * resources that an Firewall Manager administrator can manage.
     * </p>
     * 
     * @param getAdminScopeRequest
     * @return A Java Future containing the result of the GetAdminScope operation returned by the service.
     * @sample AWSFMSAsync.GetAdminScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAdminScope" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAdminScopeResult> getAdminScopeAsync(GetAdminScopeRequest getAdminScopeRequest);

    /**
     * <p>
     * Returns information about the specified account's administrative scope. The administrative scope defines the
     * resources that an Firewall Manager administrator can manage.
     * </p>
     * 
     * @param getAdminScopeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAdminScope operation returned by the service.
     * @sample AWSFMSAsyncHandler.GetAdminScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAdminScope" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAdminScopeResult> getAdminScopeAsync(GetAdminScopeRequest getAdminScopeRequest,
            com.amazonaws.handlers.AsyncHandler<GetAdminScopeRequest, GetAdminScopeResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified Firewall Manager applications list.
     * </p>
     * 
     * @param getAppsListRequest
     * @return A Java Future containing the result of the GetAppsList operation returned by the service.
     * @sample AWSFMSAsync.GetAppsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAppsList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppsListResult> getAppsListAsync(GetAppsListRequest getAppsListRequest);

    /**
     * <p>
     * Returns information about the specified Firewall Manager applications list.
     * </p>
     * 
     * @param getAppsListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAppsList operation returned by the service.
     * @sample AWSFMSAsyncHandler.GetAppsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAppsList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetAppsListResult> getAppsListAsync(GetAppsListRequest getAppsListRequest,
            com.amazonaws.handlers.AsyncHandler<GetAppsListRequest, GetAppsListResult> asyncHandler);

    /**
     * <p>
     * Returns detailed compliance information about the specified member account. Details include resources that are in
     * and out of compliance with the specified policy.
     * </p>
     * <p>
     * The reasons for resources being considered compliant depend on the Firewall Manager policy type.
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
     * and out of compliance with the specified policy.
     * </p>
     * <p>
     * The reasons for resources being considered compliant depend on the Firewall Manager policy type.
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
     * Information about the Amazon Simple Notification Service (SNS) topic that is used to record Firewall Manager SNS
     * logs.
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
     * Information about the Amazon Simple Notification Service (SNS) topic that is used to record Firewall Manager SNS
     * logs.
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
     * Returns information about the specified Firewall Manager policy.
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
     * Returns information about the specified Firewall Manager policy.
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
     * potential DDoS attack. Other policy types are currently unsupported.
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
     * potential DDoS attack. Other policy types are currently unsupported.
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
     * Returns information about the specified Firewall Manager protocols list.
     * </p>
     * 
     * @param getProtocolsListRequest
     * @return A Java Future containing the result of the GetProtocolsList operation returned by the service.
     * @sample AWSFMSAsync.GetProtocolsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetProtocolsList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProtocolsListResult> getProtocolsListAsync(GetProtocolsListRequest getProtocolsListRequest);

    /**
     * <p>
     * Returns information about the specified Firewall Manager protocols list.
     * </p>
     * 
     * @param getProtocolsListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetProtocolsList operation returned by the service.
     * @sample AWSFMSAsyncHandler.GetProtocolsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetProtocolsList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetProtocolsListResult> getProtocolsListAsync(GetProtocolsListRequest getProtocolsListRequest,
            com.amazonaws.handlers.AsyncHandler<GetProtocolsListRequest, GetProtocolsListResult> asyncHandler);

    /**
     * <p>
     * Gets information about a specific resource set.
     * </p>
     * 
     * @param getResourceSetRequest
     * @return A Java Future containing the result of the GetResourceSet operation returned by the service.
     * @sample AWSFMSAsync.GetResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetResourceSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceSetResult> getResourceSetAsync(GetResourceSetRequest getResourceSetRequest);

    /**
     * <p>
     * Gets information about a specific resource set.
     * </p>
     * 
     * @param getResourceSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceSet operation returned by the service.
     * @sample AWSFMSAsyncHandler.GetResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetResourceSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceSetResult> getResourceSetAsync(GetResourceSetRequest getResourceSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceSetRequest, GetResourceSetResult> asyncHandler);

    /**
     * <p>
     * The onboarding status of a Firewall Manager admin account to third-party firewall vendor tenant.
     * </p>
     * 
     * @param getThirdPartyFirewallAssociationStatusRequest
     * @return A Java Future containing the result of the GetThirdPartyFirewallAssociationStatus operation returned by
     *         the service.
     * @sample AWSFMSAsync.GetThirdPartyFirewallAssociationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetThirdPartyFirewallAssociationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetThirdPartyFirewallAssociationStatusResult> getThirdPartyFirewallAssociationStatusAsync(
            GetThirdPartyFirewallAssociationStatusRequest getThirdPartyFirewallAssociationStatusRequest);

    /**
     * <p>
     * The onboarding status of a Firewall Manager admin account to third-party firewall vendor tenant.
     * </p>
     * 
     * @param getThirdPartyFirewallAssociationStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetThirdPartyFirewallAssociationStatus operation returned by
     *         the service.
     * @sample AWSFMSAsyncHandler.GetThirdPartyFirewallAssociationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetThirdPartyFirewallAssociationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetThirdPartyFirewallAssociationStatusResult> getThirdPartyFirewallAssociationStatusAsync(
            GetThirdPartyFirewallAssociationStatusRequest getThirdPartyFirewallAssociationStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetThirdPartyFirewallAssociationStatusRequest, GetThirdPartyFirewallAssociationStatusResult> asyncHandler);

    /**
     * <p>
     * Retrieves violations for a resource based on the specified Firewall Manager policy and Amazon Web Services
     * account.
     * </p>
     * 
     * @param getViolationDetailsRequest
     * @return A Java Future containing the result of the GetViolationDetails operation returned by the service.
     * @sample AWSFMSAsync.GetViolationDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetViolationDetails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetViolationDetailsResult> getViolationDetailsAsync(GetViolationDetailsRequest getViolationDetailsRequest);

    /**
     * <p>
     * Retrieves violations for a resource based on the specified Firewall Manager policy and Amazon Web Services
     * account.
     * </p>
     * 
     * @param getViolationDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetViolationDetails operation returned by the service.
     * @sample AWSFMSAsyncHandler.GetViolationDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetViolationDetails" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetViolationDetailsResult> getViolationDetailsAsync(GetViolationDetailsRequest getViolationDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetViolationDetailsRequest, GetViolationDetailsResult> asyncHandler);

    /**
     * <p>
     * Returns a <code>AdminAccounts</code> object that lists the Firewall Manager administrators within the
     * organization that are onboarded to Firewall Manager by <a>AssociateAdminAccount</a>.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param listAdminAccountsForOrganizationRequest
     * @return A Java Future containing the result of the ListAdminAccountsForOrganization operation returned by the
     *         service.
     * @sample AWSFMSAsync.ListAdminAccountsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListAdminAccountsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAdminAccountsForOrganizationResult> listAdminAccountsForOrganizationAsync(
            ListAdminAccountsForOrganizationRequest listAdminAccountsForOrganizationRequest);

    /**
     * <p>
     * Returns a <code>AdminAccounts</code> object that lists the Firewall Manager administrators within the
     * organization that are onboarded to Firewall Manager by <a>AssociateAdminAccount</a>.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param listAdminAccountsForOrganizationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAdminAccountsForOrganization operation returned by the
     *         service.
     * @sample AWSFMSAsyncHandler.ListAdminAccountsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListAdminAccountsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAdminAccountsForOrganizationResult> listAdminAccountsForOrganizationAsync(
            ListAdminAccountsForOrganizationRequest listAdminAccountsForOrganizationRequest,
            com.amazonaws.handlers.AsyncHandler<ListAdminAccountsForOrganizationRequest, ListAdminAccountsForOrganizationResult> asyncHandler);

    /**
     * <p>
     * Lists the accounts that are managing the specified Organizations member account. This is useful for any member
     * account so that they can view the accounts who are managing their account. This operation only returns the
     * managing administrators that have the requested account within their <a>AdminScope</a>.
     * </p>
     * 
     * @param listAdminsManagingAccountRequest
     * @return A Java Future containing the result of the ListAdminsManagingAccount operation returned by the service.
     * @sample AWSFMSAsync.ListAdminsManagingAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListAdminsManagingAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAdminsManagingAccountResult> listAdminsManagingAccountAsync(
            ListAdminsManagingAccountRequest listAdminsManagingAccountRequest);

    /**
     * <p>
     * Lists the accounts that are managing the specified Organizations member account. This is useful for any member
     * account so that they can view the accounts who are managing their account. This operation only returns the
     * managing administrators that have the requested account within their <a>AdminScope</a>.
     * </p>
     * 
     * @param listAdminsManagingAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAdminsManagingAccount operation returned by the service.
     * @sample AWSFMSAsyncHandler.ListAdminsManagingAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListAdminsManagingAccount" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListAdminsManagingAccountResult> listAdminsManagingAccountAsync(
            ListAdminsManagingAccountRequest listAdminsManagingAccountRequest,
            com.amazonaws.handlers.AsyncHandler<ListAdminsManagingAccountRequest, ListAdminsManagingAccountResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <code>AppsListDataSummary</code> objects.
     * </p>
     * 
     * @param listAppsListsRequest
     * @return A Java Future containing the result of the ListAppsLists operation returned by the service.
     * @sample AWSFMSAsync.ListAppsLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListAppsLists" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppsListsResult> listAppsListsAsync(ListAppsListsRequest listAppsListsRequest);

    /**
     * <p>
     * Returns an array of <code>AppsListDataSummary</code> objects.
     * </p>
     * 
     * @param listAppsListsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAppsLists operation returned by the service.
     * @sample AWSFMSAsyncHandler.ListAppsLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListAppsLists" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppsListsResult> listAppsListsAsync(ListAppsListsRequest listAppsListsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppsListsRequest, ListAppsListsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <code>PolicyComplianceStatus</code> objects. Use <code>PolicyComplianceStatus</code> to get a
     * summary of which member accounts are protected by the specified policy.
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
     * Returns an array of <code>PolicyComplianceStatus</code> objects. Use <code>PolicyComplianceStatus</code> to get a
     * summary of which member accounts are protected by the specified policy.
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
     * Returns an array of resources in the organization's accounts that are available to be associated with a resource
     * set.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @return A Java Future containing the result of the ListDiscoveredResources operation returned by the service.
     * @sample AWSFMSAsync.ListDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListDiscoveredResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest);

    /**
     * <p>
     * Returns an array of resources in the organization's accounts that are available to be associated with a resource
     * set.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDiscoveredResources operation returned by the service.
     * @sample AWSFMSAsyncHandler.ListDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListDiscoveredResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDiscoveredResourcesRequest, ListDiscoveredResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns a <code>MemberAccounts</code> object that lists the member accounts in the administrator's Amazon Web
     * Services organization.
     * </p>
     * <p>
     * Either an Firewall Manager administrator or the organization's management account can make this request.
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
     * Returns a <code>MemberAccounts</code> object that lists the member accounts in the administrator's Amazon Web
     * Services organization.
     * </p>
     * <p>
     * Either an Firewall Manager administrator or the organization's management account can make this request.
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
     * Returns an array of <code>PolicySummary</code> objects.
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
     * Returns an array of <code>PolicySummary</code> objects.
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
     * Returns an array of <code>ProtocolsListDataSummary</code> objects.
     * </p>
     * 
     * @param listProtocolsListsRequest
     * @return A Java Future containing the result of the ListProtocolsLists operation returned by the service.
     * @sample AWSFMSAsync.ListProtocolsLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListProtocolsLists" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProtocolsListsResult> listProtocolsListsAsync(ListProtocolsListsRequest listProtocolsListsRequest);

    /**
     * <p>
     * Returns an array of <code>ProtocolsListDataSummary</code> objects.
     * </p>
     * 
     * @param listProtocolsListsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProtocolsLists operation returned by the service.
     * @sample AWSFMSAsyncHandler.ListProtocolsLists
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListProtocolsLists" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProtocolsListsResult> listProtocolsListsAsync(ListProtocolsListsRequest listProtocolsListsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProtocolsListsRequest, ListProtocolsListsResult> asyncHandler);

    /**
     * <p>
     * Returns an array of resources that are currently associated to a resource set.
     * </p>
     * 
     * @param listResourceSetResourcesRequest
     * @return A Java Future containing the result of the ListResourceSetResources operation returned by the service.
     * @sample AWSFMSAsync.ListResourceSetResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListResourceSetResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceSetResourcesResult> listResourceSetResourcesAsync(ListResourceSetResourcesRequest listResourceSetResourcesRequest);

    /**
     * <p>
     * Returns an array of resources that are currently associated to a resource set.
     * </p>
     * 
     * @param listResourceSetResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceSetResources operation returned by the service.
     * @sample AWSFMSAsyncHandler.ListResourceSetResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListResourceSetResources" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceSetResourcesResult> listResourceSetResourcesAsync(ListResourceSetResourcesRequest listResourceSetResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceSetResourcesRequest, ListResourceSetResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns an array of <code>ResourceSetSummary</code> objects.
     * </p>
     * 
     * @param listResourceSetsRequest
     * @return A Java Future containing the result of the ListResourceSets operation returned by the service.
     * @sample AWSFMSAsync.ListResourceSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListResourceSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourceSetsResult> listResourceSetsAsync(ListResourceSetsRequest listResourceSetsRequest);

    /**
     * <p>
     * Returns an array of <code>ResourceSetSummary</code> objects.
     * </p>
     * 
     * @param listResourceSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceSets operation returned by the service.
     * @sample AWSFMSAsyncHandler.ListResourceSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListResourceSets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourceSetsResult> listResourceSetsAsync(ListResourceSetsRequest listResourceSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceSetsRequest, ListResourceSetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the list of tags for the specified Amazon Web Services resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSFMSAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves the list of tags for the specified Amazon Web Services resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSFMSAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of all of the third-party firewall policies that are associated with the third-party firewall
     * administrator's account.
     * </p>
     * 
     * @param listThirdPartyFirewallFirewallPoliciesRequest
     * @return A Java Future containing the result of the ListThirdPartyFirewallFirewallPolicies operation returned by
     *         the service.
     * @sample AWSFMSAsync.ListThirdPartyFirewallFirewallPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListThirdPartyFirewallFirewallPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListThirdPartyFirewallFirewallPoliciesResult> listThirdPartyFirewallFirewallPoliciesAsync(
            ListThirdPartyFirewallFirewallPoliciesRequest listThirdPartyFirewallFirewallPoliciesRequest);

    /**
     * <p>
     * Retrieves a list of all of the third-party firewall policies that are associated with the third-party firewall
     * administrator's account.
     * </p>
     * 
     * @param listThirdPartyFirewallFirewallPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListThirdPartyFirewallFirewallPolicies operation returned by
     *         the service.
     * @sample AWSFMSAsyncHandler.ListThirdPartyFirewallFirewallPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListThirdPartyFirewallFirewallPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListThirdPartyFirewallFirewallPoliciesResult> listThirdPartyFirewallFirewallPoliciesAsync(
            ListThirdPartyFirewallFirewallPoliciesRequest listThirdPartyFirewallFirewallPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListThirdPartyFirewallFirewallPoliciesRequest, ListThirdPartyFirewallFirewallPoliciesResult> asyncHandler);

    /**
     * <p>
     * Creates or updates an Firewall Manager administrator account. The account must be a member of the organization
     * that was onboarded to Firewall Manager by <a>AssociateAdminAccount</a>. Only the organization's management
     * account can create an Firewall Manager administrator account. When you create an Firewall Manager administrator
     * account, the service checks to see if the account is already a delegated administrator within Organizations. If
     * the account isn't a delegated administrator, Firewall Manager calls Organizations to delegate the account within
     * Organizations. For more information about administrator accounts within Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the Amazon
     * Web Services Accounts in Your Organization</a>.
     * </p>
     * 
     * @param putAdminAccountRequest
     * @return A Java Future containing the result of the PutAdminAccount operation returned by the service.
     * @sample AWSFMSAsync.PutAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutAdminAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutAdminAccountResult> putAdminAccountAsync(PutAdminAccountRequest putAdminAccountRequest);

    /**
     * <p>
     * Creates or updates an Firewall Manager administrator account. The account must be a member of the organization
     * that was onboarded to Firewall Manager by <a>AssociateAdminAccount</a>. Only the organization's management
     * account can create an Firewall Manager administrator account. When you create an Firewall Manager administrator
     * account, the service checks to see if the account is already a delegated administrator within Organizations. If
     * the account isn't a delegated administrator, Firewall Manager calls Organizations to delegate the account within
     * Organizations. For more information about administrator accounts within Organizations, see <a
     * href="https://docs.aws.amazon.com/organizations/latest/userguide/orgs_manage_accounts.html">Managing the Amazon
     * Web Services Accounts in Your Organization</a>.
     * </p>
     * 
     * @param putAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAdminAccount operation returned by the service.
     * @sample AWSFMSAsyncHandler.PutAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutAdminAccount" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutAdminAccountResult> putAdminAccountAsync(PutAdminAccountRequest putAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<PutAdminAccountRequest, PutAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Creates an Firewall Manager applications list.
     * </p>
     * 
     * @param putAppsListRequest
     * @return A Java Future containing the result of the PutAppsList operation returned by the service.
     * @sample AWSFMSAsync.PutAppsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutAppsList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutAppsListResult> putAppsListAsync(PutAppsListRequest putAppsListRequest);

    /**
     * <p>
     * Creates an Firewall Manager applications list.
     * </p>
     * 
     * @param putAppsListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutAppsList operation returned by the service.
     * @sample AWSFMSAsyncHandler.PutAppsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutAppsList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutAppsListResult> putAppsListAsync(PutAppsListRequest putAppsListRequest,
            com.amazonaws.handlers.AsyncHandler<PutAppsListRequest, PutAppsListResult> asyncHandler);

    /**
     * <p>
     * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that Firewall Manager uses to record
     * SNS logs.
     * </p>
     * <p>
     * To perform this action outside of the console, you must first configure the SNS topic's access policy to allow
     * the <code>SnsRoleName</code> to publish SNS logs. If the <code>SnsRoleName</code> provided is a role other than
     * the <code>AWSServiceRoleForFMS</code> service-linked role, this role must have a trust relationship configured to
     * allow the Firewall Manager service principal <code>fms.amazonaws.com</code> to assume this role. For information
     * about configuring an SNS access policy, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/fms-security_iam_service-with-iam.html#fms-security_iam_service-with-iam-roles-service"
     * >Service roles for Firewall Manager</a> in the <i>Firewall Manager Developer Guide</i>.
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
     * Designates the IAM role and Amazon Simple Notification Service (SNS) topic that Firewall Manager uses to record
     * SNS logs.
     * </p>
     * <p>
     * To perform this action outside of the console, you must first configure the SNS topic's access policy to allow
     * the <code>SnsRoleName</code> to publish SNS logs. If the <code>SnsRoleName</code> provided is a role other than
     * the <code>AWSServiceRoleForFMS</code> service-linked role, this role must have a trust relationship configured to
     * allow the Firewall Manager service principal <code>fms.amazonaws.com</code> to assume this role. For information
     * about configuring an SNS access policy, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/fms-security_iam_service-with-iam.html#fms-security_iam_service-with-iam-roles-service"
     * >Service roles for Firewall Manager</a> in the <i>Firewall Manager Developer Guide</i>.
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
     * Creates an Firewall Manager policy.
     * </p>
     * <p>
     * A Firewall Manager policy is specific to the individual policy type. If you want to enforce multiple policy types
     * across accounts, you can create multiple policies. You can create more than one policy for each type.
     * </p>
     * <p>
     * If you add a new account to an organization that you created with Organizations, Firewall Manager automatically
     * applies the policy to the resources in that account that are within scope of the policy.
     * </p>
     * <p>
     * Firewall Manager provides the following types of policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>WAF policy</b> - This policy applies WAF web ACL protections to specified accounts and resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Shield Advanced policy</b> - This policy applies Shield Advanced protection to specified accounts and
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Security Groups policy</b> - This type of policy gives you control over security groups that are in use
     * throughout your organization in Organizations and lets you enforce a baseline set of rules across your
     * organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Network ACL policy</b> - This type of policy gives you control over the network ACLs that are in use
     * throughout your organization in Organizations and lets you enforce a baseline set of first and last network ACL
     * rules across your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Network Firewall policy</b> - This policy applies Network Firewall protection to your organization's VPCs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DNS Firewall policy</b> - This policy applies Amazon Route 53 Resolver DNS Firewall protections to your
     * organization's VPCs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Third-party firewall policy</b> - This policy applies third-party firewall protections. Third-party firewalls
     * are available by subscription through the Amazon Web Services Marketplace console at <a
     * href="http://aws.amazon.com/marketplace">Amazon Web Services Marketplace</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Palo Alto Networks Cloud NGFW policy</b> - This policy applies Palo Alto Networks Cloud Next Generation
     * Firewall (NGFW) protections and Palo Alto Networks Cloud NGFW rulestacks to your organization's VPCs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Fortigate CNF policy</b> - This policy applies Fortigate Cloud Native Firewall (CNF) protections. Fortigate
     * CNF is a cloud-centered solution that blocks Zero-Day threats and secures cloud infrastructures with
     * industry-leading advanced threat prevention, smart web application firewalls (WAF), and API protection.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
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
     * Creates an Firewall Manager policy.
     * </p>
     * <p>
     * A Firewall Manager policy is specific to the individual policy type. If you want to enforce multiple policy types
     * across accounts, you can create multiple policies. You can create more than one policy for each type.
     * </p>
     * <p>
     * If you add a new account to an organization that you created with Organizations, Firewall Manager automatically
     * applies the policy to the resources in that account that are within scope of the policy.
     * </p>
     * <p>
     * Firewall Manager provides the following types of policies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>WAF policy</b> - This policy applies WAF web ACL protections to specified accounts and resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Shield Advanced policy</b> - This policy applies Shield Advanced protection to specified accounts and
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Security Groups policy</b> - This type of policy gives you control over security groups that are in use
     * throughout your organization in Organizations and lets you enforce a baseline set of rules across your
     * organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Network ACL policy</b> - This type of policy gives you control over the network ACLs that are in use
     * throughout your organization in Organizations and lets you enforce a baseline set of first and last network ACL
     * rules across your organization.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Network Firewall policy</b> - This policy applies Network Firewall protection to your organization's VPCs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DNS Firewall policy</b> - This policy applies Amazon Route 53 Resolver DNS Firewall protections to your
     * organization's VPCs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Third-party firewall policy</b> - This policy applies third-party firewall protections. Third-party firewalls
     * are available by subscription through the Amazon Web Services Marketplace console at <a
     * href="http://aws.amazon.com/marketplace">Amazon Web Services Marketplace</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Palo Alto Networks Cloud NGFW policy</b> - This policy applies Palo Alto Networks Cloud Next Generation
     * Firewall (NGFW) protections and Palo Alto Networks Cloud NGFW rulestacks to your organization's VPCs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Fortigate CNF policy</b> - This policy applies Fortigate Cloud Native Firewall (CNF) protections. Fortigate
     * CNF is a cloud-centered solution that blocks Zero-Day threats and secures cloud infrastructures with
     * industry-leading advanced threat prevention, smart web application firewalls (WAF), and API protection.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
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

    /**
     * <p>
     * Creates an Firewall Manager protocols list.
     * </p>
     * 
     * @param putProtocolsListRequest
     * @return A Java Future containing the result of the PutProtocolsList operation returned by the service.
     * @sample AWSFMSAsync.PutProtocolsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutProtocolsList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutProtocolsListResult> putProtocolsListAsync(PutProtocolsListRequest putProtocolsListRequest);

    /**
     * <p>
     * Creates an Firewall Manager protocols list.
     * </p>
     * 
     * @param putProtocolsListRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutProtocolsList operation returned by the service.
     * @sample AWSFMSAsyncHandler.PutProtocolsList
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutProtocolsList" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutProtocolsListResult> putProtocolsListAsync(PutProtocolsListRequest putProtocolsListRequest,
            com.amazonaws.handlers.AsyncHandler<PutProtocolsListRequest, PutProtocolsListResult> asyncHandler);

    /**
     * <p>
     * Creates the resource set.
     * </p>
     * <p>
     * An Firewall Manager resource set defines the resources to import into an Firewall Manager policy from another
     * Amazon Web Services service.
     * </p>
     * 
     * @param putResourceSetRequest
     * @return A Java Future containing the result of the PutResourceSet operation returned by the service.
     * @sample AWSFMSAsync.PutResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutResourceSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutResourceSetResult> putResourceSetAsync(PutResourceSetRequest putResourceSetRequest);

    /**
     * <p>
     * Creates the resource set.
     * </p>
     * <p>
     * An Firewall Manager resource set defines the resources to import into an Firewall Manager policy from another
     * Amazon Web Services service.
     * </p>
     * 
     * @param putResourceSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutResourceSet operation returned by the service.
     * @sample AWSFMSAsyncHandler.PutResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutResourceSet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutResourceSetResult> putResourceSetAsync(PutResourceSetRequest putResourceSetRequest,
            com.amazonaws.handlers.AsyncHandler<PutResourceSetRequest, PutResourceSetResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to an Amazon Web Services resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSFMSAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to an Amazon Web Services resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSFMSAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from an Amazon Web Services resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSFMSAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from an Amazon Web Services resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSFMSAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
