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
 * A collection of server process configurations that describe what processes to run on each instance in a fleet. Server
 * processes run either a custom game build executable or a Realtime Servers script. Each instance in the fleet starts
 * the specified server processes and continues to start new processes as existing processes end. An instance regularly
 * checks for an updated run-time configuration.
 * </p>
 * <p>
 * The run-time configuration enables the instances in a fleet to run multiple processes simultaneously. Learn more
 * about <a href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-multiprocess.html"> Running Multiple
 * Processes on a Fleet </a>.
 * </p>
 * <p>
 * A Amazon GameLift instance is limited to 50 processes running simultaneously. To calculate the total number of
 * processes in a run-time configuration, add the values of the <code>ConcurrentExecutions</code> parameter for each
 * <a>ServerProcess</a> object.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RuntimeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuntimeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Collection of server process configurations that describe which server processes to run on each instance in a
     * fleet.
     * </p>
     */
    private java.util.List<ServerProcess> serverProcesses;
    /**
     * <p>
     * Maximum number of game sessions with status <code>ACTIVATING</code> to allow on an instance simultaneously. This
     * setting limits the amount of instance resources that can be used for new game activations at any one time.
     * </p>
     */
    private Integer maxConcurrentGameSessionActivations;
    /**
     * <p>
     * Maximum amount of time (in seconds) that a game session can remain in status <code>ACTIVATING</code>. If the game
     * session is not active before the timeout, activation is terminated and the game session status is changed to
     * <code>TERMINATED</code>.
     * </p>
     */
    private Integer gameSessionActivationTimeoutSeconds;

    /**
     * <p>
     * Collection of server process configurations that describe which server processes to run on each instance in a
     * fleet.
     * </p>
     * 
     * @return Collection of server process configurations that describe which server processes to run on each instance
     *         in a fleet.
     */

    public java.util.List<ServerProcess> getServerProcesses() {
        return serverProcesses;
    }

    /**
     * <p>
     * Collection of server process configurations that describe which server processes to run on each instance in a
     * fleet.
     * </p>
     * 
     * @param serverProcesses
     *        Collection of server process configurations that describe which server processes to run on each instance
     *        in a fleet.
     */

    public void setServerProcesses(java.util.Collection<ServerProcess> serverProcesses) {
        if (serverProcesses == null) {
            this.serverProcesses = null;
            return;
        }

        this.serverProcesses = new java.util.ArrayList<ServerProcess>(serverProcesses);
    }

    /**
     * <p>
     * Collection of server process configurations that describe which server processes to run on each instance in a
     * fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerProcesses(java.util.Collection)} or {@link #withServerProcesses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param serverProcesses
     *        Collection of server process configurations that describe which server processes to run on each instance
     *        in a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeConfiguration withServerProcesses(ServerProcess... serverProcesses) {
        if (this.serverProcesses == null) {
            setServerProcesses(new java.util.ArrayList<ServerProcess>(serverProcesses.length));
        }
        for (ServerProcess ele : serverProcesses) {
            this.serverProcesses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of server process configurations that describe which server processes to run on each instance in a
     * fleet.
     * </p>
     * 
     * @param serverProcesses
     *        Collection of server process configurations that describe which server processes to run on each instance
     *        in a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeConfiguration withServerProcesses(java.util.Collection<ServerProcess> serverProcesses) {
        setServerProcesses(serverProcesses);
        return this;
    }

    /**
     * <p>
     * Maximum number of game sessions with status <code>ACTIVATING</code> to allow on an instance simultaneously. This
     * setting limits the amount of instance resources that can be used for new game activations at any one time.
     * </p>
     * 
     * @param maxConcurrentGameSessionActivations
     *        Maximum number of game sessions with status <code>ACTIVATING</code> to allow on an instance
     *        simultaneously. This setting limits the amount of instance resources that can be used for new game
     *        activations at any one time.
     */

    public void setMaxConcurrentGameSessionActivations(Integer maxConcurrentGameSessionActivations) {
        this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
    }

    /**
     * <p>
     * Maximum number of game sessions with status <code>ACTIVATING</code> to allow on an instance simultaneously. This
     * setting limits the amount of instance resources that can be used for new game activations at any one time.
     * </p>
     * 
     * @return Maximum number of game sessions with status <code>ACTIVATING</code> to allow on an instance
     *         simultaneously. This setting limits the amount of instance resources that can be used for new game
     *         activations at any one time.
     */

    public Integer getMaxConcurrentGameSessionActivations() {
        return this.maxConcurrentGameSessionActivations;
    }

    /**
     * <p>
     * Maximum number of game sessions with status <code>ACTIVATING</code> to allow on an instance simultaneously. This
     * setting limits the amount of instance resources that can be used for new game activations at any one time.
     * </p>
     * 
     * @param maxConcurrentGameSessionActivations
     *        Maximum number of game sessions with status <code>ACTIVATING</code> to allow on an instance
     *        simultaneously. This setting limits the amount of instance resources that can be used for new game
     *        activations at any one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeConfiguration withMaxConcurrentGameSessionActivations(Integer maxConcurrentGameSessionActivations) {
        setMaxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations);
        return this;
    }

    /**
     * <p>
     * Maximum amount of time (in seconds) that a game session can remain in status <code>ACTIVATING</code>. If the game
     * session is not active before the timeout, activation is terminated and the game session status is changed to
     * <code>TERMINATED</code>.
     * </p>
     * 
     * @param gameSessionActivationTimeoutSeconds
     *        Maximum amount of time (in seconds) that a game session can remain in status <code>ACTIVATING</code>. If
     *        the game session is not active before the timeout, activation is terminated and the game session status is
     *        changed to <code>TERMINATED</code>.
     */

    public void setGameSessionActivationTimeoutSeconds(Integer gameSessionActivationTimeoutSeconds) {
        this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
    }

    /**
     * <p>
     * Maximum amount of time (in seconds) that a game session can remain in status <code>ACTIVATING</code>. If the game
     * session is not active before the timeout, activation is terminated and the game session status is changed to
     * <code>TERMINATED</code>.
     * </p>
     * 
     * @return Maximum amount of time (in seconds) that a game session can remain in status <code>ACTIVATING</code>. If
     *         the game session is not active before the timeout, activation is terminated and the game session status
     *         is changed to <code>TERMINATED</code>.
     */

    public Integer getGameSessionActivationTimeoutSeconds() {
        return this.gameSessionActivationTimeoutSeconds;
    }

    /**
     * <p>
     * Maximum amount of time (in seconds) that a game session can remain in status <code>ACTIVATING</code>. If the game
     * session is not active before the timeout, activation is terminated and the game session status is changed to
     * <code>TERMINATED</code>.
     * </p>
     * 
     * @param gameSessionActivationTimeoutSeconds
     *        Maximum amount of time (in seconds) that a game session can remain in status <code>ACTIVATING</code>. If
     *        the game session is not active before the timeout, activation is terminated and the game session status is
     *        changed to <code>TERMINATED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeConfiguration withGameSessionActivationTimeoutSeconds(Integer gameSessionActivationTimeoutSeconds) {
        setGameSessionActivationTimeoutSeconds(gameSessionActivationTimeoutSeconds);
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
        if (getServerProcesses() != null)
            sb.append("ServerProcesses: ").append(getServerProcesses()).append(",");
        if (getMaxConcurrentGameSessionActivations() != null)
            sb.append("MaxConcurrentGameSessionActivations: ").append(getMaxConcurrentGameSessionActivations()).append(",");
        if (getGameSessionActivationTimeoutSeconds() != null)
            sb.append("GameSessionActivationTimeoutSeconds: ").append(getGameSessionActivationTimeoutSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuntimeConfiguration == false)
            return false;
        RuntimeConfiguration other = (RuntimeConfiguration) obj;
        if (other.getServerProcesses() == null ^ this.getServerProcesses() == null)
            return false;
        if (other.getServerProcesses() != null && other.getServerProcesses().equals(this.getServerProcesses()) == false)
            return false;
        if (other.getMaxConcurrentGameSessionActivations() == null ^ this.getMaxConcurrentGameSessionActivations() == null)
            return false;
        if (other.getMaxConcurrentGameSessionActivations() != null
                && other.getMaxConcurrentGameSessionActivations().equals(this.getMaxConcurrentGameSessionActivations()) == false)
            return false;
        if (other.getGameSessionActivationTimeoutSeconds() == null ^ this.getGameSessionActivationTimeoutSeconds() == null)
            return false;
        if (other.getGameSessionActivationTimeoutSeconds() != null
                && other.getGameSessionActivationTimeoutSeconds().equals(this.getGameSessionActivationTimeoutSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerProcesses() == null) ? 0 : getServerProcesses().hashCode());
        hashCode = prime * hashCode + ((getMaxConcurrentGameSessionActivations() == null) ? 0 : getMaxConcurrentGameSessionActivations().hashCode());
        hashCode = prime * hashCode + ((getGameSessionActivationTimeoutSeconds() == null) ? 0 : getGameSessionActivationTimeoutSeconds().hashCode());
        return hashCode;
    }

    @Override
    public RuntimeConfiguration clone() {
        try {
            return (RuntimeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.RuntimeConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
