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
package com.amazonaws.services.connectparticipant;

import javax.annotation.Generated;

import com.amazonaws.services.connectparticipant.model.*;

/**
 * Abstract implementation of {@code AmazonConnectParticipantAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonConnectParticipantAsync extends AbstractAmazonConnectParticipant implements AmazonConnectParticipantAsync {

    protected AbstractAmazonConnectParticipantAsync() {
    }

    @Override
    public java.util.concurrent.Future<CreateParticipantConnectionResult> createParticipantConnectionAsync(CreateParticipantConnectionRequest request) {

        return createParticipantConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateParticipantConnectionResult> createParticipantConnectionAsync(CreateParticipantConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateParticipantConnectionRequest, CreateParticipantConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DisconnectParticipantResult> disconnectParticipantAsync(DisconnectParticipantRequest request) {

        return disconnectParticipantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DisconnectParticipantResult> disconnectParticipantAsync(DisconnectParticipantRequest request,
            com.amazonaws.handlers.AsyncHandler<DisconnectParticipantRequest, DisconnectParticipantResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTranscriptResult> getTranscriptAsync(GetTranscriptRequest request) {

        return getTranscriptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTranscriptResult> getTranscriptAsync(GetTranscriptRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTranscriptRequest, GetTranscriptResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SendEventResult> sendEventAsync(SendEventRequest request) {

        return sendEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendEventResult> sendEventAsync(SendEventRequest request,
            com.amazonaws.handlers.AsyncHandler<SendEventRequest, SendEventResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SendMessageResult> sendMessageAsync(SendMessageRequest request) {

        return sendMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendMessageResult> sendMessageAsync(SendMessageRequest request,
            com.amazonaws.handlers.AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
