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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/CreateSnapshotSchedule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSnapshotScheduleRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example
     * "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> scheduleDefinitions;
    /**
     * <p>
     * A unique identifier for a snapshot schedule. Only alphanumeric characters are allowed for the identifier.
     * </p>
     */
    private String scheduleIdentifier;
    /**
     * <p>
     * The description of the snapshot schedule.
     * </p>
     */
    private String scheduleDescription;
    /**
     * <p>
     * An optional set of tags you can use to search for the schedule.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /** <p/> */
    private Boolean dryRun;
    /** <p/> */
    private Integer nextInvocations;

    /**
     * <p>
     * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example
     * "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     * 
     * @return The definition of the snapshot schedule. The definition is made up of schedule expressions, for example
     *         "cron(30 12 *)" or "rate(12 hours)".
     */

    public java.util.List<String> getScheduleDefinitions() {
        if (scheduleDefinitions == null) {
            scheduleDefinitions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return scheduleDefinitions;
    }

    /**
     * <p>
     * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example
     * "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     * 
     * @param scheduleDefinitions
     *        The definition of the snapshot schedule. The definition is made up of schedule expressions, for example
     *        "cron(30 12 *)" or "rate(12 hours)".
     */

    public void setScheduleDefinitions(java.util.Collection<String> scheduleDefinitions) {
        if (scheduleDefinitions == null) {
            this.scheduleDefinitions = null;
            return;
        }

        this.scheduleDefinitions = new com.amazonaws.internal.SdkInternalList<String>(scheduleDefinitions);
    }

    /**
     * <p>
     * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example
     * "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduleDefinitions(java.util.Collection)} or {@link #withScheduleDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param scheduleDefinitions
     *        The definition of the snapshot schedule. The definition is made up of schedule expressions, for example
     *        "cron(30 12 *)" or "rate(12 hours)".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotScheduleRequest withScheduleDefinitions(String... scheduleDefinitions) {
        if (this.scheduleDefinitions == null) {
            setScheduleDefinitions(new com.amazonaws.internal.SdkInternalList<String>(scheduleDefinitions.length));
        }
        for (String ele : scheduleDefinitions) {
            this.scheduleDefinitions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The definition of the snapshot schedule. The definition is made up of schedule expressions, for example
     * "cron(30 12 *)" or "rate(12 hours)".
     * </p>
     * 
     * @param scheduleDefinitions
     *        The definition of the snapshot schedule. The definition is made up of schedule expressions, for example
     *        "cron(30 12 *)" or "rate(12 hours)".
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotScheduleRequest withScheduleDefinitions(java.util.Collection<String> scheduleDefinitions) {
        setScheduleDefinitions(scheduleDefinitions);
        return this;
    }

    /**
     * <p>
     * A unique identifier for a snapshot schedule. Only alphanumeric characters are allowed for the identifier.
     * </p>
     * 
     * @param scheduleIdentifier
     *        A unique identifier for a snapshot schedule. Only alphanumeric characters are allowed for the identifier.
     */

    public void setScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for a snapshot schedule. Only alphanumeric characters are allowed for the identifier.
     * </p>
     * 
     * @return A unique identifier for a snapshot schedule. Only alphanumeric characters are allowed for the identifier.
     */

    public String getScheduleIdentifier() {
        return this.scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for a snapshot schedule. Only alphanumeric characters are allowed for the identifier.
     * </p>
     * 
     * @param scheduleIdentifier
     *        A unique identifier for a snapshot schedule. Only alphanumeric characters are allowed for the identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotScheduleRequest withScheduleIdentifier(String scheduleIdentifier) {
        setScheduleIdentifier(scheduleIdentifier);
        return this;
    }

    /**
     * <p>
     * The description of the snapshot schedule.
     * </p>
     * 
     * @param scheduleDescription
     *        The description of the snapshot schedule.
     */

    public void setScheduleDescription(String scheduleDescription) {
        this.scheduleDescription = scheduleDescription;
    }

    /**
     * <p>
     * The description of the snapshot schedule.
     * </p>
     * 
     * @return The description of the snapshot schedule.
     */

    public String getScheduleDescription() {
        return this.scheduleDescription;
    }

    /**
     * <p>
     * The description of the snapshot schedule.
     * </p>
     * 
     * @param scheduleDescription
     *        The description of the snapshot schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotScheduleRequest withScheduleDescription(String scheduleDescription) {
        setScheduleDescription(scheduleDescription);
        return this;
    }

    /**
     * <p>
     * An optional set of tags you can use to search for the schedule.
     * </p>
     * 
     * @return An optional set of tags you can use to search for the schedule.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * An optional set of tags you can use to search for the schedule.
     * </p>
     * 
     * @param tags
     *        An optional set of tags you can use to search for the schedule.
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
     * An optional set of tags you can use to search for the schedule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An optional set of tags you can use to search for the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotScheduleRequest withTags(Tag... tags) {
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
     * An optional set of tags you can use to search for the schedule.
     * </p>
     * 
     * @param tags
     *        An optional set of tags you can use to search for the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotScheduleRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p/>
     * 
     * @param dryRun
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p/>
     * 
     * @param dryRun
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotScheduleRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean isDryRun() {
        return this.dryRun;
    }

    /**
     * <p/>
     * 
     * @param nextInvocations
     */

    public void setNextInvocations(Integer nextInvocations) {
        this.nextInvocations = nextInvocations;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Integer getNextInvocations() {
        return this.nextInvocations;
    }

    /**
     * <p/>
     * 
     * @param nextInvocations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSnapshotScheduleRequest withNextInvocations(Integer nextInvocations) {
        setNextInvocations(nextInvocations);
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
        if (getScheduleDefinitions() != null)
            sb.append("ScheduleDefinitions: ").append(getScheduleDefinitions()).append(",");
        if (getScheduleIdentifier() != null)
            sb.append("ScheduleIdentifier: ").append(getScheduleIdentifier()).append(",");
        if (getScheduleDescription() != null)
            sb.append("ScheduleDescription: ").append(getScheduleDescription()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun()).append(",");
        if (getNextInvocations() != null)
            sb.append("NextInvocations: ").append(getNextInvocations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotScheduleRequest == false)
            return false;
        CreateSnapshotScheduleRequest other = (CreateSnapshotScheduleRequest) obj;
        if (other.getScheduleDefinitions() == null ^ this.getScheduleDefinitions() == null)
            return false;
        if (other.getScheduleDefinitions() != null && other.getScheduleDefinitions().equals(this.getScheduleDefinitions()) == false)
            return false;
        if (other.getScheduleIdentifier() == null ^ this.getScheduleIdentifier() == null)
            return false;
        if (other.getScheduleIdentifier() != null && other.getScheduleIdentifier().equals(this.getScheduleIdentifier()) == false)
            return false;
        if (other.getScheduleDescription() == null ^ this.getScheduleDescription() == null)
            return false;
        if (other.getScheduleDescription() != null && other.getScheduleDescription().equals(this.getScheduleDescription()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getNextInvocations() == null ^ this.getNextInvocations() == null)
            return false;
        if (other.getNextInvocations() != null && other.getNextInvocations().equals(this.getNextInvocations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScheduleDefinitions() == null) ? 0 : getScheduleDefinitions().hashCode());
        hashCode = prime * hashCode + ((getScheduleIdentifier() == null) ? 0 : getScheduleIdentifier().hashCode());
        hashCode = prime * hashCode + ((getScheduleDescription() == null) ? 0 : getScheduleDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getNextInvocations() == null) ? 0 : getNextInvocations().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotScheduleRequest clone() {
        return (CreateSnapshotScheduleRequest) super.clone();
    }

}
