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
package com.amazonaws.services.securityhub;

import javax.annotation.Generated;

import com.amazonaws.services.securityhub.model.*;

/**
 * Interface for accessing AWS SecurityHub asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.securityhub.AbstractAWSSecurityHubAsync} instead.
 * </p>
 * <p>
 * <p>
 * Security Hub provides you with a comprehensive view of your security state in Amazon Web Services and helps you
 * assess your Amazon Web Services environment against security industry standards and best practices.
 * </p>
 * <p>
 * Security Hub collects security data across Amazon Web Services accounts, Amazon Web Services, and supported
 * third-party products and helps you analyze your security trends and identify the highest priority security issues.
 * </p>
 * <p>
 * To help you manage the security state of your organization, Security Hub supports multiple security standards. These
 * include the Amazon Web Services Foundational Security Best Practices (FSBP) standard developed by Amazon Web
 * Services, and external compliance frameworks such as the Center for Internet Security (CIS), the Payment Card
 * Industry Data Security Standard (PCI DSS), and the National Institute of Standards and Technology (NIST). Each
 * standard includes several security controls, each of which represents a security best practice. Security Hub runs
 * checks against security controls and generates control findings to help you assess your compliance against security
 * best practices.
 * </p>
 * <p>
 * In addition to generating control findings, Security Hub also receives findings from other Amazon Web Services, such
 * as Amazon GuardDuty and Amazon Inspector, and supported third-party products. This gives you a single pane of glass
 * into a variety of security-related issues. You can also send Security Hub findings to other Amazon Web Services and
 * supported third-party products.
 * </p>
 * <p>
 * Security Hub offers automation features that help you triage and remediate security issues. For example, you can use
 * automation rules to automatically update critical findings when a security check fails. You can also leverage the
 * integration with Amazon EventBridge to trigger automatic responses to specific findings.
 * </p>
 * <p>
 * This guide, the <i>Security Hub API Reference</i>, provides information about the Security Hub API. This includes
 * supported resources, HTTP methods, parameters, and schemas. If you're new to Security Hub, you might find it helpful
 * to also review the <a href="https://docs.aws.amazon.com/securityhub/latest/userguide/what-is-securityhub.html">
 * <i>Security Hub User Guide</i> </a>. The user guide explains key concepts and provides procedures that demonstrate
 * how to use Security Hub features. It also provides information about topics such as integrating Security Hub with
 * other Amazon Web Services.
 * </p>
 * <p>
 * In addition to interacting with Security Hub by making calls to the Security Hub API, you can use a current version
 * of an Amazon Web Services command line tool or SDK. Amazon Web Services provides tools and SDKs that consist of
 * libraries and sample code for various languages and platforms, such as PowerShell, Java, Go, Python, C++, and .NET.
 * These tools and SDKs provide convenient, programmatic access to Security Hub and other Amazon Web Services . They
 * also handle tasks such as signing requests, managing errors, and retrying requests automatically. For information
 * about installing and using the Amazon Web Services tools and SDKs, see <a
 * href="http://aws.amazon.com/developer/tools/">Tools to Build on Amazon Web Services</a>.
 * </p>
 * <p>
 * With the exception of operations that are related to central configuration, Security Hub API requests are executed
 * only in the Amazon Web Services Region that is currently active or in the specific Amazon Web Services Region that
 * you specify in your request. Any configuration or settings change that results from the operation is applied only to
 * that Region. To make the same change in other Regions, call the same API operation in each Region in which you want
 * to apply the change. When you use central configuration, API requests for enabling Security Hub, standards, and
 * controls are executed in the home Region and all linked Regions. For a list of central configuration operations, see
 * the <a href=
 * "https://docs.aws.amazon.com/securityhub/latest/userguide/central-configuration-intro.html#central-configuration-concepts"
 * >Central configuration terms and concepts</a> section of the <i>Security Hub User Guide</i>.
 * </p>
 * <p>
 * The following throttling limits apply to Security Hub API operations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>BatchEnableStandards</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 1
 * request per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>GetFindings</code> - <code>RateLimit</code> of 3 requests per second. <code>BurstLimit</code> of 6 requests per
 * second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchImportFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30
 * requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>BatchUpdateFindings</code> - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30
 * requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>UpdateStandardsControl</code> - <code>RateLimit</code> of 1 request per second. <code>BurstLimit</code> of 5
 * requests per second.
 * </p>
 * </li>
 * <li>
 * <p>
 * All other operations - <code>RateLimit</code> of 10 requests per second. <code>BurstLimit</code> of 30 requests per
 * second.
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSecurityHubAsync extends AWSSecurityHub {

    /**
     * <p>
     * Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the
     * invitation was sent from.
     * </p>
     * <p>
     * This operation is only used by member accounts that are not added through Organizations.
     * </p>
     * <p>
     * When the member account accepts the invitation, permission is granted to the administrator account to view
     * findings generated in the member account.
     * </p>
     * 
     * @param acceptAdministratorInvitationRequest
     * @return A Java Future containing the result of the AcceptAdministratorInvitation operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.AcceptAdministratorInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptAdministratorInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptAdministratorInvitationResult> acceptAdministratorInvitationAsync(
            AcceptAdministratorInvitationRequest acceptAdministratorInvitationRequest);

    /**
     * <p>
     * Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the
     * invitation was sent from.
     * </p>
     * <p>
     * This operation is only used by member accounts that are not added through Organizations.
     * </p>
     * <p>
     * When the member account accepts the invitation, permission is granted to the administrator account to view
     * findings generated in the member account.
     * </p>
     * 
     * @param acceptAdministratorInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptAdministratorInvitation operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.AcceptAdministratorInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptAdministratorInvitation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AcceptAdministratorInvitationResult> acceptAdministratorInvitationAsync(
            AcceptAdministratorInvitationRequest acceptAdministratorInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptAdministratorInvitationRequest, AcceptAdministratorInvitationResult> asyncHandler);

    /**
     * <p>
     * This method is deprecated. Instead, use <code>AcceptAdministratorInvitation</code>.
     * </p>
     * <p>
     * The Security Hub console continues to use <code>AcceptInvitation</code>. It will eventually change to use
     * <code>AcceptAdministratorInvitation</code>. Any IAM policies that specifically control access to this function
     * must continue to use <code>AcceptInvitation</code>. You should also add
     * <code>AcceptAdministratorInvitation</code> to your policies to ensure that the correct permissions are in place
     * after the console begins to use <code>AcceptAdministratorInvitation</code>.
     * </p>
     * <p>
     * Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the
     * invitation was sent from.
     * </p>
     * <p>
     * This operation is only used by member accounts that are not added through Organizations.
     * </p>
     * <p>
     * When the member account accepts the invitation, permission is granted to the administrator account to view
     * findings generated in the member account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AWSSecurityHubAsync.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptInvitation" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest);

    /**
     * <p>
     * This method is deprecated. Instead, use <code>AcceptAdministratorInvitation</code>.
     * </p>
     * <p>
     * The Security Hub console continues to use <code>AcceptInvitation</code>. It will eventually change to use
     * <code>AcceptAdministratorInvitation</code>. Any IAM policies that specifically control access to this function
     * must continue to use <code>AcceptInvitation</code>. You should also add
     * <code>AcceptAdministratorInvitation</code> to your policies to ensure that the correct permissions are in place
     * after the console begins to use <code>AcceptAdministratorInvitation</code>.
     * </p>
     * <p>
     * Accepts the invitation to be a member account and be monitored by the Security Hub administrator account that the
     * invitation was sent from.
     * </p>
     * <p>
     * This operation is only used by member accounts that are not added through Organizations.
     * </p>
     * <p>
     * When the member account accepts the invitation, permission is granted to the administrator account to view
     * findings generated in the member account.
     * </p>
     * 
     * @param acceptInvitationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptInvitation operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.AcceptInvitation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AcceptInvitation" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest acceptInvitationRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptInvitationRequest, AcceptInvitationResult> asyncHandler);

    /**
     * <p>
     * Deletes one or more automation rules.
     * </p>
     * 
     * @param batchDeleteAutomationRulesRequest
     * @return A Java Future containing the result of the BatchDeleteAutomationRules operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchDeleteAutomationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDeleteAutomationRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteAutomationRulesResult> batchDeleteAutomationRulesAsync(
            BatchDeleteAutomationRulesRequest batchDeleteAutomationRulesRequest);

    /**
     * <p>
     * Deletes one or more automation rules.
     * </p>
     * 
     * @param batchDeleteAutomationRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDeleteAutomationRules operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchDeleteAutomationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDeleteAutomationRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDeleteAutomationRulesResult> batchDeleteAutomationRulesAsync(
            BatchDeleteAutomationRulesRequest batchDeleteAutomationRulesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDeleteAutomationRulesRequest, BatchDeleteAutomationRulesResult> asyncHandler);

    /**
     * <p>
     * Disables the standards specified by the provided <code>StandardsSubscriptionArns</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html">Security Standards</a>
     * section of the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchDisableStandardsRequest
     * @return A Java Future containing the result of the BatchDisableStandards operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchDisableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDisableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisableStandardsResult> batchDisableStandardsAsync(BatchDisableStandardsRequest batchDisableStandardsRequest);

    /**
     * <p>
     * Disables the standards specified by the provided <code>StandardsSubscriptionArns</code>.
     * </p>
     * <p>
     * For more information, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html">Security Standards</a>
     * section of the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchDisableStandardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDisableStandards operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchDisableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchDisableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDisableStandardsResult> batchDisableStandardsAsync(BatchDisableStandardsRequest batchDisableStandardsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDisableStandardsRequest, BatchDisableStandardsResult> asyncHandler);

    /**
     * <p>
     * Enables the standards specified by the provided <code>StandardsArn</code>. To obtain the ARN for a standard, use
     * the <code>DescribeStandards</code> operation.
     * </p>
     * <p>
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html">Security Standards</a>
     * section of the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchEnableStandardsRequest
     * @return A Java Future containing the result of the BatchEnableStandards operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchEnableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchEnableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchEnableStandardsResult> batchEnableStandardsAsync(BatchEnableStandardsRequest batchEnableStandardsRequest);

    /**
     * <p>
     * Enables the standards specified by the provided <code>StandardsArn</code>. To obtain the ARN for a standard, use
     * the <code>DescribeStandards</code> operation.
     * </p>
     * <p>
     * For more information, see the <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-standards.html">Security Standards</a>
     * section of the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchEnableStandardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchEnableStandards operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchEnableStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchEnableStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchEnableStandardsResult> batchEnableStandardsAsync(BatchEnableStandardsRequest batchEnableStandardsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchEnableStandardsRequest, BatchEnableStandardsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a list of details for automation rules based on rule Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param batchGetAutomationRulesRequest
     * @return A Java Future containing the result of the BatchGetAutomationRules operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchGetAutomationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetAutomationRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetAutomationRulesResult> batchGetAutomationRulesAsync(BatchGetAutomationRulesRequest batchGetAutomationRulesRequest);

    /**
     * <p>
     * Retrieves a list of details for automation rules based on rule Amazon Resource Names (ARNs).
     * </p>
     * 
     * @param batchGetAutomationRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetAutomationRules operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchGetAutomationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetAutomationRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetAutomationRulesResult> batchGetAutomationRulesAsync(BatchGetAutomationRulesRequest batchGetAutomationRulesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetAutomationRulesRequest, BatchGetAutomationRulesResult> asyncHandler);

    /**
     * <p>
     * Returns associations between an Security Hub configuration and a batch of target accounts, organizational units,
     * or the root. Only the Security Hub delegated administrator can invoke this operation from the home Region. A
     * configuration can refer to a configuration policy or to a self-managed configuration.
     * </p>
     * 
     * @param batchGetConfigurationPolicyAssociationsRequest
     * @return A Java Future containing the result of the BatchGetConfigurationPolicyAssociations operation returned by
     *         the service.
     * @sample AWSSecurityHubAsync.BatchGetConfigurationPolicyAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetConfigurationPolicyAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetConfigurationPolicyAssociationsResult> batchGetConfigurationPolicyAssociationsAsync(
            BatchGetConfigurationPolicyAssociationsRequest batchGetConfigurationPolicyAssociationsRequest);

    /**
     * <p>
     * Returns associations between an Security Hub configuration and a batch of target accounts, organizational units,
     * or the root. Only the Security Hub delegated administrator can invoke this operation from the home Region. A
     * configuration can refer to a configuration policy or to a self-managed configuration.
     * </p>
     * 
     * @param batchGetConfigurationPolicyAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetConfigurationPolicyAssociations operation returned by
     *         the service.
     * @sample AWSSecurityHubAsyncHandler.BatchGetConfigurationPolicyAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetConfigurationPolicyAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetConfigurationPolicyAssociationsResult> batchGetConfigurationPolicyAssociationsAsync(
            BatchGetConfigurationPolicyAssociationsRequest batchGetConfigurationPolicyAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetConfigurationPolicyAssociationsRequest, BatchGetConfigurationPolicyAssociationsResult> asyncHandler);

    /**
     * <p>
     * Provides details about a batch of security controls for the current Amazon Web Services account and Amazon Web
     * Services Region.
     * </p>
     * 
     * @param batchGetSecurityControlsRequest
     * @return A Java Future containing the result of the BatchGetSecurityControls operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchGetSecurityControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetSecurityControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetSecurityControlsResult> batchGetSecurityControlsAsync(BatchGetSecurityControlsRequest batchGetSecurityControlsRequest);

    /**
     * <p>
     * Provides details about a batch of security controls for the current Amazon Web Services account and Amazon Web
     * Services Region.
     * </p>
     * 
     * @param batchGetSecurityControlsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetSecurityControls operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchGetSecurityControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetSecurityControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetSecurityControlsResult> batchGetSecurityControlsAsync(BatchGetSecurityControlsRequest batchGetSecurityControlsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetSecurityControlsRequest, BatchGetSecurityControlsResult> asyncHandler);

    /**
     * <p>
     * For a batch of security controls and standards, identifies whether each control is currently enabled or disabled
     * in a standard.
     * </p>
     * 
     * @param batchGetStandardsControlAssociationsRequest
     * @return A Java Future containing the result of the BatchGetStandardsControlAssociations operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.BatchGetStandardsControlAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetStandardsControlAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetStandardsControlAssociationsResult> batchGetStandardsControlAssociationsAsync(
            BatchGetStandardsControlAssociationsRequest batchGetStandardsControlAssociationsRequest);

    /**
     * <p>
     * For a batch of security controls and standards, identifies whether each control is currently enabled or disabled
     * in a standard.
     * </p>
     * 
     * @param batchGetStandardsControlAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchGetStandardsControlAssociations operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.BatchGetStandardsControlAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchGetStandardsControlAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchGetStandardsControlAssociationsResult> batchGetStandardsControlAssociationsAsync(
            BatchGetStandardsControlAssociationsRequest batchGetStandardsControlAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchGetStandardsControlAssociationsRequest, BatchGetStandardsControlAssociationsResult> asyncHandler);

    /**
     * <p>
     * Imports security findings generated by a finding provider into Security Hub. This action is requested by the
     * finding provider to import its findings into Security Hub.
     * </p>
     * <p>
     * <code>BatchImportFindings</code> must be called by one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon Web Services account that is associated with a finding if you are using the <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-custom-providers.html#securityhub-custom-providers-bfi-reqs"
     * >default product ARN</a> or are a partner sending findings from within a customer's Amazon Web Services account.
     * In these cases, the identifier of the account that you are calling <code>BatchImportFindings</code> from needs to
     * be the same as the <code>AwsAccountId</code> attribute for the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Web Services account that Security Hub has allow-listed for an official partner integration. In this
     * case, you can call <code>BatchImportFindings</code> from the allow-listed account and send findings from
     * different customer accounts in the same batch.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The maximum allowed size for a finding is 240 Kb. An error is returned for any finding larger than 240 Kb.
     * </p>
     * <p>
     * After a finding is created, <code>BatchImportFindings</code> cannot be used to update the following finding
     * fields and objects, which Security Hub customers use to manage their investigation workflow.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Finding providers also should not use <code>BatchImportFindings</code> to update the following attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Instead, finding providers use <code>FindingProviderFields</code> to provide values for these attributes.
     * </p>
     * 
     * @param batchImportFindingsRequest
     * @return A Java Future containing the result of the BatchImportFindings operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchImportFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchImportFindings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchImportFindingsResult> batchImportFindingsAsync(BatchImportFindingsRequest batchImportFindingsRequest);

    /**
     * <p>
     * Imports security findings generated by a finding provider into Security Hub. This action is requested by the
     * finding provider to import its findings into Security Hub.
     * </p>
     * <p>
     * <code>BatchImportFindings</code> must be called by one of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The Amazon Web Services account that is associated with a finding if you are using the <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-custom-providers.html#securityhub-custom-providers-bfi-reqs"
     * >default product ARN</a> or are a partner sending findings from within a customer's Amazon Web Services account.
     * In these cases, the identifier of the account that you are calling <code>BatchImportFindings</code> from needs to
     * be the same as the <code>AwsAccountId</code> attribute for the finding.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Web Services account that Security Hub has allow-listed for an official partner integration. In this
     * case, you can call <code>BatchImportFindings</code> from the allow-listed account and send findings from
     * different customer accounts in the same batch.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The maximum allowed size for a finding is 240 Kb. An error is returned for any finding larger than 240 Kb.
     * </p>
     * <p>
     * After a finding is created, <code>BatchImportFindings</code> cannot be used to update the following finding
     * fields and objects, which Security Hub customers use to manage their investigation workflow.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Finding providers also should not use <code>BatchImportFindings</code> to update the following attributes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Instead, finding providers use <code>FindingProviderFields</code> to provide values for these attributes.
     * </p>
     * 
     * @param batchImportFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchImportFindings operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchImportFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchImportFindings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchImportFindingsResult> batchImportFindingsAsync(BatchImportFindingsRequest batchImportFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchImportFindingsRequest, BatchImportFindingsResult> asyncHandler);

    /**
     * <p>
     * Updates one or more automation rules based on rule Amazon Resource Names (ARNs) and input parameters.
     * </p>
     * 
     * @param batchUpdateAutomationRulesRequest
     * @return A Java Future containing the result of the BatchUpdateAutomationRules operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchUpdateAutomationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateAutomationRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateAutomationRulesResult> batchUpdateAutomationRulesAsync(
            BatchUpdateAutomationRulesRequest batchUpdateAutomationRulesRequest);

    /**
     * <p>
     * Updates one or more automation rules based on rule Amazon Resource Names (ARNs) and input parameters.
     * </p>
     * 
     * @param batchUpdateAutomationRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateAutomationRules operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchUpdateAutomationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateAutomationRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateAutomationRulesResult> batchUpdateAutomationRulesAsync(
            BatchUpdateAutomationRulesRequest batchUpdateAutomationRulesRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateAutomationRulesRequest, BatchUpdateAutomationRulesResult> asyncHandler);

    /**
     * <p>
     * Used by Security Hub customers to update information about their investigation into a finding. Requested by
     * administrator accounts or member accounts. Administrator accounts can update findings for their account and their
     * member accounts. Member accounts can update findings for their account.
     * </p>
     * <p>
     * Updates from <code>BatchUpdateFindings</code> do not affect the value of <code>UpdatedAt</code> for a finding.
     * </p>
     * <p>
     * Administrator and member accounts can use <code>BatchUpdateFindings</code> to update the following finding fields
     * and objects.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can configure IAM policies to restrict access to fields and field values. For example, you might not want
     * member accounts to be able to suppress findings or change the finding severity. See <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/finding-update-batchupdatefindings.html#batchupdatefindings-configure-access"
     * >Configuring access to BatchUpdateFindings</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchUpdateFindingsRequest
     * @return A Java Future containing the result of the BatchUpdateFindings operation returned by the service.
     * @sample AWSSecurityHubAsync.BatchUpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateFindings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateFindingsResult> batchUpdateFindingsAsync(BatchUpdateFindingsRequest batchUpdateFindingsRequest);

    /**
     * <p>
     * Used by Security Hub customers to update information about their investigation into a finding. Requested by
     * administrator accounts or member accounts. Administrator accounts can update findings for their account and their
     * member accounts. Member accounts can update findings for their account.
     * </p>
     * <p>
     * Updates from <code>BatchUpdateFindings</code> do not affect the value of <code>UpdatedAt</code> for a finding.
     * </p>
     * <p>
     * Administrator and member accounts can use <code>BatchUpdateFindings</code> to update the following finding fields
     * and objects.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Confidence</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Criticality</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Note</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RelatedFindings</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Severity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Types</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UserDefinedFields</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>VerificationState</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Workflow</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can configure IAM policies to restrict access to fields and field values. For example, you might not want
     * member accounts to be able to suppress findings or change the finding severity. See <a href=
     * "https://docs.aws.amazon.com/securityhub/latest/userguide/finding-update-batchupdatefindings.html#batchupdatefindings-configure-access"
     * >Configuring access to BatchUpdateFindings</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param batchUpdateFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateFindings operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.BatchUpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateFindings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateFindingsResult> batchUpdateFindingsAsync(BatchUpdateFindingsRequest batchUpdateFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateFindingsRequest, BatchUpdateFindingsResult> asyncHandler);

    /**
     * <p>
     * For a batch of security controls and standards, this operation updates the enablement status of a control in a
     * standard.
     * </p>
     * 
     * @param batchUpdateStandardsControlAssociationsRequest
     * @return A Java Future containing the result of the BatchUpdateStandardsControlAssociations operation returned by
     *         the service.
     * @sample AWSSecurityHubAsync.BatchUpdateStandardsControlAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateStandardsControlAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateStandardsControlAssociationsResult> batchUpdateStandardsControlAssociationsAsync(
            BatchUpdateStandardsControlAssociationsRequest batchUpdateStandardsControlAssociationsRequest);

    /**
     * <p>
     * For a batch of security controls and standards, this operation updates the enablement status of a control in a
     * standard.
     * </p>
     * 
     * @param batchUpdateStandardsControlAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchUpdateStandardsControlAssociations operation returned by
     *         the service.
     * @sample AWSSecurityHubAsyncHandler.BatchUpdateStandardsControlAssociations
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/BatchUpdateStandardsControlAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchUpdateStandardsControlAssociationsResult> batchUpdateStandardsControlAssociationsAsync(
            BatchUpdateStandardsControlAssociationsRequest batchUpdateStandardsControlAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateStandardsControlAssociationsRequest, BatchUpdateStandardsControlAssociationsResult> asyncHandler);

    /**
     * <p>
     * Creates a custom action target in Security Hub.
     * </p>
     * <p>
     * You can use custom actions on findings and insights in Security Hub to trigger target actions in Amazon
     * CloudWatch Events.
     * </p>
     * 
     * @param createActionTargetRequest
     * @return A Java Future containing the result of the CreateActionTarget operation returned by the service.
     * @sample AWSSecurityHubAsync.CreateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateActionTargetResult> createActionTargetAsync(CreateActionTargetRequest createActionTargetRequest);

    /**
     * <p>
     * Creates a custom action target in Security Hub.
     * </p>
     * <p>
     * You can use custom actions on findings and insights in Security Hub to trigger target actions in Amazon
     * CloudWatch Events.
     * </p>
     * 
     * @param createActionTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateActionTarget operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.CreateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateActionTargetResult> createActionTargetAsync(CreateActionTargetRequest createActionTargetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateActionTargetRequest, CreateActionTargetResult> asyncHandler);

    /**
     * <p>
     * Creates an automation rule based on input parameters.
     * </p>
     * 
     * @param createAutomationRuleRequest
     * @return A Java Future containing the result of the CreateAutomationRule operation returned by the service.
     * @sample AWSSecurityHubAsync.CreateAutomationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateAutomationRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAutomationRuleResult> createAutomationRuleAsync(CreateAutomationRuleRequest createAutomationRuleRequest);

    /**
     * <p>
     * Creates an automation rule based on input parameters.
     * </p>
     * 
     * @param createAutomationRuleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAutomationRule operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.CreateAutomationRule
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateAutomationRule"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateAutomationRuleResult> createAutomationRuleAsync(CreateAutomationRuleRequest createAutomationRuleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAutomationRuleRequest, CreateAutomationRuleResult> asyncHandler);

    /**
     * <p>
     * Creates a configuration policy with the defined configuration. Only the Security Hub delegated administrator can
     * invoke this operation from the home Region.
     * </p>
     * 
     * @param createConfigurationPolicyRequest
     * @return A Java Future containing the result of the CreateConfigurationPolicy operation returned by the service.
     * @sample AWSSecurityHubAsync.CreateConfigurationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateConfigurationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationPolicyResult> createConfigurationPolicyAsync(
            CreateConfigurationPolicyRequest createConfigurationPolicyRequest);

    /**
     * <p>
     * Creates a configuration policy with the defined configuration. Only the Security Hub delegated administrator can
     * invoke this operation from the home Region.
     * </p>
     * 
     * @param createConfigurationPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateConfigurationPolicy operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.CreateConfigurationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateConfigurationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateConfigurationPolicyResult> createConfigurationPolicyAsync(
            CreateConfigurationPolicyRequest createConfigurationPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateConfigurationPolicyRequest, CreateConfigurationPolicyResult> asyncHandler);

    /**
     * <p>
     * Used to enable finding aggregation. Must be called from the aggregation Region.
     * </p>
     * <p>
     * For more details about cross-Region replication, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/finding-aggregation.html">Configuring finding
     * aggregation</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param createFindingAggregatorRequest
     * @return A Java Future containing the result of the CreateFindingAggregator operation returned by the service.
     * @sample AWSSecurityHubAsync.CreateFindingAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateFindingAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFindingAggregatorResult> createFindingAggregatorAsync(CreateFindingAggregatorRequest createFindingAggregatorRequest);

    /**
     * <p>
     * Used to enable finding aggregation. Must be called from the aggregation Region.
     * </p>
     * <p>
     * For more details about cross-Region replication, see <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/finding-aggregation.html">Configuring finding
     * aggregation</a> in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param createFindingAggregatorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFindingAggregator operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.CreateFindingAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateFindingAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateFindingAggregatorResult> createFindingAggregatorAsync(CreateFindingAggregatorRequest createFindingAggregatorRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFindingAggregatorRequest, CreateFindingAggregatorResult> asyncHandler);

    /**
     * <p>
     * Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security
     * issue that requires attention or remediation.
     * </p>
     * <p>
     * To group the related findings in the insight, use the <code>GroupByAttribute</code>.
     * </p>
     * 
     * @param createInsightRequest
     * @return A Java Future containing the result of the CreateInsight operation returned by the service.
     * @sample AWSSecurityHubAsync.CreateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInsightResult> createInsightAsync(CreateInsightRequest createInsightRequest);

    /**
     * <p>
     * Creates a custom insight in Security Hub. An insight is a consolidation of findings that relate to a security
     * issue that requires attention or remediation.
     * </p>
     * <p>
     * To group the related findings in the insight, use the <code>GroupByAttribute</code>.
     * </p>
     * 
     * @param createInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInsight operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.CreateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateInsightResult> createInsightAsync(CreateInsightRequest createInsightRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInsightRequest, CreateInsightResult> asyncHandler);

    /**
     * <p>
     * Creates a member association in Security Hub between the specified accounts and the account used to make the
     * request, which is the administrator account. If you are integrated with Organizations, then the administrator
     * account is designated by the organization management account.
     * </p>
     * <p>
     * <code>CreateMembers</code> is always used to add accounts that are not organization members.
     * </p>
     * <p>
     * For accounts that are managed using Organizations, <code>CreateMembers</code> is only used in the following
     * cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Security Hub is not configured to automatically add new organization accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The account was disassociated or deleted in Security Hub.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action can only be used by an account that has Security Hub enabled. To enable Security Hub, you can use the
     * <code>EnableSecurityHub</code> operation.
     * </p>
     * <p>
     * For accounts that are not organization members, you create the account association and then send an invitation to
     * the member account. To send the invitation, you use the <code>InviteMembers</code> operation. If the account
     * owner accepts the invitation, the account becomes a member account in Security Hub.
     * </p>
     * <p>
     * Accounts that are managed using Organizations do not receive an invitation. They automatically become a member
     * account in Security Hub.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the organization account does not have Security Hub enabled, then Security Hub and the default standards are
     * automatically enabled. Note that Security Hub cannot be enabled automatically for the organization management
     * account. The organization management account must enable Security Hub before the administrator account enables it
     * as a member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * For organization accounts that already have Security Hub enabled, Security Hub does not make any other changes to
     * those accounts. It does not change their enabled standards or controls.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A permissions policy is added that permits the administrator account to view the findings generated in the member
     * account.
     * </p>
     * <p>
     * To remove the association between the administrator and member accounts, use the
     * <code>DisassociateFromMasterAccount</code> or <code>DisassociateMembers</code> operation.
     * </p>
     * 
     * @param createMembersRequest
     * @return A Java Future containing the result of the CreateMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest createMembersRequest);

    /**
     * <p>
     * Creates a member association in Security Hub between the specified accounts and the account used to make the
     * request, which is the administrator account. If you are integrated with Organizations, then the administrator
     * account is designated by the organization management account.
     * </p>
     * <p>
     * <code>CreateMembers</code> is always used to add accounts that are not organization members.
     * </p>
     * <p>
     * For accounts that are managed using Organizations, <code>CreateMembers</code> is only used in the following
     * cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Security Hub is not configured to automatically add new organization accounts.
     * </p>
     * </li>
     * <li>
     * <p>
     * The account was disassociated or deleted in Security Hub.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This action can only be used by an account that has Security Hub enabled. To enable Security Hub, you can use the
     * <code>EnableSecurityHub</code> operation.
     * </p>
     * <p>
     * For accounts that are not organization members, you create the account association and then send an invitation to
     * the member account. To send the invitation, you use the <code>InviteMembers</code> operation. If the account
     * owner accepts the invitation, the account becomes a member account in Security Hub.
     * </p>
     * <p>
     * Accounts that are managed using Organizations do not receive an invitation. They automatically become a member
     * account in Security Hub.
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the organization account does not have Security Hub enabled, then Security Hub and the default standards are
     * automatically enabled. Note that Security Hub cannot be enabled automatically for the organization management
     * account. The organization management account must enable Security Hub before the administrator account enables it
     * as a member account.
     * </p>
     * </li>
     * <li>
     * <p>
     * For organization accounts that already have Security Hub enabled, Security Hub does not make any other changes to
     * those accounts. It does not change their enabled standards or controls.
     * </p>
     * </li>
     * </ul>
     * <p>
     * A permissions policy is added that permits the administrator account to view the findings generated in the member
     * account.
     * </p>
     * <p>
     * To remove the association between the administrator and member accounts, use the
     * <code>DisassociateFromMasterAccount</code> or <code>DisassociateMembers</code> operation.
     * </p>
     * 
     * @param createMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.CreateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/CreateMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest createMembersRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMembersRequest, CreateMembersResult> asyncHandler);

    /**
     * <p>
     * Declines invitations to become a member account.
     * </p>
     * <p>
     * A prospective member account uses this operation to decline an invitation to become a member.
     * </p>
     * <p>
     * This operation is only called by member accounts that aren't part of an organization. Organization accounts don't
     * receive invitations.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @return A Java Future containing the result of the DeclineInvitations operation returned by the service.
     * @sample AWSSecurityHubAsync.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest declineInvitationsRequest);

    /**
     * <p>
     * Declines invitations to become a member account.
     * </p>
     * <p>
     * A prospective member account uses this operation to decline an invitation to become a member.
     * </p>
     * <p>
     * This operation is only called by member accounts that aren't part of an organization. Organization accounts don't
     * receive invitations.
     * </p>
     * 
     * @param declineInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeclineInvitations operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeclineInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeclineInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest declineInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeclineInvitationsRequest, DeclineInvitationsResult> asyncHandler);

    /**
     * <p>
     * Deletes a custom action target from Security Hub.
     * </p>
     * <p>
     * Deleting a custom action target does not affect any findings or insights that were already sent to Amazon
     * CloudWatch Events using the custom action.
     * </p>
     * 
     * @param deleteActionTargetRequest
     * @return A Java Future containing the result of the DeleteActionTarget operation returned by the service.
     * @sample AWSSecurityHubAsync.DeleteActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteActionTargetResult> deleteActionTargetAsync(DeleteActionTargetRequest deleteActionTargetRequest);

    /**
     * <p>
     * Deletes a custom action target from Security Hub.
     * </p>
     * <p>
     * Deleting a custom action target does not affect any findings or insights that were already sent to Amazon
     * CloudWatch Events using the custom action.
     * </p>
     * 
     * @param deleteActionTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteActionTarget operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeleteActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteActionTargetResult> deleteActionTargetAsync(DeleteActionTargetRequest deleteActionTargetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteActionTargetRequest, DeleteActionTargetResult> asyncHandler);

    /**
     * <p>
     * Deletes a configuration policy. Only the Security Hub delegated administrator can invoke this operation from the
     * home Region. For the deletion to succeed, you must first disassociate a configuration policy from target
     * accounts, organizational units, or the root by invoking the <code>StartConfigurationPolicyDisassociation</code>
     * operation.
     * </p>
     * 
     * @param deleteConfigurationPolicyRequest
     * @return A Java Future containing the result of the DeleteConfigurationPolicy operation returned by the service.
     * @sample AWSSecurityHubAsync.DeleteConfigurationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteConfigurationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationPolicyResult> deleteConfigurationPolicyAsync(
            DeleteConfigurationPolicyRequest deleteConfigurationPolicyRequest);

    /**
     * <p>
     * Deletes a configuration policy. Only the Security Hub delegated administrator can invoke this operation from the
     * home Region. For the deletion to succeed, you must first disassociate a configuration policy from target
     * accounts, organizational units, or the root by invoking the <code>StartConfigurationPolicyDisassociation</code>
     * operation.
     * </p>
     * 
     * @param deleteConfigurationPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteConfigurationPolicy operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeleteConfigurationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteConfigurationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteConfigurationPolicyResult> deleteConfigurationPolicyAsync(
            DeleteConfigurationPolicyRequest deleteConfigurationPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigurationPolicyRequest, DeleteConfigurationPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a finding aggregator. When you delete the finding aggregator, you stop finding aggregation.
     * </p>
     * <p>
     * When you stop finding aggregation, findings that were already aggregated to the aggregation Region are still
     * visible from the aggregation Region. New findings and finding updates are not aggregated.
     * </p>
     * 
     * @param deleteFindingAggregatorRequest
     * @return A Java Future containing the result of the DeleteFindingAggregator operation returned by the service.
     * @sample AWSSecurityHubAsync.DeleteFindingAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteFindingAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFindingAggregatorResult> deleteFindingAggregatorAsync(DeleteFindingAggregatorRequest deleteFindingAggregatorRequest);

    /**
     * <p>
     * Deletes a finding aggregator. When you delete the finding aggregator, you stop finding aggregation.
     * </p>
     * <p>
     * When you stop finding aggregation, findings that were already aggregated to the aggregation Region are still
     * visible from the aggregation Region. New findings and finding updates are not aggregated.
     * </p>
     * 
     * @param deleteFindingAggregatorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFindingAggregator operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeleteFindingAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteFindingAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFindingAggregatorResult> deleteFindingAggregatorAsync(DeleteFindingAggregatorRequest deleteFindingAggregatorRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFindingAggregatorRequest, DeleteFindingAggregatorResult> asyncHandler);

    /**
     * <p>
     * Deletes the insight specified by the <code>InsightArn</code>.
     * </p>
     * 
     * @param deleteInsightRequest
     * @return A Java Future containing the result of the DeleteInsight operation returned by the service.
     * @sample AWSSecurityHubAsync.DeleteInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInsightResult> deleteInsightAsync(DeleteInsightRequest deleteInsightRequest);

    /**
     * <p>
     * Deletes the insight specified by the <code>InsightArn</code>.
     * </p>
     * 
     * @param deleteInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInsight operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeleteInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteInsightResult> deleteInsightAsync(DeleteInsightRequest deleteInsightRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInsightRequest, DeleteInsightResult> asyncHandler);

    /**
     * <p>
     * Deletes invitations received by the Amazon Web Services account to become a member account.
     * </p>
     * <p>
     * A Security Hub administrator account can use this operation to delete invitations sent to one or more member
     * accounts.
     * </p>
     * <p>
     * This operation is only used to delete invitations that are sent to member accounts that aren't part of an
     * organization. Organization accounts don't receive invitations.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @return A Java Future containing the result of the DeleteInvitations operation returned by the service.
     * @sample AWSSecurityHubAsync.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest deleteInvitationsRequest);

    /**
     * <p>
     * Deletes invitations received by the Amazon Web Services account to become a member account.
     * </p>
     * <p>
     * A Security Hub administrator account can use this operation to delete invitations sent to one or more member
     * accounts.
     * </p>
     * <p>
     * This operation is only used to delete invitations that are sent to member accounts that aren't part of an
     * organization. Organization accounts don't receive invitations.
     * </p>
     * 
     * @param deleteInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteInvitations operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeleteInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest deleteInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInvitationsRequest, DeleteInvitationsResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified member accounts from Security Hub.
     * </p>
     * <p>
     * You can invoke this API only to delete accounts that became members through invitation. You can't invoke this API
     * to delete accounts that belong to an Organizations organization.
     * </p>
     * 
     * @param deleteMembersRequest
     * @return A Java Future containing the result of the DeleteMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest deleteMembersRequest);

    /**
     * <p>
     * Deletes the specified member accounts from Security Hub.
     * </p>
     * <p>
     * You can invoke this API only to delete accounts that became members through invitation. You can't invoke this API
     * to delete accounts that belong to an Organizations organization.
     * </p>
     * 
     * @param deleteMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DeleteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DeleteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest deleteMembersRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMembersRequest, DeleteMembersResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the custom action targets in Security Hub in your account.
     * </p>
     * 
     * @param describeActionTargetsRequest
     * @return A Java Future containing the result of the DescribeActionTargets operation returned by the service.
     * @sample AWSSecurityHubAsync.DescribeActionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeActionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeActionTargetsResult> describeActionTargetsAsync(DescribeActionTargetsRequest describeActionTargetsRequest);

    /**
     * <p>
     * Returns a list of the custom action targets in Security Hub in your account.
     * </p>
     * 
     * @param describeActionTargetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeActionTargets operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DescribeActionTargets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeActionTargets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeActionTargetsResult> describeActionTargetsAsync(DescribeActionTargetsRequest describeActionTargetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeActionTargetsRequest, DescribeActionTargetsResult> asyncHandler);

    /**
     * <p>
     * Returns details about the Hub resource in your account, including the <code>HubArn</code> and the time when you
     * enabled Security Hub.
     * </p>
     * 
     * @param describeHubRequest
     * @return A Java Future containing the result of the DescribeHub operation returned by the service.
     * @sample AWSSecurityHubAsync.DescribeHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeHub" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeHubResult> describeHubAsync(DescribeHubRequest describeHubRequest);

    /**
     * <p>
     * Returns details about the Hub resource in your account, including the <code>HubArn</code> and the time when you
     * enabled Security Hub.
     * </p>
     * 
     * @param describeHubRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeHub operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DescribeHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeHub" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeHubResult> describeHubAsync(DescribeHubRequest describeHubRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeHubRequest, DescribeHubResult> asyncHandler);

    /**
     * <p>
     * Returns information about the way your organization is configured in Security Hub. Only the Security Hub
     * administrator account can invoke this operation.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest);

    /**
     * <p>
     * Returns information about the way your organization is configured in Security Hub. Only the Security Hub
     * administrator account can invoke this operation.
     * </p>
     * 
     * @param describeOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeOrganizationConfiguration operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.DescribeOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest describeOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigurationRequest, DescribeOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Returns information about product integrations in Security Hub.
     * </p>
     * <p>
     * You can optionally provide an integration ARN. If you provide an integration ARN, then the results only include
     * that integration.
     * </p>
     * <p>
     * If you do not provide an integration ARN, then the results include all of the available product integrations.
     * </p>
     * 
     * @param describeProductsRequest
     * @return A Java Future containing the result of the DescribeProducts operation returned by the service.
     * @sample AWSSecurityHubAsync.DescribeProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeProducts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProductsResult> describeProductsAsync(DescribeProductsRequest describeProductsRequest);

    /**
     * <p>
     * Returns information about product integrations in Security Hub.
     * </p>
     * <p>
     * You can optionally provide an integration ARN. If you provide an integration ARN, then the results only include
     * that integration.
     * </p>
     * <p>
     * If you do not provide an integration ARN, then the results include all of the available product integrations.
     * </p>
     * 
     * @param describeProductsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProducts operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DescribeProducts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeProducts" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProductsResult> describeProductsAsync(DescribeProductsRequest describeProductsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProductsRequest, DescribeProductsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the available standards in Security Hub.
     * </p>
     * <p>
     * For each standard, the results include the standard ARN, the name, and a description.
     * </p>
     * 
     * @param describeStandardsRequest
     * @return A Java Future containing the result of the DescribeStandards operation returned by the service.
     * @sample AWSSecurityHubAsync.DescribeStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandards" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStandardsResult> describeStandardsAsync(DescribeStandardsRequest describeStandardsRequest);

    /**
     * <p>
     * Returns a list of the available standards in Security Hub.
     * </p>
     * <p>
     * For each standard, the results include the standard ARN, the name, and a description.
     * </p>
     * 
     * @param describeStandardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStandards operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DescribeStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandards" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStandardsResult> describeStandardsAsync(DescribeStandardsRequest describeStandardsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStandardsRequest, DescribeStandardsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of security standards controls.
     * </p>
     * <p>
     * For each control, the results include information about whether it is currently enabled, the severity, and a link
     * to remediation information.
     * </p>
     * 
     * @param describeStandardsControlsRequest
     * @return A Java Future containing the result of the DescribeStandardsControls operation returned by the service.
     * @sample AWSSecurityHubAsync.DescribeStandardsControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandardsControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStandardsControlsResult> describeStandardsControlsAsync(
            DescribeStandardsControlsRequest describeStandardsControlsRequest);

    /**
     * <p>
     * Returns a list of security standards controls.
     * </p>
     * <p>
     * For each control, the results include information about whether it is currently enabled, the severity, and a link
     * to remediation information.
     * </p>
     * 
     * @param describeStandardsControlsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStandardsControls operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DescribeStandardsControls
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DescribeStandardsControls"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeStandardsControlsResult> describeStandardsControlsAsync(
            DescribeStandardsControlsRequest describeStandardsControlsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStandardsControlsRequest, DescribeStandardsControlsResult> asyncHandler);

    /**
     * <p>
     * Disables the integration of the specified product with Security Hub. After the integration is disabled, findings
     * from that product are no longer sent to Security Hub.
     * </p>
     * 
     * @param disableImportFindingsForProductRequest
     * @return A Java Future containing the result of the DisableImportFindingsForProduct operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.DisableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableImportFindingsForProductResult> disableImportFindingsForProductAsync(
            DisableImportFindingsForProductRequest disableImportFindingsForProductRequest);

    /**
     * <p>
     * Disables the integration of the specified product with Security Hub. After the integration is disabled, findings
     * from that product are no longer sent to Security Hub.
     * </p>
     * 
     * @param disableImportFindingsForProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableImportFindingsForProduct operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.DisableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableImportFindingsForProductResult> disableImportFindingsForProductAsync(
            DisableImportFindingsForProductRequest disableImportFindingsForProductRequest,
            com.amazonaws.handlers.AsyncHandler<DisableImportFindingsForProductRequest, DisableImportFindingsForProductResult> asyncHandler);

    /**
     * <p>
     * Disables a Security Hub administrator account. Can only be called by the organization management account.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the DisableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Disables a Security Hub administrator account. Can only be called by the organization management account.
     * </p>
     * 
     * @param disableOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.DisableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest disableOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisableOrganizationAdminAccountRequest, DisableOrganizationAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Disables Security Hub in your account only in the current Amazon Web Services Region. To disable Security Hub in
     * all Regions, you must submit one request per Region where you have enabled Security Hub.
     * </p>
     * <p>
     * You can't disable Security Hub in an account that is currently the Security Hub administrator.
     * </p>
     * <p>
     * When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings
     * are deleted after 90 days and cannot be recovered. Any standards that were enabled are disabled, and your
     * administrator and member account associations are removed.
     * </p>
     * <p>
     * If you want to save your existing findings, you must export them before you disable Security Hub.
     * </p>
     * 
     * @param disableSecurityHubRequest
     * @return A Java Future containing the result of the DisableSecurityHub operation returned by the service.
     * @sample AWSSecurityHubAsync.DisableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableSecurityHubResult> disableSecurityHubAsync(DisableSecurityHubRequest disableSecurityHubRequest);

    /**
     * <p>
     * Disables Security Hub in your account only in the current Amazon Web Services Region. To disable Security Hub in
     * all Regions, you must submit one request per Region where you have enabled Security Hub.
     * </p>
     * <p>
     * You can't disable Security Hub in an account that is currently the Security Hub administrator.
     * </p>
     * <p>
     * When you disable Security Hub, your existing findings and insights and any Security Hub configuration settings
     * are deleted after 90 days and cannot be recovered. Any standards that were enabled are disabled, and your
     * administrator and member account associations are removed.
     * </p>
     * <p>
     * If you want to save your existing findings, you must export them before you disable Security Hub.
     * </p>
     * 
     * @param disableSecurityHubRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisableSecurityHub operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DisableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisableSecurityHubResult> disableSecurityHubAsync(DisableSecurityHubRequest disableSecurityHubRequest,
            com.amazonaws.handlers.AsyncHandler<DisableSecurityHubRequest, DisableSecurityHubResult> asyncHandler);

    /**
     * <p>
     * Disassociates the current Security Hub member account from the associated administrator account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. For organization accounts, only the
     * administrator account can disassociate a member account.
     * </p>
     * 
     * @param disassociateFromAdministratorAccountRequest
     * @return A Java Future containing the result of the DisassociateFromAdministratorAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.DisassociateFromAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromAdministratorAccountResult> disassociateFromAdministratorAccountAsync(
            DisassociateFromAdministratorAccountRequest disassociateFromAdministratorAccountRequest);

    /**
     * <p>
     * Disassociates the current Security Hub member account from the associated administrator account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. For organization accounts, only the
     * administrator account can disassociate a member account.
     * </p>
     * 
     * @param disassociateFromAdministratorAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFromAdministratorAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.DisassociateFromAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateFromAdministratorAccountResult> disassociateFromAdministratorAccountAsync(
            DisassociateFromAdministratorAccountRequest disassociateFromAdministratorAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFromAdministratorAccountRequest, DisassociateFromAdministratorAccountResult> asyncHandler);

    /**
     * <p>
     * This method is deprecated. Instead, use <code>DisassociateFromAdministratorAccount</code>.
     * </p>
     * <p>
     * The Security Hub console continues to use <code>DisassociateFromMasterAccount</code>. It will eventually change
     * to use <code>DisassociateFromAdministratorAccount</code>. Any IAM policies that specifically control access to
     * this function must continue to use <code>DisassociateFromMasterAccount</code>. You should also add
     * <code>DisassociateFromAdministratorAccount</code> to your policies to ensure that the correct permissions are in
     * place after the console begins to use <code>DisassociateFromAdministratorAccount</code>.
     * </p>
     * <p>
     * Disassociates the current Security Hub member account from the associated administrator account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. For organization accounts, only the
     * administrator account can disassociate a member account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @return A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest);

    /**
     * <p>
     * This method is deprecated. Instead, use <code>DisassociateFromAdministratorAccount</code>.
     * </p>
     * <p>
     * The Security Hub console continues to use <code>DisassociateFromMasterAccount</code>. It will eventually change
     * to use <code>DisassociateFromAdministratorAccount</code>. Any IAM policies that specifically control access to
     * this function must continue to use <code>DisassociateFromMasterAccount</code>. You should also add
     * <code>DisassociateFromAdministratorAccount</code> to your policies to ensure that the correct permissions are in
     * place after the console begins to use <code>DisassociateFromAdministratorAccount</code>.
     * </p>
     * <p>
     * Disassociates the current Security Hub member account from the associated administrator account.
     * </p>
     * <p>
     * This operation is only used by accounts that are not part of an organization. For organization accounts, only the
     * administrator account can disassociate a member account.
     * </p>
     * 
     * @param disassociateFromMasterAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateFromMasterAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.DisassociateFromMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateFromMasterAccount"
     *      target="_top">AWS API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            DisassociateFromMasterAccountRequest disassociateFromMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateFromMasterAccountRequest, DisassociateFromMasterAccountResult> asyncHandler);

    /**
     * <p>
     * Disassociates the specified member accounts from the associated administrator account.
     * </p>
     * <p>
     * Can be used to disassociate both accounts that are managed using Organizations and accounts that were invited
     * manually.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @return A Java Future containing the result of the DisassociateMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(DisassociateMembersRequest disassociateMembersRequest);

    /**
     * <p>
     * Disassociates the specified member accounts from the associated administrator account.
     * </p>
     * <p>
     * Can be used to disassociate both accounts that are managed using Organizations and accounts that were invited
     * manually.
     * </p>
     * 
     * @param disassociateMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.DisassociateMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/DisassociateMembers"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(DisassociateMembersRequest disassociateMembersRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateMembersRequest, DisassociateMembersResult> asyncHandler);

    /**
     * <p>
     * Enables the integration of a partner product with Security Hub. Integrated products send findings to Security
     * Hub.
     * </p>
     * <p>
     * When you enable a product integration, a permissions policy that grants permission for the product to send
     * findings to Security Hub is applied.
     * </p>
     * 
     * @param enableImportFindingsForProductRequest
     * @return A Java Future containing the result of the EnableImportFindingsForProduct operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.EnableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableImportFindingsForProductResult> enableImportFindingsForProductAsync(
            EnableImportFindingsForProductRequest enableImportFindingsForProductRequest);

    /**
     * <p>
     * Enables the integration of a partner product with Security Hub. Integrated products send findings to Security
     * Hub.
     * </p>
     * <p>
     * When you enable a product integration, a permissions policy that grants permission for the product to send
     * findings to Security Hub is applied.
     * </p>
     * 
     * @param enableImportFindingsForProductRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableImportFindingsForProduct operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.EnableImportFindingsForProduct
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableImportFindingsForProduct"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableImportFindingsForProductResult> enableImportFindingsForProductAsync(
            EnableImportFindingsForProductRequest enableImportFindingsForProductRequest,
            com.amazonaws.handlers.AsyncHandler<EnableImportFindingsForProductRequest, EnableImportFindingsForProductResult> asyncHandler);

    /**
     * <p>
     * Designates the Security Hub administrator account for an organization. Can only be called by the organization
     * management account.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @return A Java Future containing the result of the EnableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest);

    /**
     * <p>
     * Designates the Security Hub administrator account for an organization. Can only be called by the organization
     * management account.
     * </p>
     * 
     * @param enableOrganizationAdminAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableOrganizationAdminAccount operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.EnableOrganizationAdminAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableOrganizationAdminAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            EnableOrganizationAdminAccountRequest enableOrganizationAdminAccountRequest,
            com.amazonaws.handlers.AsyncHandler<EnableOrganizationAdminAccountRequest, EnableOrganizationAdminAccountResult> asyncHandler);

    /**
     * <p>
     * Enables Security Hub for your account in the current Region or the Region you specify in the request.
     * </p>
     * <p>
     * When you enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from other
     * services that are integrated with Security Hub.
     * </p>
     * <p>
     * When you use the <code>EnableSecurityHub</code> operation to enable Security Hub, you also automatically enable
     * the following standards:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Center for Internet Security (CIS) Amazon Web Services Foundations Benchmark v1.2.0
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Web Services Foundational Security Best Practices
     * </p>
     * </li>
     * </ul>
     * <p>
     * Other standards are not automatically enabled.
     * </p>
     * <p>
     * To opt out of automatically enabled standards, set <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     * <p>
     * After you enable Security Hub, to enable a standard, use the <code>BatchEnableStandards</code> operation. To
     * disable a standard, use the <code>BatchDisableStandards</code> operation.
     * </p>
     * <p>
     * To learn more, see the <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-settingup.html">setup information</a>
     * in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param enableSecurityHubRequest
     * @return A Java Future containing the result of the EnableSecurityHub operation returned by the service.
     * @sample AWSSecurityHubAsync.EnableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableSecurityHubResult> enableSecurityHubAsync(EnableSecurityHubRequest enableSecurityHubRequest);

    /**
     * <p>
     * Enables Security Hub for your account in the current Region or the Region you specify in the request.
     * </p>
     * <p>
     * When you enable Security Hub, you grant to Security Hub the permissions necessary to gather findings from other
     * services that are integrated with Security Hub.
     * </p>
     * <p>
     * When you use the <code>EnableSecurityHub</code> operation to enable Security Hub, you also automatically enable
     * the following standards:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Center for Internet Security (CIS) Amazon Web Services Foundations Benchmark v1.2.0
     * </p>
     * </li>
     * <li>
     * <p>
     * Amazon Web Services Foundational Security Best Practices
     * </p>
     * </li>
     * </ul>
     * <p>
     * Other standards are not automatically enabled.
     * </p>
     * <p>
     * To opt out of automatically enabled standards, set <code>EnableDefaultStandards</code> to <code>false</code>.
     * </p>
     * <p>
     * After you enable Security Hub, to enable a standard, use the <code>BatchEnableStandards</code> operation. To
     * disable a standard, use the <code>BatchDisableStandards</code> operation.
     * </p>
     * <p>
     * To learn more, see the <a
     * href="https://docs.aws.amazon.com/securityhub/latest/userguide/securityhub-settingup.html">setup information</a>
     * in the <i>Security Hub User Guide</i>.
     * </p>
     * 
     * @param enableSecurityHubRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EnableSecurityHub operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.EnableSecurityHub
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/EnableSecurityHub" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<EnableSecurityHubResult> enableSecurityHubAsync(EnableSecurityHubRequest enableSecurityHubRequest,
            com.amazonaws.handlers.AsyncHandler<EnableSecurityHubRequest, EnableSecurityHubResult> asyncHandler);

    /**
     * <p>
     * Provides the details for the Security Hub administrator account for the current member account.
     * </p>
     * <p>
     * Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
     * </p>
     * 
     * @param getAdministratorAccountRequest
     * @return A Java Future containing the result of the GetAdministratorAccount operation returned by the service.
     * @sample AWSSecurityHubAsync.GetAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAdministratorAccountResult> getAdministratorAccountAsync(GetAdministratorAccountRequest getAdministratorAccountRequest);

    /**
     * <p>
     * Provides the details for the Security Hub administrator account for the current member account.
     * </p>
     * <p>
     * Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
     * </p>
     * 
     * @param getAdministratorAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAdministratorAccount operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetAdministratorAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetAdministratorAccount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetAdministratorAccountResult> getAdministratorAccountAsync(GetAdministratorAccountRequest getAdministratorAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetAdministratorAccountRequest, GetAdministratorAccountResult> asyncHandler);

    /**
     * <p>
     * Provides information about a configuration policy. Only the Security Hub delegated administrator can invoke this
     * operation from the home Region.
     * </p>
     * 
     * @param getConfigurationPolicyRequest
     * @return A Java Future containing the result of the GetConfigurationPolicy operation returned by the service.
     * @sample AWSSecurityHubAsync.GetConfigurationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetConfigurationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationPolicyResult> getConfigurationPolicyAsync(GetConfigurationPolicyRequest getConfigurationPolicyRequest);

    /**
     * <p>
     * Provides information about a configuration policy. Only the Security Hub delegated administrator can invoke this
     * operation from the home Region.
     * </p>
     * 
     * @param getConfigurationPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfigurationPolicy operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetConfigurationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetConfigurationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationPolicyResult> getConfigurationPolicyAsync(GetConfigurationPolicyRequest getConfigurationPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfigurationPolicyRequest, GetConfigurationPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns the association between a configuration and a target account, organizational unit, or the root. The
     * configuration can be a configuration policy or self-managed behavior. Only the Security Hub delegated
     * administrator can invoke this operation from the home Region.
     * </p>
     * 
     * @param getConfigurationPolicyAssociationRequest
     * @return A Java Future containing the result of the GetConfigurationPolicyAssociation operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.GetConfigurationPolicyAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetConfigurationPolicyAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationPolicyAssociationResult> getConfigurationPolicyAssociationAsync(
            GetConfigurationPolicyAssociationRequest getConfigurationPolicyAssociationRequest);

    /**
     * <p>
     * Returns the association between a configuration and a target account, organizational unit, or the root. The
     * configuration can be a configuration policy or self-managed behavior. Only the Security Hub delegated
     * administrator can invoke this operation from the home Region.
     * </p>
     * 
     * @param getConfigurationPolicyAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetConfigurationPolicyAssociation operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.GetConfigurationPolicyAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetConfigurationPolicyAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetConfigurationPolicyAssociationResult> getConfigurationPolicyAssociationAsync(
            GetConfigurationPolicyAssociationRequest getConfigurationPolicyAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<GetConfigurationPolicyAssociationRequest, GetConfigurationPolicyAssociationResult> asyncHandler);

    /**
     * <p>
     * Returns a list of the standards that are currently enabled.
     * </p>
     * 
     * @param getEnabledStandardsRequest
     * @return A Java Future containing the result of the GetEnabledStandards operation returned by the service.
     * @sample AWSSecurityHubAsync.GetEnabledStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetEnabledStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnabledStandardsResult> getEnabledStandardsAsync(GetEnabledStandardsRequest getEnabledStandardsRequest);

    /**
     * <p>
     * Returns a list of the standards that are currently enabled.
     * </p>
     * 
     * @param getEnabledStandardsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnabledStandards operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetEnabledStandards
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetEnabledStandards"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnabledStandardsResult> getEnabledStandardsAsync(GetEnabledStandardsRequest getEnabledStandardsRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnabledStandardsRequest, GetEnabledStandardsResult> asyncHandler);

    /**
     * <p>
     * Returns the current finding aggregation configuration.
     * </p>
     * 
     * @param getFindingAggregatorRequest
     * @return A Java Future containing the result of the GetFindingAggregator operation returned by the service.
     * @sample AWSSecurityHubAsync.GetFindingAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindingAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingAggregatorResult> getFindingAggregatorAsync(GetFindingAggregatorRequest getFindingAggregatorRequest);

    /**
     * <p>
     * Returns the current finding aggregation configuration.
     * </p>
     * 
     * @param getFindingAggregatorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindingAggregator operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetFindingAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindingAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingAggregatorResult> getFindingAggregatorAsync(GetFindingAggregatorRequest getFindingAggregatorRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingAggregatorRequest, GetFindingAggregatorResult> asyncHandler);

    /**
     * <p>
     * Returns history for a Security Hub finding in the last 90 days. The history includes changes made to any fields
     * in the Amazon Web Services Security Finding Format (ASFF).
     * </p>
     * 
     * @param getFindingHistoryRequest
     * @return A Java Future containing the result of the GetFindingHistory operation returned by the service.
     * @sample AWSSecurityHubAsync.GetFindingHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindingHistory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingHistoryResult> getFindingHistoryAsync(GetFindingHistoryRequest getFindingHistoryRequest);

    /**
     * <p>
     * Returns history for a Security Hub finding in the last 90 days. The history includes changes made to any fields
     * in the Amazon Web Services Security Finding Format (ASFF).
     * </p>
     * 
     * @param getFindingHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindingHistory operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetFindingHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindingHistory" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetFindingHistoryResult> getFindingHistoryAsync(GetFindingHistoryRequest getFindingHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingHistoryRequest, GetFindingHistoryResult> asyncHandler);

    /**
     * <p>
     * Returns a list of findings that match the specified criteria.
     * </p>
     * <p>
     * If finding aggregation is enabled, then when you call <code>GetFindings</code> from the aggregation Region, the
     * results include all of the matching findings from both the aggregation Region and the linked Regions.
     * </p>
     * 
     * @param getFindingsRequest
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AWSSecurityHubAsync.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest);

    /**
     * <p>
     * Returns a list of findings that match the specified criteria.
     * </p>
     * <p>
     * If finding aggregation is enabled, then when you call <code>GetFindings</code> from the aggregation Region, the
     * results include all of the matching findings from both the aggregation Region and the linked Regions.
     * </p>
     * 
     * @param getFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetFindings operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest getFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<GetFindingsRequest, GetFindingsResult> asyncHandler);

    /**
     * <p>
     * Lists the results of the Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param getInsightResultsRequest
     * @return A Java Future containing the result of the GetInsightResults operation returned by the service.
     * @sample AWSSecurityHubAsync.GetInsightResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsightResults" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInsightResultsResult> getInsightResultsAsync(GetInsightResultsRequest getInsightResultsRequest);

    /**
     * <p>
     * Lists the results of the Security Hub insight specified by the insight ARN.
     * </p>
     * 
     * @param getInsightResultsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsightResults operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetInsightResults
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsightResults" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetInsightResultsResult> getInsightResultsAsync(GetInsightResultsRequest getInsightResultsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightResultsRequest, GetInsightResultsResult> asyncHandler);

    /**
     * <p>
     * Lists and describes insights for the specified insight ARNs.
     * </p>
     * 
     * @param getInsightsRequest
     * @return A Java Future containing the result of the GetInsights operation returned by the service.
     * @sample AWSSecurityHubAsync.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightsResult> getInsightsAsync(GetInsightsRequest getInsightsRequest);

    /**
     * <p>
     * Lists and describes insights for the specified insight ARNs.
     * </p>
     * 
     * @param getInsightsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInsights operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetInsights
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInsights" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInsightsResult> getInsightsAsync(GetInsightsRequest getInsightsRequest,
            com.amazonaws.handlers.AsyncHandler<GetInsightsRequest, GetInsightsResult> asyncHandler);

    /**
     * <p>
     * Returns the count of all Security Hub membership invitations that were sent to the current member account, not
     * including the currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @return A Java Future containing the result of the GetInvitationsCount operation returned by the service.
     * @sample AWSSecurityHubAsync.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInvitationsCount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest getInvitationsCountRequest);

    /**
     * <p>
     * Returns the count of all Security Hub membership invitations that were sent to the current member account, not
     * including the currently accepted invitation.
     * </p>
     * 
     * @param getInvitationsCountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInvitationsCount operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetInvitationsCount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetInvitationsCount"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest getInvitationsCountRequest,
            com.amazonaws.handlers.AsyncHandler<GetInvitationsCountRequest, GetInvitationsCountResult> asyncHandler);

    /**
     * <p>
     * This method is deprecated. Instead, use <code>GetAdministratorAccount</code>.
     * </p>
     * <p>
     * The Security Hub console continues to use <code>GetMasterAccount</code>. It will eventually change to use
     * <code>GetAdministratorAccount</code>. Any IAM policies that specifically control access to this function must
     * continue to use <code>GetMasterAccount</code>. You should also add <code>GetAdministratorAccount</code> to your
     * policies to ensure that the correct permissions are in place after the console begins to use
     * <code>GetAdministratorAccount</code>.
     * </p>
     * <p>
     * Provides the details for the Security Hub administrator account for the current member account.
     * </p>
     * <p>
     * Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @return A Java Future containing the result of the GetMasterAccount operation returned by the service.
     * @sample AWSSecurityHubAsync.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMasterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest);

    /**
     * <p>
     * This method is deprecated. Instead, use <code>GetAdministratorAccount</code>.
     * </p>
     * <p>
     * The Security Hub console continues to use <code>GetMasterAccount</code>. It will eventually change to use
     * <code>GetAdministratorAccount</code>. Any IAM policies that specifically control access to this function must
     * continue to use <code>GetMasterAccount</code>. You should also add <code>GetAdministratorAccount</code> to your
     * policies to ensure that the correct permissions are in place after the console begins to use
     * <code>GetAdministratorAccount</code>.
     * </p>
     * <p>
     * Provides the details for the Security Hub administrator account for the current member account.
     * </p>
     * <p>
     * Can be used by both member accounts that are managed using Organizations and accounts that were invited manually.
     * </p>
     * 
     * @param getMasterAccountRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMasterAccount operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetMasterAccount
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMasterAccount" target="_top">AWS
     *      API Documentation</a>
     */
    @Deprecated
    java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest getMasterAccountRequest,
            com.amazonaws.handlers.AsyncHandler<GetMasterAccountRequest, GetMasterAccountResult> asyncHandler);

    /**
     * <p>
     * Returns the details for the Security Hub member accounts for the specified account IDs.
     * </p>
     * <p>
     * An administrator account can be either the delegated Security Hub administrator account for an organization or an
     * administrator account that enabled Security Hub manually.
     * </p>
     * <p>
     * The results include both member accounts that are managed using Organizations and accounts that were invited
     * manually.
     * </p>
     * 
     * @param getMembersRequest
     * @return A Java Future containing the result of the GetMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest getMembersRequest);

    /**
     * <p>
     * Returns the details for the Security Hub member accounts for the specified account IDs.
     * </p>
     * <p>
     * An administrator account can be either the delegated Security Hub administrator account for an organization or an
     * administrator account that enabled Security Hub manually.
     * </p>
     * <p>
     * The results include both member accounts that are managed using Organizations and accounts that were invited
     * manually.
     * </p>
     * 
     * @param getMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.GetMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest getMembersRequest,
            com.amazonaws.handlers.AsyncHandler<GetMembersRequest, GetMembersResult> asyncHandler);

    /**
     * <p>
     * Retrieves the definition of a security control. The definition includes the control title, description, Region
     * availability, parameter definitions, and other details.
     * </p>
     * 
     * @param getSecurityControlDefinitionRequest
     * @return A Java Future containing the result of the GetSecurityControlDefinition operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.GetSecurityControlDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetSecurityControlDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSecurityControlDefinitionResult> getSecurityControlDefinitionAsync(
            GetSecurityControlDefinitionRequest getSecurityControlDefinitionRequest);

    /**
     * <p>
     * Retrieves the definition of a security control. The definition includes the control title, description, Region
     * availability, parameter definitions, and other details.
     * </p>
     * 
     * @param getSecurityControlDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSecurityControlDefinition operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.GetSecurityControlDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetSecurityControlDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSecurityControlDefinitionResult> getSecurityControlDefinitionAsync(
            GetSecurityControlDefinitionRequest getSecurityControlDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<GetSecurityControlDefinitionRequest, GetSecurityControlDefinitionResult> asyncHandler);

    /**
     * <p>
     * Invites other Amazon Web Services accounts to become member accounts for the Security Hub administrator account
     * that the invitation is sent from.
     * </p>
     * <p>
     * This operation is only used to invite accounts that do not belong to an organization. Organization accounts do
     * not receive invitations.
     * </p>
     * <p>
     * Before you can use this action to invite a member, you must first use the <code>CreateMembers</code> action to
     * create the member account in Security Hub.
     * </p>
     * <p>
     * When the account owner enables Security Hub and accepts the invitation to become a member account, the
     * administrator account can view the findings generated from the member account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @return A Java Future containing the result of the InviteMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(InviteMembersRequest inviteMembersRequest);

    /**
     * <p>
     * Invites other Amazon Web Services accounts to become member accounts for the Security Hub administrator account
     * that the invitation is sent from.
     * </p>
     * <p>
     * This operation is only used to invite accounts that do not belong to an organization. Organization accounts do
     * not receive invitations.
     * </p>
     * <p>
     * Before you can use this action to invite a member, you must first use the <code>CreateMembers</code> action to
     * create the member account in Security Hub.
     * </p>
     * <p>
     * When the account owner enables Security Hub and accepts the invitation to become a member account, the
     * administrator account can view the findings generated from the member account.
     * </p>
     * 
     * @param inviteMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the InviteMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.InviteMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/InviteMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(InviteMembersRequest inviteMembersRequest,
            com.amazonaws.handlers.AsyncHandler<InviteMembersRequest, InviteMembersResult> asyncHandler);

    /**
     * <p>
     * A list of automation rules and their metadata for the calling account.
     * </p>
     * 
     * @param listAutomationRulesRequest
     * @return A Java Future containing the result of the ListAutomationRules operation returned by the service.
     * @sample AWSSecurityHubAsync.ListAutomationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListAutomationRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAutomationRulesResult> listAutomationRulesAsync(ListAutomationRulesRequest listAutomationRulesRequest);

    /**
     * <p>
     * A list of automation rules and their metadata for the calling account.
     * </p>
     * 
     * @param listAutomationRulesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAutomationRules operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.ListAutomationRules
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListAutomationRules"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListAutomationRulesResult> listAutomationRulesAsync(ListAutomationRulesRequest listAutomationRulesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAutomationRulesRequest, ListAutomationRulesResult> asyncHandler);

    /**
     * <p>
     * Lists the configuration policies that the Security Hub delegated administrator has created for your organization.
     * Only the delegated administrator can invoke this operation from the home Region.
     * </p>
     * 
     * @param listConfigurationPoliciesRequest
     * @return A Java Future containing the result of the ListConfigurationPolicies operation returned by the service.
     * @sample AWSSecurityHubAsync.ListConfigurationPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListConfigurationPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationPoliciesResult> listConfigurationPoliciesAsync(
            ListConfigurationPoliciesRequest listConfigurationPoliciesRequest);

    /**
     * <p>
     * Lists the configuration policies that the Security Hub delegated administrator has created for your organization.
     * Only the delegated administrator can invoke this operation from the home Region.
     * </p>
     * 
     * @param listConfigurationPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigurationPolicies operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.ListConfigurationPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListConfigurationPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationPoliciesResult> listConfigurationPoliciesAsync(
            ListConfigurationPoliciesRequest listConfigurationPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationPoliciesRequest, ListConfigurationPoliciesResult> asyncHandler);

    /**
     * <p>
     * Provides information about the associations for your configuration policies and self-managed behavior. Only the
     * Security Hub delegated administrator can invoke this operation from the home Region.
     * </p>
     * 
     * @param listConfigurationPolicyAssociationsRequest
     * @return A Java Future containing the result of the ListConfigurationPolicyAssociations operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.ListConfigurationPolicyAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListConfigurationPolicyAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationPolicyAssociationsResult> listConfigurationPolicyAssociationsAsync(
            ListConfigurationPolicyAssociationsRequest listConfigurationPolicyAssociationsRequest);

    /**
     * <p>
     * Provides information about the associations for your configuration policies and self-managed behavior. Only the
     * Security Hub delegated administrator can invoke this operation from the home Region.
     * </p>
     * 
     * @param listConfigurationPolicyAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListConfigurationPolicyAssociations operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.ListConfigurationPolicyAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListConfigurationPolicyAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListConfigurationPolicyAssociationsResult> listConfigurationPolicyAssociationsAsync(
            ListConfigurationPolicyAssociationsRequest listConfigurationPolicyAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListConfigurationPolicyAssociationsRequest, ListConfigurationPolicyAssociationsResult> asyncHandler);

    /**
     * <p>
     * Lists all findings-generating solutions (products) that you are subscribed to receive findings from in Security
     * Hub.
     * </p>
     * 
     * @param listEnabledProductsForImportRequest
     * @return A Java Future containing the result of the ListEnabledProductsForImport operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.ListEnabledProductsForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListEnabledProductsForImport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnabledProductsForImportResult> listEnabledProductsForImportAsync(
            ListEnabledProductsForImportRequest listEnabledProductsForImportRequest);

    /**
     * <p>
     * Lists all findings-generating solutions (products) that you are subscribed to receive findings from in Security
     * Hub.
     * </p>
     * 
     * @param listEnabledProductsForImportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnabledProductsForImport operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.ListEnabledProductsForImport
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListEnabledProductsForImport"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnabledProductsForImportResult> listEnabledProductsForImportAsync(
            ListEnabledProductsForImportRequest listEnabledProductsForImportRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnabledProductsForImportRequest, ListEnabledProductsForImportResult> asyncHandler);

    /**
     * <p>
     * If finding aggregation is enabled, then <code>ListFindingAggregators</code> returns the ARN of the finding
     * aggregator. You can run this operation from any Region.
     * </p>
     * 
     * @param listFindingAggregatorsRequest
     * @return A Java Future containing the result of the ListFindingAggregators operation returned by the service.
     * @sample AWSSecurityHubAsync.ListFindingAggregators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListFindingAggregators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFindingAggregatorsResult> listFindingAggregatorsAsync(ListFindingAggregatorsRequest listFindingAggregatorsRequest);

    /**
     * <p>
     * If finding aggregation is enabled, then <code>ListFindingAggregators</code> returns the ARN of the finding
     * aggregator. You can run this operation from any Region.
     * </p>
     * 
     * @param listFindingAggregatorsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFindingAggregators operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.ListFindingAggregators
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListFindingAggregators"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListFindingAggregatorsResult> listFindingAggregatorsAsync(ListFindingAggregatorsRequest listFindingAggregatorsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFindingAggregatorsRequest, ListFindingAggregatorsResult> asyncHandler);

    /**
     * <p>
     * Lists all Security Hub membership invitations that were sent to the current Amazon Web Services account.
     * </p>
     * <p>
     * This operation is only used by accounts that are managed by invitation. Accounts that are managed using the
     * integration with Organizations do not receive invitations.
     * </p>
     * 
     * @param listInvitationsRequest
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AWSSecurityHubAsync.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest);

    /**
     * <p>
     * Lists all Security Hub membership invitations that were sent to the current Amazon Web Services account.
     * </p>
     * <p>
     * This operation is only used by accounts that are managed by invitation. Accounts that are managed using the
     * integration with Organizations do not receive invitations.
     * </p>
     * 
     * @param listInvitationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInvitations operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.ListInvitations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListInvitations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest listInvitationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler);

    /**
     * <p>
     * Lists details about all member accounts for the current Security Hub administrator account.
     * </p>
     * <p>
     * The results include both member accounts that belong to an organization and member accounts that were invited
     * manually.
     * </p>
     * 
     * @param listMembersRequest
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AWSSecurityHubAsync.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest);

    /**
     * <p>
     * Lists details about all member accounts for the current Security Hub administrator account.
     * </p>
     * <p>
     * The results include both member accounts that belong to an organization and member accounts that were invited
     * manually.
     * </p>
     * 
     * @param listMembersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMembers operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.ListMembers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListMembers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest listMembersRequest,
            com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler);

    /**
     * <p>
     * Lists the Security Hub administrator accounts. Can only be called by the organization management account.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @return A Java Future containing the result of the ListOrganizationAdminAccounts operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest);

    /**
     * <p>
     * Lists the Security Hub administrator accounts. Can only be called by the organization management account.
     * </p>
     * 
     * @param listOrganizationAdminAccountsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOrganizationAdminAccounts operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.ListOrganizationAdminAccounts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListOrganizationAdminAccounts"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            ListOrganizationAdminAccountsRequest listOrganizationAdminAccountsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOrganizationAdminAccountsRequest, ListOrganizationAdminAccountsResult> asyncHandler);

    /**
     * <p>
     * Lists all of the security controls that apply to a specified standard.
     * </p>
     * 
     * @param listSecurityControlDefinitionsRequest
     * @return A Java Future containing the result of the ListSecurityControlDefinitions operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.ListSecurityControlDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListSecurityControlDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityControlDefinitionsResult> listSecurityControlDefinitionsAsync(
            ListSecurityControlDefinitionsRequest listSecurityControlDefinitionsRequest);

    /**
     * <p>
     * Lists all of the security controls that apply to a specified standard.
     * </p>
     * 
     * @param listSecurityControlDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSecurityControlDefinitions operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.ListSecurityControlDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListSecurityControlDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSecurityControlDefinitionsResult> listSecurityControlDefinitionsAsync(
            ListSecurityControlDefinitionsRequest listSecurityControlDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSecurityControlDefinitionsRequest, ListSecurityControlDefinitionsResult> asyncHandler);

    /**
     * <p>
     * Specifies whether a control is currently enabled or disabled in each enabled standard in the calling account.
     * </p>
     * 
     * @param listStandardsControlAssociationsRequest
     * @return A Java Future containing the result of the ListStandardsControlAssociations operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.ListStandardsControlAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListStandardsControlAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStandardsControlAssociationsResult> listStandardsControlAssociationsAsync(
            ListStandardsControlAssociationsRequest listStandardsControlAssociationsRequest);

    /**
     * <p>
     * Specifies whether a control is currently enabled or disabled in each enabled standard in the calling account.
     * </p>
     * 
     * @param listStandardsControlAssociationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStandardsControlAssociations operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.ListStandardsControlAssociations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListStandardsControlAssociations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStandardsControlAssociationsResult> listStandardsControlAssociationsAsync(
            ListStandardsControlAssociationsRequest listStandardsControlAssociationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStandardsControlAssociationsRequest, ListStandardsControlAssociationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSecurityHubAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags associated with a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Associates a target account, organizational unit, or the root with a specified configuration. The target can be
     * associated with a configuration policy or self-managed behavior. Only the Security Hub delegated administrator
     * can invoke this operation from the home Region.
     * </p>
     * 
     * @param startConfigurationPolicyAssociationRequest
     * @return A Java Future containing the result of the StartConfigurationPolicyAssociation operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.StartConfigurationPolicyAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StartConfigurationPolicyAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartConfigurationPolicyAssociationResult> startConfigurationPolicyAssociationAsync(
            StartConfigurationPolicyAssociationRequest startConfigurationPolicyAssociationRequest);

    /**
     * <p>
     * Associates a target account, organizational unit, or the root with a specified configuration. The target can be
     * associated with a configuration policy or self-managed behavior. Only the Security Hub delegated administrator
     * can invoke this operation from the home Region.
     * </p>
     * 
     * @param startConfigurationPolicyAssociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartConfigurationPolicyAssociation operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.StartConfigurationPolicyAssociation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StartConfigurationPolicyAssociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartConfigurationPolicyAssociationResult> startConfigurationPolicyAssociationAsync(
            StartConfigurationPolicyAssociationRequest startConfigurationPolicyAssociationRequest,
            com.amazonaws.handlers.AsyncHandler<StartConfigurationPolicyAssociationRequest, StartConfigurationPolicyAssociationResult> asyncHandler);

    /**
     * <p>
     * Disassociates a target account, organizational unit, or the root from a specified configuration. When you
     * disassociate a configuration from its target, the target inherits the configuration of the closest parent. If
     * there’s no configuration to inherit, the target retains its settings but becomes a self-managed account. A target
     * can be disassociated from a configuration policy or self-managed behavior. Only the Security Hub delegated
     * administrator can invoke this operation from the home Region.
     * </p>
     * 
     * @param startConfigurationPolicyDisassociationRequest
     * @return A Java Future containing the result of the StartConfigurationPolicyDisassociation operation returned by
     *         the service.
     * @sample AWSSecurityHubAsync.StartConfigurationPolicyDisassociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StartConfigurationPolicyDisassociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartConfigurationPolicyDisassociationResult> startConfigurationPolicyDisassociationAsync(
            StartConfigurationPolicyDisassociationRequest startConfigurationPolicyDisassociationRequest);

    /**
     * <p>
     * Disassociates a target account, organizational unit, or the root from a specified configuration. When you
     * disassociate a configuration from its target, the target inherits the configuration of the closest parent. If
     * there’s no configuration to inherit, the target retains its settings but becomes a self-managed account. A target
     * can be disassociated from a configuration policy or self-managed behavior. Only the Security Hub delegated
     * administrator can invoke this operation from the home Region.
     * </p>
     * 
     * @param startConfigurationPolicyDisassociationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartConfigurationPolicyDisassociation operation returned by
     *         the service.
     * @sample AWSSecurityHubAsyncHandler.StartConfigurationPolicyDisassociation
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/StartConfigurationPolicyDisassociation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartConfigurationPolicyDisassociationResult> startConfigurationPolicyDisassociationAsync(
            StartConfigurationPolicyDisassociationRequest startConfigurationPolicyDisassociationRequest,
            com.amazonaws.handlers.AsyncHandler<StartConfigurationPolicyDisassociationRequest, StartConfigurationPolicyDisassociationResult> asyncHandler);

    /**
     * <p>
     * Adds one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSecurityHubAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds one or more tags to a resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSecurityHubAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates the name and description of a custom action target in Security Hub.
     * </p>
     * 
     * @param updateActionTargetRequest
     * @return A Java Future containing the result of the UpdateActionTarget operation returned by the service.
     * @sample AWSSecurityHubAsync.UpdateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateActionTargetResult> updateActionTargetAsync(UpdateActionTargetRequest updateActionTargetRequest);

    /**
     * <p>
     * Updates the name and description of a custom action target in Security Hub.
     * </p>
     * 
     * @param updateActionTargetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateActionTarget operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UpdateActionTarget
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateActionTarget" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateActionTargetResult> updateActionTargetAsync(UpdateActionTargetRequest updateActionTargetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateActionTargetRequest, UpdateActionTargetResult> asyncHandler);

    /**
     * <p>
     * Updates a configuration policy. Only the Security Hub delegated administrator can invoke this operation from the
     * home Region.
     * </p>
     * 
     * @param updateConfigurationPolicyRequest
     * @return A Java Future containing the result of the UpdateConfigurationPolicy operation returned by the service.
     * @sample AWSSecurityHubAsync.UpdateConfigurationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateConfigurationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationPolicyResult> updateConfigurationPolicyAsync(
            UpdateConfigurationPolicyRequest updateConfigurationPolicyRequest);

    /**
     * <p>
     * Updates a configuration policy. Only the Security Hub delegated administrator can invoke this operation from the
     * home Region.
     * </p>
     * 
     * @param updateConfigurationPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateConfigurationPolicy operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UpdateConfigurationPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateConfigurationPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateConfigurationPolicyResult> updateConfigurationPolicyAsync(
            UpdateConfigurationPolicyRequest updateConfigurationPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateConfigurationPolicyRequest, UpdateConfigurationPolicyResult> asyncHandler);

    /**
     * <p>
     * Updates the finding aggregation configuration. Used to update the Region linking mode and the list of included or
     * excluded Regions. You cannot use <code>UpdateFindingAggregator</code> to change the aggregation Region.
     * </p>
     * <p>
     * You must run <code>UpdateFindingAggregator</code> from the current aggregation Region.
     * </p>
     * 
     * @param updateFindingAggregatorRequest
     * @return A Java Future containing the result of the UpdateFindingAggregator operation returned by the service.
     * @sample AWSSecurityHubAsync.UpdateFindingAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindingAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingAggregatorResult> updateFindingAggregatorAsync(UpdateFindingAggregatorRequest updateFindingAggregatorRequest);

    /**
     * <p>
     * Updates the finding aggregation configuration. Used to update the Region linking mode and the list of included or
     * excluded Regions. You cannot use <code>UpdateFindingAggregator</code> to change the aggregation Region.
     * </p>
     * <p>
     * You must run <code>UpdateFindingAggregator</code> from the current aggregation Region.
     * </p>
     * 
     * @param updateFindingAggregatorRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFindingAggregator operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UpdateFindingAggregator
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindingAggregator"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingAggregatorResult> updateFindingAggregatorAsync(UpdateFindingAggregatorRequest updateFindingAggregatorRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFindingAggregatorRequest, UpdateFindingAggregatorResult> asyncHandler);

    /**
     * <p>
     * <code>UpdateFindings</code> is a deprecated operation. Instead of <code>UpdateFindings</code>, use the
     * <code>BatchUpdateFindings</code> operation.
     * </p>
     * <p>
     * Updates the <code>Note</code> and <code>RecordState</code> of the Security Hub-aggregated findings that the
     * filter attributes specify. Any member account that can view the finding also sees the update to the finding.
     * </p>
     * <p>
     * Finding updates made with <code>UpdateFindings</code> might not be persisted if the same finding is later updated
     * by the finding provider through the <code>BatchImportFindings</code> operation.
     * </p>
     * 
     * @param updateFindingsRequest
     * @return A Java Future containing the result of the UpdateFindings operation returned by the service.
     * @sample AWSSecurityHubAsync.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(UpdateFindingsRequest updateFindingsRequest);

    /**
     * <p>
     * <code>UpdateFindings</code> is a deprecated operation. Instead of <code>UpdateFindings</code>, use the
     * <code>BatchUpdateFindings</code> operation.
     * </p>
     * <p>
     * Updates the <code>Note</code> and <code>RecordState</code> of the Security Hub-aggregated findings that the
     * filter attributes specify. Any member account that can view the finding also sees the update to the finding.
     * </p>
     * <p>
     * Finding updates made with <code>UpdateFindings</code> might not be persisted if the same finding is later updated
     * by the finding provider through the <code>BatchImportFindings</code> operation.
     * </p>
     * 
     * @param updateFindingsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFindings operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UpdateFindings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateFindings" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(UpdateFindingsRequest updateFindingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFindingsRequest, UpdateFindingsResult> asyncHandler);

    /**
     * <p>
     * Updates the Security Hub insight identified by the specified insight ARN.
     * </p>
     * 
     * @param updateInsightRequest
     * @return A Java Future containing the result of the UpdateInsight operation returned by the service.
     * @sample AWSSecurityHubAsync.UpdateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInsightResult> updateInsightAsync(UpdateInsightRequest updateInsightRequest);

    /**
     * <p>
     * Updates the Security Hub insight identified by the specified insight ARN.
     * </p>
     * 
     * @param updateInsightRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateInsight operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UpdateInsight
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateInsight" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateInsightResult> updateInsightAsync(UpdateInsightRequest updateInsightRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateInsightRequest, UpdateInsightResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of your organization in Security Hub. Only the Security Hub administrator account can
     * invoke this operation.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest);

    /**
     * <p>
     * Updates the configuration of your organization in Security Hub. Only the Security Hub administrator account can
     * invoke this operation.
     * </p>
     * 
     * @param updateOrganizationConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateOrganizationConfiguration operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.UpdateOrganizationConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateOrganizationConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest updateOrganizationConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOrganizationConfigurationRequest, UpdateOrganizationConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the properties of a security control.
     * </p>
     * 
     * @param updateSecurityControlRequest
     * @return A Java Future containing the result of the UpdateSecurityControl operation returned by the service.
     * @sample AWSSecurityHubAsync.UpdateSecurityControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateSecurityControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityControlResult> updateSecurityControlAsync(UpdateSecurityControlRequest updateSecurityControlRequest);

    /**
     * <p>
     * Updates the properties of a security control.
     * </p>
     * 
     * @param updateSecurityControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSecurityControl operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UpdateSecurityControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateSecurityControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityControlResult> updateSecurityControlAsync(UpdateSecurityControlRequest updateSecurityControlRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSecurityControlRequest, UpdateSecurityControlResult> asyncHandler);

    /**
     * <p>
     * Updates configuration options for Security Hub.
     * </p>
     * 
     * @param updateSecurityHubConfigurationRequest
     * @return A Java Future containing the result of the UpdateSecurityHubConfiguration operation returned by the
     *         service.
     * @sample AWSSecurityHubAsync.UpdateSecurityHubConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateSecurityHubConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityHubConfigurationResult> updateSecurityHubConfigurationAsync(
            UpdateSecurityHubConfigurationRequest updateSecurityHubConfigurationRequest);

    /**
     * <p>
     * Updates configuration options for Security Hub.
     * </p>
     * 
     * @param updateSecurityHubConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSecurityHubConfiguration operation returned by the
     *         service.
     * @sample AWSSecurityHubAsyncHandler.UpdateSecurityHubConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateSecurityHubConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSecurityHubConfigurationResult> updateSecurityHubConfigurationAsync(
            UpdateSecurityHubConfigurationRequest updateSecurityHubConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSecurityHubConfigurationRequest, UpdateSecurityHubConfigurationResult> asyncHandler);

    /**
     * <p>
     * Used to control whether an individual security standard control is enabled or disabled.
     * </p>
     * 
     * @param updateStandardsControlRequest
     * @return A Java Future containing the result of the UpdateStandardsControl operation returned by the service.
     * @sample AWSSecurityHubAsync.UpdateStandardsControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateStandardsControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStandardsControlResult> updateStandardsControlAsync(UpdateStandardsControlRequest updateStandardsControlRequest);

    /**
     * <p>
     * Used to control whether an individual security standard control is enabled or disabled.
     * </p>
     * 
     * @param updateStandardsControlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStandardsControl operation returned by the service.
     * @sample AWSSecurityHubAsyncHandler.UpdateStandardsControl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/UpdateStandardsControl"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateStandardsControlResult> updateStandardsControlAsync(UpdateStandardsControlRequest updateStandardsControlRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStandardsControlRequest, UpdateStandardsControlResult> asyncHandler);

}
