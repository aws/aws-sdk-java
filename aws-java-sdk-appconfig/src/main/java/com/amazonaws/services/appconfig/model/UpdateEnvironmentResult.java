/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appconfig-2019-10-09/UpdateEnvironment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEnvironmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The application ID.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The environment ID.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the environment.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the environment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The state of the environment. An environment can be in one of the following states:
     * <code>READY_FOR_DEPLOYMENT</code>, <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or <code>ROLLED_BACK</code>
     * </p>
     */
    private String state;
    /**
     * <p>
     * Amazon CloudWatch alarms monitored during the deployment.
     * </p>
     */
    private java.util.List<Monitor> monitors;

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @return The application ID.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The application ID.
     * </p>
     * 
     * @param applicationId
     *        The application ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentResult withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The environment ID.
     * </p>
     * 
     * @param id
     *        The environment ID.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The environment ID.
     * </p>
     * 
     * @return The environment ID.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The environment ID.
     * </p>
     * 
     * @param id
     *        The environment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentResult withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @return The name of the environment.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the environment.
     * </p>
     * 
     * @param name
     *        The name of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @return The description of the environment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the environment.
     * </p>
     * 
     * @param description
     *        The description of the environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The state of the environment. An environment can be in one of the following states:
     * <code>READY_FOR_DEPLOYMENT</code>, <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or <code>ROLLED_BACK</code>
     * </p>
     * 
     * @param state
     *        The state of the environment. An environment can be in one of the following states:
     *        <code>READY_FOR_DEPLOYMENT</code>, <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     *        <code>ROLLED_BACK</code>
     * @see EnvironmentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the environment. An environment can be in one of the following states:
     * <code>READY_FOR_DEPLOYMENT</code>, <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or <code>ROLLED_BACK</code>
     * </p>
     * 
     * @return The state of the environment. An environment can be in one of the following states:
     *         <code>READY_FOR_DEPLOYMENT</code>, <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     *         <code>ROLLED_BACK</code>
     * @see EnvironmentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the environment. An environment can be in one of the following states:
     * <code>READY_FOR_DEPLOYMENT</code>, <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or <code>ROLLED_BACK</code>
     * </p>
     * 
     * @param state
     *        The state of the environment. An environment can be in one of the following states:
     *        <code>READY_FOR_DEPLOYMENT</code>, <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     *        <code>ROLLED_BACK</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentState
     */

    public UpdateEnvironmentResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the environment. An environment can be in one of the following states:
     * <code>READY_FOR_DEPLOYMENT</code>, <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or <code>ROLLED_BACK</code>
     * </p>
     * 
     * @param state
     *        The state of the environment. An environment can be in one of the following states:
     *        <code>READY_FOR_DEPLOYMENT</code>, <code>DEPLOYING</code>, <code>ROLLING_BACK</code>, or
     *        <code>ROLLED_BACK</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EnvironmentState
     */

    public UpdateEnvironmentResult withState(EnvironmentState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Amazon CloudWatch alarms monitored during the deployment.
     * </p>
     * 
     * @return Amazon CloudWatch alarms monitored during the deployment.
     */

    public java.util.List<Monitor> getMonitors() {
        return monitors;
    }

    /**
     * <p>
     * Amazon CloudWatch alarms monitored during the deployment.
     * </p>
     * 
     * @param monitors
     *        Amazon CloudWatch alarms monitored during the deployment.
     */

    public void setMonitors(java.util.Collection<Monitor> monitors) {
        if (monitors == null) {
            this.monitors = null;
            return;
        }

        this.monitors = new java.util.ArrayList<Monitor>(monitors);
    }

    /**
     * <p>
     * Amazon CloudWatch alarms monitored during the deployment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMonitors(java.util.Collection)} or {@link #withMonitors(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param monitors
     *        Amazon CloudWatch alarms monitored during the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentResult withMonitors(Monitor... monitors) {
        if (this.monitors == null) {
            setMonitors(new java.util.ArrayList<Monitor>(monitors.length));
        }
        for (Monitor ele : monitors) {
            this.monitors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Amazon CloudWatch alarms monitored during the deployment.
     * </p>
     * 
     * @param monitors
     *        Amazon CloudWatch alarms monitored during the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEnvironmentResult withMonitors(java.util.Collection<Monitor> monitors) {
        setMonitors(monitors);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getMonitors() != null)
            sb.append("Monitors: ").append(getMonitors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEnvironmentResult == false)
            return false;
        UpdateEnvironmentResult other = (UpdateEnvironmentResult) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getMonitors() == null ^ this.getMonitors() == null)
            return false;
        if (other.getMonitors() != null && other.getMonitors().equals(this.getMonitors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getMonitors() == null) ? 0 : getMonitors().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEnvironmentResult clone() {
        try {
            return (UpdateEnvironmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
