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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.workspacesthinclient.model.*;

/**
 * Interface for accessing Amazon WorkSpaces Thin Client.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.workspacesthinclient.AbstractAmazonWorkSpacesThinClient} instead.
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
public interface AmazonWorkSpacesThinClient {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "thinclient";

    /**
     * <p>
     * Creates an environment for your thin client devices.
     * </p>
     * 
     * @param createEnvironmentRequest
     * @return Result of the CreateEnvironment operation returned by the service.
     * @throws ServiceQuotaExceededException
     *         Your request exceeds a service quota.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.CreateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/CreateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    CreateEnvironmentResult createEnvironment(CreateEnvironmentRequest createEnvironmentRequest);

    /**
     * <p>
     * Deletes a thin client device.
     * </p>
     * 
     * @param deleteDeviceRequest
     * @return Result of the DeleteDevice operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.DeleteDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/DeleteDevice"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteDeviceResult deleteDevice(DeleteDeviceRequest deleteDeviceRequest);

    /**
     * <p>
     * Deletes an environment.
     * </p>
     * 
     * @param deleteEnvironmentRequest
     * @return Result of the DeleteEnvironment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.DeleteEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/DeleteEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteEnvironmentResult deleteEnvironment(DeleteEnvironmentRequest deleteEnvironmentRequest);

    /**
     * <p>
     * Deregisters a thin client device.
     * </p>
     * 
     * @param deregisterDeviceRequest
     * @return Result of the DeregisterDevice operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.DeregisterDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/DeregisterDevice"
     *      target="_top">AWS API Documentation</a>
     */
    DeregisterDeviceResult deregisterDevice(DeregisterDeviceRequest deregisterDeviceRequest);

    /**
     * <p>
     * Returns information for a thin client device.
     * </p>
     * 
     * @param getDeviceRequest
     * @return Result of the GetDevice operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.GetDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/GetDevice"
     *      target="_top">AWS API Documentation</a>
     */
    GetDeviceResult getDevice(GetDeviceRequest getDeviceRequest);

    /**
     * <p>
     * Returns information for an environment.
     * </p>
     * 
     * @param getEnvironmentRequest
     * @return Result of the GetEnvironment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.GetEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/GetEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    GetEnvironmentResult getEnvironment(GetEnvironmentRequest getEnvironmentRequest);

    /**
     * <p>
     * Returns information for a software set.
     * </p>
     * 
     * @param getSoftwareSetRequest
     * @return Result of the GetSoftwareSet operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.GetSoftwareSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/GetSoftwareSet"
     *      target="_top">AWS API Documentation</a>
     */
    GetSoftwareSetResult getSoftwareSet(GetSoftwareSetRequest getSoftwareSetRequest);

    /**
     * <p>
     * Returns a list of thin client devices.
     * </p>
     * 
     * @param listDevicesRequest
     * @return Result of the ListDevices operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.ListDevices
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/ListDevices"
     *      target="_top">AWS API Documentation</a>
     */
    ListDevicesResult listDevices(ListDevicesRequest listDevicesRequest);

    /**
     * <p>
     * Returns a list of environments.
     * </p>
     * 
     * @param listEnvironmentsRequest
     * @return Result of the ListEnvironments operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.ListEnvironments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/ListEnvironments"
     *      target="_top">AWS API Documentation</a>
     */
    ListEnvironmentsResult listEnvironments(ListEnvironmentsRequest listEnvironmentsRequest);

    /**
     * <p>
     * Returns a list of software sets.
     * </p>
     * 
     * @param listSoftwareSetsRequest
     * @return Result of the ListSoftwareSets operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.ListSoftwareSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/ListSoftwareSets"
     *      target="_top">AWS API Documentation</a>
     */
    ListSoftwareSetsResult listSoftwareSets(ListSoftwareSetsRequest listSoftwareSetsRequest);

    /**
     * <p>
     * Returns a list of tags for a resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Assigns one or more tags (key-value pairs) to the specified resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/TagResource"
     *      target="_top">AWS API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes a tag or tags from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a thin client device.
     * </p>
     * 
     * @param updateDeviceRequest
     * @return Result of the UpdateDevice operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.UpdateDevice
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UpdateDevice"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateDeviceResult updateDevice(UpdateDeviceRequest updateDeviceRequest);

    /**
     * <p>
     * Updates an environment.
     * </p>
     * 
     * @param updateEnvironmentRequest
     * @return Result of the UpdateEnvironment operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.UpdateEnvironment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UpdateEnvironment"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateEnvironmentResult updateEnvironment(UpdateEnvironmentRequest updateEnvironmentRequest);

    /**
     * <p>
     * Updates a software set.
     * </p>
     * 
     * @param updateSoftwareSetRequest
     * @return Result of the UpdateSoftwareSet operation returned by the service.
     * @throws ValidationException
     *         The input fails to satisfy the specified constraints.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ResourceNotFoundException
     *         The resource specified in the request was not found.
     * @throws ThrottlingException
     *         The request was denied due to request throttling.
     * @throws InternalServerException
     *         The server encountered an internal error and is unable to complete the request.
     * @sample AmazonWorkSpacesThinClient.UpdateSoftwareSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-thin-client-2023-08-22/UpdateSoftwareSet"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateSoftwareSetResult updateSoftwareSet(UpdateSoftwareSetRequest updateSoftwareSetRequest);

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
