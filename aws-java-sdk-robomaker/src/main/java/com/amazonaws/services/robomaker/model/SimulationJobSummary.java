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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information for a simulation job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/SimulationJobSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulationJobSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation job.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The name of the simulation job.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The status of the simulation job.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A list of simulation job simulation application names.
     * </p>
     */
    private java.util.List<String> simulationApplicationNames;
    /**
     * <p>
     * A list of simulation job robot application names.
     * </p>
     */
    private java.util.List<String> robotApplicationNames;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the simulation job.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the simulation job.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the simulation job.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the simulation job was last updated.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job was last updated.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the simulation job was last updated.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the simulation job was last updated.
     * </p>
     * 
     * @param lastUpdatedAt
     *        The time, in milliseconds since the epoch, when the simulation job was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobSummary withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The name of the simulation job.
     * </p>
     * 
     * @param name
     *        The name of the simulation job.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the simulation job.
     * </p>
     * 
     * @return The name of the simulation job.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the simulation job.
     * </p>
     * 
     * @param name
     *        The name of the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The status of the simulation job.
     * </p>
     * 
     * @param status
     *        The status of the simulation job.
     * @see SimulationJobStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the simulation job.
     * </p>
     * 
     * @return The status of the simulation job.
     * @see SimulationJobStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the simulation job.
     * </p>
     * 
     * @param status
     *        The status of the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationJobStatus
     */

    public SimulationJobSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the simulation job.
     * </p>
     * 
     * @param status
     *        The status of the simulation job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationJobStatus
     */

    public SimulationJobSummary withStatus(SimulationJobStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A list of simulation job simulation application names.
     * </p>
     * 
     * @return A list of simulation job simulation application names.
     */

    public java.util.List<String> getSimulationApplicationNames() {
        return simulationApplicationNames;
    }

    /**
     * <p>
     * A list of simulation job simulation application names.
     * </p>
     * 
     * @param simulationApplicationNames
     *        A list of simulation job simulation application names.
     */

    public void setSimulationApplicationNames(java.util.Collection<String> simulationApplicationNames) {
        if (simulationApplicationNames == null) {
            this.simulationApplicationNames = null;
            return;
        }

        this.simulationApplicationNames = new java.util.ArrayList<String>(simulationApplicationNames);
    }

    /**
     * <p>
     * A list of simulation job simulation application names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSimulationApplicationNames(java.util.Collection)} or
     * {@link #withSimulationApplicationNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param simulationApplicationNames
     *        A list of simulation job simulation application names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobSummary withSimulationApplicationNames(String... simulationApplicationNames) {
        if (this.simulationApplicationNames == null) {
            setSimulationApplicationNames(new java.util.ArrayList<String>(simulationApplicationNames.length));
        }
        for (String ele : simulationApplicationNames) {
            this.simulationApplicationNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of simulation job simulation application names.
     * </p>
     * 
     * @param simulationApplicationNames
     *        A list of simulation job simulation application names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobSummary withSimulationApplicationNames(java.util.Collection<String> simulationApplicationNames) {
        setSimulationApplicationNames(simulationApplicationNames);
        return this;
    }

    /**
     * <p>
     * A list of simulation job robot application names.
     * </p>
     * 
     * @return A list of simulation job robot application names.
     */

    public java.util.List<String> getRobotApplicationNames() {
        return robotApplicationNames;
    }

    /**
     * <p>
     * A list of simulation job robot application names.
     * </p>
     * 
     * @param robotApplicationNames
     *        A list of simulation job robot application names.
     */

    public void setRobotApplicationNames(java.util.Collection<String> robotApplicationNames) {
        if (robotApplicationNames == null) {
            this.robotApplicationNames = null;
            return;
        }

        this.robotApplicationNames = new java.util.ArrayList<String>(robotApplicationNames);
    }

    /**
     * <p>
     * A list of simulation job robot application names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRobotApplicationNames(java.util.Collection)} or
     * {@link #withRobotApplicationNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param robotApplicationNames
     *        A list of simulation job robot application names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobSummary withRobotApplicationNames(String... robotApplicationNames) {
        if (this.robotApplicationNames == null) {
            setRobotApplicationNames(new java.util.ArrayList<String>(robotApplicationNames.length));
        }
        for (String ele : robotApplicationNames) {
            this.robotApplicationNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of simulation job robot application names.
     * </p>
     * 
     * @param robotApplicationNames
     *        A list of simulation job robot application names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationJobSummary withRobotApplicationNames(java.util.Collection<String> robotApplicationNames) {
        setRobotApplicationNames(robotApplicationNames);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSimulationApplicationNames() != null)
            sb.append("SimulationApplicationNames: ").append(getSimulationApplicationNames()).append(",");
        if (getRobotApplicationNames() != null)
            sb.append("RobotApplicationNames: ").append(getRobotApplicationNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SimulationJobSummary == false)
            return false;
        SimulationJobSummary other = (SimulationJobSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSimulationApplicationNames() == null ^ this.getSimulationApplicationNames() == null)
            return false;
        if (other.getSimulationApplicationNames() != null && other.getSimulationApplicationNames().equals(this.getSimulationApplicationNames()) == false)
            return false;
        if (other.getRobotApplicationNames() == null ^ this.getRobotApplicationNames() == null)
            return false;
        if (other.getRobotApplicationNames() != null && other.getRobotApplicationNames().equals(this.getRobotApplicationNames()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSimulationApplicationNames() == null) ? 0 : getSimulationApplicationNames().hashCode());
        hashCode = prime * hashCode + ((getRobotApplicationNames() == null) ? 0 : getRobotApplicationNames().hashCode());
        return hashCode;
    }

    @Override
    public SimulationJobSummary clone() {
        try {
            return (SimulationJobSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.SimulationJobSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
