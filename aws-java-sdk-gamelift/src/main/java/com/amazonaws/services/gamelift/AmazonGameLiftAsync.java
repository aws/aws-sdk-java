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
 * <p>
 * Amazon GameLift provides solutions for hosting session-based multiplayer game servers in the cloud, including tools
 * for deploying, operating, and scaling game servers. Built on Amazon Web Services global computing infrastructure,
 * GameLift helps you deliver high-performance, high-reliability, low-cost game servers while dynamically scaling your
 * resource usage to meet player demand.
 * </p>
 * <p>
 * <b>About Amazon GameLift solutions</b>
 * </p>
 * <p>
 * Get more information on these Amazon GameLift solutions in the <a
 * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/">Amazon GameLift Developer Guide</a>.
 * </p>
 * <ul>
 * <li>
 * <p>
 * Amazon GameLift managed hosting -- Amazon GameLift offers a fully managed service to set up and maintain computing
 * machines for hosting, manage game session and player session life cycle, and handle security, storage, and
 * performance tracking. You can use automatic scaling tools to balance player demand and hosting costs, configure your
 * game session management to minimize player latency, and add FlexMatch for matchmaking.
 * </p>
 * </li>
 * <li>
 * <p>
 * Managed hosting with Realtime Servers -- With Amazon GameLift Realtime Servers, you can quickly configure and set up
 * ready-to-go game servers for your game. Realtime Servers provides a game server framework with core Amazon GameLift
 * infrastructure already built in. Then use the full range of Amazon GameLift managed hosting features, including
 * FlexMatch, for your game.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon GameLift FleetIQ -- Use Amazon GameLift FleetIQ as a standalone service while hosting your games using EC2
 * instances and Auto Scaling groups. Amazon GameLift FleetIQ provides optimizations for game hosting, including
 * boosting the viability of low-cost Spot Instances gaming. For a complete solution, pair the Amazon GameLift FleetIQ
 * and FlexMatch standalone services.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon GameLift FlexMatch -- Add matchmaking to your game hosting solution. FlexMatch is a customizable matchmaking
 * service for multiplayer games. Use FlexMatch as integrated with Amazon GameLift managed hosting or incorporate
 * FlexMatch as a standalone service into your own hosting solution.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>About this API Reference</b>
 * </p>
 * <p>
 * This reference guide describes the low-level service API for Amazon GameLift. With each topic in this guide, you can
 * find links to language-specific SDK guides and the Amazon Web Services CLI reference. Useful links:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html">Amazon GameLift API
 * operations listed by tasks</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-components.html"> Amazon GameLift tools
 * and resources</a>
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
     * <code>REQUIRES_ACCEPTANCE</code>. This is a trigger for your game to get acceptance from all players in each
     * ticket. Calls to this action are only valid for tickets that are in this status; calls for tickets not in this
     * status result in an error.
     * </p>
     * <p>
     * To register acceptance, specify the ticket ID, one or more players, and an acceptance response. When all players
     * have accepted, Amazon GameLift advances the matchmaking tickets to status <code>PLACING</code>, and attempts to
     * create a new game session for the match.
     * </p>
     * <p>
     * If any player rejects the match, or if acceptances are not received before a specified timeout, the proposed
     * match is dropped. Each matchmaking ticket in the failed match is handled as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the ticket has one or more players who rejected the match or failed to respond, the ticket status is set
     * <code>CANCELLED</code> and processing is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * If all players in the ticket accepted the match, the ticket status is returned to <code>SEARCHING</code> to find
     * a new match.
     * </p>
     * </li>
     * </ul>
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
     * 
     * @param acceptMatchRequest
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
     * <code>REQUIRES_ACCEPTANCE</code>. This is a trigger for your game to get acceptance from all players in each
     * ticket. Calls to this action are only valid for tickets that are in this status; calls for tickets not in this
     * status result in an error.
     * </p>
     * <p>
     * To register acceptance, specify the ticket ID, one or more players, and an acceptance response. When all players
     * have accepted, Amazon GameLift advances the matchmaking tickets to status <code>PLACING</code>, and attempts to
     * create a new game session for the match.
     * </p>
     * <p>
     * If any player rejects the match, or if acceptances are not received before a specified timeout, the proposed
     * match is dropped. Each matchmaking ticket in the failed match is handled as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the ticket has one or more players who rejected the match or failed to respond, the ticket status is set
     * <code>CANCELLED</code> and processing is terminated.
     * </p>
     * </li>
     * <li>
     * <p>
     * If all players in the ticket accepted the match, the ticket status is returned to <code>SEARCHING</code> to find
     * a new match.
     * </p>
     * </li>
     * </ul>
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
     * 
     * @param acceptMatchRequest
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Locates an available game server and temporarily reserves it to host gameplay and players. This operation is
     * called from a game client or client service (such as a matchmaker) to request hosting resources for a new game
     * session. In response, Amazon GameLift FleetIQ locates an available game server, places it in <code>CLAIMED</code>
     * status for 60 seconds, and returns connection information that players can use to connect to the game server.
     * </p>
     * <p>
     * To claim a game server, identify a game server group. You can also specify a game server ID, although this
     * approach bypasses Amazon GameLift FleetIQ placement optimization. Optionally, include game data to pass to the
     * game server at the start of a game session, such as a game map or player information. Add filter options to
     * further restrict how a game server is chosen, such as only allowing game servers on <code>ACTIVE</code> instances
     * to be claimed.
     * </p>
     * <p>
     * When a game server is successfully claimed, connection information is returned. A claimed game server's
     * utilization status remains <code>AVAILABLE</code> while the claim status is set to <code>CLAIMED</code> for up to
     * 60 seconds. This time period gives the game server time to update its status to <code>UTILIZED</code> after
     * players join. If the game server's status is not updated within 60 seconds, the game server reverts to unclaimed
     * status and is available to be claimed by another request. The claim time period is a fixed value and is not
     * configurable.
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
     * <li>
     * <p>
     * If the game server is running on an instance in <code>DRAINING</code> status and the provided filter option does
     * not allow placing on <code>DRAINING</code> instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Locates an available game server and temporarily reserves it to host gameplay and players. This operation is
     * called from a game client or client service (such as a matchmaker) to request hosting resources for a new game
     * session. In response, Amazon GameLift FleetIQ locates an available game server, places it in <code>CLAIMED</code>
     * status for 60 seconds, and returns connection information that players can use to connect to the game server.
     * </p>
     * <p>
     * To claim a game server, identify a game server group. You can also specify a game server ID, although this
     * approach bypasses Amazon GameLift FleetIQ placement optimization. Optionally, include game data to pass to the
     * game server at the start of a game session, such as a game map or player information. Add filter options to
     * further restrict how a game server is chosen, such as only allowing game servers on <code>ACTIVE</code> instances
     * to be claimed.
     * </p>
     * <p>
     * When a game server is successfully claimed, connection information is returned. A claimed game server's
     * utilization status remains <code>AVAILABLE</code> while the claim status is set to <code>CLAIMED</code> for up to
     * 60 seconds. This time period gives the game server time to update its status to <code>UTILIZED</code> after
     * players join. If the game server's status is not updated within 60 seconds, the game server reverts to unclaimed
     * status and is available to be claimed by another request. The claim time period is a fixed value and is not
     * configurable.
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
     * <li>
     * <p>
     * If the game server is running on an instance in <code>DRAINING</code> status and the provided filter option does
     * not allow placing on <code>DRAINING</code> instances.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createAliasRequest
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createAliasRequest
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
     * Creates a new Amazon GameLift build resource for your game server binary files. Combine game server binaries into
     * a zip file for use with Amazon GameLift.
     * </p>
     * <important>
     * <p>
     * When setting up a new game build for Amazon GameLift, we recommend using the CLI command <b> <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/gamelift/upload-build.html">upload-build</a> </b>. This
     * helper command combines two tasks: (1) it uploads your build files from a file directory to an Amazon GameLift
     * Amazon S3 location, and (2) it creates a new build resource.
     * </p>
     * </important>
     * <p>
     * You can use the <code>CreateBuild</code> operation in the following scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create a new game build with build files that are in an Amazon S3 location under an Amazon Web Services account
     * that you control. To use this option, you give Amazon GameLift access to the Amazon S3 bucket. With permissions
     * in place, specify a build name, operating system, and the Amazon S3 storage location of your game build.
     * </p>
     * </li>
     * <li>
     * <p>
     * Upload your build files to a Amazon GameLift Amazon S3 location. To use this option, specify a build name and
     * operating system. This operation creates a new build resource and also returns an Amazon S3 location with
     * temporary access credentials. Use the credentials to manually upload your build files to the specified Amazon S3
     * location. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UploadingObjects.html">Uploading Objects</a> in the
     * <i>Amazon S3 Developer Guide</i>. After you upload build files to the Amazon GameLift Amazon S3 location, you
     * can't update them.
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createBuildRequest
     * @return A Java Future containing the result of the CreateBuild operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateBuild" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateBuildResult> createBuildAsync(CreateBuildRequest createBuildRequest);

    /**
     * <p>
     * Creates a new Amazon GameLift build resource for your game server binary files. Combine game server binaries into
     * a zip file for use with Amazon GameLift.
     * </p>
     * <important>
     * <p>
     * When setting up a new game build for Amazon GameLift, we recommend using the CLI command <b> <a
     * href="https://docs.aws.amazon.com/cli/latest/reference/gamelift/upload-build.html">upload-build</a> </b>. This
     * helper command combines two tasks: (1) it uploads your build files from a file directory to an Amazon GameLift
     * Amazon S3 location, and (2) it creates a new build resource.
     * </p>
     * </important>
     * <p>
     * You can use the <code>CreateBuild</code> operation in the following scenarios:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Create a new game build with build files that are in an Amazon S3 location under an Amazon Web Services account
     * that you control. To use this option, you give Amazon GameLift access to the Amazon S3 bucket. With permissions
     * in place, specify a build name, operating system, and the Amazon S3 storage location of your game build.
     * </p>
     * </li>
     * <li>
     * <p>
     * Upload your build files to a Amazon GameLift Amazon S3 location. To use this option, specify a build name and
     * operating system. This operation creates a new build resource and also returns an Amazon S3 location with
     * temporary access credentials. Use the credentials to manually upload your build files to the specified Amazon S3
     * location. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonS3/latest/dev/UploadingObjects.html">Uploading Objects</a> in the
     * <i>Amazon S3 Developer Guide</i>. After you upload build files to the Amazon GameLift Amazon S3 location, you
     * can't update them.
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createBuildRequest
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
     * <b>This operation is used with the Amazon GameLift containers feature, which is currently in public preview. </b>
     * </p>
     * <p>
     * Creates a <code>ContainerGroupDefinition</code> resource that describes a set of containers for hosting your game
     * server with Amazon GameLift managed EC2 hosting. An Amazon GameLift container group is similar to a container
     * "task" and "pod". Each container group can have one or more containers.
     * </p>
     * <p>
     * Use container group definitions when you create a container fleet. Container group definitions determine how
     * Amazon GameLift deploys your containers to each instance in a container fleet.
     * </p>
     * <p>
     * You can create two types of container groups, based on scheduling strategy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <b>replica container group</b> manages the containers that run your game server application and supporting
     * software. Replica container groups might be replicated multiple times on each fleet instance, depending on
     * instance resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <b>daemon container group</b> manages containers that run other software, such as background services, logging,
     * or test processes. You might use a daemon container group for processes that need to run only once per fleet
     * instance, or processes that need to persist independently of the replica container group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create a container group definition, specify a group name, a list of container definitions, and maximum total
     * CPU and memory requirements for the container group. Specify an operating system and scheduling strategy or use
     * the default values. When using the Amazon Web Services CLI tool, you can pass in your container definitions as a
     * JSON file.
     * </p>
     * <note>
     * <p>
     * This operation requires Identity and Access Management (IAM) permissions to access container images in Amazon ECR
     * repositories. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html"> IAM
     * permissions for Amazon GameLift</a> for help setting the appropriate permissions.
     * </p>
     * </note>
     * <p>
     * If successful, this operation creates a new <code>ContainerGroupDefinition</code> resource with an ARN value
     * assigned. You can't change the properties of a container group definition. Instead, create a new one.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-create-groups.html">Create a
     * container group definition</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet.html">Container fleet
     * design guide</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-definitions.html#containers-definitions-create"
     * >Create a container definition as a JSON file</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createContainerGroupDefinitionRequest
     * @return A Java Future containing the result of the CreateContainerGroupDefinition operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.CreateContainerGroupDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateContainerGroupDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContainerGroupDefinitionResult> createContainerGroupDefinitionAsync(
            CreateContainerGroupDefinitionRequest createContainerGroupDefinitionRequest);

    /**
     * <p>
     * <b>This operation is used with the Amazon GameLift containers feature, which is currently in public preview. </b>
     * </p>
     * <p>
     * Creates a <code>ContainerGroupDefinition</code> resource that describes a set of containers for hosting your game
     * server with Amazon GameLift managed EC2 hosting. An Amazon GameLift container group is similar to a container
     * "task" and "pod". Each container group can have one or more containers.
     * </p>
     * <p>
     * Use container group definitions when you create a container fleet. Container group definitions determine how
     * Amazon GameLift deploys your containers to each instance in a container fleet.
     * </p>
     * <p>
     * You can create two types of container groups, based on scheduling strategy:
     * </p>
     * <ul>
     * <li>
     * <p>
     * A <b>replica container group</b> manages the containers that run your game server application and supporting
     * software. Replica container groups might be replicated multiple times on each fleet instance, depending on
     * instance resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * A <b>daemon container group</b> manages containers that run other software, such as background services, logging,
     * or test processes. You might use a daemon container group for processes that need to run only once per fleet
     * instance, or processes that need to persist independently of the replica container group.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create a container group definition, specify a group name, a list of container definitions, and maximum total
     * CPU and memory requirements for the container group. Specify an operating system and scheduling strategy or use
     * the default values. When using the Amazon Web Services CLI tool, you can pass in your container definitions as a
     * JSON file.
     * </p>
     * <note>
     * <p>
     * This operation requires Identity and Access Management (IAM) permissions to access container images in Amazon ECR
     * repositories. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-iam-policy-examples.html"> IAM
     * permissions for Amazon GameLift</a> for help setting the appropriate permissions.
     * </p>
     * </note>
     * <p>
     * If successful, this operation creates a new <code>ContainerGroupDefinition</code> resource with an ARN value
     * assigned. You can't change the properties of a container group definition. Instead, create a new one.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-create-groups.html">Create a
     * container group definition</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-design-fleet.html">Container fleet
     * design guide</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-definitions.html#containers-definitions-create"
     * >Create a container definition as a JSON file</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param createContainerGroupDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateContainerGroupDefinition operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.CreateContainerGroupDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateContainerGroupDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateContainerGroupDefinitionResult> createContainerGroupDefinitionAsync(
            CreateContainerGroupDefinitionRequest createContainerGroupDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<CreateContainerGroupDefinitionRequest, CreateContainerGroupDefinitionResult> asyncHandler);

    /**
     * <p>
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Creates a fleet of compute resources to host your game servers. Use this operation to set up the following types
     * of fleets based on compute type:
     * </p>
     * <p>
     * <b>Managed EC2 fleet</b>
     * </p>
     * <p>
     * An EC2 fleet is a set of Amazon Elastic Compute Cloud (Amazon EC2) instances. Your game server build is deployed
     * to each fleet instance. Amazon GameLift manages the fleet's instances and controls the lifecycle of game server
     * processes, which host game sessions for players. EC2 fleets can have instances in multiple locations. Each
     * instance in the fleet is designated a <code>Compute</code>.
     * </p>
     * <p>
     * To create an EC2 fleet, provide these required parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Either <code>BuildId</code> or <code>ScriptId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ComputeType</code> set to <code>EC2</code> (the default value)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2InboundPermissions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2InstanceType</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FleetType</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RuntimeConfiguration</code> with at least one <code>ServerProcesses</code> configuration
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, this operation creates a new fleet resource and places it in <code>NEW</code> status while Amazon
     * GameLift initiates the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-all.html#fleets-creation-workflow"
     * >fleet creation workflow</a>. To debug your fleet, fetch logs, view performance metrics or other actions on the
     * fleet, create a development fleet with port 22/3389 open. As a best practice, we recommend opening ports for
     * remote access only when you need them and closing them when you're finished.
     * </p>
     * <p>
     * When the fleet status is ACTIVE, you can adjust capacity settings and turn autoscaling on/off for each location.
     * </p>
     * <p>
     * <b>Managed container fleet</b>
     * </p>
     * <p>
     * A container fleet is a set of Amazon Elastic Compute Cloud (Amazon EC2) instances. Your container architecture is
     * deployed to each fleet instance based on the fleet configuration. Amazon GameLift manages the containers on each
     * fleet instance and controls the lifecycle of game server processes, which host game sessions for players.
     * Container fleets can have instances in multiple locations. Each container on an instance that runs game server
     * processes is registered as a <code>Compute</code>.
     * </p>
     * <p>
     * To create a container fleet, provide these required parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ComputeType</code> set to <code>CONTAINER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContainerGroupsConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2InboundPermissions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2InstanceType</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FleetType</code> set to <code>ON_DEMAND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RuntimeConfiguration</code> with at least one <code>ServerProcesses</code> configuration
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, this operation creates a new fleet resource and places it in <code>NEW</code> status while Amazon
     * GameLift initiates the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-all.html#fleets-creation-workflow"
     * >fleet creation workflow</a>.
     * </p>
     * <p>
     * When the fleet status is ACTIVE, you can adjust capacity settings and turn autoscaling on/off for each location.
     * </p>
     * <p>
     * <b>Anywhere fleet</b>
     * </p>
     * <p>
     * An Anywhere fleet represents compute resources that are not owned or managed by Amazon GameLift. You might create
     * an Anywhere fleet with your local machine for testing, or use one to host game servers with on-premises hardware
     * or other game hosting solutions.
     * </p>
     * <p>
     * To create an Anywhere fleet, provide these required parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ComputeType</code> set to <code>ANYWHERE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Locations</code> specifying a custom location
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, this operation creates a new fleet resource and places it in <code>ACTIVE</code> status. You can
     * register computes with a fleet in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up fleets</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-build-fleet.html">Setting up a
     * container fleet</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html#fleets-creating-debug-creation"
     * >Debug fleet creation issues</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Multi-location fleets</a>
     * </p>
     * 
     * @param createFleetRequest
     * @return A Java Future containing the result of the CreateFleet operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Creates a fleet of compute resources to host your game servers. Use this operation to set up the following types
     * of fleets based on compute type:
     * </p>
     * <p>
     * <b>Managed EC2 fleet</b>
     * </p>
     * <p>
     * An EC2 fleet is a set of Amazon Elastic Compute Cloud (Amazon EC2) instances. Your game server build is deployed
     * to each fleet instance. Amazon GameLift manages the fleet's instances and controls the lifecycle of game server
     * processes, which host game sessions for players. EC2 fleets can have instances in multiple locations. Each
     * instance in the fleet is designated a <code>Compute</code>.
     * </p>
     * <p>
     * To create an EC2 fleet, provide these required parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Either <code>BuildId</code> or <code>ScriptId</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ComputeType</code> set to <code>EC2</code> (the default value)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2InboundPermissions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2InstanceType</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FleetType</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RuntimeConfiguration</code> with at least one <code>ServerProcesses</code> configuration
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, this operation creates a new fleet resource and places it in <code>NEW</code> status while Amazon
     * GameLift initiates the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-all.html#fleets-creation-workflow"
     * >fleet creation workflow</a>. To debug your fleet, fetch logs, view performance metrics or other actions on the
     * fleet, create a development fleet with port 22/3389 open. As a best practice, we recommend opening ports for
     * remote access only when you need them and closing them when you're finished.
     * </p>
     * <p>
     * When the fleet status is ACTIVE, you can adjust capacity settings and turn autoscaling on/off for each location.
     * </p>
     * <p>
     * <b>Managed container fleet</b>
     * </p>
     * <p>
     * A container fleet is a set of Amazon Elastic Compute Cloud (Amazon EC2) instances. Your container architecture is
     * deployed to each fleet instance based on the fleet configuration. Amazon GameLift manages the containers on each
     * fleet instance and controls the lifecycle of game server processes, which host game sessions for players.
     * Container fleets can have instances in multiple locations. Each container on an instance that runs game server
     * processes is registered as a <code>Compute</code>.
     * </p>
     * <p>
     * To create a container fleet, provide these required parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ComputeType</code> set to <code>CONTAINER</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ContainerGroupsConfiguration</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2InboundPermissions</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EC2InstanceType</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FleetType</code> set to <code>ON_DEMAND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RuntimeConfiguration</code> with at least one <code>ServerProcesses</code> configuration
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, this operation creates a new fleet resource and places it in <code>NEW</code> status while Amazon
     * GameLift initiates the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-all.html#fleets-creation-workflow"
     * >fleet creation workflow</a>.
     * </p>
     * <p>
     * When the fleet status is ACTIVE, you can adjust capacity settings and turn autoscaling on/off for each location.
     * </p>
     * <p>
     * <b>Anywhere fleet</b>
     * </p>
     * <p>
     * An Anywhere fleet represents compute resources that are not owned or managed by Amazon GameLift. You might create
     * an Anywhere fleet with your local machine for testing, or use one to host game servers with on-premises hardware
     * or other game hosting solutions.
     * </p>
     * <p>
     * To create an Anywhere fleet, provide these required parameters:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ComputeType</code> set to <code>ANYWHERE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Locations</code> specifying a custom location
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Name</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, this operation creates a new fleet resource and places it in <code>ACTIVE</code> status. You can
     * register computes with a fleet in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up fleets</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-build-fleet.html">Setting up a
     * container fleet</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html#fleets-creating-debug-creation"
     * >Debug fleet creation issues</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Multi-location fleets</a>
     * </p>
     * 
     * @param createFleetRequest
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
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Adds remote locations to an EC2 or container fleet and begins populating the new locations with instances. The
     * new instances conform to the fleet's instance type, auto-scaling, and other configuration settings.
     * </p>
     * <note>
     * <p>
     * You can't add remote locations to a fleet that resides in an Amazon Web Services Region that doesn't support
     * multiple locations. Fleets created prior to March 2021 can't support multiple locations.
     * </p>
     * </note>
     * <p>
     * To add fleet locations, specify the fleet to be updated and provide a list of one or more locations.
     * </p>
     * <p>
     * If successful, this operation returns the list of added locations with their status set to <code>NEW</code>.
     * Amazon GameLift initiates the process of starting an instance in each added location. You can track the status of
     * each new location by monitoring location creation events using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetEvents.html"
     * >DescribeFleetEvents</a>.
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
     * 
     * @param createFleetLocationsRequest
     * @return A Java Future containing the result of the CreateFleetLocations operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateFleetLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleetLocations" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<CreateFleetLocationsResult> createFleetLocationsAsync(CreateFleetLocationsRequest createFleetLocationsRequest);

    /**
     * <p>
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Adds remote locations to an EC2 or container fleet and begins populating the new locations with instances. The
     * new instances conform to the fleet's instance type, auto-scaling, and other configuration settings.
     * </p>
     * <note>
     * <p>
     * You can't add remote locations to a fleet that resides in an Amazon Web Services Region that doesn't support
     * multiple locations. Fleets created prior to March 2021 can't support multiple locations.
     * </p>
     * </note>
     * <p>
     * To add fleet locations, specify the fleet to be updated and provide a list of one or more locations.
     * </p>
     * <p>
     * If successful, this operation returns the list of added locations with their status set to <code>NEW</code>.
     * Amazon GameLift initiates the process of starting an instance in each added location. You can track the status of
     * each new location by monitoring location creation events using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetEvents.html"
     * >DescribeFleetEvents</a>.
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
     * 
     * @param createFleetLocationsRequest
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Creates a Amazon GameLift FleetIQ game server group for managing game hosting on a collection of Amazon Elastic
     * Compute Cloud instances for game hosting. This operation creates the game server group, creates an Auto Scaling
     * group in your Amazon Web Services account, and establishes a link between the two groups. You can view the status
     * of your game server groups in the Amazon GameLift console. Game server group metrics and events are emitted to
     * Amazon CloudWatch.
     * </p>
     * <p>
     * Before creating a new game server group, you must have the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Elastic Compute Cloud launch template that specifies how to launch Amazon Elastic Compute Cloud
     * instances with your game server build. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html"> Launching an Instance from
     * a Launch Template</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * An IAM role that extends limited access to your Amazon Web Services account to allow Amazon GameLift FleetIQ to
     * create and interact with the Auto Scaling group. For more information, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-iam-permissions-roles.html">Create IAM roles
     * for cross-service interaction</a> in the <i>Amazon GameLift FleetIQ Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create a new game server group, specify a unique group name, IAM role and Amazon Elastic Compute Cloud launch
     * template, and provide a list of instance types that can be used in the group. You must also set initial maximum
     * and minimum limits on the group's instance count. You can optionally set an Auto Scaling policy with target
     * tracking based on a Amazon GameLift FleetIQ metric.
     * </p>
     * <p>
     * Once the game server group and corresponding Auto Scaling group are created, you have full access to change the
     * Auto Scaling group's configuration as needed. Several properties that are set when creating a game server group,
     * including maximum/minimum size and auto-scaling policy settings, must be updated directly in the Auto Scaling
     * group. Keep in mind that some Auto Scaling group properties are periodically updated by Amazon GameLift FleetIQ
     * as part of its balancing activities to optimize for availability and cost.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Creates a Amazon GameLift FleetIQ game server group for managing game hosting on a collection of Amazon Elastic
     * Compute Cloud instances for game hosting. This operation creates the game server group, creates an Auto Scaling
     * group in your Amazon Web Services account, and establishes a link between the two groups. You can view the status
     * of your game server groups in the Amazon GameLift console. Game server group metrics and events are emitted to
     * Amazon CloudWatch.
     * </p>
     * <p>
     * Before creating a new game server group, you must have the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An Amazon Elastic Compute Cloud launch template that specifies how to launch Amazon Elastic Compute Cloud
     * instances with your game server build. For more information, see <a
     * href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-launch-templates.html"> Launching an Instance from
     * a Launch Template</a> in the <i>Amazon Elastic Compute Cloud User Guide</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * An IAM role that extends limited access to your Amazon Web Services account to allow Amazon GameLift FleetIQ to
     * create and interact with the Auto Scaling group. For more information, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-iam-permissions-roles.html">Create IAM roles
     * for cross-service interaction</a> in the <i>Amazon GameLift FleetIQ Developer Guide</i>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To create a new game server group, specify a unique group name, IAM role and Amazon Elastic Compute Cloud launch
     * template, and provide a list of instance types that can be used in the group. You must also set initial maximum
     * and minimum limits on the group's instance count. You can optionally set an Auto Scaling policy with target
     * tracking based on a Amazon GameLift FleetIQ metric.
     * </p>
     * <p>
     * Once the game server group and corresponding Auto Scaling group are created, you have full access to change the
     * Auto Scaling group's configuration as needed. Several properties that are set when creating a game server group,
     * including maximum/minimum size and auto-scaling policy settings, must be updated directly in the Auto Scaling
     * group. Keep in mind that some Auto Scaling group properties are periodically updated by Amazon GameLift FleetIQ
     * as part of its balancing activities to optimize for availability and cost.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * alternative, consider using the Amazon GameLift game session placement feature with <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StartGameSessionPlacement.html"
     * >StartGameSessionPlacement</a> , which uses the FleetIQ algorithm and queues to optimize the placement process.
     * </p>
     * <p>
     * When creating a game session, you specify exactly where you want to place it and provide a set of game session
     * configuration settings. The target fleet must be in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * You can use this operation in the following ways:
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
     * <li>
     * <p>
     * To create a game session on an instance in an Anywhere fleet, specify the fleet's custom location.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, Amazon GameLift initiates a workflow to start a new game session and returns a
     * <code>GameSession</code> object containing the game session configuration and status. When the game session
     * status is <code>ACTIVE</code>, it is updated with connection information and you can create player sessions for
     * the game session. By default, newly created game sessions are open to new players. You can restrict new player
     * access by using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateGameSession.html">UpdateGameSession</a>
     * to change the game session's player session creation policy.
     * </p>
     * <p>
     * Amazon GameLift retains logs for active for 14 days. To access the logs, call <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_GetGameSessionLogUrl.html"
     * >GetGameSessionLogUrl</a> to download the log files.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createGameSessionRequest
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
     * alternative, consider using the Amazon GameLift game session placement feature with <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StartGameSessionPlacement.html"
     * >StartGameSessionPlacement</a> , which uses the FleetIQ algorithm and queues to optimize the placement process.
     * </p>
     * <p>
     * When creating a game session, you specify exactly where you want to place it and provide a set of game session
     * configuration settings. The target fleet must be in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * You can use this operation in the following ways:
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
     * <li>
     * <p>
     * To create a game session on an instance in an Anywhere fleet, specify the fleet's custom location.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If successful, Amazon GameLift initiates a workflow to start a new game session and returns a
     * <code>GameSession</code> object containing the game session configuration and status. When the game session
     * status is <code>ACTIVE</code>, it is updated with connection information and you can create player sessions for
     * the game session. By default, newly created game sessions are open to new players. You can restrict new player
     * access by using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateGameSession.html">UpdateGameSession</a>
     * to change the game session's player session creation policy.
     * </p>
     * <p>
     * Amazon GameLift retains logs for active for 14 days. To access the logs, call <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_GetGameSessionLogUrl.html"
     * >GetGameSessionLogUrl</a> to download the log files.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createGameSessionRequest
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
     * A game session queue is configured with a set of destinations (Amazon GameLift fleets or aliases), which
     * determine the locations where the queue can place new game sessions. These destinations can span multiple fleet
     * types (Spot and On-Demand), instance types, and Amazon Web Services Regions. If the queue includes multi-location
     * fleets, the queue is able to place game sessions in all of a fleet's remote locations. You can opt to filter out
     * individual locations if needed.
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
     * session requests, which are submitted to queue with <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StartGameSessionPlacement.html"
     * >StartGameSessionPlacement</a> or <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StartMatchmaking.html">StartMatchmaking</a>,
     * reference a queue's name or ARN.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateGameSessionQueue.html">
     * CreateGameSessionQueue</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeGameSessionQueues.html"
     * >DescribeGameSessionQueues</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateGameSessionQueue.html"
     * >UpdateGameSessionQueue</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DeleteGameSessionQueue.html"
     * >DeleteGameSessionQueue</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createGameSessionQueueRequest
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
     * A game session queue is configured with a set of destinations (Amazon GameLift fleets or aliases), which
     * determine the locations where the queue can place new game sessions. These destinations can span multiple fleet
     * types (Spot and On-Demand), instance types, and Amazon Web Services Regions. If the queue includes multi-location
     * fleets, the queue is able to place game sessions in all of a fleet's remote locations. You can opt to filter out
     * individual locations if needed.
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
     * session requests, which are submitted to queue with <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StartGameSessionPlacement.html"
     * >StartGameSessionPlacement</a> or <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StartMatchmaking.html">StartMatchmaking</a>,
     * reference a queue's name or ARN.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateGameSessionQueue.html">
     * CreateGameSessionQueue</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeGameSessionQueues.html"
     * >DescribeGameSessionQueues</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateGameSessionQueue.html"
     * >UpdateGameSessionQueue</a> | <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DeleteGameSessionQueue.html"
     * >DeleteGameSessionQueue</a> | <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createGameSessionQueueRequest
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
     * Creates a custom location for use in an Anywhere fleet.
     * </p>
     * 
     * @param createLocationRequest
     * @return A Java Future containing the result of the CreateLocation operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateLocation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationResult> createLocationAsync(CreateLocationRequest createLocationRequest);

    /**
     * <p>
     * Creates a custom location for use in an Anywhere fleet.
     * </p>
     * 
     * @param createLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLocation operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.CreateLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateLocation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<CreateLocationResult> createLocationAsync(CreateLocationRequest createLocationRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLocationRequest, CreateLocationResult> asyncHandler);

    /**
     * <p>
     * Defines a new matchmaking configuration for use with FlexMatch. Whether your are using FlexMatch with Amazon
     * GameLift hosting or as a standalone matchmaking service, the matchmaking configuration sets out rules for
     * matching players and forming teams. If you're also using Amazon GameLift hosting, it defines how to start game
     * sessions for each match. Your matchmaking system can use multiple configurations to handle different game
     * scenarios. All matchmaking requests identify the matchmaking configuration to use and provide player attributes
     * consistent with that configuration.
     * </p>
     * <p>
     * To create a matchmaking configuration, you must provide the following: configuration name and FlexMatch mode
     * (with or without Amazon GameLift hosting); a rule set that specifies how to evaluate players and find acceptable
     * matches; whether player acceptance is required; and the maximum time allowed for a matchmaking attempt. When
     * using FlexMatch with Amazon GameLift hosting, you also need to identify the game session queue to use when
     * starting a game session for the match.
     * </p>
     * <p>
     * In addition, you must set up an Amazon Simple Notification Service topic to receive matchmaking notifications.
     * Provide the topic ARN in the matchmaking configuration.
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
     * 
     * @param createMatchmakingConfigurationRequest
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
     * Defines a new matchmaking configuration for use with FlexMatch. Whether your are using FlexMatch with Amazon
     * GameLift hosting or as a standalone matchmaking service, the matchmaking configuration sets out rules for
     * matching players and forming teams. If you're also using Amazon GameLift hosting, it defines how to start game
     * sessions for each match. Your matchmaking system can use multiple configurations to handle different game
     * scenarios. All matchmaking requests identify the matchmaking configuration to use and provide player attributes
     * consistent with that configuration.
     * </p>
     * <p>
     * To create a matchmaking configuration, you must provide the following: configuration name and FlexMatch mode
     * (with or without Amazon GameLift hosting); a rule set that specifies how to evaluate players and find acceptable
     * matches; whether player acceptance is required; and the maximum time allowed for a matchmaking attempt. When
     * using FlexMatch with Amazon GameLift hosting, you also need to identify the game session queue to use when
     * starting a game session for the match.
     * </p>
     * <p>
     * In addition, you must set up an Amazon Simple Notification Service topic to receive matchmaking notifications.
     * Provide the topic ARN in the matchmaking configuration.
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
     * 
     * @param createMatchmakingConfigurationRequest
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
     * or character type.
     * </p>
     * <p>
     * To create a matchmaking rule set, provide unique rule set name and the rule set body in JSON format. Rule sets
     * must be defined in the same Region as the matchmaking configuration they are used with.
     * </p>
     * <p>
     * Since matchmaking rule sets cannot be edited, it is a good idea to check the rule set syntax using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_ValidateMatchmakingRuleSet.html"
     * >ValidateMatchmakingRuleSet</a> before creating a new rule set.
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
     * 
     * @param createMatchmakingRuleSetRequest
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
     * or character type.
     * </p>
     * <p>
     * To create a matchmaking rule set, provide unique rule set name and the rule set body in JSON format. Rule sets
     * must be defined in the same Region as the matchmaking configuration they are used with.
     * </p>
     * <p>
     * Since matchmaking rule sets cannot be edited, it is a good idea to check the rule set syntax using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_ValidateMatchmakingRuleSet.html"
     * >ValidateMatchmakingRuleSet</a> before creating a new rule set.
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
     * 
     * @param createMatchmakingRuleSetRequest
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
     * <code>ACCEPT_ALL</code>. You can add a group of players to a game session with <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreatePlayerSessions.html"
     * >CreatePlayerSessions</a> .
     * </p>
     * <p>
     * To create a player session, specify a game session ID, player ID, and optionally a set of player data.
     * </p>
     * <p>
     * If successful, a slot is reserved in the game session for the player and a new <code>PlayerSessions</code> object
     * is returned with a player session ID. The player references the player session ID when sending a connection
     * request to the game session, and the game server can use it to validate the player reservation with the Amazon
     * GameLift service. Player sessions cannot be updated.
     * </p>
     * <p>
     * The maximum number of players per game session is 200. It is not adjustable.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createPlayerSessionRequest
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
     * <code>ACCEPT_ALL</code>. You can add a group of players to a game session with <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreatePlayerSessions.html"
     * >CreatePlayerSessions</a> .
     * </p>
     * <p>
     * To create a player session, specify a game session ID, player ID, and optionally a set of player data.
     * </p>
     * <p>
     * If successful, a slot is reserved in the game session for the player and a new <code>PlayerSessions</code> object
     * is returned with a player session ID. The player references the player session ID when sending a connection
     * request to the game session, and the game server can use it to validate the player reservation with the Amazon
     * GameLift service. Player sessions cannot be updated.
     * </p>
     * <p>
     * The maximum number of players per game session is 200. It is not adjustable.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createPlayerSessionRequest
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
     * <code>ACCEPT_ALL</code>. To add a single player to a game session, use <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreatePlayerSession.html"
     * >CreatePlayerSession</a>
     * </p>
     * <p>
     * To create player sessions, specify a game session ID and a list of player IDs. Optionally, provide a set of
     * player data for each player ID.
     * </p>
     * <p>
     * If successful, a slot is reserved in the game session for each player, and new <code>PlayerSession</code> objects
     * are returned with player session IDs. Each player references their player session ID when sending a connection
     * request to the game session, and the game server can use it to validate the player reservation with the Amazon
     * GameLift service. Player sessions cannot be updated.
     * </p>
     * <p>
     * The maximum number of players per game session is 200. It is not adjustable.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createPlayerSessionsRequest
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
     * <code>ACCEPT_ALL</code>. To add a single player to a game session, use <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreatePlayerSession.html"
     * >CreatePlayerSession</a>
     * </p>
     * <p>
     * To create player sessions, specify a game session ID and a list of player IDs. Optionally, provide a set of
     * player data for each player ID.
     * </p>
     * <p>
     * If successful, a slot is reserved in the game session for each player, and new <code>PlayerSession</code> objects
     * are returned with player session IDs. Each player references their player session ID when sending a connection
     * request to the game session, and the game server can use it to validate the player reservation with the Amazon
     * GameLift service. Player sessions cannot be updated.
     * </p>
     * <p>
     * The maximum number of players per game session is 200. It is not adjustable.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createPlayerSessionsRequest
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
     * An Amazon Simple Storage Service (Amazon S3) bucket under your Amazon Web Services account. Use the
     * <i>StorageLocation</i> parameter for this option. You'll need to have an Identity Access Management (IAM) role
     * that allows the Amazon GameLift service to access your S3 bucket.
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
     * <a href=
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
     * An Amazon Simple Storage Service (Amazon S3) bucket under your Amazon Web Services account. Use the
     * <i>StorageLocation</i> parameter for this option. You'll need to have an Identity Access Management (IAM) role
     * that allows the Amazon GameLift service to access your S3 bucket.
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
     * <a href=
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
     * virtual private cloud (VPC) in your Amazon Web Services account. VPC peering enables the game servers on your
     * fleet to communicate directly with other Amazon Web Services resources. After you've received authorization, use
     * <a href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateVpcPeeringConnection.html">
     * CreateVpcPeeringConnection</a> to establish the peering connection. For more information, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * <p>
     * You can peer with VPCs that are owned by any Amazon Web Services account you have access to, including the
     * account that you use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different
     * Regions.
     * </p>
     * <p>
     * To request authorization to create a connection, call this operation from the Amazon Web Services account with
     * the VPC that you want to peer to your Amazon GameLift fleet. For example, to enable your game servers to retrieve
     * data from a DynamoDB table, use the account that manages that DynamoDB resource. Identify the following values:
     * (1) The ID of the VPC that you want to peer with, and (2) the ID of the Amazon Web Services account that you use
     * to manage Amazon GameLift. If successful, VPC peering is authorized for the specified VPC.
     * </p>
     * <p>
     * To request authorization to delete a connection, call this operation from the Amazon Web Services account with
     * the VPC that is peered with your Amazon GameLift fleet. Identify the following values: (1) VPC ID that you want
     * to delete the peering connection for, and (2) ID of the Amazon Web Services account that you use to manage Amazon
     * GameLift.
     * </p>
     * <p>
     * The authorization remains valid for 24 hours unless it is canceled. You must create or delete the peering
     * connection while the authorization is valid.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createVpcPeeringAuthorizationRequest
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
     * virtual private cloud (VPC) in your Amazon Web Services account. VPC peering enables the game servers on your
     * fleet to communicate directly with other Amazon Web Services resources. After you've received authorization, use
     * <a href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateVpcPeeringConnection.html">
     * CreateVpcPeeringConnection</a> to establish the peering connection. For more information, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * <p>
     * You can peer with VPCs that are owned by any Amazon Web Services account you have access to, including the
     * account that you use to manage your Amazon GameLift fleets. You cannot peer with VPCs that are in different
     * Regions.
     * </p>
     * <p>
     * To request authorization to create a connection, call this operation from the Amazon Web Services account with
     * the VPC that you want to peer to your Amazon GameLift fleet. For example, to enable your game servers to retrieve
     * data from a DynamoDB table, use the account that manages that DynamoDB resource. Identify the following values:
     * (1) The ID of the VPC that you want to peer with, and (2) the ID of the Amazon Web Services account that you use
     * to manage Amazon GameLift. If successful, VPC peering is authorized for the specified VPC.
     * </p>
     * <p>
     * To request authorization to delete a connection, call this operation from the Amazon Web Services account with
     * the VPC that is peered with your Amazon GameLift fleet. Identify the following values: (1) VPC ID that you want
     * to delete the peering connection for, and (2) ID of the Amazon Web Services account that you use to manage Amazon
     * GameLift.
     * </p>
     * <p>
     * The authorization remains valid for 24 hours unless it is canceled. You must create or delete the peering
     * connection while the authorization is valid.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createVpcPeeringAuthorizationRequest
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
     * Establishes a VPC peering connection between a virtual private cloud (VPC) in an Amazon Web Services account with
     * the VPC for your Amazon GameLift fleet. VPC peering enables the game servers on your fleet to communicate
     * directly with other Amazon Web Services resources. You can peer with VPCs in any Amazon Web Services account that
     * you have access to, including the account that you use to manage your Amazon GameLift fleets. You cannot peer
     * with VPCs that are in different Regions. For more information, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * <p>
     * Before calling this operation to establish the peering connection, you first need to use <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateVpcPeeringAuthorization.html"
     * >CreateVpcPeeringAuthorization</a> and identify the VPC you want to peer with. Once the authorization for the
     * specified VPC is issued, you have 24 hours to establish the connection. These two operations handle all tasks
     * necessary to peer the two VPCs, including acceptance, updating routing tables, etc.
     * </p>
     * <p>
     * To establish the connection, call this operation from the Amazon Web Services account that is used to manage the
     * Amazon GameLift fleets. Identify the following values: (1) The ID of the fleet you want to be enable a VPC
     * peering connection for; (2) The Amazon Web Services account with the VPC that you want to peer with; and (3) The
     * ID of the VPC you want to peer with. This operation is asynchronous. If successful, a connection request is
     * created. You can use continuous polling to track the request's status using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeVpcPeeringConnections.html"
     * >DescribeVpcPeeringConnections</a> , or by monitoring fleet events for success or failure using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetEvents.html"
     * >DescribeFleetEvents</a> .
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createVpcPeeringConnectionRequest
     * @return A Java Future containing the result of the CreateVpcPeeringConnection operation returned by the service.
     * @sample AmazonGameLiftAsync.CreateVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringConnection"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(
            CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest);

    /**
     * <p>
     * Establishes a VPC peering connection between a virtual private cloud (VPC) in an Amazon Web Services account with
     * the VPC for your Amazon GameLift fleet. VPC peering enables the game servers on your fleet to communicate
     * directly with other Amazon Web Services resources. You can peer with VPCs in any Amazon Web Services account that
     * you have access to, including the account that you use to manage your Amazon GameLift fleets. You cannot peer
     * with VPCs that are in different Regions. For more information, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * <p>
     * Before calling this operation to establish the peering connection, you first need to use <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateVpcPeeringAuthorization.html"
     * >CreateVpcPeeringAuthorization</a> and identify the VPC you want to peer with. Once the authorization for the
     * specified VPC is issued, you have 24 hours to establish the connection. These two operations handle all tasks
     * necessary to peer the two VPCs, including acceptance, updating routing tables, etc.
     * </p>
     * <p>
     * To establish the connection, call this operation from the Amazon Web Services account that is used to manage the
     * Amazon GameLift fleets. Identify the following values: (1) The ID of the fleet you want to be enable a VPC
     * peering connection for; (2) The Amazon Web Services account with the VPC that you want to peer with; and (3) The
     * ID of the VPC you want to peer with. This operation is asynchronous. If successful, a connection request is
     * created. You can use continuous polling to track the request's status using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeVpcPeeringConnections.html"
     * >DescribeVpcPeeringConnections</a> , or by monitoring fleet events for success or failure using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetEvents.html"
     * >DescribeFleetEvents</a> .
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param createVpcPeeringConnectionRequest
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteAliasRequest
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteAliasRequest
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteBuildRequest
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteBuildRequest
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
     * <b>This operation is used with the Amazon GameLift containers feature, which is currently in public preview. </b>
     * </p>
     * <p>
     * Deletes a container group definition resource. You can delete a container group definition if there are no fleets
     * using the definition.
     * </p>
     * <p>
     * To delete a container group definition, identify the resource to delete.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-create-groups.html">Manage a
     * container group definition</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteContainerGroupDefinitionRequest
     * @return A Java Future containing the result of the DeleteContainerGroupDefinition operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DeleteContainerGroupDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteContainerGroupDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContainerGroupDefinitionResult> deleteContainerGroupDefinitionAsync(
            DeleteContainerGroupDefinitionRequest deleteContainerGroupDefinitionRequest);

    /**
     * <p>
     * <b>This operation is used with the Amazon GameLift containers feature, which is currently in public preview. </b>
     * </p>
     * <p>
     * Deletes a container group definition resource. You can delete a container group definition if there are no fleets
     * using the definition.
     * </p>
     * <p>
     * To delete a container group definition, identify the resource to delete.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-create-groups.html">Manage a
     * container group definition</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param deleteContainerGroupDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteContainerGroupDefinition operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DeleteContainerGroupDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteContainerGroupDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteContainerGroupDefinitionResult> deleteContainerGroupDefinitionAsync(
            DeleteContainerGroupDefinitionRequest deleteContainerGroupDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteContainerGroupDefinitionRequest, DeleteContainerGroupDefinitionResult> asyncHandler);

    /**
     * <p>
     * Deletes all resources and information related to a fleet and shuts down any currently running fleet instances,
     * including those in remote locations.
     * </p>
     * <note>
     * <p>
     * If the fleet being deleted has a VPC peering connection, you first need to get a valid authorization (good for 24
     * hours) by calling <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateVpcPeeringAuthorization.html"
     * >CreateVpcPeeringAuthorization</a>. You don't need to explicitly delete the VPC peering connection.
     * </p>
     * </note>
     * <p>
     * To delete a fleet, specify the fleet ID to be terminated. During the deletion process, the fleet status is
     * changed to <code>DELETING</code>. When completed, the status switches to <code>TERMINATED</code> and the fleet
     * event <code>FLEET_DELETED</code> is emitted.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * Fleets</a>
     * </p>
     * 
     * @param deleteFleetRequest
     * @return A Java Future containing the result of the DeleteFleet operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes all resources and information related to a fleet and shuts down any currently running fleet instances,
     * including those in remote locations.
     * </p>
     * <note>
     * <p>
     * If the fleet being deleted has a VPC peering connection, you first need to get a valid authorization (good for 24
     * hours) by calling <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateVpcPeeringAuthorization.html"
     * >CreateVpcPeeringAuthorization</a>. You don't need to explicitly delete the VPC peering connection.
     * </p>
     * </note>
     * <p>
     * To delete a fleet, specify the fleet ID to be terminated. During the deletion process, the fleet status is
     * changed to <code>DELETING</code>. When completed, the status switches to <code>TERMINATED</code> and the fleet
     * event <code>FLEET_DELETED</code> is emitted.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * Fleets</a>
     * </p>
     * 
     * @param deleteFleetRequest
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param deleteFleetLocationsRequest
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param deleteFleetLocationsRequest
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
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
     * automatic scaling activity. Once all game servers in the game server group are deregistered, Amazon GameLift
     * FleetIQ can begin deleting resources. If any of the delete operations fail, the game server group is placed in
     * <code>ERROR</code> status.
     * </p>
     * <p>
     * Amazon GameLift FleetIQ emits delete events to Amazon CloudWatch.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
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
     * automatic scaling activity. Once all game servers in the game server group are deregistered, Amazon GameLift
     * FleetIQ can begin deleting resources. If any of the delete operations fail, the game server group is placed in
     * <code>ERROR</code> status.
     * </p>
     * <p>
     * Amazon GameLift FleetIQ emits delete events to Amazon CloudWatch.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * Deletes a game session queue. Once a queue is successfully deleted, unfulfilled <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StartGameSessionPlacement.html"
     * >StartGameSessionPlacement</a> requests that reference the queue will fail. To delete a queue, specify the queue
     * name.
     * </p>
     * 
     * @param deleteGameSessionQueueRequest
     * @return A Java Future containing the result of the DeleteGameSessionQueue operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DeleteGameSessionQueueResult> deleteGameSessionQueueAsync(DeleteGameSessionQueueRequest deleteGameSessionQueueRequest);

    /**
     * <p>
     * Deletes a game session queue. Once a queue is successfully deleted, unfulfilled <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StartGameSessionPlacement.html"
     * >StartGameSessionPlacement</a> requests that reference the queue will fail. To delete a queue, specify the queue
     * name.
     * </p>
     * 
     * @param deleteGameSessionQueueRequest
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
     * Deletes a custom location.
     * </p>
     * <p>
     * Before deleting a custom location, review any fleets currently using the custom location and deregister the
     * location if it is in use. For more information, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DeregisterCompute.html">DeregisterCompute</a>.
     * </p>
     * 
     * @param deleteLocationRequest
     * @return A Java Future containing the result of the DeleteLocation operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteLocation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLocationResult> deleteLocationAsync(DeleteLocationRequest deleteLocationRequest);

    /**
     * <p>
     * Deletes a custom location.
     * </p>
     * <p>
     * Before deleting a custom location, review any fleets currently using the custom location and deregister the
     * location if it is in use. For more information, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DeregisterCompute.html">DeregisterCompute</a>.
     * </p>
     * 
     * @param deleteLocationRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteLocation operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeleteLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteLocation" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeleteLocationResult> deleteLocationAsync(DeleteLocationRequest deleteLocationRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLocationRequest, DeleteLocationResult> asyncHandler);

    /**
     * <p>
     * Permanently removes a FlexMatch matchmaking configuration. To delete, specify the configuration name. A
     * matchmaking configuration cannot be deleted if it is being used in any active matchmaking tickets.
     * </p>
     * 
     * @param deleteMatchmakingConfigurationRequest
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
     * 
     * @param deleteMatchmakingConfigurationRequest
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
     * 
     * @param deleteMatchmakingRuleSetRequest
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
     * 
     * @param deleteMatchmakingRuleSetRequest
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
     * Deletes a fleet scaling policy. Once deleted, the policy is no longer in force and Amazon GameLift removes all
     * record of it. To delete a scaling policy, specify both the scaling policy name and the fleet ID it is associated
     * with.
     * </p>
     * <p>
     * To temporarily suspend scaling policies, use <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html">StopFleetActions</a>.
     * This operation suspends all policies for the fleet.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     * @return A Java Future containing the result of the DeleteScalingPolicy operation returned by the service.
     * @sample AmazonGameLiftAsync.DeleteScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScalingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest deleteScalingPolicyRequest);

    /**
     * <p>
     * Deletes a fleet scaling policy. Once deleted, the policy is no longer in force and Amazon GameLift removes all
     * record of it. To delete a scaling policy, specify both the scaling policy name and the fleet ID it is associated
     * with.
     * </p>
     * <p>
     * To temporarily suspend scaling policies, use <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html">StopFleetActions</a>.
     * This operation suspends all policies for the fleet.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
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
     * <a href=
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
     * <a href=
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
     * connection, use <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DeleteVpcPeeringConnection.html"
     * >DeleteVpcPeeringConnection</a>.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteVpcPeeringAuthorizationRequest
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
     * connection, use <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DeleteVpcPeeringConnection.html"
     * >DeleteVpcPeeringConnection</a>.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteVpcPeeringAuthorizationRequest
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
     * peering connection that you want to delete..
     * </p>
     * <p>
     * Once a valid authorization exists, call this operation from the Amazon Web Services account that is used to
     * manage the Amazon GameLift fleets. Identify the connection to delete by the connection ID and fleet ID. If
     * successful, the connection is removed.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteVpcPeeringConnectionRequest
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
     * peering connection that you want to delete..
     * </p>
     * <p>
     * Once a valid authorization exists, call this operation from the Amazon Web Services account that is used to
     * manage the Amazon GameLift fleets. Identify the connection to delete by the connection ID and fleet ID. If
     * successful, the connection is removed.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param deleteVpcPeeringConnectionRequest
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
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Removes a compute resource from an Amazon GameLift Anywhere fleet or container fleet. Deregistered computes can
     * no longer host game sessions through Amazon GameLift.
     * </p>
     * <p>
     * For an Anywhere fleet or a container fleet that's running the Amazon GameLift Agent, the Agent handles all
     * compute registry tasks for you. For an Anywhere fleet that doesn't use the Agent, call this operation to
     * deregister fleet computes.
     * </p>
     * <p>
     * To deregister a compute, call this operation from the compute that's being deregistered and specify the compute
     * name and the fleet ID.
     * </p>
     * 
     * @param deregisterComputeRequest
     * @return A Java Future containing the result of the DeregisterCompute operation returned by the service.
     * @sample AmazonGameLiftAsync.DeregisterCompute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeregisterCompute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeregisterComputeResult> deregisterComputeAsync(DeregisterComputeRequest deregisterComputeRequest);

    /**
     * <p>
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Removes a compute resource from an Amazon GameLift Anywhere fleet or container fleet. Deregistered computes can
     * no longer host game sessions through Amazon GameLift.
     * </p>
     * <p>
     * For an Anywhere fleet or a container fleet that's running the Amazon GameLift Agent, the Agent handles all
     * compute registry tasks for you. For an Anywhere fleet that doesn't use the Agent, call this operation to
     * deregister fleet computes.
     * </p>
     * <p>
     * To deregister a compute, call this operation from the compute that's being deregistered and specify the compute
     * name and the fleet ID.
     * </p>
     * 
     * @param deregisterComputeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeregisterCompute operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DeregisterCompute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeregisterCompute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DeregisterComputeResult> deregisterComputeAsync(DeregisterComputeRequest deregisterComputeRequest,
            com.amazonaws.handlers.AsyncHandler<DeregisterComputeRequest, DeregisterComputeResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeAliasRequest
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeAliasRequest
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeBuildRequest
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeBuildRequest
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
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Retrieves properties for a compute resource in an Amazon GameLift fleet. To get a list of all computes in a
     * fleet, call <a>ListCompute</a>.
     * </p>
     * <p>
     * To request information on a specific compute, provide the fleet ID and compute name.
     * </p>
     * <p>
     * If successful, this operation returns details for the requested compute resource. Depending on the fleet's
     * compute type, the result includes the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>EC2</code> fleets, this operation returns information about the EC2 instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>ANYWHERE</code> fleets, this operation returns information about the registered compute.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>CONTAINER</code> fleets, this operation returns information about the container that's registered as a
     * compute, and the instance it's running on. The compute name is the container name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComputeRequest
     * @return A Java Future containing the result of the DescribeCompute operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeCompute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeCompute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeComputeResult> describeComputeAsync(DescribeComputeRequest describeComputeRequest);

    /**
     * <p>
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Retrieves properties for a compute resource in an Amazon GameLift fleet. To get a list of all computes in a
     * fleet, call <a>ListCompute</a>.
     * </p>
     * <p>
     * To request information on a specific compute, provide the fleet ID and compute name.
     * </p>
     * <p>
     * If successful, this operation returns details for the requested compute resource. Depending on the fleet's
     * compute type, the result includes the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>EC2</code> fleets, this operation returns information about the EC2 instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>ANYWHERE</code> fleets, this operation returns information about the registered compute.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>CONTAINER</code> fleets, this operation returns information about the container that's registered as a
     * compute, and the instance it's running on. The compute name is the container name.
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeComputeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCompute operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.DescribeCompute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeCompute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeComputeResult> describeComputeAsync(DescribeComputeRequest describeComputeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeComputeRequest, DescribeComputeResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the Amazon GameLift containers feature, which is currently in public preview. </b>
     * </p>
     * <p>
     * Retrieves the properties of a container group definition, including all container definitions in the group.
     * </p>
     * <p>
     * To retrieve a container group definition, provide a resource identifier. If successful, this operation returns
     * the complete properties of the container group definition.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-create-groups.html">Manage a
     * container group definition</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeContainerGroupDefinitionRequest
     * @return A Java Future containing the result of the DescribeContainerGroupDefinition operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.DescribeContainerGroupDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeContainerGroupDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeContainerGroupDefinitionResult> describeContainerGroupDefinitionAsync(
            DescribeContainerGroupDefinitionRequest describeContainerGroupDefinitionRequest);

    /**
     * <p>
     * <b>This operation is used with the Amazon GameLift containers feature, which is currently in public preview. </b>
     * </p>
     * <p>
     * Retrieves the properties of a container group definition, including all container definitions in the group.
     * </p>
     * <p>
     * To retrieve a container group definition, provide a resource identifier. If successful, this operation returns
     * the complete properties of the container group definition.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-create-groups.html">Manage a
     * container group definition</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param describeContainerGroupDefinitionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeContainerGroupDefinition operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.DescribeContainerGroupDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeContainerGroupDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeContainerGroupDefinitionResult> describeContainerGroupDefinitionAsync(
            DescribeContainerGroupDefinitionRequest describeContainerGroupDefinitionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeContainerGroupDefinitionRequest, DescribeContainerGroupDefinitionResult> asyncHandler);

    /**
     * <p>
     * Retrieves the instance limits and current utilization for an Amazon Web Services Region or location. Instance
     * limits control the number of instances, per instance type, per location, that your Amazon Web Services account
     * can use. Learn more at <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a>. The
     * information returned includes the maximum number of instances allowed and your account's current usage across all
     * fleets. This information can affect your ability to scale your Amazon GameLift fleets. You can request a limit
     * increase for your account by using the <b>Service limits</b> page in the Amazon GameLift console.
     * </p>
     * <p>
     * Instance limits differ based on whether the instances are deployed in a fleet's home Region or in a remote
     * location. For remote locations, limits also differ based on the combination of home Region and remote location.
     * All requests must specify an Amazon Web Services Region (either explicitly or as your default settings). To get
     * the limit for a remote location, you must also specify the location. For example, the following requests all
     * return different results:
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
     * To get limit and usage data for all instance types that are deployed in an Amazon Web Services Region by fleets
     * that reside in the same Region: Specify the Region only. Optionally, specify a single instance type to retrieve
     * information for.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get limit and usage data for all instance types that are deployed to a remote location by fleets that reside
     * in different Amazon Web Services Region: Provide both the Amazon Web Services Region and the remote location.
     * Optionally, specify a single instance type to retrieve information for.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param describeEC2InstanceLimitsRequest
     * @return A Java Future containing the result of the DescribeEC2InstanceLimits operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeEC2InstanceLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeEC2InstanceLimits"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeEC2InstanceLimitsResult> describeEC2InstanceLimitsAsync(
            DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest);

    /**
     * <p>
     * Retrieves the instance limits and current utilization for an Amazon Web Services Region or location. Instance
     * limits control the number of instances, per instance type, per location, that your Amazon Web Services account
     * can use. Learn more at <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a>. The
     * information returned includes the maximum number of instances allowed and your account's current usage across all
     * fleets. This information can affect your ability to scale your Amazon GameLift fleets. You can request a limit
     * increase for your account by using the <b>Service limits</b> page in the Amazon GameLift console.
     * </p>
     * <p>
     * Instance limits differ based on whether the instances are deployed in a fleet's home Region or in a remote
     * location. For remote locations, limits also differ based on the combination of home Region and remote location.
     * All requests must specify an Amazon Web Services Region (either explicitly or as your default settings). To get
     * the limit for a remote location, you must also specify the location. For example, the following requests all
     * return different results:
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
     * To get limit and usage data for all instance types that are deployed in an Amazon Web Services Region by fleets
     * that reside in the same Region: Specify the Region only. Optionally, specify a single instance type to retrieve
     * information for.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get limit and usage data for all instance types that are deployed to a remote location by fleets that reside
     * in different Amazon Web Services Region: Provide both the Amazon Web Services Region and the remote location.
     * Optionally, specify a single instance type to retrieve information for.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param describeEC2InstanceLimitsRequest
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
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Retrieves core fleet-wide properties for fleets in an Amazon Web Services Region. Properties include the
     * computing hardware and deployment configuration for instances in the fleet.
     * </p>
     * <p>
     * You can use this operation in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get attributes for specific fleets, provide a list of fleet IDs or fleet ARNs.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param describeFleetAttributesRequest
     * @return A Java Future containing the result of the DescribeFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetAttributesResult> describeFleetAttributesAsync(DescribeFleetAttributesRequest describeFleetAttributesRequest);

    /**
     * <p>
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Retrieves core fleet-wide properties for fleets in an Amazon Web Services Region. Properties include the
     * computing hardware and deployment configuration for instances in the fleet.
     * </p>
     * <p>
     * You can use this operation in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get attributes for specific fleets, provide a list of fleet IDs or fleet ARNs.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param describeFleetAttributesRequest
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
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Retrieves the resource capacity settings for one or more fleets. For a container fleet, this operation also
     * returns counts for replica container groups.
     * </p>
     * <p>
     * With multi-location fleets, this operation retrieves data for the fleet's home Region only. To retrieve capacity
     * for remote locations, see <a>DescribeFleetLocationCapacity</a>.
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
     * If successful, a <code>FleetCapacity</code> object is returned for each requested fleet ID. Each
     * <code>FleetCapacity</code> object includes a <code>Location</code> property, which is set to the fleet's home
     * Region. Capacity values are returned only for fleets that currently exist.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift metrics for fleets</a>
     * </p>
     * 
     * @param describeFleetCapacityRequest
     * @return A Java Future containing the result of the DescribeFleetCapacity operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetCapacityResult> describeFleetCapacityAsync(DescribeFleetCapacityRequest describeFleetCapacityRequest);

    /**
     * <p>
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Retrieves the resource capacity settings for one or more fleets. For a container fleet, this operation also
     * returns counts for replica container groups.
     * </p>
     * <p>
     * With multi-location fleets, this operation retrieves data for the fleet's home Region only. To retrieve capacity
     * for remote locations, see <a>DescribeFleetLocationCapacity</a>.
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
     * If successful, a <code>FleetCapacity</code> object is returned for each requested fleet ID. Each
     * <code>FleetCapacity</code> object includes a <code>Location</code> property, which is set to the fleet's home
     * Region. Capacity values are returned only for fleets that currently exist.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift metrics for fleets</a>
     * </p>
     * 
     * @param describeFleetCapacityRequest
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param describeFleetEventsRequest
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param describeFleetEventsRequest
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param describeFleetLocationAttributesRequest
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param describeFleetLocationAttributesRequest
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
     * (number of EC2 instances) and some scaling settings for the requested fleet location. For a container fleet, this
     * operation also returns counts for replica container groups.
     * </p>
     * <p>
     * Use this operation to retrieve capacity information for a fleet's remote location or home Region (you can also
     * retrieve home Region capacity by calling <code>DescribeFleetCapacity</code>).
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift metrics for fleets</a>
     * </p>
     * 
     * @param describeFleetLocationCapacityRequest
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
     * (number of EC2 instances) and some scaling settings for the requested fleet location. For a container fleet, this
     * operation also returns counts for replica container groups.
     * </p>
     * <p>
     * Use this operation to retrieve capacity information for a fleet's remote location or home Region (you can also
     * retrieve home Region capacity by calling <code>DescribeFleetCapacity</code>).
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift metrics for fleets</a>
     * </p>
     * 
     * @param describeFleetLocationCapacityRequest
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift metrics for fleets</a>
     * </p>
     * 
     * @param describeFleetLocationUtilizationRequest
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift metrics for fleets</a>
     * </p>
     * 
     * @param describeFleetLocationUtilizationRequest
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
     * Retrieves a fleet's inbound connection permissions. Connection permissions specify IP addresses and port settings
     * that incoming traffic can use to access server processes in the fleet. Game server processes that are running in
     * the fleet must use a port that falls within this range. To connect to game server processes on a container fleet,
     * the port settings should include one or more of the fleet's connection ports.
     * </p>
     * <p>
     * Use this operation in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve the port settings for a fleet, identify the fleet's unique identifier.
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
     * If successful, a set of <code>IpPermission</code> objects is returned for the requested fleet ID. When specifying
     * a location, this operation returns a pending status. If the requested fleet has been deleted, the result set is
     * empty.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param describeFleetPortSettingsRequest
     * @return A Java Future containing the result of the DescribeFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<DescribeFleetPortSettingsResult> describeFleetPortSettingsAsync(
            DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest);

    /**
     * <p>
     * Retrieves a fleet's inbound connection permissions. Connection permissions specify IP addresses and port settings
     * that incoming traffic can use to access server processes in the fleet. Game server processes that are running in
     * the fleet must use a port that falls within this range. To connect to game server processes on a container fleet,
     * the port settings should include one or more of the fleet's connection ports.
     * </p>
     * <p>
     * Use this operation in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To retrieve the port settings for a fleet, identify the fleet's unique identifier.
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
     * If successful, a set of <code>IpPermission</code> objects is returned for the requested fleet ID. When specifying
     * a location, this operation returns a pending status. If the requested fleet has been deleted, the result set is
     * empty.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param describeFleetPortSettingsRequest
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
     * the fleet's home Region only. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationUtilization.html"
     * >DescribeFleetLocationUtilization</a> to get utilization statistics for a fleet's remote locations.
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
     * If successful, a <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_FleetUtilization.html">FleetUtilization</a>
     * object is returned for each requested fleet ID, unless the fleet identifier is not found. Each fleet utilization
     * object includes a <code>Location</code> property, which is set to the fleet's home Region.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * Fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift Metrics for Fleets</a>
     * </p>
     * 
     * @param describeFleetUtilizationRequest
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
     * the fleet's home Region only. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationUtilization.html"
     * >DescribeFleetLocationUtilization</a> to get utilization statistics for a fleet's remote locations.
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
     * If successful, a <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_FleetUtilization.html">FleetUtilization</a>
     * object is returned for each requested fleet ID, unless the fleet identifier is not found. Each fleet utilization
     * object includes a <code>Location</code> property, which is set to the fleet's home Region.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * Fleets</a>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/monitoring-cloudwatch.html#gamelift-metrics-fleet"
     * >GameLift Metrics for Fleets</a>
     * </p>
     * 
     * @param describeFleetUtilizationRequest
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves information on a game server group. This operation returns only properties related to Amazon GameLift
     * FleetIQ. To view or update properties for the corresponding Auto Scaling group, such as launch template, auto
     * scaling policies, and maximum/minimum group size, access the Auto Scaling group directly.
     * </p>
     * <p>
     * To get attributes for a game server group, provide a group name or ARN value. If successful, a
     * <code>GameServerGroup</code> object is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves information on a game server group. This operation returns only properties related to Amazon GameLift
     * FleetIQ. To view or update properties for the corresponding Auto Scaling group, such as launch template, auto
     * scaling policies, and maximum/minimum group size, access the Auto Scaling group directly.
     * </p>
     * <p>
     * To get attributes for a game server group, provide a group name or ARN value. If successful, a
     * <code>GameServerGroup</code> object is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves status information about the Amazon EC2 instances associated with a Amazon GameLift FleetIQ game server
     * group. Use this operation to detect when instances are active or not available to host new game servers.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Retrieves status information about the Amazon EC2 instances associated with a Amazon GameLift FleetIQ game server
     * group. Use this operation to detect when instances are active or not available to host new game servers.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * status.
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
     * session ID in all fleets that reside in the Amazon Web Services Region defined in the request.
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeGameSessionDetailsRequest
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
     * status.
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
     * session ID in all fleets that reside in the Amazon Web Services Region defined in the request.
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeGameSessionDetailsRequest
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
     * This operation is not designed to be continually called to track game session status. This practice can cause you
     * to exceed your API limit, which results in errors. Instead, you must configure configure an Amazon Simple
     * Notification Service (SNS) topic to receive notifications from FlexMatch or queues. Continuously polling with
     * <code>DescribeGameSessionPlacement</code> should only be used for games in development with low game session
     * usage.
     * </p>
     * 
     * @param describeGameSessionPlacementRequest
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
     * This operation is not designed to be continually called to track game session status. This practice can cause you
     * to exceed your API limit, which results in errors. Instead, you must configure configure an Amazon Simple
     * Notification Service (SNS) topic to receive notifications from FlexMatch or queues. Continuously polling with
     * <code>DescribeGameSessionPlacement</code> should only be used for games in development with low game session
     * usage.
     * </p>
     * 
     * @param describeGameSessionPlacementRequest
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
     * parameters to retrieve results as a set of sequential pages. When specifying a list of queues, objects are
     * returned only for queues that currently exist in the Region.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-console.html"> View Your Queues</a>
     * </p>
     * 
     * @param describeGameSessionQueuesRequest
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
     * parameters to retrieve results as a set of sequential pages. When specifying a list of queues, objects are
     * returned only for queues that currently exist in the Region.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queues-console.html"> View Your Queues</a>
     * </p>
     * 
     * @param describeGameSessionQueuesRequest
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
     * by current game session status.
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
     * all fleets that reside in the Amazon Web Services Region defined in the request.
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
     * This operation is not designed to be continually called to track game session status. This practice can cause you
     * to exceed your API limit, which results in errors. Instead, you must configure an Amazon Simple Notification
     * Service (SNS) topic to receive notifications from FlexMatch or queues. Continuously polling with
     * <code>DescribeGameSessions</code> should only be used for games in development with low game session usage.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeGameSessionsRequest
     * @return A Java Future containing the result of the DescribeGameSessions operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<DescribeGameSessionsResult> describeGameSessionsAsync(DescribeGameSessionsRequest describeGameSessionsRequest);

    /**
     * <p>
     * Retrieves a set of one or more game sessions in a specific fleet location. You can optionally filter the results
     * by current game session status.
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
     * all fleets that reside in the Amazon Web Services Region defined in the request.
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
     * This operation is not designed to be continually called to track game session status. This practice can cause you
     * to exceed your API limit, which results in errors. Instead, you must configure an Amazon Simple Notification
     * Service (SNS) topic to receive notifications from FlexMatch or queues. Continuously polling with
     * <code>DescribeGameSessions</code> should only be used for games in development with low game session usage.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeGameSessionsRequest
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
     * Retrieves information about the EC2 instances in an Amazon GameLift managed fleet, including instance ID,
     * connection data, and status. You can use this operation with a multi-location fleet to get location-specific
     * instance information. As an alternative, use the operations <a>ListCompute</a> and <a>DescribeCompute</a> to
     * retrieve information for compute resources, including EC2 and Anywhere fleets.
     * </p>
     * <p>
     * You can call this operation in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get information on all instances in a fleet's home Region, specify the fleet ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get information on all instances in a fleet's remote location, specify the fleet ID and location name.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get information on a specific instance in a fleet, specify the fleet ID and instance ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, this operation returns <code>Instance</code> objects for each requested instance, listed in no
     * particular order. If you call this operation for an Anywhere fleet, you receive an InvalidRequestException.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely connect
     * to fleet instances</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html">Debug fleet
     * issues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeInstancesRequest
     * @return A Java Future containing the result of the DescribeInstances operation returned by the service.
     * @sample AmazonGameLiftAsync.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest describeInstancesRequest);

    /**
     * <p>
     * Retrieves information about the EC2 instances in an Amazon GameLift managed fleet, including instance ID,
     * connection data, and status. You can use this operation with a multi-location fleet to get location-specific
     * instance information. As an alternative, use the operations <a>ListCompute</a> and <a>DescribeCompute</a> to
     * retrieve information for compute resources, including EC2 and Anywhere fleets.
     * </p>
     * <p>
     * You can call this operation in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get information on all instances in a fleet's home Region, specify the fleet ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get information on all instances in a fleet's remote location, specify the fleet ID and location name.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get information on a specific instance in a fleet, specify the fleet ID and instance ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, this operation returns <code>Instance</code> objects for each requested instance, listed in no
     * particular order. If you call this operation for an Anywhere fleet, you receive an InvalidRequestException.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely connect
     * to fleet instances</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html">Debug fleet
     * issues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeInstancesRequest
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
     * Notification Service to receive notifications, and provide the topic ARN in the matchmaking configuration.
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
     * 
     * @param describeMatchmakingRequest
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
     * Notification Service to receive notifications, and provide the topic ARN in the matchmaking configuration.
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
     * 
     * @param describeMatchmakingRequest
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
     * 
     * @param describeMatchmakingConfigurationsRequest
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
     * 
     * @param describeMatchmakingConfigurationsRequest
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
     * 
     * @param describeMatchmakingRuleSetsRequest
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
     * 
     * @param describeMatchmakingRuleSetsRequest
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
     * this request by player session status. If you provide a specific <code>PlayerSessionId</code> or
     * <code>PlayerId</code>, Amazon GameLift ignores the filter criteria. Use the pagination parameters to retrieve
     * results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a <code>PlayerSession</code> object is returned for each session that matches the request.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describePlayerSessionsRequest
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
     * this request by player session status. If you provide a specific <code>PlayerSessionId</code> or
     * <code>PlayerId</code>, Amazon GameLift ignores the filter criteria. Use the pagination parameters to retrieve
     * results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, a <code>PlayerSession</code> object is returned for each session that matches the request.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describePlayerSessionsRequest
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
     * Retrieves a fleet's runtime configuration settings. The runtime configuration determines which server processes
     * run, and how, on computes in the fleet. For managed EC2 fleets, the runtime configuration describes server
     * processes that run on each fleet instance. For container fleets, the runtime configuration describes server
     * processes that run in each replica container group. You can update a fleet's runtime configuration at any time
     * using <a>UpdateRuntimeConfiguration</a>.
     * </p>
     * <p>
     * To get the current runtime configuration for a fleet, provide the fleet ID.
     * </p>
     * <p>
     * If successful, a <code>RuntimeConfiguration</code> object is returned for the requested fleet. If the requested
     * fleet has been deleted, the result set is empty.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-multiprocess.html">Running multiple
     * processes on a fleet</a>
     * </p>
     * 
     * @param describeRuntimeConfigurationRequest
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
     * Retrieves a fleet's runtime configuration settings. The runtime configuration determines which server processes
     * run, and how, on computes in the fleet. For managed EC2 fleets, the runtime configuration describes server
     * processes that run on each fleet instance. For container fleets, the runtime configuration describes server
     * processes that run in each replica container group. You can update a fleet's runtime configuration at any time
     * using <a>UpdateRuntimeConfiguration</a>.
     * </p>
     * <p>
     * To get the current runtime configuration for a fleet, provide the fleet ID.
     * </p>
     * <p>
     * If successful, a <code>RuntimeConfiguration</code> object is returned for the requested fleet. If the requested
     * fleet has been deleted, the result set is empty.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-multiprocess.html">Running multiple
     * processes on a fleet</a>
     * </p>
     * 
     * @param describeRuntimeConfigurationRequest
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
     * pages. If successful, set of <code>ScalingPolicy</code> objects is returned for the fleet.
     * </p>
     * <p>
     * A fleet may have all of its scaling policies suspended. This operation does not affect the status of the scaling
     * policies, which remains ACTIVE.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
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
     * pages. If successful, set of <code>ScalingPolicy</code> objects is returned for the fleet.
     * </p>
     * <p>
     * A fleet may have all of its scaling policies suspended. This operation does not affect the status of the scaling
     * policies, which remains ACTIVE.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
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
     * <a href=
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
     * <a href=
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
     * Retrieves valid VPC peering authorizations that are pending for the Amazon Web Services account. This operation
     * returns all VPC peering authorizations and requests for peering. This includes those initiated and received by
     * this account.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
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
     * Retrieves valid VPC peering authorizations that are pending for the Amazon Web Services account. This operation
     * returns all VPC peering authorizations and requests for peering. This includes those initiated and received by
     * this account.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
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
     * To retrieve connection information, call this operation from the Amazon Web Services account that is used to
     * manage the Amazon GameLift fleets. Specify a fleet ID or leave the parameter empty to retrieve all connection
     * records. If successful, the retrieved information includes both active and pending connections. Active
     * connections identify the IpV4 CIDR block that the VPC uses to connect.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeVpcPeeringConnectionsRequest
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
     * To retrieve connection information, call this operation from the Amazon Web Services account that is used to
     * manage the Amazon GameLift fleets. Specify a fleet ID or leave the parameter empty to retrieve all connection
     * records. If successful, the retrieved information includes both active and pending connections. Active
     * connections identify the IpV4 CIDR block that the VPC uses to connect.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param describeVpcPeeringConnectionsRequest
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
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Requests authorization to remotely connect to a hosting resource in a Amazon GameLift managed fleet. This
     * operation is not used with Amazon GameLift Anywhere fleets
     * </p>
     * <p>
     * To request access, specify the compute name and the fleet ID. If successful, this operation returns a set of
     * temporary Amazon Web Services credentials, including a two-part access key and a session token.
     * </p>
     * <p>
     * <b>EC2 fleets</b>
     * </p>
     * <p>
     * With an EC2 fleet (where compute type is <code>EC2</code>), use these credentials with Amazon EC2 Systems Manager
     * (SSM) to start a session with the compute. For more details, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-sessions-start.html#sessions-start-cli"
     * > Starting a session (CLI)</a> in the <i>Amazon EC2 Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Container fleets</b>
     * </p>
     * <p>
     * With a container fleet (where compute type is <code>CONTAINER</code>), use these credentials and the target value
     * with SSM to connect to the fleet instance where the container is running. After you're connected to the instance,
     * use Docker commands to interact with the container.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely connect
     * to fleet instances</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html">Debug fleet
     * issues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-remote-access.html"> Remotely
     * connect to a container fleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getComputeAccessRequest
     * @return A Java Future containing the result of the GetComputeAccess operation returned by the service.
     * @sample AmazonGameLiftAsync.GetComputeAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetComputeAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetComputeAccessResult> getComputeAccessAsync(GetComputeAccessRequest getComputeAccessRequest);

    /**
     * <p>
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Requests authorization to remotely connect to a hosting resource in a Amazon GameLift managed fleet. This
     * operation is not used with Amazon GameLift Anywhere fleets
     * </p>
     * <p>
     * To request access, specify the compute name and the fleet ID. If successful, this operation returns a set of
     * temporary Amazon Web Services credentials, including a two-part access key and a session token.
     * </p>
     * <p>
     * <b>EC2 fleets</b>
     * </p>
     * <p>
     * With an EC2 fleet (where compute type is <code>EC2</code>), use these credentials with Amazon EC2 Systems Manager
     * (SSM) to start a session with the compute. For more details, see <a href=
     * "https://docs.aws.amazon.com/systems-manager/latest/userguide/session-manager-working-with-sessions-start.html#sessions-start-cli"
     * > Starting a session (CLI)</a> in the <i>Amazon EC2 Systems Manager User Guide</i>.
     * </p>
     * <p>
     * <b>Container fleets</b>
     * </p>
     * <p>
     * With a container fleet (where compute type is <code>CONTAINER</code>), use these credentials and the target value
     * with SSM to connect to the fleet instance where the container is running. After you're connected to the instance,
     * use Docker commands to interact with the container.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely connect
     * to fleet instances</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html">Debug fleet
     * issues</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-remote-access.html"> Remotely
     * connect to a container fleet</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param getComputeAccessRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComputeAccess operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.GetComputeAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetComputeAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetComputeAccessResult> getComputeAccessAsync(GetComputeAccessRequest getComputeAccessRequest,
            com.amazonaws.handlers.AsyncHandler<GetComputeAccessRequest, GetComputeAccessResult> asyncHandler);

    /**
     * <p>
     * Requests an authentication token from Amazon GameLift for a compute resource in an Amazon GameLift Anywhere fleet
     * or container fleet. Game servers that are running on the compute use this token to communicate with the Amazon
     * GameLift service, such as when calling the Amazon GameLift server SDK action <code>InitSDK()</code>.
     * Authentication tokens are valid for a limited time span, so you need to request a fresh token before the current
     * token expires.
     * </p>
     * <p>
     * Use this operation based on the fleet compute type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>EC2</code> fleets, auth token retrieval and refresh is handled automatically. All game servers that are
     * running on all fleet instances have access to a valid auth token.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>ANYWHERE</code> and <code>CONTAINER</code> fleets, if you're using the Amazon GameLift Agent, auth
     * token retrieval and refresh is handled automatically for any container or Anywhere compute where the Agent is
     * running. If you're not using the Agent, create a mechanism to retrieve and refresh auth tokens for computes that
     * are running game server processes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-anywhere.html">Create an
     * Anywhere fleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/integration-testing.html">Test your
     * integration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk.html">Server SDK
     * reference guides</a> (for version 5.x)
     * </p>
     * </li>
     * </ul>
     * 
     * @param getComputeAuthTokenRequest
     * @return A Java Future containing the result of the GetComputeAuthToken operation returned by the service.
     * @sample AmazonGameLiftAsync.GetComputeAuthToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetComputeAuthToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetComputeAuthTokenResult> getComputeAuthTokenAsync(GetComputeAuthTokenRequest getComputeAuthTokenRequest);

    /**
     * <p>
     * Requests an authentication token from Amazon GameLift for a compute resource in an Amazon GameLift Anywhere fleet
     * or container fleet. Game servers that are running on the compute use this token to communicate with the Amazon
     * GameLift service, such as when calling the Amazon GameLift server SDK action <code>InitSDK()</code>.
     * Authentication tokens are valid for a limited time span, so you need to request a fresh token before the current
     * token expires.
     * </p>
     * <p>
     * Use this operation based on the fleet compute type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>EC2</code> fleets, auth token retrieval and refresh is handled automatically. All game servers that are
     * running on all fleet instances have access to a valid auth token.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>ANYWHERE</code> and <code>CONTAINER</code> fleets, if you're using the Amazon GameLift Agent, auth
     * token retrieval and refresh is handled automatically for any container or Anywhere compute where the Agent is
     * running. If you're not using the Agent, create a mechanism to retrieve and refresh auth tokens for computes that
     * are running game server processes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-anywhere.html">Create an
     * Anywhere fleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/integration-testing.html">Test your
     * integration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk.html">Server SDK
     * reference guides</a> (for version 5.x)
     * </p>
     * </li>
     * </ul>
     * 
     * @param getComputeAuthTokenRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetComputeAuthToken operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.GetComputeAuthToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetComputeAuthToken" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetComputeAuthTokenResult> getComputeAuthTokenAsync(GetComputeAuthTokenRequest getComputeAuthTokenRequest,
            com.amazonaws.handlers.AsyncHandler<GetComputeAuthTokenRequest, GetComputeAuthTokenResult> asyncHandler);

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game session on Amazon GameLift managed
     * fleets. When a game session is terminated, Amazon GameLift automatically stores the logs in Amazon S3 and retains
     * them for 14 days. Use this URL to download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift">Amazon
     * Web Services Service Limits</a> page for maximum log file sizes. Log files that exceed this limit are not saved.
     * </p>
     * </note>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param getGameSessionLogUrlRequest
     * @return A Java Future containing the result of the GetGameSessionLogUrl operation returned by the service.
     * @sample AmazonGameLiftAsync.GetGameSessionLogUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetGameSessionLogUrl" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<GetGameSessionLogUrlResult> getGameSessionLogUrlAsync(GetGameSessionLogUrlRequest getGameSessionLogUrlRequest);

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game session on Amazon GameLift managed
     * fleets. When a game session is terminated, Amazon GameLift automatically stores the logs in Amazon S3 and retains
     * them for 14 days. Use this URL to download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href="https://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift">Amazon
     * Web Services Service Limits</a> page for maximum log file sizes. Log files that exceed this limit are not saved.
     * </p>
     * </note>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param getGameSessionLogUrlRequest
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
     * Requests authorization to remotely connect to an instance in an Amazon GameLift managed fleet. Use this operation
     * to connect to instances with game servers that use Amazon GameLift server SDK 4.x or earlier. To connect to
     * instances with game servers that use server SDK 5.x or later, call <a>GetComputeAccess</a>.
     * </p>
     * <p>
     * To request access to an instance, specify IDs for the instance and the fleet it belongs to. You can retrieve
     * instance IDs for a fleet by calling <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeInstances.html">DescribeInstances</a>
     * with the fleet ID.
     * </p>
     * <p>
     * If successful, this operation returns an IP address and credentials. The returned credentials match the operating
     * system of the instance, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a Windows instance: returns a user name and secret (password) for use with a Windows Remote Desktop client.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Linux instance: returns a user name and secret (RSA private key) for use with an SSH client. You must save
     * the secret to a <code>.pem</code> file. If you're using the CLI, see the example <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/apireference/API_GetInstanceAccess.html#API_GetInstanceAccess_Examples"
     * > Get credentials for a Linux instance</a> for tips on automatically saving the secret to a <code>.pem</code>
     * file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely connect
     * to fleet instances</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html">Debug fleet
     * issues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param getInstanceAccessRequest
     * @return A Java Future containing the result of the GetInstanceAccess operation returned by the service.
     * @sample AmazonGameLiftAsync.GetInstanceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetInstanceAccess" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<GetInstanceAccessResult> getInstanceAccessAsync(GetInstanceAccessRequest getInstanceAccessRequest);

    /**
     * <p>
     * Requests authorization to remotely connect to an instance in an Amazon GameLift managed fleet. Use this operation
     * to connect to instances with game servers that use Amazon GameLift server SDK 4.x or earlier. To connect to
     * instances with game servers that use server SDK 5.x or later, call <a>GetComputeAccess</a>.
     * </p>
     * <p>
     * To request access to an instance, specify IDs for the instance and the fleet it belongs to. You can retrieve
     * instance IDs for a fleet by calling <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeInstances.html">DescribeInstances</a>
     * with the fleet ID.
     * </p>
     * <p>
     * If successful, this operation returns an IP address and credentials. The returned credentials match the operating
     * system of the instance, as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For a Windows instance: returns a user name and secret (password) for use with a Windows Remote Desktop client.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Linux instance: returns a user name and secret (RSA private key) for use with an SSH client. You must save
     * the secret to a <code>.pem</code> file. If you're using the CLI, see the example <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/apireference/API_GetInstanceAccess.html#API_GetInstanceAccess_Examples"
     * > Get credentials for a Linux instance</a> for tips on automatically saving the secret to a <code>.pem</code>
     * file.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely connect
     * to fleet instances</a>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-debug.html">Debug fleet
     * issues</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param getInstanceAccessRequest
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
     * Retrieves all aliases for this Amazon Web Services account. You can filter the result set by alias name and/or
     * routing strategy type. Use the pagination parameters to retrieve results in sequential pages.
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listAliasesRequest
     * @return A Java Future containing the result of the ListAliases operation returned by the service.
     * @sample AmazonGameLiftAsync.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Retrieves all aliases for this Amazon Web Services account. You can filter the result set by alias name and/or
     * routing strategy type. Use the pagination parameters to retrieve results in sequential pages.
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listAliasesRequest
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
     * Retrieves build resources for all builds associated with the Amazon Web Services account in use. You can limit
     * results to builds that are in a specific status by using the <code>Status</code> parameter. Use the pagination
     * parameters to retrieve results in a set of sequential pages.
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listBuildsRequest
     * @return A Java Future containing the result of the ListBuilds operation returned by the service.
     * @sample AmazonGameLiftAsync.ListBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest listBuildsRequest);

    /**
     * <p>
     * Retrieves build resources for all builds associated with the Amazon Web Services account in use. You can limit
     * results to builds that are in a specific status by using the <code>Status</code> parameter. Use the pagination
     * parameters to retrieve results in a set of sequential pages.
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param listBuildsRequest
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
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Retrieves information on the compute resources in an Amazon GameLift fleet.
     * </p>
     * <p>
     * To request a list of computes, specify the fleet ID. Use the pagination parameters to retrieve results in a set
     * of sequential pages.
     * </p>
     * <p>
     * You can filter the result set by location.
     * </p>
     * <p>
     * If successful, this operation returns information on all computes in the requested fleet. Depending on the
     * fleet's compute type, the result includes the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>EC2</code> fleets, this operation returns information about the EC2 instance. Compute names are
     * instance IDs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>ANYWHERE</code> fleets, this operation returns the compute names and details provided when the compute
     * was registered with <code>RegisterCompute</code>. The <code>GameLiftServiceSdkEndpoint</code> or
     * <code>GameLiftAgentEndpoint</code> is included.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>CONTAINER</code> fleets, this operation returns information about containers that are registered as
     * computes, and the instances they're running on. Compute names are container names.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listComputeRequest
     * @return A Java Future containing the result of the ListCompute operation returned by the service.
     * @sample AmazonGameLiftAsync.ListCompute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListCompute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListComputeResult> listComputeAsync(ListComputeRequest listComputeRequest);

    /**
     * <p>
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Retrieves information on the compute resources in an Amazon GameLift fleet.
     * </p>
     * <p>
     * To request a list of computes, specify the fleet ID. Use the pagination parameters to retrieve results in a set
     * of sequential pages.
     * </p>
     * <p>
     * You can filter the result set by location.
     * </p>
     * <p>
     * If successful, this operation returns information on all computes in the requested fleet. Depending on the
     * fleet's compute type, the result includes the following information:
     * </p>
     * <ul>
     * <li>
     * <p>
     * For <code>EC2</code> fleets, this operation returns information about the EC2 instance. Compute names are
     * instance IDs.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>ANYWHERE</code> fleets, this operation returns the compute names and details provided when the compute
     * was registered with <code>RegisterCompute</code>. The <code>GameLiftServiceSdkEndpoint</code> or
     * <code>GameLiftAgentEndpoint</code> is included.
     * </p>
     * </li>
     * <li>
     * <p>
     * For <code>CONTAINER</code> fleets, this operation returns information about containers that are registered as
     * computes, and the instances they're running on. Compute names are container names.
     * </p>
     * </li>
     * </ul>
     * 
     * @param listComputeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCompute operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListCompute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListCompute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListComputeResult> listComputeAsync(ListComputeRequest listComputeRequest,
            com.amazonaws.handlers.AsyncHandler<ListComputeRequest, ListComputeResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the Amazon GameLift containers feature, which is currently in public preview. </b>
     * </p>
     * <p>
     * Retrieves all container group definitions for the Amazon Web Services account and Amazon Web Services Region that
     * are currently in use. You can filter the result set by the container groups' scheduling strategy. Use the
     * pagination parameters to retrieve results in a set of sequential pages.
     * </p>
     * <note>
     * <p>
     * This operation returns the list of container group definitions in no particular order.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-create-groups.html">Manage a
     * container group definition</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listContainerGroupDefinitionsRequest
     * @return A Java Future containing the result of the ListContainerGroupDefinitions operation returned by the
     *         service.
     * @sample AmazonGameLiftAsync.ListContainerGroupDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListContainerGroupDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListContainerGroupDefinitionsResult> listContainerGroupDefinitionsAsync(
            ListContainerGroupDefinitionsRequest listContainerGroupDefinitionsRequest);

    /**
     * <p>
     * <b>This operation is used with the Amazon GameLift containers feature, which is currently in public preview. </b>
     * </p>
     * <p>
     * Retrieves all container group definitions for the Amazon Web Services account and Amazon Web Services Region that
     * are currently in use. You can filter the result set by the container groups' scheduling strategy. Use the
     * pagination parameters to retrieve results in a set of sequential pages.
     * </p>
     * <note>
     * <p>
     * This operation returns the list of container group definitions in no particular order.
     * </p>
     * </note>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/containers-create-groups.html">Manage a
     * container group definition</a>
     * </p>
     * </li>
     * </ul>
     * 
     * @param listContainerGroupDefinitionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListContainerGroupDefinitions operation returned by the
     *         service.
     * @sample AmazonGameLiftAsyncHandler.ListContainerGroupDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListContainerGroupDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ListContainerGroupDefinitionsResult> listContainerGroupDefinitionsAsync(
            ListContainerGroupDefinitionsRequest listContainerGroupDefinitionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListContainerGroupDefinitionsRequest, ListContainerGroupDefinitionsResult> asyncHandler);

    /**
     * <p>
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Retrieves a collection of fleet resources in an Amazon Web Services Region. You can filter the result set to find
     * only those fleets that are deployed with a specific build or script. For fleets that have multiple locations,
     * this operation retrieves fleets based on their home Region only.
     * </p>
     * <p>
     * You can use operation in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get a list of all fleets in a Region, don't provide a build or script identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get a list of all fleets where a specific game build is deployed, provide the build ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get a list of all Realtime Servers fleets with a specific configuration script, provide the script ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get a list of all fleets with a specific container group definition, provide the
     * <code>ContainerGroupDefinition</code> ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, this operation returns a list of fleet IDs that match the request parameters. A NextToken value is
     * also returned if there are more result pages to retrieve.
     * </p>
     * <note>
     * <p>
     * Fleet IDs are returned in no particular order.
     * </p>
     * </note>
     * 
     * @param listFleetsRequest
     * @return A Java Future containing the result of the ListFleets operation returned by the service.
     * @sample AmazonGameLiftAsync.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Retrieves a collection of fleet resources in an Amazon Web Services Region. You can filter the result set to find
     * only those fleets that are deployed with a specific build or script. For fleets that have multiple locations,
     * this operation retrieves fleets based on their home Region only.
     * </p>
     * <p>
     * You can use operation in the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get a list of all fleets in a Region, don't provide a build or script identifier.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get a list of all fleets where a specific game build is deployed, provide the build ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get a list of all Realtime Servers fleets with a specific configuration script, provide the script ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * To get a list of all fleets with a specific container group definition, provide the
     * <code>ContainerGroupDefinition</code> ID.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Use the pagination parameters to retrieve results as a set of sequential pages.
     * </p>
     * <p>
     * If successful, this operation returns a list of fleet IDs that match the request parameters. A NextToken value is
     * also returned if there are more result pages to retrieve.
     * </p>
     * <note>
     * <p>
     * Fleet IDs are returned in no particular order.
     * </p>
     * </note>
     * 
     * @param listFleetsRequest
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
     * Lists a game server groups.
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
     * Lists a game server groups.
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * Lists all custom and Amazon Web Services locations.
     * </p>
     * 
     * @param listLocationsRequest
     * @return A Java Future containing the result of the ListLocations operation returned by the service.
     * @sample AmazonGameLiftAsync.ListLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListLocations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLocationsResult> listLocationsAsync(ListLocationsRequest listLocationsRequest);

    /**
     * <p>
     * Lists all custom and Amazon Web Services locations.
     * </p>
     * 
     * @param listLocationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListLocations operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.ListLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListLocations" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ListLocationsResult> listLocationsAsync(ListLocationsRequest listLocationsRequest,
            com.amazonaws.handlers.AsyncHandler<ListLocationsRequest, ListLocationsResult> asyncHandler);

    /**
     * <p>
     * Retrieves script records for all Realtime scripts that are associated with the Amazon Web Services account in
     * use.
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
     * <a href=
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
     * Retrieves script records for all Realtime scripts that are associated with the Amazon Web Services account in
     * use.
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
     * <a href=
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
     * Retrieves all tags assigned to a Amazon GameLift resource. Use resource tags to organize Amazon Web Services
     * resources for a range of purposes. This operation handles the permissions necessary to manage tags for Amazon
     * GameLift resources that support tagging.
     * </p>
     * <p>
     * To list tags for a resource, specify the unique ARN value for the resource.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     * Resources</a> in the <i>Amazon Web Services General Reference</i>
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/answers/account-management/aws-tagging-strategies/"> Amazon Web Services Tagging
     * Strategies</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
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
     * Retrieves all tags assigned to a Amazon GameLift resource. Use resource tags to organize Amazon Web Services
     * resources for a range of purposes. This operation handles the permissions necessary to manage tags for Amazon
     * GameLift resources that support tagging.
     * </p>
     * <p>
     * To list tags for a resource, specify the unique ARN value for the resource.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     * Resources</a> in the <i>Amazon Web Services General Reference</i>
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/answers/account-management/aws-tagging-strategies/"> Amazon Web Services Tagging
     * Strategies</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
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
     * Specify the metric to track (PercentAvailableGameSessions) and reference a <code>TargetConfiguration</code>
     * object with your desired buffer value. Exclude all other parameters. On a successful request, the policy name is
     * returned. The scaling policy is automatically in force as soon as it's successfully created. If the fleet's
     * auto-scaling actions are temporarily suspended, the new policy will be in force once the fleet actions are
     * restarted.
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
     * 
     * @param putScalingPolicyRequest
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
     * Specify the metric to track (PercentAvailableGameSessions) and reference a <code>TargetConfiguration</code>
     * object with your desired buffer value. Exclude all other parameters. On a successful request, the policy name is
     * returned. The scaling policy is automatically in force as soon as it's successfully created. If the fleet's
     * auto-scaling actions are temporarily suspended, the new policy will be in force once the fleet actions are
     * restarted.
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
     * 
     * @param putScalingPolicyRequest
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
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Registers a compute resource in an Amazon GameLift fleet. Register computes with an Amazon GameLift Anywhere
     * fleet or a container fleet.
     * </p>
     * <p>
     * For an Anywhere fleet or a container fleet that's running the Amazon GameLift Agent, the Agent handles all
     * compute registry tasks for you. For an Anywhere fleet that doesn't use the Agent, call this operation to register
     * fleet computes.
     * </p>
     * <p>
     * To register a compute, give the compute a name (must be unique within the fleet) and specify the compute
     * resource's DNS name or IP address. Provide a fleet ID and a fleet location to associate with the compute being
     * registered. You can optionally include the path to a TLS certificate on the compute resource.
     * </p>
     * <p>
     * If successful, this operation returns compute details, including an Amazon GameLift SDK endpoint or Agent
     * endpoint. Game server processes running on the compute can use this endpoint to communicate with the Amazon
     * GameLift service. Each server process includes the SDK endpoint in its call to the Amazon GameLift server SDK
     * action <code>InitSDK()</code>.
     * </p>
     * <p>
     * To view compute details, call <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeCompute.html">DescribeCompute</a> with
     * the compute name.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-anywhere.html">Create an
     * Anywhere fleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/integration-testing.html">Test your
     * integration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk.html">Server SDK
     * reference guides</a> (for version 5.x)
     * </p>
     * </li>
     * </ul>
     * 
     * @param registerComputeRequest
     * @return A Java Future containing the result of the RegisterCompute operation returned by the service.
     * @sample AmazonGameLiftAsync.RegisterCompute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RegisterCompute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterComputeResult> registerComputeAsync(RegisterComputeRequest registerComputeRequest);

    /**
     * <p>
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Registers a compute resource in an Amazon GameLift fleet. Register computes with an Amazon GameLift Anywhere
     * fleet or a container fleet.
     * </p>
     * <p>
     * For an Anywhere fleet or a container fleet that's running the Amazon GameLift Agent, the Agent handles all
     * compute registry tasks for you. For an Anywhere fleet that doesn't use the Agent, call this operation to register
     * fleet computes.
     * </p>
     * <p>
     * To register a compute, give the compute a name (must be unique within the fleet) and specify the compute
     * resource's DNS name or IP address. Provide a fleet ID and a fleet location to associate with the compute being
     * registered. You can optionally include the path to a TLS certificate on the compute resource.
     * </p>
     * <p>
     * If successful, this operation returns compute details, including an Amazon GameLift SDK endpoint or Agent
     * endpoint. Game server processes running on the compute can use this endpoint to communicate with the Amazon
     * GameLift service. Each server process includes the SDK endpoint in its call to the Amazon GameLift server SDK
     * action <code>InitSDK()</code>.
     * </p>
     * <p>
     * To view compute details, call <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeCompute.html">DescribeCompute</a> with
     * the compute name.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-creating-anywhere.html">Create an
     * Anywhere fleet</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/integration-testing.html">Test your
     * integration</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk.html">Server SDK
     * reference guides</a> (for version 5.x)
     * </p>
     * </li>
     * </ul>
     * 
     * @param registerComputeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RegisterCompute operation returned by the service.
     * @sample AmazonGameLiftAsyncHandler.RegisterCompute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RegisterCompute" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<RegisterComputeResult> registerComputeAsync(RegisterComputeRequest registerComputeRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterComputeRequest, RegisterComputeResult> asyncHandler);

    /**
     * <p>
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Creates a new game server resource and notifies Amazon GameLift FleetIQ that the game server is ready to host
     * gameplay and players. This operation is called by a game server process that is running on an instance in a game
     * server group. Registering game servers enables Amazon GameLift FleetIQ to track available game servers and
     * enables game clients and services to claim a game server for a new game session.
     * </p>
     * <p>
     * To register a game server, identify the game server group and instance where the game server is running, and
     * provide a unique identifier for the game server. You can also include connection and game server data.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Creates a new game server resource and notifies Amazon GameLift FleetIQ that the game server is ready to host
     * gameplay and players. This operation is called by a game server process that is running on an instance in a game
     * server group. Registering game servers enables Amazon GameLift FleetIQ to track available game servers and
     * enables game clients and services to claim a game server for a new game session.
     * </p>
     * <p>
     * To register a game server, identify the game server group and instance where the game server is running, and
     * provide a unique identifier for the game server. You can also include connection and game server data.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * Amazon S3. This is done as part of the build creation process; see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateBuild.html">CreateBuild</a>.
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param requestUploadCredentialsRequest
     * @return A Java Future containing the result of the RequestUploadCredentials operation returned by the service.
     * @sample AmazonGameLiftAsync.RequestUploadCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RequestUploadCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<RequestUploadCredentialsResult> requestUploadCredentialsAsync(RequestUploadCredentialsRequest requestUploadCredentialsRequest);

    /**
     * <p>
     * Retrieves a fresh set of credentials for use when uploading a new set of game build files to Amazon GameLift's
     * Amazon S3. This is done as part of the build creation process; see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_CreateBuild.html">CreateBuild</a>.
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param requestUploadCredentialsRequest
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
     * Attempts to retrieve a fleet ID that is associated with an alias. Specify a unique alias identifier.
     * </p>
     * <p>
     * If the alias has a <code>SIMPLE</code> routing strategy, Amazon GameLift returns a fleet ID. If the alias has a
     * <code>TERMINAL</code> routing strategy, the result is a <code>TerminalRoutingStrategyException</code>.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param resolveAliasRequest
     * @return A Java Future containing the result of the ResolveAlias operation returned by the service.
     * @sample AmazonGameLiftAsync.ResolveAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ResolveAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ResolveAliasResult> resolveAliasAsync(ResolveAliasRequest resolveAliasRequest);

    /**
     * <p>
     * Attempts to retrieve a fleet ID that is associated with an alias. Specify a unique alias identifier.
     * </p>
     * <p>
     * If the alias has a <code>SIMPLE</code> routing strategy, Amazon GameLift returns a fleet ID. If the alias has a
     * <code>TERMINAL</code> routing strategy, the result is a <code>TerminalRoutingStrategyException</code>.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param resolveAliasRequest
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Reinstates activity on a game server group after it has been suspended. A game server group might be suspended by
     * the <a href="gamelift/latest/apireference/API_SuspendGameServerGroup.html">SuspendGameServerGroup</a> operation,
     * or it might be suspended involuntarily due to a configuration problem. In the second case, you can manually
     * resume activity on the group once the configuration problem has been resolved. Refer to the game server group
     * status and status reason for more information on why group activity is suspended.
     * </p>
     * <p>
     * To resume activity, specify a game server group ARN and the type of activity to be resumed. If successful, a
     * <code>GameServerGroup</code> object is returned showing that the resumed activity is no longer listed in
     * <code>SuspendedActions</code>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Reinstates activity on a game server group after it has been suspended. A game server group might be suspended by
     * the <a href="gamelift/latest/apireference/API_SuspendGameServerGroup.html">SuspendGameServerGroup</a> operation,
     * or it might be suspended involuntarily due to a configuration problem. In the second case, you can manually
     * resume activity on the group once the configuration problem has been resolved. Refer to the game server group
     * status and status reason for more information on why group activity is suspended.
     * </p>
     * <p>
     * To resume activity, specify a game server group ARN and the type of activity to be resumed. If successful, a
     * <code>GameServerGroup</code> object is returned showing that the resumed activity is no longer listed in
     * <code>SuspendedActions</code>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * This operation is not designed to continually track game session status because that practice can cause you to
     * exceed your API limit and generate errors. Instead, configure an Amazon Simple Notification Service (Amazon SNS)
     * topic to receive notifications from a matchmaker or a game session placement queue.
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
     * in other statuses, use <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeGameSessions.html"
     * >DescribeGameSessions</a> .
     * </p>
     * <p>
     * To set search and sort criteria, create a filter expression using the following game session attributes. For game
     * session search examples, see the Examples section of this topic.
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
     * <b>gameSessionName</b> -- Name assigned to a game session. Game session names do not need to be unique to a game
     * session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gameSessionProperties</b> -- A set of key-value pairs that can store custom data in a game session. For
     * example: <code>{"Key": "difficulty", "Value": "novice"}</code>. The filter expression must specify the
     * <a>GameProperty</a> -- a <code>Key</code> and a string <code>Value</code> to search for the game sessions.
     * </p>
     * <p>
     * For example, to search for the above key-value pair, specify the following search filter:
     * <code>gameSessionProperties.difficulty = "novice"</code>. All game property values are searched as strings.
     * </p>
     * <p>
     * For examples of searching game sessions, see the ones below, and also see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#game-properties-search"
     * >Search game sessions by game property</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>maximumSessions</b> -- Maximum number of player sessions allowed for a game session.
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param searchGameSessionsRequest
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
     * This operation is not designed to continually track game session status because that practice can cause you to
     * exceed your API limit and generate errors. Instead, configure an Amazon Simple Notification Service (Amazon SNS)
     * topic to receive notifications from a matchmaker or a game session placement queue.
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
     * in other statuses, use <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeGameSessions.html"
     * >DescribeGameSessions</a> .
     * </p>
     * <p>
     * To set search and sort criteria, create a filter expression using the following game session attributes. For game
     * session search examples, see the Examples section of this topic.
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
     * <b>gameSessionName</b> -- Name assigned to a game session. Game session names do not need to be unique to a game
     * session.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>gameSessionProperties</b> -- A set of key-value pairs that can store custom data in a game session. For
     * example: <code>{"Key": "difficulty", "Value": "novice"}</code>. The filter expression must specify the
     * <a>GameProperty</a> -- a <code>Key</code> and a string <code>Value</code> to search for the game sessions.
     * </p>
     * <p>
     * For example, to search for the above key-value pair, specify the following search filter:
     * <code>gameSessionProperties.difficulty = "novice"</code>. All game property values are searched as strings.
     * </p>
     * <p>
     * For examples of searching game sessions, see the ones below, and also see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-client-api.html#game-properties-search"
     * >Search game sessions by game property</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>maximumSessions</b> -- Maximum number of player sessions allowed for a game session.
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param searchGameSessionsRequest
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
     * Resumes certain types of activity on fleet instances that were suspended with <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html">StopFleetActions</a>.
     * For multi-location fleets, fleet actions are managed separately for each location. Currently, this operation is
     * used to restart a fleet's auto-scaling activity.
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
     * If successful, Amazon GameLift once again initiates scaling events as triggered by the fleet's scaling policies.
     * If actions on the fleet location were never stopped, this operation will have no effect.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param startFleetActionsRequest
     * @return A Java Future containing the result of the StartFleetActions operation returned by the service.
     * @sample AmazonGameLiftAsync.StartFleetActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartFleetActions" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartFleetActionsResult> startFleetActionsAsync(StartFleetActionsRequest startFleetActionsRequest);

    /**
     * <p>
     * Resumes certain types of activity on fleet instances that were suspended with <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html">StopFleetActions</a>.
     * For multi-location fleets, fleet actions are managed separately for each location. Currently, this operation is
     * used to restart a fleet's auto-scaling activity.
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
     * If successful, Amazon GameLift once again initiates scaling events as triggered by the fleet's scaling policies.
     * If actions on the fleet location were never stopped, this operation will have no effect.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param startFleetActionsRequest
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
     * Places a request for a new game session in a queue. When processing a placement request, Amazon GameLift searches
     * for available resources on the queue's destinations, scanning each until it finds resources or the placement
     * request times out.
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
     * To track the status of a placement request, call <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeGameSessionPlacement.html"
     * >DescribeGameSessionPlacement</a> and check the request's status. If the status is <code>FULFILLED</code>, a new
     * game session has been created and a game session ARN and Region are referenced. If the placement request times
     * out, you can resubmit the request or retry it with a different queue.
     * </p>
     * 
     * @param startGameSessionPlacementRequest
     * @return A Java Future containing the result of the StartGameSessionPlacement operation returned by the service.
     * @sample AmazonGameLiftAsync.StartGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<StartGameSessionPlacementResult> startGameSessionPlacementAsync(
            StartGameSessionPlacementRequest startGameSessionPlacementRequest);

    /**
     * <p>
     * Places a request for a new game session in a queue. When processing a placement request, Amazon GameLift searches
     * for available resources on the queue's destinations, scanning each until it finds resources or the placement
     * request times out.
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
     * To track the status of a placement request, call <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeGameSessionPlacement.html"
     * >DescribeGameSessionPlacement</a> and check the request's status. If the status is <code>FULFILLED</code>, a new
     * game session has been created and a game session ARN and Region are referenced. If the placement request times
     * out, you can resubmit the request or retry it with a different queue.
     * </p>
     * 
     * @param startGameSessionPlacementRequest
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
     * When using FlexMatch with Amazon GameLift managed hosting, you can request a backfill match from a client service
     * by calling this operation with a <code>GameSessions</code> ID. You also have the option of making backfill
     * requests directly from your game server. In response to a request, FlexMatch creates player sessions for the new
     * players, updates the <code>GameSession</code> resource, and sends updated matchmaking data to the game server.
     * You can request a backfill match at any point after a game session is started. Each game session can have only
     * one active backfill request at a time; a subsequent request automatically replaces the earlier request.
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
     * Only game sessions created by FlexMatch are supported for match backfill.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/gamelift-match.html"> How Amazon GameLift
     * FlexMatch works</a>
     * </p>
     * 
     * @param startMatchBackfillRequest
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
     * When using FlexMatch with Amazon GameLift managed hosting, you can request a backfill match from a client service
     * by calling this operation with a <code>GameSessions</code> ID. You also have the option of making backfill
     * requests directly from your game server. In response to a request, FlexMatch creates player sessions for the new
     * players, updates the <code>GameSession</code> resource, and sends updated matchmaking data to the game server.
     * You can request a backfill match at any point after a game session is started. Each game session can have only
     * one active backfill request at a time; a subsequent request automatically replaces the earlier request.
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
     * Only game sessions created by FlexMatch are supported for match backfill.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/gamelift-match.html"> How Amazon GameLift
     * FlexMatch works</a>
     * </p>
     * 
     * @param startMatchBackfillRequest
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
     * use Amazon GameLift managed hosting, this operation also triggers Amazon GameLift to find hosting resources and
     * start a new game session for the new match. Each matchmaking request includes information on one or more players
     * and specifies the FlexMatch matchmaker to use. When a request is for multiple players, FlexMatch attempts to
     * build a match that includes all players in the request, placing them in the same team and finding additional
     * players as needed to fill the match.
     * </p>
     * <p>
     * To start matchmaking, provide a unique ticket ID, specify a matchmaking configuration, and include the players to
     * be matched. You must also include any player attributes that are required by the matchmaking configuration's rule
     * set. If successful, a matchmaking ticket is returned with status set to <code>QUEUED</code>.
     * </p>
     * <p>
     * Track matchmaking events to respond as needed and acquire game session connection information for successfully
     * completed matches. Ticket status updates are tracked using event notification through Amazon Simple Notification
     * Service, which is defined in the matchmaking configuration.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/gamelift-match.html"> How Amazon GameLift
     * FlexMatch works</a>
     * </p>
     * 
     * @param startMatchmakingRequest
     * @return A Java Future containing the result of the StartMatchmaking operation returned by the service.
     * @sample AmazonGameLiftAsync.StartMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchmaking" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<StartMatchmakingResult> startMatchmakingAsync(StartMatchmakingRequest startMatchmakingRequest);

    /**
     * <p>
     * Uses FlexMatch to create a game match for a group of players based on custom matchmaking rules. With games that
     * use Amazon GameLift managed hosting, this operation also triggers Amazon GameLift to find hosting resources and
     * start a new game session for the new match. Each matchmaking request includes information on one or more players
     * and specifies the FlexMatch matchmaker to use. When a request is for multiple players, FlexMatch attempts to
     * build a match that includes all players in the request, placing them in the same team and finding additional
     * players as needed to fill the match.
     * </p>
     * <p>
     * To start matchmaking, provide a unique ticket ID, specify a matchmaking configuration, and include the players to
     * be matched. You must also include any player attributes that are required by the matchmaking configuration's rule
     * set. If successful, a matchmaking ticket is returned with status set to <code>QUEUED</code>.
     * </p>
     * <p>
     * Track matchmaking events to respond as needed and acquire game session connection information for successfully
     * completed matches. Ticket status updates are tracked using event notification through Amazon Simple Notification
     * Service, which is defined in the matchmaking configuration.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/flexmatchguide/gamelift-match.html"> How Amazon GameLift
     * FlexMatch works</a>
     * </p>
     * 
     * @param startMatchmakingRequest
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
     * If successful, Amazon GameLift no longer initiates scaling events except in response to manual changes using <a
     * href
     * ="https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html">UpdateFleetCapacity</a>.
     * To restart fleet actions again, call <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StartFleetActions.html">StartFleetActions</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * Fleets</a>
     * </p>
     * 
     * @param stopFleetActionsRequest
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
     * If successful, Amazon GameLift no longer initiates scaling events except in response to manual changes using <a
     * href
     * ="https://docs.aws.amazon.com/gamelift/latest/apireference/API_UpdateFleetCapacity.html">UpdateFleetCapacity</a>.
     * To restart fleet actions again, call <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StartFleetActions.html">StartFleetActions</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * Fleets</a>
     * </p>
     * 
     * @param stopFleetActionsRequest
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
     * 
     * @param stopGameSessionPlacementRequest
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
     * 
     * @param stopGameSessionPlacementRequest
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
     * 
     * @param stopMatchmakingRequest
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
     * 
     * @param stopMatchmakingRequest
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Temporarily stops activity on a game server group without terminating instances or the game server group. You can
     * restart activity by calling <a
     * href="gamelift/latest/apireference/API_ResumeGameServerGroup.html">ResumeGameServerGroup</a>. You can suspend the
     * following activity:
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
     * <code>GameServerGroup</code> object is returned showing that the activity is listed in
     * <code>SuspendedActions</code>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Temporarily stops activity on a game server group without terminating instances or the game server group. You can
     * restart activity by calling <a
     * href="gamelift/latest/apireference/API_ResumeGameServerGroup.html">ResumeGameServerGroup</a>. You can suspend the
     * following activity:
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
     * <code>GameServerGroup</code> object is returned showing that the activity is listed in
     * <code>SuspendedActions</code>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * Assigns a tag to an Amazon GameLift resource. You can use tags to organize resources, create IAM permissions
     * policies to manage access to groups of resources, customize Amazon Web Services cost breakdowns, and more. This
     * operation handles the permissions necessary to manage tags for Amazon GameLift resources that support tagging.
     * </p>
     * <p>
     * To add a tag to a resource, specify the unique ARN value for the resource and provide a tag list containing one
     * or more tags. The operation succeeds even if the list includes tags that are already assigned to the resource.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     * Resources</a> in the <i>Amazon Web Services General Reference</i>
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/answers/account-management/aws-tagging-strategies/"> Amazon Web Services Tagging
     * Strategies</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
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
     * Assigns a tag to an Amazon GameLift resource. You can use tags to organize resources, create IAM permissions
     * policies to manage access to groups of resources, customize Amazon Web Services cost breakdowns, and more. This
     * operation handles the permissions necessary to manage tags for Amazon GameLift resources that support tagging.
     * </p>
     * <p>
     * To add a tag to a resource, specify the unique ARN value for the resource and provide a tag list containing one
     * or more tags. The operation succeeds even if the list includes tags that are already assigned to the resource.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     * Resources</a> in the <i>Amazon Web Services General Reference</i>
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/answers/account-management/aws-tagging-strategies/"> Amazon Web Services Tagging
     * Strategies</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
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
     * Removes a tag assigned to a Amazon GameLift resource. You can use resource tags to organize Amazon Web Services
     * resources for a range of purposes. This operation handles the permissions necessary to manage tags for Amazon
     * GameLift resources that support tagging.
     * </p>
     * <p>
     * To remove a tag from a resource, specify the unique ARN value for the resource and provide a string list
     * containing one or more tags to remove. This operation succeeds even if the list includes tags that aren't
     * assigned to the resource.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     * Resources</a> in the <i>Amazon Web Services General Reference</i>
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/answers/account-management/aws-tagging-strategies/"> Amazon Web Services Tagging
     * Strategies</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
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
     * Removes a tag assigned to a Amazon GameLift resource. You can use resource tags to organize Amazon Web Services
     * resources for a range of purposes. This operation handles the permissions necessary to manage tags for Amazon
     * GameLift resources that support tagging.
     * </p>
     * <p>
     * To remove a tag from a resource, specify the unique ARN value for the resource and provide a string list
     * containing one or more tags to remove. This operation succeeds even if the list includes tags that aren't
     * assigned to the resource.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">Tagging Amazon Web Services
     * Resources</a> in the <i>Amazon Web Services General Reference</i>
     * </p>
     * <p>
     * <a href="http://aws.amazon.com/answers/account-management/aws-tagging-strategies/"> Amazon Web Services Tagging
     * Strategies</a>
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
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
     * Updates properties for an alias. Specify the unique identifier of the alias to be updated and the new property
     * values. When reassigning an alias to a new fleet, provide an updated routing strategy. If successful, the updated
     * alias record is returned.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateAliasRequest
     * @return A Java Future containing the result of the UpdateAlias operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Updates properties for an alias. Specify the unique identifier of the alias to be updated and the new property
     * values. When reassigning an alias to a new fleet, provide an updated routing strategy. If successful, the updated
     * alias record is returned.
     * </p>
     * <p>
     * <b>Related actions</b>
     * </p>
     * <p>
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateAliasRequest
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateBuildRequest
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateBuildRequest
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
     * Updates a fleet's mutable attributes, such as game session protection and resource creation limits.
     * </p>
     * <p>
     * To update fleet attributes, specify the fleet ID and the property values that you want to change. If successful,
     * Amazon GameLift returns the identifiers for the updated fleet.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param updateFleetAttributesRequest
     * @return A Java Future containing the result of the UpdateFleetAttributes operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetAttributesResult> updateFleetAttributesAsync(UpdateFleetAttributesRequest updateFleetAttributesRequest);

    /**
     * <p>
     * Updates a fleet's mutable attributes, such as game session protection and resource creation limits.
     * </p>
     * <p>
     * To update fleet attributes, specify the fleet ID and the property values that you want to change. If successful,
     * Amazon GameLift returns the identifiers for the updated fleet.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param updateFleetAttributesRequest
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
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Updates capacity settings for a managed EC2 fleet or container fleet. For these fleets, you adjust capacity by
     * changing the number of instances in the fleet. Fleet capacity determines the number of game sessions and players
     * that the fleet can host based on its configuration. For fleets with multiple locations, use this operation to
     * manage capacity settings in each location individually.
     * </p>
     * <p>
     * Use this operation to set these fleet capacity properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Minimum/maximum size: Set hard limits on the number of Amazon EC2 instances allowed. If Amazon GameLift receives
     * a request--either through manual update or automatic scaling--it won't change the capacity to a value outside of
     * this range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Desired capacity: As an alternative to automatic scaling, manually set the number of Amazon EC2 instances to be
     * maintained. Before changing a fleet's desired capacity, check the maximum capacity of the fleet's Amazon EC2
     * instance type by calling <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeEC2InstanceLimits.html"
     * >DescribeEC2InstanceLimits</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To update capacity for a fleet's home Region, or if the fleet has no remote locations, omit the
     * <code>Location</code> parameter. The fleet must be in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * To update capacity for a fleet's remote location, set the <code>Location</code> parameter to the location to
     * update. The location must be in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * If successful, Amazon GameLift updates the capacity settings and returns the identifiers for the updated fleet
     * and/or location. If a requested change to desired capacity exceeds the instance type's limit, the
     * <code>LimitExceeded</code> exception occurs.
     * </p>
     * <p>
     * Updates often prompt an immediate change in fleet capacity, such as when current capacity is different than the
     * new desired capacity or outside the new limits. In this scenario, Amazon GameLift automatically initiates steps
     * to add or remove instances in the fleet location. You can track a fleet's current capacity by calling <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html"
     * >DescribeFleetCapacity</a> or <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html"
     * >DescribeFleetLocationCapacity</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-manage-capacity.html">Scaling fleet
     * capacity</a>
     * </p>
     * 
     * @param updateFleetCapacityRequest
     * @return A Java Future containing the result of the UpdateFleetCapacity operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetCapacityResult> updateFleetCapacityAsync(UpdateFleetCapacityRequest updateFleetCapacityRequest);

    /**
     * <p>
     * <b>This operation has been expanded to use with the Amazon GameLift containers feature, which is currently in
     * public preview.</b>
     * </p>
     * <p>
     * Updates capacity settings for a managed EC2 fleet or container fleet. For these fleets, you adjust capacity by
     * changing the number of instances in the fleet. Fleet capacity determines the number of game sessions and players
     * that the fleet can host based on its configuration. For fleets with multiple locations, use this operation to
     * manage capacity settings in each location individually.
     * </p>
     * <p>
     * Use this operation to set these fleet capacity properties:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Minimum/maximum size: Set hard limits on the number of Amazon EC2 instances allowed. If Amazon GameLift receives
     * a request--either through manual update or automatic scaling--it won't change the capacity to a value outside of
     * this range.
     * </p>
     * </li>
     * <li>
     * <p>
     * Desired capacity: As an alternative to automatic scaling, manually set the number of Amazon EC2 instances to be
     * maintained. Before changing a fleet's desired capacity, check the maximum capacity of the fleet's Amazon EC2
     * instance type by calling <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeEC2InstanceLimits.html"
     * >DescribeEC2InstanceLimits</a>.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To update capacity for a fleet's home Region, or if the fleet has no remote locations, omit the
     * <code>Location</code> parameter. The fleet must be in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * To update capacity for a fleet's remote location, set the <code>Location</code> parameter to the location to
     * update. The location must be in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * If successful, Amazon GameLift updates the capacity settings and returns the identifiers for the updated fleet
     * and/or location. If a requested change to desired capacity exceeds the instance type's limit, the
     * <code>LimitExceeded</code> exception occurs.
     * </p>
     * <p>
     * Updates often prompt an immediate change in fleet capacity, such as when current capacity is different than the
     * new desired capacity or outside the new limits. In this scenario, Amazon GameLift automatically initiates steps
     * to add or remove instances in the fleet location. You can track a fleet's current capacity by calling <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetCapacity.html"
     * >DescribeFleetCapacity</a> or <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_DescribeFleetLocationCapacity.html"
     * >DescribeFleetLocationCapacity</a>.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-manage-capacity.html">Scaling fleet
     * capacity</a>
     * </p>
     * 
     * @param updateFleetCapacityRequest
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
     * Updates permissions that allow inbound traffic to connect to game sessions in the fleet.
     * </p>
     * <p>
     * To update settings, specify the fleet ID to be updated and specify the changes to be made. List the permissions
     * you want to add in <code>InboundPermissionAuthorizations</code>, and permissions you want to remove in
     * <code>InboundPermissionRevocations</code>. Permissions to be removed must match existing fleet permissions.
     * </p>
     * <p>
     * For a container fleet, inbound permissions must specify port numbers that are defined in the fleet's connection
     * port settings.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param updateFleetPortSettingsRequest
     * @return A Java Future containing the result of the UpdateFleetPortSettings operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateFleetPortSettingsResult> updateFleetPortSettingsAsync(UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest);

    /**
     * <p>
     * Updates permissions that allow inbound traffic to connect to game sessions in the fleet.
     * </p>
     * <p>
     * To update settings, specify the fleet ID to be updated and specify the changes to be made. List the permissions
     * you want to add in <code>InboundPermissionAuthorizations</code>, and permissions you want to remove in
     * <code>InboundPermissionRevocations</code>. Permissions to be removed must match existing fleet permissions.
     * </p>
     * <p>
     * For a container fleet, inbound permissions must specify port numbers that are defined in the fleet's connection
     * port settings.
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param updateFleetPortSettingsRequest
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Updates information about a registered game server to help Amazon GameLift FleetIQ track game server
     * availability. This operation is called by a game server process that is running on an instance in a game server
     * group.
     * </p>
     * <p>
     * Use this operation to update the following types of game server information. You can make all three types of
     * updates in the same request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To update the game server's utilization status from <code>AVAILABLE</code> (when the game server is available to
     * be claimed) to <code>UTILIZED</code> (when the game server is currently hosting games). Identify the game server
     * and game server group and specify the new utilization status. You can't change the status from to
     * <code>UTILIZED</code> to <code>AVAILABLE</code> .
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Updates information about a registered game server to help Amazon GameLift FleetIQ track game server
     * availability. This operation is called by a game server process that is running on an instance in a game server
     * group.
     * </p>
     * <p>
     * Use this operation to update the following types of game server information. You can make all three types of
     * updates in the same request:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To update the game server's utilization status from <code>AVAILABLE</code> (when the game server is available to
     * be claimed) to <code>UTILIZED</code> (when the game server is currently hosting games). Identify the game server
     * and game server group and specify the new utilization status. You can't change the status from to
     * <code>UTILIZED</code> to <code>AVAILABLE</code> .
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
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Updates Amazon GameLift FleetIQ-specific properties for a game server group. Many Auto Scaling group properties
     * are updated on the Auto Scaling group directly, including the launch template, Auto Scaling policies, and
     * maximum/minimum/desired instance counts.
     * </p>
     * <p>
     * To update the game server group, specify the game server group ID and provide the updated values. Before applying
     * the updates, the new values are validated to ensure that Amazon GameLift FleetIQ can continue to perform instance
     * balancing activity. If successful, a <code>GameServerGroup</code> object is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <b>This operation is used with the Amazon GameLift FleetIQ solution and game server groups.</b>
     * </p>
     * <p>
     * Updates Amazon GameLift FleetIQ-specific properties for a game server group. Many Auto Scaling group properties
     * are updated on the Auto Scaling group directly, including the launch template, Auto Scaling policies, and
     * maximum/minimum/desired instance counts.
     * </p>
     * <p>
     * To update the game server group, specify the game server group ID and provide the updated values. Before applying
     * the updates, the new values are validated to ensure that Amazon GameLift FleetIQ can continue to perform instance
     * balancing activity. If successful, a <code>GameServerGroup</code> object is returned.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/fleetiqguide/gsg-intro.html">Amazon GameLift FleetIQ
     * Guide</a>
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateGameSessionRequest
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
     * <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html#reference-awssdk-resources-fleets"
     * >All APIs by task</a>
     * </p>
     * 
     * @param updateGameSessionRequest
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
     * 
     * @param updateGameSessionQueueRequest
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
     * 
     * @param updateGameSessionQueueRequest
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
     * 
     * @param updateMatchmakingConfigurationRequest
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
     * 
     * @param updateMatchmakingConfigurationRequest
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
     * Updates the runtime configuration for the specified fleet. The runtime configuration tells Amazon GameLift how to
     * launch server processes on computes in the fleet. For managed EC2 fleets, it determines what server processes to
     * run on each fleet instance. For container fleets, it describes what server processes to run in each replica
     * container group. You can update a fleet's runtime configuration at any time after the fleet is created; it does
     * not need to be in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * To update runtime configuration, specify the fleet ID and provide a <code>RuntimeConfiguration</code> with an
     * updated set of server process configurations.
     * </p>
     * <p>
     * If successful, the fleet's runtime configuration settings are updated. Fleet computes that run game server
     * processes regularly check for and receive updated runtime configurations. The computes immediately take action to
     * comply with the new configuration by launching new server processes or by not replacing existing processes when
     * they shut down. Updating a fleet's runtime configuration never affects existing server processes.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param updateRuntimeConfigurationRequest
     * @return A Java Future containing the result of the UpdateRuntimeConfiguration operation returned by the service.
     * @sample AmazonGameLiftAsync.UpdateRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<UpdateRuntimeConfigurationResult> updateRuntimeConfigurationAsync(
            UpdateRuntimeConfigurationRequest updateRuntimeConfigurationRequest);

    /**
     * <p>
     * Updates the runtime configuration for the specified fleet. The runtime configuration tells Amazon GameLift how to
     * launch server processes on computes in the fleet. For managed EC2 fleets, it determines what server processes to
     * run on each fleet instance. For container fleets, it describes what server processes to run in each replica
     * container group. You can update a fleet's runtime configuration at any time after the fleet is created; it does
     * not need to be in <code>ACTIVE</code> status.
     * </p>
     * <p>
     * To update runtime configuration, specify the fleet ID and provide a <code>RuntimeConfiguration</code> with an
     * updated set of server process configurations.
     * </p>
     * <p>
     * If successful, the fleet's runtime configuration settings are updated. Fleet computes that run game server
     * processes regularly check for and receive updated runtime configurations. The computes immediately take action to
     * comply with the new configuration by launching new server processes or by not replacing existing processes when
     * they shut down. Updating a fleet's runtime configuration never affects existing server processes.
     * </p>
     * <p>
     * <b>Learn more</b>
     * </p>
     * <p>
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-intro.html">Setting up Amazon GameLift
     * fleets</a>
     * </p>
     * 
     * @param updateRuntimeConfigurationRequest
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
     * <a href=
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
     * <a href=
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
     * 
     * @param validateMatchmakingRuleSetRequest
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
     * 
     * @param validateMatchmakingRuleSetRequest
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
