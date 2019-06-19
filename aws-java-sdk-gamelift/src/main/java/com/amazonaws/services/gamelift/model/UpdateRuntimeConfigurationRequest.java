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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/UpdateRuntimeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRuntimeConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet to update run-time configuration for.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom
     * game build executable or a Realtime Servers script. The run-time configuration lists the types of server
     * processes to run on an instance and includes the following configuration settings: the server executable or
     * launch script file, launch parameters, and the number of processes to run concurrently on each instance. A
     * CreateFleet request must include a run-time configuration with at least one server process configuration.
     * </p>
     */
    private RuntimeConfiguration runtimeConfiguration;

    /**
     * <p>
     * Unique identifier for a fleet to update run-time configuration for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to update run-time configuration for.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to update run-time configuration for.
     * </p>
     * 
     * @return Unique identifier for a fleet to update run-time configuration for.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet to update run-time configuration for.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet to update run-time configuration for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuntimeConfigurationRequest withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom
     * game build executable or a Realtime Servers script. The run-time configuration lists the types of server
     * processes to run on an instance and includes the following configuration settings: the server executable or
     * launch script file, launch parameters, and the number of processes to run concurrently on each instance. A
     * CreateFleet request must include a run-time configuration with at least one server process configuration.
     * </p>
     * 
     * @param runtimeConfiguration
     *        Instructions for launching server processes on each instance in the fleet. Server processes run either a
     *        custom game build executable or a Realtime Servers script. The run-time configuration lists the types of
     *        server processes to run on an instance and includes the following configuration settings: the server
     *        executable or launch script file, launch parameters, and the number of processes to run concurrently on
     *        each instance. A CreateFleet request must include a run-time configuration with at least one server
     *        process configuration.
     */

    public void setRuntimeConfiguration(RuntimeConfiguration runtimeConfiguration) {
        this.runtimeConfiguration = runtimeConfiguration;
    }

    /**
     * <p>
     * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom
     * game build executable or a Realtime Servers script. The run-time configuration lists the types of server
     * processes to run on an instance and includes the following configuration settings: the server executable or
     * launch script file, launch parameters, and the number of processes to run concurrently on each instance. A
     * CreateFleet request must include a run-time configuration with at least one server process configuration.
     * </p>
     * 
     * @return Instructions for launching server processes on each instance in the fleet. Server processes run either a
     *         custom game build executable or a Realtime Servers script. The run-time configuration lists the types of
     *         server processes to run on an instance and includes the following configuration settings: the server
     *         executable or launch script file, launch parameters, and the number of processes to run concurrently on
     *         each instance. A CreateFleet request must include a run-time configuration with at least one server
     *         process configuration.
     */

    public RuntimeConfiguration getRuntimeConfiguration() {
        return this.runtimeConfiguration;
    }

    /**
     * <p>
     * Instructions for launching server processes on each instance in the fleet. Server processes run either a custom
     * game build executable or a Realtime Servers script. The run-time configuration lists the types of server
     * processes to run on an instance and includes the following configuration settings: the server executable or
     * launch script file, launch parameters, and the number of processes to run concurrently on each instance. A
     * CreateFleet request must include a run-time configuration with at least one server process configuration.
     * </p>
     * 
     * @param runtimeConfiguration
     *        Instructions for launching server processes on each instance in the fleet. Server processes run either a
     *        custom game build executable or a Realtime Servers script. The run-time configuration lists the types of
     *        server processes to run on an instance and includes the following configuration settings: the server
     *        executable or launch script file, launch parameters, and the number of processes to run concurrently on
     *        each instance. A CreateFleet request must include a run-time configuration with at least one server
     *        process configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRuntimeConfigurationRequest withRuntimeConfiguration(RuntimeConfiguration runtimeConfiguration) {
        setRuntimeConfiguration(runtimeConfiguration);
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
        if (getRuntimeConfiguration() != null)
            sb.append("RuntimeConfiguration: ").append(getRuntimeConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRuntimeConfigurationRequest == false)
            return false;
        UpdateRuntimeConfigurationRequest other = (UpdateRuntimeConfigurationRequest) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getRuntimeConfiguration() == null ^ this.getRuntimeConfiguration() == null)
            return false;
        if (other.getRuntimeConfiguration() != null && other.getRuntimeConfiguration().equals(this.getRuntimeConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getRuntimeConfiguration() == null) ? 0 : getRuntimeConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRuntimeConfigurationRequest clone() {
        return (UpdateRuntimeConfigurationRequest) super.clone();
    }

}
