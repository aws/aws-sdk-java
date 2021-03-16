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
 * A collection of server process configurations that describe the set of processes to run on each instance in a fleet.
 * Server processes run either an executable in a custom game build or a Realtime Servers script. GameLift launches the
 * configured processes, manages their life cycle, and replaces them as needed. Each instance checks regularly for an
 * updated runtime configuration.
 * </p>
 * <p>
 * A GameLift instance is limited to 50 processes running concurrently. To calculate the total number of processes in a
 * runtime configuration, add the values of the <code>ConcurrentExecutions</code> parameter for each
 * <a>ServerProcess</a>. Learn more about <a
 * href="https://docs.aws.amazon.com/gamelift/latest/developerguide/fleets-multiprocess.html"> Running Multiple
 * Processes on a Fleet</a>.
 * </p>
 * <p>
 * <b>Related actions</b>
 * </p>
 * <p>
 * <a>DescribeRuntimeConfiguration</a> | <a>UpdateRuntimeConfiguration</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/RuntimeConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuntimeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A collection of server process configurations that identify what server processes to run on each instance in a
     * fleet.
     * </p>
     */
    private java.util.List<ServerProcess> serverProcesses;
    /**
     * <p>
     * The number of game sessions in status <code>ACTIVATING</code> to allow on an instance. This setting limits the
     * instance resources that can be used for new game activations at any one time.
     * </p>
     */
    private Integer maxConcurrentGameSessionActivations;
    /**
     * <p>
     * The maximum amount of time (in seconds) allowed to launch a new game session and have it report ready to host
     * players. During this time, the game session is in status <code>ACTIVATING</code>. If the game session does not
     * become active before the timeout, it is ended and the game session status is changed to <code>TERMINATED</code>.
     * </p>
     */
    private Integer gameSessionActivationTimeoutSeconds;

    /**
     * <p>
     * A collection of server process configurations that identify what server processes to run on each instance in a
     * fleet.
     * </p>
     * 
     * @return A collection of server process configurations that identify what server processes to run on each instance
     *         in a fleet.
     */

    public java.util.List<ServerProcess> getServerProcesses() {
        return serverProcesses;
    }

    /**
     * <p>
     * A collection of server process configurations that identify what server processes to run on each instance in a
     * fleet.
     * </p>
     * 
     * @param serverProcesses
     *        A collection of server process configurations that identify what server processes to run on each instance
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
     * A collection of server process configurations that identify what server processes to run on each instance in a
     * fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServerProcesses(java.util.Collection)} or {@link #withServerProcesses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param serverProcesses
     *        A collection of server process configurations that identify what server processes to run on each instance
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
     * A collection of server process configurations that identify what server processes to run on each instance in a
     * fleet.
     * </p>
     * 
     * @param serverProcesses
     *        A collection of server process configurations that identify what server processes to run on each instance
     *        in a fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeConfiguration withServerProcesses(java.util.Collection<ServerProcess> serverProcesses) {
        setServerProcesses(serverProcesses);
        return this;
    }

    /**
     * <p>
     * The number of game sessions in status <code>ACTIVATING</code> to allow on an instance. This setting limits the
     * instance resources that can be used for new game activations at any one time.
     * </p>
     * 
     * @param maxConcurrentGameSessionActivations
     *        The number of game sessions in status <code>ACTIVATING</code> to allow on an instance. This setting limits
     *        the instance resources that can be used for new game activations at any one time.
     */

    public void setMaxConcurrentGameSessionActivations(Integer maxConcurrentGameSessionActivations) {
        this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
    }

    /**
     * <p>
     * The number of game sessions in status <code>ACTIVATING</code> to allow on an instance. This setting limits the
     * instance resources that can be used for new game activations at any one time.
     * </p>
     * 
     * @return The number of game sessions in status <code>ACTIVATING</code> to allow on an instance. This setting
     *         limits the instance resources that can be used for new game activations at any one time.
     */

    public Integer getMaxConcurrentGameSessionActivations() {
        return this.maxConcurrentGameSessionActivations;
    }

    /**
     * <p>
     * The number of game sessions in status <code>ACTIVATING</code> to allow on an instance. This setting limits the
     * instance resources that can be used for new game activations at any one time.
     * </p>
     * 
     * @param maxConcurrentGameSessionActivations
     *        The number of game sessions in status <code>ACTIVATING</code> to allow on an instance. This setting limits
     *        the instance resources that can be used for new game activations at any one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeConfiguration withMaxConcurrentGameSessionActivations(Integer maxConcurrentGameSessionActivations) {
        setMaxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations);
        return this;
    }

    /**
     * <p>
     * The maximum amount of time (in seconds) allowed to launch a new game session and have it report ready to host
     * players. During this time, the game session is in status <code>ACTIVATING</code>. If the game session does not
     * become active before the timeout, it is ended and the game session status is changed to <code>TERMINATED</code>.
     * </p>
     * 
     * @param gameSessionActivationTimeoutSeconds
     *        The maximum amount of time (in seconds) allowed to launch a new game session and have it report ready to
     *        host players. During this time, the game session is in status <code>ACTIVATING</code>. If the game session
     *        does not become active before the timeout, it is ended and the game session status is changed to
     *        <code>TERMINATED</code>.
     */

    public void setGameSessionActivationTimeoutSeconds(Integer gameSessionActivationTimeoutSeconds) {
        this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
    }

    /**
     * <p>
     * The maximum amount of time (in seconds) allowed to launch a new game session and have it report ready to host
     * players. During this time, the game session is in status <code>ACTIVATING</code>. If the game session does not
     * become active before the timeout, it is ended and the game session status is changed to <code>TERMINATED</code>.
     * </p>
     * 
     * @return The maximum amount of time (in seconds) allowed to launch a new game session and have it report ready to
     *         host players. During this time, the game session is in status <code>ACTIVATING</code>. If the game
     *         session does not become active before the timeout, it is ended and the game session status is changed to
     *         <code>TERMINATED</code>.
     */

    public Integer getGameSessionActivationTimeoutSeconds() {
        return this.gameSessionActivationTimeoutSeconds;
    }

    /**
     * <p>
     * The maximum amount of time (in seconds) allowed to launch a new game session and have it report ready to host
     * players. During this time, the game session is in status <code>ACTIVATING</code>. If the game session does not
     * become active before the timeout, it is ended and the game session status is changed to <code>TERMINATED</code>.
     * </p>
     * 
     * @param gameSessionActivationTimeoutSeconds
     *        The maximum amount of time (in seconds) allowed to launch a new game session and have it report ready to
     *        host players. During this time, the game session is in status <code>ACTIVATING</code>. If the game session
     *        does not become active before the timeout, it is ended and the game session status is changed to
     *        <code>TERMINATED</code>.
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
