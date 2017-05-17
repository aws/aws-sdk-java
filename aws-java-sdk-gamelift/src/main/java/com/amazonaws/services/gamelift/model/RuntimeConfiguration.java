/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Collection of server process configurations that describe what processes should be run on each instance in a fleet.
 * An instance can launch and maintain multiple server processes based on the runtime configuration; it regularly checks
 * for an updated runtime configuration and starts new server processes to match the latest version.
 * </p>
 * <p>
 * The key purpose of a runtime configuration with multiple server process configurations is to be able to run more than
 * one kind of game server in a single fleet. You can include configurations for more than one server executable in
 * order to run two or more different programs to run on the same instance. This option might be useful, for example, to
 * run more than one version of your game server on the same fleet. Another option is to specify configurations for the
 * same server executable but with different launch parameters.
 * </p>
 * <p>
 * A Amazon GameLift instance is limited to 50 processes running simultaneously. To calculate the total number of
 * processes specified in a runtime configuration, add the values of the <code>ConcurrentExecutions</code> parameter for
 * each <code> <a>ServerProcess</a> </code> object in the runtime configuration.
 * </p>
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
     * Maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This setting
     * limits the amount of instance resources that can be used for new game activations at any one time.
     * </p>
     */
    private Integer maxConcurrentGameSessionActivations;
    /**
     * <p>
     * Maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game session is
     * not active before the timeout, activation is terminated and the game session status is changed to TERMINATED.
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
     * Maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This setting
     * limits the amount of instance resources that can be used for new game activations at any one time.
     * </p>
     * 
     * @param maxConcurrentGameSessionActivations
     *        Maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This
     *        setting limits the amount of instance resources that can be used for new game activations at any one time.
     */

    public void setMaxConcurrentGameSessionActivations(Integer maxConcurrentGameSessionActivations) {
        this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
    }

    /**
     * <p>
     * Maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This setting
     * limits the amount of instance resources that can be used for new game activations at any one time.
     * </p>
     * 
     * @return Maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This
     *         setting limits the amount of instance resources that can be used for new game activations at any one
     *         time.
     */

    public Integer getMaxConcurrentGameSessionActivations() {
        return this.maxConcurrentGameSessionActivations;
    }

    /**
     * <p>
     * Maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This setting
     * limits the amount of instance resources that can be used for new game activations at any one time.
     * </p>
     * 
     * @param maxConcurrentGameSessionActivations
     *        Maximum number of game sessions with status ACTIVATING to allow on an instance simultaneously. This
     *        setting limits the amount of instance resources that can be used for new game activations at any one time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeConfiguration withMaxConcurrentGameSessionActivations(Integer maxConcurrentGameSessionActivations) {
        setMaxConcurrentGameSessionActivations(maxConcurrentGameSessionActivations);
        return this;
    }

    /**
     * <p>
     * Maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game session is
     * not active before the timeout, activation is terminated and the game session status is changed to TERMINATED.
     * </p>
     * 
     * @param gameSessionActivationTimeoutSeconds
     *        Maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game
     *        session is not active before the timeout, activation is terminated and the game session status is changed
     *        to TERMINATED.
     */

    public void setGameSessionActivationTimeoutSeconds(Integer gameSessionActivationTimeoutSeconds) {
        this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
    }

    /**
     * <p>
     * Maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game session is
     * not active before the timeout, activation is terminated and the game session status is changed to TERMINATED.
     * </p>
     * 
     * @return Maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game
     *         session is not active before the timeout, activation is terminated and the game session status is changed
     *         to TERMINATED.
     */

    public Integer getGameSessionActivationTimeoutSeconds() {
        return this.gameSessionActivationTimeoutSeconds;
    }

    /**
     * <p>
     * Maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game session is
     * not active before the timeout, activation is terminated and the game session status is changed to TERMINATED.
     * </p>
     * 
     * @param gameSessionActivationTimeoutSeconds
     *        Maximum amount of time (in seconds) that a game session can remain in status ACTIVATING. If the game
     *        session is not active before the timeout, activation is terminated and the game session status is changed
     *        to TERMINATED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuntimeConfiguration withGameSessionActivationTimeoutSeconds(Integer gameSessionActivationTimeoutSeconds) {
        setGameSessionActivationTimeoutSeconds(gameSessionActivationTimeoutSeconds);
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
