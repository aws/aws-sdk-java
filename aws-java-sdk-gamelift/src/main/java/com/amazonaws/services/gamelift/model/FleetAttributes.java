/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes a GameLift fleet of game hosting resources.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/FleetAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FleetAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the fleet.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. In a
     * GameLift fleet ARN, the resource ID matches the <code>FleetId</code> value.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     * <code>ON_DEMAND</code>. Learn more about when to use <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>. This property cannot be changed after the fleet is created.
     * </p>
     */
    private String fleetType;
    /**
     * <p>
     * The Amazon EC2 instance type that determines the computing resources of each instance in the fleet. Instance type
     * defines the CPU, memory, storage, and networking capacity. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud Instance Types</a> for detailed
     * descriptions.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * A human-readable description of the fleet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     */
    private java.util.Date terminationTime;
    /**
     * <p>
     * Current status of the fleet. Possible fleet statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- GameLift is setting up the new fleet, creating new instances
     * with the game build or Realtime script and starting server processes.
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
     * A unique identifier for the build resource that is deployed on instances in this fleet.
     * </p>
     */
    private String buildId;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift build resource that is deployed on instances in this fleet. In a GameLift build ARN,
     * the resource ID matches the <code>BuildId</code> value.
     * </p>
     */
    private String buildArn;
    /**
     * <p>
     * A unique identifier for the Realtime script resource that is deployed on instances in this fleet.
     * </p>
     */
    private String scriptId;
    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift script resource that is deployed on instances in this fleet. In a GameLift script
     * ARN, the resource ID matches the <code>ScriptId</code> value.
     * </p>
     */
    private String scriptArn;
    /**
     * <p>
     * <b>This parameter is no longer used.</b> Server launch paths are now defined using the fleet's <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/RuntimeConfiguration.html"
     * >RuntimeConfiguration</a> . Requests that use this parameter instead continue to be valid.
     * </p>
     */
    private String serverLaunchPath;
    /**
     * <p>
     * <b>This parameter is no longer used.</b> Server launch parameters are now defined using the fleet's runtime
     * configuration . Requests that use this parameter instead continue to be valid.
     * </p>
     */
    private String serverLaunchParameters;
    /**
     * <p>
     * <b>This parameter is no longer used.</b> Game session log paths are now defined using the GameLift server API
     * <code>ProcessReady()</code> <code>logParameters</code>. See more information in the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     * >Server API Reference</a>.
     * </p>
     */
    private java.util.List<String> logPaths;
    /**
     * <p>
     * The type of game session protection to set on all new instances that are started in the fleet.
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
     * The operating system of the fleet's computing resources. A fleet's operating system is determined by the OS of
     * the build or script that is deployed on this fleet.
     * </p>
     */
    private String operatingSystem;

    private ResourceCreationLimitPolicy resourceCreationLimitPolicy;
    /**
     * <p>
     * Name of a metric group that metrics for this fleet are added to. In Amazon CloudWatch, you can view aggregated
     * metrics for fleets that are in a metric group. A fleet can be included in only one metric group at a time.
     * </p>
     */
    private java.util.List<String> metricGroups;
    /**
     * <p>
     * A list of fleet activity that has been suspended using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html">StopFleetActions</a> .
     * This includes fleet auto-scaling.
     * </p>
     */
    private java.util.List<String> stoppedActions;
    /**
     * <p>
     * A unique identifier for an IAM role that manages access to your Amazon Web Services services. With an instance
     * role ARN set, any application that runs on an instance in this fleet can assume the role, including install
     * scripts, server processes, and daemons (background processes). Create a role or look up a role's ARN by using the
     * <a href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the Amazon Web Services Management Console.
     * Learn more about using on-box credentials for your game servers at <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Access
     * external resources from a game server</a>.
     * </p>
     */
    private String instanceRoleArn;

    private CertificateConfiguration certificateConfiguration;
    /**
     * <p>
     * The type of compute resource used to host your game servers. You can use your own compute resources with GameLift
     * Anywhere or use Amazon EC2 instances with managed GameLift.
     * </p>
     */
    private String computeType;

    private AnywhereConfiguration anywhereConfiguration;

    /**
     * <p>
     * A unique identifier for the fleet.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet.
     * </p>
     * 
     * @return A unique identifier for the fleet.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. In a
     * GameLift fleet ARN, the resource ID matches the <code>FleetId</code> value.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. In a
     *        GameLift fleet ARN, the resource ID matches the <code>FleetId</code> value.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. In a
     * GameLift fleet ARN, the resource ID matches the <code>FleetId</code> value.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *         GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *         <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. In a
     *         GameLift fleet ARN, the resource ID matches the <code>FleetId</code> value.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * that is assigned to a GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions.
     * Format is <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. In a
     * GameLift fleet ARN, the resource ID matches the <code>FleetId</code> value.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) that is assigned to a
     *        GameLift fleet resource and uniquely identifies it. ARNs are unique across all Regions. Format is
     *        <code>arn:aws:gamelift:&lt;region&gt;::fleet/fleet-a1234567-b8c9-0d1e-2fa3-b45c6d7e8912</code>. In a
     *        GameLift fleet ARN, the resource ID matches the <code>FleetId</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     * <code>ON_DEMAND</code>. Learn more about when to use <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>. This property cannot be changed after the fleet is created.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     *        <code>ON_DEMAND</code>. Learn more about when to use <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *        > On-Demand versus Spot Instances</a>. This property cannot be changed after the fleet is created.
     * @see FleetType
     */

    public void setFleetType(String fleetType) {
        this.fleetType = fleetType;
    }

    /**
     * <p>
     * Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     * <code>ON_DEMAND</code>. Learn more about when to use <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>. This property cannot be changed after the fleet is created.
     * </p>
     * 
     * @return Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     *         <code>ON_DEMAND</code>. Learn more about when to use <a href=
     *         "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *         > On-Demand versus Spot Instances</a>. This property cannot be changed after the fleet is created.
     * @see FleetType
     */

    public String getFleetType() {
        return this.fleetType;
    }

    /**
     * <p>
     * Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     * <code>ON_DEMAND</code>. Learn more about when to use <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>. This property cannot be changed after the fleet is created.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     *        <code>ON_DEMAND</code>. Learn more about when to use <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *        > On-Demand versus Spot Instances</a>. This property cannot be changed after the fleet is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public FleetAttributes withFleetType(String fleetType) {
        setFleetType(fleetType);
        return this;
    }

    /**
     * <p>
     * Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     * <code>ON_DEMAND</code>. Learn more about when to use <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>. This property cannot be changed after the fleet is created.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     *        <code>ON_DEMAND</code>. Learn more about when to use <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *        > On-Demand versus Spot Instances</a>. This property cannot be changed after the fleet is created.
     * @see FleetType
     */

    public void setFleetType(FleetType fleetType) {
        withFleetType(fleetType);
    }

    /**
     * <p>
     * Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     * <code>ON_DEMAND</code>. Learn more about when to use <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>. This property cannot be changed after the fleet is created.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     *        <code>ON_DEMAND</code>. Learn more about when to use <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *        > On-Demand versus Spot Instances</a>. This property cannot be changed after the fleet is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public FleetAttributes withFleetType(FleetType fleetType) {
        this.fleetType = fleetType.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance type that determines the computing resources of each instance in the fleet. Instance type
     * defines the CPU, memory, storage, and networking capacity. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud Instance Types</a> for detailed
     * descriptions.
     * </p>
     * 
     * @param instanceType
     *        The Amazon EC2 instance type that determines the computing resources of each instance in the fleet.
     *        Instance type defines the CPU, memory, storage, and networking capacity. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud Instance Types</a> for
     *        detailed descriptions.
     * @see EC2InstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type that determines the computing resources of each instance in the fleet. Instance type
     * defines the CPU, memory, storage, and networking capacity. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud Instance Types</a> for detailed
     * descriptions.
     * </p>
     * 
     * @return The Amazon EC2 instance type that determines the computing resources of each instance in the fleet.
     *         Instance type defines the CPU, memory, storage, and networking capacity. See <a
     *         href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud Instance Types</a> for
     *         detailed descriptions.
     * @see EC2InstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type that determines the computing resources of each instance in the fleet. Instance type
     * defines the CPU, memory, storage, and networking capacity. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud Instance Types</a> for detailed
     * descriptions.
     * </p>
     * 
     * @param instanceType
     *        The Amazon EC2 instance type that determines the computing resources of each instance in the fleet.
     *        Instance type defines the CPU, memory, storage, and networking capacity. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud Instance Types</a> for
     *        detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public FleetAttributes withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance type that determines the computing resources of each instance in the fleet. Instance type
     * defines the CPU, memory, storage, and networking capacity. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud Instance Types</a> for detailed
     * descriptions.
     * </p>
     * 
     * @param instanceType
     *        The Amazon EC2 instance type that determines the computing resources of each instance in the fleet.
     *        Instance type defines the CPU, memory, storage, and networking capacity. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud Instance Types</a> for
     *        detailed descriptions.
     * @see EC2InstanceType
     */

    public void setInstanceType(EC2InstanceType instanceType) {
        withInstanceType(instanceType);
    }

    /**
     * <p>
     * The Amazon EC2 instance type that determines the computing resources of each instance in the fleet. Instance type
     * defines the CPU, memory, storage, and networking capacity. See <a
     * href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud Instance Types</a> for detailed
     * descriptions.
     * </p>
     * 
     * @param instanceType
     *        The Amazon EC2 instance type that determines the computing resources of each instance in the fleet.
     *        Instance type defines the CPU, memory, storage, and networking capacity. See <a
     *        href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud Instance Types</a> for
     *        detailed descriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public FleetAttributes withInstanceType(EC2InstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * A human-readable description of the fleet.
     * </p>
     * 
     * @param description
     *        A human-readable description of the fleet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A human-readable description of the fleet.
     * </p>
     * 
     * @return A human-readable description of the fleet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A human-readable description of the fleet.
     * </p>
     * 
     * @param description
     *        A human-readable description of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @return A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     * 
     * @param name
     *        A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @return A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *         milliseconds (for example <code>"1469498468.057"</code>).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param terminationTime
     *        A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     */

    public void setTerminationTime(java.util.Date terminationTime) {
        this.terminationTime = terminationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @return A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time
     *         as milliseconds (for example <code>"1469498468.057"</code>).
     */

    public java.util.Date getTerminationTime() {
        return this.terminationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param terminationTime
     *        A time stamp indicating when this data object was terminated. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withTerminationTime(java.util.Date terminationTime) {
        setTerminationTime(terminationTime);
        return this;
    }

    /**
     * <p>
     * Current status of the fleet. Possible fleet statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- GameLift is setting up the new fleet, creating new instances
     * with the game build or Realtime script and starting server processes.
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
     *        Current status of the fleet. Possible fleet statuses include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- GameLift is setting up the new fleet, creating new
     *        instances with the game build or Realtime script and starting server processes.
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
     * Current status of the fleet. Possible fleet statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- GameLift is setting up the new fleet, creating new instances
     * with the game build or Realtime script and starting server processes.
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
     * @return Current status of the fleet. Possible fleet statuses include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- GameLift is setting up the new fleet, creating new
     *         instances with the game build or Realtime script and starting server processes.
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
     * Current status of the fleet. Possible fleet statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- GameLift is setting up the new fleet, creating new instances
     * with the game build or Realtime script and starting server processes.
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
     *        Current status of the fleet. Possible fleet statuses include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- GameLift is setting up the new fleet, creating new
     *        instances with the game build or Realtime script and starting server processes.
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
     * Current status of the fleet. Possible fleet statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- GameLift is setting up the new fleet, creating new instances
     * with the game build or Realtime script and starting server processes.
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
     *        Current status of the fleet. Possible fleet statuses include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- GameLift is setting up the new fleet, creating new
     *        instances with the game build or Realtime script and starting server processes.
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
     * Current status of the fleet. Possible fleet statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- GameLift is setting up the new fleet, creating new instances
     * with the game build or Realtime script and starting server processes.
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
     *        Current status of the fleet. Possible fleet statuses include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NEW</b> -- A new fleet has been defined and desired instances is set to 1.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>DOWNLOADING/VALIDATING/BUILDING/ACTIVATING</b> -- GameLift is setting up the new fleet, creating new
     *        instances with the game build or Realtime script and starting server processes.
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
     * A unique identifier for the build resource that is deployed on instances in this fleet.
     * </p>
     * 
     * @param buildId
     *        A unique identifier for the build resource that is deployed on instances in this fleet.
     */

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    /**
     * <p>
     * A unique identifier for the build resource that is deployed on instances in this fleet.
     * </p>
     * 
     * @return A unique identifier for the build resource that is deployed on instances in this fleet.
     */

    public String getBuildId() {
        return this.buildId;
    }

    /**
     * <p>
     * A unique identifier for the build resource that is deployed on instances in this fleet.
     * </p>
     * 
     * @param buildId
     *        A unique identifier for the build resource that is deployed on instances in this fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withBuildId(String buildId) {
        setBuildId(buildId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift build resource that is deployed on instances in this fleet. In a GameLift build ARN,
     * the resource ID matches the <code>BuildId</code> value.
     * </p>
     * 
     * @param buildArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) associated with the
     *        GameLift build resource that is deployed on instances in this fleet. In a GameLift build ARN, the resource
     *        ID matches the <code>BuildId</code> value.
     */

    public void setBuildArn(String buildArn) {
        this.buildArn = buildArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift build resource that is deployed on instances in this fleet. In a GameLift build ARN,
     * the resource ID matches the <code>BuildId</code> value.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) associated with the
     *         GameLift build resource that is deployed on instances in this fleet. In a GameLift build ARN, the
     *         resource ID matches the <code>BuildId</code> value.
     */

    public String getBuildArn() {
        return this.buildArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift build resource that is deployed on instances in this fleet. In a GameLift build ARN,
     * the resource ID matches the <code>BuildId</code> value.
     * </p>
     * 
     * @param buildArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) associated with the
     *        GameLift build resource that is deployed on instances in this fleet. In a GameLift build ARN, the resource
     *        ID matches the <code>BuildId</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withBuildArn(String buildArn) {
        setBuildArn(buildArn);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the Realtime script resource that is deployed on instances in this fleet.
     * </p>
     * 
     * @param scriptId
     *        A unique identifier for the Realtime script resource that is deployed on instances in this fleet.
     */

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    /**
     * <p>
     * A unique identifier for the Realtime script resource that is deployed on instances in this fleet.
     * </p>
     * 
     * @return A unique identifier for the Realtime script resource that is deployed on instances in this fleet.
     */

    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * <p>
     * A unique identifier for the Realtime script resource that is deployed on instances in this fleet.
     * </p>
     * 
     * @param scriptId
     *        A unique identifier for the Realtime script resource that is deployed on instances in this fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withScriptId(String scriptId) {
        setScriptId(scriptId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift script resource that is deployed on instances in this fleet. In a GameLift script
     * ARN, the resource ID matches the <code>ScriptId</code> value.
     * </p>
     * 
     * @param scriptArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) associated with the
     *        GameLift script resource that is deployed on instances in this fleet. In a GameLift script ARN, the
     *        resource ID matches the <code>ScriptId</code> value.
     */

    public void setScriptArn(String scriptArn) {
        this.scriptArn = scriptArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift script resource that is deployed on instances in this fleet. In a GameLift script
     * ARN, the resource ID matches the <code>ScriptId</code> value.
     * </p>
     * 
     * @return The Amazon Resource Name (<a
     *         href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) associated with the
     *         GameLift script resource that is deployed on instances in this fleet. In a GameLift script ARN, the
     *         resource ID matches the <code>ScriptId</code> value.
     */

    public String getScriptArn() {
        return this.scriptArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (<a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>)
     * associated with the GameLift script resource that is deployed on instances in this fleet. In a GameLift script
     * ARN, the resource ID matches the <code>ScriptId</code> value.
     * </p>
     * 
     * @param scriptArn
     *        The Amazon Resource Name (<a
     *        href="https://docs.aws.amazon.com/AmazonS3/latest/dev/s3-arn-format.html">ARN</a>) associated with the
     *        GameLift script resource that is deployed on instances in this fleet. In a GameLift script ARN, the
     *        resource ID matches the <code>ScriptId</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withScriptArn(String scriptArn) {
        setScriptArn(scriptArn);
        return this;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Server launch paths are now defined using the fleet's <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/RuntimeConfiguration.html"
     * >RuntimeConfiguration</a> . Requests that use this parameter instead continue to be valid.
     * </p>
     * 
     * @param serverLaunchPath
     *        <b>This parameter is no longer used.</b> Server launch paths are now defined using the fleet's <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/apireference/RuntimeConfiguration.html"
     *        >RuntimeConfiguration</a> . Requests that use this parameter instead continue to be valid.
     */

    public void setServerLaunchPath(String serverLaunchPath) {
        this.serverLaunchPath = serverLaunchPath;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Server launch paths are now defined using the fleet's <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/RuntimeConfiguration.html"
     * >RuntimeConfiguration</a> . Requests that use this parameter instead continue to be valid.
     * </p>
     * 
     * @return <b>This parameter is no longer used.</b> Server launch paths are now defined using the fleet's <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/apireference/RuntimeConfiguration.html"
     *         >RuntimeConfiguration</a> . Requests that use this parameter instead continue to be valid.
     */

    public String getServerLaunchPath() {
        return this.serverLaunchPath;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Server launch paths are now defined using the fleet's <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/RuntimeConfiguration.html"
     * >RuntimeConfiguration</a> . Requests that use this parameter instead continue to be valid.
     * </p>
     * 
     * @param serverLaunchPath
     *        <b>This parameter is no longer used.</b> Server launch paths are now defined using the fleet's <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/apireference/RuntimeConfiguration.html"
     *        >RuntimeConfiguration</a> . Requests that use this parameter instead continue to be valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withServerLaunchPath(String serverLaunchPath) {
        setServerLaunchPath(serverLaunchPath);
        return this;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Server launch parameters are now defined using the fleet's runtime
     * configuration . Requests that use this parameter instead continue to be valid.
     * </p>
     * 
     * @param serverLaunchParameters
     *        <b>This parameter is no longer used.</b> Server launch parameters are now defined using the fleet's
     *        runtime configuration . Requests that use this parameter instead continue to be valid.
     */

    public void setServerLaunchParameters(String serverLaunchParameters) {
        this.serverLaunchParameters = serverLaunchParameters;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Server launch parameters are now defined using the fleet's runtime
     * configuration . Requests that use this parameter instead continue to be valid.
     * </p>
     * 
     * @return <b>This parameter is no longer used.</b> Server launch parameters are now defined using the fleet's
     *         runtime configuration . Requests that use this parameter instead continue to be valid.
     */

    public String getServerLaunchParameters() {
        return this.serverLaunchParameters;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Server launch parameters are now defined using the fleet's runtime
     * configuration . Requests that use this parameter instead continue to be valid.
     * </p>
     * 
     * @param serverLaunchParameters
     *        <b>This parameter is no longer used.</b> Server launch parameters are now defined using the fleet's
     *        runtime configuration . Requests that use this parameter instead continue to be valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withServerLaunchParameters(String serverLaunchParameters) {
        setServerLaunchParameters(serverLaunchParameters);
        return this;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Game session log paths are now defined using the GameLift server API
     * <code>ProcessReady()</code> <code>logParameters</code>. See more information in the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     * >Server API Reference</a>.
     * </p>
     * 
     * @return <b>This parameter is no longer used.</b> Game session log paths are now defined using the GameLift server
     *         API <code>ProcessReady()</code> <code>logParameters</code>. See more information in the <a href=
     *         "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     *         >Server API Reference</a>.
     */

    public java.util.List<String> getLogPaths() {
        return logPaths;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Game session log paths are now defined using the GameLift server API
     * <code>ProcessReady()</code> <code>logParameters</code>. See more information in the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     * >Server API Reference</a>.
     * </p>
     * 
     * @param logPaths
     *        <b>This parameter is no longer used.</b> Game session log paths are now defined using the GameLift server
     *        API <code>ProcessReady()</code> <code>logParameters</code>. See more information in the <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     *        >Server API Reference</a>.
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
     * <b>This parameter is no longer used.</b> Game session log paths are now defined using the GameLift server API
     * <code>ProcessReady()</code> <code>logParameters</code>. See more information in the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     * >Server API Reference</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogPaths(java.util.Collection)} or {@link #withLogPaths(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param logPaths
     *        <b>This parameter is no longer used.</b> Game session log paths are now defined using the GameLift server
     *        API <code>ProcessReady()</code> <code>logParameters</code>. See more information in the <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     *        >Server API Reference</a>.
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
     * <b>This parameter is no longer used.</b> Game session log paths are now defined using the GameLift server API
     * <code>ProcessReady()</code> <code>logParameters</code>. See more information in the <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     * >Server API Reference</a>.
     * </p>
     * 
     * @param logPaths
     *        <b>This parameter is no longer used.</b> Game session log paths are now defined using the GameLift server
     *        API <code>ProcessReady()</code> <code>logParameters</code>. See more information in the <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api-ref.html#gamelift-sdk-server-api-ref-dataypes-process"
     *        >Server API Reference</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withLogPaths(java.util.Collection<String> logPaths) {
        setLogPaths(logPaths);
        return this;
    }

    /**
     * <p>
     * The type of game session protection to set on all new instances that are started in the fleet.
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
     *        The type of game session protection to set on all new instances that are started in the fleet.</p>
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
     * The type of game session protection to set on all new instances that are started in the fleet.
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
     * @return The type of game session protection to set on all new instances that are started in the fleet.</p>
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
     * The type of game session protection to set on all new instances that are started in the fleet.
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
     *        The type of game session protection to set on all new instances that are started in the fleet.</p>
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
     * The type of game session protection to set on all new instances that are started in the fleet.
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
     *        The type of game session protection to set on all new instances that are started in the fleet.</p>
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
     * The type of game session protection to set on all new instances that are started in the fleet.
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
     *        The type of game session protection to set on all new instances that are started in the fleet.</p>
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
     * The operating system of the fleet's computing resources. A fleet's operating system is determined by the OS of
     * the build or script that is deployed on this fleet.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system of the fleet's computing resources. A fleet's operating system is determined by the
     *        OS of the build or script that is deployed on this fleet.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The operating system of the fleet's computing resources. A fleet's operating system is determined by the OS of
     * the build or script that is deployed on this fleet.
     * </p>
     * 
     * @return The operating system of the fleet's computing resources. A fleet's operating system is determined by the
     *         OS of the build or script that is deployed on this fleet.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The operating system of the fleet's computing resources. A fleet's operating system is determined by the OS of
     * the build or script that is deployed on this fleet.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system of the fleet's computing resources. A fleet's operating system is determined by the
     *        OS of the build or script that is deployed on this fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public FleetAttributes withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The operating system of the fleet's computing resources. A fleet's operating system is determined by the OS of
     * the build or script that is deployed on this fleet.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system of the fleet's computing resources. A fleet's operating system is determined by the
     *        OS of the build or script that is deployed on this fleet.
     * @see OperatingSystem
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        withOperatingSystem(operatingSystem);
    }

    /**
     * <p>
     * The operating system of the fleet's computing resources. A fleet's operating system is determined by the OS of
     * the build or script that is deployed on this fleet.
     * </p>
     * 
     * @param operatingSystem
     *        The operating system of the fleet's computing resources. A fleet's operating system is determined by the
     *        OS of the build or script that is deployed on this fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public FleetAttributes withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * @param resourceCreationLimitPolicy
     */

    public void setResourceCreationLimitPolicy(ResourceCreationLimitPolicy resourceCreationLimitPolicy) {
        this.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
    }

    /**
     * @return
     */

    public ResourceCreationLimitPolicy getResourceCreationLimitPolicy() {
        return this.resourceCreationLimitPolicy;
    }

    /**
     * @param resourceCreationLimitPolicy
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withResourceCreationLimitPolicy(ResourceCreationLimitPolicy resourceCreationLimitPolicy) {
        setResourceCreationLimitPolicy(resourceCreationLimitPolicy);
        return this;
    }

    /**
     * <p>
     * Name of a metric group that metrics for this fleet are added to. In Amazon CloudWatch, you can view aggregated
     * metrics for fleets that are in a metric group. A fleet can be included in only one metric group at a time.
     * </p>
     * 
     * @return Name of a metric group that metrics for this fleet are added to. In Amazon CloudWatch, you can view
     *         aggregated metrics for fleets that are in a metric group. A fleet can be included in only one metric
     *         group at a time.
     */

    public java.util.List<String> getMetricGroups() {
        return metricGroups;
    }

    /**
     * <p>
     * Name of a metric group that metrics for this fleet are added to. In Amazon CloudWatch, you can view aggregated
     * metrics for fleets that are in a metric group. A fleet can be included in only one metric group at a time.
     * </p>
     * 
     * @param metricGroups
     *        Name of a metric group that metrics for this fleet are added to. In Amazon CloudWatch, you can view
     *        aggregated metrics for fleets that are in a metric group. A fleet can be included in only one metric group
     *        at a time.
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
     * Name of a metric group that metrics for this fleet are added to. In Amazon CloudWatch, you can view aggregated
     * metrics for fleets that are in a metric group. A fleet can be included in only one metric group at a time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricGroups(java.util.Collection)} or {@link #withMetricGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricGroups
     *        Name of a metric group that metrics for this fleet are added to. In Amazon CloudWatch, you can view
     *        aggregated metrics for fleets that are in a metric group. A fleet can be included in only one metric group
     *        at a time.
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
     * Name of a metric group that metrics for this fleet are added to. In Amazon CloudWatch, you can view aggregated
     * metrics for fleets that are in a metric group. A fleet can be included in only one metric group at a time.
     * </p>
     * 
     * @param metricGroups
     *        Name of a metric group that metrics for this fleet are added to. In Amazon CloudWatch, you can view
     *        aggregated metrics for fleets that are in a metric group. A fleet can be included in only one metric group
     *        at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withMetricGroups(java.util.Collection<String> metricGroups) {
        setMetricGroups(metricGroups);
        return this;
    }

    /**
     * <p>
     * A list of fleet activity that has been suspended using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html">StopFleetActions</a> .
     * This includes fleet auto-scaling.
     * </p>
     * 
     * @return A list of fleet activity that has been suspended using <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html"
     *         >StopFleetActions</a> . This includes fleet auto-scaling.
     * @see FleetAction
     */

    public java.util.List<String> getStoppedActions() {
        return stoppedActions;
    }

    /**
     * <p>
     * A list of fleet activity that has been suspended using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html">StopFleetActions</a> .
     * This includes fleet auto-scaling.
     * </p>
     * 
     * @param stoppedActions
     *        A list of fleet activity that has been suspended using <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html"
     *        >StopFleetActions</a> . This includes fleet auto-scaling.
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
     * A list of fleet activity that has been suspended using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html">StopFleetActions</a> .
     * This includes fleet auto-scaling.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStoppedActions(java.util.Collection)} or {@link #withStoppedActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param stoppedActions
     *        A list of fleet activity that has been suspended using <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html"
     *        >StopFleetActions</a> . This includes fleet auto-scaling.
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
     * A list of fleet activity that has been suspended using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html">StopFleetActions</a> .
     * This includes fleet auto-scaling.
     * </p>
     * 
     * @param stoppedActions
     *        A list of fleet activity that has been suspended using <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html"
     *        >StopFleetActions</a> . This includes fleet auto-scaling.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetAction
     */

    public FleetAttributes withStoppedActions(java.util.Collection<String> stoppedActions) {
        setStoppedActions(stoppedActions);
        return this;
    }

    /**
     * <p>
     * A list of fleet activity that has been suspended using <a
     * href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html">StopFleetActions</a> .
     * This includes fleet auto-scaling.
     * </p>
     * 
     * @param stoppedActions
     *        A list of fleet activity that has been suspended using <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/apireference/API_StopFleetActions.html"
     *        >StopFleetActions</a> . This includes fleet auto-scaling.
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
     * A unique identifier for an IAM role that manages access to your Amazon Web Services services. With an instance
     * role ARN set, any application that runs on an instance in this fleet can assume the role, including install
     * scripts, server processes, and daemons (background processes). Create a role or look up a role's ARN by using the
     * <a href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the Amazon Web Services Management Console.
     * Learn more about using on-box credentials for your game servers at <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Access
     * external resources from a game server</a>.
     * </p>
     * 
     * @param instanceRoleArn
     *        A unique identifier for an IAM role that manages access to your Amazon Web Services services. With an
     *        instance role ARN set, any application that runs on an instance in this fleet can assume the role,
     *        including install scripts, server processes, and daemons (background processes). Create a role or look up
     *        a role's ARN by using the <a href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the Amazon
     *        Web Services Management Console. Learn more about using on-box credentials for your game servers at <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *        Access external resources from a game server</a>.
     */

    public void setInstanceRoleArn(String instanceRoleArn) {
        this.instanceRoleArn = instanceRoleArn;
    }

    /**
     * <p>
     * A unique identifier for an IAM role that manages access to your Amazon Web Services services. With an instance
     * role ARN set, any application that runs on an instance in this fleet can assume the role, including install
     * scripts, server processes, and daemons (background processes). Create a role or look up a role's ARN by using the
     * <a href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the Amazon Web Services Management Console.
     * Learn more about using on-box credentials for your game servers at <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Access
     * external resources from a game server</a>.
     * </p>
     * 
     * @return A unique identifier for an IAM role that manages access to your Amazon Web Services services. With an
     *         instance role ARN set, any application that runs on an instance in this fleet can assume the role,
     *         including install scripts, server processes, and daemons (background processes). Create a role or look up
     *         a role's ARN by using the <a href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the Amazon
     *         Web Services Management Console. Learn more about using on-box credentials for your game servers at <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *         Access external resources from a game server</a>.
     */

    public String getInstanceRoleArn() {
        return this.instanceRoleArn;
    }

    /**
     * <p>
     * A unique identifier for an IAM role that manages access to your Amazon Web Services services. With an instance
     * role ARN set, any application that runs on an instance in this fleet can assume the role, including install
     * scripts, server processes, and daemons (background processes). Create a role or look up a role's ARN by using the
     * <a href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the Amazon Web Services Management Console.
     * Learn more about using on-box credentials for your game servers at <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Access
     * external resources from a game server</a>.
     * </p>
     * 
     * @param instanceRoleArn
     *        A unique identifier for an IAM role that manages access to your Amazon Web Services services. With an
     *        instance role ARN set, any application that runs on an instance in this fleet can assume the role,
     *        including install scripts, server processes, and daemons (background processes). Create a role or look up
     *        a role's ARN by using the <a href="https://console.aws.amazon.com/iam/">IAM dashboard</a> in the Amazon
     *        Web Services Management Console. Learn more about using on-box credentials for your game servers at <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *        Access external resources from a game server</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withInstanceRoleArn(String instanceRoleArn) {
        setInstanceRoleArn(instanceRoleArn);
        return this;
    }

    /**
     * @param certificateConfiguration
     */

    public void setCertificateConfiguration(CertificateConfiguration certificateConfiguration) {
        this.certificateConfiguration = certificateConfiguration;
    }

    /**
     * @return
     */

    public CertificateConfiguration getCertificateConfiguration() {
        return this.certificateConfiguration;
    }

    /**
     * @param certificateConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withCertificateConfiguration(CertificateConfiguration certificateConfiguration) {
        setCertificateConfiguration(certificateConfiguration);
        return this;
    }

    /**
     * <p>
     * The type of compute resource used to host your game servers. You can use your own compute resources with GameLift
     * Anywhere or use Amazon EC2 instances with managed GameLift.
     * </p>
     * 
     * @param computeType
     *        The type of compute resource used to host your game servers. You can use your own compute resources with
     *        GameLift Anywhere or use Amazon EC2 instances with managed GameLift.
     * @see ComputeType
     */

    public void setComputeType(String computeType) {
        this.computeType = computeType;
    }

    /**
     * <p>
     * The type of compute resource used to host your game servers. You can use your own compute resources with GameLift
     * Anywhere or use Amazon EC2 instances with managed GameLift.
     * </p>
     * 
     * @return The type of compute resource used to host your game servers. You can use your own compute resources with
     *         GameLift Anywhere or use Amazon EC2 instances with managed GameLift.
     * @see ComputeType
     */

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * <p>
     * The type of compute resource used to host your game servers. You can use your own compute resources with GameLift
     * Anywhere or use Amazon EC2 instances with managed GameLift.
     * </p>
     * 
     * @param computeType
     *        The type of compute resource used to host your game servers. You can use your own compute resources with
     *        GameLift Anywhere or use Amazon EC2 instances with managed GameLift.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public FleetAttributes withComputeType(String computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * <p>
     * The type of compute resource used to host your game servers. You can use your own compute resources with GameLift
     * Anywhere or use Amazon EC2 instances with managed GameLift.
     * </p>
     * 
     * @param computeType
     *        The type of compute resource used to host your game servers. You can use your own compute resources with
     *        GameLift Anywhere or use Amazon EC2 instances with managed GameLift.
     * @see ComputeType
     */

    public void setComputeType(ComputeType computeType) {
        withComputeType(computeType);
    }

    /**
     * <p>
     * The type of compute resource used to host your game servers. You can use your own compute resources with GameLift
     * Anywhere or use Amazon EC2 instances with managed GameLift.
     * </p>
     * 
     * @param computeType
     *        The type of compute resource used to host your game servers. You can use your own compute resources with
     *        GameLift Anywhere or use Amazon EC2 instances with managed GameLift.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public FleetAttributes withComputeType(ComputeType computeType) {
        this.computeType = computeType.toString();
        return this;
    }

    /**
     * @param anywhereConfiguration
     */

    public void setAnywhereConfiguration(AnywhereConfiguration anywhereConfiguration) {
        this.anywhereConfiguration = anywhereConfiguration;
    }

    /**
     * @return
     */

    public AnywhereConfiguration getAnywhereConfiguration() {
        return this.anywhereConfiguration;
    }

    /**
     * @param anywhereConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FleetAttributes withAnywhereConfiguration(AnywhereConfiguration anywhereConfiguration) {
        setAnywhereConfiguration(anywhereConfiguration);
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
        if (getBuildArn() != null)
            sb.append("BuildArn: ").append(getBuildArn()).append(",");
        if (getScriptId() != null)
            sb.append("ScriptId: ").append(getScriptId()).append(",");
        if (getScriptArn() != null)
            sb.append("ScriptArn: ").append(getScriptArn()).append(",");
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
            sb.append("InstanceRoleArn: ").append(getInstanceRoleArn()).append(",");
        if (getCertificateConfiguration() != null)
            sb.append("CertificateConfiguration: ").append(getCertificateConfiguration()).append(",");
        if (getComputeType() != null)
            sb.append("ComputeType: ").append(getComputeType()).append(",");
        if (getAnywhereConfiguration() != null)
            sb.append("AnywhereConfiguration: ").append(getAnywhereConfiguration());
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
        if (other.getBuildArn() == null ^ this.getBuildArn() == null)
            return false;
        if (other.getBuildArn() != null && other.getBuildArn().equals(this.getBuildArn()) == false)
            return false;
        if (other.getScriptId() == null ^ this.getScriptId() == null)
            return false;
        if (other.getScriptId() != null && other.getScriptId().equals(this.getScriptId()) == false)
            return false;
        if (other.getScriptArn() == null ^ this.getScriptArn() == null)
            return false;
        if (other.getScriptArn() != null && other.getScriptArn().equals(this.getScriptArn()) == false)
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
        if (other.getCertificateConfiguration() == null ^ this.getCertificateConfiguration() == null)
            return false;
        if (other.getCertificateConfiguration() != null && other.getCertificateConfiguration().equals(this.getCertificateConfiguration()) == false)
            return false;
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        if (other.getAnywhereConfiguration() == null ^ this.getAnywhereConfiguration() == null)
            return false;
        if (other.getAnywhereConfiguration() != null && other.getAnywhereConfiguration().equals(this.getAnywhereConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getBuildArn() == null) ? 0 : getBuildArn().hashCode());
        hashCode = prime * hashCode + ((getScriptId() == null) ? 0 : getScriptId().hashCode());
        hashCode = prime * hashCode + ((getScriptArn() == null) ? 0 : getScriptArn().hashCode());
        hashCode = prime * hashCode + ((getServerLaunchPath() == null) ? 0 : getServerLaunchPath().hashCode());
        hashCode = prime * hashCode + ((getServerLaunchParameters() == null) ? 0 : getServerLaunchParameters().hashCode());
        hashCode = prime * hashCode + ((getLogPaths() == null) ? 0 : getLogPaths().hashCode());
        hashCode = prime * hashCode + ((getNewGameSessionProtectionPolicy() == null) ? 0 : getNewGameSessionProtectionPolicy().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getResourceCreationLimitPolicy() == null) ? 0 : getResourceCreationLimitPolicy().hashCode());
        hashCode = prime * hashCode + ((getMetricGroups() == null) ? 0 : getMetricGroups().hashCode());
        hashCode = prime * hashCode + ((getStoppedActions() == null) ? 0 : getStoppedActions().hashCode());
        hashCode = prime * hashCode + ((getInstanceRoleArn() == null) ? 0 : getInstanceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateConfiguration() == null) ? 0 : getCertificateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        hashCode = prime * hashCode + ((getAnywhereConfiguration() == null) ? 0 : getAnywhereConfiguration().hashCode());
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
