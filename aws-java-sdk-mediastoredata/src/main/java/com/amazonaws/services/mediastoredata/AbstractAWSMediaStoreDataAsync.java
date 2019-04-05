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
package com.amazonaws.services.mediastoredata;

import javax.annotation.Generated;

import com.amazonaws.services.mediastoredata.model.*;

/**
 * Abstract implementation of {@code AWSMediaStoreDataAsync}. Convenient method forms pass through to the corresponding
 * overload that takes a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbstractAWSMediaStoreDataAsync extends AbstractAWSMediaStoreData implements AWSMediaStoreDataAsync {

    protected AbstractAWSMediaStoreDataAsync() {
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest request) {

        return deleteObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteObjectRequest, DeleteObjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeObjectResult> describeObjectAsync(DescribeObjectRequest request) {

        return describeObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeObjectResult> describeObjectAsync(DescribeObjectRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeObjectRequest, DescribeObjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetObjectResult> getObjectAsync(GetObjectRequest request) {

        return getObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetObjectResult> getObjectAsync(GetObjectRequest request,
            com.amazonaws.handlers.AsyncHandler<GetObjectRequest, GetObjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListItemsResult> listItemsAsync(ListItemsRequest request) {

        return listItemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListItemsResult> listItemsAsync(ListItemsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListItemsRequest, ListItemsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutObjectResult> putObjectAsync(PutObjectRequest request) {

        return putObjectAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutObjectResult> putObjectAsync(PutObjectRequest request,
            com.amazonaws.handlers.AsyncHandler<PutObjectRequest, PutObjectResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
