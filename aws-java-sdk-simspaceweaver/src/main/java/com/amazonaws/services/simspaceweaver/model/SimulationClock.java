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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Status information about the simulation clock.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/SimulationClock" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulationClock implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current status of the simulation clock.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The desired status of the simulation clock.
     * </p>
     */
    private String targetStatus;

    /**
     * <p>
     * The current status of the simulation clock.
     * </p>
     * 
     * @param status
     *        The current status of the simulation clock.
     * @see ClockStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the simulation clock.
     * </p>
     * 
     * @return The current status of the simulation clock.
     * @see ClockStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the simulation clock.
     * </p>
     * 
     * @param status
     *        The current status of the simulation clock.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClockStatus
     */

    public SimulationClock withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the simulation clock.
     * </p>
     * 
     * @param status
     *        The current status of the simulation clock.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClockStatus
     */

    public SimulationClock withStatus(ClockStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The desired status of the simulation clock.
     * </p>
     * 
     * @param targetStatus
     *        The desired status of the simulation clock.
     * @see ClockTargetStatus
     */

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    /**
     * <p>
     * The desired status of the simulation clock.
     * </p>
     * 
     * @return The desired status of the simulation clock.
     * @see ClockTargetStatus
     */

    public String getTargetStatus() {
        return this.targetStatus;
    }

    /**
     * <p>
     * The desired status of the simulation clock.
     * </p>
     * 
     * @param targetStatus
     *        The desired status of the simulation clock.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClockTargetStatus
     */

    public SimulationClock withTargetStatus(String targetStatus) {
        setTargetStatus(targetStatus);
        return this;
    }

    /**
     * <p>
     * The desired status of the simulation clock.
     * </p>
     * 
     * @param targetStatus
     *        The desired status of the simulation clock.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClockTargetStatus
     */

    public SimulationClock withTargetStatus(ClockTargetStatus targetStatus) {
        this.targetStatus = targetStatus.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getTargetStatus() != null)
            sb.append("TargetStatus: ").append(getTargetStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimulationClock == false)
            return false;
        SimulationClock other = (SimulationClock) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getTargetStatus() == null ^ this.getTargetStatus() == null)
            return false;
        if (other.getTargetStatus() != null && other.getTargetStatus().equals(this.getTargetStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetStatus() == null) ? 0 : getTargetStatus().hashCode());
        return hashCode;
    }

    @Override
    public SimulationClock clone() {
        try {
            return (SimulationClock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simspaceweaver.model.transform.SimulationClockMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
