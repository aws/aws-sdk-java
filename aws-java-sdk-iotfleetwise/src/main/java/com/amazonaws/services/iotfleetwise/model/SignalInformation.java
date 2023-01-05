/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iotfleetwise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a signal.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/SignalInformation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignalInformation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the signal.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The maximum number of samples to collect.
     * </p>
     */
    private Long maxSampleCount;
    /**
     * <p>
     * The minimum duration of time (in milliseconds) between two triggering events to collect data.
     * </p>
     * <note>
     * <p>
     * If a signal changes often, you might want to collect data at a slower rate.
     * </p>
     * </note>
     */
    private Long minimumSamplingIntervalMs;

    /**
     * <p>
     * The name of the signal.
     * </p>
     * 
     * @param name
     *        The name of the signal.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the signal.
     * </p>
     * 
     * @return The name of the signal.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the signal.
     * </p>
     * 
     * @param name
     *        The name of the signal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalInformation withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The maximum number of samples to collect.
     * </p>
     * 
     * @param maxSampleCount
     *        The maximum number of samples to collect.
     */

    public void setMaxSampleCount(Long maxSampleCount) {
        this.maxSampleCount = maxSampleCount;
    }

    /**
     * <p>
     * The maximum number of samples to collect.
     * </p>
     * 
     * @return The maximum number of samples to collect.
     */

    public Long getMaxSampleCount() {
        return this.maxSampleCount;
    }

    /**
     * <p>
     * The maximum number of samples to collect.
     * </p>
     * 
     * @param maxSampleCount
     *        The maximum number of samples to collect.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalInformation withMaxSampleCount(Long maxSampleCount) {
        setMaxSampleCount(maxSampleCount);
        return this;
    }

    /**
     * <p>
     * The minimum duration of time (in milliseconds) between two triggering events to collect data.
     * </p>
     * <note>
     * <p>
     * If a signal changes often, you might want to collect data at a slower rate.
     * </p>
     * </note>
     * 
     * @param minimumSamplingIntervalMs
     *        The minimum duration of time (in milliseconds) between two triggering events to collect data.</p> <note>
     *        <p>
     *        If a signal changes often, you might want to collect data at a slower rate.
     *        </p>
     */

    public void setMinimumSamplingIntervalMs(Long minimumSamplingIntervalMs) {
        this.minimumSamplingIntervalMs = minimumSamplingIntervalMs;
    }

    /**
     * <p>
     * The minimum duration of time (in milliseconds) between two triggering events to collect data.
     * </p>
     * <note>
     * <p>
     * If a signal changes often, you might want to collect data at a slower rate.
     * </p>
     * </note>
     * 
     * @return The minimum duration of time (in milliseconds) between two triggering events to collect data.</p> <note>
     *         <p>
     *         If a signal changes often, you might want to collect data at a slower rate.
     *         </p>
     */

    public Long getMinimumSamplingIntervalMs() {
        return this.minimumSamplingIntervalMs;
    }

    /**
     * <p>
     * The minimum duration of time (in milliseconds) between two triggering events to collect data.
     * </p>
     * <note>
     * <p>
     * If a signal changes often, you might want to collect data at a slower rate.
     * </p>
     * </note>
     * 
     * @param minimumSamplingIntervalMs
     *        The minimum duration of time (in milliseconds) between two triggering events to collect data.</p> <note>
     *        <p>
     *        If a signal changes often, you might want to collect data at a slower rate.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignalInformation withMinimumSamplingIntervalMs(Long minimumSamplingIntervalMs) {
        setMinimumSamplingIntervalMs(minimumSamplingIntervalMs);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMaxSampleCount() != null)
            sb.append("MaxSampleCount: ").append(getMaxSampleCount()).append(",");
        if (getMinimumSamplingIntervalMs() != null)
            sb.append("MinimumSamplingIntervalMs: ").append(getMinimumSamplingIntervalMs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignalInformation == false)
            return false;
        SignalInformation other = (SignalInformation) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMaxSampleCount() == null ^ this.getMaxSampleCount() == null)
            return false;
        if (other.getMaxSampleCount() != null && other.getMaxSampleCount().equals(this.getMaxSampleCount()) == false)
            return false;
        if (other.getMinimumSamplingIntervalMs() == null ^ this.getMinimumSamplingIntervalMs() == null)
            return false;
        if (other.getMinimumSamplingIntervalMs() != null && other.getMinimumSamplingIntervalMs().equals(this.getMinimumSamplingIntervalMs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMaxSampleCount() == null) ? 0 : getMaxSampleCount().hashCode());
        hashCode = prime * hashCode + ((getMinimumSamplingIntervalMs() == null) ? 0 : getMinimumSamplingIntervalMs().hashCode());
        return hashCode;
    }

    @Override
    public SignalInformation clone() {
        try {
            return (SignalInformation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.SignalInformationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
