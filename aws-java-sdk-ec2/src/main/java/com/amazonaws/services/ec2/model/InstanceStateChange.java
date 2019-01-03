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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an instance state change.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceStateChange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceStateChange implements Serializable, Cloneable {

    /**
     * <p>
     * The current state of the instance.
     * </p>
     */
    private InstanceState currentState;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The previous state of the instance.
     * </p>
     */
    private InstanceState previousState;

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * 
     * @param currentState
     *        The current state of the instance.
     */

    public void setCurrentState(InstanceState currentState) {
        this.currentState = currentState;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * 
     * @return The current state of the instance.
     */

    public InstanceState getCurrentState() {
        return this.currentState;
    }

    /**
     * <p>
     * The current state of the instance.
     * </p>
     * 
     * @param currentState
     *        The current state of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStateChange withCurrentState(InstanceState currentState) {
        setCurrentState(currentState);
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStateChange withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The previous state of the instance.
     * </p>
     * 
     * @param previousState
     *        The previous state of the instance.
     */

    public void setPreviousState(InstanceState previousState) {
        this.previousState = previousState;
    }

    /**
     * <p>
     * The previous state of the instance.
     * </p>
     * 
     * @return The previous state of the instance.
     */

    public InstanceState getPreviousState() {
        return this.previousState;
    }

    /**
     * <p>
     * The previous state of the instance.
     * </p>
     * 
     * @param previousState
     *        The previous state of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStateChange withPreviousState(InstanceState previousState) {
        setPreviousState(previousState);
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
        if (getCurrentState() != null)
            sb.append("CurrentState: ").append(getCurrentState()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getPreviousState() != null)
            sb.append("PreviousState: ").append(getPreviousState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceStateChange == false)
            return false;
        InstanceStateChange other = (InstanceStateChange) obj;
        if (other.getCurrentState() == null ^ this.getCurrentState() == null)
            return false;
        if (other.getCurrentState() != null && other.getCurrentState().equals(this.getCurrentState()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getPreviousState() == null ^ this.getPreviousState() == null)
            return false;
        if (other.getPreviousState() != null && other.getPreviousState().equals(this.getPreviousState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrentState() == null) ? 0 : getCurrentState().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getPreviousState() == null) ? 0 : getPreviousState().hashCode());
        return hashCode;
    }

    @Override
    public InstanceStateChange clone() {
        try {
            return (InstanceStateChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
