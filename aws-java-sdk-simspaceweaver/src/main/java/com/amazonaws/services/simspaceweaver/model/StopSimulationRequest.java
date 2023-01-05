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
package com.amazonaws.services.simspaceweaver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StopSimulation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopSimulationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the simulation.
     * </p>
     */
    private String simulation;

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @param simulation
     *        The name of the simulation.
     */

    public void setSimulation(String simulation) {
        this.simulation = simulation;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @return The name of the simulation.
     */

    public String getSimulation() {
        return this.simulation;
    }

    /**
     * <p>
     * The name of the simulation.
     * </p>
     * 
     * @param simulation
     *        The name of the simulation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopSimulationRequest withSimulation(String simulation) {
        setSimulation(simulation);
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
        if (getSimulation() != null)
            sb.append("Simulation: ").append(getSimulation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopSimulationRequest == false)
            return false;
        StopSimulationRequest other = (StopSimulationRequest) obj;
        if (other.getSimulation() == null ^ this.getSimulation() == null)
            return false;
        if (other.getSimulation() != null && other.getSimulation().equals(this.getSimulation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSimulation() == null) ? 0 : getSimulation().hashCode());
        return hashCode;
    }

    @Override
    public StopSimulationRequest clone() {
        return (StopSimulationRequest) super.clone();
    }

}
