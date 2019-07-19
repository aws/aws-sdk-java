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
package com.amazonaws.services.iotevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the actions performed and the next state entered when a <code>"condition"</code> evaluates to TRUE.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotevents-2018-07-27/TransitionEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitionEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the transition event.
     * </p>
     */
    private String eventName;
    /**
     * <p>
     * [Required] A Boolean expression that when TRUE causes the actions to be performed and the
     * <code>"nextState"</code> to be entered.
     * </p>
     */
    private String condition;
    /**
     * <p>
     * The actions to be performed.
     * </p>
     */
    private java.util.List<Action> actions;
    /**
     * <p>
     * The next state to enter.
     * </p>
     */
    private String nextState;

    /**
     * <p>
     * The name of the transition event.
     * </p>
     * 
     * @param eventName
     *        The name of the transition event.
     */

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * <p>
     * The name of the transition event.
     * </p>
     * 
     * @return The name of the transition event.
     */

    public String getEventName() {
        return this.eventName;
    }

    /**
     * <p>
     * The name of the transition event.
     * </p>
     * 
     * @param eventName
     *        The name of the transition event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitionEvent withEventName(String eventName) {
        setEventName(eventName);
        return this;
    }

    /**
     * <p>
     * [Required] A Boolean expression that when TRUE causes the actions to be performed and the
     * <code>"nextState"</code> to be entered.
     * </p>
     * 
     * @param condition
     *        [Required] A Boolean expression that when TRUE causes the actions to be performed and the
     *        <code>"nextState"</code> to be entered.
     */

    public void setCondition(String condition) {
        this.condition = condition;
    }

    /**
     * <p>
     * [Required] A Boolean expression that when TRUE causes the actions to be performed and the
     * <code>"nextState"</code> to be entered.
     * </p>
     * 
     * @return [Required] A Boolean expression that when TRUE causes the actions to be performed and the
     *         <code>"nextState"</code> to be entered.
     */

    public String getCondition() {
        return this.condition;
    }

    /**
     * <p>
     * [Required] A Boolean expression that when TRUE causes the actions to be performed and the
     * <code>"nextState"</code> to be entered.
     * </p>
     * 
     * @param condition
     *        [Required] A Boolean expression that when TRUE causes the actions to be performed and the
     *        <code>"nextState"</code> to be entered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitionEvent withCondition(String condition) {
        setCondition(condition);
        return this;
    }

    /**
     * <p>
     * The actions to be performed.
     * </p>
     * 
     * @return The actions to be performed.
     */

    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions to be performed.
     * </p>
     * 
     * @param actions
     *        The actions to be performed.
     */

    public void setActions(java.util.Collection<Action> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<Action>(actions);
    }

    /**
     * <p>
     * The actions to be performed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions to be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitionEvent withActions(Action... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<Action>(actions.length));
        }
        for (Action ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions to be performed.
     * </p>
     * 
     * @param actions
     *        The actions to be performed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitionEvent withActions(java.util.Collection<Action> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The next state to enter.
     * </p>
     * 
     * @param nextState
     *        The next state to enter.
     */

    public void setNextState(String nextState) {
        this.nextState = nextState;
    }

    /**
     * <p>
     * The next state to enter.
     * </p>
     * 
     * @return The next state to enter.
     */

    public String getNextState() {
        return this.nextState;
    }

    /**
     * <p>
     * The next state to enter.
     * </p>
     * 
     * @param nextState
     *        The next state to enter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitionEvent withNextState(String nextState) {
        setNextState(nextState);
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
        if (getEventName() != null)
            sb.append("EventName: ").append(getEventName()).append(",");
        if (getCondition() != null)
            sb.append("Condition: ").append(getCondition()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getNextState() != null)
            sb.append("NextState: ").append(getNextState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransitionEvent == false)
            return false;
        TransitionEvent other = (TransitionEvent) obj;
        if (other.getEventName() == null ^ this.getEventName() == null)
            return false;
        if (other.getEventName() != null && other.getEventName().equals(this.getEventName()) == false)
            return false;
        if (other.getCondition() == null ^ this.getCondition() == null)
            return false;
        if (other.getCondition() != null && other.getCondition().equals(this.getCondition()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getNextState() == null ^ this.getNextState() == null)
            return false;
        if (other.getNextState() != null && other.getNextState().equals(this.getNextState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventName() == null) ? 0 : getEventName().hashCode());
        hashCode = prime * hashCode + ((getCondition() == null) ? 0 : getCondition().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getNextState() == null) ? 0 : getNextState().hashCode());
        return hashCode;
    }

    @Override
    public TransitionEvent clone() {
        try {
            return (TransitionEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotevents.model.transform.TransitionEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
