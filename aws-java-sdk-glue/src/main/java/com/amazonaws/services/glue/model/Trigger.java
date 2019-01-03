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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a specific trigger.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Trigger" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Trigger implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the trigger.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The type of trigger that this is.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The current state of the trigger.
     * </p>
     */
    private String state;
    /**
     * <p>
     * A description of this trigger.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * The actions initiated by this trigger.
     * </p>
     */
    private java.util.List<Action> actions;
    /**
     * <p>
     * The predicate of this trigger, which defines when it will fire.
     * </p>
     */
    private Predicate predicate;

    /**
     * <p>
     * Name of the trigger.
     * </p>
     * 
     * @param name
     *        Name of the trigger.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the trigger.
     * </p>
     * 
     * @return Name of the trigger.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the trigger.
     * </p>
     * 
     * @param name
     *        Name of the trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trigger withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param id
     *        Reserved for future use.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param id
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trigger withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The type of trigger that this is.
     * </p>
     * 
     * @param type
     *        The type of trigger that this is.
     * @see TriggerType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of trigger that this is.
     * </p>
     * 
     * @return The type of trigger that this is.
     * @see TriggerType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of trigger that this is.
     * </p>
     * 
     * @param type
     *        The type of trigger that this is.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public Trigger withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of trigger that this is.
     * </p>
     * 
     * @param type
     *        The type of trigger that this is.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public Trigger withType(TriggerType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the trigger.
     * </p>
     * 
     * @param state
     *        The current state of the trigger.
     * @see TriggerState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the trigger.
     * </p>
     * 
     * @return The current state of the trigger.
     * @see TriggerState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the trigger.
     * </p>
     * 
     * @param state
     *        The current state of the trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerState
     */

    public Trigger withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the trigger.
     * </p>
     * 
     * @param state
     *        The current state of the trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerState
     */

    public Trigger withState(TriggerState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * A description of this trigger.
     * </p>
     * 
     * @param description
     *        A description of this trigger.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of this trigger.
     * </p>
     * 
     * @return A description of this trigger.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of this trigger.
     * </p>
     * 
     * @param description
     *        A description of this trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trigger withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * 
     * @param schedule
     *        A <code>cron</code> expression used to specify the schedule (see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules
     *        for Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     *        <code>cron(15 12 * * ? *)</code>.
     */

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * 
     * @return A <code>cron</code> expression used to specify the schedule (see <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based
     *         Schedules for Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would
     *         specify: <code>cron(15 12 * * ? *)</code>.
     */

    public String getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * 
     * @param schedule
     *        A <code>cron</code> expression used to specify the schedule (see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules
     *        for Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     *        <code>cron(15 12 * * ? *)</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trigger withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * The actions initiated by this trigger.
     * </p>
     * 
     * @return The actions initiated by this trigger.
     */

    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions initiated by this trigger.
     * </p>
     * 
     * @param actions
     *        The actions initiated by this trigger.
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
     * The actions initiated by this trigger.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions initiated by this trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trigger withActions(Action... actions) {
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
     * The actions initiated by this trigger.
     * </p>
     * 
     * @param actions
     *        The actions initiated by this trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trigger withActions(java.util.Collection<Action> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * The predicate of this trigger, which defines when it will fire.
     * </p>
     * 
     * @param predicate
     *        The predicate of this trigger, which defines when it will fire.
     */

    public void setPredicate(Predicate predicate) {
        this.predicate = predicate;
    }

    /**
     * <p>
     * The predicate of this trigger, which defines when it will fire.
     * </p>
     * 
     * @return The predicate of this trigger, which defines when it will fire.
     */

    public Predicate getPredicate() {
        return this.predicate;
    }

    /**
     * <p>
     * The predicate of this trigger, which defines when it will fire.
     * </p>
     * 
     * @param predicate
     *        The predicate of this trigger, which defines when it will fire.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trigger withPredicate(Predicate predicate) {
        setPredicate(predicate);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getPredicate() != null)
            sb.append("Predicate: ").append(getPredicate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Trigger == false)
            return false;
        Trigger other = (Trigger) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getPredicate() == null ^ this.getPredicate() == null)
            return false;
        if (other.getPredicate() != null && other.getPredicate().equals(this.getPredicate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getPredicate() == null) ? 0 : getPredicate().hashCode());
        return hashCode;
    }

    @Override
    public Trigger clone() {
        try {
            return (Trigger) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.TriggerMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
