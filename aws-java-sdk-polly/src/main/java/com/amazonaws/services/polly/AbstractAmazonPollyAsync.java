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
package com.amazonaws.services.polly;

import javax.annotation.Generated;

import com.amazonaws.services.polly.model.*;

/**
 * Abstract implementation of {@code AmazonPollyAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonPollyAsync extends AbstractAmazonPolly implements AmazonPollyAsync {

    protected AbstractAmazonPollyAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeleteLexiconResult> deleteLexiconAsync(DeleteLexiconRequest request) {

        return deleteLexiconAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteLexiconResult> deleteLexiconAsync(DeleteLexiconRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLexiconRequest, DeleteLexiconResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeVoicesResult> describeVoicesAsync(DescribeVoicesRequest request) {

        return describeVoicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVoicesResult> describeVoicesAsync(DescribeVoicesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeVoicesRequest, DescribeVoicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLexiconResult> getLexiconAsync(GetLexiconRequest request) {

        return getLexiconAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLexiconResult> getLexiconAsync(GetLexiconRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLexiconRequest, GetLexiconResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSpeechSynthesisTaskResult> getSpeechSynthesisTaskAsync(GetSpeechSynthesisTaskRequest request) {

        return getSpeechSynthesisTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSpeechSynthesisTaskResult> getSpeechSynthesisTaskAsync(GetSpeechSynthesisTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSpeechSynthesisTaskRequest, GetSpeechSynthesisTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListLexiconsResult> listLexiconsAsync(ListLexiconsRequest request) {

        return listLexiconsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListLexiconsResult> listLexiconsAsync(ListLexiconsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListLexiconsRequest, ListLexiconsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListSpeechSynthesisTasksResult> listSpeechSynthesisTasksAsync(ListSpeechSynthesisTasksRequest request) {

        return listSpeechSynthesisTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSpeechSynthesisTasksResult> listSpeechSynthesisTasksAsync(ListSpeechSynthesisTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSpeechSynthesisTasksRequest, ListSpeechSynthesisTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutLexiconResult> putLexiconAsync(PutLexiconRequest request) {

        return putLexiconAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLexiconResult> putLexiconAsync(PutLexiconRequest request,
            com.amazonaws.handlers.AsyncHandler<PutLexiconRequest, PutLexiconResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartSpeechSynthesisTaskResult> startSpeechSynthesisTaskAsync(StartSpeechSynthesisTaskRequest request) {

        return startSpeechSynthesisTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartSpeechSynthesisTaskResult> startSpeechSynthesisTaskAsync(StartSpeechSynthesisTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<StartSpeechSynthesisTaskRequest, StartSpeechSynthesisTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SynthesizeSpeechResult> synthesizeSpeechAsync(SynthesizeSpeechRequest request) {

        return synthesizeSpeechAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SynthesizeSpeechResult> synthesizeSpeechAsync(SynthesizeSpeechRequest request,
            com.amazonaws.handlers.AsyncHandler<SynthesizeSpeechRequest, SynthesizeSpeechResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
