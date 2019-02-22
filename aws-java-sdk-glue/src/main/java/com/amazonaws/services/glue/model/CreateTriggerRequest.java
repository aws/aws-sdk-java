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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateTrigger" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTriggerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the trigger.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the new trigger.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * <p>
     * This field is required when the trigger type is SCHEDULED.
     * </p>
     */
    private String schedule;
    /**
     * <p>
     * A predicate to specify when the new trigger should fire.
     * </p>
     * <p>
     * This field is required when the trigger type is CONDITIONAL.
     * </p>
     */
    private Predicate predicate;
    /**
     * <p>
     * The actions initiated by this trigger when it fires.
     * </p>
     */
    private java.util.List<Action> actions;
    /**
     * <p>
     * A description of the new trigger.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Set to true to start SCHEDULED and CONDITIONAL triggers when created. True not supported for ON_DEMAND triggers.
     * </p>
     */
    private Boolean startOnCreation;
    /**
     * <p>
     * The tags to use with this trigger. You may use tags to limit access to the trigger. For more information about
     * tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS
     * Glue</a> in the developer guide.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the trigger.
     * </p>
     * 
     * @param name
     *        The name of the trigger.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the trigger.
     * </p>
     * 
     * @return The name of the trigger.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the trigger.
     * </p>
     * 
     * @param name
     *        The name of the trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTriggerRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the new trigger.
     * </p>
     * 
     * @param type
     *        The type of the new trigger.
     * @see TriggerType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the new trigger.
     * </p>
     * 
     * @return The type of the new trigger.
     * @see TriggerType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the new trigger.
     * </p>
     * 
     * @param type
     *        The type of the new trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public CreateTriggerRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the new trigger.
     * </p>
     * 
     * @param type
     *        The type of the new trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TriggerType
     */

    public CreateTriggerRequest withType(TriggerType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A <code>cron</code> expression used to specify the schedule (see <a
     * href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules for
     * Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     * <code>cron(15 12 * * ? *)</code>.
     * </p>
     * <p>
     * This field is required when the trigger type is SCHEDULED.
     * </p>
     * 
     * @param schedule
     *        A <code>cron</code> expression used to specify the schedule (see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules
     *        for Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     *        <code>cron(15 12 * * ? *)</code>.</p>
     *        <p>
     *        This field is required when the trigger type is SCHEDULED.
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
     * <p>
     * This field is required when the trigger type is SCHEDULED.
     * </p>
     * 
     * @return A <code>cron</code> expression used to specify the schedule (see <a
     *         href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based
     *         Schedules for Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would
     *         specify: <code>cron(15 12 * * ? *)</code>.</p>
     *         <p>
     *         This field is required when the trigger type is SCHEDULED.
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
     * <p>
     * This field is required when the trigger type is SCHEDULED.
     * </p>
     * 
     * @param schedule
     *        A <code>cron</code> expression used to specify the schedule (see <a
     *        href="http://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html">Time-Based Schedules
     *        for Jobs and Crawlers</a>. For example, to run something every day at 12:15 UTC, you would specify:
     *        <code>cron(15 12 * * ? *)</code>.</p>
     *        <p>
     *        This field is required when the trigger type is SCHEDULED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTriggerRequest withSchedule(String schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * A predicate to specify when the new trigger should fire.
     * </p>
     * <p>
     * This field is required when the trigger type is CONDITIONAL.
     * </p>
     * 
     * @param predicate
     *        A predicate to specify when the new trigger should fire.</p>
     *        <p>
     *        This field is required when the trigger type is CONDITIONAL.
     */

    public void setPredicate(Predicate predicate) {
        this.predicate = predicate;
    }

    /**
     * <p>
     * A predicate to specify when the new trigger should fire.
     * </p>
     * <p>
     * This field is required when the trigger type is CONDITIONAL.
     * </p>
     * 
     * @return A predicate to specify when the new trigger should fire.</p>
     *         <p>
     *         This field is required when the trigger type is CONDITIONAL.
     */

    public Predicate getPredicate() {
        return this.predicate;
    }

    /**
     * <p>
     * A predicate to specify when the new trigger should fire.
     * </p>
     * <p>
     * This field is required when the trigger type is CONDITIONAL.
     * </p>
     * 
     * @param predicate
     *        A predicate to specify when the new trigger should fire.</p>
     *        <p>
     *        This field is required when the trigger type is CONDITIONAL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTriggerRequest withPredicate(Predicate predicate) {
        setPredicate(predicate);
        return this;
    }

    /**
     * <p>
     * The actions initiated by this trigger when it fires.
     * </p>
     * 
     * @return The actions initiated by this trigger when it fires.
     */

    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions initiated by this trigger when it fires.
     * </p>
     * 
     * @param actions
     *        The actions initiated by this trigger when it fires.
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
     * The actions initiated by this trigger when it fires.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setActions(java.util.Collection)} or {@link #withActions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param actions
     *        The actions initiated by this trigger when it fires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTriggerRequest withActions(Action... actions) {
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
     * The actions initiated by this trigger when it fires.
     * </p>
     * 
     * @param actions
     *        The actions initiated by this trigger when it fires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTriggerRequest withActions(java.util.Collection<Action> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * A description of the new trigger.
     * </p>
     * 
     * @param description
     *        A description of the new trigger.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the new trigger.
     * </p>
     * 
     * @return A description of the new trigger.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the new trigger.
     * </p>
     * 
     * @param description
     *        A description of the new trigger.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTriggerRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Set to true to start SCHEDULED and CONDITIONAL triggers when created. True not supported for ON_DEMAND triggers.
     * </p>
     * 
     * @param startOnCreation
     *        Set to true to start SCHEDULED and CONDITIONAL triggers when created. True not supported for ON_DEMAND
     *        triggers.
     */

    public void setStartOnCreation(Boolean startOnCreation) {
        this.startOnCreation = startOnCreation;
    }

    /**
     * <p>
     * Set to true to start SCHEDULED and CONDITIONAL triggers when created. True not supported for ON_DEMAND triggers.
     * </p>
     * 
     * @return Set to true to start SCHEDULED and CONDITIONAL triggers when created. True not supported for ON_DEMAND
     *         triggers.
     */

    public Boolean getStartOnCreation() {
        return this.startOnCreation;
    }

    /**
     * <p>
     * Set to true to start SCHEDULED and CONDITIONAL triggers when created. True not supported for ON_DEMAND triggers.
     * </p>
     * 
     * @param startOnCreation
     *        Set to true to start SCHEDULED and CONDITIONAL triggers when created. True not supported for ON_DEMAND
     *        triggers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTriggerRequest withStartOnCreation(Boolean startOnCreation) {
        setStartOnCreation(startOnCreation);
        return this;
    }

    /**
     * <p>
     * Set to true to start SCHEDULED and CONDITIONAL triggers when created. True not supported for ON_DEMAND triggers.
     * </p>
     * 
     * @return Set to true to start SCHEDULED and CONDITIONAL triggers when created. True not supported for ON_DEMAND
     *         triggers.
     */

    public Boolean isStartOnCreation() {
        return this.startOnCreation;
    }

    /**
     * <p>
     * The tags to use with this trigger. You may use tags to limit access to the trigger. For more information about
     * tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS
     * Glue</a> in the developer guide.
     * </p>
     * 
     * @return The tags to use with this trigger. You may use tags to limit access to the trigger. For more information
     *         about tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS
     *         Tags in AWS Glue</a> in the developer guide.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to use with this trigger. You may use tags to limit access to the trigger. For more information about
     * tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS
     * Glue</a> in the developer guide.
     * </p>
     * 
     * @param tags
     *        The tags to use with this trigger. You may use tags to limit access to the trigger. For more information
     *        about tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags
     *        in AWS Glue</a> in the developer guide.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to use with this trigger. You may use tags to limit access to the trigger. For more information about
     * tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags in AWS
     * Glue</a> in the developer guide.
     * </p>
     * 
     * @param tags
     *        The tags to use with this trigger. You may use tags to limit access to the trigger. For more information
     *        about tags in AWS Glue, see <a href="http://docs.aws.amazon.com/glue/latest/dg/monitor-tags.html">AWS Tags
     *        in AWS Glue</a> in the developer guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTriggerRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateTriggerRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTriggerRequest clearTagsEntries() {
        this.tags = null;
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getPredicate() != null)
            sb.append("Predicate: ").append(getPredicate()).append(",");
        if (getActions() != null)
            sb.append("Actions: ").append(getActions()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getStartOnCreation() != null)
            sb.append("StartOnCreation: ").append(getStartOnCreation()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTriggerRequest == false)
            return false;
        CreateTriggerRequest other = (CreateTriggerRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getPredicate() == null ^ this.getPredicate() == null)
            return false;
        if (other.getPredicate() != null && other.getPredicate().equals(this.getPredicate()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getStartOnCreation() == null ^ this.getStartOnCreation() == null)
            return false;
        if (other.getStartOnCreation() != null && other.getStartOnCreation().equals(this.getStartOnCreation()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getPredicate() == null) ? 0 : getPredicate().hashCode());
        hashCode = prime * hashCode + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getStartOnCreation() == null) ? 0 : getStartOnCreation().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTriggerRequest clone() {
        return (CreateTriggerRequest) super.clone();
    }

}
