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
package com.amazonaws.services.mailmanager;

import javax.annotation.Generated;

import com.amazonaws.services.mailmanager.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing MailManager asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * <fullname>AWS SES Mail Manager API</fullname>
 * <p>
 * <a href="http://aws.amazon.com/ses">AWS SES Mail Manager API</a> contains operations and data types that comprise the
 * Mail Manager feature of Amazon Simple Email Service.
 * </p>
 * <p>
 * Mail Manager is a set of Amazon SES email gateway features designed to help you strengthen your organization's email
 * infrastructure, simplify email workflow management, and streamline email compliance control. To learn more, see the
 * <a href="https://docs.aws.amazon.com/ses/latest/dg/eb.html">Mail Manager chapter</a> in the Amazon SES Developer
 * Guide.
 * </p>
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSMailManagerAsyncClient extends AWSMailManagerClient implements AWSMailManagerAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSMailManagerAsyncClientBuilder asyncBuilder() {
        return AWSMailManagerAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on MailManager using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSMailManagerAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on MailManager using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSMailManagerAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateAddonInstanceResult> createAddonInstanceAsync(CreateAddonInstanceRequest request) {

        return createAddonInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAddonInstanceResult> createAddonInstanceAsync(final CreateAddonInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAddonInstanceRequest, CreateAddonInstanceResult> asyncHandler) {
        final CreateAddonInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAddonInstanceResult>() {
            @Override
            public CreateAddonInstanceResult call() throws Exception {
                CreateAddonInstanceResult result = null;

                try {
                    result = executeCreateAddonInstance(finalRequest);
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
    public java.util.concurrent.Future<CreateAddonSubscriptionResult> createAddonSubscriptionAsync(CreateAddonSubscriptionRequest request) {

        return createAddonSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAddonSubscriptionResult> createAddonSubscriptionAsync(final CreateAddonSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAddonSubscriptionRequest, CreateAddonSubscriptionResult> asyncHandler) {
        final CreateAddonSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAddonSubscriptionResult>() {
            @Override
            public CreateAddonSubscriptionResult call() throws Exception {
                CreateAddonSubscriptionResult result = null;

                try {
                    result = executeCreateAddonSubscription(finalRequest);
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
    public java.util.concurrent.Future<CreateArchiveResult> createArchiveAsync(CreateArchiveRequest request) {

        return createArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateArchiveResult> createArchiveAsync(final CreateArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateArchiveRequest, CreateArchiveResult> asyncHandler) {
        final CreateArchiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateArchiveResult>() {
            @Override
            public CreateArchiveResult call() throws Exception {
                CreateArchiveResult result = null;

                try {
                    result = executeCreateArchive(finalRequest);
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
    public java.util.concurrent.Future<CreateIngressPointResult> createIngressPointAsync(CreateIngressPointRequest request) {

        return createIngressPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateIngressPointResult> createIngressPointAsync(final CreateIngressPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateIngressPointRequest, CreateIngressPointResult> asyncHandler) {
        final CreateIngressPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateIngressPointResult>() {
            @Override
            public CreateIngressPointResult call() throws Exception {
                CreateIngressPointResult result = null;

                try {
                    result = executeCreateIngressPoint(finalRequest);
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
    public java.util.concurrent.Future<CreateRelayResult> createRelayAsync(CreateRelayRequest request) {

        return createRelayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRelayResult> createRelayAsync(final CreateRelayRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRelayRequest, CreateRelayResult> asyncHandler) {
        final CreateRelayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRelayResult>() {
            @Override
            public CreateRelayResult call() throws Exception {
                CreateRelayResult result = null;

                try {
                    result = executeCreateRelay(finalRequest);
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
    public java.util.concurrent.Future<CreateRuleSetResult> createRuleSetAsync(CreateRuleSetRequest request) {

        return createRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRuleSetResult> createRuleSetAsync(final CreateRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRuleSetRequest, CreateRuleSetResult> asyncHandler) {
        final CreateRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRuleSetResult>() {
            @Override
            public CreateRuleSetResult call() throws Exception {
                CreateRuleSetResult result = null;

                try {
                    result = executeCreateRuleSet(finalRequest);
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
    public java.util.concurrent.Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(CreateTrafficPolicyRequest request) {

        return createTrafficPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrafficPolicyResult> createTrafficPolicyAsync(final CreateTrafficPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTrafficPolicyRequest, CreateTrafficPolicyResult> asyncHandler) {
        final CreateTrafficPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTrafficPolicyResult>() {
            @Override
            public CreateTrafficPolicyResult call() throws Exception {
                CreateTrafficPolicyResult result = null;

                try {
                    result = executeCreateTrafficPolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteAddonInstanceResult> deleteAddonInstanceAsync(DeleteAddonInstanceRequest request) {

        return deleteAddonInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAddonInstanceResult> deleteAddonInstanceAsync(final DeleteAddonInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAddonInstanceRequest, DeleteAddonInstanceResult> asyncHandler) {
        final DeleteAddonInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAddonInstanceResult>() {
            @Override
            public DeleteAddonInstanceResult call() throws Exception {
                DeleteAddonInstanceResult result = null;

                try {
                    result = executeDeleteAddonInstance(finalRequest);
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
    public java.util.concurrent.Future<DeleteAddonSubscriptionResult> deleteAddonSubscriptionAsync(DeleteAddonSubscriptionRequest request) {

        return deleteAddonSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAddonSubscriptionResult> deleteAddonSubscriptionAsync(final DeleteAddonSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAddonSubscriptionRequest, DeleteAddonSubscriptionResult> asyncHandler) {
        final DeleteAddonSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAddonSubscriptionResult>() {
            @Override
            public DeleteAddonSubscriptionResult call() throws Exception {
                DeleteAddonSubscriptionResult result = null;

                try {
                    result = executeDeleteAddonSubscription(finalRequest);
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
    public java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(DeleteArchiveRequest request) {

        return deleteArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(final DeleteArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteArchiveRequest, DeleteArchiveResult> asyncHandler) {
        final DeleteArchiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteArchiveResult>() {
            @Override
            public DeleteArchiveResult call() throws Exception {
                DeleteArchiveResult result = null;

                try {
                    result = executeDeleteArchive(finalRequest);
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
    public java.util.concurrent.Future<DeleteIngressPointResult> deleteIngressPointAsync(DeleteIngressPointRequest request) {

        return deleteIngressPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIngressPointResult> deleteIngressPointAsync(final DeleteIngressPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIngressPointRequest, DeleteIngressPointResult> asyncHandler) {
        final DeleteIngressPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIngressPointResult>() {
            @Override
            public DeleteIngressPointResult call() throws Exception {
                DeleteIngressPointResult result = null;

                try {
                    result = executeDeleteIngressPoint(finalRequest);
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
    public java.util.concurrent.Future<DeleteRelayResult> deleteRelayAsync(DeleteRelayRequest request) {

        return deleteRelayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRelayResult> deleteRelayAsync(final DeleteRelayRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRelayRequest, DeleteRelayResult> asyncHandler) {
        final DeleteRelayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRelayResult>() {
            @Override
            public DeleteRelayResult call() throws Exception {
                DeleteRelayResult result = null;

                try {
                    result = executeDeleteRelay(finalRequest);
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
    public java.util.concurrent.Future<DeleteRuleSetResult> deleteRuleSetAsync(DeleteRuleSetRequest request) {

        return deleteRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleSetResult> deleteRuleSetAsync(final DeleteRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRuleSetRequest, DeleteRuleSetResult> asyncHandler) {
        final DeleteRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleSetResult>() {
            @Override
            public DeleteRuleSetResult call() throws Exception {
                DeleteRuleSetResult result = null;

                try {
                    result = executeDeleteRuleSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(DeleteTrafficPolicyRequest request) {

        return deleteTrafficPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrafficPolicyResult> deleteTrafficPolicyAsync(final DeleteTrafficPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTrafficPolicyRequest, DeleteTrafficPolicyResult> asyncHandler) {
        final DeleteTrafficPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTrafficPolicyResult>() {
            @Override
            public DeleteTrafficPolicyResult call() throws Exception {
                DeleteTrafficPolicyResult result = null;

                try {
                    result = executeDeleteTrafficPolicy(finalRequest);
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
    public java.util.concurrent.Future<GetAddonInstanceResult> getAddonInstanceAsync(GetAddonInstanceRequest request) {

        return getAddonInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAddonInstanceResult> getAddonInstanceAsync(final GetAddonInstanceRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAddonInstanceRequest, GetAddonInstanceResult> asyncHandler) {
        final GetAddonInstanceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAddonInstanceResult>() {
            @Override
            public GetAddonInstanceResult call() throws Exception {
                GetAddonInstanceResult result = null;

                try {
                    result = executeGetAddonInstance(finalRequest);
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
    public java.util.concurrent.Future<GetAddonSubscriptionResult> getAddonSubscriptionAsync(GetAddonSubscriptionRequest request) {

        return getAddonSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAddonSubscriptionResult> getAddonSubscriptionAsync(final GetAddonSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetAddonSubscriptionRequest, GetAddonSubscriptionResult> asyncHandler) {
        final GetAddonSubscriptionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetAddonSubscriptionResult>() {
            @Override
            public GetAddonSubscriptionResult call() throws Exception {
                GetAddonSubscriptionResult result = null;

                try {
                    result = executeGetAddonSubscription(finalRequest);
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
    public java.util.concurrent.Future<GetArchiveResult> getArchiveAsync(GetArchiveRequest request) {

        return getArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetArchiveResult> getArchiveAsync(final GetArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetArchiveRequest, GetArchiveResult> asyncHandler) {
        final GetArchiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetArchiveResult>() {
            @Override
            public GetArchiveResult call() throws Exception {
                GetArchiveResult result = null;

                try {
                    result = executeGetArchive(finalRequest);
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
    public java.util.concurrent.Future<GetArchiveExportResult> getArchiveExportAsync(GetArchiveExportRequest request) {

        return getArchiveExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetArchiveExportResult> getArchiveExportAsync(final GetArchiveExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetArchiveExportRequest, GetArchiveExportResult> asyncHandler) {
        final GetArchiveExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetArchiveExportResult>() {
            @Override
            public GetArchiveExportResult call() throws Exception {
                GetArchiveExportResult result = null;

                try {
                    result = executeGetArchiveExport(finalRequest);
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
    public java.util.concurrent.Future<GetArchiveMessageResult> getArchiveMessageAsync(GetArchiveMessageRequest request) {

        return getArchiveMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetArchiveMessageResult> getArchiveMessageAsync(final GetArchiveMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetArchiveMessageRequest, GetArchiveMessageResult> asyncHandler) {
        final GetArchiveMessageRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetArchiveMessageResult>() {
            @Override
            public GetArchiveMessageResult call() throws Exception {
                GetArchiveMessageResult result = null;

                try {
                    result = executeGetArchiveMessage(finalRequest);
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
    public java.util.concurrent.Future<GetArchiveMessageContentResult> getArchiveMessageContentAsync(GetArchiveMessageContentRequest request) {

        return getArchiveMessageContentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetArchiveMessageContentResult> getArchiveMessageContentAsync(final GetArchiveMessageContentRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetArchiveMessageContentRequest, GetArchiveMessageContentResult> asyncHandler) {
        final GetArchiveMessageContentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetArchiveMessageContentResult>() {
            @Override
            public GetArchiveMessageContentResult call() throws Exception {
                GetArchiveMessageContentResult result = null;

                try {
                    result = executeGetArchiveMessageContent(finalRequest);
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
    public java.util.concurrent.Future<GetArchiveSearchResult> getArchiveSearchAsync(GetArchiveSearchRequest request) {

        return getArchiveSearchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetArchiveSearchResult> getArchiveSearchAsync(final GetArchiveSearchRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetArchiveSearchRequest, GetArchiveSearchResult> asyncHandler) {
        final GetArchiveSearchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetArchiveSearchResult>() {
            @Override
            public GetArchiveSearchResult call() throws Exception {
                GetArchiveSearchResult result = null;

                try {
                    result = executeGetArchiveSearch(finalRequest);
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
    public java.util.concurrent.Future<GetArchiveSearchResultsResult> getArchiveSearchResultsAsync(GetArchiveSearchResultsRequest request) {

        return getArchiveSearchResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetArchiveSearchResultsResult> getArchiveSearchResultsAsync(final GetArchiveSearchResultsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetArchiveSearchResultsRequest, GetArchiveSearchResultsResult> asyncHandler) {
        final GetArchiveSearchResultsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetArchiveSearchResultsResult>() {
            @Override
            public GetArchiveSearchResultsResult call() throws Exception {
                GetArchiveSearchResultsResult result = null;

                try {
                    result = executeGetArchiveSearchResults(finalRequest);
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
    public java.util.concurrent.Future<GetIngressPointResult> getIngressPointAsync(GetIngressPointRequest request) {

        return getIngressPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIngressPointResult> getIngressPointAsync(final GetIngressPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIngressPointRequest, GetIngressPointResult> asyncHandler) {
        final GetIngressPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIngressPointResult>() {
            @Override
            public GetIngressPointResult call() throws Exception {
                GetIngressPointResult result = null;

                try {
                    result = executeGetIngressPoint(finalRequest);
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
    public java.util.concurrent.Future<GetRelayResult> getRelayAsync(GetRelayRequest request) {

        return getRelayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRelayResult> getRelayAsync(final GetRelayRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRelayRequest, GetRelayResult> asyncHandler) {
        final GetRelayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRelayResult>() {
            @Override
            public GetRelayResult call() throws Exception {
                GetRelayResult result = null;

                try {
                    result = executeGetRelay(finalRequest);
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
    public java.util.concurrent.Future<GetRuleSetResult> getRuleSetAsync(GetRuleSetRequest request) {

        return getRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRuleSetResult> getRuleSetAsync(final GetRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRuleSetRequest, GetRuleSetResult> asyncHandler) {
        final GetRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetRuleSetResult>() {
            @Override
            public GetRuleSetResult call() throws Exception {
                GetRuleSetResult result = null;

                try {
                    result = executeGetRuleSet(finalRequest);
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
    public java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(GetTrafficPolicyRequest request) {

        return getTrafficPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrafficPolicyResult> getTrafficPolicyAsync(final GetTrafficPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTrafficPolicyRequest, GetTrafficPolicyResult> asyncHandler) {
        final GetTrafficPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTrafficPolicyResult>() {
            @Override
            public GetTrafficPolicyResult call() throws Exception {
                GetTrafficPolicyResult result = null;

                try {
                    result = executeGetTrafficPolicy(finalRequest);
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
    public java.util.concurrent.Future<ListAddonInstancesResult> listAddonInstancesAsync(ListAddonInstancesRequest request) {

        return listAddonInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAddonInstancesResult> listAddonInstancesAsync(final ListAddonInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAddonInstancesRequest, ListAddonInstancesResult> asyncHandler) {
        final ListAddonInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAddonInstancesResult>() {
            @Override
            public ListAddonInstancesResult call() throws Exception {
                ListAddonInstancesResult result = null;

                try {
                    result = executeListAddonInstances(finalRequest);
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
    public java.util.concurrent.Future<ListAddonSubscriptionsResult> listAddonSubscriptionsAsync(ListAddonSubscriptionsRequest request) {

        return listAddonSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAddonSubscriptionsResult> listAddonSubscriptionsAsync(final ListAddonSubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAddonSubscriptionsRequest, ListAddonSubscriptionsResult> asyncHandler) {
        final ListAddonSubscriptionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAddonSubscriptionsResult>() {
            @Override
            public ListAddonSubscriptionsResult call() throws Exception {
                ListAddonSubscriptionsResult result = null;

                try {
                    result = executeListAddonSubscriptions(finalRequest);
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
    public java.util.concurrent.Future<ListArchiveExportsResult> listArchiveExportsAsync(ListArchiveExportsRequest request) {

        return listArchiveExportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListArchiveExportsResult> listArchiveExportsAsync(final ListArchiveExportsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListArchiveExportsRequest, ListArchiveExportsResult> asyncHandler) {
        final ListArchiveExportsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListArchiveExportsResult>() {
            @Override
            public ListArchiveExportsResult call() throws Exception {
                ListArchiveExportsResult result = null;

                try {
                    result = executeListArchiveExports(finalRequest);
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
    public java.util.concurrent.Future<ListArchiveSearchesResult> listArchiveSearchesAsync(ListArchiveSearchesRequest request) {

        return listArchiveSearchesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListArchiveSearchesResult> listArchiveSearchesAsync(final ListArchiveSearchesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListArchiveSearchesRequest, ListArchiveSearchesResult> asyncHandler) {
        final ListArchiveSearchesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListArchiveSearchesResult>() {
            @Override
            public ListArchiveSearchesResult call() throws Exception {
                ListArchiveSearchesResult result = null;

                try {
                    result = executeListArchiveSearches(finalRequest);
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
    public java.util.concurrent.Future<ListArchivesResult> listArchivesAsync(ListArchivesRequest request) {

        return listArchivesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListArchivesResult> listArchivesAsync(final ListArchivesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListArchivesRequest, ListArchivesResult> asyncHandler) {
        final ListArchivesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListArchivesResult>() {
            @Override
            public ListArchivesResult call() throws Exception {
                ListArchivesResult result = null;

                try {
                    result = executeListArchives(finalRequest);
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
    public java.util.concurrent.Future<ListIngressPointsResult> listIngressPointsAsync(ListIngressPointsRequest request) {

        return listIngressPointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIngressPointsResult> listIngressPointsAsync(final ListIngressPointsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIngressPointsRequest, ListIngressPointsResult> asyncHandler) {
        final ListIngressPointsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIngressPointsResult>() {
            @Override
            public ListIngressPointsResult call() throws Exception {
                ListIngressPointsResult result = null;

                try {
                    result = executeListIngressPoints(finalRequest);
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
    public java.util.concurrent.Future<ListRelaysResult> listRelaysAsync(ListRelaysRequest request) {

        return listRelaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRelaysResult> listRelaysAsync(final ListRelaysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRelaysRequest, ListRelaysResult> asyncHandler) {
        final ListRelaysRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRelaysResult>() {
            @Override
            public ListRelaysResult call() throws Exception {
                ListRelaysResult result = null;

                try {
                    result = executeListRelays(finalRequest);
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
    public java.util.concurrent.Future<ListRuleSetsResult> listRuleSetsAsync(ListRuleSetsRequest request) {

        return listRuleSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRuleSetsResult> listRuleSetsAsync(final ListRuleSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRuleSetsRequest, ListRuleSetsResult> asyncHandler) {
        final ListRuleSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRuleSetsResult>() {
            @Override
            public ListRuleSetsResult call() throws Exception {
                ListRuleSetsResult result = null;

                try {
                    result = executeListRuleSets(finalRequest);
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
    public java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(ListTrafficPoliciesRequest request) {

        return listTrafficPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrafficPoliciesResult> listTrafficPoliciesAsync(final ListTrafficPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTrafficPoliciesRequest, ListTrafficPoliciesResult> asyncHandler) {
        final ListTrafficPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTrafficPoliciesResult>() {
            @Override
            public ListTrafficPoliciesResult call() throws Exception {
                ListTrafficPoliciesResult result = null;

                try {
                    result = executeListTrafficPolicies(finalRequest);
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
    public java.util.concurrent.Future<StartArchiveExportResult> startArchiveExportAsync(StartArchiveExportRequest request) {

        return startArchiveExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartArchiveExportResult> startArchiveExportAsync(final StartArchiveExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartArchiveExportRequest, StartArchiveExportResult> asyncHandler) {
        final StartArchiveExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartArchiveExportResult>() {
            @Override
            public StartArchiveExportResult call() throws Exception {
                StartArchiveExportResult result = null;

                try {
                    result = executeStartArchiveExport(finalRequest);
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
    public java.util.concurrent.Future<StartArchiveSearchResult> startArchiveSearchAsync(StartArchiveSearchRequest request) {

        return startArchiveSearchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartArchiveSearchResult> startArchiveSearchAsync(final StartArchiveSearchRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartArchiveSearchRequest, StartArchiveSearchResult> asyncHandler) {
        final StartArchiveSearchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartArchiveSearchResult>() {
            @Override
            public StartArchiveSearchResult call() throws Exception {
                StartArchiveSearchResult result = null;

                try {
                    result = executeStartArchiveSearch(finalRequest);
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
    public java.util.concurrent.Future<StopArchiveExportResult> stopArchiveExportAsync(StopArchiveExportRequest request) {

        return stopArchiveExportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopArchiveExportResult> stopArchiveExportAsync(final StopArchiveExportRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopArchiveExportRequest, StopArchiveExportResult> asyncHandler) {
        final StopArchiveExportRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopArchiveExportResult>() {
            @Override
            public StopArchiveExportResult call() throws Exception {
                StopArchiveExportResult result = null;

                try {
                    result = executeStopArchiveExport(finalRequest);
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
    public java.util.concurrent.Future<StopArchiveSearchResult> stopArchiveSearchAsync(StopArchiveSearchRequest request) {

        return stopArchiveSearchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopArchiveSearchResult> stopArchiveSearchAsync(final StopArchiveSearchRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopArchiveSearchRequest, StopArchiveSearchResult> asyncHandler) {
        final StopArchiveSearchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopArchiveSearchResult>() {
            @Override
            public StopArchiveSearchResult call() throws Exception {
                StopArchiveSearchResult result = null;

                try {
                    result = executeStopArchiveSearch(finalRequest);
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
    public java.util.concurrent.Future<UpdateArchiveResult> updateArchiveAsync(UpdateArchiveRequest request) {

        return updateArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateArchiveResult> updateArchiveAsync(final UpdateArchiveRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateArchiveRequest, UpdateArchiveResult> asyncHandler) {
        final UpdateArchiveRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateArchiveResult>() {
            @Override
            public UpdateArchiveResult call() throws Exception {
                UpdateArchiveResult result = null;

                try {
                    result = executeUpdateArchive(finalRequest);
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
    public java.util.concurrent.Future<UpdateIngressPointResult> updateIngressPointAsync(UpdateIngressPointRequest request) {

        return updateIngressPointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIngressPointResult> updateIngressPointAsync(final UpdateIngressPointRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIngressPointRequest, UpdateIngressPointResult> asyncHandler) {
        final UpdateIngressPointRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIngressPointResult>() {
            @Override
            public UpdateIngressPointResult call() throws Exception {
                UpdateIngressPointResult result = null;

                try {
                    result = executeUpdateIngressPoint(finalRequest);
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
    public java.util.concurrent.Future<UpdateRelayResult> updateRelayAsync(UpdateRelayRequest request) {

        return updateRelayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRelayResult> updateRelayAsync(final UpdateRelayRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRelayRequest, UpdateRelayResult> asyncHandler) {
        final UpdateRelayRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRelayResult>() {
            @Override
            public UpdateRelayResult call() throws Exception {
                UpdateRelayResult result = null;

                try {
                    result = executeUpdateRelay(finalRequest);
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
    public java.util.concurrent.Future<UpdateRuleSetResult> updateRuleSetAsync(UpdateRuleSetRequest request) {

        return updateRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuleSetResult> updateRuleSetAsync(final UpdateRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRuleSetRequest, UpdateRuleSetResult> asyncHandler) {
        final UpdateRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRuleSetResult>() {
            @Override
            public UpdateRuleSetResult call() throws Exception {
                UpdateRuleSetResult result = null;

                try {
                    result = executeUpdateRuleSet(finalRequest);
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
    public java.util.concurrent.Future<UpdateTrafficPolicyResult> updateTrafficPolicyAsync(UpdateTrafficPolicyRequest request) {

        return updateTrafficPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrafficPolicyResult> updateTrafficPolicyAsync(final UpdateTrafficPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTrafficPolicyRequest, UpdateTrafficPolicyResult> asyncHandler) {
        final UpdateTrafficPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTrafficPolicyResult>() {
            @Override
            public UpdateTrafficPolicyResult call() throws Exception {
                UpdateTrafficPolicyResult result = null;

                try {
                    result = executeUpdateTrafficPolicy(finalRequest);
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
