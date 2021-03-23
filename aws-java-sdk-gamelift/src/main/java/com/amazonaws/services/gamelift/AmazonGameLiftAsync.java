/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gamelift;

import javax.annotation.Generated;

import com.amazonaws.services.gamelift.model.*;

/**
 * Interface for accessing Amazon GameLift asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.gamelift.AbstractAmazonGameLiftAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon GameLift Service</fullname>
 * <p>
 * GameLift provides solutions for hosting session-based multiplayer game servers in the cloud, including tools for
 * deploying, operating, and scaling game servers. Built on AWS global computing infrastructure, GameLift helps you
 * deliver high-performance, high-reliability, low-cost game servers while dynamically scaling your resource usage to
 * meet player demand.
 * </p>
 * <p>
 * <b>About GameLift solutions</b>
 * </p>
 * <p>
 * Get more information on these GameLift solutions in the <a
 * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/">GameLift Developer Guide</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * GameLift managed hosting -- GameLift offers a fully managed service to set up and maintain computing machines for
 * hosting, manage game session and player session life cycle, and handle security, storage, and performance tracking.
 * You can use automatic scaling tools to balance player demand and hosting costs, configure your game session
 * management to minimize player latency, and add FlexMatch for matchmaking.
 * </p>
 * </li>
 * <li>
 * <p>
 * Managed hosting with Realtime Servers -- With GameLift Realtime Servers, you can quickly configure and set up
 * ready-to-go game servers for your game. Realtime Servers provides a game server framework with core GameLift
 * infrastructure already built in. Then use the full range of GameLift managed hosting features, including FlexMatch,
 * for your game.
 * </p>
 * </li>
 * <li>
 * <p>
 * GameLift FleetIQ -- Use GameLift FleetIQ as a standalone service while hosting your games using EC2 instances and
 * Auto Scaling groups. GameLift FleetIQ provides optimizations for game hosting, including boosting the viability of
 * low-cost Spot Instances gaming. For a complete solution, pair the GameLift FleetIQ and FlexMatch standalone services.
 * </p>
 * </li>
 * <li>
 * <p>
 * GameLift FlexMatch -- Add matchmaking to your game hosting solution. FlexMatch is a customizable matchmaking service
 * for multiplayer games. Use FlexMatch as integrated with GameLift managed hosting or incorporate FlexMatch as a
 * standalone service into your own hosting solution.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>About this API Reference</b>
 * </p>
 * <p>
 * This reference guide describes the low-level service API for Amazon GameLift. With each topic in this guide, you can
 * find links to language-specific SDK guides and the AWS CLI reference. Useful links:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html">GameLift API operations
 * listed by tasks</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-components.html"> GameLift tools and
 * resources</a>
 * </p>
 * </li>
 * </ul>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonGameLiftAsync extends AmazonGameLift {

    /**
     * <p>
     * Registers a player's acceptance or rejection of a proposed FlexMatch match. A matchmaking configuration may
     * require player acceptance; if so, then matches built with that configuration cannot be completed unless all
     * players accept the proposed match within a specified time limit.
     * </p>
     * <p>
     * When FlexMatch builds a match, all the matchmaking tickets involved in the proposed match are placed into status
     * <code>REQUIRES_ACCEPTANCE</code>. This is a trigger for your game to get acceptance from all players in the
     * ticket. Acceptances are only valid for tickets when they are in this status; all other acceptances result in an
     * error.
     * </p>
     * <p>
     * To register acceptance, specify the ticket ID, a response, and one or more players. Once all players have
     * registered acceptance, the matchmaking tickets advance to status <code>PLACING</code>, where a new game session
     * is created for the match.
     * </p>
     * <p>
     * If any player rejects the match, or if acceptances are not received before a specified timeout, the proposed
     * match is dropped. The matchmaking tickets are then handled in one of two ways: For tickets where one or more
     * players rejected the match, the ticket status is returned to <code>SEARCHING</code> to find a new match. For
     * tickets where one or more players failed to respond, the ticket status is set to <code>CANCELLED</code>, and
     * processing is terminated. A new matchmaking request for these players can be submitted as needed.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-client.html"> Add FlexMatch to a game
     * client</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-events.html"> FlexMatch events</a>
     * (reference)
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>StartMatchmaking</a> | <a>DescribeMatchmaking</a> | <a>StopMatchmaking</a> | <a>AcceptMatch</a> |
     * <a>StartMatchBackfill</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param acceptMatchRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the AcceptMatch operation returned by the service.
     * @sample AmazonGameLiftAsync.AcceptMatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/AcceptMatch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptMatchResult> acceptMatchAsync(AcceptMatchRequest acceptMatchRequest);

    /**
     * <p>
     * Registers a player's acceptance or rejection of a proposed FlexMatch match. A matchmaking configuration may
     * require player acceptance; if so, then matches built with that configuration cannot be completed unless all
     * players accept the proposed match within a specified time limit.
     * </p>
     * <p>
     * When FlexMatch builds a match, all the matchmaking tickets involved in the proposed match are placed into status
     * <code>REQUIRES_ACCEPTANCE</code>. This is a trigger for your game to get acceptance from all players in the
     * ticket. Acceptances are only valid for tickets when they are in this status; all other acceptances result in an
     * error.
     * </p>
     * <p>
     * To register acceptance, specify the ticket ID, a response, and one or more players. Once all players have
     * registered acceptance, the matchmaking tickets advance to status <code>PLACING</code>, where a new game session
     * is created for the match.
     * </p>
     * <p>
     * If any player rejects the match, or if acceptances are not received before a specified timeout, the proposed
     * match is dropped. The matchmaking tickets are then handled in one of two ways: For tickets where one or more
     * players rejected the match, the ticket status is returned to <code>SEARCHING</code> to find a new match. For
     * tickets where one or more players failed to respond, the ticket status is set to <code>CANCELLED</code>, and
     * processing is terminated. A new matchmaking request for these players can be submitted as needed.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-client.html"> Add FlexMatch to a game
     * client</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-events.html"> FlexMatch events</a>
     * (reference)
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>StartMatchmaking</a> | <a>DescribeMatchmaking</a> | <a>StopMatchmaking</a> | <a>AcceptMatch</a> |
     * <a>StartMatchBackfill</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param acceptMatchRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AcceptMatch operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.AcceptMatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/AcceptMatch" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<AcceptMatchResult> acceptMatchAsync(AcceptMatchRequest acceptMatchRequest,
            com.amazonaws.handlers.AsyncHandler<AcceptMatchRequest, AcceptMatchResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Locates an available game server and temporarily reserves it to host gameplay and players. This operation is
     * called from a game client or client service (such as a matchmaker) to request hosting resources for a new game
     * session. In response, GameLift FleetIQ locates an available game server, places it in <code>CLAIMED</code> status
     * for 60 seconds, and returns connection information that players can use to connect to the game server.
     * </p>
     * <p>
     * To claim a game server, identify a game server group. You can also specify a game server ID, although this
     * approach bypasses GameLift FleetIQ placement optimization. Optionally, include game data to pass to the game
     * server at the start of a game session, such as a game map or player information.
     * </p>
     * <p>
     * When a game server is successfully claimed, connection information is returned. A claimed game server's
     * utilization status remains <code>AVAILABLE</code> while the claim status is set to <code>CLAIMED</code> for up to
     * 60 seconds. This time period gives the game server time to update its status to <code>UTILIZED</code> (using
     * <a>UpdateGameServer</a>) once players join. If the game server's status is not updated within 60 seconds, the
     * game server reverts to unclaimed status and is available to be claimed by another request. The claim time period
     * is a fixed value and is not configurable.
     * </p>
     * <p>
     * If you try to claim a specific game server, this request will fail in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the game server utilization status is <code>UTILIZED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the game server claim status is <code>CLAIMED</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * When claiming a specific game server, this request will succeed even if the game server is running on an instance
     * in <code>DRAINING</code> status. To avoid this, first check the instance status by calling
     * <a>DescribeGameServerInstances</a>.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>RegisterGameServer</a> | <a>ListGameServers</a> | <a>ClaimGameServer</a> | <a>DescribeGameServer</a> |
     * <a>UpdateGameServer</a> | <a>DeregisterGameServer</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param claimGameServerRequest
     * @return A Java Future containing the result of the ClaimGameServer operation returned by the service.
     * @sample AmazonGameLiftAsync.ClaimGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ClaimGameServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ClaimGameServerResult> claimGameServerAsync(ClaimGameServerRequest claimGameServerRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Locates an available game server and temporarily reserves it to host gameplay and players. This operation is
     * called from a game client or client service (such as a matchmaker) to request hosting resources for a new game
     * session. In response, GameLift FleetIQ locates an available game server, places it in <code>CLAIMED</code> status
     * for 60 seconds, and returns connection information that players can use to connect to the game server.
     * </p>
     * <p>
     * To claim a game server, identify a game server group. You can also specify a game server ID, although this
     * approach bypasses GameLift FleetIQ placement optimization. Optionally, include game data to pass to the game
     * server at the start of a game session, such as a game map or player information.
     * </p>
     * <p>
     * When a game server is successfully claimed, connection information is returned. A claimed game server's
     * utilization status remains <code>AVAILABLE</code> while the claim status is set to <code>CLAIMED</code> for up to
     * 60 seconds. This time period gives the game server time to update its status to <code>UTILIZED</code> (using
     * <a>UpdateGameServer</a>) once players join. If the game server's status is not updated within 60 seconds, the
     * game server reverts to unclaimed status and is available to be claimed by another request. The claim time period
     * is a fixed value and is not configurable.
     * </p>
     * <p>
     * If you try to claim a specific game server, this request will fail in the following cases:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the game server utilization status is <code>UTILIZED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the game server claim status is <code>CLAIMED</code>.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * When claiming a specific game server, this request will succeed even if the game server is running on an instance
     * in <code>DRAINING</code> status. To avoid this, first check the instance status by calling
     * <a>DescribeGameServerInstances</a>.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>RegisterGameServer</a> | <a>ListGameServers</a> | <a>ClaimGameServer</a> | <a>DescribeGameServer</a> |
     * <a>UpdateGameServer</a> | <a>DeregisterGameServer</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param claimGameServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ClaimGameServer operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ClaimGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ClaimGameServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ClaimGameServerResult> claimGameServerAsync(ClaimGameServerRequest claimGameServerRequest,
            com.amazonaws.handlers.AsyncHandler<ClaimGameServerRequest, ClaimGameServerResult> asyncHandler);

    /**
     * <p>
     * Creates an alias for a fleet. In most situations, you can use an alias ID in place of a fleet ID. An alias
     * provides a level of abstraction for a fleet that is useful when redirecting player traffic from one fleet to
     * another, such as when updating your game build.
     * </p>
     * <p>
     * Amazon GameLift supports two types of routing strategies for aliases: simple and terminal. A simple alias points
     * to an active fleet. A terminal alias is used to display messaging or link to a URL instead of routing players to
     * an active fleet. For example, you might use a terminal alias when a game version is no longer supported and you
     * want to direct players to an upgrade site.
     * </p>
     * <p>
     * To create a fleet alias, specify an alias name, routing strategy, and optional description. Each simple alias can
     * point to only one fleet, but a fleet can have multiple aliases. If successful, a new alias record is returned,
     * including an alias ID and an ARN. You can reassign an alias to another fleet by calling <code>UpdateAlias</code>.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateAlias</a> | <a>ListAliases</a> | <a>DescribeAlias</a> | <a>UpdateAlias</a> | <a>DeleteAlias</a> |
     * <a>ResolveAlias</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createAliasRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates an alias for a fleet. In most situations, you can use an alias ID in place of a fleet ID. An alias
     * provides a level of abstraction for a fleet that is useful when redirecting player traffic from one fleet to
     * another, such as when updating your game build.
     * </p>
     * <p>
     * Amazon GameLift supports two types of routing strategies for aliases: simple and terminal. A simple alias points
     * to an active fleet. A terminal alias is used to display messaging or link to a URL instead of routing players to
     * an active fleet. For example, you might use a terminal alias when a game version is no longer supported and you
     * want to direct players to an upgrade site.
     * </p>
     * <p>
     * To create a fleet alias, specify an alias name, routing strategy, and optional description. Each simple alias can
     * point to only one fleet, but a fleet can have multiple aliases. If successful, a new alias record is returned,
     * including an alias ID and an ARN. You can reassign an alias to another fleet by calling <code>UpdateAlias</code>.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateAlias</a> | <a>ListAliases</a> | <a>DescribeAlias</a> | <a>UpdateAlias</a> | <a>DeleteAlias</a> |
     * <a>ResolveAlias</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createAliasRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAlias operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest createAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler);

    /**
     * <p>
     * Creates a new Amazon GameLift build resource for your game server binary files. Game server binaries must be
     * combined into a zip file for use with Amazon GameLift.
     * </p>
     * <important>
     * <p>
     * When setting up a new game build for GameLift, we recommend using the AWS CLI command <b> <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/gamelift/upload-build.html">upload-build</a> </b>. This
     * helper command combines two tasks: (1) it uploads your build files from a file directory to a GameLift Amazon S3
     * location, and (2) it creates a new build resource.
     * </p>
     * </important>
     * <p>
     * The <code>CreateBuild</code> operation can used in the following scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a new game build with build files that are in an Amazon S3 location under an AWS account that you
     * control. To use this option, you must first give Amazon GameLift access to the Amazon S3 bucket. With permissions
     * in place, call <code>CreateBuild</code> and specify a build name, operating system, and the Amazon S3 storage
     * location of your game build.
     * </p>
     * </li>
     * <li>
     * <p>
     * To directly upload your build files to a GameLift Amazon S3 location. To use this option, first call
     * <code>CreateBuild</code> and specify a build name and operating system. This operation creates a new build
     * resource and also returns an Amazon S3 location with temporary access credentials. Use the credentials to
     * manually upload your build files to the specified Amazon S3 location. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UploadingObjects.html">Uploading Objects</a> in the
     * <i>Amazon S3 Developer Guide</i>. Build files can be uploaded to the GameLift Amazon S3 location once only; that
     * can't be updated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, this operation creates a new build resource with a unique build ID and places it in
     * <code>INITIALIZED</code> status. A build must be in <code>READY</code> status before you can create fleets with
     * it.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html">Uploading Your
     * Game</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build"
     * > Create a Build with Files in Amazon S3</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateBuild</a> | <a>ListBuilds</a> | <a>DescribeBuild</a> | <a>UpdateBuild</a> | <a>DeleteBuild</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createBuildRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the CreateBuild operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBuildResult> createBuildAsync(CreateBuildRequest createBuildRequest);

    /**
     * <p>
     * Creates a new Amazon GameLift build resource for your game server binary files. Game server binaries must be
     * combined into a zip file for use with Amazon GameLift.
     * </p>
     * <important>
     * <p>
     * When setting up a new game build for GameLift, we recommend using the AWS CLI command <b> <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/gamelift/upload-build.html">upload-build</a> </b>. This
     * helper command combines two tasks: (1) it uploads your build files from a file directory to a GameLift Amazon S3
     * location, and (2) it creates a new build resource.
     * </p>
     * </important>
     * <p>
     * The <code>CreateBuild</code> operation can used in the following scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a new game build with build files that are in an Amazon S3 location under an AWS account that you
     * control. To use this option, you must first give Amazon GameLift access to the Amazon S3 bucket. With permissions
     * in place, call <code>CreateBuild</code> and specify a build name, operating system, and the Amazon S3 storage
     * location of your game build.
     * </p>
     * </li>
     * <li>
     * <p>
     * To directly upload your build files to a GameLift Amazon S3 location. To use this option, first call
     * <code>CreateBuild</code> and specify a build name and operating system. This operation creates a new build
     * resource and also returns an Amazon S3 location with temporary access credentials. Use the credentials to
     * manually upload your build files to the specified Amazon S3 location. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UploadingObjects.html">Uploading Objects</a> in the
     * <i>Amazon S3 Developer Guide</i>. Build files can be uploaded to the GameLift Amazon S3 location once only; that
     * can't be updated.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, this operation creates a new build resource with a unique build ID and places it in
     * <code>INITIALIZED</code> status. A build must be in <code>READY</code> status before you can create fleets with
     * it.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html">Uploading Your
     * Game</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build"
     * > Create a Build with Files in Amazon S3</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateBuild</a> | <a>ListBuilds</a> | <a>DescribeBuild</a> | <a>UpdateBuild</a> | <a>DeleteBuild</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createBuildRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateBuild operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBuildResult> createBuildAsync(CreateBuildRequest createBuildRequest,
            com.amazonaws.handlers.AsyncHandler<CreateBuildRequest, CreateBuildResult> asyncHandler);

    /**
     * <p>
     * Creates a fleet of Amazon Elastic Compute Cloud (Amazon EC2) instances to host your custom game server or
     * Realtime Servers. Use this operation to configure the computing resources for your fleet and provide instructions
     * for running game servers on each instance.
     * </p>
     * <p>
     * Most GameLift fleets can deploy instances to multiple locations, including the home Region (where the fleet is
     * created) and an optional set of remote locations. Fleets that are created in the following AWS Regions support
     * multiple locations: us-east-1 (N. Virginia), us-west-2 (Oregon), eu-central-1 (Frankfurt), eu-west-1 (Ireland),
     * ap-southeast-2 (Sydney), ap-northeast-1 (Tokyo), and ap-northeast-2 (Seoul). Fleets that are created in other
     * GameLift Regions can deploy instances in the fleet's home Region only. All fleet instances use the same
     * configuration regardless of location; however, you can adjust capacity settings and turn auto-scaling on/off for
     * each location.
     * </p>
     * <p>
     * To create a fleet, choose the hardware for your instances, specify a game server build or Realtime script to
     * deploy, and provide a runtime configuration to direct GameLift how to start and run game servers on each instance
     * in the fleet. Set permissions for inbound traffic to your game servers, and enable optional features as needed.
     * When creating a multi-location fleet, provide a list of additional remote locations.
     * </p>
     * <p>
     * If successful, this operation creates a new Fleet resource and places it in <code>NEW</code> status, which
     * prompts GameLift to initiate the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creation-workflow.html">fleet creation
     * workflow</a>. You can track fleet creation by checking fleet status using <a>DescribeFleetAttributes</a> and
     * <a>DescribeFleetLocationAttributes</a>/, or by monitoring fleet creation events using <a>DescribeFleetEvents</a>.
     * As soon as the fleet status changes to <code>ACTIVE</code>, you can enable automatic scaling for the fleet with
     * <a>PutScalingPolicy</a> and set capacity for the home Region with <a>UpdateFleetCapacity</a>. When the status of
     * each remote location reaches <code>ACTIVE</code>, you can set capacity by location using
     * <a>UpdateFleetCapacity</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html#fleets-creating-debug-creation"
     * >Debug fleet creation issues</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Multi-location fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleet</a> | <a>UpdateFleetCapacity</a> | <a>PutScalingPolicy</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>DescribeFleetAttributes</a> | <a>DescribeFleetLocationAttributes</a> | <a>UpdateFleetAttributes</a> |
     * <a>StopFleetActions</a> | <a>DeleteFleet</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createFleetRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a fleet of Amazon Elastic Compute Cloud (Amazon EC2) instances to host your custom game server or
     * Realtime Servers. Use this operation to configure the computing resources for your fleet and provide instructions
     * for running game servers on each instance.
     * </p>
     * <p>
     * Most GameLift fleets can deploy instances to multiple locations, including the home Region (where the fleet is
     * created) and an optional set of remote locations. Fleets that are created in the following AWS Regions support
     * multiple locations: us-east-1 (N. Virginia), us-west-2 (Oregon), eu-central-1 (Frankfurt), eu-west-1 (Ireland),
     * ap-southeast-2 (Sydney), ap-northeast-1 (Tokyo), and ap-northeast-2 (Seoul). Fleets that are created in other
     * GameLift Regions can deploy instances in the fleet's home Region only. All fleet instances use the same
     * configuration regardless of location; however, you can adjust capacity settings and turn auto-scaling on/off for
     * each location.
     * </p>
     * <p>
     * To create a fleet, choose the hardware for your instances, specify a game server build or Realtime script to
     * deploy, and provide a runtime configuration to direct GameLift how to start and run game servers on each instance
     * in the fleet. Set permissions for inbound traffic to your game servers, and enable optional features as needed.
     * When creating a multi-location fleet, provide a list of additional remote locations.
     * </p>
     * <p>
     * If successful, this operation creates a new Fleet resource and places it in <code>NEW</code> status, which
     * prompts GameLift to initiate the <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creation-workflow.html">fleet creation
     * workflow</a>. You can track fleet creation by checking fleet status using <a>DescribeFleetAttributes</a> and
     * <a>DescribeFleetLocationAttributes</a>/, or by monitoring fleet creation events using <a>DescribeFleetEvents</a>.
     * As soon as the fleet status changes to <code>ACTIVE</code>, you can enable automatic scaling for the fleet with
     * <a>PutScalingPolicy</a> and set capacity for the home Region with <a>UpdateFleetCapacity</a>. When the status of
     * each remote location reaches <code>ACTIVE</code>, you can set capacity by location using
     * <a>UpdateFleetCapacity</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html#fleets-creating-debug-creation"
     * >Debug fleet creation issues</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Multi-location fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleet</a> | <a>UpdateFleetCapacity</a> | <a>PutScalingPolicy</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>DescribeFleetAttributes</a> | <a>DescribeFleetLocationAttributes</a> | <a>UpdateFleetAttributes</a> |
     * <a>StopFleetActions</a> | <a>DeleteFleet</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createFleetRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler);

    /**
     * <p>
     * Adds remote locations to a fleet and begins populating the new locations with EC2 instances. The new instances
     * conform to the fleet's instance type, auto-scaling, and other configuration settings.
     * </p>
     * <note>
     * <p>
     * This operation cannot be used with fleets that don't support remote locations. Fleets can have multiple locations
     * only if they reside in AWS Regions that support this feature (see <a>CreateFleet</a> for the complete list) and
     * were created after the feature was released in March 2021.
     * </p>
     * </note>
     * <p>
     * To add fleet locations, specify the fleet to be updated and provide a list of one or more locations.
     * </p>
     * <p>
     * If successful, this operation returns the list of added locations with their status set to <code>NEW</code>.
     * GameLift initiates the process of starting an instance in each added location. You can track the status of each
     * new location by monitoring location creation events using <a>DescribeFleetEvents</a>. Alternatively, you can poll
     * location status by calling <a>DescribeFleetLocationAttributes</a>. After a location status becomes
     * <code>ACTIVE</code>, you can adjust the location's capacity as needed with <a>UpdateFleetCapacity</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up fleets</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Multi-location fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>DescribeFleetLocationAttributes</a> | <a>DescribeFleetLocationCapacity</a> |
     * <a>DescribeFleetLocationUtilization</a> | <a>DescribeFleetAttributes</a> | <a>DescribeFleetCapacity</a> |
     * <a>DescribeFleetUtilization</a> | <a>UpdateFleetCapacity</a> | <a>StopFleetActions</a> |
     * <a>DeleteFleetLocations</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createFleetLocationsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the CreateFleetLocations operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateFleetLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleetLocations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetLocationsResult> createFleetLocationsAsync(CreateFleetLocationsRequest createFleetLocationsRequest);

    /**
     * <p>
     * Adds remote locations to a fleet and begins populating the new locations with EC2 instances. The new instances
     * conform to the fleet's instance type, auto-scaling, and other configuration settings.
     * </p>
     * <note>
     * <p>
     * This operation cannot be used with fleets that don't support remote locations. Fleets can have multiple locations
     * only if they reside in AWS Regions that support this feature (see <a>CreateFleet</a> for the complete list) and
     * were created after the feature was released in March 2021.
     * </p>
     * </note>
     * <p>
     * To add fleet locations, specify the fleet to be updated and provide a list of one or more locations.
     * </p>
     * <p>
     * If successful, this operation returns the list of added locations with their status set to <code>NEW</code>.
     * GameLift initiates the process of starting an instance in each added location. You can track the status of each
     * new location by monitoring location creation events using <a>DescribeFleetEvents</a>. Alternatively, you can poll
     * location status by calling <a>DescribeFleetLocationAttributes</a>. After a location status becomes
     * <code>ACTIVE</code>, you can adjust the location's capacity as needed with <a>UpdateFleetCapacity</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up fleets</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Multi-location fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>DescribeFleetLocationAttributes</a> | <a>DescribeFleetLocationCapacity</a> |
     * <a>DescribeFleetLocationUtilization</a> | <a>DescribeFleetAttributes</a> | <a>DescribeFleetCapacity</a> |
     * <a>DescribeFleetUtilization</a> | <a>UpdateFleetCapacity</a> | <a>StopFleetActions</a> |
     * <a>DeleteFleetLocations</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createFleetLocationsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateFleetLocations operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateFleetLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleetLocations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetLocationsResult> createFleetLocationsAsync(CreateFleetLocationsRequest createFleetLocationsRequest,
            com.amazonaws.handlers.AsyncHandler<CreateFleetLocationsRequest, CreateFleetLocationsResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Creates a GameLift FleetIQ game server group for managing game hosting on a collection of Amazon EC2 instances
     * for game hosting. This operation creates the game server group, creates an Auto Scaling group in your AWS
     * account, and establishes a link between the two groups. You can view the status of your game server groups in the
     * GameLift console. Game server group metrics and events are emitted to Amazon CloudWatch.
     * </p>
     * <p>
     * Before creating a new game server group, you must have the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon EC2 launch template that specifies how to launch Amazon EC2 instances with your game server build. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html">
     * Launching an Instance from a Launch Template</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * An IAM role that extends limited access to your AWS account to allow GameLift FleetIQ to create and interact with
     * the Auto Scaling group. For more information, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-iam-permissions-roles.html">Create IAM roles
     * for cross-service interaction</a> in the <i>GameLift FleetIQ Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create a new game server group, specify a unique group name, IAM role and Amazon EC2 launch template, and
     * provide a list of instance types that can be used in the group. You must also set initial maximum and minimum
     * limits on the group's instance count. You can optionally set an Auto Scaling policy with target tracking based on
     * a GameLift FleetIQ metric.
     * </p>
     * <p>
     * Once the game server group and corresponding Auto Scaling group are created, you have full access to change the
     * Auto Scaling group's configuration as needed. Several properties that are set when creating a game server group,
     * including maximum/minimum size and auto-scaling policy settings, must be updated directly in the Auto Scaling
     * group. Keep in mind that some Auto Scaling group properties are periodically updated by GameLift FleetIQ as part
     * of its balancing activities to optimize for availability and cost.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param createGameServerGroupRequest
     * @return A Java Future containing the result of the CreateGameServerGroup operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameServerGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGameServerGroupResult> createGameServerGroupAsync(CreateGameServerGroupRequest createGameServerGroupRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Creates a GameLift FleetIQ game server group for managing game hosting on a collection of Amazon EC2 instances
     * for game hosting. This operation creates the game server group, creates an Auto Scaling group in your AWS
     * account, and establishes a link between the two groups. You can view the status of your game server groups in the
     * GameLift console. Game server group metrics and events are emitted to Amazon CloudWatch.
     * </p>
     * <p>
     * Before creating a new game server group, you must have the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon EC2 launch template that specifies how to launch Amazon EC2 instances with your game server build. For
     * more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html">
     * Launching an Instance from a Launch Template</a> in the <i>Amazon EC2 User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * An IAM role that extends limited access to your AWS account to allow GameLift FleetIQ to create and interact with
     * the Auto Scaling group. For more information, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-iam-permissions-roles.html">Create IAM roles
     * for cross-service interaction</a> in the <i>GameLift FleetIQ Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create a new game server group, specify a unique group name, IAM role and Amazon EC2 launch template, and
     * provide a list of instance types that can be used in the group. You must also set initial maximum and minimum
     * limits on the group's instance count. You can optionally set an Auto Scaling policy with target tracking based on
     * a GameLift FleetIQ metric.
     * </p>
     * <p>
     * Once the game server group and corresponding Auto Scaling group are created, you have full access to change the
     * Auto Scaling group's configuration as needed. Several properties that are set when creating a game server group,
     * including maximum/minimum size and auto-scaling policy settings, must be updated directly in the Auto Scaling
     * group. Keep in mind that some Auto Scaling group properties are periodically updated by GameLift FleetIQ as part
     * of its balancing activities to optimize for availability and cost.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param createGameServerGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGameServerGroup operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameServerGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateGameServerGroupResult> createGameServerGroupAsync(CreateGameServerGroupRequest createGameServerGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGameServerGroupRequest, CreateGameServerGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a multiplayer game session for players in a specific fleet location. This operation prompts an available
     * server process to start a game session and retrieves connection information for the new game session. As an
     * alternative, consider using the GameLift game session placement feature with
     * </p>
     * <p>
     * with <a>StartGameSessionPlacement</a>, which uses FleetIQ algorithms and queues to optimize the placement
     * process.
     * </p>
     * <p>
     * When creating a game session, you specify exactly where you want to place it and provide a set of game session
     * configuration settings. The fleet must be in <code>ACTIVE</code> status before a game session can be created in
     * it.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a game session on an instance in a fleet's home Region, provide a fleet or alias ID along with your
     * game session configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a game session on an instance in a fleet's remote location, provide a fleet or alias ID and a location
     * name, along with your game session configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, a workflow is initiated to start a new game session. A <code>GameSession</code> object is returned
     * containing the game session configuration and status. When the status is <code>ACTIVE</code>, game session
     * connection information is provided and player sessions can be created for the game session. By default, newly
     * created game sessions are open to new players. You can restrict new player access by using
     * <a>UpdateGameSession</a> to change the game session's player session creation policy.
     * </p>
     * <p>
     * Game session logs are retained for all active game sessions for 14 days. To access the logs, call
     * <a>GetGameSessionLogUrl</a> to download the log files.
     * </p>
     * <p>
     * <i>Available in GameLift Local.</i>
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a game session</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createGameSessionRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the CreateGameSession operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateGameSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGameSessionResult> createGameSessionAsync(CreateGameSessionRequest createGameSessionRequest);

    /**
     * <p>
     * Creates a multiplayer game session for players in a specific fleet location. This operation prompts an available
     * server process to start a game session and retrieves connection information for the new game session. As an
     * alternative, consider using the GameLift game session placement feature with
     * </p>
     * <p>
     * with <a>StartGameSessionPlacement</a>, which uses FleetIQ algorithms and queues to optimize the placement
     * process.
     * </p>
     * <p>
     * When creating a game session, you specify exactly where you want to place it and provide a set of game session
     * configuration settings. The fleet must be in <code>ACTIVE</code> status before a game session can be created in
     * it.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To create a game session on an instance in a fleet's home Region, provide a fleet or alias ID along with your
     * game session configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * To create a game session on an instance in a fleet's remote location, provide a fleet or alias ID and a location
     * name, along with your game session configuration.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, a workflow is initiated to start a new game session. A <code>GameSession</code> object is returned
     * containing the game session configuration and status. When the status is <code>ACTIVE</code>, game session
     * connection information is provided and player sessions can be created for the game session. By default, newly
     * created game sessions are open to new players. You can restrict new player access by using
     * <a>UpdateGameSession</a> to change the game session's player session creation policy.
     * </p>
     * <p>
     * Game session logs are retained for all active game sessions for 14 days. To access the logs, call
     * <a>GetGameSessionLogUrl</a> to download the log files.
     * </p>
     * <p>
     * <i>Available in GameLift Local.</i>
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-startsession"
     * >Start a game session</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createGameSessionRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGameSession operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateGameSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateGameSessionResult> createGameSessionAsync(CreateGameSessionRequest createGameSessionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGameSessionRequest, CreateGameSessionResult> asyncHandler);

    /**
     * <p>
     * Creates a placement queue that processes requests for new game sessions. A queue uses FleetIQ algorithms to
     * determine the best placement locations and find an available game server there, then prompts the game server
     * process to start a new game session.
     * </p>
     * <p>
     * A game session queue is configured with a set of destinations (GameLift fleets or aliases), which determine the
     * locations where the queue can place new game sessions. These destinations can span multiple fleet types (Spot and
     * On-Demand), instance types, and AWS Regions. If the queue includes multi-location fleets, the queue is able to
     * place game sessions in all of a fleet's remote locations. You can opt to filter out individual locations if
     * needed.
     * </p>
     * <p>
     * The queue configuration also determines how FleetIQ selects the best available placement for a new game session.
     * Before searching for an available game server, FleetIQ first prioritizes the queue's destinations and locations,
     * with the best placement locations on top. You can set up the queue to use the FleetIQ default prioritization or
     * provide an alternate set of priorities.
     * </p>
     * <p>
     * To create a new queue, provide a name, timeout value, and a list of destinations. Optionally, specify a sort
     * configuration and/or a filter, and define a set of latency cap policies. You can also include the ARN for an
     * Amazon Simple Notification Service (SNS) topic to receive notifications of game session placement activity.
     * Notifications using SNS or CloudWatch events is the preferred way to track placement activity.
     * </p>
     * <p>
     * If successful, a new <code>GameSessionQueue</code> object is returned with an assigned queue ARN. New game
     * session requests, which are submitted to the queue with <a>StartGameSessionPlacement</a> or
     * <a>StartMatchmaking</a>, reference a queue's name or ARN.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-design.html"> Design a game session
     * queue</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-creating.html"> Create a game session
     * queue</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSessionQueue</a> | <a>DescribeGameSessionQueues</a> | <a>UpdateGameSessionQueue</a> |
     * <a>DeleteGameSessionQueue</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createGameSessionQueueRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the CreateGameSessionQueue operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGameSessionQueueResult> createGameSessionQueueAsync(CreateGameSessionQueueRequest createGameSessionQueueRequest);

    /**
     * <p>
     * Creates a placement queue that processes requests for new game sessions. A queue uses FleetIQ algorithms to
     * determine the best placement locations and find an available game server there, then prompts the game server
     * process to start a new game session.
     * </p>
     * <p>
     * A game session queue is configured with a set of destinations (GameLift fleets or aliases), which determine the
     * locations where the queue can place new game sessions. These destinations can span multiple fleet types (Spot and
     * On-Demand), instance types, and AWS Regions. If the queue includes multi-location fleets, the queue is able to
     * place game sessions in all of a fleet's remote locations. You can opt to filter out individual locations if
     * needed.
     * </p>
     * <p>
     * The queue configuration also determines how FleetIQ selects the best available placement for a new game session.
     * Before searching for an available game server, FleetIQ first prioritizes the queue's destinations and locations,
     * with the best placement locations on top. You can set up the queue to use the FleetIQ default prioritization or
     * provide an alternate set of priorities.
     * </p>
     * <p>
     * To create a new queue, provide a name, timeout value, and a list of destinations. Optionally, specify a sort
     * configuration and/or a filter, and define a set of latency cap policies. You can also include the ARN for an
     * Amazon Simple Notification Service (SNS) topic to receive notifications of game session placement activity.
     * Notifications using SNS or CloudWatch events is the preferred way to track placement activity.
     * </p>
     * <p>
     * If successful, a new <code>GameSessionQueue</code> object is returned with an assigned queue ARN. New game
     * session requests, which are submitted to the queue with <a>StartGameSessionPlacement</a> or
     * <a>StartMatchmaking</a>, reference a queue's name or ARN.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-design.html"> Design a game session
     * queue</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-creating.html"> Create a game session
     * queue</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSessionQueue</a> | <a>DescribeGameSessionQueues</a> | <a>UpdateGameSessionQueue</a> |
     * <a>DeleteGameSessionQueue</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createGameSessionQueueRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGameSessionQueue operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateGameSessionQueueResult> createGameSessionQueueAsync(CreateGameSessionQueueRequest createGameSessionQueueRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGameSessionQueueRequest, CreateGameSessionQueueResult> asyncHandler);

    /**
     * <p>
     * Defines a new matchmaking configuration for use with FlexMatch. Whether your are using FlexMatch with GameLift
     * hosting or as a standalone matchmaking service, the matchmaking configuration sets out rules for matching players
     * and forming teams. If you're also using GameLift hosting, it defines how to start game sessions for each match.
     * Your matchmaking system can use multiple configurations to handle different game scenarios. All matchmaking
     * requests (<a>StartMatchmaking</a> or <a>StartMatchBackfill</a>) identify the matchmaking configuration to use and
     * provide player attributes consistent with that configuration.
     * </p>
     * <p>
     * To create a matchmaking configuration, you must provide the following: configuration name and FlexMatch mode
     * (with or without GameLift hosting); a rule set that specifies how to evaluate players and find acceptable
     * matches; whether player acceptance is required; and the maximum time allowed for a matchmaking attempt. When
     * using FlexMatch with GameLift hosting, you also need to identify the game session queue to use when starting a
     * game session for the match.
     * </p>
     * <p>
     * In addition, you must set up an Amazon Simple Notification Service (SNS) topic to receive matchmaking
     * notifications. Provide the topic ARN in the matchmaking configuration. An alternative method, continuously
     * polling ticket status with <a>DescribeMatchmaking</a>, is only suitable for games in development with low
     * matchmaking usage.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-configuration.html"> Design a FlexMatch
     * matchmaker</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-notification.html"> Set up FlexMatch
     * event notification</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createMatchmakingConfigurationRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the CreateMatchmakingConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.CreateMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMatchmakingConfigurationResult> createMatchmakingConfigurationAsync(
            CreateMatchmakingConfigurationRequest createMatchmakingConfigurationRequest);

    /**
     * <p>
     * Defines a new matchmaking configuration for use with FlexMatch. Whether your are using FlexMatch with GameLift
     * hosting or as a standalone matchmaking service, the matchmaking configuration sets out rules for matching players
     * and forming teams. If you're also using GameLift hosting, it defines how to start game sessions for each match.
     * Your matchmaking system can use multiple configurations to handle different game scenarios. All matchmaking
     * requests (<a>StartMatchmaking</a> or <a>StartMatchBackfill</a>) identify the matchmaking configuration to use and
     * provide player attributes consistent with that configuration.
     * </p>
     * <p>
     * To create a matchmaking configuration, you must provide the following: configuration name and FlexMatch mode
     * (with or without GameLift hosting); a rule set that specifies how to evaluate players and find acceptable
     * matches; whether player acceptance is required; and the maximum time allowed for a matchmaking attempt. When
     * using FlexMatch with GameLift hosting, you also need to identify the game session queue to use when starting a
     * game session for the match.
     * </p>
     * <p>
     * In addition, you must set up an Amazon Simple Notification Service (SNS) topic to receive matchmaking
     * notifications. Provide the topic ARN in the matchmaking configuration. An alternative method, continuously
     * polling ticket status with <a>DescribeMatchmaking</a>, is only suitable for games in development with low
     * matchmaking usage.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-configuration.html"> Design a FlexMatch
     * matchmaker</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-notification.html"> Set up FlexMatch
     * event notification</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createMatchmakingConfigurationRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMatchmakingConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.CreateMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMatchmakingConfigurationResult> createMatchmakingConfigurationAsync(
            CreateMatchmakingConfigurationRequest createMatchmakingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMatchmakingConfigurationRequest, CreateMatchmakingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Creates a new rule set for FlexMatch matchmaking. A rule set describes the type of match to create, such as the
     * number and size of teams. It also sets the parameters for acceptable player matches, such as minimum skill level
     * or character type. A rule set is used by a <a>MatchmakingConfiguration</a>.
     * </p>
     * <p>
     * To create a matchmaking rule set, provide unique rule set name and the rule set body in JSON format. Rule sets
     * must be defined in the same Region as the matchmaking configuration they are used with.
     * </p>
     * <p>
     * Since matchmaking rule sets cannot be edited, it is a good idea to check the rule set syntax using
     * <a>ValidateMatchmakingRuleSet</a> before creating a new rule set.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-rulesets.html">Build a rule set</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-configuration.html">Design a
     * matchmaker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-intro.html">Matchmaking with
     * FlexMatch</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createMatchmakingRuleSetRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the CreateMatchmakingRuleSet operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMatchmakingRuleSetResult> createMatchmakingRuleSetAsync(CreateMatchmakingRuleSetRequest createMatchmakingRuleSetRequest);

    /**
     * <p>
     * Creates a new rule set for FlexMatch matchmaking. A rule set describes the type of match to create, such as the
     * number and size of teams. It also sets the parameters for acceptable player matches, such as minimum skill level
     * or character type. A rule set is used by a <a>MatchmakingConfiguration</a>.
     * </p>
     * <p>
     * To create a matchmaking rule set, provide unique rule set name and the rule set body in JSON format. Rule sets
     * must be defined in the same Region as the matchmaking configuration they are used with.
     * </p>
     * <p>
     * Since matchmaking rule sets cannot be edited, it is a good idea to check the rule set syntax using
     * <a>ValidateMatchmakingRuleSet</a> before creating a new rule set.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-rulesets.html">Build a rule set</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-configuration.html">Design a
     * matchmaker</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-intro.html">Matchmaking with
     * FlexMatch</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createMatchmakingRuleSetRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateMatchmakingRuleSet operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateMatchmakingRuleSetResult> createMatchmakingRuleSetAsync(CreateMatchmakingRuleSetRequest createMatchmakingRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateMatchmakingRuleSetRequest, CreateMatchmakingRuleSetResult> asyncHandler);

    /**
     * <p>
     * Reserves an open player slot in a game session for a player. New player sessions can be created in any game
     * session with an open slot that is in <code>ACTIVE</code> status and has a player creation policy of
     * <code>ACCEPT_ALL</code>. You can add a group of players to a game session with <a>CreatePlayerSessions</a>.
     * </p>
     * <p>
     * To create a player session, specify a game session ID, player ID, and optionally a set of player data.
     * </p>
     * <p>
     * If successful, a slot is reserved in the game session for the player and a new <a>PlayerSession</a> object is
     * returned with a player session ID. The player references the player session ID when sending a connection request
     * to the game session, and the game server can use it to validate the player reservation with the GameLift service.
     * Player sessions cannot be updated.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreatePlayerSession</a> | <a>CreatePlayerSessions</a> | <a>DescribePlayerSessions</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createPlayerSessionRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the CreatePlayerSession operation returned by the service.
     * @sample AmazonGameLiftAsync.CreatePlayerSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePlayerSessionResult> createPlayerSessionAsync(CreatePlayerSessionRequest createPlayerSessionRequest);

    /**
     * <p>
     * Reserves an open player slot in a game session for a player. New player sessions can be created in any game
     * session with an open slot that is in <code>ACTIVE</code> status and has a player creation policy of
     * <code>ACCEPT_ALL</code>. You can add a group of players to a game session with <a>CreatePlayerSessions</a>.
     * </p>
     * <p>
     * To create a player session, specify a game session ID, player ID, and optionally a set of player data.
     * </p>
     * <p>
     * If successful, a slot is reserved in the game session for the player and a new <a>PlayerSession</a> object is
     * returned with a player session ID. The player references the player session ID when sending a connection request
     * to the game session, and the game server can use it to validate the player reservation with the GameLift service.
     * Player sessions cannot be updated.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreatePlayerSession</a> | <a>CreatePlayerSessions</a> | <a>DescribePlayerSessions</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createPlayerSessionRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlayerSession operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreatePlayerSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSession" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePlayerSessionResult> createPlayerSessionAsync(CreatePlayerSessionRequest createPlayerSessionRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePlayerSessionRequest, CreatePlayerSessionResult> asyncHandler);

    /**
     * <p>
     * Reserves open slots in a game session for a group of players. New player sessions can be created in any game
     * session with an open slot that is in <code>ACTIVE</code> status and has a player creation policy of
     * <code>ACCEPT_ALL</code>. To add a single player to a game session, use <a>CreatePlayerSession</a>.
     * </p>
     * <p>
     * To create player sessions, specify a game session ID and a list of player IDs. Optionally, provide a set of
     * player data for each player ID.
     * </p>
     * <p>
     * If successful, a slot is reserved in the game session for each player, and new <a>PlayerSession</a> objects are
     * returned with player session IDs. Each player references their player session ID when sending a connection
     * request to the game session, and the game server can use it to validate the player reservation with the GameLift
     * service. Player sessions cannot be updated.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreatePlayerSession</a> | <a>CreatePlayerSessions</a> | <a>DescribePlayerSessions</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createPlayerSessionsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the CreatePlayerSessions operation returned by the service.
     * @sample AmazonGameLiftAsync.CreatePlayerSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePlayerSessionsResult> createPlayerSessionsAsync(CreatePlayerSessionsRequest createPlayerSessionsRequest);

    /**
     * <p>
     * Reserves open slots in a game session for a group of players. New player sessions can be created in any game
     * session with an open slot that is in <code>ACTIVE</code> status and has a player creation policy of
     * <code>ACCEPT_ALL</code>. To add a single player to a game session, use <a>CreatePlayerSession</a>.
     * </p>
     * <p>
     * To create player sessions, specify a game session ID and a list of player IDs. Optionally, provide a set of
     * player data for each player ID.
     * </p>
     * <p>
     * If successful, a slot is reserved in the game session for each player, and new <a>PlayerSession</a> objects are
     * returned with player session IDs. Each player references their player session ID when sending a connection
     * request to the game session, and the game server can use it to validate the player reservation with the GameLift
     * service. Player sessions cannot be updated.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreatePlayerSession</a> | <a>CreatePlayerSessions</a> | <a>DescribePlayerSessions</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createPlayerSessionsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePlayerSessions operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreatePlayerSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreatePlayerSessionsResult> createPlayerSessionsAsync(CreatePlayerSessionsRequest createPlayerSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePlayerSessionsRequest, CreatePlayerSessionsResult> asyncHandler);

    /**
     * <p>
     * Creates a new script record for your Realtime Servers script. Realtime scripts are JavaScript that provide
     * configuration settings and optional custom game logic for your game. The script is deployed when you create a
     * Realtime Servers fleet to host your game sessions. Script logic is executed during an active game session.
     * </p>
     * <p>
     * To create a new script record, specify a script name and provide the script file(s). The script files and all
     * dependencies must be zipped into a single file. You can pull the zip file from either of these locations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A locally available directory. Use the <i>ZipFile</i> parameter for this option.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Simple Storage Service (Amazon S3) bucket under your AWS account. Use the <i>StorageLocation</i>
     * parameter for this option. You'll need to have an Identity Access Management (IAM) role that allows the Amazon
     * GameLift service to access your S3 bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the call is successful, a new script record is created with a unique script ID. If the script file is provided
     * as a local file, the file is uploaded to an Amazon GameLift-owned S3 bucket and the script record's storage
     * location reflects this location. If the script file is provided as an S3 bucket, Amazon GameLift accesses the
     * file at this storage location as needed for deployment.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/setting-up-role.html">Set Up a Role for
     * Amazon GameLift Access</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateScript</a> | <a>ListScripts</a> | <a>DescribeScript</a> | <a>UpdateScript</a> | <a>DeleteScript</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createScriptRequest
     * @return A Java Future containing the result of the CreateScript operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateScript" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateScriptResult> createScriptAsync(CreateScriptRequest createScriptRequest);

    /**
     * <p>
     * Creates a new script record for your Realtime Servers script. Realtime scripts are JavaScript that provide
     * configuration settings and optional custom game logic for your game. The script is deployed when you create a
     * Realtime Servers fleet to host your game sessions. Script logic is executed during an active game session.
     * </p>
     * <p>
     * To create a new script record, specify a script name and provide the script file(s). The script files and all
     * dependencies must be zipped into a single file. You can pull the zip file from either of these locations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A locally available directory. Use the <i>ZipFile</i> parameter for this option.
     * </p>
     * </li>
     * <li>
     * <p>
     * An Amazon Simple Storage Service (Amazon S3) bucket under your AWS account. Use the <i>StorageLocation</i>
     * parameter for this option. You'll need to have an Identity Access Management (IAM) role that allows the Amazon
     * GameLift service to access your S3 bucket.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the call is successful, a new script record is created with a unique script ID. If the script file is provided
     * as a local file, the file is uploaded to an Amazon GameLift-owned S3 bucket and the script record's storage
     * location reflects this location. If the script file is provided as an S3 bucket, Amazon GameLift accesses the
     * file at this storage location as needed for deployment.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/setting-up-role.html">Set Up a Role for
     * Amazon GameLift Access</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateScript</a> | <a>ListScripts</a> | <a>DescribeScript</a> | <a>UpdateScript</a> | <a>DeleteScript</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createScriptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateScript operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateScript" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateScriptResult> createScriptAsync(CreateScriptRequest createScriptRequest,
            com.amazonaws.handlers.AsyncHandler<CreateScriptRequest, CreateScriptResult> asyncHandler);

    /**
     * <p>
     * Requests authorization to create or delete a peer connection between the VPC for your Amazon GameLift fleet and a
     * virtual private cloud (VPC) in your AWS account. VPC peering enables the game servers on your fleet to
     * communicate directly with other AWS resources. Once you've received authorization, call
     * <a>CreateVpcPeeringConnection</a> to establish the peering connection. For more information, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * <p>
     * You can peer with VPCs that are owned by any AWS account you have access to, including the account that you use
     * to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different Regions.
     * </p>
     * <p>
     * To request authorization to create a connection, call this operation from the AWS account with the VPC that you
     * want to peer to your Amazon GameLift fleet. For example, to enable your game servers to retrieve data from a
     * DynamoDB table, use the account that manages that DynamoDB resource. Identify the following values: (1) The ID of
     * the VPC that you want to peer with, and (2) the ID of the AWS account that you use to manage Amazon GameLift. If
     * successful, VPC peering is authorized for the specified VPC.
     * </p>
     * <p>
     * To request authorization to delete a connection, call this operation from the AWS account with the VPC that is
     * peered with your Amazon GameLift fleet. Identify the following values: (1) VPC ID that you want to delete the
     * peering connection for, and (2) ID of the AWS account that you use to manage Amazon GameLift.
     * </p>
     * <p>
     * The authorization remains valid for 24 hours unless it is canceled by a call to
     * <a>DeleteVpcPeeringAuthorization</a>. You must create or delete the peering connection while the authorization is
     * valid.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a> | <a>DescribeVpcPeeringAuthorizations</a> |
     * <a>DeleteVpcPeeringAuthorization</a> | <a>CreateVpcPeeringConnection</a> | <a>DescribeVpcPeeringConnections</a> |
     * <a>DeleteVpcPeeringConnection</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createVpcPeeringAuthorizationRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the CreateVpcPeeringAuthorization operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.CreateVpcPeeringAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcPeeringAuthorizationResult> createVpcPeeringAuthorizationAsync(
            CreateVpcPeeringAuthorizationRequest createVpcPeeringAuthorizationRequest);

    /**
     * <p>
     * Requests authorization to create or delete a peer connection between the VPC for your Amazon GameLift fleet and a
     * virtual private cloud (VPC) in your AWS account. VPC peering enables the game servers on your fleet to
     * communicate directly with other AWS resources. Once you've received authorization, call
     * <a>CreateVpcPeeringConnection</a> to establish the peering connection. For more information, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * <p>
     * You can peer with VPCs that are owned by any AWS account you have access to, including the account that you use
     * to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different Regions.
     * </p>
     * <p>
     * To request authorization to create a connection, call this operation from the AWS account with the VPC that you
     * want to peer to your Amazon GameLift fleet. For example, to enable your game servers to retrieve data from a
     * DynamoDB table, use the account that manages that DynamoDB resource. Identify the following values: (1) The ID of
     * the VPC that you want to peer with, and (2) the ID of the AWS account that you use to manage Amazon GameLift. If
     * successful, VPC peering is authorized for the specified VPC.
     * </p>
     * <p>
     * To request authorization to delete a connection, call this operation from the AWS account with the VPC that is
     * peered with your Amazon GameLift fleet. Identify the following values: (1) VPC ID that you want to delete the
     * peering connection for, and (2) ID of the AWS account that you use to manage Amazon GameLift.
     * </p>
     * <p>
     * The authorization remains valid for 24 hours unless it is canceled by a call to
     * <a>DeleteVpcPeeringAuthorization</a>. You must create or delete the peering connection while the authorization is
     * valid.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a> | <a>DescribeVpcPeeringAuthorizations</a> |
     * <a>DeleteVpcPeeringAuthorization</a> | <a>CreateVpcPeeringConnection</a> | <a>DescribeVpcPeeringConnections</a> |
     * <a>DeleteVpcPeeringConnection</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createVpcPeeringAuthorizationRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpcPeeringAuthorization operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.CreateVpcPeeringAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcPeeringAuthorizationResult> createVpcPeeringAuthorizationAsync(
            CreateVpcPeeringAuthorizationRequest createVpcPeeringAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpcPeeringAuthorizationRequest, CreateVpcPeeringAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Establishes a VPC peering connection between a virtual private cloud (VPC) in an AWS account with the VPC for
     * your Amazon GameLift fleet. VPC peering enables the game servers on your fleet to communicate directly with other
     * AWS resources. You can peer with VPCs in any AWS account that you have access to, including the account that you
     * use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different Regions. For more
     * information, see <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC
     * Peering with Amazon GameLift Fleets</a>.
     * </p>
     * <p>
     * Before calling this operation to establish the peering connection, you first need to call
     * <a>CreateVpcPeeringAuthorization</a> and identify the VPC you want to peer with. Once the authorization for the
     * specified VPC is issued, you have 24 hours to establish the connection. These two operations handle all tasks
     * necessary to peer the two VPCs, including acceptance, updating routing tables, etc.
     * </p>
     * <p>
     * To establish the connection, call this operation from the AWS account that is used to manage the Amazon GameLift
     * fleets. Identify the following values: (1) The ID of the fleet you want to be enable a VPC peering connection
     * for; (2) The AWS account with the VPC that you want to peer with; and (3) The ID of the VPC you want to peer
     * with. This operation is asynchronous. If successful, a <a>VpcPeeringConnection</a> request is created. You can
     * use continuous polling to track the request's status using <a>DescribeVpcPeeringConnections</a>, or by monitoring
     * fleet events for success or failure using <a>DescribeFleetEvents</a>.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a> | <a>DescribeVpcPeeringAuthorizations</a> |
     * <a>DeleteVpcPeeringAuthorization</a> | <a>CreateVpcPeeringConnection</a> | <a>DescribeVpcPeeringConnections</a> |
     * <a>DeleteVpcPeeringConnection</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createVpcPeeringConnectionRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the CreateVpcPeeringConnection operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(
            CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest);

    /**
     * <p>
     * Establishes a VPC peering connection between a virtual private cloud (VPC) in an AWS account with the VPC for
     * your Amazon GameLift fleet. VPC peering enables the game servers on your fleet to communicate directly with other
     * AWS resources. You can peer with VPCs in any AWS account that you have access to, including the account that you
     * use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different Regions. For more
     * information, see <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC
     * Peering with Amazon GameLift Fleets</a>.
     * </p>
     * <p>
     * Before calling this operation to establish the peering connection, you first need to call
     * <a>CreateVpcPeeringAuthorization</a> and identify the VPC you want to peer with. Once the authorization for the
     * specified VPC is issued, you have 24 hours to establish the connection. These two operations handle all tasks
     * necessary to peer the two VPCs, including acceptance, updating routing tables, etc.
     * </p>
     * <p>
     * To establish the connection, call this operation from the AWS account that is used to manage the Amazon GameLift
     * fleets. Identify the following values: (1) The ID of the fleet you want to be enable a VPC peering connection
     * for; (2) The AWS account with the VPC that you want to peer with; and (3) The ID of the VPC you want to peer
     * with. This operation is asynchronous. If successful, a <a>VpcPeeringConnection</a> request is created. You can
     * use continuous polling to track the request's status using <a>DescribeVpcPeeringConnections</a>, or by monitoring
     * fleet events for success or failure using <a>DescribeFleetEvents</a>.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a> | <a>DescribeVpcPeeringAuthorizations</a> |
     * <a>DeleteVpcPeeringAuthorization</a> | <a>CreateVpcPeeringConnection</a> | <a>DescribeVpcPeeringConnections</a> |
     * <a>DeleteVpcPeeringConnection</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createVpcPeeringConnectionRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVpcPeeringConnection operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(
            CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVpcPeeringConnectionRequest, CreateVpcPeeringConnectionResult> asyncHandler);

    /**
     * <p>
     * Deletes an alias. This operation removes all record of the alias. Game clients attempting to access a server
     * process using the deleted alias receive an error. To delete an alias, specify the alias ID to be deleted.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateAlias</a> | <a>ListAliases</a> | <a>DescribeAlias</a> | <a>UpdateAlias</a> | <a>DeleteAlias</a> |
     * <a>ResolveAlias</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteAliasRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Deletes an alias. This operation removes all record of the alias. Game clients attempting to access a server
     * process using the deleted alias receive an error. To delete an alias, specify the alias ID to be deleted.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateAlias</a> | <a>ListAliases</a> | <a>DescribeAlias</a> | <a>UpdateAlias</a> | <a>DeleteAlias</a> |
     * <a>ResolveAlias</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteAliasRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteAlias operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest deleteAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler);

    /**
     * <p>
     * Deletes a build. This operation permanently deletes the build resource and any uploaded build files. Deleting a
     * build does not affect the status of any active fleets using the build, but you can no longer create new fleets
     * with the deleted build.
     * </p>
     * <p>
     * To delete a build, specify the build ID.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html"> Upload a Custom
     * Server Build</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateBuild</a> | <a>ListBuilds</a> | <a>DescribeBuild</a> | <a>UpdateBuild</a> | <a>DeleteBuild</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteBuildRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DeleteBuild operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBuildResult> deleteBuildAsync(DeleteBuildRequest deleteBuildRequest);

    /**
     * <p>
     * Deletes a build. This operation permanently deletes the build resource and any uploaded build files. Deleting a
     * build does not affect the status of any active fleets using the build, but you can no longer create new fleets
     * with the deleted build.
     * </p>
     * <p>
     * To delete a build, specify the build ID.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html"> Upload a Custom
     * Server Build</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateBuild</a> | <a>ListBuilds</a> | <a>DescribeBuild</a> | <a>UpdateBuild</a> | <a>DeleteBuild</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteBuildRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteBuild operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteBuildResult> deleteBuildAsync(DeleteBuildRequest deleteBuildRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteBuildRequest, DeleteBuildResult> asyncHandler);

    /**
     * <p>
     * Deletes all resources and information related a fleet. Any current fleet instances, including those in remote
     * locations, are shut down. You don't need to call <code>DeleteFleetLocations</code> separately.
     * </p>
     * <note>
     * <p>
     * If the fleet being deleted has a VPC peering connection, you first need to get a valid authorization (good for 24
     * hours) by calling <a>CreateVpcPeeringAuthorization</a>. You do not need to explicitly delete the VPC peering
     * connection--this is done as part of the delete fleet process.
     * </p>
     * </note>
     * <p>
     * To delete a fleet, specify the fleet ID to be terminated. During the deletion process the fleet status is changed
     * to <code>DELETING</code>. When completed, the status switches to <code>TERMINATED</code> and the fleet event
     * <code>FLEET_DELETED</code> is sent.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * Fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>UpdateFleetAttributes</a> | <a>UpdateFleetCapacity</a> |
     * <a>UpdateFleetPortSettings</a> | <a>UpdateRuntimeConfiguration</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a>PutScalingPolicy</a> | <a>DeleteFleet</a> | <a>DeleteFleetLocations</a> |
     * <a>DeleteScalingPolicy</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteFleetRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes all resources and information related a fleet. Any current fleet instances, including those in remote
     * locations, are shut down. You don't need to call <code>DeleteFleetLocations</code> separately.
     * </p>
     * <note>
     * <p>
     * If the fleet being deleted has a VPC peering connection, you first need to get a valid authorization (good for 24
     * hours) by calling <a>CreateVpcPeeringAuthorization</a>. You do not need to explicitly delete the VPC peering
     * connection--this is done as part of the delete fleet process.
     * </p>
     * </note>
     * <p>
     * To delete a fleet, specify the fleet ID to be terminated. During the deletion process the fleet status is changed
     * to <code>DELETING</code>. When completed, the status switches to <code>TERMINATED</code> and the fleet event
     * <code>FLEET_DELETED</code> is sent.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * Fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>UpdateFleetAttributes</a> | <a>UpdateFleetCapacity</a> |
     * <a>UpdateFleetPortSettings</a> | <a>UpdateRuntimeConfiguration</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a>PutScalingPolicy</a> | <a>DeleteFleet</a> | <a>DeleteFleetLocations</a> |
     * <a>DeleteScalingPolicy</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteFleetRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler);

    /**
     * <p>
     * Removes locations from a multi-location fleet. When deleting a location, all game server process and all
     * instances that are still active in the location are shut down.
     * </p>
     * <p>
     * To delete fleet locations, identify the fleet ID and provide a list of the locations to be deleted.
     * </p>
     * <p>
     * If successful, GameLift sets the location status to <code>DELETING</code>, and begins to shut down existing
     * server processes and terminate instances in each location being deleted. When completed, the location status
     * changes to <code>TERMINATED</code>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>DescribeFleetLocationAttributes</a> | <a>DescribeFleetLocationCapacity</a> |
     * <a>DescribeFleetLocationUtilization</a> | <a>DescribeFleetAttributes</a> | <a>DescribeFleetCapacity</a> |
     * <a>DescribeFleetUtilization</a> | <a>UpdateFleetCapacity</a> | <a>StopFleetActions</a> |
     * <a>DeleteFleetLocations</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteFleetLocationsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DeleteFleetLocations operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteFleetLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteFleetLocations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetLocationsResult> deleteFleetLocationsAsync(DeleteFleetLocationsRequest deleteFleetLocationsRequest);

    /**
     * <p>
     * Removes locations from a multi-location fleet. When deleting a location, all game server process and all
     * instances that are still active in the location are shut down.
     * </p>
     * <p>
     * To delete fleet locations, identify the fleet ID and provide a list of the locations to be deleted.
     * </p>
     * <p>
     * If successful, GameLift sets the location status to <code>DELETING</code>, and begins to shut down existing
     * server processes and terminate instances in each location being deleted. When completed, the location status
     * changes to <code>TERMINATED</code>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>DescribeFleetLocationAttributes</a> | <a>DescribeFleetLocationCapacity</a> |
     * <a>DescribeFleetLocationUtilization</a> | <a>DescribeFleetAttributes</a> | <a>DescribeFleetCapacity</a> |
     * <a>DescribeFleetUtilization</a> | <a>UpdateFleetCapacity</a> | <a>StopFleetActions</a> |
     * <a>DeleteFleetLocations</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteFleetLocationsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteFleetLocations operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteFleetLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteFleetLocations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetLocationsResult> deleteFleetLocationsAsync(DeleteFleetLocationsRequest deleteFleetLocationsRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteFleetLocationsRequest, DeleteFleetLocationsResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Terminates a game server group and permanently deletes the game server group record. You have several options for
     * how these resources are impacted when deleting the game server group. Depending on the type of delete operation
     * selected, this operation might affect these resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The game server group
     * </p>
     * </li>
     * <li>
     * <p>
     * The corresponding Auto Scaling group
     * </p>
     * </li>
     * <li>
     * <p>
     * All game servers that are currently running in the group
     * </p>
     * </li>
     * </ul>
     * <p>
     * To delete a game server group, identify the game server group to delete and specify the type of delete operation
     * to initiate. Game server groups can only be deleted if they are in <code>ACTIVE</code> or <code>ERROR</code>
     * status.
     * </p>
     * <p>
     * If the delete request is successful, a series of operations are kicked off. The game server group status is
     * changed to <code>DELETE_SCHEDULED</code>, which prevents new game servers from being registered and stops
     * automatic scaling activity. Once all game servers in the game server group are deregistered, GameLift FleetIQ can
     * begin deleting resources. If any of the delete operations fail, the game server group is placed in
     * <code>ERROR</code> status.
     * </p>
     * <p>
     * GameLift FleetIQ emits delete events to Amazon CloudWatch.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param deleteGameServerGroupRequest
     * @return A Java Future containing the result of the DeleteGameServerGroup operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteGameServerGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGameServerGroupResult> deleteGameServerGroupAsync(DeleteGameServerGroupRequest deleteGameServerGroupRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Terminates a game server group and permanently deletes the game server group record. You have several options for
     * how these resources are impacted when deleting the game server group. Depending on the type of delete operation
     * selected, this operation might affect these resources:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The game server group
     * </p>
     * </li>
     * <li>
     * <p>
     * The corresponding Auto Scaling group
     * </p>
     * </li>
     * <li>
     * <p>
     * All game servers that are currently running in the group
     * </p>
     * </li>
     * </ul>
     * <p>
     * To delete a game server group, identify the game server group to delete and specify the type of delete operation
     * to initiate. Game server groups can only be deleted if they are in <code>ACTIVE</code> or <code>ERROR</code>
     * status.
     * </p>
     * <p>
     * If the delete request is successful, a series of operations are kicked off. The game server group status is
     * changed to <code>DELETE_SCHEDULED</code>, which prevents new game servers from being registered and stops
     * automatic scaling activity. Once all game servers in the game server group are deregistered, GameLift FleetIQ can
     * begin deleting resources. If any of the delete operations fail, the game server group is placed in
     * <code>ERROR</code> status.
     * </p>
     * <p>
     * GameLift FleetIQ emits delete events to Amazon CloudWatch.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param deleteGameServerGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGameServerGroup operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteGameServerGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGameServerGroupResult> deleteGameServerGroupAsync(DeleteGameServerGroupRequest deleteGameServerGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGameServerGroupRequest, DeleteGameServerGroupResult> asyncHandler);

    /**
     * <p>
     * Deletes a game session queue. Once a queue is successfully deleted, unfulfilled <a>StartGameSessionPlacement</a>
     * requests that reference the queue will fail. To delete a queue, specify the queue name.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html"> Using Multi-Region
     * Queues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSessionQueue</a> | <a>DescribeGameSessionQueues</a> | <a>UpdateGameSessionQueue</a> |
     * <a>DeleteGameSessionQueue</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteGameSessionQueueRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DeleteGameSessionQueue operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGameSessionQueueResult> deleteGameSessionQueueAsync(DeleteGameSessionQueueRequest deleteGameSessionQueueRequest);

    /**
     * <p>
     * Deletes a game session queue. Once a queue is successfully deleted, unfulfilled <a>StartGameSessionPlacement</a>
     * requests that reference the queue will fail. To delete a queue, specify the queue name.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html"> Using Multi-Region
     * Queues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSessionQueue</a> | <a>DescribeGameSessionQueues</a> | <a>UpdateGameSessionQueue</a> |
     * <a>DeleteGameSessionQueue</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteGameSessionQueueRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteGameSessionQueue operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGameSessionQueueResult> deleteGameSessionQueueAsync(DeleteGameSessionQueueRequest deleteGameSessionQueueRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGameSessionQueueRequest, DeleteGameSessionQueueResult> asyncHandler);

    /**
     * <p>
     * Permanently removes a FlexMatch matchmaking configuration. To delete, specify the configuration name. A
     * matchmaking configuration cannot be deleted if it is being used in any active matchmaking tickets.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteMatchmakingConfigurationRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DeleteMatchmakingConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DeleteMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMatchmakingConfigurationResult> deleteMatchmakingConfigurationAsync(
            DeleteMatchmakingConfigurationRequest deleteMatchmakingConfigurationRequest);

    /**
     * <p>
     * Permanently removes a FlexMatch matchmaking configuration. To delete, specify the configuration name. A
     * matchmaking configuration cannot be deleted if it is being used in any active matchmaking tickets.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteMatchmakingConfigurationRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMatchmakingConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DeleteMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMatchmakingConfigurationResult> deleteMatchmakingConfigurationAsync(
            DeleteMatchmakingConfigurationRequest deleteMatchmakingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMatchmakingConfigurationRequest, DeleteMatchmakingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Deletes an existing matchmaking rule set. To delete the rule set, provide the rule set name. Rule sets cannot be
     * deleted if they are currently being used by a matchmaking configuration.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-rulesets.html">Build a rule set</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteMatchmakingRuleSetRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DeleteMatchmakingRuleSet operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMatchmakingRuleSetResult> deleteMatchmakingRuleSetAsync(DeleteMatchmakingRuleSetRequest deleteMatchmakingRuleSetRequest);

    /**
     * <p>
     * Deletes an existing matchmaking rule set. To delete the rule set, provide the rule set name. Rule sets cannot be
     * deleted if they are currently being used by a matchmaking configuration.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-rulesets.html">Build a rule set</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteMatchmakingRuleSetRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMatchmakingRuleSet operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteMatchmakingRuleSetResult> deleteMatchmakingRuleSetAsync(DeleteMatchmakingRuleSetRequest deleteMatchmakingRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMatchmakingRuleSetRequest, DeleteMatchmakingRuleSetResult> asyncHandler);

    /**
     * <p>
     * Deletes a fleet scaling policy. Once deleted, the policy is no longer in force and GameLift removes all record of
     * it. To delete a scaling policy, specify both the scaling policy name and the fleet ID it is associated with.
     * </p>
     * <p>
     * To temporarily suspend scaling policies, call <a>StopFleetActions</a>. This operation suspends all policies for
     * the fleet.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>DescribeFleetCapacity</a> | <a>UpdateFleetCapacity</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>PutScalingPolicy</a> | <a>DescribeScalingPolicies</a> | <a>DeleteScalingPolicy</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DeleteScalingPolicy operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScalingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest deleteScalingPolicyRequest);

    /**
     * <p>
     * Deletes a fleet scaling policy. Once deleted, the policy is no longer in force and GameLift removes all record of
     * it. To delete a scaling policy, specify both the scaling policy name and the fleet ID it is associated with.
     * </p>
     * <p>
     * To temporarily suspend scaling policies, call <a>StopFleetActions</a>. This operation suspends all policies for
     * the fleet.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>DescribeFleetCapacity</a> | <a>UpdateFleetCapacity</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>PutScalingPolicy</a> | <a>DescribeScalingPolicies</a> | <a>DeleteScalingPolicy</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScalingPolicy operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScalingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest deleteScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScalingPolicyRequest, DeleteScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * Deletes a Realtime script. This operation permanently deletes the script record. If script files were uploaded,
     * they are also deleted (files stored in an S3 bucket are not deleted).
     * </p>
     * <p>
     * To delete a script, specify the script ID. Before deleting a script, be sure to terminate all fleets that are
     * deployed with the script being deleted. Fleet instances periodically check for script updates, and if the script
     * record no longer exists, the instance will go into an error state and be unable to host game sessions.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateScript</a> | <a>ListScripts</a> | <a>DescribeScript</a> | <a>UpdateScript</a> | <a>DeleteScript</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteScriptRequest
     * @return A Java Future containing the result of the DeleteScript operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScript" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteScriptResult> deleteScriptAsync(DeleteScriptRequest deleteScriptRequest);

    /**
     * <p>
     * Deletes a Realtime script. This operation permanently deletes the script record. If script files were uploaded,
     * they are also deleted (files stored in an S3 bucket are not deleted).
     * </p>
     * <p>
     * To delete a script, specify the script ID. Before deleting a script, be sure to terminate all fleets that are
     * deployed with the script being deleted. Fleet instances periodically check for script updates, and if the script
     * record no longer exists, the instance will go into an error state and be unable to host game sessions.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateScript</a> | <a>ListScripts</a> | <a>DescribeScript</a> | <a>UpdateScript</a> | <a>DeleteScript</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteScriptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteScript operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScript" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteScriptResult> deleteScriptAsync(DeleteScriptRequest deleteScriptRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteScriptRequest, DeleteScriptResult> asyncHandler);

    /**
     * <p>
     * Cancels a pending VPC peering authorization for the specified VPC. If you need to delete an existing VPC peering
     * connection, call <a>DeleteVpcPeeringConnection</a>.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a> | <a>DescribeVpcPeeringAuthorizations</a> |
     * <a>DeleteVpcPeeringAuthorization</a> | <a>CreateVpcPeeringConnection</a> | <a>DescribeVpcPeeringConnections</a> |
     * <a>DeleteVpcPeeringConnection</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteVpcPeeringAuthorizationRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DeleteVpcPeeringAuthorization operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DeleteVpcPeeringAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteVpcPeeringAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcPeeringAuthorizationResult> deleteVpcPeeringAuthorizationAsync(
            DeleteVpcPeeringAuthorizationRequest deleteVpcPeeringAuthorizationRequest);

    /**
     * <p>
     * Cancels a pending VPC peering authorization for the specified VPC. If you need to delete an existing VPC peering
     * connection, call <a>DeleteVpcPeeringConnection</a>.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a> | <a>DescribeVpcPeeringAuthorizations</a> |
     * <a>DeleteVpcPeeringAuthorization</a> | <a>CreateVpcPeeringConnection</a> | <a>DescribeVpcPeeringConnections</a> |
     * <a>DeleteVpcPeeringConnection</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteVpcPeeringAuthorizationRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpcPeeringAuthorization operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DeleteVpcPeeringAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteVpcPeeringAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcPeeringAuthorizationResult> deleteVpcPeeringAuthorizationAsync(
            DeleteVpcPeeringAuthorizationRequest deleteVpcPeeringAuthorizationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcPeeringAuthorizationRequest, DeleteVpcPeeringAuthorizationResult> asyncHandler);

    /**
     * <p>
     * Removes a VPC peering connection. To delete the connection, you must have a valid authorization for the VPC
     * peering connection that you want to delete. You can check for an authorization by calling
     * <a>DescribeVpcPeeringAuthorizations</a> or request a new one using <a>CreateVpcPeeringAuthorization</a>.
     * </p>
     * <p>
     * Once a valid authorization exists, call this operation from the AWS account that is used to manage the Amazon
     * GameLift fleets. Identify the connection to delete by the connection ID and fleet ID. If successful, the
     * connection is removed.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a> | <a>DescribeVpcPeeringAuthorizations</a> |
     * <a>DeleteVpcPeeringAuthorization</a> | <a>CreateVpcPeeringConnection</a> | <a>DescribeVpcPeeringConnections</a> |
     * <a>DeleteVpcPeeringConnection</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteVpcPeeringConnectionRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DeleteVpcPeeringConnection operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteVpcPeeringConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(
            DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest);

    /**
     * <p>
     * Removes a VPC peering connection. To delete the connection, you must have a valid authorization for the VPC
     * peering connection that you want to delete. You can check for an authorization by calling
     * <a>DescribeVpcPeeringAuthorizations</a> or request a new one using <a>CreateVpcPeeringAuthorization</a>.
     * </p>
     * <p>
     * Once a valid authorization exists, call this operation from the AWS account that is used to manage the Amazon
     * GameLift fleets. Identify the connection to delete by the connection ID and fleet ID. If successful, the
     * connection is removed.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a> | <a>DescribeVpcPeeringAuthorizations</a> |
     * <a>DeleteVpcPeeringAuthorization</a> | <a>CreateVpcPeeringConnection</a> | <a>DescribeVpcPeeringConnections</a> |
     * <a>DeleteVpcPeeringConnection</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteVpcPeeringConnectionRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteVpcPeeringConnection operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteVpcPeeringConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(
            DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVpcPeeringConnectionRequest, DeleteVpcPeeringConnectionResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Removes the game server from a game server group. As a result of this operation, the deregistered game server can
     * no longer be claimed and will not be returned in a list of active game servers.
     * </p>
     * <p>
     * To deregister a game server, specify the game server group and game server ID. If successful, this operation
     * emits a CloudWatch event with termination timestamp and reason.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>RegisterGameServer</a> | <a>ListGameServers</a> | <a>ClaimGameServer</a> | <a>DescribeGameServer</a> |
     * <a>UpdateGameServer</a> | <a>DeregisterGameServer</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param deregisterGameServerRequest
     * @return A Java Future containing the result of the DeregisterGameServer operation returned by the service.
     * @sample AmazonGameLiftAsync.DeregisterGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeregisterGameServer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterGameServerResult> deregisterGameServerAsync(DeregisterGameServerRequest deregisterGameServerRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Removes the game server from a game server group. As a result of this operation, the deregistered game server can
     * no longer be claimed and will not be returned in a list of active game servers.
     * </p>
     * <p>
     * To deregister a game server, specify the game server group and game server ID. If successful, this operation
     * emits a CloudWatch event with termination timestamp and reason.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>RegisterGameServer</a> | <a>ListGameServers</a> | <a>ClaimGameServer</a> | <a>DescribeGameServer</a> |
     * <a>UpdateGameServer</a> | <a>DeregisterGameServer</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param deregisterGameServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterGameServer operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeregisterGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeregisterGameServer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeregisterGameServerResult> deregisterGameServerAsync(DeregisterGameServerRequest deregisterGameServerRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterGameServerRequest, DeregisterGameServerResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for an alias. This operation returns all alias metadata and settings. To get an alias's
     * target fleet ID only, use <code>ResolveAlias</code>.
     * </p>
     * <p>
     * To get alias properties, specify the alias ID. If successful, the requested alias record is returned.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateAlias</a> | <a>ListAliases</a> | <a>DescribeAlias</a> | <a>UpdateAlias</a> | <a>DeleteAlias</a> |
     * <a>ResolveAlias</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeAliasRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeAlias operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAliasResult> describeAliasAsync(DescribeAliasRequest describeAliasRequest);

    /**
     * <p>
     * Retrieves properties for an alias. This operation returns all alias metadata and settings. To get an alias's
     * target fleet ID only, use <code>ResolveAlias</code>.
     * </p>
     * <p>
     * To get alias properties, specify the alias ID. If successful, the requested alias record is returned.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateAlias</a> | <a>ListAliases</a> | <a>DescribeAlias</a> | <a>UpdateAlias</a> | <a>DeleteAlias</a> |
     * <a>ResolveAlias</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeAliasRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAlias operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeAliasResult> describeAliasAsync(DescribeAliasRequest describeAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAliasRequest, DescribeAliasResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for a custom game build. To request a build resource, specify a build ID. If successful, an
     * object containing the build properties is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html"> Upload a Custom
     * Server Build</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateBuild</a> | <a>ListBuilds</a> | <a>DescribeBuild</a> | <a>UpdateBuild</a> | <a>DeleteBuild</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeBuildRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeBuild operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBuildResult> describeBuildAsync(DescribeBuildRequest describeBuildRequest);

    /**
     * <p>
     * Retrieves properties for a custom game build. To request a build resource, specify a build ID. If successful, an
     * object containing the build properties is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html"> Upload a Custom
     * Server Build</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateBuild</a> | <a>ListBuilds</a> | <a>DescribeBuild</a> | <a>UpdateBuild</a> | <a>DeleteBuild</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeBuildRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeBuild operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeBuildResult> describeBuildAsync(DescribeBuildRequest describeBuildRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeBuildRequest, DescribeBuildResult> asyncHandler);

    /**
     * <p>
     * The GameLift service limits and current utilization for an AWS Region or location. Instance limits control the
     * number of instances, per instance type, per location, that your AWS account can use. Learn more at <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a>. The information returned includes
     * the maximum number of instances allowed and your account's current usage across all fleets. This information can
     * affect your ability to scale your GameLift fleets. You can request a limit increase for your account by using the
     * <b>Service limits</b> page in the GameLift console.
     * </p>
     * <p>
     * Instance limits differ based on whether the instances are deployed in a fleet's home Region or in a remote
     * location. For remote locations, limits also differ based on the combination of home Region and remote location.
     * All requests must specify an AWS Region (either explicitly or as your default settings). To get the limit for a
     * remote location, you must also specify the location. For example, the following requests all return different
     * results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Request specifies the Region <code>ap-northeast-1</code> with no location. The result is limits and usage data on
     * all instance types that are deployed in <code>us-east-2</code>, by all of the fleets that reside in
     * <code>ap-northeast-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Request specifies the Region <code>us-east-1</code> with location <code>ca-central-1</code>. The result is limits
     * and usage data on all instance types that are deployed in <code>ca-central-1</code>, by all of the fleets that
     * reside in <code>us-east-2</code>. These limits do not affect fleets in any other Regions that deploy instances to
     * <code>ca-central-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Request specifies the Region <code>eu-west-1</code> with location <code>ca-central-1</code>. The result is limits
     * and usage data on all instance types that are deployed in <code>ca-central-1</code>, by all of the fleets that
     * reside in <code>eu-west-1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get limit and usage data for all instance types that are deployed in an AWS Region by fleets that reside in
     * the same Region: Specify the Region only. Optionally, specify a single instance type to retrieve information for.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get limit and usage data for all instance types that are deployed to a remote location by fleets that reside
     * in different AWS Region: Provide both the AWS Region and the remote location. Optionally, specify a single
     * instance type to retrieve information for.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, an <code>EC2InstanceLimits</code> object is returned with limits and usage data for each requested
     * instance type.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleet</a> | <a>UpdateFleetCapacity</a> | <a>PutScalingPolicy</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>DescribeFleetAttributes</a> | <a>DescribeFleetLocationAttributes</a> | <a>UpdateFleetAttributes</a> |
     * <a>StopFleetActions</a> | <a>DeleteFleet</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeEC2InstanceLimitsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeEC2InstanceLimits operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeEC2InstanceLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeEC2InstanceLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEC2InstanceLimitsResult> describeEC2InstanceLimitsAsync(
            DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest);

    /**
     * <p>
     * The GameLift service limits and current utilization for an AWS Region or location. Instance limits control the
     * number of instances, per instance type, per location, that your AWS account can use. Learn more at <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a>. The information returned includes
     * the maximum number of instances allowed and your account's current usage across all fleets. This information can
     * affect your ability to scale your GameLift fleets. You can request a limit increase for your account by using the
     * <b>Service limits</b> page in the GameLift console.
     * </p>
     * <p>
     * Instance limits differ based on whether the instances are deployed in a fleet's home Region or in a remote
     * location. For remote locations, limits also differ based on the combination of home Region and remote location.
     * All requests must specify an AWS Region (either explicitly or as your default settings). To get the limit for a
     * remote location, you must also specify the location. For example, the following requests all return different
     * results:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Request specifies the Region <code>ap-northeast-1</code> with no location. The result is limits and usage data on
     * all instance types that are deployed in <code>us-east-2</code>, by all of the fleets that reside in
     * <code>ap-northeast-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Request specifies the Region <code>us-east-1</code> with location <code>ca-central-1</code>. The result is limits
     * and usage data on all instance types that are deployed in <code>ca-central-1</code>, by all of the fleets that
     * reside in <code>us-east-2</code>. These limits do not affect fleets in any other Regions that deploy instances to
     * <code>ca-central-1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Request specifies the Region <code>eu-west-1</code> with location <code>ca-central-1</code>. The result is limits
     * and usage data on all instance types that are deployed in <code>ca-central-1</code>, by all of the fleets that
     * reside in <code>eu-west-1</code>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get limit and usage data for all instance types that are deployed in an AWS Region by fleets that reside in
     * the same Region: Specify the Region only. Optionally, specify a single instance type to retrieve information for.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get limit and usage data for all instance types that are deployed to a remote location by fleets that reside
     * in different AWS Region: Provide both the AWS Region and the remote location. Optionally, specify a single
     * instance type to retrieve information for.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, an <code>EC2InstanceLimits</code> object is returned with limits and usage data for each requested
     * instance type.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleet</a> | <a>UpdateFleetCapacity</a> | <a>PutScalingPolicy</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>DescribeFleetAttributes</a> | <a>DescribeFleetLocationAttributes</a> | <a>UpdateFleetAttributes</a> |
     * <a>StopFleetActions</a> | <a>DeleteFleet</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeEC2InstanceLimitsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeEC2InstanceLimits operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeEC2InstanceLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeEC2InstanceLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEC2InstanceLimitsResult> describeEC2InstanceLimitsAsync(
            DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeEC2InstanceLimitsRequest, DescribeEC2InstanceLimitsResult> asyncHandler);

    /**
     * <p>
     * Retrieves core fleet-wide properties, including the computing hardware and deployment configuration for all
     * instances in the fleet.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get attributes for one or more specific fleets, provide a list of fleet IDs or fleet ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get attributes for all fleets, do not provide a fleet identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When requesting attributes for multiple fleets, use the pagination parameters to retrieve results as a set of
     * sequential pages.
     * </p>
     * <p>
     * If successful, a <code>FleetAttributes</code> object is returned for each fleet requested, unless the fleet
     * identifier is not found.
     * </p>
     * <note>
     * <p>
     * Some API operations limit the number of fleet IDs that allowed in one request. If a request exceeds this limit,
     * the request fails and the error message contains the maximum allowed number.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>ListFleets</a> | <a>DescribeEC2InstanceLimits</a> | <a>DescribeFleetAttributes</a> |
     * <a>DescribeFleetCapacity</a> | <a>DescribeFleetEvents</a> | <a>DescribeFleetLocationAttributes</a> |
     * <a>DescribeFleetPortSettings</a> | <a>DescribeFleetUtilization</a> | <a>DescribeRuntimeConfiguration</a> |
     * <a>DescribeScalingPolicies</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetAttributesRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetAttributesResult> describeFleetAttributesAsync(DescribeFleetAttributesRequest describeFleetAttributesRequest);

    /**
     * <p>
     * Retrieves core fleet-wide properties, including the computing hardware and deployment configuration for all
     * instances in the fleet.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get attributes for one or more specific fleets, provide a list of fleet IDs or fleet ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get attributes for all fleets, do not provide a fleet identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When requesting attributes for multiple fleets, use the pagination parameters to retrieve results as a set of
     * sequential pages.
     * </p>
     * <p>
     * If successful, a <code>FleetAttributes</code> object is returned for each fleet requested, unless the fleet
     * identifier is not found.
     * </p>
     * <note>
     * <p>
     * Some API operations limit the number of fleet IDs that allowed in one request. If a request exceeds this limit,
     * the request fails and the error message contains the maximum allowed number.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>ListFleets</a> | <a>DescribeEC2InstanceLimits</a> | <a>DescribeFleetAttributes</a> |
     * <a>DescribeFleetCapacity</a> | <a>DescribeFleetEvents</a> | <a>DescribeFleetLocationAttributes</a> |
     * <a>DescribeFleetPortSettings</a> | <a>DescribeFleetUtilization</a> | <a>DescribeRuntimeConfiguration</a> |
     * <a>DescribeScalingPolicies</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetAttributesRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetAttributesResult> describeFleetAttributesAsync(DescribeFleetAttributesRequest describeFleetAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetAttributesRequest, DescribeFleetAttributesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the resource capacity settings for one or more fleets. The data returned includes the current fleet
     * capacity (number of EC2 instances), and settings that can control how capacity scaling. For fleets with remote
     * locations, this operation retrieves data for the fleet's home Region only. See
     * <a>DescribeFleetLocationCapacity</a> to get capacity settings for a fleet's remote locations.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get capacity data for one or more specific fleets, provide a list of fleet IDs or fleet ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get capacity data for all fleets, do not provide a fleet identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a <a>FleetCapacity</a> object is returned for each requested fleet ID. Each FleetCapacity object
     * includes a <code>Location</code> property, which is set to the fleet's home Region. When a list of fleet IDs is
     * provided, attribute objects are returned only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API operations may limit the number of fleet IDs that are allowed in one request. If a request exceeds this
     * limit, the request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift metrics for fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>ListFleets</a> | <a>DescribeEC2InstanceLimits</a> | <a>DescribeFleetAttributes</a> |
     * <a>DescribeFleetCapacity</a> | <a>DescribeFleetEvents</a> | <a>DescribeFleetLocationAttributes</a> |
     * <a>DescribeFleetPortSettings</a> | <a>DescribeFleetUtilization</a> | <a>DescribeRuntimeConfiguration</a> |
     * <a>DescribeScalingPolicies</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetCapacityRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeFleetCapacity operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetCapacityResult> describeFleetCapacityAsync(DescribeFleetCapacityRequest describeFleetCapacityRequest);

    /**
     * <p>
     * Retrieves the resource capacity settings for one or more fleets. The data returned includes the current fleet
     * capacity (number of EC2 instances), and settings that can control how capacity scaling. For fleets with remote
     * locations, this operation retrieves data for the fleet's home Region only. See
     * <a>DescribeFleetLocationCapacity</a> to get capacity settings for a fleet's remote locations.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get capacity data for one or more specific fleets, provide a list of fleet IDs or fleet ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get capacity data for all fleets, do not provide a fleet identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a <a>FleetCapacity</a> object is returned for each requested fleet ID. Each FleetCapacity object
     * includes a <code>Location</code> property, which is set to the fleet's home Region. When a list of fleet IDs is
     * provided, attribute objects are returned only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API operations may limit the number of fleet IDs that are allowed in one request. If a request exceeds this
     * limit, the request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift metrics for fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>ListFleets</a> | <a>DescribeEC2InstanceLimits</a> | <a>DescribeFleetAttributes</a> |
     * <a>DescribeFleetCapacity</a> | <a>DescribeFleetEvents</a> | <a>DescribeFleetLocationAttributes</a> |
     * <a>DescribeFleetPortSettings</a> | <a>DescribeFleetUtilization</a> | <a>DescribeRuntimeConfiguration</a> |
     * <a>DescribeScalingPolicies</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetCapacityRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetCapacity operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetCapacityResult> describeFleetCapacityAsync(DescribeFleetCapacityRequest describeFleetCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetCapacityRequest, DescribeFleetCapacityResult> asyncHandler);

    /**
     * <p>
     * Retrieves entries from a fleet's event log. Fleet events are initiated by changes in status, such as during fleet
     * creation and termination, changes in capacity, etc. If a fleet has multiple locations, events are also initiated
     * by changes to status and capacity in remote locations.
     * </p>
     * <p>
     * You can specify a time range to limit the result set. Use the pagination parameters to retrieve results as a set
     * of sequential pages.
     * </p>
     * <p>
     * If successful, a collection of event log entries matching the request are returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>ListFleets</a> | <a>DescribeEC2InstanceLimits</a> | <a>DescribeFleetAttributes</a> |
     * <a>DescribeFleetCapacity</a> | <a>DescribeFleetEvents</a> | <a>DescribeFleetLocationAttributes</a> |
     * <a>DescribeFleetPortSettings</a> | <a>DescribeFleetUtilization</a> | <a>DescribeRuntimeConfiguration</a> |
     * <a>DescribeScalingPolicies</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetEventsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeFleetEvents operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetEventsResult> describeFleetEventsAsync(DescribeFleetEventsRequest describeFleetEventsRequest);

    /**
     * <p>
     * Retrieves entries from a fleet's event log. Fleet events are initiated by changes in status, such as during fleet
     * creation and termination, changes in capacity, etc. If a fleet has multiple locations, events are also initiated
     * by changes to status and capacity in remote locations.
     * </p>
     * <p>
     * You can specify a time range to limit the result set. Use the pagination parameters to retrieve results as a set
     * of sequential pages.
     * </p>
     * <p>
     * If successful, a collection of event log entries matching the request are returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>ListFleets</a> | <a>DescribeEC2InstanceLimits</a> | <a>DescribeFleetAttributes</a> |
     * <a>DescribeFleetCapacity</a> | <a>DescribeFleetEvents</a> | <a>DescribeFleetLocationAttributes</a> |
     * <a>DescribeFleetPortSettings</a> | <a>DescribeFleetUtilization</a> | <a>DescribeRuntimeConfiguration</a> |
     * <a>DescribeScalingPolicies</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetEventsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetEvents operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetEvents" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetEventsResult> describeFleetEventsAsync(DescribeFleetEventsRequest describeFleetEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetEventsRequest, DescribeFleetEventsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information on a fleet's remote locations, including life-cycle status and any suspended fleet
     * activity.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get data for specific locations, provide a fleet identifier and a list of locations. Location data is returned
     * in the order that it is requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get data for all locations, provide a fleet identifier only. Location data is returned in no particular order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When requesting attributes for multiple locations, use the pagination parameters to retrieve results as a set of
     * sequential pages.
     * </p>
     * <p>
     * If successful, a <code>LocationAttributes</code> object is returned for each requested location. If the fleet
     * does not have a requested location, no information is returned. This operation does not return the home Region.
     * To get information on a fleet's home Region, call <code>DescribeFleetAttributes</code>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>DescribeFleetLocationAttributes</a> | <a>DescribeFleetLocationCapacity</a> |
     * <a>DescribeFleetLocationUtilization</a> | <a>DescribeFleetAttributes</a> | <a>DescribeFleetCapacity</a> |
     * <a>DescribeFleetUtilization</a> | <a>UpdateFleetCapacity</a> | <a>StopFleetActions</a> |
     * <a>DeleteFleetLocations</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetLocationAttributesRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeFleetLocationAttributes operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeFleetLocationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetLocationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetLocationAttributesResult> describeFleetLocationAttributesAsync(
            DescribeFleetLocationAttributesRequest describeFleetLocationAttributesRequest);

    /**
     * <p>
     * Retrieves information on a fleet's remote locations, including life-cycle status and any suspended fleet
     * activity.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get data for specific locations, provide a fleet identifier and a list of locations. Location data is returned
     * in the order that it is requested.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get data for all locations, provide a fleet identifier only. Location data is returned in no particular order.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When requesting attributes for multiple locations, use the pagination parameters to retrieve results as a set of
     * sequential pages.
     * </p>
     * <p>
     * If successful, a <code>LocationAttributes</code> object is returned for each requested location. If the fleet
     * does not have a requested location, no information is returned. This operation does not return the home Region.
     * To get information on a fleet's home Region, call <code>DescribeFleetAttributes</code>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>DescribeFleetLocationAttributes</a> | <a>DescribeFleetLocationCapacity</a> |
     * <a>DescribeFleetLocationUtilization</a> | <a>DescribeFleetAttributes</a> | <a>DescribeFleetCapacity</a> |
     * <a>DescribeFleetUtilization</a> | <a>UpdateFleetCapacity</a> | <a>StopFleetActions</a> |
     * <a>DeleteFleetLocations</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetLocationAttributesRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetLocationAttributes operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetLocationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetLocationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetLocationAttributesResult> describeFleetLocationAttributesAsync(
            DescribeFleetLocationAttributesRequest describeFleetLocationAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetLocationAttributesRequest, DescribeFleetLocationAttributesResult> asyncHandler);

    /**
     * <p>
     * Retrieves the resource capacity settings for a fleet location. The data returned includes the current capacity
     * (number of EC2 instances) and some scaling settings for the requested fleet location. Use this operation to
     * retrieve capacity information for a fleet's remote location or home Region (you can also retrieve home Region
     * capacity by calling <code>DescribeFleetCapacity</code>).
     * </p>
     * <p>
     * To retrieve capacity data, identify a fleet and location.
     * </p>
     * <p>
     * If successful, a <code>FleetCapacity</code> object is returned for the requested fleet location.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift metrics for fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>DescribeFleetLocationAttributes</a> | <a>DescribeFleetLocationCapacity</a> |
     * <a>DescribeFleetLocationUtilization</a> | <a>DescribeFleetAttributes</a> | <a>DescribeFleetCapacity</a> |
     * <a>DescribeFleetUtilization</a> | <a>UpdateFleetCapacity</a> | <a>StopFleetActions</a> |
     * <a>DeleteFleetLocations</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetLocationCapacityRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeFleetLocationCapacity operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeFleetLocationCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetLocationCapacity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetLocationCapacityResult> describeFleetLocationCapacityAsync(
            DescribeFleetLocationCapacityRequest describeFleetLocationCapacityRequest);

    /**
     * <p>
     * Retrieves the resource capacity settings for a fleet location. The data returned includes the current capacity
     * (number of EC2 instances) and some scaling settings for the requested fleet location. Use this operation to
     * retrieve capacity information for a fleet's remote location or home Region (you can also retrieve home Region
     * capacity by calling <code>DescribeFleetCapacity</code>).
     * </p>
     * <p>
     * To retrieve capacity data, identify a fleet and location.
     * </p>
     * <p>
     * If successful, a <code>FleetCapacity</code> object is returned for the requested fleet location.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift metrics for fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>DescribeFleetLocationAttributes</a> | <a>DescribeFleetLocationCapacity</a> |
     * <a>DescribeFleetLocationUtilization</a> | <a>DescribeFleetAttributes</a> | <a>DescribeFleetCapacity</a> |
     * <a>DescribeFleetUtilization</a> | <a>UpdateFleetCapacity</a> | <a>StopFleetActions</a> |
     * <a>DeleteFleetLocations</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetLocationCapacityRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetLocationCapacity operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetLocationCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetLocationCapacity"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetLocationCapacityResult> describeFleetLocationCapacityAsync(
            DescribeFleetLocationCapacityRequest describeFleetLocationCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetLocationCapacityRequest, DescribeFleetLocationCapacityResult> asyncHandler);

    /**
     * <p>
     * Retrieves current usage data for a fleet location. Utilization data provides a snapshot of current game hosting
     * activity at the requested location. Use this operation to retrieve utilization information for a fleet's remote
     * location or home Region (you can also retrieve home Region utilization by calling
     * <code>DescribeFleetUtilization</code>).
     * </p>
     * <p>
     * To retrieve utilization data, identify a fleet and location.
     * </p>
     * <p>
     * If successful, a <code>FleetUtilization</code> object is returned for the requested fleet location.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift metrics for fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>DescribeFleetLocationAttributes</a> | <a>DescribeFleetLocationCapacity</a> |
     * <a>DescribeFleetLocationUtilization</a> | <a>DescribeFleetAttributes</a> | <a>DescribeFleetCapacity</a> |
     * <a>DescribeFleetUtilization</a> | <a>UpdateFleetCapacity</a> | <a>StopFleetActions</a> |
     * <a>DeleteFleetLocations</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetLocationUtilizationRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeFleetLocationUtilization operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeFleetLocationUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetLocationUtilization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetLocationUtilizationResult> describeFleetLocationUtilizationAsync(
            DescribeFleetLocationUtilizationRequest describeFleetLocationUtilizationRequest);

    /**
     * <p>
     * Retrieves current usage data for a fleet location. Utilization data provides a snapshot of current game hosting
     * activity at the requested location. Use this operation to retrieve utilization information for a fleet's remote
     * location or home Region (you can also retrieve home Region utilization by calling
     * <code>DescribeFleetUtilization</code>).
     * </p>
     * <p>
     * To retrieve utilization data, identify a fleet and location.
     * </p>
     * <p>
     * If successful, a <code>FleetUtilization</code> object is returned for the requested fleet location.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift metrics for fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>DescribeFleetLocationAttributes</a> | <a>DescribeFleetLocationCapacity</a> |
     * <a>DescribeFleetLocationUtilization</a> | <a>DescribeFleetAttributes</a> | <a>DescribeFleetCapacity</a> |
     * <a>DescribeFleetUtilization</a> | <a>UpdateFleetCapacity</a> | <a>StopFleetActions</a> |
     * <a>DeleteFleetLocations</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetLocationUtilizationRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetLocationUtilization operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetLocationUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetLocationUtilization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetLocationUtilizationResult> describeFleetLocationUtilizationAsync(
            DescribeFleetLocationUtilizationRequest describeFleetLocationUtilizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetLocationUtilizationRequest, DescribeFleetLocationUtilizationResult> asyncHandler);

    /**
     * <p>
     * Retrieves a fleet's inbound connection permissions. Connection permissions specify the range of IP addresses and
     * port settings that incoming traffic can use to access server processes in the fleet. Game sessions that are
     * running on instances in the fleet must use connections that fall in this range.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve the inbound connection permissions for a fleet, identify the fleet's unique identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * To check the status of recent updates to a fleet remote location, specify the fleet ID and a location. Port
     * setting updates can take time to propagate across all locations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, a set of <a>IpPermission</a> objects is returned for the requested fleet ID. When a location is
     * specified, a pending status is included. If the requested fleet has been deleted, the result set is empty.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>ListFleets</a> | <a>DescribeEC2InstanceLimits</a> | <a>DescribeFleetAttributes</a> |
     * <a>DescribeFleetCapacity</a> | <a>DescribeFleetEvents</a> | <a>DescribeFleetLocationAttributes</a> |
     * <a>DescribeFleetPortSettings</a> | <a>DescribeFleetUtilization</a> | <a>DescribeRuntimeConfiguration</a> |
     * <a>DescribeScalingPolicies</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetPortSettingsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetPortSettingsResult> describeFleetPortSettingsAsync(
            DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest);

    /**
     * <p>
     * Retrieves a fleet's inbound connection permissions. Connection permissions specify the range of IP addresses and
     * port settings that incoming traffic can use to access server processes in the fleet. Game sessions that are
     * running on instances in the fleet must use connections that fall in this range.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve the inbound connection permissions for a fleet, identify the fleet's unique identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * To check the status of recent updates to a fleet remote location, specify the fleet ID and a location. Port
     * setting updates can take time to propagate across all locations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, a set of <a>IpPermission</a> objects is returned for the requested fleet ID. When a location is
     * specified, a pending status is included. If the requested fleet has been deleted, the result set is empty.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>ListFleets</a> | <a>DescribeEC2InstanceLimits</a> | <a>DescribeFleetAttributes</a> |
     * <a>DescribeFleetCapacity</a> | <a>DescribeFleetEvents</a> | <a>DescribeFleetLocationAttributes</a> |
     * <a>DescribeFleetPortSettings</a> | <a>DescribeFleetUtilization</a> | <a>DescribeRuntimeConfiguration</a> |
     * <a>DescribeScalingPolicies</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetPortSettingsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetPortSettingsResult> describeFleetPortSettingsAsync(
            DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetPortSettingsRequest, DescribeFleetPortSettingsResult> asyncHandler);

    /**
     * <p>
     * Retrieves utilization statistics for one or more fleets. Utilization data provides a snapshot of how the fleet's
     * hosting resources are currently being used. For fleets with remote locations, this operation retrieves data for
     * the fleet's home Region only. See <a>DescribeFleetLocationUtilization</a> to get utilization statistics for a
     * fleet's remote locations.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get utilization data for one or more specific fleets, provide a list of fleet IDs or fleet ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get utilization data for all fleets, do not provide a fleet identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a <a>FleetUtilization</a> object is returned for each requested fleet ID, unless the fleet
     * identifier is not found. Each fleet utilization object includes a <code>Location</code> property, which is set to
     * the fleet's home Region.
     * </p>
     * <note>
     * <p>
     * Some API operations may limit the number of fleet IDs allowed in one request. If a request exceeds this limit,
     * the request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * Fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift Metrics for Fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>ListFleets</a> | <a>DescribeEC2InstanceLimits</a> | <a>DescribeFleetAttributes</a> |
     * <a>DescribeFleetCapacity</a> | <a>DescribeFleetEvents</a> | <a>DescribeFleetLocationAttributes</a> |
     * <a>DescribeFleetPortSettings</a> | <a>DescribeFleetUtilization</a> | <a>DescribeRuntimeConfiguration</a> |
     * <a>DescribeScalingPolicies</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetUtilizationRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeFleetUtilization operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetUtilization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetUtilizationResult> describeFleetUtilizationAsync(DescribeFleetUtilizationRequest describeFleetUtilizationRequest);

    /**
     * <p>
     * Retrieves utilization statistics for one or more fleets. Utilization data provides a snapshot of how the fleet's
     * hosting resources are currently being used. For fleets with remote locations, this operation retrieves data for
     * the fleet's home Region only. See <a>DescribeFleetLocationUtilization</a> to get utilization statistics for a
     * fleet's remote locations.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get utilization data for one or more specific fleets, provide a list of fleet IDs or fleet ARNs.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get utilization data for all fleets, do not provide a fleet identifier.
     * </p>
     * </li>
     * </ul>
     * <p>
     * When requesting multiple fleets, use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a <a>FleetUtilization</a> object is returned for each requested fleet ID, unless the fleet
     * identifier is not found. Each fleet utilization object includes a <code>Location</code> property, which is set to
     * the fleet's home Region.
     * </p>
     * <note>
     * <p>
     * Some API operations may limit the number of fleet IDs allowed in one request. If a request exceeds this limit,
     * the request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * Fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift Metrics for Fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>ListFleets</a> | <a>DescribeEC2InstanceLimits</a> | <a>DescribeFleetAttributes</a> |
     * <a>DescribeFleetCapacity</a> | <a>DescribeFleetEvents</a> | <a>DescribeFleetLocationAttributes</a> |
     * <a>DescribeFleetPortSettings</a> | <a>DescribeFleetUtilization</a> | <a>DescribeRuntimeConfiguration</a> |
     * <a>DescribeScalingPolicies</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeFleetUtilizationRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeFleetUtilization operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeFleetUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetUtilization"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetUtilizationResult> describeFleetUtilizationAsync(DescribeFleetUtilizationRequest describeFleetUtilizationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeFleetUtilizationRequest, DescribeFleetUtilizationResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves information for a registered game server. Information includes game server status, health check info,
     * and the instance that the game server is running on.
     * </p>
     * <p>
     * To retrieve game server information, specify the game server ID. If successful, the requested game server object
     * is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>RegisterGameServer</a> | <a>ListGameServers</a> | <a>ClaimGameServer</a> | <a>DescribeGameServer</a> |
     * <a>UpdateGameServer</a> | <a>DeregisterGameServer</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param describeGameServerRequest
     * @return A Java Future containing the result of the DescribeGameServer operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameServerResult> describeGameServerAsync(DescribeGameServerRequest describeGameServerRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves information for a registered game server. Information includes game server status, health check info,
     * and the instance that the game server is running on.
     * </p>
     * <p>
     * To retrieve game server information, specify the game server ID. If successful, the requested game server object
     * is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>RegisterGameServer</a> | <a>ListGameServers</a> | <a>ClaimGameServer</a> | <a>DescribeGameServer</a> |
     * <a>UpdateGameServer</a> | <a>DeregisterGameServer</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param describeGameServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGameServer operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameServerResult> describeGameServerAsync(DescribeGameServerRequest describeGameServerRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameServerRequest, DescribeGameServerResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves information on a game server group. This operation returns only properties related to GameLift FleetIQ.
     * To view or update properties for the corresponding Auto Scaling group, such as launch template, auto scaling
     * policies, and maximum/minimum group size, access the Auto Scaling group directly.
     * </p>
     * <p>
     * To get attributes for a game server group, provide a group name or ARN value. If successful, a
     * <a>GameServerGroup</a> object is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param describeGameServerGroupRequest
     * @return A Java Future containing the result of the DescribeGameServerGroup operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServerGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameServerGroupResult> describeGameServerGroupAsync(DescribeGameServerGroupRequest describeGameServerGroupRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves information on a game server group. This operation returns only properties related to GameLift FleetIQ.
     * To view or update properties for the corresponding Auto Scaling group, such as launch template, auto scaling
     * policies, and maximum/minimum group size, access the Auto Scaling group directly.
     * </p>
     * <p>
     * To get attributes for a game server group, provide a group name or ARN value. If successful, a
     * <a>GameServerGroup</a> object is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param describeGameServerGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGameServerGroup operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServerGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameServerGroupResult> describeGameServerGroupAsync(DescribeGameServerGroupRequest describeGameServerGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameServerGroupRequest, DescribeGameServerGroupResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves status information about the Amazon EC2 instances associated with a GameLift FleetIQ game server group.
     * Use this operation to detect when instances are active or not available to host new game servers. If you are
     * looking for instance configuration information, call <a>DescribeGameServerGroup</a> or access the corresponding
     * Auto Scaling group properties.
     * </p>
     * <p>
     * To request status for all instances in the game server group, provide a game server group ID only. To request
     * status for specific instances, provide the game server group ID and one or more instance IDs. Use the pagination
     * parameters to retrieve results in sequential segments. If successful, a collection of
     * <code>GameServerInstance</code> objects is returned.
     * </p>
     * <p>
     * This operation is not designed to be called with every game server claim request; this practice can cause you to
     * exceed your API limit, which results in errors. Instead, as a best practice, cache the results and refresh your
     * cache no more than once every 10 seconds.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param describeGameServerInstancesRequest
     * @return A Java Future containing the result of the DescribeGameServerInstances operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeGameServerInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServerInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameServerInstancesResult> describeGameServerInstancesAsync(
            DescribeGameServerInstancesRequest describeGameServerInstancesRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves status information about the Amazon EC2 instances associated with a GameLift FleetIQ game server group.
     * Use this operation to detect when instances are active or not available to host new game servers. If you are
     * looking for instance configuration information, call <a>DescribeGameServerGroup</a> or access the corresponding
     * Auto Scaling group properties.
     * </p>
     * <p>
     * To request status for all instances in the game server group, provide a game server group ID only. To request
     * status for specific instances, provide the game server group ID and one or more instance IDs. Use the pagination
     * parameters to retrieve results in sequential segments. If successful, a collection of
     * <code>GameServerInstance</code> objects is returned.
     * </p>
     * <p>
     * This operation is not designed to be called with every game server claim request; this practice can cause you to
     * exceed your API limit, which results in errors. Instead, as a best practice, cache the results and refresh your
     * cache no more than once every 10 seconds.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param describeGameServerInstancesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGameServerInstances operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameServerInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServerInstances"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameServerInstancesResult> describeGameServerInstancesAsync(
            DescribeGameServerInstancesRequest describeGameServerInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameServerInstancesRequest, DescribeGameServerInstancesResult> asyncHandler);

    /**
     * <p>
     * Retrieves additional game session properties, including the game session protection policy in force, a set of one
     * or more game sessions in a specific fleet location. You can optionally filter the results by current game session
     * status. Alternatively, use <a>SearchGameSessions</a> to request a set of active game sessions that are filtered
     * by certain criteria. To retrieve all game session properties, use <a>DescribeGameSessions</a>.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve details for all game sessions that are currently running on all locations in a fleet, provide a fleet
     * or alias ID, with an optional status filter. This approach returns details from the fleet's home Region and all
     * remote locations.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve details for all game sessions that are currently running on a specific fleet location, provide a
     * fleet or alias ID and a location name, with optional status filter. The location can be the fleet's home Region
     * or any remote location.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve details for a specific game session, provide the game session ID. This approach looks for the game
     * session ID in all fleets that reside in the AWS Region defined in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a <code>GameSessionDetail</code> object is returned for each game session that matches the
     * request.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#gamelift-sdk-client-api-find"
     * >Find a game session</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeGameSessionDetailsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeGameSessionDetails operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeGameSessionDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionDetailsResult> describeGameSessionDetailsAsync(
            DescribeGameSessionDetailsRequest describeGameSessionDetailsRequest);

    /**
     * <p>
     * Retrieves additional game session properties, including the game session protection policy in force, a set of one
     * or more game sessions in a specific fleet location. You can optionally filter the results by current game session
     * status. Alternatively, use <a>SearchGameSessions</a> to request a set of active game sessions that are filtered
     * by certain criteria. To retrieve all game session properties, use <a>DescribeGameSessions</a>.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve details for all game sessions that are currently running on all locations in a fleet, provide a fleet
     * or alias ID, with an optional status filter. This approach returns details from the fleet's home Region and all
     * remote locations.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve details for all game sessions that are currently running on a specific fleet location, provide a
     * fleet or alias ID and a location name, with optional status filter. The location can be the fleet's home Region
     * or any remote location.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve details for a specific game session, provide the game session ID. This approach looks for the game
     * session ID in all fleets that reside in the AWS Region defined in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a <code>GameSessionDetail</code> object is returned for each game session that matches the
     * request.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#gamelift-sdk-client-api-find"
     * >Find a game session</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeGameSessionDetailsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGameSessionDetails operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameSessionDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionDetails"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionDetailsResult> describeGameSessionDetailsAsync(
            DescribeGameSessionDetailsRequest describeGameSessionDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameSessionDetailsRequest, DescribeGameSessionDetailsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information, including current status, about a game session placement request.
     * </p>
     * <p>
     * To get game session placement details, specify the placement ID.
     * </p>
     * <p>
     * If successful, a <a>GameSessionPlacement</a> object is returned.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeGameSessionPlacementRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeGameSessionPlacement operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionPlacementResult> describeGameSessionPlacementAsync(
            DescribeGameSessionPlacementRequest describeGameSessionPlacementRequest);

    /**
     * <p>
     * Retrieves information, including current status, about a game session placement request.
     * </p>
     * <p>
     * To get game session placement details, specify the placement ID.
     * </p>
     * <p>
     * If successful, a <a>GameSessionPlacement</a> object is returned.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeGameSessionPlacementRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGameSessionPlacement operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionPlacementResult> describeGameSessionPlacementAsync(
            DescribeGameSessionPlacementRequest describeGameSessionPlacementRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameSessionPlacementRequest, DescribeGameSessionPlacementResult> asyncHandler);

    /**
     * <p>
     * Retrieves the properties for one or more game session queues. When requesting multiple queues, use the pagination
     * parameters to retrieve results as a set of sequential pages. If successful, a <a>GameSessionQueue</a> object is
     * returned for each requested queue. When specifying a list of queues, objects are returned only for queues that
     * currently exist in the Region.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-console.html"> View Your Queues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSessionQueue</a> | <a>DescribeGameSessionQueues</a> | <a>UpdateGameSessionQueue</a> |
     * <a>DeleteGameSessionQueue</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeGameSessionQueuesRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeGameSessionQueues operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeGameSessionQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionQueues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionQueuesResult> describeGameSessionQueuesAsync(
            DescribeGameSessionQueuesRequest describeGameSessionQueuesRequest);

    /**
     * <p>
     * Retrieves the properties for one or more game session queues. When requesting multiple queues, use the pagination
     * parameters to retrieve results as a set of sequential pages. If successful, a <a>GameSessionQueue</a> object is
     * returned for each requested queue. When specifying a list of queues, objects are returned only for queues that
     * currently exist in the Region.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-console.html"> View Your Queues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSessionQueue</a> | <a>DescribeGameSessionQueues</a> | <a>UpdateGameSessionQueue</a> |
     * <a>DeleteGameSessionQueue</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeGameSessionQueuesRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGameSessionQueues operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameSessionQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionQueues"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionQueuesResult> describeGameSessionQueuesAsync(
            DescribeGameSessionQueuesRequest describeGameSessionQueuesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameSessionQueuesRequest, DescribeGameSessionQueuesResult> asyncHandler);

    /**
     * <p>
     * Retrieves a set of one or more game sessions in a specific fleet location. You can optionally filter the results
     * by current game session status. Alternatively, use <a>SearchGameSessions</a> to request a set of active game
     * sessions that are filtered by certain criteria. To retrieve the protection policy for game sessions, use
     * <a>DescribeGameSessionDetails</a>.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve all game sessions that are currently running on all locations in a fleet, provide a fleet or alias
     * ID, with an optional status filter. This approach returns all game sessions in the fleet's home Region and all
     * remote locations.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve all game sessions that are currently running on a specific fleet location, provide a fleet or alias
     * ID and a location name, with optional status filter. The location can be the fleet's home Region or any remote
     * location.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve a specific game session, provide the game session ID. This approach looks for the game session ID in
     * all fleets that reside in the AWS Region defined in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a <code>GameSession</code> object is returned for each game session that matches the request.
     * </p>
     * <p>
     * <i>Available in GameLift Local.</i>
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#gamelift-sdk-client-api-find"
     * >Find a game session</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeGameSessionsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeGameSessions operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionsResult> describeGameSessionsAsync(DescribeGameSessionsRequest describeGameSessionsRequest);

    /**
     * <p>
     * Retrieves a set of one or more game sessions in a specific fleet location. You can optionally filter the results
     * by current game session status. Alternatively, use <a>SearchGameSessions</a> to request a set of active game
     * sessions that are filtered by certain criteria. To retrieve the protection policy for game sessions, use
     * <a>DescribeGameSessionDetails</a>.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve all game sessions that are currently running on all locations in a fleet, provide a fleet or alias
     * ID, with an optional status filter. This approach returns all game sessions in the fleet's home Region and all
     * remote locations.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve all game sessions that are currently running on a specific fleet location, provide a fleet or alias
     * ID and a location name, with optional status filter. The location can be the fleet's home Region or any remote
     * location.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve a specific game session, provide the game session ID. This approach looks for the game session ID in
     * all fleets that reside in the AWS Region defined in the request.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a <code>GameSession</code> object is returned for each game session that matches the request.
     * </p>
     * <p>
     * <i>Available in GameLift Local.</i>
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#gamelift-sdk-client-api-find"
     * >Find a game session</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeGameSessionsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeGameSessions operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionsResult> describeGameSessionsAsync(DescribeGameSessionsRequest describeGameSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeGameSessionsRequest, DescribeGameSessionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about a fleet's instances, including instance IDs, connection data, and status.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get information on all instances that are deployed to a fleet's home Region, provide the fleet ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get information on all instances that are deployed to a fleet's remote location, provide the fleet ID and
     * location name.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get information on a specific instance in a fleet, provide the fleet ID and instance ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, an <code>Instance</code> object is returned for each requested instance. Instances are not
     * returned in any particular order.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely Access
     * Fleet Instances</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html">Debug Fleet
     * Issues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>DescribeInstances</a> | <a>GetInstanceAccess</a> | <a>DescribeEC2InstanceLimits</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeInstancesRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeInstances operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest);

    /**
     * <p>
     * Retrieves information about a fleet's instances, including instance IDs, connection data, and status.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get information on all instances that are deployed to a fleet's home Region, provide the fleet ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get information on all instances that are deployed to a fleet's remote location, provide the fleet ID and
     * location name.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get information on a specific instance in a fleet, provide the fleet ID and instance ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, an <code>Instance</code> object is returned for each requested instance. Instances are not
     * returned in any particular order.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely Access
     * Fleet Instances</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html">Debug Fleet
     * Issues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>DescribeInstances</a> | <a>GetInstanceAccess</a> | <a>DescribeEC2InstanceLimits</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeInstancesRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeInstances operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler);

    /**
     * <p>
     * Retrieves one or more matchmaking tickets. Use this operation to retrieve ticket information, including--after a
     * successful match is made--connection information for the resulting new game session.
     * </p>
     * <p>
     * To request matchmaking tickets, provide a list of up to 10 ticket IDs. If the request is successful, a ticket
     * object is returned for each requested ID that currently exists.
     * </p>
     * <p>
     * This operation is not designed to be continually called to track matchmaking ticket status. This practice can
     * cause you to exceed your API limit, which results in errors. Instead, as a best practice, set up an Amazon Simple
     * Notification Service (SNS) to receive notifications, and provide the topic ARN in the matchmaking configuration.
     * Continuously poling ticket status with <a>DescribeMatchmaking</a> should only be used for games in development
     * with low matchmaking usage.
     * </p>
     * <p/>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-client.html"> Add FlexMatch to a game
     * client</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-notification.html"> Set Up FlexMatch
     * event notification</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>StartMatchmaking</a> | <a>DescribeMatchmaking</a> | <a>StopMatchmaking</a> | <a>AcceptMatch</a> |
     * <a>StartMatchBackfill</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeMatchmakingRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeMatchmaking operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmaking" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMatchmakingResult> describeMatchmakingAsync(DescribeMatchmakingRequest describeMatchmakingRequest);

    /**
     * <p>
     * Retrieves one or more matchmaking tickets. Use this operation to retrieve ticket information, including--after a
     * successful match is made--connection information for the resulting new game session.
     * </p>
     * <p>
     * To request matchmaking tickets, provide a list of up to 10 ticket IDs. If the request is successful, a ticket
     * object is returned for each requested ID that currently exists.
     * </p>
     * <p>
     * This operation is not designed to be continually called to track matchmaking ticket status. This practice can
     * cause you to exceed your API limit, which results in errors. Instead, as a best practice, set up an Amazon Simple
     * Notification Service (SNS) to receive notifications, and provide the topic ARN in the matchmaking configuration.
     * Continuously poling ticket status with <a>DescribeMatchmaking</a> should only be used for games in development
     * with low matchmaking usage.
     * </p>
     * <p/>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-client.html"> Add FlexMatch to a game
     * client</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-notification.html"> Set Up FlexMatch
     * event notification</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>StartMatchmaking</a> | <a>DescribeMatchmaking</a> | <a>StopMatchmaking</a> | <a>AcceptMatch</a> |
     * <a>StartMatchBackfill</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeMatchmakingRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMatchmaking operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmaking" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMatchmakingResult> describeMatchmakingAsync(DescribeMatchmakingRequest describeMatchmakingRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMatchmakingRequest, DescribeMatchmakingResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details of FlexMatch matchmaking configurations.
     * </p>
     * <p>
     * This operation offers the following options: (1) retrieve all matchmaking configurations, (2) retrieve
     * configurations for a specified list, or (3) retrieve all configurations that use a specified rule set name. When
     * requesting multiple items, use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a configuration is returned for each requested name. When specifying a list of names, only
     * configurations that currently exist are returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/matchmaker-build.html"> Setting up FlexMatch
     * matchmakers</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeMatchmakingConfigurationsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeMatchmakingConfigurations operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeMatchmakingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmakingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMatchmakingConfigurationsResult> describeMatchmakingConfigurationsAsync(
            DescribeMatchmakingConfigurationsRequest describeMatchmakingConfigurationsRequest);

    /**
     * <p>
     * Retrieves the details of FlexMatch matchmaking configurations.
     * </p>
     * <p>
     * This operation offers the following options: (1) retrieve all matchmaking configurations, (2) retrieve
     * configurations for a specified list, or (3) retrieve all configurations that use a specified rule set name. When
     * requesting multiple items, use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a configuration is returned for each requested name. When specifying a list of names, only
     * configurations that currently exist are returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/matchmaker-build.html"> Setting up FlexMatch
     * matchmakers</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeMatchmakingConfigurationsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMatchmakingConfigurations operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeMatchmakingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmakingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMatchmakingConfigurationsResult> describeMatchmakingConfigurationsAsync(
            DescribeMatchmakingConfigurationsRequest describeMatchmakingConfigurationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMatchmakingConfigurationsRequest, DescribeMatchmakingConfigurationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the details for FlexMatch matchmaking rule sets. You can request all existing rule sets for the Region,
     * or provide a list of one or more rule set names. When requesting multiple items, use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a rule set is returned for each requested name.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-rulesets.html">Build a rule set</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeMatchmakingRuleSetsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeMatchmakingRuleSets operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeMatchmakingRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmakingRuleSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMatchmakingRuleSetsResult> describeMatchmakingRuleSetsAsync(
            DescribeMatchmakingRuleSetsRequest describeMatchmakingRuleSetsRequest);

    /**
     * <p>
     * Retrieves the details for FlexMatch matchmaking rule sets. You can request all existing rule sets for the Region,
     * or provide a list of one or more rule set names. When requesting multiple items, use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a rule set is returned for each requested name.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-rulesets.html">Build a rule set</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeMatchmakingRuleSetsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeMatchmakingRuleSets operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeMatchmakingRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmakingRuleSets"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeMatchmakingRuleSetsResult> describeMatchmakingRuleSetsAsync(
            DescribeMatchmakingRuleSetsRequest describeMatchmakingRuleSetsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeMatchmakingRuleSetsRequest, DescribeMatchmakingRuleSetsResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for one or more player sessions.
     * </p>
     * <p>
     * This action can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve a specific player session, provide the player session ID only.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve all player sessions in a game session, provide the game session ID only.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve all player sessions for a specific player, provide a player ID only.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To request player sessions, specify either a player session ID, game session ID, or player ID. You can filter
     * this request by player session status. Use the pagination parameters to retrieve results as a set of sequential
     * pages.
     * </p>
     * <p>
     * If successful, a <code>PlayerSession</code> object is returned for each session that matches the request.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreatePlayerSession</a> | <a>CreatePlayerSessions</a> | <a>DescribePlayerSessions</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describePlayerSessionsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribePlayerSessions operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribePlayerSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribePlayerSessions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePlayerSessionsResult> describePlayerSessionsAsync(DescribePlayerSessionsRequest describePlayerSessionsRequest);

    /**
     * <p>
     * Retrieves properties for one or more player sessions.
     * </p>
     * <p>
     * This action can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve a specific player session, provide the player session ID only.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve all player sessions in a game session, provide the game session ID only.
     * </p>
     * </li>
     * <li>
     * <p>
     * To retrieve all player sessions for a specific player, provide a player ID only.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To request player sessions, specify either a player session ID, game session ID, or player ID. You can filter
     * this request by player session status. Use the pagination parameters to retrieve results as a set of sequential
     * pages.
     * </p>
     * <p>
     * If successful, a <code>PlayerSession</code> object is returned for each session that matches the request.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreatePlayerSession</a> | <a>CreatePlayerSessions</a> | <a>DescribePlayerSessions</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describePlayerSessionsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribePlayerSessions operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribePlayerSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribePlayerSessions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribePlayerSessionsResult> describePlayerSessionsAsync(DescribePlayerSessionsRequest describePlayerSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribePlayerSessionsRequest, DescribePlayerSessionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a fleet's runtime configuration settings. The runtime configuration tells GameLift which server
     * processes to run (and how) on each instance in the fleet.
     * </p>
     * <p>
     * To get the runtime configuration that is currently in forces for a fleet, provide the fleet ID.
     * </p>
     * <p>
     * If successful, a <a>RuntimeConfiguration</a> object is returned for the requested fleet. If the requested fleet
     * has been deleted, the result set is empty.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-multiprocess.html">Running multiple
     * processes on a fleet</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>ListFleets</a> | <a>DescribeEC2InstanceLimits</a> | <a>DescribeFleetAttributes</a> |
     * <a>DescribeFleetCapacity</a> | <a>DescribeFleetEvents</a> | <a>DescribeFleetLocationAttributes</a> |
     * <a>DescribeFleetPortSettings</a> | <a>DescribeFleetUtilization</a> | <a>DescribeRuntimeConfiguration</a> |
     * <a>DescribeScalingPolicies</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeRuntimeConfigurationRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeRuntimeConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuntimeConfigurationResult> describeRuntimeConfigurationAsync(
            DescribeRuntimeConfigurationRequest describeRuntimeConfigurationRequest);

    /**
     * <p>
     * Retrieves a fleet's runtime configuration settings. The runtime configuration tells GameLift which server
     * processes to run (and how) on each instance in the fleet.
     * </p>
     * <p>
     * To get the runtime configuration that is currently in forces for a fleet, provide the fleet ID.
     * </p>
     * <p>
     * If successful, a <a>RuntimeConfiguration</a> object is returned for the requested fleet. If the requested fleet
     * has been deleted, the result set is empty.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-multiprocess.html">Running multiple
     * processes on a fleet</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>ListFleets</a> | <a>DescribeEC2InstanceLimits</a> | <a>DescribeFleetAttributes</a> |
     * <a>DescribeFleetCapacity</a> | <a>DescribeFleetEvents</a> | <a>DescribeFleetLocationAttributes</a> |
     * <a>DescribeFleetPortSettings</a> | <a>DescribeFleetUtilization</a> | <a>DescribeRuntimeConfiguration</a> |
     * <a>DescribeScalingPolicies</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeRuntimeConfigurationRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeRuntimeConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeRuntimeConfigurationResult> describeRuntimeConfigurationAsync(
            DescribeRuntimeConfigurationRequest describeRuntimeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeRuntimeConfigurationRequest, DescribeRuntimeConfigurationResult> asyncHandler);

    /**
     * <p>
     * Retrieves all scaling policies applied to a fleet.
     * </p>
     * <p>
     * To get a fleet's scaling policies, specify the fleet ID. You can filter this request by policy status, such as to
     * retrieve only active scaling policies. Use the pagination parameters to retrieve results as a set of sequential
     * pages. If successful, set of <a>ScalingPolicy</a> objects is returned for the fleet.
     * </p>
     * <p>
     * A fleet may have all of its scaling policies suspended (<a>StopFleetActions</a>). This operation does not affect
     * the status of the scaling policies, which remains ACTIVE. To see whether a fleet's scaling policies are in force
     * or suspended, call <a>DescribeFleetAttributes</a> and check the stopped actions.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>DescribeFleetCapacity</a> | <a>UpdateFleetCapacity</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>PutScalingPolicy</a> | <a>DescribeScalingPolicies</a> | <a>DeleteScalingPolicy</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeScalingPolicies operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeScalingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeScalingPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(DescribeScalingPoliciesRequest describeScalingPoliciesRequest);

    /**
     * <p>
     * Retrieves all scaling policies applied to a fleet.
     * </p>
     * <p>
     * To get a fleet's scaling policies, specify the fleet ID. You can filter this request by policy status, such as to
     * retrieve only active scaling policies. Use the pagination parameters to retrieve results as a set of sequential
     * pages. If successful, set of <a>ScalingPolicy</a> objects is returned for the fleet.
     * </p>
     * <p>
     * A fleet may have all of its scaling policies suspended (<a>StopFleetActions</a>). This operation does not affect
     * the status of the scaling policies, which remains ACTIVE. To see whether a fleet's scaling policies are in force
     * or suspended, call <a>DescribeFleetAttributes</a> and check the stopped actions.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>DescribeFleetCapacity</a> | <a>UpdateFleetCapacity</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>PutScalingPolicy</a> | <a>DescribeScalingPolicies</a> | <a>DeleteScalingPolicy</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScalingPolicies operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeScalingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeScalingPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(DescribeScalingPoliciesRequest describeScalingPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScalingPoliciesRequest, DescribeScalingPoliciesResult> asyncHandler);

    /**
     * <p>
     * Retrieves properties for a Realtime script.
     * </p>
     * <p>
     * To request a script record, specify the script ID. If successful, an object containing the script properties is
     * returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateScript</a> | <a>ListScripts</a> | <a>DescribeScript</a> | <a>UpdateScript</a> | <a>DeleteScript</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeScriptRequest
     * @return A Java Future containing the result of the DescribeScript operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeScript" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeScriptResult> describeScriptAsync(DescribeScriptRequest describeScriptRequest);

    /**
     * <p>
     * Retrieves properties for a Realtime script.
     * </p>
     * <p>
     * To request a script record, specify the script ID. If successful, an object containing the script properties is
     * returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateScript</a> | <a>ListScripts</a> | <a>DescribeScript</a> | <a>UpdateScript</a> | <a>DeleteScript</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeScriptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeScript operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeScript" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeScriptResult> describeScriptAsync(DescribeScriptRequest describeScriptRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeScriptRequest, DescribeScriptResult> asyncHandler);

    /**
     * <p>
     * Retrieves valid VPC peering authorizations that are pending for the AWS account. This operation returns all VPC
     * peering authorizations and requests for peering. This includes those initiated and received by this account.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a> | <a>DescribeVpcPeeringAuthorizations</a> |
     * <a>DeleteVpcPeeringAuthorization</a> | <a>CreateVpcPeeringConnection</a> | <a>DescribeVpcPeeringConnections</a> |
     * <a>DeleteVpcPeeringConnection</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeVpcPeeringAuthorizationsRequest
     * @return A Java Future containing the result of the DescribeVpcPeeringAuthorizations operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeVpcPeeringAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcPeeringAuthorizationsResult> describeVpcPeeringAuthorizationsAsync(
            DescribeVpcPeeringAuthorizationsRequest describeVpcPeeringAuthorizationsRequest);

    /**
     * <p>
     * Retrieves valid VPC peering authorizations that are pending for the AWS account. This operation returns all VPC
     * peering authorizations and requests for peering. This includes those initiated and received by this account.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a> | <a>DescribeVpcPeeringAuthorizations</a> |
     * <a>DeleteVpcPeeringAuthorization</a> | <a>CreateVpcPeeringConnection</a> | <a>DescribeVpcPeeringConnections</a> |
     * <a>DeleteVpcPeeringConnection</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeVpcPeeringAuthorizationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcPeeringAuthorizations operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeVpcPeeringAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcPeeringAuthorizationsResult> describeVpcPeeringAuthorizationsAsync(
            DescribeVpcPeeringAuthorizationsRequest describeVpcPeeringAuthorizationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcPeeringAuthorizationsRequest, DescribeVpcPeeringAuthorizationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves information on VPC peering connections. Use this operation to get peering information for all fleets or
     * for one specific fleet ID.
     * </p>
     * <p>
     * To retrieve connection information, call this operation from the AWS account that is used to manage the Amazon
     * GameLift fleets. Specify a fleet ID or leave the parameter empty to retrieve all connection records. If
     * successful, the retrieved information includes both active and pending connections. Active connections identify
     * the IpV4 CIDR block that the VPC uses to connect.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a> | <a>DescribeVpcPeeringAuthorizations</a> |
     * <a>DeleteVpcPeeringAuthorization</a> | <a>CreateVpcPeeringConnection</a> | <a>DescribeVpcPeeringConnections</a> |
     * <a>DeleteVpcPeeringConnection</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeVpcPeeringConnectionsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the DescribeVpcPeeringConnections operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeVpcPeeringConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(
            DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest);

    /**
     * <p>
     * Retrieves information on VPC peering connections. Use this operation to get peering information for all fleets or
     * for one specific fleet ID.
     * </p>
     * <p>
     * To retrieve connection information, call this operation from the AWS account that is used to manage the Amazon
     * GameLift fleets. Specify a fleet ID or leave the parameter empty to retrieve all connection records. If
     * successful, the retrieved information includes both active and pending connections. Active connections identify
     * the IpV4 CIDR block that the VPC uses to connect.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateVpcPeeringAuthorization</a> | <a>DescribeVpcPeeringAuthorizations</a> |
     * <a>DeleteVpcPeeringAuthorization</a> | <a>CreateVpcPeeringConnection</a> | <a>DescribeVpcPeeringConnections</a> |
     * <a>DeleteVpcPeeringConnection</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeVpcPeeringConnectionsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeVpcPeeringConnections operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeVpcPeeringConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringConnections"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(
            DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game session. When a game session is
     * terminated, GameLift automatically stores the logs in Amazon S3 and retains them for 14 days. Use this URL to
     * download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift">AWS
     * Service Limits</a> page for maximum log file sizes. Log files that exceed this limit are not saved.
     * </p>
     * </note>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param getGameSessionLogUrlRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the GetGameSessionLogUrl operation returned by the service.
     * @sample AmazonGameLiftAsync.GetGameSessionLogUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetGameSessionLogUrl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetGameSessionLogUrlResult> getGameSessionLogUrlAsync(GetGameSessionLogUrlRequest getGameSessionLogUrlRequest);

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game session. When a game session is
     * terminated, GameLift automatically stores the logs in Amazon S3 and retains them for 14 days. Use this URL to
     * download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift">AWS
     * Service Limits</a> page for maximum log file sizes. Log files that exceed this limit are not saved.
     * </p>
     * </note>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param getGameSessionLogUrlRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGameSessionLogUrl operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.GetGameSessionLogUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetGameSessionLogUrl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetGameSessionLogUrlResult> getGameSessionLogUrlAsync(GetGameSessionLogUrlRequest getGameSessionLogUrlRequest,
            com.amazonaws.handlers.AsyncHandler<GetGameSessionLogUrlRequest, GetGameSessionLogUrlResult> asyncHandler);

    /**
     * <p>
     * Requests remote access to a fleet instance. Remote access is useful for debugging, gathering benchmarking data,
     * or observing activity in real time.
     * </p>
     * <p>
     * To remotely access an instance, you need credentials that match the operating system of the instance. For a
     * Windows instance, GameLift returns a user name and password as strings for use with a Windows Remote Desktop
     * client. For a Linux instance, GameLift returns a user name and RSA private key, also as strings, for use with an
     * SSH client. The private key must be saved in the proper format to a <code>.pem</code> file before using. If
     * you're making this request using the AWS CLI, saving the secret can be handled as part of the
     * <code>GetInstanceAccess</code> request, as shown in one of the examples for this operation.
     * </p>
     * <p>
     * To request access to a specific instance, specify the IDs of both the instance and the fleet it belongs to. You
     * can retrieve a fleet's instance IDs by calling <a>DescribeInstances</a>. If successful, an <a>InstanceAccess</a>
     * object is returned that contains the instance's IP address and a set of credentials.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely Access
     * Fleet Instances</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html">Debug Fleet
     * Issues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>DescribeInstances</a> | <a>GetInstanceAccess</a> | <a>DescribeEC2InstanceLimits</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param getInstanceAccessRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the GetInstanceAccess operation returned by the service.
     * @sample AmazonGameLiftAsync.GetInstanceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetInstanceAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceAccessResult> getInstanceAccessAsync(GetInstanceAccessRequest getInstanceAccessRequest);

    /**
     * <p>
     * Requests remote access to a fleet instance. Remote access is useful for debugging, gathering benchmarking data,
     * or observing activity in real time.
     * </p>
     * <p>
     * To remotely access an instance, you need credentials that match the operating system of the instance. For a
     * Windows instance, GameLift returns a user name and password as strings for use with a Windows Remote Desktop
     * client. For a Linux instance, GameLift returns a user name and RSA private key, also as strings, for use with an
     * SSH client. The private key must be saved in the proper format to a <code>.pem</code> file before using. If
     * you're making this request using the AWS CLI, saving the secret can be handled as part of the
     * <code>GetInstanceAccess</code> request, as shown in one of the examples for this operation.
     * </p>
     * <p>
     * To request access to a specific instance, specify the IDs of both the instance and the fleet it belongs to. You
     * can retrieve a fleet's instance IDs by calling <a>DescribeInstances</a>. If successful, an <a>InstanceAccess</a>
     * object is returned that contains the instance's IP address and a set of credentials.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely Access
     * Fleet Instances</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html">Debug Fleet
     * Issues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>DescribeInstances</a> | <a>GetInstanceAccess</a> | <a>DescribeEC2InstanceLimits</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param getInstanceAccessRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceAccess operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.GetInstanceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetInstanceAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceAccessResult> getInstanceAccessAsync(GetInstanceAccessRequest getInstanceAccessRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceAccessRequest, GetInstanceAccessResult> asyncHandler);

    /**
     * <p>
     * Retrieves all aliases for this AWS account. You can filter the result set by alias name and/or routing strategy
     * type. Use the pagination parameters to retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Returned aliases are not listed in any particular order.
     * </p>
     * </note>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateAlias</a> | <a>ListAliases</a> | <a>DescribeAlias</a> | <a>UpdateAlias</a> | <a>DeleteAlias</a> |
     * <a>ResolveAlias</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listAliasesRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AmazonGameLiftAsync.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Retrieves all aliases for this AWS account. You can filter the result set by alias name and/or routing strategy
     * type. Use the pagination parameters to retrieve results in sequential pages.
     * </p>
     * <note>
     * <p>
     * Returned aliases are not listed in any particular order.
     * </p>
     * </note>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateAlias</a> | <a>ListAliases</a> | <a>DescribeAlias</a> | <a>UpdateAlias</a> | <a>DeleteAlias</a> |
     * <a>ResolveAlias</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listAliasesRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler);

    /**
     * <p>
     * Retrieves build resources for all builds associated with the AWS account in use. You can limit results to builds
     * that are in a specific status by using the <code>Status</code> parameter. Use the pagination parameters to
     * retrieve results in a set of sequential pages.
     * </p>
     * <note>
     * <p>
     * Build resources are not listed in any particular order.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html"> Upload a Custom
     * Server Build</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateBuild</a> | <a>ListBuilds</a> | <a>DescribeBuild</a> | <a>UpdateBuild</a> | <a>DeleteBuild</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listBuildsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the ListBuilds operation returned by the service.
     * @sample AmazonGameLiftAsync.ListBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest listBuildsRequest);

    /**
     * <p>
     * Retrieves build resources for all builds associated with the AWS account in use. You can limit results to builds
     * that are in a specific status by using the <code>Status</code> parameter. Use the pagination parameters to
     * retrieve results in a set of sequential pages.
     * </p>
     * <note>
     * <p>
     * Build resources are not listed in any particular order.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html"> Upload a Custom
     * Server Build</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateBuild</a> | <a>ListBuilds</a> | <a>DescribeBuild</a> | <a>UpdateBuild</a> | <a>DeleteBuild</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listBuildsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListBuilds operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest listBuildsRequest,
            com.amazonaws.handlers.AsyncHandler<ListBuildsRequest, ListBuildsResult> asyncHandler);

    /**
     * <p>
     * Retrieves a collection of fleet resources in an AWS Region. You can call this operation to get fleets in a
     * previously selected default Region (see <a
     * href="https://docs.aws.amazon.com/credref/latest/refdocs/setting-global-region.html"
     * >https://docs.aws.amazon.com/credref/latest/refdocs/setting-global-region.html</a>or specify a Region in your
     * request. You can filter the result set to find only those fleets that are deployed with a specific build or
     * script. For fleets that have multiple locations, this operation retrieves fleets based on their home Region only.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get a list of all fleets in a Region, don't provide a build or script identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get a list of all fleets where a specific custom game build is deployed, provide the build ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get a list of all Realtime Servers fleets with a specific configuration script, provide the script ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a list of fleet IDs that match the request parameters is returned. A NextToken value is also
     * returned if there are more result pages to retrieve.
     * </p>
     * <note>
     * <p>
     * Fleet resources are not listed in a particular order.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleet</a> | <a>UpdateFleetCapacity</a> | <a>PutScalingPolicy</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>DescribeFleetAttributes</a> | <a>DescribeFleetLocationAttributes</a> | <a>UpdateFleetAttributes</a> |
     * <a>StopFleetActions</a> | <a>DeleteFleet</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listFleetsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the ListFleets operation returned by the service.
     * @sample AmazonGameLiftAsync.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * Retrieves a collection of fleet resources in an AWS Region. You can call this operation to get fleets in a
     * previously selected default Region (see <a
     * href="https://docs.aws.amazon.com/credref/latest/refdocs/setting-global-region.html"
     * >https://docs.aws.amazon.com/credref/latest/refdocs/setting-global-region.html</a>or specify a Region in your
     * request. You can filter the result set to find only those fleets that are deployed with a specific build or
     * script. For fleets that have multiple locations, this operation retrieves fleets based on their home Region only.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get a list of all fleets in a Region, don't provide a build or script identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get a list of all fleets where a specific custom game build is deployed, provide the build ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get a list of all Realtime Servers fleets with a specific configuration script, provide the script ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a list of fleet IDs that match the request parameters is returned. A NextToken value is also
     * returned if there are more result pages to retrieve.
     * </p>
     * <note>
     * <p>
     * Fleet resources are not listed in a particular order.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleet</a> | <a>UpdateFleetCapacity</a> | <a>PutScalingPolicy</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>DescribeFleetAttributes</a> | <a>DescribeFleetLocationAttributes</a> | <a>UpdateFleetAttributes</a> |
     * <a>StopFleetActions</a> | <a>DeleteFleet</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listFleetsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListFleets operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest listFleetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves information on all game servers groups that exist in the current AWS account for the selected Region.
     * Use the pagination parameters to retrieve results in a set of sequential segments.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param listGameServerGroupsRequest
     * @return A Java Future containing the result of the ListGameServerGroups operation returned by the service.
     * @sample AmazonGameLiftAsync.ListGameServerGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListGameServerGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGameServerGroupsResult> listGameServerGroupsAsync(ListGameServerGroupsRequest listGameServerGroupsRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves information on all game servers groups that exist in the current AWS account for the selected Region.
     * Use the pagination parameters to retrieve results in a set of sequential segments.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param listGameServerGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGameServerGroups operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListGameServerGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListGameServerGroups" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListGameServerGroupsResult> listGameServerGroupsAsync(ListGameServerGroupsRequest listGameServerGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGameServerGroupsRequest, ListGameServerGroupsResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves information on all game servers that are currently active in a specified game server group. You can opt
     * to sort the list by game server age. Use the pagination parameters to retrieve results in a set of sequential
     * segments.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>RegisterGameServer</a> | <a>ListGameServers</a> | <a>ClaimGameServer</a> | <a>DescribeGameServer</a> |
     * <a>UpdateGameServer</a> | <a>DeregisterGameServer</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param listGameServersRequest
     * @return A Java Future containing the result of the ListGameServers operation returned by the service.
     * @sample AmazonGameLiftAsync.ListGameServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListGameServers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGameServersResult> listGameServersAsync(ListGameServersRequest listGameServersRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves information on all game servers that are currently active in a specified game server group. You can opt
     * to sort the list by game server age. Use the pagination parameters to retrieve results in a set of sequential
     * segments.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>RegisterGameServer</a> | <a>ListGameServers</a> | <a>ClaimGameServer</a> | <a>DescribeGameServer</a> |
     * <a>UpdateGameServer</a> | <a>DeregisterGameServer</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param listGameServersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGameServers operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListGameServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListGameServers" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListGameServersResult> listGameServersAsync(ListGameServersRequest listGameServersRequest,
            com.amazonaws.handlers.AsyncHandler<ListGameServersRequest, ListGameServersResult> asyncHandler);

    /**
     * <p>
     * Retrieves script records for all Realtime scripts that are associated with the AWS account in use.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateScript</a> | <a>ListScripts</a> | <a>DescribeScript</a> | <a>UpdateScript</a> | <a>DeleteScript</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listScriptsRequest
     * @return A Java Future containing the result of the ListScripts operation returned by the service.
     * @sample AmazonGameLiftAsync.ListScripts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListScripts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListScriptsResult> listScriptsAsync(ListScriptsRequest listScriptsRequest);

    /**
     * <p>
     * Retrieves script records for all Realtime scripts that are associated with the AWS account in use.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateScript</a> | <a>ListScripts</a> | <a>DescribeScript</a> | <a>UpdateScript</a> | <a>DeleteScript</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listScriptsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListScripts operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListScripts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListScripts" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListScriptsResult> listScriptsAsync(ListScriptsRequest listScriptsRequest,
            com.amazonaws.handlers.AsyncHandler<ListScriptsRequest, ListScriptsResult> asyncHandler);

    /**
     * <p>
     * Retrieves all tags that are assigned to a GameLift resource. Resource tags are used to organize AWS resources for
     * a range of purposes. This operation handles the permissions necessary to manage tags for the following GameLift
     * resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Build
     * </p>
     * </li>
     * <li>
     * <p>
     * Script
     * </p>
     * </li>
     * <li>
     * <p>
     * Fleet
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias
     * </p>
     * </li>
     * <li>
     * <p>
     * GameSessionQueue
     * </p>
     * </li>
     * <li>
     * <p>
     * MatchmakingConfiguration
     * </p>
     * </li>
     * <li>
     * <p>
     * MatchmakingRuleSet
     * </p>
     * </li>
     * </ul>
     * <p>
     * To list tags for a resource, specify the unique ARN value for the resource.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/answers/account-management/aws-tagging-strategies/"> AWS Tagging Strategies</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>TagResource</a> | <a>UntagResource</a> | <a>ListTagsForResource</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonGameLiftAsync.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest);

    /**
     * <p>
     * Retrieves all tags that are assigned to a GameLift resource. Resource tags are used to organize AWS resources for
     * a range of purposes. This operation handles the permissions necessary to manage tags for the following GameLift
     * resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Build
     * </p>
     * </li>
     * <li>
     * <p>
     * Script
     * </p>
     * </li>
     * <li>
     * <p>
     * Fleet
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias
     * </p>
     * </li>
     * <li>
     * <p>
     * GameSessionQueue
     * </p>
     * </li>
     * <li>
     * <p>
     * MatchmakingConfiguration
     * </p>
     * </li>
     * <li>
     * <p>
     * MatchmakingRuleSet
     * </p>
     * </li>
     * </ul>
     * <p>
     * To list tags for a resource, specify the unique ARN value for the resource.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/answers/account-management/aws-tagging-strategies/"> AWS Tagging Strategies</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>TagResource</a> | <a>UntagResource</a> | <a>ListTagsForResource</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listTagsForResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTagsForResource operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(ListTagsForResourceRequest listTagsForResourceRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler);

    /**
     * <p>
     * Creates or updates a scaling policy for a fleet. Scaling policies are used to automatically scale a fleet's
     * hosting capacity to meet player demand. An active scaling policy instructs Amazon GameLift to track a fleet
     * metric and automatically change the fleet's capacity when a certain threshold is reached. There are two types of
     * scaling policies: target-based and rule-based. Use a target-based policy to quickly and efficiently manage fleet
     * scaling; this option is the most commonly used. Use rule-based policies when you need to exert fine-grained
     * control over auto-scaling.
     * </p>
     * <p>
     * Fleets can have multiple scaling policies of each type in force at the same time; you can have one target-based
     * policy, one or multiple rule-based scaling policies, or both. We recommend caution, however, because multiple
     * auto-scaling policies can have unintended consequences.
     * </p>
     * <p>
     * You can temporarily suspend all scaling policies for a fleet by calling <a>StopFleetActions</a> with the fleet
     * action AUTO_SCALING. To resume scaling policies, call <a>StartFleetActions</a> with the same fleet action. To
     * stop just one scaling policy--or to permanently remove it, you must delete the policy with
     * <a>DeleteScalingPolicy</a>.
     * </p>
     * <p>
     * Learn more about how to work with auto-scaling in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-autoscaling.html">Set Up Fleet Automatic
     * Scaling</a>.
     * </p>
     * <p>
     * <b>Target-based policy</b>
     * </p>
     * <p>
     * A target-based policy tracks a single metric: PercentAvailableGameSessions. This metric tells us how much of a
     * fleet's hosting capacity is ready to host game sessions but is not currently in use. This is the fleet's buffer;
     * it measures the additional player demand that the fleet could handle at current capacity. With a target-based
     * policy, you set your ideal buffer size and leave it to Amazon GameLift to take whatever action is needed to
     * maintain that target.
     * </p>
     * <p>
     * For example, you might choose to maintain a 10% buffer for a fleet that has the capacity to host 100 simultaneous
     * game sessions. This policy tells Amazon GameLift to take action whenever the fleet's available capacity falls
     * below or rises above 10 game sessions. Amazon GameLift will start new instances or stop unused instances in order
     * to return to the 10% buffer.
     * </p>
     * <p>
     * To create or update a target-based policy, specify a fleet ID and name, and set the policy type to "TargetBased".
     * Specify the metric to track (PercentAvailableGameSessions) and reference a <a>TargetConfiguration</a> object with
     * your desired buffer value. Exclude all other parameters. On a successful request, the policy name is returned.
     * The scaling policy is automatically in force as soon as it's successfully created. If the fleet's auto-scaling
     * actions are temporarily suspended, the new policy will be in force once the fleet actions are restarted.
     * </p>
     * <p>
     * <b>Rule-based policy</b>
     * </p>
     * <p>
     * A rule-based policy tracks specified fleet metric, sets a threshold value, and specifies the type of action to
     * initiate when triggered. With a rule-based policy, you can select from several available fleet metrics. Each
     * policy specifies whether to scale up or scale down (and by how much), so you need one policy for each type of
     * action.
     * </p>
     * <p>
     * For example, a policy may make the following statement:
     * "If the percentage of idle instances is greater than 20% for more than 15 minutes, then reduce the fleet capacity by 10%."
     * </p>
     * <p>
     * A policy's rule statement has the following structure:
     * </p>
     * <p>
     * If <code>[MetricName]</code> is <code>[ComparisonOperator]</code> <code>[Threshold]</code> for
     * <code>[EvaluationPeriods]</code> minutes, then <code>[ScalingAdjustmentType]</code> to/by
     * <code>[ScalingAdjustment]</code>.
     * </p>
     * <p>
     * To implement the example, the rule statement would look like this:
     * </p>
     * <p>
     * If <code>[PercentIdleInstances]</code> is <code>[GreaterThanThreshold]</code> <code>[20]</code> for
     * <code>[15]</code> minutes, then <code>[PercentChangeInCapacity]</code> to/by <code>[10]</code>.
     * </p>
     * <p>
     * To create or update a scaling policy, specify a unique combination of name and fleet ID, and set the policy type
     * to "RuleBased". Specify the parameter values for a policy rule statement. On a successful request, the policy
     * name is returned. Scaling policies are automatically in force as soon as they're successfully created. If the
     * fleet's auto-scaling actions are temporarily suspended, the new policy will be in force once the fleet actions
     * are restarted.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>DescribeFleetCapacity</a> | <a>UpdateFleetCapacity</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>PutScalingPolicy</a> | <a>DescribeScalingPolicies</a> | <a>DeleteScalingPolicy</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param putScalingPolicyRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AmazonGameLiftAsync.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/PutScalingPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest);

    /**
     * <p>
     * Creates or updates a scaling policy for a fleet. Scaling policies are used to automatically scale a fleet's
     * hosting capacity to meet player demand. An active scaling policy instructs Amazon GameLift to track a fleet
     * metric and automatically change the fleet's capacity when a certain threshold is reached. There are two types of
     * scaling policies: target-based and rule-based. Use a target-based policy to quickly and efficiently manage fleet
     * scaling; this option is the most commonly used. Use rule-based policies when you need to exert fine-grained
     * control over auto-scaling.
     * </p>
     * <p>
     * Fleets can have multiple scaling policies of each type in force at the same time; you can have one target-based
     * policy, one or multiple rule-based scaling policies, or both. We recommend caution, however, because multiple
     * auto-scaling policies can have unintended consequences.
     * </p>
     * <p>
     * You can temporarily suspend all scaling policies for a fleet by calling <a>StopFleetActions</a> with the fleet
     * action AUTO_SCALING. To resume scaling policies, call <a>StartFleetActions</a> with the same fleet action. To
     * stop just one scaling policy--or to permanently remove it, you must delete the policy with
     * <a>DeleteScalingPolicy</a>.
     * </p>
     * <p>
     * Learn more about how to work with auto-scaling in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-autoscaling.html">Set Up Fleet Automatic
     * Scaling</a>.
     * </p>
     * <p>
     * <b>Target-based policy</b>
     * </p>
     * <p>
     * A target-based policy tracks a single metric: PercentAvailableGameSessions. This metric tells us how much of a
     * fleet's hosting capacity is ready to host game sessions but is not currently in use. This is the fleet's buffer;
     * it measures the additional player demand that the fleet could handle at current capacity. With a target-based
     * policy, you set your ideal buffer size and leave it to Amazon GameLift to take whatever action is needed to
     * maintain that target.
     * </p>
     * <p>
     * For example, you might choose to maintain a 10% buffer for a fleet that has the capacity to host 100 simultaneous
     * game sessions. This policy tells Amazon GameLift to take action whenever the fleet's available capacity falls
     * below or rises above 10 game sessions. Amazon GameLift will start new instances or stop unused instances in order
     * to return to the 10% buffer.
     * </p>
     * <p>
     * To create or update a target-based policy, specify a fleet ID and name, and set the policy type to "TargetBased".
     * Specify the metric to track (PercentAvailableGameSessions) and reference a <a>TargetConfiguration</a> object with
     * your desired buffer value. Exclude all other parameters. On a successful request, the policy name is returned.
     * The scaling policy is automatically in force as soon as it's successfully created. If the fleet's auto-scaling
     * actions are temporarily suspended, the new policy will be in force once the fleet actions are restarted.
     * </p>
     * <p>
     * <b>Rule-based policy</b>
     * </p>
     * <p>
     * A rule-based policy tracks specified fleet metric, sets a threshold value, and specifies the type of action to
     * initiate when triggered. With a rule-based policy, you can select from several available fleet metrics. Each
     * policy specifies whether to scale up or scale down (and by how much), so you need one policy for each type of
     * action.
     * </p>
     * <p>
     * For example, a policy may make the following statement:
     * "If the percentage of idle instances is greater than 20% for more than 15 minutes, then reduce the fleet capacity by 10%."
     * </p>
     * <p>
     * A policy's rule statement has the following structure:
     * </p>
     * <p>
     * If <code>[MetricName]</code> is <code>[ComparisonOperator]</code> <code>[Threshold]</code> for
     * <code>[EvaluationPeriods]</code> minutes, then <code>[ScalingAdjustmentType]</code> to/by
     * <code>[ScalingAdjustment]</code>.
     * </p>
     * <p>
     * To implement the example, the rule statement would look like this:
     * </p>
     * <p>
     * If <code>[PercentIdleInstances]</code> is <code>[GreaterThanThreshold]</code> <code>[20]</code> for
     * <code>[15]</code> minutes, then <code>[PercentChangeInCapacity]</code> to/by <code>[10]</code>.
     * </p>
     * <p>
     * To create or update a scaling policy, specify a unique combination of name and fleet ID, and set the policy type
     * to "RuleBased". Specify the parameter values for a policy rule statement. On a successful request, the policy
     * name is returned. Scaling policies are automatically in force as soon as they're successfully created. If the
     * fleet's auto-scaling actions are temporarily suspended, the new policy will be in force once the fleet actions
     * are restarted.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>DescribeFleetCapacity</a> | <a>UpdateFleetCapacity</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>PutScalingPolicy</a> | <a>DescribeScalingPolicies</a> | <a>DeleteScalingPolicy</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param putScalingPolicyRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PutScalingPolicy operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/PutScalingPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest putScalingPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Creates a new game server resource and notifies GameLift FleetIQ that the game server is ready to host gameplay
     * and players. This operation is called by a game server process that is running on an instance in a game server
     * group. Registering game servers enables GameLift FleetIQ to track available game servers and enables game clients
     * and services to claim a game server for a new game session.
     * </p>
     * <p>
     * To register a game server, identify the game server group and instance where the game server is running, and
     * provide a unique identifier for the game server. You can also include connection and game server data. When a
     * game client or service requests a game server by calling <a>ClaimGameServer</a>, this information is returned in
     * the response.
     * </p>
     * <p>
     * Once a game server is successfully registered, it is put in status <code>AVAILABLE</code>. A request to register
     * a game server may fail if the instance it is running on is in the process of shutting down as part of instance
     * balancing or scale-down activity.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>RegisterGameServer</a> | <a>ListGameServers</a> | <a>ClaimGameServer</a> | <a>DescribeGameServer</a> |
     * <a>UpdateGameServer</a> | <a>DeregisterGameServer</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param registerGameServerRequest
     * @return A Java Future containing the result of the RegisterGameServer operation returned by the service.
     * @sample AmazonGameLiftAsync.RegisterGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RegisterGameServer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterGameServerResult> registerGameServerAsync(RegisterGameServerRequest registerGameServerRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Creates a new game server resource and notifies GameLift FleetIQ that the game server is ready to host gameplay
     * and players. This operation is called by a game server process that is running on an instance in a game server
     * group. Registering game servers enables GameLift FleetIQ to track available game servers and enables game clients
     * and services to claim a game server for a new game session.
     * </p>
     * <p>
     * To register a game server, identify the game server group and instance where the game server is running, and
     * provide a unique identifier for the game server. You can also include connection and game server data. When a
     * game client or service requests a game server by calling <a>ClaimGameServer</a>, this information is returned in
     * the response.
     * </p>
     * <p>
     * Once a game server is successfully registered, it is put in status <code>AVAILABLE</code>. A request to register
     * a game server may fail if the instance it is running on is in the process of shutting down as part of instance
     * balancing or scale-down activity.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>RegisterGameServer</a> | <a>ListGameServers</a> | <a>ClaimGameServer</a> | <a>DescribeGameServer</a> |
     * <a>UpdateGameServer</a> | <a>DeregisterGameServer</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param registerGameServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterGameServer operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.RegisterGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RegisterGameServer" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<RegisterGameServerResult> registerGameServerAsync(RegisterGameServerRequest registerGameServerRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterGameServerRequest, RegisterGameServerResult> asyncHandler);

    /**
     * <p>
     * Retrieves a fresh set of credentials for use when uploading a new set of game build files to Amazon GameLift's
     * Amazon S3. This is done as part of the build creation process; see <a>CreateBuild</a>.
     * </p>
     * <p>
     * To request new credentials, specify the build ID as returned with an initial <code>CreateBuild</code> request. If
     * successful, a new set of credentials are returned, along with the S3 storage location associated with the build
     * ID.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build"
     * > Create a Build with Files in S3</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateBuild</a> | <a>ListBuilds</a> | <a>DescribeBuild</a> | <a>UpdateBuild</a> | <a>DeleteBuild</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param requestUploadCredentialsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the RequestUploadCredentials operation returned by the service.
     * @sample AmazonGameLiftAsync.RequestUploadCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RequestUploadCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RequestUploadCredentialsResult> requestUploadCredentialsAsync(RequestUploadCredentialsRequest requestUploadCredentialsRequest);

    /**
     * <p>
     * Retrieves a fresh set of credentials for use when uploading a new set of game build files to Amazon GameLift's
     * Amazon S3. This is done as part of the build creation process; see <a>CreateBuild</a>.
     * </p>
     * <p>
     * To request new credentials, specify the build ID as returned with an initial <code>CreateBuild</code> request. If
     * successful, a new set of credentials are returned, along with the S3 storage location associated with the build
     * ID.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-cli-uploading.html#gamelift-build-cli-uploading-create-build"
     * > Create a Build with Files in S3</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateBuild</a> | <a>ListBuilds</a> | <a>DescribeBuild</a> | <a>UpdateBuild</a> | <a>DeleteBuild</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param requestUploadCredentialsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RequestUploadCredentials operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.RequestUploadCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RequestUploadCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RequestUploadCredentialsResult> requestUploadCredentialsAsync(RequestUploadCredentialsRequest requestUploadCredentialsRequest,
            com.amazonaws.handlers.AsyncHandler<RequestUploadCredentialsRequest, RequestUploadCredentialsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the fleet ID that an alias is currently pointing to.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateAlias</a> | <a>ListAliases</a> | <a>DescribeAlias</a> | <a>UpdateAlias</a> | <a>DeleteAlias</a> |
     * <a>ResolveAlias</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param resolveAliasRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the ResolveAlias operation returned by the service.
     * @sample AmazonGameLiftAsync.ResolveAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ResolveAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResolveAliasResult> resolveAliasAsync(ResolveAliasRequest resolveAliasRequest);

    /**
     * <p>
     * Retrieves the fleet ID that an alias is currently pointing to.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateAlias</a> | <a>ListAliases</a> | <a>DescribeAlias</a> | <a>UpdateAlias</a> | <a>DeleteAlias</a> |
     * <a>ResolveAlias</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param resolveAliasRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResolveAlias operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ResolveAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ResolveAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResolveAliasResult> resolveAliasAsync(ResolveAliasRequest resolveAliasRequest,
            com.amazonaws.handlers.AsyncHandler<ResolveAliasRequest, ResolveAliasResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Reinstates activity on a game server group after it has been suspended. A game server group might be suspended by
     * the<a>SuspendGameServerGroup</a> operation, or it might be suspended involuntarily due to a configuration
     * problem. In the second case, you can manually resume activity on the group once the configuration problem has
     * been resolved. Refer to the game server group status and status reason for more information on why group activity
     * is suspended.
     * </p>
     * <p>
     * To resume activity, specify a game server group ARN and the type of activity to be resumed. If successful, a
     * <a>GameServerGroup</a> object is returned showing that the resumed activity is no longer listed in
     * <code>SuspendedActions</code>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param resumeGameServerGroupRequest
     * @return A Java Future containing the result of the ResumeGameServerGroup operation returned by the service.
     * @sample AmazonGameLiftAsync.ResumeGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ResumeGameServerGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResumeGameServerGroupResult> resumeGameServerGroupAsync(ResumeGameServerGroupRequest resumeGameServerGroupRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Reinstates activity on a game server group after it has been suspended. A game server group might be suspended by
     * the<a>SuspendGameServerGroup</a> operation, or it might be suspended involuntarily due to a configuration
     * problem. In the second case, you can manually resume activity on the group once the configuration problem has
     * been resolved. Refer to the game server group status and status reason for more information on why group activity
     * is suspended.
     * </p>
     * <p>
     * To resume activity, specify a game server group ARN and the type of activity to be resumed. If successful, a
     * <a>GameServerGroup</a> object is returned showing that the resumed activity is no longer listed in
     * <code>SuspendedActions</code>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param resumeGameServerGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResumeGameServerGroup operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ResumeGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ResumeGameServerGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<ResumeGameServerGroupResult> resumeGameServerGroupAsync(ResumeGameServerGroupRequest resumeGameServerGroupRequest,
            com.amazonaws.handlers.AsyncHandler<ResumeGameServerGroupRequest, ResumeGameServerGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves all active game sessions that match a set of search criteria and sorts them into a specified order.
     * </p>
     * <p>
     * When searching for game sessions, you specify exactly where you want to search and provide a search filter
     * expression, a sort expression, or both. A search request can search only one fleet, but it can search all of a
     * fleet's locations.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search all game sessions that are currently running on all locations in a fleet, provide a fleet or alias ID.
     * This approach returns game sessions in the fleet's home Region and all remote locations that fit the search
     * criteria.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search all game sessions that are currently running on a specific fleet location, provide a fleet or alias ID
     * and a location name. For location, you can specify a fleet's home Region or any remote location.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a <code>GameSession</code> object is returned for each game session that matches the request.
     * Search finds game sessions that are in <code>ACTIVE</code> status only. To retrieve information on game sessions
     * in other statuses, use <a>DescribeGameSessions</a>.
     * </p>
     * <p>
     * You can search or sort by the following game session attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>gameSessionId</b> -- A unique identifier for the game session. You can use either a <code>GameSessionId</code>
     * or <code>GameSessionArn</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gameSessionName</b> -- Name assigned to a game session. This value is set when requesting a new game session
     * with <a>CreateGameSession</a> or updating with <a>UpdateGameSession</a>. Game session names do not need to be
     * unique to a game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gameSessionProperties</b> -- Custom data defined in a game session's <code>GameProperty</code> parameter.
     * <code>GameProperty</code> values are stored as key:value pairs; the filter expression must indicate the key and a
     * string to search the data values for. For example, to search for game sessions with custom data containing the
     * key:value pair "gameMode:brawl", specify the following: <code>gameSessionProperties.gameMode = "brawl"</code>.
     * All custom data values are searched as strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>maximumSessions</b> -- Maximum number of player sessions allowed for a game session. This value is set when
     * requesting a new game session with <a>CreateGameSession</a> or updating with <a>UpdateGameSession</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>creationTimeMillis</b> -- Value indicating when a game session was created. It is expressed in Unix time as
     * milliseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>playerSessionCount</b> -- Number of players currently connected to a game session. This value changes rapidly
     * as players join the session or drop out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>hasAvailablePlayerSessions</b> -- Boolean value indicating whether a game session has reached its maximum
     * number of players. It is highly recommended that all search requests include this filter attribute to optimize
     * search performance and return only sessions that players can join.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Returned values for <code>playerSessionCount</code> and <code>hasAvailablePlayerSessions</code> change quickly as
     * players join sessions and others drop out. Results should be considered a snapshot in time. Be sure to refresh
     * search results often, and handle sessions that fill up before a player can join.
     * </p>
     * </note>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param searchGameSessionsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the SearchGameSessions operation returned by the service.
     * @sample AmazonGameLiftAsync.SearchGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/SearchGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchGameSessionsResult> searchGameSessionsAsync(SearchGameSessionsRequest searchGameSessionsRequest);

    /**
     * <p>
     * Retrieves all active game sessions that match a set of search criteria and sorts them into a specified order.
     * </p>
     * <p>
     * When searching for game sessions, you specify exactly where you want to search and provide a search filter
     * expression, a sort expression, or both. A search request can search only one fleet, but it can search all of a
     * fleet's locations.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To search all game sessions that are currently running on all locations in a fleet, provide a fleet or alias ID.
     * This approach returns game sessions in the fleet's home Region and all remote locations that fit the search
     * criteria.
     * </p>
     * </li>
     * <li>
     * <p>
     * To search all game sessions that are currently running on a specific fleet location, provide a fleet or alias ID
     * and a location name. For location, you can specify a fleet's home Region or any remote location.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a <code>GameSession</code> object is returned for each game session that matches the request.
     * Search finds game sessions that are in <code>ACTIVE</code> status only. To retrieve information on game sessions
     * in other statuses, use <a>DescribeGameSessions</a>.
     * </p>
     * <p>
     * You can search or sort by the following game session attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>gameSessionId</b> -- A unique identifier for the game session. You can use either a <code>GameSessionId</code>
     * or <code>GameSessionArn</code> value.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gameSessionName</b> -- Name assigned to a game session. This value is set when requesting a new game session
     * with <a>CreateGameSession</a> or updating with <a>UpdateGameSession</a>. Game session names do not need to be
     * unique to a game session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gameSessionProperties</b> -- Custom data defined in a game session's <code>GameProperty</code> parameter.
     * <code>GameProperty</code> values are stored as key:value pairs; the filter expression must indicate the key and a
     * string to search the data values for. For example, to search for game sessions with custom data containing the
     * key:value pair "gameMode:brawl", specify the following: <code>gameSessionProperties.gameMode = "brawl"</code>.
     * All custom data values are searched as strings.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>maximumSessions</b> -- Maximum number of player sessions allowed for a game session. This value is set when
     * requesting a new game session with <a>CreateGameSession</a> or updating with <a>UpdateGameSession</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>creationTimeMillis</b> -- Value indicating when a game session was created. It is expressed in Unix time as
     * milliseconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>playerSessionCount</b> -- Number of players currently connected to a game session. This value changes rapidly
     * as players join the session or drop out.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>hasAvailablePlayerSessions</b> -- Boolean value indicating whether a game session has reached its maximum
     * number of players. It is highly recommended that all search requests include this filter attribute to optimize
     * search performance and return only sessions that players can join.
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * Returned values for <code>playerSessionCount</code> and <code>hasAvailablePlayerSessions</code> change quickly as
     * players join sessions and others drop out. Results should be considered a snapshot in time. Be sure to refresh
     * search results often, and handle sessions that fill up before a player can join.
     * </p>
     * </note>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param searchGameSessionsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SearchGameSessions operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.SearchGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/SearchGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<SearchGameSessionsResult> searchGameSessionsAsync(SearchGameSessionsRequest searchGameSessionsRequest,
            com.amazonaws.handlers.AsyncHandler<SearchGameSessionsRequest, SearchGameSessionsResult> asyncHandler);

    /**
     * <p>
     * Resumes certain types of activity on fleet instances that were suspended with <a>StopFleetActions</a>. For
     * multi-location fleets, fleet actions are managed separately for each location. Currently, this operation is used
     * to restart a fleet's auto-scaling activity.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To restart actions on instances in the fleet's home Region, provide a fleet ID and the type of actions to resume.
     * </p>
     * </li>
     * <li>
     * <p>
     * To restart actions on instances in one of the fleet's remote locations, provide a fleet ID, a location name, and
     * the type of actions to resume.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, GameLift once again initiates scaling events as triggered by the fleet's scaling policies. If
     * actions on the fleet location were never stopped, this operation will have no effect. You can view a fleet's
     * stopped actions using <a>DescribeFleetAttributes</a> or <a>DescribeFleetLocationAttributes</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleet</a> | <a>UpdateFleetCapacity</a> | <a>PutScalingPolicy</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>DescribeFleetAttributes</a> | <a>DescribeFleetLocationAttributes</a> | <a>UpdateFleetAttributes</a> |
     * <a>StopFleetActions</a> | <a>DeleteFleet</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param startFleetActionsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the StartFleetActions operation returned by the service.
     * @sample AmazonGameLiftAsync.StartFleetActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartFleetActions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFleetActionsResult> startFleetActionsAsync(StartFleetActionsRequest startFleetActionsRequest);

    /**
     * <p>
     * Resumes certain types of activity on fleet instances that were suspended with <a>StopFleetActions</a>. For
     * multi-location fleets, fleet actions are managed separately for each location. Currently, this operation is used
     * to restart a fleet's auto-scaling activity.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To restart actions on instances in the fleet's home Region, provide a fleet ID and the type of actions to resume.
     * </p>
     * </li>
     * <li>
     * <p>
     * To restart actions on instances in one of the fleet's remote locations, provide a fleet ID, a location name, and
     * the type of actions to resume.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, GameLift once again initiates scaling events as triggered by the fleet's scaling policies. If
     * actions on the fleet location were never stopped, this operation will have no effect. You can view a fleet's
     * stopped actions using <a>DescribeFleetAttributes</a> or <a>DescribeFleetLocationAttributes</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleet</a> | <a>UpdateFleetCapacity</a> | <a>PutScalingPolicy</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>DescribeFleetAttributes</a> | <a>DescribeFleetLocationAttributes</a> | <a>UpdateFleetAttributes</a> |
     * <a>StopFleetActions</a> | <a>DeleteFleet</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param startFleetActionsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartFleetActions operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.StartFleetActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartFleetActions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFleetActionsResult> startFleetActionsAsync(StartFleetActionsRequest startFleetActionsRequest,
            com.amazonaws.handlers.AsyncHandler<StartFleetActionsRequest, StartFleetActionsResult> asyncHandler);

    /**
     * <p>
     * Places a request for a new game session in a queue (see <a>CreateGameSessionQueue</a>). When processing a
     * placement request, Amazon GameLift searches for available resources on the queue's destinations, scanning each
     * until it finds resources or the placement request times out.
     * </p>
     * <p>
     * A game session placement request can also request player sessions. When a new game session is successfully
     * created, Amazon GameLift creates a player session for each player included in the request.
     * </p>
     * <p>
     * When placing a game session, by default Amazon GameLift tries each fleet in the order they are listed in the
     * queue configuration. Ideally, a queue's destinations are listed in preference order.
     * </p>
     * <p>
     * Alternatively, when requesting a game session with players, you can also provide latency data for each player in
     * relevant Regions. Latency data indicates the performance lag a player experiences when connected to a fleet in
     * the Region. Amazon GameLift uses latency data to reorder the list of destinations to place the game session in a
     * Region with minimal lag. If latency data is provided for multiple players, Amazon GameLift calculates each
     * Region's average lag for all players and reorders to get the best game play across all players.
     * </p>
     * <p>
     * To place a new game session request, specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The queue name and a set of game session properties and settings
     * </p>
     * </li>
     * <li>
     * <p>
     * A unique ID (such as a UUID) for the placement. You use this ID to track the status of the placement request
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) A set of player data and a unique player ID for each player that you are joining to the new game
     * session (player data is optional, but if you include it, you must also provide a unique ID for each player)
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency data for all players (if you want to optimize game play for the players)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, a new game session placement is created.
     * </p>
     * <p>
     * To track the status of a placement request, call <a>DescribeGameSessionPlacement</a> and check the request's
     * status. If the status is <code>FULFILLED</code>, a new game session has been created and a game session ARN and
     * Region are referenced. If the placement request times out, you can resubmit the request or retry it with a
     * different queue.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param startGameSessionPlacementRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the StartGameSessionPlacement operation returned by the service.
     * @sample AmazonGameLiftAsync.StartGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartGameSessionPlacementResult> startGameSessionPlacementAsync(
            StartGameSessionPlacementRequest startGameSessionPlacementRequest);

    /**
     * <p>
     * Places a request for a new game session in a queue (see <a>CreateGameSessionQueue</a>). When processing a
     * placement request, Amazon GameLift searches for available resources on the queue's destinations, scanning each
     * until it finds resources or the placement request times out.
     * </p>
     * <p>
     * A game session placement request can also request player sessions. When a new game session is successfully
     * created, Amazon GameLift creates a player session for each player included in the request.
     * </p>
     * <p>
     * When placing a game session, by default Amazon GameLift tries each fleet in the order they are listed in the
     * queue configuration. Ideally, a queue's destinations are listed in preference order.
     * </p>
     * <p>
     * Alternatively, when requesting a game session with players, you can also provide latency data for each player in
     * relevant Regions. Latency data indicates the performance lag a player experiences when connected to a fleet in
     * the Region. Amazon GameLift uses latency data to reorder the list of destinations to place the game session in a
     * Region with minimal lag. If latency data is provided for multiple players, Amazon GameLift calculates each
     * Region's average lag for all players and reorders to get the best game play across all players.
     * </p>
     * <p>
     * To place a new game session request, specify the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The queue name and a set of game session properties and settings
     * </p>
     * </li>
     * <li>
     * <p>
     * A unique ID (such as a UUID) for the placement. You use this ID to track the status of the placement request
     * </p>
     * </li>
     * <li>
     * <p>
     * (Optional) A set of player data and a unique player ID for each player that you are joining to the new game
     * session (player data is optional, but if you include it, you must also provide a unique ID for each player)
     * </p>
     * </li>
     * <li>
     * <p>
     * Latency data for all players (if you want to optimize game play for the players)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, a new game session placement is created.
     * </p>
     * <p>
     * To track the status of a placement request, call <a>DescribeGameSessionPlacement</a> and check the request's
     * status. If the status is <code>FULFILLED</code>, a new game session has been created and a game session ARN and
     * Region are referenced. If the placement request times out, you can resubmit the request or retry it with a
     * different queue.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param startGameSessionPlacementRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartGameSessionPlacement operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.StartGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartGameSessionPlacementResult> startGameSessionPlacementAsync(
            StartGameSessionPlacementRequest startGameSessionPlacementRequest,
            com.amazonaws.handlers.AsyncHandler<StartGameSessionPlacementRequest, StartGameSessionPlacementResult> asyncHandler);

    /**
     * <p>
     * Finds new players to fill open slots in currently running game sessions. The backfill match process is
     * essentially identical to the process of forming new matches. Backfill requests use the same matchmaker that was
     * used to make the original match, and they provide matchmaking data for all players currently in the game session.
     * FlexMatch uses this information to select new players so that backfilled match continues to meet the original
     * match requirements.
     * </p>
     * <p>
     * When using FlexMatch with GameLift managed hosting, you can request a backfill match from a client service by
     * calling this operation with a <a>GameSession</a> identifier. You also have the option of making backfill requests
     * directly from your game server. In response to a request, FlexMatch creates player sessions for the new players,
     * updates the <code>GameSession</code> resource, and sends updated matchmaking data to the game server. You can
     * request a backfill match at any point after a game session is started. Each game session can have only one active
     * backfill request at a time; a subsequent request automatically replaces the earlier request.
     * </p>
     * <p>
     * When using FlexMatch as a standalone component, request a backfill match by calling this operation without a game
     * session identifier. As with newly formed matches, matchmaking results are returned in a matchmaking event so that
     * your game can update the game session that is being backfilled.
     * </p>
     * <p>
     * To request a backfill match, specify a unique ticket ID, the original matchmaking configuration, and matchmaking
     * data for all current players in the game session being backfilled. Optionally, specify the
     * <code>GameSession</code> ARN. If successful, a match backfill ticket is created and returned with status set to
     * QUEUED. Track the status of backfill tickets using the same method for tracking tickets for new matches.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-backfill.html"> Backfill existing games
     * with FlexMatch</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-events.html"> Matchmaking events</a>
     * (reference)
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/gamelift-match.html"> How GameLift FlexMatch
     * works</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>StartMatchmaking</a> | <a>DescribeMatchmaking</a> | <a>StopMatchmaking</a> | <a>AcceptMatch</a> |
     * <a>StartMatchBackfill</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param startMatchBackfillRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the StartMatchBackfill operation returned by the service.
     * @sample AmazonGameLiftAsync.StartMatchBackfill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchBackfill" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartMatchBackfillResult> startMatchBackfillAsync(StartMatchBackfillRequest startMatchBackfillRequest);

    /**
     * <p>
     * Finds new players to fill open slots in currently running game sessions. The backfill match process is
     * essentially identical to the process of forming new matches. Backfill requests use the same matchmaker that was
     * used to make the original match, and they provide matchmaking data for all players currently in the game session.
     * FlexMatch uses this information to select new players so that backfilled match continues to meet the original
     * match requirements.
     * </p>
     * <p>
     * When using FlexMatch with GameLift managed hosting, you can request a backfill match from a client service by
     * calling this operation with a <a>GameSession</a> identifier. You also have the option of making backfill requests
     * directly from your game server. In response to a request, FlexMatch creates player sessions for the new players,
     * updates the <code>GameSession</code> resource, and sends updated matchmaking data to the game server. You can
     * request a backfill match at any point after a game session is started. Each game session can have only one active
     * backfill request at a time; a subsequent request automatically replaces the earlier request.
     * </p>
     * <p>
     * When using FlexMatch as a standalone component, request a backfill match by calling this operation without a game
     * session identifier. As with newly formed matches, matchmaking results are returned in a matchmaking event so that
     * your game can update the game session that is being backfilled.
     * </p>
     * <p>
     * To request a backfill match, specify a unique ticket ID, the original matchmaking configuration, and matchmaking
     * data for all current players in the game session being backfilled. Optionally, specify the
     * <code>GameSession</code> ARN. If successful, a match backfill ticket is created and returned with status set to
     * QUEUED. Track the status of backfill tickets using the same method for tracking tickets for new matches.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-backfill.html"> Backfill existing games
     * with FlexMatch</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-events.html"> Matchmaking events</a>
     * (reference)
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/gamelift-match.html"> How GameLift FlexMatch
     * works</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>StartMatchmaking</a> | <a>DescribeMatchmaking</a> | <a>StopMatchmaking</a> | <a>AcceptMatch</a> |
     * <a>StartMatchBackfill</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param startMatchBackfillRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMatchBackfill operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.StartMatchBackfill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchBackfill" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<StartMatchBackfillResult> startMatchBackfillAsync(StartMatchBackfillRequest startMatchBackfillRequest,
            com.amazonaws.handlers.AsyncHandler<StartMatchBackfillRequest, StartMatchBackfillResult> asyncHandler);

    /**
     * <p>
     * Uses FlexMatch to create a game match for a group of players based on custom matchmaking rules. With games that
     * use GameLift managed hosting, this operation also triggers GameLift to find hosting resources and start a new
     * game session for the new match. Each matchmaking request includes information on one or more players and
     * specifies the FlexMatch matchmaker to use. When a request is for multiple players, FlexMatch attempts to build a
     * match that includes all players in the request, placing them in the same team and finding additional players as
     * needed to fill the match.
     * </p>
     * <p>
     * To start matchmaking, provide a unique ticket ID, specify a matchmaking configuration, and include the players to
     * be matched. You must also include any player attributes that are required by the matchmaking configuration's rule
     * set. If successful, a matchmaking ticket is returned with status set to <code>QUEUED</code>.
     * </p>
     * <p>
     * Track matchmaking events to respond as needed and acquire game session connection information for successfully
     * completed matches. Ticket status updates are tracked using event notification through Amazon Simple Notification
     * Service (SNS), which is defined in the matchmaking configuration.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-client.html"> Add FlexMatch to a game
     * client</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-notification.html"> Set Up FlexMatch
     * event notification</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/gamelift-match.html"> How GameLift FlexMatch
     * works</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>StartMatchmaking</a> | <a>DescribeMatchmaking</a> | <a>StopMatchmaking</a> | <a>AcceptMatch</a> |
     * <a>StartMatchBackfill</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param startMatchmakingRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the StartMatchmaking operation returned by the service.
     * @sample AmazonGameLiftAsync.StartMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchmaking" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartMatchmakingResult> startMatchmakingAsync(StartMatchmakingRequest startMatchmakingRequest);

    /**
     * <p>
     * Uses FlexMatch to create a game match for a group of players based on custom matchmaking rules. With games that
     * use GameLift managed hosting, this operation also triggers GameLift to find hosting resources and start a new
     * game session for the new match. Each matchmaking request includes information on one or more players and
     * specifies the FlexMatch matchmaker to use. When a request is for multiple players, FlexMatch attempts to build a
     * match that includes all players in the request, placing them in the same team and finding additional players as
     * needed to fill the match.
     * </p>
     * <p>
     * To start matchmaking, provide a unique ticket ID, specify a matchmaking configuration, and include the players to
     * be matched. You must also include any player attributes that are required by the matchmaking configuration's rule
     * set. If successful, a matchmaking ticket is returned with status set to <code>QUEUED</code>.
     * </p>
     * <p>
     * Track matchmaking events to respond as needed and acquire game session connection information for successfully
     * completed matches. Ticket status updates are tracked using event notification through Amazon Simple Notification
     * Service (SNS), which is defined in the matchmaking configuration.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-client.html"> Add FlexMatch to a game
     * client</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-notification.html"> Set Up FlexMatch
     * event notification</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/gamelift-match.html"> How GameLift FlexMatch
     * works</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>StartMatchmaking</a> | <a>DescribeMatchmaking</a> | <a>StopMatchmaking</a> | <a>AcceptMatch</a> |
     * <a>StartMatchBackfill</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param startMatchmakingRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartMatchmaking operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.StartMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchmaking" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartMatchmakingResult> startMatchmakingAsync(StartMatchmakingRequest startMatchmakingRequest,
            com.amazonaws.handlers.AsyncHandler<StartMatchmakingRequest, StartMatchmakingResult> asyncHandler);

    /**
     * <p>
     * Suspends certain types of activity in a fleet location. Currently, this operation is used to stop auto-scaling
     * activity. For multi-location fleets, fleet actions are managed separately for each location.
     * </p>
     * <p>
     * Stopping fleet actions has several potential purposes. It allows you to temporarily stop auto-scaling activity
     * but retain your scaling policies for use in the future. For multi-location fleets, you can set up fleet-wide
     * auto-scaling, and then opt out of it for certain locations.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To stop actions on instances in the fleet's home Region, provide a fleet ID and the type of actions to suspend.
     * </p>
     * </li>
     * <li>
     * <p>
     * To stop actions on instances in one of the fleet's remote locations, provide a fleet ID, a location name, and the
     * type of actions to suspend.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, GameLift no longer initiates scaling events except in response to manual changes using
     * <a>UpdateFleetCapacity</a>. You can view a fleet's stopped actions using <a>DescribeFleetAttributes</a> or
     * <a>DescribeFleetLocationAttributes</a>. Suspended activity can be restarted using <a>StartFleetActions</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * Fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleet</a> | <a>UpdateFleetCapacity</a> | <a>PutScalingPolicy</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>DescribeFleetAttributes</a> | <a>DescribeFleetLocationAttributes</a> | <a>UpdateFleetAttributes</a> |
     * <a>StopFleetActions</a> | <a>DeleteFleet</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param stopFleetActionsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the StopFleetActions operation returned by the service.
     * @sample AmazonGameLiftAsync.StopFleetActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopFleetActions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopFleetActionsResult> stopFleetActionsAsync(StopFleetActionsRequest stopFleetActionsRequest);

    /**
     * <p>
     * Suspends certain types of activity in a fleet location. Currently, this operation is used to stop auto-scaling
     * activity. For multi-location fleets, fleet actions are managed separately for each location.
     * </p>
     * <p>
     * Stopping fleet actions has several potential purposes. It allows you to temporarily stop auto-scaling activity
     * but retain your scaling policies for use in the future. For multi-location fleets, you can set up fleet-wide
     * auto-scaling, and then opt out of it for certain locations.
     * </p>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To stop actions on instances in the fleet's home Region, provide a fleet ID and the type of actions to suspend.
     * </p>
     * </li>
     * <li>
     * <p>
     * To stop actions on instances in one of the fleet's remote locations, provide a fleet ID, a location name, and the
     * type of actions to suspend.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, GameLift no longer initiates scaling events except in response to manual changes using
     * <a>UpdateFleetCapacity</a>. You can view a fleet's stopped actions using <a>DescribeFleetAttributes</a> or
     * <a>DescribeFleetLocationAttributes</a>. Suspended activity can be restarted using <a>StartFleetActions</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * Fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleet</a> | <a>UpdateFleetCapacity</a> | <a>PutScalingPolicy</a> | <a>DescribeEC2InstanceLimits</a> |
     * <a>DescribeFleetAttributes</a> | <a>DescribeFleetLocationAttributes</a> | <a>UpdateFleetAttributes</a> |
     * <a>StopFleetActions</a> | <a>DeleteFleet</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param stopFleetActionsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopFleetActions operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.StopFleetActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopFleetActions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopFleetActionsResult> stopFleetActionsAsync(StopFleetActionsRequest stopFleetActionsRequest,
            com.amazonaws.handlers.AsyncHandler<StopFleetActionsRequest, StopFleetActionsResult> asyncHandler);

    /**
     * <p>
     * Cancels a game session placement that is in <code>PENDING</code> status. To stop a placement, provide the
     * placement ID values. If successful, the placement is moved to <code>CANCELLED</code> status.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param stopGameSessionPlacementRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the StopGameSessionPlacement operation returned by the service.
     * @sample AmazonGameLiftAsync.StopGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopGameSessionPlacementResult> stopGameSessionPlacementAsync(StopGameSessionPlacementRequest stopGameSessionPlacementRequest);

    /**
     * <p>
     * Cancels a game session placement that is in <code>PENDING</code> status. To stop a placement, provide the
     * placement ID values. If successful, the placement is moved to <code>CANCELLED</code> status.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param stopGameSessionPlacementRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopGameSessionPlacement operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.StopGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StopGameSessionPlacementResult> stopGameSessionPlacementAsync(StopGameSessionPlacementRequest stopGameSessionPlacementRequest,
            com.amazonaws.handlers.AsyncHandler<StopGameSessionPlacementRequest, StopGameSessionPlacementResult> asyncHandler);

    /**
     * <p>
     * Cancels a matchmaking ticket or match backfill ticket that is currently being processed. To stop the matchmaking
     * operation, specify the ticket ID. If successful, work on the ticket is stopped, and the ticket status is changed
     * to <code>CANCELLED</code>.
     * </p>
     * <p>
     * This call is also used to turn off automatic backfill for an individual game session. This is for game sessions
     * that are created with a matchmaking configuration that has automatic backfill enabled. The ticket ID is included
     * in the <code>MatchmakerData</code> of an updated game session object, which is provided to the game server.
     * </p>
     * <note>
     * <p>
     * If the operation is successful, the service sends back an empty JSON struct with the HTTP 200 response (not an
     * empty HTTP body).
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-client.html"> Add FlexMatch to a game
     * client</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>StartMatchmaking</a> | <a>DescribeMatchmaking</a> | <a>StopMatchmaking</a> | <a>AcceptMatch</a> |
     * <a>StartMatchBackfill</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param stopMatchmakingRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the StopMatchmaking operation returned by the service.
     * @sample AmazonGameLiftAsync.StopMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopMatchmaking" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopMatchmakingResult> stopMatchmakingAsync(StopMatchmakingRequest stopMatchmakingRequest);

    /**
     * <p>
     * Cancels a matchmaking ticket or match backfill ticket that is currently being processed. To stop the matchmaking
     * operation, specify the ticket ID. If successful, work on the ticket is stopped, and the ticket status is changed
     * to <code>CANCELLED</code>.
     * </p>
     * <p>
     * This call is also used to turn off automatic backfill for an individual game session. This is for game sessions
     * that are created with a matchmaking configuration that has automatic backfill enabled. The ticket ID is included
     * in the <code>MatchmakerData</code> of an updated game session object, which is provided to the game server.
     * </p>
     * <note>
     * <p>
     * If the operation is successful, the service sends back an empty JSON struct with the HTTP 200 response (not an
     * empty HTTP body).
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-client.html"> Add FlexMatch to a game
     * client</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>StartMatchmaking</a> | <a>DescribeMatchmaking</a> | <a>StopMatchmaking</a> | <a>AcceptMatch</a> |
     * <a>StartMatchBackfill</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param stopMatchmakingRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopMatchmaking operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.StopMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopMatchmaking" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StopMatchmakingResult> stopMatchmakingAsync(StopMatchmakingRequest stopMatchmakingRequest,
            com.amazonaws.handlers.AsyncHandler<StopMatchmakingRequest, StopMatchmakingResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Temporarily stops activity on a game server group without terminating instances or the game server group. You can
     * restart activity by calling <a>ResumeGameServerGroup</a>. You can suspend the following activity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Instance type replacement</b> - This activity evaluates the current game hosting viability of all Spot
     * instance types that are defined for the game server group. It updates the Auto Scaling group to remove nonviable
     * Spot Instance types, which have a higher chance of game server interruptions. It then balances capacity across
     * the remaining viable Spot Instance types. When this activity is suspended, the Auto Scaling group continues with
     * its current balance, regardless of viability. Instance protection, utilization metrics, and capacity scaling
     * activities continue to be active.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To suspend activity, specify a game server group ARN and the type of activity to be suspended. If successful, a
     * <a>GameServerGroup</a> object is returned showing that the activity is listed in <code>SuspendedActions</code>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param suspendGameServerGroupRequest
     * @return A Java Future containing the result of the SuspendGameServerGroup operation returned by the service.
     * @sample AmazonGameLiftAsync.SuspendGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/SuspendGameServerGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SuspendGameServerGroupResult> suspendGameServerGroupAsync(SuspendGameServerGroupRequest suspendGameServerGroupRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Temporarily stops activity on a game server group without terminating instances or the game server group. You can
     * restart activity by calling <a>ResumeGameServerGroup</a>. You can suspend the following activity:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>Instance type replacement</b> - This activity evaluates the current game hosting viability of all Spot
     * instance types that are defined for the game server group. It updates the Auto Scaling group to remove nonviable
     * Spot Instance types, which have a higher chance of game server interruptions. It then balances capacity across
     * the remaining viable Spot Instance types. When this activity is suspended, the Auto Scaling group continues with
     * its current balance, regardless of viability. Instance protection, utilization metrics, and capacity scaling
     * activities continue to be active.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To suspend activity, specify a game server group ARN and the type of activity to be suspended. If successful, a
     * <a>GameServerGroup</a> object is returned showing that the activity is listed in <code>SuspendedActions</code>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param suspendGameServerGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SuspendGameServerGroup operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.SuspendGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/SuspendGameServerGroup"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<SuspendGameServerGroupResult> suspendGameServerGroupAsync(SuspendGameServerGroupRequest suspendGameServerGroupRequest,
            com.amazonaws.handlers.AsyncHandler<SuspendGameServerGroupRequest, SuspendGameServerGroupResult> asyncHandler);

    /**
     * <p>
     * Assigns a tag to a GameLift resource. AWS resource tags provide an additional management tool set. You can use
     * tags to organize resources, create IAM permissions policies to manage access to groups of resources, customize
     * AWS cost breakdowns, etc. This operation handles the permissions necessary to manage tags for the following
     * GameLift resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Build
     * </p>
     * </li>
     * <li>
     * <p>
     * Script
     * </p>
     * </li>
     * <li>
     * <p>
     * Fleet
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias
     * </p>
     * </li>
     * <li>
     * <p>
     * GameSessionQueue
     * </p>
     * </li>
     * <li>
     * <p>
     * MatchmakingConfiguration
     * </p>
     * </li>
     * <li>
     * <p>
     * MatchmakingRuleSet
     * </p>
     * </li>
     * </ul>
     * <p>
     * To add a tag to a resource, specify the unique ARN value for the resource and provide a tag list containing one
     * or more tags. The operation succeeds even if the list includes tags that are already assigned to the specified
     * resource.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/answers/account-management/aws-tagging-strategies/"> AWS Tagging Strategies</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>TagResource</a> | <a>UntagResource</a> | <a>ListTagsForResource</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param tagResourceRequest
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonGameLiftAsync.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest);

    /**
     * <p>
     * Assigns a tag to a GameLift resource. AWS resource tags provide an additional management tool set. You can use
     * tags to organize resources, create IAM permissions policies to manage access to groups of resources, customize
     * AWS cost breakdowns, etc. This operation handles the permissions necessary to manage tags for the following
     * GameLift resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Build
     * </p>
     * </li>
     * <li>
     * <p>
     * Script
     * </p>
     * </li>
     * <li>
     * <p>
     * Fleet
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias
     * </p>
     * </li>
     * <li>
     * <p>
     * GameSessionQueue
     * </p>
     * </li>
     * <li>
     * <p>
     * MatchmakingConfiguration
     * </p>
     * </li>
     * <li>
     * <p>
     * MatchmakingRuleSet
     * </p>
     * </li>
     * </ul>
     * <p>
     * To add a tag to a resource, specify the unique ARN value for the resource and provide a tag list containing one
     * or more tags. The operation succeeds even if the list includes tags that are already assigned to the specified
     * resource.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/answers/account-management/aws-tagging-strategies/"> AWS Tagging Strategies</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>TagResource</a> | <a>UntagResource</a> | <a>ListTagsForResource</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param tagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the TagResource operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<TagResourceResult> tagResourceAsync(TagResourceRequest tagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<TagResourceRequest, TagResourceResult> asyncHandler);

    /**
     * <p>
     * Removes a tag that is assigned to a GameLift resource. Resource tags are used to organize AWS resources for a
     * range of purposes. This operation handles the permissions necessary to manage tags for the following GameLift
     * resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Build
     * </p>
     * </li>
     * <li>
     * <p>
     * Script
     * </p>
     * </li>
     * <li>
     * <p>
     * Fleet
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias
     * </p>
     * </li>
     * <li>
     * <p>
     * GameSessionQueue
     * </p>
     * </li>
     * <li>
     * <p>
     * MatchmakingConfiguration
     * </p>
     * </li>
     * <li>
     * <p>
     * MatchmakingRuleSet
     * </p>
     * </li>
     * </ul>
     * <p>
     * To remove a tag from a resource, specify the unique ARN value for the resource and provide a string list
     * containing one or more tags to be removed. This operation succeeds even if the list includes tags that are not
     * currently assigned to the specified resource.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/answers/account-management/aws-tagging-strategies/"> AWS Tagging Strategies</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>TagResource</a> | <a>UntagResource</a> | <a>ListTagsForResource</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param untagResourceRequest
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonGameLiftAsync.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest);

    /**
     * <p>
     * Removes a tag that is assigned to a GameLift resource. Resource tags are used to organize AWS resources for a
     * range of purposes. This operation handles the permissions necessary to manage tags for the following GameLift
     * resource types:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Build
     * </p>
     * </li>
     * <li>
     * <p>
     * Script
     * </p>
     * </li>
     * <li>
     * <p>
     * Fleet
     * </p>
     * </li>
     * <li>
     * <p>
     * Alias
     * </p>
     * </li>
     * <li>
     * <p>
     * GameSessionQueue
     * </p>
     * </li>
     * <li>
     * <p>
     * MatchmakingConfiguration
     * </p>
     * </li>
     * <li>
     * <p>
     * MatchmakingRuleSet
     * </p>
     * </li>
     * </ul>
     * <p>
     * To remove a tag from a resource, specify the unique ARN value for the resource and provide a string list
     * containing one or more tags to be removed. This operation succeeds even if the list includes tags that are not
     * currently assigned to the specified resource.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging AWS Resources</a> in the <i>AWS
     * General Reference</i>
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/answers/account-management/aws-tagging-strategies/"> AWS Tagging Strategies</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>TagResource</a> | <a>UntagResource</a> | <a>ListTagsForResource</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param untagResourceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UntagResource operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UntagResourceResult> untagResourceAsync(UntagResourceRequest untagResourceRequest,
            com.amazonaws.handlers.AsyncHandler<UntagResourceRequest, UntagResourceResult> asyncHandler);

    /**
     * <p>
     * Updates properties for an alias. To update properties, specify the alias ID to be updated and provide the
     * information to be changed. To reassign an alias to another fleet, provide an updated routing strategy. If
     * successful, the updated alias record is returned.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateAlias</a> | <a>ListAliases</a> | <a>DescribeAlias</a> | <a>UpdateAlias</a> | <a>DeleteAlias</a> |
     * <a>ResolveAlias</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateAliasRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the UpdateAlias operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Updates properties for an alias. To update properties, specify the alias ID to be updated and provide the
     * information to be changed. To reassign an alias to another fleet, provide an updated routing strategy. If
     * successful, the updated alias record is returned.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateAlias</a> | <a>ListAliases</a> | <a>DescribeAlias</a> | <a>UpdateAlias</a> | <a>DeleteAlias</a> |
     * <a>ResolveAlias</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateAliasRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateAlias operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler);

    /**
     * <p>
     * Updates metadata in a build resource, including the build name and version. To update the metadata, specify the
     * build ID to update and provide the new values. If successful, a build object containing the updated metadata is
     * returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html"> Upload a Custom
     * Server Build</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateBuild</a> | <a>ListBuilds</a> | <a>DescribeBuild</a> | <a>UpdateBuild</a> | <a>DeleteBuild</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateBuildRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the UpdateBuild operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBuildResult> updateBuildAsync(UpdateBuildRequest updateBuildRequest);

    /**
     * <p>
     * Updates metadata in a build resource, including the build name and version. To update the metadata, specify the
     * build ID to update and provide the new values. If successful, a build object containing the updated metadata is
     * returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html"> Upload a Custom
     * Server Build</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateBuild</a> | <a>ListBuilds</a> | <a>DescribeBuild</a> | <a>UpdateBuild</a> | <a>DeleteBuild</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateBuildRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateBuild operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateBuildResult> updateBuildAsync(UpdateBuildRequest updateBuildRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateBuildRequest, UpdateBuildResult> asyncHandler);

    /**
     * <p>
     * Updates a fleet's mutable attributes, including game session protection and resource creation limits.
     * </p>
     * <p>
     * To update fleet attributes, specify the fleet ID and the property values that you want to change.
     * </p>
     * <p>
     * If successful, an updated <code>FleetAttributes</code> object is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>UpdateFleetAttributes</a> | <a>UpdateFleetCapacity</a> |
     * <a>UpdateFleetPortSettings</a> | <a>UpdateRuntimeConfiguration</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a>PutScalingPolicy</a> | <a>DeleteFleet</a> | <a>DeleteFleetLocations</a> |
     * <a>DeleteScalingPolicy</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateFleetAttributesRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the UpdateFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetAttributesResult> updateFleetAttributesAsync(UpdateFleetAttributesRequest updateFleetAttributesRequest);

    /**
     * <p>
     * Updates a fleet's mutable attributes, including game session protection and resource creation limits.
     * </p>
     * <p>
     * To update fleet attributes, specify the fleet ID and the property values that you want to change.
     * </p>
     * <p>
     * If successful, an updated <code>FleetAttributes</code> object is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>UpdateFleetAttributes</a> | <a>UpdateFleetCapacity</a> |
     * <a>UpdateFleetPortSettings</a> | <a>UpdateRuntimeConfiguration</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a>PutScalingPolicy</a> | <a>DeleteFleet</a> | <a>DeleteFleetLocations</a> |
     * <a>DeleteScalingPolicy</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateFleetAttributesRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetAttributesResult> updateFleetAttributesAsync(UpdateFleetAttributesRequest updateFleetAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetAttributesRequest, UpdateFleetAttributesResult> asyncHandler);

    /**
     * <p>
     * Updates capacity settings for a fleet. For fleets with multiple locations, use this operation to manage capacity
     * settings in each location individually. Fleet capacity determines the number of game sessions and players that
     * can be hosted based on the fleet configuration. Use this operation to set the following fleet capacity
     * properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Minimum/maximum size: Set hard limits on fleet capacity. GameLift cannot set the fleet's capacity to a value
     * outside of this range, whether the capacity is changed manually or through automatic scaling.
     * </p>
     * </li>
     * <li>
     * <p>
     * Desired capacity: Manually set the number of EC2 instances to be maintained in a fleet location. Before changing
     * a fleet's desired capacity, you may want to call <a>DescribeEC2InstanceLimits</a> to get the maximum capacity of
     * the fleet's EC2 instance type. Alternatively, consider using automatic scaling to adjust capacity based on player
     * demand.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To update capacity for a fleet's home Region, or if the fleet has no remote locations, omit the
     * <code>Location</code> parameter. The fleet must be in <code>ACTIVE</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * To update capacity for a fleet's remote location, include the <code>Location</code> parameter set to the location
     * to be updated. The location must be in <code>ACTIVE</code> status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, capacity settings are updated immediately. In response a change in desired capacity, GameLift
     * initiates steps to start new instances or terminate existing instances in the requested fleet location. This
     * continues until the location's active instance count matches the new desired instance count. You can track a
     * fleet's current capacity by calling <a>DescribeFleetCapacity</a> or <a>DescribeFleetLocationCapacity</a>. If the
     * requested desired instance count is higher than the instance type's limit, the <code>LimitExceeded</code>
     * exception occurs.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-manage-capacity.html">Scaling fleet
     * capacity</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>UpdateFleetAttributes</a> | <a>UpdateFleetCapacity</a> |
     * <a>UpdateFleetPortSettings</a> | <a>UpdateRuntimeConfiguration</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a>PutScalingPolicy</a> | <a>DeleteFleet</a> | <a>DeleteFleetLocations</a> |
     * <a>DeleteScalingPolicy</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateFleetCapacityRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the UpdateFleetCapacity operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetCapacityResult> updateFleetCapacityAsync(UpdateFleetCapacityRequest updateFleetCapacityRequest);

    /**
     * <p>
     * Updates capacity settings for a fleet. For fleets with multiple locations, use this operation to manage capacity
     * settings in each location individually. Fleet capacity determines the number of game sessions and players that
     * can be hosted based on the fleet configuration. Use this operation to set the following fleet capacity
     * properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Minimum/maximum size: Set hard limits on fleet capacity. GameLift cannot set the fleet's capacity to a value
     * outside of this range, whether the capacity is changed manually or through automatic scaling.
     * </p>
     * </li>
     * <li>
     * <p>
     * Desired capacity: Manually set the number of EC2 instances to be maintained in a fleet location. Before changing
     * a fleet's desired capacity, you may want to call <a>DescribeEC2InstanceLimits</a> to get the maximum capacity of
     * the fleet's EC2 instance type. Alternatively, consider using automatic scaling to adjust capacity based on player
     * demand.
     * </p>
     * </li>
     * </ul>
     * <p>
     * This operation can be used in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To update capacity for a fleet's home Region, or if the fleet has no remote locations, omit the
     * <code>Location</code> parameter. The fleet must be in <code>ACTIVE</code> status.
     * </p>
     * </li>
     * <li>
     * <p>
     * To update capacity for a fleet's remote location, include the <code>Location</code> parameter set to the location
     * to be updated. The location must be in <code>ACTIVE</code> status.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, capacity settings are updated immediately. In response a change in desired capacity, GameLift
     * initiates steps to start new instances or terminate existing instances in the requested fleet location. This
     * continues until the location's active instance count matches the new desired instance count. You can track a
     * fleet's current capacity by calling <a>DescribeFleetCapacity</a> or <a>DescribeFleetLocationCapacity</a>. If the
     * requested desired instance count is higher than the instance type's limit, the <code>LimitExceeded</code>
     * exception occurs.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-manage-capacity.html">Scaling fleet
     * capacity</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>UpdateFleetAttributes</a> | <a>UpdateFleetCapacity</a> |
     * <a>UpdateFleetPortSettings</a> | <a>UpdateRuntimeConfiguration</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a>PutScalingPolicy</a> | <a>DeleteFleet</a> | <a>DeleteFleetLocations</a> |
     * <a>DeleteScalingPolicy</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateFleetCapacityRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleetCapacity operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetCapacityResult> updateFleetCapacityAsync(UpdateFleetCapacityRequest updateFleetCapacityRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetCapacityRequest, UpdateFleetCapacityResult> asyncHandler);

    /**
     * <p>
     * Updates permissions that allow inbound traffic to connect to game sessions that are being hosted on instances in
     * the fleet.
     * </p>
     * <p>
     * To update settings, specify the fleet ID to be updated and specify the changes to be made. List the permissions
     * you want to add in <code>InboundPermissionAuthorizations</code>, and permissions you want to remove in
     * <code>InboundPermissionRevocations</code>. Permissions to be removed must match existing fleet permissions.
     * </p>
     * <p>
     * If successful, the fleet ID for the updated fleet is returned. For fleets with remote locations, port setting
     * updates can take time to propagate across all locations. You can check the status of updates in each location by
     * calling <code>DescribeFleetPortSettings</code> with a location name.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>UpdateFleetAttributes</a> | <a>UpdateFleetCapacity</a> |
     * <a>UpdateFleetPortSettings</a> | <a>UpdateRuntimeConfiguration</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a>PutScalingPolicy</a> | <a>DeleteFleet</a> | <a>DeleteFleetLocations</a> |
     * <a>DeleteScalingPolicy</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateFleetPortSettingsRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the UpdateFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetPortSettingsResult> updateFleetPortSettingsAsync(UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest);

    /**
     * <p>
     * Updates permissions that allow inbound traffic to connect to game sessions that are being hosted on instances in
     * the fleet.
     * </p>
     * <p>
     * To update settings, specify the fleet ID to be updated and specify the changes to be made. List the permissions
     * you want to add in <code>InboundPermissionAuthorizations</code>, and permissions you want to remove in
     * <code>InboundPermissionRevocations</code>. Permissions to be removed must match existing fleet permissions.
     * </p>
     * <p>
     * If successful, the fleet ID for the updated fleet is returned. For fleets with remote locations, port setting
     * updates can take time to propagate across all locations. You can check the status of updates in each location by
     * calling <code>DescribeFleetPortSettings</code> with a location name.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>UpdateFleetAttributes</a> | <a>UpdateFleetCapacity</a> |
     * <a>UpdateFleetPortSettings</a> | <a>UpdateRuntimeConfiguration</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a>PutScalingPolicy</a> | <a>DeleteFleet</a> | <a>DeleteFleetLocations</a> |
     * <a>DeleteScalingPolicy</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateFleetPortSettingsRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetPortSettingsResult> updateFleetPortSettingsAsync(UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateFleetPortSettingsRequest, UpdateFleetPortSettingsResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Updates information about a registered game server to help GameLift FleetIQ to track game server availability.
     * This operation is called by a game server process that is running on an instance in a game server group.
     * </p>
     * <p>
     * Use this operation to update the following types of game server information. You can make all three types of
     * updates in the same request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To update the game server's utilization status, identify the game server and game server group and specify the
     * current utilization status. Use this status to identify when game servers are currently hosting games and when
     * they are available to be claimed.
     * </p>
     * </li>
     * <li>
     * <p>
     * To report health status, identify the game server and game server group and set health check to
     * <code>HEALTHY</code>. If a game server does not report health status for a certain length of time, the game
     * server is no longer considered healthy. As a result, it will be eventually deregistered from the game server
     * group to avoid affecting utilization metrics. The best practice is to report health every 60 seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * To change game server metadata, provide updated game server data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Once a game server is successfully updated, the relevant statuses and timestamps are updated.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>RegisterGameServer</a> | <a>ListGameServers</a> | <a>ClaimGameServer</a> | <a>DescribeGameServer</a> |
     * <a>UpdateGameServer</a> | <a>DeregisterGameServer</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param updateGameServerRequest
     * @return A Java Future containing the result of the UpdateGameServer operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameServerResult> updateGameServerAsync(UpdateGameServerRequest updateGameServerRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Updates information about a registered game server to help GameLift FleetIQ to track game server availability.
     * This operation is called by a game server process that is running on an instance in a game server group.
     * </p>
     * <p>
     * Use this operation to update the following types of game server information. You can make all three types of
     * updates in the same request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To update the game server's utilization status, identify the game server and game server group and specify the
     * current utilization status. Use this status to identify when game servers are currently hosting games and when
     * they are available to be claimed.
     * </p>
     * </li>
     * <li>
     * <p>
     * To report health status, identify the game server and game server group and set health check to
     * <code>HEALTHY</code>. If a game server does not report health status for a certain length of time, the game
     * server is no longer considered healthy. As a result, it will be eventually deregistered from the game server
     * group to avoid affecting utilization metrics. The best practice is to report health every 60 seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * To change game server metadata, provide updated game server data.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Once a game server is successfully updated, the relevant statuses and timestamps are updated.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>RegisterGameServer</a> | <a>ListGameServers</a> | <a>ClaimGameServer</a> | <a>DescribeGameServer</a> |
     * <a>UpdateGameServer</a> | <a>DeregisterGameServer</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param updateGameServerRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGameServer operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameServer" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameServerResult> updateGameServerAsync(UpdateGameServerRequest updateGameServerRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGameServerRequest, UpdateGameServerResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Updates GameLift FleetIQ-specific properties for a game server group. Many Auto Scaling group properties are
     * updated on the Auto Scaling group directly, including the launch template, Auto Scaling policies, and
     * maximum/minimum/desired instance counts.
     * </p>
     * <p>
     * To update the game server group, specify the game server group ID and provide the updated values. Before applying
     * the updates, the new values are validated to ensure that GameLift FleetIQ can continue to perform instance
     * balancing activity. If successful, a <a>GameServerGroup</a> object is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param updateGameServerGroupRequest
     * @return A Java Future containing the result of the UpdateGameServerGroup operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameServerGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameServerGroupResult> updateGameServerGroupAsync(UpdateGameServerGroupRequest updateGameServerGroupRequest);

    /**
     * <p>
     * <b>This operation is used with the GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Updates GameLift FleetIQ-specific properties for a game server group. Many Auto Scaling group properties are
     * updated on the Auto Scaling group directly, including the launch template, Auto Scaling policies, and
     * maximum/minimum/desired instance counts.
     * </p>
     * <p>
     * To update the game server group, specify the game server group ID and provide the updated values. Before applying
     * the updates, the new values are validated to ensure that GameLift FleetIQ can continue to perform instance
     * balancing activity. If successful, a <a>GameServerGroup</a> object is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">GameLift FleetIQ Guide</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameServerGroup</a> | <a>ListGameServerGroups</a> | <a>DescribeGameServerGroup</a> |
     * <a>UpdateGameServerGroup</a> | <a>DeleteGameServerGroup</a> | <a>ResumeGameServerGroup</a> |
     * <a>SuspendGameServerGroup</a> | <a>DescribeGameServerInstances</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/reference-awssdk-fleetiq.html">All APIs by
     * task</a>
     * </p>
     * 
     * @param updateGameServerGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGameServerGroup operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameServerGroup" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameServerGroupResult> updateGameServerGroupAsync(UpdateGameServerGroupRequest updateGameServerGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGameServerGroupRequest, UpdateGameServerGroupResult> asyncHandler);

    /**
     * <p>
     * Updates the mutable properties of a game session.
     * </p>
     * <p>
     * To update a game session, specify the game session ID and the values you want to change.
     * </p>
     * <p>
     * If successful, the updated <code>GameSession</code> object is returned.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateGameSessionRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the UpdateGameSession operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateGameSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameSessionResult> updateGameSessionAsync(UpdateGameSessionRequest updateGameSessionRequest);

    /**
     * <p>
     * Updates the mutable properties of a game session.
     * </p>
     * <p>
     * To update a game session, specify the game session ID and the values you want to change.
     * </p>
     * <p>
     * If successful, the updated <code>GameSession</code> object is returned.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSession</a> | <a>DescribeGameSessions</a> | <a>DescribeGameSessionDetails</a> |
     * <a>SearchGameSessions</a> | <a>UpdateGameSession</a> | <a>GetGameSessionLogUrl</a> |
     * <a>StartGameSessionPlacement</a> | <a>DescribeGameSessionPlacement</a> | <a>StopGameSessionPlacement</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateGameSessionRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGameSession operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateGameSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSession" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameSessionResult> updateGameSessionAsync(UpdateGameSessionRequest updateGameSessionRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGameSessionRequest, UpdateGameSessionResult> asyncHandler);

    /**
     * <p>
     * Updates the configuration of a game session queue, which determines how the queue processes new game session
     * requests. To update settings, specify the queue name to be updated and provide the new settings. When updating
     * destinations, provide a complete list of destinations.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html"> Using Multi-Region
     * Queues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSessionQueue</a> | <a>DescribeGameSessionQueues</a> | <a>UpdateGameSessionQueue</a> |
     * <a>DeleteGameSessionQueue</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateGameSessionQueueRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the UpdateGameSessionQueue operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameSessionQueueResult> updateGameSessionQueueAsync(UpdateGameSessionQueueRequest updateGameSessionQueueRequest);

    /**
     * <p>
     * Updates the configuration of a game session queue, which determines how the queue processes new game session
     * requests. To update settings, specify the queue name to be updated and provide the new settings. When updating
     * destinations, provide a complete list of destinations.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-intro.html"> Using Multi-Region
     * Queues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateGameSessionQueue</a> | <a>DescribeGameSessionQueues</a> | <a>UpdateGameSessionQueue</a> |
     * <a>DeleteGameSessionQueue</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateGameSessionQueueRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateGameSessionQueue operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateGameSessionQueueResult> updateGameSessionQueueAsync(UpdateGameSessionQueueRequest updateGameSessionQueueRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGameSessionQueueRequest, UpdateGameSessionQueueResult> asyncHandler);

    /**
     * <p>
     * Updates settings for a FlexMatch matchmaking configuration. These changes affect all matches and game sessions
     * that are created after the update. To update settings, specify the configuration name to be updated and provide
     * the new settings.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-configuration.html"> Design a FlexMatch
     * matchmaker</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateMatchmakingConfigurationRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the UpdateMatchmakingConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.UpdateMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMatchmakingConfigurationResult> updateMatchmakingConfigurationAsync(
            UpdateMatchmakingConfigurationRequest updateMatchmakingConfigurationRequest);

    /**
     * <p>
     * Updates settings for a FlexMatch matchmaking configuration. These changes affect all matches and game sessions
     * that are created after the update. To update settings, specify the configuration name to be updated and provide
     * the new settings.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-configuration.html"> Design a FlexMatch
     * matchmaker</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateMatchmakingConfigurationRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateMatchmakingConfiguration operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.UpdateMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateMatchmakingConfigurationResult> updateMatchmakingConfigurationAsync(
            UpdateMatchmakingConfigurationRequest updateMatchmakingConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateMatchmakingConfigurationRequest, UpdateMatchmakingConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates the current runtime configuration for the specified fleet, which tells GameLift how to launch server
     * processes on all instances in the fleet. You can update a fleet's runtime configuration at any time after the
     * fleet is created; it does not need to be in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * To update runtime configuration, specify the fleet ID and provide a <code>RuntimeConfiguration</code> with an
     * updated set of server process configurations.
     * </p>
     * <p>
     * If successful, the fleet's runtime configuration settings are updated. Each instance in the fleet regularly
     * checks for and retrieves updated runtime configurations. Instances immediately begin complying with the new
     * configuration by launching new server processes or not replacing existing processes when they shut down. Updating
     * a fleet's runtime configuration never affects existing server processes.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>UpdateFleetAttributes</a> | <a>UpdateFleetCapacity</a> |
     * <a>UpdateFleetPortSettings</a> | <a>UpdateRuntimeConfiguration</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a>PutScalingPolicy</a> | <a>DeleteFleet</a> | <a>DeleteFleetLocations</a> |
     * <a>DeleteScalingPolicy</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateRuntimeConfigurationRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the UpdateRuntimeConfiguration operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuntimeConfigurationResult> updateRuntimeConfigurationAsync(
            UpdateRuntimeConfigurationRequest updateRuntimeConfigurationRequest);

    /**
     * <p>
     * Updates the current runtime configuration for the specified fleet, which tells GameLift how to launch server
     * processes on all instances in the fleet. You can update a fleet's runtime configuration at any time after the
     * fleet is created; it does not need to be in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * To update runtime configuration, specify the fleet ID and provide a <code>RuntimeConfiguration</code> with an
     * updated set of server process configurations.
     * </p>
     * <p>
     * If successful, the fleet's runtime configuration settings are updated. Each instance in the fleet regularly
     * checks for and retrieves updated runtime configurations. Instances immediately begin complying with the new
     * configuration by launching new server processes or not replacing existing processes when they shut down. Updating
     * a fleet's runtime configuration never affects existing server processes.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up GameLift
     * fleets</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateFleetLocations</a> | <a>UpdateFleetAttributes</a> | <a>UpdateFleetCapacity</a> |
     * <a>UpdateFleetPortSettings</a> | <a>UpdateRuntimeConfiguration</a> | <a>StopFleetActions</a> |
     * <a>StartFleetActions</a> | <a>PutScalingPolicy</a> | <a>DeleteFleet</a> | <a>DeleteFleetLocations</a> |
     * <a>DeleteScalingPolicy</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateRuntimeConfigurationRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateRuntimeConfiguration operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuntimeConfigurationResult> updateRuntimeConfigurationAsync(
            UpdateRuntimeConfigurationRequest updateRuntimeConfigurationRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateRuntimeConfigurationRequest, UpdateRuntimeConfigurationResult> asyncHandler);

    /**
     * <p>
     * Updates Realtime script metadata and content.
     * </p>
     * <p>
     * To update script metadata, specify the script ID and provide updated name and/or version values.
     * </p>
     * <p>
     * To update script content, provide an updated zip file by pointing to either a local file or an Amazon S3 bucket
     * location. You can use either method regardless of how the original script was uploaded. Use the <i>Version</i>
     * parameter to track updates to the script.
     * </p>
     * <p>
     * If the call is successful, the updated metadata is stored in the script record and a revised script is uploaded
     * to the Amazon GameLift service. Once the script is updated and acquired by a fleet instance, the new version is
     * used for all new game sessions.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateScript</a> | <a>ListScripts</a> | <a>DescribeScript</a> | <a>UpdateScript</a> | <a>DeleteScript</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateScriptRequest
     * @return A Java Future containing the result of the UpdateScript operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateScript" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateScriptResult> updateScriptAsync(UpdateScriptRequest updateScriptRequest);

    /**
     * <p>
     * Updates Realtime script metadata and content.
     * </p>
     * <p>
     * To update script metadata, specify the script ID and provide updated name and/or version values.
     * </p>
     * <p>
     * To update script content, provide an updated zip file by pointing to either a local file or an Amazon S3 bucket
     * location. You can use either method regardless of how the original script was uploaded. Use the <i>Version</i>
     * parameter to track updates to the script.
     * </p>
     * <p>
     * If the call is successful, the updated metadata is stored in the script record and a revised script is uploaded
     * to the Amazon GameLift service. Once the script is updated and acquired by a fleet instance, the new version is
     * used for all new game sessions.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/realtime-intro.html">Amazon GameLift Realtime
     * Servers</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateScript</a> | <a>ListScripts</a> | <a>DescribeScript</a> | <a>UpdateScript</a> | <a>DeleteScript</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateScriptRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateScript operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.UpdateScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateScript" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateScriptResult> updateScriptAsync(UpdateScriptRequest updateScriptRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateScriptRequest, UpdateScriptResult> asyncHandler);

    /**
     * <p>
     * Validates the syntax of a matchmaking rule or rule set. This operation checks that the rule set is using
     * syntactically correct JSON and that it conforms to allowed property expressions. To validate syntax, provide a
     * rule set JSON string.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-rulesets.html">Build a rule set</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param validateMatchmakingRuleSetRequest
     *        Represents the input for a request operation.
     * @return A Java Future containing the result of the ValidateMatchmakingRuleSet operation returned by the service.
     * @sample AmazonGameLiftAsync.ValidateMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ValidateMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateMatchmakingRuleSetResult> validateMatchmakingRuleSetAsync(
            ValidateMatchmakingRuleSetRequest validateMatchmakingRuleSetRequest);

    /**
     * <p>
     * Validates the syntax of a matchmaking rule or rule set. This operation checks that the rule set is using
     * syntactically correct JSON and that it conforms to allowed property expressions. To validate syntax, provide a
     * rule set JSON string.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/match-rulesets.html">Build a rule set</a>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a>CreateMatchmakingConfiguration</a> | <a>DescribeMatchmakingConfigurations</a> |
     * <a>UpdateMatchmakingConfiguration</a> | <a>DeleteMatchmakingConfiguration</a> | <a>CreateMatchmakingRuleSet</a> |
     * <a>DescribeMatchmakingRuleSets</a> | <a>ValidateMatchmakingRuleSet</a> | <a>DeleteMatchmakingRuleSet</a> | <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param validateMatchmakingRuleSetRequest
     *        Represents the input for a request operation.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidateMatchmakingRuleSet operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ValidateMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ValidateMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ValidateMatchmakingRuleSetResult> validateMatchmakingRuleSetAsync(
            ValidateMatchmakingRuleSetRequest validateMatchmakingRuleSetRequest,
            com.amazonaws.handlers.AsyncHandler<ValidateMatchmakingRuleSetRequest, ValidateMatchmakingRuleSetResult> asyncHandler);

}
