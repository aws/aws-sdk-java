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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/simspaceweaver-2022-10-28/StopApp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopAppRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the app.
     * </p>
     */
    private String app;
    /**
     * <p>
     * The name of the domain of the app.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The name of the simulation of the app.
     * </p>
     */
    private String simulation;

    /**
     * <p>
     * The name of the app.
     * </p>
     * 
     * @param app
     *        The name of the app.
     */

    public void setApp(String app) {
        this.app = app;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * 
     * @return The name of the app.
     */

    public String getApp() {
        return this.app;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * 
     * @param app
     *        The name of the app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopAppRequest withApp(String app) {
        setApp(app);
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

    public StopAppRequest withDomain(String domain) {
        setDomain(domain);
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

    public StopAppRequest withSimulation(String simulation) {
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
        if (getApp() != null)
            sb.append("App: ").append(getApp()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
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

        if (obj instanceof StopAppRequest == false)
            return false;
        StopAppRequest other = (StopAppRequest) obj;
        if (other.getApp() == null ^ this.getApp() == null)
            return false;
        if (other.getApp() != null && other.getApp().equals(this.getApp()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
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

        hashCode = prime * hashCode + ((getApp() == null) ? 0 : getApp().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getSimulation() == null) ? 0 : getSimulation().hashCode());
        return hashCode;
    }

    @Override
    public StopAppRequest clone() {
        return (StopAppRequest) super.clone();
    }

}
