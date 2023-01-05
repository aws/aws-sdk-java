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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetPositionConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Deprecated
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPositionConfigurationResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The wrapper for the solver configuration details object.
     * </p>
     */
    private PositionSolverDetails solvers;
    /**
     * <p>
     * The position data destination that describes the AWS IoT rule that processes the device's position data for use
     * by AWS IoT Core for LoRaWAN.
     * </p>
     */
    private String destination;

    /**
     * <p>
     * The wrapper for the solver configuration details object.
     * </p>
     * 
     * @param solvers
     *        The wrapper for the solver configuration details object.
     */

    public void setSolvers(PositionSolverDetails solvers) {
        this.solvers = solvers;
    }

    /**
     * <p>
     * The wrapper for the solver configuration details object.
     * </p>
     * 
     * @return The wrapper for the solver configuration details object.
     */

    public PositionSolverDetails getSolvers() {
        return this.solvers;
    }

    /**
     * <p>
     * The wrapper for the solver configuration details object.
     * </p>
     * 
     * @param solvers
     *        The wrapper for the solver configuration details object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionConfigurationResult withSolvers(PositionSolverDetails solvers) {
        setSolvers(solvers);
        return this;
    }

    /**
     * <p>
     * The position data destination that describes the AWS IoT rule that processes the device's position data for use
     * by AWS IoT Core for LoRaWAN.
     * </p>
     * 
     * @param destination
     *        The position data destination that describes the AWS IoT rule that processes the device's position data
     *        for use by AWS IoT Core for LoRaWAN.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The position data destination that describes the AWS IoT rule that processes the device's position data for use
     * by AWS IoT Core for LoRaWAN.
     * </p>
     * 
     * @return The position data destination that describes the AWS IoT rule that processes the device's position data
     *         for use by AWS IoT Core for LoRaWAN.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The position data destination that describes the AWS IoT rule that processes the device's position data for use
     * by AWS IoT Core for LoRaWAN.
     * </p>
     * 
     * @param destination
     *        The position data destination that describes the AWS IoT rule that processes the device's position data
     *        for use by AWS IoT Core for LoRaWAN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPositionConfigurationResult withDestination(String destination) {
        setDestination(destination);
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
        if (getSolvers() != null)
            sb.append("Solvers: ").append(getSolvers()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPositionConfigurationResult == false)
            return false;
        GetPositionConfigurationResult other = (GetPositionConfigurationResult) obj;
        if (other.getSolvers() == null ^ this.getSolvers() == null)
            return false;
        if (other.getSolvers() != null && other.getSolvers().equals(this.getSolvers()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSolvers() == null) ? 0 : getSolvers().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        return hashCode;
    }

    @Override
    public GetPositionConfigurationResult clone() {
        try {
            return (GetPositionConfigurationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
