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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeSnapshotSchedule"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotScheduleResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume that was specified in the request.
     * </p>
     */
    private String volumeARN;
    /**
     * <p>
     * The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is the hour
     * (0 to 23). The hour of the day is in the time zone of the gateway.
     * </p>
     */
    private Integer startAt;
    /**
     * <p>
     * The number of hours between snapshots.
     * </p>
     */
    private Integer recurrenceInHours;
    /**
     * <p>
     * The snapshot description.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A value that indicates the time zone of the gateway.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * A list of up to 50 tags assigned to the snapshot schedule, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume that was specified in the request.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume that was specified in the request.
     */

    public void setVolumeARN(String volumeARN) {
        this.volumeARN = volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume that was specified in the request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the volume that was specified in the request.
     */

    public String getVolumeARN() {
        return this.volumeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the volume that was specified in the request.
     * </p>
     * 
     * @param volumeARN
     *        The Amazon Resource Name (ARN) of the volume that was specified in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotScheduleResult withVolumeARN(String volumeARN) {
        setVolumeARN(volumeARN);
        return this;
    }

    /**
     * <p>
     * The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is the hour
     * (0 to 23). The hour of the day is in the time zone of the gateway.
     * </p>
     * 
     * @param startAt
     *        The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is the
     *        hour (0 to 23). The hour of the day is in the time zone of the gateway.
     */

    public void setStartAt(Integer startAt) {
        this.startAt = startAt;
    }

    /**
     * <p>
     * The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is the hour
     * (0 to 23). The hour of the day is in the time zone of the gateway.
     * </p>
     * 
     * @return The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is
     *         the hour (0 to 23). The hour of the day is in the time zone of the gateway.
     */

    public Integer getStartAt() {
        return this.startAt;
    }

    /**
     * <p>
     * The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is the hour
     * (0 to 23). The hour of the day is in the time zone of the gateway.
     * </p>
     * 
     * @param startAt
     *        The hour of the day at which the snapshot schedule begins represented as <i>hh</i>, where <i>hh</i> is the
     *        hour (0 to 23). The hour of the day is in the time zone of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotScheduleResult withStartAt(Integer startAt) {
        setStartAt(startAt);
        return this;
    }

    /**
     * <p>
     * The number of hours between snapshots.
     * </p>
     * 
     * @param recurrenceInHours
     *        The number of hours between snapshots.
     */

    public void setRecurrenceInHours(Integer recurrenceInHours) {
        this.recurrenceInHours = recurrenceInHours;
    }

    /**
     * <p>
     * The number of hours between snapshots.
     * </p>
     * 
     * @return The number of hours between snapshots.
     */

    public Integer getRecurrenceInHours() {
        return this.recurrenceInHours;
    }

    /**
     * <p>
     * The number of hours between snapshots.
     * </p>
     * 
     * @param recurrenceInHours
     *        The number of hours between snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotScheduleResult withRecurrenceInHours(Integer recurrenceInHours) {
        setRecurrenceInHours(recurrenceInHours);
        return this;
    }

    /**
     * <p>
     * The snapshot description.
     * </p>
     * 
     * @param description
     *        The snapshot description.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The snapshot description.
     * </p>
     * 
     * @return The snapshot description.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The snapshot description.
     * </p>
     * 
     * @param description
     *        The snapshot description.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotScheduleResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A value that indicates the time zone of the gateway.
     * </p>
     * 
     * @param timezone
     *        A value that indicates the time zone of the gateway.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * A value that indicates the time zone of the gateway.
     * </p>
     * 
     * @return A value that indicates the time zone of the gateway.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * A value that indicates the time zone of the gateway.
     * </p>
     * 
     * @param timezone
     *        A value that indicates the time zone of the gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotScheduleResult withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the snapshot schedule, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * 
     * @return A list of up to 50 tags assigned to the snapshot schedule, sorted alphabetically by key name. Each tag is
     *         a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *         <code>ListTagsForResource</code> API operation.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of up to 50 tags assigned to the snapshot schedule, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the snapshot schedule, sorted alphabetically by key name. Each tag is
     *        a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *        <code>ListTagsForResource</code> API operation.
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
     * A list of up to 50 tags assigned to the snapshot schedule, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the snapshot schedule, sorted alphabetically by key name. Each tag is
     *        a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *        <code>ListTagsForResource</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotScheduleResult withTags(Tag... tags) {
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
     * A list of up to 50 tags assigned to the snapshot schedule, sorted alphabetically by key name. Each tag is a
     * key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     * <code>ListTagsForResource</code> API operation.
     * </p>
     * 
     * @param tags
     *        A list of up to 50 tags assigned to the snapshot schedule, sorted alphabetically by key name. Each tag is
     *        a key-value pair. For a gateway with more than 10 tags assigned, you can view all tags using the
     *        <code>ListTagsForResource</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotScheduleResult withTags(java.util.Collection<Tag> tags) {
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
        if (getVolumeARN() != null)
            sb.append("VolumeARN: ").append(getVolumeARN()).append(",");
        if (getStartAt() != null)
            sb.append("StartAt: ").append(getStartAt()).append(",");
        if (getRecurrenceInHours() != null)
            sb.append("RecurrenceInHours: ").append(getRecurrenceInHours()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
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

        if (obj instanceof DescribeSnapshotScheduleResult == false)
            return false;
        DescribeSnapshotScheduleResult other = (DescribeSnapshotScheduleResult) obj;
        if (other.getVolumeARN() == null ^ this.getVolumeARN() == null)
            return false;
        if (other.getVolumeARN() != null && other.getVolumeARN().equals(this.getVolumeARN()) == false)
            return false;
        if (other.getStartAt() == null ^ this.getStartAt() == null)
            return false;
        if (other.getStartAt() != null && other.getStartAt().equals(this.getStartAt()) == false)
            return false;
        if (other.getRecurrenceInHours() == null ^ this.getRecurrenceInHours() == null)
            return false;
        if (other.getRecurrenceInHours() != null && other.getRecurrenceInHours().equals(this.getRecurrenceInHours()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
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

        hashCode = prime * hashCode + ((getVolumeARN() == null) ? 0 : getVolumeARN().hashCode());
        hashCode = prime * hashCode + ((getStartAt() == null) ? 0 : getStartAt().hashCode());
        hashCode = prime * hashCode + ((getRecurrenceInHours() == null) ? 0 : getRecurrenceInHours().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotScheduleResult clone() {
        try {
            return (DescribeSnapshotScheduleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
