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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the current state of the detector instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DetectorState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectorState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the state.
     * </p>
     */
    private String stateName;
    /**
     * <p>
     * The current values of the detector's variables.
     * </p>
     */
    private java.util.List<Variable> variables;
    /**
     * <p>
     * The current state of the detector's timers.
     * </p>
     */
    private java.util.List<Timer> timers;

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

    public DetectorState withStateName(String stateName) {
        setStateName(stateName);
        return this;
    }

    /**
     * <p>
     * The current values of the detector's variables.
     * </p>
     * 
     * @return The current values of the detector's variables.
     */

    public java.util.List<Variable> getVariables() {
        return variables;
    }

    /**
     * <p>
     * The current values of the detector's variables.
     * </p>
     * 
     * @param variables
     *        The current values of the detector's variables.
     */

    public void setVariables(java.util.Collection<Variable> variables) {
        if (variables == null) {
            this.variables = null;
            return;
        }

        this.variables = new java.util.ArrayList<Variable>(variables);
    }

    /**
     * <p>
     * The current values of the detector's variables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariables(java.util.Collection)} or {@link #withVariables(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param variables
     *        The current values of the detector's variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorState withVariables(Variable... variables) {
        if (this.variables == null) {
            setVariables(new java.util.ArrayList<Variable>(variables.length));
        }
        for (Variable ele : variables) {
            this.variables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The current values of the detector's variables.
     * </p>
     * 
     * @param variables
     *        The current values of the detector's variables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorState withVariables(java.util.Collection<Variable> variables) {
        setVariables(variables);
        return this;
    }

    /**
     * <p>
     * The current state of the detector's timers.
     * </p>
     * 
     * @return The current state of the detector's timers.
     */

    public java.util.List<Timer> getTimers() {
        return timers;
    }

    /**
     * <p>
     * The current state of the detector's timers.
     * </p>
     * 
     * @param timers
     *        The current state of the detector's timers.
     */

    public void setTimers(java.util.Collection<Timer> timers) {
        if (timers == null) {
            this.timers = null;
            return;
        }

        this.timers = new java.util.ArrayList<Timer>(timers);
    }

    /**
     * <p>
     * The current state of the detector's timers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimers(java.util.Collection)} or {@link #withTimers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param timers
     *        The current state of the detector's timers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorState withTimers(Timer... timers) {
        if (this.timers == null) {
            setTimers(new java.util.ArrayList<Timer>(timers.length));
        }
        for (Timer ele : timers) {
            this.timers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The current state of the detector's timers.
     * </p>
     * 
     * @param timers
     *        The current state of the detector's timers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorState withTimers(java.util.Collection<Timer> timers) {
        setTimers(timers);
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
        if (getVariables() != null)
            sb.append("Variables: ").append(getVariables()).append(",");
        if (getTimers() != null)
            sb.append("Timers: ").append(getTimers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetectorState == false)
            return false;
        DetectorState other = (DetectorState) obj;
        if (other.getStateName() == null ^ this.getStateName() == null)
            return false;
        if (other.getStateName() != null && other.getStateName().equals(this.getStateName()) == false)
            return false;
        if (other.getVariables() == null ^ this.getVariables() == null)
            return false;
        if (other.getVariables() != null && other.getVariables().equals(this.getVariables()) == false)
            return false;
        if (other.getTimers() == null ^ this.getTimers() == null)
            return false;
        if (other.getTimers() != null && other.getTimers().equals(this.getTimers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStateName() == null) ? 0 : getStateName().hashCode());
        hashCode = prime * hashCode + ((getVariables() == null) ? 0 : getVariables().hashCode());
        hashCode = prime * hashCode + ((getTimers() == null) ? 0 : getTimers().hashCode());
        return hashCode;
    }

    @Override
    public DetectorState clone() {
        try {
            return (DetectorState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.DetectorStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
