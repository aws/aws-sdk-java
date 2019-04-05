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
package com.amazonaws.services.iot1clickprojects;

import javax.annotation.Generated;

import com.amazonaws.services.iot1clickprojects.model.*;

/**
 * Interface for accessing AWS IoT 1-Click Projects asynchronously. Each asynchronous method will return a Java Future
 * object representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iot1clickprojects.AbstractAWSIoT1ClickProjectsAsync} instead.
 * </p>
 * <p>
 * <p>
 * The AWS IoT 1-Click Projects API Reference
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoT1ClickProjectsAsync extends AWSIoT1ClickProjects {

    /**
     * <p>
     * Associates a physical device with a placement.
     * </p>
     * 
     * @param associateDeviceWithPlacementRequest
     * @return A Java Future containing the result of the AssociateDeviceWithPlacement operation returned by the
     *         service.
     * @sample AWSIoT1ClickProjectsAsync.AssociateDeviceWithPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/AssociateDeviceWithPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDeviceWithPlacementResult> associateDeviceWithPlacementAsync(
            AssociateDeviceWithPlacementRequest associateDeviceWithPlacementRequest);

    /**
     * <p>
     * Associates a physical device with a placement.
     * </p>
     * 
     * @param associateDeviceWithPlacementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AssociateDeviceWithPlacement operation returned by the
     *         service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.AssociateDeviceWithPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/AssociateDeviceWithPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<AssociateDeviceWithPlacementResult> associateDeviceWithPlacementAsync(
            AssociateDeviceWithPlacementRequest associateDeviceWithPlacementRequest,
            com.amazonaws.handlers.AsyncHandler<AssociateDeviceWithPlacementRequest, AssociateDeviceWithPlacementResult> asyncHandler);

    /**
     * <p>
     * Creates an empty placement.
     * </p>
     * 
     * @param createPlacementRequest
     * @return A Java Future containing the result of the CreatePlacement operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.CreatePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/CreatePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePlacementResult> createPlacementAsync(CreatePlacementRequest createPlacementRequest);

    /**
     * <p>
     * Creates an empty placement.
     * </p>
     * 
     * @param createPlacementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlacement operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.CreatePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/CreatePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreatePlacementResult> createPlacementAsync(CreatePlacementRequest createPlacementRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePlacementRequest, CreatePlacementResult> asyncHandler);

    /**
     * <p>
     * Creates an empty project with a placement template. A project contains zero or more placements that adhere to the
     * placement template defined in the project.
     * </p>
     * 
     * @param createProjectRequest
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/CreateProject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest);

    /**
     * <p>
     * Creates an empty project with a placement template. A project contains zero or more placements that adhere to the
     * placement template defined in the project.
     * </p>
     * 
     * @param createProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateProject operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/CreateProject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateProjectResult> createProjectAsync(CreateProjectRequest createProjectRequest,
            com.amazonaws.handlers.AsyncHandler<CreateProjectRequest, CreateProjectResult> asyncHandler);

    /**
     * <p>
     * Deletes a placement. To delete a placement, it must not have any devices associated with it.
     * </p>
     * <note>
     * <p>
     * When you delete a placement, all associated data becomes irretrievable.
     * </p>
     * </note>
     * 
     * @param deletePlacementRequest
     * @return A Java Future containing the result of the DeletePlacement operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.DeletePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DeletePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePlacementResult> deletePlacementAsync(DeletePlacementRequest deletePlacementRequest);

    /**
     * <p>
     * Deletes a placement. To delete a placement, it must not have any devices associated with it.
     * </p>
     * <note>
     * <p>
     * When you delete a placement, all associated data becomes irretrievable.
     * </p>
     * </note>
     * 
     * @param deletePlacementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeletePlacement operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.DeletePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DeletePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeletePlacementResult> deletePlacementAsync(DeletePlacementRequest deletePlacementRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePlacementRequest, DeletePlacementResult> asyncHandler);

    /**
     * <p>
     * Deletes a project. To delete a project, it must not have any placements associated with it.
     * </p>
     * <note>
     * <p>
     * When you delete a project, all associated data becomes irretrievable.
     * </p>
     * </note>
     * 
     * @param deleteProjectRequest
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DeleteProject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Deletes a project. To delete a project, it must not have any placements associated with it.
     * </p>
     * <note>
     * <p>
     * When you delete a project, all associated data becomes irretrievable.
     * </p>
     * </note>
     * 
     * @param deleteProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteProject operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DeleteProject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteProjectResult> deleteProjectAsync(DeleteProjectRequest deleteProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteProjectRequest, DeleteProjectResult> asyncHandler);

    /**
     * <p>
     * Describes a placement in a project.
     * </p>
     * 
     * @param describePlacementRequest
     * @return A Java Future containing the result of the DescribePlacement operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.DescribePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DescribePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePlacementResult> describePlacementAsync(DescribePlacementRequest describePlacementRequest);

    /**
     * <p>
     * Describes a placement in a project.
     * </p>
     * 
     * @param describePlacementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePlacement operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.DescribePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DescribePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePlacementResult> describePlacementAsync(DescribePlacementRequest describePlacementRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePlacementRequest, DescribePlacementResult> asyncHandler);

    /**
     * <p>
     * Returns an object describing a project.
     * </p>
     * 
     * @param describeProjectRequest
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DescribeProject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest);

    /**
     * <p>
     * Returns an object describing a project.
     * </p>
     * 
     * @param describeProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeProject operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DescribeProject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeProjectResult> describeProjectAsync(DescribeProjectRequest describeProjectRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeProjectRequest, DescribeProjectResult> asyncHandler);

    /**
     * <p>
     * Removes a physical device from a placement.
     * </p>
     * 
     * @param disassociateDeviceFromPlacementRequest
     * @return A Java Future containing the result of the DisassociateDeviceFromPlacement operation returned by the
     *         service.
     * @sample AWSIoT1ClickProjectsAsync.DisassociateDeviceFromPlacement
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DisassociateDeviceFromPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDeviceFromPlacementResult> disassociateDeviceFromPlacementAsync(
            DisassociateDeviceFromPlacementRequest disassociateDeviceFromPlacementRequest);

    /**
     * <p>
     * Removes a physical device from a placement.
     * </p>
     * 
     * @param disassociateDeviceFromPlacementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisassociateDeviceFromPlacement operation returned by the
     *         service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.DisassociateDeviceFromPlacement
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DisassociateDeviceFromPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DisassociateDeviceFromPlacementResult> disassociateDeviceFromPlacementAsync(
            DisassociateDeviceFromPlacementRequest disassociateDeviceFromPlacementRequest,
            com.amazonaws.handlers.AsyncHandler<DisassociateDeviceFromPlacementRequest, DisassociateDeviceFromPlacementResult> asyncHandler);

    /**
     * <p>
     * Returns an object enumerating the devices in a placement.
     * </p>
     * 
     * @param getDevicesInPlacementRequest
     * @return A Java Future containing the result of the GetDevicesInPlacement operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.GetDevicesInPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/GetDevicesInPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDevicesInPlacementResult> getDevicesInPlacementAsync(GetDevicesInPlacementRequest getDevicesInPlacementRequest);

    /**
     * <p>
     * Returns an object enumerating the devices in a placement.
     * </p>
     * 
     * @param getDevicesInPlacementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetDevicesInPlacement operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.GetDevicesInPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/GetDevicesInPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetDevicesInPlacementResult> getDevicesInPlacementAsync(GetDevicesInPlacementRequest getDevicesInPlacementRequest,
            com.amazonaws.handlers.AsyncHandler<GetDevicesInPlacementRequest, GetDevicesInPlacementResult> asyncHandler);

    /**
     * <p>
     * Lists the placement(s) of a project.
     * </p>
     * 
     * @param listPlacementsRequest
     * @return A Java Future containing the result of the ListPlacements operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.ListPlacements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListPlacements"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPlacementsResult> listPlacementsAsync(ListPlacementsRequest listPlacementsRequest);

    /**
     * <p>
     * Lists the placement(s) of a project.
     * </p>
     * 
     * @param listPlacementsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPlacements operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.ListPlacements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListPlacements"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListPlacementsResult> listPlacementsAsync(ListPlacementsRequest listPlacementsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPlacementsRequest, ListPlacementsResult> asyncHandler);

    /**
     * <p>
     * Lists the AWS IoT 1-Click project(s) associated with your AWS account and region.
     * </p>
     * 
     * @param listProjectsRequest
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListProjects"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Lists the AWS IoT 1-Click project(s) associated with your AWS account and region.
     * </p>
     * 
     * @param listProjectsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListProjects operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListProjects"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListProjectsResult> listProjectsAsync(ListProjectsRequest listProjectsRequest,
            com.amazonaws.handlers.AsyncHandler<ListProjectsRequest, ListProjectsResult> asyncHandler);

    /**
     * <p>
     * Lists the tags (metadata key/value pairs) which you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags (metadata key/value pairs) which you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Creates or modifies tags for a resource. Tags are key/value pairs (metadata) that can be used to manage a
     * resource. For more information, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging Strategies</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Creates or modifies tags for a resource. Tags are key/value pairs (metadata) that can be used to manage a
     * resource. For more information, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging Strategies</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes one or more tags (metadata key/value pairs) from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes one or more tags (metadata key/value pairs) from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a placement with the given attributes. To clear an attribute, pass an empty value (i.e., "").
     * </p>
     * 
     * @param updatePlacementRequest
     * @return A Java Future containing the result of the UpdatePlacement operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.UpdatePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/UpdatePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePlacementResult> updatePlacementAsync(UpdatePlacementRequest updatePlacementRequest);

    /**
     * <p>
     * Updates a placement with the given attributes. To clear an attribute, pass an empty value (i.e., "").
     * </p>
     * 
     * @param updatePlacementRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdatePlacement operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.UpdatePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/UpdatePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdatePlacementResult> updatePlacementAsync(UpdatePlacementRequest updatePlacementRequest,
            com.amazonaws.handlers.AsyncHandler<UpdatePlacementRequest, UpdatePlacementResult> asyncHandler);

    /**
     * <p>
     * Updates a project associated with your AWS account and region. With the exception of device template names, you
     * can pass just the values that need to be updated because the update request will change only the values that are
     * provided. To clear a value, pass the empty string (i.e., <code>""</code>).
     * </p>
     * 
     * @param updateProjectRequest
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsync.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/UpdateProject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest);

    /**
     * <p>
     * Updates a project associated with your AWS account and region. With the exception of device template names, you
     * can pass just the values that need to be updated because the update request will change only the values that are
     * provided. To clear a value, pass the empty string (i.e., <code>""</code>).
     * </p>
     * 
     * @param updateProjectRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateProject operation returned by the service.
     * @sample AWSIoT1ClickProjectsAsyncHandler.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/UpdateProject"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateProjectResult> updateProjectAsync(UpdateProjectRequest updateProjectRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateProjectRequest, UpdateProjectResult> asyncHandler);

}
