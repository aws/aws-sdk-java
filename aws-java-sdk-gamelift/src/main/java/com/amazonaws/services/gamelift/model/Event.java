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
 * Log entry describing an event that involves Amazon GameLift resources (such as a fleet). In addition to tracking
 * activity, event codes and messages can provide additional information for troubleshooting and debugging problems.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/Event" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Event implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a fleet event.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * Unique identifier for an event resource, such as a fleet ID.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * Type of event being logged. The following events are currently in use:
     * </p>
     * <p>
     * <b>Fleet creation events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_CREATED -- A fleet record was successfully created with a status of <code>NEW</code>. Event messaging
     * includes the fleet ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_DOWNLOADING -- Fleet status changed from <code>NEW</code> to <code>DOWNLOADING</code>. The compressed
     * build has started downloading to a fleet instance for installation.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_EXTRACTING_BUILD – The game server build was successfully downloaded to an instance, and the build
     * files are now being extracted from the uploaded build and saved to an instance. Failure at this stage prevents a
     * fleet from moving to <code>ACTIVE</code> status. Logs for this stage display a list of the files that are
     * extracted and saved on the instance. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_RUNNING_INSTALLER – The game server build files were successfully extracted, and the Amazon
     * GameLift is now running the build's install script (if one is included). Failure in this stage prevents a fleet
     * from moving to <code>ACTIVE</code> status. Logs for this stage list the installation steps and whether or not the
     * install completed successfully. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the Amazon GameLift is now
     * verifying that the game server launch paths, which are specified in the fleet's run-time configuration, exist. If
     * any listed launch path exists, Amazon GameLift tries to launch a game server process and waits for the process to
     * report ready. Failures in this stage prevent a fleet from moving to <code>ACTIVE</code> status. Logs for this
     * stage list the launch paths in the run-time configuration and indicate whether each is found. Access the logs by
     * using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_VALIDATING -- Fleet status changed from <code>DOWNLOADING</code> to <code>VALIDATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the run-time configuration failed because the executable
     * specified in a launch path does not exist on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_BUILDING -- Fleet status changed from <code>VALIDATING</code> to <code>BUILDING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the run-time configuration failed because the
     * executable specified in a launch path failed to run on the fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_ACTIVATING -- Fleet status changed from <code>BUILDING</code> to <code>ACTIVATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_ACTIVATION_FAILED - The fleet failed to successfully complete one of the steps in the fleet activation
     * process. This event code indicates that the game build was successfully downloaded to a fleet instance, built,
     * and validated, but was not able to start a server process. A possible reason for failure is that the game server
     * is not reporting "process ready" to the Amazon GameLift service.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_ACTIVE -- The fleet's status changed from <code>ACTIVATING</code> to <code>ACTIVE</code>. The fleet
     * is now ready to host game sessions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>VPC peering events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an Amazon
     * GameLift fleet and a VPC in your AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status information
     * (see <a>DescribeVpcPeeringConnections</a>) provide additional detail. A common reason for peering failure is that
     * the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this, change the CIDR block for the VPC
     * in your AWS account. For more information on VPC peering failures, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html"
     * >https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Spot instance events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Other fleet events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances, minimum/maximum
     * scaling limits). Event messaging includes the new capacity settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session protection
     * policy setting. Event messaging includes both the old and new policy setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_DELETED -- A request to delete a fleet was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * GENERIC_EVENT -- An unspecified event has occurred.
     * </p>
     * </li>
     * </ul>
     */
    private String eventCode;
    /**
     * <p>
     * Additional information related to the event.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds (for
     * example "1469498468.057").
     * </p>
     */
    private java.util.Date eventTime;
    /**
     * <p>
     * Location of stored logs with additional detail that is related to the event. This is useful for debugging issues.
     * The URL is valid for 15 minutes. You can also access fleet creation logs through the Amazon GameLift console.
     * </p>
     */
    private String preSignedLogUrl;

    /**
     * <p>
     * Unique identifier for a fleet event.
     * </p>
     * 
     * @param eventId
     *        Unique identifier for a fleet event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * Unique identifier for a fleet event.
     * </p>
     * 
     * @return Unique identifier for a fleet event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * Unique identifier for a fleet event.
     * </p>
     * 
     * @param eventId
     *        Unique identifier for a fleet event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for an event resource, such as a fleet ID.
     * </p>
     * 
     * @param resourceId
     *        Unique identifier for an event resource, such as a fleet ID.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Unique identifier for an event resource, such as a fleet ID.
     * </p>
     * 
     * @return Unique identifier for an event resource, such as a fleet ID.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Unique identifier for an event resource, such as a fleet ID.
     * </p>
     * 
     * @param resourceId
     *        Unique identifier for an event resource, such as a fleet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * Type of event being logged. The following events are currently in use:
     * </p>
     * <p>
     * <b>Fleet creation events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_CREATED -- A fleet record was successfully created with a status of <code>NEW</code>. Event messaging
     * includes the fleet ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_DOWNLOADING -- Fleet status changed from <code>NEW</code> to <code>DOWNLOADING</code>. The compressed
     * build has started downloading to a fleet instance for installation.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_EXTRACTING_BUILD – The game server build was successfully downloaded to an instance, and the build
     * files are now being extracted from the uploaded build and saved to an instance. Failure at this stage prevents a
     * fleet from moving to <code>ACTIVE</code> status. Logs for this stage display a list of the files that are
     * extracted and saved on the instance. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_RUNNING_INSTALLER – The game server build files were successfully extracted, and the Amazon
     * GameLift is now running the build's install script (if one is included). Failure in this stage prevents a fleet
     * from moving to <code>ACTIVE</code> status. Logs for this stage list the installation steps and whether or not the
     * install completed successfully. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the Amazon GameLift is now
     * verifying that the game server launch paths, which are specified in the fleet's run-time configuration, exist. If
     * any listed launch path exists, Amazon GameLift tries to launch a game server process and waits for the process to
     * report ready. Failures in this stage prevent a fleet from moving to <code>ACTIVE</code> status. Logs for this
     * stage list the launch paths in the run-time configuration and indicate whether each is found. Access the logs by
     * using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_VALIDATING -- Fleet status changed from <code>DOWNLOADING</code> to <code>VALIDATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the run-time configuration failed because the executable
     * specified in a launch path does not exist on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_BUILDING -- Fleet status changed from <code>VALIDATING</code> to <code>BUILDING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the run-time configuration failed because the
     * executable specified in a launch path failed to run on the fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_ACTIVATING -- Fleet status changed from <code>BUILDING</code> to <code>ACTIVATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_ACTIVATION_FAILED - The fleet failed to successfully complete one of the steps in the fleet activation
     * process. This event code indicates that the game build was successfully downloaded to a fleet instance, built,
     * and validated, but was not able to start a server process. A possible reason for failure is that the game server
     * is not reporting "process ready" to the Amazon GameLift service.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_ACTIVE -- The fleet's status changed from <code>ACTIVATING</code> to <code>ACTIVE</code>. The fleet
     * is now ready to host game sessions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>VPC peering events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an Amazon
     * GameLift fleet and a VPC in your AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status information
     * (see <a>DescribeVpcPeeringConnections</a>) provide additional detail. A common reason for peering failure is that
     * the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this, change the CIDR block for the VPC
     * in your AWS account. For more information on VPC peering failures, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html"
     * >https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Spot instance events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Other fleet events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances, minimum/maximum
     * scaling limits). Event messaging includes the new capacity settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session protection
     * policy setting. Event messaging includes both the old and new policy setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_DELETED -- A request to delete a fleet was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * GENERIC_EVENT -- An unspecified event has occurred.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventCode
     *        Type of event being logged. The following events are currently in use:</p>
     *        <p>
     *        <b>Fleet creation events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FLEET_CREATED -- A fleet record was successfully created with a status of <code>NEW</code>. Event
     *        messaging includes the fleet ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_DOWNLOADING -- Fleet status changed from <code>NEW</code> to <code>DOWNLOADING</code>. The
     *        compressed build has started downloading to a fleet instance for installation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_CREATION_EXTRACTING_BUILD – The game server build was successfully downloaded to an instance, and
     *        the build files are now being extracted from the uploaded build and saved to an instance. Failure at this
     *        stage prevents a fleet from moving to <code>ACTIVE</code> status. Logs for this stage display a list of
     *        the files that are extracted and saved on the instance. Access the logs by using the URL in
     *        <i>PreSignedLogUrl</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_CREATION_RUNNING_INSTALLER – The game server build files were successfully extracted, and the Amazon
     *        GameLift is now running the build's install script (if one is included). Failure in this stage prevents a
     *        fleet from moving to <code>ACTIVE</code> status. Logs for this stage list the installation steps and
     *        whether or not the install completed successfully. Access the logs by using the URL in
     *        <i>PreSignedLogUrl</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the Amazon GameLift is
     *        now verifying that the game server launch paths, which are specified in the fleet's run-time
     *        configuration, exist. If any listed launch path exists, Amazon GameLift tries to launch a game server
     *        process and waits for the process to report ready. Failures in this stage prevent a fleet from moving to
     *        <code>ACTIVE</code> status. Logs for this stage list the launch paths in the run-time configuration and
     *        indicate whether each is found. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_VALIDATING -- Fleet status changed from <code>DOWNLOADING</code> to <code>VALIDATING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the run-time configuration failed because the
     *        executable specified in a launch path does not exist on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_BUILDING -- Fleet status changed from <code>VALIDATING</code> to <code>BUILDING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the run-time configuration failed because the
     *        executable specified in a launch path failed to run on the fleet instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_ACTIVATING -- Fleet status changed from <code>BUILDING</code> to <code>ACTIVATING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_ACTIVATION_FAILED - The fleet failed to successfully complete one of the steps in the fleet
     *        activation process. This event code indicates that the game build was successfully downloaded to a fleet
     *        instance, built, and validated, but was not able to start a server process. A possible reason for failure
     *        is that the game server is not reporting "process ready" to the Amazon GameLift service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_ACTIVE -- The fleet's status changed from <code>ACTIVATING</code> to <code>ACTIVE</code>. The
     *        fleet is now ready to host game sessions.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>VPC peering events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an Amazon
     *        GameLift fleet and a VPC in your AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status
     *        information (see <a>DescribeVpcPeeringConnections</a>) provide additional detail. A common reason for
     *        peering failure is that the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this,
     *        change the CIDR block for the VPC in your AWS account. For more information on VPC peering failures, see
     *        <a href="https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html">
     *        https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Spot instance events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Other fleet events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances,
     *        minimum/maximum scaling limits). Event messaging includes the new capacity settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session
     *        protection policy setting. Event messaging includes both the old and new policy setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_DELETED -- A request to delete a fleet was initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GENERIC_EVENT -- An unspecified event has occurred.
     *        </p>
     *        </li>
     * @see EventCode
     */

    public void setEventCode(String eventCode) {
        this.eventCode = eventCode;
    }

    /**
     * <p>
     * Type of event being logged. The following events are currently in use:
     * </p>
     * <p>
     * <b>Fleet creation events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_CREATED -- A fleet record was successfully created with a status of <code>NEW</code>. Event messaging
     * includes the fleet ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_DOWNLOADING -- Fleet status changed from <code>NEW</code> to <code>DOWNLOADING</code>. The compressed
     * build has started downloading to a fleet instance for installation.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_EXTRACTING_BUILD – The game server build was successfully downloaded to an instance, and the build
     * files are now being extracted from the uploaded build and saved to an instance. Failure at this stage prevents a
     * fleet from moving to <code>ACTIVE</code> status. Logs for this stage display a list of the files that are
     * extracted and saved on the instance. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_RUNNING_INSTALLER – The game server build files were successfully extracted, and the Amazon
     * GameLift is now running the build's install script (if one is included). Failure in this stage prevents a fleet
     * from moving to <code>ACTIVE</code> status. Logs for this stage list the installation steps and whether or not the
     * install completed successfully. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the Amazon GameLift is now
     * verifying that the game server launch paths, which are specified in the fleet's run-time configuration, exist. If
     * any listed launch path exists, Amazon GameLift tries to launch a game server process and waits for the process to
     * report ready. Failures in this stage prevent a fleet from moving to <code>ACTIVE</code> status. Logs for this
     * stage list the launch paths in the run-time configuration and indicate whether each is found. Access the logs by
     * using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_VALIDATING -- Fleet status changed from <code>DOWNLOADING</code> to <code>VALIDATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the run-time configuration failed because the executable
     * specified in a launch path does not exist on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_BUILDING -- Fleet status changed from <code>VALIDATING</code> to <code>BUILDING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the run-time configuration failed because the
     * executable specified in a launch path failed to run on the fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_ACTIVATING -- Fleet status changed from <code>BUILDING</code> to <code>ACTIVATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_ACTIVATION_FAILED - The fleet failed to successfully complete one of the steps in the fleet activation
     * process. This event code indicates that the game build was successfully downloaded to a fleet instance, built,
     * and validated, but was not able to start a server process. A possible reason for failure is that the game server
     * is not reporting "process ready" to the Amazon GameLift service.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_ACTIVE -- The fleet's status changed from <code>ACTIVATING</code> to <code>ACTIVE</code>. The fleet
     * is now ready to host game sessions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>VPC peering events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an Amazon
     * GameLift fleet and a VPC in your AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status information
     * (see <a>DescribeVpcPeeringConnections</a>) provide additional detail. A common reason for peering failure is that
     * the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this, change the CIDR block for the VPC
     * in your AWS account. For more information on VPC peering failures, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html"
     * >https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Spot instance events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Other fleet events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances, minimum/maximum
     * scaling limits). Event messaging includes the new capacity settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session protection
     * policy setting. Event messaging includes both the old and new policy setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_DELETED -- A request to delete a fleet was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * GENERIC_EVENT -- An unspecified event has occurred.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Type of event being logged. The following events are currently in use:</p>
     *         <p>
     *         <b>Fleet creation events:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         FLEET_CREATED -- A fleet record was successfully created with a status of <code>NEW</code>. Event
     *         messaging includes the fleet ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_STATE_DOWNLOADING -- Fleet status changed from <code>NEW</code> to <code>DOWNLOADING</code>. The
     *         compressed build has started downloading to a fleet instance for installation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_CREATION_EXTRACTING_BUILD – The game server build was successfully downloaded to an instance, and
     *         the build files are now being extracted from the uploaded build and saved to an instance. Failure at this
     *         stage prevents a fleet from moving to <code>ACTIVE</code> status. Logs for this stage display a list of
     *         the files that are extracted and saved on the instance. Access the logs by using the URL in
     *         <i>PreSignedLogUrl</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_CREATION_RUNNING_INSTALLER – The game server build files were successfully extracted, and the
     *         Amazon GameLift is now running the build's install script (if one is included). Failure in this stage
     *         prevents a fleet from moving to <code>ACTIVE</code> status. Logs for this stage list the installation
     *         steps and whether or not the install completed successfully. Access the logs by using the URL in
     *         <i>PreSignedLogUrl</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the Amazon GameLift is
     *         now verifying that the game server launch paths, which are specified in the fleet's run-time
     *         configuration, exist. If any listed launch path exists, Amazon GameLift tries to launch a game server
     *         process and waits for the process to report ready. Failures in this stage prevent a fleet from moving to
     *         <code>ACTIVE</code> status. Logs for this stage list the launch paths in the run-time configuration and
     *         indicate whether each is found. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_STATE_VALIDATING -- Fleet status changed from <code>DOWNLOADING</code> to <code>VALIDATING</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the run-time configuration failed because the
     *         executable specified in a launch path does not exist on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_STATE_BUILDING -- Fleet status changed from <code>VALIDATING</code> to <code>BUILDING</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the run-time configuration failed because
     *         the executable specified in a launch path failed to run on the fleet instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_STATE_ACTIVATING -- Fleet status changed from <code>BUILDING</code> to <code>ACTIVATING</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_ACTIVATION_FAILED - The fleet failed to successfully complete one of the steps in the fleet
     *         activation process. This event code indicates that the game build was successfully downloaded to a fleet
     *         instance, built, and validated, but was not able to start a server process. A possible reason for failure
     *         is that the game server is not reporting "process ready" to the Amazon GameLift service.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_STATE_ACTIVE -- The fleet's status changed from <code>ACTIVATING</code> to <code>ACTIVE</code>. The
     *         fleet is now ready to host game sessions.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>VPC peering events:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an
     *         Amazon GameLift fleet and a VPC in your AWS account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status
     *         information (see <a>DescribeVpcPeeringConnections</a>) provide additional detail. A common reason for
     *         peering failure is that the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this,
     *         change the CIDR block for the VPC in your AWS account. For more information on VPC peering failures, see
     *         <a href="https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html">
     *         https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html</a>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Spot instance events:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Other fleet events:</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances,
     *         minimum/maximum scaling limits). Event messaging includes the new capacity settings.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session
     *         protection policy setting. Event messaging includes both the old and new policy setting.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         FLEET_DELETED -- A request to delete a fleet was initiated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         GENERIC_EVENT -- An unspecified event has occurred.
     *         </p>
     *         </li>
     * @see EventCode
     */

    public String getEventCode() {
        return this.eventCode;
    }

    /**
     * <p>
     * Type of event being logged. The following events are currently in use:
     * </p>
     * <p>
     * <b>Fleet creation events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_CREATED -- A fleet record was successfully created with a status of <code>NEW</code>. Event messaging
     * includes the fleet ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_DOWNLOADING -- Fleet status changed from <code>NEW</code> to <code>DOWNLOADING</code>. The compressed
     * build has started downloading to a fleet instance for installation.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_EXTRACTING_BUILD – The game server build was successfully downloaded to an instance, and the build
     * files are now being extracted from the uploaded build and saved to an instance. Failure at this stage prevents a
     * fleet from moving to <code>ACTIVE</code> status. Logs for this stage display a list of the files that are
     * extracted and saved on the instance. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_RUNNING_INSTALLER – The game server build files were successfully extracted, and the Amazon
     * GameLift is now running the build's install script (if one is included). Failure in this stage prevents a fleet
     * from moving to <code>ACTIVE</code> status. Logs for this stage list the installation steps and whether or not the
     * install completed successfully. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the Amazon GameLift is now
     * verifying that the game server launch paths, which are specified in the fleet's run-time configuration, exist. If
     * any listed launch path exists, Amazon GameLift tries to launch a game server process and waits for the process to
     * report ready. Failures in this stage prevent a fleet from moving to <code>ACTIVE</code> status. Logs for this
     * stage list the launch paths in the run-time configuration and indicate whether each is found. Access the logs by
     * using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_VALIDATING -- Fleet status changed from <code>DOWNLOADING</code> to <code>VALIDATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the run-time configuration failed because the executable
     * specified in a launch path does not exist on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_BUILDING -- Fleet status changed from <code>VALIDATING</code> to <code>BUILDING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the run-time configuration failed because the
     * executable specified in a launch path failed to run on the fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_ACTIVATING -- Fleet status changed from <code>BUILDING</code> to <code>ACTIVATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_ACTIVATION_FAILED - The fleet failed to successfully complete one of the steps in the fleet activation
     * process. This event code indicates that the game build was successfully downloaded to a fleet instance, built,
     * and validated, but was not able to start a server process. A possible reason for failure is that the game server
     * is not reporting "process ready" to the Amazon GameLift service.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_ACTIVE -- The fleet's status changed from <code>ACTIVATING</code> to <code>ACTIVE</code>. The fleet
     * is now ready to host game sessions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>VPC peering events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an Amazon
     * GameLift fleet and a VPC in your AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status information
     * (see <a>DescribeVpcPeeringConnections</a>) provide additional detail. A common reason for peering failure is that
     * the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this, change the CIDR block for the VPC
     * in your AWS account. For more information on VPC peering failures, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html"
     * >https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Spot instance events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Other fleet events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances, minimum/maximum
     * scaling limits). Event messaging includes the new capacity settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session protection
     * policy setting. Event messaging includes both the old and new policy setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_DELETED -- A request to delete a fleet was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * GENERIC_EVENT -- An unspecified event has occurred.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventCode
     *        Type of event being logged. The following events are currently in use:</p>
     *        <p>
     *        <b>Fleet creation events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FLEET_CREATED -- A fleet record was successfully created with a status of <code>NEW</code>. Event
     *        messaging includes the fleet ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_DOWNLOADING -- Fleet status changed from <code>NEW</code> to <code>DOWNLOADING</code>. The
     *        compressed build has started downloading to a fleet instance for installation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_CREATION_EXTRACTING_BUILD – The game server build was successfully downloaded to an instance, and
     *        the build files are now being extracted from the uploaded build and saved to an instance. Failure at this
     *        stage prevents a fleet from moving to <code>ACTIVE</code> status. Logs for this stage display a list of
     *        the files that are extracted and saved on the instance. Access the logs by using the URL in
     *        <i>PreSignedLogUrl</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_CREATION_RUNNING_INSTALLER – The game server build files were successfully extracted, and the Amazon
     *        GameLift is now running the build's install script (if one is included). Failure in this stage prevents a
     *        fleet from moving to <code>ACTIVE</code> status. Logs for this stage list the installation steps and
     *        whether or not the install completed successfully. Access the logs by using the URL in
     *        <i>PreSignedLogUrl</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the Amazon GameLift is
     *        now verifying that the game server launch paths, which are specified in the fleet's run-time
     *        configuration, exist. If any listed launch path exists, Amazon GameLift tries to launch a game server
     *        process and waits for the process to report ready. Failures in this stage prevent a fleet from moving to
     *        <code>ACTIVE</code> status. Logs for this stage list the launch paths in the run-time configuration and
     *        indicate whether each is found. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_VALIDATING -- Fleet status changed from <code>DOWNLOADING</code> to <code>VALIDATING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the run-time configuration failed because the
     *        executable specified in a launch path does not exist on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_BUILDING -- Fleet status changed from <code>VALIDATING</code> to <code>BUILDING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the run-time configuration failed because the
     *        executable specified in a launch path failed to run on the fleet instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_ACTIVATING -- Fleet status changed from <code>BUILDING</code> to <code>ACTIVATING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_ACTIVATION_FAILED - The fleet failed to successfully complete one of the steps in the fleet
     *        activation process. This event code indicates that the game build was successfully downloaded to a fleet
     *        instance, built, and validated, but was not able to start a server process. A possible reason for failure
     *        is that the game server is not reporting "process ready" to the Amazon GameLift service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_ACTIVE -- The fleet's status changed from <code>ACTIVATING</code> to <code>ACTIVE</code>. The
     *        fleet is now ready to host game sessions.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>VPC peering events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an Amazon
     *        GameLift fleet and a VPC in your AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status
     *        information (see <a>DescribeVpcPeeringConnections</a>) provide additional detail. A common reason for
     *        peering failure is that the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this,
     *        change the CIDR block for the VPC in your AWS account. For more information on VPC peering failures, see
     *        <a href="https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html">
     *        https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Spot instance events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Other fleet events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances,
     *        minimum/maximum scaling limits). Event messaging includes the new capacity settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session
     *        protection policy setting. Event messaging includes both the old and new policy setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_DELETED -- A request to delete a fleet was initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GENERIC_EVENT -- An unspecified event has occurred.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventCode
     */

    public Event withEventCode(String eventCode) {
        setEventCode(eventCode);
        return this;
    }

    /**
     * <p>
     * Type of event being logged. The following events are currently in use:
     * </p>
     * <p>
     * <b>Fleet creation events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_CREATED -- A fleet record was successfully created with a status of <code>NEW</code>. Event messaging
     * includes the fleet ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_DOWNLOADING -- Fleet status changed from <code>NEW</code> to <code>DOWNLOADING</code>. The compressed
     * build has started downloading to a fleet instance for installation.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_EXTRACTING_BUILD – The game server build was successfully downloaded to an instance, and the build
     * files are now being extracted from the uploaded build and saved to an instance. Failure at this stage prevents a
     * fleet from moving to <code>ACTIVE</code> status. Logs for this stage display a list of the files that are
     * extracted and saved on the instance. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_RUNNING_INSTALLER – The game server build files were successfully extracted, and the Amazon
     * GameLift is now running the build's install script (if one is included). Failure in this stage prevents a fleet
     * from moving to <code>ACTIVE</code> status. Logs for this stage list the installation steps and whether or not the
     * install completed successfully. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the Amazon GameLift is now
     * verifying that the game server launch paths, which are specified in the fleet's run-time configuration, exist. If
     * any listed launch path exists, Amazon GameLift tries to launch a game server process and waits for the process to
     * report ready. Failures in this stage prevent a fleet from moving to <code>ACTIVE</code> status. Logs for this
     * stage list the launch paths in the run-time configuration and indicate whether each is found. Access the logs by
     * using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_VALIDATING -- Fleet status changed from <code>DOWNLOADING</code> to <code>VALIDATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the run-time configuration failed because the executable
     * specified in a launch path does not exist on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_BUILDING -- Fleet status changed from <code>VALIDATING</code> to <code>BUILDING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the run-time configuration failed because the
     * executable specified in a launch path failed to run on the fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_ACTIVATING -- Fleet status changed from <code>BUILDING</code> to <code>ACTIVATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_ACTIVATION_FAILED - The fleet failed to successfully complete one of the steps in the fleet activation
     * process. This event code indicates that the game build was successfully downloaded to a fleet instance, built,
     * and validated, but was not able to start a server process. A possible reason for failure is that the game server
     * is not reporting "process ready" to the Amazon GameLift service.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_ACTIVE -- The fleet's status changed from <code>ACTIVATING</code> to <code>ACTIVE</code>. The fleet
     * is now ready to host game sessions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>VPC peering events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an Amazon
     * GameLift fleet and a VPC in your AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status information
     * (see <a>DescribeVpcPeeringConnections</a>) provide additional detail. A common reason for peering failure is that
     * the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this, change the CIDR block for the VPC
     * in your AWS account. For more information on VPC peering failures, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html"
     * >https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Spot instance events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Other fleet events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances, minimum/maximum
     * scaling limits). Event messaging includes the new capacity settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session protection
     * policy setting. Event messaging includes both the old and new policy setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_DELETED -- A request to delete a fleet was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * GENERIC_EVENT -- An unspecified event has occurred.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventCode
     *        Type of event being logged. The following events are currently in use:</p>
     *        <p>
     *        <b>Fleet creation events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FLEET_CREATED -- A fleet record was successfully created with a status of <code>NEW</code>. Event
     *        messaging includes the fleet ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_DOWNLOADING -- Fleet status changed from <code>NEW</code> to <code>DOWNLOADING</code>. The
     *        compressed build has started downloading to a fleet instance for installation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_CREATION_EXTRACTING_BUILD – The game server build was successfully downloaded to an instance, and
     *        the build files are now being extracted from the uploaded build and saved to an instance. Failure at this
     *        stage prevents a fleet from moving to <code>ACTIVE</code> status. Logs for this stage display a list of
     *        the files that are extracted and saved on the instance. Access the logs by using the URL in
     *        <i>PreSignedLogUrl</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_CREATION_RUNNING_INSTALLER – The game server build files were successfully extracted, and the Amazon
     *        GameLift is now running the build's install script (if one is included). Failure in this stage prevents a
     *        fleet from moving to <code>ACTIVE</code> status. Logs for this stage list the installation steps and
     *        whether or not the install completed successfully. Access the logs by using the URL in
     *        <i>PreSignedLogUrl</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the Amazon GameLift is
     *        now verifying that the game server launch paths, which are specified in the fleet's run-time
     *        configuration, exist. If any listed launch path exists, Amazon GameLift tries to launch a game server
     *        process and waits for the process to report ready. Failures in this stage prevent a fleet from moving to
     *        <code>ACTIVE</code> status. Logs for this stage list the launch paths in the run-time configuration and
     *        indicate whether each is found. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_VALIDATING -- Fleet status changed from <code>DOWNLOADING</code> to <code>VALIDATING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the run-time configuration failed because the
     *        executable specified in a launch path does not exist on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_BUILDING -- Fleet status changed from <code>VALIDATING</code> to <code>BUILDING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the run-time configuration failed because the
     *        executable specified in a launch path failed to run on the fleet instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_ACTIVATING -- Fleet status changed from <code>BUILDING</code> to <code>ACTIVATING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_ACTIVATION_FAILED - The fleet failed to successfully complete one of the steps in the fleet
     *        activation process. This event code indicates that the game build was successfully downloaded to a fleet
     *        instance, built, and validated, but was not able to start a server process. A possible reason for failure
     *        is that the game server is not reporting "process ready" to the Amazon GameLift service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_ACTIVE -- The fleet's status changed from <code>ACTIVATING</code> to <code>ACTIVE</code>. The
     *        fleet is now ready to host game sessions.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>VPC peering events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an Amazon
     *        GameLift fleet and a VPC in your AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status
     *        information (see <a>DescribeVpcPeeringConnections</a>) provide additional detail. A common reason for
     *        peering failure is that the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this,
     *        change the CIDR block for the VPC in your AWS account. For more information on VPC peering failures, see
     *        <a href="https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html">
     *        https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Spot instance events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Other fleet events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances,
     *        minimum/maximum scaling limits). Event messaging includes the new capacity settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session
     *        protection policy setting. Event messaging includes both the old and new policy setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_DELETED -- A request to delete a fleet was initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GENERIC_EVENT -- An unspecified event has occurred.
     *        </p>
     *        </li>
     * @see EventCode
     */

    public void setEventCode(EventCode eventCode) {
        withEventCode(eventCode);
    }

    /**
     * <p>
     * Type of event being logged. The following events are currently in use:
     * </p>
     * <p>
     * <b>Fleet creation events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_CREATED -- A fleet record was successfully created with a status of <code>NEW</code>. Event messaging
     * includes the fleet ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_DOWNLOADING -- Fleet status changed from <code>NEW</code> to <code>DOWNLOADING</code>. The compressed
     * build has started downloading to a fleet instance for installation.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_EXTRACTING_BUILD – The game server build was successfully downloaded to an instance, and the build
     * files are now being extracted from the uploaded build and saved to an instance. Failure at this stage prevents a
     * fleet from moving to <code>ACTIVE</code> status. Logs for this stage display a list of the files that are
     * extracted and saved on the instance. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_RUNNING_INSTALLER – The game server build files were successfully extracted, and the Amazon
     * GameLift is now running the build's install script (if one is included). Failure in this stage prevents a fleet
     * from moving to <code>ACTIVE</code> status. Logs for this stage list the installation steps and whether or not the
     * install completed successfully. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the Amazon GameLift is now
     * verifying that the game server launch paths, which are specified in the fleet's run-time configuration, exist. If
     * any listed launch path exists, Amazon GameLift tries to launch a game server process and waits for the process to
     * report ready. Failures in this stage prevent a fleet from moving to <code>ACTIVE</code> status. Logs for this
     * stage list the launch paths in the run-time configuration and indicate whether each is found. Access the logs by
     * using the URL in <i>PreSignedLogUrl</i>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_VALIDATING -- Fleet status changed from <code>DOWNLOADING</code> to <code>VALIDATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the run-time configuration failed because the executable
     * specified in a launch path does not exist on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_BUILDING -- Fleet status changed from <code>VALIDATING</code> to <code>BUILDING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the run-time configuration failed because the
     * executable specified in a launch path failed to run on the fleet instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_ACTIVATING -- Fleet status changed from <code>BUILDING</code> to <code>ACTIVATING</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_ACTIVATION_FAILED - The fleet failed to successfully complete one of the steps in the fleet activation
     * process. This event code indicates that the game build was successfully downloaded to a fleet instance, built,
     * and validated, but was not able to start a server process. A possible reason for failure is that the game server
     * is not reporting "process ready" to the Amazon GameLift service.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_STATE_ACTIVE -- The fleet's status changed from <code>ACTIVATING</code> to <code>ACTIVE</code>. The fleet
     * is now ready to host game sessions.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>VPC peering events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an Amazon
     * GameLift fleet and a VPC in your AWS account.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status information
     * (see <a>DescribeVpcPeeringConnections</a>) provide additional detail. A common reason for peering failure is that
     * the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this, change the CIDR block for the VPC
     * in your AWS account. For more information on VPC peering failures, see <a
     * href="https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html"
     * >https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html</a>
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Spot instance events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Other fleet events:</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances, minimum/maximum
     * scaling limits). Event messaging includes the new capacity settings.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session protection
     * policy setting. Event messaging includes both the old and new policy setting.
     * </p>
     * </li>
     * <li>
     * <p>
     * FLEET_DELETED -- A request to delete a fleet was initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * GENERIC_EVENT -- An unspecified event has occurred.
     * </p>
     * </li>
     * </ul>
     * 
     * @param eventCode
     *        Type of event being logged. The following events are currently in use:</p>
     *        <p>
     *        <b>Fleet creation events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FLEET_CREATED -- A fleet record was successfully created with a status of <code>NEW</code>. Event
     *        messaging includes the fleet ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_DOWNLOADING -- Fleet status changed from <code>NEW</code> to <code>DOWNLOADING</code>. The
     *        compressed build has started downloading to a fleet instance for installation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_BINARY_DOWNLOAD_FAILED -- The build failed to download to the fleet instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_CREATION_EXTRACTING_BUILD – The game server build was successfully downloaded to an instance, and
     *        the build files are now being extracted from the uploaded build and saved to an instance. Failure at this
     *        stage prevents a fleet from moving to <code>ACTIVE</code> status. Logs for this stage display a list of
     *        the files that are extracted and saved on the instance. Access the logs by using the URL in
     *        <i>PreSignedLogUrl</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_CREATION_RUNNING_INSTALLER – The game server build files were successfully extracted, and the Amazon
     *        GameLift is now running the build's install script (if one is included). Failure in this stage prevents a
     *        fleet from moving to <code>ACTIVE</code> status. Logs for this stage list the installation steps and
     *        whether or not the install completed successfully. Access the logs by using the URL in
     *        <i>PreSignedLogUrl</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_CREATION_VALIDATING_RUNTIME_CONFIG -- The build process was successful, and the Amazon GameLift is
     *        now verifying that the game server launch paths, which are specified in the fleet's run-time
     *        configuration, exist. If any listed launch path exists, Amazon GameLift tries to launch a game server
     *        process and waits for the process to report ready. Failures in this stage prevent a fleet from moving to
     *        <code>ACTIVE</code> status. Logs for this stage list the launch paths in the run-time configuration and
     *        indicate whether each is found. Access the logs by using the URL in <i>PreSignedLogUrl</i>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_VALIDATING -- Fleet status changed from <code>DOWNLOADING</code> to <code>VALIDATING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VALIDATION_LAUNCH_PATH_NOT_FOUND -- Validation of the run-time configuration failed because the
     *        executable specified in a launch path does not exist on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_BUILDING -- Fleet status changed from <code>VALIDATING</code> to <code>BUILDING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VALIDATION_EXECUTABLE_RUNTIME_FAILURE -- Validation of the run-time configuration failed because the
     *        executable specified in a launch path failed to run on the fleet instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_ACTIVATING -- Fleet status changed from <code>BUILDING</code> to <code>ACTIVATING</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_ACTIVATION_FAILED - The fleet failed to successfully complete one of the steps in the fleet
     *        activation process. This event code indicates that the game build was successfully downloaded to a fleet
     *        instance, built, and validated, but was not able to start a server process. A possible reason for failure
     *        is that the game server is not reporting "process ready" to the Amazon GameLift service.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_STATE_ACTIVE -- The fleet's status changed from <code>ACTIVATING</code> to <code>ACTIVE</code>. The
     *        fleet is now ready to host game sessions.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>VPC peering events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FLEET_VPC_PEERING_SUCCEEDED -- A VPC peering connection has been established between the VPC for an Amazon
     *        GameLift fleet and a VPC in your AWS account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VPC_PEERING_FAILED -- A requested VPC peering connection has failed. Event details and status
     *        information (see <a>DescribeVpcPeeringConnections</a>) provide additional detail. A common reason for
     *        peering failure is that the two VPCs have overlapping CIDR blocks of IPv4 addresses. To resolve this,
     *        change the CIDR block for the VPC in your AWS account. For more information on VPC peering failures, see
     *        <a href="https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html">
     *        https://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide/invalid-peering-configurations.html</a>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_VPC_PEERING_DELETED -- A VPC peering connection has been successfully deleted.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Spot instance events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        INSTANCE_INTERRUPTED -- A spot instance was interrupted by EC2 with a two-minute notification.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        <b>Other fleet events:</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        FLEET_SCALING_EVENT -- A change was made to the fleet's capacity settings (desired instances,
     *        minimum/maximum scaling limits). Event messaging includes the new capacity settings.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_NEW_GAME_SESSION_PROTECTION_POLICY_UPDATED -- A change was made to the fleet's game session
     *        protection policy setting. Event messaging includes both the old and new policy setting.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        FLEET_DELETED -- A request to delete a fleet was initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        GENERIC_EVENT -- An unspecified event has occurred.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventCode
     */

    public Event withEventCode(EventCode eventCode) {
        this.eventCode = eventCode.toString();
        return this;
    }

    /**
     * <p>
     * Additional information related to the event.
     * </p>
     * 
     * @param message
     *        Additional information related to the event.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Additional information related to the event.
     * </p>
     * 
     * @return Additional information related to the event.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Additional information related to the event.
     * </p>
     * 
     * @param message
     *        Additional information related to the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds (for
     * example "1469498468.057").
     * </p>
     * 
     * @param eventTime
     *        Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds
     *        (for example "1469498468.057").
     */

    public void setEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * <p>
     * Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds (for
     * example "1469498468.057").
     * </p>
     * 
     * @return Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds
     *         (for example "1469498468.057").
     */

    public java.util.Date getEventTime() {
        return this.eventTime;
    }

    /**
     * <p>
     * Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds (for
     * example "1469498468.057").
     * </p>
     * 
     * @param eventTime
     *        Time stamp indicating when this event occurred. Format is a number expressed in Unix time as milliseconds
     *        (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventTime(java.util.Date eventTime) {
        setEventTime(eventTime);
        return this;
    }

    /**
     * <p>
     * Location of stored logs with additional detail that is related to the event. This is useful for debugging issues.
     * The URL is valid for 15 minutes. You can also access fleet creation logs through the Amazon GameLift console.
     * </p>
     * 
     * @param preSignedLogUrl
     *        Location of stored logs with additional detail that is related to the event. This is useful for debugging
     *        issues. The URL is valid for 15 minutes. You can also access fleet creation logs through the Amazon
     *        GameLift console.
     */

    public void setPreSignedLogUrl(String preSignedLogUrl) {
        this.preSignedLogUrl = preSignedLogUrl;
    }

    /**
     * <p>
     * Location of stored logs with additional detail that is related to the event. This is useful for debugging issues.
     * The URL is valid for 15 minutes. You can also access fleet creation logs through the Amazon GameLift console.
     * </p>
     * 
     * @return Location of stored logs with additional detail that is related to the event. This is useful for debugging
     *         issues. The URL is valid for 15 minutes. You can also access fleet creation logs through the Amazon
     *         GameLift console.
     */

    public String getPreSignedLogUrl() {
        return this.preSignedLogUrl;
    }

    /**
     * <p>
     * Location of stored logs with additional detail that is related to the event. This is useful for debugging issues.
     * The URL is valid for 15 minutes. You can also access fleet creation logs through the Amazon GameLift console.
     * </p>
     * 
     * @param preSignedLogUrl
     *        Location of stored logs with additional detail that is related to the event. This is useful for debugging
     *        issues. The URL is valid for 15 minutes. You can also access fleet creation logs through the Amazon
     *        GameLift console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withPreSignedLogUrl(String preSignedLogUrl) {
        setPreSignedLogUrl(preSignedLogUrl);
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
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
        if (getEventCode() != null)
            sb.append("EventCode: ").append(getEventCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getEventTime() != null)
            sb.append("EventTime: ").append(getEventTime()).append(",");
        if (getPreSignedLogUrl() != null)
            sb.append("PreSignedLogUrl: ").append(getPreSignedLogUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getEventCode() == null ^ this.getEventCode() == null)
            return false;
        if (other.getEventCode() != null && other.getEventCode().equals(this.getEventCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getEventTime() == null ^ this.getEventTime() == null)
            return false;
        if (other.getEventTime() != null && other.getEventTime().equals(this.getEventTime()) == false)
            return false;
        if (other.getPreSignedLogUrl() == null ^ this.getPreSignedLogUrl() == null)
            return false;
        if (other.getPreSignedLogUrl() != null && other.getPreSignedLogUrl().equals(this.getPreSignedLogUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getEventCode() == null) ? 0 : getEventCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        hashCode = prime * hashCode + ((getPreSignedLogUrl() == null) ? 0 : getPreSignedLogUrl().hashCode());
        return hashCode;
    }

    @Override
    public Event clone() {
        try {
            return (Event) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.EventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
