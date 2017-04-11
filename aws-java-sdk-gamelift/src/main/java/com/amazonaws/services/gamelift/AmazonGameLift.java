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
package com.amazonaws.services.gamelift;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.gamelift.model.*;

/**
 * Interface for accessing Amazon GameLift.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.gamelift.AbstractAmazonGameLift} instead.
 * </p>
 * <p>
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
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonGameLift {

    /**
     * The region metadata service name for computing region endpoints. You can use this value to retrieve metadata
     * (such as supported regions) of the service.
     *
     * @see RegionUtils#getRegionsForService(String)
     */
    String ENDPOINT_PREFIX = "gamelift";

    /**
     * Overrides the default endpoint for this client ("https://gamelift.us-east-1.amazonaws.com"). Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "gamelift.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "https://gamelift.us-east-1.amazonaws.com"). If the protocol is not specified here, the default
     * protocol from this client's {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and a complete list of all available
     * endpoints for all AWS services, see: <a
     * href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when the client is created and before any
     * service requests are made. Changing it afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "gamelift.us-east-1.amazonaws.com") or a full URL, including the protocol (ex:
     *        "https://gamelift.us-east-1.amazonaws.com") of the region specific AWS endpoint this client will
     *        communicate with.
     * @deprecated use {@link AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration)} for
     *             example:
     *             {@code builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));}
     */
    @Deprecated
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonGameLift#setEndpoint(String)}, sets the regional endpoint for this client's
     * service calls. Callers can use this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead, specify it in the
     * {@link ClientConfiguration} supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created and before any service
     * requests are made. Changing it afterwards creates inevitable race conditions for any service requests in transit
     * or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See {@link Region#getRegion(com.amazonaws.regions.Regions)}
     *        for accessing a given region. Must not be null and must be a region where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     * @deprecated use {@link AwsClientBuilder#setRegion(String)}
     */
    @Deprecated
    void setRegion(Region region);

    /**
     * <p>
     * Creates an alias and sets a target fleet. A fleet alias can be used in place of a fleet ID, such as when calling
     * <code>CreateGameSession</code> from a game client or game service or adding destinations to a game session queue.
     * By changing an alias's target fleet, you can switch your players to the new fleet without changing any other
     * component. In production, this feature is particularly useful to redirect your player base seamlessly to the
     * latest game server update.
     * </p>
     * <p>
     * Amazon GameLift supports two types of routing strategies for aliases: simple and terminal. Use a simple alias to
     * point to an active fleet. Use a terminal alias to display a message to incoming traffic instead of routing
     * players to an active fleet. This option is useful when a game server is no longer supported but you want to
     * provide better messaging than a standard 404 error.
     * </p>
     * <p>
     * To create a fleet alias, specify an alias name, routing strategy, and optional description. If successful, a new
     * alias record is returned, including an alias ID, which you can reference when creating a game session. To
     * reassign the alias to another fleet ID, call <a>UpdateAlias</a>.
     * </p>
     * 
     * @param createAliasRequest
     *        Represents the input for a request action.
     * @return Result of the CreateAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @sample AmazonGameLift.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAliasResult createAlias(CreateAliasRequest createAliasRequest);

    /**
     * <p>
     * Creates a new Amazon GameLift build from a set of game server binary files stored in an Amazon Simple Storage
     * Service (Amazon S3) location. When using this API call, you must create a <code>.zip</code> file containing all
     * of the build files and store it in an Amazon S3 bucket under your AWS account. For help on packaging your build
     * files and creating a build, see <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-build-intro.html">Uploading Your Game to
     * Amazon GameLift</a>.
     * </p>
     * <important>
     * <p>
     * Use this API action ONLY if you are storing your game build files in an Amazon S3 bucket in your AWS account. To
     * create a build using files stored in a directory, use the CLI command <a
     * href="http://docs.aws.amazon.com/cli/latest/reference/gamelift/upload-build.html"> <code>upload-build</code>
     * </a>, which uploads the build files from a file location you specify and creates a build.
     * </p>
     * </important>
     * <p>
     * To create a new build using <code>CreateBuild</code>, identify the storage location and operating system of your
     * game build. You also have the option of specifying a build name and version. If successful, this action creates a
     * new build record with an unique build ID and in <code>INITIALIZED</code> status. Use the API call
     * <a>DescribeBuild</a> to check the status of your build. A build must be in <code>READY</code> status before it
     * can be used to create fleets to host your game.
     * </p>
     * 
     * @param createBuildRequest
     *        Represents the input for a request action.
     * @return Result of the CreateBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.CreateBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateBuild" target="_top">AWS API
     *      Documentation</a>
     */
    CreateBuildResult createBuild(CreateBuildRequest createBuildRequest);

    /**
     * <p>
     * Creates a new fleet to run your game servers. A fleet is a set of Amazon Elastic Compute Cloud (Amazon EC2)
     * instances, each of which can run multiple server processes to host game sessions. You configure a fleet to create
     * instances with certain hardware specifications (see <a href="http://aws.amazon.com/ec2/instance-types/">Amazon
     * EC2 Instance Types</a> for more information), and deploy a specified game build to each instance. A newly created
     * fleet passes through several statuses; once it reaches the <code>ACTIVE</code> status, it can begin hosting game
     * sessions.
     * </p>
     * <p>
     * To create a new fleet, provide a fleet name, an EC2 instance type, and a build ID of the game build to deploy.
     * You can also configure the new fleet with the following settings: (1) a runtime configuration describing what
     * server processes to run on each instance in the fleet (required to create fleet), (2) access permissions for
     * inbound traffic, (3) fleet-wide game session protection, and (4) the location of default log files for Amazon
     * GameLift to upload and store.
     * </p>
     * <p>
     * If the CreateFleet call is successful, Amazon GameLift performs the following tasks:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Creates a fleet record and sets the status to <code>NEW</code> (followed by other statuses as the fleet is
     * activated).
     * </p>
     * </li>
     * <li>
     * <p>
     * Sets the fleet's capacity to 1 "desired", which causes Amazon GameLift to start one new EC2 instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * Starts launching server processes on the instance. If the fleet is configured to run multiple server processes
     * per instance, Amazon GameLift staggers each launch by a few seconds.
     * </p>
     * </li>
     * <li>
     * <p>
     * Begins writing events to the fleet event log, which can be accessed in the Amazon GameLift console.
     * </p>
     * </li>
     * <li>
     * <p>
     * Sets the fleet's status to <code>ACTIVE</code> once one server process in the fleet is ready to host a game
     * session.
     * </p>
     * </li>
     * </ul>
     * <p>
     * After a fleet is created, use the following actions to change fleet properties and configuration:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <a>UpdateFleetAttributes</a> -- Update fleet metadata, including name and description.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetCapacity</a> -- Increase or decrease the number of instances you want the fleet to maintain.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateFleetPortSettings</a> -- Change the IP address and port ranges that allow access to incoming traffic.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>UpdateRuntimeConfiguration</a> -- Change how server processes are launched in the fleet, including launch
     * path, launch parameters, and the number of concurrent processes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <a>PutScalingPolicy</a> -- Create or update rules that are used to set the fleet's capacity (autoscaling).
     * </p>
     * </li>
     * </ul>
     * 
     * @param createFleetRequest
     *        Represents the input for a request action.
     * @return Result of the CreateFleet operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest);

    /**
     * <p>
     * Creates a multiplayer game session for players. This action creates a game session record and assigns an
     * available server process in the specified fleet to host the game session. A fleet must have an
     * <code>ACTIVE</code> status before a game session can be created in it.
     * </p>
     * <p>
     * To create a game session, specify either fleet ID or alias ID and indicate a maximum number of players to allow
     * in the game session. You can also provide a name and game-specific properties for this game session. If
     * successful, a <a>GameSession</a> object is returned containing game session properties, including a game session
     * ID with the custom string you provided.
     * </p>
     * <p>
     * <b>Idempotency tokens.</b> You can add a token that uniquely identifies game session requests. This is useful for
     * ensuring that game session requests are idempotent. Multiple requests with the same idempotency token are
     * processed only once; subsequent requests return the original result. All response values are the same with the
     * exception of game session status, which may change.
     * </p>
     * <p>
     * <b>Resource creation limits.</b> If you are creating a game session on a fleet with a resource creation limit
     * policy in force, then you must specify a creator ID. Without this ID, Amazon GameLift has no way to evaluate the
     * policy for this new game session request.
     * </p>
     * <p>
     * By default, newly created game sessions allow new players to join. Use <a>UpdateGameSession</a> to change the
     * game session's player session creation policy.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * 
     * @param createGameSessionRequest
     *        Represents the input for a request action.
     * @return Result of the CreateGameSession operation returned by the service.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws FleetCapacityExceededException
     *         The specified fleet has no available instances to fulfill a <code>CreateGameSession</code> request.
     *         Clients can retry such requests immediately or after a waiting period.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws IdempotentParameterMismatchException
     *         A game session with this custom ID string already exists in this fleet. Resolve this conflict before
     *         retrying this request.
     * @sample AmazonGameLift.CreateGameSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSession" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGameSessionResult createGameSession(CreateGameSessionRequest createGameSessionRequest);

    /**
     * <p>
     * Establishes a new queue for processing requests to place new game sessions. A queue identifies where new game
     * sessions can be hosted -- by specifying a list of destinations (fleets or aliases) -- and how long requests can
     * wait in the queue before timing out. You can set up a queue to try to place game sessions on fleets in multiple
     * regions. To add placement requests to a queue, call <a>StartGameSessionPlacement</a> and reference the queue
     * name.
     * </p>
     * <p>
     * <b>Destination order.</b> When processing a request for a game session, Amazon GameLift tries each destination in
     * order until it finds one with available resources to host the new game session. A queue's default order is
     * determined by how destinations are listed. The default order is overridden when a game session placement request
     * provides player latency information. Player latency information enables Amazon GameLift to prioritize
     * destinations where players report the lowest average latency, as a result placing the new game session where the
     * majority of players will have the best possible gameplay experience.
     * </p>
     * <p>
     * <b>Player latency policies.</b> For placement requests containing player latency information, use player latency
     * policies to protect individual players from very high latencies. With a latency cap, even when a destination can
     * deliver a low latency for most players, the game is not placed where any individual player is reporting latency
     * higher than a policy's maximum. A queue can have multiple latency policies, which are enforced consecutively
     * starting with the policy with the lowest latency cap. Use multiple policies to gradually relax latency controls;
     * for example, you might set a policy with a low latency cap for the first 60 seconds, a second policy with a
     * higher cap for the next 60 seconds, etc.
     * </p>
     * <p>
     * To create a new queue, provide a name, timeout value, a list of destinations and, if desired, a set of latency
     * policies. If successful, a new queue object is returned.
     * </p>
     * 
     * @param createGameSessionQueueRequest
     *        Represents the input for a request action.
     * @return Result of the CreateGameSessionQueue operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.CreateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    CreateGameSessionQueueResult createGameSessionQueue(CreateGameSessionQueueRequest createGameSessionQueueRequest);

    /**
     * <p>
     * Adds a player to a game session and creates a player session record. Before a player can be added, a game session
     * must have an <code>ACTIVE</code> status, have a creation policy of <code>ALLOW_ALL</code>, and have an open
     * player slot. To add a group of players to a game session, use <a>CreatePlayerSessions</a>.
     * </p>
     * <p>
     * To create a player session, specify a game session ID, player ID, and optionally a string of player data. If
     * successful, the player is added to the game session and a new <a>PlayerSession</a> object is returned. Player
     * sessions cannot be updated.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * 
     * @param createPlayerSessionRequest
     *        Represents the input for a request action.
     * @return Result of the CreatePlayerSession operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidGameSessionStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the game instance. Resolve the conflict before retrying.
     * @throws GameSessionFullException
     *         The game instance is currently full and cannot allow the requested player(s) to join. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.CreatePlayerSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSession" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePlayerSessionResult createPlayerSession(CreatePlayerSessionRequest createPlayerSessionRequest);

    /**
     * <p>
     * Adds a group of players to a game session. This action is useful with a team matching feature. Before players can
     * be added, a game session must have an <code>ACTIVE</code> status, have a creation policy of
     * <code>ALLOW_ALL</code>, and have an open player slot. To add a single player to a game session, use
     * <a>CreatePlayerSession</a>.
     * </p>
     * <p>
     * To create player sessions, specify a game session ID, a list of player IDs, and optionally a set of player data
     * strings. If successful, the players are added to the game session and a set of new <a>PlayerSession</a> objects
     * is returned. Player sessions cannot be updated.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * 
     * @param createPlayerSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the CreatePlayerSessions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidGameSessionStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the game instance. Resolve the conflict before retrying.
     * @throws GameSessionFullException
     *         The game instance is currently full and cannot allow the requested player(s) to join. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.CreatePlayerSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSessions" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePlayerSessionsResult createPlayerSessions(CreatePlayerSessionsRequest createPlayerSessionsRequest);

    /**
     * <p>
     * Deletes a fleet alias. This action removes all record of the alias. Game clients attempting to access a server
     * process using the deleted alias receive an error. To delete an alias, specify the alias ID to be deleted.
     * </p>
     * 
     * @param deleteAliasRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DeleteAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteAlias" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteAliasResult deleteAlias(DeleteAliasRequest deleteAliasRequest);

    /**
     * <p>
     * Deletes a build. This action permanently deletes the build record and any uploaded build files.
     * </p>
     * <p>
     * To delete a build, specify its ID. Deleting a build does not affect the status of any active fleets using the
     * build, but you can no longer create new fleets with the deleted build.
     * </p>
     * 
     * @param deleteBuildRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.DeleteBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteBuild" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteBuildResult deleteBuild(DeleteBuildRequest deleteBuildRequest);

    /**
     * <p>
     * Deletes everything related to a fleet. Before deleting a fleet, you must set the fleet's desired capacity to
     * zero. See <a>UpdateFleetCapacity</a>.
     * </p>
     * <p>
     * This action removes the fleet's resources and the fleet record. Once a fleet is deleted, you can no longer use
     * that fleet.
     * </p>
     * 
     * @param deleteFleetRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFleetResult deleteFleet(DeleteFleetRequest deleteFleetRequest);

    /**
     * <p>
     * Deletes a game session queue. This action means that any <a>StartGameSessionPlacement</a> requests that reference
     * this queue will fail. To delete a queue, specify the queue name.
     * </p>
     * 
     * @param deleteGameSessionQueueRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteGameSessionQueue operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DeleteGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteGameSessionQueueResult deleteGameSessionQueue(DeleteGameSessionQueueRequest deleteGameSessionQueueRequest);

    /**
     * <p>
     * Deletes a fleet scaling policy. This action means that the policy is no longer in force and removes all record of
     * it. To delete a scaling policy, specify both the scaling policy name and the fleet ID it is associated with.
     * </p>
     * 
     * @param deleteScalingPolicyRequest
     *        Represents the input for a request action.
     * @return Result of the DeleteScalingPolicy operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.DeleteScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScalingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteScalingPolicyResult deleteScalingPolicy(DeleteScalingPolicyRequest deleteScalingPolicyRequest);

    /**
     * <p>
     * Retrieves properties for a fleet alias. This operation returns all alias metadata and settings. To get just the
     * fleet ID an alias is currently pointing to, use <a>ResolveAlias</a>.
     * </p>
     * <p>
     * To get alias properties, specify the alias ID. If successful, an <a>Alias</a> object is returned.
     * </p>
     * 
     * @param describeAliasRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeAlias" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeAliasResult describeAlias(DescribeAliasRequest describeAliasRequest);

    /**
     * <p>
     * Retrieves properties for a build. To get a build record, specify a build ID. If successful, an object containing
     * the build properties is returned.
     * </p>
     * 
     * @param describeBuildRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeBuild" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeBuildResult describeBuild(DescribeBuildRequest describeBuildRequest);

    /**
     * <p>
     * Retrieves the following information for the specified EC2 instance type:
     * </p>
     * <ul>
     * <li>
     * <p>
     * maximum number of instances allowed per AWS account (service limit)
     * </p>
     * </li>
     * <li>
     * <p>
     * current usage level for the AWS account
     * </p>
     * </li>
     * </ul>
     * <p>
     * Service limits vary depending on region. Available regions for Amazon GameLift can be found in the AWS Management
     * Console for Amazon GameLift (see the drop-down list in the upper right corner).
     * </p>
     * 
     * @param describeEC2InstanceLimitsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeEC2InstanceLimits operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeEC2InstanceLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeEC2InstanceLimits"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEC2InstanceLimitsResult describeEC2InstanceLimits(DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest);

    /**
     * <p>
     * Retrieves fleet properties, including metadata, status, and configuration, for one or more fleets. You can
     * request attributes for all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets,
     * use the pagination parameters to retrieve results as a set of sequential pages. If successful, a
     * <a>FleetAttributes</a> object is returned for each requested fleet ID. When specifying a list of fleet IDs,
     * attribute objects are returned only for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the
     * request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetAttributesRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetAttributes operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFleetAttributesResult describeFleetAttributes(DescribeFleetAttributesRequest describeFleetAttributesRequest);

    /**
     * <p>
     * Retrieves the current status of fleet capacity for one or more fleets. This information includes the number of
     * instances that have been requested for the fleet and the number currently active. You can request capacity for
     * all fleets, or specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination
     * parameters to retrieve results as a set of sequential pages. If successful, a <a>FleetCapacity</a> object is
     * returned for each requested fleet ID. When specifying a list of fleet IDs, attribute objects are returned only
     * for fleets that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the
     * request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetCapacityRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetCapacity operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeFleetCapacityResult describeFleetCapacity(DescribeFleetCapacityRequest describeFleetCapacityRequest);

    /**
     * <p>
     * Retrieves entries from the specified fleet's event log. You can specify a time range to limit the result set. Use
     * the pagination parameters to retrieve results as a set of sequential pages. If successful, a collection of event
     * log entries matching the request are returned.
     * </p>
     * 
     * @param describeFleetEventsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetEvents operation returned by the service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.DescribeFleetEvents
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetEvents" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeFleetEventsResult describeFleetEvents(DescribeFleetEventsRequest describeFleetEventsRequest);

    /**
     * <p>
     * Retrieves the inbound connection permissions for a fleet. Connection permissions include a range of IP addresses
     * and port settings that incoming traffic can use to access server processes in the fleet. To get a fleet's inbound
     * connection permissions, specify a fleet ID. If successful, a collection of <a>IpPermission</a> objects is
     * returned for the requested fleet ID. If the requested fleet has been deleted, the result set is empty.
     * </p>
     * 
     * @param describeFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetPortSettings operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFleetPortSettingsResult describeFleetPortSettings(DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest);

    /**
     * <p>
     * Retrieves utilization statistics for one or more fleets. You can request utilization data for all fleets, or
     * specify a list of one or more fleet IDs. When requesting multiple fleets, use the pagination parameters to
     * retrieve results as a set of sequential pages. If successful, a <a>FleetUtilization</a> object is returned for
     * each requested fleet ID. When specifying a list of fleet IDs, utilization objects are returned only for fleets
     * that currently exist.
     * </p>
     * <note>
     * <p>
     * Some API actions may limit the number of fleet IDs allowed in one request. If a request exceeds this limit, the
     * request fails and the error message includes the maximum allowed.
     * </p>
     * </note>
     * 
     * @param describeFleetUtilizationRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeFleetUtilization operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeFleetUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetUtilization"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFleetUtilizationResult describeFleetUtilization(DescribeFleetUtilizationRequest describeFleetUtilizationRequest);

    /**
     * <p>
     * Retrieves properties, including the protection policy in force, for one or more game sessions. This action can be
     * used in several ways: (1) provide a <code>GameSessionId</code> or <code>GameSessionArn</code> to request details
     * for a specific game session; (2) provide either a <code>FleetId</code> or an <code>AliasId</code> to request
     * properties for all game sessions running on a fleet.
     * </p>
     * <p>
     * To get game session record(s), specify just one of the following: game session ID, fleet ID, or alias ID. You can
     * filter this request by game session status. Use the pagination parameters to retrieve results as a set of
     * sequential pages. If successful, a <a>GameSessionDetail</a> object is returned for each session matching the
     * request.
     * </p>
     * 
     * @param describeGameSessionDetailsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeGameSessionDetails operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @sample AmazonGameLift.DescribeGameSessionDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionDetails"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeGameSessionDetailsResult describeGameSessionDetails(DescribeGameSessionDetailsRequest describeGameSessionDetailsRequest);

    /**
     * <p>
     * Retrieves properties and current status of a game session placement request. To get game session placement
     * details, specify the placement ID. If successful, a <a>GameSessionPlacement</a> object is returned.
     * </p>
     * 
     * @param describeGameSessionPlacementRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeGameSessionPlacement operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeGameSessionPlacementResult describeGameSessionPlacement(DescribeGameSessionPlacementRequest describeGameSessionPlacementRequest);

    /**
     * <p>
     * Retrieves the properties for one or more game session queues. When requesting multiple queues, use the pagination
     * parameters to retrieve results as a set of sequential pages. If successful, a <a>GameSessionQueue</a> object is
     * returned for each requested queue. When specifying a list of queues, objects are returned only for queues that
     * currently exist in the region.
     * </p>
     * 
     * @param describeGameSessionQueuesRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeGameSessionQueues operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeGameSessionQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionQueues"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeGameSessionQueuesResult describeGameSessionQueues(DescribeGameSessionQueuesRequest describeGameSessionQueuesRequest);

    /**
     * <p>
     * Retrieves a set of one or more game sessions. Request a specific game session or request all game sessions on a
     * fleet. Alternatively, use <a>SearchGameSessions</a> to request a set of active game sessions that are filtered by
     * certain criteria. To retrieve protection policy settings for game sessions, use
     * <a>DescribeGameSessionDetails</a>.
     * </p>
     * <p>
     * To get game sessions, specify one of the following: game session ID, fleet ID, or alias ID. You can filter this
     * request by game session status. Use the pagination parameters to retrieve results as a set of sequential pages.
     * If successful, a <a>GameSession</a> object is returned for each game session matching the request.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * 
     * @param describeGameSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeGameSessions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @sample AmazonGameLift.DescribeGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeGameSessionsResult describeGameSessions(DescribeGameSessionsRequest describeGameSessionsRequest);

    /**
     * <p>
     * Retrieves information about a fleet's instances, including instance IDs. Use this action to get details on all
     * instances in the fleet or get details on one specific instance.
     * </p>
     * <p>
     * To get a specific instance, specify fleet ID and instance ID. To get all instances in a fleet, specify a fleet ID
     * only. Use the pagination parameters to retrieve results as a set of sequential pages. If successful, an
     * <a>Instance</a> object is returned for each result.
     * </p>
     * 
     * @param describeInstancesRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeInstances operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest);

    /**
     * <p>
     * Retrieves properties for one or more player sessions. This action can be used in several ways: (1) provide a
     * <code>PlayerSessionId</code> to request properties for a specific player session; (2) provide a
     * <code>GameSessionId</code> to request properties for all player sessions in the specified game session; (3)
     * provide a <code>PlayerId</code> to request properties for all player sessions of a specified player.
     * </p>
     * <p>
     * To get game session record(s), specify only one of the following: a player session ID, a game session ID, or a
     * player ID. You can filter this request by player session status. Use the pagination parameters to retrieve
     * results as a set of sequential pages. If successful, a <a>PlayerSession</a> object is returned for each session
     * matching the request.
     * </p>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * 
     * @param describePlayerSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the DescribePlayerSessions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribePlayerSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribePlayerSessions"
     *      target="_top">AWS API Documentation</a>
     */
    DescribePlayerSessionsResult describePlayerSessions(DescribePlayerSessionsRequest describePlayerSessionsRequest);

    /**
     * <p>
     * Retrieves the current runtime configuration for the specified fleet. The runtime configuration tells Amazon
     * GameLift how to launch server processes on instances in the fleet.
     * </p>
     * 
     * @param describeRuntimeConfigurationRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeRuntimeConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.DescribeRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeRuntimeConfigurationResult describeRuntimeConfiguration(DescribeRuntimeConfigurationRequest describeRuntimeConfigurationRequest);

    /**
     * <p>
     * Retrieves all scaling policies applied to a fleet.
     * </p>
     * <p>
     * To get a fleet's scaling policies, specify the fleet ID. You can filter this request by policy status, such as to
     * retrieve only active scaling policies. Use the pagination parameters to retrieve results as a set of sequential
     * pages. If successful, set of <a>ScalingPolicy</a> objects is returned for the fleet.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
     *        Represents the input for a request action.
     * @return Result of the DescribeScalingPolicies operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.DescribeScalingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeScalingPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeScalingPoliciesResult describeScalingPolicies(DescribeScalingPoliciesRequest describeScalingPoliciesRequest);

    /**
     * <p>
     * Retrieves the location of stored game session logs for a specified game session. When a game session is
     * terminated, Amazon GameLift automatically stores the logs in Amazon S3. Use this URL to download the logs.
     * </p>
     * <note>
     * <p>
     * See the <a href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift">AWS
     * Service Limits</a> page for maximum log file sizes. Log files that exceed this limit are not saved.
     * </p>
     * </note>
     * 
     * @param getGameSessionLogUrlRequest
     *        Represents the input for a request action.
     * @return Result of the GetGameSessionLogUrl operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.GetGameSessionLogUrl
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetGameSessionLogUrl" target="_top">AWS
     *      API Documentation</a>
     */
    GetGameSessionLogUrlResult getGameSessionLogUrl(GetGameSessionLogUrlRequest getGameSessionLogUrlRequest);

    /**
     * <p>
     * Requests remote access to a fleet instance. Remote access is useful for debugging, gathering benchmarking data,
     * or watching activity in real time.
     * </p>
     * <p>
     * Access requires credentials that match the operating system of the instance. For a Windows instance, Amazon
     * GameLift returns a user name and password as strings for use with a Windows Remote Desktop client. For a Linux
     * instance, Amazon GameLift returns a user name and RSA private key, also as strings, for use with an SSH client.
     * The private key must be saved in the proper format to a <code>.pem</code> file before using. If you're making
     * this request using the AWS CLI, saving the secret can be handled as part of the GetInstanceAccess request. (See
     * the example later in this topic). For more information on remote access, see <a
     * href="http://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-remote-access.html">Remotely Accessing an
     * Instance</a>.
     * </p>
     * <p>
     * To request access to a specific instance, specify the IDs of the instance and the fleet it belongs to. If
     * successful, an <a>InstanceAccess</a> object is returned containing the instance's IP address and a set of
     * credentials.
     * </p>
     * 
     * @param getInstanceAccessRequest
     *        Represents the input for a request action.
     * @return Result of the GetInstanceAccess operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.GetInstanceAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetInstanceAccess" target="_top">AWS API
     *      Documentation</a>
     */
    GetInstanceAccessResult getInstanceAccess(GetInstanceAccessRequest getInstanceAccessRequest);

    /**
     * <p>
     * Retrieves a collection of alias records for this AWS account. You can filter the result set by alias name and/or
     * routing strategy type. Use the pagination parameters to retrieve results in sequential pages.
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
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ListAliases
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListAliases" target="_top">AWS API
     *      Documentation</a>
     */
    ListAliasesResult listAliases(ListAliasesRequest listAliasesRequest);

    /**
     * <p>
     * Retrieves build records for all builds associated with the AWS account in use. You can limit results to builds
     * that are in a specific status by using the <code>Status</code> parameter. Use the pagination parameters to
     * retrieve results in a set of sequential pages.
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
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ListBuilds
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListBuilds" target="_top">AWS API
     *      Documentation</a>
     */
    ListBuildsResult listBuilds(ListBuildsRequest listBuildsRequest);

    /**
     * <p>
     * Retrieves a collection of fleet records for this AWS account. You can filter the result set by build ID. Use the
     * pagination parameters to retrieve results in sequential pages.
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
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.ListFleets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListFleets" target="_top">AWS API
     *      Documentation</a>
     */
    ListFleetsResult listFleets(ListFleetsRequest listFleetsRequest);

    /**
     * <p>
     * Creates or updates a scaling policy for a fleet. An active scaling policy prompts Amazon GameLift to track a
     * certain metric for a fleet and automatically change the fleet's capacity in specific circumstances. Each scaling
     * policy contains one rule statement. Fleets can have multiple scaling policies in force simultaneously.
     * </p>
     * <p>
     * A scaling policy rule statement has the following structure:
     * </p>
     * <p>
     * If <code>[MetricName]</code> is <code>[ComparisonOperator]</code> <code>[Threshold]</code> for
     * <code>[EvaluationPeriods]</code> minutes, then <code>[ScalingAdjustmentType]</code> to/by
     * <code>[ScalingAdjustment]</code>.
     * </p>
     * <p>
     * For example, this policy:
     * "If the number of idle instances exceeds 20 for more than 15 minutes, then reduce the fleet capacity by 10 instances"
     * could be implemented as the following rule statement:
     * </p>
     * <p>
     * If [IdleInstances] is [GreaterThanOrEqualToThreshold] [20] for [15] minutes, then [ChangeInCapacity] by [-10].
     * </p>
     * <p>
     * To create or update a scaling policy, specify a unique combination of name and fleet ID, and set the rule values.
     * All parameters for this action are required. If successful, the policy name is returned. Scaling policies cannot
     * be suspended or made inactive. To stop enforcing a scaling policy, call <a>DeleteScalingPolicy</a>.
     * </p>
     * 
     * @param putScalingPolicyRequest
     *        Represents the input for a request action.
     * @return Result of the PutScalingPolicy operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @sample AmazonGameLift.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/PutScalingPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest putScalingPolicyRequest);

    /**
     * <p>
     * <i>This API call is not currently in use. </i> Retrieves a fresh set of upload credentials and the assigned
     * Amazon S3 storage location for a specific build. Valid credentials are required to upload your game build files
     * to Amazon S3.
     * </p>
     * 
     * @param requestUploadCredentialsRequest
     *        Represents the input for a request action.
     * @return Result of the RequestUploadCredentials operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.RequestUploadCredentials
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RequestUploadCredentials"
     *      target="_top">AWS API Documentation</a>
     */
    RequestUploadCredentialsResult requestUploadCredentials(RequestUploadCredentialsRequest requestUploadCredentialsRequest);

    /**
     * <p>
     * Retrieves the fleet ID that a specified alias is currently pointing to.
     * </p>
     * 
     * @param resolveAliasRequest
     *        Represents the input for a request action.
     * @return Result of the ResolveAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ResolveAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ResolveAlias" target="_top">AWS API
     *      Documentation</a>
     */
    ResolveAliasResult resolveAlias(ResolveAliasRequest resolveAliasRequest);

    /**
     * <p>
     * Retrieves a set of game sessions that match a set of search criteria and sorts them in a specified order.
     * Currently a game session search is limited to a single fleet. Search results include only game sessions that are
     * in <code>ACTIVE</code> status. If you need to retrieve game sessions with a status other than active, use
     * <a>DescribeGameSessions</a>. If you need to retrieve the protection policy for each game session, use
     * <a>DescribeGameSessionDetails</a>.
     * </p>
     * <p>
     * You can search or sort by the following game session attributes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>gameSessionId</b> -- Unique identifier for the game session. You can use either a <code>GameSessionId</code>
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
     * <b>maximumSessions</b> -- Maximum number of player sessions allowed for a game session. This value is set when
     * requesting a new game session with <a>CreateGameSession</a> or updating with <a>UpdateGameSession</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>hasAvailablePlayerSessions</b> -- Boolean value indicating whether or not a game session has reached its
     * maximum number of players. When searching with this attribute, the search value must be <code>true</code> or
     * <code>false</code>. It is highly recommended that all search requests include this filter attribute to optimize
     * search performance and return only sessions that players can join.
     * </p>
     * </li>
     * </ul>
     * <p>
     * To search or sort, specify either a fleet ID or an alias ID, and provide a search filter expression, a sort
     * expression, or both. Use the pagination parameters to retrieve results as a set of sequential pages. If
     * successful, a collection of <a>GameSession</a> objects matching the request is returned.
     * </p>
     * <note>
     * <p>
     * Returned values for <code>playerSessionCount</code> and <code>hasAvailablePlayerSessions</code> change quickly as
     * players join sessions and others drop out. Results should be considered a snapshot in time. Be sure to refresh
     * search results often, and handle sessions that fill up before a player can join.
     * </p>
     * </note>
     * <p>
     * <i>Available in Amazon GameLift Local.</i>
     * </p>
     * 
     * @param searchGameSessionsRequest
     *        Represents the input for a request action.
     * @return Result of the SearchGameSessions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <a>RoutingStrategy</a> associated with it. The message returned in this exception is the message defined
     *         in the routing strategy itself. Such requests should only be retried if the routing strategy for the
     *         specified alias is modified.
     * @sample AmazonGameLift.SearchGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/SearchGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    SearchGameSessionsResult searchGameSessions(SearchGameSessionsRequest searchGameSessionsRequest);

    /**
     * <p>
     * Places a request for a new game session in a queue (see <a>CreateGameSessionQueue</a>). When processing a
     * placement request, Amazon GameLift searches for available resources on the queue's destinations, scanning each
     * until it finds resources or the placement request times out. A game session placement request can also request
     * player sessions. When a new game session is successfully created, Amazon GameLift creates a player session for
     * each player included in the request.
     * </p>
     * <p>
     * When placing a game session, by default Amazon GameLift tries each fleet in the order they are listed in the
     * queue configuration. Ideally, a queue's destinations are listed in preference order. Alternatively, when
     * requesting a game session with players, you can also provide latency data for each player in relevant regions.
     * Latency data indicates the performance lag a player experiences when connected to a fleet in the region. Amazon
     * GameLift uses latency data to reorder the list of destinations to place the game session in a region with minimal
     * lag. If latency data is provided for multiple players, Amazon GameLift calculates each region's average lag for
     * all players and reorders to get the best game play across all players.
     * </p>
     * <p>
     * To place a new game session request, specify the queue name and a set of game session properties and settings.
     * Also provide a unique ID (such as a UUID) for the placement. You'll use this ID to track the status of the
     * placement request. Optionally, provide a set of IDs and player data for each player you want to join to the new
     * game session. To optimize game play for the players, also provide latency data for all players. If successful, a
     * new game session placement is created. To track the status of a placement request, call
     * <a>DescribeGameSessionPlacement</a> and check the request's status. If the status is Fulfilled, a new game
     * session has been created and a game session ARN and region are referenced. If the placement request times out,
     * you have the option of resubmitting the request or retrying it with a different queue.
     * </p>
     * 
     * @param startGameSessionPlacementRequest
     *        Represents the input for a request action.
     * @return Result of the StartGameSessionPlacement operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.StartGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    StartGameSessionPlacementResult startGameSessionPlacement(StartGameSessionPlacementRequest startGameSessionPlacementRequest);

    /**
     * <p>
     * Cancels a game session placement that is in Pending status. To stop a placement, provide the placement ID values.
     * If successful, the placement is moved to Cancelled status.
     * </p>
     * 
     * @param stopGameSessionPlacementRequest
     *        Represents the input for a request action.
     * @return Result of the StopGameSessionPlacement operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.StopGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    StopGameSessionPlacementResult stopGameSessionPlacement(StopGameSessionPlacementRequest stopGameSessionPlacementRequest);

    /**
     * <p>
     * Updates properties for a fleet alias. To update properties, specify the alias ID to be updated and provide the
     * information to be changed. To reassign an alias to another fleet, provide an updated routing strategy. If
     * successful, the updated alias record is returned.
     * </p>
     * 
     * @param updateAliasRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.UpdateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateAliasResult updateAlias(UpdateAliasRequest updateAliasRequest);

    /**
     * <p>
     * Updates metadata in a build record, including the build name and version. To update the metadata, specify the
     * build ID to update and provide the new values. If successful, a build object containing the updated metadata is
     * returned.
     * </p>
     * 
     * @param updateBuildRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.UpdateBuild
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateBuild" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateBuildResult updateBuild(UpdateBuildRequest updateBuildRequest);

    /**
     * <p>
     * Updates fleet properties, including name and description, for a fleet. To update metadata, specify the fleet ID
     * and the property values you want to change. If successful, the fleet ID for the updated fleet is returned.
     * </p>
     * 
     * @param updateFleetAttributesRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateFleetAttributes operation returned by the service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.UpdateFleetAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetAttributes" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateFleetAttributesResult updateFleetAttributes(UpdateFleetAttributesRequest updateFleetAttributesRequest);

    /**
     * <p>
     * Updates capacity settings for a fleet. Use this action to specify the number of EC2 instances (hosts) that you
     * want this fleet to contain. Before calling this action, you may want to call <a>DescribeEC2InstanceLimits</a> to
     * get the maximum capacity based on the fleet's EC2 instance type.
     * </p>
     * <p>
     * If you're using autoscaling (see <a>PutScalingPolicy</a>), you may want to specify a minimum and/or maximum
     * capacity. If you don't provide these, autoscaling can set capacity anywhere between zero and the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws_service_limits.html#limits_gamelift">service limits</a>.
     * </p>
     * <p>
     * To update fleet capacity, specify the fleet ID and the number of instances you want the fleet to host. If
     * successful, Amazon GameLift starts or terminates instances so that the fleet's active instance count matches the
     * desired instance count. You can view a fleet's current capacity information by calling
     * <a>DescribeFleetCapacity</a>. If the desired instance count is higher than the instance type's limit, the
     * "Limit Exceeded" exception occurs.
     * </p>
     * 
     * @param updateFleetCapacityRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateFleetCapacity operation returned by the service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.UpdateFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateFleetCapacityResult updateFleetCapacity(UpdateFleetCapacityRequest updateFleetCapacityRequest);

    /**
     * <p>
     * Updates port settings for a fleet. To update settings, specify the fleet ID to be updated and list the
     * permissions you want to update. List the permissions you want to add in
     * <code>InboundPermissionAuthorizations</code>, and permissions you want to remove in
     * <code>InboundPermissionRevocations</code>. Permissions to be removed must match existing fleet permissions. If
     * successful, the fleet ID for the updated fleet is returned.
     * </p>
     * 
     * @param updateFleetPortSettingsRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateFleetPortSettings operation returned by the service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.UpdateFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateFleetPortSettingsResult updateFleetPortSettings(UpdateFleetPortSettingsRequest updateFleetPortSettingsRequest);

    /**
     * <p>
     * Updates game session properties. This includes the session name, maximum player count, protection policy, which
     * controls whether or not an active game session can be terminated during a scale-down event, and the player
     * session creation policy, which controls whether or not new players can join the session. To update a game
     * session, specify the game session ID and the values you want to change. If successful, an updated
     * <a>GameSession</a> object is returned.
     * </p>
     * 
     * @param updateGameSessionRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateGameSession operation returned by the service.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidGameSessionStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the game instance. Resolve the conflict before retrying.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.UpdateGameSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSession" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGameSessionResult updateGameSession(UpdateGameSessionRequest updateGameSessionRequest);

    /**
     * <p>
     * Updates settings for a game session queue, which determines how new game session requests in the queue are
     * processed. To update settings, specify the queue name to be updated and provide the new settings. When updating
     * destinations, provide a complete list of destinations.
     * </p>
     * 
     * @param updateGameSessionQueueRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateGameSessionQueue operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.UpdateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGameSessionQueueResult updateGameSessionQueue(UpdateGameSessionQueueRequest updateGameSessionQueueRequest);

    /**
     * <p>
     * Updates the current runtime configuration for the specified fleet, which tells Amazon GameLift how to launch
     * server processes on instances in the fleet. You can update a fleet's runtime configuration at any time after the
     * fleet is created; it does not need to be in an <code>ACTIVE</code> status.
     * </p>
     * <p>
     * To update runtime configuration, specify the fleet ID and provide a <code>RuntimeConfiguration</code> object with
     * the updated collection of server process configurations.
     * </p>
     * <p>
     * Each instance in a Amazon GameLift fleet checks regularly for an updated runtime configuration and changes how it
     * launches server processes to comply with the latest version. Existing server processes are not affected by the
     * update; they continue to run until they end, while Amazon GameLift simply adds new server processes to fit the
     * current runtime configuration. As a result, the runtime configuration changes are applied gradually as existing
     * processes shut down and new processes are launched in Amazon GameLift's normal process recycling activity.
     * </p>
     * 
     * @param updateRuntimeConfigurationRequest
     *        Represents the input for a request action.
     * @return Result of the UpdateRuntimeConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         A service resource associated with the request could not be found. Clients should not retry such
     *         requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @sample AmazonGameLift.UpdateRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRuntimeConfigurationResult updateRuntimeConfiguration(UpdateRuntimeConfigurationRequest updateRuntimeConfigurationRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request, typically used for debugging issues
     * where a service isn't acting as expected. This data isn't considered part of the result data returned by an
     * operation, so it's available through this separate, diagnostic interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
     * information for an executed request, you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);

}
