/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Welcome to the <i>Amazon GameLift API Reference</i>. Amazon GameLift is a managed Amazon Web Services (AWS) service
 * for developers who need a scalable, server-based solution for multiplayer games. Amazon GameLift provides setup and
 * deployment of game servers, and handles infrastructure scaling and session management.
 * </p>
 * <p>
 * This reference describes the low-level service API for GameLift. You can call this API directly or use the <a
 * href="http://aws.amazon.com/tools/#sdk">AWS SDK</a> for your preferred language. The AWS SDK includes a set of
 * high-level GameLift actions multiplayer game sessions. Alternatively, you can use the <a
 * href="http://aws.amazon.com/cli/">AWS command-line interface</a> (CLI) tool, which includes commands for GameLift.
 * For administrative actions, you can also use the Amazon GameLift console.
 * </p>
 * <p>
 * <b>More Resources</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/gamelift/latest/developerguide/">Amazon GameLift Developer Guide</a>: Learn more
 * about GameLift features and how to use them
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://gamedev.amazon.com/forums/tutorials">Lumberyard and GameLift Tutorials</a>: Get started fast with
 * walkthroughs and sample projects
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://aws.amazon.com/blogs/gamedev/">GameDev Blog</a>: Stay up to date with new features and techniques
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="https://gamedev.amazon.com/forums/spaces/123/gamelift-discussion.html">GameDev Forums</a>: Connect with the
 * GameDev community
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Manage Games and Players Through GameLift</b>
 * </p>
 * <p>
 * Call these actions from your game clients and/or services to create and manage multiplayer game sessions and player
 * sessions.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Game sessions:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateGameSession</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeGameSessionDetails</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateGameSession</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>SearchGameSessions</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Player sessions:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreatePlayerSession</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreatePlayerSessions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribePlayerSessions</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Other actions:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>GetGameSessionLogUrl</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * <b>Set Up and Manage Game Servers</b>
 * </p>
 * <p>
 * Use these administrative actions to configure GameLift to host your game servers. When setting up GameLift, you will
 * need to (1) configure a build for your game and upload build files, and (2) set up one or more fleets to host game
 * sessions. Once you've created and activated a fleet, you can assign aliases to it, scale capacity, track performance
 * and utilization, etc.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Game builds:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListBuilds</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateBuild</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeBuild</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateBuild</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteBuild</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>RequestUploadCredentials</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Fleets:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListFleets</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateFleet</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * Describe fleets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>DescribeFleetAttributes</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetCapacity</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetPortSettings</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetUtilization</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeEC2InstanceLimits</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeFleetEvents</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeRuntimeConfiguration</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * Update fleets:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>UpdateFleetAttributes</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateFleetCapacity</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateFleetPortSettings</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateRuntimeConfiguration</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <a>DeleteFleet</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage fleet aliases:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>ListAliases</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>CreateAlias</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeAlias</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>UpdateAlias</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteAlias</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ResolveAlias</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * <li>
 * <p>
 * <b>Manage autoscaling:</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>PutScalingPolicy</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DescribeScalingPolicies</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteScalingPolicy</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <p>
 * To view changes to the API, see the GameLift <a
 * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/doc-history.html">Document History</a> page.
 * </p>
 */
package com.amazonaws.services.gamelift;

