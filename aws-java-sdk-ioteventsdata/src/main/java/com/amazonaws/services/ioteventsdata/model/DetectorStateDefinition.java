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
package com.amazonaws.services.ioteventsdata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The new state, variable values, and timer settings of the detector (instance).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-data-2018-10-23/DetectorStateDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DetectorStateDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the new state of the detector (instance).
     * </p>
     */
    private String stateName;
    /**
     * <p>
     * The new values of the detector's variables. Any variable whose value isn't specified is cleared.
     * </p>
     */
    private java.util.List<VariableDefinition> variables;
    /**
     * <p>
     * The new values of the detector's timers. Any timer whose value isn't specified is cleared, and its timeout event
     * won't occur.
     * </p>
     */
    private java.util.List<TimerDefinition> timers;

    /**
     * <p>
     * The name of the new state of the detector (instance).
     * </p>
     * 
     * @param stateName
     *        The name of the new state of the detector (instance).
     */

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    /**
     * <p>
     * The name of the new state of the detector (instance).
     * </p>
     * 
     * @return The name of the new state of the detector (instance).
     */

    public String getStateName() {
        return this.stateName;
    }

    /**
     * <p>
     * The name of the new state of the detector (instance).
     * </p>
     * 
     * @param stateName
     *        The name of the new state of the detector (instance).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorStateDefinition withStateName(String stateName) {
        setStateName(stateName);
        return this;
    }

    /**
     * <p>
     * The new values of the detector's variables. Any variable whose value isn't specified is cleared.
     * </p>
     * 
     * @return The new values of the detector's variables. Any variable whose value isn't specified is cleared.
     */

    public java.util.List<VariableDefinition> getVariables() {
        return variables;
    }

    /**
     * <p>
     * The new values of the detector's variables. Any variable whose value isn't specified is cleared.
     * </p>
     * 
     * @param variables
     *        The new values of the detector's variables. Any variable whose value isn't specified is cleared.
     */

    public void setVariables(java.util.Collection<VariableDefinition> variables) {
        if (variables == null) {
            this.variables = null;
            return;
        }

        this.variables = new java.util.ArrayList<VariableDefinition>(variables);
    }

    /**
     * <p>
     * The new values of the detector's variables. Any variable whose value isn't specified is cleared.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVariables(java.util.Collection)} or {@link #withVariables(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param variables
     *        The new values of the detector's variables. Any variable whose value isn't specified is cleared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorStateDefinition withVariables(VariableDefinition... variables) {
        if (this.variables == null) {
            setVariables(new java.util.ArrayList<VariableDefinition>(variables.length));
        }
        for (VariableDefinition ele : variables) {
            this.variables.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The new values of the detector's variables. Any variable whose value isn't specified is cleared.
     * </p>
     * 
     * @param variables
     *        The new values of the detector's variables. Any variable whose value isn't specified is cleared.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorStateDefinition withVariables(java.util.Collection<VariableDefinition> variables) {
        setVariables(variables);
        return this;
    }

    /**
     * <p>
     * The new values of the detector's timers. Any timer whose value isn't specified is cleared, and its timeout event
     * won't occur.
     * </p>
     * 
     * @return The new values of the detector's timers. Any timer whose value isn't specified is cleared, and its
     *         timeout event won't occur.
     */

    public java.util.List<TimerDefinition> getTimers() {
        return timers;
    }

    /**
     * <p>
     * The new values of the detector's timers. Any timer whose value isn't specified is cleared, and its timeout event
     * won't occur.
     * </p>
     * 
     * @param timers
     *        The new values of the detector's timers. Any timer whose value isn't specified is cleared, and its timeout
     *        event won't occur.
     */

    public void setTimers(java.util.Collection<TimerDefinition> timers) {
        if (timers == null) {
            this.timers = null;
            return;
        }

        this.timers = new java.util.ArrayList<TimerDefinition>(timers);
    }

    /**
     * <p>
     * The new values of the detector's timers. Any timer whose value isn't specified is cleared, and its timeout event
     * won't occur.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimers(java.util.Collection)} or {@link #withTimers(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param timers
     *        The new values of the detector's timers. Any timer whose value isn't specified is cleared, and its timeout
     *        event won't occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorStateDefinition withTimers(TimerDefinition... timers) {
        if (this.timers == null) {
            setTimers(new java.util.ArrayList<TimerDefinition>(timers.length));
        }
        for (TimerDefinition ele : timers) {
            this.timers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The new values of the detector's timers. Any timer whose value isn't specified is cleared, and its timeout event
     * won't occur.
     * </p>
     * 
     * @param timers
     *        The new values of the detector's timers. Any timer whose value isn't specified is cleared, and its timeout
     *        event won't occur.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DetectorStateDefinition withTimers(java.util.Collection<TimerDefinition> timers) {
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

        if (obj instanceof DetectorStateDefinition == false)
            return false;
        DetectorStateDefinition other = (DetectorStateDefinition) obj;
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
    public DetectorStateDefinition clone() {
        try {
            return (DetectorStateDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ioteventsdata.model.transform.DetectorStateDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
