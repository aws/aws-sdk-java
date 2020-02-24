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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information that defines a state of a detector.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/State" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class State implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the state.
     * </p>
     */
    private String stateName;
    /**
     * <p>
     * When an input is received and the <code>condition</code> is TRUE, perform the specified <code>actions</code>.
     * </p>
     */
    private OnInputLifecycle onInput;
    /**
     * <p>
     * When entering this state, perform these <code>actions</code> if the <code>condition</code> is TRUE.
     * </p>
     */
    private OnEnterLifecycle onEnter;
    /**
     * <p>
     * When exiting this state, perform these <code>actions</code> if the specified <code>condition</code> is TRUE.
     * </p>
     */
    private OnExitLifecycle onExit;

    /**
     * <p>
     * The name of the state.
     * </p>
     * 
     * @param stateName
     *        The name of the state.
     */

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    /**
     * <p>
     * The name of the state.
     * </p>
     * 
     * @return The name of the state.
     */

    public String getStateName() {
        return this.stateName;
    }

    /**
     * <p>
     * The name of the state.
     * </p>
     * 
     * @param stateName
     *        The name of the state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public State withStateName(String stateName) {
        setStateName(stateName);
        return this;
    }

    /**
     * <p>
     * When an input is received and the <code>condition</code> is TRUE, perform the specified <code>actions</code>.
     * </p>
     * 
     * @param onInput
     *        When an input is received and the <code>condition</code> is TRUE, perform the specified
     *        <code>actions</code>.
     */

    public void setOnInput(OnInputLifecycle onInput) {
        this.onInput = onInput;
    }

    /**
     * <p>
     * When an input is received and the <code>condition</code> is TRUE, perform the specified <code>actions</code>.
     * </p>
     * 
     * @return When an input is received and the <code>condition</code> is TRUE, perform the specified
     *         <code>actions</code>.
     */

    public OnInputLifecycle getOnInput() {
        return this.onInput;
    }

    /**
     * <p>
     * When an input is received and the <code>condition</code> is TRUE, perform the specified <code>actions</code>.
     * </p>
     * 
     * @param onInput
     *        When an input is received and the <code>condition</code> is TRUE, perform the specified
     *        <code>actions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public State withOnInput(OnInputLifecycle onInput) {
        setOnInput(onInput);
        return this;
    }

    /**
     * <p>
     * When entering this state, perform these <code>actions</code> if the <code>condition</code> is TRUE.
     * </p>
     * 
     * @param onEnter
     *        When entering this state, perform these <code>actions</code> if the <code>condition</code> is TRUE.
     */

    public void setOnEnter(OnEnterLifecycle onEnter) {
        this.onEnter = onEnter;
    }

    /**
     * <p>
     * When entering this state, perform these <code>actions</code> if the <code>condition</code> is TRUE.
     * </p>
     * 
     * @return When entering this state, perform these <code>actions</code> if the <code>condition</code> is TRUE.
     */

    public OnEnterLifecycle getOnEnter() {
        return this.onEnter;
    }

    /**
     * <p>
     * When entering this state, perform these <code>actions</code> if the <code>condition</code> is TRUE.
     * </p>
     * 
     * @param onEnter
     *        When entering this state, perform these <code>actions</code> if the <code>condition</code> is TRUE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public State withOnEnter(OnEnterLifecycle onEnter) {
        setOnEnter(onEnter);
        return this;
    }

    /**
     * <p>
     * When exiting this state, perform these <code>actions</code> if the specified <code>condition</code> is TRUE.
     * </p>
     * 
     * @param onExit
     *        When exiting this state, perform these <code>actions</code> if the specified <code>condition</code> is
     *        TRUE.
     */

    public void setOnExit(OnExitLifecycle onExit) {
        this.onExit = onExit;
    }

    /**
     * <p>
     * When exiting this state, perform these <code>actions</code> if the specified <code>condition</code> is TRUE.
     * </p>
     * 
     * @return When exiting this state, perform these <code>actions</code> if the specified <code>condition</code> is
     *         TRUE.
     */

    public OnExitLifecycle getOnExit() {
        return this.onExit;
    }

    /**
     * <p>
     * When exiting this state, perform these <code>actions</code> if the specified <code>condition</code> is TRUE.
     * </p>
     * 
     * @param onExit
     *        When exiting this state, perform these <code>actions</code> if the specified <code>condition</code> is
     *        TRUE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public State withOnExit(OnExitLifecycle onExit) {
        setOnExit(onExit);
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
        if (getStateName() != null)
            sb.append("StateName: ").append(getStateName()).append(",");
        if (getOnInput() != null)
            sb.append("OnInput: ").append(getOnInput()).append(",");
        if (getOnEnter() != null)
            sb.append("OnEnter: ").append(getOnEnter()).append(",");
        if (getOnExit() != null)
            sb.append("OnExit: ").append(getOnExit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof State == false)
            return false;
        State other = (State) obj;
        if (other.getStateName() == null ^ this.getStateName() == null)
            return false;
        if (other.getStateName() != null && other.getStateName().equals(this.getStateName()) == false)
            return false;
        if (other.getOnInput() == null ^ this.getOnInput() == null)
            return false;
        if (other.getOnInput() != null && other.getOnInput().equals(this.getOnInput()) == false)
            return false;
        if (other.getOnEnter() == null ^ this.getOnEnter() == null)
            return false;
        if (other.getOnEnter() != null && other.getOnEnter().equals(this.getOnEnter()) == false)
            return false;
        if (other.getOnExit() == null ^ this.getOnExit() == null)
            return false;
        if (other.getOnExit() != null && other.getOnExit().equals(this.getOnExit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateName() == null) ? 0 : getStateName().hashCode());
        hashCode = prime * hashCode + ((getOnInput() == null) ? 0 : getOnInput().hashCode());
        hashCode = prime * hashCode + ((getOnEnter() == null) ? 0 : getOnEnter().hashCode());
        hashCode = prime * hashCode + ((getOnExit() == null) ? 0 : getOnExit().hashCode());
        return hashCode;
    }

    @Override
    public State clone() {
        try {
            return (State) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.StateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
