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
 * Information that defines how a detector operates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/DetectorModelDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectorModelDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the states of the detector.
     * </p>
     */
    private java.util.List<State> states;
    /**
     * <p>
     * The state that is entered at the creation of each detector (instance).
     * </p>
     */
    private String initialStateName;

    /**
     * <p>
     * Information about the states of the detector.
     * </p>
     * 
     * @return Information about the states of the detector.
     */

    public java.util.List<State> getStates() {
        return states;
    }

    /**
     * <p>
     * Information about the states of the detector.
     * </p>
     * 
     * @param states
     *        Information about the states of the detector.
     */

    public void setStates(java.util.Collection<State> states) {
        if (states == null) {
            this.states = null;
            return;
        }

        this.states = new java.util.ArrayList<State>(states);
    }

    /**
     * <p>
     * Information about the states of the detector.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStates(java.util.Collection)} or {@link #withStates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param states
     *        Information about the states of the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModelDefinition withStates(State... states) {
        if (this.states == null) {
            setStates(new java.util.ArrayList<State>(states.length));
        }
        for (State ele : states) {
            this.states.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the states of the detector.
     * </p>
     * 
     * @param states
     *        Information about the states of the detector.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModelDefinition withStates(java.util.Collection<State> states) {
        setStates(states);
        return this;
    }

    /**
     * <p>
     * The state that is entered at the creation of each detector (instance).
     * </p>
     * 
     * @param initialStateName
     *        The state that is entered at the creation of each detector (instance).
     */

    public void setInitialStateName(String initialStateName) {
        this.initialStateName = initialStateName;
    }

    /**
     * <p>
     * The state that is entered at the creation of each detector (instance).
     * </p>
     * 
     * @return The state that is entered at the creation of each detector (instance).
     */

    public String getInitialStateName() {
        return this.initialStateName;
    }

    /**
     * <p>
     * The state that is entered at the creation of each detector (instance).
     * </p>
     * 
     * @param initialStateName
     *        The state that is entered at the creation of each detector (instance).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorModelDefinition withInitialStateName(String initialStateName) {
        setInitialStateName(initialStateName);
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
        if (getStates() != null)
            sb.append("States: ").append(getStates()).append(",");
        if (getInitialStateName() != null)
            sb.append("InitialStateName: ").append(getInitialStateName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectorModelDefinition == false)
            return false;
        DetectorModelDefinition other = (DetectorModelDefinition) obj;
        if (other.getStates() == null ^ this.getStates() == null)
            return false;
        if (other.getStates() != null && other.getStates().equals(this.getStates()) == false)
            return false;
        if (other.getInitialStateName() == null ^ this.getInitialStateName() == null)
            return false;
        if (other.getInitialStateName() != null && other.getInitialStateName().equals(this.getInitialStateName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStates() == null) ? 0 : getStates().hashCode());
        hashCode = prime * hashCode + ((getInitialStateName() == null) ? 0 : getInitialStateName().hashCode());
        return hashCode;
    }

    @Override
    public DetectorModelDefinition clone() {
        try {
            return (DetectorModelDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.DetectorModelDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
