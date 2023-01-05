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
package com.amazonaws.services.cloudwatchrum.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that includes some data about app monitors and their settings.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rum-2018-05-10/AppMonitorSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppMonitorSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time that the app monitor was created.
     * </p>
     */
    private String created;
    /**
     * <p>
     * The unique ID of this app monitor.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The date and time of the most recent changes to this app monitor's configuration.
     * </p>
     */
    private String lastModified;
    /**
     * <p>
     * The name of this app monitor.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current state of this app monitor.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The date and time that the app monitor was created.
     * </p>
     * 
     * @param created
     *        The date and time that the app monitor was created.
     */

    public void setCreated(String created) {
        this.created = created;
    }

    /**
     * <p>
     * The date and time that the app monitor was created.
     * </p>
     * 
     * @return The date and time that the app monitor was created.
     */

    public String getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The date and time that the app monitor was created.
     * </p>
     * 
     * @param created
     *        The date and time that the app monitor was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorSummary withCreated(String created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The unique ID of this app monitor.
     * </p>
     * 
     * @param id
     *        The unique ID of this app monitor.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of this app monitor.
     * </p>
     * 
     * @return The unique ID of this app monitor.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of this app monitor.
     * </p>
     * 
     * @param id
     *        The unique ID of this app monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The date and time of the most recent changes to this app monitor's configuration.
     * </p>
     * 
     * @param lastModified
     *        The date and time of the most recent changes to this app monitor's configuration.
     */

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * <p>
     * The date and time of the most recent changes to this app monitor's configuration.
     * </p>
     * 
     * @return The date and time of the most recent changes to this app monitor's configuration.
     */

    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * <p>
     * The date and time of the most recent changes to this app monitor's configuration.
     * </p>
     * 
     * @param lastModified
     *        The date and time of the most recent changes to this app monitor's configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorSummary withLastModified(String lastModified) {
        setLastModified(lastModified);
        return this;
    }

    /**
     * <p>
     * The name of this app monitor.
     * </p>
     * 
     * @param name
     *        The name of this app monitor.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of this app monitor.
     * </p>
     * 
     * @return The name of this app monitor.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of this app monitor.
     * </p>
     * 
     * @param name
     *        The name of this app monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppMonitorSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current state of this app monitor.
     * </p>
     * 
     * @param state
     *        The current state of this app monitor.
     * @see StateEnum
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of this app monitor.
     * </p>
     * 
     * @return The current state of this app monitor.
     * @see StateEnum
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of this app monitor.
     * </p>
     * 
     * @param state
     *        The current state of this app monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateEnum
     */

    public AppMonitorSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of this app monitor.
     * </p>
     * 
     * @param state
     *        The current state of this app monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StateEnum
     */

    public AppMonitorSummary withState(StateEnum state) {
        this.state = state.toString();
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
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getLastModified() != null)
            sb.append("LastModified: ").append(getLastModified()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppMonitorSummary == false)
            return false;
        AppMonitorSummary other = (AppMonitorSummary) obj;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getLastModified() == null ^ this.getLastModified() == null)
            return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public AppMonitorSummary clone() {
        try {
            return (AppMonitorSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchrum.model.transform.AppMonitorSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
