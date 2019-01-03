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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes scaling activity, which is a long-running process that represents a change to your Auto Scaling group, such
 * as changing its size or replacing an instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/Activity" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Activity implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the activity.
     * </p>
     */
    private String activityId;
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * A friendly, more verbose description of the activity.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The reason the activity began.
     * </p>
     */
    private String cause;
    /**
     * <p>
     * The start time of the activity.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the activity.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The current status of the activity.
     * </p>
     */
    private String statusCode;
    /**
     * <p>
     * A friendly, more verbose description of the activity status.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * A value between 0 and 100 that indicates the progress of the activity.
     * </p>
     */
    private Integer progress;
    /**
     * <p>
     * The details about the activity.
     * </p>
     */
    private String details;

    /**
     * <p>
     * The ID of the activity.
     * </p>
     * 
     * @param activityId
     *        The ID of the activity.
     */

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * <p>
     * The ID of the activity.
     * </p>
     * 
     * @return The ID of the activity.
     */

    public String getActivityId() {
        return this.activityId;
    }

    /**
     * <p>
     * The ID of the activity.
     * </p>
     * 
     * @param activityId
     *        The ID of the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withActivityId(String activityId) {
        setActivityId(activityId);
        return this;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @return The name of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withAutoScalingGroupName(String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * A friendly, more verbose description of the activity.
     * </p>
     * 
     * @param description
     *        A friendly, more verbose description of the activity.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A friendly, more verbose description of the activity.
     * </p>
     * 
     * @return A friendly, more verbose description of the activity.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A friendly, more verbose description of the activity.
     * </p>
     * 
     * @param description
     *        A friendly, more verbose description of the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The reason the activity began.
     * </p>
     * 
     * @param cause
     *        The reason the activity began.
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * The reason the activity began.
     * </p>
     * 
     * @return The reason the activity began.
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * The reason the activity began.
     * </p>
     * 
     * @param cause
     *        The reason the activity began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withCause(String cause) {
        setCause(cause);
        return this;
    }

    /**
     * <p>
     * The start time of the activity.
     * </p>
     * 
     * @param startTime
     *        The start time of the activity.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the activity.
     * </p>
     * 
     * @return The start time of the activity.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the activity.
     * </p>
     * 
     * @param startTime
     *        The start time of the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the activity.
     * </p>
     * 
     * @param endTime
     *        The end time of the activity.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the activity.
     * </p>
     * 
     * @return The end time of the activity.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the activity.
     * </p>
     * 
     * @param endTime
     *        The end time of the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The current status of the activity.
     * </p>
     * 
     * @param statusCode
     *        The current status of the activity.
     * @see ScalingActivityStatusCode
     */

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * <p>
     * The current status of the activity.
     * </p>
     * 
     * @return The current status of the activity.
     * @see ScalingActivityStatusCode
     */

    public String getStatusCode() {
        return this.statusCode;
    }

    /**
     * <p>
     * The current status of the activity.
     * </p>
     * 
     * @param statusCode
     *        The current status of the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingActivityStatusCode
     */

    public Activity withStatusCode(String statusCode) {
        setStatusCode(statusCode);
        return this;
    }

    /**
     * <p>
     * The current status of the activity.
     * </p>
     * 
     * @param statusCode
     *        The current status of the activity.
     * @see ScalingActivityStatusCode
     */

    public void setStatusCode(ScalingActivityStatusCode statusCode) {
        withStatusCode(statusCode);
    }

    /**
     * <p>
     * The current status of the activity.
     * </p>
     * 
     * @param statusCode
     *        The current status of the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingActivityStatusCode
     */

    public Activity withStatusCode(ScalingActivityStatusCode statusCode) {
        this.statusCode = statusCode.toString();
        return this;
    }

    /**
     * <p>
     * A friendly, more verbose description of the activity status.
     * </p>
     * 
     * @param statusMessage
     *        A friendly, more verbose description of the activity status.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A friendly, more verbose description of the activity status.
     * </p>
     * 
     * @return A friendly, more verbose description of the activity status.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A friendly, more verbose description of the activity status.
     * </p>
     * 
     * @param statusMessage
     *        A friendly, more verbose description of the activity status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * A value between 0 and 100 that indicates the progress of the activity.
     * </p>
     * 
     * @param progress
     *        A value between 0 and 100 that indicates the progress of the activity.
     */

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * A value between 0 and 100 that indicates the progress of the activity.
     * </p>
     * 
     * @return A value between 0 and 100 that indicates the progress of the activity.
     */

    public Integer getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * A value between 0 and 100 that indicates the progress of the activity.
     * </p>
     * 
     * @param progress
     *        A value between 0 and 100 that indicates the progress of the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withProgress(Integer progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * The details about the activity.
     * </p>
     * 
     * @param details
     *        The details about the activity.
     */

    public void setDetails(String details) {
        this.details = details;
    }

    /**
     * <p>
     * The details about the activity.
     * </p>
     * 
     * @return The details about the activity.
     */

    public String getDetails() {
        return this.details;
    }

    /**
     * <p>
     * The details about the activity.
     * </p>
     * 
     * @param details
     *        The details about the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Activity withDetails(String details) {
        setDetails(details);
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
        if (getActivityId() != null)
            sb.append("ActivityId: ").append(getActivityId()).append(",");
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: ").append(getAutoScalingGroupName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCause() != null)
            sb.append("Cause: ").append(getCause()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStatusCode() != null)
            sb.append("StatusCode: ").append(getStatusCode()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getProgress() != null)
            sb.append("Progress: ").append(getProgress()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Activity == false)
            return false;
        Activity other = (Activity) obj;
        if (other.getActivityId() == null ^ this.getActivityId() == null)
            return false;
        if (other.getActivityId() != null && other.getActivityId().equals(this.getActivityId()) == false)
            return false;
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStatusCode() == null ^ this.getStatusCode() == null)
            return false;
        if (other.getStatusCode() != null && other.getStatusCode().equals(this.getStatusCode()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActivityId() == null) ? 0 : getActivityId().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStatusCode() == null) ? 0 : getStatusCode().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public Activity clone() {
        try {
            return (Activity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
