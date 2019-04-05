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

/**
 * <fullname>Amazon GameLift Service</fullname>
 * <p>
 * Amazon GameLift is a managed service for developers who need a scalable, dedicated server solution for their
 * multiplayer games. Use Amazon GameLift for these tasks: (1) set up computing resources and deploy your game servers,
 * (2) run game sessions and get players into games, (3) automatically scale your resources to meet player demand and
 * manage costs, and (4) track in-depth metrics on game server performance and player usage.
 * </p>
 * <p>
 * The Amazon GameLift service API includes two important function sets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Manage game sessions and player access</b> -- Retrieve information on available game sessions; create new game
 * sessions; send player requests to join a game session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Configure and manage game server resources</b> -- Manage builds, fleets, queues, and aliases; set auto-scaling
 * policies; retrieve logs and metrics.
 * </p>
 * </li>
 * </ul>
 * <p>
 * This reference guide describes the low-level service API for Amazon GameLift. You can use the API functionality with
 * these tools:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The Amazon Web Services software development kit (<a href="http://aws.amazon.com/tools/#sdk">AWS SDK</a>) is
 * available in <a href=
 * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-supported.html#gamelift-supported-clients"
 * >multiple languages</a> including C++ and C#. Use the SDK to access the API programmatically from an application,
 * such as a game client.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <a href="https://docs.aws.amazon.com/cli/latest/userguide/">AWS command-line interface</a> (CLI) tool is
 * primarily useful for handling administrative actions, such as setting up and managing Amazon GameLift settings and
 * resources. You can use the AWS CLI to manage all of your AWS services.
 * </p>
 * </li>
 * <li>
 * <p>
 * The <a href="https://console.aws.amazon.com/gamelift/home">AWS Management Console</a> for Amazon GameLift provides a
 * web interface to manage your Amazon GameLift settings and resources. The console includes a dashboard for tracking
 * key resources, including builds and fleets, and displays usage and performance metrics for your games as customizable
 * graphs.
 * </p>
 * </li>
 * <li>
 * <p>
 * Amazon GameLift Local is a tool for testing your game's integration with Amazon GameLift before deploying it on the
 * service. This tools supports a subset of key API actions, which can be called from either the AWS CLI or
 * programmatically. See <a
 * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/integration-testing-local.html">Testing an
 * Integration</a>.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Learn more</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/"> Developer Guide</a> -- Read about Amazon
 * GameLift features and how to use them.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://gamedev.amazon.com/forums/tutorials">Tutorials</a> -- Get started fast with walkthroughs and sample
 * projects.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://gamedev.amazon.com/blogs/gamedev/">GameDev Blog</a> -- Stay up to date with new features and
 * techniques.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://gamedev.amazon.com/forums/spaces/123/gamelift-discussion.html">GameDev Forums</a> -- Connect with
 * the GameDev community.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://aws.amazon.com/releasenotes/Amazon-GameLift/">Release notes</a> and <a
 * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/doc-history.html">document history</a> -- Stay
 * current with updates to the Amazon GameLift service, SDKs, and documentation.
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
 * <b>Managing Games and Players</b>
 * </p>
 * <p>
 * Use these actions to start new game sessions, find existing game sessions, track game session status and other
 * information, and enable player access to game sessions.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Discover existing game sessions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>SearchGameSessions</a> -- Retrieve all available game sessions or search for game sessions that match a set of
 * criteria.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Start new game sessions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * Start new games with Queues to find the best available hosting resources across multiple regions, minimize player
 * latency, and balance game session activity for efficiency and cost effectiveness.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>StartGameSessionPlacement</a> -- Request a new game session placement and add one or more players to it.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionPlacement</a> -- Get details on a placement request, including status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopGameSessionPlacement</a> -- Cancel a placement request.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <a>CreateGameSession</a> -- Start a new game session on a specific fleet. <i>Available in Amazon GameLift Local.</i>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Match players to game sessions with FlexMatch matchmaking</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>StartMatchmaking</a> -- Request matchmaking for one players or a group who want to play together.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StartMatchBackfill</a> - Request additional player matches to fill empty slots in an existing game session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMatchmaking</a> -- Get details on a matchmaking request, including status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>AcceptMatch</a> -- Register that a player accepts a proposed match, for matches that require player acceptance.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopMatchmaking</a> -- Cancel a matchmaking request.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage game session data</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeGameSessions</a> -- Retrieve metadata for one or more game sessions, including length of time active and
 * current player count. <i>Available in Amazon GameLift Local.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionDetails</a> -- Retrieve metadata and the game session protection setting for one or more game
 * sessions.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateGameSession</a> -- Change game session settings, such as maximum player count and join policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetGameSessionLogUrl</a> -- Get the location of saved logs for a game session.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage player sessions</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePlayerSession</a> -- Send a request for a player to join a game session. <i>Available in Amazon GameLift
 * Local.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreatePlayerSessions</a> -- Send a request for multiple players to join a game session. <i>Available in Amazon
 * GameLift Local.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribePlayerSessions</a> -- Get details on player activity, including status, playing time, and player data.
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
 * When setting up Amazon GameLift resources for your game, you first <a
 * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html">create a game build</a>
 * and upload it to Amazon GameLift. You can then use these actions to configure and manage a fleet of resources to run
 * your game servers, scale capacity to meet player demand, access performance and utilization metrics, and more.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Manage game builds</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateBuild</a> -- Create a new build using files stored in an Amazon S3 bucket. To create a build and upload
 * files from a local path, use the AWS CLI command <code>upload-build</code>.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListBuilds</a> -- Get a list of all builds uploaded to a Amazon GameLift region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeBuild</a> -- Retrieve information associated with a build.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateBuild</a> -- Change build metadata, including build name and version.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBuild</a> -- Remove a build from Amazon GameLift.
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
 * <a>CreateFleet</a> -- Configure and activate a new fleet to run a build's game servers.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListFleets</a> -- Get a list of all fleet IDs in a Amazon GameLift region (all statuses).
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteFleet</a> -- Terminate a fleet that is no longer running game servers or hosting players.
 * </p>
 * </li>
 * <li>
 * <p>
 * View / update fleet configurations.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeFleetAttributes</a> / <a>UpdateFleetAttributes</a> -- View or change a fleet's metadata and settings for
 * game session protection and resource creation limits.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetPortSettings</a> / <a>UpdateFleetPortSettings</a> -- View or change the inbound permissions (IP
 * address and port setting ranges) allowed for a fleet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeRuntimeConfiguration</a> / <a>UpdateRuntimeConfiguration</a> -- View or change what server processes (and
 * how many) to run on each instance in a fleet.
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
 * <a>DescribeEC2InstanceLimits</a> -- Retrieve maximum number of instances allowed for the current AWS account and the
 * current usage level.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetCapacity</a> / <a>UpdateFleetCapacity</a> -- Retrieve the capacity settings and the current number of
 * instances in a fleet; adjust fleet capacity settings to scale up or down.
 * </p>
 * </li>
 * <li>
 * <p>
 * Autoscale -- Manage auto-scaling rules and apply them to a fleet.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutScalingPolicy</a> -- Create a new auto-scaling policy, or update an existing one.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeScalingPolicies</a> -- Retrieve an existing auto-scaling policy.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteScalingPolicy</a> -- Delete an auto-scaling policy and stop it from affecting a fleet's capacity.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StartFleetActions</a> -- Restart a fleet's auto-scaling policies.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopFleetActions</a> -- Suspend a fleet's auto-scaling policies.
 * </p>
 * </li>
 * </ul>
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
 * <a>CreateGameSessionQueue</a> -- Create a queue for processing requests for new game sessions.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionQueues</a> -- Retrieve game session queues defined in a Amazon GameLift region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateGameSessionQueue</a> -- Change the configuration of a game session queue.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteGameSessionQueue</a> -- Remove a game session queue from the region.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage FlexMatch resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateMatchmakingConfiguration</a> -- Create a matchmaking configuration with instructions for building a player
 * group and placing in a new game session.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMatchmakingConfigurations</a> -- Retrieve matchmaking configurations defined a Amazon GameLift region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateMatchmakingConfiguration</a> -- Change settings for matchmaking configuration. queue.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteMatchmakingConfiguration</a> -- Remove a matchmaking configuration from the region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateMatchmakingRuleSet</a> -- Create a set of rules to use when searching for player matches.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeMatchmakingRuleSets</a> -- Retrieve matchmaking rule sets defined in a Amazon GameLift region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ValidateMatchmakingRuleSet</a> -- Verify syntax for a set of matchmaking rules.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteMatchmakingRuleSet</a> -- Remove a matchmaking rule set from the region.
 * </p>
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
 * <a>DescribeFleetUtilization</a> -- Get current data on the number of server processes, game sessions, and players
 * currently active on a fleet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetEvents</a> -- Get a fleet's logged events for a specified time span.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessions</a> -- Retrieve metadata associated with one or more game sessions, including length of time
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
 * <a>DescribeInstances</a> -- Get information on each instance in a fleet, including instance ID, IP address, and
 * status.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>GetInstanceAccess</a> -- Request access credentials needed to remotely connect to a specified instance in a fleet.
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
 * <a>CreateAlias</a> -- Define a new alias and optionally assign it to a fleet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListAliases</a> -- Get all fleet aliases defined in a Amazon GameLift region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAlias</a> -- Retrieve information on an existing alias.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateAlias</a> -- Change settings for a alias, such as redirecting it from one fleet to another.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteAlias</a> -- Remove an alias from the region.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ResolveAlias</a> -- Get the fleet ID that a specified alias points to.
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage VPC peering connections for fleets</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateVpcPeeringAuthorization</a> -- Authorize a peering connection to one of your VPCs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeVpcPeeringAuthorizations</a> -- Retrieve valid peering connection authorizations.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteVpcPeeringAuthorization</a> -- Delete a peering connection authorization.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateVpcPeeringConnection</a> -- Establish a peering connection between the VPC for a Amazon GameLift fleet and
 * one of your VPCs.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeVpcPeeringConnections</a> -- Retrieve information on active or pending VPC peering connections with a
 * Amazon GameLift fleet.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteVpcPeeringConnection</a> -- Delete a VPC peering connection with a Amazon GameLift fleet.
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 */
package com.amazonaws.services.gamelift;

