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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a state change.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/StateReason" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StateReason implements Serializable, Cloneable {

    /**
     * <p>
     * The reason code for the state change.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The message for the state change.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Server.InsufficientInstanceCapacity</code>: There was insufficient capacity available to satisfy the launch
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.InternalError</code>: An internal error caused the instance to terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.ScheduledStop</code>: The instance was stopped due to a scheduled retirement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceShutdown</code>: The instance was stopped because the number of Spot requests with a
     * maximum price equal to or higher than the Spot price exceeded available capacity or because of an increase in the
     * Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceTermination</code>: The instance was terminated because the number of Spot requests with
     * a maximum price equal to or higher than the Spot price exceeded available capacity or because of an increase in
     * the Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceInitiatedShutdown</code>: The instance was shut down using the <code>shutdown -h</code>
     * command from the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceTerminated</code>: The instance was terminated or rebooted during AMI creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InternalError</code>: A client error caused the instance to terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InvalidSnapshot.NotFound</code>: The specified snapshot was not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedHibernate</code>: Hibernation was initiated on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedShutdown</code>: The instance was shut down using the Amazon EC2 API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.VolumeLimitExceeded</code>: The limit on the number of EBS volumes or total storage was exceeded.
     * Decrease usage or request an increase in your account limits.
     * </p>
     * </li>
     * </ul>
     */
    private String message;

    /**
     * <p>
     * The reason code for the state change.
     * </p>
     * 
     * @param code
     *        The reason code for the state change.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The reason code for the state change.
     * </p>
     * 
     * @return The reason code for the state change.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The reason code for the state change.
     * </p>
     * 
     * @param code
     *        The reason code for the state change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StateReason withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The message for the state change.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Server.InsufficientInstanceCapacity</code>: There was insufficient capacity available to satisfy the launch
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.InternalError</code>: An internal error caused the instance to terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.ScheduledStop</code>: The instance was stopped due to a scheduled retirement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceShutdown</code>: The instance was stopped because the number of Spot requests with a
     * maximum price equal to or higher than the Spot price exceeded available capacity or because of an increase in the
     * Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceTermination</code>: The instance was terminated because the number of Spot requests with
     * a maximum price equal to or higher than the Spot price exceeded available capacity or because of an increase in
     * the Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceInitiatedShutdown</code>: The instance was shut down using the <code>shutdown -h</code>
     * command from the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceTerminated</code>: The instance was terminated or rebooted during AMI creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InternalError</code>: A client error caused the instance to terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InvalidSnapshot.NotFound</code>: The specified snapshot was not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedHibernate</code>: Hibernation was initiated on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedShutdown</code>: The instance was shut down using the Amazon EC2 API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.VolumeLimitExceeded</code>: The limit on the number of EBS volumes or total storage was exceeded.
     * Decrease usage or request an increase in your account limits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param message
     *        The message for the state change.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Server.InsufficientInstanceCapacity</code>: There was insufficient capacity available to satisfy the
     *        launch request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Server.InternalError</code>: An internal error caused the instance to terminate during launch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Server.ScheduledStop</code>: The instance was stopped due to a scheduled retirement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Server.SpotInstanceShutdown</code>: The instance was stopped because the number of Spot requests
     *        with a maximum price equal to or higher than the Spot price exceeded available capacity or because of an
     *        increase in the Spot price.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Server.SpotInstanceTermination</code>: The instance was terminated because the number of Spot
     *        requests with a maximum price equal to or higher than the Spot price exceeded available capacity or
     *        because of an increase in the Spot price.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.InstanceInitiatedShutdown</code>: The instance was shut down using the
     *        <code>shutdown -h</code> command from the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.InstanceTerminated</code>: The instance was terminated or rebooted during AMI creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.InternalError</code>: A client error caused the instance to terminate during launch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.InvalidSnapshot.NotFound</code>: The specified snapshot was not found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.UserInitiatedHibernate</code>: Hibernation was initiated on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.UserInitiatedShutdown</code>: The instance was shut down using the Amazon EC2 API.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.VolumeLimitExceeded</code>: The limit on the number of EBS volumes or total storage was
     *        exceeded. Decrease usage or request an increase in your account limits.
     *        </p>
     *        </li>
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message for the state change.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Server.InsufficientInstanceCapacity</code>: There was insufficient capacity available to satisfy the launch
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.InternalError</code>: An internal error caused the instance to terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.ScheduledStop</code>: The instance was stopped due to a scheduled retirement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceShutdown</code>: The instance was stopped because the number of Spot requests with a
     * maximum price equal to or higher than the Spot price exceeded available capacity or because of an increase in the
     * Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceTermination</code>: The instance was terminated because the number of Spot requests with
     * a maximum price equal to or higher than the Spot price exceeded available capacity or because of an increase in
     * the Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceInitiatedShutdown</code>: The instance was shut down using the <code>shutdown -h</code>
     * command from the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceTerminated</code>: The instance was terminated or rebooted during AMI creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InternalError</code>: A client error caused the instance to terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InvalidSnapshot.NotFound</code>: The specified snapshot was not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedHibernate</code>: Hibernation was initiated on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedShutdown</code>: The instance was shut down using the Amazon EC2 API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.VolumeLimitExceeded</code>: The limit on the number of EBS volumes or total storage was exceeded.
     * Decrease usage or request an increase in your account limits.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The message for the state change.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Server.InsufficientInstanceCapacity</code>: There was insufficient capacity available to satisfy
     *         the launch request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Server.InternalError</code>: An internal error caused the instance to terminate during launch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Server.ScheduledStop</code>: The instance was stopped due to a scheduled retirement.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Server.SpotInstanceShutdown</code>: The instance was stopped because the number of Spot requests
     *         with a maximum price equal to or higher than the Spot price exceeded available capacity or because of an
     *         increase in the Spot price.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Server.SpotInstanceTermination</code>: The instance was terminated because the number of Spot
     *         requests with a maximum price equal to or higher than the Spot price exceeded available capacity or
     *         because of an increase in the Spot price.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.InstanceInitiatedShutdown</code>: The instance was shut down using the
     *         <code>shutdown -h</code> command from the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.InstanceTerminated</code>: The instance was terminated or rebooted during AMI creation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.InternalError</code>: A client error caused the instance to terminate during launch.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.InvalidSnapshot.NotFound</code>: The specified snapshot was not found.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.UserInitiatedHibernate</code>: Hibernation was initiated on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.UserInitiatedShutdown</code>: The instance was shut down using the Amazon EC2 API.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Client.VolumeLimitExceeded</code>: The limit on the number of EBS volumes or total storage was
     *         exceeded. Decrease usage or request an increase in your account limits.
     *         </p>
     *         </li>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message for the state change.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Server.InsufficientInstanceCapacity</code>: There was insufficient capacity available to satisfy the launch
     * request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.InternalError</code>: An internal error caused the instance to terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.ScheduledStop</code>: The instance was stopped due to a scheduled retirement.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceShutdown</code>: The instance was stopped because the number of Spot requests with a
     * maximum price equal to or higher than the Spot price exceeded available capacity or because of an increase in the
     * Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Server.SpotInstanceTermination</code>: The instance was terminated because the number of Spot requests with
     * a maximum price equal to or higher than the Spot price exceeded available capacity or because of an increase in
     * the Spot price.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceInitiatedShutdown</code>: The instance was shut down using the <code>shutdown -h</code>
     * command from the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InstanceTerminated</code>: The instance was terminated or rebooted during AMI creation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InternalError</code>: A client error caused the instance to terminate during launch.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.InvalidSnapshot.NotFound</code>: The specified snapshot was not found.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedHibernate</code>: Hibernation was initiated on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.UserInitiatedShutdown</code>: The instance was shut down using the Amazon EC2 API.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Client.VolumeLimitExceeded</code>: The limit on the number of EBS volumes or total storage was exceeded.
     * Decrease usage or request an increase in your account limits.
     * </p>
     * </li>
     * </ul>
     * 
     * @param message
     *        The message for the state change.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Server.InsufficientInstanceCapacity</code>: There was insufficient capacity available to satisfy the
     *        launch request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Server.InternalError</code>: An internal error caused the instance to terminate during launch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Server.ScheduledStop</code>: The instance was stopped due to a scheduled retirement.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Server.SpotInstanceShutdown</code>: The instance was stopped because the number of Spot requests
     *        with a maximum price equal to or higher than the Spot price exceeded available capacity or because of an
     *        increase in the Spot price.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Server.SpotInstanceTermination</code>: The instance was terminated because the number of Spot
     *        requests with a maximum price equal to or higher than the Spot price exceeded available capacity or
     *        because of an increase in the Spot price.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.InstanceInitiatedShutdown</code>: The instance was shut down using the
     *        <code>shutdown -h</code> command from the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.InstanceTerminated</code>: The instance was terminated or rebooted during AMI creation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.InternalError</code>: A client error caused the instance to terminate during launch.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.InvalidSnapshot.NotFound</code>: The specified snapshot was not found.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.UserInitiatedHibernate</code>: Hibernation was initiated on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.UserInitiatedShutdown</code>: The instance was shut down using the Amazon EC2 API.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Client.VolumeLimitExceeded</code>: The limit on the number of EBS volumes or total storage was
     *        exceeded. Decrease usage or request an increase in your account limits.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StateReason withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: ").append(getCode()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StateReason == false)
            return false;
        StateReason other = (StateReason) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public StateReason clone() {
        try {
            return (StateReason) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
