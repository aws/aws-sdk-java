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
 * A collection of metadata about an app.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/SimulationAppMetadata"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SimulationAppMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The domain of the app. For more information about domains, see <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key concepts</a> in
     * the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The name of the app.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the simulation of the app.
     * </p>
     */
    private String simulation;
    /**
     * <p>
     * The current status of the app.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The desired status of the app.
     * </p>
     */
    private String targetStatus;

    /**
     * <p>
     * The domain of the app. For more information about domains, see <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key concepts</a> in
     * the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     * </p>
     * 
     * @param domain
     *        The domain of the app. For more information about domains, see <a
     *        href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key
     *        concepts</a> in the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The domain of the app. For more information about domains, see <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key concepts</a> in
     * the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     * </p>
     * 
     * @return The domain of the app. For more information about domains, see <a
     *         href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key
     *         concepts</a> in the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The domain of the app. For more information about domains, see <a
     * href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key concepts</a> in
     * the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     * </p>
     * 
     * @param domain
     *        The domain of the app. For more information about domains, see <a
     *        href="https://docs.aws.amazon.com/simspaceweaver/latest/userguide/what-is_key-concepts.html">Key
     *        concepts</a> in the <i>Amazon Web Services SimSpace Weaver User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationAppMetadata withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * 
     * @param name
     *        The name of the app.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * 
     * @return The name of the app.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * 
     * @param name
     *        The name of the app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationAppMetadata withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the simulation of the app.
     * </p>
     * 
     * @param simulation
     *        The name of the simulation of the app.
     */

    public void setSimulation(String simulation) {
        this.simulation = simulation;
    }

    /**
     * <p>
     * The name of the simulation of the app.
     * </p>
     * 
     * @return The name of the simulation of the app.
     */

    public String getSimulation() {
        return this.simulation;
    }

    /**
     * <p>
     * The name of the simulation of the app.
     * </p>
     * 
     * @param simulation
     *        The name of the simulation of the app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SimulationAppMetadata withSimulation(String simulation) {
        setSimulation(simulation);
        return this;
    }

    /**
     * <p>
     * The current status of the app.
     * </p>
     * 
     * @param status
     *        The current status of the app.
     * @see SimulationAppStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the app.
     * </p>
     * 
     * @return The current status of the app.
     * @see SimulationAppStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the app.
     * </p>
     * 
     * @param status
     *        The current status of the app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationAppStatus
     */

    public SimulationAppMetadata withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the app.
     * </p>
     * 
     * @param status
     *        The current status of the app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationAppStatus
     */

    public SimulationAppMetadata withStatus(SimulationAppStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The desired status of the app.
     * </p>
     * 
     * @param targetStatus
     *        The desired status of the app.
     * @see SimulationAppTargetStatus
     */

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    /**
     * <p>
     * The desired status of the app.
     * </p>
     * 
     * @return The desired status of the app.
     * @see SimulationAppTargetStatus
     */

    public String getTargetStatus() {
        return this.targetStatus;
    }

    /**
     * <p>
     * The desired status of the app.
     * </p>
     * 
     * @param targetStatus
     *        The desired status of the app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationAppTargetStatus
     */

    public SimulationAppMetadata withTargetStatus(String targetStatus) {
        setTargetStatus(targetStatus);
        return this;
    }

    /**
     * <p>
     * The desired status of the app.
     * </p>
     * 
     * @param targetStatus
     *        The desired status of the app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationAppTargetStatus
     */

    public SimulationAppMetadata withTargetStatus(SimulationAppTargetStatus targetStatus) {
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSimulation() != null)
            sb.append("Simulation: ").append(getSimulation()).append(",");
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

        if (obj instanceof SimulationAppMetadata == false)
            return false;
        SimulationAppMetadata other = (SimulationAppMetadata) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSimulation() == null ^ this.getSimulation() == null)
            return false;
        if (other.getSimulation() != null && other.getSimulation().equals(this.getSimulation()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSimulation() == null) ? 0 : getSimulation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetStatus() == null) ? 0 : getTargetStatus().hashCode());
        return hashCode;
    }

    @Override
    public SimulationAppMetadata clone() {
        try {
            return (SimulationAppMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simspaceweaver.model.transform.SimulationAppMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
