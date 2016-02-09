/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.gamelift;

import com.amazonaws.services.gamelift.model.*;

/**
 * Interface for accessing Amazon GameLift asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon GameLift Service</fullname>
 * <p>
 * This is the reference guide for the Amazon GameLift service. GameLift is a
 * managed AWS service for developers who need a scalable, server-based solution
 * for multiplayer games. GameLift provides setup and deployment of game
 * servers, and handles infrastructure scaling and session management. For more
 * information about the GameLift service, including a feature overview, getting
 * started guide, and tutorial, see the accompanying GameLift Developer Guide.
 * </p>
 * <p>
 * This reference describes the low-level service API for GameLift. You can call
 * this API directly or use the AWS SDK for your preferred language. The AWS SDK
 * includes a set of high-level GameLiftactions for. Alternatively, use the AWS
 * command-line interface (CLI) tool, which includes commands for GameLift. For
 * administrative actions, you can use the Amazon GameLift console.
 * </p>
 * <p>
 * <b>Setting Up Your Game Servers</b>
 * </p>
 * <p>
 * Use these administrative actions to configure GameLift to host your game
 * servers. When configuring GameLift, you'll need to (1) configure a build for
 * your game and provide build files, and (2) set up one or more fleets to host
 * game sessions.
 * </p>
 * <ul>
 * <li><b>Build actions:</b>
 * <ul>
 * <li><a>ListBuilds</a></li>
 * <li><a>CreateBuild</a></li>
 * <li><a>DescribeBuild</a></li>
 * <li><a>UpdateBuild</a></li>
 * <li><a>DeleteBuild</a></li>
 * <li><a>RequestUploadCredentials</a></li>
 * </ul>
 * </li>
 * <li><b>Fleet actions:</b>
 * <ul>
 * <li><a>ListFleets</a></li>
 * <li><a>CreateFleet</a></li>
 * <li>Describe fleet actions:
 * <ul>
 * <li><a>DescribeFleetAttributes</a></li>
 * <li><a>DescribeFleetCapacity</a></li>
 * <li><a>DescribeFleetPortSettings</a></li>
 * <li><a>DescribeFleetUtilization</a></li>
 * <li><a>DescribeEC2InstanceLimits</a></li>
 * <li><a>DescribeFleetEvents</a></li>
 * </ul>
 * </li>
 * <li>Update fleet actions:
 * <ul>
 * <li><a>UpdateFleetAttributes</a></li>
 * <li><a>UpdateFleetCapacity</a></li>
 * <li><a>UpdateFleetPortSettings</a></li>
 * </ul>
 * </li>
 * <li><a>DeleteFleet</a></li>
 * </ul>
 * </li>
 * <li><b>Alias actions:</b>
 * <ul>
 * <li><a>ListAliases</a></li>
 * <li><a>CreateAlias</a></li>
 * <li><a>DescribeAlias</a></li>
 * <li><a>UpdateAlias</a></li>
 * <li><a>DeleteAlias</a></li>
 * <li><a>ResolveAlias</a></li>
 * </ul>
 * </li>
 * <li><b>Other actions:</b>
 * <ul>
 * <li><a>GetGameSessionLogUrl</a></li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * <b>Managing Game and Player Sessions Through GameLift</b>
 * </p>
 * <p>
 * Call these actions from your game clients and/or services to create and
 * manage multiplayer game sessions.
 * </p>
 * <ul>
 * <li><b>Game sessions</b>
 * <ul>
 * <li><a>CreateGameSession</a></li>
 * <li><a>DescribeGameSessions</a></li>
 * <li><a>UpdateGameSession</a></li>
 * </ul>
 * </li>
 * <li><b>Player sessions</b>
 * <ul>
 * <li><a>CreatePlayerSession</a></li>
 * <li><a>CreatePlayerSessions</a></li>
 * <li><a>DescribePlayerSessions</a></li>
 * </ul>
 * </li>
 * </ul>
 */
public interface AmazonGameLiftAsync extends AmazonGameLift {

    /**
     * <p>
     * Creates an alias for a fleet. An alias allows you to anonymize your fleet
     * by referencing an alias instead of a specific fleet when you create game
     * sessions. GameLift supports two types of routing strategies for aliases.
     * Use a simple route to point to an active fleet.
     * </p>
     * <p>
     * Alternatively, a terminal routing strategy allows you to display a
     * message to incoming traffic instead of routing players to an active
     * fleet. This option is useful when a game server is no longer supported
     * but you want to provide better messaging than a standard 404 error.
     * </p>
     * <p>
     * To create a fleet alias, specify an alias name and routing strategy.
     * Optionally, add a description. If successful, a new alias record is
     * returned, including an alias ID, which you'll reference when creating a
     * game session. To reassign the alias to another fleet ID, call
     * <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.CreateAlias
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(
            CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates an alias for a fleet. An alias allows you to anonymize your fleet
     * by referencing an alias instead of a specific fleet when you create game
     * sessions. GameLift supports two types of routing strategies for aliases.
     * Use a simple route to point to an active fleet.
     * </p>
     * <p>
     * Alternatively, a terminal routing strategy allows you to display a
     * message to incoming traffic instead of routing players to an active
     * fleet. This option is useful when a game server is no longer supported
     * but you want to provide better messaging than a standard 404 error.
     * </p>
     * <p>
     * To create a fleet alias, specify an alias name and routing strategy.
     * Optionally, add a description. If successful, a new alias record is
     * returned, including an alias ID, which you'll reference when creating a
     * game session. To reassign the alias to another fleet ID, call
     * <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateAlias
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(
            CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler);

    /**
     * <note>
     * <p>
     * To create a build, use the CLI command <code>upload-build</code>, which
     * creates a new build record and uploads the build files in one step. (See
     * the GameLift Developer Guide for more details on CLI and on the upload
     * process.) Call this CreateBuild action only if you have your own S3
     * client and need to manually upload your build files.
     * </p>
     * </note>
     * <p>
     * Initializes a new build record and generates information required to
     * upload a game build to GameLift. Once the build record has been created
     * and is in an INITIALIZED state, you can upload your game build.
     * </p>
     * <p>
     * To create a new build, optionally specify a build name and version. This
     * metadata is stored with other properties in the build record and is
     * displayed in the Amazon GameLift console (it is not surfaced to players).
     * If successful, this action returns the newly created build record along
     * with an S3 storage location and AWS account credentials. Use the location
     * and credentials to upload your game build.
     * </p>
     * 
     * @param createBuildRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateBuild operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.CreateBuild
     */
    java.util.concurrent.Future<CreateBuildResult> createBuildAsync(
            CreateBuildRequest createBuildRequest);

    /**
     * <note>
     * <p>
     * To create a build, use the CLI command <code>upload-build</code>, which
     * creates a new build record and uploads the build files in one step. (See
     * the GameLift Developer Guide for more details on CLI and on the upload
     * process.) Call this CreateBuild action only if you have your own S3
     * client and need to manually upload your build files.
     * </p>
     * </note>
     * <p>
     * Initializes a new build record and generates information required to
     * upload a game build to GameLift. Once the build record has been created
     * and is in an INITIALIZED state, you can upload your game build.
     * </p>
     * <p>
     * To create a new build, optionally specify a build name and version. This
     * metadata is stored with other properties in the build record and is
     * displayed in the Amazon GameLift console (it is not surfaced to players).
     * If successful, this action returns the newly created build record along
     * with an S3 storage location and AWS account credentials. Use the location
     * and credentials to upload your game build.
     * </p>
     * 
     * @param createBuildRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBuild operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateBuild
     */
    java.util.concurrent.Future<CreateBuildResult> createBuildAsync(
            CreateBuildRequest createBuildRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBuildRequest, CreateBuildResult> asyncHandler);

    /**
     * <p>
     * Creates a new fleet to host game servers. A fleet consists of a set of
     * EC2 instances of a certain type, which defines the CPU, memory, storage,
     * networking capacity, etc., of each host in the fleet. See the <a
     * href="https://aws.amazon.com/ec2/instance-types/">EC2 documentation</a>
     * for more information on instance types. Each instance in the fleet hosts
     * a game server from the specified game build. Once a fleet is ACTIVE, it
     * can begin hosting game sessions.
     * </p>
     * <p>
     * To create a new fleet, provide a name and the EC2 instance type for the
     * new fleet, and specify the build and server launch path. Builds must be
     * in a READY state before they can be used to build fleets. When
     * configuring the new fleet, you can optionally (1) provide a set of launch
     * parameters to be passed to a game server when activated; (2) limit
     * incoming traffic to a specified range of IP addresses and port numbers;
     * and (3) configure GameLift to store game session logs by specifying the
     * path to the logs stored in your game server files. If the call is
     * successful, GameLift performs the following tasks:
     * </p>
     * <ul>
     * <li>Creates a fleet record and sets the state to NEW.</li>
     * <li>Sets the fleet's capacity to 1 "desired" and 1 "active" EC2 instance
     * count.</li>
     * <li>Creates an EC2 instance and begins the process of initializing the
     * fleet and activating a game server on the instance.</li>
     * <li>Writes events to the fleet event log, which can be accessed in the
     * Amazon GameLift console.</li>
     * </ul>
     * <p>
     * Once a fleet is created, use the following actions to change certain
     * fleet properties (server launch parameters and log paths cannot be
     * changed):
     * </p>
     * <ul>
     * <li><a>UpdateFleetAttributes</a> -- Update fleet metadata, including name
     * and description.</li>
     * <li><a>UpdateFleetCapacity</a> -- Increase or decrease the number of
     * instances you want the fleet to maintain.</li>
     * <li><a>UpdateFleetPortSettings</a> -- Change the IP addresses and ports
     * that allow access to incoming traffic.</li>
     * </ul>
     * 
     * @param createFleetRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateFleet operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.CreateFleet
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(
            CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a new fleet to host game servers. A fleet consists of a set of
     * EC2 instances of a certain type, which defines the CPU, memory, storage,
     * networking capacity, etc., of each host in the fleet. See the <a
     * href="https://aws.amazon.com/ec2/instance-types/">EC2 documentation</a>
     * for more information on instance types. Each instance in the fleet hosts
     * a game server from the specified game build. Once a fleet is ACTIVE, it
     * can begin hosting game sessions.
     * </p>
     * <p>
     * To create a new fleet, provide a name and the EC2 instance type for the
     * new fleet, and specify the build and server launch path. Builds must be
     * in a READY state before they can be used to build fleets. When
     * configuring the new fleet, you can optionally (1) provide a set of launch
     * parameters to be passed to a game server when activated; (2) limit
     * incoming traffic to a specified range of IP addresses and port numbers;
     * and (3) configure GameLift to store game session logs by specifying the
     * path to the logs stored in your game server files. If the call is
     * successful, GameLift performs the following tasks:
     * </p>
     * <ul>
     * <li>Creates a fleet record and sets the state to NEW.</li>
     * <li>Sets the fleet's capacity to 1 "desired" and 1 "active" EC2 instance
     * count.</li>
     * <li>Creates an EC2 instance and begins the process of initializing the
     * fleet and activating a game server on the instance.</li>
     * <li>Writes events to the fleet event log, which can be accessed in the
     * Amazon GameLift console.</li>
     * </ul>
     * <p>
     * Once a fleet is created, use the following actions to change certain
     * fleet properties (server launch parameters and log paths cannot be
     * changed):
     * </p>
     * <ul>
     * <li><a>UpdateFleetAttributes</a> -- Update fleet metadata, including name
     * and description.</li>
     * <li><a>UpdateFleetCapacity</a> -- Increase or decrease the number of
     * instances you want the fleet to maintain.</li>
     * <li><a>UpdateFleetPortSettings</a> -- Change the IP addresses and ports
     * that allow access to incoming traffic.</li>
     * </ul>
     * 
     * @param createFleetRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFleet operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateFleet
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(
            CreateFleetRequest createFleetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler);

    /**
     * <p>
     * Creates a multiplayer game session for players. This action creates a
     * game session record and assigns the new session to an instance in the
     * specified fleet, which activates the server initialization process in
     * your game server. A fleet must be in an ACTIVE state before a game
     * session can be created for it.
     * </p>
     * <p>
     * To create a game session, specify either a fleet ID or an alias ID and
     * indicate the maximum number of players the game session will allow.
     * Optionally, provide a name and a set of properties for your game. If
     * successful, a <a>GameSession</a> object is returned containing session
     * properties, including an IP address. By default, newly created game
     * sessions are set to accept adding any new players to the game session.
     * Use <a>UpdateGameSession</a> to change the creation policy.
     * </p>
     * 
     * @param createGameSessionRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreateGameSession
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateGameSession
     */
    java.util.concurrent.Future<CreateGameSessionResult> createGameSessionAsync(
            CreateGameSessionRequest createGameSessionRequest);

    /**
     * <p>
     * Creates a multiplayer game session for players. This action creates a
     * game session record and assigns the new session to an instance in the
     * specified fleet, which activates the server initialization process in
     * your game server. A fleet must be in an ACTIVE state before a game
     * session can be created for it.
     * </p>
     * <p>
     * To create a game session, specify either a fleet ID or an alias ID and
     * indicate the maximum number of players the game session will allow.
     * Optionally, provide a name and a set of properties for your game. If
     * successful, a <a>GameSession</a> object is returned containing session
     * properties, including an IP address. By default, newly created game
     * sessions are set to accept adding any new players to the game session.
     * Use <a>UpdateGameSession</a> to change the creation policy.
     * </p>
     * 
     * @param createGameSessionRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGameSession
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateGameSession
     */
    java.util.concurrent.Future<CreateGameSessionResult> createGameSessionAsync(
            CreateGameSessionRequest createGameSessionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGameSessionRequest, CreateGameSessionResult> asyncHandler);

    /**
     * <p>
     * Adds a player to a game session and creates a player session record. A
     * game session must be in an ACTIVE state, have a creation policy of
     * ALLOW_ALL, and have an open player slot before players can be added to
     * the session.
     * </p>
     * <p>
     * To create a player session, specify a game session ID and player ID. If
     * successful, the player is added to the game session and a new
     * <a>PlayerSession</a> object is returned.
     * </p>
     * 
     * @param createPlayerSessionRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreatePlayerSession
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.CreatePlayerSession
     */
    java.util.concurrent.Future<CreatePlayerSessionResult> createPlayerSessionAsync(
            CreatePlayerSessionRequest createPlayerSessionRequest);

    /**
     * <p>
     * Adds a player to a game session and creates a player session record. A
     * game session must be in an ACTIVE state, have a creation policy of
     * ALLOW_ALL, and have an open player slot before players can be added to
     * the session.
     * </p>
     * <p>
     * To create a player session, specify a game session ID and player ID. If
     * successful, the player is added to the game session and a new
     * <a>PlayerSession</a> object is returned.
     * </p>
     * 
     * @param createPlayerSessionRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlayerSession
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreatePlayerSession
     */
    java.util.concurrent.Future<CreatePlayerSessionResult> createPlayerSessionAsync(
            CreatePlayerSessionRequest createPlayerSessionRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePlayerSessionRequest, CreatePlayerSessionResult> asyncHandler);

    /**
     * <p>
     * Adds a group of players to a game session. Similar to
     * <a>CreatePlayerSession</a>, this action allows you to add multiple
     * players in a single call, which is useful for games that provide party
     * and/or matchmaking features. A game session must be in an ACTIVE state,
     * have a creation policy of ALLOW_ALL, and have an open player slot before
     * players can be added to the session.
     * </p>
     * <p>
     * To create player sessions, specify a game session ID and a list of player
     * IDs. If successful, the players are added to the game session and a set
     * of new <a>PlayerSession</a> objects is returned.
     * </p>
     * 
     * @param createPlayerSessionsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the CreatePlayerSessions
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.CreatePlayerSessions
     */
    java.util.concurrent.Future<CreatePlayerSessionsResult> createPlayerSessionsAsync(
            CreatePlayerSessionsRequest createPlayerSessionsRequest);

    /**
     * <p>
     * Adds a group of players to a game session. Similar to
     * <a>CreatePlayerSession</a>, this action allows you to add multiple
     * players in a single call, which is useful for games that provide party
     * and/or matchmaking features. A game session must be in an ACTIVE state,
     * have a creation policy of ALLOW_ALL, and have an open player slot before
     * players can be added to the session.
     * </p>
     * <p>
     * To create player sessions, specify a game session ID and a list of player
     * IDs. If successful, the players are added to the game session and a set
     * of new <a>PlayerSession</a> objects is returned.
     * </p>
     * 
     * @param createPlayerSessionsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlayerSessions
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreatePlayerSessions
     */
    java.util.concurrent.Future<CreatePlayerSessionsResult> createPlayerSessionsAsync(
            CreatePlayerSessionsRequest createPlayerSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePlayerSessionsRequest, CreatePlayerSessionsResult> asyncHandler);

    /**
     * <p>
     * Deletes an alias. This action removes all record of the alias; game
     * clients attempting to access a game server using the deleted alias will
     * receive an error. To delete an alias, specify the alias ID to be deleted.
     * </p>
     * 
     * @param deleteAliasRequest
     *        Represents the input for a request action.
     * @sample AmazonGameLiftAsync.DeleteAlias
     */
    java.util.concurrent.Future<Void> deleteAliasAsync(
            DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Deletes an alias. This action removes all record of the alias; game
     * clients attempting to access a game server using the deleted alias will
     * receive an error. To delete an alias, specify the alias ID to be deleted.
     * </p>
     * 
     * @param deleteAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonGameLiftAsyncHandler.DeleteAlias
     */
    java.util.concurrent.Future<Void> deleteAliasAsync(
            DeleteAliasRequest deleteAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a build. This action permanently deletes the build record and any
     * uploaded build files.
     * </p>
     * <p>
     * To delete a build, specify the build's ID. Deleting a build does not
     * affect the status of any active fleets, but you can no longer create new
     * fleets for the deleted build.
     * </p>
     * 
     * @param deleteBuildRequest
     *        Represents the input for a request action.
     * @sample AmazonGameLiftAsync.DeleteBuild
     */
    java.util.concurrent.Future<Void> deleteBuildAsync(
            DeleteBuildRequest deleteBuildRequest);

    /**
     * <p>
     * Deletes a build. This action permanently deletes the build record and any
     * uploaded build files.
     * </p>
     * <p>
     * To delete a build, specify the build's ID. Deleting a build does not
     * affect the status of any active fleets, but you can no longer create new
     * fleets for the deleted build.
     * </p>
     * 
     * @param deleteBuildRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonGameLiftAsyncHandler.DeleteBuild
     */
    java.util.concurrent.Future<Void> deleteBuildAsync(
            DeleteBuildRequest deleteBuildRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBuildRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes everything related to a fleet. Before deleting a fleet, you must
     * set the fleet's desired capacity to zero (<a>UpdateFleetCapacity</a>).
     * </p>
     * <p>
     * This action deallocates the fleet's resources and the fleet record. Once
     * a fleet is deleted, you will no longer be able to use a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     *        Represents the input for a request action.
     * @sample AmazonGameLiftAsync.DeleteFleet
     */
    java.util.concurrent.Future<Void> deleteFleetAsync(
            DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes everything related to a fleet. Before deleting a fleet, you must
     * set the fleet's desired capacity to zero (<a>UpdateFleetCapacity</a>).
     * </p>
     * <p>
     * This action deallocates the fleet's resources and the fleet record. Once
     * a fleet is deleted, you will no longer be able to use a fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonGameLiftAsyncHandler.DeleteFleet
     */
    java.util.concurrent.Future<Void> deleteFleetAsync(
            DeleteFleetRequest deleteFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, Void> asyncHandler);

    /**
     * <p>
     * Retrieves properties for a specified alias. To get the alias, specify an
     * alias ID. If successful, an <a>Alias</a> object is returned.
     * </p>
     * 
     * @param describeAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeAlias
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeAlias
     */
    java.util.concurrent.Future<DescribeAliasResult> describeAliasAsync(
            DescribeAliasRequest describeAliasRequest);

    /**
     * <p>
     * Retrieves properties for a specified alias. To get the alias, specify an
     * alias ID. If successful, an <a>Alias</a> object is returned.
     * </p>
     * 
     * @param describeAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlias
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeAlias
     */
    java.util.concurrent.Future<DescribeAliasResult> describeAliasAsync(
            DescribeAliasRequest describeAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAliasRequest, DescribeAliasResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for a build. To get a build record, specify a build
     * ID. If successful, an object containing the build properties is returned.
     * </p>
     * 
     * @param describeBuildRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeBuild
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeBuild
     */
    java.util.concurrent.Future<DescribeBuildResult> describeBuildAsync(
            DescribeBuildRequest describeBuildRequest);

    /**
     * <p>
     * Retrieves properties for a build. To get a build record, specify a build
     * ID. If successful, an object containing the build properties is returned.
     * </p>
     * 
     * @param describeBuildRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBuild
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeBuild
     */
    java.util.concurrent.Future<DescribeBuildResult> describeBuildAsync(
            DescribeBuildRequest describeBuildRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBuildRequest, DescribeBuildResult> asyncHandler);

    /**
     * <p>
     * Retrieves the maximum number of instances by EC2 instance type for an AWS
     * account, and includes the current usage level for the account.
     * </p>
     * 
     * @param describeEC2InstanceLimitsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         DescribeEC2InstanceLimits operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeEC2InstanceLimits
     */
    java.util.concurrent.Future<DescribeEC2InstanceLimitsResult> describeEC2InstanceLimitsAsync(
            DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest);

    /**
     * <p>
     * Retrieves the maximum number of instances by EC2 instance type for an AWS
     * account, and includes the current usage level for the account.
     * </p>
     * 
     * @param describeEC2InstanceLimitsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeEC2InstanceLimits operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeEC2InstanceLimits
     */
    java.util.concurrent.Future<DescribeEC2InstanceLimitsResult> describeEC2InstanceLimitsAsync(
            DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEC2InstanceLimitsRequest, DescribeEC2InstanceLimitsResult> asyncHandler);

    /**
     * <p>
     * Retrieves fleet properties, including metadata, status, and
     * configuration, for one or more fleets. You can request attributes for all
     * fleets, or specify a list of one or more fleet IDs. If successful, a
     * <a>FleetAttributes</a> object is returned for each requested fleet ID.
     * When requesting all fleets, use the pagination parameters to retrieve
     * results as a set of sequential pages. When specifying a list of fleet
     * IDs, an attribute object will only be returned for fleets that currently
     * exist.
     * </p>
     * <note>
     * <p>
     * There may be a maximum number of fleet IDs you can specify in one
     * request. If a request exceeds this maximum, the request will fail and the
     * error message will include the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetAttributesRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         DescribeFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetAttributes
     */
    java.util.concurrent.Future<DescribeFleetAttributesResult> describeFleetAttributesAsync(
            DescribeFleetAttributesRequest describeFleetAttributesRequest);

    /**
     * <p>
     * Retrieves fleet properties, including metadata, status, and
     * configuration, for one or more fleets. You can request attributes for all
     * fleets, or specify a list of one or more fleet IDs. If successful, a
     * <a>FleetAttributes</a> object is returned for each requested fleet ID.
     * When requesting all fleets, use the pagination parameters to retrieve
     * results as a set of sequential pages. When specifying a list of fleet
     * IDs, an attribute object will only be returned for fleets that currently
     * exist.
     * </p>
     * <note>
     * <p>
     * There may be a maximum number of fleet IDs you can specify in one
     * request. If a request exceeds this maximum, the request will fail and the
     * error message will include the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetAttributesRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetAttributes
     */
    java.util.concurrent.Future<DescribeFleetAttributesResult> describeFleetAttributesAsync(
            DescribeFleetAttributesRequest describeFleetAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetAttributesRequest, DescribeFleetAttributesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the current status of fleet capacity for one or more fleets.
     * This information includes the number of instances that have been
     * requested for the fleet and the number currently active. You can request
     * capacity for all fleets, or specify a list of one or more fleet IDs. If
     * successful, an <a>FleetCapacity</a> object is returned for each requested
     * fleet ID. When requesting all fleets, use the pagination parameters to
     * retrieve results as a set of sequential pages. When specifying a list of
     * fleet IDs, an attribute object will only be returned for fleets that
     * currently exist.
     * </p>
     * <note>
     * <p>
     * There may be a maximum number of fleet IDs you can specify in one
     * request. If a request exceeds this maximum, the request will fail and the
     * error message will include the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetCapacityRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeFleetCapacity
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetCapacity
     */
    java.util.concurrent.Future<DescribeFleetCapacityResult> describeFleetCapacityAsync(
            DescribeFleetCapacityRequest describeFleetCapacityRequest);

    /**
     * <p>
     * Retrieves the current status of fleet capacity for one or more fleets.
     * This information includes the number of instances that have been
     * requested for the fleet and the number currently active. You can request
     * capacity for all fleets, or specify a list of one or more fleet IDs. If
     * successful, an <a>FleetCapacity</a> object is returned for each requested
     * fleet ID. When requesting all fleets, use the pagination parameters to
     * retrieve results as a set of sequential pages. When specifying a list of
     * fleet IDs, an attribute object will only be returned for fleets that
     * currently exist.
     * </p>
     * <note>
     * <p>
     * There may be a maximum number of fleet IDs you can specify in one
     * request. If a request exceeds this maximum, the request will fail and the
     * error message will include the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetCapacityRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetCapacity
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetCapacity
     */
    java.util.concurrent.Future<DescribeFleetCapacityResult> describeFleetCapacityAsync(
            DescribeFleetCapacityRequest describeFleetCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetCapacityRequest, DescribeFleetCapacityResult> asyncHandler);

    /**
     * <p>
     * Retrieves entries from the fleet event log. You can specify a time range
     * to limit the result set. This action provides pagination parameters, so
     * you can opt to retrieve results as a set of sequential pages. If
     * successful, a collection of event log entries matching the request are
     * returned.
     * </p>
     * 
     * @param describeFleetEventsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeFleetEvents
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetEvents
     */
    java.util.concurrent.Future<DescribeFleetEventsResult> describeFleetEventsAsync(
            DescribeFleetEventsRequest describeFleetEventsRequest);

    /**
     * <p>
     * Retrieves entries from the fleet event log. You can specify a time range
     * to limit the result set. This action provides pagination parameters, so
     * you can opt to retrieve results as a set of sequential pages. If
     * successful, a collection of event log entries matching the request are
     * returned.
     * </p>
     * 
     * @param describeFleetEventsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetEvents
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetEvents
     */
    java.util.concurrent.Future<DescribeFleetEventsResult> describeFleetEventsAsync(
            DescribeFleetEventsRequest describeFleetEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetEventsRequest, DescribeFleetEventsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the port settings for a fleet. Port settings are used to limit
     * incoming traffic access to game servers in the fleet. To get a fleet's
     * port settings, specify a fleet ID. If successful, an <a>IpPermission</a>
     * object is returned for the requested fleet ID. If the requested fleet has
     * been deleted, the result set will be empty.
     * </p>
     * 
     * @param describeFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         DescribeFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetPortSettings
     */
    java.util.concurrent.Future<DescribeFleetPortSettingsResult> describeFleetPortSettingsAsync(
            DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest);

    /**
     * <p>
     * Retrieves the port settings for a fleet. Port settings are used to limit
     * incoming traffic access to game servers in the fleet. To get a fleet's
     * port settings, specify a fleet ID. If successful, an <a>IpPermission</a>
     * object is returned for the requested fleet ID. If the requested fleet has
     * been deleted, the result set will be empty.
     * </p>
     * 
     * @param describeFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetPortSettings
     */
    java.util.concurrent.Future<DescribeFleetPortSettingsResult> describeFleetPortSettingsAsync(
            DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetPortSettingsRequest, DescribeFleetPortSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves utilization statistics for one or more fleets. You can request
     * utilization data for all fleets, or specify a list of one or more fleet
     * IDs. If successful, a <a>FleetUtilization</a> object is returned for each
     * requested fleet ID. When requesting all fleets, use the pagination
     * parameters to retrieve results as a set of sequential pages. When
     * specifying a list of fleet IDs, a utilization object will only be
     * returned for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * There may be a maximum number of fleet IDs you can specify in one
     * request. If a request exceeds this maximum, the request will fail and the
     * error message will include the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetUtilizationRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         DescribeFleetUtilization operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetUtilization
     */
    java.util.concurrent.Future<DescribeFleetUtilizationResult> describeFleetUtilizationAsync(
            DescribeFleetUtilizationRequest describeFleetUtilizationRequest);

    /**
     * <p>
     * Retrieves utilization statistics for one or more fleets. You can request
     * utilization data for all fleets, or specify a list of one or more fleet
     * IDs. If successful, a <a>FleetUtilization</a> object is returned for each
     * requested fleet ID. When requesting all fleets, use the pagination
     * parameters to retrieve results as a set of sequential pages. When
     * specifying a list of fleet IDs, a utilization object will only be
     * returned for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * There may be a maximum number of fleet IDs you can specify in one
     * request. If a request exceeds this maximum, the request will fail and the
     * error message will include the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetUtilizationRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeFleetUtilization operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetUtilization
     */
    java.util.concurrent.Future<DescribeFleetUtilizationResult> describeFleetUtilizationAsync(
            DescribeFleetUtilizationRequest describeFleetUtilizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetUtilizationRequest, DescribeFleetUtilizationResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for a game session. You can request properties for a
     * single game session or for all sessions currently running on a fleet.
     * </p>
     * <p>
     * To get a game session record, specify a single game session ID.
     * Alternatively, you can retrieve properties for all game sessions on a
     * fleet by providing either a fleet ID or alias ID. You can optionally
     * filter this request by game session status. This action provides
     * pagination parameters, so you can opt to retrieve results in sequential
     * chunks. If successful, a <a>GameSession</a> object is returned for each
     * session matching the request.
     * </p>
     * 
     * @param describeGameSessionsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribeGameSessions
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeGameSessions
     */
    java.util.concurrent.Future<DescribeGameSessionsResult> describeGameSessionsAsync(
            DescribeGameSessionsRequest describeGameSessionsRequest);

    /**
     * <p>
     * Retrieves properties for a game session. You can request properties for a
     * single game session or for all sessions currently running on a fleet.
     * </p>
     * <p>
     * To get a game session record, specify a single game session ID.
     * Alternatively, you can retrieve properties for all game sessions on a
     * fleet by providing either a fleet ID or alias ID. You can optionally
     * filter this request by game session status. This action provides
     * pagination parameters, so you can opt to retrieve results in sequential
     * chunks. If successful, a <a>GameSession</a> object is returned for each
     * session matching the request.
     * </p>
     * 
     * @param describeGameSessionsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGameSessions
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameSessions
     */
    java.util.concurrent.Future<DescribeGameSessionsResult> describeGameSessionsAsync(
            DescribeGameSessionsRequest describeGameSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameSessionsRequest, DescribeGameSessionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for one or more player sessions. This action can be
     * used for several purposes: (1) provide a <i>PlayerSessionId</i> to
     * request properties for a specific player session; (2) provide a
     * <i>GameSessionId</i> to request properties for all player sessions in the
     * specified game session; (3) provide a <i>PlayerId</i> to request
     * properties for all player sessions of a specified player.
     * </p>
     * <p>
     * To get game session record(s), specify only one of the following: a
     * player session ID, a game session ID, or a player ID. You can optionally
     * filter this request by player session status. This action provides
     * pagination parameters, so you can opt to retrieve results as a set of
     * sequential pages. If successful, a <a>PlayerSession</a> object is
     * returned for each session matching the request.
     * </p>
     * 
     * @param describePlayerSessionsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the DescribePlayerSessions
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribePlayerSessions
     */
    java.util.concurrent.Future<DescribePlayerSessionsResult> describePlayerSessionsAsync(
            DescribePlayerSessionsRequest describePlayerSessionsRequest);

    /**
     * <p>
     * Retrieves properties for one or more player sessions. This action can be
     * used for several purposes: (1) provide a <i>PlayerSessionId</i> to
     * request properties for a specific player session; (2) provide a
     * <i>GameSessionId</i> to request properties for all player sessions in the
     * specified game session; (3) provide a <i>PlayerId</i> to request
     * properties for all player sessions of a specified player.
     * </p>
     * <p>
     * To get game session record(s), specify only one of the following: a
     * player session ID, a game session ID, or a player ID. You can optionally
     * filter this request by player session status. This action provides
     * pagination parameters, so you can opt to retrieve results as a set of
     * sequential pages. If successful, a <a>PlayerSession</a> object is
     * returned for each session matching the request.
     * </p>
     * 
     * @param describePlayerSessionsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePlayerSessions
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribePlayerSessions
     */
    java.util.concurrent.Future<DescribePlayerSessionsResult> describePlayerSessionsAsync(
            DescribePlayerSessionsRequest describePlayerSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePlayerSessionsRequest, DescribePlayerSessionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game
     * session. When a game session is terminated, GameLift automatically stores
     * the logs in S3. Use this URL to download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift"
     * >AWS Service Limits</a> page for maximum log file sizes. Log files that
     * exceed this limit will not be saved.
     * </p>
     * </note>
     * 
     * @param getGameSessionLogUrlRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the GetGameSessionLogUrl
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.GetGameSessionLogUrl
     */
    java.util.concurrent.Future<GetGameSessionLogUrlResult> getGameSessionLogUrlAsync(
            GetGameSessionLogUrlRequest getGameSessionLogUrlRequest);

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game
     * session. When a game session is terminated, GameLift automatically stores
     * the logs in S3. Use this URL to download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift"
     * >AWS Service Limits</a> page for maximum log file sizes. Log files that
     * exceed this limit will not be saved.
     * </p>
     * </note>
     * 
     * @param getGameSessionLogUrlRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGameSessionLogUrl
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.GetGameSessionLogUrl
     */
    java.util.concurrent.Future<GetGameSessionLogUrlResult> getGameSessionLogUrlAsync(
            GetGameSessionLogUrlRequest getGameSessionLogUrlRequest,
            com.amazonaws.handlers.AsyncHandler<GetGameSessionLogUrlRequest, GetGameSessionLogUrlResult> asyncHandler);

    /**
     * <p>
     * Retrieves a collection of alias records for this AWS account. You can opt
     * to filter the result set by alias name and/or routing strategy type. This
     * action provides pagination parameters, so you can opt to retrieve results
     * in sequential chunks.
     * </p>
     * <note>
     * <p>
     * Aliases are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listAliasesRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the ListAliases operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.ListAliases
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Retrieves a collection of alias records for this AWS account. You can opt
     * to filter the result set by alias name and/or routing strategy type. This
     * action provides pagination parameters, so you can opt to retrieve results
     * in sequential chunks.
     * </p>
     * <note>
     * <p>
     * Aliases are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listAliasesRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAliases operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListAliases
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            ListAliasesRequest listAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * <p>
     * Retrieves build records all builds associated with an AWS account. You
     * can filter the result set by build status. This action provides
     * pagination parameters, so you can opt to retrieve the results in a set of
     * sequential pages.
     * </p>
     * <note>
     * <p>
     * Build records are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listBuildsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the ListBuilds operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.ListBuilds
     */
    java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(
            ListBuildsRequest listBuildsRequest);

    /**
     * <p>
     * Retrieves build records all builds associated with an AWS account. You
     * can filter the result set by build status. This action provides
     * pagination parameters, so you can opt to retrieve the results in a set of
     * sequential pages.
     * </p>
     * <note>
     * <p>
     * Build records are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listBuildsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBuilds operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListBuilds
     */
    java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(
            ListBuildsRequest listBuildsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBuildsRequest, ListBuildsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a collection of fleet records for this AWS account. You can opt
     * to filter the result set by build ID. This action provides pagination
     * parameters, so you can opt to retrieve results in sequential chunks.
     * </p>
     * <note>
     * <p>
     * Fleet records are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listFleetsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the ListFleets operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.ListFleets
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(
            ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * Retrieves a collection of fleet records for this AWS account. You can opt
     * to filter the result set by build ID. This action provides pagination
     * parameters, so you can opt to retrieve results in sequential chunks.
     * </p>
     * <note>
     * <p>
     * Fleet records are not listed in any particular order.
     * </p>
     * </note>
     * 
     * @param listFleetsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFleets operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListFleets
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(
            ListFleetsRequest listFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler);

    /**
     * <note>
     * <p>
     * Call this action only if you need credentials for a build created with
     * <a>CreateBuild</a>. This is a rare situation; in most cases, builds are
     * created using the CLI command <code>upload-build</code>, which creates a
     * build record and also uploads build files.
     * </p>
     * </note>
     * <p>
     * Retrieves a fresh set of upload credentials and the assigned S3 storage
     * location for a specific build. Valid credentials are required to upload
     * your game build files to S3. These credentials are returned when you
     * create the build, but they have a limited lifespan. You can get fresh
     * credentials and use them to re-upload game files as until the build state
     * moves to READY. After this point, you'll need to create a brand new
     * build.
     * </p>
     * 
     * @param requestUploadCredentialsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         RequestUploadCredentials operation returned by the service.
     * @sample AmazonGameLiftAsync.RequestUploadCredentials
     */
    java.util.concurrent.Future<RequestUploadCredentialsResult> requestUploadCredentialsAsync(
            RequestUploadCredentialsRequest requestUploadCredentialsRequest);

    /**
     * <note>
     * <p>
     * Call this action only if you need credentials for a build created with
     * <a>CreateBuild</a>. This is a rare situation; in most cases, builds are
     * created using the CLI command <code>upload-build</code>, which creates a
     * build record and also uploads build files.
     * </p>
     * </note>
     * <p>
     * Retrieves a fresh set of upload credentials and the assigned S3 storage
     * location for a specific build. Valid credentials are required to upload
     * your game build files to S3. These credentials are returned when you
     * create the build, but they have a limited lifespan. You can get fresh
     * credentials and use them to re-upload game files as until the build state
     * moves to READY. After this point, you'll need to create a brand new
     * build.
     * </p>
     * 
     * @param requestUploadCredentialsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         RequestUploadCredentials operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.RequestUploadCredentials
     */
    java.util.concurrent.Future<RequestUploadCredentialsResult> requestUploadCredentialsAsync(
            RequestUploadCredentialsRequest requestUploadCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<RequestUploadCredentialsRequest, RequestUploadCredentialsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the fleet ID that a specified alias is currently pointing to.
     * </p>
     * 
     * @param resolveAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the ResolveAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.ResolveAlias
     */
    java.util.concurrent.Future<ResolveAliasResult> resolveAliasAsync(
            ResolveAliasRequest resolveAliasRequest);

    /**
     * <p>
     * Retrieves the fleet ID that a specified alias is currently pointing to.
     * </p>
     * 
     * @param resolveAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResolveAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ResolveAlias
     */
    java.util.concurrent.Future<ResolveAliasResult> resolveAliasAsync(
            ResolveAliasRequest resolveAliasRequest,
            com.amazonaws.handlers.AsyncHandler<ResolveAliasRequest, ResolveAliasResult> asyncHandler);

    /**
     * <p>
     * Updates properties for an alias. To update properties, specify the alias
     * ID to be updated and provide the information to be changed. To reassign
     * an alias to another fleet, provide an updated routing strategy. If
     * successful, the updated alias record is returned.
     * </p>
     * 
     * @param updateAliasRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.UpdateAlias
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(
            UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Updates properties for an alias. To update properties, specify the alias
     * ID to be updated and provide the information to be changed. To reassign
     * an alias to another fleet, provide an updated routing strategy. If
     * successful, the updated alias record is returned.
     * </p>
     * 
     * @param updateAliasRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAlias operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateAlias
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(
            UpdateAliasRequest updateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler);

    /**
     * <p>
     * Updates metadata in a build record, including the build name and version.
     * To update the metadata, specify the build ID to update and provide the
     * new values. If successful, a build object containing the updated metadata
     * is returned.
     * </p>
     * 
     * @param updateBuildRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateBuild operation
     *         returned by the service.
     * @sample AmazonGameLiftAsync.UpdateBuild
     */
    java.util.concurrent.Future<UpdateBuildResult> updateBuildAsync(
            UpdateBuildRequest updateBuildRequest);

    /**
     * <p>
     * Updates metadata in a build record, including the build name and version.
     * To update the metadata, specify the build ID to update and provide the
     * new values. If successful, a build object containing the updated metadata
     * is returned.
     * </p>
     * 
     * @param updateBuildRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBuild operation
     *         returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateBuild
     */
    java.util.concurrent.Future<UpdateBuildResult> updateBuildAsync(
            UpdateBuildRequest updateBuildRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBuildRequest, UpdateBuildResult> asyncHandler);

    /**
     * <p>
     * Updates fleet properties, including name and description, for a fleet. To
     * update metadata, specify the fleet ID and the property values you want to
     * change. If successful, the fleet ID for the updated fleet is returned.
     * </p>
     * 
     * @param updateFleetAttributesRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateFleetAttributes
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetAttributes
     */
    java.util.concurrent.Future<UpdateFleetAttributesResult> updateFleetAttributesAsync(
            UpdateFleetAttributesRequest updateFleetAttributesRequest);

    /**
     * <p>
     * Updates fleet properties, including name and description, for a fleet. To
     * update metadata, specify the fleet ID and the property values you want to
     * change. If successful, the fleet ID for the updated fleet is returned.
     * </p>
     * 
     * @param updateFleetAttributesRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleetAttributes
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateFleetAttributes
     */
    java.util.concurrent.Future<UpdateFleetAttributesResult> updateFleetAttributesAsync(
            UpdateFleetAttributesRequest updateFleetAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetAttributesRequest, UpdateFleetAttributesResult> asyncHandler);

    /**
     * <p>
     * Updates capacity settings for a fleet. Use this action to specify the
     * number of EC2 instances (hosts) you want this fleet to contain. Before
     * calling this action, you may want to call
     * <a>DescribeEC2InstanceLimits</a> to get the maximum capacity based on the
     * fleet's EC2 instance type.
     * </p>
     * <p>
     * To update fleet capacity, specify the fleet ID and the desired number of
     * instances. If successful, GameLift will spin up or terminate instances so
     * that the fleet's active instance count matches the desired instance
     * count. You can view a fleet's current capacity information by calling
     * <a>DescribeFleetCapacity</a>. If the desired instance count is higher
     * than the instance type's limit, the call will throw "Limit Exceeded"
     * exception.
     * </p>
     * 
     * @param updateFleetCapacityRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateFleetCapacity
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetCapacity
     */
    java.util.concurrent.Future<UpdateFleetCapacityResult> updateFleetCapacityAsync(
            UpdateFleetCapacityRequest updateFleetCapacityRequest);

    /**
     * <p>
     * Updates capacity settings for a fleet. Use this action to specify the
     * number of EC2 instances (hosts) you want this fleet to contain. Before
     * calling this action, you may want to call
     * <a>DescribeEC2InstanceLimits</a> to get the maximum capacity based on the
     * fleet's EC2 instance type.
     * </p>
     * <p>
     * To update fleet capacity, specify the fleet ID and the desired number of
     * instances. If successful, GameLift will spin up or terminate instances so
     * that the fleet's active instance count matches the desired instance
     * count. You can view a fleet's current capacity information by calling
     * <a>DescribeFleetCapacity</a>. If the desired instance count is higher
     * than the instance type's limit, the call will throw "Limit Exceeded"
     * exception.
     * </p>
     * 
     * @param updateFleetCapacityRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleetCapacity
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateFleetCapacity
     */
    java.util.concurrent.Future<UpdateFleetCapacityResult> updateFleetCapacityAsync(
            UpdateFleetCapacityRequest updateFleetCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetCapacityRequest, UpdateFleetCapacityResult> asyncHandler);

    /**
     * <p>
     * Updates port settings for a fleet. To update settings, specify the fleet
     * ID to be updated and list the permissions you want to update. List the
     * permissions you want to add in <i>InboundPermissionAuthorizations</i>,
     * and permissions you want to remove in
     * <i>InboundPermissionRevocations</i>. Permissions to be removed must match
     * existing fleet permissions. If successful, the fleet ID for the updated
     * fleet is returned.
     * </p>
     * 
     * @param updateFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the
     *         UpdateFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetPortSettings
     */
    java.util.concurrent.Future<UpdateFleetPortSettingsResult> updateFleetPortSettingsAsync(
            UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest);

    /**
     * <p>
     * Updates port settings for a fleet. To update settings, specify the fleet
     * ID to be updated and list the permissions you want to update. List the
     * permissions you want to add in <i>InboundPermissionAuthorizations</i>,
     * and permissions you want to remove in
     * <i>InboundPermissionRevocations</i>. Permissions to be removed must match
     * existing fleet permissions. If successful, the fleet ID for the updated
     * fleet is returned.
     * </p>
     * 
     * @param updateFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UpdateFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateFleetPortSettings
     */
    java.util.concurrent.Future<UpdateFleetPortSettingsResult> updateFleetPortSettingsAsync(
            UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetPortSettingsRequest, UpdateFleetPortSettingsResult> asyncHandler);

    /**
     * <p>
     * Updates game session properties. This includes the session name, maximum
     * player count and the player session creation policy, which either allows
     * or denies new players from joining the session. To update a game session,
     * specify the game session ID and the values you want to change. If
     * successful, an updated <a>GameSession</a> object is returned.
     * </p>
     * 
     * @param updateGameSessionRequest
     *        Represents the input for a request action.
     * @return A Java Future containing the result of the UpdateGameSession
     *         operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateGameSession
     */
    java.util.concurrent.Future<UpdateGameSessionResult> updateGameSessionAsync(
            UpdateGameSessionRequest updateGameSessionRequest);

    /**
     * <p>
     * Updates game session properties. This includes the session name, maximum
     * player count and the player session creation policy, which either allows
     * or denies new players from joining the session. To update a game session,
     * specify the game session ID and the values you want to change. If
     * successful, an updated <a>GameSession</a> object is returned.
     * </p>
     * 
     * @param updateGameSessionRequest
     *        Represents the input for a request action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGameSession
     *         operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateGameSession
     */
    java.util.concurrent.Future<UpdateGameSessionResult> updateGameSessionAsync(
            UpdateGameSessionRequest updateGameSessionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGameSessionRequest, UpdateGameSessionResult> asyncHandler);

}
