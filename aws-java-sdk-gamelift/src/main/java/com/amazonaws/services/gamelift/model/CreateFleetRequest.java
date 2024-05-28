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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/CreateFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A descriptive label that is associated with a fleet. Fleet names do not need to be unique.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description for the fleet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The unique identifier for a custom game server build to be deployed to a fleet with compute type <code>EC2</code>
     * . You can use either the build ID or ARN. The build must be uploaded to Amazon GameLift and in <code>READY</code>
     * status. This fleet property can't be changed after the fleet is created.
     * </p>
     */
    private String buildId;
    /**
     * <p>
     * The unique identifier for a Realtime configuration script to be deployed to a fleet with compute type
     * <code>EC2</code>. You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift prior to
     * creating the fleet. This fleet property can't be changed after the fleet is created.
     * </p>
     */
    private String scriptId;
    /**
     * <p>
     * <b>This parameter is no longer used.</b> Specify a server launch path using the <code>RuntimeConfiguration</code>
     * parameter. Requests that use this parameter instead continue to be valid.
     * </p>
     */
    private String serverLaunchPath;
    /**
     * <p>
     * <b>This parameter is no longer used.</b> Specify server launch parameters using the
     * <code>RuntimeConfiguration</code> parameter. Requests that use this parameter instead continue to be valid.
     * </p>
     */
    private String serverLaunchParameters;
    /**
     * <p>
     * <b>This parameter is no longer used.</b> To specify where Amazon GameLift should store log files once a server
     * process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one or more
     * directory paths in <code>logParameters</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-initialize"
     * >Initialize the server process</a> in the <i>Amazon GameLift Developer Guide</i>.
     * </p>
     */
    private java.util.List<String> logPaths;
    /**
     * <p>
     * The Amazon GameLift-supported Amazon EC2 instance type to use with EC2 and container fleets. Instance type
     * determines the computing resources that will be used to host your game servers, including CPU, memory, storage,
     * and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud
     * Instance Types</a> for detailed descriptions of Amazon EC2 instance types.
     * </p>
     */
    private String eC2InstanceType;
    /**
     * <p>
     * The IP address ranges and port settings that allow inbound traffic to access game server processes and other
     * processes on this fleet. Set this parameter for EC2 and container fleets. You can leave this parameter empty when
     * creating the fleet, but you must call <a>UpdateFleetPortSettings</a> to set it before players can connect to game
     * sessions. As a best practice, we recommend opening ports for remote access only when you need them and closing
     * them when you're finished. For Realtime Servers fleets, Amazon GameLift automatically sets TCP and UDP ranges.
     * </p>
     * <p>
     * To manage inbound access for a container fleet, set this parameter to the same port numbers that you set for the
     * fleet's connection port range. During the life of the fleet, update this parameter to control which connection
     * ports are open to inbound traffic.
     * </p>
     */
    private java.util.List<IpPermission> eC2InboundPermissions;
    /**
     * <p>
     * The status of termination protection for active game sessions on the fleet. By default, this property is set to
     * <code>NoProtection</code>. You can also set game session protection for an individual game session by calling <a
     * href="gamelift/latest/apireference/API_UpdateGameSession.html">UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> - Game sessions can be terminated during active gameplay as a result of a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> - Game sessions in <code>ACTIVE</code> status cannot be terminated during a scale-down
     * event.
     * </p>
     * </li>
     * </ul>
     */
    private String newGameSessionProtectionPolicy;
    /**
     * <p>
     * Instructions for how to launch and run server processes on the fleet. Set runtime configuration for EC2 fleets
     * and container fleets. For an Anywhere fleets, set this parameter only if the fleet is running the Amazon GameLift
     * Agent. The runtime configuration defines one or more server process configurations. Each server process
     * identifies a game executable or Realtime script file and the number of processes to run concurrently.
     * </p>
     * <note>
     * <p>
     * This parameter replaces the parameters <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code>,
     * which are still supported for backward compatibility.
     * </p>
     * </note>
     */
    private RuntimeConfiguration runtimeConfiguration;
    /**
     * <p>
     * A policy that limits the number of game sessions that an individual player can create on instances in this fleet
     * within a specified span of time.
     * </p>
     */
    private ResourceCreationLimitPolicy resourceCreationLimitPolicy;
    /**
     * <p>
     * The name of an Amazon Web Services CloudWatch metric group to add this fleet to. A metric group is used to
     * aggregate the metrics for multiple fleets. You can specify an existing metric group name or set a new name to
     * create a new metric group. A fleet can be included in only one metric group at a time.
     * </p>
     */
    private java.util.List<String> metricGroups;
    /**
     * <p>
     * Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the Amazon Web Services
     * account that owns the VPC. You can find your account ID in the Amazon Web Services Management Console under
     * account settings.
     * </p>
     */
    private String peerVpcAwsAccountId;
    /**
     * <p>
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the
     * same Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     * Dashboard</a> in the Amazon Web Services Management Console. Learn more about VPC peering in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     */
    private String peerVpcId;
    /**
     * <p>
     * Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     * <code>ON_DEMAND</code>. Learn more about when to use <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>. This fleet property can't be changed after the fleet is created.
     * </p>
     */
    private String fleetType;
    /**
     * <p>
     * A unique identifier for an IAM role with access permissions to other Amazon Web Services services. Any
     * application that runs on an instance in the fleet--including install scripts, server processes, and other
     * processes--can use these permissions to interact with Amazon Web Services resources that you own or have access
     * to. For more information about using the role with your game server builds, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Communicate
     * with other Amazon Web Services resources from your fleets</a>. This fleet property can't be changed after the
     * fleet is created.
     * </p>
     */
    private String instanceRoleArn;
    /**
     * <p>
     * Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet. Amazon GameLift uses the certificates to
     * encrypt traffic between game clients and the game servers running on Amazon GameLift. By default, the
     * <code>CertificateConfiguration</code> is <code>DISABLED</code>. You can't change this property after you create
     * the fleet.
     * </p>
     * <p>
     * Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can cause fleets to fail,
     * preventing players from connecting to instances in the fleet. We recommend you replace fleets before 13 months,
     * consider using fleet aliases for a smooth transition.
     * </p>
     * <note>
     * <p>
     * ACM isn't available in all Amazon Web Services regions. A fleet creation request with certificate generation
     * enabled in an unsupported Region, fails with a 4xx error. For more information about the supported Regions, see
     * <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html">Supported Regions</a> in the
     * <i>Certificate Manager User Guide</i>.
     * </p>
     * </note>
     */
    private CertificateConfiguration certificateConfiguration;
    /**
     * <p>
     * A set of remote locations to deploy additional instances to and manage as part of the fleet. This parameter can
     * only be used when creating fleets in Amazon Web Services Regions that support multiple locations. You can add any
     * Amazon GameLift-supported Amazon Web Services Region as a remote location, in the form of an Amazon Web Services
     * Region code, such as <code>us-west-2</code> or Local Zone code. To create a fleet with instances in the home
     * Region only, don't set this parameter.
     * </p>
     * <p>
     * When using this parameter, Amazon GameLift requires you to include your home location in the request.
     * </p>
     */
    private java.util.List<LocationConfiguration> locations;
    /**
     * <p>
     * A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging Amazon
     * Web Services resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging Amazon Web
     * Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The type of compute resource used to host your game servers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EC2</code> – The game server build is deployed to Amazon EC2 instances for cloud hosting. This is the
     * default setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTAINER</code> – Container images with your game server build and supporting software are deployed to
     * Amazon EC2 instances for cloud hosting. With this compute type, you must specify the
     * <code>ContainerGroupsConfiguration</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANYWHERE</code> – Game servers or container images with your game server and supporting software are
     * deployed to compute resources that are provided and managed by you. With this compute type, you can also set the
     * <code>AnywhereConfiguration</code> parameter.
     * </p>
     * </li>
     * </ul>
     */
    private String computeType;
    /**
     * <p>
     * Amazon GameLift Anywhere configuration options.
     * </p>
     */
    private AnywhereConfiguration anywhereConfiguration;
    /**
     * <p>
     * Prompts Amazon GameLift to generate a shared credentials file for the IAM role that's defined in
     * <code>InstanceRoleArn</code>. The shared credentials file is stored on each fleet instance and refreshed as
     * needed. Use shared credentials for applications that are deployed along with the game server executable, if the
     * game server is integrated with server SDK version 5.x. For more information about using shared credentials, see
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     * Communicate with other Amazon Web Services resources from your fleets</a>.
     * </p>
     */
    private String instanceRoleCredentialsProvider;
    /**
     * <p>
     * The container groups to deploy to instances in the container fleet and other fleet-level configuration settings.
     * Use the <a>CreateContainerGroupDefinition</a> action to create container groups. A container fleet must have
     * exactly one replica container group, and can optionally have one daemon container group. You can't change this
     * property after you create the fleet.
     * </p>
     */
    private ContainerGroupsConfiguration containerGroupsConfiguration;

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

    public CreateFleetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description for the fleet.
     * </p>
     * 
     * @param description
     *        A description for the fleet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the fleet.
     * </p>
     * 
     * @return A description for the fleet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the fleet.
     * </p>
     * 
     * @param description
     *        A description for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The unique identifier for a custom game server build to be deployed to a fleet with compute type <code>EC2</code>
     * . You can use either the build ID or ARN. The build must be uploaded to Amazon GameLift and in <code>READY</code>
     * status. This fleet property can't be changed after the fleet is created.
     * </p>
     * 
     * @param buildId
     *        The unique identifier for a custom game server build to be deployed to a fleet with compute type
     *        <code>EC2</code>. You can use either the build ID or ARN. The build must be uploaded to Amazon GameLift
     *        and in <code>READY</code> status. This fleet property can't be changed after the fleet is created.
     */

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    /**
     * <p>
     * The unique identifier for a custom game server build to be deployed to a fleet with compute type <code>EC2</code>
     * . You can use either the build ID or ARN. The build must be uploaded to Amazon GameLift and in <code>READY</code>
     * status. This fleet property can't be changed after the fleet is created.
     * </p>
     * 
     * @return The unique identifier for a custom game server build to be deployed to a fleet with compute type
     *         <code>EC2</code>. You can use either the build ID or ARN. The build must be uploaded to Amazon GameLift
     *         and in <code>READY</code> status. This fleet property can't be changed after the fleet is created.
     */

    public String getBuildId() {
        return this.buildId;
    }

    /**
     * <p>
     * The unique identifier for a custom game server build to be deployed to a fleet with compute type <code>EC2</code>
     * . You can use either the build ID or ARN. The build must be uploaded to Amazon GameLift and in <code>READY</code>
     * status. This fleet property can't be changed after the fleet is created.
     * </p>
     * 
     * @param buildId
     *        The unique identifier for a custom game server build to be deployed to a fleet with compute type
     *        <code>EC2</code>. You can use either the build ID or ARN. The build must be uploaded to Amazon GameLift
     *        and in <code>READY</code> status. This fleet property can't be changed after the fleet is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withBuildId(String buildId) {
        setBuildId(buildId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for a Realtime configuration script to be deployed to a fleet with compute type
     * <code>EC2</code>. You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift prior to
     * creating the fleet. This fleet property can't be changed after the fleet is created.
     * </p>
     * 
     * @param scriptId
     *        The unique identifier for a Realtime configuration script to be deployed to a fleet with compute type
     *        <code>EC2</code>. You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift
     *        prior to creating the fleet. This fleet property can't be changed after the fleet is created.
     */

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    /**
     * <p>
     * The unique identifier for a Realtime configuration script to be deployed to a fleet with compute type
     * <code>EC2</code>. You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift prior to
     * creating the fleet. This fleet property can't be changed after the fleet is created.
     * </p>
     * 
     * @return The unique identifier for a Realtime configuration script to be deployed to a fleet with compute type
     *         <code>EC2</code>. You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift
     *         prior to creating the fleet. This fleet property can't be changed after the fleet is created.
     */

    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * <p>
     * The unique identifier for a Realtime configuration script to be deployed to a fleet with compute type
     * <code>EC2</code>. You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift prior to
     * creating the fleet. This fleet property can't be changed after the fleet is created.
     * </p>
     * 
     * @param scriptId
     *        The unique identifier for a Realtime configuration script to be deployed to a fleet with compute type
     *        <code>EC2</code>. You can use either the script ID or ARN. Scripts must be uploaded to Amazon GameLift
     *        prior to creating the fleet. This fleet property can't be changed after the fleet is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withScriptId(String scriptId) {
        setScriptId(scriptId);
        return this;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Specify a server launch path using the <code>RuntimeConfiguration</code>
     * parameter. Requests that use this parameter instead continue to be valid.
     * </p>
     * 
     * @param serverLaunchPath
     *        <b>This parameter is no longer used.</b> Specify a server launch path using the
     *        <code>RuntimeConfiguration</code> parameter. Requests that use this parameter instead continue to be
     *        valid.
     */

    public void setServerLaunchPath(String serverLaunchPath) {
        this.serverLaunchPath = serverLaunchPath;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Specify a server launch path using the <code>RuntimeConfiguration</code>
     * parameter. Requests that use this parameter instead continue to be valid.
     * </p>
     * 
     * @return <b>This parameter is no longer used.</b> Specify a server launch path using the
     *         <code>RuntimeConfiguration</code> parameter. Requests that use this parameter instead continue to be
     *         valid.
     */

    public String getServerLaunchPath() {
        return this.serverLaunchPath;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Specify a server launch path using the <code>RuntimeConfiguration</code>
     * parameter. Requests that use this parameter instead continue to be valid.
     * </p>
     * 
     * @param serverLaunchPath
     *        <b>This parameter is no longer used.</b> Specify a server launch path using the
     *        <code>RuntimeConfiguration</code> parameter. Requests that use this parameter instead continue to be
     *        valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withServerLaunchPath(String serverLaunchPath) {
        setServerLaunchPath(serverLaunchPath);
        return this;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Specify server launch parameters using the
     * <code>RuntimeConfiguration</code> parameter. Requests that use this parameter instead continue to be valid.
     * </p>
     * 
     * @param serverLaunchParameters
     *        <b>This parameter is no longer used.</b> Specify server launch parameters using the
     *        <code>RuntimeConfiguration</code> parameter. Requests that use this parameter instead continue to be
     *        valid.
     */

    public void setServerLaunchParameters(String serverLaunchParameters) {
        this.serverLaunchParameters = serverLaunchParameters;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Specify server launch parameters using the
     * <code>RuntimeConfiguration</code> parameter. Requests that use this parameter instead continue to be valid.
     * </p>
     * 
     * @return <b>This parameter is no longer used.</b> Specify server launch parameters using the
     *         <code>RuntimeConfiguration</code> parameter. Requests that use this parameter instead continue to be
     *         valid.
     */

    public String getServerLaunchParameters() {
        return this.serverLaunchParameters;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> Specify server launch parameters using the
     * <code>RuntimeConfiguration</code> parameter. Requests that use this parameter instead continue to be valid.
     * </p>
     * 
     * @param serverLaunchParameters
     *        <b>This parameter is no longer used.</b> Specify server launch parameters using the
     *        <code>RuntimeConfiguration</code> parameter. Requests that use this parameter instead continue to be
     *        valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withServerLaunchParameters(String serverLaunchParameters) {
        setServerLaunchParameters(serverLaunchParameters);
        return this;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> To specify where Amazon GameLift should store log files once a server
     * process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one or more
     * directory paths in <code>logParameters</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-initialize"
     * >Initialize the server process</a> in the <i>Amazon GameLift Developer Guide</i>.
     * </p>
     * 
     * @return <b>This parameter is no longer used.</b> To specify where Amazon GameLift should store log files once a
     *         server process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one
     *         or more directory paths in <code>logParameters</code>. For more information, see <a href=
     *         "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-initialize"
     *         >Initialize the server process</a> in the <i>Amazon GameLift Developer Guide</i>.
     */

    public java.util.List<String> getLogPaths() {
        return logPaths;
    }

    /**
     * <p>
     * <b>This parameter is no longer used.</b> To specify where Amazon GameLift should store log files once a server
     * process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one or more
     * directory paths in <code>logParameters</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-initialize"
     * >Initialize the server process</a> in the <i>Amazon GameLift Developer Guide</i>.
     * </p>
     * 
     * @param logPaths
     *        <b>This parameter is no longer used.</b> To specify where Amazon GameLift should store log files once a
     *        server process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one
     *        or more directory paths in <code>logParameters</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-initialize"
     *        >Initialize the server process</a> in the <i>Amazon GameLift Developer Guide</i>.
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
     * <b>This parameter is no longer used.</b> To specify where Amazon GameLift should store log files once a server
     * process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one or more
     * directory paths in <code>logParameters</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-initialize"
     * >Initialize the server process</a> in the <i>Amazon GameLift Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogPaths(java.util.Collection)} or {@link #withLogPaths(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param logPaths
     *        <b>This parameter is no longer used.</b> To specify where Amazon GameLift should store log files once a
     *        server process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one
     *        or more directory paths in <code>logParameters</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-initialize"
     *        >Initialize the server process</a> in the <i>Amazon GameLift Developer Guide</i>.
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
     * <b>This parameter is no longer used.</b> To specify where Amazon GameLift should store log files once a server
     * process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one or more
     * directory paths in <code>logParameters</code>. For more information, see <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-initialize"
     * >Initialize the server process</a> in the <i>Amazon GameLift Developer Guide</i>.
     * </p>
     * 
     * @param logPaths
     *        <b>This parameter is no longer used.</b> To specify where Amazon GameLift should store log files once a
     *        server process shuts down, use the Amazon GameLift server API <code>ProcessReady()</code> and specify one
     *        or more directory paths in <code>logParameters</code>. For more information, see <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-api.html#gamelift-sdk-server-initialize"
     *        >Initialize the server process</a> in the <i>Amazon GameLift Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withLogPaths(java.util.Collection<String> logPaths) {
        setLogPaths(logPaths);
        return this;
    }

    /**
     * <p>
     * The Amazon GameLift-supported Amazon EC2 instance type to use with EC2 and container fleets. Instance type
     * determines the computing resources that will be used to host your game servers, including CPU, memory, storage,
     * and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud
     * Instance Types</a> for detailed descriptions of Amazon EC2 instance types.
     * </p>
     * 
     * @param eC2InstanceType
     *        The Amazon GameLift-supported Amazon EC2 instance type to use with EC2 and container fleets. Instance type
     *        determines the computing resources that will be used to host your game servers, including CPU, memory,
     *        storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic
     *        Compute Cloud Instance Types</a> for detailed descriptions of Amazon EC2 instance types.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(String eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType;
    }

    /**
     * <p>
     * The Amazon GameLift-supported Amazon EC2 instance type to use with EC2 and container fleets. Instance type
     * determines the computing resources that will be used to host your game servers, including CPU, memory, storage,
     * and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud
     * Instance Types</a> for detailed descriptions of Amazon EC2 instance types.
     * </p>
     * 
     * @return The Amazon GameLift-supported Amazon EC2 instance type to use with EC2 and container fleets. Instance
     *         type determines the computing resources that will be used to host your game servers, including CPU,
     *         memory, storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon
     *         Elastic Compute Cloud Instance Types</a> for detailed descriptions of Amazon EC2 instance types.
     * @see EC2InstanceType
     */

    public String getEC2InstanceType() {
        return this.eC2InstanceType;
    }

    /**
     * <p>
     * The Amazon GameLift-supported Amazon EC2 instance type to use with EC2 and container fleets. Instance type
     * determines the computing resources that will be used to host your game servers, including CPU, memory, storage,
     * and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud
     * Instance Types</a> for detailed descriptions of Amazon EC2 instance types.
     * </p>
     * 
     * @param eC2InstanceType
     *        The Amazon GameLift-supported Amazon EC2 instance type to use with EC2 and container fleets. Instance type
     *        determines the computing resources that will be used to host your game servers, including CPU, memory,
     *        storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic
     *        Compute Cloud Instance Types</a> for detailed descriptions of Amazon EC2 instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public CreateFleetRequest withEC2InstanceType(String eC2InstanceType) {
        setEC2InstanceType(eC2InstanceType);
        return this;
    }

    /**
     * <p>
     * The Amazon GameLift-supported Amazon EC2 instance type to use with EC2 and container fleets. Instance type
     * determines the computing resources that will be used to host your game servers, including CPU, memory, storage,
     * and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud
     * Instance Types</a> for detailed descriptions of Amazon EC2 instance types.
     * </p>
     * 
     * @param eC2InstanceType
     *        The Amazon GameLift-supported Amazon EC2 instance type to use with EC2 and container fleets. Instance type
     *        determines the computing resources that will be used to host your game servers, including CPU, memory,
     *        storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic
     *        Compute Cloud Instance Types</a> for detailed descriptions of Amazon EC2 instance types.
     * @see EC2InstanceType
     */

    public void setEC2InstanceType(EC2InstanceType eC2InstanceType) {
        withEC2InstanceType(eC2InstanceType);
    }

    /**
     * <p>
     * The Amazon GameLift-supported Amazon EC2 instance type to use with EC2 and container fleets. Instance type
     * determines the computing resources that will be used to host your game servers, including CPU, memory, storage,
     * and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic Compute Cloud
     * Instance Types</a> for detailed descriptions of Amazon EC2 instance types.
     * </p>
     * 
     * @param eC2InstanceType
     *        The Amazon GameLift-supported Amazon EC2 instance type to use with EC2 and container fleets. Instance type
     *        determines the computing resources that will be used to host your game servers, including CPU, memory,
     *        storage, and networking capacity. See <a href="http://aws.amazon.com/ec2/instance-types/">Amazon Elastic
     *        Compute Cloud Instance Types</a> for detailed descriptions of Amazon EC2 instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public CreateFleetRequest withEC2InstanceType(EC2InstanceType eC2InstanceType) {
        this.eC2InstanceType = eC2InstanceType.toString();
        return this;
    }

    /**
     * <p>
     * The IP address ranges and port settings that allow inbound traffic to access game server processes and other
     * processes on this fleet. Set this parameter for EC2 and container fleets. You can leave this parameter empty when
     * creating the fleet, but you must call <a>UpdateFleetPortSettings</a> to set it before players can connect to game
     * sessions. As a best practice, we recommend opening ports for remote access only when you need them and closing
     * them when you're finished. For Realtime Servers fleets, Amazon GameLift automatically sets TCP and UDP ranges.
     * </p>
     * <p>
     * To manage inbound access for a container fleet, set this parameter to the same port numbers that you set for the
     * fleet's connection port range. During the life of the fleet, update this parameter to control which connection
     * ports are open to inbound traffic.
     * </p>
     * 
     * @return The IP address ranges and port settings that allow inbound traffic to access game server processes and
     *         other processes on this fleet. Set this parameter for EC2 and container fleets. You can leave this
     *         parameter empty when creating the fleet, but you must call <a>UpdateFleetPortSettings</a> to set it
     *         before players can connect to game sessions. As a best practice, we recommend opening ports for remote
     *         access only when you need them and closing them when you're finished. For Realtime Servers fleets, Amazon
     *         GameLift automatically sets TCP and UDP ranges.</p>
     *         <p>
     *         To manage inbound access for a container fleet, set this parameter to the same port numbers that you set
     *         for the fleet's connection port range. During the life of the fleet, update this parameter to control
     *         which connection ports are open to inbound traffic.
     */

    public java.util.List<IpPermission> getEC2InboundPermissions() {
        return eC2InboundPermissions;
    }

    /**
     * <p>
     * The IP address ranges and port settings that allow inbound traffic to access game server processes and other
     * processes on this fleet. Set this parameter for EC2 and container fleets. You can leave this parameter empty when
     * creating the fleet, but you must call <a>UpdateFleetPortSettings</a> to set it before players can connect to game
     * sessions. As a best practice, we recommend opening ports for remote access only when you need them and closing
     * them when you're finished. For Realtime Servers fleets, Amazon GameLift automatically sets TCP and UDP ranges.
     * </p>
     * <p>
     * To manage inbound access for a container fleet, set this parameter to the same port numbers that you set for the
     * fleet's connection port range. During the life of the fleet, update this parameter to control which connection
     * ports are open to inbound traffic.
     * </p>
     * 
     * @param eC2InboundPermissions
     *        The IP address ranges and port settings that allow inbound traffic to access game server processes and
     *        other processes on this fleet. Set this parameter for EC2 and container fleets. You can leave this
     *        parameter empty when creating the fleet, but you must call <a>UpdateFleetPortSettings</a> to set it before
     *        players can connect to game sessions. As a best practice, we recommend opening ports for remote access
     *        only when you need them and closing them when you're finished. For Realtime Servers fleets, Amazon
     *        GameLift automatically sets TCP and UDP ranges.</p>
     *        <p>
     *        To manage inbound access for a container fleet, set this parameter to the same port numbers that you set
     *        for the fleet's connection port range. During the life of the fleet, update this parameter to control
     *        which connection ports are open to inbound traffic.
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
     * The IP address ranges and port settings that allow inbound traffic to access game server processes and other
     * processes on this fleet. Set this parameter for EC2 and container fleets. You can leave this parameter empty when
     * creating the fleet, but you must call <a>UpdateFleetPortSettings</a> to set it before players can connect to game
     * sessions. As a best practice, we recommend opening ports for remote access only when you need them and closing
     * them when you're finished. For Realtime Servers fleets, Amazon GameLift automatically sets TCP and UDP ranges.
     * </p>
     * <p>
     * To manage inbound access for a container fleet, set this parameter to the same port numbers that you set for the
     * fleet's connection port range. During the life of the fleet, update this parameter to control which connection
     * ports are open to inbound traffic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEC2InboundPermissions(java.util.Collection)} or
     * {@link #withEC2InboundPermissions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param eC2InboundPermissions
     *        The IP address ranges and port settings that allow inbound traffic to access game server processes and
     *        other processes on this fleet. Set this parameter for EC2 and container fleets. You can leave this
     *        parameter empty when creating the fleet, but you must call <a>UpdateFleetPortSettings</a> to set it before
     *        players can connect to game sessions. As a best practice, we recommend opening ports for remote access
     *        only when you need them and closing them when you're finished. For Realtime Servers fleets, Amazon
     *        GameLift automatically sets TCP and UDP ranges.</p>
     *        <p>
     *        To manage inbound access for a container fleet, set this parameter to the same port numbers that you set
     *        for the fleet's connection port range. During the life of the fleet, update this parameter to control
     *        which connection ports are open to inbound traffic.
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
     * The IP address ranges and port settings that allow inbound traffic to access game server processes and other
     * processes on this fleet. Set this parameter for EC2 and container fleets. You can leave this parameter empty when
     * creating the fleet, but you must call <a>UpdateFleetPortSettings</a> to set it before players can connect to game
     * sessions. As a best practice, we recommend opening ports for remote access only when you need them and closing
     * them when you're finished. For Realtime Servers fleets, Amazon GameLift automatically sets TCP and UDP ranges.
     * </p>
     * <p>
     * To manage inbound access for a container fleet, set this parameter to the same port numbers that you set for the
     * fleet's connection port range. During the life of the fleet, update this parameter to control which connection
     * ports are open to inbound traffic.
     * </p>
     * 
     * @param eC2InboundPermissions
     *        The IP address ranges and port settings that allow inbound traffic to access game server processes and
     *        other processes on this fleet. Set this parameter for EC2 and container fleets. You can leave this
     *        parameter empty when creating the fleet, but you must call <a>UpdateFleetPortSettings</a> to set it before
     *        players can connect to game sessions. As a best practice, we recommend opening ports for remote access
     *        only when you need them and closing them when you're finished. For Realtime Servers fleets, Amazon
     *        GameLift automatically sets TCP and UDP ranges.</p>
     *        <p>
     *        To manage inbound access for a container fleet, set this parameter to the same port numbers that you set
     *        for the fleet's connection port range. During the life of the fleet, update this parameter to control
     *        which connection ports are open to inbound traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withEC2InboundPermissions(java.util.Collection<IpPermission> eC2InboundPermissions) {
        setEC2InboundPermissions(eC2InboundPermissions);
        return this;
    }

    /**
     * <p>
     * The status of termination protection for active game sessions on the fleet. By default, this property is set to
     * <code>NoProtection</code>. You can also set game session protection for an individual game session by calling <a
     * href="gamelift/latest/apireference/API_UpdateGameSession.html">UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> - Game sessions can be terminated during active gameplay as a result of a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> - Game sessions in <code>ACTIVE</code> status cannot be terminated during a scale-down
     * event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        The status of termination protection for active game sessions on the fleet. By default, this property is
     *        set to <code>NoProtection</code>. You can also set game session protection for an individual game session
     *        by calling <a href="gamelift/latest/apireference/API_UpdateGameSession.html">UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> - Game sessions can be terminated during active gameplay as a result of a scale-down
     *        event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> - Game sessions in <code>ACTIVE</code> status cannot be terminated during a
     *        scale-down event.
     *        </p>
     *        </li>
     * @see ProtectionPolicy
     */

    public void setNewGameSessionProtectionPolicy(String newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy;
    }

    /**
     * <p>
     * The status of termination protection for active game sessions on the fleet. By default, this property is set to
     * <code>NoProtection</code>. You can also set game session protection for an individual game session by calling <a
     * href="gamelift/latest/apireference/API_UpdateGameSession.html">UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> - Game sessions can be terminated during active gameplay as a result of a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> - Game sessions in <code>ACTIVE</code> status cannot be terminated during a scale-down
     * event.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of termination protection for active game sessions on the fleet. By default, this property is
     *         set to <code>NoProtection</code>. You can also set game session protection for an individual game session
     *         by calling <a href="gamelift/latest/apireference/API_UpdateGameSession.html">UpdateGameSession</a>.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>NoProtection</b> - Game sessions can be terminated during active gameplay as a result of a scale-down
     *         event.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>FullProtection</b> - Game sessions in <code>ACTIVE</code> status cannot be terminated during a
     *         scale-down event.
     *         </p>
     *         </li>
     * @see ProtectionPolicy
     */

    public String getNewGameSessionProtectionPolicy() {
        return this.newGameSessionProtectionPolicy;
    }

    /**
     * <p>
     * The status of termination protection for active game sessions on the fleet. By default, this property is set to
     * <code>NoProtection</code>. You can also set game session protection for an individual game session by calling <a
     * href="gamelift/latest/apireference/API_UpdateGameSession.html">UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> - Game sessions can be terminated during active gameplay as a result of a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> - Game sessions in <code>ACTIVE</code> status cannot be terminated during a scale-down
     * event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        The status of termination protection for active game sessions on the fleet. By default, this property is
     *        set to <code>NoProtection</code>. You can also set game session protection for an individual game session
     *        by calling <a href="gamelift/latest/apireference/API_UpdateGameSession.html">UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> - Game sessions can be terminated during active gameplay as a result of a scale-down
     *        event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> - Game sessions in <code>ACTIVE</code> status cannot be terminated during a
     *        scale-down event.
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
     * The status of termination protection for active game sessions on the fleet. By default, this property is set to
     * <code>NoProtection</code>. You can also set game session protection for an individual game session by calling <a
     * href="gamelift/latest/apireference/API_UpdateGameSession.html">UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> - Game sessions can be terminated during active gameplay as a result of a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> - Game sessions in <code>ACTIVE</code> status cannot be terminated during a scale-down
     * event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        The status of termination protection for active game sessions on the fleet. By default, this property is
     *        set to <code>NoProtection</code>. You can also set game session protection for an individual game session
     *        by calling <a href="gamelift/latest/apireference/API_UpdateGameSession.html">UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> - Game sessions can be terminated during active gameplay as a result of a scale-down
     *        event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> - Game sessions in <code>ACTIVE</code> status cannot be terminated during a
     *        scale-down event.
     *        </p>
     *        </li>
     * @see ProtectionPolicy
     */

    public void setNewGameSessionProtectionPolicy(ProtectionPolicy newGameSessionProtectionPolicy) {
        withNewGameSessionProtectionPolicy(newGameSessionProtectionPolicy);
    }

    /**
     * <p>
     * The status of termination protection for active game sessions on the fleet. By default, this property is set to
     * <code>NoProtection</code>. You can also set game session protection for an individual game session by calling <a
     * href="gamelift/latest/apireference/API_UpdateGameSession.html">UpdateGameSession</a>.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>NoProtection</b> - Game sessions can be terminated during active gameplay as a result of a scale-down event.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>FullProtection</b> - Game sessions in <code>ACTIVE</code> status cannot be terminated during a scale-down
     * event.
     * </p>
     * </li>
     * </ul>
     * 
     * @param newGameSessionProtectionPolicy
     *        The status of termination protection for active game sessions on the fleet. By default, this property is
     *        set to <code>NoProtection</code>. You can also set game session protection for an individual game session
     *        by calling <a href="gamelift/latest/apireference/API_UpdateGameSession.html">UpdateGameSession</a>.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>NoProtection</b> - Game sessions can be terminated during active gameplay as a result of a scale-down
     *        event.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>FullProtection</b> - Game sessions in <code>ACTIVE</code> status cannot be terminated during a
     *        scale-down event.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectionPolicy
     */

    public CreateFleetRequest withNewGameSessionProtectionPolicy(ProtectionPolicy newGameSessionProtectionPolicy) {
        this.newGameSessionProtectionPolicy = newGameSessionProtectionPolicy.toString();
        return this;
    }

    /**
     * <p>
     * Instructions for how to launch and run server processes on the fleet. Set runtime configuration for EC2 fleets
     * and container fleets. For an Anywhere fleets, set this parameter only if the fleet is running the Amazon GameLift
     * Agent. The runtime configuration defines one or more server process configurations. Each server process
     * identifies a game executable or Realtime script file and the number of processes to run concurrently.
     * </p>
     * <note>
     * <p>
     * This parameter replaces the parameters <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code>,
     * which are still supported for backward compatibility.
     * </p>
     * </note>
     * 
     * @param runtimeConfiguration
     *        Instructions for how to launch and run server processes on the fleet. Set runtime configuration for EC2
     *        fleets and container fleets. For an Anywhere fleets, set this parameter only if the fleet is running the
     *        Amazon GameLift Agent. The runtime configuration defines one or more server process configurations. Each
     *        server process identifies a game executable or Realtime script file and the number of processes to run
     *        concurrently. </p> <note>
     *        <p>
     *        This parameter replaces the parameters <code>ServerLaunchPath</code> and
     *        <code>ServerLaunchParameters</code>, which are still supported for backward compatibility.
     *        </p>
     */

    public void setRuntimeConfiguration(RuntimeConfiguration runtimeConfiguration) {
        this.runtimeConfiguration = runtimeConfiguration;
    }

    /**
     * <p>
     * Instructions for how to launch and run server processes on the fleet. Set runtime configuration for EC2 fleets
     * and container fleets. For an Anywhere fleets, set this parameter only if the fleet is running the Amazon GameLift
     * Agent. The runtime configuration defines one or more server process configurations. Each server process
     * identifies a game executable or Realtime script file and the number of processes to run concurrently.
     * </p>
     * <note>
     * <p>
     * This parameter replaces the parameters <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code>,
     * which are still supported for backward compatibility.
     * </p>
     * </note>
     * 
     * @return Instructions for how to launch and run server processes on the fleet. Set runtime configuration for EC2
     *         fleets and container fleets. For an Anywhere fleets, set this parameter only if the fleet is running the
     *         Amazon GameLift Agent. The runtime configuration defines one or more server process configurations. Each
     *         server process identifies a game executable or Realtime script file and the number of processes to run
     *         concurrently. </p> <note>
     *         <p>
     *         This parameter replaces the parameters <code>ServerLaunchPath</code> and
     *         <code>ServerLaunchParameters</code>, which are still supported for backward compatibility.
     *         </p>
     */

    public RuntimeConfiguration getRuntimeConfiguration() {
        return this.runtimeConfiguration;
    }

    /**
     * <p>
     * Instructions for how to launch and run server processes on the fleet. Set runtime configuration for EC2 fleets
     * and container fleets. For an Anywhere fleets, set this parameter only if the fleet is running the Amazon GameLift
     * Agent. The runtime configuration defines one or more server process configurations. Each server process
     * identifies a game executable or Realtime script file and the number of processes to run concurrently.
     * </p>
     * <note>
     * <p>
     * This parameter replaces the parameters <code>ServerLaunchPath</code> and <code>ServerLaunchParameters</code>,
     * which are still supported for backward compatibility.
     * </p>
     * </note>
     * 
     * @param runtimeConfiguration
     *        Instructions for how to launch and run server processes on the fleet. Set runtime configuration for EC2
     *        fleets and container fleets. For an Anywhere fleets, set this parameter only if the fleet is running the
     *        Amazon GameLift Agent. The runtime configuration defines one or more server process configurations. Each
     *        server process identifies a game executable or Realtime script file and the number of processes to run
     *        concurrently. </p> <note>
     *        <p>
     *        This parameter replaces the parameters <code>ServerLaunchPath</code> and
     *        <code>ServerLaunchParameters</code>, which are still supported for backward compatibility.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withRuntimeConfiguration(RuntimeConfiguration runtimeConfiguration) {
        setRuntimeConfiguration(runtimeConfiguration);
        return this;
    }

    /**
     * <p>
     * A policy that limits the number of game sessions that an individual player can create on instances in this fleet
     * within a specified span of time.
     * </p>
     * 
     * @param resourceCreationLimitPolicy
     *        A policy that limits the number of game sessions that an individual player can create on instances in this
     *        fleet within a specified span of time.
     */

    public void setResourceCreationLimitPolicy(ResourceCreationLimitPolicy resourceCreationLimitPolicy) {
        this.resourceCreationLimitPolicy = resourceCreationLimitPolicy;
    }

    /**
     * <p>
     * A policy that limits the number of game sessions that an individual player can create on instances in this fleet
     * within a specified span of time.
     * </p>
     * 
     * @return A policy that limits the number of game sessions that an individual player can create on instances in
     *         this fleet within a specified span of time.
     */

    public ResourceCreationLimitPolicy getResourceCreationLimitPolicy() {
        return this.resourceCreationLimitPolicy;
    }

    /**
     * <p>
     * A policy that limits the number of game sessions that an individual player can create on instances in this fleet
     * within a specified span of time.
     * </p>
     * 
     * @param resourceCreationLimitPolicy
     *        A policy that limits the number of game sessions that an individual player can create on instances in this
     *        fleet within a specified span of time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withResourceCreationLimitPolicy(ResourceCreationLimitPolicy resourceCreationLimitPolicy) {
        setResourceCreationLimitPolicy(resourceCreationLimitPolicy);
        return this;
    }

    /**
     * <p>
     * The name of an Amazon Web Services CloudWatch metric group to add this fleet to. A metric group is used to
     * aggregate the metrics for multiple fleets. You can specify an existing metric group name or set a new name to
     * create a new metric group. A fleet can be included in only one metric group at a time.
     * </p>
     * 
     * @return The name of an Amazon Web Services CloudWatch metric group to add this fleet to. A metric group is used
     *         to aggregate the metrics for multiple fleets. You can specify an existing metric group name or set a new
     *         name to create a new metric group. A fleet can be included in only one metric group at a time.
     */

    public java.util.List<String> getMetricGroups() {
        return metricGroups;
    }

    /**
     * <p>
     * The name of an Amazon Web Services CloudWatch metric group to add this fleet to. A metric group is used to
     * aggregate the metrics for multiple fleets. You can specify an existing metric group name or set a new name to
     * create a new metric group. A fleet can be included in only one metric group at a time.
     * </p>
     * 
     * @param metricGroups
     *        The name of an Amazon Web Services CloudWatch metric group to add this fleet to. A metric group is used to
     *        aggregate the metrics for multiple fleets. You can specify an existing metric group name or set a new name
     *        to create a new metric group. A fleet can be included in only one metric group at a time.
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
     * The name of an Amazon Web Services CloudWatch metric group to add this fleet to. A metric group is used to
     * aggregate the metrics for multiple fleets. You can specify an existing metric group name or set a new name to
     * create a new metric group. A fleet can be included in only one metric group at a time.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricGroups(java.util.Collection)} or {@link #withMetricGroups(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricGroups
     *        The name of an Amazon Web Services CloudWatch metric group to add this fleet to. A metric group is used to
     *        aggregate the metrics for multiple fleets. You can specify an existing metric group name or set a new name
     *        to create a new metric group. A fleet can be included in only one metric group at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withMetricGroups(String... metricGroups) {
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
     * The name of an Amazon Web Services CloudWatch metric group to add this fleet to. A metric group is used to
     * aggregate the metrics for multiple fleets. You can specify an existing metric group name or set a new name to
     * create a new metric group. A fleet can be included in only one metric group at a time.
     * </p>
     * 
     * @param metricGroups
     *        The name of an Amazon Web Services CloudWatch metric group to add this fleet to. A metric group is used to
     *        aggregate the metrics for multiple fleets. You can specify an existing metric group name or set a new name
     *        to create a new metric group. A fleet can be included in only one metric group at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withMetricGroups(java.util.Collection<String> metricGroups) {
        setMetricGroups(metricGroups);
        return this;
    }

    /**
     * <p>
     * Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the Amazon Web Services
     * account that owns the VPC. You can find your account ID in the Amazon Web Services Management Console under
     * account settings.
     * </p>
     * 
     * @param peerVpcAwsAccountId
     *        Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the Amazon Web Services
     *        account that owns the VPC. You can find your account ID in the Amazon Web Services Management Console
     *        under account settings.
     */

    public void setPeerVpcAwsAccountId(String peerVpcAwsAccountId) {
        this.peerVpcAwsAccountId = peerVpcAwsAccountId;
    }

    /**
     * <p>
     * Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the Amazon Web Services
     * account that owns the VPC. You can find your account ID in the Amazon Web Services Management Console under
     * account settings.
     * </p>
     * 
     * @return Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the Amazon Web
     *         Services account that owns the VPC. You can find your account ID in the Amazon Web Services Management
     *         Console under account settings.
     */

    public String getPeerVpcAwsAccountId() {
        return this.peerVpcAwsAccountId;
    }

    /**
     * <p>
     * Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the Amazon Web Services
     * account that owns the VPC. You can find your account ID in the Amazon Web Services Management Console under
     * account settings.
     * </p>
     * 
     * @param peerVpcAwsAccountId
     *        Used when peering your Amazon GameLift fleet with a VPC, the unique identifier for the Amazon Web Services
     *        account that owns the VPC. You can find your account ID in the Amazon Web Services Management Console
     *        under account settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withPeerVpcAwsAccountId(String peerVpcAwsAccountId) {
        setPeerVpcAwsAccountId(peerVpcAwsAccountId);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the
     * same Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     * Dashboard</a> in the Amazon Web Services Management Console. Learn more about VPC peering in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * 
     * @param peerVpcId
     *        A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be
     *        in the same Region as your fleet. To look up a VPC ID, use the <a
     *        href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the Amazon Web Services Management
     *        Console. Learn more about VPC peering in <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     *        GameLift Fleets</a>.
     */

    public void setPeerVpcId(String peerVpcId) {
        this.peerVpcId = peerVpcId;
    }

    /**
     * <p>
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the
     * same Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     * Dashboard</a> in the Amazon Web Services Management Console. Learn more about VPC peering in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * 
     * @return A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must
     *         be in the same Region as your fleet. To look up a VPC ID, use the <a
     *         href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the Amazon Web Services Management
     *         Console. Learn more about VPC peering in <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with
     *         Amazon GameLift Fleets</a>.
     */

    public String getPeerVpcId() {
        return this.peerVpcId;
    }

    /**
     * <p>
     * A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be in the
     * same Region as your fleet. To look up a VPC ID, use the <a href="https://console.aws.amazon.com/vpc/">VPC
     * Dashboard</a> in the Amazon Web Services Management Console. Learn more about VPC peering in <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     * GameLift Fleets</a>.
     * </p>
     * 
     * @param peerVpcId
     *        A unique identifier for a VPC with resources to be accessed by your Amazon GameLift fleet. The VPC must be
     *        in the same Region as your fleet. To look up a VPC ID, use the <a
     *        href="https://console.aws.amazon.com/vpc/">VPC Dashboard</a> in the Amazon Web Services Management
     *        Console. Learn more about VPC peering in <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/vpc-peering.html">VPC Peering with Amazon
     *        GameLift Fleets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withPeerVpcId(String peerVpcId) {
        setPeerVpcId(peerVpcId);
        return this;
    }

    /**
     * <p>
     * Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     * <code>ON_DEMAND</code>. Learn more about when to use <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>. This fleet property can't be changed after the fleet is created.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     *        <code>ON_DEMAND</code>. Learn more about when to use <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *        > On-Demand versus Spot Instances</a>. This fleet property can't be changed after the fleet is created.
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
     * > On-Demand versus Spot Instances</a>. This fleet property can't be changed after the fleet is created.
     * </p>
     * 
     * @return Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     *         <code>ON_DEMAND</code>. Learn more about when to use <a href=
     *         "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *         > On-Demand versus Spot Instances</a>. This fleet property can't be changed after the fleet is created.
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
     * > On-Demand versus Spot Instances</a>. This fleet property can't be changed after the fleet is created.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     *        <code>ON_DEMAND</code>. Learn more about when to use <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *        > On-Demand versus Spot Instances</a>. This fleet property can't be changed after the fleet is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public CreateFleetRequest withFleetType(String fleetType) {
        setFleetType(fleetType);
        return this;
    }

    /**
     * <p>
     * Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     * <code>ON_DEMAND</code>. Learn more about when to use <a href=
     * "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     * > On-Demand versus Spot Instances</a>. This fleet property can't be changed after the fleet is created.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     *        <code>ON_DEMAND</code>. Learn more about when to use <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *        > On-Demand versus Spot Instances</a>. This fleet property can't be changed after the fleet is created.
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
     * > On-Demand versus Spot Instances</a>. This fleet property can't be changed after the fleet is created.
     * </p>
     * 
     * @param fleetType
     *        Indicates whether to use On-Demand or Spot instances for this fleet. By default, this property is set to
     *        <code>ON_DEMAND</code>. Learn more about when to use <a href=
     *        "https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-ec2-instances.html#gamelift-ec2-instances-spot"
     *        > On-Demand versus Spot Instances</a>. This fleet property can't be changed after the fleet is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetType
     */

    public CreateFleetRequest withFleetType(FleetType fleetType) {
        this.fleetType = fleetType.toString();
        return this;
    }

    /**
     * <p>
     * A unique identifier for an IAM role with access permissions to other Amazon Web Services services. Any
     * application that runs on an instance in the fleet--including install scripts, server processes, and other
     * processes--can use these permissions to interact with Amazon Web Services resources that you own or have access
     * to. For more information about using the role with your game server builds, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Communicate
     * with other Amazon Web Services resources from your fleets</a>. This fleet property can't be changed after the
     * fleet is created.
     * </p>
     * 
     * @param instanceRoleArn
     *        A unique identifier for an IAM role with access permissions to other Amazon Web Services services. Any
     *        application that runs on an instance in the fleet--including install scripts, server processes, and other
     *        processes--can use these permissions to interact with Amazon Web Services resources that you own or have
     *        access to. For more information about using the role with your game server builds, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *        Communicate with other Amazon Web Services resources from your fleets</a>. This fleet property can't be
     *        changed after the fleet is created.
     */

    public void setInstanceRoleArn(String instanceRoleArn) {
        this.instanceRoleArn = instanceRoleArn;
    }

    /**
     * <p>
     * A unique identifier for an IAM role with access permissions to other Amazon Web Services services. Any
     * application that runs on an instance in the fleet--including install scripts, server processes, and other
     * processes--can use these permissions to interact with Amazon Web Services resources that you own or have access
     * to. For more information about using the role with your game server builds, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Communicate
     * with other Amazon Web Services resources from your fleets</a>. This fleet property can't be changed after the
     * fleet is created.
     * </p>
     * 
     * @return A unique identifier for an IAM role with access permissions to other Amazon Web Services services. Any
     *         application that runs on an instance in the fleet--including install scripts, server processes, and other
     *         processes--can use these permissions to interact with Amazon Web Services resources that you own or have
     *         access to. For more information about using the role with your game server builds, see <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *         Communicate with other Amazon Web Services resources from your fleets</a>. This fleet property can't be
     *         changed after the fleet is created.
     */

    public String getInstanceRoleArn() {
        return this.instanceRoleArn;
    }

    /**
     * <p>
     * A unique identifier for an IAM role with access permissions to other Amazon Web Services services. Any
     * application that runs on an instance in the fleet--including install scripts, server processes, and other
     * processes--can use these permissions to interact with Amazon Web Services resources that you own or have access
     * to. For more information about using the role with your game server builds, see <a
     * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html"> Communicate
     * with other Amazon Web Services resources from your fleets</a>. This fleet property can't be changed after the
     * fleet is created.
     * </p>
     * 
     * @param instanceRoleArn
     *        A unique identifier for an IAM role with access permissions to other Amazon Web Services services. Any
     *        application that runs on an instance in the fleet--including install scripts, server processes, and other
     *        processes--can use these permissions to interact with Amazon Web Services resources that you own or have
     *        access to. For more information about using the role with your game server builds, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *        Communicate with other Amazon Web Services resources from your fleets</a>. This fleet property can't be
     *        changed after the fleet is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withInstanceRoleArn(String instanceRoleArn) {
        setInstanceRoleArn(instanceRoleArn);
        return this;
    }

    /**
     * <p>
     * Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet. Amazon GameLift uses the certificates to
     * encrypt traffic between game clients and the game servers running on Amazon GameLift. By default, the
     * <code>CertificateConfiguration</code> is <code>DISABLED</code>. You can't change this property after you create
     * the fleet.
     * </p>
     * <p>
     * Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can cause fleets to fail,
     * preventing players from connecting to instances in the fleet. We recommend you replace fleets before 13 months,
     * consider using fleet aliases for a smooth transition.
     * </p>
     * <note>
     * <p>
     * ACM isn't available in all Amazon Web Services regions. A fleet creation request with certificate generation
     * enabled in an unsupported Region, fails with a 4xx error. For more information about the supported Regions, see
     * <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html">Supported Regions</a> in the
     * <i>Certificate Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @param certificateConfiguration
     *        Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet. Amazon GameLift uses the
     *        certificates to encrypt traffic between game clients and the game servers running on Amazon GameLift. By
     *        default, the <code>CertificateConfiguration</code> is <code>DISABLED</code>. You can't change this
     *        property after you create the fleet. </p>
     *        <p>
     *        Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can cause fleets to
     *        fail, preventing players from connecting to instances in the fleet. We recommend you replace fleets before
     *        13 months, consider using fleet aliases for a smooth transition.
     *        </p>
     *        <note>
     *        <p>
     *        ACM isn't available in all Amazon Web Services regions. A fleet creation request with certificate
     *        generation enabled in an unsupported Region, fails with a 4xx error. For more information about the
     *        supported Regions, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html">Supported Regions</a> in the
     *        <i>Certificate Manager User Guide</i>.
     *        </p>
     */

    public void setCertificateConfiguration(CertificateConfiguration certificateConfiguration) {
        this.certificateConfiguration = certificateConfiguration;
    }

    /**
     * <p>
     * Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet. Amazon GameLift uses the certificates to
     * encrypt traffic between game clients and the game servers running on Amazon GameLift. By default, the
     * <code>CertificateConfiguration</code> is <code>DISABLED</code>. You can't change this property after you create
     * the fleet.
     * </p>
     * <p>
     * Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can cause fleets to fail,
     * preventing players from connecting to instances in the fleet. We recommend you replace fleets before 13 months,
     * consider using fleet aliases for a smooth transition.
     * </p>
     * <note>
     * <p>
     * ACM isn't available in all Amazon Web Services regions. A fleet creation request with certificate generation
     * enabled in an unsupported Region, fails with a 4xx error. For more information about the supported Regions, see
     * <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html">Supported Regions</a> in the
     * <i>Certificate Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @return Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet. Amazon GameLift uses the
     *         certificates to encrypt traffic between game clients and the game servers running on Amazon GameLift. By
     *         default, the <code>CertificateConfiguration</code> is <code>DISABLED</code>. You can't change this
     *         property after you create the fleet. </p>
     *         <p>
     *         Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can cause fleets to
     *         fail, preventing players from connecting to instances in the fleet. We recommend you replace fleets
     *         before 13 months, consider using fleet aliases for a smooth transition.
     *         </p>
     *         <note>
     *         <p>
     *         ACM isn't available in all Amazon Web Services regions. A fleet creation request with certificate
     *         generation enabled in an unsupported Region, fails with a 4xx error. For more information about the
     *         supported Regions, see <a
     *         href="https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html">Supported Regions</a> in the
     *         <i>Certificate Manager User Guide</i>.
     *         </p>
     */

    public CertificateConfiguration getCertificateConfiguration() {
        return this.certificateConfiguration;
    }

    /**
     * <p>
     * Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet. Amazon GameLift uses the certificates to
     * encrypt traffic between game clients and the game servers running on Amazon GameLift. By default, the
     * <code>CertificateConfiguration</code> is <code>DISABLED</code>. You can't change this property after you create
     * the fleet.
     * </p>
     * <p>
     * Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can cause fleets to fail,
     * preventing players from connecting to instances in the fleet. We recommend you replace fleets before 13 months,
     * consider using fleet aliases for a smooth transition.
     * </p>
     * <note>
     * <p>
     * ACM isn't available in all Amazon Web Services regions. A fleet creation request with certificate generation
     * enabled in an unsupported Region, fails with a 4xx error. For more information about the supported Regions, see
     * <a href="https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html">Supported Regions</a> in the
     * <i>Certificate Manager User Guide</i>.
     * </p>
     * </note>
     * 
     * @param certificateConfiguration
     *        Prompts Amazon GameLift to generate a TLS/SSL certificate for the fleet. Amazon GameLift uses the
     *        certificates to encrypt traffic between game clients and the game servers running on Amazon GameLift. By
     *        default, the <code>CertificateConfiguration</code> is <code>DISABLED</code>. You can't change this
     *        property after you create the fleet. </p>
     *        <p>
     *        Certificate Manager (ACM) certificates expire after 13 months. Certificate expiration can cause fleets to
     *        fail, preventing players from connecting to instances in the fleet. We recommend you replace fleets before
     *        13 months, consider using fleet aliases for a smooth transition.
     *        </p>
     *        <note>
     *        <p>
     *        ACM isn't available in all Amazon Web Services regions. A fleet creation request with certificate
     *        generation enabled in an unsupported Region, fails with a 4xx error. For more information about the
     *        supported Regions, see <a
     *        href="https://docs.aws.amazon.com/acm/latest/userguide/acm-regions.html">Supported Regions</a> in the
     *        <i>Certificate Manager User Guide</i>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withCertificateConfiguration(CertificateConfiguration certificateConfiguration) {
        setCertificateConfiguration(certificateConfiguration);
        return this;
    }

    /**
     * <p>
     * A set of remote locations to deploy additional instances to and manage as part of the fleet. This parameter can
     * only be used when creating fleets in Amazon Web Services Regions that support multiple locations. You can add any
     * Amazon GameLift-supported Amazon Web Services Region as a remote location, in the form of an Amazon Web Services
     * Region code, such as <code>us-west-2</code> or Local Zone code. To create a fleet with instances in the home
     * Region only, don't set this parameter.
     * </p>
     * <p>
     * When using this parameter, Amazon GameLift requires you to include your home location in the request.
     * </p>
     * 
     * @return A set of remote locations to deploy additional instances to and manage as part of the fleet. This
     *         parameter can only be used when creating fleets in Amazon Web Services Regions that support multiple
     *         locations. You can add any Amazon GameLift-supported Amazon Web Services Region as a remote location, in
     *         the form of an Amazon Web Services Region code, such as <code>us-west-2</code> or Local Zone code. To
     *         create a fleet with instances in the home Region only, don't set this parameter. </p>
     *         <p>
     *         When using this parameter, Amazon GameLift requires you to include your home location in the request.
     */

    public java.util.List<LocationConfiguration> getLocations() {
        return locations;
    }

    /**
     * <p>
     * A set of remote locations to deploy additional instances to and manage as part of the fleet. This parameter can
     * only be used when creating fleets in Amazon Web Services Regions that support multiple locations. You can add any
     * Amazon GameLift-supported Amazon Web Services Region as a remote location, in the form of an Amazon Web Services
     * Region code, such as <code>us-west-2</code> or Local Zone code. To create a fleet with instances in the home
     * Region only, don't set this parameter.
     * </p>
     * <p>
     * When using this parameter, Amazon GameLift requires you to include your home location in the request.
     * </p>
     * 
     * @param locations
     *        A set of remote locations to deploy additional instances to and manage as part of the fleet. This
     *        parameter can only be used when creating fleets in Amazon Web Services Regions that support multiple
     *        locations. You can add any Amazon GameLift-supported Amazon Web Services Region as a remote location, in
     *        the form of an Amazon Web Services Region code, such as <code>us-west-2</code> or Local Zone code. To
     *        create a fleet with instances in the home Region only, don't set this parameter. </p>
     *        <p>
     *        When using this parameter, Amazon GameLift requires you to include your home location in the request.
     */

    public void setLocations(java.util.Collection<LocationConfiguration> locations) {
        if (locations == null) {
            this.locations = null;
            return;
        }

        this.locations = new java.util.ArrayList<LocationConfiguration>(locations);
    }

    /**
     * <p>
     * A set of remote locations to deploy additional instances to and manage as part of the fleet. This parameter can
     * only be used when creating fleets in Amazon Web Services Regions that support multiple locations. You can add any
     * Amazon GameLift-supported Amazon Web Services Region as a remote location, in the form of an Amazon Web Services
     * Region code, such as <code>us-west-2</code> or Local Zone code. To create a fleet with instances in the home
     * Region only, don't set this parameter.
     * </p>
     * <p>
     * When using this parameter, Amazon GameLift requires you to include your home location in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLocations(java.util.Collection)} or {@link #withLocations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param locations
     *        A set of remote locations to deploy additional instances to and manage as part of the fleet. This
     *        parameter can only be used when creating fleets in Amazon Web Services Regions that support multiple
     *        locations. You can add any Amazon GameLift-supported Amazon Web Services Region as a remote location, in
     *        the form of an Amazon Web Services Region code, such as <code>us-west-2</code> or Local Zone code. To
     *        create a fleet with instances in the home Region only, don't set this parameter. </p>
     *        <p>
     *        When using this parameter, Amazon GameLift requires you to include your home location in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withLocations(LocationConfiguration... locations) {
        if (this.locations == null) {
            setLocations(new java.util.ArrayList<LocationConfiguration>(locations.length));
        }
        for (LocationConfiguration ele : locations) {
            this.locations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A set of remote locations to deploy additional instances to and manage as part of the fleet. This parameter can
     * only be used when creating fleets in Amazon Web Services Regions that support multiple locations. You can add any
     * Amazon GameLift-supported Amazon Web Services Region as a remote location, in the form of an Amazon Web Services
     * Region code, such as <code>us-west-2</code> or Local Zone code. To create a fleet with instances in the home
     * Region only, don't set this parameter.
     * </p>
     * <p>
     * When using this parameter, Amazon GameLift requires you to include your home location in the request.
     * </p>
     * 
     * @param locations
     *        A set of remote locations to deploy additional instances to and manage as part of the fleet. This
     *        parameter can only be used when creating fleets in Amazon Web Services Regions that support multiple
     *        locations. You can add any Amazon GameLift-supported Amazon Web Services Region as a remote location, in
     *        the form of an Amazon Web Services Region code, such as <code>us-west-2</code> or Local Zone code. To
     *        create a fleet with instances in the home Region only, don't set this parameter. </p>
     *        <p>
     *        When using this parameter, Amazon GameLift requires you to include your home location in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withLocations(java.util.Collection<LocationConfiguration> locations) {
        setLocations(locations);
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging Amazon
     * Web Services resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging Amazon Web
     * Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging
     *         Amazon Web Services resources are useful for resource management, access management and cost allocation.
     *         For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *         Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging Amazon
     * Web Services resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging Amazon Web
     * Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging
     *        Amazon Web Services resources are useful for resource management, access management and cost allocation.
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *        Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging Amazon
     * Web Services resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging Amazon Web
     * Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging
     *        Amazon Web Services resources are useful for resource management, access management and cost allocation.
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *        Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging Amazon
     * Web Services resources are useful for resource management, access management and cost allocation. For more
     * information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html"> Tagging Amazon Web
     * Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param tags
     *        A list of labels to assign to the new fleet resource. Tags are developer-defined key-value pairs. Tagging
     *        Amazon Web Services resources are useful for resource management, access management and cost allocation.
     *        For more information, see <a href="https://docs.aws.amazon.com/general/latest/gr/aws_tagging.html">
     *        Tagging Amazon Web Services Resources</a> in the <i>Amazon Web Services General Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The type of compute resource used to host your game servers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EC2</code> – The game server build is deployed to Amazon EC2 instances for cloud hosting. This is the
     * default setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTAINER</code> – Container images with your game server build and supporting software are deployed to
     * Amazon EC2 instances for cloud hosting. With this compute type, you must specify the
     * <code>ContainerGroupsConfiguration</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANYWHERE</code> – Game servers or container images with your game server and supporting software are
     * deployed to compute resources that are provided and managed by you. With this compute type, you can also set the
     * <code>AnywhereConfiguration</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        The type of compute resource used to host your game servers. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EC2</code> – The game server build is deployed to Amazon EC2 instances for cloud hosting. This is
     *        the default setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTAINER</code> – Container images with your game server build and supporting software are deployed
     *        to Amazon EC2 instances for cloud hosting. With this compute type, you must specify the
     *        <code>ContainerGroupsConfiguration</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ANYWHERE</code> – Game servers or container images with your game server and supporting software are
     *        deployed to compute resources that are provided and managed by you. With this compute type, you can also
     *        set the <code>AnywhereConfiguration</code> parameter.
     *        </p>
     *        </li>
     * @see ComputeType
     */

    public void setComputeType(String computeType) {
        this.computeType = computeType;
    }

    /**
     * <p>
     * The type of compute resource used to host your game servers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EC2</code> – The game server build is deployed to Amazon EC2 instances for cloud hosting. This is the
     * default setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTAINER</code> – Container images with your game server build and supporting software are deployed to
     * Amazon EC2 instances for cloud hosting. With this compute type, you must specify the
     * <code>ContainerGroupsConfiguration</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANYWHERE</code> – Game servers or container images with your game server and supporting software are
     * deployed to compute resources that are provided and managed by you. With this compute type, you can also set the
     * <code>AnywhereConfiguration</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of compute resource used to host your game servers. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>EC2</code> – The game server build is deployed to Amazon EC2 instances for cloud hosting. This is
     *         the default setting.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CONTAINER</code> – Container images with your game server build and supporting software are
     *         deployed to Amazon EC2 instances for cloud hosting. With this compute type, you must specify the
     *         <code>ContainerGroupsConfiguration</code> parameter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ANYWHERE</code> – Game servers or container images with your game server and supporting software
     *         are deployed to compute resources that are provided and managed by you. With this compute type, you can
     *         also set the <code>AnywhereConfiguration</code> parameter.
     *         </p>
     *         </li>
     * @see ComputeType
     */

    public String getComputeType() {
        return this.computeType;
    }

    /**
     * <p>
     * The type of compute resource used to host your game servers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EC2</code> – The game server build is deployed to Amazon EC2 instances for cloud hosting. This is the
     * default setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTAINER</code> – Container images with your game server build and supporting software are deployed to
     * Amazon EC2 instances for cloud hosting. With this compute type, you must specify the
     * <code>ContainerGroupsConfiguration</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANYWHERE</code> – Game servers or container images with your game server and supporting software are
     * deployed to compute resources that are provided and managed by you. With this compute type, you can also set the
     * <code>AnywhereConfiguration</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        The type of compute resource used to host your game servers. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EC2</code> – The game server build is deployed to Amazon EC2 instances for cloud hosting. This is
     *        the default setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTAINER</code> – Container images with your game server build and supporting software are deployed
     *        to Amazon EC2 instances for cloud hosting. With this compute type, you must specify the
     *        <code>ContainerGroupsConfiguration</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ANYWHERE</code> – Game servers or container images with your game server and supporting software are
     *        deployed to compute resources that are provided and managed by you. With this compute type, you can also
     *        set the <code>AnywhereConfiguration</code> parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public CreateFleetRequest withComputeType(String computeType) {
        setComputeType(computeType);
        return this;
    }

    /**
     * <p>
     * The type of compute resource used to host your game servers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EC2</code> – The game server build is deployed to Amazon EC2 instances for cloud hosting. This is the
     * default setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTAINER</code> – Container images with your game server build and supporting software are deployed to
     * Amazon EC2 instances for cloud hosting. With this compute type, you must specify the
     * <code>ContainerGroupsConfiguration</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANYWHERE</code> – Game servers or container images with your game server and supporting software are
     * deployed to compute resources that are provided and managed by you. With this compute type, you can also set the
     * <code>AnywhereConfiguration</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        The type of compute resource used to host your game servers. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EC2</code> – The game server build is deployed to Amazon EC2 instances for cloud hosting. This is
     *        the default setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTAINER</code> – Container images with your game server build and supporting software are deployed
     *        to Amazon EC2 instances for cloud hosting. With this compute type, you must specify the
     *        <code>ContainerGroupsConfiguration</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ANYWHERE</code> – Game servers or container images with your game server and supporting software are
     *        deployed to compute resources that are provided and managed by you. With this compute type, you can also
     *        set the <code>AnywhereConfiguration</code> parameter.
     *        </p>
     *        </li>
     * @see ComputeType
     */

    public void setComputeType(ComputeType computeType) {
        withComputeType(computeType);
    }

    /**
     * <p>
     * The type of compute resource used to host your game servers.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>EC2</code> – The game server build is deployed to Amazon EC2 instances for cloud hosting. This is the
     * default setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CONTAINER</code> – Container images with your game server build and supporting software are deployed to
     * Amazon EC2 instances for cloud hosting. With this compute type, you must specify the
     * <code>ContainerGroupsConfiguration</code> parameter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ANYWHERE</code> – Game servers or container images with your game server and supporting software are
     * deployed to compute resources that are provided and managed by you. With this compute type, you can also set the
     * <code>AnywhereConfiguration</code> parameter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param computeType
     *        The type of compute resource used to host your game servers. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>EC2</code> – The game server build is deployed to Amazon EC2 instances for cloud hosting. This is
     *        the default setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CONTAINER</code> – Container images with your game server build and supporting software are deployed
     *        to Amazon EC2 instances for cloud hosting. With this compute type, you must specify the
     *        <code>ContainerGroupsConfiguration</code> parameter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ANYWHERE</code> – Game servers or container images with your game server and supporting software are
     *        deployed to compute resources that are provided and managed by you. With this compute type, you can also
     *        set the <code>AnywhereConfiguration</code> parameter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeType
     */

    public CreateFleetRequest withComputeType(ComputeType computeType) {
        this.computeType = computeType.toString();
        return this;
    }

    /**
     * <p>
     * Amazon GameLift Anywhere configuration options.
     * </p>
     * 
     * @param anywhereConfiguration
     *        Amazon GameLift Anywhere configuration options.
     */

    public void setAnywhereConfiguration(AnywhereConfiguration anywhereConfiguration) {
        this.anywhereConfiguration = anywhereConfiguration;
    }

    /**
     * <p>
     * Amazon GameLift Anywhere configuration options.
     * </p>
     * 
     * @return Amazon GameLift Anywhere configuration options.
     */

    public AnywhereConfiguration getAnywhereConfiguration() {
        return this.anywhereConfiguration;
    }

    /**
     * <p>
     * Amazon GameLift Anywhere configuration options.
     * </p>
     * 
     * @param anywhereConfiguration
     *        Amazon GameLift Anywhere configuration options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withAnywhereConfiguration(AnywhereConfiguration anywhereConfiguration) {
        setAnywhereConfiguration(anywhereConfiguration);
        return this;
    }

    /**
     * <p>
     * Prompts Amazon GameLift to generate a shared credentials file for the IAM role that's defined in
     * <code>InstanceRoleArn</code>. The shared credentials file is stored on each fleet instance and refreshed as
     * needed. Use shared credentials for applications that are deployed along with the game server executable, if the
     * game server is integrated with server SDK version 5.x. For more information about using shared credentials, see
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     * Communicate with other Amazon Web Services resources from your fleets</a>.
     * </p>
     * 
     * @param instanceRoleCredentialsProvider
     *        Prompts Amazon GameLift to generate a shared credentials file for the IAM role that's defined in
     *        <code>InstanceRoleArn</code>. The shared credentials file is stored on each fleet instance and refreshed
     *        as needed. Use shared credentials for applications that are deployed along with the game server
     *        executable, if the game server is integrated with server SDK version 5.x. For more information about using
     *        shared credentials, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *        Communicate with other Amazon Web Services resources from your fleets</a>.
     * @see InstanceRoleCredentialsProvider
     */

    public void setInstanceRoleCredentialsProvider(String instanceRoleCredentialsProvider) {
        this.instanceRoleCredentialsProvider = instanceRoleCredentialsProvider;
    }

    /**
     * <p>
     * Prompts Amazon GameLift to generate a shared credentials file for the IAM role that's defined in
     * <code>InstanceRoleArn</code>. The shared credentials file is stored on each fleet instance and refreshed as
     * needed. Use shared credentials for applications that are deployed along with the game server executable, if the
     * game server is integrated with server SDK version 5.x. For more information about using shared credentials, see
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     * Communicate with other Amazon Web Services resources from your fleets</a>.
     * </p>
     * 
     * @return Prompts Amazon GameLift to generate a shared credentials file for the IAM role that's defined in
     *         <code>InstanceRoleArn</code>. The shared credentials file is stored on each fleet instance and refreshed
     *         as needed. Use shared credentials for applications that are deployed along with the game server
     *         executable, if the game server is integrated with server SDK version 5.x. For more information about
     *         using shared credentials, see <a
     *         href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *         Communicate with other Amazon Web Services resources from your fleets</a>.
     * @see InstanceRoleCredentialsProvider
     */

    public String getInstanceRoleCredentialsProvider() {
        return this.instanceRoleCredentialsProvider;
    }

    /**
     * <p>
     * Prompts Amazon GameLift to generate a shared credentials file for the IAM role that's defined in
     * <code>InstanceRoleArn</code>. The shared credentials file is stored on each fleet instance and refreshed as
     * needed. Use shared credentials for applications that are deployed along with the game server executable, if the
     * game server is integrated with server SDK version 5.x. For more information about using shared credentials, see
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     * Communicate with other Amazon Web Services resources from your fleets</a>.
     * </p>
     * 
     * @param instanceRoleCredentialsProvider
     *        Prompts Amazon GameLift to generate a shared credentials file for the IAM role that's defined in
     *        <code>InstanceRoleArn</code>. The shared credentials file is stored on each fleet instance and refreshed
     *        as needed. Use shared credentials for applications that are deployed along with the game server
     *        executable, if the game server is integrated with server SDK version 5.x. For more information about using
     *        shared credentials, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *        Communicate with other Amazon Web Services resources from your fleets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceRoleCredentialsProvider
     */

    public CreateFleetRequest withInstanceRoleCredentialsProvider(String instanceRoleCredentialsProvider) {
        setInstanceRoleCredentialsProvider(instanceRoleCredentialsProvider);
        return this;
    }

    /**
     * <p>
     * Prompts Amazon GameLift to generate a shared credentials file for the IAM role that's defined in
     * <code>InstanceRoleArn</code>. The shared credentials file is stored on each fleet instance and refreshed as
     * needed. Use shared credentials for applications that are deployed along with the game server executable, if the
     * game server is integrated with server SDK version 5.x. For more information about using shared credentials, see
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     * Communicate with other Amazon Web Services resources from your fleets</a>.
     * </p>
     * 
     * @param instanceRoleCredentialsProvider
     *        Prompts Amazon GameLift to generate a shared credentials file for the IAM role that's defined in
     *        <code>InstanceRoleArn</code>. The shared credentials file is stored on each fleet instance and refreshed
     *        as needed. Use shared credentials for applications that are deployed along with the game server
     *        executable, if the game server is integrated with server SDK version 5.x. For more information about using
     *        shared credentials, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *        Communicate with other Amazon Web Services resources from your fleets</a>.
     * @see InstanceRoleCredentialsProvider
     */

    public void setInstanceRoleCredentialsProvider(InstanceRoleCredentialsProvider instanceRoleCredentialsProvider) {
        withInstanceRoleCredentialsProvider(instanceRoleCredentialsProvider);
    }

    /**
     * <p>
     * Prompts Amazon GameLift to generate a shared credentials file for the IAM role that's defined in
     * <code>InstanceRoleArn</code>. The shared credentials file is stored on each fleet instance and refreshed as
     * needed. Use shared credentials for applications that are deployed along with the game server executable, if the
     * game server is integrated with server SDK version 5.x. For more information about using shared credentials, see
     * <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     * Communicate with other Amazon Web Services resources from your fleets</a>.
     * </p>
     * 
     * @param instanceRoleCredentialsProvider
     *        Prompts Amazon GameLift to generate a shared credentials file for the IAM role that's defined in
     *        <code>InstanceRoleArn</code>. The shared credentials file is stored on each fleet instance and refreshed
     *        as needed. Use shared credentials for applications that are deployed along with the game server
     *        executable, if the game server is integrated with server SDK version 5.x. For more information about using
     *        shared credentials, see <a
     *        href="https://docs.aws.amazon.com/gamelift/latest/developerguide/gamelift-sdk-server-resources.html">
     *        Communicate with other Amazon Web Services resources from your fleets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceRoleCredentialsProvider
     */

    public CreateFleetRequest withInstanceRoleCredentialsProvider(InstanceRoleCredentialsProvider instanceRoleCredentialsProvider) {
        this.instanceRoleCredentialsProvider = instanceRoleCredentialsProvider.toString();
        return this;
    }

    /**
     * <p>
     * The container groups to deploy to instances in the container fleet and other fleet-level configuration settings.
     * Use the <a>CreateContainerGroupDefinition</a> action to create container groups. A container fleet must have
     * exactly one replica container group, and can optionally have one daemon container group. You can't change this
     * property after you create the fleet.
     * </p>
     * 
     * @param containerGroupsConfiguration
     *        The container groups to deploy to instances in the container fleet and other fleet-level configuration
     *        settings. Use the <a>CreateContainerGroupDefinition</a> action to create container groups. A container
     *        fleet must have exactly one replica container group, and can optionally have one daemon container group.
     *        You can't change this property after you create the fleet.
     */

    public void setContainerGroupsConfiguration(ContainerGroupsConfiguration containerGroupsConfiguration) {
        this.containerGroupsConfiguration = containerGroupsConfiguration;
    }

    /**
     * <p>
     * The container groups to deploy to instances in the container fleet and other fleet-level configuration settings.
     * Use the <a>CreateContainerGroupDefinition</a> action to create container groups. A container fleet must have
     * exactly one replica container group, and can optionally have one daemon container group. You can't change this
     * property after you create the fleet.
     * </p>
     * 
     * @return The container groups to deploy to instances in the container fleet and other fleet-level configuration
     *         settings. Use the <a>CreateContainerGroupDefinition</a> action to create container groups. A container
     *         fleet must have exactly one replica container group, and can optionally have one daemon container group.
     *         You can't change this property after you create the fleet.
     */

    public ContainerGroupsConfiguration getContainerGroupsConfiguration() {
        return this.containerGroupsConfiguration;
    }

    /**
     * <p>
     * The container groups to deploy to instances in the container fleet and other fleet-level configuration settings.
     * Use the <a>CreateContainerGroupDefinition</a> action to create container groups. A container fleet must have
     * exactly one replica container group, and can optionally have one daemon container group. You can't change this
     * property after you create the fleet.
     * </p>
     * 
     * @param containerGroupsConfiguration
     *        The container groups to deploy to instances in the container fleet and other fleet-level configuration
     *        settings. Use the <a>CreateContainerGroupDefinition</a> action to create container groups. A container
     *        fleet must have exactly one replica container group, and can optionally have one daemon container group.
     *        You can't change this property after you create the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withContainerGroupsConfiguration(ContainerGroupsConfiguration containerGroupsConfiguration) {
        setContainerGroupsConfiguration(containerGroupsConfiguration);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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
        if (getEC2InstanceType() != null)
            sb.append("EC2InstanceType: ").append(getEC2InstanceType()).append(",");
        if (getEC2InboundPermissions() != null)
            sb.append("EC2InboundPermissions: ").append(getEC2InboundPermissions()).append(",");
        if (getNewGameSessionProtectionPolicy() != null)
            sb.append("NewGameSessionProtectionPolicy: ").append(getNewGameSessionProtectionPolicy()).append(",");
        if (getRuntimeConfiguration() != null)
            sb.append("RuntimeConfiguration: ").append(getRuntimeConfiguration()).append(",");
        if (getResourceCreationLimitPolicy() != null)
            sb.append("ResourceCreationLimitPolicy: ").append(getResourceCreationLimitPolicy()).append(",");
        if (getMetricGroups() != null)
            sb.append("MetricGroups: ").append(getMetricGroups()).append(",");
        if (getPeerVpcAwsAccountId() != null)
            sb.append("PeerVpcAwsAccountId: ").append(getPeerVpcAwsAccountId()).append(",");
        if (getPeerVpcId() != null)
            sb.append("PeerVpcId: ").append(getPeerVpcId()).append(",");
        if (getFleetType() != null)
            sb.append("FleetType: ").append(getFleetType()).append(",");
        if (getInstanceRoleArn() != null)
            sb.append("InstanceRoleArn: ").append(getInstanceRoleArn()).append(",");
        if (getCertificateConfiguration() != null)
            sb.append("CertificateConfiguration: ").append(getCertificateConfiguration()).append(",");
        if (getLocations() != null)
            sb.append("Locations: ").append(getLocations()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getComputeType() != null)
            sb.append("ComputeType: ").append(getComputeType()).append(",");
        if (getAnywhereConfiguration() != null)
            sb.append("AnywhereConfiguration: ").append(getAnywhereConfiguration()).append(",");
        if (getInstanceRoleCredentialsProvider() != null)
            sb.append("InstanceRoleCredentialsProvider: ").append(getInstanceRoleCredentialsProvider()).append(",");
        if (getContainerGroupsConfiguration() != null)
            sb.append("ContainerGroupsConfiguration: ").append(getContainerGroupsConfiguration());
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
        if (other.getMetricGroups() == null ^ this.getMetricGroups() == null)
            return false;
        if (other.getMetricGroups() != null && other.getMetricGroups().equals(this.getMetricGroups()) == false)
            return false;
        if (other.getPeerVpcAwsAccountId() == null ^ this.getPeerVpcAwsAccountId() == null)
            return false;
        if (other.getPeerVpcAwsAccountId() != null && other.getPeerVpcAwsAccountId().equals(this.getPeerVpcAwsAccountId()) == false)
            return false;
        if (other.getPeerVpcId() == null ^ this.getPeerVpcId() == null)
            return false;
        if (other.getPeerVpcId() != null && other.getPeerVpcId().equals(this.getPeerVpcId()) == false)
            return false;
        if (other.getFleetType() == null ^ this.getFleetType() == null)
            return false;
        if (other.getFleetType() != null && other.getFleetType().equals(this.getFleetType()) == false)
            return false;
        if (other.getInstanceRoleArn() == null ^ this.getInstanceRoleArn() == null)
            return false;
        if (other.getInstanceRoleArn() != null && other.getInstanceRoleArn().equals(this.getInstanceRoleArn()) == false)
            return false;
        if (other.getCertificateConfiguration() == null ^ this.getCertificateConfiguration() == null)
            return false;
        if (other.getCertificateConfiguration() != null && other.getCertificateConfiguration().equals(this.getCertificateConfiguration()) == false)
            return false;
        if (other.getLocations() == null ^ this.getLocations() == null)
            return false;
        if (other.getLocations() != null && other.getLocations().equals(this.getLocations()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getComputeType() == null ^ this.getComputeType() == null)
            return false;
        if (other.getComputeType() != null && other.getComputeType().equals(this.getComputeType()) == false)
            return false;
        if (other.getAnywhereConfiguration() == null ^ this.getAnywhereConfiguration() == null)
            return false;
        if (other.getAnywhereConfiguration() != null && other.getAnywhereConfiguration().equals(this.getAnywhereConfiguration()) == false)
            return false;
        if (other.getInstanceRoleCredentialsProvider() == null ^ this.getInstanceRoleCredentialsProvider() == null)
            return false;
        if (other.getInstanceRoleCredentialsProvider() != null
                && other.getInstanceRoleCredentialsProvider().equals(this.getInstanceRoleCredentialsProvider()) == false)
            return false;
        if (other.getContainerGroupsConfiguration() == null ^ this.getContainerGroupsConfiguration() == null)
            return false;
        if (other.getContainerGroupsConfiguration() != null && other.getContainerGroupsConfiguration().equals(this.getContainerGroupsConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getScriptId() == null) ? 0 : getScriptId().hashCode());
        hashCode = prime * hashCode + ((getServerLaunchPath() == null) ? 0 : getServerLaunchPath().hashCode());
        hashCode = prime * hashCode + ((getServerLaunchParameters() == null) ? 0 : getServerLaunchParameters().hashCode());
        hashCode = prime * hashCode + ((getLogPaths() == null) ? 0 : getLogPaths().hashCode());
        hashCode = prime * hashCode + ((getEC2InstanceType() == null) ? 0 : getEC2InstanceType().hashCode());
        hashCode = prime * hashCode + ((getEC2InboundPermissions() == null) ? 0 : getEC2InboundPermissions().hashCode());
        hashCode = prime * hashCode + ((getNewGameSessionProtectionPolicy() == null) ? 0 : getNewGameSessionProtectionPolicy().hashCode());
        hashCode = prime * hashCode + ((getRuntimeConfiguration() == null) ? 0 : getRuntimeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getResourceCreationLimitPolicy() == null) ? 0 : getResourceCreationLimitPolicy().hashCode());
        hashCode = prime * hashCode + ((getMetricGroups() == null) ? 0 : getMetricGroups().hashCode());
        hashCode = prime * hashCode + ((getPeerVpcAwsAccountId() == null) ? 0 : getPeerVpcAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getPeerVpcId() == null) ? 0 : getPeerVpcId().hashCode());
        hashCode = prime * hashCode + ((getFleetType() == null) ? 0 : getFleetType().hashCode());
        hashCode = prime * hashCode + ((getInstanceRoleArn() == null) ? 0 : getInstanceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateConfiguration() == null) ? 0 : getCertificateConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLocations() == null) ? 0 : getLocations().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getComputeType() == null) ? 0 : getComputeType().hashCode());
        hashCode = prime * hashCode + ((getAnywhereConfiguration() == null) ? 0 : getAnywhereConfiguration().hashCode());
        hashCode = prime * hashCode + ((getInstanceRoleCredentialsProvider() == null) ? 0 : getInstanceRoleCredentialsProvider().hashCode());
        hashCode = prime * hashCode + ((getContainerGroupsConfiguration() == null) ? 0 : getContainerGroupsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetRequest clone() {
        return (CreateFleetRequest) super.clone();
    }

}
