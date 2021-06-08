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
 * Contains information about an exponential rollout rate for a configuration deployment job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/IoTJobExponentialRolloutRate"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IoTJobExponentialRolloutRate implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The minimum number of devices that receive a pending job notification, per minute, when the job starts. This
     * parameter defines the initial rollout rate of the job.
     * </p>
     */
    private Integer baseRatePerMinute;
    /**
     * <p>
     * The exponential factor to increase the rollout rate for the job.
     * </p>
     * <p>
     * This parameter supports up to one digit after the decimal (for example, you can specify <code>1.5</code>, but not
     * <code>1.55</code>).
     * </p>
     */
    private Double incrementFactor;
    /**
     * <p>
     * The criteria to increase the rollout rate for the job.
     * </p>
     */
    private IoTJobRateIncreaseCriteria rateIncreaseCriteria;

    /**
     * <p>
     * The minimum number of devices that receive a pending job notification, per minute, when the job starts. This
     * parameter defines the initial rollout rate of the job.
     * </p>
     * 
     * @param baseRatePerMinute
     *        The minimum number of devices that receive a pending job notification, per minute, when the job starts.
     *        This parameter defines the initial rollout rate of the job.
     */

    public void setBaseRatePerMinute(Integer baseRatePerMinute) {
        this.baseRatePerMinute = baseRatePerMinute;
    }

    /**
     * <p>
     * The minimum number of devices that receive a pending job notification, per minute, when the job starts. This
     * parameter defines the initial rollout rate of the job.
     * </p>
     * 
     * @return The minimum number of devices that receive a pending job notification, per minute, when the job starts.
     *         This parameter defines the initial rollout rate of the job.
     */

    public Integer getBaseRatePerMinute() {
        return this.baseRatePerMinute;
    }

    /**
     * <p>
     * The minimum number of devices that receive a pending job notification, per minute, when the job starts. This
     * parameter defines the initial rollout rate of the job.
     * </p>
     * 
     * @param baseRatePerMinute
     *        The minimum number of devices that receive a pending job notification, per minute, when the job starts.
     *        This parameter defines the initial rollout rate of the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IoTJobExponentialRolloutRate withBaseRatePerMinute(Integer baseRatePerMinute) {
        setBaseRatePerMinute(baseRatePerMinute);
        return this;
    }

    /**
     * <p>
     * The exponential factor to increase the rollout rate for the job.
     * </p>
     * <p>
     * This parameter supports up to one digit after the decimal (for example, you can specify <code>1.5</code>, but not
     * <code>1.55</code>).
     * </p>
     * 
     * @param incrementFactor
     *        The exponential factor to increase the rollout rate for the job.</p>
     *        <p>
     *        This parameter supports up to one digit after the decimal (for example, you can specify <code>1.5</code>,
     *        but not <code>1.55</code>).
     */

    public void setIncrementFactor(Double incrementFactor) {
        this.incrementFactor = incrementFactor;
    }

    /**
     * <p>
     * The exponential factor to increase the rollout rate for the job.
     * </p>
     * <p>
     * This parameter supports up to one digit after the decimal (for example, you can specify <code>1.5</code>, but not
     * <code>1.55</code>).
     * </p>
     * 
     * @return The exponential factor to increase the rollout rate for the job.</p>
     *         <p>
     *         This parameter supports up to one digit after the decimal (for example, you can specify <code>1.5</code>,
     *         but not <code>1.55</code>).
     */

    public Double getIncrementFactor() {
        return this.incrementFactor;
    }

    /**
     * <p>
     * The exponential factor to increase the rollout rate for the job.
     * </p>
     * <p>
     * This parameter supports up to one digit after the decimal (for example, you can specify <code>1.5</code>, but not
     * <code>1.55</code>).
     * </p>
     * 
     * @param incrementFactor
     *        The exponential factor to increase the rollout rate for the job.</p>
     *        <p>
     *        This parameter supports up to one digit after the decimal (for example, you can specify <code>1.5</code>,
     *        but not <code>1.55</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IoTJobExponentialRolloutRate withIncrementFactor(Double incrementFactor) {
        setIncrementFactor(incrementFactor);
        return this;
    }

    /**
     * <p>
     * The criteria to increase the rollout rate for the job.
     * </p>
     * 
     * @param rateIncreaseCriteria
     *        The criteria to increase the rollout rate for the job.
     */

    public void setRateIncreaseCriteria(IoTJobRateIncreaseCriteria rateIncreaseCriteria) {
        this.rateIncreaseCriteria = rateIncreaseCriteria;
    }

    /**
     * <p>
     * The criteria to increase the rollout rate for the job.
     * </p>
     * 
     * @return The criteria to increase the rollout rate for the job.
     */

    public IoTJobRateIncreaseCriteria getRateIncreaseCriteria() {
        return this.rateIncreaseCriteria;
    }

    /**
     * <p>
     * The criteria to increase the rollout rate for the job.
     * </p>
     * 
     * @param rateIncreaseCriteria
     *        The criteria to increase the rollout rate for the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IoTJobExponentialRolloutRate withRateIncreaseCriteria(IoTJobRateIncreaseCriteria rateIncreaseCriteria) {
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

        if (obj instanceof IoTJobExponentialRolloutRate == false)
            return false;
        IoTJobExponentialRolloutRate other = (IoTJobExponentialRolloutRate) obj;
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
    public IoTJobExponentialRolloutRate clone() {
        try {
            return (IoTJobExponentialRolloutRate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.IoTJobExponentialRolloutRateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
