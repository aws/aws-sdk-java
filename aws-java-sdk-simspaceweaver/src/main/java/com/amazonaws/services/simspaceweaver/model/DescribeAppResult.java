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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/DescribeApp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeAppResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The description of the app.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the domain of the app.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * Information about the network endpoint for the custom app. You can use the endpoint to connect to the custom app.
     * </p>
     */
    private SimulationAppEndpointInfo endpointInfo;

    private LaunchOverrides launchOverrides;
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
     * The current lifecycle state of the custom app.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The desired lifecycle state of the custom app.
     * </p>
     */
    private String targetStatus;

    /**
     * <p>
     * The description of the app.
     * </p>
     * 
     * @param description
     *        The description of the app.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the app.
     * </p>
     * 
     * @return The description of the app.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the app.
     * </p>
     * 
     * @param description
     *        The description of the app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the domain of the app.
     * </p>
     * 
     * @param domain
     *        The name of the domain of the app.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain of the app.
     * </p>
     * 
     * @return The name of the domain of the app.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain of the app.
     * </p>
     * 
     * @param domain
     *        The name of the domain of the app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppResult withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Information about the network endpoint for the custom app. You can use the endpoint to connect to the custom app.
     * </p>
     * 
     * @param endpointInfo
     *        Information about the network endpoint for the custom app. You can use the endpoint to connect to the
     *        custom app.
     */

    public void setEndpointInfo(SimulationAppEndpointInfo endpointInfo) {
        this.endpointInfo = endpointInfo;
    }

    /**
     * <p>
     * Information about the network endpoint for the custom app. You can use the endpoint to connect to the custom app.
     * </p>
     * 
     * @return Information about the network endpoint for the custom app. You can use the endpoint to connect to the
     *         custom app.
     */

    public SimulationAppEndpointInfo getEndpointInfo() {
        return this.endpointInfo;
    }

    /**
     * <p>
     * Information about the network endpoint for the custom app. You can use the endpoint to connect to the custom app.
     * </p>
     * 
     * @param endpointInfo
     *        Information about the network endpoint for the custom app. You can use the endpoint to connect to the
     *        custom app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppResult withEndpointInfo(SimulationAppEndpointInfo endpointInfo) {
        setEndpointInfo(endpointInfo);
        return this;
    }

    /**
     * @param launchOverrides
     */

    public void setLaunchOverrides(LaunchOverrides launchOverrides) {
        this.launchOverrides = launchOverrides;
    }

    /**
     * @return
     */

    public LaunchOverrides getLaunchOverrides() {
        return this.launchOverrides;
    }

    /**
     * @param launchOverrides
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAppResult withLaunchOverrides(LaunchOverrides launchOverrides) {
        setLaunchOverrides(launchOverrides);
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

    public DescribeAppResult withName(String name) {
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

    public DescribeAppResult withSimulation(String simulation) {
        setSimulation(simulation);
        return this;
    }

    /**
     * <p>
     * The current lifecycle state of the custom app.
     * </p>
     * 
     * @param status
     *        The current lifecycle state of the custom app.
     * @see SimulationAppStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current lifecycle state of the custom app.
     * </p>
     * 
     * @return The current lifecycle state of the custom app.
     * @see SimulationAppStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current lifecycle state of the custom app.
     * </p>
     * 
     * @param status
     *        The current lifecycle state of the custom app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationAppStatus
     */

    public DescribeAppResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current lifecycle state of the custom app.
     * </p>
     * 
     * @param status
     *        The current lifecycle state of the custom app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationAppStatus
     */

    public DescribeAppResult withStatus(SimulationAppStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The desired lifecycle state of the custom app.
     * </p>
     * 
     * @param targetStatus
     *        The desired lifecycle state of the custom app.
     * @see SimulationAppTargetStatus
     */

    public void setTargetStatus(String targetStatus) {
        this.targetStatus = targetStatus;
    }

    /**
     * <p>
     * The desired lifecycle state of the custom app.
     * </p>
     * 
     * @return The desired lifecycle state of the custom app.
     * @see SimulationAppTargetStatus
     */

    public String getTargetStatus() {
        return this.targetStatus;
    }

    /**
     * <p>
     * The desired lifecycle state of the custom app.
     * </p>
     * 
     * @param targetStatus
     *        The desired lifecycle state of the custom app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationAppTargetStatus
     */

    public DescribeAppResult withTargetStatus(String targetStatus) {
        setTargetStatus(targetStatus);
        return this;
    }

    /**
     * <p>
     * The desired lifecycle state of the custom app.
     * </p>
     * 
     * @param targetStatus
     *        The desired lifecycle state of the custom app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SimulationAppTargetStatus
     */

    public DescribeAppResult withTargetStatus(SimulationAppTargetStatus targetStatus) {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getEndpointInfo() != null)
            sb.append("EndpointInfo: ").append(getEndpointInfo()).append(",");
        if (getLaunchOverrides() != null)
            sb.append("LaunchOverrides: ").append(getLaunchOverrides()).append(",");
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

        if (obj instanceof DescribeAppResult == false)
            return false;
        DescribeAppResult other = (DescribeAppResult) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getEndpointInfo() == null ^ this.getEndpointInfo() == null)
            return false;
        if (other.getEndpointInfo() != null && other.getEndpointInfo().equals(this.getEndpointInfo()) == false)
            return false;
        if (other.getLaunchOverrides() == null ^ this.getLaunchOverrides() == null)
            return false;
        if (other.getLaunchOverrides() != null && other.getLaunchOverrides().equals(this.getLaunchOverrides()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getEndpointInfo() == null) ? 0 : getEndpointInfo().hashCode());
        hashCode = prime * hashCode + ((getLaunchOverrides() == null) ? 0 : getLaunchOverrides().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSimulation() == null) ? 0 : getSimulation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getTargetStatus() == null) ? 0 : getTargetStatus().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAppResult clone() {
        try {
            return (DescribeAppResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
