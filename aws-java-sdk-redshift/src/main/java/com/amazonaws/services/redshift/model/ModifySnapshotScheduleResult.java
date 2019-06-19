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

/**
 * <p>
 * Describes a snapshot schedule. You can set a regular interval for creating snapshots of a cluster. You can also
 * schedule snapshots for specific dates.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ModifySnapshotSchedule" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySnapshotScheduleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of ScheduleDefinitions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> scheduleDefinitions;
    /**
     * <p>
     * A unique identifier for the schedule.
     * </p>
     */
    private String scheduleIdentifier;
    /**
     * <p>
     * The description of the schedule.
     * </p>
     */
    private String scheduleDescription;
    /**
     * <p>
     * An optional set of tags describing the schedule.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /** <p/> */
    private com.amazonaws.internal.SdkInternalList<java.util.Date> nextInvocations;
    /**
     * <p>
     * The number of clusters associated with the schedule.
     * </p>
     */
    private Integer associatedClusterCount;
    /**
     * <p>
     * A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterAssociatedToSchedule> associatedClusters;

    /**
     * <p>
     * A list of ScheduleDefinitions.
     * </p>
     * 
     * @return A list of ScheduleDefinitions.
     */

    public java.util.List<String> getScheduleDefinitions() {
        if (scheduleDefinitions == null) {
            scheduleDefinitions = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return scheduleDefinitions;
    }

    /**
     * <p>
     * A list of ScheduleDefinitions.
     * </p>
     * 
     * @param scheduleDefinitions
     *        A list of ScheduleDefinitions.
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
     * A list of ScheduleDefinitions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setScheduleDefinitions(java.util.Collection)} or {@link #withScheduleDefinitions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param scheduleDefinitions
     *        A list of ScheduleDefinitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleResult withScheduleDefinitions(String... scheduleDefinitions) {
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
     * A list of ScheduleDefinitions.
     * </p>
     * 
     * @param scheduleDefinitions
     *        A list of ScheduleDefinitions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleResult withScheduleDefinitions(java.util.Collection<String> scheduleDefinitions) {
        setScheduleDefinitions(scheduleDefinitions);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the schedule.
     * </p>
     * 
     * @param scheduleIdentifier
     *        A unique identifier for the schedule.
     */

    public void setScheduleIdentifier(String scheduleIdentifier) {
        this.scheduleIdentifier = scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the schedule.
     * </p>
     * 
     * @return A unique identifier for the schedule.
     */

    public String getScheduleIdentifier() {
        return this.scheduleIdentifier;
    }

    /**
     * <p>
     * A unique identifier for the schedule.
     * </p>
     * 
     * @param scheduleIdentifier
     *        A unique identifier for the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleResult withScheduleIdentifier(String scheduleIdentifier) {
        setScheduleIdentifier(scheduleIdentifier);
        return this;
    }

    /**
     * <p>
     * The description of the schedule.
     * </p>
     * 
     * @param scheduleDescription
     *        The description of the schedule.
     */

    public void setScheduleDescription(String scheduleDescription) {
        this.scheduleDescription = scheduleDescription;
    }

    /**
     * <p>
     * The description of the schedule.
     * </p>
     * 
     * @return The description of the schedule.
     */

    public String getScheduleDescription() {
        return this.scheduleDescription;
    }

    /**
     * <p>
     * The description of the schedule.
     * </p>
     * 
     * @param scheduleDescription
     *        The description of the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleResult withScheduleDescription(String scheduleDescription) {
        setScheduleDescription(scheduleDescription);
        return this;
    }

    /**
     * <p>
     * An optional set of tags describing the schedule.
     * </p>
     * 
     * @return An optional set of tags describing the schedule.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * An optional set of tags describing the schedule.
     * </p>
     * 
     * @param tags
     *        An optional set of tags describing the schedule.
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
     * An optional set of tags describing the schedule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        An optional set of tags describing the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleResult withTags(Tag... tags) {
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
     * An optional set of tags describing the schedule.
     * </p>
     * 
     * @param tags
     *        An optional set of tags describing the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleResult withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<java.util.Date> getNextInvocations() {
        if (nextInvocations == null) {
            nextInvocations = new com.amazonaws.internal.SdkInternalList<java.util.Date>();
        }
        return nextInvocations;
    }

    /**
     * <p/>
     * 
     * @param nextInvocations
     */

    public void setNextInvocations(java.util.Collection<java.util.Date> nextInvocations) {
        if (nextInvocations == null) {
            this.nextInvocations = null;
            return;
        }

        this.nextInvocations = new com.amazonaws.internal.SdkInternalList<java.util.Date>(nextInvocations);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNextInvocations(java.util.Collection)} or {@link #withNextInvocations(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param nextInvocations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleResult withNextInvocations(java.util.Date... nextInvocations) {
        if (this.nextInvocations == null) {
            setNextInvocations(new com.amazonaws.internal.SdkInternalList<java.util.Date>(nextInvocations.length));
        }
        for (java.util.Date ele : nextInvocations) {
            this.nextInvocations.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param nextInvocations
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleResult withNextInvocations(java.util.Collection<java.util.Date> nextInvocations) {
        setNextInvocations(nextInvocations);
        return this;
    }

    /**
     * <p>
     * The number of clusters associated with the schedule.
     * </p>
     * 
     * @param associatedClusterCount
     *        The number of clusters associated with the schedule.
     */

    public void setAssociatedClusterCount(Integer associatedClusterCount) {
        this.associatedClusterCount = associatedClusterCount;
    }

    /**
     * <p>
     * The number of clusters associated with the schedule.
     * </p>
     * 
     * @return The number of clusters associated with the schedule.
     */

    public Integer getAssociatedClusterCount() {
        return this.associatedClusterCount;
    }

    /**
     * <p>
     * The number of clusters associated with the schedule.
     * </p>
     * 
     * @param associatedClusterCount
     *        The number of clusters associated with the schedule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleResult withAssociatedClusterCount(Integer associatedClusterCount) {
        setAssociatedClusterCount(associatedClusterCount);
        return this;
    }

    /**
     * <p>
     * A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
     * </p>
     * 
     * @return A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
     */

    public java.util.List<ClusterAssociatedToSchedule> getAssociatedClusters() {
        if (associatedClusters == null) {
            associatedClusters = new com.amazonaws.internal.SdkInternalList<ClusterAssociatedToSchedule>();
        }
        return associatedClusters;
    }

    /**
     * <p>
     * A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
     * </p>
     * 
     * @param associatedClusters
     *        A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
     */

    public void setAssociatedClusters(java.util.Collection<ClusterAssociatedToSchedule> associatedClusters) {
        if (associatedClusters == null) {
            this.associatedClusters = null;
            return;
        }

        this.associatedClusters = new com.amazonaws.internal.SdkInternalList<ClusterAssociatedToSchedule>(associatedClusters);
    }

    /**
     * <p>
     * A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociatedClusters(java.util.Collection)} or {@link #withAssociatedClusters(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param associatedClusters
     *        A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleResult withAssociatedClusters(ClusterAssociatedToSchedule... associatedClusters) {
        if (this.associatedClusters == null) {
            setAssociatedClusters(new com.amazonaws.internal.SdkInternalList<ClusterAssociatedToSchedule>(associatedClusters.length));
        }
        for (ClusterAssociatedToSchedule ele : associatedClusters) {
            this.associatedClusters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
     * </p>
     * 
     * @param associatedClusters
     *        A list of clusters associated with the schedule. A maximum of 100 clusters is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotScheduleResult withAssociatedClusters(java.util.Collection<ClusterAssociatedToSchedule> associatedClusters) {
        setAssociatedClusters(associatedClusters);
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
        if (getNextInvocations() != null)
            sb.append("NextInvocations: ").append(getNextInvocations()).append(",");
        if (getAssociatedClusterCount() != null)
            sb.append("AssociatedClusterCount: ").append(getAssociatedClusterCount()).append(",");
        if (getAssociatedClusters() != null)
            sb.append("AssociatedClusters: ").append(getAssociatedClusters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySnapshotScheduleResult == false)
            return false;
        ModifySnapshotScheduleResult other = (ModifySnapshotScheduleResult) obj;
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
        if (other.getNextInvocations() == null ^ this.getNextInvocations() == null)
            return false;
        if (other.getNextInvocations() != null && other.getNextInvocations().equals(this.getNextInvocations()) == false)
            return false;
        if (other.getAssociatedClusterCount() == null ^ this.getAssociatedClusterCount() == null)
            return false;
        if (other.getAssociatedClusterCount() != null && other.getAssociatedClusterCount().equals(this.getAssociatedClusterCount()) == false)
            return false;
        if (other.getAssociatedClusters() == null ^ this.getAssociatedClusters() == null)
            return false;
        if (other.getAssociatedClusters() != null && other.getAssociatedClusters().equals(this.getAssociatedClusters()) == false)
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
        hashCode = prime * hashCode + ((getNextInvocations() == null) ? 0 : getNextInvocations().hashCode());
        hashCode = prime * hashCode + ((getAssociatedClusterCount() == null) ? 0 : getAssociatedClusterCount().hashCode());
        hashCode = prime * hashCode + ((getAssociatedClusters() == null) ? 0 : getAssociatedClusters().hashCode());
        return hashCode;
    }

    @Override
    public ModifySnapshotScheduleResult clone() {
        try {
            return (ModifySnapshotScheduleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
