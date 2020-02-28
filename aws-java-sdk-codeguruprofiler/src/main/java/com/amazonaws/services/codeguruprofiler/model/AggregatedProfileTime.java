/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.codeguruprofiler.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the time range of the latest available aggregated profile.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeguruprofiler-2019-07-18/AggregatedProfileTime"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AggregatedProfileTime implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time period.
     * </p>
     */
    private String period;
    /**
     * <p>
     * The start time.
     * </p>
     */
    private java.util.Date start;

    /**
     * <p>
     * The time period.
     * </p>
     * 
     * @param period
     *        The time period.
     * @see AggregationPeriod
     */

    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * The time period.
     * </p>
     * 
     * @return The time period.
     * @see AggregationPeriod
     */

    public String getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The time period.
     * </p>
     * 
     * @param period
     *        The time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationPeriod
     */

    public AggregatedProfileTime withPeriod(String period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The time period.
     * </p>
     * 
     * @param period
     *        The time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AggregationPeriod
     */

    public AggregatedProfileTime withPeriod(AggregationPeriod period) {
        this.period = period.toString();
        return this;
    }

    /**
     * <p>
     * The start time.
     * </p>
     * 
     * @param start
     *        The start time.
     */

    public void setStart(java.util.Date start) {
        this.start = start;
    }

    /**
     * <p>
     * The start time.
     * </p>
     * 
     * @return The start time.
     */

    public java.util.Date getStart() {
        return this.start;
    }

    /**
     * <p>
     * The start time.
     * </p>
     * 
     * @param start
     *        The start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AggregatedProfileTime withStart(java.util.Date start) {
        setStart(start);
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
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AggregatedProfileTime == false)
            return false;
        AggregatedProfileTime other = (AggregatedProfileTime) obj;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        return hashCode;
    }

    @Override
    public AggregatedProfileTime clone() {
        try {
            return (AggregatedProfileTime) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeguruprofiler.model.transform.AggregatedProfileTimeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
