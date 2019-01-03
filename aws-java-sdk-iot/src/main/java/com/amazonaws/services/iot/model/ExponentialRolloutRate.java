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
 * Allows you to create an exponential rate of rollout for a job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExponentialRolloutRate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of things that will be notified of a pending job, per minute at the start of job rollout. This
     * parameter allows you to define the initial rate of rollout.
     * </p>
     */
    private Integer baseRatePerMinute;
    /**
     * <p>
     * The exponential factor to increase the rate of rollout for a job.
     * </p>
     */
    private Double incrementFactor;
    /**
     * <p>
     * The criteria to initiate the increase in rate of rollout for a job.
     * </p>
     * <p>
     * AWS IoT supports up to one digit after the decimal (for example, 1.5, but not 1.55).
     * </p>
     */
    private RateIncreaseCriteria rateIncreaseCriteria;

    /**
     * <p>
     * The minimum number of things that will be notified of a pending job, per minute at the start of job rollout. This
     * parameter allows you to define the initial rate of rollout.
     * </p>
     * 
     * @param baseRatePerMinute
     *        The minimum number of things that will be notified of a pending job, per minute at the start of job
     *        rollout. This parameter allows you to define the initial rate of rollout.
     */

    public void setBaseRatePerMinute(Integer baseRatePerMinute) {
        this.baseRatePerMinute = baseRatePerMinute;
    }

    /**
     * <p>
     * The minimum number of things that will be notified of a pending job, per minute at the start of job rollout. This
     * parameter allows you to define the initial rate of rollout.
     * </p>
     * 
     * @return The minimum number of things that will be notified of a pending job, per minute at the start of job
     *         rollout. This parameter allows you to define the initial rate of rollout.
     */

    public Integer getBaseRatePerMinute() {
        return this.baseRatePerMinute;
    }

    /**
     * <p>
     * The minimum number of things that will be notified of a pending job, per minute at the start of job rollout. This
     * parameter allows you to define the initial rate of rollout.
     * </p>
     * 
     * @param baseRatePerMinute
     *        The minimum number of things that will be notified of a pending job, per minute at the start of job
     *        rollout. This parameter allows you to define the initial rate of rollout.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExponentialRolloutRate withBaseRatePerMinute(Integer baseRatePerMinute) {
        setBaseRatePerMinute(baseRatePerMinute);
        return this;
    }

    /**
     * <p>
     * The exponential factor to increase the rate of rollout for a job.
     * </p>
     * 
     * @param incrementFactor
     *        The exponential factor to increase the rate of rollout for a job.
     */

    public void setIncrementFactor(Double incrementFactor) {
        this.incrementFactor = incrementFactor;
    }

    /**
     * <p>
     * The exponential factor to increase the rate of rollout for a job.
     * </p>
     * 
     * @return The exponential factor to increase the rate of rollout for a job.
     */

    public Double getIncrementFactor() {
        return this.incrementFactor;
    }

    /**
     * <p>
     * The exponential factor to increase the rate of rollout for a job.
     * </p>
     * 
     * @param incrementFactor
     *        The exponential factor to increase the rate of rollout for a job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExponentialRolloutRate withIncrementFactor(Double incrementFactor) {
        setIncrementFactor(incrementFactor);
        return this;
    }

    /**
     * <p>
     * The criteria to initiate the increase in rate of rollout for a job.
     * </p>
     * <p>
     * AWS IoT supports up to one digit after the decimal (for example, 1.5, but not 1.55).
     * </p>
     * 
     * @param rateIncreaseCriteria
     *        The criteria to initiate the increase in rate of rollout for a job.</p>
     *        <p>
     *        AWS IoT supports up to one digit after the decimal (for example, 1.5, but not 1.55).
     */

    public void setRateIncreaseCriteria(RateIncreaseCriteria rateIncreaseCriteria) {
        this.rateIncreaseCriteria = rateIncreaseCriteria;
    }

    /**
     * <p>
     * The criteria to initiate the increase in rate of rollout for a job.
     * </p>
     * <p>
     * AWS IoT supports up to one digit after the decimal (for example, 1.5, but not 1.55).
     * </p>
     * 
     * @return The criteria to initiate the increase in rate of rollout for a job.</p>
     *         <p>
     *         AWS IoT supports up to one digit after the decimal (for example, 1.5, but not 1.55).
     */

    public RateIncreaseCriteria getRateIncreaseCriteria() {
        return this.rateIncreaseCriteria;
    }

    /**
     * <p>
     * The criteria to initiate the increase in rate of rollout for a job.
     * </p>
     * <p>
     * AWS IoT supports up to one digit after the decimal (for example, 1.5, but not 1.55).
     * </p>
     * 
     * @param rateIncreaseCriteria
     *        The criteria to initiate the increase in rate of rollout for a job.</p>
     *        <p>
     *        AWS IoT supports up to one digit after the decimal (for example, 1.5, but not 1.55).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExponentialRolloutRate withRateIncreaseCriteria(RateIncreaseCriteria rateIncreaseCriteria) {
        setRateIncreaseCriteria(rateIncreaseCriteria);
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
        if (getBaseRatePerMinute() != null)
            sb.append("BaseRatePerMinute: ").append(getBaseRatePerMinute()).append(",");
        if (getIncrementFactor() != null)
            sb.append("IncrementFactor: ").append(getIncrementFactor()).append(",");
        if (getRateIncreaseCriteria() != null)
            sb.append("RateIncreaseCriteria: ").append(getRateIncreaseCriteria());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExponentialRolloutRate == false)
            return false;
        ExponentialRolloutRate other = (ExponentialRolloutRate) obj;
        if (other.getBaseRatePerMinute() == null ^ this.getBaseRatePerMinute() == null)
            return false;
        if (other.getBaseRatePerMinute() != null && other.getBaseRatePerMinute().equals(this.getBaseRatePerMinute()) == false)
            return false;
        if (other.getIncrementFactor() == null ^ this.getIncrementFactor() == null)
            return false;
        if (other.getIncrementFactor() != null && other.getIncrementFactor().equals(this.getIncrementFactor()) == false)
            return false;
        if (other.getRateIncreaseCriteria() == null ^ this.getRateIncreaseCriteria() == null)
            return false;
        if (other.getRateIncreaseCriteria() != null && other.getRateIncreaseCriteria().equals(this.getRateIncreaseCriteria()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBaseRatePerMinute() == null) ? 0 : getBaseRatePerMinute().hashCode());
        hashCode = prime * hashCode + ((getIncrementFactor() == null) ? 0 : getIncrementFactor().hashCode());
        hashCode = prime * hashCode + ((getRateIncreaseCriteria() == null) ? 0 : getRateIncreaseCriteria().hashCode());
        return hashCode;
    }

    @Override
    public ExponentialRolloutRate clone() {
        try {
            return (ExponentialRolloutRate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.ExponentialRolloutRateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
