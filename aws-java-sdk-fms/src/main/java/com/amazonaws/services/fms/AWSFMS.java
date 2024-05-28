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
 * Some API actions require explicit resource permissions. For information, see the developer guide topic <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/fms-security_iam_service-with-iam.html#fms-security_iam_service-with-iam-roles-service"
 * >Service roles for Firewall Manager</a>.
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
     * Sets the Firewall Manager policy administrator as a tenant administrator of a third-party firewall service. A
     * tenant is an instance of the third-party firewall service that's associated with your Amazon Web Services
     * customer account.
     * </p>
     * 
     * @param associateThirdPartyFirewallRequest
     * @return Result of the AssociateThirdPartyFirewall operation returned by the service.
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
     * @sample AWSFMS.AssociateThirdPartyFirewall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/AssociateThirdPartyFirewall"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateThirdPartyFirewallResult associateThirdPartyFirewall(AssociateThirdPartyFirewallRequest associateThirdPartyFirewallRequest);

    /**
     * <p>
     * Associate resources to a Firewall Manager resource set.
     * </p>
     * 
     * @param batchAssociateResourceRequest
     * @return Result of the BatchAssociateResource operation returned by the service.
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
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSFMS.BatchAssociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/BatchAssociateResource" target="_top">AWS API
     *      Documentation</a>
     */
    BatchAssociateResourceResult batchAssociateResource(BatchAssociateResourceRequest batchAssociateResourceRequest);

    /**
     * <p>
     * Disassociates resources from a Firewall Manager resource set.
     * </p>
     * 
     * @param batchDisassociateResourceRequest
     * @return Result of the BatchDisassociateResource operation returned by the service.
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
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSFMS.BatchDisassociateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/BatchDisassociateResource" target="_top">AWS
     *      API Documentation</a>
     */
    BatchDisassociateResourceResult batchDisassociateResource(BatchDisassociateResourceRequest batchDisassociateResourceRequest);

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
     * Deletes the specified <a>ResourceSet</a>.
     * </p>
     * 
     * @param deleteResourceSetRequest
     * @return Result of the DeleteResourceSet operation returned by the service.
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
     * @sample AWSFMS.DeleteResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DeleteResourceSet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteResourceSetResult deleteResourceSet(DeleteResourceSetRequest deleteResourceSetRequest);

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
     * Disassociates a Firewall Manager policy administrator from a third-party firewall tenant. When you call
     * <code>DisassociateThirdPartyFirewall</code>, the third-party firewall vendor deletes all of the firewalls that
     * are associated with the account.
     * </p>
     * 
     * @param disassociateThirdPartyFirewallRequest
     * @return Result of the DisassociateThirdPartyFirewall operation returned by the service.
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
     * @sample AWSFMS.DisassociateThirdPartyFirewall
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/DisassociateThirdPartyFirewall"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateThirdPartyFirewallResult disassociateThirdPartyFirewall(DisassociateThirdPartyFirewallRequest disassociateThirdPartyFirewallRequest);

    /**
     * <p>
     * Returns the Organizations account that is associated with Firewall Manager as the Firewall Manager default
     * administrator.
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
     * Returns information about the specified account's administrative scope. The administrative scope defines the
     * resources that an Firewall Manager administrator can manage.
     * </p>
     * 
     * @param getAdminScopeRequest
     * @return Result of the GetAdminScope operation returned by the service.
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
     * @sample AWSFMS.GetAdminScope
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetAdminScope" target="_top">AWS API
     *      Documentation</a>
     */
    GetAdminScopeResult getAdminScope(GetAdminScopeRequest getAdminScopeRequest);

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
     * <p>
     * The reasons for resources being considered compliant depend on the Firewall Manager policy type.
     * </p>
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
     * Gets information about a specific resource set.
     * </p>
     * 
     * @param getResourceSetRequest
     * @return Result of the GetResourceSet operation returned by the service.
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
     * @sample AWSFMS.GetResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetResourceSet" target="_top">AWS API
     *      Documentation</a>
     */
    GetResourceSetResult getResourceSet(GetResourceSetRequest getResourceSetRequest);

    /**
     * <p>
     * The onboarding status of a Firewall Manager admin account to third-party firewall vendor tenant.
     * </p>
     * 
     * @param getThirdPartyFirewallAssociationStatusRequest
     * @return Result of the GetThirdPartyFirewallAssociationStatus operation returned by the service.
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
     * @sample AWSFMS.GetThirdPartyFirewallAssociationStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetThirdPartyFirewallAssociationStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetThirdPartyFirewallAssociationStatusResult getThirdPartyFirewallAssociationStatus(
            GetThirdPartyFirewallAssociationStatusRequest getThirdPartyFirewallAssociationStatusRequest);

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
     * Returns a <code>AdminAccounts</code> object that lists the Firewall Manager administrators within the
     * organization that are onboarded to Firewall Manager by <a>AssociateAdminAccount</a>.
     * </p>
     * <p>
     * This operation can be called only from the organization's management account.
     * </p>
     * 
     * @param listAdminAccountsForOrganizationRequest
     * @return Result of the ListAdminAccountsForOrganization operation returned by the service.
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
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an Amazon Web Services account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>WAF Developer Guide</i>.
     * @sample AWSFMS.ListAdminAccountsForOrganization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListAdminAccountsForOrganization"
     *      target="_top">AWS API Documentation</a>
     */
    ListAdminAccountsForOrganizationResult listAdminAccountsForOrganization(ListAdminAccountsForOrganizationRequest listAdminAccountsForOrganizationRequest);

    /**
     * <p>
     * Lists the accounts that are managing the specified Organizations member account. This is useful for any member
     * account so that they can view the accounts who are managing their account. This operation only returns the
     * managing administrators that have the requested account within their <a>AdminScope</a>.
     * </p>
     * 
     * @param listAdminsManagingAccountRequest
     * @return Result of the ListAdminsManagingAccount operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListAdminsManagingAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListAdminsManagingAccount" target="_top">AWS
     *      API Documentation</a>
     */
    ListAdminsManagingAccountResult listAdminsManagingAccount(ListAdminsManagingAccountRequest listAdminsManagingAccountRequest);

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
     * Returns an array of resources in the organization's accounts that are available to be associated with a resource
     * set.
     * </p>
     * 
     * @param listDiscoveredResourcesRequest
     * @return Result of the ListDiscoveredResources operation returned by the service.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListDiscoveredResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListDiscoveredResources" target="_top">AWS
     *      API Documentation</a>
     */
    ListDiscoveredResourcesResult listDiscoveredResources(ListDiscoveredResourcesRequest listDiscoveredResourcesRequest);

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
     * Returns an array of resources that are currently associated to a resource set.
     * </p>
     * 
     * @param listResourceSetResourcesRequest
     * @return Result of the ListResourceSetResources operation returned by the service.
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
     * @throws ResourceNotFoundException
     *         The specified resource was not found.
     * @sample AWSFMS.ListResourceSetResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListResourceSetResources" target="_top">AWS
     *      API Documentation</a>
     */
    ListResourceSetResourcesResult listResourceSetResources(ListResourceSetResourcesRequest listResourceSetResourcesRequest);

    /**
     * <p>
     * Returns an array of <code>ResourceSetSummary</code> objects.
     * </p>
     * 
     * @param listResourceSetsRequest
     * @return Result of the ListResourceSets operation returned by the service.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @sample AWSFMS.ListResourceSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListResourceSets" target="_top">AWS API
     *      Documentation</a>
     */
    ListResourceSetsResult listResourceSets(ListResourceSetsRequest listResourceSetsRequest);

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
     * Retrieves a list of all of the third-party firewall policies that are associated with the third-party firewall
     * administrator's account.
     * </p>
     * 
     * @param listThirdPartyFirewallFirewallPoliciesRequest
     * @return Result of the ListThirdPartyFirewallFirewallPolicies operation returned by the service.
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
     * @sample AWSFMS.ListThirdPartyFirewallFirewallPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/ListThirdPartyFirewallFirewallPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    ListThirdPartyFirewallFirewallPoliciesResult listThirdPartyFirewallFirewallPolicies(
            ListThirdPartyFirewallFirewallPoliciesRequest listThirdPartyFirewallFirewallPoliciesRequest);

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
     * @return Result of the PutAdminAccount operation returned by the service.
     * @throws InvalidOperationException
     *         The operation failed because there was nothing to do or the operation wasn't possible. For example, you
     *         might have submitted an <code>AssociateAdminAccount</code> request for an account ID that was already set
     *         as the Firewall Manager administrator. Or you might have tried to access a Region that's disabled by
     *         default, and that you need to enable for the Firewall Manager administrator account and for Organizations
     *         before you can access it.
     * @throws InvalidInputException
     *         The parameters of the request were invalid.
     * @throws InternalErrorException
     *         The operation failed because of a system problem, even though the request was valid. Retry your request.
     * @throws LimitExceededException
     *         The operation exceeds a resource limit, for example, the maximum number of <code>policy</code> objects
     *         that you can create for an Amazon Web Services account. For more information, see <a
     *         href="https://docs.aws.amazon.com/waf/latest/developerguide/fms-limits.html">Firewall Manager Limits</a>
     *         in the <i>WAF Developer Guide</i>.
     * @sample AWSFMS.PutAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutAdminAccount" target="_top">AWS API
     *      Documentation</a>
     */
    PutAdminAccountResult putAdminAccount(PutAdminAccountRequest putAdminAccountRequest);

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
     * Creates the resource set.
     * </p>
     * <p>
     * An Firewall Manager resource set defines the resources to import into an Firewall Manager policy from another
     * Amazon Web Services service.
     * </p>
     * 
     * @param putResourceSetRequest
     * @return Result of the PutResourceSet operation returned by the service.
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
     * @sample AWSFMS.PutResourceSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutResourceSet" target="_top">AWS API
     *      Documentation</a>
     */
    PutResourceSetResult putResourceSet(PutResourceSetRequest putResourceSetRequest);

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
