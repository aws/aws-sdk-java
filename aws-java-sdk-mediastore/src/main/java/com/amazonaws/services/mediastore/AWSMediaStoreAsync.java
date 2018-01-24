/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.mediastore;

import javax.annotation.Generated;

import com.amazonaws.services.mediastore.model.*;

/**
 * Interface for accessing MediaStore asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.mediastore.AbstractAWSMediaStoreAsync} instead.
 * </p>
 * <p>
 * <p>
 * An AWS Elemental MediaStore container is a namespace that holds folders and objects. You use a container endpoint to
 * create, read, and delete objects.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSMediaStoreAsync extends AWSMediaStore {

    /**
     * <p>
     * Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.
     * </p>
     * 
     * @param createContainerRequest
     * @return A Java Future containing the result of the CreateContainer operation returned by the service.
     * @sample AWSMediaStoreAsync.CreateContainer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/CreateContainer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateContainerResult> createContainerAsync(CreateContainerRequest createContainerRequest);

    /**
     * <p>
     * Creates a storage container to hold objects. A container is similar to a bucket in the Amazon S3 service.
     * </p>
     * 
     * @param createContainerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContainer operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.CreateContainer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/CreateContainer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateContainerResult> createContainerAsync(CreateContainerRequest createContainerRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContainerRequest, CreateContainerResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified container. Before you make a <code>DeleteContainer</code> request, delete any objects in
     * the container or in any folders in the container. You can delete only empty containers.
     * </p>
     * 
     * @param deleteContainerRequest
     * @return A Java Future containing the result of the DeleteContainer operation returned by the service.
     * @sample AWSMediaStoreAsync.DeleteContainer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteContainer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteContainerResult> deleteContainerAsync(DeleteContainerRequest deleteContainerRequest);

    /**
     * <p>
     * Deletes the specified container. Before you make a <code>DeleteContainer</code> request, delete any objects in
     * the container or in any folders in the container. You can delete only empty containers.
     * </p>
     * 
     * @param deleteContainerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContainer operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.DeleteContainer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteContainer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteContainerResult> deleteContainerAsync(DeleteContainerRequest deleteContainerRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContainerRequest, DeleteContainerResult> asyncHandler);

    /**
     * <p>
     * Deletes the access policy that is associated with the specified container.
     * </p>
     * 
     * @param deleteContainerPolicyRequest
     * @return A Java Future containing the result of the DeleteContainerPolicy operation returned by the service.
     * @sample AWSMediaStoreAsync.DeleteContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteContainerPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContainerPolicyResult> deleteContainerPolicyAsync(DeleteContainerPolicyRequest deleteContainerPolicyRequest);

    /**
     * <p>
     * Deletes the access policy that is associated with the specified container.
     * </p>
     * 
     * @param deleteContainerPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContainerPolicy operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.DeleteContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteContainerPolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContainerPolicyResult> deleteContainerPolicyAsync(DeleteContainerPolicyRequest deleteContainerPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContainerPolicyRequest, DeleteContainerPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves the properties of the requested container. This returns a single <code>Container</code> object based on
     * <code>ContainerName</code>. To return all <code>Container</code> objects that are associated with a specified AWS
     * account, use <a>ListContainers</a>.
     * </p>
     * 
     * @param describeContainerRequest
     * @return A Java Future containing the result of the DescribeContainer operation returned by the service.
     * @sample AWSMediaStoreAsync.DescribeContainer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DescribeContainer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeContainerResult> describeContainerAsync(DescribeContainerRequest describeContainerRequest);

    /**
     * <p>
     * Retrieves the properties of the requested container. This returns a single <code>Container</code> object based on
     * <code>ContainerName</code>. To return all <code>Container</code> objects that are associated with a specified AWS
     * account, use <a>ListContainers</a>.
     * </p>
     * 
     * @param describeContainerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeContainer operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.DescribeContainer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DescribeContainer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeContainerResult> describeContainerAsync(DescribeContainerRequest describeContainerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeContainerRequest, DescribeContainerResult> asyncHandler);

    /**
     * <p>
     * Retrieves the access policy for the specified container. For information about the data that is included in an
     * access policy, see the <a href="https://aws.amazon.com/documentation/iam/">AWS Identity and Access Management
     * User Guide</a>.
     * </p>
     * 
     * @param getContainerPolicyRequest
     * @return A Java Future containing the result of the GetContainerPolicy operation returned by the service.
     * @sample AWSMediaStoreAsync.GetContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetContainerPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerPolicyResult> getContainerPolicyAsync(GetContainerPolicyRequest getContainerPolicyRequest);

    /**
     * <p>
     * Retrieves the access policy for the specified container. For information about the data that is included in an
     * access policy, see the <a href="https://aws.amazon.com/documentation/iam/">AWS Identity and Access Management
     * User Guide</a>.
     * </p>
     * 
     * @param getContainerPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetContainerPolicy operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.GetContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetContainerPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetContainerPolicyResult> getContainerPolicyAsync(GetContainerPolicyRequest getContainerPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetContainerPolicyRequest, GetContainerPolicyResult> asyncHandler);

    /**
     * <p>
     * Lists the properties of all containers in AWS Elemental MediaStore.
     * </p>
     * <p>
     * You can query to receive all the containers in one response. Or you can include the <code>MaxResults</code>
     * parameter to receive a limited number of containers in each response. In this case, the response includes a
     * token. To get the next set of containers, send the command again, this time with the <code>NextToken</code>
     * parameter (with the returned token as its value). The next set of responses appears, with a token if there are
     * still more containers to receive.
     * </p>
     * <p>
     * See also <a>DescribeContainer</a>, which gets the properties of one container.
     * </p>
     * 
     * @param listContainersRequest
     * @return A Java Future containing the result of the ListContainers operation returned by the service.
     * @sample AWSMediaStoreAsync.ListContainers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/ListContainers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListContainersResult> listContainersAsync(ListContainersRequest listContainersRequest);

    /**
     * <p>
     * Lists the properties of all containers in AWS Elemental MediaStore.
     * </p>
     * <p>
     * You can query to receive all the containers in one response. Or you can include the <code>MaxResults</code>
     * parameter to receive a limited number of containers in each response. In this case, the response includes a
     * token. To get the next set of containers, send the command again, this time with the <code>NextToken</code>
     * parameter (with the returned token as its value). The next set of responses appears, with a token if there are
     * still more containers to receive.
     * </p>
     * <p>
     * See also <a>DescribeContainer</a>, which gets the properties of one container.
     * </p>
     * 
     * @param listContainersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListContainers operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.ListContainers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/ListContainers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListContainersResult> listContainersAsync(ListContainersRequest listContainersRequest,
            com.amazonaws.handlers.AsyncHandler<ListContainersRequest, ListContainersResult> asyncHandler);

    /**
     * <p>
     * Creates an access policy for the specified container to restrict the users and clients that can access it. For
     * information about the data that is included in an access policy, see the <a
     * href="https://aws.amazon.com/documentation/iam/">AWS Identity and Access Management User Guide</a>.
     * </p>
     * <p>
     * For this release of the REST API, you can create only one policy for a container. If you enter
     * <code>PutContainerPolicy</code> twice, the second command modifies the existing policy.
     * </p>
     * 
     * @param putContainerPolicyRequest
     * @return A Java Future containing the result of the PutContainerPolicy operation returned by the service.
     * @sample AWSMediaStoreAsync.PutContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutContainerPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutContainerPolicyResult> putContainerPolicyAsync(PutContainerPolicyRequest putContainerPolicyRequest);

    /**
     * <p>
     * Creates an access policy for the specified container to restrict the users and clients that can access it. For
     * information about the data that is included in an access policy, see the <a
     * href="https://aws.amazon.com/documentation/iam/">AWS Identity and Access Management User Guide</a>.
     * </p>
     * <p>
     * For this release of the REST API, you can create only one policy for a container. If you enter
     * <code>PutContainerPolicy</code> twice, the second command modifies the existing policy.
     * </p>
     * 
     * @param putContainerPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutContainerPolicy operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.PutContainerPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutContainerPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutContainerPolicyResult> putContainerPolicyAsync(PutContainerPolicyRequest putContainerPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutContainerPolicyRequest, PutContainerPolicyResult> asyncHandler);

}
