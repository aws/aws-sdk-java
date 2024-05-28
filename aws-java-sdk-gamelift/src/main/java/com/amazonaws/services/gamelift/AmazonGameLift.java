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
     * endpoints for all AWS services, see: <a href=
     * "https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-choose-endpoint"
     * > https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/java-dg-region-selection.html#region-selection-
     * choose-endpoint</a>
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
     * @return Result of the AcceptMatch operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.AcceptMatch
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/AcceptMatch" target="_top">AWS API
     *      Documentation</a>
     */
    AcceptMatchResult acceptMatch(AcceptMatchRequest acceptMatchRequest);

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
     * @return Result of the ClaimGameServer operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
     * @throws OutOfCapacityException
     *         The specified game server group has no available game servers to fulfill a <code>ClaimGameServer</code>
     *         request. Clients can retry such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ClaimGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ClaimGameServer" target="_top">AWS API
     *      Documentation</a>
     */
    ClaimGameServerResult claimGameServer(ClaimGameServerRequest claimGameServerRequest);

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
     * @return Result of the CreateAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @sample AmazonGameLift.CreateAlias
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateAlias" target="_top">AWS API
     *      Documentation</a>
     */
    CreateAliasResult createAlias(CreateAliasRequest createAliasRequest);

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
     * @return Result of the CreateBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
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
     * @return Result of the CreateContainerGroupDefinition operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.CreateContainerGroupDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateContainerGroupDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    CreateContainerGroupDefinitionResult createContainerGroupDefinition(CreateContainerGroupDefinitionRequest createContainerGroupDefinitionRequest);

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
     * @return Result of the CreateFleet operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws NotReadyException
     *         The operation failed because Amazon GameLift has not yet finished validating this compute. We recommend
     *         attempting 8 to 10 retries over 3 to 5 minutes with <a href=
     *         "http://aws.amazon.com/blogs/https:/aws.amazon.com/blogs/architecture/exponential-backoff-and-jitter/"
     *         >exponential backoffs and jitter</a>.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.CreateFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleet" target="_top">AWS API
     *      Documentation</a>
     */
    CreateFleetResult createFleet(CreateFleetRequest createFleetRequest);

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
     * @return Result of the CreateFleetLocations operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws NotReadyException
     *         The operation failed because Amazon GameLift has not yet finished validating this compute. We recommend
     *         attempting 8 to 10 retries over 3 to 5 minutes with <a href=
     *         "http://aws.amazon.com/blogs/https:/aws.amazon.com/blogs/architecture/exponential-backoff-and-jitter/"
     *         >exponential backoffs and jitter</a>.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @sample AmazonGameLift.CreateFleetLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleetLocations" target="_top">AWS
     *      API Documentation</a>
     */
    CreateFleetLocationsResult createFleetLocations(CreateFleetLocationsRequest createFleetLocationsRequest);

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
     * @return Result of the CreateGameServerGroup operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @sample AmazonGameLift.CreateGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameServerGroup" target="_top">AWS
     *      API Documentation</a>
     */
    CreateGameServerGroupResult createGameServerGroup(CreateGameServerGroupRequest createGameServerGroupRequest);

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
     * @return Result of the CreateGameSession operation returned by the service.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
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
     *         <code>RoutingStrategy</code> associated with it. The message returned in this exception is the message
     *         defined in the routing strategy itself. Such requests should only be retried if the routing strategy for
     *         the specified alias is modified.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws FleetCapacityExceededException
     *         The specified fleet has no available instances to fulfill a <code>CreateGameSession</code> request.
     *         Clients can retry such requests immediately or after a waiting period.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws IdempotentParameterMismatchException
     *         A game session with this custom ID string already exists in this fleet. Resolve this conflict before
     *         retrying this request.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.CreateGameSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSession" target="_top">AWS API
     *      Documentation</a>
     */
    CreateGameSessionResult createGameSession(CreateGameSessionRequest createGameSessionRequest);

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
     * @return Result of the CreateGameSessionQueue operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @sample AmazonGameLift.CreateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    CreateGameSessionQueueResult createGameSessionQueue(CreateGameSessionQueueRequest createGameSessionQueueRequest);

    /**
     * <p>
     * Creates a custom location for use in an Anywhere fleet.
     * </p>
     * 
     * @param createLocationRequest
     * @return Result of the CreateLocation operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.CreateLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateLocation" target="_top">AWS API
     *      Documentation</a>
     */
    CreateLocationResult createLocation(CreateLocationRequest createLocationRequest);

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
     * @return Result of the CreateMatchmakingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @sample AmazonGameLift.CreateMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMatchmakingConfigurationResult createMatchmakingConfiguration(CreateMatchmakingConfigurationRequest createMatchmakingConfigurationRequest);

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
     * @return Result of the CreateMatchmakingRuleSet operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @sample AmazonGameLift.CreateMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    CreateMatchmakingRuleSetResult createMatchmakingRuleSet(CreateMatchmakingRuleSetRequest createMatchmakingRuleSetRequest);

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
     *         <code>RoutingStrategy</code> associated with it. The message returned in this exception is the message
     *         defined in the routing strategy itself. Such requests should only be retried if the routing strategy for
     *         the specified alias is modified.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @sample AmazonGameLift.CreatePlayerSession
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSession" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePlayerSessionResult createPlayerSession(CreatePlayerSessionRequest createPlayerSessionRequest);

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
     *         <code>RoutingStrategy</code> associated with it. The message returned in this exception is the message
     *         defined in the routing strategy itself. Such requests should only be retried if the routing strategy for
     *         the specified alias is modified.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @sample AmazonGameLift.CreatePlayerSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreatePlayerSessions" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePlayerSessionsResult createPlayerSessions(CreatePlayerSessionsRequest createPlayerSessionsRequest);

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
     * @return Result of the CreateScript operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.CreateScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateScript" target="_top">AWS API
     *      Documentation</a>
     */
    CreateScriptResult createScript(CreateScriptRequest createScriptRequest);

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
     * @return Result of the CreateVpcPeeringAuthorization operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.CreateVpcPeeringAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVpcPeeringAuthorizationResult createVpcPeeringAuthorization(CreateVpcPeeringAuthorizationRequest createVpcPeeringAuthorizationRequest);

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
     * @return Result of the CreateVpcPeeringConnection operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.CreateVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateVpcPeeringConnection"
     *      target="_top">AWS API Documentation</a>
     */
    CreateVpcPeeringConnectionResult createVpcPeeringConnection(CreateVpcPeeringConnectionRequest createVpcPeeringConnectionRequest);

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
     * @return Result of the DeleteAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
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
     * @return Result of the DeleteBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
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
     * @return Result of the DeleteContainerGroupDefinition operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DeleteContainerGroupDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteContainerGroupDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteContainerGroupDefinitionResult deleteContainerGroupDefinition(DeleteContainerGroupDefinitionRequest deleteContainerGroupDefinitionRequest);

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
     * @return Result of the DeleteFleet operation returned by the service.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @sample AmazonGameLift.DeleteFleet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteFleet" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteFleetResult deleteFleet(DeleteFleetRequest deleteFleetRequest);

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
     * @return Result of the DeleteFleetLocations operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DeleteFleetLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteFleetLocations" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteFleetLocationsResult deleteFleetLocations(DeleteFleetLocationsRequest deleteFleetLocationsRequest);

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
     * @return Result of the DeleteGameServerGroup operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DeleteGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteGameServerGroup" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteGameServerGroupResult deleteGameServerGroup(DeleteGameServerGroupRequest deleteGameServerGroupRequest);

    /**
     * <p>
     * Deletes a game session queue. Once a queue is successfully deleted, unfulfilled <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StartGameSessionPlacement.html"
     * >StartGameSessionPlacement</a> requests that reference the queue will fail. To delete a queue, specify the queue
     * name.
     * </p>
     * 
     * @param deleteGameSessionQueueRequest
     * @return Result of the DeleteGameSessionQueue operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @sample AmazonGameLift.DeleteGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteGameSessionQueueResult deleteGameSessionQueue(DeleteGameSessionQueueRequest deleteGameSessionQueueRequest);

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
     * @return Result of the DeleteLocation operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DeleteLocation
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteLocation" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteLocationResult deleteLocation(DeleteLocationRequest deleteLocationRequest);

    /**
     * <p>
     * Permanently removes a FlexMatch matchmaking configuration. To delete, specify the configuration name. A
     * matchmaking configuration cannot be deleted if it is being used in any active matchmaking tickets.
     * </p>
     * 
     * @param deleteMatchmakingConfigurationRequest
     * @return Result of the DeleteMatchmakingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @sample AmazonGameLift.DeleteMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMatchmakingConfigurationResult deleteMatchmakingConfiguration(DeleteMatchmakingConfigurationRequest deleteMatchmakingConfigurationRequest);

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
     * @return Result of the DeleteMatchmakingRuleSet operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @sample AmazonGameLift.DeleteMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteMatchmakingRuleSetResult deleteMatchmakingRuleSet(DeleteMatchmakingRuleSetRequest deleteMatchmakingRuleSetRequest);

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
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @sample AmazonGameLift.DeleteScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScalingPolicy" target="_top">AWS
     *      API Documentation</a>
     */
    DeleteScalingPolicyResult deleteScalingPolicy(DeleteScalingPolicyRequest deleteScalingPolicyRequest);

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
     * @return Result of the DeleteScript operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DeleteScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteScript" target="_top">AWS API
     *      Documentation</a>
     */
    DeleteScriptResult deleteScript(DeleteScriptRequest deleteScriptRequest);

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
     * @return Result of the DeleteVpcPeeringAuthorization operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DeleteVpcPeeringAuthorization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteVpcPeeringAuthorization"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVpcPeeringAuthorizationResult deleteVpcPeeringAuthorization(DeleteVpcPeeringAuthorizationRequest deleteVpcPeeringAuthorizationRequest);

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
     * @return Result of the DeleteVpcPeeringConnection operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DeleteVpcPeeringConnection
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeleteVpcPeeringConnection"
     *      target="_top">AWS API Documentation</a>
     */
    DeleteVpcPeeringConnectionResult deleteVpcPeeringConnection(DeleteVpcPeeringConnectionRequest deleteVpcPeeringConnectionRequest);

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
     * @return Result of the DeregisterCompute operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DeregisterCompute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeregisterCompute" target="_top">AWS API
     *      Documentation</a>
     */
    DeregisterComputeResult deregisterCompute(DeregisterComputeRequest deregisterComputeRequest);

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
     * @return Result of the DeregisterGameServer operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DeregisterGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DeregisterGameServer" target="_top">AWS
     *      API Documentation</a>
     */
    DeregisterGameServerResult deregisterGameServer(DeregisterGameServerRequest deregisterGameServerRequest);

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
     * @return Result of the DescribeAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @return Result of the DescribeBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @return Result of the DescribeCompute operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeCompute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeCompute" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeComputeResult describeCompute(DescribeComputeRequest describeComputeRequest);

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
     * @return Result of the DescribeContainerGroupDefinition operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DescribeContainerGroupDefinition
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeContainerGroupDefinition"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeContainerGroupDefinitionResult describeContainerGroupDefinition(DescribeContainerGroupDefinitionRequest describeContainerGroupDefinitionRequest);

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
     * @return Result of the DescribeEC2InstanceLimits operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DescribeEC2InstanceLimits
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeEC2InstanceLimits"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeEC2InstanceLimitsResult describeEC2InstanceLimits(DescribeEC2InstanceLimitsRequest describeEC2InstanceLimitsRequest);

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
     * @return Result of the DescribeFleetAttributes operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @return Result of the DescribeFleetCapacity operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @return Result of the DescribeFleetEvents operation returned by the service.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @return Result of the DescribeFleetLocationAttributes operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DescribeFleetLocationAttributes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetLocationAttributes"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFleetLocationAttributesResult describeFleetLocationAttributes(DescribeFleetLocationAttributesRequest describeFleetLocationAttributesRequest);

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
     * @return Result of the DescribeFleetLocationCapacity operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DescribeFleetLocationCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetLocationCapacity"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFleetLocationCapacityResult describeFleetLocationCapacity(DescribeFleetLocationCapacityRequest describeFleetLocationCapacityRequest);

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
     * @return Result of the DescribeFleetLocationUtilization operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DescribeFleetLocationUtilization
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetLocationUtilization"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFleetLocationUtilizationResult describeFleetLocationUtilization(DescribeFleetLocationUtilizationRequest describeFleetLocationUtilizationRequest);

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
     * @return Result of the DescribeFleetPortSettings operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DescribeFleetPortSettings
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeFleetPortSettings"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeFleetPortSettingsResult describeFleetPortSettings(DescribeFleetPortSettingsRequest describeFleetPortSettingsRequest);

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
     * @return Result of the DescribeFleetUtilization operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @return Result of the DescribeGameServer operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServer" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeGameServerResult describeGameServer(DescribeGameServerRequest describeGameServerRequest);

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
     * @return Result of the DescribeGameServerGroup operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServerGroup"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeGameServerGroupResult describeGameServerGroup(DescribeGameServerGroupRequest describeGameServerGroupRequest);

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
     * @return Result of the DescribeGameServerInstances operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeGameServerInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameServerInstances"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeGameServerInstancesResult describeGameServerInstances(DescribeGameServerInstancesRequest describeGameServerInstancesRequest);

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
     * @return Result of the DescribeGameSessionDetails operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <code>RoutingStrategy</code> associated with it. The message returned in this exception is the message
     *         defined in the routing strategy itself. Such requests should only be retried if the routing strategy for
     *         the specified alias is modified.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DescribeGameSessionDetails
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionDetails"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeGameSessionDetailsResult describeGameSessionDetails(DescribeGameSessionDetailsRequest describeGameSessionDetailsRequest);

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
     * @return Result of the DescribeGameSessionPlacement operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @return Result of the DescribeGameSessionQueues operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.DescribeGameSessionQueues
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessionQueues"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeGameSessionQueuesResult describeGameSessionQueues(DescribeGameSessionQueuesRequest describeGameSessionQueuesRequest);

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
     * @return Result of the DescribeGameSessions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <code>RoutingStrategy</code> associated with it. The message returned in this exception is the message
     *         defined in the routing strategy itself. Such requests should only be retried if the routing strategy for
     *         the specified alias is modified.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DescribeGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeGameSessionsResult describeGameSessions(DescribeGameSessionsRequest describeGameSessionsRequest);

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
     * @return Result of the DescribeInstances operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DescribeInstances
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeInstances" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeInstancesResult describeInstances(DescribeInstancesRequest describeInstancesRequest);

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
     * @return Result of the DescribeMatchmaking operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DescribeMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmaking" target="_top">AWS
     *      API Documentation</a>
     */
    DescribeMatchmakingResult describeMatchmaking(DescribeMatchmakingRequest describeMatchmakingRequest);

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
     * @return Result of the DescribeMatchmakingConfigurations operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DescribeMatchmakingConfigurations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmakingConfigurations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMatchmakingConfigurationsResult describeMatchmakingConfigurations(DescribeMatchmakingConfigurationsRequest describeMatchmakingConfigurationsRequest);

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
     * @return Result of the DescribeMatchmakingRuleSets operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DescribeMatchmakingRuleSets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeMatchmakingRuleSets"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeMatchmakingRuleSetsResult describeMatchmakingRuleSets(DescribeMatchmakingRuleSetsRequest describeMatchmakingRuleSetsRequest);

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
     * @return Result of the DescribePlayerSessions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @return Result of the DescribeRuntimeConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * pages. If successful, set of <code>ScalingPolicy</code> objects is returned for the fleet.
     * </p>
     * <p>
     * A fleet may have all of its scaling policies suspended. This operation does not affect the status of the scaling
     * policies, which remains ACTIVE.
     * </p>
     * 
     * @param describeScalingPoliciesRequest
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
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.DescribeScalingPolicies
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeScalingPolicies"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeScalingPoliciesResult describeScalingPolicies(DescribeScalingPoliciesRequest describeScalingPoliciesRequest);

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
     * @return Result of the DescribeScript operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @sample AmazonGameLift.DescribeScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeScript" target="_top">AWS API
     *      Documentation</a>
     */
    DescribeScriptResult describeScript(DescribeScriptRequest describeScriptRequest);

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
     * @return Result of the DescribeVpcPeeringAuthorizations operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeVpcPeeringAuthorizations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringAuthorizations"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVpcPeeringAuthorizationsResult describeVpcPeeringAuthorizations(DescribeVpcPeeringAuthorizationsRequest describeVpcPeeringAuthorizationsRequest);

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
     * @return Result of the DescribeVpcPeeringConnections operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.DescribeVpcPeeringConnections
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/DescribeVpcPeeringConnections"
     *      target="_top">AWS API Documentation</a>
     */
    DescribeVpcPeeringConnectionsResult describeVpcPeeringConnections(DescribeVpcPeeringConnectionsRequest describeVpcPeeringConnectionsRequest);

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
     * @return Result of the GetComputeAccess operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.GetComputeAccess
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetComputeAccess" target="_top">AWS API
     *      Documentation</a>
     */
    GetComputeAccessResult getComputeAccess(GetComputeAccessRequest getComputeAccessRequest);

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
     * @return Result of the GetComputeAuthToken operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.GetComputeAuthToken
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GetComputeAuthToken" target="_top">AWS
     *      API Documentation</a>
     */
    GetComputeAuthTokenResult getComputeAuthToken(GetComputeAuthTokenRequest getComputeAuthTokenRequest);

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
     * @return Result of the GetGameSessionLogUrl operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @return Result of the GetInstanceAccess operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @return Result of the ListCompute operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ListCompute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListCompute" target="_top">AWS API
     *      Documentation</a>
     */
    ListComputeResult listCompute(ListComputeRequest listComputeRequest);

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
     * @return Result of the ListContainerGroupDefinitions operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.ListContainerGroupDefinitions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListContainerGroupDefinitions"
     *      target="_top">AWS API Documentation</a>
     */
    ListContainerGroupDefinitionsResult listContainerGroupDefinitions(ListContainerGroupDefinitionsRequest listContainerGroupDefinitionsRequest);

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
     * @return Result of the ListFleets operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * Lists a game server groups.
     * </p>
     * 
     * @param listGameServerGroupsRequest
     * @return Result of the ListGameServerGroups operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ListGameServerGroups
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListGameServerGroups" target="_top">AWS
     *      API Documentation</a>
     */
    ListGameServerGroupsResult listGameServerGroups(ListGameServerGroupsRequest listGameServerGroupsRequest);

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
     * @return Result of the ListGameServers operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ListGameServers
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListGameServers" target="_top">AWS API
     *      Documentation</a>
     */
    ListGameServersResult listGameServers(ListGameServersRequest listGameServersRequest);

    /**
     * <p>
     * Lists all custom and Amazon Web Services locations.
     * </p>
     * 
     * @param listLocationsRequest
     * @return Result of the ListLocations operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ListLocations
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListLocations" target="_top">AWS API
     *      Documentation</a>
     */
    ListLocationsResult listLocations(ListLocationsRequest listLocationsRequest);

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
     * @return Result of the ListScripts operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ListScripts
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListScripts" target="_top">AWS API
     *      Documentation</a>
     */
    ListScriptsResult listScripts(ListScriptsRequest listScriptsRequest);

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
     * @return Result of the ListTagsForResource operation returned by the service.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ListTagsForResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ListTagsForResource" target="_top">AWS
     *      API Documentation</a>
     */
    ListTagsForResourceResult listTagsForResource(ListTagsForResourceRequest listTagsForResourceRequest);

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
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @sample AmazonGameLift.PutScalingPolicy
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/PutScalingPolicy" target="_top">AWS API
     *      Documentation</a>
     */
    PutScalingPolicyResult putScalingPolicy(PutScalingPolicyRequest putScalingPolicyRequest);

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
     * @return Result of the RegisterCompute operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotReadyException
     *         The operation failed because Amazon GameLift has not yet finished validating this compute. We recommend
     *         attempting 8 to 10 retries over 3 to 5 minutes with <a href=
     *         "http://aws.amazon.com/blogs/https:/aws.amazon.com/blogs/architecture/exponential-backoff-and-jitter/"
     *         >exponential backoffs and jitter</a>.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @sample AmazonGameLift.RegisterCompute
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RegisterCompute" target="_top">AWS API
     *      Documentation</a>
     */
    RegisterComputeResult registerCompute(RegisterComputeRequest registerComputeRequest);

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
     * @return Result of the RegisterGameServer operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.RegisterGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RegisterGameServer" target="_top">AWS
     *      API Documentation</a>
     */
    RegisterGameServerResult registerGameServer(RegisterGameServerRequest registerGameServerRequest);

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
     * @return Result of the RequestUploadCredentials operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @return Result of the ResolveAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <code>RoutingStrategy</code> associated with it. The message returned in this exception is the message
     *         defined in the routing strategy itself. Such requests should only be retried if the routing strategy for
     *         the specified alias is modified.
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
     * @return Result of the ResumeGameServerGroup operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.ResumeGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ResumeGameServerGroup" target="_top">AWS
     *      API Documentation</a>
     */
    ResumeGameServerGroupResult resumeGameServerGroup(ResumeGameServerGroupRequest resumeGameServerGroupRequest);

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
     * @return Result of the SearchGameSessions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws TerminalRoutingStrategyException
     *         The service is unable to resolve the routing for a particular alias because it has a terminal
     *         <code>RoutingStrategy</code> associated with it. The message returned in this exception is the message
     *         defined in the routing strategy itself. Such requests should only be retried if the routing strategy for
     *         the specified alias is modified.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.SearchGameSessions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/SearchGameSessions" target="_top">AWS
     *      API Documentation</a>
     */
    SearchGameSessionsResult searchGameSessions(SearchGameSessionsRequest searchGameSessionsRequest);

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
     * @return Result of the StartFleetActions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.StartFleetActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartFleetActions" target="_top">AWS API
     *      Documentation</a>
     */
    StartFleetActionsResult startFleetActions(StartFleetActionsRequest startFleetActionsRequest);

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
     * @return Result of the StartGameSessionPlacement operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.StartGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    StartGameSessionPlacementResult startGameSessionPlacement(StartGameSessionPlacementRequest startGameSessionPlacementRequest);

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
     * @return Result of the StartMatchBackfill operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.StartMatchBackfill
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchBackfill" target="_top">AWS
     *      API Documentation</a>
     */
    StartMatchBackfillResult startMatchBackfill(StartMatchBackfillRequest startMatchBackfillRequest);

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
     * @return Result of the StartMatchmaking operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.StartMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StartMatchmaking" target="_top">AWS API
     *      Documentation</a>
     */
    StartMatchmakingResult startMatchmaking(StartMatchmakingRequest startMatchmakingRequest);

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
     * @return Result of the StopFleetActions operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.StopFleetActions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopFleetActions" target="_top">AWS API
     *      Documentation</a>
     */
    StopFleetActionsResult stopFleetActions(StopFleetActionsRequest stopFleetActionsRequest);

    /**
     * <p>
     * Cancels a game session placement that is in <code>PENDING</code> status. To stop a placement, provide the
     * placement ID values. If successful, the placement is moved to <code>CANCELLED</code> status.
     * </p>
     * 
     * @param stopGameSessionPlacementRequest
     * @return Result of the StopGameSessionPlacement operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.StopGameSessionPlacement
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopGameSessionPlacement"
     *      target="_top">AWS API Documentation</a>
     */
    StopGameSessionPlacementResult stopGameSessionPlacement(StopGameSessionPlacementRequest stopGameSessionPlacementRequest);

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
     * @return Result of the StopMatchmaking operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.StopMatchmaking
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/StopMatchmaking" target="_top">AWS API
     *      Documentation</a>
     */
    StopMatchmakingResult stopMatchmaking(StopMatchmakingRequest stopMatchmakingRequest);

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
     * @return Result of the SuspendGameServerGroup operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.SuspendGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/SuspendGameServerGroup"
     *      target="_top">AWS API Documentation</a>
     */
    SuspendGameServerGroupResult suspendGameServerGroup(SuspendGameServerGroupRequest suspendGameServerGroupRequest);

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
     * @return Result of the TagResource operation returned by the service.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.TagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/TagResource" target="_top">AWS API
     *      Documentation</a>
     */
    TagResourceResult tagResource(TagResourceRequest tagResourceRequest);

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
     * @return Result of the UntagResource operation returned by the service.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws TaggingFailedException
     *         The requested tagging operation did not succeed. This may be due to invalid tag format or the maximum tag
     *         limit may have been exceeded. Resolve the issue before retrying.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.UntagResource
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UntagResource" target="_top">AWS API
     *      Documentation</a>
     */
    UntagResourceResult untagResource(UntagResourceRequest untagResourceRequest);

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
     * @return Result of the UpdateAlias operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @return Result of the UpdateBuild operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
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
     * @return Result of the UpdateFleetAttributes operation returned by the service.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
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
     * @return Result of the UpdateFleetCapacity operation returned by the service.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
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
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.UpdateFleetCapacity
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateFleetCapacity" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateFleetCapacityResult updateFleetCapacity(UpdateFleetCapacityRequest updateFleetCapacityRequest);

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
     * @return Result of the UpdateFleetPortSettings operation returned by the service.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
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
     * @return Result of the UpdateGameServer operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.UpdateGameServer
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameServer" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateGameServerResult updateGameServer(UpdateGameServerRequest updateGameServerRequest);

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
     * @return Result of the UpdateGameServerGroup operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.UpdateGameServerGroup
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameServerGroup" target="_top">AWS
     *      API Documentation</a>
     */
    UpdateGameServerGroupResult updateGameServerGroup(UpdateGameServerGroupRequest updateGameServerGroupRequest);

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
     * @return Result of the UpdateGameSession operation returned by the service.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws ConflictException
     *         The requested operation would cause a conflict with the current state of a service resource associated
     *         with the request. Resolve the conflict before retrying this request.</p>
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
     * @return Result of the UpdateGameSessionQueue operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @sample AmazonGameLift.UpdateGameSessionQueue
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateGameSessionQueue"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateGameSessionQueueResult updateGameSessionQueue(UpdateGameSessionQueueRequest updateGameSessionQueueRequest);

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
     * @return Result of the UpdateMatchmakingConfiguration operation returned by the service.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @sample AmazonGameLift.UpdateMatchmakingConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateMatchmakingConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateMatchmakingConfigurationResult updateMatchmakingConfiguration(UpdateMatchmakingConfigurationRequest updateMatchmakingConfigurationRequest);

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
     * @return Result of the UpdateRuntimeConfiguration operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws InvalidFleetStatusException
     *         The requested operation would cause a conflict with the current state of a resource associated with the
     *         request and/or the fleet. Resolve the conflict before retrying.
     * @throws LimitExceededException
     *         The requested operation would cause the resource to exceed the allowed service limit. Resolve the issue
     *         before retrying.
     * @sample AmazonGameLift.UpdateRuntimeConfiguration
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateRuntimeConfiguration"
     *      target="_top">AWS API Documentation</a>
     */
    UpdateRuntimeConfigurationResult updateRuntimeConfiguration(UpdateRuntimeConfigurationRequest updateRuntimeConfigurationRequest);

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
     * @return Result of the UpdateScript operation returned by the service.
     * @throws UnauthorizedException
     *         The client failed authentication. Clients should not retry such requests.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @throws NotFoundException
     *         THe requested resources was not found. The resource was either not created yet or deleted.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @sample AmazonGameLift.UpdateScript
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateScript" target="_top">AWS API
     *      Documentation</a>
     */
    UpdateScriptResult updateScript(UpdateScriptRequest updateScriptRequest);

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
     * @return Result of the ValidateMatchmakingRuleSet operation returned by the service.
     * @throws InternalServiceException
     *         The service encountered an unrecoverable internal failure while processing the request. Clients can retry
     *         such requests immediately or after a waiting period.
     * @throws UnsupportedRegionException
     *         The requested operation is not supported in the Region specified.
     * @throws InvalidRequestException
     *         One or more parameter values in the request are invalid. Correct the invalid parameter values before
     *         retrying.
     * @sample AmazonGameLift.ValidateMatchmakingRuleSet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ValidateMatchmakingRuleSet"
     *      target="_top">AWS API Documentation</a>
     */
    ValidateMatchmakingRuleSetResult validateMatchmakingRuleSet(ValidateMatchmakingRuleSetRequest validateMatchmakingRuleSetRequest);

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
