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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class CreateFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Descriptive label associated with a fleet. Fleet names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Human-readable description of a fleet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Unique identifier of the build to be deployed on the new fleet. The build must have been successfully uploaded to
     * GameLift and be in a <code>READY</code> status. This fleet setting cannot be changed once the fleet is created.
     * </p>
     */
    private String buildId;
    /**
     * <p>
     * This parameter is no longer used. Instead, specify a server launch path using the
     * <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.)
     * </p>
     */
    private String serverLaunchPath;
    /**
     * <p>
     * This parameter is no longer used. Instead, specify server launch parameters in the
     * <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.)
     * </p>
     */
    private String serverLaunchParameters;
    /**
     * <p>
     * Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any log
     * files in this location. These logs are in addition to game session logs; see more on game session logs in the <a
     * href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, GameLift will
     * automatically upload logs stored on each instance at <code>C:\game\logs</code>. Use the GameLift console to
     * access stored logs.
     * </p>
     */
    private java.util.List<String> logPaths;
    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions.
     * </p>
     */
    private String eC2InstanceType;
    /**
     * <p>
     * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the
     * fleet. If no inbound permissions are set, including both IP address range and port range, the server processes in
     * the fleet cannot accept connections. You can specify one or more sets of permissions for a fleet.
     * </p>
     */
    private java.util.List<IpPermission> eC2InboundPermissions;
    /**
     * <p>
     * Game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances
     * in this fleet default to no protection. You can change a fleet's protection policy using UpdateFleetAttributes,
     * but this change will only affect sessions created after the policy change. You can also set protection for
     * individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> – The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> – If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during a
     * scale-down event.
     * </p>
     * </li>
     * </ul>
     */
    private String newGameSessionProtectionPolicy;
    /**
     * <p>
     * Instructions for launching server processes on each instance in the fleet. The runtime configuration for a fleet
     * has a collection of server process configurations, one for each type of server process to run on an instance. A
     * server process configuration specifies the location of the server executable, launch parameters, and the number
     * of concurrent processes with that configuration to maintain on each instance. A <code>CreateFleet</code> request
     * must include a runtime configuration with at least one server process configuration; otherwise the request will
     * fail with an invalid request exception. (This parameter replaces the parameters <code>ServerLaunchPath</code> and
     * <code>ServerLaunchParameters</code>; requests that contain values for these parameters instead of a runtime
     * configuration will continue to work.)
     * </p>
     */
    private RuntimeConfiguration runtimeConfiguration;
    /**
     * <p>
     * Policy that limits the number of game sessions an individual player can create over a span of time for this
     * fleet.
     * </p>
     */
    private ResourceCreationLimitPolicy resourceCreationLimitPolicy;

    /**
     * <p>
     * Descriptive label associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with a fleet. Fleet names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Descriptive label associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @return Descriptive label associated with a fleet. Fleet names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Descriptive label associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @param name
     *        Descriptive label associated with a fleet. Fleet names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Human-readable description of a fleet.
     * </p>
     * 
     * @param description
     *        Human-readable description of a fleet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Human-readable description of a fleet.
     * </p>
     * 
     * @return Human-readable description of a fleet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Human-readable description of a fleet.
     * </p>
     * 
     * @param description
     *        Human-readable description of a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Unique identifier of the build to be deployed on the new fleet. The build must have been successfully uploaded to
     * GameLift and be in a <code>READY</code> status. This fleet setting cannot be changed once the fleet is created.
     * </p>
     * 
     * @param buildId
     *        Unique identifier of the build to be deployed on the new fleet. The build must have been successfully
     *        uploaded to GameLift and be in a <code>READY</code> status. This fleet setting cannot be changed once the
     *        fleet is created.
     */

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    /**
     * <p>
     * Unique identifier of the build to be deployed on the new fleet. The build must have been successfully uploaded to
     * GameLift and be in a <code>READY</code> status. This fleet setting cannot be changed once the fleet is created.
     * </p>
     * 
     * @return Unique identifier of the build to be deployed on the new fleet. The build must have been successfully
     *         uploaded to GameLift and be in a <code>READY</code> status. This fleet setting cannot be changed once the
     *         fleet is created.
     */

    public String getBuildId() {
        return this.buildId;
    }

    /**
     * <p>
     * Unique identifier of the build to be deployed on the new fleet. The build must have been successfully uploaded to
     * GameLift and be in a <code>READY</code> status. This fleet setting cannot be changed once the fleet is created.
     * </p>
     * 
     * @param buildId
     *        Unique identifier of the build to be deployed on the new fleet. The build must have been successfully
     *        uploaded to GameLift and be in a <code>READY</code> status. This fleet setting cannot be changed once the
     *        fleet is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withBuildId(String buildId) {
        setBuildId(buildId);
        return this;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, specify a server launch path using the
     * <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.)
     * </p>
     * 
     * @param serverLaunchPath
     *        This parameter is no longer used. Instead, specify a server launch path using the
     *        <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch
     *        parameters instead of a runtime configuration will continue to work.)
     */

    public void setServerLaunchPath(String serverLaunchPath) {
        this.serverLaunchPath = serverLaunchPath;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, specify a server launch path using the
     * <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.)
     * </p>
     * 
     * @return This parameter is no longer used. Instead, specify a server launch path using the
     *         <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch
     *         parameters instead of a runtime configuration will continue to work.)
     */

    public String getServerLaunchPath() {
        return this.serverLaunchPath;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, specify a server launch path using the
     * <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.)
     * </p>
     * 
     * @param serverLaunchPath
     *        This parameter is no longer used. Instead, specify a server launch path using the
     *        <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch
     *        parameters instead of a runtime configuration will continue to work.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withServerLaunchPath(String serverLaunchPath) {
        setServerLaunchPath(serverLaunchPath);
        return this;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, specify server launch parameters in the
     * <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.)
     * </p>
     * 
     * @param serverLaunchParameters
     *        This parameter is no longer used. Instead, specify server launch parameters in the
     *        <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch
     *        parameters instead of a runtime configuration will continue to work.)
     */

    public void setServerLaunchParameters(String serverLaunchParameters) {
        this.serverLaunchParameters = serverLaunchParameters;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, specify server launch parameters in the
     * <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.)
     * </p>
     * 
     * @return This parameter is no longer used. Instead, specify server launch parameters in the
     *         <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch
     *         parameters instead of a runtime configuration will continue to work.)
     */

    public String getServerLaunchParameters() {
        return this.serverLaunchParameters;
    }

    /**
     * <p>
     * This parameter is no longer used. Instead, specify server launch parameters in the
     * <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch parameters
     * instead of a runtime configuration will continue to work.)
     * </p>
     * 
     * @param serverLaunchParameters
     *        This parameter is no longer used. Instead, specify server launch parameters in the
     *        <code>RuntimeConfiguration</code> parameter. (Requests that specify a server launch path and launch
     *        parameters instead of a runtime configuration will continue to work.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withServerLaunchParameters(String serverLaunchParameters) {
        setServerLaunchParameters(serverLaunchParameters);
        return this;
    }

    /**
     * <p>
     * Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any log
     * files in this location. These logs are in addition to game session logs; see more on game session logs in the <a
     * href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, GameLift will
     * automatically upload logs stored on each instance at <code>C:\game\logs</code>. Use the GameLift console to
     * access stored logs.
     * </p>
     * 
     * @return Location of default log files. When a server process is shut down, Amazon GameLift captures and stores
     *         any log files in this location. These logs are in addition to game session logs; see more on game session
     *         logs in the <a href=
     *         "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     *         >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, GameLift will
     *         automatically upload logs stored on each instance at <code>C:\game\logs</code>. Use the GameLift console
     *         to access stored logs.
     */

    public java.util.List<String> getLogPaths() {
        return logPaths;
    }

    /**
     * <p>
     * Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any log
     * files in this location. These logs are in addition to game session logs; see more on game session logs in the <a
     * href=
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, GameLift will
     * automatically upload logs stored on each instance at <code>C:\game\logs</code>. Use the GameLift console to
     * access stored logs.
     * </p>
     * 
     * @param logPaths
     *        Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any
     *        log files in this location. These logs are in addition to game session logs; see more on game session logs
     *        in the <a href=
     *        "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     *        >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, GameLift will
     *        automatically upload logs stored on each instance at <code>C:\game\logs</code>. Use the GameLift console
     *        to access stored logs.
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
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, GameLift will
     * automatically upload logs stored on each instance at <code>C:\game\logs</code>. Use the GameLift console to
     * access stored logs.
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
     *        "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     *        >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, GameLift will
     *        automatically upload logs stored on each instance at <code>C:\game\logs</code>. Use the GameLift console
     *        to access stored logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withLogPaths(String... logPaths) {
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
     * "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     * >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, GameLift will
     * automatically upload logs stored on each instance at <code>C:\game\logs</code>. Use the GameLift console to
     * access stored logs.
     * </p>
     * 
     * @param logPaths
     *        Location of default log files. When a server process is shut down, Amazon GameLift captures and stores any
     *        log files in this location. These logs are in addition to game session logs; see more on game session logs
     *        in the <a href=
     *        "http://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-api-server-code"
     *        >Amazon GameLift Developer Guide</a>. If no default log path for a fleet is specified, GameLift will
     *        automatically upload logs stored on each instance at <code>C:\game\logs</code>. Use the GameLift console
     *        to access stored logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withLogPaths(java.util.Collection<String> logPaths) {
        setLogPaths(logPaths);
        return this;
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *        computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(String eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType;
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @return Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *         computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *         capacity. GameLift supports the following EC2 instance types. See <a
     *         href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public String getEC2InstanceType() {
        return this.eC2InstanceType;
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *        computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public CreateFleetRequest withEC2InstanceType(String eC2InstanceType) {
        setEC2InstanceType(eC2InstanceType);
        return this;
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *        computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(EC2InstanceType eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType.toString();
    }

    /**
     * <p>
     * Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the computing
     * resources of each instance in the fleet, including CPU, memory, storage, and networking capacity. GameLift
     * supports the following EC2 instance types. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2
     * Instance Types</a> for detailed descriptions.
     * </p>
     * 
     * @param eC2InstanceType
     *        Name of an EC2 instance type that is supported in Amazon GameLift. A fleet instance type determines the
     *        computing resources of each instance in the fleet, including CPU, memory, storage, and networking
     *        capacity. GameLift supports the following EC2 instance types. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 Instance Types</a> for detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public CreateFleetRequest withEC2InstanceType(EC2InstanceType eC2InstanceType) {
        setEC2InstanceType(eC2InstanceType);
        return this;
    }

    /**
     * <p>
     * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the
     * fleet. If no inbound permissions are set, including both IP address range and port range, the server processes in
     * the fleet cannot accept connections. You can specify one or more sets of permissions for a fleet.
     * </p>
     * 
     * @return Range of IP addresses and port settings that permit inbound traffic to access server processes running on
     *         the fleet. If no inbound permissions are set, including both IP address range and port range, the server
     *         processes in the fleet cannot accept connections. You can specify one or more sets of permissions for a
     *         fleet.
     */

    public java.util.List<IpPermission> getEC2InboundPermissions() {
        return eC2InboundPermissions;
    }

    /**
     * <p>
     * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the
     * fleet. If no inbound permissions are set, including both IP address range and port range, the server processes in
     * the fleet cannot accept connections. You can specify one or more sets of permissions for a fleet.
     * </p>
     * 
     * @param eC2InboundPermissions
     *        Range of IP addresses and port settings that permit inbound traffic to access server processes running on
     *        the fleet. If no inbound permissions are set, including both IP address range and port range, the server
     *        processes in the fleet cannot accept connections. You can specify one or more sets of permissions for a
     *        fleet.
     */

    public void setEC2InboundPermissions(java.util.Collection<IpPermission> eC2InboundPermissions) {
        if (eC2InboundPermissions == null) {
            this.eC2InboundPermissions = null;
            return;
        }

        this.eC2InboundPermissions = new java.util.ArrayList<IpPermission>(eC2InboundPermissions);
    }

    /**
     * <p>
     * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the
     * fleet. If no inbound permissions are set, including both IP address range and port range, the server processes in
     * the fleet cannot accept connections. You can specify one or more sets of permissions for a fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEC2InboundPermissions(java.util.Collection)} or
     * {@link #withEC2InboundPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param eC2InboundPermissions
     *        Range of IP addresses and port settings that permit inbound traffic to access server processes running on
     *        the fleet. If no inbound permissions are set, including both IP address range and port range, the server
     *        processes in the fleet cannot accept connections. You can specify one or more sets of permissions for a
     *        fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withEC2InboundPermissions(IpPermission... eC2InboundPermissions) {
        if (this.eC2InboundPermissions == null) {
            setEC2InboundPermissions(new java.util.ArrayList<IpPermission>(eC2InboundPermissions.length));
        }
        for (IpPermission ele : eC2InboundPermissions) {
            this.eC2InboundPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Range of IP addresses and port settings that permit inbound traffic to access server processes running on the
     * fleet. If no inbound permissions are set, including both IP address range and port range, the server processes in
     * the fleet cannot accept connections. You can specify one or more sets of permissions for a fleet.
     * </p>
     * 
     * @param eC2InboundPermissions
     *        Range of IP addresses and port settings that permit inbound traffic to access server processes running on
     *        the fleet. If no inbound permissions are set, including both IP address range and port range, the server
     *        processes in the fleet cannot accept connections. You can specify one or more sets of permissions for a
     *        fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withEC2InboundPermissions(java.util.Collection<IpPermission> eC2InboundPermissions) {
        setEC2InboundPermissions(eC2InboundPermissions);
        return this;
    }

    /**
     * <p>
     * Game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances
     * in this fleet default to no protection. You can change a fleet's protection policy using UpdateFleetAttributes,
     * but this change will only affect sessions created after the policy change. You can also set protection for
     * individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> – The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> – If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during a
     * scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        Game session protection policy to apply to all instances in this fleet. If this parameter is not set,
     *        instances in this fleet default to no protection. You can change a fleet's protection policy using
     *        UpdateFleetAttributes, but this change will only affect sessions created after the policy change. You can
     *        also set protection for individual instances using <a>UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> – The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> – If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
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
     * Game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances
     * in this fleet default to no protection. You can change a fleet's protection policy using UpdateFleetAttributes,
     * but this change will only affect sessions created after the policy change. You can also set protection for
     * individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> – The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> – If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during a
     * scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Game session protection policy to apply to all instances in this fleet. If this parameter is not set,
     *         instances in this fleet default to no protection. You can change a fleet's protection policy using
     *         UpdateFleetAttributes, but this change will only affect sessions created after the policy change. You can
     *         also set protection for individual instances using <a>UpdateGameSession</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NoProtection</b> – The game session can be terminated during a scale-down event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FullProtection</b> – If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
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
     * Game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances
     * in this fleet default to no protection. You can change a fleet's protection policy using UpdateFleetAttributes,
     * but this change will only affect sessions created after the policy change. You can also set protection for
     * individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> – The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> – If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during a
     * scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        Game session protection policy to apply to all instances in this fleet. If this parameter is not set,
     *        instances in this fleet default to no protection. You can change a fleet's protection policy using
     *        UpdateFleetAttributes, but this change will only affect sessions created after the policy change. You can
     *        also set protection for individual instances using <a>UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> – The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> – If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionPolicy
     */

    public CreateFleetRequest withNewGameSessionProtectionPolicy(String newGameSessionProtectionPolicy) {
        setNewGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
        return this;
    }

    /**
     * <p>
     * Game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances
     * in this fleet default to no protection. You can change a fleet's protection policy using UpdateFleetAttributes,
     * but this change will only affect sessions created after the policy change. You can also set protection for
     * individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> – The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> – If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during a
     * scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        Game session protection policy to apply to all instances in this fleet. If this parameter is not set,
     *        instances in this fleet default to no protection. You can change a fleet's protection policy using
     *        UpdateFleetAttributes, but this change will only affect sessions created after the policy change. You can
     *        also set protection for individual instances using <a>UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> – The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> – If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @see ProtectionPolicy
     */

    public void setNewGameSessionProtectionPolicy(ProtectionPolicy newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy.toString();
    }

    /**
     * <p>
     * Game session protection policy to apply to all instances in this fleet. If this parameter is not set, instances
     * in this fleet default to no protection. You can change a fleet's protection policy using UpdateFleetAttributes,
     * but this change will only affect sessions created after the policy change. You can also set protection for
     * individual instances using <a>UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> – The game session can be terminated during a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> – If the game session is in an <code>ACTIVE</code> status, it cannot be terminated during a
     * scale-down event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        Game session protection policy to apply to all instances in this fleet. If this parameter is not set,
     *        instances in this fleet default to no protection. You can change a fleet's protection policy using
     *        UpdateFleetAttributes, but this change will only affect sessions created after the policy change. You can
     *        also set protection for individual instances using <a>UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> – The game session can be terminated during a scale-down event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> – If the game session is in an <code>ACTIVE</code> status, it cannot be terminated
     *        during a scale-down event.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionPolicy
     */

    public CreateFleetRequest withNewGameSessionProtectionPolicy(ProtectionPolicy newGameSessionProtectionPolicy) {
        setNewGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
        return this;
    }

    /**
     * <p>
     * Instructions for launching server processes on each instance in the fleet. The runtime configuration for a fleet
     * has a collection of server process configurations, one for each type of server process to run on an instance. A
     * server process configuration specifies the location of the server executable, launch parameters, and the number
     * of concurrent processes with that configuration to maintain on each instance. A <code>CreateFleet</code> request
     * must include a runtime configuration with at least one server process configuration; otherwise the request will
     * fail with an invalid request exception. (This parameter replaces the parameters <code>ServerLaunchPath</code> and
     * <code>ServerLaunchParameters</code>; requests that contain values for these parameters instead of a runtime
     * configuration will continue to work.)
     * </p>
     * 
     * @param runtimeConfiguration
     *        Instructions for launching server processes on each instance in the fleet. The runtime configuration for a
     *        fleet has a collection of server process configurations, one for each type of server process to run on an
     *        instance. A server process configuration specifies the location of the server executable, launch
     *        parameters, and the number of concurrent processes with that configuration to maintain on each instance. A
     *        <code>CreateFleet</code> request must include a runtime configuration with at least one server process
     *        configuration; otherwise the request will fail with an invalid request exception. (This parameter replaces
     *        the parameters <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code>; requests that
     *        contain values for these parameters instead of a runtime configuration will continue to work.)
     */

    public void setRuntimeConfiguration(RuntimeConfiguration runtimeConfiguration) {
        this.runtimeConfiguration = runtimeConfiguration;
    }

    /**
     * <p>
     * Instructions for launching server processes on each instance in the fleet. The runtime configuration for a fleet
     * has a collection of server process configurations, one for each type of server process to run on an instance. A
     * server process configuration specifies the location of the server executable, launch parameters, and the number
     * of concurrent processes with that configuration to maintain on each instance. A <code>CreateFleet</code> request
     * must include a runtime configuration with at least one server process configuration; otherwise the request will
     * fail with an invalid request exception. (This parameter replaces the parameters <code>ServerLaunchPath</code> and
     * <code>ServerLaunchParameters</code>; requests that contain values for these parameters instead of a runtime
     * configuration will continue to work.)
     * </p>
     * 
     * @return Instructions for launching server processes on each instance in the fleet. The runtime configuration for
     *         a fleet has a collection of server process configurations, one for each type of server process to run on
     *         an instance. A server process configuration specifies the location of the server executable, launch
     *         parameters, and the number of concurrent processes with that configuration to maintain on each instance.
     *         A <code>CreateFleet</code> request must include a runtime configuration with at least one server process
     *         configuration; otherwise the request will fail with an invalid request exception. (This parameter
     *         replaces the parameters <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code>; requests
     *         that contain values for these parameters instead of a runtime configuration will continue to work.)
     */

    public RuntimeConfiguration getRuntimeConfiguration() {
        return this.runtimeConfiguration;
    }

    /**
     * <p>
     * Instructions for launching server processes on each instance in the fleet. The runtime configuration for a fleet
     * has a collection of server process configurations, one for each type of server process to run on an instance. A
     * server process configuration specifies the location of the server executable, launch parameters, and the number
     * of concurrent processes with that configuration to maintain on each instance. A <code>CreateFleet</code> request
     * must include a runtime configuration with at least one server process configuration; otherwise the request will
     * fail with an invalid request exception. (This parameter replaces the parameters <code>ServerLaunchPath</code> and
     * <code>ServerLaunchParameters</code>; requests that contain values for these parameters instead of a runtime
     * configuration will continue to work.)
     * </p>
     * 
     * @param runtimeConfiguration
     *        Instructions for launching server processes on each instance in the fleet. The runtime configuration for a
     *        fleet has a collection of server process configurations, one for each type of server process to run on an
     *        instance. A server process configuration specifies the location of the server executable, launch
     *        parameters, and the number of concurrent processes with that configuration to maintain on each instance. A
     *        <code>CreateFleet</code> request must include a runtime configuration with at least one server process
     *        configuration; otherwise the request will fail with an invalid request exception. (This parameter replaces
     *        the parameters <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code>; requests that
     *        contain values for these parameters instead of a runtime configuration will continue to work.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withRuntimeConfiguration(RuntimeConfiguration runtimeConfiguration) {
        setRuntimeConfiguration(runtimeConfiguration);
        return this;
    }

    /**
     * <p>
     * Policy that limits the number of game sessions an individual player can create over a span of time for this
     * fleet.
     * </p>
     * 
     * @param resourceCreationLimitPolicy
     *        Policy that limits the number of game sessions an individual player can create over a span of time for
     *        this fleet.
     */

    public void setResourceCreationLimitPolicy(ResourceCreationLimitPolicy resourceCreationLimitPolicy) {
        this.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
    }

    /**
     * <p>
     * Policy that limits the number of game sessions an individual player can create over a span of time for this
     * fleet.
     * </p>
     * 
     * @return Policy that limits the number of game sessions an individual player can create over a span of time for
     *         this fleet.
     */

    public ResourceCreationLimitPolicy getResourceCreationLimitPolicy() {
        return this.resourceCreationLimitPolicy;
    }

    /**
     * <p>
     * Policy that limits the number of game sessions an individual player can create over a span of time for this
     * fleet.
     * </p>
     * 
     * @param resourceCreationLimitPolicy
     *        Policy that limits the number of game sessions an individual player can create over a span of time for
     *        this fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withResourceCreationLimitPolicy(ResourceCreationLimitPolicy resourceCreationLimitPolicy) {
        setResourceCreationLimitPolicy(resourceCreationLimitPolicy);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("Name: " + getName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getBuildId() != null)
            sb.append("BuildId: " + getBuildId() + ",");
        if (getServerLaunchPath() != null)
            sb.append("ServerLaunchPath: " + getServerLaunchPath() + ",");
        if (getServerLaunchParameters() != null)
            sb.append("ServerLaunchParameters: " + getServerLaunchParameters() + ",");
        if (getLogPaths() != null)
            sb.append("LogPaths: " + getLogPaths() + ",");
        if (getEC2InstanceType() != null)
            sb.append("EC2InstanceType: " + getEC2InstanceType() + ",");
        if (getEC2InboundPermissions() != null)
            sb.append("EC2InboundPermissions: " + getEC2InboundPermissions() + ",");
        if (getNewGameSessionProtectionPolicy() != null)
            sb.append("NewGameSessionProtectionPolicy: " + getNewGameSessionProtectionPolicy() + ",");
        if (getRuntimeConfiguration() != null)
            sb.append("RuntimeConfiguration: " + getRuntimeConfiguration() + ",");
        if (getResourceCreationLimitPolicy() != null)
            sb.append("ResourceCreationLimitPolicy: " + getResourceCreationLimitPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetRequest == false)
            return false;
        CreateFleetRequest other = (CreateFleetRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getBuildId() == null ^ this.getBuildId() == null)
            return false;
        if (other.getBuildId() != null && other.getBuildId().equals(this.getBuildId()) == false)
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
        if (other.getEC2InstanceType() == null ^ this.getEC2InstanceType() == null)
            return false;
        if (other.getEC2InstanceType() != null && other.getEC2InstanceType().equals(this.getEC2InstanceType()) == false)
            return false;
        if (other.getEC2InboundPermissions() == null ^ this.getEC2InboundPermissions() == null)
            return false;
        if (other.getEC2InboundPermissions() != null && other.getEC2InboundPermissions().equals(this.getEC2InboundPermissions()) == false)
            return false;
        if (other.getNewGameSessionProtectionPolicy() == null ^ this.getNewGameSessionProtectionPolicy() == null)
            return false;
        if (other.getNewGameSessionProtectionPolicy() != null
                && other.getNewGameSessionProtectionPolicy().equals(this.getNewGameSessionProtectionPolicy()) == false)
            return false;
        if (other.getRuntimeConfiguration() == null ^ this.getRuntimeConfiguration() == null)
            return false;
        if (other.getRuntimeConfiguration() != null && other.getRuntimeConfiguration().equals(this.getRuntimeConfiguration()) == false)
            return false;
        if (other.getResourceCreationLimitPolicy() == null ^ this.getResourceCreationLimitPolicy() == null)
            return false;
        if (other.getResourceCreationLimitPolicy() != null && other.getResourceCreationLimitPolicy().equals(this.getResourceCreationLimitPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getBuildId() == null) ? 0 : getBuildId().hashCode());
        hashCode = prime * hashCode + ((getServerLaunchPath() == null) ? 0 : getServerLaunchPath().hashCode());
        hashCode = prime * hashCode + ((getServerLaunchParameters() == null) ? 0 : getServerLaunchParameters().hashCode());
        hashCode = prime * hashCode + ((getLogPaths() == null) ? 0 : getLogPaths().hashCode());
        hashCode = prime * hashCode + ((getEC2InstanceType() == null) ? 0 : getEC2InstanceType().hashCode());
        hashCode = prime * hashCode + ((getEC2InboundPermissions() == null) ? 0 : getEC2InboundPermissions().hashCode());
        hashCode = prime * hashCode + ((getNewGameSessionProtectionPolicy() == null) ? 0 : getNewGameSessionProtectionPolicy().hashCode());
        hashCode = prime * hashCode + ((getRuntimeConfiguration() == null) ? 0 : getRuntimeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getResourceCreationLimitPolicy() == null) ? 0 : getResourceCreationLimitPolicy().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetRequest clone() {
        return (CreateFleetRequest) super.clone();
    }
}
