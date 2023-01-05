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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StartApp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartAppRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A value that you provide to ensure that repeated calls to this API operation using the same parameters complete
     * only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A <code>ClientToken</code>
     * expires after 24 hours.
     * </p>
     */
    private String clientToken;
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
     * A value that you provide to ensure that repeated calls to this API operation using the same parameters complete
     * only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A <code>ClientToken</code>
     * expires after 24 hours.
     * </p>
     * 
     * @param clientToken
     *        A value that you provide to ensure that repeated calls to this API operation using the same parameters
     *        complete only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A
     *        <code>ClientToken</code> expires after 24 hours.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * A value that you provide to ensure that repeated calls to this API operation using the same parameters complete
     * only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A <code>ClientToken</code>
     * expires after 24 hours.
     * </p>
     * 
     * @return A value that you provide to ensure that repeated calls to this API operation using the same parameters
     *         complete only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A
     *         <code>ClientToken</code> expires after 24 hours.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * A value that you provide to ensure that repeated calls to this API operation using the same parameters complete
     * only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A <code>ClientToken</code>
     * expires after 24 hours.
     * </p>
     * 
     * @param clientToken
     *        A value that you provide to ensure that repeated calls to this API operation using the same parameters
     *        complete only once. A <code>ClientToken</code> is also known as an <i>idempotency token</i>. A
     *        <code>ClientToken</code> expires after 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartAppRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

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

    public StartAppRequest withDescription(String description) {
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

    public StartAppRequest withDomain(String domain) {
        setDomain(domain);
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

    public StartAppRequest withLaunchOverrides(LaunchOverrides launchOverrides) {
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

    public StartAppRequest withName(String name) {
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

    public StartAppRequest withSimulation(String simulation) {
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append("***Sensitive Data Redacted***").append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getLaunchOverrides() != null)
            sb.append("LaunchOverrides: ").append(getLaunchOverrides()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof StartAppRequest == false)
            return false;
        StartAppRequest other = (StartAppRequest) obj;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getLaunchOverrides() == null) ? 0 : getLaunchOverrides().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSimulation() == null) ? 0 : getSimulation().hashCode());
        return hashCode;
    }

    @Override
    public StartAppRequest clone() {
        return (StartAppRequest) super.clone();
    }

}
