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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.gamesparks.model.*;

/**
 * Interface for accessing GameSparks.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.gamesparks.AbstractAWSGameSparks} instead.
 * </p>
 * <p>
 * <p/>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AWSGameSparks {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "gamesparks";

    /**
     * <p>
     * Creates a new game with an empty configuration. After creating your game, you can update the configuration using
     * <code>UpdateGameConfiguration</code> or <code>ImportGameConfiguration</code>.
     * </p>
     * 
     * @param createGameRequest
     * @return Result of the CreateGame operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @throws ServiceQuotaExceededException
     *         The request would result in exceeding service quota.
     * @sample AWSGameSparks.CreateGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateGame" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGameResult createGame(CreateGameRequest createGameRequest);

    /**
     * <p>
     * Creates a snapshot of the game configuration.
     * </p>
     * 
     * @param createSnapshotRequest
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.CreateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    CreateSnapshotResult createSnapshot(CreateSnapshotRequest createSnapshotRequest);

    /**
     * <p>
     * Creates a new stage for stage-by-stage game development and deployment.
     * </p>
     * 
     * @param createStageRequest
     * @return Result of the CreateStage operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.CreateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/CreateStage" target="_top">AWS API
     *      Documentation</a>
     */
    CreateStageResult createStage(CreateStageRequest createStageRequest);

    /**
     * <p>
     * Deletes a game.
     * </p>
     * 
     * @param deleteGameRequest
     * @return Result of the DeleteGame operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.DeleteGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DeleteGame" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteGameResult deleteGame(DeleteGameRequest deleteGameRequest);

    /**
     * <p>
     * Deletes a stage from a game, along with the associated game runtime.
     * </p>
     * 
     * @param deleteStageRequest
     * @return Result of the DeleteStage operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.DeleteStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DeleteStage" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteStageResult deleteStage(DeleteStageRequest deleteStageRequest);

    /**
     * <p>
     * Disconnects a player from the game runtime.
     * </p>
     * <p>
     * If a player has multiple connections, this operation attempts to close all of them.
     * </p>
     * 
     * @param disconnectPlayerRequest
     * @return Result of the DisconnectPlayer operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.DisconnectPlayer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/DisconnectPlayer" target="_top">AWS
     *      API Documentation</a>
     */
    DisconnectPlayerResult disconnectPlayer(DisconnectPlayerRequest disconnectPlayerRequest);

    /**
     * <p>
     * Exports a game configuration snapshot.
     * </p>
     * 
     * @param exportSnapshotRequest
     * @return Result of the ExportSnapshot operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ExportSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ExportSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    ExportSnapshotResult exportSnapshot(ExportSnapshotRequest exportSnapshotRequest);

    /**
     * <p>
     * Gets details about a specified extension.
     * </p>
     * 
     * @param getExtensionRequest
     * @return Result of the GetExtension operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetExtension
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetExtension" target="_top">AWS API
     *      Documentation</a>
     */
    GetExtensionResult getExtension(GetExtensionRequest getExtensionRequest);

    /**
     * <p>
     * Gets details about a specified extension version.
     * </p>
     * 
     * @param getExtensionVersionRequest
     * @return Result of the GetExtensionVersion operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetExtensionVersion
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetExtensionVersion" target="_top">AWS
     *      API Documentation</a>
     */
    GetExtensionVersionResult getExtensionVersion(GetExtensionVersionRequest getExtensionVersionRequest);

    /**
     * <p>
     * Gets details about a game.
     * </p>
     * 
     * @param getGameRequest
     * @return Result of the GetGame operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGame" target="_top">AWS API
     *      Documentation</a>
     */
    GetGameResult getGame(GetGameRequest getGameRequest);

    /**
     * <p>
     * Gets the configuration of the game.
     * </p>
     * 
     * @param getGameConfigurationRequest
     * @return Result of the GetGameConfiguration operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetGameConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGameConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    GetGameConfigurationResult getGameConfiguration(GetGameConfigurationRequest getGameConfigurationRequest);

    /**
     * <p>
     * Gets details about a job that is generating code for a snapshot.
     * </p>
     * 
     * @param getGeneratedCodeJobRequest
     * @return Result of the GetGeneratedCodeJob operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetGeneratedCodeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetGeneratedCodeJob" target="_top">AWS
     *      API Documentation</a>
     */
    GetGeneratedCodeJobResult getGeneratedCodeJob(GetGeneratedCodeJobRequest getGeneratedCodeJobRequest);

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
     * @return Result of the GetPlayerConnectionStatus operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetPlayerConnectionStatus
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetPlayerConnectionStatus"
     *      target="_top">AWS API Documentation</a>
     */
    GetPlayerConnectionStatusResult getPlayerConnectionStatus(GetPlayerConnectionStatusRequest getPlayerConnectionStatusRequest);

    /**
     * <p>
     * Gets a copy of the game configuration in a snapshot.
     * </p>
     * 
     * @param getSnapshotRequest
     * @return Result of the GetSnapshot operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    GetSnapshotResult getSnapshot(GetSnapshotRequest getSnapshotRequest);

    /**
     * <p>
     * Gets information about a stage.
     * </p>
     * 
     * @param getStageRequest
     * @return Result of the GetStage operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetStage" target="_top">AWS API
     *      Documentation</a>
     */
    GetStageResult getStage(GetStageRequest getStageRequest);

    /**
     * <p>
     * Gets information about a stage deployment.
     * </p>
     * 
     * @param getStageDeploymentRequest
     * @return Result of the GetStageDeployment operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.GetStageDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/GetStageDeployment" target="_top">AWS
     *      API Documentation</a>
     */
    GetStageDeploymentResult getStageDeployment(GetStageDeploymentRequest getStageDeploymentRequest);

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
     * @return Result of the ImportGameConfiguration operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @throws ServiceQuotaExceededException
     *         The request would result in exceeding service quota.
     * @sample AWSGameSparks.ImportGameConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ImportGameConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    ImportGameConfigurationResult importGameConfiguration(ImportGameConfigurationRequest importGameConfigurationRequest);

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
     * @return Result of the ListExtensionVersions operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListExtensionVersions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListExtensionVersions"
     *      target="_top">AWS API Documentation</a>
     */
    ListExtensionVersionsResult listExtensionVersions(ListExtensionVersionsRequest listExtensionVersionsRequest);

    /**
     * <p>
     * Gets a paginated list of available extensions.
     * </p>
     * <p>
     * Extensions provide features that games can use from scripts.
     * </p>
     * 
     * @param listExtensionsRequest
     * @return Result of the ListExtensions operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListExtensions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListExtensions" target="_top">AWS API
     *      Documentation</a>
     */
    ListExtensionsResult listExtensions(ListExtensionsRequest listExtensionsRequest);

    /**
     * <p>
     * Gets a paginated list of games.
     * </p>
     * 
     * @param listGamesRequest
     * @return Result of the ListGames operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListGames
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListGames" target="_top">AWS API
     *      Documentation</a>
     */
    ListGamesResult listGames(ListGamesRequest listGamesRequest);

    /**
     * <p>
     * Gets a paginated list of code generation jobs for a snapshot.
     * </p>
     * 
     * @param listGeneratedCodeJobsRequest
     * @return Result of the ListGeneratedCodeJobs operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListGeneratedCodeJobs
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListGeneratedCodeJobs"
     *      target="_top">AWS API Documentation</a>
     */
    ListGeneratedCodeJobsResult listGeneratedCodeJobs(ListGeneratedCodeJobsRequest listGeneratedCodeJobsRequest);

    /**
     * <p>
     * Gets a paginated list of snapshot summaries from the game.
     * </p>
     * 
     * @param listSnapshotsRequest
     * @return Result of the ListSnapshots operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListSnapshots
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListSnapshots" target="_top">AWS API
     *      Documentation</a>
     */
    ListSnapshotsResult listSnapshots(ListSnapshotsRequest listSnapshotsRequest);

    /**
     * <p>
     * Gets a paginated list of stage deployment summaries from the game.
     * </p>
     * 
     * @param listStageDeploymentsRequest
     * @return Result of the ListStageDeployments operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListStageDeployments
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListStageDeployments"
     *      target="_top">AWS API Documentation</a>
     */
    ListStageDeploymentsResult listStageDeployments(ListStageDeploymentsRequest listStageDeploymentsRequest);

    /**
     * <p>
     * Gets a paginated list of stage summaries from the game.
     * </p>
     * 
     * @param listStagesRequest
     * @return Result of the ListStages operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListStages
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListStages" target="_top">AWS API
     *      Documentation</a>
     */
    ListStagesResult listStages(ListStagesRequest listStagesRequest);

    /**
     * <p>
     * Lists the tags associated with a GameSparks resource.
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Starts an asynchronous process that generates client code for system-defined and custom messages. The resulting
     * code is collected as a .zip file and uploaded to a pre-signed Amazon S3 URL.
     * </p>
     * 
     * @param startGeneratedCodeJobRequest
     * @return Result of the StartGeneratedCodeJob operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.StartGeneratedCodeJob
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/StartGeneratedCodeJob"
     *      target="_top">AWS API Documentation</a>
     */
    StartGeneratedCodeJobResult startGeneratedCodeJob(StartGeneratedCodeJobRequest startGeneratedCodeJobRequest);

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
     * @return Result of the StartStageDeployment operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ConflictException
     *         The resource already exists, or another operation is in progress.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.StartStageDeployment
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/StartStageDeployment"
     *      target="_top">AWS API Documentation</a>
     */
    StartStageDeploymentResult startStageDeployment(StartStageDeploymentRequest startStageDeploymentRequest);

    /**
     * <p>
     * Adds tags to a GameSparks resource.
     * </p>
     * 
     * @param tagResourceRequest
     * @return Result of the TagResource operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Removes tags from a GameSparks resource.
     * </p>
     * 
     * @param untagResourceRequest
     * @return Result of the UntagResource operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Updates details of the game.
     * </p>
     * 
     * @param updateGameRequest
     * @return Result of the UpdateGame operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.UpdateGame
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateGame" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGameResult updateGame(UpdateGameRequest updateGameRequest);

    /**
     * <p>
     * Updates one or more sections of the game configuration.
     * </p>
     * 
     * @param updateGameConfigurationRequest
     * @return Result of the UpdateGameConfiguration operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @throws ServiceQuotaExceededException
     *         The request would result in exceeding service quota.
     * @sample AWSGameSparks.UpdateGameConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateGameConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGameConfigurationResult updateGameConfiguration(UpdateGameConfigurationRequest updateGameConfigurationRequest);

    /**
     * <p>
     * Updates the metadata of a GameSparks snapshot.
     * </p>
     * 
     * @param updateSnapshotRequest
     * @return Result of the UpdateSnapshot operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.UpdateSnapshot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateSnapshot" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateSnapshotResult updateSnapshot(UpdateSnapshotRequest updateSnapshotRequest);

    /**
     * <p>
     * Updates the metadata of a stage.
     * </p>
     * 
     * @param updateStageRequest
     * @return Result of the UpdateStage operation returned by the service.
     * @throws ValidationException
     *         One of the parameters in the request is invalid.
     * @throws AccessDeniedException
     *         You do not have sufficient access to perform this action.
     * @throws ThrottlingException
     *         The request throughput limit was exceeded.
     * @throws ResourceNotFoundException
     *         The resource specified in the request does not exist.
     * @throws InternalServerException
     *         The service encountered an internal error.
     * @sample AWSGameSparks.UpdateStage
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/UpdateStage" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateStageResult updateStage(UpdateStageRequest updateStageRequest);

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
