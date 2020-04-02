/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Amazon GameLift provides a range of multiplayer game hosting solutions. As a fully managed service, GameLift helps
 * you:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Set up EC2-based computing resources and use GameLift FleetIQ to and deploy your game servers on low-cost, reliable
 * Spot instances.
 * </p>
 * </li>
 * <li>
 * <p>
 * Track game server availability and route players into game sessions to minimize latency.
 * </p>
 * </li>
 * <li>
 * <p>
 * Automatically scale your resources to meet player demand and manage costs
 * </p>
 * </li>
 * <li>
 * <p>
 * Optionally add FlexMatch matchmaking.
 * </p>
 * </li>
 * </ul>
 * <p>
 * With GameLift as a managed service, you have the option to deploy your custom game server or use Amazon GameLift
 * Realtime Servers to quickly stand up lightweight game servers for your game. Realtime Servers provides an efficient
 * game server framework with core Amazon GameLift infrastructure already built in.
 * </p>
 * <p>
 * <b>Now in Public Preview:</b>
 * </p>
 * <p>
 * Use GameLift FleetIQ as a standalone feature with EC2 instances and Auto Scaling groups. GameLift FleetIQ provides
 * optimizations that make low-cost Spot instances viable for game hosting. This extension of GameLift FleetIQ gives you
 * access to these optimizations while managing your EC2 instances and Auto Scaling groups within your own AWS account.
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

