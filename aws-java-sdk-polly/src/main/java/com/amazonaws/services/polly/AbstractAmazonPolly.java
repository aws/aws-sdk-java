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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonPolly}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonPolly implements AmazonPolly {

    protected AbstractAmazonPolly() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLexiconResult deleteLexicon(DeleteLexiconRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeVoicesResult describeVoices(DescribeVoicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLexiconResult getLexicon(GetLexiconRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSpeechSynthesisTaskResult getSpeechSynthesisTask(GetSpeechSynthesisTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListLexiconsResult listLexicons(ListLexiconsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSpeechSynthesisTasksResult listSpeechSynthesisTasks(ListSpeechSynthesisTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutLexiconResult putLexicon(PutLexiconRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartSpeechSynthesisTaskResult startSpeechSynthesisTask(StartSpeechSynthesisTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SynthesizeSpeechResult synthesizeSpeech(SynthesizeSpeechRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.services.polly.presign.AmazonPollyPresigners presigners() {
        throw new java.lang.UnsupportedOperationException();
    }
}
