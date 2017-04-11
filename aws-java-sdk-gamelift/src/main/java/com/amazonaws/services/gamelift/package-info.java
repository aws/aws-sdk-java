/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <fullname>Amazon GameLift Service</fullname>
 * <p>
 * Amazon GameLift is a managed service for developers who need a scalable, dedicated server solution for their
 * multiplayer games. Amazon GameLift provides tools to acquire computing resources and deploy game servers, scale game
 * server capacity to meet player demand, and track in-depth metrics on player usage and server performance.
 * </p>
 * <p>
 * The Amazon GameLift service API includes important features:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Find game sessions and match players to games – Retrieve information on available game sessions; create new game
 * sessions; send player requests to join a game session.
 * </p>
 * </li>
 * <li>
 * <p>
 * Configure and manage game server resources – Manage builds, fleets, queues, and aliases; set autoscaling policies;
 * retrieve logs and metrics.
 * </p>
 * </li>
 * </ul>
 * <p>
 * This reference guide describes the low-level service API for Amazon GameLift. We recommend using either the Amazon
 * Web Services software development kit (<a href="http://aws.amazon.com/tools/#sdk">AWS SDK</a>), available in multiple
 * languages, or the <a href="http://aws.amazon.com/cli/">AWS command-line interface</a> (CLI) tool. Both of these align
 * with the low-level service API. In addition, you can use the <a
 * href="https://console.aws.amazon.com/gamelift/home">AWS Management Console</a> for Amazon GameLift for many
 * administrative actions.
 * </p>
 * <p>
 * You can use some API actions with Amazon GameLift Local, a testing tool that lets you test your game integration
 * locally before deploying on Amazon GameLift. You can call these APIs from the AWS CLI or programmatically; API calls
 * to Amazon GameLift Local servers perform exactly as they do when calling Amazon GameLift web servers. For more
 * information on using Amazon GameLift Local, see <a
 * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/integration-testing-local.html">Testing an
 * Integration</a>.
 * </p>
 * <p>
 * <b>MORE RESOURCES</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/">Amazon GameLift Developer Guide</a> – Learn more
 * about Amazon GameLift features and how to use them.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://gamedev.amazon.com/forums/tutorials">Lumberyard and Amazon GameLift Tutorials</a> – Get started fast
 * with walkthroughs and sample projects.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/blogs/gamedev/">GameDev Blog</a> – Stay up to date with new features and techniques.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://gamedev.amazon.com/forums/spaces/123/gamelift-discussion.html">GameDev Forums</a> – Connect with the
 * GameDev community.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/doc-history.html">Amazon GameLift Document
 * History</a> – See changes to the Amazon GameLift service, SDKs, and documentation, as well as links to release notes.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>API SUMMARY</b>
 * </p>
 * <p>
 * This list offers a functional overview of the Amazon GameLift service API.
 * </p>
 * <p>
 * <b>Finding Games and Joining Players</b>
 * </p>
 * <p>
 * You can enable players to connect to game servers on Amazon GameLift from a game client or through a game service
 * (such as a matchmaking service). You can use these operations to discover actively running game or start new games.
 * You can also match players to games, either singly or as a group.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Discover existing game sessions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>SearchGameSessions</a> – Get all available game sessions or search for game sessions that match a set of criteria.
 * <i>Available in Amazon GameLift Local.</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Start a new game session</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Game session placement – Use a queue to process new game session requests and create game sessions on fleets
 * designated for the queue.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>StartGameSessionPlacement</a> – Request a new game session placement and add one or more players to it.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionPlacement</a> – Get details on a placement request, including status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopGameSessionPlacement</a> – Cancel a placement request.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <a>CreateGameSession</a> – Start a new game session on a specific fleet. <i>Available in Amazon GameLift Local.</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage game session objects</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeGameSessions</a> – Retrieve metadata for one or more game sessions, including length of time active and
 * current player count. <i>Available in Amazon GameLift Local.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionDetails</a> – Retrieve metadata and the game session protection setting for one or more game
 * sessions.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateGameSession</a> – Change game session settings, such as maximum player count and join policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetGameSessionLogUrl</a> – Get the location of saved logs for a game session.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage player sessions objects</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePlayerSession</a> – Send a request for a player to join a game session. <i>Available in Amazon GameLift
 * Local.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreatePlayerSessions</a> – Send a request for multiple players to join a game session. <i>Available in Amazon
 * GameLift Local.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribePlayerSessions</a> – Get details on player activity, including status, playing time, and player data.
 * <i>Available in Amazon GameLift Local.</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * <b>Setting Up and Managing Game Servers</b>
 * </p>
 * <p>
 * When setting up Amazon GameLift, first create a game build and upload the files to Amazon GameLift. Then use these
 * operations to set up a fleet of resources to run your game servers. Manage games to scale capacity, adjust
 * configuration settings, access raw utilization data, and more.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Manage game builds</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateBuild</a> – Create a new build by uploading files stored in an Amazon S3 bucket. (To create a build stored
 * at a local file location, use the AWS CLI command <code>upload-build</code>.)
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListBuilds</a> – Get a list of all builds uploaded to a Amazon GameLift region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeBuild</a> – Retrieve information associated with a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateBuild</a> – Change build metadata, including build name and version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBuild</a> – Remove a build from Amazon GameLift.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage fleets</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateFleet</a> – Configure and activate a new fleet to run a build's game servers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteFleet</a> – Terminate a fleet that is no longer running game servers or hosting players.
 * </p>
 * </li>
 * <li>
 * <p>
 * View / update fleet configurations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListFleets</a> – Get a list of all fleet IDs in a Amazon GameLift region (all statuses).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetAttributes</a> / <a>UpdateFleetAttributes</a> – View or change a fleet's metadata and settings for
 * game session protection and resource creation limits.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetPortSettings</a> / <a>UpdateFleetPortSettings</a> – View or change the inbound permissions (IP
 * address and port setting ranges) allowed for a fleet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeRuntimeConfiguration</a> / <a>UpdateRuntimeConfiguration</a> – View or change what server processes (and
 * how many) to run on each instance in a fleet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeInstances</a> – Get information on each instance in a fleet, including instance ID, IP address, and
 * status.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Control fleet capacity</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeEC2InstanceLimits</a> – Retrieve maximum number of instances allowed for the current AWS account and the
 * current usage level.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetCapacity</a> / <a>UpdateFleetCapacity</a> – Retrieve the capacity settings and the current number of
 * instances in a fleet; adjust fleet capacity settings to scale up or down.
 * </p>
 * </li>
 * <li>
 * <p>
 * Autoscale – Manage autoscaling rules and apply them to a fleet.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutScalingPolicy</a> – Create a new autoscaling policy, or update an existing one.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeScalingPolicies</a> – Retrieve an existing autoscaling policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteScalingPolicy</a> – Delete an autoscaling policy and stop it from affecting a fleet's capacity.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Access fleet activity statistics</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeFleetUtilization</a> – Get current data on the number of server processes, game sessions, and players
 * currently active on a fleet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetEvents</a> – Get a fleet's logged events for a specified time span.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessions</a> – Retrieve metadata associated with one or more game sessions, including length of time
 * active and current player count.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Remotely access an instance</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetInstanceAccess</a> – Request access credentials needed to remotely connect to a specified instance in a fleet.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage fleet aliases</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateAlias</a> – Define a new alias and optionally assign it to a fleet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListAliases</a> – Get all fleet aliases defined in a Amazon GameLift region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAlias</a> – Retrieve information on an existing alias.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateAlias</a> – Change settings for a alias, such as redirecting it from one fleet to another.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteAlias</a> – Remove an alias from the region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ResolveAlias</a> – Get the fleet ID that a specified alias points to.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage game session queues</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateGameSessionQueue</a> – Create a queue for processing requests for new game sessions.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionQueues</a> – Get data on all game session queues defined in a Amazon GameLift region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateGameSessionQueue</a> – Change the configuration of a game session queue.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteGameSessionQueue</a> – Remove a game session queue from the region.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 */
package com.amazonaws.services.gamelift;

