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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The state of the event window.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceEventWindowStateChange" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceEventWindowStateChange implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the event window.
     * </p>
     */
    private String instanceEventWindowId;
    /**
     * <p>
     * The current state of the event window.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The ID of the event window.
     * </p>
     * 
     * @param instanceEventWindowId
     *        The ID of the event window.
     */

    public void setInstanceEventWindowId(String instanceEventWindowId) {
        this.instanceEventWindowId = instanceEventWindowId;
    }

    /**
     * <p>
     * The ID of the event window.
     * </p>
     * 
     * @return The ID of the event window.
     */

    public String getInstanceEventWindowId() {
        return this.instanceEventWindowId;
    }

    /**
     * <p>
     * The ID of the event window.
     * </p>
     * 
     * @param instanceEventWindowId
     *        The ID of the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindowStateChange withInstanceEventWindowId(String instanceEventWindowId) {
        setInstanceEventWindowId(instanceEventWindowId);
        return this;
    }

    /**
     * <p>
     * The current state of the event window.
     * </p>
     * 
     * @param state
     *        The current state of the event window.
     * @see InstanceEventWindowState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the event window.
     * </p>
     * 
     * @return The current state of the event window.
     * @see InstanceEventWindowState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the event window.
     * </p>
     * 
     * @param state
     *        The current state of the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceEventWindowState
     */

    public InstanceEventWindowStateChange withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the event window.
     * </p>
     * 
     * @param state
     *        The current state of the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceEventWindowState
     */

    public InstanceEventWindowStateChange withState(InstanceEventWindowState state) {
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
        if (getInstanceEventWindowId() != null)
            sb.append("InstanceEventWindowId: ").append(getInstanceEventWindowId()).append(",");
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

        if (obj instanceof InstanceEventWindowStateChange == false)
            return false;
        InstanceEventWindowStateChange other = (InstanceEventWindowStateChange) obj;
        if (other.getInstanceEventWindowId() == null ^ this.getInstanceEventWindowId() == null)
            return false;
        if (other.getInstanceEventWindowId() != null && other.getInstanceEventWindowId().equals(this.getInstanceEventWindowId()) == false)
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

        hashCode = prime * hashCode + ((getInstanceEventWindowId() == null) ? 0 : getInstanceEventWindowId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public InstanceEventWindowStateChange clone() {
        try {
            return (InstanceEventWindowStateChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
