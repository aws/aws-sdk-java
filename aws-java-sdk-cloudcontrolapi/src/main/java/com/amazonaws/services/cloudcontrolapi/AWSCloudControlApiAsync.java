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
package com.amazonaws.services.cloudcontrolapi;

import javax.annotation.Generated;

import com.amazonaws.services.cloudcontrolapi.model.*;

/**
 * Interface for accessing CloudControlApi asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudcontrolapi.AbstractAWSCloudControlApiAsync} instead.
 * </p>
 * <p>
 * <p>
 * For more information about Amazon Web Services Cloud Control API, see the <a
 * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/what-is-cloudcontrolapi.html">Amazon Web Services
 * Cloud Control API User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCloudControlApiAsync extends AWSCloudControlApi {

    /**
     * <p>
     * Cancels the specified resource operation request. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-manage-requests.html#resource-operations-manage-requests-cancel"
     * >Canceling resource operation requests</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * Only resource operations requests with a status of <code>PENDING</code> or <code>IN_PROGRESS</code> can be
     * canceled.
     * </p>
     * 
     * @param cancelResourceRequestRequest
     * @return A Java Future containing the result of the CancelResourceRequest operation returned by the service.
     * @sample AWSCloudControlApiAsync.CancelResourceRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/CancelResourceRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelResourceRequestResult> cancelResourceRequestAsync(CancelResourceRequestRequest cancelResourceRequestRequest);

    /**
     * <p>
     * Cancels the specified resource operation request. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-manage-requests.html#resource-operations-manage-requests-cancel"
     * >Canceling resource operation requests</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * Only resource operations requests with a status of <code>PENDING</code> or <code>IN_PROGRESS</code> can be
     * canceled.
     * </p>
     * 
     * @param cancelResourceRequestRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelResourceRequest operation returned by the service.
     * @sample AWSCloudControlApiAsyncHandler.CancelResourceRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/CancelResourceRequest"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CancelResourceRequestResult> cancelResourceRequestAsync(CancelResourceRequestRequest cancelResourceRequestRequest,
            com.amazonaws.handlers.AsyncHandler<CancelResourceRequestRequest, CancelResourceRequestResult> asyncHandler);

    /**
     * <p>
     * Creates the specified resource. For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-create.html">Creating a
     * resource</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * After you have initiated a resource creation request, you can monitor the progress of your request by calling <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html">
     * GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code> type returned
     * by <code>CreateResource</code>.
     * </p>
     * 
     * @param createResourceRequest
     * @return A Java Future containing the result of the CreateResource operation returned by the service.
     * @sample AWSCloudControlApiAsync.CreateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/CreateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceResult> createResourceAsync(CreateResourceRequest createResourceRequest);

    /**
     * <p>
     * Creates the specified resource. For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-create.html">Creating a
     * resource</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * After you have initiated a resource creation request, you can monitor the progress of your request by calling <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html">
     * GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code> type returned
     * by <code>CreateResource</code>.
     * </p>
     * 
     * @param createResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateResource operation returned by the service.
     * @sample AWSCloudControlApiAsyncHandler.CreateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/CreateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateResourceResult> createResourceAsync(CreateResourceRequest createResourceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateResourceRequest, CreateResourceResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified resource. For details, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-delete.html">Deleting a
     * resource</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * After you have initiated a resource deletion request, you can monitor the progress of your request by calling <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html">
     * GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code> returned by
     * <code>DeleteResource</code>.
     * </p>
     * 
     * @param deleteResourceRequest
     * @return A Java Future containing the result of the DeleteResource operation returned by the service.
     * @sample AWSCloudControlApiAsync.DeleteResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/DeleteResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(DeleteResourceRequest deleteResourceRequest);

    /**
     * <p>
     * Deletes the specified resource. For details, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-delete.html">Deleting a
     * resource</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * After you have initiated a resource deletion request, you can monitor the progress of your request by calling <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html">
     * GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code> returned by
     * <code>DeleteResource</code>.
     * </p>
     * 
     * @param deleteResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteResource operation returned by the service.
     * @sample AWSCloudControlApiAsyncHandler.DeleteResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/DeleteResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteResourceResult> deleteResourceAsync(DeleteResourceRequest deleteResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteResourceRequest, DeleteResourceResult> asyncHandler);

    /**
     * <p>
     * Returns information about the current state of the specified resource. For details, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-read.html">Reading a
     * resource's current state</a>.
     * </p>
     * <p>
     * You can use this action to return information about an existing resource in your account and Amazon Web Services
     * Region, whether those resources were provisioned using Cloud Control API.
     * </p>
     * 
     * @param getResourceRequest
     * @return A Java Future containing the result of the GetResource operation returned by the service.
     * @sample AWSCloudControlApiAsync.GetResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/GetResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceResult> getResourceAsync(GetResourceRequest getResourceRequest);

    /**
     * <p>
     * Returns information about the current state of the specified resource. For details, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-read.html">Reading a
     * resource's current state</a>.
     * </p>
     * <p>
     * You can use this action to return information about an existing resource in your account and Amazon Web Services
     * Region, whether those resources were provisioned using Cloud Control API.
     * </p>
     * 
     * @param getResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResource operation returned by the service.
     * @sample AWSCloudControlApiAsyncHandler.GetResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/GetResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetResourceResult> getResourceAsync(GetResourceRequest getResourceRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceRequest, GetResourceResult> asyncHandler);

    /**
     * <p>
     * Returns the current status of a resource operation request. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-manage-requests.html#resource-operations-manage-requests-track"
     * >Tracking the progress of resource operation requests</a> in the <i>Amazon Web Services Cloud Control API User
     * Guide</i>.
     * </p>
     * 
     * @param getResourceRequestStatusRequest
     * @return A Java Future containing the result of the GetResourceRequestStatus operation returned by the service.
     * @sample AWSCloudControlApiAsync.GetResourceRequestStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/GetResourceRequestStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceRequestStatusResult> getResourceRequestStatusAsync(GetResourceRequestStatusRequest getResourceRequestStatusRequest);

    /**
     * <p>
     * Returns the current status of a resource operation request. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-manage-requests.html#resource-operations-manage-requests-track"
     * >Tracking the progress of resource operation requests</a> in the <i>Amazon Web Services Cloud Control API User
     * Guide</i>.
     * </p>
     * 
     * @param getResourceRequestStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetResourceRequestStatus operation returned by the service.
     * @sample AWSCloudControlApiAsyncHandler.GetResourceRequestStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/GetResourceRequestStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetResourceRequestStatusResult> getResourceRequestStatusAsync(GetResourceRequestStatusRequest getResourceRequestStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetResourceRequestStatusRequest, GetResourceRequestStatusResult> asyncHandler);

    /**
     * <p>
     * Returns existing resource operation requests. This includes requests of all status types. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-manage-requests.html#resource-operations-manage-requests-list"
     * >Listing active resource operation requests</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Resource operation requests expire after 7 days.
     * </p>
     * </note>
     * 
     * @param listResourceRequestsRequest
     * @return A Java Future containing the result of the ListResourceRequests operation returned by the service.
     * @sample AWSCloudControlApiAsync.ListResourceRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/ListResourceRequests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceRequestsResult> listResourceRequestsAsync(ListResourceRequestsRequest listResourceRequestsRequest);

    /**
     * <p>
     * Returns existing resource operation requests. This includes requests of all status types. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-manage-requests.html#resource-operations-manage-requests-list"
     * >Listing active resource operation requests</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <note>
     * <p>
     * Resource operation requests expire after 7 days.
     * </p>
     * </note>
     * 
     * @param listResourceRequestsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResourceRequests operation returned by the service.
     * @sample AWSCloudControlApiAsyncHandler.ListResourceRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/ListResourceRequests"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListResourceRequestsResult> listResourceRequestsAsync(ListResourceRequestsRequest listResourceRequestsRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourceRequestsRequest, ListResourceRequestsResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified resources. For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-list.html">Discovering
     * resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * You can use this action to return information about existing resources in your account and Amazon Web Services
     * Region, whether those resources were provisioned using Cloud Control API.
     * </p>
     * 
     * @param listResourcesRequest
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AWSCloudControlApiAsync.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest);

    /**
     * <p>
     * Returns information about the specified resources. For more information, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-list.html">Discovering
     * resources</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * You can use this action to return information about existing resources in your account and Amazon Web Services
     * Region, whether those resources were provisioned using Cloud Control API.
     * </p>
     * 
     * @param listResourcesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListResources operation returned by the service.
     * @sample AWSCloudControlApiAsyncHandler.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListResourcesResult> listResourcesAsync(ListResourcesRequest listResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListResourcesRequest, ListResourcesResult> asyncHandler);

    /**
     * <p>
     * Updates the specified property values in the resource.
     * </p>
     * <p>
     * You specify your resource property updates as a list of patch operations contained in a JSON patch document that
     * adheres to the <a href="https://datatracker.ietf.org/doc/html/rfc6902"> <i>RFC 6902 - JavaScript Object Notation
     * (JSON) Patch</i> </a> standard.
     * </p>
     * <p>
     * For details on how Cloud Control API performs resource update operations, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-update.html">Updating a
     * resource</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * After you have initiated a resource update request, you can monitor the progress of your request by calling <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html">
     * GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code> returned by
     * <code>UpdateResource</code>.
     * </p>
     * <p>
     * For more information about the properties of a specific resource, refer to the related topic for the resource in
     * the <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">
     * Resource and property types reference</a> in the <i>CloudFormation Users Guide</i>.
     * </p>
     * 
     * @param updateResourceRequest
     * @return A Java Future containing the result of the UpdateResource operation returned by the service.
     * @sample AWSCloudControlApiAsync.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/UpdateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest updateResourceRequest);

    /**
     * <p>
     * Updates the specified property values in the resource.
     * </p>
     * <p>
     * You specify your resource property updates as a list of patch operations contained in a JSON patch document that
     * adheres to the <a href="https://datatracker.ietf.org/doc/html/rfc6902"> <i>RFC 6902 - JavaScript Object Notation
     * (JSON) Patch</i> </a> standard.
     * </p>
     * <p>
     * For details on how Cloud Control API performs resource update operations, see <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-update.html">Updating a
     * resource</a> in the <i>Amazon Web Services Cloud Control API User Guide</i>.
     * </p>
     * <p>
     * After you have initiated a resource update request, you can monitor the progress of your request by calling <a
     * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/APIReference/API_GetResourceRequestStatus.html">
     * GetResourceRequestStatus</a> using the <code>RequestToken</code> of the <code>ProgressEvent</code> returned by
     * <code>UpdateResource</code>.
     * </p>
     * <p>
     * For more information about the properties of a specific resource, refer to the related topic for the resource in
     * the <a href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html">
     * Resource and property types reference</a> in the <i>CloudFormation Users Guide</i>.
     * </p>
     * 
     * @param updateResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateResource operation returned by the service.
     * @sample AWSCloudControlApiAsyncHandler.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/UpdateResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateResourceResult> updateResourceAsync(UpdateResourceRequest updateResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateResourceRequest, UpdateResourceResult> asyncHandler);

}
