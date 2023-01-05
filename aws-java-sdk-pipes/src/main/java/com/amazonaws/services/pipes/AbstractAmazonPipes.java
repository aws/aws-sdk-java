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
package com.amazonaws.services.pipes;

import javax.annotation.Generated;

import com.amazonaws.services.pipes.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonPipes}. Convenient method forms pass through to the corresponding overload
 * that takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonPipes implements AmazonPipes {

    protected AbstractAmazonPipes() {
    }

    @Override
    public CreatePipeResult createPipe(CreatePipeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeletePipeResult deletePipe(DeletePipeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribePipeResult describePipe(DescribePipeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPipesResult listPipes(ListPipesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartPipeResult startPipe(StartPipeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopPipeResult stopPipe(StopPipeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TagResourceResult tagResource(TagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UntagResourceResult untagResource(UntagResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdatePipeResult updatePipe(UpdatePipeRequest request) {
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

}
