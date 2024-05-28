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
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS SecurityHub asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSecurityHubAsyncClient extends AWSSecurityHubClient implements AWSSecurityHubAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSecurityHubAsyncClientBuilder asyncBuilder() {
        return AWSSecurityHubAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SecurityHub using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSecurityHubAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS SecurityHub using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSSecurityHubAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
        super(asyncClientParams, endpointDiscoveryEnabled);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AcceptAdministratorInvitationResult> acceptAdministratorInvitationAsync(AcceptAdministratorInvitationRequest request) {

        return acceptAdministratorInvitationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptAdministratorInvitationResult> acceptAdministratorInvitationAsync(
            final AcceptAdministratorInvitationRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptAdministratorInvitationRequest, AcceptAdministratorInvitationResult> asyncHandler) {
        final AcceptAdministratorInvitationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptAdministratorInvitationResult>() {
            @Override
            public AcceptAdministratorInvitationResult call() throws Exception {
                AcceptAdministratorInvitationResult result = null;

                try {
                    result = executeAcceptAdministratorInvitation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(AcceptInvitationRequest request) {

        return acceptInvitationAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<AcceptInvitationResult> acceptInvitationAsync(final AcceptInvitationRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptInvitationRequest, AcceptInvitationResult> asyncHandler) {
        final AcceptInvitationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptInvitationResult>() {
            @Override
            public AcceptInvitationResult call() throws Exception {
                AcceptInvitationResult result = null;

                try {
                    result = executeAcceptInvitation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteAutomationRulesResult> batchDeleteAutomationRulesAsync(BatchDeleteAutomationRulesRequest request) {

        return batchDeleteAutomationRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDeleteAutomationRulesResult> batchDeleteAutomationRulesAsync(final BatchDeleteAutomationRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDeleteAutomationRulesRequest, BatchDeleteAutomationRulesResult> asyncHandler) {
        final BatchDeleteAutomationRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDeleteAutomationRulesResult>() {
            @Override
            public BatchDeleteAutomationRulesResult call() throws Exception {
                BatchDeleteAutomationRulesResult result = null;

                try {
                    result = executeBatchDeleteAutomationRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchDisableStandardsResult> batchDisableStandardsAsync(BatchDisableStandardsRequest request) {

        return batchDisableStandardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchDisableStandardsResult> batchDisableStandardsAsync(final BatchDisableStandardsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchDisableStandardsRequest, BatchDisableStandardsResult> asyncHandler) {
        final BatchDisableStandardsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchDisableStandardsResult>() {
            @Override
            public BatchDisableStandardsResult call() throws Exception {
                BatchDisableStandardsResult result = null;

                try {
                    result = executeBatchDisableStandards(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchEnableStandardsResult> batchEnableStandardsAsync(BatchEnableStandardsRequest request) {

        return batchEnableStandardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchEnableStandardsResult> batchEnableStandardsAsync(final BatchEnableStandardsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchEnableStandardsRequest, BatchEnableStandardsResult> asyncHandler) {
        final BatchEnableStandardsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchEnableStandardsResult>() {
            @Override
            public BatchEnableStandardsResult call() throws Exception {
                BatchEnableStandardsResult result = null;

                try {
                    result = executeBatchEnableStandards(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetAutomationRulesResult> batchGetAutomationRulesAsync(BatchGetAutomationRulesRequest request) {

        return batchGetAutomationRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetAutomationRulesResult> batchGetAutomationRulesAsync(final BatchGetAutomationRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetAutomationRulesRequest, BatchGetAutomationRulesResult> asyncHandler) {
        final BatchGetAutomationRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetAutomationRulesResult>() {
            @Override
            public BatchGetAutomationRulesResult call() throws Exception {
                BatchGetAutomationRulesResult result = null;

                try {
                    result = executeBatchGetAutomationRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetConfigurationPolicyAssociationsResult> batchGetConfigurationPolicyAssociationsAsync(
            BatchGetConfigurationPolicyAssociationsRequest request) {

        return batchGetConfigurationPolicyAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetConfigurationPolicyAssociationsResult> batchGetConfigurationPolicyAssociationsAsync(
            final BatchGetConfigurationPolicyAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetConfigurationPolicyAssociationsRequest, BatchGetConfigurationPolicyAssociationsResult> asyncHandler) {
        final BatchGetConfigurationPolicyAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetConfigurationPolicyAssociationsResult>() {
            @Override
            public BatchGetConfigurationPolicyAssociationsResult call() throws Exception {
                BatchGetConfigurationPolicyAssociationsResult result = null;

                try {
                    result = executeBatchGetConfigurationPolicyAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetSecurityControlsResult> batchGetSecurityControlsAsync(BatchGetSecurityControlsRequest request) {

        return batchGetSecurityControlsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetSecurityControlsResult> batchGetSecurityControlsAsync(final BatchGetSecurityControlsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetSecurityControlsRequest, BatchGetSecurityControlsResult> asyncHandler) {
        final BatchGetSecurityControlsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetSecurityControlsResult>() {
            @Override
            public BatchGetSecurityControlsResult call() throws Exception {
                BatchGetSecurityControlsResult result = null;

                try {
                    result = executeBatchGetSecurityControls(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchGetStandardsControlAssociationsResult> batchGetStandardsControlAssociationsAsync(
            BatchGetStandardsControlAssociationsRequest request) {

        return batchGetStandardsControlAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchGetStandardsControlAssociationsResult> batchGetStandardsControlAssociationsAsync(
            final BatchGetStandardsControlAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchGetStandardsControlAssociationsRequest, BatchGetStandardsControlAssociationsResult> asyncHandler) {
        final BatchGetStandardsControlAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchGetStandardsControlAssociationsResult>() {
            @Override
            public BatchGetStandardsControlAssociationsResult call() throws Exception {
                BatchGetStandardsControlAssociationsResult result = null;

                try {
                    result = executeBatchGetStandardsControlAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchImportFindingsResult> batchImportFindingsAsync(BatchImportFindingsRequest request) {

        return batchImportFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchImportFindingsResult> batchImportFindingsAsync(final BatchImportFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchImportFindingsRequest, BatchImportFindingsResult> asyncHandler) {
        final BatchImportFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchImportFindingsResult>() {
            @Override
            public BatchImportFindingsResult call() throws Exception {
                BatchImportFindingsResult result = null;

                try {
                    result = executeBatchImportFindings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateAutomationRulesResult> batchUpdateAutomationRulesAsync(BatchUpdateAutomationRulesRequest request) {

        return batchUpdateAutomationRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateAutomationRulesResult> batchUpdateAutomationRulesAsync(final BatchUpdateAutomationRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateAutomationRulesRequest, BatchUpdateAutomationRulesResult> asyncHandler) {
        final BatchUpdateAutomationRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateAutomationRulesResult>() {
            @Override
            public BatchUpdateAutomationRulesResult call() throws Exception {
                BatchUpdateAutomationRulesResult result = null;

                try {
                    result = executeBatchUpdateAutomationRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateFindingsResult> batchUpdateFindingsAsync(BatchUpdateFindingsRequest request) {

        return batchUpdateFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateFindingsResult> batchUpdateFindingsAsync(final BatchUpdateFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateFindingsRequest, BatchUpdateFindingsResult> asyncHandler) {
        final BatchUpdateFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateFindingsResult>() {
            @Override
            public BatchUpdateFindingsResult call() throws Exception {
                BatchUpdateFindingsResult result = null;

                try {
                    result = executeBatchUpdateFindings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateStandardsControlAssociationsResult> batchUpdateStandardsControlAssociationsAsync(
            BatchUpdateStandardsControlAssociationsRequest request) {

        return batchUpdateStandardsControlAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateStandardsControlAssociationsResult> batchUpdateStandardsControlAssociationsAsync(
            final BatchUpdateStandardsControlAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<BatchUpdateStandardsControlAssociationsRequest, BatchUpdateStandardsControlAssociationsResult> asyncHandler) {
        final BatchUpdateStandardsControlAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<BatchUpdateStandardsControlAssociationsResult>() {
            @Override
            public BatchUpdateStandardsControlAssociationsResult call() throws Exception {
                BatchUpdateStandardsControlAssociationsResult result = null;

                try {
                    result = executeBatchUpdateStandardsControlAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateActionTargetResult> createActionTargetAsync(CreateActionTargetRequest request) {

        return createActionTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateActionTargetResult> createActionTargetAsync(final CreateActionTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateActionTargetRequest, CreateActionTargetResult> asyncHandler) {
        final CreateActionTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateActionTargetResult>() {
            @Override
            public CreateActionTargetResult call() throws Exception {
                CreateActionTargetResult result = null;

                try {
                    result = executeCreateActionTarget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAutomationRuleResult> createAutomationRuleAsync(CreateAutomationRuleRequest request) {

        return createAutomationRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAutomationRuleResult> createAutomationRuleAsync(final CreateAutomationRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAutomationRuleRequest, CreateAutomationRuleResult> asyncHandler) {
        final CreateAutomationRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAutomationRuleResult>() {
            @Override
            public CreateAutomationRuleResult call() throws Exception {
                CreateAutomationRuleResult result = null;

                try {
                    result = executeCreateAutomationRule(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationPolicyResult> createConfigurationPolicyAsync(CreateConfigurationPolicyRequest request) {

        return createConfigurationPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConfigurationPolicyResult> createConfigurationPolicyAsync(final CreateConfigurationPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateConfigurationPolicyRequest, CreateConfigurationPolicyResult> asyncHandler) {
        final CreateConfigurationPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateConfigurationPolicyResult>() {
            @Override
            public CreateConfigurationPolicyResult call() throws Exception {
                CreateConfigurationPolicyResult result = null;

                try {
                    result = executeCreateConfigurationPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFindingAggregatorResult> createFindingAggregatorAsync(CreateFindingAggregatorRequest request) {

        return createFindingAggregatorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFindingAggregatorResult> createFindingAggregatorAsync(final CreateFindingAggregatorRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFindingAggregatorRequest, CreateFindingAggregatorResult> asyncHandler) {
        final CreateFindingAggregatorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFindingAggregatorResult>() {
            @Override
            public CreateFindingAggregatorResult call() throws Exception {
                CreateFindingAggregatorResult result = null;

                try {
                    result = executeCreateFindingAggregator(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateInsightResult> createInsightAsync(CreateInsightRequest request) {

        return createInsightAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInsightResult> createInsightAsync(final CreateInsightRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateInsightRequest, CreateInsightResult> asyncHandler) {
        final CreateInsightRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateInsightResult>() {
            @Override
            public CreateInsightResult call() throws Exception {
                CreateInsightResult result = null;

                try {
                    result = executeCreateInsight(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateMembersResult> createMembersAsync(CreateMembersRequest request) {

        return createMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMembersResult> createMembersAsync(final CreateMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMembersRequest, CreateMembersResult> asyncHandler) {
        final CreateMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMembersResult>() {
            @Override
            public CreateMembersResult call() throws Exception {
                CreateMembersResult result = null;

                try {
                    result = executeCreateMembers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(DeclineInvitationsRequest request) {

        return declineInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeclineInvitationsResult> declineInvitationsAsync(final DeclineInvitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeclineInvitationsRequest, DeclineInvitationsResult> asyncHandler) {
        final DeclineInvitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeclineInvitationsResult>() {
            @Override
            public DeclineInvitationsResult call() throws Exception {
                DeclineInvitationsResult result = null;

                try {
                    result = executeDeclineInvitations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteActionTargetResult> deleteActionTargetAsync(DeleteActionTargetRequest request) {

        return deleteActionTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteActionTargetResult> deleteActionTargetAsync(final DeleteActionTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteActionTargetRequest, DeleteActionTargetResult> asyncHandler) {
        final DeleteActionTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteActionTargetResult>() {
            @Override
            public DeleteActionTargetResult call() throws Exception {
                DeleteActionTargetResult result = null;

                try {
                    result = executeDeleteActionTarget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationPolicyResult> deleteConfigurationPolicyAsync(DeleteConfigurationPolicyRequest request) {

        return deleteConfigurationPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConfigurationPolicyResult> deleteConfigurationPolicyAsync(final DeleteConfigurationPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteConfigurationPolicyRequest, DeleteConfigurationPolicyResult> asyncHandler) {
        final DeleteConfigurationPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteConfigurationPolicyResult>() {
            @Override
            public DeleteConfigurationPolicyResult call() throws Exception {
                DeleteConfigurationPolicyResult result = null;

                try {
                    result = executeDeleteConfigurationPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFindingAggregatorResult> deleteFindingAggregatorAsync(DeleteFindingAggregatorRequest request) {

        return deleteFindingAggregatorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFindingAggregatorResult> deleteFindingAggregatorAsync(final DeleteFindingAggregatorRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFindingAggregatorRequest, DeleteFindingAggregatorResult> asyncHandler) {
        final DeleteFindingAggregatorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFindingAggregatorResult>() {
            @Override
            public DeleteFindingAggregatorResult call() throws Exception {
                DeleteFindingAggregatorResult result = null;

                try {
                    result = executeDeleteFindingAggregator(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteInsightResult> deleteInsightAsync(DeleteInsightRequest request) {

        return deleteInsightAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInsightResult> deleteInsightAsync(final DeleteInsightRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInsightRequest, DeleteInsightResult> asyncHandler) {
        final DeleteInsightRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInsightResult>() {
            @Override
            public DeleteInsightResult call() throws Exception {
                DeleteInsightResult result = null;

                try {
                    result = executeDeleteInsight(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(DeleteInvitationsRequest request) {

        return deleteInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteInvitationsResult> deleteInvitationsAsync(final DeleteInvitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteInvitationsRequest, DeleteInvitationsResult> asyncHandler) {
        final DeleteInvitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteInvitationsResult>() {
            @Override
            public DeleteInvitationsResult call() throws Exception {
                DeleteInvitationsResult result = null;

                try {
                    result = executeDeleteInvitations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(DeleteMembersRequest request) {

        return deleteMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMembersResult> deleteMembersAsync(final DeleteMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMembersRequest, DeleteMembersResult> asyncHandler) {
        final DeleteMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMembersResult>() {
            @Override
            public DeleteMembersResult call() throws Exception {
                DeleteMembersResult result = null;

                try {
                    result = executeDeleteMembers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeActionTargetsResult> describeActionTargetsAsync(DescribeActionTargetsRequest request) {

        return describeActionTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeActionTargetsResult> describeActionTargetsAsync(final DescribeActionTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeActionTargetsRequest, DescribeActionTargetsResult> asyncHandler) {
        final DescribeActionTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeActionTargetsResult>() {
            @Override
            public DescribeActionTargetsResult call() throws Exception {
                DescribeActionTargetsResult result = null;

                try {
                    result = executeDescribeActionTargets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeHubResult> describeHubAsync(DescribeHubRequest request) {

        return describeHubAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeHubResult> describeHubAsync(final DescribeHubRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeHubRequest, DescribeHubResult> asyncHandler) {
        final DescribeHubRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeHubResult>() {
            @Override
            public DescribeHubResult call() throws Exception {
                DescribeHubResult result = null;

                try {
                    result = executeDescribeHub(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            DescribeOrganizationConfigurationRequest request) {

        return describeOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrganizationConfigurationResult> describeOrganizationConfigurationAsync(
            final DescribeOrganizationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeOrganizationConfigurationRequest, DescribeOrganizationConfigurationResult> asyncHandler) {
        final DescribeOrganizationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeOrganizationConfigurationResult>() {
            @Override
            public DescribeOrganizationConfigurationResult call() throws Exception {
                DescribeOrganizationConfigurationResult result = null;

                try {
                    result = executeDescribeOrganizationConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeProductsResult> describeProductsAsync(DescribeProductsRequest request) {

        return describeProductsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeProductsResult> describeProductsAsync(final DescribeProductsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeProductsRequest, DescribeProductsResult> asyncHandler) {
        final DescribeProductsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeProductsResult>() {
            @Override
            public DescribeProductsResult call() throws Exception {
                DescribeProductsResult result = null;

                try {
                    result = executeDescribeProducts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeStandardsResult> describeStandardsAsync(DescribeStandardsRequest request) {

        return describeStandardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStandardsResult> describeStandardsAsync(final DescribeStandardsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStandardsRequest, DescribeStandardsResult> asyncHandler) {
        final DescribeStandardsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStandardsResult>() {
            @Override
            public DescribeStandardsResult call() throws Exception {
                DescribeStandardsResult result = null;

                try {
                    result = executeDescribeStandards(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeStandardsControlsResult> describeStandardsControlsAsync(DescribeStandardsControlsRequest request) {

        return describeStandardsControlsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStandardsControlsResult> describeStandardsControlsAsync(final DescribeStandardsControlsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStandardsControlsRequest, DescribeStandardsControlsResult> asyncHandler) {
        final DescribeStandardsControlsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeStandardsControlsResult>() {
            @Override
            public DescribeStandardsControlsResult call() throws Exception {
                DescribeStandardsControlsResult result = null;

                try {
                    result = executeDescribeStandardsControls(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisableImportFindingsForProductResult> disableImportFindingsForProductAsync(
            DisableImportFindingsForProductRequest request) {

        return disableImportFindingsForProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableImportFindingsForProductResult> disableImportFindingsForProductAsync(
            final DisableImportFindingsForProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableImportFindingsForProductRequest, DisableImportFindingsForProductResult> asyncHandler) {
        final DisableImportFindingsForProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableImportFindingsForProductResult>() {
            @Override
            public DisableImportFindingsForProductResult call() throws Exception {
                DisableImportFindingsForProductResult result = null;

                try {
                    result = executeDisableImportFindingsForProduct(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            DisableOrganizationAdminAccountRequest request) {

        return disableOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableOrganizationAdminAccountResult> disableOrganizationAdminAccountAsync(
            final DisableOrganizationAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableOrganizationAdminAccountRequest, DisableOrganizationAdminAccountResult> asyncHandler) {
        final DisableOrganizationAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableOrganizationAdminAccountResult>() {
            @Override
            public DisableOrganizationAdminAccountResult call() throws Exception {
                DisableOrganizationAdminAccountResult result = null;

                try {
                    result = executeDisableOrganizationAdminAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisableSecurityHubResult> disableSecurityHubAsync(DisableSecurityHubRequest request) {

        return disableSecurityHubAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableSecurityHubResult> disableSecurityHubAsync(final DisableSecurityHubRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableSecurityHubRequest, DisableSecurityHubResult> asyncHandler) {
        final DisableSecurityHubRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableSecurityHubResult>() {
            @Override
            public DisableSecurityHubResult call() throws Exception {
                DisableSecurityHubResult result = null;

                try {
                    result = executeDisableSecurityHub(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateFromAdministratorAccountResult> disassociateFromAdministratorAccountAsync(
            DisassociateFromAdministratorAccountRequest request) {

        return disassociateFromAdministratorAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateFromAdministratorAccountResult> disassociateFromAdministratorAccountAsync(
            final DisassociateFromAdministratorAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateFromAdministratorAccountRequest, DisassociateFromAdministratorAccountResult> asyncHandler) {
        final DisassociateFromAdministratorAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateFromAdministratorAccountResult>() {
            @Override
            public DisassociateFromAdministratorAccountResult call() throws Exception {
                DisassociateFromAdministratorAccountResult result = null;

                try {
                    result = executeDisassociateFromAdministratorAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(DisassociateFromMasterAccountRequest request) {

        return disassociateFromMasterAccountAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DisassociateFromMasterAccountResult> disassociateFromMasterAccountAsync(
            final DisassociateFromMasterAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateFromMasterAccountRequest, DisassociateFromMasterAccountResult> asyncHandler) {
        final DisassociateFromMasterAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateFromMasterAccountResult>() {
            @Override
            public DisassociateFromMasterAccountResult call() throws Exception {
                DisassociateFromMasterAccountResult result = null;

                try {
                    result = executeDisassociateFromMasterAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(DisassociateMembersRequest request) {

        return disassociateMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateMembersResult> disassociateMembersAsync(final DisassociateMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateMembersRequest, DisassociateMembersResult> asyncHandler) {
        final DisassociateMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateMembersResult>() {
            @Override
            public DisassociateMembersResult call() throws Exception {
                DisassociateMembersResult result = null;

                try {
                    result = executeDisassociateMembers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EnableImportFindingsForProductResult> enableImportFindingsForProductAsync(EnableImportFindingsForProductRequest request) {

        return enableImportFindingsForProductAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableImportFindingsForProductResult> enableImportFindingsForProductAsync(
            final EnableImportFindingsForProductRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableImportFindingsForProductRequest, EnableImportFindingsForProductResult> asyncHandler) {
        final EnableImportFindingsForProductRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableImportFindingsForProductResult>() {
            @Override
            public EnableImportFindingsForProductResult call() throws Exception {
                EnableImportFindingsForProductResult result = null;

                try {
                    result = executeEnableImportFindingsForProduct(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(EnableOrganizationAdminAccountRequest request) {

        return enableOrganizationAdminAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableOrganizationAdminAccountResult> enableOrganizationAdminAccountAsync(
            final EnableOrganizationAdminAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableOrganizationAdminAccountRequest, EnableOrganizationAdminAccountResult> asyncHandler) {
        final EnableOrganizationAdminAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableOrganizationAdminAccountResult>() {
            @Override
            public EnableOrganizationAdminAccountResult call() throws Exception {
                EnableOrganizationAdminAccountResult result = null;

                try {
                    result = executeEnableOrganizationAdminAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<EnableSecurityHubResult> enableSecurityHubAsync(EnableSecurityHubRequest request) {

        return enableSecurityHubAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableSecurityHubResult> enableSecurityHubAsync(final EnableSecurityHubRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableSecurityHubRequest, EnableSecurityHubResult> asyncHandler) {
        final EnableSecurityHubRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableSecurityHubResult>() {
            @Override
            public EnableSecurityHubResult call() throws Exception {
                EnableSecurityHubResult result = null;

                try {
                    result = executeEnableSecurityHub(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetAdministratorAccountResult> getAdministratorAccountAsync(GetAdministratorAccountRequest request) {

        return getAdministratorAccountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAdministratorAccountResult> getAdministratorAccountAsync(final GetAdministratorAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAdministratorAccountRequest, GetAdministratorAccountResult> asyncHandler) {
        final GetAdministratorAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAdministratorAccountResult>() {
            @Override
            public GetAdministratorAccountResult call() throws Exception {
                GetAdministratorAccountResult result = null;

                try {
                    result = executeGetAdministratorAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationPolicyResult> getConfigurationPolicyAsync(GetConfigurationPolicyRequest request) {

        return getConfigurationPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationPolicyResult> getConfigurationPolicyAsync(final GetConfigurationPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfigurationPolicyRequest, GetConfigurationPolicyResult> asyncHandler) {
        final GetConfigurationPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfigurationPolicyResult>() {
            @Override
            public GetConfigurationPolicyResult call() throws Exception {
                GetConfigurationPolicyResult result = null;

                try {
                    result = executeGetConfigurationPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationPolicyAssociationResult> getConfigurationPolicyAssociationAsync(
            GetConfigurationPolicyAssociationRequest request) {

        return getConfigurationPolicyAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetConfigurationPolicyAssociationResult> getConfigurationPolicyAssociationAsync(
            final GetConfigurationPolicyAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetConfigurationPolicyAssociationRequest, GetConfigurationPolicyAssociationResult> asyncHandler) {
        final GetConfigurationPolicyAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetConfigurationPolicyAssociationResult>() {
            @Override
            public GetConfigurationPolicyAssociationResult call() throws Exception {
                GetConfigurationPolicyAssociationResult result = null;

                try {
                    result = executeGetConfigurationPolicyAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetEnabledStandardsResult> getEnabledStandardsAsync(GetEnabledStandardsRequest request) {

        return getEnabledStandardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEnabledStandardsResult> getEnabledStandardsAsync(final GetEnabledStandardsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEnabledStandardsRequest, GetEnabledStandardsResult> asyncHandler) {
        final GetEnabledStandardsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetEnabledStandardsResult>() {
            @Override
            public GetEnabledStandardsResult call() throws Exception {
                GetEnabledStandardsResult result = null;

                try {
                    result = executeGetEnabledStandards(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFindingAggregatorResult> getFindingAggregatorAsync(GetFindingAggregatorRequest request) {

        return getFindingAggregatorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingAggregatorResult> getFindingAggregatorAsync(final GetFindingAggregatorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFindingAggregatorRequest, GetFindingAggregatorResult> asyncHandler) {
        final GetFindingAggregatorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFindingAggregatorResult>() {
            @Override
            public GetFindingAggregatorResult call() throws Exception {
                GetFindingAggregatorResult result = null;

                try {
                    result = executeGetFindingAggregator(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFindingHistoryResult> getFindingHistoryAsync(GetFindingHistoryRequest request) {

        return getFindingHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingHistoryResult> getFindingHistoryAsync(final GetFindingHistoryRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFindingHistoryRequest, GetFindingHistoryResult> asyncHandler) {
        final GetFindingHistoryRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFindingHistoryResult>() {
            @Override
            public GetFindingHistoryResult call() throws Exception {
                GetFindingHistoryResult result = null;

                try {
                    result = executeGetFindingHistory(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(GetFindingsRequest request) {

        return getFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFindingsResult> getFindingsAsync(final GetFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFindingsRequest, GetFindingsResult> asyncHandler) {
        final GetFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetFindingsResult>() {
            @Override
            public GetFindingsResult call() throws Exception {
                GetFindingsResult result = null;

                try {
                    result = executeGetFindings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetInsightResultsResult> getInsightResultsAsync(GetInsightResultsRequest request) {

        return getInsightResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInsightResultsResult> getInsightResultsAsync(final GetInsightResultsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInsightResultsRequest, GetInsightResultsResult> asyncHandler) {
        final GetInsightResultsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInsightResultsResult>() {
            @Override
            public GetInsightResultsResult call() throws Exception {
                GetInsightResultsResult result = null;

                try {
                    result = executeGetInsightResults(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetInsightsResult> getInsightsAsync(GetInsightsRequest request) {

        return getInsightsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInsightsResult> getInsightsAsync(final GetInsightsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInsightsRequest, GetInsightsResult> asyncHandler) {
        final GetInsightsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInsightsResult>() {
            @Override
            public GetInsightsResult call() throws Exception {
                GetInsightsResult result = null;

                try {
                    result = executeGetInsights(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(GetInvitationsCountRequest request) {

        return getInvitationsCountAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInvitationsCountResult> getInvitationsCountAsync(final GetInvitationsCountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInvitationsCountRequest, GetInvitationsCountResult> asyncHandler) {
        final GetInvitationsCountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInvitationsCountResult>() {
            @Override
            public GetInvitationsCountResult call() throws Exception {
                GetInvitationsCountResult result = null;

                try {
                    result = executeGetInvitationsCount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(GetMasterAccountRequest request) {

        return getMasterAccountAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<GetMasterAccountResult> getMasterAccountAsync(final GetMasterAccountRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMasterAccountRequest, GetMasterAccountResult> asyncHandler) {
        final GetMasterAccountRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMasterAccountResult>() {
            @Override
            public GetMasterAccountResult call() throws Exception {
                GetMasterAccountResult result = null;

                try {
                    result = executeGetMasterAccount(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetMembersResult> getMembersAsync(GetMembersRequest request) {

        return getMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMembersResult> getMembersAsync(final GetMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetMembersRequest, GetMembersResult> asyncHandler) {
        final GetMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetMembersResult>() {
            @Override
            public GetMembersResult call() throws Exception {
                GetMembersResult result = null;

                try {
                    result = executeGetMembers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetSecurityControlDefinitionResult> getSecurityControlDefinitionAsync(GetSecurityControlDefinitionRequest request) {

        return getSecurityControlDefinitionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSecurityControlDefinitionResult> getSecurityControlDefinitionAsync(final GetSecurityControlDefinitionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSecurityControlDefinitionRequest, GetSecurityControlDefinitionResult> asyncHandler) {
        final GetSecurityControlDefinitionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSecurityControlDefinitionResult>() {
            @Override
            public GetSecurityControlDefinitionResult call() throws Exception {
                GetSecurityControlDefinitionResult result = null;

                try {
                    result = executeGetSecurityControlDefinition(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(InviteMembersRequest request) {

        return inviteMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<InviteMembersResult> inviteMembersAsync(final InviteMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<InviteMembersRequest, InviteMembersResult> asyncHandler) {
        final InviteMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<InviteMembersResult>() {
            @Override
            public InviteMembersResult call() throws Exception {
                InviteMembersResult result = null;

                try {
                    result = executeInviteMembers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAutomationRulesResult> listAutomationRulesAsync(ListAutomationRulesRequest request) {

        return listAutomationRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAutomationRulesResult> listAutomationRulesAsync(final ListAutomationRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAutomationRulesRequest, ListAutomationRulesResult> asyncHandler) {
        final ListAutomationRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAutomationRulesResult>() {
            @Override
            public ListAutomationRulesResult call() throws Exception {
                ListAutomationRulesResult result = null;

                try {
                    result = executeListAutomationRules(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationPoliciesResult> listConfigurationPoliciesAsync(ListConfigurationPoliciesRequest request) {

        return listConfigurationPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationPoliciesResult> listConfigurationPoliciesAsync(final ListConfigurationPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationPoliciesRequest, ListConfigurationPoliciesResult> asyncHandler) {
        final ListConfigurationPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationPoliciesResult>() {
            @Override
            public ListConfigurationPoliciesResult call() throws Exception {
                ListConfigurationPoliciesResult result = null;

                try {
                    result = executeListConfigurationPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationPolicyAssociationsResult> listConfigurationPolicyAssociationsAsync(
            ListConfigurationPolicyAssociationsRequest request) {

        return listConfigurationPolicyAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConfigurationPolicyAssociationsResult> listConfigurationPolicyAssociationsAsync(
            final ListConfigurationPolicyAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListConfigurationPolicyAssociationsRequest, ListConfigurationPolicyAssociationsResult> asyncHandler) {
        final ListConfigurationPolicyAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListConfigurationPolicyAssociationsResult>() {
            @Override
            public ListConfigurationPolicyAssociationsResult call() throws Exception {
                ListConfigurationPolicyAssociationsResult result = null;

                try {
                    result = executeListConfigurationPolicyAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListEnabledProductsForImportResult> listEnabledProductsForImportAsync(ListEnabledProductsForImportRequest request) {

        return listEnabledProductsForImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEnabledProductsForImportResult> listEnabledProductsForImportAsync(final ListEnabledProductsForImportRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEnabledProductsForImportRequest, ListEnabledProductsForImportResult> asyncHandler) {
        final ListEnabledProductsForImportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEnabledProductsForImportResult>() {
            @Override
            public ListEnabledProductsForImportResult call() throws Exception {
                ListEnabledProductsForImportResult result = null;

                try {
                    result = executeListEnabledProductsForImport(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFindingAggregatorsResult> listFindingAggregatorsAsync(ListFindingAggregatorsRequest request) {

        return listFindingAggregatorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingAggregatorsResult> listFindingAggregatorsAsync(final ListFindingAggregatorsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFindingAggregatorsRequest, ListFindingAggregatorsResult> asyncHandler) {
        final ListFindingAggregatorsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFindingAggregatorsResult>() {
            @Override
            public ListFindingAggregatorsResult call() throws Exception {
                ListFindingAggregatorsResult result = null;

                try {
                    result = executeListFindingAggregators(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(ListInvitationsRequest request) {

        return listInvitationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInvitationsResult> listInvitationsAsync(final ListInvitationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListInvitationsRequest, ListInvitationsResult> asyncHandler) {
        final ListInvitationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListInvitationsResult>() {
            @Override
            public ListInvitationsResult call() throws Exception {
                ListInvitationsResult result = null;

                try {
                    result = executeListInvitations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(ListMembersRequest request) {

        return listMembersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMembersResult> listMembersAsync(final ListMembersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListMembersRequest, ListMembersResult> asyncHandler) {
        final ListMembersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListMembersResult>() {
            @Override
            public ListMembersResult call() throws Exception {
                ListMembersResult result = null;

                try {
                    result = executeListMembers(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(ListOrganizationAdminAccountsRequest request) {

        return listOrganizationAdminAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOrganizationAdminAccountsResult> listOrganizationAdminAccountsAsync(
            final ListOrganizationAdminAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListOrganizationAdminAccountsRequest, ListOrganizationAdminAccountsResult> asyncHandler) {
        final ListOrganizationAdminAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListOrganizationAdminAccountsResult>() {
            @Override
            public ListOrganizationAdminAccountsResult call() throws Exception {
                ListOrganizationAdminAccountsResult result = null;

                try {
                    result = executeListOrganizationAdminAccounts(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListSecurityControlDefinitionsResult> listSecurityControlDefinitionsAsync(ListSecurityControlDefinitionsRequest request) {

        return listSecurityControlDefinitionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSecurityControlDefinitionsResult> listSecurityControlDefinitionsAsync(
            final ListSecurityControlDefinitionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSecurityControlDefinitionsRequest, ListSecurityControlDefinitionsResult> asyncHandler) {
        final ListSecurityControlDefinitionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSecurityControlDefinitionsResult>() {
            @Override
            public ListSecurityControlDefinitionsResult call() throws Exception {
                ListSecurityControlDefinitionsResult result = null;

                try {
                    result = executeListSecurityControlDefinitions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListStandardsControlAssociationsResult> listStandardsControlAssociationsAsync(
            ListStandardsControlAssociationsRequest request) {

        return listStandardsControlAssociationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStandardsControlAssociationsResult> listStandardsControlAssociationsAsync(
            final ListStandardsControlAssociationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStandardsControlAssociationsRequest, ListStandardsControlAssociationsResult> asyncHandler) {
        final ListStandardsControlAssociationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListStandardsControlAssociationsResult>() {
            @Override
            public ListStandardsControlAssociationsResult call() throws Exception {
                ListStandardsControlAssociationsResult result = null;

                try {
                    result = executeListStandardsControlAssociations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(final ListTagsForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {
        final ListTagsForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTagsForResourceResult>() {
            @Override
            public ListTagsForResourceResult call() throws Exception {
                ListTagsForResourceResult result = null;

                try {
                    result = executeListTagsForResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartConfigurationPolicyAssociationResult> startConfigurationPolicyAssociationAsync(
            StartConfigurationPolicyAssociationRequest request) {

        return startConfigurationPolicyAssociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartConfigurationPolicyAssociationResult> startConfigurationPolicyAssociationAsync(
            final StartConfigurationPolicyAssociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartConfigurationPolicyAssociationRequest, StartConfigurationPolicyAssociationResult> asyncHandler) {
        final StartConfigurationPolicyAssociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartConfigurationPolicyAssociationResult>() {
            @Override
            public StartConfigurationPolicyAssociationResult call() throws Exception {
                StartConfigurationPolicyAssociationResult result = null;

                try {
                    result = executeStartConfigurationPolicyAssociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartConfigurationPolicyDisassociationResult> startConfigurationPolicyDisassociationAsync(
            StartConfigurationPolicyDisassociationRequest request) {

        return startConfigurationPolicyDisassociationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartConfigurationPolicyDisassociationResult> startConfigurationPolicyDisassociationAsync(
            final StartConfigurationPolicyDisassociationRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartConfigurationPolicyDisassociationRequest, StartConfigurationPolicyDisassociationResult> asyncHandler) {
        final StartConfigurationPolicyDisassociationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartConfigurationPolicyDisassociationResult>() {
            @Override
            public StartConfigurationPolicyDisassociationResult call() throws Exception {
                StartConfigurationPolicyDisassociationResult result = null;

                try {
                    result = executeStartConfigurationPolicyDisassociation(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(final TagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {
        final TagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TagResourceResult>() {
            @Override
            public TagResourceResult call() throws Exception {
                TagResourceResult result = null;

                try {
                    result = executeTagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(final UntagResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {
        final UntagResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UntagResourceResult>() {
            @Override
            public UntagResourceResult call() throws Exception {
                UntagResourceResult result = null;

                try {
                    result = executeUntagResource(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateActionTargetResult> updateActionTargetAsync(UpdateActionTargetRequest request) {

        return updateActionTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateActionTargetResult> updateActionTargetAsync(final UpdateActionTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateActionTargetRequest, UpdateActionTargetResult> asyncHandler) {
        final UpdateActionTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateActionTargetResult>() {
            @Override
            public UpdateActionTargetResult call() throws Exception {
                UpdateActionTargetResult result = null;

                try {
                    result = executeUpdateActionTarget(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationPolicyResult> updateConfigurationPolicyAsync(UpdateConfigurationPolicyRequest request) {

        return updateConfigurationPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConfigurationPolicyResult> updateConfigurationPolicyAsync(final UpdateConfigurationPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateConfigurationPolicyRequest, UpdateConfigurationPolicyResult> asyncHandler) {
        final UpdateConfigurationPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateConfigurationPolicyResult>() {
            @Override
            public UpdateConfigurationPolicyResult call() throws Exception {
                UpdateConfigurationPolicyResult result = null;

                try {
                    result = executeUpdateConfigurationPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingAggregatorResult> updateFindingAggregatorAsync(UpdateFindingAggregatorRequest request) {

        return updateFindingAggregatorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingAggregatorResult> updateFindingAggregatorAsync(final UpdateFindingAggregatorRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFindingAggregatorRequest, UpdateFindingAggregatorResult> asyncHandler) {
        final UpdateFindingAggregatorRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFindingAggregatorResult>() {
            @Override
            public UpdateFindingAggregatorResult call() throws Exception {
                UpdateFindingAggregatorResult result = null;

                try {
                    result = executeUpdateFindingAggregator(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(UpdateFindingsRequest request) {

        return updateFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFindingsResult> updateFindingsAsync(final UpdateFindingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFindingsRequest, UpdateFindingsResult> asyncHandler) {
        final UpdateFindingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFindingsResult>() {
            @Override
            public UpdateFindingsResult call() throws Exception {
                UpdateFindingsResult result = null;

                try {
                    result = executeUpdateFindings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateInsightResult> updateInsightAsync(UpdateInsightRequest request) {

        return updateInsightAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateInsightResult> updateInsightAsync(final UpdateInsightRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateInsightRequest, UpdateInsightResult> asyncHandler) {
        final UpdateInsightRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateInsightResult>() {
            @Override
            public UpdateInsightResult call() throws Exception {
                UpdateInsightResult result = null;

                try {
                    result = executeUpdateInsight(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            UpdateOrganizationConfigurationRequest request) {

        return updateOrganizationConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateOrganizationConfigurationResult> updateOrganizationConfigurationAsync(
            final UpdateOrganizationConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateOrganizationConfigurationRequest, UpdateOrganizationConfigurationResult> asyncHandler) {
        final UpdateOrganizationConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateOrganizationConfigurationResult>() {
            @Override
            public UpdateOrganizationConfigurationResult call() throws Exception {
                UpdateOrganizationConfigurationResult result = null;

                try {
                    result = executeUpdateOrganizationConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityControlResult> updateSecurityControlAsync(UpdateSecurityControlRequest request) {

        return updateSecurityControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityControlResult> updateSecurityControlAsync(final UpdateSecurityControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSecurityControlRequest, UpdateSecurityControlResult> asyncHandler) {
        final UpdateSecurityControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSecurityControlResult>() {
            @Override
            public UpdateSecurityControlResult call() throws Exception {
                UpdateSecurityControlResult result = null;

                try {
                    result = executeUpdateSecurityControl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityHubConfigurationResult> updateSecurityHubConfigurationAsync(UpdateSecurityHubConfigurationRequest request) {

        return updateSecurityHubConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSecurityHubConfigurationResult> updateSecurityHubConfigurationAsync(
            final UpdateSecurityHubConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSecurityHubConfigurationRequest, UpdateSecurityHubConfigurationResult> asyncHandler) {
        final UpdateSecurityHubConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSecurityHubConfigurationResult>() {
            @Override
            public UpdateSecurityHubConfigurationResult call() throws Exception {
                UpdateSecurityHubConfigurationResult result = null;

                try {
                    result = executeUpdateSecurityHubConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateStandardsControlResult> updateStandardsControlAsync(UpdateStandardsControlRequest request) {

        return updateStandardsControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateStandardsControlResult> updateStandardsControlAsync(final UpdateStandardsControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateStandardsControlRequest, UpdateStandardsControlResult> asyncHandler) {
        final UpdateStandardsControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateStandardsControlResult>() {
            @Override
            public UpdateStandardsControlResult call() throws Exception {
                UpdateStandardsControlResult result = null;

                try {
                    result = executeUpdateStandardsControl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
