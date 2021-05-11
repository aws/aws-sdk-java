/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssmincidents;

import javax.annotation.Generated;

import com.amazonaws.services.ssmincidents.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;

import java.util.concurrent.ExecutorService;

/**
 * Client for accessing SSM Incidents asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * AWS Systems Manager Incident Manager is an incident management console designed to help users mitigate and recover
 * from incidents affecting their AWS-hosted applications. An incident is any unplanned interruption or reduction in
 * quality of services.
 * </p>
 * <p>
 * Incident Manager increases incident resolution by notifying responders of impact, highlighting relevant
 * troubleshooting data, and providing collaboration tools to get services back up and running. To achieve the primary
 * goal of reducing the time-to-resolution of critical incidents, Incident Manager automates response plans and enables
 * responder team escalation.
 * </p>
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AWSSSMIncidentsAsyncClient extends AWSSSMIncidentsClient implements AWSSSMIncidentsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    public static AWSSSMIncidentsAsyncClientBuilder asyncBuilder() {
        return AWSSSMIncidentsAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SSM Incidents using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AWSSSMIncidentsAsyncClient(AwsAsyncClientParams asyncClientParams) {
        this(asyncClientParams, false);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on SSM Incidents using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     * @param endpointDiscoveryEnabled
     *        true will enable endpoint discovery if the service supports it.
     */
    AWSSSMIncidentsAsyncClient(AwsAsyncClientParams asyncClientParams, boolean endpointDiscoveryEnabled) {
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
    public java.util.concurrent.Future<CreateReplicationSetResult> createReplicationSetAsync(CreateReplicationSetRequest request) {

        return createReplicationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationSetResult> createReplicationSetAsync(final CreateReplicationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateReplicationSetRequest, CreateReplicationSetResult> asyncHandler) {
        final CreateReplicationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateReplicationSetResult>() {
            @Override
            public CreateReplicationSetResult call() throws Exception {
                CreateReplicationSetResult result = null;

                try {
                    result = executeCreateReplicationSet(finalRequest);
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
    public java.util.concurrent.Future<CreateResponsePlanResult> createResponsePlanAsync(CreateResponsePlanRequest request) {

        return createResponsePlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResponsePlanResult> createResponsePlanAsync(final CreateResponsePlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateResponsePlanRequest, CreateResponsePlanResult> asyncHandler) {
        final CreateResponsePlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateResponsePlanResult>() {
            @Override
            public CreateResponsePlanResult call() throws Exception {
                CreateResponsePlanResult result = null;

                try {
                    result = executeCreateResponsePlan(finalRequest);
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
    public java.util.concurrent.Future<CreateTimelineEventResult> createTimelineEventAsync(CreateTimelineEventRequest request) {

        return createTimelineEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTimelineEventResult> createTimelineEventAsync(final CreateTimelineEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTimelineEventRequest, CreateTimelineEventResult> asyncHandler) {
        final CreateTimelineEventRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateTimelineEventResult>() {
            @Override
            public CreateTimelineEventResult call() throws Exception {
                CreateTimelineEventResult result = null;

                try {
                    result = executeCreateTimelineEvent(finalRequest);
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
    public java.util.concurrent.Future<DeleteIncidentRecordResult> deleteIncidentRecordAsync(DeleteIncidentRecordRequest request) {

        return deleteIncidentRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIncidentRecordResult> deleteIncidentRecordAsync(final DeleteIncidentRecordRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteIncidentRecordRequest, DeleteIncidentRecordResult> asyncHandler) {
        final DeleteIncidentRecordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteIncidentRecordResult>() {
            @Override
            public DeleteIncidentRecordResult call() throws Exception {
                DeleteIncidentRecordResult result = null;

                try {
                    result = executeDeleteIncidentRecord(finalRequest);
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
    public java.util.concurrent.Future<DeleteReplicationSetResult> deleteReplicationSetAsync(DeleteReplicationSetRequest request) {

        return deleteReplicationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationSetResult> deleteReplicationSetAsync(final DeleteReplicationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteReplicationSetRequest, DeleteReplicationSetResult> asyncHandler) {
        final DeleteReplicationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteReplicationSetResult>() {
            @Override
            public DeleteReplicationSetResult call() throws Exception {
                DeleteReplicationSetResult result = null;

                try {
                    result = executeDeleteReplicationSet(finalRequest);
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
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(DeleteResourcePolicyRequest request) {

        return deleteResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResourcePolicyResult> deleteResourcePolicyAsync(final DeleteResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResourcePolicyRequest, DeleteResourcePolicyResult> asyncHandler) {
        final DeleteResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResourcePolicyResult>() {
            @Override
            public DeleteResourcePolicyResult call() throws Exception {
                DeleteResourcePolicyResult result = null;

                try {
                    result = executeDeleteResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<DeleteResponsePlanResult> deleteResponsePlanAsync(DeleteResponsePlanRequest request) {

        return deleteResponsePlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteResponsePlanResult> deleteResponsePlanAsync(final DeleteResponsePlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteResponsePlanRequest, DeleteResponsePlanResult> asyncHandler) {
        final DeleteResponsePlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteResponsePlanResult>() {
            @Override
            public DeleteResponsePlanResult call() throws Exception {
                DeleteResponsePlanResult result = null;

                try {
                    result = executeDeleteResponsePlan(finalRequest);
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
    public java.util.concurrent.Future<DeleteTimelineEventResult> deleteTimelineEventAsync(DeleteTimelineEventRequest request) {

        return deleteTimelineEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTimelineEventResult> deleteTimelineEventAsync(final DeleteTimelineEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTimelineEventRequest, DeleteTimelineEventResult> asyncHandler) {
        final DeleteTimelineEventRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteTimelineEventResult>() {
            @Override
            public DeleteTimelineEventResult call() throws Exception {
                DeleteTimelineEventResult result = null;

                try {
                    result = executeDeleteTimelineEvent(finalRequest);
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
    public java.util.concurrent.Future<GetIncidentRecordResult> getIncidentRecordAsync(GetIncidentRecordRequest request) {

        return getIncidentRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIncidentRecordResult> getIncidentRecordAsync(final GetIncidentRecordRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetIncidentRecordRequest, GetIncidentRecordResult> asyncHandler) {
        final GetIncidentRecordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetIncidentRecordResult>() {
            @Override
            public GetIncidentRecordResult call() throws Exception {
                GetIncidentRecordResult result = null;

                try {
                    result = executeGetIncidentRecord(finalRequest);
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
    public java.util.concurrent.Future<GetReplicationSetResult> getReplicationSetAsync(GetReplicationSetRequest request) {

        return getReplicationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetReplicationSetResult> getReplicationSetAsync(final GetReplicationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetReplicationSetRequest, GetReplicationSetResult> asyncHandler) {
        final GetReplicationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetReplicationSetResult>() {
            @Override
            public GetReplicationSetResult call() throws Exception {
                GetReplicationSetResult result = null;

                try {
                    result = executeGetReplicationSet(finalRequest);
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
    public java.util.concurrent.Future<GetResourcePoliciesResult> getResourcePoliciesAsync(GetResourcePoliciesRequest request) {

        return getResourcePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourcePoliciesResult> getResourcePoliciesAsync(final GetResourcePoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResourcePoliciesRequest, GetResourcePoliciesResult> asyncHandler) {
        final GetResourcePoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResourcePoliciesResult>() {
            @Override
            public GetResourcePoliciesResult call() throws Exception {
                GetResourcePoliciesResult result = null;

                try {
                    result = executeGetResourcePolicies(finalRequest);
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
    public java.util.concurrent.Future<GetResponsePlanResult> getResponsePlanAsync(GetResponsePlanRequest request) {

        return getResponsePlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResponsePlanResult> getResponsePlanAsync(final GetResponsePlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetResponsePlanRequest, GetResponsePlanResult> asyncHandler) {
        final GetResponsePlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetResponsePlanResult>() {
            @Override
            public GetResponsePlanResult call() throws Exception {
                GetResponsePlanResult result = null;

                try {
                    result = executeGetResponsePlan(finalRequest);
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
    public java.util.concurrent.Future<GetTimelineEventResult> getTimelineEventAsync(GetTimelineEventRequest request) {

        return getTimelineEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTimelineEventResult> getTimelineEventAsync(final GetTimelineEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTimelineEventRequest, GetTimelineEventResult> asyncHandler) {
        final GetTimelineEventRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetTimelineEventResult>() {
            @Override
            public GetTimelineEventResult call() throws Exception {
                GetTimelineEventResult result = null;

                try {
                    result = executeGetTimelineEvent(finalRequest);
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
    public java.util.concurrent.Future<ListIncidentRecordsResult> listIncidentRecordsAsync(ListIncidentRecordsRequest request) {

        return listIncidentRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIncidentRecordsResult> listIncidentRecordsAsync(final ListIncidentRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListIncidentRecordsRequest, ListIncidentRecordsResult> asyncHandler) {
        final ListIncidentRecordsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListIncidentRecordsResult>() {
            @Override
            public ListIncidentRecordsResult call() throws Exception {
                ListIncidentRecordsResult result = null;

                try {
                    result = executeListIncidentRecords(finalRequest);
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
    public java.util.concurrent.Future<ListRelatedItemsResult> listRelatedItemsAsync(ListRelatedItemsRequest request) {

        return listRelatedItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRelatedItemsResult> listRelatedItemsAsync(final ListRelatedItemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRelatedItemsRequest, ListRelatedItemsResult> asyncHandler) {
        final ListRelatedItemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListRelatedItemsResult>() {
            @Override
            public ListRelatedItemsResult call() throws Exception {
                ListRelatedItemsResult result = null;

                try {
                    result = executeListRelatedItems(finalRequest);
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
    public java.util.concurrent.Future<ListReplicationSetsResult> listReplicationSetsAsync(ListReplicationSetsRequest request) {

        return listReplicationSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReplicationSetsResult> listReplicationSetsAsync(final ListReplicationSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListReplicationSetsRequest, ListReplicationSetsResult> asyncHandler) {
        final ListReplicationSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListReplicationSetsResult>() {
            @Override
            public ListReplicationSetsResult call() throws Exception {
                ListReplicationSetsResult result = null;

                try {
                    result = executeListReplicationSets(finalRequest);
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
    public java.util.concurrent.Future<ListResponsePlansResult> listResponsePlansAsync(ListResponsePlansRequest request) {

        return listResponsePlansAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListResponsePlansResult> listResponsePlansAsync(final ListResponsePlansRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListResponsePlansRequest, ListResponsePlansResult> asyncHandler) {
        final ListResponsePlansRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListResponsePlansResult>() {
            @Override
            public ListResponsePlansResult call() throws Exception {
                ListResponsePlansResult result = null;

                try {
                    result = executeListResponsePlans(finalRequest);
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
    public java.util.concurrent.Future<ListTimelineEventsResult> listTimelineEventsAsync(ListTimelineEventsRequest request) {

        return listTimelineEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTimelineEventsResult> listTimelineEventsAsync(final ListTimelineEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTimelineEventsRequest, ListTimelineEventsResult> asyncHandler) {
        final ListTimelineEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListTimelineEventsResult>() {
            @Override
            public ListTimelineEventsResult call() throws Exception {
                ListTimelineEventsResult result = null;

                try {
                    result = executeListTimelineEvents(finalRequest);
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
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(PutResourcePolicyRequest request) {

        return putResourcePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutResourcePolicyResult> putResourcePolicyAsync(final PutResourcePolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutResourcePolicyRequest, PutResourcePolicyResult> asyncHandler) {
        final PutResourcePolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutResourcePolicyResult>() {
            @Override
            public PutResourcePolicyResult call() throws Exception {
                PutResourcePolicyResult result = null;

                try {
                    result = executePutResourcePolicy(finalRequest);
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
    public java.util.concurrent.Future<StartIncidentResult> startIncidentAsync(StartIncidentRequest request) {

        return startIncidentAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartIncidentResult> startIncidentAsync(final StartIncidentRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartIncidentRequest, StartIncidentResult> asyncHandler) {
        final StartIncidentRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartIncidentResult>() {
            @Override
            public StartIncidentResult call() throws Exception {
                StartIncidentResult result = null;

                try {
                    result = executeStartIncident(finalRequest);
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
    public java.util.concurrent.Future<UpdateDeletionProtectionResult> updateDeletionProtectionAsync(UpdateDeletionProtectionRequest request) {

        return updateDeletionProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDeletionProtectionResult> updateDeletionProtectionAsync(final UpdateDeletionProtectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDeletionProtectionRequest, UpdateDeletionProtectionResult> asyncHandler) {
        final UpdateDeletionProtectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateDeletionProtectionResult>() {
            @Override
            public UpdateDeletionProtectionResult call() throws Exception {
                UpdateDeletionProtectionResult result = null;

                try {
                    result = executeUpdateDeletionProtection(finalRequest);
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
    public java.util.concurrent.Future<UpdateIncidentRecordResult> updateIncidentRecordAsync(UpdateIncidentRecordRequest request) {

        return updateIncidentRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateIncidentRecordResult> updateIncidentRecordAsync(final UpdateIncidentRecordRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateIncidentRecordRequest, UpdateIncidentRecordResult> asyncHandler) {
        final UpdateIncidentRecordRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateIncidentRecordResult>() {
            @Override
            public UpdateIncidentRecordResult call() throws Exception {
                UpdateIncidentRecordResult result = null;

                try {
                    result = executeUpdateIncidentRecord(finalRequest);
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
    public java.util.concurrent.Future<UpdateRelatedItemsResult> updateRelatedItemsAsync(UpdateRelatedItemsRequest request) {

        return updateRelatedItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRelatedItemsResult> updateRelatedItemsAsync(final UpdateRelatedItemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRelatedItemsRequest, UpdateRelatedItemsResult> asyncHandler) {
        final UpdateRelatedItemsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRelatedItemsResult>() {
            @Override
            public UpdateRelatedItemsResult call() throws Exception {
                UpdateRelatedItemsResult result = null;

                try {
                    result = executeUpdateRelatedItems(finalRequest);
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
    public java.util.concurrent.Future<UpdateReplicationSetResult> updateReplicationSetAsync(UpdateReplicationSetRequest request) {

        return updateReplicationSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReplicationSetResult> updateReplicationSetAsync(final UpdateReplicationSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateReplicationSetRequest, UpdateReplicationSetResult> asyncHandler) {
        final UpdateReplicationSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateReplicationSetResult>() {
            @Override
            public UpdateReplicationSetResult call() throws Exception {
                UpdateReplicationSetResult result = null;

                try {
                    result = executeUpdateReplicationSet(finalRequest);
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
    public java.util.concurrent.Future<UpdateResponsePlanResult> updateResponsePlanAsync(UpdateResponsePlanRequest request) {

        return updateResponsePlanAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateResponsePlanResult> updateResponsePlanAsync(final UpdateResponsePlanRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateResponsePlanRequest, UpdateResponsePlanResult> asyncHandler) {
        final UpdateResponsePlanRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateResponsePlanResult>() {
            @Override
            public UpdateResponsePlanResult call() throws Exception {
                UpdateResponsePlanResult result = null;

                try {
                    result = executeUpdateResponsePlan(finalRequest);
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
    public java.util.concurrent.Future<UpdateTimelineEventResult> updateTimelineEventAsync(UpdateTimelineEventRequest request) {

        return updateTimelineEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTimelineEventResult> updateTimelineEventAsync(final UpdateTimelineEventRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateTimelineEventRequest, UpdateTimelineEventResult> asyncHandler) {
        final UpdateTimelineEventRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateTimelineEventResult>() {
            @Override
            public UpdateTimelineEventResult call() throws Exception {
                UpdateTimelineEventResult result = null;

                try {
                    result = executeUpdateTimelineEvent(finalRequest);
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
