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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration for a game session placement mechanism that processes requests for new game sessions. A queue can be
 * used on its own or as part of a matchmaking solution.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>CreateGameSessionQueue</a> | <a>DescribeGameSessionQueues</a> | <a>UpdateGameSessionQueue</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/GameSessionQueue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GameSessionQueue implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A descriptive label that is associated with game session queue. Queue names must be unique within each Region.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift game session queue resource and uniquely identifies it. ARNs are unique across all
     * Regions. Format is <code>arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;</code>. In a
     * GameLift game session queue ARN, the resource ID matches the <i>Name</i> value.
     * </p>
     */
    private String gameSessionQueueArn;
    /**
     * <p>
     * The maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     * exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * </p>
     */
    private Integer timeoutInSeconds;
    /**
     * <p>
     * A set of policies that act as a sliding cap on player latency. FleetIQ works to deliver low latency for most
     * players in a game session. These policies ensure that no individual player can be placed into a game with
     * unreasonably high latency. Use multiple policies to gradually relax latency requirements a step at a time.
     * Multiple policies are applied based on their maximum allowed latency, starting with the lowest value.
     * </p>
     */
    private java.util.List<PlayerLatencyPolicy> playerLatencyPolicies;
    /**
     * <p>
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement requests in the queue.
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in order of placement
     * preference.
     * </p>
     */
    private java.util.List<GameSessionQueueDestination> destinations;
    /**
     * <p>
     * A list of locations where a queue is allowed to place new game sessions. Locations are specified in the form of
     * AWS Region codes, such as <code>us-west-2</code>. If this parameter is not set, game sessions can be placed in
     * any queue location.
     * </p>
     */
    private FilterConfiguration filterConfiguration;
    /**
     * <p>
     * Custom settings to use when prioritizing destinations and locations for game session placements. This
     * configuration replaces the FleetIQ default prioritization process. Priority types that are not explicitly named
     * will be automatically applied at the end of the prioritization process.
     * </p>
     */
    private PriorityConfiguration priorityConfiguration;
    /**
     * <p>
     * Information that is added to all events that are related to this game session queue.
     * </p>
     */
    private String customEventData;
    /**
     * <p>
     * An SNS topic ARN that is set up to receive game session placement notifications. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html"> Setting up
     * notifications for game session placement</a>.
     * </p>
     */
    private String notificationTarget;

    /**
     * <p>
     * A descriptive label that is associated with game session queue. Queue names must be unique within each Region.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with game session queue. Queue names must be unique within each
     *        Region.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive label that is associated with game session queue. Queue names must be unique within each Region.
     * </p>
     * 
     * @return A descriptive label that is associated with game session queue. Queue names must be unique within each
     *         Region.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive label that is associated with game session queue. Queue names must be unique within each Region.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with game session queue. Queue names must be unique within each
     *        Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueue withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift game session queue resource and uniquely identifies it. ARNs are unique across all
     * Regions. Format is <code>arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;</code>. In a
     * GameLift game session queue ARN, the resource ID matches the <i>Name</i> value.
     * </p>
     * 
     * @param gameSessionQueueArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift game session queue resource and uniquely identifies it. ARNs are unique across all Regions.
     *        Format is <code>arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;</code>. In a GameLift
     *        game session queue ARN, the resource ID matches the <i>Name</i> value.
     */

    public void setGameSessionQueueArn(String gameSessionQueueArn) {
        this.gameSessionQueueArn = gameSessionQueueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift game session queue resource and uniquely identifies it. ARNs are unique across all
     * Regions. Format is <code>arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;</code>. In a
     * GameLift game session queue ARN, the resource ID matches the <i>Name</i> value.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *         GameLift game session queue resource and uniquely identifies it. ARNs are unique across all Regions.
     *         Format is <code>arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;</code>. In a
     *         GameLift game session queue ARN, the resource ID matches the <i>Name</i> value.
     */

    public String getGameSessionQueueArn() {
        return this.gameSessionQueueArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift game session queue resource and uniquely identifies it. ARNs are unique across all
     * Regions. Format is <code>arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;</code>. In a
     * GameLift game session queue ARN, the resource ID matches the <i>Name</i> value.
     * </p>
     * 
     * @param gameSessionQueueArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift game session queue resource and uniquely identifies it. ARNs are unique across all Regions.
     *        Format is <code>arn:aws:gamelift:&lt;region&gt;::gamesessionqueue/&lt;queue name&gt;</code>. In a GameLift
     *        game session queue ARN, the resource ID matches the <i>Name</i> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueue withGameSessionQueueArn(String gameSessionQueueArn) {
        setGameSessionQueueArn(gameSessionQueueArn);
        return this;
    }

    /**
     * <p>
     * The maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     * exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The maximum time, in seconds, that a new game session placement request remains in the queue. When a
     *        request exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     */

    public void setTimeoutInSeconds(Integer timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    /**
     * <p>
     * The maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     * exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * </p>
     * 
     * @return The maximum time, in seconds, that a new game session placement request remains in the queue. When a
     *         request exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     */

    public Integer getTimeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * <p>
     * The maximum time, in seconds, that a new game session placement request remains in the queue. When a request
     * exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * </p>
     * 
     * @param timeoutInSeconds
     *        The maximum time, in seconds, that a new game session placement request remains in the queue. When a
     *        request exceeds this time, the game session placement changes to a <code>TIMED_OUT</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueue withTimeoutInSeconds(Integer timeoutInSeconds) {
        setTimeoutInSeconds(timeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * A set of policies that act as a sliding cap on player latency. FleetIQ works to deliver low latency for most
     * players in a game session. These policies ensure that no individual player can be placed into a game with
     * unreasonably high latency. Use multiple policies to gradually relax latency requirements a step at a time.
     * Multiple policies are applied based on their maximum allowed latency, starting with the lowest value.
     * </p>
     * 
     * @return A set of policies that act as a sliding cap on player latency. FleetIQ works to deliver low latency for
     *         most players in a game session. These policies ensure that no individual player can be placed into a game
     *         with unreasonably high latency. Use multiple policies to gradually relax latency requirements a step at a
     *         time. Multiple policies are applied based on their maximum allowed latency, starting with the lowest
     *         value.
     */

    public java.util.List<PlayerLatencyPolicy> getPlayerLatencyPolicies() {
        return playerLatencyPolicies;
    }

    /**
     * <p>
     * A set of policies that act as a sliding cap on player latency. FleetIQ works to deliver low latency for most
     * players in a game session. These policies ensure that no individual player can be placed into a game with
     * unreasonably high latency. Use multiple policies to gradually relax latency requirements a step at a time.
     * Multiple policies are applied based on their maximum allowed latency, starting with the lowest value.
     * </p>
     * 
     * @param playerLatencyPolicies
     *        A set of policies that act as a sliding cap on player latency. FleetIQ works to deliver low latency for
     *        most players in a game session. These policies ensure that no individual player can be placed into a game
     *        with unreasonably high latency. Use multiple policies to gradually relax latency requirements a step at a
     *        time. Multiple policies are applied based on their maximum allowed latency, starting with the lowest
     *        value.
     */

    public void setPlayerLatencyPolicies(java.util.Collection<PlayerLatencyPolicy> playerLatencyPolicies) {
        if (playerLatencyPolicies == null) {
            this.playerLatencyPolicies = null;
            return;
        }

        this.playerLatencyPolicies = new java.util.ArrayList<PlayerLatencyPolicy>(playerLatencyPolicies);
    }

    /**
     * <p>
     * A set of policies that act as a sliding cap on player latency. FleetIQ works to deliver low latency for most
     * players in a game session. These policies ensure that no individual player can be placed into a game with
     * unreasonably high latency. Use multiple policies to gradually relax latency requirements a step at a time.
     * Multiple policies are applied based on their maximum allowed latency, starting with the lowest value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlayerLatencyPolicies(java.util.Collection)} or
     * {@link #withPlayerLatencyPolicies(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param playerLatencyPolicies
     *        A set of policies that act as a sliding cap on player latency. FleetIQ works to deliver low latency for
     *        most players in a game session. These policies ensure that no individual player can be placed into a game
     *        with unreasonably high latency. Use multiple policies to gradually relax latency requirements a step at a
     *        time. Multiple policies are applied based on their maximum allowed latency, starting with the lowest
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueue withPlayerLatencyPolicies(PlayerLatencyPolicy... playerLatencyPolicies) {
        if (this.playerLatencyPolicies == null) {
            setPlayerLatencyPolicies(new java.util.ArrayList<PlayerLatencyPolicy>(playerLatencyPolicies.length));
        }
        for (PlayerLatencyPolicy ele : playerLatencyPolicies) {
            this.playerLatencyPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of policies that act as a sliding cap on player latency. FleetIQ works to deliver low latency for most
     * players in a game session. These policies ensure that no individual player can be placed into a game with
     * unreasonably high latency. Use multiple policies to gradually relax latency requirements a step at a time.
     * Multiple policies are applied based on their maximum allowed latency, starting with the lowest value.
     * </p>
     * 
     * @param playerLatencyPolicies
     *        A set of policies that act as a sliding cap on player latency. FleetIQ works to deliver low latency for
     *        most players in a game session. These policies ensure that no individual player can be placed into a game
     *        with unreasonably high latency. Use multiple policies to gradually relax latency requirements a step at a
     *        time. Multiple policies are applied based on their maximum allowed latency, starting with the lowest
     *        value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueue withPlayerLatencyPolicies(java.util.Collection<PlayerLatencyPolicy> playerLatencyPolicies) {
        setPlayerLatencyPolicies(playerLatencyPolicies);
        return this;
    }

    /**
     * <p>
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement requests in the queue.
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in order of placement
     * preference.
     * </p>
     * 
     * @return A list of fleets and/or fleet aliases that can be used to fulfill game session placement requests in the
     *         queue. Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in order of
     *         placement preference.
     */

    public java.util.List<GameSessionQueueDestination> getDestinations() {
        return destinations;
    }

    /**
     * <p>
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement requests in the queue.
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in order of placement
     * preference.
     * </p>
     * 
     * @param destinations
     *        A list of fleets and/or fleet aliases that can be used to fulfill game session placement requests in the
     *        queue. Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in order of
     *        placement preference.
     */

    public void setDestinations(java.util.Collection<GameSessionQueueDestination> destinations) {
        if (destinations == null) {
            this.destinations = null;
            return;
        }

        this.destinations = new java.util.ArrayList<GameSessionQueueDestination>(destinations);
    }

    /**
     * <p>
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement requests in the queue.
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in order of placement
     * preference.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestinations(java.util.Collection)} or {@link #withDestinations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destinations
     *        A list of fleets and/or fleet aliases that can be used to fulfill game session placement requests in the
     *        queue. Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in order of
     *        placement preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueue withDestinations(GameSessionQueueDestination... destinations) {
        if (this.destinations == null) {
            setDestinations(new java.util.ArrayList<GameSessionQueueDestination>(destinations.length));
        }
        for (GameSessionQueueDestination ele : destinations) {
            this.destinations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of fleets and/or fleet aliases that can be used to fulfill game session placement requests in the queue.
     * Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in order of placement
     * preference.
     * </p>
     * 
     * @param destinations
     *        A list of fleets and/or fleet aliases that can be used to fulfill game session placement requests in the
     *        queue. Destinations are identified by either a fleet ARN or a fleet alias ARN, and are listed in order of
     *        placement preference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueue withDestinations(java.util.Collection<GameSessionQueueDestination> destinations) {
        setDestinations(destinations);
        return this;
    }

    /**
     * <p>
     * A list of locations where a queue is allowed to place new game sessions. Locations are specified in the form of
     * AWS Region codes, such as <code>us-west-2</code>. If this parameter is not set, game sessions can be placed in
     * any queue location.
     * </p>
     * 
     * @param filterConfiguration
     *        A list of locations where a queue is allowed to place new game sessions. Locations are specified in the
     *        form of AWS Region codes, such as <code>us-west-2</code>. If this parameter is not set, game sessions can
     *        be placed in any queue location.
     */

    public void setFilterConfiguration(FilterConfiguration filterConfiguration) {
        this.filterConfiguration = filterConfiguration;
    }

    /**
     * <p>
     * A list of locations where a queue is allowed to place new game sessions. Locations are specified in the form of
     * AWS Region codes, such as <code>us-west-2</code>. If this parameter is not set, game sessions can be placed in
     * any queue location.
     * </p>
     * 
     * @return A list of locations where a queue is allowed to place new game sessions. Locations are specified in the
     *         form of AWS Region codes, such as <code>us-west-2</code>. If this parameter is not set, game sessions can
     *         be placed in any queue location.
     */

    public FilterConfiguration getFilterConfiguration() {
        return this.filterConfiguration;
    }

    /**
     * <p>
     * A list of locations where a queue is allowed to place new game sessions. Locations are specified in the form of
     * AWS Region codes, such as <code>us-west-2</code>. If this parameter is not set, game sessions can be placed in
     * any queue location.
     * </p>
     * 
     * @param filterConfiguration
     *        A list of locations where a queue is allowed to place new game sessions. Locations are specified in the
     *        form of AWS Region codes, such as <code>us-west-2</code>. If this parameter is not set, game sessions can
     *        be placed in any queue location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueue withFilterConfiguration(FilterConfiguration filterConfiguration) {
        setFilterConfiguration(filterConfiguration);
        return this;
    }

    /**
     * <p>
     * Custom settings to use when prioritizing destinations and locations for game session placements. This
     * configuration replaces the FleetIQ default prioritization process. Priority types that are not explicitly named
     * will be automatically applied at the end of the prioritization process.
     * </p>
     * 
     * @param priorityConfiguration
     *        Custom settings to use when prioritizing destinations and locations for game session placements. This
     *        configuration replaces the FleetIQ default prioritization process. Priority types that are not explicitly
     *        named will be automatically applied at the end of the prioritization process.
     */

    public void setPriorityConfiguration(PriorityConfiguration priorityConfiguration) {
        this.priorityConfiguration = priorityConfiguration;
    }

    /**
     * <p>
     * Custom settings to use when prioritizing destinations and locations for game session placements. This
     * configuration replaces the FleetIQ default prioritization process. Priority types that are not explicitly named
     * will be automatically applied at the end of the prioritization process.
     * </p>
     * 
     * @return Custom settings to use when prioritizing destinations and locations for game session placements. This
     *         configuration replaces the FleetIQ default prioritization process. Priority types that are not explicitly
     *         named will be automatically applied at the end of the prioritization process.
     */

    public PriorityConfiguration getPriorityConfiguration() {
        return this.priorityConfiguration;
    }

    /**
     * <p>
     * Custom settings to use when prioritizing destinations and locations for game session placements. This
     * configuration replaces the FleetIQ default prioritization process. Priority types that are not explicitly named
     * will be automatically applied at the end of the prioritization process.
     * </p>
     * 
     * @param priorityConfiguration
     *        Custom settings to use when prioritizing destinations and locations for game session placements. This
     *        configuration replaces the FleetIQ default prioritization process. Priority types that are not explicitly
     *        named will be automatically applied at the end of the prioritization process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueue withPriorityConfiguration(PriorityConfiguration priorityConfiguration) {
        setPriorityConfiguration(priorityConfiguration);
        return this;
    }

    /**
     * <p>
     * Information that is added to all events that are related to this game session queue.
     * </p>
     * 
     * @param customEventData
     *        Information that is added to all events that are related to this game session queue.
     */

    public void setCustomEventData(String customEventData) {
        this.customEventData = customEventData;
    }

    /**
     * <p>
     * Information that is added to all events that are related to this game session queue.
     * </p>
     * 
     * @return Information that is added to all events that are related to this game session queue.
     */

    public String getCustomEventData() {
        return this.customEventData;
    }

    /**
     * <p>
     * Information that is added to all events that are related to this game session queue.
     * </p>
     * 
     * @param customEventData
     *        Information that is added to all events that are related to this game session queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueue withCustomEventData(String customEventData) {
        setCustomEventData(customEventData);
        return this;
    }

    /**
     * <p>
     * An SNS topic ARN that is set up to receive game session placement notifications. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html"> Setting up
     * notifications for game session placement</a>.
     * </p>
     * 
     * @param notificationTarget
     *        An SNS topic ARN that is set up to receive game session placement notifications. See <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html"> Setting up
     *        notifications for game session placement</a>.
     */

    public void setNotificationTarget(String notificationTarget) {
        this.notificationTarget = notificationTarget;
    }

    /**
     * <p>
     * An SNS topic ARN that is set up to receive game session placement notifications. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html"> Setting up
     * notifications for game session placement</a>.
     * </p>
     * 
     * @return An SNS topic ARN that is set up to receive game session placement notifications. See <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html"> Setting up
     *         notifications for game session placement</a>.
     */

    public String getNotificationTarget() {
        return this.notificationTarget;
    }

    /**
     * <p>
     * An SNS topic ARN that is set up to receive game session placement notifications. See <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html"> Setting up
     * notifications for game session placement</a>.
     * </p>
     * 
     * @param notificationTarget
     *        An SNS topic ARN that is set up to receive game session placement notifications. See <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/queue-notification.html"> Setting up
     *        notifications for game session placement</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GameSessionQueue withNotificationTarget(String notificationTarget) {
        setNotificationTarget(notificationTarget);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getGameSessionQueueArn() != null)
            sb.append("GameSessionQueueArn: ").append(getGameSessionQueueArn()).append(",");
        if (getTimeoutInSeconds() != null)
            sb.append("TimeoutInSeconds: ").append(getTimeoutInSeconds()).append(",");
        if (getPlayerLatencyPolicies() != null)
            sb.append("PlayerLatencyPolicies: ").append(getPlayerLatencyPolicies()).append(",");
        if (getDestinations() != null)
            sb.append("Destinations: ").append(getDestinations()).append(",");
        if (getFilterConfiguration() != null)
            sb.append("FilterConfiguration: ").append(getFilterConfiguration()).append(",");
        if (getPriorityConfiguration() != null)
            sb.append("PriorityConfiguration: ").append(getPriorityConfiguration()).append(",");
        if (getCustomEventData() != null)
            sb.append("CustomEventData: ").append(getCustomEventData()).append(",");
        if (getNotificationTarget() != null)
            sb.append("NotificationTarget: ").append(getNotificationTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GameSessionQueue == false)
            return false;
        GameSessionQueue other = (GameSessionQueue) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getGameSessionQueueArn() == null ^ this.getGameSessionQueueArn() == null)
            return false;
        if (other.getGameSessionQueueArn() != null && other.getGameSessionQueueArn().equals(this.getGameSessionQueueArn()) == false)
            return false;
        if (other.getTimeoutInSeconds() == null ^ this.getTimeoutInSeconds() == null)
            return false;
        if (other.getTimeoutInSeconds() != null && other.getTimeoutInSeconds().equals(this.getTimeoutInSeconds()) == false)
            return false;
        if (other.getPlayerLatencyPolicies() == null ^ this.getPlayerLatencyPolicies() == null)
            return false;
        if (other.getPlayerLatencyPolicies() != null && other.getPlayerLatencyPolicies().equals(this.getPlayerLatencyPolicies()) == false)
            return false;
        if (other.getDestinations() == null ^ this.getDestinations() == null)
            return false;
        if (other.getDestinations() != null && other.getDestinations().equals(this.getDestinations()) == false)
            return false;
        if (other.getFilterConfiguration() == null ^ this.getFilterConfiguration() == null)
            return false;
        if (other.getFilterConfiguration() != null && other.getFilterConfiguration().equals(this.getFilterConfiguration()) == false)
            return false;
        if (other.getPriorityConfiguration() == null ^ this.getPriorityConfiguration() == null)
            return false;
        if (other.getPriorityConfiguration() != null && other.getPriorityConfiguration().equals(this.getPriorityConfiguration()) == false)
            return false;
        if (other.getCustomEventData() == null ^ this.getCustomEventData() == null)
            return false;
        if (other.getCustomEventData() != null && other.getCustomEventData().equals(this.getCustomEventData()) == false)
            return false;
        if (other.getNotificationTarget() == null ^ this.getNotificationTarget() == null)
            return false;
        if (other.getNotificationTarget() != null && other.getNotificationTarget().equals(this.getNotificationTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getGameSessionQueueArn() == null) ? 0 : getGameSessionQueueArn().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInSeconds() == null) ? 0 : getTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getPlayerLatencyPolicies() == null) ? 0 : getPlayerLatencyPolicies().hashCode());
        hashCode = prime * hashCode + ((getDestinations() == null) ? 0 : getDestinations().hashCode());
        hashCode = prime * hashCode + ((getFilterConfiguration() == null) ? 0 : getFilterConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPriorityConfiguration() == null) ? 0 : getPriorityConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCustomEventData() == null) ? 0 : getCustomEventData().hashCode());
        hashCode = prime * hashCode + ((getNotificationTarget() == null) ? 0 : getNotificationTarget().hashCode());
        return hashCode;
    }

    @Override
    public GameSessionQueue clone() {
        try {
            return (GameSessionQueue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.GameSessionQueueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
