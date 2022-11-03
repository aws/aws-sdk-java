/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudtrail;

import javax.annotation.Generated;

import com.amazonaws.services.cloudtrail.model.*;

/**
 * Abstract implementation of {@code AWSCloudTrailAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSCloudTrailAsync extends AbstractAWSCloudTrail implements AWSCloudTrailAsync {

    protected AbstractAWSCloudTrailAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request) {

        return addTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(AddTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(CancelQueryRequest request) {

        return cancelQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelQueryResult> cancelQueryAsync(CancelQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelQueryRequest, CancelQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEventDataStoreResult> createEventDataStoreAsync(CreateEventDataStoreRequest request) {

        return createEventDataStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEventDataStoreResult> createEventDataStoreAsync(CreateEventDataStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEventDataStoreRequest, CreateEventDataStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateTrailResult> createTrailAsync(CreateTrailRequest request) {

        return createTrailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTrailResult> createTrailAsync(CreateTrailRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateTrailRequest, CreateTrailResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEventDataStoreResult> deleteEventDataStoreAsync(DeleteEventDataStoreRequest request) {

        return deleteEventDataStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEventDataStoreResult> deleteEventDataStoreAsync(DeleteEventDataStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEventDataStoreRequest, DeleteEventDataStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteTrailResult> deleteTrailAsync(DeleteTrailRequest request) {

        return deleteTrailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteTrailResult> deleteTrailAsync(DeleteTrailRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteTrailRequest, DeleteTrailResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeQueryResult> describeQueryAsync(DescribeQueryRequest request) {

        return describeQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeQueryResult> describeQueryAsync(DescribeQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeQueryRequest, DescribeQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync(DescribeTrailsRequest request) {

        return describeTrailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync(DescribeTrailsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTrailsRequest, DescribeTrailsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeTrails operation.
     *
     * @see #describeTrailsAsync(DescribeTrailsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync() {

        return describeTrailsAsync(new DescribeTrailsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeTrails operation with an AsyncHandler.
     *
     * @see #describeTrailsAsync(DescribeTrailsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTrailsRequest, DescribeTrailsResult> asyncHandler) {

        return describeTrailsAsync(new DescribeTrailsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest request) {

        return getChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetChannelResult> getChannelAsync(GetChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<GetChannelRequest, GetChannelResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEventDataStoreResult> getEventDataStoreAsync(GetEventDataStoreRequest request) {

        return getEventDataStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventDataStoreResult> getEventDataStoreAsync(GetEventDataStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEventDataStoreRequest, GetEventDataStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetEventSelectorsResult> getEventSelectorsAsync(GetEventSelectorsRequest request) {

        return getEventSelectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEventSelectorsResult> getEventSelectorsAsync(GetEventSelectorsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetEventSelectorsRequest, GetEventSelectorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetImportResult> getImportAsync(GetImportRequest request) {

        return getImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetImportResult> getImportAsync(GetImportRequest request,
            com.amazonaws.handlers.AsyncHandler<GetImportRequest, GetImportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInsightSelectorsResult> getInsightSelectorsAsync(GetInsightSelectorsRequest request) {

        return getInsightSelectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInsightSelectorsResult> getInsightSelectorsAsync(GetInsightSelectorsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInsightSelectorsRequest, GetInsightSelectorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest request) {

        return getQueryResultsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetQueryResultsResult> getQueryResultsAsync(GetQueryResultsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetQueryResultsRequest, GetQueryResultsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTrailResult> getTrailAsync(GetTrailRequest request) {

        return getTrailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrailResult> getTrailAsync(GetTrailRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTrailRequest, GetTrailResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTrailStatusResult> getTrailStatusAsync(GetTrailStatusRequest request) {

        return getTrailStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTrailStatusResult> getTrailStatusAsync(GetTrailStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTrailStatusRequest, GetTrailStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest request) {

        return listChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListChannelsResult> listChannelsAsync(ListChannelsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListChannelsRequest, ListChannelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEventDataStoresResult> listEventDataStoresAsync(ListEventDataStoresRequest request) {

        return listEventDataStoresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventDataStoresResult> listEventDataStoresAsync(ListEventDataStoresRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEventDataStoresRequest, ListEventDataStoresResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListImportFailuresResult> listImportFailuresAsync(ListImportFailuresRequest request) {

        return listImportFailuresAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImportFailuresResult> listImportFailuresAsync(ListImportFailuresRequest request,
            com.amazonaws.handlers.AsyncHandler<ListImportFailuresRequest, ListImportFailuresResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListImportsResult> listImportsAsync(ListImportsRequest request) {

        return listImportsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListImportsResult> listImportsAsync(ListImportsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListImportsRequest, ListImportsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(ListPublicKeysRequest request) {

        return listPublicKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(ListPublicKeysRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPublicKeysRequest, ListPublicKeysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListPublicKeys operation.
     *
     * @see #listPublicKeysAsync(ListPublicKeysRequest)
     */
    @Override
    public java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync() {

        return listPublicKeysAsync(new ListPublicKeysRequest());
    }

    /**
     * Simplified method form for invoking the ListPublicKeys operation with an AsyncHandler.
     *
     * @see #listPublicKeysAsync(ListPublicKeysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(
            com.amazonaws.handlers.AsyncHandler<ListPublicKeysRequest, ListPublicKeysResult> asyncHandler) {

        return listPublicKeysAsync(new ListPublicKeysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListQueriesResult> listQueriesAsync(ListQueriesRequest request) {

        return listQueriesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListQueriesResult> listQueriesAsync(ListQueriesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListQueriesRequest, ListQueriesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request) {

        return listTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsResult> listTagsAsync(ListTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTrailsResult> listTrailsAsync(ListTrailsRequest request) {

        return listTrailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTrailsResult> listTrailsAsync(ListTrailsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTrailsRequest, ListTrailsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync(LookupEventsRequest request) {

        return lookupEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync(LookupEventsRequest request,
            com.amazonaws.handlers.AsyncHandler<LookupEventsRequest, LookupEventsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the LookupEvents operation.
     *
     * @see #lookupEventsAsync(LookupEventsRequest)
     */
    @Override
    public java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync() {

        return lookupEventsAsync(new LookupEventsRequest());
    }

    /**
     * Simplified method form for invoking the LookupEvents operation with an AsyncHandler.
     *
     * @see #lookupEventsAsync(LookupEventsRequest, com.amazonaws.handlers.AsyncHandler)
     */
    @Override
    public java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync(
            com.amazonaws.handlers.AsyncHandler<LookupEventsRequest, LookupEventsResult> asyncHandler) {

        return lookupEventsAsync(new LookupEventsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutEventSelectorsResult> putEventSelectorsAsync(PutEventSelectorsRequest request) {

        return putEventSelectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEventSelectorsResult> putEventSelectorsAsync(PutEventSelectorsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutEventSelectorsRequest, PutEventSelectorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutInsightSelectorsResult> putInsightSelectorsAsync(PutInsightSelectorsRequest request) {

        return putInsightSelectorsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutInsightSelectorsResult> putInsightSelectorsAsync(PutInsightSelectorsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutInsightSelectorsRequest, PutInsightSelectorsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest request) {

        return removeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(RemoveTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RestoreEventDataStoreResult> restoreEventDataStoreAsync(RestoreEventDataStoreRequest request) {

        return restoreEventDataStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RestoreEventDataStoreResult> restoreEventDataStoreAsync(RestoreEventDataStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<RestoreEventDataStoreRequest, RestoreEventDataStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartImportResult> startImportAsync(StartImportRequest request) {

        return startImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartImportResult> startImportAsync(StartImportRequest request,
            com.amazonaws.handlers.AsyncHandler<StartImportRequest, StartImportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartLoggingResult> startLoggingAsync(StartLoggingRequest request) {

        return startLoggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartLoggingResult> startLoggingAsync(StartLoggingRequest request,
            com.amazonaws.handlers.AsyncHandler<StartLoggingRequest, StartLoggingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest request) {

        return startQueryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartQueryResult> startQueryAsync(StartQueryRequest request,
            com.amazonaws.handlers.AsyncHandler<StartQueryRequest, StartQueryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopImportResult> stopImportAsync(StopImportRequest request) {

        return stopImportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopImportResult> stopImportAsync(StopImportRequest request,
            com.amazonaws.handlers.AsyncHandler<StopImportRequest, StopImportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopLoggingResult> stopLoggingAsync(StopLoggingRequest request) {

        return stopLoggingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopLoggingResult> stopLoggingAsync(StopLoggingRequest request,
            com.amazonaws.handlers.AsyncHandler<StopLoggingRequest, StopLoggingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateEventDataStoreResult> updateEventDataStoreAsync(UpdateEventDataStoreRequest request) {

        return updateEventDataStoreAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateEventDataStoreResult> updateEventDataStoreAsync(UpdateEventDataStoreRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateEventDataStoreRequest, UpdateEventDataStoreResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateTrailResult> updateTrailAsync(UpdateTrailRequest request) {

        return updateTrailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateTrailResult> updateTrailAsync(UpdateTrailRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateTrailRequest, UpdateTrailResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
