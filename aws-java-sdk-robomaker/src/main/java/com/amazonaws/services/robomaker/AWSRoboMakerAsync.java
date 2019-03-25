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
package com.amazonaws.services.robomaker;

import javax.annotation.Generated;

import com.amazonaws.services.robomaker.model.*;

/**
 * Interface for accessing RoboMaker asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.robomaker.AbstractAWSRoboMakerAsync} instead.
 * </p>
 * <p>
 * <p>
 * This section provides documentation for the AWS RoboMaker API operations.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSRoboMakerAsync extends AWSRoboMaker {

    /**
     * <p>
     * Describes one or more simulation jobs.
     * </p>
     * 
     * @param batchDescribeSimulationJobRequest
     * @return A Java Future containing the result of the BatchDescribeSimulationJob operation returned by the service.
     * @sample AWSRoboMakerAsync.BatchDescribeSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/BatchDescribeSimulationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDescribeSimulationJobResult> batchDescribeSimulationJobAsync(
            BatchDescribeSimulationJobRequest batchDescribeSimulationJobRequest);

    /**
     * <p>
     * Describes one or more simulation jobs.
     * </p>
     * 
     * @param batchDescribeSimulationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the BatchDescribeSimulationJob operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.BatchDescribeSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/BatchDescribeSimulationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<BatchDescribeSimulationJobResult> batchDescribeSimulationJobAsync(
            BatchDescribeSimulationJobRequest batchDescribeSimulationJobRequest,
            com.amazonaws.handlers.AsyncHandler<BatchDescribeSimulationJobRequest, BatchDescribeSimulationJobResult> asyncHandler);

    /**
     * <p>
     * Cancels the specified simulation job.
     * </p>
     * 
     * @param cancelSimulationJobRequest
     * @return A Java Future containing the result of the CancelSimulationJob operation returned by the service.
     * @sample AWSRoboMakerAsync.CancelSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CancelSimulationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelSimulationJobResult> cancelSimulationJobAsync(CancelSimulationJobRequest cancelSimulationJobRequest);

    /**
     * <p>
     * Cancels the specified simulation job.
     * </p>
     * 
     * @param cancelSimulationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CancelSimulationJob operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.CancelSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CancelSimulationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CancelSimulationJobResult> cancelSimulationJobAsync(CancelSimulationJobRequest cancelSimulationJobRequest,
            com.amazonaws.handlers.AsyncHandler<CancelSimulationJobRequest, CancelSimulationJobResult> asyncHandler);

    /**
     * <p>
     * Deploys a specific version of a robot application to robots in a fleet.
     * </p>
     * <p>
     * The robot application must have a numbered <code>applicationVersion</code> for consistency reasons. To create a
     * new version, use <code>CreateRobotApplicationVersion</code> or see <a
     * href="https://docs.aws.amazon.com/robomaker/latest/dg/create-robot-application-version.html">Creating a Robot
     * Application Version</a>.
     * </p>
     * <note>
     * <p>
     * After 90 days, deployment jobs expire and will be deleted. They will no longer be accessible.
     * </p>
     * </note>
     * 
     * @param createDeploymentJobRequest
     * @return A Java Future containing the result of the CreateDeploymentJob operation returned by the service.
     * @sample AWSRoboMakerAsync.CreateDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateDeploymentJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentJobResult> createDeploymentJobAsync(CreateDeploymentJobRequest createDeploymentJobRequest);

    /**
     * <p>
     * Deploys a specific version of a robot application to robots in a fleet.
     * </p>
     * <p>
     * The robot application must have a numbered <code>applicationVersion</code> for consistency reasons. To create a
     * new version, use <code>CreateRobotApplicationVersion</code> or see <a
     * href="https://docs.aws.amazon.com/robomaker/latest/dg/create-robot-application-version.html">Creating a Robot
     * Application Version</a>.
     * </p>
     * <note>
     * <p>
     * After 90 days, deployment jobs expire and will be deleted. They will no longer be accessible.
     * </p>
     * </note>
     * 
     * @param createDeploymentJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateDeploymentJob operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.CreateDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateDeploymentJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateDeploymentJobResult> createDeploymentJobAsync(CreateDeploymentJobRequest createDeploymentJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateDeploymentJobRequest, CreateDeploymentJobResult> asyncHandler);

    /**
     * <p>
     * Creates a fleet, a logical group of robots running the same robot application.
     * </p>
     * 
     * @param createFleetRequest
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AWSRoboMakerAsync.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a fleet, a logical group of robots running the same robot application.
     * </p>
     * 
     * @param createFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler);

    /**
     * <p>
     * Creates a robot.
     * </p>
     * 
     * @param createRobotRequest
     * @return A Java Future containing the result of the CreateRobot operation returned by the service.
     * @sample AWSRoboMakerAsync.CreateRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRobotResult> createRobotAsync(CreateRobotRequest createRobotRequest);

    /**
     * <p>
     * Creates a robot.
     * </p>
     * 
     * @param createRobotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRobot operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.CreateRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateRobotResult> createRobotAsync(CreateRobotRequest createRobotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRobotRequest, CreateRobotResult> asyncHandler);

    /**
     * <p>
     * Creates a robot application.
     * </p>
     * 
     * @param createRobotApplicationRequest
     * @return A Java Future containing the result of the CreateRobotApplication operation returned by the service.
     * @sample AWSRoboMakerAsync.CreateRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRobotApplicationResult> createRobotApplicationAsync(CreateRobotApplicationRequest createRobotApplicationRequest);

    /**
     * <p>
     * Creates a robot application.
     * </p>
     * 
     * @param createRobotApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRobotApplication operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.CreateRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRobotApplicationResult> createRobotApplicationAsync(CreateRobotApplicationRequest createRobotApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRobotApplicationRequest, CreateRobotApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates a version of a robot application.
     * </p>
     * 
     * @param createRobotApplicationVersionRequest
     * @return A Java Future containing the result of the CreateRobotApplicationVersion operation returned by the
     *         service.
     * @sample AWSRoboMakerAsync.CreateRobotApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobotApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRobotApplicationVersionResult> createRobotApplicationVersionAsync(
            CreateRobotApplicationVersionRequest createRobotApplicationVersionRequest);

    /**
     * <p>
     * Creates a version of a robot application.
     * </p>
     * 
     * @param createRobotApplicationVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRobotApplicationVersion operation returned by the
     *         service.
     * @sample AWSRoboMakerAsyncHandler.CreateRobotApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateRobotApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateRobotApplicationVersionResult> createRobotApplicationVersionAsync(
            CreateRobotApplicationVersionRequest createRobotApplicationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRobotApplicationVersionRequest, CreateRobotApplicationVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a simulation application.
     * </p>
     * 
     * @param createSimulationApplicationRequest
     * @return A Java Future containing the result of the CreateSimulationApplication operation returned by the service.
     * @sample AWSRoboMakerAsync.CreateSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSimulationApplicationResult> createSimulationApplicationAsync(
            CreateSimulationApplicationRequest createSimulationApplicationRequest);

    /**
     * <p>
     * Creates a simulation application.
     * </p>
     * 
     * @param createSimulationApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSimulationApplication operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.CreateSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSimulationApplicationResult> createSimulationApplicationAsync(
            CreateSimulationApplicationRequest createSimulationApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSimulationApplicationRequest, CreateSimulationApplicationResult> asyncHandler);

    /**
     * <p>
     * Creates a simulation application with a specific revision id.
     * </p>
     * 
     * @param createSimulationApplicationVersionRequest
     * @return A Java Future containing the result of the CreateSimulationApplicationVersion operation returned by the
     *         service.
     * @sample AWSRoboMakerAsync.CreateSimulationApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSimulationApplicationVersionResult> createSimulationApplicationVersionAsync(
            CreateSimulationApplicationVersionRequest createSimulationApplicationVersionRequest);

    /**
     * <p>
     * Creates a simulation application with a specific revision id.
     * </p>
     * 
     * @param createSimulationApplicationVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSimulationApplicationVersion operation returned by the
     *         service.
     * @sample AWSRoboMakerAsyncHandler.CreateSimulationApplicationVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationApplicationVersion"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateSimulationApplicationVersionResult> createSimulationApplicationVersionAsync(
            CreateSimulationApplicationVersionRequest createSimulationApplicationVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSimulationApplicationVersionRequest, CreateSimulationApplicationVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a simulation job.
     * </p>
     * <note>
     * <p>
     * After 90 days, simulation jobs expire and will be deleted. They will no longer be accessible.
     * </p>
     * </note>
     * 
     * @param createSimulationJobRequest
     * @return A Java Future containing the result of the CreateSimulationJob operation returned by the service.
     * @sample AWSRoboMakerAsync.CreateSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSimulationJobResult> createSimulationJobAsync(CreateSimulationJobRequest createSimulationJobRequest);

    /**
     * <p>
     * Creates a simulation job.
     * </p>
     * <note>
     * <p>
     * After 90 days, simulation jobs expire and will be deleted. They will no longer be accessible.
     * </p>
     * </note>
     * 
     * @param createSimulationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSimulationJob operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.CreateSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/CreateSimulationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateSimulationJobResult> createSimulationJobAsync(CreateSimulationJobRequest createSimulationJobRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSimulationJobRequest, CreateSimulationJobResult> asyncHandler);

    /**
     * <p>
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AWSRoboMakerAsync.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler);

    /**
     * <p>
     * Deletes a robot.
     * </p>
     * 
     * @param deleteRobotRequest
     * @return A Java Future containing the result of the DeleteRobot operation returned by the service.
     * @sample AWSRoboMakerAsync.DeleteRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteRobot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRobotResult> deleteRobotAsync(DeleteRobotRequest deleteRobotRequest);

    /**
     * <p>
     * Deletes a robot.
     * </p>
     * 
     * @param deleteRobotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRobot operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.DeleteRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteRobot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteRobotResult> deleteRobotAsync(DeleteRobotRequest deleteRobotRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRobotRequest, DeleteRobotResult> asyncHandler);

    /**
     * <p>
     * Deletes a robot application.
     * </p>
     * 
     * @param deleteRobotApplicationRequest
     * @return A Java Future containing the result of the DeleteRobotApplication operation returned by the service.
     * @sample AWSRoboMakerAsync.DeleteRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRobotApplicationResult> deleteRobotApplicationAsync(DeleteRobotApplicationRequest deleteRobotApplicationRequest);

    /**
     * <p>
     * Deletes a robot application.
     * </p>
     * 
     * @param deleteRobotApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteRobotApplication operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.DeleteRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteRobotApplicationResult> deleteRobotApplicationAsync(DeleteRobotApplicationRequest deleteRobotApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRobotApplicationRequest, DeleteRobotApplicationResult> asyncHandler);

    /**
     * <p>
     * Deletes a simulation application.
     * </p>
     * 
     * @param deleteSimulationApplicationRequest
     * @return A Java Future containing the result of the DeleteSimulationApplication operation returned by the service.
     * @sample AWSRoboMakerAsync.DeleteSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSimulationApplicationResult> deleteSimulationApplicationAsync(
            DeleteSimulationApplicationRequest deleteSimulationApplicationRequest);

    /**
     * <p>
     * Deletes a simulation application.
     * </p>
     * 
     * @param deleteSimulationApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteSimulationApplication operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.DeleteSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeleteSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteSimulationApplicationResult> deleteSimulationApplicationAsync(
            DeleteSimulationApplicationRequest deleteSimulationApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSimulationApplicationRequest, DeleteSimulationApplicationResult> asyncHandler);

    /**
     * <p>
     * Deregisters a robot.
     * </p>
     * 
     * @param deregisterRobotRequest
     * @return A Java Future containing the result of the DeregisterRobot operation returned by the service.
     * @sample AWSRoboMakerAsync.DeregisterRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeregisterRobot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeregisterRobotResult> deregisterRobotAsync(DeregisterRobotRequest deregisterRobotRequest);

    /**
     * <p>
     * Deregisters a robot.
     * </p>
     * 
     * @param deregisterRobotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterRobot operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.DeregisterRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DeregisterRobot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeregisterRobotResult> deregisterRobotAsync(DeregisterRobotRequest deregisterRobotRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterRobotRequest, DeregisterRobotResult> asyncHandler);

    /**
     * <p>
     * Describes a deployment job. [Does it work regardless of deployment status, e.g. Failed?]
     * </p>
     * 
     * @param describeDeploymentJobRequest
     * @return A Java Future containing the result of the DescribeDeploymentJob operation returned by the service.
     * @sample AWSRoboMakerAsync.DescribeDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeDeploymentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeploymentJobResult> describeDeploymentJobAsync(DescribeDeploymentJobRequest describeDeploymentJobRequest);

    /**
     * <p>
     * Describes a deployment job. [Does it work regardless of deployment status, e.g. Failed?]
     * </p>
     * 
     * @param describeDeploymentJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDeploymentJob operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.DescribeDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeDeploymentJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeDeploymentJobResult> describeDeploymentJobAsync(DescribeDeploymentJobRequest describeDeploymentJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDeploymentJobRequest, DescribeDeploymentJobResult> asyncHandler);

    /**
     * <p>
     * Describes a fleet.
     * </p>
     * 
     * @param describeFleetRequest
     * @return A Java Future containing the result of the DescribeFleet operation returned by the service.
     * @sample AWSRoboMakerAsync.DescribeFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetResult> describeFleetAsync(DescribeFleetRequest describeFleetRequest);

    /**
     * <p>
     * Describes a fleet.
     * </p>
     * 
     * @param describeFleetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleet operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.DescribeFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetResult> describeFleetAsync(DescribeFleetRequest describeFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetRequest, DescribeFleetResult> asyncHandler);

    /**
     * <p>
     * Describes a robot.
     * </p>
     * 
     * @param describeRobotRequest
     * @return A Java Future containing the result of the DescribeRobot operation returned by the service.
     * @sample AWSRoboMakerAsync.DescribeRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeRobot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRobotResult> describeRobotAsync(DescribeRobotRequest describeRobotRequest);

    /**
     * <p>
     * Describes a robot.
     * </p>
     * 
     * @param describeRobotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRobot operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.DescribeRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeRobot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeRobotResult> describeRobotAsync(DescribeRobotRequest describeRobotRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRobotRequest, DescribeRobotResult> asyncHandler);

    /**
     * <p>
     * Describes a robot application.
     * </p>
     * 
     * @param describeRobotApplicationRequest
     * @return A Java Future containing the result of the DescribeRobotApplication operation returned by the service.
     * @sample AWSRoboMakerAsync.DescribeRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRobotApplicationResult> describeRobotApplicationAsync(DescribeRobotApplicationRequest describeRobotApplicationRequest);

    /**
     * <p>
     * Describes a robot application.
     * </p>
     * 
     * @param describeRobotApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRobotApplication operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.DescribeRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRobotApplicationResult> describeRobotApplicationAsync(DescribeRobotApplicationRequest describeRobotApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRobotApplicationRequest, DescribeRobotApplicationResult> asyncHandler);

    /**
     * <p>
     * Describes a simulation application.
     * </p>
     * 
     * @param describeSimulationApplicationRequest
     * @return A Java Future containing the result of the DescribeSimulationApplication operation returned by the
     *         service.
     * @sample AWSRoboMakerAsync.DescribeSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSimulationApplicationResult> describeSimulationApplicationAsync(
            DescribeSimulationApplicationRequest describeSimulationApplicationRequest);

    /**
     * <p>
     * Describes a simulation application.
     * </p>
     * 
     * @param describeSimulationApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSimulationApplication operation returned by the
     *         service.
     * @sample AWSRoboMakerAsyncHandler.DescribeSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSimulationApplicationResult> describeSimulationApplicationAsync(
            DescribeSimulationApplicationRequest describeSimulationApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSimulationApplicationRequest, DescribeSimulationApplicationResult> asyncHandler);

    /**
     * <p>
     * Describes a simulation job.
     * </p>
     * 
     * @param describeSimulationJobRequest
     * @return A Java Future containing the result of the DescribeSimulationJob operation returned by the service.
     * @sample AWSRoboMakerAsync.DescribeSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeSimulationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSimulationJobResult> describeSimulationJobAsync(DescribeSimulationJobRequest describeSimulationJobRequest);

    /**
     * <p>
     * Describes a simulation job.
     * </p>
     * 
     * @param describeSimulationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSimulationJob operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.DescribeSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/DescribeSimulationJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeSimulationJobResult> describeSimulationJobAsync(DescribeSimulationJobRequest describeSimulationJobRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSimulationJobRequest, DescribeSimulationJobResult> asyncHandler);

    /**
     * <p>
     * Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment
     * jobs.
     * </p>
     * <note>
     * <p>
     * </p>
     * </note>
     * 
     * @param listDeploymentJobsRequest
     * @return A Java Future containing the result of the ListDeploymentJobs operation returned by the service.
     * @sample AWSRoboMakerAsync.ListDeploymentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListDeploymentJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentJobsResult> listDeploymentJobsAsync(ListDeploymentJobsRequest listDeploymentJobsRequest);

    /**
     * <p>
     * Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment
     * jobs.
     * </p>
     * <note>
     * <p>
     * </p>
     * </note>
     * 
     * @param listDeploymentJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDeploymentJobs operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.ListDeploymentJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListDeploymentJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListDeploymentJobsResult> listDeploymentJobsAsync(ListDeploymentJobsRequest listDeploymentJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeploymentJobsRequest, ListDeploymentJobsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of fleets. You can optionally provide filters to retrieve specific fleets.
     * </p>
     * 
     * @param listFleetsRequest
     * @return A Java Future containing the result of the ListFleets operation returned by the service.
     * @sample AWSRoboMakerAsync.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * Returns a list of fleets. You can optionally provide filters to retrieve specific fleets.
     * </p>
     * 
     * @param listFleetsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFleets operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest listFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.
     * </p>
     * 
     * @param listRobotApplicationsRequest
     * @return A Java Future containing the result of the ListRobotApplications operation returned by the service.
     * @sample AWSRoboMakerAsync.ListRobotApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListRobotApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRobotApplicationsResult> listRobotApplicationsAsync(ListRobotApplicationsRequest listRobotApplicationsRequest);

    /**
     * <p>
     * Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.
     * </p>
     * 
     * @param listRobotApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRobotApplications operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.ListRobotApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListRobotApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListRobotApplicationsResult> listRobotApplicationsAsync(ListRobotApplicationsRequest listRobotApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRobotApplicationsRequest, ListRobotApplicationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of robots. You can optionally provide filters to retrieve specific robots.
     * </p>
     * 
     * @param listRobotsRequest
     * @return A Java Future containing the result of the ListRobots operation returned by the service.
     * @sample AWSRoboMakerAsync.ListRobots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListRobots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRobotsResult> listRobotsAsync(ListRobotsRequest listRobotsRequest);

    /**
     * <p>
     * Returns a list of robots. You can optionally provide filters to retrieve specific robots.
     * </p>
     * 
     * @param listRobotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRobots operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.ListRobots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListRobots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListRobotsResult> listRobotsAsync(ListRobotsRequest listRobotsRequest,
            com.amazonaws.handlers.AsyncHandler<ListRobotsRequest, ListRobotsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation
     * applications.
     * </p>
     * 
     * @param listSimulationApplicationsRequest
     * @return A Java Future containing the result of the ListSimulationApplications operation returned by the service.
     * @sample AWSRoboMakerAsync.ListSimulationApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListSimulationApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSimulationApplicationsResult> listSimulationApplicationsAsync(
            ListSimulationApplicationsRequest listSimulationApplicationsRequest);

    /**
     * <p>
     * Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation
     * applications.
     * </p>
     * 
     * @param listSimulationApplicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSimulationApplications operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.ListSimulationApplications
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListSimulationApplications"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListSimulationApplicationsResult> listSimulationApplicationsAsync(
            ListSimulationApplicationsRequest listSimulationApplicationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSimulationApplicationsRequest, ListSimulationApplicationsResult> asyncHandler);

    /**
     * <p>
     * Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs.
     * </p>
     * 
     * @param listSimulationJobsRequest
     * @return A Java Future containing the result of the ListSimulationJobs operation returned by the service.
     * @sample AWSRoboMakerAsync.ListSimulationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListSimulationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSimulationJobsResult> listSimulationJobsAsync(ListSimulationJobsRequest listSimulationJobsRequest);

    /**
     * <p>
     * Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs.
     * </p>
     * 
     * @param listSimulationJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSimulationJobs operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.ListSimulationJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListSimulationJobs" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListSimulationJobsResult> listSimulationJobsAsync(ListSimulationJobsRequest listSimulationJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSimulationJobsRequest, ListSimulationJobsResult> asyncHandler);

    /**
     * <p>
     * Lists all tags on a AWS RoboMaker resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSRoboMakerAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists all tags on a AWS RoboMaker resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Registers a robot with a fleet.
     * </p>
     * 
     * @param registerRobotRequest
     * @return A Java Future containing the result of the RegisterRobot operation returned by the service.
     * @sample AWSRoboMakerAsync.RegisterRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/RegisterRobot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterRobotResult> registerRobotAsync(RegisterRobotRequest registerRobotRequest);

    /**
     * <p>
     * Registers a robot with a fleet.
     * </p>
     * 
     * @param registerRobotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterRobot operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.RegisterRobot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/RegisterRobot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterRobotResult> registerRobotAsync(RegisterRobotRequest registerRobotRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterRobotRequest, RegisterRobotResult> asyncHandler);

    /**
     * <p>
     * Restarts a running simulation job.
     * </p>
     * 
     * @param restartSimulationJobRequest
     * @return A Java Future containing the result of the RestartSimulationJob operation returned by the service.
     * @sample AWSRoboMakerAsync.RestartSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/RestartSimulationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestartSimulationJobResult> restartSimulationJobAsync(RestartSimulationJobRequest restartSimulationJobRequest);

    /**
     * <p>
     * Restarts a running simulation job.
     * </p>
     * 
     * @param restartSimulationJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RestartSimulationJob operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.RestartSimulationJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/RestartSimulationJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RestartSimulationJobResult> restartSimulationJobAsync(RestartSimulationJobRequest restartSimulationJobRequest,
            com.amazonaws.handlers.AsyncHandler<RestartSimulationJobRequest, RestartSimulationJobResult> asyncHandler);

    /**
     * <p>
     * Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.
     * </p>
     * 
     * @param syncDeploymentJobRequest
     * @return A Java Future containing the result of the SyncDeploymentJob operation returned by the service.
     * @sample AWSRoboMakerAsync.SyncDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/SyncDeploymentJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SyncDeploymentJobResult> syncDeploymentJobAsync(SyncDeploymentJobRequest syncDeploymentJobRequest);

    /**
     * <p>
     * Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.
     * </p>
     * 
     * @param syncDeploymentJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SyncDeploymentJob operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.SyncDeploymentJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/SyncDeploymentJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SyncDeploymentJobResult> syncDeploymentJobAsync(SyncDeploymentJobRequest syncDeploymentJobRequest,
            com.amazonaws.handlers.AsyncHandler<SyncDeploymentJobRequest, SyncDeploymentJobResult> asyncHandler);

    /**
     * <p>
     * Adds or edits tags for a AWS RoboMaker resource.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be
     * empty strings.
     * </p>
     * <p>
     * For information about the rules that apply to tag keys and tag values, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRoboMakerAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds or edits tags for a AWS RoboMaker resource.
     * </p>
     * <p>
     * Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be
     * empty strings.
     * </p>
     * <p>
     * For information about the rules that apply to tag keys and tag values, see <a
     * href="https://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/allocation-tag-restrictions.html">User-Defined
     * Tag Restrictions</a> in the <i>AWS Billing and Cost Management User Guide</i>.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from the specified AWS RoboMaker resource.
     * </p>
     * <p>
     * To remove a tag, specify the tag key. To change the tag value of an existing tag key, use <a
     * href="https://docs.aws.amazon.com/robomaker/latest/dg/API_TagResource.html"> <code>TagResource</code> </a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRoboMakerAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes the specified tags from the specified AWS RoboMaker resource.
     * </p>
     * <p>
     * To remove a tag, specify the tag key. To change the tag value of an existing tag key, use <a
     * href="https://docs.aws.amazon.com/robomaker/latest/dg/API_TagResource.html"> <code>TagResource</code> </a>.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates a robot application.
     * </p>
     * 
     * @param updateRobotApplicationRequest
     * @return A Java Future containing the result of the UpdateRobotApplication operation returned by the service.
     * @sample AWSRoboMakerAsync.UpdateRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UpdateRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRobotApplicationResult> updateRobotApplicationAsync(UpdateRobotApplicationRequest updateRobotApplicationRequest);

    /**
     * <p>
     * Updates a robot application.
     * </p>
     * 
     * @param updateRobotApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRobotApplication operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.UpdateRobotApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UpdateRobotApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRobotApplicationResult> updateRobotApplicationAsync(UpdateRobotApplicationRequest updateRobotApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRobotApplicationRequest, UpdateRobotApplicationResult> asyncHandler);

    /**
     * <p>
     * Updates a simulation application.
     * </p>
     * 
     * @param updateSimulationApplicationRequest
     * @return A Java Future containing the result of the UpdateSimulationApplication operation returned by the service.
     * @sample AWSRoboMakerAsync.UpdateSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UpdateSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSimulationApplicationResult> updateSimulationApplicationAsync(
            UpdateSimulationApplicationRequest updateSimulationApplicationRequest);

    /**
     * <p>
     * Updates a simulation application.
     * </p>
     * 
     * @param updateSimulationApplicationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSimulationApplication operation returned by the service.
     * @sample AWSRoboMakerAsyncHandler.UpdateSimulationApplication
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/UpdateSimulationApplication"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateSimulationApplicationResult> updateSimulationApplicationAsync(
            UpdateSimulationApplicationRequest updateSimulationApplicationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSimulationApplicationRequest, UpdateSimulationApplicationResult> asyncHandler);

}
