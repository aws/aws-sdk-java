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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.shield.model.*;

/**
 * Interface for accessing AWS Shield.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.shield.AbstractAWSShield} instead.
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
public interface AWSShield {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "shield";

    /**
     * Overrides the default endpoint for this client ("shield.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "shield.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "shield.us-east-1.amazonaws.com"). If the protocol is not specified here, the default protocol from
     * this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "shield.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "shield.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSShield#setEndpoint(String)}, sets the regional endpoint for this client's service
     * calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

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
     * @return Result of the AssociateDRTLogBucket operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @throws NoAssociatedRoleException
     *         The ARN of the role that you specified does not exist.
     * @throws LimitsExceededException
     *         Exception that indicates that the operation would exceed a limit.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws AccessDeniedForDependencyException
     *         In order to grant the necessary access to the Shield Response Team (SRT) the user submitting the request
     *         must have the <code>iam:PassRole</code> permission. This error indicates the user did not have the
     *         appropriate permissions. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a User
     *         Permissions to Pass a Role to an Amazon Web Services Service</a>.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.AssociateDRTLogBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateDRTLogBucket" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateDRTLogBucketResult associateDRTLogBucket(AssociateDRTLogBucketRequest associateDRTLogBucketRequest);

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
     * @return Result of the AssociateDRTRole operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws AccessDeniedForDependencyException
     *         In order to grant the necessary access to the Shield Response Team (SRT) the user submitting the request
     *         must have the <code>iam:PassRole</code> permission. This error indicates the user did not have the
     *         appropriate permissions. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a User
     *         Permissions to Pass a Role to an Amazon Web Services Service</a>.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.AssociateDRTRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateDRTRole" target="_top">AWS API
     *      Documentation</a>
     */
    AssociateDRTRoleResult associateDRTRole(AssociateDRTRoleRequest associateDRTRoleRequest);

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
     * @return Result of the AssociateHealthCheck operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws LimitsExceededException
     *         Exception that indicates that the operation would exceed a limit.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws InvalidResourceException
     *         Exception that indicates that the resource is invalid. You might not have access to the resource, or the
     *         resource might not exist.
     * @sample AWSShield.AssociateHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateHealthCheck" target="_top">AWS
     *      API Documentation</a>
     */
    AssociateHealthCheckResult associateHealthCheck(AssociateHealthCheckRequest associateHealthCheckRequest);

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
     * @return Result of the AssociateProactiveEngagementDetails operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @sample AWSShield.AssociateProactiveEngagementDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/AssociateProactiveEngagementDetails"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateProactiveEngagementDetailsResult associateProactiveEngagementDetails(
            AssociateProactiveEngagementDetailsRequest associateProactiveEngagementDetailsRequest);

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
     * @return Result of the CreateProtection operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidResourceException
     *         Exception that indicates that the resource is invalid. You might not have access to the resource, or the
     *         resource might not exist.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @throws LimitsExceededException
     *         Exception that indicates that the operation would exceed a limit.
     * @throws ResourceAlreadyExistsException
     *         Exception indicating the specified resource already exists. If available, this exception includes details
     *         in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @sample AWSShield.CreateProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/CreateProtection" target="_top">AWS API
     *      Documentation</a>
     */
    CreateProtectionResult createProtection(CreateProtectionRequest createProtectionRequest);

    /**
     * <p>
     * Creates a grouping of protected resources so they can be handled as a collective. This resource grouping improves
     * the accuracy of detection and reduces false positives.
     * </p>
     * 
     * @param createProtectionGroupRequest
     * @return Result of the CreateProtectionGroup operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceAlreadyExistsException
     *         Exception indicating the specified resource already exists. If available, this exception includes details
     *         in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws LimitsExceededException
     *         Exception that indicates that the operation would exceed a limit.
     * @sample AWSShield.CreateProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/CreateProtectionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateProtectionGroupResult createProtectionGroup(CreateProtectionGroupRequest createProtectionGroupRequest);

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
     * @return Result of the CreateSubscription operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceAlreadyExistsException
     *         Exception indicating the specified resource already exists. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.CreateSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/CreateSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSubscriptionResult createSubscription(CreateSubscriptionRequest createSubscriptionRequest);

    /**
     * <p>
     * Deletes an Shield Advanced <a>Protection</a>.
     * </p>
     * 
     * @param deleteProtectionRequest
     * @return Result of the DeleteProtection operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @sample AWSShield.DeleteProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DeleteProtection" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteProtectionResult deleteProtection(DeleteProtectionRequest deleteProtectionRequest);

    /**
     * <p>
     * Removes the specified protection group.
     * </p>
     * 
     * @param deleteProtectionGroupRequest
     * @return Result of the DeleteProtectionGroup operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.DeleteProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DeleteProtectionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteProtectionGroupResult deleteProtectionGroup(DeleteProtectionGroupRequest deleteProtectionGroupRequest);

    /**
     * <p>
     * Removes Shield Advanced from an account. Shield Advanced requires a 1-year subscription commitment. You cannot
     * delete a subscription prior to the completion of that commitment.
     * </p>
     * 
     * @param deleteSubscriptionRequest
     * @return Result of the DeleteSubscription operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws LockedSubscriptionException
     *         You are trying to update a subscription that has not yet completed the 1-year commitment. You can change
     *         the <code>AutoRenew</code> parameter during the last 30 days of your subscription. This exception
     *         indicates that you are attempting to change <code>AutoRenew</code> prior to that period.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.DeleteSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DeleteSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    @Deprecated
    DeleteSubscriptionResult deleteSubscription(DeleteSubscriptionRequest deleteSubscriptionRequest);

    /**
     * <p>
     * Describes the details of a DDoS attack.
     * </p>
     * 
     * @param describeAttackRequest
     * @return Result of the DescribeAttack operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws AccessDeniedException
     *         Exception that indicates the specified <code>AttackId</code> does not exist, or the requester does not
     *         have the appropriate permissions to access the <code>AttackId</code>.
     * @sample AWSShield.DescribeAttack
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeAttack" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAttackResult describeAttack(DescribeAttackRequest describeAttackRequest);

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
     * @return Result of the DescribeAttackStatistics operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @sample AWSShield.DescribeAttackStatistics
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeAttackStatistics"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeAttackStatisticsResult describeAttackStatistics(DescribeAttackStatisticsRequest describeAttackStatisticsRequest);

    /**
     * <p>
     * Returns the current role and list of Amazon S3 log buckets used by the Shield Response Team (SRT) to access your
     * Amazon Web Services account while assisting with attack mitigation.
     * </p>
     * 
     * @param describeDRTAccessRequest
     * @return Result of the DescribeDRTAccess operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.DescribeDRTAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeDRTAccess" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeDRTAccessResult describeDRTAccess(DescribeDRTAccessRequest describeDRTAccessRequest);

    /**
     * <p>
     * A list of email addresses and phone numbers that the Shield Response Team (SRT) can use to contact you if you
     * have proactive engagement enabled, for escalations to the SRT and to initiate proactive customer support.
     * </p>
     * 
     * @param describeEmergencyContactSettingsRequest
     * @return Result of the DescribeEmergencyContactSettings operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.DescribeEmergencyContactSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeEmergencyContactSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEmergencyContactSettingsResult describeEmergencyContactSettings(DescribeEmergencyContactSettingsRequest describeEmergencyContactSettingsRequest);

    /**
     * <p>
     * Lists the details of a <a>Protection</a> object.
     * </p>
     * 
     * @param describeProtectionRequest
     * @return Result of the DescribeProtection operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.DescribeProtection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeProtection" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeProtectionResult describeProtection(DescribeProtectionRequest describeProtectionRequest);

    /**
     * <p>
     * Returns the specification for the specified protection group.
     * </p>
     * 
     * @param describeProtectionGroupRequest
     * @return Result of the DescribeProtectionGroup operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.DescribeProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeProtectionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeProtectionGroupResult describeProtectionGroup(DescribeProtectionGroupRequest describeProtectionGroupRequest);

    /**
     * <p>
     * Provides details about the Shield Advanced subscription for an account.
     * </p>
     * 
     * @param describeSubscriptionRequest
     * @return Result of the DescribeSubscription operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.DescribeSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DescribeSubscription" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeSubscriptionResult describeSubscription(DescribeSubscriptionRequest describeSubscriptionRequest);

    /**
     * <p>
     * Disable the Shield Advanced automatic application layer DDoS mitigation feature for the protected resource. This
     * stops Shield Advanced from creating, verifying, and applying WAF rules for attacks that it detects for the
     * resource.
     * </p>
     * 
     * @param disableApplicationLayerAutomaticResponseRequest
     * @return Result of the DisableApplicationLayerAutomaticResponse operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @sample AWSShield.DisableApplicationLayerAutomaticResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisableApplicationLayerAutomaticResponse"
     *      target="_top">AWS API Documentation</a>
     */
    DisableApplicationLayerAutomaticResponseResult disableApplicationLayerAutomaticResponse(
            DisableApplicationLayerAutomaticResponseRequest disableApplicationLayerAutomaticResponseRequest);

    /**
     * <p>
     * Removes authorization from the Shield Response Team (SRT) to notify contacts about escalations to the SRT and to
     * initiate proactive customer support.
     * </p>
     * 
     * @param disableProactiveEngagementRequest
     * @return Result of the DisableProactiveEngagement operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @sample AWSShield.DisableProactiveEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisableProactiveEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    DisableProactiveEngagementResult disableProactiveEngagement(DisableProactiveEngagementRequest disableProactiveEngagementRequest);

    /**
     * <p>
     * Removes the Shield Response Team's (SRT) access to the specified Amazon S3 bucket containing the logs that you
     * shared previously.
     * </p>
     * 
     * @param disassociateDRTLogBucketRequest
     * @return Result of the DisassociateDRTLogBucket operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @throws NoAssociatedRoleException
     *         The ARN of the role that you specified does not exist.
     * @throws AccessDeniedForDependencyException
     *         In order to grant the necessary access to the Shield Response Team (SRT) the user submitting the request
     *         must have the <code>iam:PassRole</code> permission. This error indicates the user did not have the
     *         appropriate permissions. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_use_passrole.html">Granting a User
     *         Permissions to Pass a Role to an Amazon Web Services Service</a>.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.DisassociateDRTLogBucket
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisassociateDRTLogBucket"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateDRTLogBucketResult disassociateDRTLogBucket(DisassociateDRTLogBucketRequest disassociateDRTLogBucketRequest);

    /**
     * <p>
     * Removes the Shield Response Team's (SRT) access to your Amazon Web Services account.
     * </p>
     * 
     * @param disassociateDRTRoleRequest
     * @return Result of the DisassociateDRTRole operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.DisassociateDRTRole
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisassociateDRTRole" target="_top">AWS API
     *      Documentation</a>
     */
    DisassociateDRTRoleResult disassociateDRTRole(DisassociateDRTRoleRequest disassociateDRTRoleRequest);

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
     * @return Result of the DisassociateHealthCheck operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws InvalidResourceException
     *         Exception that indicates that the resource is invalid. You might not have access to the resource, or the
     *         resource might not exist.
     * @sample AWSShield.DisassociateHealthCheck
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/DisassociateHealthCheck" target="_top">AWS
     *      API Documentation</a>
     */
    DisassociateHealthCheckResult disassociateHealthCheck(DisassociateHealthCheckRequest disassociateHealthCheckRequest);

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
     * @return Result of the EnableApplicationLayerAutomaticResponse operation returned by the service.
     * @throws LimitsExceededException
     *         Exception that indicates that the operation would exceed a limit.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @sample AWSShield.EnableApplicationLayerAutomaticResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/EnableApplicationLayerAutomaticResponse"
     *      target="_top">AWS API Documentation</a>
     */
    EnableApplicationLayerAutomaticResponseResult enableApplicationLayerAutomaticResponse(
            EnableApplicationLayerAutomaticResponseRequest enableApplicationLayerAutomaticResponseRequest);

    /**
     * <p>
     * Authorizes the Shield Response Team (SRT) to use email and phone to notify contacts about escalations to the SRT
     * and to initiate proactive customer support.
     * </p>
     * 
     * @param enableProactiveEngagementRequest
     * @return Result of the EnableProactiveEngagement operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @sample AWSShield.EnableProactiveEngagement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/EnableProactiveEngagement"
     *      target="_top">AWS API Documentation</a>
     */
    EnableProactiveEngagementResult enableProactiveEngagement(EnableProactiveEngagementRequest enableProactiveEngagementRequest);

    /**
     * <p>
     * Returns the <code>SubscriptionState</code>, either <code>Active</code> or <code>Inactive</code>.
     * </p>
     * 
     * @param getSubscriptionStateRequest
     * @return Result of the GetSubscriptionState operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @sample AWSShield.GetSubscriptionState
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/GetSubscriptionState" target="_top">AWS
     *      API Documentation</a>
     */
    GetSubscriptionStateResult getSubscriptionState(GetSubscriptionStateRequest getSubscriptionStateRequest);

    /**
     * <p>
     * Returns all ongoing DDoS attacks or all DDoS attacks during a specified time period.
     * </p>
     * 
     * @param listAttacksRequest
     * @return Result of the ListAttacks operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @sample AWSShield.ListAttacks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListAttacks" target="_top">AWS API
     *      Documentation</a>
     */
    ListAttacksResult listAttacks(ListAttacksRequest listAttacksRequest);

    /**
     * <p>
     * Retrieves <a>ProtectionGroup</a> objects for the account. You can retrieve all protection groups or you can
     * provide filtering criteria and retrieve just the subset of protection groups that match the criteria.
     * </p>
     * 
     * @param listProtectionGroupsRequest
     * @return Result of the ListProtectionGroups operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws InvalidPaginationTokenException
     *         Exception that indicates that the <code>NextToken</code> specified in the request is invalid. Submit the
     *         request using the <code>NextToken</code> value that was returned in the prior response.
     * @sample AWSShield.ListProtectionGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListProtectionGroups" target="_top">AWS
     *      API Documentation</a>
     */
    ListProtectionGroupsResult listProtectionGroups(ListProtectionGroupsRequest listProtectionGroupsRequest);

    /**
     * <p>
     * Retrieves <a>Protection</a> objects for the account. You can retrieve all protections or you can provide
     * filtering criteria and retrieve just the subset of protections that match the criteria.
     * </p>
     * 
     * @param listProtectionsRequest
     * @return Result of the ListProtections operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws InvalidPaginationTokenException
     *         Exception that indicates that the <code>NextToken</code> specified in the request is invalid. Submit the
     *         request using the <code>NextToken</code> value that was returned in the prior response.
     * @sample AWSShield.ListProtections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListProtections" target="_top">AWS API
     *      Documentation</a>
     */
    ListProtectionsResult listProtections(ListProtectionsRequest listProtectionsRequest);

    /**
     * <p>
     * Retrieves the resources that are included in the protection group.
     * </p>
     * 
     * @param listResourcesInProtectionGroupRequest
     * @return Result of the ListResourcesInProtectionGroup operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws InvalidPaginationTokenException
     *         Exception that indicates that the <code>NextToken</code> specified in the request is invalid. Submit the
     *         request using the <code>NextToken</code> value that was returned in the prior response.
     * @sample AWSShield.ListResourcesInProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListResourcesInProtectionGroup"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourcesInProtectionGroupResult listResourcesInProtectionGroup(ListResourcesInProtectionGroupRequest listResourcesInProtectionGroupRequest);

    /**
     * <p>
     * Gets information about Amazon Web Services tags for a specified Amazon Resource Name (ARN) in Shield.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidResourceException
     *         Exception that indicates that the resource is invalid. You might not have access to the resource, or the
     *         resource might not exist.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/ListTagsForResource" target="_top">AWS API
     *      Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Adds or updates tags for a resource in Shield.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidResourceException
     *         Exception that indicates that the resource is invalid. You might not have access to the resource, or the
     *         resource might not exist.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a resource in Shield.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidResourceException
     *         Exception that indicates that the resource is invalid. You might not have access to the resource, or the
     *         resource might not exist.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates an existing Shield Advanced automatic application layer DDoS mitigation configuration for the specified
     * resource.
     * </p>
     * 
     * @param updateApplicationLayerAutomaticResponseRequest
     * @return Result of the UpdateApplicationLayerAutomaticResponse operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws InvalidOperationException
     *         Exception that indicates that the operation would not cause any change to occur.
     * @sample AWSShield.UpdateApplicationLayerAutomaticResponse
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateApplicationLayerAutomaticResponse"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateApplicationLayerAutomaticResponseResult updateApplicationLayerAutomaticResponse(
            UpdateApplicationLayerAutomaticResponseRequest updateApplicationLayerAutomaticResponseRequest);

    /**
     * <p>
     * Updates the details of the list of email addresses and phone numbers that the Shield Response Team (SRT) can use
     * to contact you if you have proactive engagement enabled, for escalations to the SRT and to initiate proactive
     * customer support.
     * </p>
     * 
     * @param updateEmergencyContactSettingsRequest
     * @return Result of the UpdateEmergencyContactSettings operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @sample AWSShield.UpdateEmergencyContactSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateEmergencyContactSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEmergencyContactSettingsResult updateEmergencyContactSettings(UpdateEmergencyContactSettingsRequest updateEmergencyContactSettingsRequest);

    /**
     * <p>
     * Updates an existing protection group. A protection group is a grouping of protected resources so they can be
     * handled as a collective. This resource grouping improves the accuracy of detection and reduces false positives.
     * </p>
     * 
     * @param updateProtectionGroupRequest
     * @return Result of the UpdateProtectionGroup operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @sample AWSShield.UpdateProtectionGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateProtectionGroup" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateProtectionGroupResult updateProtectionGroup(UpdateProtectionGroupRequest updateProtectionGroupRequest);

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
     * @return Result of the UpdateSubscription operation returned by the service.
     * @throws InternalErrorException
     *         Exception that indicates that a problem occurred with the service infrastructure. You can retry the
     *         request.
     * @throws LockedSubscriptionException
     *         You are trying to update a subscription that has not yet completed the 1-year commitment. You can change
     *         the <code>AutoRenew</code> parameter during the last 30 days of your subscription. This exception
     *         indicates that you are attempting to change <code>AutoRenew</code> prior to that period.
     * @throws ResourceNotFoundException
     *         Exception indicating the specified resource does not exist. If available, this exception includes details
     *         in additional properties.
     * @throws InvalidParameterException
     *         Exception that indicates that the parameters passed to the API are invalid. If available, this exception
     *         includes details in additional properties.
     * @throws OptimisticLockException
     *         Exception that indicates that the resource state has been modified by another client. Retrieve the
     *         resource and then retry your request.
     * @sample AWSShield.UpdateSubscription
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/shield-2016-06-02/UpdateSubscription" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSubscriptionResult updateSubscription(UpdateSubscriptionRequest updateSubscriptionRequest);

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
