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
package com.amazonaws.services.simspaceweaver;

import javax.annotation.Generated;

import com.amazonaws.services.simspaceweaver.model.*;

/**
 * Interface for accessing AWS SimSpace Weaver asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.simspaceweaver.AbstractAWSSimSpaceWeaverAsync} instead.
 * </p>
 * <p>
 * <p>
 * SimSpace Weaver (SimSpace Weaver) is a service that you can use to build and run large-scale spatial simulations in
 * the Amazon Web Services Cloud. For example, you can create crowd simulations, large real-world environments, and
 * immersive and interactive experiences. For more information about SimSpace Weaver, see the <i> <a
 * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/">SimSpace Weaver User Guide</a> </i>.
 * </p>
 * <p>
 * This API reference describes the API operations and data types that you can use to communicate directly with SimSpace
 * Weaver.
 * </p>
 * <p>
 * SimSpace Weaver also provides the SimSpace Weaver app SDK, which you use for app development. The SimSpace Weaver app
 * SDK API reference is included in the SimSpace Weaver app SDK documentation. This documentation is part of the
 * SimSpace Weaver app SDK distributable package.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSSimSpaceWeaverAsync extends AWSSimSpaceWeaver {

    /**
     * <p>
     * Creates a snapshot of the specified simulation. A snapshot is a file that contains simulation state data at a
     * specific time. The state data saved in a snapshot includes entity data from the State Fabric, the simulation
     * configuration specified in the schema, and the clock tick number. You can use the snapshot to initialize a new
     * simulation. For more information about snapshots, see <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/working-with_snapshots.html">Snapshots</a> in
     * the <i>SimSpace Weaver User Guide</i>.
     * </p>
     * <p>
     * You specify a <code>Destination</code> when you create a snapshot. The <code>Destination</code> is the name of an
     * Amazon S3 bucket and an optional <code>ObjectKeyPrefix</code>. The <code>ObjectKeyPrefix</code> is usually the
     * name of a folder in the bucket. SimSpace Weaver creates a <code>snapshot</code> folder inside the
     * <code>Destination</code> and places the snapshot file there.
     * </p>
     * <p>
     * The snapshot file is an Amazon S3 object. It has an object key with the form:
     * <code> <i>object-key-prefix</i>/snapshot/<i>simulation-name</i>-<i>YYMMdd</i>-<i>HHmm</i>-<i>ss</i>.zip</code>,
     * where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> <i>YY</i> </code> is the 2-digit year
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>MM</i> </code> is the 2-digit month
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>dd</i> </code> is the 2-digit day of the month
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>HH</i> </code> is the 2-digit hour (24-hour clock)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>mm</i> </code> is the 2-digit minutes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>ss</i> </code> is the 2-digit seconds
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSnapshotRequest
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/CreateSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of the specified simulation. A snapshot is a file that contains simulation state data at a
     * specific time. The state data saved in a snapshot includes entity data from the State Fabric, the simulation
     * configuration specified in the schema, and the clock tick number. You can use the snapshot to initialize a new
     * simulation. For more information about snapshots, see <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/working-with_snapshots.html">Snapshots</a> in
     * the <i>SimSpace Weaver User Guide</i>.
     * </p>
     * <p>
     * You specify a <code>Destination</code> when you create a snapshot. The <code>Destination</code> is the name of an
     * Amazon S3 bucket and an optional <code>ObjectKeyPrefix</code>. The <code>ObjectKeyPrefix</code> is usually the
     * name of a folder in the bucket. SimSpace Weaver creates a <code>snapshot</code> folder inside the
     * <code>Destination</code> and places the snapshot file there.
     * </p>
     * <p>
     * The snapshot file is an Amazon S3 object. It has an object key with the form:
     * <code> <i>object-key-prefix</i>/snapshot/<i>simulation-name</i>-<i>YYMMdd</i>-<i>HHmm</i>-<i>ss</i>.zip</code>,
     * where:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code> <i>YY</i> </code> is the 2-digit year
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>MM</i> </code> is the 2-digit month
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>dd</i> </code> is the 2-digit day of the month
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>HH</i> </code> is the 2-digit hour (24-hour clock)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>mm</i> </code> is the 2-digit minutes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code> <i>ss</i> </code> is the 2-digit seconds
     * </p>
     * </li>
     * </ul>
     * 
     * @param createSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/CreateSnapshot" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler);

    /**
     * <p>
     * Deletes the instance of the given custom app.
     * </p>
     * 
     * @param deleteAppRequest
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest);

    /**
     * <p>
     * Deletes the instance of the given custom app.
     * </p>
     * 
     * @param deleteAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteApp operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.DeleteApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DeleteApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAppResult> deleteAppAsync(DeleteAppRequest deleteAppRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAppRequest, DeleteAppResult> asyncHandler);

    /**
     * <p>
     * Deletes all SimSpace Weaver resources assigned to the given simulation.
     * </p>
     * <note>
     * <p>
     * Your simulation uses resources in other Amazon Web Services. This API operation doesn't delete resources in other
     * Amazon Web Services.
     * </p>
     * </note>
     * 
     * @param deleteSimulationRequest
     * @return A Java Future containing the result of the DeleteSimulation operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.DeleteSimulation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DeleteSimulation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSimulationResult> deleteSimulationAsync(DeleteSimulationRequest deleteSimulationRequest);

    /**
     * <p>
     * Deletes all SimSpace Weaver resources assigned to the given simulation.
     * </p>
     * <note>
     * <p>
     * Your simulation uses resources in other Amazon Web Services. This API operation doesn't delete resources in other
     * Amazon Web Services.
     * </p>
     * </note>
     * 
     * @param deleteSimulationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSimulation operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.DeleteSimulation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DeleteSimulation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSimulationResult> deleteSimulationAsync(DeleteSimulationRequest deleteSimulationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSimulationRequest, DeleteSimulationResult> asyncHandler);

    /**
     * <p>
     * Returns the state of the given custom app.
     * </p>
     * 
     * @param describeAppRequest
     * @return A Java Future containing the result of the DescribeApp operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.DescribeApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DescribeApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest describeAppRequest);

    /**
     * <p>
     * Returns the state of the given custom app.
     * </p>
     * 
     * @param describeAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeApp operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.DescribeApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DescribeApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAppResult> describeAppAsync(DescribeAppRequest describeAppRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAppRequest, DescribeAppResult> asyncHandler);

    /**
     * <p>
     * Returns the current state of the given simulation.
     * </p>
     * 
     * @param describeSimulationRequest
     * @return A Java Future containing the result of the DescribeSimulation operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.DescribeSimulation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DescribeSimulation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSimulationResult> describeSimulationAsync(DescribeSimulationRequest describeSimulationRequest);

    /**
     * <p>
     * Returns the current state of the given simulation.
     * </p>
     * 
     * @param describeSimulationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSimulation operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.DescribeSimulation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DescribeSimulation"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSimulationResult> describeSimulationAsync(DescribeSimulationRequest describeSimulationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSimulationRequest, DescribeSimulationResult> asyncHandler);

    /**
     * <p>
     * Lists all custom apps or service apps for the given simulation and domain.
     * </p>
     * 
     * @param listAppsRequest
     * @return A Java Future containing the result of the ListApps operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest listAppsRequest);

    /**
     * <p>
     * Lists all custom apps or service apps for the given simulation and domain.
     * </p>
     * 
     * @param listAppsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListApps operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.ListApps
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/ListApps" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAppsResult> listAppsAsync(ListAppsRequest listAppsRequest,
            com.amazonaws.handlers.AsyncHandler<ListAppsRequest, ListAppsResult> asyncHandler);

    /**
     * <p>
     * Lists the SimSpace Weaver simulations in the Amazon Web Services account used to make the API call.
     * </p>
     * 
     * @param listSimulationsRequest
     * @return A Java Future containing the result of the ListSimulations operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.ListSimulations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/ListSimulations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSimulationsResult> listSimulationsAsync(ListSimulationsRequest listSimulationsRequest);

    /**
     * <p>
     * Lists the SimSpace Weaver simulations in the Amazon Web Services account used to make the API call.
     * </p>
     * 
     * @param listSimulationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSimulations operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.ListSimulations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/ListSimulations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSimulationsResult> listSimulationsAsync(ListSimulationsRequest listSimulationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSimulationsRequest, ListSimulationsResult> asyncHandler);

    /**
     * <p>
     * Lists all tags on a SimSpace Weaver resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags on a SimSpace Weaver resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/ListTagsForResource"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts a custom app with the configuration specified in the simulation schema.
     * </p>
     * 
     * @param startAppRequest
     * @return A Java Future containing the result of the StartApp operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.StartApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StartApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartAppResult> startAppAsync(StartAppRequest startAppRequest);

    /**
     * <p>
     * Starts a custom app with the configuration specified in the simulation schema.
     * </p>
     * 
     * @param startAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartApp operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.StartApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StartApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartAppResult> startAppAsync(StartAppRequest startAppRequest,
            com.amazonaws.handlers.AsyncHandler<StartAppRequest, StartAppResult> asyncHandler);

    /**
     * <p>
     * Starts the simulation clock.
     * </p>
     * 
     * @param startClockRequest
     * @return A Java Future containing the result of the StartClock operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.StartClock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StartClock" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartClockResult> startClockAsync(StartClockRequest startClockRequest);

    /**
     * <p>
     * Starts the simulation clock.
     * </p>
     * 
     * @param startClockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartClock operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.StartClock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StartClock" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartClockResult> startClockAsync(StartClockRequest startClockRequest,
            com.amazonaws.handlers.AsyncHandler<StartClockRequest, StartClockResult> asyncHandler);

    /**
     * <p>
     * Starts a simulation with the given name. You must choose to start your simulation from a schema or from a
     * snapshot. For more information about the schema, see the <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/schema-reference.html">schema reference</a> in
     * the <i>SimSpace Weaver User Guide</i>. For more information about snapshots, see <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/working-with_snapshots.html">Snapshots</a> in
     * the <i>SimSpace Weaver User Guide</i>.
     * </p>
     * 
     * @param startSimulationRequest
     * @return A Java Future containing the result of the StartSimulation operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.StartSimulation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StartSimulation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartSimulationResult> startSimulationAsync(StartSimulationRequest startSimulationRequest);

    /**
     * <p>
     * Starts a simulation with the given name. You must choose to start your simulation from a schema or from a
     * snapshot. For more information about the schema, see the <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/schema-reference.html">schema reference</a> in
     * the <i>SimSpace Weaver User Guide</i>. For more information about snapshots, see <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/working-with_snapshots.html">Snapshots</a> in
     * the <i>SimSpace Weaver User Guide</i>.
     * </p>
     * 
     * @param startSimulationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartSimulation operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.StartSimulation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StartSimulation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartSimulationResult> startSimulationAsync(StartSimulationRequest startSimulationRequest,
            com.amazonaws.handlers.AsyncHandler<StartSimulationRequest, StartSimulationResult> asyncHandler);

    /**
     * <p>
     * Stops the given custom app and shuts down all of its allocated compute resources.
     * </p>
     * 
     * @param stopAppRequest
     * @return A Java Future containing the result of the StopApp operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.StopApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StopApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopAppResult> stopAppAsync(StopAppRequest stopAppRequest);

    /**
     * <p>
     * Stops the given custom app and shuts down all of its allocated compute resources.
     * </p>
     * 
     * @param stopAppRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopApp operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.StopApp
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StopApp" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopAppResult> stopAppAsync(StopAppRequest stopAppRequest,
            com.amazonaws.handlers.AsyncHandler<StopAppRequest, StopAppResult> asyncHandler);

    /**
     * <p>
     * Stops the simulation clock.
     * </p>
     * 
     * @param stopClockRequest
     * @return A Java Future containing the result of the StopClock operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.StopClock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StopClock" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopClockResult> stopClockAsync(StopClockRequest stopClockRequest);

    /**
     * <p>
     * Stops the simulation clock.
     * </p>
     * 
     * @param stopClockRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopClock operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.StopClock
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StopClock" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopClockResult> stopClockAsync(StopClockRequest stopClockRequest,
            com.amazonaws.handlers.AsyncHandler<StopClockRequest, StopClockResult> asyncHandler);

    /**
     * <p>
     * Stops the given simulation.
     * </p>
     * <important>
     * <p>
     * You can't restart a simulation after you stop it. If you want to restart a simulation, then you must stop it,
     * delete it, and start a new instance of it.
     * </p>
     * </important>
     * 
     * @param stopSimulationRequest
     * @return A Java Future containing the result of the StopSimulation operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.StopSimulation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StopSimulation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopSimulationResult> stopSimulationAsync(StopSimulationRequest stopSimulationRequest);

    /**
     * <p>
     * Stops the given simulation.
     * </p>
     * <important>
     * <p>
     * You can't restart a simulation after you stop it. If you want to restart a simulation, then you must stop it,
     * delete it, and start a new instance of it.
     * </p>
     * </important>
     * 
     * @param stopSimulationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopSimulation operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.StopSimulation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StopSimulation" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StopSimulationResult> stopSimulationAsync(StopSimulationRequest stopSimulationRequest,
            com.amazonaws.handlers.AsyncHandler<StopSimulationRequest, StopSimulationResult> asyncHandler);

    /**
     * <p>
     * Adds tags to a SimSpace Weaver resource. For more information about tags, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags to a SimSpace Weaver resource. For more information about tags, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a SimSpace Weaver resource. For more information about tags, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSimSpaceWeaverAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a SimSpace Weaver resource. For more information about tags, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services resources</a>
     * in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSSimSpaceWeaverAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/UntagResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

}
