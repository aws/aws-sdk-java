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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.mediastoredata.model.*;

/**
 * Interface for accessing MediaStore Data.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediastoredata.AbstractAWSMediaStoreData} instead.
 * </p>
 * <p>
 * <p>
 * An AWS Elemental MediaStore asset is an object, similar to an object in the Amazon S3 service. Objects are the
 * fundamental entities that are stored in AWS Elemental MediaStore.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaStoreData {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "data.mediastore";

    /**
     * <p>
     * Deletes an object at the specified path.
     * </p>
     * 
     * @param deleteObjectRequest
     * @return Result of the DeleteObject operation returned by the service.
     * @throws ContainerNotFoundException
     *         The specified container was not found for the specified account.
     * @throws ObjectNotFoundException
     *         Could not perform an operation on an object that does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStoreData.DeleteObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/DeleteObject" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteObjectResult deleteObject(DeleteObjectRequest deleteObjectRequest);

    /**
     * <p>
     * Gets the headers for an object at the specified path.
     * </p>
     * 
     * @param describeObjectRequest
     * @return Result of the DescribeObject operation returned by the service.
     * @throws ContainerNotFoundException
     *         The specified container was not found for the specified account.
     * @throws ObjectNotFoundException
     *         Could not perform an operation on an object that does not exist.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStoreData.DescribeObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/DescribeObject" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeObjectResult describeObject(DescribeObjectRequest describeObjectRequest);

    /**
     * <p>
     * Downloads the object at the specified path.
     * </p>
     * 
     * @param getObjectRequest
     * @return Result of the GetObject operation returned by the service.
     * @throws ContainerNotFoundException
     *         The specified container was not found for the specified account.
     * @throws ObjectNotFoundException
     *         Could not perform an operation on an object that does not exist.
     * @throws RequestedRangeNotSatisfiableException
     *         The requested content range is not valid.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStoreData.GetObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/GetObject" target="_top">AWS API
     *      Documentation</a>
     */
    GetObjectResult getObject(GetObjectRequest getObjectRequest);

    /**
     * <p>
     * Provides a list of metadata entries about folders and objects in the specified folder.
     * </p>
     * 
     * @param listItemsRequest
     * @return Result of the ListItems operation returned by the service.
     * @throws ContainerNotFoundException
     *         The specified container was not found for the specified account.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStoreData.ListItems
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/ListItems" target="_top">AWS API
     *      Documentation</a>
     */
    ListItemsResult listItems(ListItemsRequest listItemsRequest);

    /**
     * <p>
     * Uploads an object to the specified path. Object sizes are limited to 25 MB.
     * </p>
     * 
     * @param putObjectRequest
     * @return Result of the PutObject operation returned by the service.
     * @throws ContainerNotFoundException
     *         The specified container was not found for the specified account.
     * @throws InternalServerErrorException
     *         The service is temporarily unavailable.
     * @sample AWSMediaStoreData.PutObject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-data-2017-09-01/PutObject" target="_top">AWS API
     *      Documentation</a>
     */
    PutObjectResult putObject(PutObjectRequest putObjectRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
