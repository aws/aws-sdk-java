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
package com.amazonaws.services.scheduler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of a schedule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/scheduler-2021-06-30/ScheduleSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduleSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time at which the schedule was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The name of the schedule group associated with this schedule.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The time at which the schedule was last modified.
     * </p>
     */
    private java.util.Date lastModificationDate;
    /**
     * <p>
     * The name of the schedule.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies whether the schedule is enabled or disabled.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The schedule's target details.
     * </p>
     */
    private TargetSummary target;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the schedule.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the schedule.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schedule.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleSummary withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time at which the schedule was created.
     * </p>
     * 
     * @param creationDate
     *        The time at which the schedule was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The time at which the schedule was created.
     * </p>
     * 
     * @return The time at which the schedule was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The time at which the schedule was created.
     * </p>
     * 
     * @param creationDate
     *        The time at which the schedule was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleSummary withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The name of the schedule group associated with this schedule.
     * </p>
     * 
     * @param groupName
     *        The name of the schedule group associated with this schedule.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the schedule group associated with this schedule.
     * </p>
     * 
     * @return The name of the schedule group associated with this schedule.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the schedule group associated with this schedule.
     * </p>
     * 
     * @param groupName
     *        The name of the schedule group associated with this schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleSummary withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The time at which the schedule was last modified.
     * </p>
     * 
     * @param lastModificationDate
     *        The time at which the schedule was last modified.
     */

    public void setLastModificationDate(java.util.Date lastModificationDate) {
        this.lastModificationDate = lastModificationDate;
    }

    /**
     * <p>
     * The time at which the schedule was last modified.
     * </p>
     * 
     * @return The time at which the schedule was last modified.
     */

    public java.util.Date getLastModificationDate() {
        return this.lastModificationDate;
    }

    /**
     * <p>
     * The time at which the schedule was last modified.
     * </p>
     * 
     * @param lastModificationDate
     *        The time at which the schedule was last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleSummary withLastModificationDate(java.util.Date lastModificationDate) {
        setLastModificationDate(lastModificationDate);
        return this;
    }

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * 
     * @param name
     *        The name of the schedule.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * 
     * @return The name of the schedule.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the schedule.
     * </p>
     * 
     * @param name
     *        The name of the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies whether the schedule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Specifies whether the schedule is enabled or disabled.
     * @see ScheduleState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Specifies whether the schedule is enabled or disabled.
     * </p>
     * 
     * @return Specifies whether the schedule is enabled or disabled.
     * @see ScheduleState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Specifies whether the schedule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Specifies whether the schedule is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleState
     */

    public ScheduleSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Specifies whether the schedule is enabled or disabled.
     * </p>
     * 
     * @param state
     *        Specifies whether the schedule is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScheduleState
     */

    public ScheduleSummary withState(ScheduleState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The schedule's target details.
     * </p>
     * 
     * @param target
     *        The schedule's target details.
     */

    public void setTarget(TargetSummary target) {
        this.target = target;
    }

    /**
     * <p>
     * The schedule's target details.
     * </p>
     * 
     * @return The schedule's target details.
     */

    public TargetSummary getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The schedule's target details.
     * </p>
     * 
     * @param target
     *        The schedule's target details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduleSummary withTarget(TargetSummary target) {
        setTarget(target);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getLastModificationDate() != null)
            sb.append("LastModificationDate: ").append(getLastModificationDate()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleSummary == false)
            return false;
        ScheduleSummary other = (ScheduleSummary) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getLastModificationDate() == null ^ this.getLastModificationDate() == null)
            return false;
        if (other.getLastModificationDate() != null && other.getLastModificationDate().equals(this.getLastModificationDate()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getLastModificationDate() == null) ? 0 : getLastModificationDate().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public ScheduleSummary clone() {
        try {
            return (ScheduleSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.scheduler.model.transform.ScheduleSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
