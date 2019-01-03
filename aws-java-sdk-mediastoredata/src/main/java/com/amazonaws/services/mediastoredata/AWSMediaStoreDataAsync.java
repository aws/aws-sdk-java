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
 * Interface for accessing MediaStore Data asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediastoredata.AbstractAWSMediaStoreDataAsync} instead.
 * </p>
 * <p>
 * <p>
 * An AWS Elemental MediaStore asset is an object, similar to an object in the Amazon S3 service. Objects are the
 * fundamental entities that are stored in AWS Elemental MediaStore.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaStoreDataAsync extends AWSMediaStoreData {

    /**
     * <p>
     * Deletes an object at the specified path.
     * </p>
     * 
     * @param deleteObjectRequest
     * @return A Java Future containing the result of the DeleteObject operation returned by the service.
     * @sample AWSMediaStoreDataAsync.DeleteObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/DeleteObject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest deleteObjectRequest);

    /**
     * <p>
     * Deletes an object at the specified path.
     * </p>
     * 
     * @param deleteObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteObject operation returned by the service.
     * @sample AWSMediaStoreDataAsyncHandler.DeleteObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/DeleteObject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteObjectResult> deleteObjectAsync(DeleteObjectRequest deleteObjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteObjectRequest, DeleteObjectResult> asyncHandler);

    /**
     * <p>
     * Gets the headers for an object at the specified path.
     * </p>
     * 
     * @param describeObjectRequest
     * @return A Java Future containing the result of the DescribeObject operation returned by the service.
     * @sample AWSMediaStoreDataAsync.DescribeObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/DescribeObject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeObjectResult> describeObjectAsync(DescribeObjectRequest describeObjectRequest);

    /**
     * <p>
     * Gets the headers for an object at the specified path.
     * </p>
     * 
     * @param describeObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeObject operation returned by the service.
     * @sample AWSMediaStoreDataAsyncHandler.DescribeObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/DescribeObject" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeObjectResult> describeObjectAsync(DescribeObjectRequest describeObjectRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeObjectRequest, DescribeObjectResult> asyncHandler);

    /**
     * <p>
     * Downloads the object at the specified path.
     * </p>
     * 
     * @param getObjectRequest
     * @return A Java Future containing the result of the GetObject operation returned by the service.
     * @sample AWSMediaStoreDataAsync.GetObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/GetObject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetObjectResult> getObjectAsync(GetObjectRequest getObjectRequest);

    /**
     * <p>
     * Downloads the object at the specified path.
     * </p>
     * 
     * @param getObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetObject operation returned by the service.
     * @sample AWSMediaStoreDataAsyncHandler.GetObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/GetObject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetObjectResult> getObjectAsync(GetObjectRequest getObjectRequest,
            com.amazonaws.handlers.AsyncHandler<GetObjectRequest, GetObjectResult> asyncHandler);

    /**
     * <p>
     * Provides a list of metadata entries about folders and objects in the specified folder.
     * </p>
     * 
     * @param listItemsRequest
     * @return A Java Future containing the result of the ListItems operation returned by the service.
     * @sample AWSMediaStoreDataAsync.ListItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/ListItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListItemsResult> listItemsAsync(ListItemsRequest listItemsRequest);

    /**
     * <p>
     * Provides a list of metadata entries about folders and objects in the specified folder.
     * </p>
     * 
     * @param listItemsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListItems operation returned by the service.
     * @sample AWSMediaStoreDataAsyncHandler.ListItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/ListItems" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListItemsResult> listItemsAsync(ListItemsRequest listItemsRequest,
            com.amazonaws.handlers.AsyncHandler<ListItemsRequest, ListItemsResult> asyncHandler);

    /**
     * <p>
     * Uploads an object to the specified path. Object sizes are limited to 25 MB.
     * </p>
     * 
     * @param putObjectRequest
     * @return A Java Future containing the result of the PutObject operation returned by the service.
     * @sample AWSMediaStoreDataAsync.PutObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/PutObject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutObjectResult> putObjectAsync(PutObjectRequest putObjectRequest);

    /**
     * <p>
     * Uploads an object to the specified path. Object sizes are limited to 25 MB.
     * </p>
     * 
     * @param putObjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutObject operation returned by the service.
     * @sample AWSMediaStoreDataAsyncHandler.PutObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/PutObject" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutObjectResult> putObjectAsync(PutObjectRequest putObjectRequest,
            com.amazonaws.handlers.AsyncHandler<PutObjectRequest, PutObjectResult> asyncHandler);

}
