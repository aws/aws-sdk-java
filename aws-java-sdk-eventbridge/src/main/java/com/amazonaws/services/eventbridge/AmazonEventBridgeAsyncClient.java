/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eventbridge;

import javax.annotation.Generated;

import com.amazonaws.services.eventbridge.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing Amazon EventBridge asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Amazon EventBridge helps you to respond to state changes in your AWS resources. When your resources change state,
 * they automatically send events into an event stream. You can create rules that match selected events in the stream
 * and route them to targets to take action. You can also use rules to take action on a predetermined schedule. For
 * example, you can configure rules to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Automatically invoke an AWS Lambda function to update DNS entries when an event notifies you that Amazon EC2 instance
 * enters the running state
 * </p>
 * </li>
 * <li>
 * <p>
 * Direct specific API records from AWS CloudTrail to an Amazon Kinesis data stream for detailed analysis of potential
 * security or availability risks
 * </p>
 * </li>
 * <li>
 * <p>
 * Periodically invoke a built-in target to create a snapshot of an Amazon EBS volume
 * </p>
 * </li>
 * </ul>
 * <p>
 * For more information about the features of Amazon EventBridge, see the <a
 * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/">Amazon EventBridge User Guide</a>.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonEventBridgeAsyncClient extends AmazonEventBridgeClient implements AmazonEventBridgeAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AmazonEventBridgeAsyncClientBuilder asyncBuilder() {
        return AmazonEventBridgeAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon EventBridge using the specified
     * parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonEventBridgeAsyncClient(AwsAsyncClientParams asyncClientParams) {
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
    public java.util.concurrent.Future<ActivateEventSourceResult> activateEventSourceAsync(ActivateEventSourceRequest request) {

        return activateEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivateEventSourceResult> activateEventSourceAsync(final ActivateEventSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<ActivateEventSourceRequest, ActivateEventSourceResult> asyncHandler) {
        final ActivateEventSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ActivateEventSourceResult>() {
            @Override
            public ActivateEventSourceResult call() throws Exception {
                ActivateEventSourceResult result = null;

                try {
                    result = executeActivateEventSource(finalRequest);
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
    public java.util.concurrent.Future<CreateEventBusResult> createEventBusAsync(CreateEventBusRequest request) {

        return createEventBusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventBusResult> createEventBusAsync(final CreateEventBusRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateEventBusRequest, CreateEventBusResult> asyncHandler) {
        final CreateEventBusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateEventBusResult>() {
            @Override
            public CreateEventBusResult call() throws Exception {
                CreateEventBusResult result = null;

                try {
                    result = executeCreateEventBus(finalRequest);
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
    public java.util.concurrent.Future<CreatePartnerEventSourceResult> createPartnerEventSourceAsync(CreatePartnerEventSourceRequest request) {

        return createPartnerEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePartnerEventSourceResult> createPartnerEventSourceAsync(final CreatePartnerEventSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePartnerEventSourceRequest, CreatePartnerEventSourceResult> asyncHandler) {
        final CreatePartnerEventSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePartnerEventSourceResult>() {
            @Override
            public CreatePartnerEventSourceResult call() throws Exception {
                CreatePartnerEventSourceResult result = null;

                try {
                    result = executeCreatePartnerEventSource(finalRequest);
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
    public java.util.concurrent.Future<DeactivateEventSourceResult> deactivateEventSourceAsync(DeactivateEventSourceRequest request) {

        return deactivateEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeactivateEventSourceResult> deactivateEventSourceAsync(final DeactivateEventSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeactivateEventSourceRequest, DeactivateEventSourceResult> asyncHandler) {
        final DeactivateEventSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeactivateEventSourceResult>() {
            @Override
            public DeactivateEventSourceResult call() throws Exception {
                DeactivateEventSourceResult result = null;

                try {
                    result = executeDeactivateEventSource(finalRequest);
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
    public java.util.concurrent.Future<DeleteEventBusResult> deleteEventBusAsync(DeleteEventBusRequest request) {

        return deleteEventBusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventBusResult> deleteEventBusAsync(final DeleteEventBusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEventBusRequest, DeleteEventBusResult> asyncHandler) {
        final DeleteEventBusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteEventBusResult>() {
            @Override
            public DeleteEventBusResult call() throws Exception {
                DeleteEventBusResult result = null;

                try {
                    result = executeDeleteEventBus(finalRequest);
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
    public java.util.concurrent.Future<DeletePartnerEventSourceResult> deletePartnerEventSourceAsync(DeletePartnerEventSourceRequest request) {

        return deletePartnerEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePartnerEventSourceResult> deletePartnerEventSourceAsync(final DeletePartnerEventSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePartnerEventSourceRequest, DeletePartnerEventSourceResult> asyncHandler) {
        final DeletePartnerEventSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeletePartnerEventSourceResult>() {
            @Override
            public DeletePartnerEventSourceResult call() throws Exception {
                DeletePartnerEventSourceResult result = null;

                try {
                    result = executeDeletePartnerEventSource(finalRequest);
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
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request) {

        return deleteRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(final DeleteRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler) {
        final DeleteRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRuleResult>() {
            @Override
            public DeleteRuleResult call() throws Exception {
                DeleteRuleResult result = null;

                try {
                    result = executeDeleteRule(finalRequest);
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
    public java.util.concurrent.Future<DescribeEventBusResult> describeEventBusAsync(DescribeEventBusRequest request) {

        return describeEventBusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventBusResult> describeEventBusAsync(final DescribeEventBusRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventBusRequest, DescribeEventBusResult> asyncHandler) {
        final DescribeEventBusRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventBusResult>() {
            @Override
            public DescribeEventBusResult call() throws Exception {
                DescribeEventBusResult result = null;

                try {
                    result = executeDescribeEventBus(finalRequest);
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
    public java.util.concurrent.Future<DescribeEventSourceResult> describeEventSourceAsync(DescribeEventSourceRequest request) {

        return describeEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSourceResult> describeEventSourceAsync(final DescribeEventSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEventSourceRequest, DescribeEventSourceResult> asyncHandler) {
        final DescribeEventSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEventSourceResult>() {
            @Override
            public DescribeEventSourceResult call() throws Exception {
                DescribeEventSourceResult result = null;

                try {
                    result = executeDescribeEventSource(finalRequest);
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
    public java.util.concurrent.Future<DescribePartnerEventSourceResult> describePartnerEventSourceAsync(DescribePartnerEventSourceRequest request) {

        return describePartnerEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePartnerEventSourceResult> describePartnerEventSourceAsync(final DescribePartnerEventSourceRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePartnerEventSourceRequest, DescribePartnerEventSourceResult> asyncHandler) {
        final DescribePartnerEventSourceRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePartnerEventSourceResult>() {
            @Override
            public DescribePartnerEventSourceResult call() throws Exception {
                DescribePartnerEventSourceResult result = null;

                try {
                    result = executeDescribePartnerEventSource(finalRequest);
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
    public java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest request) {

        return describeRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(final DescribeRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRuleRequest, DescribeRuleResult> asyncHandler) {
        final DescribeRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRuleResult>() {
            @Override
            public DescribeRuleResult call() throws Exception {
                DescribeRuleResult result = null;

                try {
                    result = executeDescribeRule(finalRequest);
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
    public java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(DisableRuleRequest request) {

        return disableRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(final DisableRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableRuleRequest, DisableRuleResult> asyncHandler) {
        final DisableRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DisableRuleResult>() {
            @Override
            public DisableRuleResult call() throws Exception {
                DisableRuleResult result = null;

                try {
                    result = executeDisableRule(finalRequest);
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
    public java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(EnableRuleRequest request) {

        return enableRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(final EnableRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableRuleRequest, EnableRuleResult> asyncHandler) {
        final EnableRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<EnableRuleResult>() {
            @Override
            public EnableRuleResult call() throws Exception {
                EnableRuleResult result = null;

                try {
                    result = executeEnableRule(finalRequest);
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
    public java.util.concurrent.Future<ListEventBusesResult> listEventBusesAsync(ListEventBusesRequest request) {

        return listEventBusesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventBusesResult> listEventBusesAsync(final ListEventBusesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventBusesRequest, ListEventBusesResult> asyncHandler) {
        final ListEventBusesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventBusesResult>() {
            @Override
            public ListEventBusesResult call() throws Exception {
                ListEventBusesResult result = null;

                try {
                    result = executeListEventBuses(finalRequest);
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
    public java.util.concurrent.Future<ListEventSourcesResult> listEventSourcesAsync(ListEventSourcesRequest request) {

        return listEventSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventSourcesResult> listEventSourcesAsync(final ListEventSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEventSourcesRequest, ListEventSourcesResult> asyncHandler) {
        final ListEventSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListEventSourcesResult>() {
            @Override
            public ListEventSourcesResult call() throws Exception {
                ListEventSourcesResult result = null;

                try {
                    result = executeListEventSources(finalRequest);
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
    public java.util.concurrent.Future<ListPartnerEventSourceAccountsResult> listPartnerEventSourceAccountsAsync(ListPartnerEventSourceAccountsRequest request) {

        return listPartnerEventSourceAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPartnerEventSourceAccountsResult> listPartnerEventSourceAccountsAsync(
            final ListPartnerEventSourceAccountsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPartnerEventSourceAccountsRequest, ListPartnerEventSourceAccountsResult> asyncHandler) {
        final ListPartnerEventSourceAccountsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPartnerEventSourceAccountsResult>() {
            @Override
            public ListPartnerEventSourceAccountsResult call() throws Exception {
                ListPartnerEventSourceAccountsResult result = null;

                try {
                    result = executeListPartnerEventSourceAccounts(finalRequest);
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
    public java.util.concurrent.Future<ListPartnerEventSourcesResult> listPartnerEventSourcesAsync(ListPartnerEventSourcesRequest request) {

        return listPartnerEventSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPartnerEventSourcesResult> listPartnerEventSourcesAsync(final ListPartnerEventSourcesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPartnerEventSourcesRequest, ListPartnerEventSourcesResult> asyncHandler) {
        final ListPartnerEventSourcesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListPartnerEventSourcesResult>() {
            @Override
            public ListPartnerEventSourcesResult call() throws Exception {
                ListPartnerEventSourcesResult result = null;

                try {
                    result = executeListPartnerEventSources(finalRequest);
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
    public java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(ListRuleNamesByTargetRequest request) {

        return listRuleNamesByTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(final ListRuleNamesByTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRuleNamesByTargetRequest, ListRuleNamesByTargetResult> asyncHandler) {
        final ListRuleNamesByTargetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRuleNamesByTargetResult>() {
            @Override
            public ListRuleNamesByTargetResult call() throws Exception {
                ListRuleNamesByTargetResult result = null;

                try {
                    result = executeListRuleNamesByTarget(finalRequest);
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
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest request) {

        return listRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(final ListRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler) {
        final ListRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRulesResult>() {
            @Override
            public ListRulesResult call() throws Exception {
                ListRulesResult result = null;

                try {
                    result = executeListRules(finalRequest);
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
    public java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(ListTargetsByRuleRequest request) {

        return listTargetsByRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(final ListTargetsByRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTargetsByRuleRequest, ListTargetsByRuleResult> asyncHandler) {
        final ListTargetsByRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTargetsByRuleResult>() {
            @Override
            public ListTargetsByRuleResult call() throws Exception {
                ListTargetsByRuleResult result = null;

                try {
                    result = executeListTargetsByRule(finalRequest);
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
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest request) {

        return putEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(final PutEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutEventsRequest, PutEventsResult> asyncHandler) {
        final PutEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutEventsResult>() {
            @Override
            public PutEventsResult call() throws Exception {
                PutEventsResult result = null;

                try {
                    result = executePutEvents(finalRequest);
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
    public java.util.concurrent.Future<PutPartnerEventsResult> putPartnerEventsAsync(PutPartnerEventsRequest request) {

        return putPartnerEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPartnerEventsResult> putPartnerEventsAsync(final PutPartnerEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPartnerEventsRequest, PutPartnerEventsResult> asyncHandler) {
        final PutPartnerEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPartnerEventsResult>() {
            @Override
            public PutPartnerEventsResult call() throws Exception {
                PutPartnerEventsResult result = null;

                try {
                    result = executePutPartnerEvents(finalRequest);
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
    public java.util.concurrent.Future<PutPermissionResult> putPermissionAsync(PutPermissionRequest request) {

        return putPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPermissionResult> putPermissionAsync(final PutPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutPermissionRequest, PutPermissionResult> asyncHandler) {
        final PutPermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutPermissionResult>() {
            @Override
            public PutPermissionResult call() throws Exception {
                PutPermissionResult result = null;

                try {
                    result = executePutPermission(finalRequest);
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
    public java.util.concurrent.Future<PutRuleResult> putRuleAsync(PutRuleRequest request) {

        return putRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRuleResult> putRuleAsync(final PutRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRuleRequest, PutRuleResult> asyncHandler) {
        final PutRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutRuleResult>() {
            @Override
            public PutRuleResult call() throws Exception {
                PutRuleResult result = null;

                try {
                    result = executePutRule(finalRequest);
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
    public java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(PutTargetsRequest request) {

        return putTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(final PutTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutTargetsRequest, PutTargetsResult> asyncHandler) {
        final PutTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutTargetsResult>() {
            @Override
            public PutTargetsResult call() throws Exception {
                PutTargetsResult result = null;

                try {
                    result = executePutTargets(finalRequest);
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
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest request) {

        return removePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(final RemovePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler) {
        final RemovePermissionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemovePermissionResult>() {
            @Override
            public RemovePermissionResult call() throws Exception {
                RemovePermissionResult result = null;

                try {
                    result = executeRemovePermission(finalRequest);
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
    public java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(RemoveTargetsRequest request) {

        return removeTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(final RemoveTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTargetsRequest, RemoveTargetsResult> asyncHandler) {
        final RemoveTargetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RemoveTargetsResult>() {
            @Override
            public RemoveTargetsResult call() throws Exception {
                RemoveTargetsResult result = null;

                try {
                    result = executeRemoveTargets(finalRequest);
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
    public java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(TestEventPatternRequest request) {

        return testEventPatternAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(final TestEventPatternRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestEventPatternRequest, TestEventPatternResult> asyncHandler) {
        final TestEventPatternRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<TestEventPatternResult>() {
            @Override
            public TestEventPatternResult call() throws Exception {
                TestEventPatternResult result = null;

                try {
                    result = executeTestEventPattern(finalRequest);
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
