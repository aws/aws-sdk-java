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
package com.amazonaws.services.simspaceweaver;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.simspaceweaver.model.*;

/**
 * Interface for accessing AWS SimSpace Weaver.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.simspaceweaver.AbstractAWSSimSpaceWeaver} instead.
 * </p>
 * <p>
 * <p>
 * Amazon Web Services SimSpace Weaver (SimSpace Weaver) is a managed service that you can use to build and operate
 * large-scale spatial simulations in the Amazon Web Services Cloud. For example, you can create a digital twin of a
 * city, crowd simulations with millions of people and objects, and massilvely-multiplayer games with hundreds of
 * thousands of connected players. For more information about SimSpace Weaver, see the <i> <a
 * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/">Amazon Web Services SimSpace Weaver User
 * Guide</a> </i>.
 * </p>
 * <p>
 * This API reference describes the API operations and data types that you can use to communicate directly with SimSpace
 * Weaver.
 * </p>
 * <p>
 * SimSpace Weaver also provides the SimSpace Weaver app SDK, which you use for app development. The SimSpace Weaver app
 * SDK API reference is included in the SimSpace Weaver app SDK documentation, which is part of the SimSpace Weaver app
 * SDK distributable package.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSimSpaceWeaver {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "simspaceweaver";

    /**
     * <p>
     * Deletes the instance of the given custom app.
     * </p>
     * 
     * @param deleteAppRequest
     * @return Result of the DeleteApp operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @sample AWSSimSpaceWeaver.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAppResult deleteApp(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes all SimSpace Weaver resources assigned to the given simulation.
     * </p>
     * <note>
     * <p>
     * Your simulation uses resources in other Amazon Web Services services. This API operation doesn't delete resources
     * in other Amazon Web Services services.
     * </p>
     * </note>
     * 
     * @param deleteSimulationRequest
     * @return Result of the DeleteSimulation operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @sample AWSSimSpaceWeaver.DeleteSimulation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DeleteSimulation"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteSimulationResult deleteSimulation(DeleteSimulationRequest deleteSimulationRequest);

    /**
     * <p>
     * Returns the state of the given custom app.
     * </p>
     * 
     * @param describeAppRequest
     * @return Result of the DescribeApp operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @sample AWSSimSpaceWeaver.DescribeApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DescribeApp" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAppResult describeApp(DescribeAppRequest describeAppRequest);

    /**
     * <p>
     * Returns the current state of the given simulation.
     * </p>
     * 
     * @param describeSimulationRequest
     * @return Result of the DescribeSimulation operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @sample AWSSimSpaceWeaver.DescribeSimulation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DescribeSimulation"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeSimulationResult describeSimulation(DescribeSimulationRequest describeSimulationRequest);

    /**
     * <p>
     * Lists all custom apps or service apps for the given simulation and domain.
     * </p>
     * 
     * @param listAppsRequest
     * @return Result of the ListApps operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @sample AWSSimSpaceWeaver.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    ListAppsResult listApps(ListAppsRequest listAppsRequest);

    /**
     * <p>
     * Lists the SimSpace Weaver simulations in the Amazon Web Services account used to make the API call.
     * </p>
     * 
     * @param listSimulationsRequest
     * @return Result of the ListSimulations operation returned by the service.
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @sample AWSSimSpaceWeaver.ListSimulations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/ListSimulations" target="_top">AWS
     *      API Documentation</a>
     */
    ListSimulationsResult listSimulations(ListSimulationsRequest listSimulationsRequest);

    /**
     * <p>
     * Lists all tags on a SimSpace Weaver resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @sample AWSSimSpaceWeaver.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts a custom app with the configuration specified in the simulation schema.
     * </p>
     * 
     * @param startAppRequest
     * @return Result of the StartApp operation returned by the service.
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AWSSimSpaceWeaver.StartApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StartApp" target="_top">AWS API
     *      Documentation</a>
     */
    StartAppResult startApp(StartAppRequest startAppRequest);

    /**
     * <p>
     * Starts the simulation clock.
     * </p>
     * 
     * @param startClockRequest
     * @return Result of the StartClock operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @sample AWSSimSpaceWeaver.StartClock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StartClock" target="_top">AWS API
     *      Documentation</a>
     */
    StartClockResult startClock(StartClockRequest startClockRequest);

    /**
     * <p>
     * Starts a simulation with the given name and schema.
     * </p>
     * 
     * @param startSimulationRequest
     * @return Result of the StartSimulation operation returned by the service.
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ServiceQuotaExceededException
     * @throws ConflictException
     * @sample AWSSimSpaceWeaver.StartSimulation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StartSimulation" target="_top">AWS
     *      API Documentation</a>
     */
    StartSimulationResult startSimulation(StartSimulationRequest startSimulationRequest);

    /**
     * <p>
     * Stops the given custom app and shuts down all of its allocated compute resources.
     * </p>
     * 
     * @param stopAppRequest
     * @return Result of the StopApp operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @sample AWSSimSpaceWeaver.StopApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StopApp" target="_top">AWS API
     *      Documentation</a>
     */
    StopAppResult stopApp(StopAppRequest stopAppRequest);

    /**
     * <p>
     * Stops the simulation clock.
     * </p>
     * 
     * @param stopClockRequest
     * @return Result of the StopClock operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @sample AWSSimSpaceWeaver.StopClock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StopClock" target="_top">AWS API
     *      Documentation</a>
     */
    StopClockResult stopClock(StopClockRequest stopClockRequest);

    /**
     * <p>
     * Stops the given simulation.
     * </p>
     * <important>
     * <p>
     * You can't restart a simulation after you stop it. If you need to restart a simulation, you must stop it, delete
     * it, and start a new instance of it.
     * </p>
     * </important>
     * 
     * @param stopSimulationRequest
     * @return Result of the StopSimulation operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws InternalServerException
     * @throws AccessDeniedException
     * @throws ValidationException
     * @throws ConflictException
     * @sample AWSSimSpaceWeaver.StopSimulation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StopSimulation" target="_top">AWS
     *      API Documentation</a>
     */
    StopSimulationResult stopSimulation(StopSimulationRequest stopSimulationRequest);

    /**
     * <p>
     * Adds tags to a SimSpace Weaver resource. For more information about tags, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws TooManyTagsException
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @sample AWSSimSpaceWeaver.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a SimSpace Weaver resource. For more information about tags, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ResourceNotFoundException
     * @throws ValidationException
     * @sample AWSSimSpaceWeaver.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
