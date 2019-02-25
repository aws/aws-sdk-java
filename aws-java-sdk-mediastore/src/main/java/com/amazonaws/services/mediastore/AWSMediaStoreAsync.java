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
     * Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>MediaStore:DeleteCorsPolicy</code> action.
     * The container owner has this permission by default and can grant this permission to others.
     * </p>
     * 
     * @param deleteCorsPolicyRequest
     * @return A Java Future containing the result of the DeleteCorsPolicy operation returned by the service.
     * @sample AWSMediaStoreAsync.DeleteCorsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteCorsPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCorsPolicyResult> deleteCorsPolicyAsync(DeleteCorsPolicyRequest deleteCorsPolicyRequest);

    /**
     * <p>
     * Deletes the cross-origin resource sharing (CORS) configuration information that is set for the container.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>MediaStore:DeleteCorsPolicy</code> action.
     * The container owner has this permission by default and can grant this permission to others.
     * </p>
     * 
     * @param deleteCorsPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteCorsPolicy operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.DeleteCorsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteCorsPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteCorsPolicyResult> deleteCorsPolicyAsync(DeleteCorsPolicyRequest deleteCorsPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCorsPolicyRequest, DeleteCorsPolicyResult> asyncHandler);

    /**
     * <p>
     * Removes an object lifecycle policy from a container. It takes up to 20 minutes for the change to take effect.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @return A Java Future containing the result of the DeleteLifecyclePolicy operation returned by the service.
     * @sample AWSMediaStoreAsync.DeleteLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteLifecyclePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLifecyclePolicyResult> deleteLifecyclePolicyAsync(DeleteLifecyclePolicyRequest deleteLifecyclePolicyRequest);

    /**
     * <p>
     * Removes an object lifecycle policy from a container. It takes up to 20 minutes for the change to take effect.
     * </p>
     * 
     * @param deleteLifecyclePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLifecyclePolicy operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.DeleteLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/DeleteLifecyclePolicy"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteLifecyclePolicyResult> deleteLifecyclePolicyAsync(DeleteLifecyclePolicyRequest deleteLifecyclePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLifecyclePolicyRequest, DeleteLifecyclePolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a
     * container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint
     * does not change after it has been assigned. The <code>DescribeContainer</code> request returns a single
     * <code>Container</code> object based on <code>ContainerName</code>. To return all <code>Container</code> objects
     * that are associated with a specified AWS account, use <a>ListContainers</a>.
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
     * Retrieves the properties of the requested container. This request is commonly used to retrieve the endpoint of a
     * container. An endpoint is a value assigned by the service when a new container is created. A container's endpoint
     * does not change after it has been assigned. The <code>DescribeContainer</code> request returns a single
     * <code>Container</code> object based on <code>ContainerName</code>. To return all <code>Container</code> objects
     * that are associated with a specified AWS account, use <a>ListContainers</a>.
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
     * Returns the cross-origin resource sharing (CORS) configuration information that is set for the container.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>MediaStore:GetCorsPolicy</code> action. By
     * default, the container owner has this permission and can grant it to others.
     * </p>
     * 
     * @param getCorsPolicyRequest
     * @return A Java Future containing the result of the GetCorsPolicy operation returned by the service.
     * @sample AWSMediaStoreAsync.GetCorsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetCorsPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCorsPolicyResult> getCorsPolicyAsync(GetCorsPolicyRequest getCorsPolicyRequest);

    /**
     * <p>
     * Returns the cross-origin resource sharing (CORS) configuration information that is set for the container.
     * </p>
     * <p>
     * To use this operation, you must have permission to perform the <code>MediaStore:GetCorsPolicy</code> action. By
     * default, the container owner has this permission and can grant it to others.
     * </p>
     * 
     * @param getCorsPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCorsPolicy operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.GetCorsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetCorsPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetCorsPolicyResult> getCorsPolicyAsync(GetCorsPolicyRequest getCorsPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetCorsPolicyRequest, GetCorsPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves the object lifecycle policy that is assigned to a container.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @return A Java Future containing the result of the GetLifecyclePolicy operation returned by the service.
     * @sample AWSMediaStoreAsync.GetLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetLifecyclePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLifecyclePolicyResult> getLifecyclePolicyAsync(GetLifecyclePolicyRequest getLifecyclePolicyRequest);

    /**
     * <p>
     * Retrieves the object lifecycle policy that is assigned to a container.
     * </p>
     * 
     * @param getLifecyclePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLifecyclePolicy operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.GetLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/GetLifecyclePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetLifecyclePolicyResult> getLifecyclePolicyAsync(GetLifecyclePolicyRequest getLifecyclePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetLifecyclePolicyRequest, GetLifecyclePolicyResult> asyncHandler);

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

    /**
     * <p>
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service
     * cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to
     * access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest
     * capability.
     * </p>
     * <p>
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules
     * that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to
     * 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses
     * the first applicable rule listed.
     * </p>
     * <p>
     * To learn more about CORS, see <a
     * href="https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html">Cross-Origin Resource Sharing (CORS) in
     * AWS Elemental MediaStore</a>.
     * </p>
     * 
     * @param putCorsPolicyRequest
     * @return A Java Future containing the result of the PutCorsPolicy operation returned by the service.
     * @sample AWSMediaStoreAsync.PutCorsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutCorsPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutCorsPolicyResult> putCorsPolicyAsync(PutCorsPolicyRequest putCorsPolicyRequest);

    /**
     * <p>
     * Sets the cross-origin resource sharing (CORS) configuration on a container so that the container can service
     * cross-origin requests. For example, you might want to enable a request whose origin is http://www.example.com to
     * access your AWS Elemental MediaStore container at my.example.container.com by using the browser's XMLHttpRequest
     * capability.
     * </p>
     * <p>
     * To enable CORS on a container, you attach a CORS policy to the container. In the CORS policy, you configure rules
     * that identify origins and the HTTP methods that can be executed on your container. The policy can contain up to
     * 398,000 characters. You can add up to 100 rules to a CORS policy. If more than one rule applies, the service uses
     * the first applicable rule listed.
     * </p>
     * <p>
     * To learn more about CORS, see <a
     * href="https://docs.aws.amazon.com/mediastore/latest/ug/cors-policy.html">Cross-Origin Resource Sharing (CORS) in
     * AWS Elemental MediaStore</a>.
     * </p>
     * 
     * @param putCorsPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutCorsPolicy operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.PutCorsPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutCorsPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutCorsPolicyResult> putCorsPolicyAsync(PutCorsPolicyRequest putCorsPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutCorsPolicyRequest, PutCorsPolicyResult> asyncHandler);

    /**
     * <p>
     * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the
     * service replaces the existing policy with the new policy. It takes up to 20 minutes for the change to take
     * effect.
     * </p>
     * <p>
     * For information about how to construct an object lifecycle policy, see <a
     * href="https://docs.aws.amazon.com/mediastore/latest/ug/policies-object-lifecycle-components.html">Components of
     * an Object Lifecycle Policy</a>.
     * </p>
     * 
     * @param putLifecyclePolicyRequest
     * @return A Java Future containing the result of the PutLifecyclePolicy operation returned by the service.
     * @sample AWSMediaStoreAsync.PutLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutLifecyclePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLifecyclePolicyResult> putLifecyclePolicyAsync(PutLifecyclePolicyRequest putLifecyclePolicyRequest);

    /**
     * <p>
     * Writes an object lifecycle policy to a container. If the container already has an object lifecycle policy, the
     * service replaces the existing policy with the new policy. It takes up to 20 minutes for the change to take
     * effect.
     * </p>
     * <p>
     * For information about how to construct an object lifecycle policy, see <a
     * href="https://docs.aws.amazon.com/mediastore/latest/ug/policies-object-lifecycle-components.html">Components of
     * an Object Lifecycle Policy</a>.
     * </p>
     * 
     * @param putLifecyclePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutLifecyclePolicy operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.PutLifecyclePolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/PutLifecyclePolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PutLifecyclePolicyResult> putLifecyclePolicyAsync(PutLifecyclePolicyRequest putLifecyclePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutLifecyclePolicyRequest, PutLifecyclePolicyResult> asyncHandler);

    /**
     * <p>
     * Starts access logging on the specified container. When you enable access logging on a container, MediaStore
     * delivers access logs for objects stored in that container to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param startAccessLoggingRequest
     * @return A Java Future containing the result of the StartAccessLogging operation returned by the service.
     * @sample AWSMediaStoreAsync.StartAccessLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/StartAccessLogging" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartAccessLoggingResult> startAccessLoggingAsync(StartAccessLoggingRequest startAccessLoggingRequest);

    /**
     * <p>
     * Starts access logging on the specified container. When you enable access logging on a container, MediaStore
     * delivers access logs for objects stored in that container to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param startAccessLoggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartAccessLogging operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.StartAccessLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/StartAccessLogging" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartAccessLoggingResult> startAccessLoggingAsync(StartAccessLoggingRequest startAccessLoggingRequest,
            com.amazonaws.handlers.AsyncHandler<StartAccessLoggingRequest, StartAccessLoggingResult> asyncHandler);

    /**
     * <p>
     * Stops access logging on the specified container. When you stop access logging on a container, MediaStore stops
     * sending access logs to Amazon CloudWatch Logs. These access logs are not saved and are not retrievable.
     * </p>
     * 
     * @param stopAccessLoggingRequest
     * @return A Java Future containing the result of the StopAccessLogging operation returned by the service.
     * @sample AWSMediaStoreAsync.StopAccessLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/StopAccessLogging" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopAccessLoggingResult> stopAccessLoggingAsync(StopAccessLoggingRequest stopAccessLoggingRequest);

    /**
     * <p>
     * Stops access logging on the specified container. When you stop access logging on a container, MediaStore stops
     * sending access logs to Amazon CloudWatch Logs. These access logs are not saved and are not retrievable.
     * </p>
     * 
     * @param stopAccessLoggingRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopAccessLogging operation returned by the service.
     * @sample AWSMediaStoreAsyncHandler.StopAccessLogging
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediastore-2017-09-01/StopAccessLogging" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopAccessLoggingResult> stopAccessLoggingAsync(StopAccessLoggingRequest stopAccessLoggingRequest,
            com.amazonaws.handlers.AsyncHandler<StopAccessLoggingRequest, StopAccessLoggingResult> asyncHandler);

}
