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
package com.amazonaws.services.cloudsearchdomain;

import javax.annotation.Generated;

import com.amazonaws.services.cloudsearchdomain.model.*;

/**
 * Abstract implementation of {@code AmazonCloudSearchDomainAsync}. Convenient method forms pass through to the
 * corresponding overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAmazonCloudSearchDomainAsync extends AbstractAmazonCloudSearchDomain implements AmazonCloudSearchDomainAsync {

    protected AbstractAmazonCloudSearchDomainAsync() {
    }

    @Override
    public java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest request) {

        return searchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchResult> searchAsync(SearchRequest request,
            com.amazonaws.handlers.AsyncHandler<SearchRequest, SearchResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SuggestResult> suggestAsync(SuggestRequest request) {

        return suggestAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SuggestResult> suggestAsync(SuggestRequest request,
            com.amazonaws.handlers.AsyncHandler<SuggestRequest, SuggestResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UploadDocumentsResult> uploadDocumentsAsync(UploadDocumentsRequest request) {

        return uploadDocumentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadDocumentsResult> uploadDocumentsAsync(UploadDocumentsRequest request,
            com.amazonaws.handlers.AsyncHandler<UploadDocumentsRequest, UploadDocumentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
