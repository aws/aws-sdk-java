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
package com.amazonaws.services.eventbridge;

import javax.annotation.Generated;

import com.amazonaws.services.eventbridge.model.*;

/**
 * Abstract implementation of {@code AmazonEventBridgeAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonEventBridgeAsync extends AbstractAmazonEventBridge implements AmazonEventBridgeAsync {

    protected AbstractAmazonEventBridgeAsync() {
    }

    @Override
    public java.util.concurrent.Future<ActivateEventSourceResult> activateEventSourceAsync(ActivateEventSourceRequest request) {

        return activateEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ActivateEventSourceResult> activateEventSourceAsync(ActivateEventSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ActivateEventSourceRequest, ActivateEventSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelReplayResult> cancelReplayAsync(CancelReplayRequest request) {

        return cancelReplayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelReplayResult> cancelReplayAsync(CancelReplayRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelReplayRequest, CancelReplayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateApiDestinationResult> createApiDestinationAsync(CreateApiDestinationRequest request) {

        return createApiDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateApiDestinationResult> createApiDestinationAsync(CreateApiDestinationRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateApiDestinationRequest, CreateApiDestinationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateArchiveResult> createArchiveAsync(CreateArchiveRequest request) {

        return createArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateArchiveResult> createArchiveAsync(CreateArchiveRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateArchiveRequest, CreateArchiveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest request) {

        return createConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateConnectionResult> createConnectionAsync(CreateConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateConnectionRequest, CreateConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEventBusResult> createEventBusAsync(CreateEventBusRequest request) {

        return createEventBusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventBusResult> createEventBusAsync(CreateEventBusRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEventBusRequest, CreateEventBusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePartnerEventSourceResult> createPartnerEventSourceAsync(CreatePartnerEventSourceRequest request) {

        return createPartnerEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePartnerEventSourceResult> createPartnerEventSourceAsync(CreatePartnerEventSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePartnerEventSourceRequest, CreatePartnerEventSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeactivateEventSourceResult> deactivateEventSourceAsync(DeactivateEventSourceRequest request) {

        return deactivateEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeactivateEventSourceResult> deactivateEventSourceAsync(DeactivateEventSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeactivateEventSourceRequest, DeactivateEventSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeauthorizeConnectionResult> deauthorizeConnectionAsync(DeauthorizeConnectionRequest request) {

        return deauthorizeConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeauthorizeConnectionResult> deauthorizeConnectionAsync(DeauthorizeConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeauthorizeConnectionRequest, DeauthorizeConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteApiDestinationResult> deleteApiDestinationAsync(DeleteApiDestinationRequest request) {

        return deleteApiDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteApiDestinationResult> deleteApiDestinationAsync(DeleteApiDestinationRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteApiDestinationRequest, DeleteApiDestinationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(DeleteArchiveRequest request) {

        return deleteArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteArchiveResult> deleteArchiveAsync(DeleteArchiveRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteArchiveRequest, DeleteArchiveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest request) {

        return deleteConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteConnectionResult> deleteConnectionAsync(DeleteConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConnectionRequest, DeleteConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEventBusResult> deleteEventBusAsync(DeleteEventBusRequest request) {

        return deleteEventBusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventBusResult> deleteEventBusAsync(DeleteEventBusRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEventBusRequest, DeleteEventBusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeletePartnerEventSourceResult> deletePartnerEventSourceAsync(DeletePartnerEventSourceRequest request) {

        return deletePartnerEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeletePartnerEventSourceResult> deletePartnerEventSourceAsync(DeletePartnerEventSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePartnerEventSourceRequest, DeletePartnerEventSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request) {

        return deleteRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteRuleResult> deleteRuleAsync(DeleteRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRuleRequest, DeleteRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeApiDestinationResult> describeApiDestinationAsync(DescribeApiDestinationRequest request) {

        return describeApiDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeApiDestinationResult> describeApiDestinationAsync(DescribeApiDestinationRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeApiDestinationRequest, DescribeApiDestinationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeArchiveResult> describeArchiveAsync(DescribeArchiveRequest request) {

        return describeArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeArchiveResult> describeArchiveAsync(DescribeArchiveRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeArchiveRequest, DescribeArchiveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionResult> describeConnectionAsync(DescribeConnectionRequest request) {

        return describeConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionResult> describeConnectionAsync(DescribeConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionRequest, DescribeConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventBusResult> describeEventBusAsync(DescribeEventBusRequest request) {

        return describeEventBusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventBusResult> describeEventBusAsync(DescribeEventBusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventBusRequest, DescribeEventBusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSourceResult> describeEventSourceAsync(DescribeEventSourceRequest request) {

        return describeEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEventSourceResult> describeEventSourceAsync(DescribeEventSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEventSourceRequest, DescribeEventSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribePartnerEventSourceResult> describePartnerEventSourceAsync(DescribePartnerEventSourceRequest request) {

        return describePartnerEventSourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePartnerEventSourceResult> describePartnerEventSourceAsync(DescribePartnerEventSourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribePartnerEventSourceRequest, DescribePartnerEventSourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeReplayResult> describeReplayAsync(DescribeReplayRequest request) {

        return describeReplayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplayResult> describeReplayAsync(DescribeReplayRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReplayRequest, DescribeReplayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest request) {

        return describeRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuleResult> describeRuleAsync(DescribeRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRuleRequest, DescribeRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(DisableRuleRequest request) {

        return disableRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisableRuleResult> disableRuleAsync(DisableRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableRuleRequest, DisableRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(EnableRuleRequest request) {

        return enableRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EnableRuleResult> enableRuleAsync(EnableRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableRuleRequest, EnableRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListApiDestinationsResult> listApiDestinationsAsync(ListApiDestinationsRequest request) {

        return listApiDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListApiDestinationsResult> listApiDestinationsAsync(ListApiDestinationsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListApiDestinationsRequest, ListApiDestinationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListArchivesResult> listArchivesAsync(ListArchivesRequest request) {

        return listArchivesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListArchivesResult> listArchivesAsync(ListArchivesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListArchivesRequest, ListArchivesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(ListConnectionsRequest request) {

        return listConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListConnectionsResult> listConnectionsAsync(ListConnectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListConnectionsRequest, ListConnectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEventBusesResult> listEventBusesAsync(ListEventBusesRequest request) {

        return listEventBusesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventBusesResult> listEventBusesAsync(ListEventBusesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEventBusesRequest, ListEventBusesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEventSourcesResult> listEventSourcesAsync(ListEventSourcesRequest request) {

        return listEventSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventSourcesResult> listEventSourcesAsync(ListEventSourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEventSourcesRequest, ListEventSourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPartnerEventSourceAccountsResult> listPartnerEventSourceAccountsAsync(ListPartnerEventSourceAccountsRequest request) {

        return listPartnerEventSourceAccountsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPartnerEventSourceAccountsResult> listPartnerEventSourceAccountsAsync(ListPartnerEventSourceAccountsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPartnerEventSourceAccountsRequest, ListPartnerEventSourceAccountsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPartnerEventSourcesResult> listPartnerEventSourcesAsync(ListPartnerEventSourcesRequest request) {

        return listPartnerEventSourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPartnerEventSourcesResult> listPartnerEventSourcesAsync(ListPartnerEventSourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPartnerEventSourcesRequest, ListPartnerEventSourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReplaysResult> listReplaysAsync(ListReplaysRequest request) {

        return listReplaysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReplaysResult> listReplaysAsync(ListReplaysRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReplaysRequest, ListReplaysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(ListRuleNamesByTargetRequest request) {

        return listRuleNamesByTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRuleNamesByTargetResult> listRuleNamesByTargetAsync(ListRuleNamesByTargetRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRuleNamesByTargetRequest, ListRuleNamesByTargetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest request) {

        return listRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesResult> listRulesAsync(ListRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRulesRequest, ListRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(ListTargetsByRuleRequest request) {

        return listTargetsByRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTargetsByRuleResult> listTargetsByRuleAsync(ListTargetsByRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTargetsByRuleRequest, ListTargetsByRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest request) {

        return putEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEventsResult> putEventsAsync(PutEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutEventsRequest, PutEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutPartnerEventsResult> putPartnerEventsAsync(PutPartnerEventsRequest request) {

        return putPartnerEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPartnerEventsResult> putPartnerEventsAsync(PutPartnerEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutPartnerEventsRequest, PutPartnerEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutPermissionResult> putPermissionAsync(PutPermissionRequest request) {

        return putPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutPermissionResult> putPermissionAsync(PutPermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<PutPermissionRequest, PutPermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutRuleResult> putRuleAsync(PutRuleRequest request) {

        return putRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRuleResult> putRuleAsync(PutRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRuleRequest, PutRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(PutTargetsRequest request) {

        return putTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutTargetsResult> putTargetsAsync(PutTargetsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutTargetsRequest, PutTargetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest request) {

        return removePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemovePermissionResult> removePermissionAsync(RemovePermissionRequest request,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, RemovePermissionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(RemoveTargetsRequest request) {

        return removeTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTargetsResult> removeTargetsAsync(RemoveTargetsRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTargetsRequest, RemoveTargetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartReplayResult> startReplayAsync(StartReplayRequest request) {

        return startReplayAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReplayResult> startReplayAsync(StartReplayRequest request,
            com.amazonaws.handlers.AsyncHandler<StartReplayRequest, StartReplayResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request) {

        return tagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(TestEventPatternRequest request) {

        return testEventPatternAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestEventPatternResult> testEventPatternAsync(TestEventPatternRequest request,
            com.amazonaws.handlers.AsyncHandler<TestEventPatternRequest, TestEventPatternResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateApiDestinationResult> updateApiDestinationAsync(UpdateApiDestinationRequest request) {

        return updateApiDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateApiDestinationResult> updateApiDestinationAsync(UpdateApiDestinationRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateApiDestinationRequest, UpdateApiDestinationResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateArchiveResult> updateArchiveAsync(UpdateArchiveRequest request) {

        return updateArchiveAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateArchiveResult> updateArchiveAsync(UpdateArchiveRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateArchiveRequest, UpdateArchiveResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectionResult> updateConnectionAsync(UpdateConnectionRequest request) {

        return updateConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateConnectionResult> updateConnectionAsync(UpdateConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateConnectionRequest, UpdateConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
