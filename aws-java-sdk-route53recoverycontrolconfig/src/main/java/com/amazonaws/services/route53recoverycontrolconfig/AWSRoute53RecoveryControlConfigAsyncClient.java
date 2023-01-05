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
package com.amazonaws.services.route53recoverycontrolconfig;

import javax.annotation.Generated;

import com.amazonaws.services.route53recoverycontrolconfig.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing AWS Route53 Recovery Control Config asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Recovery Control Configuration API Reference for Amazon Route 53 Application Recovery Controller
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSRoute53RecoveryControlConfigAsyncClient extends AWSRoute53RecoveryControlConfigClient implements AWSRoute53RecoveryControlConfigAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSRoute53RecoveryControlConfigAsyncClientBuilder asyncBuilder() {
        return AWSRoute53RecoveryControlConfigAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Route53 Recovery Control Config using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSRoute53RecoveryControlConfigAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS Route53 Recovery Control Config using the
     * specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSRoute53RecoveryControlConfigAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(CreateClusterRequest request) {

        return createClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateClusterResult> createClusterAsync(final CreateClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateClusterRequest, CreateClusterResult> asyncHandler) {
        final CreateClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateClusterResult>() {
            @Override
            public CreateClusterResult call() throws Exception {
                CreateClusterResult result = null;

                try {
                    result = executeCreateCluster(finalRequest);
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
    public java.util.concurrent.Future<CreateControlPanelResult> createControlPanelAsync(CreateControlPanelRequest request) {

        return createControlPanelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateControlPanelResult> createControlPanelAsync(final CreateControlPanelRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateControlPanelRequest, CreateControlPanelResult> asyncHandler) {
        final CreateControlPanelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateControlPanelResult>() {
            @Override
            public CreateControlPanelResult call() throws Exception {
                CreateControlPanelResult result = null;

                try {
                    result = executeCreateControlPanel(finalRequest);
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
    public java.util.concurrent.Future<CreateRoutingControlResult> createRoutingControlAsync(CreateRoutingControlRequest request) {

        return createRoutingControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRoutingControlResult> createRoutingControlAsync(final CreateRoutingControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateRoutingControlRequest, CreateRoutingControlResult> asyncHandler) {
        final CreateRoutingControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateRoutingControlResult>() {
            @Override
            public CreateRoutingControlResult call() throws Exception {
                CreateRoutingControlResult result = null;

                try {
                    result = executeCreateRoutingControl(finalRequest);
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
    public java.util.concurrent.Future<CreateSafetyRuleResult> createSafetyRuleAsync(CreateSafetyRuleRequest request) {

        return createSafetyRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSafetyRuleResult> createSafetyRuleAsync(final CreateSafetyRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateSafetyRuleRequest, CreateSafetyRuleResult> asyncHandler) {
        final CreateSafetyRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateSafetyRuleResult>() {
            @Override
            public CreateSafetyRuleResult call() throws Exception {
                CreateSafetyRuleResult result = null;

                try {
                    result = executeCreateSafetyRule(finalRequest);
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
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(DeleteClusterRequest request) {

        return deleteClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteClusterResult> deleteClusterAsync(final DeleteClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteClusterRequest, DeleteClusterResult> asyncHandler) {
        final DeleteClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteClusterResult>() {
            @Override
            public DeleteClusterResult call() throws Exception {
                DeleteClusterResult result = null;

                try {
                    result = executeDeleteCluster(finalRequest);
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
    public java.util.concurrent.Future<DeleteControlPanelResult> deleteControlPanelAsync(DeleteControlPanelRequest request) {

        return deleteControlPanelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteControlPanelResult> deleteControlPanelAsync(final DeleteControlPanelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteControlPanelRequest, DeleteControlPanelResult> asyncHandler) {
        final DeleteControlPanelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteControlPanelResult>() {
            @Override
            public DeleteControlPanelResult call() throws Exception {
                DeleteControlPanelResult result = null;

                try {
                    result = executeDeleteControlPanel(finalRequest);
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
    public java.util.concurrent.Future<DeleteRoutingControlResult> deleteRoutingControlAsync(DeleteRoutingControlRequest request) {

        return deleteRoutingControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRoutingControlResult> deleteRoutingControlAsync(final DeleteRoutingControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRoutingControlRequest, DeleteRoutingControlResult> asyncHandler) {
        final DeleteRoutingControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteRoutingControlResult>() {
            @Override
            public DeleteRoutingControlResult call() throws Exception {
                DeleteRoutingControlResult result = null;

                try {
                    result = executeDeleteRoutingControl(finalRequest);
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
    public java.util.concurrent.Future<DeleteSafetyRuleResult> deleteSafetyRuleAsync(DeleteSafetyRuleRequest request) {

        return deleteSafetyRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteSafetyRuleResult> deleteSafetyRuleAsync(final DeleteSafetyRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSafetyRuleRequest, DeleteSafetyRuleResult> asyncHandler) {
        final DeleteSafetyRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteSafetyRuleResult>() {
            @Override
            public DeleteSafetyRuleResult call() throws Exception {
                DeleteSafetyRuleResult result = null;

                try {
                    result = executeDeleteSafetyRule(finalRequest);
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
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(DescribeClusterRequest request) {

        return describeClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(final DescribeClusterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler) {
        final DescribeClusterRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeClusterResult>() {
            @Override
            public DescribeClusterResult call() throws Exception {
                DescribeClusterResult result = null;

                try {
                    result = executeDescribeCluster(finalRequest);
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
    public java.util.concurrent.Future<DescribeControlPanelResult> describeControlPanelAsync(DescribeControlPanelRequest request) {

        return describeControlPanelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeControlPanelResult> describeControlPanelAsync(final DescribeControlPanelRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeControlPanelRequest, DescribeControlPanelResult> asyncHandler) {
        final DescribeControlPanelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeControlPanelResult>() {
            @Override
            public DescribeControlPanelResult call() throws Exception {
                DescribeControlPanelResult result = null;

                try {
                    result = executeDescribeControlPanel(finalRequest);
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
    public java.util.concurrent.Future<DescribeRoutingControlResult> describeRoutingControlAsync(DescribeRoutingControlRequest request) {

        return describeRoutingControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRoutingControlResult> describeRoutingControlAsync(final DescribeRoutingControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRoutingControlRequest, DescribeRoutingControlResult> asyncHandler) {
        final DescribeRoutingControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRoutingControlResult>() {
            @Override
            public DescribeRoutingControlResult call() throws Exception {
                DescribeRoutingControlResult result = null;

                try {
                    result = executeDescribeRoutingControl(finalRequest);
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
    public java.util.concurrent.Future<DescribeSafetyRuleResult> describeSafetyRuleAsync(DescribeSafetyRuleRequest request) {

        return describeSafetyRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSafetyRuleResult> describeSafetyRuleAsync(final DescribeSafetyRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSafetyRuleRequest, DescribeSafetyRuleResult> asyncHandler) {
        final DescribeSafetyRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeSafetyRuleResult>() {
            @Override
            public DescribeSafetyRuleResult call() throws Exception {
                DescribeSafetyRuleResult result = null;

                try {
                    result = executeDescribeSafetyRule(finalRequest);
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
    public java.util.concurrent.Future<ListAssociatedRoute53HealthChecksResult> listAssociatedRoute53HealthChecksAsync(
            ListAssociatedRoute53HealthChecksRequest request) {

        return listAssociatedRoute53HealthChecksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssociatedRoute53HealthChecksResult> listAssociatedRoute53HealthChecksAsync(
            final ListAssociatedRoute53HealthChecksRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAssociatedRoute53HealthChecksRequest, ListAssociatedRoute53HealthChecksResult> asyncHandler) {
        final ListAssociatedRoute53HealthChecksRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAssociatedRoute53HealthChecksResult>() {
            @Override
            public ListAssociatedRoute53HealthChecksResult call() throws Exception {
                ListAssociatedRoute53HealthChecksResult result = null;

                try {
                    result = executeListAssociatedRoute53HealthChecks(finalRequest);
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
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(ListClustersRequest request) {

        return listClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(final ListClustersRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {
        final ListClustersRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListClustersResult>() {
            @Override
            public ListClustersResult call() throws Exception {
                ListClustersResult result = null;

                try {
                    result = executeListClusters(finalRequest);
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
    public java.util.concurrent.Future<ListControlPanelsResult> listControlPanelsAsync(ListControlPanelsRequest request) {

        return listControlPanelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListControlPanelsResult> listControlPanelsAsync(final ListControlPanelsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListControlPanelsRequest, ListControlPanelsResult> asyncHandler) {
        final ListControlPanelsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListControlPanelsResult>() {
            @Override
            public ListControlPanelsResult call() throws Exception {
                ListControlPanelsResult result = null;

                try {
                    result = executeListControlPanels(finalRequest);
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
    public java.util.concurrent.Future<ListRoutingControlsResult> listRoutingControlsAsync(ListRoutingControlsRequest request) {

        return listRoutingControlsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRoutingControlsResult> listRoutingControlsAsync(final ListRoutingControlsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRoutingControlsRequest, ListRoutingControlsResult> asyncHandler) {
        final ListRoutingControlsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRoutingControlsResult>() {
            @Override
            public ListRoutingControlsResult call() throws Exception {
                ListRoutingControlsResult result = null;

                try {
                    result = executeListRoutingControls(finalRequest);
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
    public java.util.concurrent.Future<ListSafetyRulesResult> listSafetyRulesAsync(ListSafetyRulesRequest request) {

        return listSafetyRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSafetyRulesResult> listSafetyRulesAsync(final ListSafetyRulesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSafetyRulesRequest, ListSafetyRulesResult> asyncHandler) {
        final ListSafetyRulesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListSafetyRulesResult>() {
            @Override
            public ListSafetyRulesResult call() throws Exception {
                ListSafetyRulesResult result = null;

                try {
                    result = executeListSafetyRules(finalRequest);
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
    public java.util.concurrent.Future<UpdateControlPanelResult> updateControlPanelAsync(UpdateControlPanelRequest request) {

        return updateControlPanelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateControlPanelResult> updateControlPanelAsync(final UpdateControlPanelRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateControlPanelRequest, UpdateControlPanelResult> asyncHandler) {
        final UpdateControlPanelRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateControlPanelResult>() {
            @Override
            public UpdateControlPanelResult call() throws Exception {
                UpdateControlPanelResult result = null;

                try {
                    result = executeUpdateControlPanel(finalRequest);
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
    public java.util.concurrent.Future<UpdateRoutingControlResult> updateRoutingControlAsync(UpdateRoutingControlRequest request) {

        return updateRoutingControlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRoutingControlResult> updateRoutingControlAsync(final UpdateRoutingControlRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRoutingControlRequest, UpdateRoutingControlResult> asyncHandler) {
        final UpdateRoutingControlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRoutingControlResult>() {
            @Override
            public UpdateRoutingControlResult call() throws Exception {
                UpdateRoutingControlResult result = null;

                try {
                    result = executeUpdateRoutingControl(finalRequest);
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
    public java.util.concurrent.Future<UpdateSafetyRuleResult> updateSafetyRuleAsync(UpdateSafetyRuleRequest request) {

        return updateSafetyRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSafetyRuleResult> updateSafetyRuleAsync(final UpdateSafetyRuleRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateSafetyRuleRequest, UpdateSafetyRuleResult> asyncHandler) {
        final UpdateSafetyRuleRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateSafetyRuleResult>() {
            @Override
            public UpdateSafetyRuleResult call() throws Exception {
                UpdateSafetyRuleResult result = null;

                try {
                    result = executeUpdateSafetyRule(finalRequest);
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
