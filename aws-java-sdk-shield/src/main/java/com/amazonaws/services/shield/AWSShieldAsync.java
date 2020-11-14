/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <fullname>AWS Shield Advanced</fullname>
 * <p>
 * This is the <i>AWS Shield Advanced API Reference</i>. This guide is for developers who need detailed information
 * about the AWS Shield Advanced API actions, data types, and errors. For detailed information about AWS WAF and AWS
 * Shield Advanced features and an overview of how to use the AWS WAF and AWS Shield Advanced APIs, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and AWS Shield Developer Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSShieldAsync extends AWSShield {

    /**
     * <p>
     * Authorizes the DDoS Response Team (DRT) to access the specified Amazon S3 bucket containing your AWS WAF logs.
     * You can associate up to 10 Amazon S3 buckets with your subscription.
     * </p>
     * <p>
     * To use the services of the DRT and make an <code>AssociateDRTLogBucket</code> request, you must be subscribed to
     * the <a href="https://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>.
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
     * Authorizes the DDoS Response Team (DRT) to access the specified Amazon S3 bucket containing your AWS WAF logs.
     * You can associate up to 10 Amazon S3 buckets with your subscription.
     * </p>
     * <p>
     * To use the services of the DRT and make an <code>AssociateDRTLogBucket</code> request, you must be subscribed to
     * the <a href="https://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>.
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
     * Authorizes the DDoS Response Team (DRT), using the specified role, to access your AWS account to assist with DDoS
     * attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create
     * or update AWS WAF rules and web ACLs.
     * </p>
     * <p>
     * You can associate only one <code>RoleArn</code> with your subscription. If you submit an
     * <code>AssociateDRTRole</code> request for an account that already has an associated role, the new
     * <code>RoleArn</code> will replace the existing <code>RoleArn</code>.
     * </p>
     * <p>
     * Prior to making the <code>AssociateDRTRole</code> request, you must attach the <a href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     * >AWSShieldDRTAccessPolicy</a> managed policy to the role you will specify in the request. For more information
     * see <a
     * href=" https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html">Attaching and
     * Detaching IAM Policies</a>. The role must also trust the service principal <code> drt.shield.amazonaws.com</code>
     * . For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">IAM JSON
     * Policy Elements: Principal</a>.
     * </p>
     * <p>
     * The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the
     * DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your
     * behalf. The DRT takes these actions only if explicitly authorized by you.
     * </p>
     * <p>
     * You must have the <code>iam:PassRole</code> permission to make an <code>AssociateDRTRole</code> request. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a
     * User Permissions to Pass a Role to an AWS Service</a>.
     * </p>
     * <p>
     * To use the services of the DRT and make an <code>AssociateDRTRole</code> request, you must be subscribed to the
     * <a href="https://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>.
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
     * Authorizes the DDoS Response Team (DRT), using the specified role, to access your AWS account to assist with DDoS
     * attack mitigation during potential attacks. This enables the DRT to inspect your AWS WAF configuration and create
     * or update AWS WAF rules and web ACLs.
     * </p>
     * <p>
     * You can associate only one <code>RoleArn</code> with your subscription. If you submit an
     * <code>AssociateDRTRole</code> request for an account that already has an associated role, the new
     * <code>RoleArn</code> will replace the existing <code>RoleArn</code>.
     * </p>
     * <p>
     * Prior to making the <code>AssociateDRTRole</code> request, you must attach the <a href=
     * "https://console.aws.amazon.com/iam/home?#/policies/arn:aws:iam::aws:policy/service-role/AWSShieldDRTAccessPolicy"
     * >AWSShieldDRTAccessPolicy</a> managed policy to the role you will specify in the request. For more information
     * see <a
     * href=" https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_manage-attach-detach.html">Attaching and
     * Detaching IAM Policies</a>. The role must also trust the service principal <code> drt.shield.amazonaws.com</code>
     * . For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_principal.html">IAM JSON
     * Policy Elements: Principal</a>.
     * </p>
     * <p>
     * The DRT will have access only to your AWS WAF and Shield resources. By submitting this request, you authorize the
     * DRT to inspect your AWS WAF and Shield configuration and create and update AWS WAF rules and web ACLs on your
     * behalf. The DRT takes these actions only if explicitly authorized by you.
     * </p>
     * <p>
     * You must have the <code>iam:PassRole</code> permission to make an <code>AssociateDRTRole</code> request. For more
     * information, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a
     * User Permissions to Pass a Role to an AWS Service</a>.
     * </p>
     * <p>
     * To use the services of the DRT and make an <code>AssociateDRTRole</code> request, you must be subscribed to the
     * <a href="https://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>.
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
     * detection uses the health of your AWS resource to improve responsiveness and accuracy in attack detection and
     * mitigation.
     * </p>
     * <p>
     * You define the health check in Route 53 and then associate it with your Shield Advanced protection. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-overview.html#ddos-advanced-health-check-option"
     * >Shield Advanced Health-Based Detection</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and AWS Shield Developer Guide</a>.
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
     * detection uses the health of your AWS resource to improve responsiveness and accuracy in attack detection and
     * mitigation.
     * </p>
     * <p>
     * You define the health check in Route 53 and then associate it with your Shield Advanced protection. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-overview.html#ddos-advanced-health-check-option"
     * >Shield Advanced Health-Based Detection</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and AWS Shield Developer Guide</a>.
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
     * Initializes proactive engagement and sets the list of contacts for the DDoS Response Team (DRT) to use. You must
     * provide at least one phone number in the emergency contact list.
     * </p>
     * <p>
     * After you have initialized proactive engagement using this call, to disable or enable proactive engagement, use
     * the calls <code>DisableProactiveEngagement</code> and <code>EnableProactiveEngagement</code>.
     * </p>
     * <note>
     * <p>
     * This call defines the list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to
     * contact you for escalations to the DRT and to initiate proactive customer support.
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
     * Initializes proactive engagement and sets the list of contacts for the DDoS Response Team (DRT) to use. You must
     * provide at least one phone number in the emergency contact list.
     * </p>
     * <p>
     * After you have initialized proactive engagement using this call, to disable or enable proactive engagement, use
     * the calls <code>DisableProactiveEngagement</code> and <code>EnableProactiveEngagement</code>.
     * </p>
     * <note>
     * <p>
     * This call defines the list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to
     * contact you for escalations to the DRT and to initiate proactive customer support.
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
     * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution,
     * Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route
     * 53 hosted zone.
     * </p>
     * <p>
     * You can add protection to only a single resource with each CreateProtection request. If you want to add
     * protection to multiple resources at once, use the <a href="https://console.aws.amazon.com/waf/">AWS WAF
     * console</a>. For more information see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/getting-started-ddos.html">Getting Started with AWS
     * Shield Advanced</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/configure-new-protection.html">Add AWS Shield
     * Advanced Protection to more AWS Resources</a>.
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
     * Enables AWS Shield Advanced for a specific AWS resource. The resource can be an Amazon CloudFront distribution,
     * Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route
     * 53 hosted zone.
     * </p>
     * <p>
     * You can add protection to only a single resource with each CreateProtection request. If you want to add
     * protection to multiple resources at once, use the <a href="https://console.aws.amazon.com/waf/">AWS WAF
     * console</a>. For more information see <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/getting-started-ddos.html">Getting Started with AWS
     * Shield Advanced</a> and <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/configure-new-protection.html">Add AWS Shield
     * Advanced Protection to more AWS Resources</a>.
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
     * Activates AWS Shield Advanced for an account.
     * </p>
     * <p>
     * When you initally create a subscription, your subscription is set to be automatically renewed at the end of the
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
     * Activates AWS Shield Advanced for an account.
     * </p>
     * <p>
     * When you initally create a subscription, your subscription is set to be automatically renewed at the end of the
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
     * Deletes an AWS Shield Advanced <a>Protection</a>.
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
     * Deletes an AWS Shield Advanced <a>Protection</a>.
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
     * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a 1-year subscription commitment. You
     * cannot delete a subscription prior to the completion of that commitment.
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
     * Removes AWS Shield Advanced from an account. AWS Shield Advanced requires a 1-year subscription commitment. You
     * cannot delete a subscription prior to the completion of that commitment.
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
     * Provides information about the number and type of attacks AWS Shield has detected in the last year for all
     * resources that belong to your account, regardless of whether you've defined Shield protections for them. This
     * operation is available to Shield customers as well as to Shield Advanced customers.
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
     * Provides information about the number and type of attacks AWS Shield has detected in the last year for all
     * resources that belong to your account, regardless of whether you've defined Shield protections for them. This
     * operation is available to Shield customers as well as to Shield Advanced customers.
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
     * Returns the current role and list of Amazon S3 log buckets used by the DDoS Response Team (DRT) to access your
     * AWS account while assisting with attack mitigation.
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
     * Returns the current role and list of Amazon S3 log buckets used by the DDoS Response Team (DRT) to access your
     * AWS account while assisting with attack mitigation.
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
     * A list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you if you have
     * proactive engagement enabled, for escalations to the DRT and to initiate proactive customer support.
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
     * A list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to contact you if you have
     * proactive engagement enabled, for escalations to the DRT and to initiate proactive customer support.
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
     * Provides details about the AWS Shield Advanced subscription for an account.
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
     * Provides details about the AWS Shield Advanced subscription for an account.
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
     * Removes authorization from the DDoS Response Team (DRT) to notify contacts about escalations to the DRT and to
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
     * Removes authorization from the DDoS Response Team (DRT) to notify contacts about escalations to the DRT and to
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
     * Removes the DDoS Response Team's (DRT) access to the specified Amazon S3 bucket containing your AWS WAF logs.
     * </p>
     * <p>
     * To make a <code>DisassociateDRTLogBucket</code> request, you must be subscribed to the <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>. However, if you are
     * not subscribed to one of these support plans, but had been previously and had granted the DRT access to your
     * account, you can submit a <code>DisassociateDRTLogBucket</code> request to remove this access.
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
     * Removes the DDoS Response Team's (DRT) access to the specified Amazon S3 bucket containing your AWS WAF logs.
     * </p>
     * <p>
     * To make a <code>DisassociateDRTLogBucket</code> request, you must be subscribed to the <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>. However, if you are
     * not subscribed to one of these support plans, but had been previously and had granted the DRT access to your
     * account, you can submit a <code>DisassociateDRTLogBucket</code> request to remove this access.
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
     * Removes the DDoS Response Team's (DRT) access to your AWS account.
     * </p>
     * <p>
     * To make a <code>DisassociateDRTRole</code> request, you must be subscribed to the <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>. However, if you are
     * not subscribed to one of these support plans, but had been previously and had granted the DRT access to your
     * account, you can submit a <code>DisassociateDRTRole</code> request to remove this access.
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
     * Removes the DDoS Response Team's (DRT) access to your AWS account.
     * </p>
     * <p>
     * To make a <code>DisassociateDRTRole</code> request, you must be subscribed to the <a
     * href="https://aws.amazon.com/premiumsupport/business-support/">Business Support plan</a> or the <a
     * href="https://aws.amazon.com/premiumsupport/enterprise-support/">Enterprise Support plan</a>. However, if you are
     * not subscribed to one of these support plans, but had been previously and had granted the DRT access to your
     * account, you can submit a <code>DisassociateDRTRole</code> request to remove this access.
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
     * detection uses the health of your AWS resource to improve responsiveness and accuracy in attack detection and
     * mitigation.
     * </p>
     * <p>
     * You define the health check in Route 53 and then associate or disassociate it with your Shield Advanced
     * protection. For more information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-overview.html#ddos-advanced-health-check-option"
     * >Shield Advanced Health-Based Detection</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and AWS Shield Developer Guide</a>.
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
     * detection uses the health of your AWS resource to improve responsiveness and accuracy in attack detection and
     * mitigation.
     * </p>
     * <p>
     * You define the health check in Route 53 and then associate or disassociate it with your Shield Advanced
     * protection. For more information, see <a href=
     * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-overview.html#ddos-advanced-health-check-option"
     * >Shield Advanced Health-Based Detection</a> in the <a
     * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and AWS Shield Developer Guide</a>.
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
     * Authorizes the DDoS Response Team (DRT) to use email and phone to notify contacts about escalations to the DRT
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
     * Authorizes the DDoS Response Team (DRT) to use email and phone to notify contacts about escalations to the DRT
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
     * Retrieves the <a>ProtectionGroup</a> objects for the account.
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
     * Retrieves the <a>ProtectionGroup</a> objects for the account.
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
     * Lists all <a>Protection</a> objects for the account.
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
     * Lists all <a>Protection</a> objects for the account.
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
     * Updates the details of the list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to
     * contact you if you have proactive engagement enabled, for escalations to the DRT and to initiate proactive
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
     * Updates the details of the list of email addresses and phone numbers that the DDoS Response Team (DRT) can use to
     * contact you if you have proactive engagement enabled, for escalations to the DRT and to initiate proactive
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
