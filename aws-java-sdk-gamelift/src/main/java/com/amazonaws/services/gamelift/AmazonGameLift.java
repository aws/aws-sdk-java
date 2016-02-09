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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.gamelift.model.*;

/**
 * Interface for accessing Amazon GameLift.
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
public interface AmazonGameLift {

    /**
     * Overrides the default endpoint for this client
     * ("https://gamelift.us-east-1.amazonaws.com"). Callers can use this method
     * to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "gamelift.us-east-1.amazonaws.com") or a full URL, including the protocol
     * (ex: "https://gamelift.us-east-1.amazonaws.com"). If the protocol is not
     * specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "gamelift.us-east-1.amazonaws.com") or a full
     *        URL, including the protocol (ex:
     *        "https://gamelift.us-east-1.amazonaws.com") of the region specific
     *        AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonGameLift#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
     * @return Result of the CreateAlias operation returned by the service.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws ConflictException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a service resource
     *         associated with the request. Requests that result in failures of
     *         this type should not be retried by clients without resolving the
     *         conflict.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws LimitExceededException
     *         Exception is thrown when performing the requested operation would
     *         cause the resource to exceed the allowed service limit. Requests
     *         that result in failures of this type should be first resolved by
     *         the client before retrying.
     * @sample AmazonGameLift.CreateAlias
     */
    CreateAliasResult createAlias(CreateAliasRequest createAliasRequest);

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
     * @return Result of the CreateBuild operation returned by the service.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws ConflictException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a service resource
     *         associated with the request. Requests that result in failures of
     *         this type should not be retried by clients without resolving the
     *         conflict.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @sample AmazonGameLift.CreateBuild
     */
    CreateBuildResult createBuild(CreateBuildRequest createBuildRequest);

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
     * @return Result of the CreateFleet operation returned by the service.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws ConflictException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a service resource
     *         associated with the request. Requests that result in failures of
     *         this type should not be retried by clients without resolving the
     *         conflict.
     * @throws LimitExceededException
     *         Exception is thrown when performing the requested operation would
     *         cause the resource to exceed the allowed service limit. Requests
     *         that result in failures of this type should be first resolved by
     *         the client before retrying.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @sample AmazonGameLift.CreateFleet
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest);

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
     * @return Result of the CreateGameSession operation returned by the
     *         service.
     * @throws ConflictException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a service resource
     *         associated with the request. Requests that result in failures of
     *         this type should not be retried by clients without resolving the
     *         conflict.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws AccessDeniedException
     *         Exception thrown when the client does not have permission to
     *         access the specified resource. Requests that result in failures
     *         of this type should not be retried by clients.
     * @throws InvalidFleetStatusException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a resource associated
     *         with the request and/or the fleet. Requests that result in
     *         failures of this type should not be retried by clients without
     *         resolving the conflict.
     * @throws TerminalRoutingStrategyException
     *         Exception thrown when the service is unable to resolve the
     *         routing for a particular alias because it has a
     *         TerminalRoutingStrategy associated with it. Requests that result
     *         in failures of this type should only be retried by clients if
     *         they modify the routing strategy for the specified alias. The
     *         message returned in this exception is the message defined in the
     *         TerminalRoutingStrategy itself.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws FleetCapacityExceededException
     *         Exception thrown when the specified fleet has no available
     *         instances to fulfill a request to create a new game session.
     *         Requests that result in failures of this type should only be
     *         retried once the fleet capacity has been increased.
     * @sample AmazonGameLift.CreateGameSession
     */
    CreateGameSessionResult createGameSession(
            CreateGameSessionRequest createGameSessionRequest);

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
     * @return Result of the CreatePlayerSession operation returned by the
     *         service.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws AccessDeniedException
     *         Exception thrown when the client does not have permission to
     *         access the specified resource. Requests that result in failures
     *         of this type should not be retried by clients.
     * @throws InvalidGameSessionStatusException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a resource associated
     *         with the request and/or the game instance. Requests that result
     *         in failures of this type should not be retried by clients without
     *         resolving the conflict.
     * @throws GameSessionFullException
     *         Exception thrown in response to a <a>CreatePlayerSession</a>
     *         request. This exception indicates that the game instance is
     *         currently full and cannot allow the requested player(s) to join.
     * @throws TerminalRoutingStrategyException
     *         Exception thrown when the service is unable to resolve the
     *         routing for a particular alias because it has a
     *         TerminalRoutingStrategy associated with it. Requests that result
     *         in failures of this type should only be retried by clients if
     *         they modify the routing strategy for the specified alias. The
     *         message returned in this exception is the message defined in the
     *         TerminalRoutingStrategy itself.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @sample AmazonGameLift.CreatePlayerSession
     */
    CreatePlayerSessionResult createPlayerSession(
            CreatePlayerSessionRequest createPlayerSessionRequest);

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
     * @return Result of the CreatePlayerSessions operation returned by the
     *         service.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws AccessDeniedException
     *         Exception thrown when the client does not have permission to
     *         access the specified resource. Requests that result in failures
     *         of this type should not be retried by clients.
     * @throws InvalidGameSessionStatusException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a resource associated
     *         with the request and/or the game instance. Requests that result
     *         in failures of this type should not be retried by clients without
     *         resolving the conflict.
     * @throws GameSessionFullException
     *         Exception thrown in response to a <a>CreatePlayerSession</a>
     *         request. This exception indicates that the game instance is
     *         currently full and cannot allow the requested player(s) to join.
     * @throws TerminalRoutingStrategyException
     *         Exception thrown when the service is unable to resolve the
     *         routing for a particular alias because it has a
     *         TerminalRoutingStrategy associated with it. Requests that result
     *         in failures of this type should only be retried by clients if
     *         they modify the routing strategy for the specified alias. The
     *         message returned in this exception is the message defined in the
     *         TerminalRoutingStrategy itself.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @sample AmazonGameLift.CreatePlayerSessions
     */
    CreatePlayerSessionsResult createPlayerSessions(
            CreatePlayerSessionsRequest createPlayerSessionsRequest);

    /**
     * <p>
     * Deletes an alias. This action removes all record of the alias; game
     * clients attempting to access a game server using the deleted alias will
     * receive an error. To delete an alias, specify the alias ID to be deleted.
     * </p>
     * 
     * @param deleteAliasRequest
     *        Represents the input for a request action.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @sample AmazonGameLift.DeleteAlias
     */
    void deleteAlias(DeleteAliasRequest deleteAliasRequest);

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
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @sample AmazonGameLift.DeleteBuild
     */
    void deleteBuild(DeleteBuildRequest deleteBuildRequest);

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
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws InvalidFleetStatusException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a resource associated
     *         with the request and/or the fleet. Requests that result in
     *         failures of this type should not be retried by clients without
     *         resolving the conflict.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws InvalidFleetStatusException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a resource associated
     *         with the request and/or the fleet. Requests that result in
     *         failures of this type should not be retried by clients without
     *         resolving the conflict.
     * @sample AmazonGameLift.DeleteFleet
     */
    void deleteFleet(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Retrieves properties for a specified alias. To get the alias, specify an
     * alias ID. If successful, an <a>Alias</a> object is returned.
     * </p>
     * 
     * @param describeAliasRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeAlias operation returned by the service.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @sample AmazonGameLift.DescribeAlias
     */
    DescribeAliasResult describeAlias(DescribeAliasRequest describeAliasRequest);

    /**
     * <p>
     * Retrieves properties for a build. To get a build record, specify a build
     * ID. If successful, an object containing the build properties is returned.
     * </p>
     * 
     * @param describeBuildRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeBuild operation returned by the service.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @sample AmazonGameLift.DescribeBuild
     */
    DescribeBuildResult describeBuild(DescribeBuildRequest describeBuildRequest);

    /**
     * <p>
     * Retrieves the maximum number of instances by EC2 instance type for an AWS
     * account, and includes the current usage level for the account.
     * </p>
     * 
     * @param describeEC2InstanceLimitsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeEC2InstanceLimits operation returned by the
     *         service.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @sample AmazonGameLift.DescribeEC2InstanceLimits
     */
    DescribeEC2InstanceLimitsResult describeEC2InstanceLimits(
            DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest);

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
     * @return Result of the DescribeFleetAttributes operation returned by the
     *         service.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @sample AmazonGameLift.DescribeFleetAttributes
     */
    DescribeFleetAttributesResult describeFleetAttributes(
            DescribeFleetAttributesRequest describeFleetAttributesRequest);

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
     * @return Result of the DescribeFleetCapacity operation returned by the
     *         service.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @sample AmazonGameLift.DescribeFleetCapacity
     */
    DescribeFleetCapacityResult describeFleetCapacity(
            DescribeFleetCapacityRequest describeFleetCapacityRequest);

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
     * @return Result of the DescribeFleetEvents operation returned by the
     *         service.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @sample AmazonGameLift.DescribeFleetEvents
     */
    DescribeFleetEventsResult describeFleetEvents(
            DescribeFleetEventsRequest describeFleetEventsRequest);

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
     * @return Result of the DescribeFleetPortSettings operation returned by the
     *         service.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @sample AmazonGameLift.DescribeFleetPortSettings
     */
    DescribeFleetPortSettingsResult describeFleetPortSettings(
            DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest);

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
     * @return Result of the DescribeFleetUtilization operation returned by the
     *         service.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @sample AmazonGameLift.DescribeFleetUtilization
     */
    DescribeFleetUtilizationResult describeFleetUtilization(
            DescribeFleetUtilizationRequest describeFleetUtilizationRequest);

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
     * @return Result of the DescribeGameSessions operation returned by the
     *         service.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws AccessDeniedException
     *         Exception thrown when the client does not have permission to
     *         access the specified resource. Requests that result in failures
     *         of this type should not be retried by clients.
     * @throws TerminalRoutingStrategyException
     *         Exception thrown when the service is unable to resolve the
     *         routing for a particular alias because it has a
     *         TerminalRoutingStrategy associated with it. Requests that result
     *         in failures of this type should only be retried by clients if
     *         they modify the routing strategy for the specified alias. The
     *         message returned in this exception is the message defined in the
     *         TerminalRoutingStrategy itself.
     * @sample AmazonGameLift.DescribeGameSessions
     */
    DescribeGameSessionsResult describeGameSessions(
            DescribeGameSessionsRequest describeGameSessionsRequest);

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
     * @return Result of the DescribePlayerSessions operation returned by the
     *         service.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @sample AmazonGameLift.DescribePlayerSessions
     */
    DescribePlayerSessionsResult describePlayerSessions(
            DescribePlayerSessionsRequest describePlayerSessionsRequest);

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
     * @return Result of the GetGameSessionLogUrl operation returned by the
     *         service.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @sample AmazonGameLift.GetGameSessionLogUrl
     */
    GetGameSessionLogUrlResult getGameSessionLogUrl(
            GetGameSessionLogUrlRequest getGameSessionLogUrlRequest);

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
     * @return Result of the ListAliases operation returned by the service.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @sample AmazonGameLift.ListAliases
     */
    ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest);

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
     * @return Result of the ListBuilds operation returned by the service.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @sample AmazonGameLift.ListBuilds
     */
    ListBuildsResult listBuilds(ListBuildsRequest listBuildsRequest);

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
     * @return Result of the ListFleets operation returned by the service.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @sample AmazonGameLift.ListFleets
     */
    ListFleetsResult listFleets(ListFleetsRequest listFleetsRequest);

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
     * @return Result of the RequestUploadCredentials operation returned by the
     *         service.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @sample AmazonGameLift.RequestUploadCredentials
     */
    RequestUploadCredentialsResult requestUploadCredentials(
            RequestUploadCredentialsRequest requestUploadCredentialsRequest);

    /**
     * <p>
     * Retrieves the fleet ID that a specified alias is currently pointing to.
     * </p>
     * 
     * @param resolveAliasRequest
     *        Represents the input for a request action.
     * @return Result of the ResolveAlias operation returned by the service.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws TerminalRoutingStrategyException
     *         Exception thrown when the service is unable to resolve the
     *         routing for a particular alias because it has a
     *         TerminalRoutingStrategy associated with it. Requests that result
     *         in failures of this type should only be retried by clients if
     *         they modify the routing strategy for the specified alias. The
     *         message returned in this exception is the message defined in the
     *         TerminalRoutingStrategy itself.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @sample AmazonGameLift.ResolveAlias
     */
    ResolveAliasResult resolveAlias(ResolveAliasRequest resolveAliasRequest);

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
     * @return Result of the UpdateAlias operation returned by the service.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @sample AmazonGameLift.UpdateAlias
     */
    UpdateAliasResult updateAlias(UpdateAliasRequest updateAliasRequest);

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
     * @return Result of the UpdateBuild operation returned by the service.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @sample AmazonGameLift.UpdateBuild
     */
    UpdateBuildResult updateBuild(UpdateBuildRequest updateBuildRequest);

    /**
     * <p>
     * Updates fleet properties, including name and description, for a fleet. To
     * update metadata, specify the fleet ID and the property values you want to
     * change. If successful, the fleet ID for the updated fleet is returned.
     * </p>
     * 
     * @param updateFleetAttributesRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateFleetAttributes operation returned by the
     *         service.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws ConflictException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a service resource
     *         associated with the request. Requests that result in failures of
     *         this type should not be retried by clients without resolving the
     *         conflict.
     * @throws InvalidFleetStatusException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a resource associated
     *         with the request and/or the fleet. Requests that result in
     *         failures of this type should not be retried by clients without
     *         resolving the conflict.
     * @throws LimitExceededException
     *         Exception is thrown when performing the requested operation would
     *         cause the resource to exceed the allowed service limit. Requests
     *         that result in failures of this type should be first resolved by
     *         the client before retrying.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @sample AmazonGameLift.UpdateFleetAttributes
     */
    UpdateFleetAttributesResult updateFleetAttributes(
            UpdateFleetAttributesRequest updateFleetAttributesRequest);

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
     * @return Result of the UpdateFleetCapacity operation returned by the
     *         service.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws ConflictException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a service resource
     *         associated with the request. Requests that result in failures of
     *         this type should not be retried by clients without resolving the
     *         conflict.
     * @throws LimitExceededException
     *         Exception is thrown when performing the requested operation would
     *         cause the resource to exceed the allowed service limit. Requests
     *         that result in failures of this type should be first resolved by
     *         the client before retrying.
     * @throws InvalidFleetStatusException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a resource associated
     *         with the request and/or the fleet. Requests that result in
     *         failures of this type should not be retried by clients without
     *         resolving the conflict.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @sample AmazonGameLift.UpdateFleetCapacity
     */
    UpdateFleetCapacityResult updateFleetCapacity(
            UpdateFleetCapacityRequest updateFleetCapacityRequest);

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
     * @return Result of the UpdateFleetPortSettings operation returned by the
     *         service.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws ConflictException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a service resource
     *         associated with the request. Requests that result in failures of
     *         this type should not be retried by clients without resolving the
     *         conflict.
     * @throws InvalidFleetStatusException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a resource associated
     *         with the request and/or the fleet. Requests that result in
     *         failures of this type should not be retried by clients without
     *         resolving the conflict.
     * @throws LimitExceededException
     *         Exception is thrown when performing the requested operation would
     *         cause the resource to exceed the allowed service limit. Requests
     *         that result in failures of this type should be first resolved by
     *         the client before retrying.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @sample AmazonGameLift.UpdateFleetPortSettings
     */
    UpdateFleetPortSettingsResult updateFleetPortSettings(
            UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest);

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
     * @return Result of the UpdateGameSession operation returned by the
     *         service.
     * @throws NotFoundException
     *         Exception thrown when a service resource associated with the
     *         request could not be found. Requests that result in failures of
     *         this type should not be retried by clients.
     * @throws ConflictException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a service resource
     *         associated with the request. Requests that result in failures of
     *         this type should not be retried by clients without resolving the
     *         conflict.
     * @throws InternalServiceException
     *         Exception thrown when the service encounters an unrecoverable
     *         internal failure while processing the request. Requests that
     *         result in failures of this type can be retried by clients, either
     *         immediately or after a back-off period.
     * @throws UnauthorizedException
     *         Exception thrown when the client fails authentication. Requests
     *         that result in failures of this type should not be retried by
     *         clients without correctly authenticating.
     * @throws InvalidGameSessionStatusException
     *         Exception thrown when performing the requested operation would
     *         cause a conflict with the current state of a resource associated
     *         with the request and/or the game instance. Requests that result
     *         in failures of this type should not be retried by clients without
     *         resolving the conflict.
     * @throws InvalidRequestException
     *         Exception thrown when one or more parameters specified as part of
     *         the request are invalid. Requests that result in failures of this
     *         type should not be retried by clients without correcting the
     *         invalid parameters.
     * @sample AmazonGameLift.UpdateGameSession
     */
    UpdateGameSessionResult updateGameSession(
            UpdateGameSessionRequest updateGameSessionRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
