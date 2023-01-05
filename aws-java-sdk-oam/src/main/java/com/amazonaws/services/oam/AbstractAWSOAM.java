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
package com.amazonaws.services.oam;

import javax.annotation.Generated;

import com.amazonaws.services.oam.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSOAM}. Convenient method forms pass through to the corresponding overload that
 * takes a request object, which throws an {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSOAM implements AWSOAM {

    protected AbstractAWSOAM() {
    }

    @Override
    public CreateLinkResult createLink(CreateLinkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSinkResult createSink(CreateSinkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteLinkResult deleteLink(DeleteLinkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteSinkResult deleteSink(DeleteSinkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLinkResult getLink(GetLinkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSinkResult getSink(GetSinkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSinkPolicyResult getSinkPolicy(GetSinkPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAttachedLinksResult listAttachedLinks(ListAttachedLinksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListLinksResult listLinks(ListLinksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSinksResult listSinks(ListSinksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutSinkPolicyResult putSinkPolicy(PutSinkPolicyRequest request) {
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
    public UpdateLinkResult updateLink(UpdateLinkRequest request) {
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
