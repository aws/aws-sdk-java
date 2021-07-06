/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.macie2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about when a classification job was paused. For a one-time job, this object also specifies when
 * the job will expire and be cancelled if it isn't resumed. For a recurring job, this object also specifies when the
 * paused job run will expire and be cancelled if it isn't resumed. This object is present only if a job's current
 * status (jobStatus) is USER_PAUSED. The information in this object applies only to a job that was paused while it had
 * a status of RUNNING.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/macie2-2020-01-01/UserPausedDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UserPausedDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job or job run will expire and be cancelled if
     * you don't resume it first.
     * </p>
     */
    private java.util.Date jobExpiresAt;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Health event that Amazon Macie sent to notify you of the job or job run's
     * pending expiration and cancellation. This value is null if a job has been paused for less than 23 days.
     * </p>
     */
    private String jobImminentExpirationHealthEventArn;
    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when you paused the job.
     * </p>
     */
    private java.util.Date jobPausedAt;

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job or job run will expire and be cancelled if
     * you don't resume it first.
     * </p>
     * 
     * @param jobExpiresAt
     *        The date and time, in UTC and extended ISO 8601 format, when the job or job run will expire and be
     *        cancelled if you don't resume it first.
     */

    public void setJobExpiresAt(java.util.Date jobExpiresAt) {
        this.jobExpiresAt = jobExpiresAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job or job run will expire and be cancelled if
     * you don't resume it first.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when the job or job run will expire and be
     *         cancelled if you don't resume it first.
     */

    public java.util.Date getJobExpiresAt() {
        return this.jobExpiresAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when the job or job run will expire and be cancelled if
     * you don't resume it first.
     * </p>
     * 
     * @param jobExpiresAt
     *        The date and time, in UTC and extended ISO 8601 format, when the job or job run will expire and be
     *        cancelled if you don't resume it first.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPausedDetails withJobExpiresAt(java.util.Date jobExpiresAt) {
        setJobExpiresAt(jobExpiresAt);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Health event that Amazon Macie sent to notify you of the job or job run's
     * pending expiration and cancellation. This value is null if a job has been paused for less than 23 days.
     * </p>
     * 
     * @param jobImminentExpirationHealthEventArn
     *        The Amazon Resource Name (ARN) of the Health event that Amazon Macie sent to notify you of the job or job
     *        run's pending expiration and cancellation. This value is null if a job has been paused for less than 23
     *        days.
     */

    public void setJobImminentExpirationHealthEventArn(String jobImminentExpirationHealthEventArn) {
        this.jobImminentExpirationHealthEventArn = jobImminentExpirationHealthEventArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Health event that Amazon Macie sent to notify you of the job or job run's
     * pending expiration and cancellation. This value is null if a job has been paused for less than 23 days.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Health event that Amazon Macie sent to notify you of the job or job
     *         run's pending expiration and cancellation. This value is null if a job has been paused for less than 23
     *         days.
     */

    public String getJobImminentExpirationHealthEventArn() {
        return this.jobImminentExpirationHealthEventArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Health event that Amazon Macie sent to notify you of the job or job run's
     * pending expiration and cancellation. This value is null if a job has been paused for less than 23 days.
     * </p>
     * 
     * @param jobImminentExpirationHealthEventArn
     *        The Amazon Resource Name (ARN) of the Health event that Amazon Macie sent to notify you of the job or job
     *        run's pending expiration and cancellation. This value is null if a job has been paused for less than 23
     *        days.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPausedDetails withJobImminentExpirationHealthEventArn(String jobImminentExpirationHealthEventArn) {
        setJobImminentExpirationHealthEventArn(jobImminentExpirationHealthEventArn);
        return this;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when you paused the job.
     * </p>
     * 
     * @param jobPausedAt
     *        The date and time, in UTC and extended ISO 8601 format, when you paused the job.
     */

    public void setJobPausedAt(java.util.Date jobPausedAt) {
        this.jobPausedAt = jobPausedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when you paused the job.
     * </p>
     * 
     * @return The date and time, in UTC and extended ISO 8601 format, when you paused the job.
     */

    public java.util.Date getJobPausedAt() {
        return this.jobPausedAt;
    }

    /**
     * <p>
     * The date and time, in UTC and extended ISO 8601 format, when you paused the job.
     * </p>
     * 
     * @param jobPausedAt
     *        The date and time, in UTC and extended ISO 8601 format, when you paused the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UserPausedDetails withJobPausedAt(java.util.Date jobPausedAt) {
        setJobPausedAt(jobPausedAt);
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
        if (getJobExpiresAt() != null)
            sb.append("JobExpiresAt: ").append(getJobExpiresAt()).append(",");
        if (getJobImminentExpirationHealthEventArn() != null)
            sb.append("JobImminentExpirationHealthEventArn: ").append(getJobImminentExpirationHealthEventArn()).append(",");
        if (getJobPausedAt() != null)
            sb.append("JobPausedAt: ").append(getJobPausedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPausedDetails == false)
            return false;
        UserPausedDetails other = (UserPausedDetails) obj;
        if (other.getJobExpiresAt() == null ^ this.getJobExpiresAt() == null)
            return false;
        if (other.getJobExpiresAt() != null && other.getJobExpiresAt().equals(this.getJobExpiresAt()) == false)
            return false;
        if (other.getJobImminentExpirationHealthEventArn() == null ^ this.getJobImminentExpirationHealthEventArn() == null)
            return false;
        if (other.getJobImminentExpirationHealthEventArn() != null
                && other.getJobImminentExpirationHealthEventArn().equals(this.getJobImminentExpirationHealthEventArn()) == false)
            return false;
        if (other.getJobPausedAt() == null ^ this.getJobPausedAt() == null)
            return false;
        if (other.getJobPausedAt() != null && other.getJobPausedAt().equals(this.getJobPausedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobExpiresAt() == null) ? 0 : getJobExpiresAt().hashCode());
        hashCode = prime * hashCode + ((getJobImminentExpirationHealthEventArn() == null) ? 0 : getJobImminentExpirationHealthEventArn().hashCode());
        hashCode = prime * hashCode + ((getJobPausedAt() == null) ? 0 : getJobPausedAt().hashCode());
        return hashCode;
    }

    @Override
    public UserPausedDetails clone() {
        try {
            return (UserPausedDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.macie2.model.transform.UserPausedDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
