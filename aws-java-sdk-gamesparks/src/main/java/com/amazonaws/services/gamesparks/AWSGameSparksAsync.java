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
package com.amazonaws.services.gamesparks;

import javax.annotation.Generated;

import com.amazonaws.services.gamesparks.model.*;

/**
 * Interface for accessing GameSparks asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.gamesparks.AbstractAWSGameSparksAsync} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGameSparksAsync extends AWSGameSparks {

    /**
     * <p>
     * Creates a new game with an empty configuration. After creating your game, you can update the configuration using
     * <code>UpdateGameConfiguration</code> or <code>ImportGameConfiguration</code>.
     * </p>
     * 
     * @param createGameRequest
     * @return A Java Future containing the result of the CreateGame operation returned by the service.
     * @sample AWSGameSparksAsync.CreateGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateGame" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGameResult> createGameAsync(CreateGameRequest createGameRequest);

    /**
     * <p>
     * Creates a new game with an empty configuration. After creating your game, you can update the configuration using
     * <code>UpdateGameConfiguration</code> or <code>ImportGameConfiguration</code>.
     * </p>
     * 
     * @param createGameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGame operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.CreateGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateGame" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGameResult> createGameAsync(CreateGameRequest createGameRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGameRequest, CreateGameResult> asyncHandler);

    /**
     * <p>
     * Creates a snapshot of the game configuration.
     * </p>
     * 
     * @param createSnapshotRequest
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AWSGameSparksAsync.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Creates a snapshot of the game configuration.
     * </p>
     * 
     * @param createSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSnapshot operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateSnapshotResult> createSnapshotAsync(CreateSnapshotRequest createSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSnapshotRequest, CreateSnapshotResult> asyncHandler);

    /**
     * <p>
     * Creates a new stage for stage-by-stage game development and deployment.
     * </p>
     * 
     * @param createStageRequest
     * @return A Java Future containing the result of the CreateStage operation returned by the service.
     * @sample AWSGameSparksAsync.CreateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest createStageRequest);

    /**
     * <p>
     * Creates a new stage for stage-by-stage game development and deployment.
     * </p>
     * 
     * @param createStageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStage operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.CreateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateStageResult> createStageAsync(CreateStageRequest createStageRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStageRequest, CreateStageResult> asyncHandler);

    /**
     * <p>
     * Deletes a game.
     * </p>
     * 
     * @param deleteGameRequest
     * @return A Java Future containing the result of the DeleteGame operation returned by the service.
     * @sample AWSGameSparksAsync.DeleteGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DeleteGame" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGameResult> deleteGameAsync(DeleteGameRequest deleteGameRequest);

    /**
     * <p>
     * Deletes a game.
     * </p>
     * 
     * @param deleteGameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGame operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.DeleteGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DeleteGame" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteGameResult> deleteGameAsync(DeleteGameRequest deleteGameRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGameRequest, DeleteGameResult> asyncHandler);

    /**
     * <p>
     * Deletes a stage from a game, along with the associated game runtime.
     * </p>
     * 
     * @param deleteStageRequest
     * @return A Java Future containing the result of the DeleteStage operation returned by the service.
     * @sample AWSGameSparksAsync.DeleteStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DeleteStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest deleteStageRequest);

    /**
     * <p>
     * Deletes a stage from a game, along with the associated game runtime.
     * </p>
     * 
     * @param deleteStageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteStage operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.DeleteStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DeleteStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteStageResult> deleteStageAsync(DeleteStageRequest deleteStageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStageRequest, DeleteStageResult> asyncHandler);

    /**
     * <p>
     * Disconnects a player from the game runtime.
     * </p>
     * <p>
     * If a player has multiple connections, this operation attempts to close all of them.
     * </p>
     * 
     * @param disconnectPlayerRequest
     * @return A Java Future containing the result of the DisconnectPlayer operation returned by the service.
     * @sample AWSGameSparksAsync.DisconnectPlayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DisconnectPlayer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisconnectPlayerResult> disconnectPlayerAsync(DisconnectPlayerRequest disconnectPlayerRequest);

    /**
     * <p>
     * Disconnects a player from the game runtime.
     * </p>
     * <p>
     * If a player has multiple connections, this operation attempts to close all of them.
     * </p>
     * 
     * @param disconnectPlayerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DisconnectPlayer operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.DisconnectPlayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DisconnectPlayer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DisconnectPlayerResult> disconnectPlayerAsync(DisconnectPlayerRequest disconnectPlayerRequest,
            com.amazonaws.handlers.AsyncHandler<DisconnectPlayerRequest, DisconnectPlayerResult> asyncHandler);

    /**
     * <p>
     * Exports a game configuration snapshot.
     * </p>
     * 
     * @param exportSnapshotRequest
     * @return A Java Future containing the result of the ExportSnapshot operation returned by the service.
     * @sample AWSGameSparksAsync.ExportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ExportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportSnapshotResult> exportSnapshotAsync(ExportSnapshotRequest exportSnapshotRequest);

    /**
     * <p>
     * Exports a game configuration snapshot.
     * </p>
     * 
     * @param exportSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExportSnapshot operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.ExportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ExportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ExportSnapshotResult> exportSnapshotAsync(ExportSnapshotRequest exportSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<ExportSnapshotRequest, ExportSnapshotResult> asyncHandler);

    /**
     * <p>
     * Gets details about a specified extension.
     * </p>
     * 
     * @param getExtensionRequest
     * @return A Java Future containing the result of the GetExtension operation returned by the service.
     * @sample AWSGameSparksAsync.GetExtension
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetExtension" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExtensionResult> getExtensionAsync(GetExtensionRequest getExtensionRequest);

    /**
     * <p>
     * Gets details about a specified extension.
     * </p>
     * 
     * @param getExtensionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExtension operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.GetExtension
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetExtension" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetExtensionResult> getExtensionAsync(GetExtensionRequest getExtensionRequest,
            com.amazonaws.handlers.AsyncHandler<GetExtensionRequest, GetExtensionResult> asyncHandler);

    /**
     * <p>
     * Gets details about a specified extension version.
     * </p>
     * 
     * @param getExtensionVersionRequest
     * @return A Java Future containing the result of the GetExtensionVersion operation returned by the service.
     * @sample AWSGameSparksAsync.GetExtensionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetExtensionVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetExtensionVersionResult> getExtensionVersionAsync(GetExtensionVersionRequest getExtensionVersionRequest);

    /**
     * <p>
     * Gets details about a specified extension version.
     * </p>
     * 
     * @param getExtensionVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetExtensionVersion operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.GetExtensionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetExtensionVersion" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetExtensionVersionResult> getExtensionVersionAsync(GetExtensionVersionRequest getExtensionVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetExtensionVersionRequest, GetExtensionVersionResult> asyncHandler);

    /**
     * <p>
     * Gets details about a game.
     * </p>
     * 
     * @param getGameRequest
     * @return A Java Future containing the result of the GetGame operation returned by the service.
     * @sample AWSGameSparksAsync.GetGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGame" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGameResult> getGameAsync(GetGameRequest getGameRequest);

    /**
     * <p>
     * Gets details about a game.
     * </p>
     * 
     * @param getGameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGame operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.GetGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGame" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetGameResult> getGameAsync(GetGameRequest getGameRequest,
            com.amazonaws.handlers.AsyncHandler<GetGameRequest, GetGameResult> asyncHandler);

    /**
     * <p>
     * Gets the configuration of the game.
     * </p>
     * 
     * @param getGameConfigurationRequest
     * @return A Java Future containing the result of the GetGameConfiguration operation returned by the service.
     * @sample AWSGameSparksAsync.GetGameConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGameConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGameConfigurationResult> getGameConfigurationAsync(GetGameConfigurationRequest getGameConfigurationRequest);

    /**
     * <p>
     * Gets the configuration of the game.
     * </p>
     * 
     * @param getGameConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGameConfiguration operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.GetGameConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGameConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetGameConfigurationResult> getGameConfigurationAsync(GetGameConfigurationRequest getGameConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<GetGameConfigurationRequest, GetGameConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets details about a job that is generating code for a snapshot.
     * </p>
     * 
     * @param getGeneratedCodeJobRequest
     * @return A Java Future containing the result of the GetGeneratedCodeJob operation returned by the service.
     * @sample AWSGameSparksAsync.GetGeneratedCodeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGeneratedCodeJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetGeneratedCodeJobResult> getGeneratedCodeJobAsync(GetGeneratedCodeJobRequest getGeneratedCodeJobRequest);

    /**
     * <p>
     * Gets details about a job that is generating code for a snapshot.
     * </p>
     * 
     * @param getGeneratedCodeJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGeneratedCodeJob operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.GetGeneratedCodeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGeneratedCodeJob" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetGeneratedCodeJobResult> getGeneratedCodeJobAsync(GetGeneratedCodeJobRequest getGeneratedCodeJobRequest,
            com.amazonaws.handlers.AsyncHandler<GetGeneratedCodeJobRequest, GetGeneratedCodeJobResult> asyncHandler);

    /**
     * <p>
     * Gets the status of a player's connection to the game runtime.
     * </p>
     * <p>
     * It's possible for a single player to have multiple connections to the game runtime. If a player is not connected,
     * this operation returns an empty list.
     * </p>
     * 
     * @param getPlayerConnectionStatusRequest
     * @return A Java Future containing the result of the GetPlayerConnectionStatus operation returned by the service.
     * @sample AWSGameSparksAsync.GetPlayerConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetPlayerConnectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPlayerConnectionStatusResult> getPlayerConnectionStatusAsync(
            GetPlayerConnectionStatusRequest getPlayerConnectionStatusRequest);

    /**
     * <p>
     * Gets the status of a player's connection to the game runtime.
     * </p>
     * <p>
     * It's possible for a single player to have multiple connections to the game runtime. If a player is not connected,
     * this operation returns an empty list.
     * </p>
     * 
     * @param getPlayerConnectionStatusRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPlayerConnectionStatus operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.GetPlayerConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetPlayerConnectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<GetPlayerConnectionStatusResult> getPlayerConnectionStatusAsync(
            GetPlayerConnectionStatusRequest getPlayerConnectionStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetPlayerConnectionStatusRequest, GetPlayerConnectionStatusResult> asyncHandler);

    /**
     * <p>
     * Gets a copy of the game configuration in a snapshot.
     * </p>
     * 
     * @param getSnapshotRequest
     * @return A Java Future containing the result of the GetSnapshot operation returned by the service.
     * @sample AWSGameSparksAsync.GetSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSnapshotResult> getSnapshotAsync(GetSnapshotRequest getSnapshotRequest);

    /**
     * <p>
     * Gets a copy of the game configuration in a snapshot.
     * </p>
     * 
     * @param getSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSnapshot operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.GetSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetSnapshotResult> getSnapshotAsync(GetSnapshotRequest getSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<GetSnapshotRequest, GetSnapshotResult> asyncHandler);

    /**
     * <p>
     * Gets information about a stage.
     * </p>
     * 
     * @param getStageRequest
     * @return A Java Future containing the result of the GetStage operation returned by the service.
     * @sample AWSGameSparksAsync.GetStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest getStageRequest);

    /**
     * <p>
     * Gets information about a stage.
     * </p>
     * 
     * @param getStageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStage operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.GetStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetStageResult> getStageAsync(GetStageRequest getStageRequest,
            com.amazonaws.handlers.AsyncHandler<GetStageRequest, GetStageResult> asyncHandler);

    /**
     * <p>
     * Gets information about a stage deployment.
     * </p>
     * 
     * @param getStageDeploymentRequest
     * @return A Java Future containing the result of the GetStageDeployment operation returned by the service.
     * @sample AWSGameSparksAsync.GetStageDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetStageDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetStageDeploymentResult> getStageDeploymentAsync(GetStageDeploymentRequest getStageDeploymentRequest);

    /**
     * <p>
     * Gets information about a stage deployment.
     * </p>
     * 
     * @param getStageDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStageDeployment operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.GetStageDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetStageDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetStageDeploymentResult> getStageDeploymentAsync(GetStageDeploymentRequest getStageDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<GetStageDeploymentRequest, GetStageDeploymentResult> asyncHandler);

    /**
     * <p>
     * Imports a game configuration.
     * </p>
     * <p>
     * This operation replaces the current configuration of the game with the provided input. This is not a reversible
     * operation. If you want to preserve the previous configuration, use <code>CreateSnapshot</code> to make a new
     * snapshot before importing.
     * </p>
     * 
     * @param importGameConfigurationRequest
     * @return A Java Future containing the result of the ImportGameConfiguration operation returned by the service.
     * @sample AWSGameSparksAsync.ImportGameConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ImportGameConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportGameConfigurationResult> importGameConfigurationAsync(ImportGameConfigurationRequest importGameConfigurationRequest);

    /**
     * <p>
     * Imports a game configuration.
     * </p>
     * <p>
     * This operation replaces the current configuration of the game with the provided input. This is not a reversible
     * operation. If you want to preserve the previous configuration, use <code>CreateSnapshot</code> to make a new
     * snapshot before importing.
     * </p>
     * 
     * @param importGameConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ImportGameConfiguration operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.ImportGameConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ImportGameConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ImportGameConfigurationResult> importGameConfigurationAsync(ImportGameConfigurationRequest importGameConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<ImportGameConfigurationRequest, ImportGameConfigurationResult> asyncHandler);

    /**
     * <p>
     * Gets a paginated list of available versions for the extension.
     * </p>
     * <p>
     * Each time an API change is made to an extension, the version is incremented. The list retrieved by this operation
     * shows the versions that are currently available.
     * </p>
     * 
     * @param listExtensionVersionsRequest
     * @return A Java Future containing the result of the ListExtensionVersions operation returned by the service.
     * @sample AWSGameSparksAsync.ListExtensionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListExtensionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExtensionVersionsResult> listExtensionVersionsAsync(ListExtensionVersionsRequest listExtensionVersionsRequest);

    /**
     * <p>
     * Gets a paginated list of available versions for the extension.
     * </p>
     * <p>
     * Each time an API change is made to an extension, the version is incremented. The list retrieved by this operation
     * shows the versions that are currently available.
     * </p>
     * 
     * @param listExtensionVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExtensionVersions operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.ListExtensionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListExtensionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListExtensionVersionsResult> listExtensionVersionsAsync(ListExtensionVersionsRequest listExtensionVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExtensionVersionsRequest, ListExtensionVersionsResult> asyncHandler);

    /**
     * <p>
     * Gets a paginated list of available extensions.
     * </p>
     * <p>
     * Extensions provide features that games can use from scripts.
     * </p>
     * 
     * @param listExtensionsRequest
     * @return A Java Future containing the result of the ListExtensions operation returned by the service.
     * @sample AWSGameSparksAsync.ListExtensions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListExtensions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExtensionsResult> listExtensionsAsync(ListExtensionsRequest listExtensionsRequest);

    /**
     * <p>
     * Gets a paginated list of available extensions.
     * </p>
     * <p>
     * Extensions provide features that games can use from scripts.
     * </p>
     * 
     * @param listExtensionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListExtensions operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.ListExtensions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListExtensions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListExtensionsResult> listExtensionsAsync(ListExtensionsRequest listExtensionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListExtensionsRequest, ListExtensionsResult> asyncHandler);

    /**
     * <p>
     * Gets a paginated list of games.
     * </p>
     * 
     * @param listGamesRequest
     * @return A Java Future containing the result of the ListGames operation returned by the service.
     * @sample AWSGameSparksAsync.ListGames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListGames" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGamesResult> listGamesAsync(ListGamesRequest listGamesRequest);

    /**
     * <p>
     * Gets a paginated list of games.
     * </p>
     * 
     * @param listGamesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGames operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.ListGames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListGames" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGamesResult> listGamesAsync(ListGamesRequest listGamesRequest,
            com.amazonaws.handlers.AsyncHandler<ListGamesRequest, ListGamesResult> asyncHandler);

    /**
     * <p>
     * Gets a paginated list of code generation jobs for a snapshot.
     * </p>
     * 
     * @param listGeneratedCodeJobsRequest
     * @return A Java Future containing the result of the ListGeneratedCodeJobs operation returned by the service.
     * @sample AWSGameSparksAsync.ListGeneratedCodeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListGeneratedCodeJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGeneratedCodeJobsResult> listGeneratedCodeJobsAsync(ListGeneratedCodeJobsRequest listGeneratedCodeJobsRequest);

    /**
     * <p>
     * Gets a paginated list of code generation jobs for a snapshot.
     * </p>
     * 
     * @param listGeneratedCodeJobsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGeneratedCodeJobs operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.ListGeneratedCodeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListGeneratedCodeJobs"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListGeneratedCodeJobsResult> listGeneratedCodeJobsAsync(ListGeneratedCodeJobsRequest listGeneratedCodeJobsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGeneratedCodeJobsRequest, ListGeneratedCodeJobsResult> asyncHandler);

    /**
     * <p>
     * Gets a paginated list of snapshot summaries from the game.
     * </p>
     * 
     * @param listSnapshotsRequest
     * @return A Java Future containing the result of the ListSnapshots operation returned by the service.
     * @sample AWSGameSparksAsync.ListSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSnapshotsResult> listSnapshotsAsync(ListSnapshotsRequest listSnapshotsRequest);

    /**
     * <p>
     * Gets a paginated list of snapshot summaries from the game.
     * </p>
     * 
     * @param listSnapshotsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSnapshots operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.ListSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListSnapshotsResult> listSnapshotsAsync(ListSnapshotsRequest listSnapshotsRequest,
            com.amazonaws.handlers.AsyncHandler<ListSnapshotsRequest, ListSnapshotsResult> asyncHandler);

    /**
     * <p>
     * Gets a paginated list of stage deployment summaries from the game.
     * </p>
     * 
     * @param listStageDeploymentsRequest
     * @return A Java Future containing the result of the ListStageDeployments operation returned by the service.
     * @sample AWSGameSparksAsync.ListStageDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListStageDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStageDeploymentsResult> listStageDeploymentsAsync(ListStageDeploymentsRequest listStageDeploymentsRequest);

    /**
     * <p>
     * Gets a paginated list of stage deployment summaries from the game.
     * </p>
     * 
     * @param listStageDeploymentsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStageDeployments operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.ListStageDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListStageDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListStageDeploymentsResult> listStageDeploymentsAsync(ListStageDeploymentsRequest listStageDeploymentsRequest,
            com.amazonaws.handlers.AsyncHandler<ListStageDeploymentsRequest, ListStageDeploymentsResult> asyncHandler);

    /**
     * <p>
     * Gets a paginated list of stage summaries from the game.
     * </p>
     * 
     * @param listStagesRequest
     * @return A Java Future containing the result of the ListStages operation returned by the service.
     * @sample AWSGameSparksAsync.ListStages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListStages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStagesResult> listStagesAsync(ListStagesRequest listStagesRequest);

    /**
     * <p>
     * Gets a paginated list of stage summaries from the game.
     * </p>
     * 
     * @param listStagesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStages operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.ListStages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListStages" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListStagesResult> listStagesAsync(ListStagesRequest listStagesRequest,
            com.amazonaws.handlers.AsyncHandler<ListStagesRequest, ListStagesResult> asyncHandler);

    /**
     * <p>
     * Lists the tags associated with a GameSparks resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSGameSparksAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Lists the tags associated with a GameSparks resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Starts an asynchronous process that generates client code for system-defined and custom messages. The resulting
     * code is collected as a .zip file and uploaded to a pre-signed Amazon S3 URL.
     * </p>
     * 
     * @param startGeneratedCodeJobRequest
     * @return A Java Future containing the result of the StartGeneratedCodeJob operation returned by the service.
     * @sample AWSGameSparksAsync.StartGeneratedCodeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/StartGeneratedCodeJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartGeneratedCodeJobResult> startGeneratedCodeJobAsync(StartGeneratedCodeJobRequest startGeneratedCodeJobRequest);

    /**
     * <p>
     * Starts an asynchronous process that generates client code for system-defined and custom messages. The resulting
     * code is collected as a .zip file and uploaded to a pre-signed Amazon S3 URL.
     * </p>
     * 
     * @param startGeneratedCodeJobRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartGeneratedCodeJob operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.StartGeneratedCodeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/StartGeneratedCodeJob"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartGeneratedCodeJobResult> startGeneratedCodeJobAsync(StartGeneratedCodeJobRequest startGeneratedCodeJobRequest,
            com.amazonaws.handlers.AsyncHandler<StartGeneratedCodeJobRequest, StartGeneratedCodeJobResult> asyncHandler);

    /**
     * <p>
     * Deploys a snapshot to the stage and creates a new game runtime.
     * </p>
     * <p>
     * After you call this operation, you can check the deployment status by using <code>GetStageDeployment</code>.
     * </p>
     * <p>
     * If there are any players connected to the previous game runtime, then both runtimes persist. Existing connections
     * to the previous runtime are maintained. When players disconnect and reconnect, they connect to the new runtime.
     * After there are no connections to the previous game runtime, it is deleted.
     * </p>
     * 
     * @param startStageDeploymentRequest
     * @return A Java Future containing the result of the StartStageDeployment operation returned by the service.
     * @sample AWSGameSparksAsync.StartStageDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/StartStageDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartStageDeploymentResult> startStageDeploymentAsync(StartStageDeploymentRequest startStageDeploymentRequest);

    /**
     * <p>
     * Deploys a snapshot to the stage and creates a new game runtime.
     * </p>
     * <p>
     * After you call this operation, you can check the deployment status by using <code>GetStageDeployment</code>.
     * </p>
     * <p>
     * If there are any players connected to the previous game runtime, then both runtimes persist. Existing connections
     * to the previous runtime are maintained. When players disconnect and reconnect, they connect to the new runtime.
     * After there are no connections to the previous game runtime, it is deleted.
     * </p>
     * 
     * @param startStageDeploymentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartStageDeployment operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.StartStageDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/StartStageDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartStageDeploymentResult> startStageDeploymentAsync(StartStageDeploymentRequest startStageDeploymentRequest,
            com.amazonaws.handlers.AsyncHandler<StartStageDeploymentRequest, StartStageDeploymentResult> asyncHandler);

    /**
     * <p>
     * Adds tags to a GameSparks resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSGameSparksAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Adds tags to a GameSparks resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes tags from a GameSparks resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSGameSparksAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes tags from a GameSparks resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates details of the game.
     * </p>
     * 
     * @param updateGameRequest
     * @return A Java Future containing the result of the UpdateGame operation returned by the service.
     * @sample AWSGameSparksAsync.UpdateGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateGame" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameResult> updateGameAsync(UpdateGameRequest updateGameRequest);

    /**
     * <p>
     * Updates details of the game.
     * </p>
     * 
     * @param updateGameRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGame operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.UpdateGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateGame" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameResult> updateGameAsync(UpdateGameRequest updateGameRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGameRequest, UpdateGameResult> asyncHandler);

    /**
     * <p>
     * Updates one or more sections of the game configuration.
     * </p>
     * 
     * @param updateGameConfigurationRequest
     * @return A Java Future containing the result of the UpdateGameConfiguration operation returned by the service.
     * @sample AWSGameSparksAsync.UpdateGameConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateGameConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameConfigurationResult> updateGameConfigurationAsync(UpdateGameConfigurationRequest updateGameConfigurationRequest);

    /**
     * <p>
     * Updates one or more sections of the game configuration.
     * </p>
     * 
     * @param updateGameConfigurationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGameConfiguration operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.UpdateGameConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateGameConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameConfigurationResult> updateGameConfigurationAsync(UpdateGameConfigurationRequest updateGameConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGameConfigurationRequest, UpdateGameConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the metadata of a GameSparks snapshot.
     * </p>
     * 
     * @param updateSnapshotRequest
     * @return A Java Future containing the result of the UpdateSnapshot operation returned by the service.
     * @sample AWSGameSparksAsync.UpdateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(UpdateSnapshotRequest updateSnapshotRequest);

    /**
     * <p>
     * Updates the metadata of a GameSparks snapshot.
     * </p>
     * 
     * @param updateSnapshotRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSnapshot operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.UpdateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateSnapshotResult> updateSnapshotAsync(UpdateSnapshotRequest updateSnapshotRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSnapshotRequest, UpdateSnapshotResult> asyncHandler);

    /**
     * <p>
     * Updates the metadata of a stage.
     * </p>
     * 
     * @param updateStageRequest
     * @return A Java Future containing the result of the UpdateStage operation returned by the service.
     * @sample AWSGameSparksAsync.UpdateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest updateStageRequest);

    /**
     * <p>
     * Updates the metadata of a stage.
     * </p>
     * 
     * @param updateStageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStage operation returned by the service.
     * @sample AWSGameSparksAsyncHandler.UpdateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateStage" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateStageResult> updateStageAsync(UpdateStageRequest updateStageRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStageRequest, UpdateStageResult> asyncHandler);

}
