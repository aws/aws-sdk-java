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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the timeout configuration for a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/IoTJobTimeoutConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IoTJobTimeoutConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The amount of time, in minutes, that devices have to complete the job. The timer starts when the job status is
     * set to <code>IN_PROGRESS</code>. If the job status doesn't change to a terminal state before the time expires,
     * then the job status is set to <code>TIMED_OUT</code>.
     * </p>
     * <p>
     * The timeout interval must be between 1 minute and 7 days (10080 minutes).
     * </p>
     */
    private Long inProgressTimeoutInMinutes;

    /**
     * <p>
     * The amount of time, in minutes, that devices have to complete the job. The timer starts when the job status is
     * set to <code>IN_PROGRESS</code>. If the job status doesn't change to a terminal state before the time expires,
     * then the job status is set to <code>TIMED_OUT</code>.
     * </p>
     * <p>
     * The timeout interval must be between 1 minute and 7 days (10080 minutes).
     * </p>
     * 
     * @param inProgressTimeoutInMinutes
     *        The amount of time, in minutes, that devices have to complete the job. The timer starts when the job
     *        status is set to <code>IN_PROGRESS</code>. If the job status doesn't change to a terminal state before the
     *        time expires, then the job status is set to <code>TIMED_OUT</code>.</p>
     *        <p>
     *        The timeout interval must be between 1 minute and 7 days (10080 minutes).
     */

    public void setInProgressTimeoutInMinutes(Long inProgressTimeoutInMinutes) {
        this.inProgressTimeoutInMinutes = inProgressTimeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time, in minutes, that devices have to complete the job. The timer starts when the job status is
     * set to <code>IN_PROGRESS</code>. If the job status doesn't change to a terminal state before the time expires,
     * then the job status is set to <code>TIMED_OUT</code>.
     * </p>
     * <p>
     * The timeout interval must be between 1 minute and 7 days (10080 minutes).
     * </p>
     * 
     * @return The amount of time, in minutes, that devices have to complete the job. The timer starts when the job
     *         status is set to <code>IN_PROGRESS</code>. If the job status doesn't change to a terminal state before
     *         the time expires, then the job status is set to <code>TIMED_OUT</code>.</p>
     *         <p>
     *         The timeout interval must be between 1 minute and 7 days (10080 minutes).
     */

    public Long getInProgressTimeoutInMinutes() {
        return this.inProgressTimeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time, in minutes, that devices have to complete the job. The timer starts when the job status is
     * set to <code>IN_PROGRESS</code>. If the job status doesn't change to a terminal state before the time expires,
     * then the job status is set to <code>TIMED_OUT</code>.
     * </p>
     * <p>
     * The timeout interval must be between 1 minute and 7 days (10080 minutes).
     * </p>
     * 
     * @param inProgressTimeoutInMinutes
     *        The amount of time, in minutes, that devices have to complete the job. The timer starts when the job
     *        status is set to <code>IN_PROGRESS</code>. If the job status doesn't change to a terminal state before the
     *        time expires, then the job status is set to <code>TIMED_OUT</code>.</p>
     *        <p>
     *        The timeout interval must be between 1 minute and 7 days (10080 minutes).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IoTJobTimeoutConfig withInProgressTimeoutInMinutes(Long inProgressTimeoutInMinutes) {
        setInProgressTimeoutInMinutes(inProgressTimeoutInMinutes);
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
        if (getInProgressTimeoutInMinutes() != null)
            sb.append("InProgressTimeoutInMinutes: ").append(getInProgressTimeoutInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IoTJobTimeoutConfig == false)
            return false;
        IoTJobTimeoutConfig other = (IoTJobTimeoutConfig) obj;
        if (other.getInProgressTimeoutInMinutes() == null ^ this.getInProgressTimeoutInMinutes() == null)
            return false;
        if (other.getInProgressTimeoutInMinutes() != null && other.getInProgressTimeoutInMinutes().equals(this.getInProgressTimeoutInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInProgressTimeoutInMinutes() == null) ? 0 : getInProgressTimeoutInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public IoTJobTimeoutConfig clone() {
        try {
            return (IoTJobTimeoutConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.IoTJobTimeoutConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
