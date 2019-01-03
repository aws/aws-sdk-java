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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * You can use queues to manage the resources that are available to your AWS account for running multiple transcoding
 * jobs at the same time. If you don't specify a queue, the service sends all jobs through the default queue. For more
 * information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/Queue" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Queue implements Serializable, Cloneable, StructuredPojo {

    /** An identifier for this resource that is unique within all of AWS. */
    private String arn;
    /** The timestamp in epoch seconds for when you created the queue. */
    private java.util.Date createdAt;
    /** An optional description that you create for each queue. */
    private String description;
    /** The timestamp in epoch seconds for when you most recently updated the queue. */
    private java.util.Date lastUpdated;
    /** A name that you create for each queue. Each name must be unique within your account. */
    private String name;
    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute,
     * billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue,
     * regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
     */
    private String pricingPlan;
    /** The estimated number of jobs with a PROGRESSING status. */
    private Integer progressingJobsCount;
    /**
     * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to
     * on-demand queues.
     */
    private ReservationPlan reservationPlan;
    /**
     * Queues can be ACTIVE or PAUSED. If you pause a queue, the service won't begin processing jobs in that queue. Jobs
     * that are running when you pause the queue continue to run until they finish or result in an error.
     */
    private String status;
    /** The estimated number of jobs with a SUBMITTED status. */
    private Integer submittedJobsCount;
    /**
     * Specifies whether this on-demand queue is system or custom. System queues are built in. You can't modify or
     * delete system queues. You can create and modify custom queues.
     */
    private String type;

    /**
     * An identifier for this resource that is unique within all of AWS.
     * 
     * @param arn
     *        An identifier for this resource that is unique within all of AWS.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     * 
     * @return An identifier for this resource that is unique within all of AWS.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * An identifier for this resource that is unique within all of AWS.
     * 
     * @param arn
     *        An identifier for this resource that is unique within all of AWS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * The timestamp in epoch seconds for when you created the queue.
     * 
     * @param createdAt
     *        The timestamp in epoch seconds for when you created the queue.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * The timestamp in epoch seconds for when you created the queue.
     * 
     * @return The timestamp in epoch seconds for when you created the queue.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * The timestamp in epoch seconds for when you created the queue.
     * 
     * @param createdAt
     *        The timestamp in epoch seconds for when you created the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * An optional description that you create for each queue.
     * 
     * @param description
     *        An optional description that you create for each queue.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * An optional description that you create for each queue.
     * 
     * @return An optional description that you create for each queue.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * An optional description that you create for each queue.
     * 
     * @param description
     *        An optional description that you create for each queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * The timestamp in epoch seconds for when you most recently updated the queue.
     * 
     * @param lastUpdated
     *        The timestamp in epoch seconds for when you most recently updated the queue.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * The timestamp in epoch seconds for when you most recently updated the queue.
     * 
     * @return The timestamp in epoch seconds for when you most recently updated the queue.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * The timestamp in epoch seconds for when you most recently updated the queue.
     * 
     * @param lastUpdated
     *        The timestamp in epoch seconds for when you most recently updated the queue.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * A name that you create for each queue. Each name must be unique within your account.
     * 
     * @param name
     *        A name that you create for each queue. Each name must be unique within your account.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * A name that you create for each queue. Each name must be unique within your account.
     * 
     * @return A name that you create for each queue. Each name must be unique within your account.
     */

    public String getName() {
        return this.name;
    }

    /**
     * A name that you create for each queue. Each name must be unique within your account.
     * 
     * @param name
     *        A name that you create for each queue. Each name must be unique within your account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute,
     * billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue,
     * regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
     * 
     * @param pricingPlan
     *        Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per
     *        minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the
     *        entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month
     *        commitment.
     * @see PricingPlan
     */

    public void setPricingPlan(String pricingPlan) {
        this.pricingPlan = pricingPlan;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute,
     * billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue,
     * regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
     * 
     * @return Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per
     *         minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the
     *         entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month
     *         commitment.
     * @see PricingPlan
     */

    public String getPricingPlan() {
        return this.pricingPlan;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute,
     * billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue,
     * regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
     * 
     * @param pricingPlan
     *        Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per
     *        minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the
     *        entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month
     *        commitment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public Queue withPricingPlan(String pricingPlan) {
        setPricingPlan(pricingPlan);
        return this;
    }

    /**
     * Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute,
     * billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue,
     * regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment.
     * 
     * @param pricingPlan
     *        Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per
     *        minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the
     *        entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month
     *        commitment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PricingPlan
     */

    public Queue withPricingPlan(PricingPlan pricingPlan) {
        this.pricingPlan = pricingPlan.toString();
        return this;
    }

    /**
     * The estimated number of jobs with a PROGRESSING status.
     * 
     * @param progressingJobsCount
     *        The estimated number of jobs with a PROGRESSING status.
     */

    public void setProgressingJobsCount(Integer progressingJobsCount) {
        this.progressingJobsCount = progressingJobsCount;
    }

    /**
     * The estimated number of jobs with a PROGRESSING status.
     * 
     * @return The estimated number of jobs with a PROGRESSING status.
     */

    public Integer getProgressingJobsCount() {
        return this.progressingJobsCount;
    }

    /**
     * The estimated number of jobs with a PROGRESSING status.
     * 
     * @param progressingJobsCount
     *        The estimated number of jobs with a PROGRESSING status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withProgressingJobsCount(Integer progressingJobsCount) {
        setProgressingJobsCount(progressingJobsCount);
        return this;
    }

    /**
     * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to
     * on-demand queues.
     * 
     * @param reservationPlan
     *        Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to
     *        on-demand queues.
     */

    public void setReservationPlan(ReservationPlan reservationPlan) {
        this.reservationPlan = reservationPlan;
    }

    /**
     * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to
     * on-demand queues.
     * 
     * @return Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable
     *         to on-demand queues.
     */

    public ReservationPlan getReservationPlan() {
        return this.reservationPlan;
    }

    /**
     * Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to
     * on-demand queues.
     * 
     * @param reservationPlan
     *        Details about the pricing plan for your reserved queue. Required for reserved queues and not applicable to
     *        on-demand queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withReservationPlan(ReservationPlan reservationPlan) {
        setReservationPlan(reservationPlan);
        return this;
    }

    /**
     * Queues can be ACTIVE or PAUSED. If you pause a queue, the service won't begin processing jobs in that queue. Jobs
     * that are running when you pause the queue continue to run until they finish or result in an error.
     * 
     * @param status
     *        Queues can be ACTIVE or PAUSED. If you pause a queue, the service won't begin processing jobs in that
     *        queue. Jobs that are running when you pause the queue continue to run until they finish or result in an
     *        error.
     * @see QueueStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Queues can be ACTIVE or PAUSED. If you pause a queue, the service won't begin processing jobs in that queue. Jobs
     * that are running when you pause the queue continue to run until they finish or result in an error.
     * 
     * @return Queues can be ACTIVE or PAUSED. If you pause a queue, the service won't begin processing jobs in that
     *         queue. Jobs that are running when you pause the queue continue to run until they finish or result in an
     *         error.
     * @see QueueStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * Queues can be ACTIVE or PAUSED. If you pause a queue, the service won't begin processing jobs in that queue. Jobs
     * that are running when you pause the queue continue to run until they finish or result in an error.
     * 
     * @param status
     *        Queues can be ACTIVE or PAUSED. If you pause a queue, the service won't begin processing jobs in that
     *        queue. Jobs that are running when you pause the queue continue to run until they finish or result in an
     *        error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueStatus
     */

    public Queue withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * Queues can be ACTIVE or PAUSED. If you pause a queue, the service won't begin processing jobs in that queue. Jobs
     * that are running when you pause the queue continue to run until they finish or result in an error.
     * 
     * @param status
     *        Queues can be ACTIVE or PAUSED. If you pause a queue, the service won't begin processing jobs in that
     *        queue. Jobs that are running when you pause the queue continue to run until they finish or result in an
     *        error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueueStatus
     */

    public Queue withStatus(QueueStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The estimated number of jobs with a SUBMITTED status.
     * 
     * @param submittedJobsCount
     *        The estimated number of jobs with a SUBMITTED status.
     */

    public void setSubmittedJobsCount(Integer submittedJobsCount) {
        this.submittedJobsCount = submittedJobsCount;
    }

    /**
     * The estimated number of jobs with a SUBMITTED status.
     * 
     * @return The estimated number of jobs with a SUBMITTED status.
     */

    public Integer getSubmittedJobsCount() {
        return this.submittedJobsCount;
    }

    /**
     * The estimated number of jobs with a SUBMITTED status.
     * 
     * @param submittedJobsCount
     *        The estimated number of jobs with a SUBMITTED status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Queue withSubmittedJobsCount(Integer submittedJobsCount) {
        setSubmittedJobsCount(submittedJobsCount);
        return this;
    }

    /**
     * Specifies whether this on-demand queue is system or custom. System queues are built in. You can't modify or
     * delete system queues. You can create and modify custom queues.
     * 
     * @param type
     *        Specifies whether this on-demand queue is system or custom. System queues are built in. You can't modify
     *        or delete system queues. You can create and modify custom queues.
     * @see Type
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * Specifies whether this on-demand queue is system or custom. System queues are built in. You can't modify or
     * delete system queues. You can create and modify custom queues.
     * 
     * @return Specifies whether this on-demand queue is system or custom. System queues are built in. You can't modify
     *         or delete system queues. You can create and modify custom queues.
     * @see Type
     */

    public String getType() {
        return this.type;
    }

    /**
     * Specifies whether this on-demand queue is system or custom. System queues are built in. You can't modify or
     * delete system queues. You can create and modify custom queues.
     * 
     * @param type
     *        Specifies whether this on-demand queue is system or custom. System queues are built in. You can't modify
     *        or delete system queues. You can create and modify custom queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public Queue withType(String type) {
        setType(type);
        return this;
    }

    /**
     * Specifies whether this on-demand queue is system or custom. System queues are built in. You can't modify or
     * delete system queues. You can create and modify custom queues.
     * 
     * @param type
     *        Specifies whether this on-demand queue is system or custom. System queues are built in. You can't modify
     *        or delete system queues. You can create and modify custom queues.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Type
     */

    public Queue withType(Type type) {
        this.type = type.toString();
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPricingPlan() != null)
            sb.append("PricingPlan: ").append(getPricingPlan()).append(",");
        if (getProgressingJobsCount() != null)
            sb.append("ProgressingJobsCount: ").append(getProgressingJobsCount()).append(",");
        if (getReservationPlan() != null)
            sb.append("ReservationPlan: ").append(getReservationPlan()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getSubmittedJobsCount() != null)
            sb.append("SubmittedJobsCount: ").append(getSubmittedJobsCount()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Queue == false)
            return false;
        Queue other = (Queue) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPricingPlan() == null ^ this.getPricingPlan() == null)
            return false;
        if (other.getPricingPlan() != null && other.getPricingPlan().equals(this.getPricingPlan()) == false)
            return false;
        if (other.getProgressingJobsCount() == null ^ this.getProgressingJobsCount() == null)
            return false;
        if (other.getProgressingJobsCount() != null && other.getProgressingJobsCount().equals(this.getProgressingJobsCount()) == false)
            return false;
        if (other.getReservationPlan() == null ^ this.getReservationPlan() == null)
            return false;
        if (other.getReservationPlan() != null && other.getReservationPlan().equals(this.getReservationPlan()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSubmittedJobsCount() == null ^ this.getSubmittedJobsCount() == null)
            return false;
        if (other.getSubmittedJobsCount() != null && other.getSubmittedJobsCount().equals(this.getSubmittedJobsCount()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPricingPlan() == null) ? 0 : getPricingPlan().hashCode());
        hashCode = prime * hashCode + ((getProgressingJobsCount() == null) ? 0 : getProgressingJobsCount().hashCode());
        hashCode = prime * hashCode + ((getReservationPlan() == null) ? 0 : getReservationPlan().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getSubmittedJobsCount() == null) ? 0 : getSubmittedJobsCount().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public Queue clone() {
        try {
            return (Queue) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.QueueMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
