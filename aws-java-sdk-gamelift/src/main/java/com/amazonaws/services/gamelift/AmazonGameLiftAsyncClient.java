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
package com.amazonaws.services.gamelift;

import static java.util.concurrent.Executors.newFixedThreadPool;

import javax.annotation.Generated;

import com.amazonaws.services.gamelift.model.*;
import com.amazonaws.client.AwsAsyncClientParams;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import java.util.concurrent.ExecutorService;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;

/**
 * Client for accessing Amazon GameLift asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
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
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AmazonGameLiftAsyncClient extends AmazonGameLiftClient implements AmazonGameLiftAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift. A credentials provider chain
     * will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonGameLiftAsyncClientBuilder#defaultClient()}
     */
    @Deprecated
    public AmazonGameLiftAsyncClient() {
        this(DefaultAWSCredentialsProviderChain.getInstance());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift. A credentials provider chain
     * will be used that searches for credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2 metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client connects to Amazon GameLift (ex: proxy
     *        settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonGameLiftAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonGameLiftAsyncClient(ClientConfiguration clientConfiguration) {
        this(DefaultAWSCredentialsProviderChain.getInstance(), clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified AWS account
     * credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonGameLiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonGameLiftAsyncClient(AWSCredentials awsCredentials) {
        this(awsCredentials, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified AWS account
     * credentials and executor service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonGameLiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonGameLiftAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonGameLiftAsyncClient(AWSCredentials awsCredentials, ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified AWS account
     * credentials, executor service, and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonGameLiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonGameLiftAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonGameLiftAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonGameLiftAsyncClient(AWSCredentials awsCredentials, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified AWS account
     * credentials provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing 50 threads (to match the default
     * maximum number of concurrent connections to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonGameLiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)}
     */
    @Deprecated
    public AmazonGameLiftAsyncClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the provided AWS account
     * credentials provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing a number of threads equal to the
     * maximum number of concurrent connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     * @deprecated use {@link AmazonGameLiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonGameLiftAsyncClientBuilder#withClientConfiguration(ClientConfiguration)}
     */
    @Deprecated
    public AmazonGameLiftAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified AWS account
     * credentials provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonGameLiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonGameLiftAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonGameLiftAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ExecutorService executorService) {
        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified AWS account
     * credentials provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings, etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be executed.
     * @deprecated use {@link AmazonGameLiftAsyncClientBuilder#withCredentials(AWSCredentialsProvider)} and
     *             {@link AmazonGameLiftAsyncClientBuilder#withClientConfiguration(ClientConfiguration)} and
     *             {@link AmazonGameLiftAsyncClientBuilder#withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)}
     */
    @Deprecated
    public AmazonGameLiftAsyncClient(AWSCredentialsProvider awsCredentialsProvider, ClientConfiguration clientConfiguration, ExecutorService executorService) {
        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    public static AmazonGameLiftAsyncClientBuilder asyncBuilder() {
        return AmazonGameLiftAsyncClientBuilder.standard();
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon GameLift using the specified parameters.
     *
     * @param asyncClientParams
     *        Object providing client parameters.
     */
    AmazonGameLiftAsyncClient(AwsAsyncClientParams asyncClientParams) {
        super(asyncClientParams);
        this.executorService = asyncClientParams.getExecutor();
    }

    /**
     * Returns the executor service used by this client to execute async requests.
     *
     * @return The executor service used by this client to execute async requests.
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<AcceptMatchResult> acceptMatchAsync(AcceptMatchRequest request) {

        return acceptMatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AcceptMatchResult> acceptMatchAsync(final AcceptMatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<AcceptMatchRequest, AcceptMatchResult> asyncHandler) {
        final AcceptMatchRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<AcceptMatchResult>() {
            @Override
            public AcceptMatchResult call() throws Exception {
                AcceptMatchResult result = null;

                try {
                    result = executeAcceptMatch(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAliasResult> createAliasAsync(final CreateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, CreateAliasResult> asyncHandler) {
        final CreateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateAliasResult>() {
            @Override
            public CreateAliasResult call() throws Exception {
                CreateAliasResult result = null;

                try {
                    result = executeCreateAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateBuildResult> createBuildAsync(CreateBuildRequest request) {

        return createBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateBuildResult> createBuildAsync(final CreateBuildRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateBuildRequest, CreateBuildResult> asyncHandler) {
        final CreateBuildRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateBuildResult>() {
            @Override
            public CreateBuildResult call() throws Exception {
                CreateBuildResult result = null;

                try {
                    result = executeCreateBuild(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(CreateFleetRequest request) {

        return createFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFleetResult> createFleetAsync(final CreateFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFleetRequest, CreateFleetResult> asyncHandler) {
        final CreateFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateFleetResult>() {
            @Override
            public CreateFleetResult call() throws Exception {
                CreateFleetResult result = null;

                try {
                    result = executeCreateFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGameSessionResult> createGameSessionAsync(CreateGameSessionRequest request) {

        return createGameSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGameSessionResult> createGameSessionAsync(final CreateGameSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGameSessionRequest, CreateGameSessionResult> asyncHandler) {
        final CreateGameSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGameSessionResult>() {
            @Override
            public CreateGameSessionResult call() throws Exception {
                CreateGameSessionResult result = null;

                try {
                    result = executeCreateGameSession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateGameSessionQueueResult> createGameSessionQueueAsync(CreateGameSessionQueueRequest request) {

        return createGameSessionQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGameSessionQueueResult> createGameSessionQueueAsync(final CreateGameSessionQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGameSessionQueueRequest, CreateGameSessionQueueResult> asyncHandler) {
        final CreateGameSessionQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateGameSessionQueueResult>() {
            @Override
            public CreateGameSessionQueueResult call() throws Exception {
                CreateGameSessionQueueResult result = null;

                try {
                    result = executeCreateGameSessionQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateMatchmakingConfigurationResult> createMatchmakingConfigurationAsync(CreateMatchmakingConfigurationRequest request) {

        return createMatchmakingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMatchmakingConfigurationResult> createMatchmakingConfigurationAsync(
            final CreateMatchmakingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMatchmakingConfigurationRequest, CreateMatchmakingConfigurationResult> asyncHandler) {
        final CreateMatchmakingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMatchmakingConfigurationResult>() {
            @Override
            public CreateMatchmakingConfigurationResult call() throws Exception {
                CreateMatchmakingConfigurationResult result = null;

                try {
                    result = executeCreateMatchmakingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateMatchmakingRuleSetResult> createMatchmakingRuleSetAsync(CreateMatchmakingRuleSetRequest request) {

        return createMatchmakingRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMatchmakingRuleSetResult> createMatchmakingRuleSetAsync(final CreateMatchmakingRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMatchmakingRuleSetRequest, CreateMatchmakingRuleSetResult> asyncHandler) {
        final CreateMatchmakingRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateMatchmakingRuleSetResult>() {
            @Override
            public CreateMatchmakingRuleSetResult call() throws Exception {
                CreateMatchmakingRuleSetResult result = null;

                try {
                    result = executeCreateMatchmakingRuleSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePlayerSessionResult> createPlayerSessionAsync(CreatePlayerSessionRequest request) {

        return createPlayerSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlayerSessionResult> createPlayerSessionAsync(final CreatePlayerSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePlayerSessionRequest, CreatePlayerSessionResult> asyncHandler) {
        final CreatePlayerSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePlayerSessionResult>() {
            @Override
            public CreatePlayerSessionResult call() throws Exception {
                CreatePlayerSessionResult result = null;

                try {
                    result = executeCreatePlayerSession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreatePlayerSessionsResult> createPlayerSessionsAsync(CreatePlayerSessionsRequest request) {

        return createPlayerSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlayerSessionsResult> createPlayerSessionsAsync(final CreatePlayerSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePlayerSessionsRequest, CreatePlayerSessionsResult> asyncHandler) {
        final CreatePlayerSessionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreatePlayerSessionsResult>() {
            @Override
            public CreatePlayerSessionsResult call() throws Exception {
                CreatePlayerSessionsResult result = null;

                try {
                    result = executeCreatePlayerSessions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateVpcPeeringAuthorizationResult> createVpcPeeringAuthorizationAsync(CreateVpcPeeringAuthorizationRequest request) {

        return createVpcPeeringAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcPeeringAuthorizationResult> createVpcPeeringAuthorizationAsync(
            final CreateVpcPeeringAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcPeeringAuthorizationRequest, CreateVpcPeeringAuthorizationResult> asyncHandler) {
        final CreateVpcPeeringAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcPeeringAuthorizationResult>() {
            @Override
            public CreateVpcPeeringAuthorizationResult call() throws Exception {
                CreateVpcPeeringAuthorizationResult result = null;

                try {
                    result = executeCreateVpcPeeringAuthorization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(CreateVpcPeeringConnectionRequest request) {

        return createVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVpcPeeringConnectionResult> createVpcPeeringConnectionAsync(final CreateVpcPeeringConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateVpcPeeringConnectionRequest, CreateVpcPeeringConnectionResult> asyncHandler) {
        final CreateVpcPeeringConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<CreateVpcPeeringConnectionResult>() {
            @Override
            public CreateVpcPeeringConnectionResult call() throws Exception {
                CreateVpcPeeringConnectionResult result = null;

                try {
                    result = executeCreateVpcPeeringConnection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(DeleteAliasRequest request) {

        return deleteAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteAliasResult> deleteAliasAsync(final DeleteAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, DeleteAliasResult> asyncHandler) {
        final DeleteAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteAliasResult>() {
            @Override
            public DeleteAliasResult call() throws Exception {
                DeleteAliasResult result = null;

                try {
                    result = executeDeleteAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteBuildResult> deleteBuildAsync(DeleteBuildRequest request) {

        return deleteBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteBuildResult> deleteBuildAsync(final DeleteBuildRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteBuildRequest, DeleteBuildResult> asyncHandler) {
        final DeleteBuildRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteBuildResult>() {
            @Override
            public DeleteBuildResult call() throws Exception {
                DeleteBuildResult result = null;

                try {
                    result = executeDeleteBuild(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(DeleteFleetRequest request) {

        return deleteFleetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteFleetResult> deleteFleetAsync(final DeleteFleetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFleetRequest, DeleteFleetResult> asyncHandler) {
        final DeleteFleetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteFleetResult>() {
            @Override
            public DeleteFleetResult call() throws Exception {
                DeleteFleetResult result = null;

                try {
                    result = executeDeleteFleet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteGameSessionQueueResult> deleteGameSessionQueueAsync(DeleteGameSessionQueueRequest request) {

        return deleteGameSessionQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteGameSessionQueueResult> deleteGameSessionQueueAsync(final DeleteGameSessionQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteGameSessionQueueRequest, DeleteGameSessionQueueResult> asyncHandler) {
        final DeleteGameSessionQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteGameSessionQueueResult>() {
            @Override
            public DeleteGameSessionQueueResult call() throws Exception {
                DeleteGameSessionQueueResult result = null;

                try {
                    result = executeDeleteGameSessionQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMatchmakingConfigurationResult> deleteMatchmakingConfigurationAsync(DeleteMatchmakingConfigurationRequest request) {

        return deleteMatchmakingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMatchmakingConfigurationResult> deleteMatchmakingConfigurationAsync(
            final DeleteMatchmakingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMatchmakingConfigurationRequest, DeleteMatchmakingConfigurationResult> asyncHandler) {
        final DeleteMatchmakingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMatchmakingConfigurationResult>() {
            @Override
            public DeleteMatchmakingConfigurationResult call() throws Exception {
                DeleteMatchmakingConfigurationResult result = null;

                try {
                    result = executeDeleteMatchmakingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteMatchmakingRuleSetResult> deleteMatchmakingRuleSetAsync(DeleteMatchmakingRuleSetRequest request) {

        return deleteMatchmakingRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteMatchmakingRuleSetResult> deleteMatchmakingRuleSetAsync(final DeleteMatchmakingRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMatchmakingRuleSetRequest, DeleteMatchmakingRuleSetResult> asyncHandler) {
        final DeleteMatchmakingRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteMatchmakingRuleSetResult>() {
            @Override
            public DeleteMatchmakingRuleSetResult call() throws Exception {
                DeleteMatchmakingRuleSetResult result = null;

                try {
                    result = executeDeleteMatchmakingRuleSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(DeleteScalingPolicyRequest request) {

        return deleteScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteScalingPolicyResult> deleteScalingPolicyAsync(final DeleteScalingPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteScalingPolicyRequest, DeleteScalingPolicyResult> asyncHandler) {
        final DeleteScalingPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteScalingPolicyResult>() {
            @Override
            public DeleteScalingPolicyResult call() throws Exception {
                DeleteScalingPolicyResult result = null;

                try {
                    result = executeDeleteScalingPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcPeeringAuthorizationResult> deleteVpcPeeringAuthorizationAsync(DeleteVpcPeeringAuthorizationRequest request) {

        return deleteVpcPeeringAuthorizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcPeeringAuthorizationResult> deleteVpcPeeringAuthorizationAsync(
            final DeleteVpcPeeringAuthorizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpcPeeringAuthorizationRequest, DeleteVpcPeeringAuthorizationResult> asyncHandler) {
        final DeleteVpcPeeringAuthorizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpcPeeringAuthorizationResult>() {
            @Override
            public DeleteVpcPeeringAuthorizationResult call() throws Exception {
                DeleteVpcPeeringAuthorizationResult result = null;

                try {
                    result = executeDeleteVpcPeeringAuthorization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(DeleteVpcPeeringConnectionRequest request) {

        return deleteVpcPeeringConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteVpcPeeringConnectionResult> deleteVpcPeeringConnectionAsync(final DeleteVpcPeeringConnectionRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteVpcPeeringConnectionRequest, DeleteVpcPeeringConnectionResult> asyncHandler) {
        final DeleteVpcPeeringConnectionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DeleteVpcPeeringConnectionResult>() {
            @Override
            public DeleteVpcPeeringConnectionResult call() throws Exception {
                DeleteVpcPeeringConnectionResult result = null;

                try {
                    result = executeDeleteVpcPeeringConnection(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeAliasResult> describeAliasAsync(DescribeAliasRequest request) {

        return describeAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAliasResult> describeAliasAsync(final DescribeAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeAliasRequest, DescribeAliasResult> asyncHandler) {
        final DescribeAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeAliasResult>() {
            @Override
            public DescribeAliasResult call() throws Exception {
                DescribeAliasResult result = null;

                try {
                    result = executeDescribeAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeBuildResult> describeBuildAsync(DescribeBuildRequest request) {

        return describeBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeBuildResult> describeBuildAsync(final DescribeBuildRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeBuildRequest, DescribeBuildResult> asyncHandler) {
        final DescribeBuildRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeBuildResult>() {
            @Override
            public DescribeBuildResult call() throws Exception {
                DescribeBuildResult result = null;

                try {
                    result = executeDescribeBuild(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeEC2InstanceLimitsResult> describeEC2InstanceLimitsAsync(DescribeEC2InstanceLimitsRequest request) {

        return describeEC2InstanceLimitsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEC2InstanceLimitsResult> describeEC2InstanceLimitsAsync(final DescribeEC2InstanceLimitsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeEC2InstanceLimitsRequest, DescribeEC2InstanceLimitsResult> asyncHandler) {
        final DescribeEC2InstanceLimitsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeEC2InstanceLimitsResult>() {
            @Override
            public DescribeEC2InstanceLimitsResult call() throws Exception {
                DescribeEC2InstanceLimitsResult result = null;

                try {
                    result = executeDescribeEC2InstanceLimits(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetAttributesResult> describeFleetAttributesAsync(DescribeFleetAttributesRequest request) {

        return describeFleetAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetAttributesResult> describeFleetAttributesAsync(final DescribeFleetAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetAttributesRequest, DescribeFleetAttributesResult> asyncHandler) {
        final DescribeFleetAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetAttributesResult>() {
            @Override
            public DescribeFleetAttributesResult call() throws Exception {
                DescribeFleetAttributesResult result = null;

                try {
                    result = executeDescribeFleetAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetCapacityResult> describeFleetCapacityAsync(DescribeFleetCapacityRequest request) {

        return describeFleetCapacityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetCapacityResult> describeFleetCapacityAsync(final DescribeFleetCapacityRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetCapacityRequest, DescribeFleetCapacityResult> asyncHandler) {
        final DescribeFleetCapacityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetCapacityResult>() {
            @Override
            public DescribeFleetCapacityResult call() throws Exception {
                DescribeFleetCapacityResult result = null;

                try {
                    result = executeDescribeFleetCapacity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetEventsResult> describeFleetEventsAsync(DescribeFleetEventsRequest request) {

        return describeFleetEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetEventsResult> describeFleetEventsAsync(final DescribeFleetEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetEventsRequest, DescribeFleetEventsResult> asyncHandler) {
        final DescribeFleetEventsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetEventsResult>() {
            @Override
            public DescribeFleetEventsResult call() throws Exception {
                DescribeFleetEventsResult result = null;

                try {
                    result = executeDescribeFleetEvents(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetPortSettingsResult> describeFleetPortSettingsAsync(DescribeFleetPortSettingsRequest request) {

        return describeFleetPortSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetPortSettingsResult> describeFleetPortSettingsAsync(final DescribeFleetPortSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetPortSettingsRequest, DescribeFleetPortSettingsResult> asyncHandler) {
        final DescribeFleetPortSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetPortSettingsResult>() {
            @Override
            public DescribeFleetPortSettingsResult call() throws Exception {
                DescribeFleetPortSettingsResult result = null;

                try {
                    result = executeDescribeFleetPortSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetUtilizationResult> describeFleetUtilizationAsync(DescribeFleetUtilizationRequest request) {

        return describeFleetUtilizationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFleetUtilizationResult> describeFleetUtilizationAsync(final DescribeFleetUtilizationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFleetUtilizationRequest, DescribeFleetUtilizationResult> asyncHandler) {
        final DescribeFleetUtilizationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeFleetUtilizationResult>() {
            @Override
            public DescribeFleetUtilizationResult call() throws Exception {
                DescribeFleetUtilizationResult result = null;

                try {
                    result = executeDescribeFleetUtilization(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeGameSessionDetailsResult> describeGameSessionDetailsAsync(DescribeGameSessionDetailsRequest request) {

        return describeGameSessionDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGameSessionDetailsResult> describeGameSessionDetailsAsync(final DescribeGameSessionDetailsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGameSessionDetailsRequest, DescribeGameSessionDetailsResult> asyncHandler) {
        final DescribeGameSessionDetailsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGameSessionDetailsResult>() {
            @Override
            public DescribeGameSessionDetailsResult call() throws Exception {
                DescribeGameSessionDetailsResult result = null;

                try {
                    result = executeDescribeGameSessionDetails(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeGameSessionPlacementResult> describeGameSessionPlacementAsync(DescribeGameSessionPlacementRequest request) {

        return describeGameSessionPlacementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGameSessionPlacementResult> describeGameSessionPlacementAsync(final DescribeGameSessionPlacementRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGameSessionPlacementRequest, DescribeGameSessionPlacementResult> asyncHandler) {
        final DescribeGameSessionPlacementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGameSessionPlacementResult>() {
            @Override
            public DescribeGameSessionPlacementResult call() throws Exception {
                DescribeGameSessionPlacementResult result = null;

                try {
                    result = executeDescribeGameSessionPlacement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeGameSessionQueuesResult> describeGameSessionQueuesAsync(DescribeGameSessionQueuesRequest request) {

        return describeGameSessionQueuesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGameSessionQueuesResult> describeGameSessionQueuesAsync(final DescribeGameSessionQueuesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGameSessionQueuesRequest, DescribeGameSessionQueuesResult> asyncHandler) {
        final DescribeGameSessionQueuesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGameSessionQueuesResult>() {
            @Override
            public DescribeGameSessionQueuesResult call() throws Exception {
                DescribeGameSessionQueuesResult result = null;

                try {
                    result = executeDescribeGameSessionQueues(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeGameSessionsResult> describeGameSessionsAsync(DescribeGameSessionsRequest request) {

        return describeGameSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeGameSessionsResult> describeGameSessionsAsync(final DescribeGameSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeGameSessionsRequest, DescribeGameSessionsResult> asyncHandler) {
        final DescribeGameSessionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeGameSessionsResult>() {
            @Override
            public DescribeGameSessionsResult call() throws Exception {
                DescribeGameSessionsResult result = null;

                try {
                    result = executeDescribeGameSessions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(DescribeInstancesRequest request) {

        return describeInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeInstancesResult> describeInstancesAsync(final DescribeInstancesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeInstancesRequest, DescribeInstancesResult> asyncHandler) {
        final DescribeInstancesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeInstancesResult>() {
            @Override
            public DescribeInstancesResult call() throws Exception {
                DescribeInstancesResult result = null;

                try {
                    result = executeDescribeInstances(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeMatchmakingResult> describeMatchmakingAsync(DescribeMatchmakingRequest request) {

        return describeMatchmakingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMatchmakingResult> describeMatchmakingAsync(final DescribeMatchmakingRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMatchmakingRequest, DescribeMatchmakingResult> asyncHandler) {
        final DescribeMatchmakingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMatchmakingResult>() {
            @Override
            public DescribeMatchmakingResult call() throws Exception {
                DescribeMatchmakingResult result = null;

                try {
                    result = executeDescribeMatchmaking(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeMatchmakingConfigurationsResult> describeMatchmakingConfigurationsAsync(
            DescribeMatchmakingConfigurationsRequest request) {

        return describeMatchmakingConfigurationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMatchmakingConfigurationsResult> describeMatchmakingConfigurationsAsync(
            final DescribeMatchmakingConfigurationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMatchmakingConfigurationsRequest, DescribeMatchmakingConfigurationsResult> asyncHandler) {
        final DescribeMatchmakingConfigurationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMatchmakingConfigurationsResult>() {
            @Override
            public DescribeMatchmakingConfigurationsResult call() throws Exception {
                DescribeMatchmakingConfigurationsResult result = null;

                try {
                    result = executeDescribeMatchmakingConfigurations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeMatchmakingRuleSetsResult> describeMatchmakingRuleSetsAsync(DescribeMatchmakingRuleSetsRequest request) {

        return describeMatchmakingRuleSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMatchmakingRuleSetsResult> describeMatchmakingRuleSetsAsync(final DescribeMatchmakingRuleSetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMatchmakingRuleSetsRequest, DescribeMatchmakingRuleSetsResult> asyncHandler) {
        final DescribeMatchmakingRuleSetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeMatchmakingRuleSetsResult>() {
            @Override
            public DescribeMatchmakingRuleSetsResult call() throws Exception {
                DescribeMatchmakingRuleSetsResult result = null;

                try {
                    result = executeDescribeMatchmakingRuleSets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribePlayerSessionsResult> describePlayerSessionsAsync(DescribePlayerSessionsRequest request) {

        return describePlayerSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribePlayerSessionsResult> describePlayerSessionsAsync(final DescribePlayerSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribePlayerSessionsRequest, DescribePlayerSessionsResult> asyncHandler) {
        final DescribePlayerSessionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribePlayerSessionsResult>() {
            @Override
            public DescribePlayerSessionsResult call() throws Exception {
                DescribePlayerSessionsResult result = null;

                try {
                    result = executeDescribePlayerSessions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeRuntimeConfigurationResult> describeRuntimeConfigurationAsync(DescribeRuntimeConfigurationRequest request) {

        return describeRuntimeConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRuntimeConfigurationResult> describeRuntimeConfigurationAsync(final DescribeRuntimeConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeRuntimeConfigurationRequest, DescribeRuntimeConfigurationResult> asyncHandler) {
        final DescribeRuntimeConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeRuntimeConfigurationResult>() {
            @Override
            public DescribeRuntimeConfigurationResult call() throws Exception {
                DescribeRuntimeConfigurationResult result = null;

                try {
                    result = executeDescribeRuntimeConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(DescribeScalingPoliciesRequest request) {

        return describeScalingPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeScalingPoliciesResult> describeScalingPoliciesAsync(final DescribeScalingPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeScalingPoliciesRequest, DescribeScalingPoliciesResult> asyncHandler) {
        final DescribeScalingPoliciesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeScalingPoliciesResult>() {
            @Override
            public DescribeScalingPoliciesResult call() throws Exception {
                DescribeScalingPoliciesResult result = null;

                try {
                    result = executeDescribeScalingPolicies(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcPeeringAuthorizationsResult> describeVpcPeeringAuthorizationsAsync(
            DescribeVpcPeeringAuthorizationsRequest request) {

        return describeVpcPeeringAuthorizationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcPeeringAuthorizationsResult> describeVpcPeeringAuthorizationsAsync(
            final DescribeVpcPeeringAuthorizationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcPeeringAuthorizationsRequest, DescribeVpcPeeringAuthorizationsResult> asyncHandler) {
        final DescribeVpcPeeringAuthorizationsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcPeeringAuthorizationsResult>() {
            @Override
            public DescribeVpcPeeringAuthorizationsResult call() throws Exception {
                DescribeVpcPeeringAuthorizationsResult result = null;

                try {
                    result = executeDescribeVpcPeeringAuthorizations(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(DescribeVpcPeeringConnectionsRequest request) {

        return describeVpcPeeringConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeVpcPeeringConnectionsResult> describeVpcPeeringConnectionsAsync(
            final DescribeVpcPeeringConnectionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeVpcPeeringConnectionsRequest, DescribeVpcPeeringConnectionsResult> asyncHandler) {
        final DescribeVpcPeeringConnectionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<DescribeVpcPeeringConnectionsResult>() {
            @Override
            public DescribeVpcPeeringConnectionsResult call() throws Exception {
                DescribeVpcPeeringConnectionsResult result = null;

                try {
                    result = executeDescribeVpcPeeringConnections(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetGameSessionLogUrlResult> getGameSessionLogUrlAsync(GetGameSessionLogUrlRequest request) {

        return getGameSessionLogUrlAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGameSessionLogUrlResult> getGameSessionLogUrlAsync(final GetGameSessionLogUrlRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetGameSessionLogUrlRequest, GetGameSessionLogUrlResult> asyncHandler) {
        final GetGameSessionLogUrlRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetGameSessionLogUrlResult>() {
            @Override
            public GetGameSessionLogUrlResult call() throws Exception {
                GetGameSessionLogUrlResult result = null;

                try {
                    result = executeGetGameSessionLogUrl(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<GetInstanceAccessResult> getInstanceAccessAsync(GetInstanceAccessRequest request) {

        return getInstanceAccessAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceAccessResult> getInstanceAccessAsync(final GetInstanceAccessRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetInstanceAccessRequest, GetInstanceAccessResult> asyncHandler) {
        final GetInstanceAccessRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<GetInstanceAccessResult>() {
            @Override
            public GetInstanceAccessResult call() throws Exception {
                GetInstanceAccessResult result = null;

                try {
                    result = executeGetInstanceAccess(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(ListAliasesRequest request) {

        return listAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(final ListAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {
        final ListAliasesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListAliasesResult>() {
            @Override
            public ListAliasesResult call() throws Exception {
                ListAliasesResult result = null;

                try {
                    result = executeListAliases(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(ListBuildsRequest request) {

        return listBuildsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBuildsResult> listBuildsAsync(final ListBuildsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListBuildsRequest, ListBuildsResult> asyncHandler) {
        final ListBuildsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListBuildsResult>() {
            @Override
            public ListBuildsResult call() throws Exception {
                ListBuildsResult result = null;

                try {
                    result = executeListBuilds(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(ListFleetsRequest request) {

        return listFleetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFleetsResult> listFleetsAsync(final ListFleetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListFleetsRequest, ListFleetsResult> asyncHandler) {
        final ListFleetsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ListFleetsResult>() {
            @Override
            public ListFleetsResult call() throws Exception {
                ListFleetsResult result = null;

                try {
                    result = executeListFleets(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(PutScalingPolicyRequest request) {

        return putScalingPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutScalingPolicyResult> putScalingPolicyAsync(final PutScalingPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutScalingPolicyRequest, PutScalingPolicyResult> asyncHandler) {
        final PutScalingPolicyRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<PutScalingPolicyResult>() {
            @Override
            public PutScalingPolicyResult call() throws Exception {
                PutScalingPolicyResult result = null;

                try {
                    result = executePutScalingPolicy(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<RequestUploadCredentialsResult> requestUploadCredentialsAsync(RequestUploadCredentialsRequest request) {

        return requestUploadCredentialsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RequestUploadCredentialsResult> requestUploadCredentialsAsync(final RequestUploadCredentialsRequest request,
            final com.amazonaws.handlers.AsyncHandler<RequestUploadCredentialsRequest, RequestUploadCredentialsResult> asyncHandler) {
        final RequestUploadCredentialsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<RequestUploadCredentialsResult>() {
            @Override
            public RequestUploadCredentialsResult call() throws Exception {
                RequestUploadCredentialsResult result = null;

                try {
                    result = executeRequestUploadCredentials(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ResolveAliasResult> resolveAliasAsync(ResolveAliasRequest request) {

        return resolveAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ResolveAliasResult> resolveAliasAsync(final ResolveAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<ResolveAliasRequest, ResolveAliasResult> asyncHandler) {
        final ResolveAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ResolveAliasResult>() {
            @Override
            public ResolveAliasResult call() throws Exception {
                ResolveAliasResult result = null;

                try {
                    result = executeResolveAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<SearchGameSessionsResult> searchGameSessionsAsync(SearchGameSessionsRequest request) {

        return searchGameSessionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SearchGameSessionsResult> searchGameSessionsAsync(final SearchGameSessionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<SearchGameSessionsRequest, SearchGameSessionsResult> asyncHandler) {
        final SearchGameSessionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<SearchGameSessionsResult>() {
            @Override
            public SearchGameSessionsResult call() throws Exception {
                SearchGameSessionsResult result = null;

                try {
                    result = executeSearchGameSessions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartFleetActionsResult> startFleetActionsAsync(StartFleetActionsRequest request) {

        return startFleetActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartFleetActionsResult> startFleetActionsAsync(final StartFleetActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartFleetActionsRequest, StartFleetActionsResult> asyncHandler) {
        final StartFleetActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartFleetActionsResult>() {
            @Override
            public StartFleetActionsResult call() throws Exception {
                StartFleetActionsResult result = null;

                try {
                    result = executeStartFleetActions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartGameSessionPlacementResult> startGameSessionPlacementAsync(StartGameSessionPlacementRequest request) {

        return startGameSessionPlacementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartGameSessionPlacementResult> startGameSessionPlacementAsync(final StartGameSessionPlacementRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartGameSessionPlacementRequest, StartGameSessionPlacementResult> asyncHandler) {
        final StartGameSessionPlacementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartGameSessionPlacementResult>() {
            @Override
            public StartGameSessionPlacementResult call() throws Exception {
                StartGameSessionPlacementResult result = null;

                try {
                    result = executeStartGameSessionPlacement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartMatchBackfillResult> startMatchBackfillAsync(StartMatchBackfillRequest request) {

        return startMatchBackfillAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMatchBackfillResult> startMatchBackfillAsync(final StartMatchBackfillRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMatchBackfillRequest, StartMatchBackfillResult> asyncHandler) {
        final StartMatchBackfillRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMatchBackfillResult>() {
            @Override
            public StartMatchBackfillResult call() throws Exception {
                StartMatchBackfillResult result = null;

                try {
                    result = executeStartMatchBackfill(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StartMatchmakingResult> startMatchmakingAsync(StartMatchmakingRequest request) {

        return startMatchmakingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartMatchmakingResult> startMatchmakingAsync(final StartMatchmakingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StartMatchmakingRequest, StartMatchmakingResult> asyncHandler) {
        final StartMatchmakingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StartMatchmakingResult>() {
            @Override
            public StartMatchmakingResult call() throws Exception {
                StartMatchmakingResult result = null;

                try {
                    result = executeStartMatchmaking(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopFleetActionsResult> stopFleetActionsAsync(StopFleetActionsRequest request) {

        return stopFleetActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopFleetActionsResult> stopFleetActionsAsync(final StopFleetActionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopFleetActionsRequest, StopFleetActionsResult> asyncHandler) {
        final StopFleetActionsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopFleetActionsResult>() {
            @Override
            public StopFleetActionsResult call() throws Exception {
                StopFleetActionsResult result = null;

                try {
                    result = executeStopFleetActions(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopGameSessionPlacementResult> stopGameSessionPlacementAsync(StopGameSessionPlacementRequest request) {

        return stopGameSessionPlacementAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopGameSessionPlacementResult> stopGameSessionPlacementAsync(final StopGameSessionPlacementRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopGameSessionPlacementRequest, StopGameSessionPlacementResult> asyncHandler) {
        final StopGameSessionPlacementRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopGameSessionPlacementResult>() {
            @Override
            public StopGameSessionPlacementResult call() throws Exception {
                StopGameSessionPlacementResult result = null;

                try {
                    result = executeStopGameSessionPlacement(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<StopMatchmakingResult> stopMatchmakingAsync(StopMatchmakingRequest request) {

        return stopMatchmakingAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopMatchmakingResult> stopMatchmakingAsync(final StopMatchmakingRequest request,
            final com.amazonaws.handlers.AsyncHandler<StopMatchmakingRequest, StopMatchmakingResult> asyncHandler) {
        final StopMatchmakingRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<StopMatchmakingResult>() {
            @Override
            public StopMatchmakingResult call() throws Exception {
                StopMatchmakingResult result = null;

                try {
                    result = executeStopMatchmaking(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(UpdateAliasRequest request) {

        return updateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateAliasResult> updateAliasAsync(final UpdateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, UpdateAliasResult> asyncHandler) {
        final UpdateAliasRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateAliasResult>() {
            @Override
            public UpdateAliasResult call() throws Exception {
                UpdateAliasResult result = null;

                try {
                    result = executeUpdateAlias(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateBuildResult> updateBuildAsync(UpdateBuildRequest request) {

        return updateBuildAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateBuildResult> updateBuildAsync(final UpdateBuildRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateBuildRequest, UpdateBuildResult> asyncHandler) {
        final UpdateBuildRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateBuildResult>() {
            @Override
            public UpdateBuildResult call() throws Exception {
                UpdateBuildResult result = null;

                try {
                    result = executeUpdateBuild(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetAttributesResult> updateFleetAttributesAsync(UpdateFleetAttributesRequest request) {

        return updateFleetAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetAttributesResult> updateFleetAttributesAsync(final UpdateFleetAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFleetAttributesRequest, UpdateFleetAttributesResult> asyncHandler) {
        final UpdateFleetAttributesRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFleetAttributesResult>() {
            @Override
            public UpdateFleetAttributesResult call() throws Exception {
                UpdateFleetAttributesResult result = null;

                try {
                    result = executeUpdateFleetAttributes(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetCapacityResult> updateFleetCapacityAsync(UpdateFleetCapacityRequest request) {

        return updateFleetCapacityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetCapacityResult> updateFleetCapacityAsync(final UpdateFleetCapacityRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFleetCapacityRequest, UpdateFleetCapacityResult> asyncHandler) {
        final UpdateFleetCapacityRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFleetCapacityResult>() {
            @Override
            public UpdateFleetCapacityResult call() throws Exception {
                UpdateFleetCapacityResult result = null;

                try {
                    result = executeUpdateFleetCapacity(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetPortSettingsResult> updateFleetPortSettingsAsync(UpdateFleetPortSettingsRequest request) {

        return updateFleetPortSettingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateFleetPortSettingsResult> updateFleetPortSettingsAsync(final UpdateFleetPortSettingsRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateFleetPortSettingsRequest, UpdateFleetPortSettingsResult> asyncHandler) {
        final UpdateFleetPortSettingsRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateFleetPortSettingsResult>() {
            @Override
            public UpdateFleetPortSettingsResult call() throws Exception {
                UpdateFleetPortSettingsResult result = null;

                try {
                    result = executeUpdateFleetPortSettings(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGameSessionResult> updateGameSessionAsync(UpdateGameSessionRequest request) {

        return updateGameSessionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGameSessionResult> updateGameSessionAsync(final UpdateGameSessionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGameSessionRequest, UpdateGameSessionResult> asyncHandler) {
        final UpdateGameSessionRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGameSessionResult>() {
            @Override
            public UpdateGameSessionResult call() throws Exception {
                UpdateGameSessionResult result = null;

                try {
                    result = executeUpdateGameSession(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateGameSessionQueueResult> updateGameSessionQueueAsync(UpdateGameSessionQueueRequest request) {

        return updateGameSessionQueueAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateGameSessionQueueResult> updateGameSessionQueueAsync(final UpdateGameSessionQueueRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateGameSessionQueueRequest, UpdateGameSessionQueueResult> asyncHandler) {
        final UpdateGameSessionQueueRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateGameSessionQueueResult>() {
            @Override
            public UpdateGameSessionQueueResult call() throws Exception {
                UpdateGameSessionQueueResult result = null;

                try {
                    result = executeUpdateGameSessionQueue(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateMatchmakingConfigurationResult> updateMatchmakingConfigurationAsync(UpdateMatchmakingConfigurationRequest request) {

        return updateMatchmakingConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateMatchmakingConfigurationResult> updateMatchmakingConfigurationAsync(
            final UpdateMatchmakingConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateMatchmakingConfigurationRequest, UpdateMatchmakingConfigurationResult> asyncHandler) {
        final UpdateMatchmakingConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateMatchmakingConfigurationResult>() {
            @Override
            public UpdateMatchmakingConfigurationResult call() throws Exception {
                UpdateMatchmakingConfigurationResult result = null;

                try {
                    result = executeUpdateMatchmakingConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<UpdateRuntimeConfigurationResult> updateRuntimeConfigurationAsync(UpdateRuntimeConfigurationRequest request) {

        return updateRuntimeConfigurationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateRuntimeConfigurationResult> updateRuntimeConfigurationAsync(final UpdateRuntimeConfigurationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateRuntimeConfigurationRequest, UpdateRuntimeConfigurationResult> asyncHandler) {
        final UpdateRuntimeConfigurationRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<UpdateRuntimeConfigurationResult>() {
            @Override
            public UpdateRuntimeConfigurationResult call() throws Exception {
                UpdateRuntimeConfigurationResult result = null;

                try {
                    result = executeUpdateRuntimeConfiguration(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    @Override
    public java.util.concurrent.Future<ValidateMatchmakingRuleSetResult> validateMatchmakingRuleSetAsync(ValidateMatchmakingRuleSetRequest request) {

        return validateMatchmakingRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ValidateMatchmakingRuleSetResult> validateMatchmakingRuleSetAsync(final ValidateMatchmakingRuleSetRequest request,
            final com.amazonaws.handlers.AsyncHandler<ValidateMatchmakingRuleSetRequest, ValidateMatchmakingRuleSetResult> asyncHandler) {
        final ValidateMatchmakingRuleSetRequest finalRequest = beforeClientExecution(request);

        return executorService.submit(new java.util.concurrent.Callable<ValidateMatchmakingRuleSetResult>() {
            @Override
            public ValidateMatchmakingRuleSetResult call() throws Exception {
                ValidateMatchmakingRuleSetResult result = null;

                try {
                    result = executeValidateMatchmakingRuleSet(finalRequest);
                } catch (Exception ex) {
                    if (asyncHandler != null) {
                        asyncHandler.onError(ex);
                    }
                    throw ex;
                }

                if (asyncHandler != null) {
                    asyncHandler.onSuccess(finalRequest, result);
                }
                return result;
            }
        });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
     * asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by {@code getExecutorService().awaitTermination()} prior to
     * calling this method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
