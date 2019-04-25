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
 * When setting up hosting resources, you can deploy your custom game server or use the Amazon GameLift Realtime
 * Servers. Realtime Servers gives you the ability to quickly stand up lightweight, efficient game servers with the core
 * Amazon GameLift infrastructure already built in.
 * </p>
 * <p>
 * <b>Get Amazon GameLift Tools and Resources</b>
 * </p>
 * <p>
 * This reference guide describes the low-level service API for Amazon GameLift and provides links to language-specific
 * SDK reference topics. See also <a
 * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-components.html"> Amazon GameLift Tools and
 * Resources</a>.
 * </p>
 * <p>
 * <b>API Summary</b>
 * </p>
 * <p>
 * The Amazon GameLift service API includes two key sets of actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Manage game sessions and player access -- Integrate this functionality into game client services in order to create
 * new game sessions, retrieve information on existing game sessions; reserve a player slot in a game session, request
 * matchmaking, etc.
 * </p>
 * </li>
 * <li>
 * <p>
 * Configure and manage game server resources -- Manage your Amazon GameLift hosting resources, including builds,
 * scripts, fleets, queues, and aliases. Set up matchmakers, configure auto-scaling, retrieve game logs, and get hosting
 * and game metrics.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b> <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-awssdk.html"> Task-based list of
 * API actions</a> </b>
 * </p>
 */
package com.amazonaws.services.gamelift;

