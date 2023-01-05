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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudcontrolapi.model.*;
import com.amazonaws.services.cloudcontrolapi.waiters.AWSCloudControlApiWaiters;

/**
 * Interface for accessing CloudControlApi.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.cloudcontrolapi.AbstractAWSCloudControlApi} instead.
 * </p>
 * <p>
 * <p>
 * For more information about Amazon Web Services Cloud Control API, see the <a
 * href="https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/what-is-cloudcontrolapi.html">Amazon Web Services
 * Cloud Control API User Guide</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSCloudControlApi {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "cloudcontrolapi";

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
     * @return Result of the CancelResourceRequest operation returned by the service.
     * @throws ConcurrentModificationException
     *         The resource is currently being modified by another operation.
     * @throws RequestTokenNotFoundException
     *         A resource operation with the specified request token can't be found.
     * @sample AWSCloudControlApi.CancelResourceRequest
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/CancelResourceRequest"
     *      target="_top">AWS API Documentation</a>
     */
    CancelResourceRequestResult cancelResourceRequest(CancelResourceRequestRequest cancelResourceRequestRequest);

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
     * @return Result of the CreateResource operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource with the name requested already exists.
     * @throws HandlerInternalFailureException
     *         The resource handler has returned that an unexpected error occurred within the resource handler.
     * @throws GeneralServiceException
     *         The resource handler has returned that the downstream service generated an error that doesn't map to any
     *         other handler error code.
     * @throws NotUpdatableException
     *         One or more properties included in this resource operation are defined as create-only, and therefore
     *         can't be updated.
     * @throws TypeNotFoundException
     *         The specified extension doesn't exist in the CloudFormation registry.
     * @throws ConcurrentOperationException
     *         Another resource operation is currently being performed on this resource.
     * @throws InvalidRequestException
     *         The resource handler has returned that invalid input from the user has generated a generic exception.
     * @throws PrivateTypeException
     *         Cloud Control API hasn't received a valid response from the resource handler, due to a configuration
     *         error. This includes issues such as the resource handler returning an invalid response, or timing out.
     * @throws ResourceNotFoundException
     *         A resource with the specified identifier can't be found.
     * @throws NetworkFailureException
     *         The resource handler has returned that the request couldn't be completed due to networking issues, such
     *         as a failure to receive a response from the server.
     * @throws UnsupportedActionException
     *         The specified resource doesn't support this resource operation.
     * @throws NotStabilizedException
     *         The resource handler has returned that the downstream resource failed to complete all of its ready-state
     *         checks.
     * @throws ServiceInternalErrorException
     *         The resource handler has returned that the downstream service returned an internal error, typically with
     *         a <code>5XX HTTP</code> status code.
     * @throws HandlerFailureException
     *         The resource handler has failed without a returning a more specific error code. This can include
     *         timeouts.
     * @throws ServiceLimitExceededException
     *         The resource handler has returned that a non-transient resource limit was reached on the service side.
     * @throws InvalidCredentialsException
     *         The resource handler has returned that the credentials provided by the user are invalid.
     * @throws ResourceConflictException
     *         The resource is temporarily unavailable to be acted upon. For example, if the resource is currently
     *         undergoing an operation and can't be acted upon until that operation is finished.
     * @throws ClientTokenConflictException
     *         The specified client token has already been used in another resource request.</p>
     *         <p>
     *         It's best practice for client tokens to be unique for each resource operation request. However, client
     *         token expire after 36 hours.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCloudControlApi.CreateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/CreateResource" target="_top">AWS
     *      API Documentation</a>
     */
    CreateResourceResult createResource(CreateResourceRequest createResourceRequest);

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
     * @return Result of the DeleteResource operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource with the name requested already exists.
     * @throws HandlerInternalFailureException
     *         The resource handler has returned that an unexpected error occurred within the resource handler.
     * @throws GeneralServiceException
     *         The resource handler has returned that the downstream service generated an error that doesn't map to any
     *         other handler error code.
     * @throws NotUpdatableException
     *         One or more properties included in this resource operation are defined as create-only, and therefore
     *         can't be updated.
     * @throws TypeNotFoundException
     *         The specified extension doesn't exist in the CloudFormation registry.
     * @throws ConcurrentOperationException
     *         Another resource operation is currently being performed on this resource.
     * @throws InvalidRequestException
     *         The resource handler has returned that invalid input from the user has generated a generic exception.
     * @throws PrivateTypeException
     *         Cloud Control API hasn't received a valid response from the resource handler, due to a configuration
     *         error. This includes issues such as the resource handler returning an invalid response, or timing out.
     * @throws ResourceNotFoundException
     *         A resource with the specified identifier can't be found.
     * @throws NetworkFailureException
     *         The resource handler has returned that the request couldn't be completed due to networking issues, such
     *         as a failure to receive a response from the server.
     * @throws UnsupportedActionException
     *         The specified resource doesn't support this resource operation.
     * @throws NotStabilizedException
     *         The resource handler has returned that the downstream resource failed to complete all of its ready-state
     *         checks.
     * @throws ServiceInternalErrorException
     *         The resource handler has returned that the downstream service returned an internal error, typically with
     *         a <code>5XX HTTP</code> status code.
     * @throws HandlerFailureException
     *         The resource handler has failed without a returning a more specific error code. This can include
     *         timeouts.
     * @throws ServiceLimitExceededException
     *         The resource handler has returned that a non-transient resource limit was reached on the service side.
     * @throws InvalidCredentialsException
     *         The resource handler has returned that the credentials provided by the user are invalid.
     * @throws ResourceConflictException
     *         The resource is temporarily unavailable to be acted upon. For example, if the resource is currently
     *         undergoing an operation and can't be acted upon until that operation is finished.
     * @throws ClientTokenConflictException
     *         The specified client token has already been used in another resource request.</p>
     *         <p>
     *         It's best practice for client tokens to be unique for each resource operation request. However, client
     *         token expire after 36 hours.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCloudControlApi.DeleteResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/DeleteResource" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteResourceResult deleteResource(DeleteResourceRequest deleteResourceRequest);

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
     * @return Result of the GetResource operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource with the name requested already exists.
     * @throws HandlerInternalFailureException
     *         The resource handler has returned that an unexpected error occurred within the resource handler.
     * @throws GeneralServiceException
     *         The resource handler has returned that the downstream service generated an error that doesn't map to any
     *         other handler error code.
     * @throws NotUpdatableException
     *         One or more properties included in this resource operation are defined as create-only, and therefore
     *         can't be updated.
     * @throws TypeNotFoundException
     *         The specified extension doesn't exist in the CloudFormation registry.
     * @throws InvalidRequestException
     *         The resource handler has returned that invalid input from the user has generated a generic exception.
     * @throws PrivateTypeException
     *         Cloud Control API hasn't received a valid response from the resource handler, due to a configuration
     *         error. This includes issues such as the resource handler returning an invalid response, or timing out.
     * @throws ResourceNotFoundException
     *         A resource with the specified identifier can't be found.
     * @throws NetworkFailureException
     *         The resource handler has returned that the request couldn't be completed due to networking issues, such
     *         as a failure to receive a response from the server.
     * @throws UnsupportedActionException
     *         The specified resource doesn't support this resource operation.
     * @throws NotStabilizedException
     *         The resource handler has returned that the downstream resource failed to complete all of its ready-state
     *         checks.
     * @throws ServiceInternalErrorException
     *         The resource handler has returned that the downstream service returned an internal error, typically with
     *         a <code>5XX HTTP</code> status code.
     * @throws HandlerFailureException
     *         The resource handler has failed without a returning a more specific error code. This can include
     *         timeouts.
     * @throws ServiceLimitExceededException
     *         The resource handler has returned that a non-transient resource limit was reached on the service side.
     * @throws InvalidCredentialsException
     *         The resource handler has returned that the credentials provided by the user are invalid.
     * @throws ResourceConflictException
     *         The resource is temporarily unavailable to be acted upon. For example, if the resource is currently
     *         undergoing an operation and can't be acted upon until that operation is finished.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCloudControlApi.GetResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/GetResource" target="_top">AWS API
     *      Documentation</a>
     */
    GetResourceResult getResource(GetResourceRequest getResourceRequest);

    /**
     * <p>
     * Returns the current status of a resource operation request. For more information, see <a href=
     * "https://docs.aws.amazon.com/cloudcontrolapi/latest/userguide/resource-operations-manage-requests.html#resource-operations-manage-requests-track"
     * >Tracking the progress of resource operation requests</a> in the <i>Amazon Web Services Cloud Control API User
     * Guide</i>.
     * </p>
     * 
     * @param getResourceRequestStatusRequest
     * @return Result of the GetResourceRequestStatus operation returned by the service.
     * @throws RequestTokenNotFoundException
     *         A resource operation with the specified request token can't be found.
     * @sample AWSCloudControlApi.GetResourceRequestStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/GetResourceRequestStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetResourceRequestStatusResult getResourceRequestStatus(GetResourceRequestStatusRequest getResourceRequestStatusRequest);

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
     * @return Result of the ListResourceRequests operation returned by the service.
     * @sample AWSCloudControlApi.ListResourceRequests
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/ListResourceRequests"
     *      target="_top">AWS API Documentation</a>
     */
    ListResourceRequestsResult listResourceRequests(ListResourceRequestsRequest listResourceRequestsRequest);

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
     * @return Result of the ListResources operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource with the name requested already exists.
     * @throws HandlerInternalFailureException
     *         The resource handler has returned that an unexpected error occurred within the resource handler.
     * @throws GeneralServiceException
     *         The resource handler has returned that the downstream service generated an error that doesn't map to any
     *         other handler error code.
     * @throws NotUpdatableException
     *         One or more properties included in this resource operation are defined as create-only, and therefore
     *         can't be updated.
     * @throws TypeNotFoundException
     *         The specified extension doesn't exist in the CloudFormation registry.
     * @throws InvalidRequestException
     *         The resource handler has returned that invalid input from the user has generated a generic exception.
     * @throws PrivateTypeException
     *         Cloud Control API hasn't received a valid response from the resource handler, due to a configuration
     *         error. This includes issues such as the resource handler returning an invalid response, or timing out.
     * @throws ResourceNotFoundException
     *         A resource with the specified identifier can't be found.
     * @throws NetworkFailureException
     *         The resource handler has returned that the request couldn't be completed due to networking issues, such
     *         as a failure to receive a response from the server.
     * @throws UnsupportedActionException
     *         The specified resource doesn't support this resource operation.
     * @throws NotStabilizedException
     *         The resource handler has returned that the downstream resource failed to complete all of its ready-state
     *         checks.
     * @throws ServiceInternalErrorException
     *         The resource handler has returned that the downstream service returned an internal error, typically with
     *         a <code>5XX HTTP</code> status code.
     * @throws HandlerFailureException
     *         The resource handler has failed without a returning a more specific error code. This can include
     *         timeouts.
     * @throws ServiceLimitExceededException
     *         The resource handler has returned that a non-transient resource limit was reached on the service side.
     * @throws InvalidCredentialsException
     *         The resource handler has returned that the credentials provided by the user are invalid.
     * @throws ResourceConflictException
     *         The resource is temporarily unavailable to be acted upon. For example, if the resource is currently
     *         undergoing an operation and can't be acted upon until that operation is finished.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCloudControlApi.ListResources
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/ListResources" target="_top">AWS API
     *      Documentation</a>
     */
    ListResourcesResult listResources(ListResourcesRequest listResourcesRequest);

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
     * @return Result of the UpdateResource operation returned by the service.
     * @throws AlreadyExistsException
     *         The resource with the name requested already exists.
     * @throws HandlerInternalFailureException
     *         The resource handler has returned that an unexpected error occurred within the resource handler.
     * @throws GeneralServiceException
     *         The resource handler has returned that the downstream service generated an error that doesn't map to any
     *         other handler error code.
     * @throws NotUpdatableException
     *         One or more properties included in this resource operation are defined as create-only, and therefore
     *         can't be updated.
     * @throws TypeNotFoundException
     *         The specified extension doesn't exist in the CloudFormation registry.
     * @throws ConcurrentOperationException
     *         Another resource operation is currently being performed on this resource.
     * @throws InvalidRequestException
     *         The resource handler has returned that invalid input from the user has generated a generic exception.
     * @throws PrivateTypeException
     *         Cloud Control API hasn't received a valid response from the resource handler, due to a configuration
     *         error. This includes issues such as the resource handler returning an invalid response, or timing out.
     * @throws ResourceNotFoundException
     *         A resource with the specified identifier can't be found.
     * @throws NetworkFailureException
     *         The resource handler has returned that the request couldn't be completed due to networking issues, such
     *         as a failure to receive a response from the server.
     * @throws UnsupportedActionException
     *         The specified resource doesn't support this resource operation.
     * @throws NotStabilizedException
     *         The resource handler has returned that the downstream resource failed to complete all of its ready-state
     *         checks.
     * @throws ServiceInternalErrorException
     *         The resource handler has returned that the downstream service returned an internal error, typically with
     *         a <code>5XX HTTP</code> status code.
     * @throws HandlerFailureException
     *         The resource handler has failed without a returning a more specific error code. This can include
     *         timeouts.
     * @throws ServiceLimitExceededException
     *         The resource handler has returned that a non-transient resource limit was reached on the service side.
     * @throws InvalidCredentialsException
     *         The resource handler has returned that the credentials provided by the user are invalid.
     * @throws ResourceConflictException
     *         The resource is temporarily unavailable to be acted upon. For example, if the resource is currently
     *         undergoing an operation and can't be acted upon until that operation is finished.
     * @throws ClientTokenConflictException
     *         The specified client token has already been used in another resource request.</p>
     *         <p>
     *         It's best practice for client tokens to be unique for each resource operation request. However, client
     *         token expire after 36 hours.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @sample AWSCloudControlApi.UpdateResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudcontrol-2021-09-30/UpdateResource" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateResourceResult updateResource(UpdateResourceRequest updateResourceRequest);

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

    AWSCloudControlApiWaiters waiters();

}
