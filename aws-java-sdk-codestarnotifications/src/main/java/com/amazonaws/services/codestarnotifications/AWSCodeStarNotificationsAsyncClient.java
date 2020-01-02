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
package com.amazonaws.services.codestarnotifications;

import javax.annotation.Generated;

import com.amazonaws.services.codestarnotifications.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS CodeStar Notifications asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * This AWS CodeStar Notifications API Reference provides descriptions and usage examples of the operations and data
 * types for the AWS CodeStar Notifications API. You can use the AWS CodeStar Notifications API to work with the
 * following objects:
 * </p>
 * <p>
 * Notification rules, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateNotificationRule</a>, which creates a notification rule for a resource in your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteNotificationRule</a>, which deletes a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeNotificationRule</a>, which provides information about a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListNotificationRules</a>, which lists the notification rules associated with your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateNotificationRule</a>, which changes the name, events, or targets associated with a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>Subscribe</a>, which subscribes a target to a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>Unsubscribe</a>, which removes a target from a notification rule.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Targets, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DeleteTarget</a>, which removes a notification rule target (SNS topic) from a notification rule.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListTargets</a>, which lists the targets associated with a notification rule.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Events, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListEventTypes</a>, which lists the event types you can include in a notification rule.
 * </p>
 * </li>
 * </ul>
 * <p>
 * Tags, by calling the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListTagsForResource</a>, which lists the tags already associated with a notification rule in your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>TagResource</a>, which associates a tag you provide with a notification rule in your account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UntagResource</a>, which removes a tag from a notification rule in your account.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For information about how to use AWS CodeStar Notifications, see link in the CodeStarNotifications User Guide.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSCodeStarNotificationsAsyncClient extends AWSCodeStarNotificationsClient implements AWSCodeStarNotificationsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSCodeStarNotificationsAsyncClientBuilder asyncBuilder() {
        return AWSCodeStarNotificationsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS CodeStar Notifications using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSCodeStarNotificationsAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<CreateNotificationRuleResult> createNotificationRuleAsync(CreateNotificationRuleRequest request) {

        return createNotificationRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateNotificationRuleResult> createNotificationRuleAsync(final CreateNotificationRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateNotificationRuleRequest, CreateNotificationRuleResult> asyncHandler) {
        final CreateNotificationRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateNotificationRuleResult>() {
            @Override
            public CreateNotificationRuleResult call() throws Exception {
                CreateNotificationRuleResult result = null;

                try {
                    result = executeCreateNotificationRule(finalRequest);
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
    public java.util.concurrent.Future<DeleteNotificationRuleResult> deleteNotificationRuleAsync(DeleteNotificationRuleRequest request) {

        return deleteNotificationRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteNotificationRuleResult> deleteNotificationRuleAsync(final DeleteNotificationRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteNotificationRuleRequest, DeleteNotificationRuleResult> asyncHandler) {
        final DeleteNotificationRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteNotificationRuleResult>() {
            @Override
            public DeleteNotificationRuleResult call() throws Exception {
                DeleteNotificationRuleResult result = null;

                try {
                    result = executeDeleteNotificationRule(finalRequest);
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
    public java.util.concurrent.Future<DeleteTargetResult> deleteTargetAsync(DeleteTargetRequest request) {

        return deleteTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTargetResult> deleteTargetAsync(final DeleteTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTargetRequest, DeleteTargetResult> asyncHandler) {
        final DeleteTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTargetResult>() {
            @Override
            public DeleteTargetResult call() throws Exception {
                DeleteTargetResult result = null;

                try {
                    result = executeDeleteTarget(finalRequest);
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
    public java.util.concurrent.Future<DescribeNotificationRuleResult> describeNotificationRuleAsync(DescribeNotificationRuleRequest request) {

        return describeNotificationRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeNotificationRuleResult> describeNotificationRuleAsync(final DescribeNotificationRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeNotificationRuleRequest, DescribeNotificationRuleResult> asyncHandler) {
        final DescribeNotificationRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeNotificationRuleResult>() {
            @Override
            public DescribeNotificationRuleResult call() throws Exception {
                DescribeNotificationRuleResult result = null;

                try {
                    result = executeDescribeNotificationRule(finalRequest);
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
    public java.util.concurrent.Future<ListEventTypesResult> listEventTypesAsync(ListEventTypesRequest request) {

        return listEventTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventTypesResult> listEventTypesAsync(final ListEventTypesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventTypesRequest, ListEventTypesResult> asyncHandler) {
        final ListEventTypesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventTypesResult>() {
            @Override
            public ListEventTypesResult call() throws Exception {
                ListEventTypesResult result = null;

                try {
                    result = executeListEventTypes(finalRequest);
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
    public java.util.concurrent.Future<ListNotificationRulesResult> listNotificationRulesAsync(ListNotificationRulesRequest request) {

        return listNotificationRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListNotificationRulesResult> listNotificationRulesAsync(final ListNotificationRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListNotificationRulesRequest, ListNotificationRulesResult> asyncHandler) {
        final ListNotificationRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListNotificationRulesResult>() {
            @Override
            public ListNotificationRulesResult call() throws Exception {
                ListNotificationRulesResult result = null;

                try {
                    result = executeListNotificationRules(finalRequest);
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
    public java.util.concurrent.Future<ListTargetsResult> listTargetsAsync(ListTargetsRequest request) {

        return listTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTargetsResult> listTargetsAsync(final ListTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTargetsRequest, ListTargetsResult> asyncHandler) {
        final ListTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTargetsResult>() {
            @Override
            public ListTargetsResult call() throws Exception {
                ListTargetsResult result = null;

                try {
                    result = executeListTargets(finalRequest);
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
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(SubscribeRequest request) {

        return subscribeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(final SubscribeRequest request,
            final com.amazonaws.handlers.AsyncHandler<SubscribeRequest, SubscribeResult> asyncHandler) {
        final SubscribeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SubscribeResult>() {
            @Override
            public SubscribeResult call() throws Exception {
                SubscribeResult result = null;

                try {
                    result = executeSubscribe(finalRequest);
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
    public java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(UnsubscribeRequest request) {

        return unsubscribeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UnsubscribeResult> unsubscribeAsync(final UnsubscribeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnsubscribeRequest, UnsubscribeResult> asyncHandler) {
        final UnsubscribeRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UnsubscribeResult>() {
            @Override
            public UnsubscribeResult call() throws Exception {
                UnsubscribeResult result = null;

                try {
                    result = executeUnsubscribe(finalRequest);
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
    public java.util.concurrent.Future<UpdateNotificationRuleResult> updateNotificationRuleAsync(UpdateNotificationRuleRequest request) {

        return updateNotificationRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateNotificationRuleResult> updateNotificationRuleAsync(final UpdateNotificationRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateNotificationRuleRequest, UpdateNotificationRuleResult> asyncHandler) {
        final UpdateNotificationRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateNotificationRuleResult>() {
            @Override
            public UpdateNotificationRuleResult call() throws Exception {
                UpdateNotificationRuleResult result = null;

                try {
                    result = executeUpdateNotificationRule(finalRequest);
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
