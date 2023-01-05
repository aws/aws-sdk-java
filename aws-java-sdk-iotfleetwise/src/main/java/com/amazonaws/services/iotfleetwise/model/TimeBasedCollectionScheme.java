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
 * Information about a collection scheme that uses a time period to decide how often to collect data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotfleetwise-2021-06-17/TimeBasedCollectionScheme"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeBasedCollectionScheme implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time period (in milliseconds) to decide how often to collect data. For example, if the time period is
     * <code>60000</code>, the Edge Agent software collects data once every minute.
     * </p>
     */
    private Long periodMs;

    /**
     * <p>
     * The time period (in milliseconds) to decide how often to collect data. For example, if the time period is
     * <code>60000</code>, the Edge Agent software collects data once every minute.
     * </p>
     * 
     * @param periodMs
     *        The time period (in milliseconds) to decide how often to collect data. For example, if the time period is
     *        <code>60000</code>, the Edge Agent software collects data once every minute.
     */

    public void setPeriodMs(Long periodMs) {
        this.periodMs = periodMs;
    }

    /**
     * <p>
     * The time period (in milliseconds) to decide how often to collect data. For example, if the time period is
     * <code>60000</code>, the Edge Agent software collects data once every minute.
     * </p>
     * 
     * @return The time period (in milliseconds) to decide how often to collect data. For example, if the time period is
     *         <code>60000</code>, the Edge Agent software collects data once every minute.
     */

    public Long getPeriodMs() {
        return this.periodMs;
    }

    /**
     * <p>
     * The time period (in milliseconds) to decide how often to collect data. For example, if the time period is
     * <code>60000</code>, the Edge Agent software collects data once every minute.
     * </p>
     * 
     * @param periodMs
     *        The time period (in milliseconds) to decide how often to collect data. For example, if the time period is
     *        <code>60000</code>, the Edge Agent software collects data once every minute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeBasedCollectionScheme withPeriodMs(Long periodMs) {
        setPeriodMs(periodMs);
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
        if (getPeriodMs() != null)
            sb.append("PeriodMs: ").append(getPeriodMs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeBasedCollectionScheme == false)
            return false;
        TimeBasedCollectionScheme other = (TimeBasedCollectionScheme) obj;
        if (other.getPeriodMs() == null ^ this.getPeriodMs() == null)
            return false;
        if (other.getPeriodMs() != null && other.getPeriodMs().equals(this.getPeriodMs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPeriodMs() == null) ? 0 : getPeriodMs().hashCode());
        return hashCode;
    }

    @Override
    public TimeBasedCollectionScheme clone() {
        try {
            return (TimeBasedCollectionScheme) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotfleetwise.model.transform.TimeBasedCollectionSchemeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
