/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.workspacesthinclient;

import javax.annotation.Generated;

import com.amazonaws.services.workspacesthinclient.model.*;

/**
 * Interface for accessing Amazon WorkSpaces Thin Client asynchronously. Each asynchronous method will return a Java
 * Future object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workspacesthinclient.AbstractAmazonWorkSpacesThinClientAsync} instead.
 * </p>
 * <p>
 * <p>
 * Amazon WorkSpaces Thin Client is an affordable device built to work with Amazon Web Services End User Computing (EUC)
 * virtual desktops to provide users with a complete cloud desktop solution. WorkSpaces Thin Client is a compact device
 * designed to connect up to two monitors and USB devices like a keyboard, mouse, headset, and webcam. To maximize
 * endpoint security, WorkSpaces Thin Client devices do not allow local data storage or installation of unapproved
 * applications. The WorkSpaces Thin Client device ships preloaded with device management software.
 * </p>
 * <p>
 * You can use these APIs to complete WorkSpaces Thin Client tasks, such as creating environments or viewing devices.
 * For more information about WorkSpaces Thin Client, including the required permissions to use the service, see the <a
 * href="https://docs.aws.amazon.com/workspaces-thin-client/latest/ag/">Amazon WorkSpaces Thin Client Administrator
 * Guide</a>. For more information about using the Command Line Interface (CLI) to manage your WorkSpaces Thin Client
 * resources, see the <a
 * href="https://docs.aws.amazon.com/cli/latest/reference/workspaces-thin-client/index.html">WorkSpaces Thin Client
 * section of the CLI Reference</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonWorkSpacesThinClientAsync extends AmazonWorkSpacesThinClient {

    /**
     * <p>
     * Creates an environment for your thin client devices.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/CreateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Creates an environment for your thin client devices.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateEnvironment operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/CreateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateEnvironmentResult> createEnvironmentAsync(CreateEnvironmentRequest createEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<CreateEnvironmentRequest, CreateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Deletes a thin client device.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return A Java Future containing the result of the DeleteDevice operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/DeleteDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest deleteDeviceRequest);

    /**
     * <p>
     * Deletes a thin client device.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteDevice operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/DeleteDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteDeviceResult> deleteDeviceAsync(DeleteDeviceRequest deleteDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteDeviceRequest, DeleteDeviceResult> asyncHandler);

    /**
     * <p>
     * Deletes an environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/DeleteEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Deletes an environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteEnvironment operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/DeleteEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteEnvironmentResult> deleteEnvironmentAsync(DeleteEnvironmentRequest deleteEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteEnvironmentRequest, DeleteEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Deregisters a thin client device.
     * </p>
     * 
     * @param deregisterDeviceRequest
     * @return A Java Future containing the result of the DeregisterDevice operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.DeregisterDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/DeregisterDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterDeviceResult> deregisterDeviceAsync(DeregisterDeviceRequest deregisterDeviceRequest);

    /**
     * <p>
     * Deregisters a thin client device.
     * </p>
     * 
     * @param deregisterDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterDevice operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.DeregisterDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/DeregisterDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterDeviceResult> deregisterDeviceAsync(DeregisterDeviceRequest deregisterDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterDeviceRequest, DeregisterDeviceResult> asyncHandler);

    /**
     * <p>
     * Returns information for a thin client device.
     * </p>
     * 
     * @param getDeviceRequest
     * @return A Java Future containing the result of the GetDevice operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/GetDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest getDeviceRequest);

    /**
     * <p>
     * Returns information for a thin client device.
     * </p>
     * 
     * @param getDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevice operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/GetDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDeviceResult> getDeviceAsync(GetDeviceRequest getDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<GetDeviceRequest, GetDeviceResult> asyncHandler);

    /**
     * <p>
     * Returns information for an environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/GetEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Returns information for an environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetEnvironment operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/GetEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetEnvironmentResult> getEnvironmentAsync(GetEnvironmentRequest getEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<GetEnvironmentRequest, GetEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Returns information for a software set.
     * </p>
     * 
     * @param getSoftwareSetRequest
     * @return A Java Future containing the result of the GetSoftwareSet operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.GetSoftwareSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/GetSoftwareSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSoftwareSetResult> getSoftwareSetAsync(GetSoftwareSetRequest getSoftwareSetRequest);

    /**
     * <p>
     * Returns information for a software set.
     * </p>
     * 
     * @param getSoftwareSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSoftwareSet operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.GetSoftwareSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/GetSoftwareSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetSoftwareSetResult> getSoftwareSetAsync(GetSoftwareSetRequest getSoftwareSetRequest,
            com.amazonaws.handlers.AsyncHandler<GetSoftwareSetRequest, GetSoftwareSetResult> asyncHandler);

    /**
     * <p>
     * Returns a list of thin client devices.
     * </p>
     * 
     * @param listDevicesRequest
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/ListDevices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Returns a list of thin client devices.
     * </p>
     * 
     * @param listDevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDevices operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/ListDevices"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListDevicesResult> listDevicesAsync(ListDevicesRequest listDevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDevicesRequest, ListDevicesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/ListEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Returns a list of environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEnvironments operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/ListEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListEnvironmentsResult> listEnvironmentsAsync(ListEnvironmentsRequest listEnvironmentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListEnvironmentsRequest, ListEnvironmentsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of software sets.
     * </p>
     * 
     * @param listSoftwareSetsRequest
     * @return A Java Future containing the result of the ListSoftwareSets operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.ListSoftwareSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/ListSoftwareSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSoftwareSetsResult> listSoftwareSetsAsync(ListSoftwareSetsRequest listSoftwareSetsRequest);

    /**
     * <p>
     * Returns a list of software sets.
     * </p>
     * 
     * @param listSoftwareSetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSoftwareSets operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.ListSoftwareSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/ListSoftwareSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSoftwareSetsResult> listSoftwareSetsAsync(ListSoftwareSetsRequest listSoftwareSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSoftwareSetsRequest, ListSoftwareSetsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Returns a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag or tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag or tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a thin client device.
     * </p>
     * 
     * @param updateDeviceRequest
     * @return A Java Future containing the result of the UpdateDevice operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UpdateDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceResult> updateDeviceAsync(UpdateDeviceRequest updateDeviceRequest);

    /**
     * <p>
     * Updates a thin client device.
     * </p>
     * 
     * @param updateDeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateDevice operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UpdateDevice"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateDeviceResult> updateDeviceAsync(UpdateDeviceRequest updateDeviceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateDeviceRequest, UpdateDeviceResult> asyncHandler);

    /**
     * <p>
     * Updates an environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UpdateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Updates an environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateEnvironment operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UpdateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateEnvironmentResult> updateEnvironmentAsync(UpdateEnvironmentRequest updateEnvironmentRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateEnvironmentRequest, UpdateEnvironmentResult> asyncHandler);

    /**
     * <p>
     * Updates a software set.
     * </p>
     * 
     * @param updateSoftwareSetRequest
     * @return A Java Future containing the result of the UpdateSoftwareSet operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsync.UpdateSoftwareSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UpdateSoftwareSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSoftwareSetResult> updateSoftwareSetAsync(UpdateSoftwareSetRequest updateSoftwareSetRequest);

    /**
     * <p>
     * Updates a software set.
     * </p>
     * 
     * @param updateSoftwareSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSoftwareSet operation returned by the service.
     * @sample AmazonWorkSpacesThinClientAsyncHandler.UpdateSoftwareSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UpdateSoftwareSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSoftwareSetResult> updateSoftwareSetAsync(UpdateSoftwareSetRequest updateSoftwareSetRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSoftwareSetRequest, UpdateSoftwareSetResult> asyncHandler);

}
