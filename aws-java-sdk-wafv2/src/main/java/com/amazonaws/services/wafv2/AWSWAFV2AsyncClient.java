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
package com.amazonaws.services.wafv2;

import javax.annotation.Generated;

import com.amazonaws.services.wafv2.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing WAFV2 asynchronously. Each asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive notification when an
 * asynchronous operation completes.
 * <p>
 * <note>
 * <p>
 * This is the latest version of the <b>AWS WAF</b> API, released in November, 2019. The names of the entities that you
 * use to access this API, like endpoints and namespaces, all have the versioning information added, like "V2" or "v2",
 * to distinguish from the prior version. We recommend migrating your resources to this version, because it has a number
 * of significant improvements.
 * </p>
 * <p>
 * If you used AWS WAF prior to this release, you can't use this AWS WAFV2 API to access any AWS WAF resources that you
 * created before. You can access your old rules, web ACLs, and other AWS WAF resources only through the AWS WAF Classic
 * APIs. The AWS WAF Classic APIs have retained the prior names, endpoints, and namespaces.
 * </p>
 * <p>
 * For information, including how to migrate your AWS WAF resources to this version, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/waf-chapter.html">AWS WAF Developer Guide</a>.
 * </p>
 * </note>
 * <p>
 * AWS WAF is a web application firewall that lets you monitor the HTTP and HTTPS requests that are forwarded to Amazon
 * CloudFront, an Amazon API Gateway API, or an Application Load Balancer. AWS WAF also lets you control access to your
 * content. Based on conditions that you specify, such as the IP addresses that requests originate from or the values of
 * query strings, API Gateway, CloudFront, or the Application Load Balancer responds to requests either with the
 * requested content or with an HTTP 403 status code (Forbidden). You also can configure CloudFront to return a custom
 * error page when a request is blocked.
 * </p>
 * <p>
 * This API guide is for developers who need detailed information about AWS WAF API actions, data types, and errors. For
 * detailed information about AWS WAF features and an overview of how to use AWS WAF, see the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF Developer Guide</a>.
 * </p>
 * <p>
 * You can make API calls using the endpoints listed in <a
 * href="https://docs.aws.amazon.com/general/latest/gr/rande.html#waf_region">AWS Service Endpoints for AWS WAF</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * For regional applications, you can use any of the endpoints in the list. A regional application can be an Application
 * Load Balancer (ALB) or an API Gateway stage.
 * </p>
 * </li>
 * <li>
 * <p>
 * For AWS CloudFront applications, you must use the API endpoint listed for US East (N. Virginia): us-east-1.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Alternatively, you can use one of the AWS SDKs to access an API that's tailored to the programming language or
 * platform that you're using. For more information, see <a href="http://aws.amazon.com/tools/#SDKs">AWS SDKs</a>.
 * </p>
 * <p>
 * We currently provide two versions of the AWS WAF API: this API and the prior versions, the classic AWS WAF APIs. This
 * new API provides the same functionality as the older versions, with the following major improvements:
 * </p>
 * <ul>
 * <li>
 * <p>
 * You use one API for both global and regional applications. Where you need to distinguish the scope, you specify a
 * <code>Scope</code> parameter and set it to <code>CLOUDFRONT</code> or <code>REGIONAL</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can define a Web ACL or rule group with a single API call, and update it with a single call. You define all rule
 * specifications in JSON format, and pass them to your rule group or Web ACL API calls.
 * </p>
 * </li>
 * <li>
 * <p>
 * The limits AWS WAF places on the use of rules more closely reflects the cost of running each type of rule. Rule
 * groups include capacity settings, so you know the maximum cost of a rule group when you use it.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSWAFV2AsyncClient extends AWSWAFV2Client implements AWSWAFV2Async {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSWAFV2AsyncClientBuilder asyncBuilder() {
        return AWSWAFV2AsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on WAFV2 using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSWAFV2AsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
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
    public java.util.concurrent.Future<AssociateWebACLResult> associateWebACLAsync(AssociateWebACLRequest request) {

        return associateWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssociateWebACLResult> associateWebACLAsync(final AssociateWebACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssociateWebACLRequest, AssociateWebACLResult> asyncHandler) {
        final AssociateWebACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AssociateWebACLResult>() {
            @Override
            public AssociateWebACLResult call() throws Exception {
                AssociateWebACLResult result = null;

                try {
                    result = executeAssociateWebACL(finalRequest);
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
    public java.util.concurrent.Future<CheckCapacityResult> checkCapacityAsync(CheckCapacityRequest request) {

        return checkCapacityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CheckCapacityResult> checkCapacityAsync(final CheckCapacityRequest request,
            final com.amazonaws.handlers.AsyncHandler<CheckCapacityRequest, CheckCapacityResult> asyncHandler) {
        final CheckCapacityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CheckCapacityResult>() {
            @Override
            public CheckCapacityResult call() throws Exception {
                CheckCapacityResult result = null;

                try {
                    result = executeCheckCapacity(finalRequest);
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
    public java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(CreateIPSetRequest request) {

        return createIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIPSetResult> createIPSetAsync(final CreateIPSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIPSetRequest, CreateIPSetResult> asyncHandler) {
        final CreateIPSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIPSetResult>() {
            @Override
            public CreateIPSetResult call() throws Exception {
                CreateIPSetResult result = null;

                try {
                    result = executeCreateIPSet(finalRequest);
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
    public java.util.concurrent.Future<CreateRegexPatternSetResult> createRegexPatternSetAsync(CreateRegexPatternSetRequest request) {

        return createRegexPatternSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRegexPatternSetResult> createRegexPatternSetAsync(final CreateRegexPatternSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRegexPatternSetRequest, CreateRegexPatternSetResult> asyncHandler) {
        final CreateRegexPatternSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRegexPatternSetResult>() {
            @Override
            public CreateRegexPatternSetResult call() throws Exception {
                CreateRegexPatternSetResult result = null;

                try {
                    result = executeCreateRegexPatternSet(finalRequest);
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
    public java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(CreateRuleGroupRequest request) {

        return createRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleGroupResult> createRuleGroupAsync(final CreateRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRuleGroupRequest, CreateRuleGroupResult> asyncHandler) {
        final CreateRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRuleGroupResult>() {
            @Override
            public CreateRuleGroupResult call() throws Exception {
                CreateRuleGroupResult result = null;

                try {
                    result = executeCreateRuleGroup(finalRequest);
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
    public java.util.concurrent.Future<CreateWebACLResult> createWebACLAsync(CreateWebACLRequest request) {

        return createWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateWebACLResult> createWebACLAsync(final CreateWebACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateWebACLRequest, CreateWebACLResult> asyncHandler) {
        final CreateWebACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateWebACLResult>() {
            @Override
            public CreateWebACLResult call() throws Exception {
                CreateWebACLResult result = null;

                try {
                    result = executeCreateWebACL(finalRequest);
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
    public java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(DeleteIPSetRequest request) {

        return deleteIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIPSetResult> deleteIPSetAsync(final DeleteIPSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIPSetRequest, DeleteIPSetResult> asyncHandler) {
        final DeleteIPSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIPSetResult>() {
            @Override
            public DeleteIPSetResult call() throws Exception {
                DeleteIPSetResult result = null;

                try {
                    result = executeDeleteIPSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(DeleteLoggingConfigurationRequest request) {

        return deleteLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLoggingConfigurationResult> deleteLoggingConfigurationAsync(final DeleteLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLoggingConfigurationRequest, DeleteLoggingConfigurationResult> asyncHandler) {
        final DeleteLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteLoggingConfigurationResult>() {
            @Override
            public DeleteLoggingConfigurationResult call() throws Exception {
                DeleteLoggingConfigurationResult result = null;

                try {
                    result = executeDeleteLoggingConfiguration(finalRequest);
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
    public java.util.concurrent.Future<DeleteRegexPatternSetResult> deleteRegexPatternSetAsync(DeleteRegexPatternSetRequest request) {

        return deleteRegexPatternSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRegexPatternSetResult> deleteRegexPatternSetAsync(final DeleteRegexPatternSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRegexPatternSetRequest, DeleteRegexPatternSetResult> asyncHandler) {
        final DeleteRegexPatternSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRegexPatternSetResult>() {
            @Override
            public DeleteRegexPatternSetResult call() throws Exception {
                DeleteRegexPatternSetResult result = null;

                try {
                    result = executeDeleteRegexPatternSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(DeleteRuleGroupRequest request) {

        return deleteRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleGroupResult> deleteRuleGroupAsync(final DeleteRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRuleGroupRequest, DeleteRuleGroupResult> asyncHandler) {
        final DeleteRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleGroupResult>() {
            @Override
            public DeleteRuleGroupResult call() throws Exception {
                DeleteRuleGroupResult result = null;

                try {
                    result = executeDeleteRuleGroup(finalRequest);
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
    public java.util.concurrent.Future<DeleteWebACLResult> deleteWebACLAsync(DeleteWebACLRequest request) {

        return deleteWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteWebACLResult> deleteWebACLAsync(final DeleteWebACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteWebACLRequest, DeleteWebACLResult> asyncHandler) {
        final DeleteWebACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteWebACLResult>() {
            @Override
            public DeleteWebACLResult call() throws Exception {
                DeleteWebACLResult result = null;

                try {
                    result = executeDeleteWebACL(finalRequest);
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
    public java.util.concurrent.Future<DescribeManagedRuleGroupResult> describeManagedRuleGroupAsync(DescribeManagedRuleGroupRequest request) {

        return describeManagedRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeManagedRuleGroupResult> describeManagedRuleGroupAsync(final DescribeManagedRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeManagedRuleGroupRequest, DescribeManagedRuleGroupResult> asyncHandler) {
        final DescribeManagedRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeManagedRuleGroupResult>() {
            @Override
            public DescribeManagedRuleGroupResult call() throws Exception {
                DescribeManagedRuleGroupResult result = null;

                try {
                    result = executeDescribeManagedRuleGroup(finalRequest);
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
    public java.util.concurrent.Future<DisassociateWebACLResult> disassociateWebACLAsync(DisassociateWebACLRequest request) {

        return disassociateWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisassociateWebACLResult> disassociateWebACLAsync(final DisassociateWebACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisassociateWebACLRequest, DisassociateWebACLResult> asyncHandler) {
        final DisassociateWebACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisassociateWebACLResult>() {
            @Override
            public DisassociateWebACLResult call() throws Exception {
                DisassociateWebACLResult result = null;

                try {
                    result = executeDisassociateWebACL(finalRequest);
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
    public java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(GetIPSetRequest request) {

        return getIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIPSetResult> getIPSetAsync(final GetIPSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIPSetRequest, GetIPSetResult> asyncHandler) {
        final GetIPSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIPSetResult>() {
            @Override
            public GetIPSetResult call() throws Exception {
                GetIPSetResult result = null;

                try {
                    result = executeGetIPSet(finalRequest);
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
    public java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(GetLoggingConfigurationRequest request) {

        return getLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoggingConfigurationResult> getLoggingConfigurationAsync(final GetLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLoggingConfigurationRequest, GetLoggingConfigurationResult> asyncHandler) {
        final GetLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetLoggingConfigurationResult>() {
            @Override
            public GetLoggingConfigurationResult call() throws Exception {
                GetLoggingConfigurationResult result = null;

                try {
                    result = executeGetLoggingConfiguration(finalRequest);
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
    public java.util.concurrent.Future<GetRateBasedStatementManagedKeysResult> getRateBasedStatementManagedKeysAsync(
            GetRateBasedStatementManagedKeysRequest request) {

        return getRateBasedStatementManagedKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRateBasedStatementManagedKeysResult> getRateBasedStatementManagedKeysAsync(
            final GetRateBasedStatementManagedKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRateBasedStatementManagedKeysRequest, GetRateBasedStatementManagedKeysResult> asyncHandler) {
        final GetRateBasedStatementManagedKeysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRateBasedStatementManagedKeysResult>() {
            @Override
            public GetRateBasedStatementManagedKeysResult call() throws Exception {
                GetRateBasedStatementManagedKeysResult result = null;

                try {
                    result = executeGetRateBasedStatementManagedKeys(finalRequest);
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
    public java.util.concurrent.Future<GetRegexPatternSetResult> getRegexPatternSetAsync(GetRegexPatternSetRequest request) {

        return getRegexPatternSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRegexPatternSetResult> getRegexPatternSetAsync(final GetRegexPatternSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRegexPatternSetRequest, GetRegexPatternSetResult> asyncHandler) {
        final GetRegexPatternSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRegexPatternSetResult>() {
            @Override
            public GetRegexPatternSetResult call() throws Exception {
                GetRegexPatternSetResult result = null;

                try {
                    result = executeGetRegexPatternSet(finalRequest);
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
    public java.util.concurrent.Future<GetRuleGroupResult> getRuleGroupAsync(GetRuleGroupRequest request) {

        return getRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRuleGroupResult> getRuleGroupAsync(final GetRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRuleGroupRequest, GetRuleGroupResult> asyncHandler) {
        final GetRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRuleGroupResult>() {
            @Override
            public GetRuleGroupResult call() throws Exception {
                GetRuleGroupResult result = null;

                try {
                    result = executeGetRuleGroup(finalRequest);
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
    public java.util.concurrent.Future<GetSampledRequestsResult> getSampledRequestsAsync(GetSampledRequestsRequest request) {

        return getSampledRequestsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSampledRequestsResult> getSampledRequestsAsync(final GetSampledRequestsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSampledRequestsRequest, GetSampledRequestsResult> asyncHandler) {
        final GetSampledRequestsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetSampledRequestsResult>() {
            @Override
            public GetSampledRequestsResult call() throws Exception {
                GetSampledRequestsResult result = null;

                try {
                    result = executeGetSampledRequests(finalRequest);
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
    public java.util.concurrent.Future<GetWebACLResult> getWebACLAsync(GetWebACLRequest request) {

        return getWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWebACLResult> getWebACLAsync(final GetWebACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWebACLRequest, GetWebACLResult> asyncHandler) {
        final GetWebACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWebACLResult>() {
            @Override
            public GetWebACLResult call() throws Exception {
                GetWebACLResult result = null;

                try {
                    result = executeGetWebACL(finalRequest);
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
    public java.util.concurrent.Future<GetWebACLForResourceResult> getWebACLForResourceAsync(GetWebACLForResourceRequest request) {

        return getWebACLForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetWebACLForResourceResult> getWebACLForResourceAsync(final GetWebACLForResourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetWebACLForResourceRequest, GetWebACLForResourceResult> asyncHandler) {
        final GetWebACLForResourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetWebACLForResourceResult>() {
            @Override
            public GetWebACLForResourceResult call() throws Exception {
                GetWebACLForResourceResult result = null;

                try {
                    result = executeGetWebACLForResource(finalRequest);
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
    public java.util.concurrent.Future<ListAvailableManagedRuleGroupsResult> listAvailableManagedRuleGroupsAsync(ListAvailableManagedRuleGroupsRequest request) {

        return listAvailableManagedRuleGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAvailableManagedRuleGroupsResult> listAvailableManagedRuleGroupsAsync(
            final ListAvailableManagedRuleGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAvailableManagedRuleGroupsRequest, ListAvailableManagedRuleGroupsResult> asyncHandler) {
        final ListAvailableManagedRuleGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAvailableManagedRuleGroupsResult>() {
            @Override
            public ListAvailableManagedRuleGroupsResult call() throws Exception {
                ListAvailableManagedRuleGroupsResult result = null;

                try {
                    result = executeListAvailableManagedRuleGroups(finalRequest);
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
    public java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(ListIPSetsRequest request) {

        return listIPSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIPSetsResult> listIPSetsAsync(final ListIPSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIPSetsRequest, ListIPSetsResult> asyncHandler) {
        final ListIPSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIPSetsResult>() {
            @Override
            public ListIPSetsResult call() throws Exception {
                ListIPSetsResult result = null;

                try {
                    result = executeListIPSets(finalRequest);
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
    public java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(ListLoggingConfigurationsRequest request) {

        return listLoggingConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLoggingConfigurationsResult> listLoggingConfigurationsAsync(final ListLoggingConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListLoggingConfigurationsRequest, ListLoggingConfigurationsResult> asyncHandler) {
        final ListLoggingConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListLoggingConfigurationsResult>() {
            @Override
            public ListLoggingConfigurationsResult call() throws Exception {
                ListLoggingConfigurationsResult result = null;

                try {
                    result = executeListLoggingConfigurations(finalRequest);
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
    public java.util.concurrent.Future<ListRegexPatternSetsResult> listRegexPatternSetsAsync(ListRegexPatternSetsRequest request) {

        return listRegexPatternSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRegexPatternSetsResult> listRegexPatternSetsAsync(final ListRegexPatternSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRegexPatternSetsRequest, ListRegexPatternSetsResult> asyncHandler) {
        final ListRegexPatternSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRegexPatternSetsResult>() {
            @Override
            public ListRegexPatternSetsResult call() throws Exception {
                ListRegexPatternSetsResult result = null;

                try {
                    result = executeListRegexPatternSets(finalRequest);
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
    public java.util.concurrent.Future<ListResourcesForWebACLResult> listResourcesForWebACLAsync(ListResourcesForWebACLRequest request) {

        return listResourcesForWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResourcesForWebACLResult> listResourcesForWebACLAsync(final ListResourcesForWebACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResourcesForWebACLRequest, ListResourcesForWebACLResult> asyncHandler) {
        final ListResourcesForWebACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResourcesForWebACLResult>() {
            @Override
            public ListResourcesForWebACLResult call() throws Exception {
                ListResourcesForWebACLResult result = null;

                try {
                    result = executeListResourcesForWebACL(finalRequest);
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
    public java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(ListRuleGroupsRequest request) {

        return listRuleGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRuleGroupsResult> listRuleGroupsAsync(final ListRuleGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRuleGroupsRequest, ListRuleGroupsResult> asyncHandler) {
        final ListRuleGroupsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRuleGroupsResult>() {
            @Override
            public ListRuleGroupsResult call() throws Exception {
                ListRuleGroupsResult result = null;

                try {
                    result = executeListRuleGroups(finalRequest);
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
    public java.util.concurrent.Future<ListWebACLsResult> listWebACLsAsync(ListWebACLsRequest request) {

        return listWebACLsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListWebACLsResult> listWebACLsAsync(final ListWebACLsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListWebACLsRequest, ListWebACLsResult> asyncHandler) {
        final ListWebACLsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListWebACLsResult>() {
            @Override
            public ListWebACLsResult call() throws Exception {
                ListWebACLsResult result = null;

                try {
                    result = executeListWebACLs(finalRequest);
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
    public java.util.concurrent.Future<PutLoggingConfigurationResult> putLoggingConfigurationAsync(PutLoggingConfigurationRequest request) {

        return putLoggingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLoggingConfigurationResult> putLoggingConfigurationAsync(final PutLoggingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLoggingConfigurationRequest, PutLoggingConfigurationResult> asyncHandler) {
        final PutLoggingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutLoggingConfigurationResult>() {
            @Override
            public PutLoggingConfigurationResult call() throws Exception {
                PutLoggingConfigurationResult result = null;

                try {
                    result = executePutLoggingConfiguration(finalRequest);
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
    public java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(UpdateIPSetRequest request) {

        return updateIPSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIPSetResult> updateIPSetAsync(final UpdateIPSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIPSetRequest, UpdateIPSetResult> asyncHandler) {
        final UpdateIPSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIPSetResult>() {
            @Override
            public UpdateIPSetResult call() throws Exception {
                UpdateIPSetResult result = null;

                try {
                    result = executeUpdateIPSet(finalRequest);
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
    public java.util.concurrent.Future<UpdateRegexPatternSetResult> updateRegexPatternSetAsync(UpdateRegexPatternSetRequest request) {

        return updateRegexPatternSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRegexPatternSetResult> updateRegexPatternSetAsync(final UpdateRegexPatternSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRegexPatternSetRequest, UpdateRegexPatternSetResult> asyncHandler) {
        final UpdateRegexPatternSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRegexPatternSetResult>() {
            @Override
            public UpdateRegexPatternSetResult call() throws Exception {
                UpdateRegexPatternSetResult result = null;

                try {
                    result = executeUpdateRegexPatternSet(finalRequest);
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
    public java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(UpdateRuleGroupRequest request) {

        return updateRuleGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleGroupResult> updateRuleGroupAsync(final UpdateRuleGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRuleGroupRequest, UpdateRuleGroupResult> asyncHandler) {
        final UpdateRuleGroupRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRuleGroupResult>() {
            @Override
            public UpdateRuleGroupResult call() throws Exception {
                UpdateRuleGroupResult result = null;

                try {
                    result = executeUpdateRuleGroup(finalRequest);
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
    public java.util.concurrent.Future<UpdateWebACLResult> updateWebACLAsync(UpdateWebACLRequest request) {

        return updateWebACLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateWebACLResult> updateWebACLAsync(final UpdateWebACLRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateWebACLRequest, UpdateWebACLResult> asyncHandler) {
        final UpdateWebACLRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateWebACLResult>() {
            @Override
            public UpdateWebACLResult call() throws Exception {
                UpdateWebACLResult result = null;

                try {
                    result = executeUpdateWebACL(finalRequest);
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
