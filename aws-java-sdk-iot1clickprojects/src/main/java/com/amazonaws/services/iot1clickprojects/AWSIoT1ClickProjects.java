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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.iot1clickprojects.model.*;

/**
 * Interface for accessing AWS IoT 1-Click Projects.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.iot1clickprojects.AbstractAWSIoT1ClickProjects} instead.
 * </p>
 * <p>
 * <p>
 * The AWS IoT 1-Click Projects API Reference
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSIoT1ClickProjects {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "projects.iot1click";

    /**
     * <p>
     * Associates a physical device with a placement.
     * </p>
     * 
     * @param associateDeviceWithPlacementRequest
     * @return Result of the AssociateDeviceWithPlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceConflictException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.AssociateDeviceWithPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/AssociateDeviceWithPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    AssociateDeviceWithPlacementResult associateDeviceWithPlacement(AssociateDeviceWithPlacementRequest associateDeviceWithPlacementRequest);

    /**
     * <p>
     * Creates an empty placement.
     * </p>
     * 
     * @param createPlacementRequest
     * @return Result of the CreatePlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceConflictException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.CreatePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/CreatePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    CreatePlacementResult createPlacement(CreatePlacementRequest createPlacementRequest);

    /**
     * <p>
     * Creates an empty project with a placement template. A project contains zero or more placements that adhere to the
     * placement template defined in the project.
     * </p>
     * 
     * @param createProjectRequest
     * @return Result of the CreateProject operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceConflictException
     * @sample AWSIoT1ClickProjects.CreateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/CreateProject"
     *      target="_top">AWS API Documentation</a>
     */
    CreateProjectResult createProject(CreateProjectRequest createProjectRequest);

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
     * @return Result of the DeletePlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @sample AWSIoT1ClickProjects.DeletePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DeletePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    DeletePlacementResult deletePlacement(DeletePlacementRequest deletePlacementRequest);

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
     * @return Result of the DeleteProject operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @sample AWSIoT1ClickProjects.DeleteProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DeleteProject"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteProjectResult deleteProject(DeleteProjectRequest deleteProjectRequest);

    /**
     * <p>
     * Describes a placement in a project.
     * </p>
     * 
     * @param describePlacementRequest
     * @return Result of the DescribePlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.DescribePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DescribePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePlacementResult describePlacement(DescribePlacementRequest describePlacementRequest);

    /**
     * <p>
     * Returns an object describing a project.
     * </p>
     * 
     * @param describeProjectRequest
     * @return Result of the DescribeProject operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.DescribeProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DescribeProject"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeProjectResult describeProject(DescribeProjectRequest describeProjectRequest);

    /**
     * <p>
     * Removes a physical device from a placement.
     * </p>
     * 
     * @param disassociateDeviceFromPlacementRequest
     * @return Result of the DisassociateDeviceFromPlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @sample AWSIoT1ClickProjects.DisassociateDeviceFromPlacement
     * @see <a
     *      href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/DisassociateDeviceFromPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    DisassociateDeviceFromPlacementResult disassociateDeviceFromPlacement(DisassociateDeviceFromPlacementRequest disassociateDeviceFromPlacementRequest);

    /**
     * <p>
     * Returns an object enumerating the devices in a placement.
     * </p>
     * 
     * @param getDevicesInPlacementRequest
     * @return Result of the GetDevicesInPlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.GetDevicesInPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/GetDevicesInPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    GetDevicesInPlacementResult getDevicesInPlacement(GetDevicesInPlacementRequest getDevicesInPlacementRequest);

    /**
     * <p>
     * Lists the placement(s) of a project.
     * </p>
     * 
     * @param listPlacementsRequest
     * @return Result of the ListPlacements operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.ListPlacements
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListPlacements"
     *      target="_top">AWS API Documentation</a>
     */
    ListPlacementsResult listPlacements(ListPlacementsRequest listPlacementsRequest);

    /**
     * <p>
     * Lists the AWS IoT 1-Click project(s) associated with your AWS account and region.
     * </p>
     * 
     * @param listProjectsRequest
     * @return Result of the ListProjects operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @sample AWSIoT1ClickProjects.ListProjects
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListProjects"
     *      target="_top">AWS API Documentation</a>
     */
    ListProjectsResult listProjects(ListProjectsRequest listProjectsRequest);

    /**
     * <p>
     * Lists the tags (metadata key/value pairs) which you have assigned to the resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Creates or modifies tags for a resource. Tags are key/value pairs (metadata) that can be used to manage a
     * resource. For more information, see <a
     * href="https://aws.amazon.com/answers/account-management/aws-tagging-strategies/">AWS Tagging Strategies</a>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/TagResource" target="_top">AWS
     *      API Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes one or more tags (metadata key/value pairs) from a resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @sample AWSIoT1ClickProjects.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/UntagResource"
     *      target="_top">AWS API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates a placement with the given attributes. To clear an attribute, pass an empty value (i.e., "").
     * </p>
     * 
     * @param updatePlacementRequest
     * @return Result of the UpdatePlacement operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @sample AWSIoT1ClickProjects.UpdatePlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/UpdatePlacement"
     *      target="_top">AWS API Documentation</a>
     */
    UpdatePlacementResult updatePlacement(UpdatePlacementRequest updatePlacementRequest);

    /**
     * <p>
     * Updates a project associated with your AWS account and region. With the exception of device template names, you
     * can pass just the values that need to be updated because the update request will change only the values that are
     * provided. To clear a value, pass the empty string (i.e., <code>""</code>).
     * </p>
     * 
     * @param updateProjectRequest
     * @return Result of the UpdateProject operation returned by the service.
     * @throws InternalFailureException
     * @throws InvalidRequestException
     * @throws ResourceNotFoundException
     * @throws TooManyRequestsException
     * @sample AWSIoT1ClickProjects.UpdateProject
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iot1click-projects-2018-05-14/UpdateProject"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateProjectResult updateProject(UpdateProjectRequest updateProjectRequest);

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
