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
package com.amazonaws.services.chimesdkmeetings;

import javax.annotation.Generated;

import com.amazonaws.services.chimesdkmeetings.model.*;

/**
 * Abstract implementation of {@code AmazonChimeSDKMeetingsAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonChimeSDKMeetingsAsync extends AbstractAmazonChimeSDKMeetings implements AmazonChimeSDKMeetingsAsync {

    protected AbstractAmazonChimeSDKMeetingsAsync() {
    }

    @Override
    public java.util.concurrent.Future<BatchCreateAttendeeResult> batchCreateAttendeeAsync(BatchCreateAttendeeRequest request) {

        return batchCreateAttendeeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchCreateAttendeeResult> batchCreateAttendeeAsync(BatchCreateAttendeeRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchCreateAttendeeRequest, BatchCreateAttendeeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateAttendeeCapabilitiesExceptResult> batchUpdateAttendeeCapabilitiesExceptAsync(
            BatchUpdateAttendeeCapabilitiesExceptRequest request) {

        return batchUpdateAttendeeCapabilitiesExceptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<BatchUpdateAttendeeCapabilitiesExceptResult> batchUpdateAttendeeCapabilitiesExceptAsync(
            BatchUpdateAttendeeCapabilitiesExceptRequest request,
            com.amazonaws.handlers.AsyncHandler<BatchUpdateAttendeeCapabilitiesExceptRequest, BatchUpdateAttendeeCapabilitiesExceptResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAttendeeResult> createAttendeeAsync(CreateAttendeeRequest request) {

        return createAttendeeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAttendeeResult> createAttendeeAsync(CreateAttendeeRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAttendeeRequest, CreateAttendeeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateMeetingResult> createMeetingAsync(CreateMeetingRequest request) {

        return createMeetingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMeetingResult> createMeetingAsync(CreateMeetingRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMeetingRequest, CreateMeetingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateMeetingWithAttendeesResult> createMeetingWithAttendeesAsync(CreateMeetingWithAttendeesRequest request) {

        return createMeetingWithAttendeesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMeetingWithAttendeesResult> createMeetingWithAttendeesAsync(CreateMeetingWithAttendeesRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateMeetingWithAttendeesRequest, CreateMeetingWithAttendeesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteAttendeeResult> deleteAttendeeAsync(DeleteAttendeeRequest request) {

        return deleteAttendeeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAttendeeResult> deleteAttendeeAsync(DeleteAttendeeRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAttendeeRequest, DeleteAttendeeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteMeetingResult> deleteMeetingAsync(DeleteMeetingRequest request) {

        return deleteMeetingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMeetingResult> deleteMeetingAsync(DeleteMeetingRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteMeetingRequest, DeleteMeetingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAttendeeResult> getAttendeeAsync(GetAttendeeRequest request) {

        return getAttendeeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAttendeeResult> getAttendeeAsync(GetAttendeeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAttendeeRequest, GetAttendeeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetMeetingResult> getMeetingAsync(GetMeetingRequest request) {

        return getMeetingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetMeetingResult> getMeetingAsync(GetMeetingRequest request,
            com.amazonaws.handlers.AsyncHandler<GetMeetingRequest, GetMeetingResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAttendeesResult> listAttendeesAsync(ListAttendeesRequest request) {

        return listAttendeesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttendeesResult> listAttendeesAsync(ListAttendeesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAttendeesRequest, ListAttendeesResult> asyncHandler) {

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
    public java.util.concurrent.Future<StartMeetingTranscriptionResult> startMeetingTranscriptionAsync(StartMeetingTranscriptionRequest request) {

        return startMeetingTranscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMeetingTranscriptionResult> startMeetingTranscriptionAsync(StartMeetingTranscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<StartMeetingTranscriptionRequest, StartMeetingTranscriptionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopMeetingTranscriptionResult> stopMeetingTranscriptionAsync(StopMeetingTranscriptionRequest request) {

        return stopMeetingTranscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopMeetingTranscriptionResult> stopMeetingTranscriptionAsync(StopMeetingTranscriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<StopMeetingTranscriptionRequest, StopMeetingTranscriptionResult> asyncHandler) {

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
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request) {

        return untagResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateAttendeeCapabilitiesResult> updateAttendeeCapabilitiesAsync(UpdateAttendeeCapabilitiesRequest request) {

        return updateAttendeeCapabilitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAttendeeCapabilitiesResult> updateAttendeeCapabilitiesAsync(UpdateAttendeeCapabilitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAttendeeCapabilitiesRequest, UpdateAttendeeCapabilitiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
