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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * General properties describing a fleet.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>CreateFleet</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>ListFleets</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>DeleteFleet</a>
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
 * <a>DescribeRuntimeConfiguration</a>
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
 * Manage fleet actions:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>StartFleetActions</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a>StopFleetActions</a>
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/FleetAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Identifier for a fleet that is unique across all regions.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted with a
     * two-minute notification.
     * </p>
     */
    private String fleetType;
    /**
     * <p>
     * EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory,
     * storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for detailed descriptions.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Human-readable description of the fleet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     */
    private java.util.Date terminationTime;
    /**
     * <p>
     * Current status of the fleet.
     * </p>
     * <p>
     * Possible fleet statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- Amazon GameLift is setting up the new fleet, creating new
     * instances with the game build or Realtime script and starting server processes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- Hosts can now accept game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> -- An error occurred when downloading, validating, building, or activating the fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> -- Hosts are responding to a delete fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATED</b> -- The fleet no longer exists.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Unique identifier for a build.
     * </p>
     */
    private String buildId;
    /**
     * <p>
     * Unique identifier for a Realtime script.
     * </p>
     */
    private String scriptId;
    /**
     * <p>
     * Path to a game server executable in the fleet's build, specified for fleets created before 2016-08-04 (or AWS SDK
     * v. 0.12.16). Server launch paths for fleets created after this date are specified in the fleet's
     * <a>RuntimeConfiguration</a>.
     * </p>
     */
    private String serverLaunchPath;
    /**
     * <p>
     * Game server launch parameters specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server
     * launch parameters for fleets created after this date are specified in the fleet's <a>RuntimeConfiguration</a>.
     * </p>
     */
    private String serverLaunchParameters;
    /**
     * <p>
     * Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any log
     * files in this location. These logs are in addition to game session logs; see more on game session logs in the <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, Amazon GameLift
     * automatically uploads logs that are stored on each instance at <code>C:\game\logs</code> (for Windows) or
     * <code>/local/game/logs</code> (for Linux). Use the Amazon GameLift console to access stored logs.
     * </p>
     */
    private java.util.List<String> logPaths;
    /**
     * <p>
     * Type of game session protection to set for all new instances started in the fleet.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     */
    private String newGameSessionProtectionPolicy;
    /**
     * <p>
     * Operating system of the fleet's computing resources. A fleet's operating system depends on the OS specified for
     * the build that is deployed on this fleet.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * Fleet policy to limit the number of game sessions an individual player can create over a span of time.
     * </p>
     */
    private ResourceCreationLimitPolicy resourceCreationLimitPolicy;
    /**
     * <p>
     * Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an
     * individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be included in
     * only one metric group at a time.
     * </p>
     */
    private java.util.List<String> metricGroups;
    /**
     * <p>
     * List of fleet actions that have been suspended using <a>StopFleetActions</a>. This includes auto-scaling.
     * </p>
     */
    private java.util.List<String> stoppedActions;
    /**
     * <p>
     * Unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN set,
     * any application that runs on an instance in this fleet can assume the role, including install scripts, server
     * processes, daemons (background processes). Create a role or look up a role's ARN using the <a
     * href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the AWS Management Console. Learn more about
     * using on-box credentials for your game servers at <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Access
     * external resources from a game server</a>.
     * </p>
     */
    private String instanceRoleArn;

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     * 
     * @return Unique identifier for a fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Identifier for a fleet that is unique across all regions.
     * </p>
     * 
     * @param fleetArn
     *        Identifier for a fleet that is unique across all regions.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * Identifier for a fleet that is unique across all regions.
     * </p>
     * 
     * @return Identifier for a fleet that is unique across all regions.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * Identifier for a fleet that is unique across all regions.
     * </p>
     * 
     * @param fleetArn
     *        Identifier for a fleet that is unique across all regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted with a
     * two-minute notification.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted
     *        with a two-minute notification.
     * @see FleetType
     */

    public void setFleetType(String fleetType) {
        this.fleetType = fleetType;
    }

    /**
     * <p>
     * Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted with a
     * two-minute notification.
     * </p>
     * 
     * @return Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted
     *         with a two-minute notification.
     * @see FleetType
     */

    public String getFleetType() {
        return this.fleetType;
    }

    /**
     * <p>
     * Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted with a
     * two-minute notification.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted
     *        with a two-minute notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public FleetAttributes withFleetType(String fleetType) {
        setFleetType(fleetType);
        return this;
    }

    /**
     * <p>
     * Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted with a
     * two-minute notification.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted
     *        with a two-minute notification.
     * @see FleetType
     */

    public void setFleetType(FleetType fleetType) {
        withFleetType(fleetType);
    }

    /**
     * <p>
     * Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted with a
     * two-minute notification.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether the fleet uses on-demand or spot instances. A spot instance in use may be interrupted
     *        with a two-minute notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public FleetAttributes withFleetType(FleetType fleetType) {
        this.fleetType = fleetType.toString();
        return this;
    }

    /**
     * <p>
     * EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory,
     * storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for detailed descriptions.
     * </p>
     * 
     * @param instanceType
     *        EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory,
     *        storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *        Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory,
     * storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for detailed descriptions.
     * </p>
     * 
     * @return EC2 instance type indicating the computing resources of each instance in the fleet, including CPU,
     *         memory, storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon
     *         EC2 Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory,
     * storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for detailed descriptions.
     * </p>
     * 
     * @param instanceType
     *        EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory,
     *        storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *        Instance Types</a> for detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public FleetAttributes withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory,
     * storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for detailed descriptions.
     * </p>
     * 
     * @param instanceType
     *        EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory,
     *        storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *        Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public void setInstanceType(EC2InstanceType instanceType) {
        withInstanceType(instanceType);
    }

    /**
     * <p>
     * EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory,
     * storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance
     * Types</a> for detailed descriptions.
     * </p>
     * 
     * @param instanceType
     *        EC2 instance type indicating the computing resources of each instance in the fleet, including CPU, memory,
     *        storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     *        Instance Types</a> for detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public FleetAttributes withInstanceType(EC2InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * Human-readable description of the fleet.
     * </p>
     * 
     * @param description
     *        Human-readable description of the fleet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Human-readable description of the fleet.
     * </p>
     * 
     * @return Human-readable description of the fleet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Human-readable description of the fleet.
     * </p>
     * 
     * @param description
     *        Human-readable description of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @return Descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @return Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *         milliseconds (for example "1469498468.057").
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param terminationTime
     *        Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     */

    public void setTerminationTime(java.util.Date terminationTime) {
        this.terminationTime = terminationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @return Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     *         milliseconds (for example "1469498468.057").
     */

    public java.util.Date getTerminationTime() {
        return this.terminationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param terminationTime
     *        Time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withTerminationTime(java.util.Date terminationTime) {
        setTerminationTime(terminationTime);
        return this;
    }

    /**
     * <p>
     * Current status of the fleet.
     * </p>
     * <p>
     * Possible fleet statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- Amazon GameLift is setting up the new fleet, creating new
     * instances with the game build or Realtime script and starting server processes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- Hosts can now accept game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> -- An error occurred when downloading, validating, building, or activating the fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> -- Hosts are responding to a delete fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATED</b> -- The fleet no longer exists.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the fleet.</p>
     *        <p>
     *        Possible fleet statuses include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- Amazon GameLift is setting up the new fleet, creating
     *        new instances with the game build or Realtime script and starting server processes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- Hosts can now accept game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> -- An error occurred when downloading, validating, building, or activating the fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> -- Hosts are responding to a delete fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINATED</b> -- The fleet no longer exists.
     *        </p>
     *        </li>
     * @see FleetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the fleet.
     * </p>
     * <p>
     * Possible fleet statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- Amazon GameLift is setting up the new fleet, creating new
     * instances with the game build or Realtime script and starting server processes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- Hosts can now accept game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> -- An error occurred when downloading, validating, building, or activating the fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> -- Hosts are responding to a delete fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATED</b> -- The fleet no longer exists.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Current status of the fleet.</p>
     *         <p>
     *         Possible fleet statuses include the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- Amazon GameLift is setting up the new fleet,
     *         creating new instances with the game build or Realtime script and starting server processes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ACTIVE</b> -- Hosts can now accept game sessions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ERROR</b> -- An error occurred when downloading, validating, building, or activating the fleet.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DELETING</b> -- Hosts are responding to a delete fleet request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>TERMINATED</b> -- The fleet no longer exists.
     *         </p>
     *         </li>
     * @see FleetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the fleet.
     * </p>
     * <p>
     * Possible fleet statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- Amazon GameLift is setting up the new fleet, creating new
     * instances with the game build or Realtime script and starting server processes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- Hosts can now accept game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> -- An error occurred when downloading, validating, building, or activating the fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> -- Hosts are responding to a delete fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATED</b> -- The fleet no longer exists.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the fleet.</p>
     *        <p>
     *        Possible fleet statuses include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- Amazon GameLift is setting up the new fleet, creating
     *        new instances with the game build or Realtime script and starting server processes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- Hosts can now accept game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> -- An error occurred when downloading, validating, building, or activating the fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> -- Hosts are responding to a delete fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINATED</b> -- The fleet no longer exists.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStatus
     */

    public FleetAttributes withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the fleet.
     * </p>
     * <p>
     * Possible fleet statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- Amazon GameLift is setting up the new fleet, creating new
     * instances with the game build or Realtime script and starting server processes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- Hosts can now accept game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> -- An error occurred when downloading, validating, building, or activating the fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> -- Hosts are responding to a delete fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATED</b> -- The fleet no longer exists.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the fleet.</p>
     *        <p>
     *        Possible fleet statuses include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- Amazon GameLift is setting up the new fleet, creating
     *        new instances with the game build or Realtime script and starting server processes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- Hosts can now accept game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> -- An error occurred when downloading, validating, building, or activating the fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> -- Hosts are responding to a delete fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINATED</b> -- The fleet no longer exists.
     *        </p>
     *        </li>
     * @see FleetStatus
     */

    public void setStatus(FleetStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * Current status of the fleet.
     * </p>
     * <p>
     * Possible fleet statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- Amazon GameLift is setting up the new fleet, creating new
     * instances with the game build or Realtime script and starting server processes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- Hosts can now accept game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ERROR</b> -- An error occurred when downloading, validating, building, or activating the fleet.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DELETING</b> -- Hosts are responding to a delete fleet request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATED</b> -- The fleet no longer exists.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the fleet.</p>
     *        <p>
     *        Possible fleet statuses include the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- Amazon GameLift is setting up the new fleet, creating
     *        new instances with the game build or Realtime script and starting server processes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- Hosts can now accept game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ERROR</b> -- An error occurred when downloading, validating, building, or activating the fleet.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DELETING</b> -- Hosts are responding to a delete fleet request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINATED</b> -- The fleet no longer exists.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetStatus
     */

    public FleetAttributes withStatus(FleetStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Unique identifier for a build.
     * </p>
     * 
     * @param buildId
     *        Unique identifier for a build.
     */

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    /**
     * <p>
     * Unique identifier for a build.
     * </p>
     * 
     * @return Unique identifier for a build.
     */

    public String getBuildId() {
        return this.buildId;
    }

    /**
     * <p>
     * Unique identifier for a build.
     * </p>
     * 
     * @param buildId
     *        Unique identifier for a build.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withBuildId(String buildId) {
        setBuildId(buildId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a Realtime script.
     * </p>
     * 
     * @param scriptId
     *        Unique identifier for a Realtime script.
     */

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    /**
     * <p>
     * Unique identifier for a Realtime script.
     * </p>
     * 
     * @return Unique identifier for a Realtime script.
     */

    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * <p>
     * Unique identifier for a Realtime script.
     * </p>
     * 
     * @param scriptId
     *        Unique identifier for a Realtime script.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withScriptId(String scriptId) {
        setScriptId(scriptId);
        return this;
    }

    /**
     * <p>
     * Path to a game server executable in the fleet's build, specified for fleets created before 2016-08-04 (or AWS SDK
     * v. 0.12.16). Server launch paths for fleets created after this date are specified in the fleet's
     * <a>RuntimeConfiguration</a>.
     * </p>
     * 
     * @param serverLaunchPath
     *        Path to a game server executable in the fleet's build, specified for fleets created before 2016-08-04 (or
     *        AWS SDK v. 0.12.16). Server launch paths for fleets created after this date are specified in the fleet's
     *        <a>RuntimeConfiguration</a>.
     */

    public void setServerLaunchPath(String serverLaunchPath) {
        this.serverLaunchPath = serverLaunchPath;
    }

    /**
     * <p>
     * Path to a game server executable in the fleet's build, specified for fleets created before 2016-08-04 (or AWS SDK
     * v. 0.12.16). Server launch paths for fleets created after this date are specified in the fleet's
     * <a>RuntimeConfiguration</a>.
     * </p>
     * 
     * @return Path to a game server executable in the fleet's build, specified for fleets created before 2016-08-04 (or
     *         AWS SDK v. 0.12.16). Server launch paths for fleets created after this date are specified in the fleet's
     *         <a>RuntimeConfiguration</a>.
     */

    public String getServerLaunchPath() {
        return this.serverLaunchPath;
    }

    /**
     * <p>
     * Path to a game server executable in the fleet's build, specified for fleets created before 2016-08-04 (or AWS SDK
     * v. 0.12.16). Server launch paths for fleets created after this date are specified in the fleet's
     * <a>RuntimeConfiguration</a>.
     * </p>
     * 
     * @param serverLaunchPath
     *        Path to a game server executable in the fleet's build, specified for fleets created before 2016-08-04 (or
     *        AWS SDK v. 0.12.16). Server launch paths for fleets created after this date are specified in the fleet's
     *        <a>RuntimeConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withServerLaunchPath(String serverLaunchPath) {
        setServerLaunchPath(serverLaunchPath);
        return this;
    }

    /**
     * <p>
     * Game server launch parameters specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server
     * launch parameters for fleets created after this date are specified in the fleet's <a>RuntimeConfiguration</a>.
     * </p>
     * 
     * @param serverLaunchParameters
     *        Game server launch parameters specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16).
     *        Server launch parameters for fleets created after this date are specified in the fleet's
     *        <a>RuntimeConfiguration</a>.
     */

    public void setServerLaunchParameters(String serverLaunchParameters) {
        this.serverLaunchParameters = serverLaunchParameters;
    }

    /**
     * <p>
     * Game server launch parameters specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server
     * launch parameters for fleets created after this date are specified in the fleet's <a>RuntimeConfiguration</a>.
     * </p>
     * 
     * @return Game server launch parameters specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16).
     *         Server launch parameters for fleets created after this date are specified in the fleet's
     *         <a>RuntimeConfiguration</a>.
     */

    public String getServerLaunchParameters() {
        return this.serverLaunchParameters;
    }

    /**
     * <p>
     * Game server launch parameters specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16). Server
     * launch parameters for fleets created after this date are specified in the fleet's <a>RuntimeConfiguration</a>.
     * </p>
     * 
     * @param serverLaunchParameters
     *        Game server launch parameters specified for fleets created before 2016-08-04 (or AWS SDK v. 0.12.16).
     *        Server launch parameters for fleets created after this date are specified in the fleet's
     *        <a>RuntimeConfiguration</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withServerLaunchParameters(String serverLaunchParameters) {
        setServerLaunchParameters(serverLaunchParameters);
        return this;
    }

    /**
     * <p>
     * Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any log
     * files in this location. These logs are in addition to game session logs; see more on game session logs in the <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, Amazon GameLift
     * automatically uploads logs that are stored on each instance at <code>C:\game\logs</code> (for Windows) or
     * <code>/local/game/logs</code> (for Linux). Use the Amazon GameLift console to access stored logs.
     * </p>
     * 
     * @return Location of default log files. When a server process is shut down, Amazon GameLift captures and stores
     *         any log files in this location. These logs are in addition to game session logs; see more on game session
     *         logs in the <a href=
     *         "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     *         >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, Amazon GameLift
     *         automatically uploads logs that are stored on each instance at <code>C:\game\logs</code> (for Windows) or
     *         <code>/local/game/logs</code> (for Linux). Use the Amazon GameLift console to access stored logs.
     */

    public java.util.List<String> getLogPaths() {
        return logPaths;
    }

    /**
     * <p>
     * Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any log
     * files in this location. These logs are in addition to game session logs; see more on game session logs in the <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, Amazon GameLift
     * automatically uploads logs that are stored on each instance at <code>C:\game\logs</code> (for Windows) or
     * <code>/local/game/logs</code> (for Linux). Use the Amazon GameLift console to access stored logs.
     * </p>
     * 
     * @param logPaths
     *        Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any
     *        log files in this location. These logs are in addition to game session logs; see more on game session logs
     *        in the <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     *        >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, Amazon GameLift
     *        automatically uploads logs that are stored on each instance at <code>C:\game\logs</code> (for Windows) or
     *        <code>/local/game/logs</code> (for Linux). Use the Amazon GameLift console to access stored logs.
     */

    public void setLogPaths(java.util.Collection<String> logPaths) {
        if (logPaths == null) {
            this.logPaths = null;
            return;
        }

        this.logPaths = new java.util.ArrayList<String>(logPaths);
    }

    /**
     * <p>
     * Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any log
     * files in this location. These logs are in addition to game session logs; see more on game session logs in the <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, Amazon GameLift
     * automatically uploads logs that are stored on each instance at <code>C:\game\logs</code> (for Windows) or
     * <code>/local/game/logs</code> (for Linux). Use the Amazon GameLift console to access stored logs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogPaths(java.util.Collection)} or {@link #withLogPaths(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param logPaths
     *        Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any
     *        log files in this location. These logs are in addition to game session logs; see more on game session logs
     *        in the <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     *        >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, Amazon GameLift
     *        automatically uploads logs that are stored on each instance at <code>C:\game\logs</code> (for Windows) or
     *        <code>/local/game/logs</code> (for Linux). Use the Amazon GameLift console to access stored logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withLogPaths(String... logPaths) {
        if (this.logPaths == null) {
            setLogPaths(new java.util.ArrayList<String>(logPaths.length));
        }
        for (String ele : logPaths) {
            this.logPaths.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any log
     * files in this location. These logs are in addition to game session logs; see more on game session logs in the <a
     * href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, Amazon GameLift
     * automatically uploads logs that are stored on each instance at <code>C:\game\logs</code> (for Windows) or
     * <code>/local/game/logs</code> (for Linux). Use the Amazon GameLift console to access stored logs.
     * </p>
     * 
     * @param logPaths
     *        Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any
     *        log files in this location. These logs are in addition to game session logs; see more on game session logs
     *        in the <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     *        >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, Amazon GameLift
     *        automatically uploads logs that are stored on each instance at <code>C:\game\logs</code> (for Windows) or
     *        <code>/local/game/logs</code> (for Linux). Use the Amazon GameLift console to access stored logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withLogPaths(java.util.Collection<String> logPaths) {
        setLogPaths(logPaths);
        return this;
    }

    /**
     * <p>
     * Type of game session protection to set for all new instances started in the fleet.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        Type of game session protection to set for all new instances started in the fleet.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @see ProtectionPolicy
     */

    public void setNewGameSessionProtectionPolicy(String newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
    }

    /**
     * <p>
     * Type of game session protection to set for all new instances started in the fleet.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Type of game session protection to set for all new instances started in the fleet.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *         during a scale-down event.
     *         </p>
     *         </li>
     * @see ProtectionPolicy
     */

    public String getNewGameSessionProtectionPolicy() {
        return this.newGameSessionProtectionPolicy;
    }

    /**
     * <p>
     * Type of game session protection to set for all new instances started in the fleet.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        Type of game session protection to set for all new instances started in the fleet.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionPolicy
     */

    public FleetAttributes withNewGameSessionProtectionPolicy(String newGameSessionProtectionPolicy) {
        setNewGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
        return this;
    }

    /**
     * <p>
     * Type of game session protection to set for all new instances started in the fleet.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        Type of game session protection to set for all new instances started in the fleet.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @see ProtectionPolicy
     */

    public void setNewGameSessionProtectionPolicy(ProtectionPolicy newGameSessionProtectionPolicy) {
        withNewGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
    }

    /**
     * <p>
     * Type of game session protection to set for all new instances started in the fleet.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during
     * a scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        Type of game session protection to set for all new instances started in the fleet.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> -- The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> -- If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionPolicy
     */

    public FleetAttributes withNewGameSessionProtectionPolicy(ProtectionPolicy newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Operating system of the fleet's computing resources. A fleet's operating system depends on the OS specified for
     * the build that is deployed on this fleet.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system of the fleet's computing resources. A fleet's operating system depends on the OS
     *        specified for the build that is deployed on this fleet.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Operating system of the fleet's computing resources. A fleet's operating system depends on the OS specified for
     * the build that is deployed on this fleet.
     * </p>
     * 
     * @return Operating system of the fleet's computing resources. A fleet's operating system depends on the OS
     *         specified for the build that is deployed on this fleet.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * Operating system of the fleet's computing resources. A fleet's operating system depends on the OS specified for
     * the build that is deployed on this fleet.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system of the fleet's computing resources. A fleet's operating system depends on the OS
     *        specified for the build that is deployed on this fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public FleetAttributes withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * Operating system of the fleet's computing resources. A fleet's operating system depends on the OS specified for
     * the build that is deployed on this fleet.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system of the fleet's computing resources. A fleet's operating system depends on the OS
     *        specified for the build that is deployed on this fleet.
     * @see OperatingSystem
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        withOperatingSystem(operatingSystem);
    }

    /**
     * <p>
     * Operating system of the fleet's computing resources. A fleet's operating system depends on the OS specified for
     * the build that is deployed on this fleet.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system of the fleet's computing resources. A fleet's operating system depends on the OS
     *        specified for the build that is deployed on this fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public FleetAttributes withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * Fleet policy to limit the number of game sessions an individual player can create over a span of time.
     * </p>
     * 
     * @param resourceCreationLimitPolicy
     *        Fleet policy to limit the number of game sessions an individual player can create over a span of time.
     */

    public void setResourceCreationLimitPolicy(ResourceCreationLimitPolicy resourceCreationLimitPolicy) {
        this.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
    }

    /**
     * <p>
     * Fleet policy to limit the number of game sessions an individual player can create over a span of time.
     * </p>
     * 
     * @return Fleet policy to limit the number of game sessions an individual player can create over a span of time.
     */

    public ResourceCreationLimitPolicy getResourceCreationLimitPolicy() {
        return this.resourceCreationLimitPolicy;
    }

    /**
     * <p>
     * Fleet policy to limit the number of game sessions an individual player can create over a span of time.
     * </p>
     * 
     * @param resourceCreationLimitPolicy
     *        Fleet policy to limit the number of game sessions an individual player can create over a span of time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withResourceCreationLimitPolicy(ResourceCreationLimitPolicy resourceCreationLimitPolicy) {
        setResourceCreationLimitPolicy(resourceCreationLimitPolicy);
        return this;
    }

    /**
     * <p>
     * Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an
     * individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be included in
     * only one metric group at a time.
     * </p>
     * 
     * @return Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an
     *         individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be
     *         included in only one metric group at a time.
     */

    public java.util.List<String> getMetricGroups() {
        return metricGroups;
    }

    /**
     * <p>
     * Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an
     * individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be included in
     * only one metric group at a time.
     * </p>
     * 
     * @param metricGroups
     *        Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an
     *        individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be
     *        included in only one metric group at a time.
     */

    public void setMetricGroups(java.util.Collection<String> metricGroups) {
        if (metricGroups == null) {
            this.metricGroups = null;
            return;
        }

        this.metricGroups = new java.util.ArrayList<String>(metricGroups);
    }

    /**
     * <p>
     * Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an
     * individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be included in
     * only one metric group at a time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricGroups(java.util.Collection)} or {@link #withMetricGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricGroups
     *        Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an
     *        individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be
     *        included in only one metric group at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withMetricGroups(String... metricGroups) {
        if (this.metricGroups == null) {
            setMetricGroups(new java.util.ArrayList<String>(metricGroups.length));
        }
        for (String ele : metricGroups) {
            this.metricGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an
     * individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be included in
     * only one metric group at a time.
     * </p>
     * 
     * @param metricGroups
     *        Names of metric groups that this fleet is included in. In Amazon CloudWatch, you can view metrics for an
     *        individual fleet or aggregated metrics for fleets that are in a fleet metric group. A fleet can be
     *        included in only one metric group at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withMetricGroups(java.util.Collection<String> metricGroups) {
        setMetricGroups(metricGroups);
        return this;
    }

    /**
     * <p>
     * List of fleet actions that have been suspended using <a>StopFleetActions</a>. This includes auto-scaling.
     * </p>
     * 
     * @return List of fleet actions that have been suspended using <a>StopFleetActions</a>. This includes auto-scaling.
     * @see FleetAction
     */

    public java.util.List<String> getStoppedActions() {
        return stoppedActions;
    }

    /**
     * <p>
     * List of fleet actions that have been suspended using <a>StopFleetActions</a>. This includes auto-scaling.
     * </p>
     * 
     * @param stoppedActions
     *        List of fleet actions that have been suspended using <a>StopFleetActions</a>. This includes auto-scaling.
     * @see FleetAction
     */

    public void setStoppedActions(java.util.Collection<String> stoppedActions) {
        if (stoppedActions == null) {
            this.stoppedActions = null;
            return;
        }

        this.stoppedActions = new java.util.ArrayList<String>(stoppedActions);
    }

    /**
     * <p>
     * List of fleet actions that have been suspended using <a>StopFleetActions</a>. This includes auto-scaling.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStoppedActions(java.util.Collection)} or {@link #withStoppedActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stoppedActions
     *        List of fleet actions that have been suspended using <a>StopFleetActions</a>. This includes auto-scaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAction
     */

    public FleetAttributes withStoppedActions(String... stoppedActions) {
        if (this.stoppedActions == null) {
            setStoppedActions(new java.util.ArrayList<String>(stoppedActions.length));
        }
        for (String ele : stoppedActions) {
            this.stoppedActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of fleet actions that have been suspended using <a>StopFleetActions</a>. This includes auto-scaling.
     * </p>
     * 
     * @param stoppedActions
     *        List of fleet actions that have been suspended using <a>StopFleetActions</a>. This includes auto-scaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAction
     */

    public FleetAttributes withStoppedActions(java.util.Collection<String> stoppedActions) {
        setStoppedActions(stoppedActions);
        return this;
    }

    /**
     * <p>
     * List of fleet actions that have been suspended using <a>StopFleetActions</a>. This includes auto-scaling.
     * </p>
     * 
     * @param stoppedActions
     *        List of fleet actions that have been suspended using <a>StopFleetActions</a>. This includes auto-scaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAction
     */

    public FleetAttributes withStoppedActions(FleetAction... stoppedActions) {
        java.util.ArrayList<String> stoppedActionsCopy = new java.util.ArrayList<String>(stoppedActions.length);
        for (FleetAction value : stoppedActions) {
            stoppedActionsCopy.add(value.toString());
        }
        if (getStoppedActions() == null) {
            setStoppedActions(stoppedActionsCopy);
        } else {
            getStoppedActions().addAll(stoppedActionsCopy);
        }
        return this;
    }

    /**
     * <p>
     * Unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN set,
     * any application that runs on an instance in this fleet can assume the role, including install scripts, server
     * processes, daemons (background processes). Create a role or look up a role's ARN using the <a
     * href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the AWS Management Console. Learn more about
     * using on-box credentials for your game servers at <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Access
     * external resources from a game server</a>.
     * </p>
     * 
     * @param instanceRoleArn
     *        Unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN
     *        set, any application that runs on an instance in this fleet can assume the role, including install
     *        scripts, server processes, daemons (background processes). Create a role or look up a role's ARN using the
     *        <a href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the AWS Management Console. Learn more
     *        about using on-box credentials for your game servers at <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *        Access external resources from a game server</a>.
     */

    public void setInstanceRoleArn(String instanceRoleArn) {
        this.instanceRoleArn = instanceRoleArn;
    }

    /**
     * <p>
     * Unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN set,
     * any application that runs on an instance in this fleet can assume the role, including install scripts, server
     * processes, daemons (background processes). Create a role or look up a role's ARN using the <a
     * href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the AWS Management Console. Learn more about
     * using on-box credentials for your game servers at <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Access
     * external resources from a game server</a>.
     * </p>
     * 
     * @return Unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN
     *         set, any application that runs on an instance in this fleet can assume the role, including install
     *         scripts, server processes, daemons (background processes). Create a role or look up a role's ARN using
     *         the <a href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the AWS Management Console. Learn
     *         more about using on-box credentials for your game servers at <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *         Access external resources from a game server</a>.
     */

    public String getInstanceRoleArn() {
        return this.instanceRoleArn;
    }

    /**
     * <p>
     * Unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN set,
     * any application that runs on an instance in this fleet can assume the role, including install scripts, server
     * processes, daemons (background processes). Create a role or look up a role's ARN using the <a
     * href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the AWS Management Console. Learn more about
     * using on-box credentials for your game servers at <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Access
     * external resources from a game server</a>.
     * </p>
     * 
     * @param instanceRoleArn
     *        Unique identifier for an AWS IAM role that manages access to your AWS services. With an instance role ARN
     *        set, any application that runs on an instance in this fleet can assume the role, including install
     *        scripts, server processes, daemons (background processes). Create a role or look up a role's ARN using the
     *        <a href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the AWS Management Console. Learn more
     *        about using on-box credentials for your game servers at <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *        Access external resources from a game server</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withInstanceRoleArn(String instanceRoleArn) {
        setInstanceRoleArn(instanceRoleArn);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getFleetType() != null)
            sb.append("FleetType: ").append(getFleetType()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getTerminationTime() != null)
            sb.append("TerminationTime: ").append(getTerminationTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getBuildId() != null)
            sb.append("BuildId: ").append(getBuildId()).append(",");
        if (getScriptId() != null)
            sb.append("ScriptId: ").append(getScriptId()).append(",");
        if (getServerLaunchPath() != null)
            sb.append("ServerLaunchPath: ").append(getServerLaunchPath()).append(",");
        if (getServerLaunchParameters() != null)
            sb.append("ServerLaunchParameters: ").append(getServerLaunchParameters()).append(",");
        if (getLogPaths() != null)
            sb.append("LogPaths: ").append(getLogPaths()).append(",");
        if (getNewGameSessionProtectionPolicy() != null)
            sb.append("NewGameSessionProtectionPolicy: ").append(getNewGameSessionProtectionPolicy()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getResourceCreationLimitPolicy() != null)
            sb.append("ResourceCreationLimitPolicy: ").append(getResourceCreationLimitPolicy()).append(",");
        if (getMetricGroups() != null)
            sb.append("MetricGroups: ").append(getMetricGroups()).append(",");
        if (getStoppedActions() != null)
            sb.append("StoppedActions: ").append(getStoppedActions()).append(",");
        if (getInstanceRoleArn() != null)
            sb.append("InstanceRoleArn: ").append(getInstanceRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FleetAttributes == false)
            return false;
        FleetAttributes other = (FleetAttributes) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getFleetType() == null ^ this.getFleetType() == null)
            return false;
        if (other.getFleetType() != null && other.getFleetType().equals(this.getFleetType()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getTerminationTime() == null ^ this.getTerminationTime() == null)
            return false;
        if (other.getTerminationTime() != null && other.getTerminationTime().equals(this.getTerminationTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getBuildId() == null ^ this.getBuildId() == null)
            return false;
        if (other.getBuildId() != null && other.getBuildId().equals(this.getBuildId()) == false)
            return false;
        if (other.getScriptId() == null ^ this.getScriptId() == null)
            return false;
        if (other.getScriptId() != null && other.getScriptId().equals(this.getScriptId()) == false)
            return false;
        if (other.getServerLaunchPath() == null ^ this.getServerLaunchPath() == null)
            return false;
        if (other.getServerLaunchPath() != null && other.getServerLaunchPath().equals(this.getServerLaunchPath()) == false)
            return false;
        if (other.getServerLaunchParameters() == null ^ this.getServerLaunchParameters() == null)
            return false;
        if (other.getServerLaunchParameters() != null && other.getServerLaunchParameters().equals(this.getServerLaunchParameters()) == false)
            return false;
        if (other.getLogPaths() == null ^ this.getLogPaths() == null)
            return false;
        if (other.getLogPaths() != null && other.getLogPaths().equals(this.getLogPaths()) == false)
            return false;
        if (other.getNewGameSessionProtectionPolicy() == null ^ this.getNewGameSessionProtectionPolicy() == null)
            return false;
        if (other.getNewGameSessionProtectionPolicy() != null
                && other.getNewGameSessionProtectionPolicy().equals(this.getNewGameSessionProtectionPolicy()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getResourceCreationLimitPolicy() == null ^ this.getResourceCreationLimitPolicy() == null)
            return false;
        if (other.getResourceCreationLimitPolicy() != null && other.getResourceCreationLimitPolicy().equals(this.getResourceCreationLimitPolicy()) == false)
            return false;
        if (other.getMetricGroups() == null ^ this.getMetricGroups() == null)
            return false;
        if (other.getMetricGroups() != null && other.getMetricGroups().equals(this.getMetricGroups()) == false)
            return false;
        if (other.getStoppedActions() == null ^ this.getStoppedActions() == null)
            return false;
        if (other.getStoppedActions() != null && other.getStoppedActions().equals(this.getStoppedActions()) == false)
            return false;
        if (other.getInstanceRoleArn() == null ^ this.getInstanceRoleArn() == null)
            return false;
        if (other.getInstanceRoleArn() != null && other.getInstanceRoleArn().equals(this.getInstanceRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getFleetType() == null) ? 0 : getFleetType().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTerminationTime() == null) ? 0 : getTerminationTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getBuildId() == null) ? 0 : getBuildId().hashCode());
        hashCode = prime * hashCode + ((getScriptId() == null) ? 0 : getScriptId().hashCode());
        hashCode = prime * hashCode + ((getServerLaunchPath() == null) ? 0 : getServerLaunchPath().hashCode());
        hashCode = prime * hashCode + ((getServerLaunchParameters() == null) ? 0 : getServerLaunchParameters().hashCode());
        hashCode = prime * hashCode + ((getLogPaths() == null) ? 0 : getLogPaths().hashCode());
        hashCode = prime * hashCode + ((getNewGameSessionProtectionPolicy() == null) ? 0 : getNewGameSessionProtectionPolicy().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getResourceCreationLimitPolicy() == null) ? 0 : getResourceCreationLimitPolicy().hashCode());
        hashCode = prime * hashCode + ((getMetricGroups() == null) ? 0 : getMetricGroups().hashCode());
        hashCode = prime * hashCode + ((getStoppedActions() == null) ? 0 : getStoppedActions().hashCode());
        hashCode = prime * hashCode + ((getInstanceRoleArn() == null) ? 0 : getInstanceRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public FleetAttributes clone() {
        try {
            return (FleetAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.FleetAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
