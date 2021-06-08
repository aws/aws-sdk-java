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
 * Contains information about the rollout configuration for a job. This configuration defines the rate at which the job
 * deploys a configuration to a fleet of target devices.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/IoTJobExecutionsRolloutConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IoTJobExecutionsRolloutConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The exponential rate to increase the job rollout rate.
     * </p>
     */
    private IoTJobExponentialRolloutRate exponentialRate;
    /**
     * <p>
     * The maximum number of devices that receive a pending job notification, per minute.
     * </p>
     */
    private Integer maximumPerMinute;

    /**
     * <p>
     * The exponential rate to increase the job rollout rate.
     * </p>
     * 
     * @param exponentialRate
     *        The exponential rate to increase the job rollout rate.
     */

    public void setExponentialRate(IoTJobExponentialRolloutRate exponentialRate) {
        this.exponentialRate = exponentialRate;
    }

    /**
     * <p>
     * The exponential rate to increase the job rollout rate.
     * </p>
     * 
     * @return The exponential rate to increase the job rollout rate.
     */

    public IoTJobExponentialRolloutRate getExponentialRate() {
        return this.exponentialRate;
    }

    /**
     * <p>
     * The exponential rate to increase the job rollout rate.
     * </p>
     * 
     * @param exponentialRate
     *        The exponential rate to increase the job rollout rate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IoTJobExecutionsRolloutConfig withExponentialRate(IoTJobExponentialRolloutRate exponentialRate) {
        setExponentialRate(exponentialRate);
        return this;
    }

    /**
     * <p>
     * The maximum number of devices that receive a pending job notification, per minute.
     * </p>
     * 
     * @param maximumPerMinute
     *        The maximum number of devices that receive a pending job notification, per minute.
     */

    public void setMaximumPerMinute(Integer maximumPerMinute) {
        this.maximumPerMinute = maximumPerMinute;
    }

    /**
     * <p>
     * The maximum number of devices that receive a pending job notification, per minute.
     * </p>
     * 
     * @return The maximum number of devices that receive a pending job notification, per minute.
     */

    public Integer getMaximumPerMinute() {
        return this.maximumPerMinute;
    }

    /**
     * <p>
     * The maximum number of devices that receive a pending job notification, per minute.
     * </p>
     * 
     * @param maximumPerMinute
     *        The maximum number of devices that receive a pending job notification, per minute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IoTJobExecutionsRolloutConfig withMaximumPerMinute(Integer maximumPerMinute) {
        setMaximumPerMinute(maximumPerMinute);
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
        if (getExponentialRate() != null)
            sb.append("ExponentialRate: ").append(getExponentialRate()).append(",");
        if (getMaximumPerMinute() != null)
            sb.append("MaximumPerMinute: ").append(getMaximumPerMinute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IoTJobExecutionsRolloutConfig == false)
            return false;
        IoTJobExecutionsRolloutConfig other = (IoTJobExecutionsRolloutConfig) obj;
        if (other.getExponentialRate() == null ^ this.getExponentialRate() == null)
            return false;
        if (other.getExponentialRate() != null && other.getExponentialRate().equals(this.getExponentialRate()) == false)
            return false;
        if (other.getMaximumPerMinute() == null ^ this.getMaximumPerMinute() == null)
            return false;
        if (other.getMaximumPerMinute() != null && other.getMaximumPerMinute().equals(this.getMaximumPerMinute()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExponentialRate() == null) ? 0 : getExponentialRate().hashCode());
        hashCode = prime * hashCode + ((getMaximumPerMinute() == null) ? 0 : getMaximumPerMinute().hashCode());
        return hashCode;
    }

    @Override
    public IoTJobExecutionsRolloutConfig clone() {
        try {
            return (IoTJobExecutionsRolloutConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.greengrassv2.model.transform.IoTJobExecutionsRolloutConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
