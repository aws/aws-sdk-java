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
package com.amazonaws.services.shield;

import javax.annotation.Generated;

import com.amazonaws.services.shield.model.*;

/**
 * Interface for accessing AWS Shield asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.shield.AbstractAWSShieldAsync} instead.
 * </p>
 * <p>
 * <fullname>Shield Advanced</fullname>
 * <p>
 * This is the <i>Shield Advanced API Reference</i>. This guide is for developers who need detailed information about
 * the Shield Advanced API actions, data types, and errors. For detailed information about WAF and Shield Advanced
 * features and an overview of how to use the WAF and Shield Advanced APIs, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">WAF and Shield Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSShieldAsync extends AWSShield {

    /**
     * <p>
     * Authorizes the Shield Response Team (SRT) to access the specified Amazon S3 bucket containing log data such as
     * Application Load Balancer access logs, CloudFront logs, or logs from third party sources. You can associate up to
     * 10 Amazon S3 buckets with your subscription.
     * </p>
     * <p>
     * To use the services of the SRT and make an <code>AssociateDRTLogBucket</code> request, you must be subscribed to
     * the <a href="http://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="http://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>.
     * </p>
     * 
     * @param associateDRTLogBucketRequest
     * @return A Java Future containing the result of the AssociateDRTLogBucket operation returned by the service.
     * @sample AWSShieldAsync.AssociateDRTLogBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateDRTLogBucket" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDRTLogBucketResult> associateDRTLogBucketAsync(AssociateDRTLogBucketRequest associateDRTLogBucketRequest);

    /**
     * <p>
     * Authorizes the Shield Response Team (SRT) to access the specified Amazon S3 bucket containing log data such as
     * Application Load Balancer access logs, CloudFront logs, or logs from third party sources. You can associate up to
     * 10 Amazon S3 buckets with your subscription.
     * </p>
     * <p>
     * To use the services of the SRT and make an <code>AssociateDRTLogBucket</code> request, you must be subscribed to
     * the <a href="http://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="http://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>.
     * </p>
     * 
     * @param associateDRTLogBucketRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateDRTLogBucket operation returned by the service.
     * @sample AWSShieldAsyncHandler.AssociateDRTLogBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateDRTLogBucket" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDRTLogBucketResult> associateDRTLogBucketAsync(AssociateDRTLogBucketRequest associateDRTLogBucketRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateDRTLogBucketRequest, AssociateDRTLogBucketResult> asyncHandler);

    /**
     * <p>
     * Authorizes the Shield Response Team (SRT) using the specified role, to access your Amazon Web Services account to
     * assist with DDoS attack mitigation during potential attacks. This enables the SRT to inspect your WAF
     * configuration and create or update WAF rules and web ACLs.
     * </p>
     * <p>
     * You can associate only one <code>RoleArn</code> with your subscription. If you submit an
     * <code>AssociateDRTRole</code> request for an account that already has an associated role, the new
     * <code>RoleArn</code> will replace the existing <code>RoleArn</code>.
     * </p>
     * <p>
     * Prior to making the <code>AssociateDRTRole</code> request, you must attach the
     * <code>AWSShieldDRTAccessPolicy</code> managed policy to the role that you'll specify in the request. You can
     * access this policy in the IAM console at <a href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     * >AWSShieldDRTAccessPolicy</a>. For more information see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html">Adding and
     * removing IAM identity permissions</a>. The role must also trust the service principal
     * <code>drt.shield.amazonaws.com</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">IAM JSON
     * policy elements: Principal</a>.
     * </p>
     * <p>
     * The SRT will have access only to your WAF and Shield resources. By submitting this request, you authorize the SRT
     * to inspect your WAF and Shield configuration and create and update WAF rules and web ACLs on your behalf. The SRT
     * takes these actions only if explicitly authorized by you.
     * </p>
     * <p>
     * You must have the <code>iam:PassRole</code> permission to make an <code>AssociateDRTRole</code> request. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a
     * user permissions to pass a role to an Amazon Web Services service</a>.
     * </p>
     * <p>
     * To use the services of the SRT and make an <code>AssociateDRTRole</code> request, you must be subscribed to the
     * <a href="http://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="http://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>.
     * </p>
     * 
     * @param associateDRTRoleRequest
     * @return A Java Future containing the result of the AssociateDRTRole operation returned by the service.
     * @sample AWSShieldAsync.AssociateDRTRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateDRTRole" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateDRTRoleResult> associateDRTRoleAsync(AssociateDRTRoleRequest associateDRTRoleRequest);

    /**
     * <p>
     * Authorizes the Shield Response Team (SRT) using the specified role, to access your Amazon Web Services account to
     * assist with DDoS attack mitigation during potential attacks. This enables the SRT to inspect your WAF
     * configuration and create or update WAF rules and web ACLs.
     * </p>
     * <p>
     * You can associate only one <code>RoleArn</code> with your subscription. If you submit an
     * <code>AssociateDRTRole</code> request for an account that already has an associated role, the new
     * <code>RoleArn</code> will replace the existing <code>RoleArn</code>.
     * </p>
     * <p>
     * Prior to making the <code>AssociateDRTRole</code> request, you must attach the
     * <code>AWSShieldDRTAccessPolicy</code> managed policy to the role that you'll specify in the request. You can
     * access this policy in the IAM console at <a href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     * >AWSShieldDRTAccessPolicy</a>. For more information see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html">Adding and
     * removing IAM identity permissions</a>. The role must also trust the service principal
     * <code>drt.shield.amazonaws.com</code>. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">IAM JSON
     * policy elements: Principal</a>.
     * </p>
     * <p>
     * The SRT will have access only to your WAF and Shield resources. By submitting this request, you authorize the SRT
     * to inspect your WAF and Shield configuration and create and update WAF rules and web ACLs on your behalf. The SRT
     * takes these actions only if explicitly authorized by you.
     * </p>
     * <p>
     * You must have the <code>iam:PassRole</code> permission to make an <code>AssociateDRTRole</code> request. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a
     * user permissions to pass a role to an Amazon Web Services service</a>.
     * </p>
     * <p>
     * To use the services of the SRT and make an <code>AssociateDRTRole</code> request, you must be subscribed to the
     * <a href="http://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="http://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>.
     * </p>
     * 
     * @param associateDRTRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateDRTRole operation returned by the service.
     * @sample AWSShieldAsyncHandler.AssociateDRTRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateDRTRole" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AssociateDRTRoleResult> associateDRTRoleAsync(AssociateDRTRoleRequest associateDRTRoleRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateDRTRoleRequest, AssociateDRTRoleResult> asyncHandler);

    /**
     * <p>
     * Adds health-based detection to the Shield Advanced protection for a resource. Shield Advanced health-based
     * detection uses the health of your Amazon Web Services resource to improve responsiveness and accuracy in attack
     * detection and response.
     * </p>
     * <p>
     * You define the health check in Route 53 and then associate it with your Shield Advanced protection. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-overview.html#ddos-advanced-health-check-option"
     * >Shield Advanced Health-Based Detection</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param associateHealthCheckRequest
     * @return A Java Future containing the result of the AssociateHealthCheck operation returned by the service.
     * @sample AWSShieldAsync.AssociateHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateHealthCheck" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateHealthCheckResult> associateHealthCheckAsync(AssociateHealthCheckRequest associateHealthCheckRequest);

    /**
     * <p>
     * Adds health-based detection to the Shield Advanced protection for a resource. Shield Advanced health-based
     * detection uses the health of your Amazon Web Services resource to improve responsiveness and accuracy in attack
     * detection and response.
     * </p>
     * <p>
     * You define the health check in Route 53 and then associate it with your Shield Advanced protection. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-overview.html#ddos-advanced-health-check-option"
     * >Shield Advanced Health-Based Detection</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param associateHealthCheckRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateHealthCheck operation returned by the service.
     * @sample AWSShieldAsyncHandler.AssociateHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateHealthCheck" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<AssociateHealthCheckResult> associateHealthCheckAsync(AssociateHealthCheckRequest associateHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateHealthCheckRequest, AssociateHealthCheckResult> asyncHandler);

    /**
     * <p>
     * Initializes proactive engagement and sets the list of contacts for the Shield Response Team (SRT) to use. You
     * must provide at least one phone number in the emergency contact list.
     * </p>
     * <p>
     * After you have initialized proactive engagement using this call, to disable or enable proactive engagement, use
     * the calls <code>DisableProactiveEngagement</code> and <code>EnableProactiveEngagement</code>.
     * </p>
     * <note>
     * <p>
     * This call defines the list of email addresses and phone numbers that the SRT can use to contact you for
     * escalations to the SRT and to initiate proactive customer support.
     * </p>
     * <p>
     * The contacts that you provide in the request replace any contacts that were already defined. If you already have
     * contacts defined and want to use them, retrieve the list using <code>DescribeEmergencyContactSettings</code> and
     * then provide it to this call.
     * </p>
     * </note>
     * 
     * @param associateProactiveEngagementDetailsRequest
     * @return A Java Future containing the result of the AssociateProactiveEngagementDetails operation returned by the
     *         service.
     * @sample AWSShieldAsync.AssociateProactiveEngagementDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateProactiveEngagementDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateProactiveEngagementDetailsResult> associateProactiveEngagementDetailsAsync(
            AssociateProactiveEngagementDetailsRequest associateProactiveEngagementDetailsRequest);

    /**
     * <p>
     * Initializes proactive engagement and sets the list of contacts for the Shield Response Team (SRT) to use. You
     * must provide at least one phone number in the emergency contact list.
     * </p>
     * <p>
     * After you have initialized proactive engagement using this call, to disable or enable proactive engagement, use
     * the calls <code>DisableProactiveEngagement</code> and <code>EnableProactiveEngagement</code>.
     * </p>
     * <note>
     * <p>
     * This call defines the list of email addresses and phone numbers that the SRT can use to contact you for
     * escalations to the SRT and to initiate proactive customer support.
     * </p>
     * <p>
     * The contacts that you provide in the request replace any contacts that were already defined. If you already have
     * contacts defined and want to use them, retrieve the list using <code>DescribeEmergencyContactSettings</code> and
     * then provide it to this call.
     * </p>
     * </note>
     * 
     * @param associateProactiveEngagementDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateProactiveEngagementDetails operation returned by the
     *         service.
     * @sample AWSShieldAsyncHandler.AssociateProactiveEngagementDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateProactiveEngagementDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateProactiveEngagementDetailsResult> associateProactiveEngagementDetailsAsync(
            AssociateProactiveEngagementDetailsRequest associateProactiveEngagementDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateProactiveEngagementDetailsRequest, AssociateProactiveEngagementDetailsResult> asyncHandler);

    /**
     * <p>
     * Enables Shield Advanced for a specific Amazon Web Services resource. The resource can be an Amazon CloudFront
     * distribution, Amazon Route 53 hosted zone, Global Accelerator standard accelerator, Elastic IP Address,
     * Application Load Balancer, or a Classic Load Balancer. You can protect Amazon EC2 instances and Network Load
     * Balancers by association with protected Amazon EC2 Elastic IP addresses.
     * </p>
     * <p>
     * You can add protection to only a single resource with each <code>CreateProtection</code> request. You can add
     * protection to multiple resources at once through the Shield Advanced console at <a
     * href="https://console.aws.amazon.com/wafv2/shieldv2#/">https://console.aws.amazon.com/wafv2/shieldv2#/</a>. For
     * more information see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/getting-started-ddos.html">Getting Started with
     * Shield Advanced</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/configure-new-protection.html">Adding Shield Advanced
     * protection to Amazon Web Services resources</a>.
     * </p>
     * 
     * @param createProtectionRequest
     * @return A Java Future containing the result of the CreateProtection operation returned by the service.
     * @sample AWSShieldAsync.CreateProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/CreateProtection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProtectionResult> createProtectionAsync(CreateProtectionRequest createProtectionRequest);

    /**
     * <p>
     * Enables Shield Advanced for a specific Amazon Web Services resource. The resource can be an Amazon CloudFront
     * distribution, Amazon Route 53 hosted zone, Global Accelerator standard accelerator, Elastic IP Address,
     * Application Load Balancer, or a Classic Load Balancer. You can protect Amazon EC2 instances and Network Load
     * Balancers by association with protected Amazon EC2 Elastic IP addresses.
     * </p>
     * <p>
     * You can add protection to only a single resource with each <code>CreateProtection</code> request. You can add
     * protection to multiple resources at once through the Shield Advanced console at <a
     * href="https://console.aws.amazon.com/wafv2/shieldv2#/">https://console.aws.amazon.com/wafv2/shieldv2#/</a>. For
     * more information see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/getting-started-ddos.html">Getting Started with
     * Shield Advanced</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/configure-new-protection.html">Adding Shield Advanced
     * protection to Amazon Web Services resources</a>.
     * </p>
     * 
     * @param createProtectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProtection operation returned by the service.
     * @sample AWSShieldAsyncHandler.CreateProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/CreateProtection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateProtectionResult> createProtectionAsync(CreateProtectionRequest createProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProtectionRequest, CreateProtectionResult> asyncHandler);

    /**
     * <p>
     * Creates a grouping of protected resources so they can be handled as a collective. This resource grouping improves
     * the accuracy of detection and reduces false positives.
     * </p>
     * 
     * @param createProtectionGroupRequest
     * @return A Java Future containing the result of the CreateProtectionGroup operation returned by the service.
     * @sample AWSShieldAsync.CreateProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/CreateProtectionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProtectionGroupResult> createProtectionGroupAsync(CreateProtectionGroupRequest createProtectionGroupRequest);

    /**
     * <p>
     * Creates a grouping of protected resources so they can be handled as a collective. This resource grouping improves
     * the accuracy of detection and reduces false positives.
     * </p>
     * 
     * @param createProtectionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProtectionGroup operation returned by the service.
     * @sample AWSShieldAsyncHandler.CreateProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/CreateProtectionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateProtectionGroupResult> createProtectionGroupAsync(CreateProtectionGroupRequest createProtectionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProtectionGroupRequest, CreateProtectionGroupResult> asyncHandler);

    /**
     * <p>
     * Activates Shield Advanced for an account.
     * </p>
     * <note>
     * <p>
     * For accounts that are members of an Organizations organization, Shield Advanced subscriptions are billed against
     * the organization's payer account, regardless of whether the payer account itself is subscribed.
     * </p>
     * </note>
     * <p>
     * When you initially create a subscription, your subscription is set to be automatically renewed at the end of the
     * existing subscription period. You can change this by submitting an <code>UpdateSubscription</code> request.
     * </p>
     * 
     * @param createSubscriptionRequest
     * @return A Java Future containing the result of the CreateSubscription operation returned by the service.
     * @sample AWSShieldAsync.CreateSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/CreateSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionResult> createSubscriptionAsync(CreateSubscriptionRequest createSubscriptionRequest);

    /**
     * <p>
     * Activates Shield Advanced for an account.
     * </p>
     * <note>
     * <p>
     * For accounts that are members of an Organizations organization, Shield Advanced subscriptions are billed against
     * the organization's payer account, regardless of whether the payer account itself is subscribed.
     * </p>
     * </note>
     * <p>
     * When you initially create a subscription, your subscription is set to be automatically renewed at the end of the
     * existing subscription period. You can change this by submitting an <code>UpdateSubscription</code> request.
     * </p>
     * 
     * @param createSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSubscription operation returned by the service.
     * @sample AWSShieldAsyncHandler.CreateSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/CreateSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSubscriptionResult> createSubscriptionAsync(CreateSubscriptionRequest createSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSubscriptionRequest, CreateSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Deletes an Shield Advanced <a>Protection</a>.
     * </p>
     * 
     * @param deleteProtectionRequest
     * @return A Java Future containing the result of the DeleteProtection operation returned by the service.
     * @sample AWSShieldAsync.DeleteProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DeleteProtection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProtectionResult> deleteProtectionAsync(DeleteProtectionRequest deleteProtectionRequest);

    /**
     * <p>
     * Deletes an Shield Advanced <a>Protection</a>.
     * </p>
     * 
     * @param deleteProtectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProtection operation returned by the service.
     * @sample AWSShieldAsyncHandler.DeleteProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DeleteProtection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteProtectionResult> deleteProtectionAsync(DeleteProtectionRequest deleteProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProtectionRequest, DeleteProtectionResult> asyncHandler);

    /**
     * <p>
     * Removes the specified protection group.
     * </p>
     * 
     * @param deleteProtectionGroupRequest
     * @return A Java Future containing the result of the DeleteProtectionGroup operation returned by the service.
     * @sample AWSShieldAsync.DeleteProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DeleteProtectionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProtectionGroupResult> deleteProtectionGroupAsync(DeleteProtectionGroupRequest deleteProtectionGroupRequest);

    /**
     * <p>
     * Removes the specified protection group.
     * </p>
     * 
     * @param deleteProtectionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProtectionGroup operation returned by the service.
     * @sample AWSShieldAsyncHandler.DeleteProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DeleteProtectionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProtectionGroupResult> deleteProtectionGroupAsync(DeleteProtectionGroupRequest deleteProtectionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProtectionGroupRequest, DeleteProtectionGroupResult> asyncHandler);

    /**
     * <p>
     * Removes Shield Advanced from an account. Shield Advanced requires a 1-year subscription commitment. You cannot
     * delete a subscription prior to the completion of that commitment.
     * </p>
     * 
     * @param deleteSubscriptionRequest
     * @return A Java Future containing the result of the DeleteSubscription operation returned by the service.
     * @sample AWSShieldAsync.DeleteSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DeleteSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DeleteSubscriptionResult> deleteSubscriptionAsync(DeleteSubscriptionRequest deleteSubscriptionRequest);

    /**
     * <p>
     * Removes Shield Advanced from an account. Shield Advanced requires a 1-year subscription commitment. You cannot
     * delete a subscription prior to the completion of that commitment.
     * </p>
     * 
     * @param deleteSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSubscription operation returned by the service.
     * @sample AWSShieldAsyncHandler.DeleteSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DeleteSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DeleteSubscriptionResult> deleteSubscriptionAsync(DeleteSubscriptionRequest deleteSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionRequest, DeleteSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Describes the details of a DDoS attack.
     * </p>
     * 
     * @param describeAttackRequest
     * @return A Java Future containing the result of the DescribeAttack operation returned by the service.
     * @sample AWSShieldAsync.DescribeAttack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeAttack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAttackResult> describeAttackAsync(DescribeAttackRequest describeAttackRequest);

    /**
     * <p>
     * Describes the details of a DDoS attack.
     * </p>
     * 
     * @param describeAttackRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAttack operation returned by the service.
     * @sample AWSShieldAsyncHandler.DescribeAttack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeAttack" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAttackResult> describeAttackAsync(DescribeAttackRequest describeAttackRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAttackRequest, DescribeAttackResult> asyncHandler);

    /**
     * <p>
     * Provides information about the number and type of attacks Shield has detected in the last year for all resources
     * that belong to your account, regardless of whether you've defined Shield protections for them. This operation is
     * available to Shield customers as well as to Shield Advanced customers.
     * </p>
     * <p>
     * The operation returns data for the time range of midnight UTC, one year ago, to midnight UTC, today. For example,
     * if the current time is <code>2020-10-26 15:39:32 PDT</code>, equal to <code>2020-10-26 22:39:32 UTC</code>, then
     * the time range for the attack data returned is from <code>2019-10-26 00:00:00 UTC</code> to
     * <code>2020-10-26 00:00:00 UTC</code>.
     * </p>
     * <p>
     * The time range indicates the period covered by the attack statistics data items.
     * </p>
     * 
     * @param describeAttackStatisticsRequest
     * @return A Java Future containing the result of the DescribeAttackStatistics operation returned by the service.
     * @sample AWSShieldAsync.DescribeAttackStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeAttackStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAttackStatisticsResult> describeAttackStatisticsAsync(DescribeAttackStatisticsRequest describeAttackStatisticsRequest);

    /**
     * <p>
     * Provides information about the number and type of attacks Shield has detected in the last year for all resources
     * that belong to your account, regardless of whether you've defined Shield protections for them. This operation is
     * available to Shield customers as well as to Shield Advanced customers.
     * </p>
     * <p>
     * The operation returns data for the time range of midnight UTC, one year ago, to midnight UTC, today. For example,
     * if the current time is <code>2020-10-26 15:39:32 PDT</code>, equal to <code>2020-10-26 22:39:32 UTC</code>, then
     * the time range for the attack data returned is from <code>2019-10-26 00:00:00 UTC</code> to
     * <code>2020-10-26 00:00:00 UTC</code>.
     * </p>
     * <p>
     * The time range indicates the period covered by the attack statistics data items.
     * </p>
     * 
     * @param describeAttackStatisticsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAttackStatistics operation returned by the service.
     * @sample AWSShieldAsyncHandler.DescribeAttackStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeAttackStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeAttackStatisticsResult> describeAttackStatisticsAsync(DescribeAttackStatisticsRequest describeAttackStatisticsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAttackStatisticsRequest, DescribeAttackStatisticsResult> asyncHandler);

    /**
     * <p>
     * Returns the current role and list of Amazon S3 log buckets used by the Shield Response Team (SRT) to access your
     * Amazon Web Services account while assisting with attack mitigation.
     * </p>
     * 
     * @param describeDRTAccessRequest
     * @return A Java Future containing the result of the DescribeDRTAccess operation returned by the service.
     * @sample AWSShieldAsync.DescribeDRTAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeDRTAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDRTAccessResult> describeDRTAccessAsync(DescribeDRTAccessRequest describeDRTAccessRequest);

    /**
     * <p>
     * Returns the current role and list of Amazon S3 log buckets used by the Shield Response Team (SRT) to access your
     * Amazon Web Services account while assisting with attack mitigation.
     * </p>
     * 
     * @param describeDRTAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDRTAccess operation returned by the service.
     * @sample AWSShieldAsyncHandler.DescribeDRTAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeDRTAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeDRTAccessResult> describeDRTAccessAsync(DescribeDRTAccessRequest describeDRTAccessRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDRTAccessRequest, DescribeDRTAccessResult> asyncHandler);

    /**
     * <p>
     * A list of email addresses and phone numbers that the Shield Response Team (SRT) can use to contact you if you
     * have proactive engagement enabled, for escalations to the SRT and to initiate proactive customer support.
     * </p>
     * 
     * @param describeEmergencyContactSettingsRequest
     * @return A Java Future containing the result of the DescribeEmergencyContactSettings operation returned by the
     *         service.
     * @sample AWSShieldAsync.DescribeEmergencyContactSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeEmergencyContactSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEmergencyContactSettingsResult> describeEmergencyContactSettingsAsync(
            DescribeEmergencyContactSettingsRequest describeEmergencyContactSettingsRequest);

    /**
     * <p>
     * A list of email addresses and phone numbers that the Shield Response Team (SRT) can use to contact you if you
     * have proactive engagement enabled, for escalations to the SRT and to initiate proactive customer support.
     * </p>
     * 
     * @param describeEmergencyContactSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEmergencyContactSettings operation returned by the
     *         service.
     * @sample AWSShieldAsyncHandler.DescribeEmergencyContactSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeEmergencyContactSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEmergencyContactSettingsResult> describeEmergencyContactSettingsAsync(
            DescribeEmergencyContactSettingsRequest describeEmergencyContactSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEmergencyContactSettingsRequest, DescribeEmergencyContactSettingsResult> asyncHandler);

    /**
     * <p>
     * Lists the details of a <a>Protection</a> object.
     * </p>
     * 
     * @param describeProtectionRequest
     * @return A Java Future containing the result of the DescribeProtection operation returned by the service.
     * @sample AWSShieldAsync.DescribeProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeProtection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeProtectionResult> describeProtectionAsync(DescribeProtectionRequest describeProtectionRequest);

    /**
     * <p>
     * Lists the details of a <a>Protection</a> object.
     * </p>
     * 
     * @param describeProtectionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProtection operation returned by the service.
     * @sample AWSShieldAsyncHandler.DescribeProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeProtection" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeProtectionResult> describeProtectionAsync(DescribeProtectionRequest describeProtectionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProtectionRequest, DescribeProtectionResult> asyncHandler);

    /**
     * <p>
     * Returns the specification for the specified protection group.
     * </p>
     * 
     * @param describeProtectionGroupRequest
     * @return A Java Future containing the result of the DescribeProtectionGroup operation returned by the service.
     * @sample AWSShieldAsync.DescribeProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeProtectionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProtectionGroupResult> describeProtectionGroupAsync(DescribeProtectionGroupRequest describeProtectionGroupRequest);

    /**
     * <p>
     * Returns the specification for the specified protection group.
     * </p>
     * 
     * @param describeProtectionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProtectionGroup operation returned by the service.
     * @sample AWSShieldAsyncHandler.DescribeProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeProtectionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProtectionGroupResult> describeProtectionGroupAsync(DescribeProtectionGroupRequest describeProtectionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProtectionGroupRequest, DescribeProtectionGroupResult> asyncHandler);

    /**
     * <p>
     * Provides details about the Shield Advanced subscription for an account.
     * </p>
     * 
     * @param describeSubscriptionRequest
     * @return A Java Future containing the result of the DescribeSubscription operation returned by the service.
     * @sample AWSShieldAsync.DescribeSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSubscriptionResult> describeSubscriptionAsync(DescribeSubscriptionRequest describeSubscriptionRequest);

    /**
     * <p>
     * Provides details about the Shield Advanced subscription for an account.
     * </p>
     * 
     * @param describeSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSubscription operation returned by the service.
     * @sample AWSShieldAsyncHandler.DescribeSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSubscriptionResult> describeSubscriptionAsync(DescribeSubscriptionRequest describeSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSubscriptionRequest, DescribeSubscriptionResult> asyncHandler);

    /**
     * <p>
     * Disable the Shield Advanced automatic application layer DDoS mitigation feature for the protected resource. This
     * stops Shield Advanced from creating, verifying, and applying WAF rules for attacks that it detects for the
     * resource.
     * </p>
     * 
     * @param disableApplicationLayerAutomaticResponseRequest
     * @return A Java Future containing the result of the DisableApplicationLayerAutomaticResponse operation returned by
     *         the service.
     * @sample AWSShieldAsync.DisableApplicationLayerAutomaticResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisableApplicationLayerAutomaticResponse"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableApplicationLayerAutomaticResponseResult> disableApplicationLayerAutomaticResponseAsync(
            DisableApplicationLayerAutomaticResponseRequest disableApplicationLayerAutomaticResponseRequest);

    /**
     * <p>
     * Disable the Shield Advanced automatic application layer DDoS mitigation feature for the protected resource. This
     * stops Shield Advanced from creating, verifying, and applying WAF rules for attacks that it detects for the
     * resource.
     * </p>
     * 
     * @param disableApplicationLayerAutomaticResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableApplicationLayerAutomaticResponse operation returned by
     *         the service.
     * @sample AWSShieldAsyncHandler.DisableApplicationLayerAutomaticResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisableApplicationLayerAutomaticResponse"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableApplicationLayerAutomaticResponseResult> disableApplicationLayerAutomaticResponseAsync(
            DisableApplicationLayerAutomaticResponseRequest disableApplicationLayerAutomaticResponseRequest,
            com.amazonaws.handlers.AsyncHandler<DisableApplicationLayerAutomaticResponseRequest, DisableApplicationLayerAutomaticResponseResult> asyncHandler);

    /**
     * <p>
     * Removes authorization from the Shield Response Team (SRT) to notify contacts about escalations to the SRT and to
     * initiate proactive customer support.
     * </p>
     * 
     * @param disableProactiveEngagementRequest
     * @return A Java Future containing the result of the DisableProactiveEngagement operation returned by the service.
     * @sample AWSShieldAsync.DisableProactiveEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisableProactiveEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableProactiveEngagementResult> disableProactiveEngagementAsync(
            DisableProactiveEngagementRequest disableProactiveEngagementRequest);

    /**
     * <p>
     * Removes authorization from the Shield Response Team (SRT) to notify contacts about escalations to the SRT and to
     * initiate proactive customer support.
     * </p>
     * 
     * @param disableProactiveEngagementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableProactiveEngagement operation returned by the service.
     * @sample AWSShieldAsyncHandler.DisableProactiveEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisableProactiveEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableProactiveEngagementResult> disableProactiveEngagementAsync(
            DisableProactiveEngagementRequest disableProactiveEngagementRequest,
            com.amazonaws.handlers.AsyncHandler<DisableProactiveEngagementRequest, DisableProactiveEngagementResult> asyncHandler);

    /**
     * <p>
     * Removes the Shield Response Team's (SRT) access to the specified Amazon S3 bucket containing the logs that you
     * shared previously.
     * </p>
     * 
     * @param disassociateDRTLogBucketRequest
     * @return A Java Future containing the result of the DisassociateDRTLogBucket operation returned by the service.
     * @sample AWSShieldAsync.DisassociateDRTLogBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisassociateDRTLogBucket"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDRTLogBucketResult> disassociateDRTLogBucketAsync(DisassociateDRTLogBucketRequest disassociateDRTLogBucketRequest);

    /**
     * <p>
     * Removes the Shield Response Team's (SRT) access to the specified Amazon S3 bucket containing the logs that you
     * shared previously.
     * </p>
     * 
     * @param disassociateDRTLogBucketRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateDRTLogBucket operation returned by the service.
     * @sample AWSShieldAsyncHandler.DisassociateDRTLogBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisassociateDRTLogBucket"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDRTLogBucketResult> disassociateDRTLogBucketAsync(DisassociateDRTLogBucketRequest disassociateDRTLogBucketRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateDRTLogBucketRequest, DisassociateDRTLogBucketResult> asyncHandler);

    /**
     * <p>
     * Removes the Shield Response Team's (SRT) access to your Amazon Web Services account.
     * </p>
     * 
     * @param disassociateDRTRoleRequest
     * @return A Java Future containing the result of the DisassociateDRTRole operation returned by the service.
     * @sample AWSShieldAsync.DisassociateDRTRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisassociateDRTRole" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDRTRoleResult> disassociateDRTRoleAsync(DisassociateDRTRoleRequest disassociateDRTRoleRequest);

    /**
     * <p>
     * Removes the Shield Response Team's (SRT) access to your Amazon Web Services account.
     * </p>
     * 
     * @param disassociateDRTRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateDRTRole operation returned by the service.
     * @sample AWSShieldAsyncHandler.DisassociateDRTRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisassociateDRTRole" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDRTRoleResult> disassociateDRTRoleAsync(DisassociateDRTRoleRequest disassociateDRTRoleRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateDRTRoleRequest, DisassociateDRTRoleResult> asyncHandler);

    /**
     * <p>
     * Removes health-based detection from the Shield Advanced protection for a resource. Shield Advanced health-based
     * detection uses the health of your Amazon Web Services resource to improve responsiveness and accuracy in attack
     * detection and response.
     * </p>
     * <p>
     * You define the health check in Route 53 and then associate or disassociate it with your Shield Advanced
     * protection. For more information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-overview.html#ddos-advanced-health-check-option"
     * >Shield Advanced Health-Based Detection</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param disassociateHealthCheckRequest
     * @return A Java Future containing the result of the DisassociateHealthCheck operation returned by the service.
     * @sample AWSShieldAsync.DisassociateHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisassociateHealthCheck" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateHealthCheckResult> disassociateHealthCheckAsync(DisassociateHealthCheckRequest disassociateHealthCheckRequest);

    /**
     * <p>
     * Removes health-based detection from the Shield Advanced protection for a resource. Shield Advanced health-based
     * detection uses the health of your Amazon Web Services resource to improve responsiveness and accuracy in attack
     * detection and response.
     * </p>
     * <p>
     * You define the health check in Route 53 and then associate or disassociate it with your Shield Advanced
     * protection. For more information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-overview.html#ddos-advanced-health-check-option"
     * >Shield Advanced Health-Based Detection</a> in the <i>WAF Developer Guide</i>.
     * </p>
     * 
     * @param disassociateHealthCheckRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateHealthCheck operation returned by the service.
     * @sample AWSShieldAsyncHandler.DisassociateHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisassociateHealthCheck" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateHealthCheckResult> disassociateHealthCheckAsync(DisassociateHealthCheckRequest disassociateHealthCheckRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateHealthCheckRequest, DisassociateHealthCheckResult> asyncHandler);

    /**
     * <p>
     * Enable the Shield Advanced automatic application layer DDoS mitigation for the protected resource.
     * </p>
     * <note>
     * <p>
     * This feature is available for Amazon CloudFront distributions and Application Load Balancers only.
     * </p>
     * </note>
     * <p>
     * This causes Shield Advanced to create, verify, and apply WAF rules for DDoS attacks that it detects for the
     * resource. Shield Advanced applies the rules in a Shield rule group inside the web ACL that you've associated with
     * the resource. For information about how automatic mitigation works and the requirements for using it, see <a
     * href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-automatic-app-layer-response.html">Shield
     * Advanced automatic application layer DDoS mitigation</a>.
     * </p>
     * <note>
     * <p>
     * Don't use this action to make changes to automatic mitigation settings when it's already enabled for a resource.
     * Instead, use <a>UpdateApplicationLayerAutomaticResponse</a>.
     * </p>
     * </note>
     * <p>
     * To use this feature, you must associate a web ACL with the protected resource. The web ACL must be created using
     * the latest version of WAF (v2). You can associate the web ACL through the Shield Advanced console at <a
     * href="https://console.aws.amazon.com/wafv2/shieldv2#/">https://console.aws.amazon.com/wafv2/shieldv2#/</a>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/getting-started-ddos.html">Getting Started with
     * Shield Advanced</a>. You can also associate the web ACL to the resource through the WAF console or the WAF API,
     * but you must manage Shield Advanced automatic mitigation through Shield Advanced. For information about WAF, see
     * <a href="https://docs.aws.amazon.com/waf/latest/developerguide/">WAF Developer Guide</a>.
     * </p>
     * 
     * @param enableApplicationLayerAutomaticResponseRequest
     * @return A Java Future containing the result of the EnableApplicationLayerAutomaticResponse operation returned by
     *         the service.
     * @sample AWSShieldAsync.EnableApplicationLayerAutomaticResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/EnableApplicationLayerAutomaticResponse"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableApplicationLayerAutomaticResponseResult> enableApplicationLayerAutomaticResponseAsync(
            EnableApplicationLayerAutomaticResponseRequest enableApplicationLayerAutomaticResponseRequest);

    /**
     * <p>
     * Enable the Shield Advanced automatic application layer DDoS mitigation for the protected resource.
     * </p>
     * <note>
     * <p>
     * This feature is available for Amazon CloudFront distributions and Application Load Balancers only.
     * </p>
     * </note>
     * <p>
     * This causes Shield Advanced to create, verify, and apply WAF rules for DDoS attacks that it detects for the
     * resource. Shield Advanced applies the rules in a Shield rule group inside the web ACL that you've associated with
     * the resource. For information about how automatic mitigation works and the requirements for using it, see <a
     * href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-advanced-automatic-app-layer-response.html">Shield
     * Advanced automatic application layer DDoS mitigation</a>.
     * </p>
     * <note>
     * <p>
     * Don't use this action to make changes to automatic mitigation settings when it's already enabled for a resource.
     * Instead, use <a>UpdateApplicationLayerAutomaticResponse</a>.
     * </p>
     * </note>
     * <p>
     * To use this feature, you must associate a web ACL with the protected resource. The web ACL must be created using
     * the latest version of WAF (v2). You can associate the web ACL through the Shield Advanced console at <a
     * href="https://console.aws.amazon.com/wafv2/shieldv2#/">https://console.aws.amazon.com/wafv2/shieldv2#/</a>. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/getting-started-ddos.html">Getting Started with
     * Shield Advanced</a>. You can also associate the web ACL to the resource through the WAF console or the WAF API,
     * but you must manage Shield Advanced automatic mitigation through Shield Advanced. For information about WAF, see
     * <a href="https://docs.aws.amazon.com/waf/latest/developerguide/">WAF Developer Guide</a>.
     * </p>
     * 
     * @param enableApplicationLayerAutomaticResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableApplicationLayerAutomaticResponse operation returned by
     *         the service.
     * @sample AWSShieldAsyncHandler.EnableApplicationLayerAutomaticResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/EnableApplicationLayerAutomaticResponse"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableApplicationLayerAutomaticResponseResult> enableApplicationLayerAutomaticResponseAsync(
            EnableApplicationLayerAutomaticResponseRequest enableApplicationLayerAutomaticResponseRequest,
            com.amazonaws.handlers.AsyncHandler<EnableApplicationLayerAutomaticResponseRequest, EnableApplicationLayerAutomaticResponseResult> asyncHandler);

    /**
     * <p>
     * Authorizes the Shield Response Team (SRT) to use email and phone to notify contacts about escalations to the SRT
     * and to initiate proactive customer support.
     * </p>
     * 
     * @param enableProactiveEngagementRequest
     * @return A Java Future containing the result of the EnableProactiveEngagement operation returned by the service.
     * @sample AWSShieldAsync.EnableProactiveEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/EnableProactiveEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableProactiveEngagementResult> enableProactiveEngagementAsync(
            EnableProactiveEngagementRequest enableProactiveEngagementRequest);

    /**
     * <p>
     * Authorizes the Shield Response Team (SRT) to use email and phone to notify contacts about escalations to the SRT
     * and to initiate proactive customer support.
     * </p>
     * 
     * @param enableProactiveEngagementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableProactiveEngagement operation returned by the service.
     * @sample AWSShieldAsyncHandler.EnableProactiveEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/EnableProactiveEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableProactiveEngagementResult> enableProactiveEngagementAsync(
            EnableProactiveEngagementRequest enableProactiveEngagementRequest,
            com.amazonaws.handlers.AsyncHandler<EnableProactiveEngagementRequest, EnableProactiveEngagementResult> asyncHandler);

    /**
     * <p>
     * Returns the <code>SubscriptionState</code>, either <code>Active</code> or <code>Inactive</code>.
     * </p>
     * 
     * @param getSubscriptionStateRequest
     * @return A Java Future containing the result of the GetSubscriptionState operation returned by the service.
     * @sample AWSShieldAsync.GetSubscriptionState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/GetSubscriptionState" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionStateResult> getSubscriptionStateAsync(GetSubscriptionStateRequest getSubscriptionStateRequest);

    /**
     * <p>
     * Returns the <code>SubscriptionState</code>, either <code>Active</code> or <code>Inactive</code>.
     * </p>
     * 
     * @param getSubscriptionStateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSubscriptionState operation returned by the service.
     * @sample AWSShieldAsyncHandler.GetSubscriptionState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/GetSubscriptionState" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetSubscriptionStateResult> getSubscriptionStateAsync(GetSubscriptionStateRequest getSubscriptionStateRequest,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionStateRequest, GetSubscriptionStateResult> asyncHandler);

    /**
     * <p>
     * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
     * </p>
     * 
     * @param listAttacksRequest
     * @return A Java Future containing the result of the ListAttacks operation returned by the service.
     * @sample AWSShieldAsync.ListAttacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListAttacks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAttacksResult> listAttacksAsync(ListAttacksRequest listAttacksRequest);

    /**
     * <p>
     * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
     * </p>
     * 
     * @param listAttacksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAttacks operation returned by the service.
     * @sample AWSShieldAsyncHandler.ListAttacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListAttacks" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAttacksResult> listAttacksAsync(ListAttacksRequest listAttacksRequest,
            com.amazonaws.handlers.AsyncHandler<ListAttacksRequest, ListAttacksResult> asyncHandler);

    /**
     * <p>
     * Retrieves <a>ProtectionGroup</a> objects for the account. You can retrieve all protection groups or you can
     * provide filtering criteria and retrieve just the subset of protection groups that match the criteria.
     * </p>
     * 
     * @param listProtectionGroupsRequest
     * @return A Java Future containing the result of the ListProtectionGroups operation returned by the service.
     * @sample AWSShieldAsync.ListProtectionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListProtectionGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListProtectionGroupsResult> listProtectionGroupsAsync(ListProtectionGroupsRequest listProtectionGroupsRequest);

    /**
     * <p>
     * Retrieves <a>ProtectionGroup</a> objects for the account. You can retrieve all protection groups or you can
     * provide filtering criteria and retrieve just the subset of protection groups that match the criteria.
     * </p>
     * 
     * @param listProtectionGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProtectionGroups operation returned by the service.
     * @sample AWSShieldAsyncHandler.ListProtectionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListProtectionGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListProtectionGroupsResult> listProtectionGroupsAsync(ListProtectionGroupsRequest listProtectionGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProtectionGroupsRequest, ListProtectionGroupsResult> asyncHandler);

    /**
     * <p>
     * Retrieves <a>Protection</a> objects for the account. You can retrieve all protections or you can provide
     * filtering criteria and retrieve just the subset of protections that match the criteria.
     * </p>
     * 
     * @param listProtectionsRequest
     * @return A Java Future containing the result of the ListProtections operation returned by the service.
     * @sample AWSShieldAsync.ListProtections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListProtections" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProtectionsResult> listProtectionsAsync(ListProtectionsRequest listProtectionsRequest);

    /**
     * <p>
     * Retrieves <a>Protection</a> objects for the account. You can retrieve all protections or you can provide
     * filtering criteria and retrieve just the subset of protections that match the criteria.
     * </p>
     * 
     * @param listProtectionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProtections operation returned by the service.
     * @sample AWSShieldAsyncHandler.ListProtections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListProtections" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListProtectionsResult> listProtectionsAsync(ListProtectionsRequest listProtectionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProtectionsRequest, ListProtectionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the resources that are included in the protection group.
     * </p>
     * 
     * @param listResourcesInProtectionGroupRequest
     * @return A Java Future containing the result of the ListResourcesInProtectionGroup operation returned by the
     *         service.
     * @sample AWSShieldAsync.ListResourcesInProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListResourcesInProtectionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesInProtectionGroupResult> listResourcesInProtectionGroupAsync(
            ListResourcesInProtectionGroupRequest listResourcesInProtectionGroupRequest);

    /**
     * <p>
     * Retrieves the resources that are included in the protection group.
     * </p>
     * 
     * @param listResourcesInProtectionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourcesInProtectionGroup operation returned by the
     *         service.
     * @sample AWSShieldAsyncHandler.ListResourcesInProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListResourcesInProtectionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesInProtectionGroupResult> listResourcesInProtectionGroupAsync(
            ListResourcesInProtectionGroupRequest listResourcesInProtectionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourcesInProtectionGroupRequest, ListResourcesInProtectionGroupResult> asyncHandler);

    /**
     * <p>
     * Gets information about Amazon Web Services tags for a specified Amazon Resource Name (ARN) in Shield.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSShieldAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Gets information about Amazon Web Services tags for a specified Amazon Resource Name (ARN) in Shield.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSShieldAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Adds or updates tags for a resource in Shield.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSShieldAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or updates tags for a resource in Shield.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSShieldAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a resource in Shield.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSShieldAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource in Shield.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSShieldAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates an existing Shield Advanced automatic application layer DDoS mitigation configuration for the specified
     * resource.
     * </p>
     * 
     * @param updateApplicationLayerAutomaticResponseRequest
     * @return A Java Future containing the result of the UpdateApplicationLayerAutomaticResponse operation returned by
     *         the service.
     * @sample AWSShieldAsync.UpdateApplicationLayerAutomaticResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateApplicationLayerAutomaticResponse"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationLayerAutomaticResponseResult> updateApplicationLayerAutomaticResponseAsync(
            UpdateApplicationLayerAutomaticResponseRequest updateApplicationLayerAutomaticResponseRequest);

    /**
     * <p>
     * Updates an existing Shield Advanced automatic application layer DDoS mitigation configuration for the specified
     * resource.
     * </p>
     * 
     * @param updateApplicationLayerAutomaticResponseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateApplicationLayerAutomaticResponse operation returned by
     *         the service.
     * @sample AWSShieldAsyncHandler.UpdateApplicationLayerAutomaticResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateApplicationLayerAutomaticResponse"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateApplicationLayerAutomaticResponseResult> updateApplicationLayerAutomaticResponseAsync(
            UpdateApplicationLayerAutomaticResponseRequest updateApplicationLayerAutomaticResponseRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateApplicationLayerAutomaticResponseRequest, UpdateApplicationLayerAutomaticResponseResult> asyncHandler);

    /**
     * <p>
     * Updates the details of the list of email addresses and phone numbers that the Shield Response Team (SRT) can use
     * to contact you if you have proactive engagement enabled, for escalations to the SRT and to initiate proactive
     * customer support.
     * </p>
     * 
     * @param updateEmergencyContactSettingsRequest
     * @return A Java Future containing the result of the UpdateEmergencyContactSettings operation returned by the
     *         service.
     * @sample AWSShieldAsync.UpdateEmergencyContactSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateEmergencyContactSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEmergencyContactSettingsResult> updateEmergencyContactSettingsAsync(
            UpdateEmergencyContactSettingsRequest updateEmergencyContactSettingsRequest);

    /**
     * <p>
     * Updates the details of the list of email addresses and phone numbers that the Shield Response Team (SRT) can use
     * to contact you if you have proactive engagement enabled, for escalations to the SRT and to initiate proactive
     * customer support.
     * </p>
     * 
     * @param updateEmergencyContactSettingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEmergencyContactSettings operation returned by the
     *         service.
     * @sample AWSShieldAsyncHandler.UpdateEmergencyContactSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateEmergencyContactSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEmergencyContactSettingsResult> updateEmergencyContactSettingsAsync(
            UpdateEmergencyContactSettingsRequest updateEmergencyContactSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEmergencyContactSettingsRequest, UpdateEmergencyContactSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates an existing protection group. A protection group is a grouping of protected resources so they can be
     * handled as a collective. This resource grouping improves the accuracy of detection and reduces false positives.
     * </p>
     * 
     * @param updateProtectionGroupRequest
     * @return A Java Future containing the result of the UpdateProtectionGroup operation returned by the service.
     * @sample AWSShieldAsync.UpdateProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateProtectionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProtectionGroupResult> updateProtectionGroupAsync(UpdateProtectionGroupRequest updateProtectionGroupRequest);

    /**
     * <p>
     * Updates an existing protection group. A protection group is a grouping of protected resources so they can be
     * handled as a collective. This resource grouping improves the accuracy of detection and reduces false positives.
     * </p>
     * 
     * @param updateProtectionGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProtectionGroup operation returned by the service.
     * @sample AWSShieldAsyncHandler.UpdateProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateProtectionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProtectionGroupResult> updateProtectionGroupAsync(UpdateProtectionGroupRequest updateProtectionGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProtectionGroupRequest, UpdateProtectionGroupResult> asyncHandler);

    /**
     * <p>
     * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty
     * parameters are not updated.
     * </p>
     * <note>
     * <p>
     * For accounts that are members of an Organizations organization, Shield Advanced subscriptions are billed against
     * the organization's payer account, regardless of whether the payer account itself is subscribed.
     * </p>
     * </note>
     * 
     * @param updateSubscriptionRequest
     * @return A Java Future containing the result of the UpdateSubscription operation returned by the service.
     * @sample AWSShieldAsync.UpdateSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriptionResult> updateSubscriptionAsync(UpdateSubscriptionRequest updateSubscriptionRequest);

    /**
     * <p>
     * Updates the details of an existing subscription. Only enter values for parameters you want to change. Empty
     * parameters are not updated.
     * </p>
     * <note>
     * <p>
     * For accounts that are members of an Organizations organization, Shield Advanced subscriptions are billed against
     * the organization's payer account, regardless of whether the payer account itself is subscribed.
     * </p>
     * </note>
     * 
     * @param updateSubscriptionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSubscription operation returned by the service.
     * @sample AWSShieldAsyncHandler.UpdateSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSubscriptionResult> updateSubscriptionAsync(UpdateSubscriptionRequest updateSubscriptionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSubscriptionRequest, UpdateSubscriptionResult> asyncHandler);

}
