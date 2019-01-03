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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Allows you to create a staged rollout of a job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobExecutionsRolloutConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to
     * create a staged rollout.
     * </p>
     */
    private Integer maximumPerMinute;
    /**
     * <p>
     * The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job
     * rollout.
     * </p>
     */
    private ExponentialRolloutRate exponentialRate;

    /**
     * <p>
     * The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to
     * create a staged rollout.
     * </p>
     * 
     * @param maximumPerMinute
     *        The maximum number of things that will be notified of a pending job, per minute. This parameter allows you
     *        to create a staged rollout.
     */

    public void setMaximumPerMinute(Integer maximumPerMinute) {
        this.maximumPerMinute = maximumPerMinute;
    }

    /**
     * <p>
     * The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to
     * create a staged rollout.
     * </p>
     * 
     * @return The maximum number of things that will be notified of a pending job, per minute. This parameter allows
     *         you to create a staged rollout.
     */

    public Integer getMaximumPerMinute() {
        return this.maximumPerMinute;
    }

    /**
     * <p>
     * The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to
     * create a staged rollout.
     * </p>
     * 
     * @param maximumPerMinute
     *        The maximum number of things that will be notified of a pending job, per minute. This parameter allows you
     *        to create a staged rollout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecutionsRolloutConfig withMaximumPerMinute(Integer maximumPerMinute) {
        setMaximumPerMinute(maximumPerMinute);
        return this;
    }

    /**
     * <p>
     * The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job
     * rollout.
     * </p>
     * 
     * @param exponentialRate
     *        The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job
     *        rollout.
     */

    public void setExponentialRate(ExponentialRolloutRate exponentialRate) {
        this.exponentialRate = exponentialRate;
    }

    /**
     * <p>
     * The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job
     * rollout.
     * </p>
     * 
     * @return The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job
     *         rollout.
     */

    public ExponentialRolloutRate getExponentialRate() {
        return this.exponentialRate;
    }

    /**
     * <p>
     * The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job
     * rollout.
     * </p>
     * 
     * @param exponentialRate
     *        The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job
     *        rollout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobExecutionsRolloutConfig withExponentialRate(ExponentialRolloutRate exponentialRate) {
        setExponentialRate(exponentialRate);
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
        if (getMaximumPerMinute() != null)
            sb.append("MaximumPerMinute: ").append(getMaximumPerMinute()).append(",");
        if (getExponentialRate() != null)
            sb.append("ExponentialRate: ").append(getExponentialRate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobExecutionsRolloutConfig == false)
            return false;
        JobExecutionsRolloutConfig other = (JobExecutionsRolloutConfig) obj;
        if (other.getMaximumPerMinute() == null ^ this.getMaximumPerMinute() == null)
            return false;
        if (other.getMaximumPerMinute() != null && other.getMaximumPerMinute().equals(this.getMaximumPerMinute()) == false)
            return false;
        if (other.getExponentialRate() == null ^ this.getExponentialRate() == null)
            return false;
        if (other.getExponentialRate() != null && other.getExponentialRate().equals(this.getExponentialRate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaximumPerMinute() == null) ? 0 : getMaximumPerMinute().hashCode());
        hashCode = prime * hashCode + ((getExponentialRate() == null) ? 0 : getExponentialRate().hashCode());
        return hashCode;
    }

    @Override
    public JobExecutionsRolloutConfig clone() {
        try {
            return (JobExecutionsRolloutConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.JobExecutionsRolloutConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
