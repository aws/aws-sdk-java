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
 * The event window.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceEventWindow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceEventWindow implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the event window.
     * </p>
     */
    private String instanceEventWindowId;
    /**
     * <p>
     * One or more time ranges defined for the event window.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRange> timeRanges;
    /**
     * <p>
     * The name of the event window.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The cron expression defined for the event window.
     * </p>
     */
    private String cronExpression;
    /**
     * <p>
     * One or more targets associated with the event window.
     * </p>
     */
    private InstanceEventWindowAssociationTarget associationTarget;
    /**
     * <p>
     * The current state of the event window.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The instance tags associated with the event window.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

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

    public InstanceEventWindow withInstanceEventWindowId(String instanceEventWindowId) {
        setInstanceEventWindowId(instanceEventWindowId);
        return this;
    }

    /**
     * <p>
     * One or more time ranges defined for the event window.
     * </p>
     * 
     * @return One or more time ranges defined for the event window.
     */

    public java.util.List<InstanceEventWindowTimeRange> getTimeRanges() {
        if (timeRanges == null) {
            timeRanges = new com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRange>();
        }
        return timeRanges;
    }

    /**
     * <p>
     * One or more time ranges defined for the event window.
     * </p>
     * 
     * @param timeRanges
     *        One or more time ranges defined for the event window.
     */

    public void setTimeRanges(java.util.Collection<InstanceEventWindowTimeRange> timeRanges) {
        if (timeRanges == null) {
            this.timeRanges = null;
            return;
        }

        this.timeRanges = new com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRange>(timeRanges);
    }

    /**
     * <p>
     * One or more time ranges defined for the event window.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimeRanges(java.util.Collection)} or {@link #withTimeRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param timeRanges
     *        One or more time ranges defined for the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindow withTimeRanges(InstanceEventWindowTimeRange... timeRanges) {
        if (this.timeRanges == null) {
            setTimeRanges(new com.amazonaws.internal.SdkInternalList<InstanceEventWindowTimeRange>(timeRanges.length));
        }
        for (InstanceEventWindowTimeRange ele : timeRanges) {
            this.timeRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more time ranges defined for the event window.
     * </p>
     * 
     * @param timeRanges
     *        One or more time ranges defined for the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindow withTimeRanges(java.util.Collection<InstanceEventWindowTimeRange> timeRanges) {
        setTimeRanges(timeRanges);
        return this;
    }

    /**
     * <p>
     * The name of the event window.
     * </p>
     * 
     * @param name
     *        The name of the event window.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the event window.
     * </p>
     * 
     * @return The name of the event window.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the event window.
     * </p>
     * 
     * @param name
     *        The name of the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindow withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The cron expression defined for the event window.
     * </p>
     * 
     * @param cronExpression
     *        The cron expression defined for the event window.
     */

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    /**
     * <p>
     * The cron expression defined for the event window.
     * </p>
     * 
     * @return The cron expression defined for the event window.
     */

    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * <p>
     * The cron expression defined for the event window.
     * </p>
     * 
     * @param cronExpression
     *        The cron expression defined for the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindow withCronExpression(String cronExpression) {
        setCronExpression(cronExpression);
        return this;
    }

    /**
     * <p>
     * One or more targets associated with the event window.
     * </p>
     * 
     * @param associationTarget
     *        One or more targets associated with the event window.
     */

    public void setAssociationTarget(InstanceEventWindowAssociationTarget associationTarget) {
        this.associationTarget = associationTarget;
    }

    /**
     * <p>
     * One or more targets associated with the event window.
     * </p>
     * 
     * @return One or more targets associated with the event window.
     */

    public InstanceEventWindowAssociationTarget getAssociationTarget() {
        return this.associationTarget;
    }

    /**
     * <p>
     * One or more targets associated with the event window.
     * </p>
     * 
     * @param associationTarget
     *        One or more targets associated with the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindow withAssociationTarget(InstanceEventWindowAssociationTarget associationTarget) {
        setAssociationTarget(associationTarget);
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

    public InstanceEventWindow withState(String state) {
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

    public InstanceEventWindow withState(InstanceEventWindowState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The instance tags associated with the event window.
     * </p>
     * 
     * @return The instance tags associated with the event window.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The instance tags associated with the event window.
     * </p>
     * 
     * @param tags
     *        The instance tags associated with the event window.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The instance tags associated with the event window.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The instance tags associated with the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindow withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance tags associated with the event window.
     * </p>
     * 
     * @param tags
     *        The instance tags associated with the event window.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceEventWindow withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTimeRanges() != null)
            sb.append("TimeRanges: ").append(getTimeRanges()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getCronExpression() != null)
            sb.append("CronExpression: ").append(getCronExpression()).append(",");
        if (getAssociationTarget() != null)
            sb.append("AssociationTarget: ").append(getAssociationTarget()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof InstanceEventWindow == false)
            return false;
        InstanceEventWindow other = (InstanceEventWindow) obj;
        if (other.getInstanceEventWindowId() == null ^ this.getInstanceEventWindowId() == null)
            return false;
        if (other.getInstanceEventWindowId() != null && other.getInstanceEventWindowId().equals(this.getInstanceEventWindowId()) == false)
            return false;
        if (other.getTimeRanges() == null ^ this.getTimeRanges() == null)
            return false;
        if (other.getTimeRanges() != null && other.getTimeRanges().equals(this.getTimeRanges()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCronExpression() == null ^ this.getCronExpression() == null)
            return false;
        if (other.getCronExpression() != null && other.getCronExpression().equals(this.getCronExpression()) == false)
            return false;
        if (other.getAssociationTarget() == null ^ this.getAssociationTarget() == null)
            return false;
        if (other.getAssociationTarget() != null && other.getAssociationTarget().equals(this.getAssociationTarget()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getInstanceEventWindowId() == null) ? 0 : getInstanceEventWindowId().hashCode());
        hashCode = prime * hashCode + ((getTimeRanges() == null) ? 0 : getTimeRanges().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCronExpression() == null) ? 0 : getCronExpression().hashCode());
        hashCode = prime * hashCode + ((getAssociationTarget() == null) ? 0 : getAssociationTarget().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public InstanceEventWindow clone() {
        try {
            return (InstanceEventWindow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
