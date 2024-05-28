/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the interval period to use for returning results.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/IntervalDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IntervalDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timezone applied to requested metrics.
     * </p>
     */
    private String timeZone;
    /**
     * <p>
     * <code>IntervalPeriod</code>: An aggregated grouping applied to request metrics. Valid <code>IntervalPeriod</code>
     * values are: <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> | <code>HOUR</code> | <code>DAY</code> |
     * <code>WEEK</code> | <code>TOTAL</code>.
     * </p>
     * <p>
     * For example, if <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code> and
     * <code>EndTime</code> differs by 1 day, then Amazon Connect returns 48 results in the response. Each result is
     * aggregated by the THIRTY_MIN period. By default Amazon Connect aggregates results based on the <code>TOTAL</code>
     * interval period.
     * </p>
     * <p>
     * The following list describes restrictions on <code>StartTime</code> and <code>EndTime</code> based on what
     * <code>IntervalPeriod</code> is requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIFTEEN_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     * than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRTY_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than
     * 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOUR</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 3
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAY</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEK</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * </ul>
     */
    private String intervalPeriod;

    /**
     * <p>
     * The timezone applied to requested metrics.
     * </p>
     * 
     * @param timeZone
     *        The timezone applied to requested metrics.
     */

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    /**
     * <p>
     * The timezone applied to requested metrics.
     * </p>
     * 
     * @return The timezone applied to requested metrics.
     */

    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * <p>
     * The timezone applied to requested metrics.
     * </p>
     * 
     * @param timeZone
     *        The timezone applied to requested metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IntervalDetails withTimeZone(String timeZone) {
        setTimeZone(timeZone);
        return this;
    }

    /**
     * <p>
     * <code>IntervalPeriod</code>: An aggregated grouping applied to request metrics. Valid <code>IntervalPeriod</code>
     * values are: <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> | <code>HOUR</code> | <code>DAY</code> |
     * <code>WEEK</code> | <code>TOTAL</code>.
     * </p>
     * <p>
     * For example, if <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code> and
     * <code>EndTime</code> differs by 1 day, then Amazon Connect returns 48 results in the response. Each result is
     * aggregated by the THIRTY_MIN period. By default Amazon Connect aggregates results based on the <code>TOTAL</code>
     * interval period.
     * </p>
     * <p>
     * The following list describes restrictions on <code>StartTime</code> and <code>EndTime</code> based on what
     * <code>IntervalPeriod</code> is requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIFTEEN_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     * than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRTY_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than
     * 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOUR</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 3
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAY</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEK</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * </ul>
     * 
     * @param intervalPeriod
     *        <code>IntervalPeriod</code>: An aggregated grouping applied to request metrics. Valid
     *        <code>IntervalPeriod</code> values are: <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> |
     *        <code>HOUR</code> | <code>DAY</code> | <code>WEEK</code> | <code>TOTAL</code>. </p>
     *        <p>
     *        For example, if <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code>
     *        and <code>EndTime</code> differs by 1 day, then Amazon Connect returns 48 results in the response. Each
     *        result is aggregated by the THIRTY_MIN period. By default Amazon Connect aggregates results based on the
     *        <code>TOTAL</code> interval period.
     *        </p>
     *        <p>
     *        The following list describes restrictions on <code>StartTime</code> and <code>EndTime</code> based on what
     *        <code>IntervalPeriod</code> is requested.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FIFTEEN_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be
     *        less than 3 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THIRTY_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be
     *        less than 3 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOUR</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     *        than 3 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DAY</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than
     *        35 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WEEK</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     *        than 35 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOTAL</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     *        than 35 days.
     *        </p>
     *        </li>
     * @see IntervalPeriod
     */

    public void setIntervalPeriod(String intervalPeriod) {
        this.intervalPeriod = intervalPeriod;
    }

    /**
     * <p>
     * <code>IntervalPeriod</code>: An aggregated grouping applied to request metrics. Valid <code>IntervalPeriod</code>
     * values are: <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> | <code>HOUR</code> | <code>DAY</code> |
     * <code>WEEK</code> | <code>TOTAL</code>.
     * </p>
     * <p>
     * For example, if <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code> and
     * <code>EndTime</code> differs by 1 day, then Amazon Connect returns 48 results in the response. Each result is
     * aggregated by the THIRTY_MIN period. By default Amazon Connect aggregates results based on the <code>TOTAL</code>
     * interval period.
     * </p>
     * <p>
     * The following list describes restrictions on <code>StartTime</code> and <code>EndTime</code> based on what
     * <code>IntervalPeriod</code> is requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIFTEEN_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     * than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRTY_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than
     * 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOUR</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 3
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAY</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEK</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * </ul>
     * 
     * @return <code>IntervalPeriod</code>: An aggregated grouping applied to request metrics. Valid
     *         <code>IntervalPeriod</code> values are: <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> |
     *         <code>HOUR</code> | <code>DAY</code> | <code>WEEK</code> | <code>TOTAL</code>. </p>
     *         <p>
     *         For example, if <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code>
     *         and <code>EndTime</code> differs by 1 day, then Amazon Connect returns 48 results in the response. Each
     *         result is aggregated by the THIRTY_MIN period. By default Amazon Connect aggregates results based on the
     *         <code>TOTAL</code> interval period.
     *         </p>
     *         <p>
     *         The following list describes restrictions on <code>StartTime</code> and <code>EndTime</code> based on
     *         what <code>IntervalPeriod</code> is requested.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FIFTEEN_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be
     *         less than 3 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>THIRTY_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be
     *         less than 3 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HOUR</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     *         than 3 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DAY</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     *         than 35 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WEEK</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     *         than 35 days.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TOTAL</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     *         than 35 days.
     *         </p>
     *         </li>
     * @see IntervalPeriod
     */

    public String getIntervalPeriod() {
        return this.intervalPeriod;
    }

    /**
     * <p>
     * <code>IntervalPeriod</code>: An aggregated grouping applied to request metrics. Valid <code>IntervalPeriod</code>
     * values are: <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> | <code>HOUR</code> | <code>DAY</code> |
     * <code>WEEK</code> | <code>TOTAL</code>.
     * </p>
     * <p>
     * For example, if <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code> and
     * <code>EndTime</code> differs by 1 day, then Amazon Connect returns 48 results in the response. Each result is
     * aggregated by the THIRTY_MIN period. By default Amazon Connect aggregates results based on the <code>TOTAL</code>
     * interval period.
     * </p>
     * <p>
     * The following list describes restrictions on <code>StartTime</code> and <code>EndTime</code> based on what
     * <code>IntervalPeriod</code> is requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIFTEEN_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     * than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRTY_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than
     * 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOUR</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 3
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAY</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEK</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * </ul>
     * 
     * @param intervalPeriod
     *        <code>IntervalPeriod</code>: An aggregated grouping applied to request metrics. Valid
     *        <code>IntervalPeriod</code> values are: <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> |
     *        <code>HOUR</code> | <code>DAY</code> | <code>WEEK</code> | <code>TOTAL</code>. </p>
     *        <p>
     *        For example, if <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code>
     *        and <code>EndTime</code> differs by 1 day, then Amazon Connect returns 48 results in the response. Each
     *        result is aggregated by the THIRTY_MIN period. By default Amazon Connect aggregates results based on the
     *        <code>TOTAL</code> interval period.
     *        </p>
     *        <p>
     *        The following list describes restrictions on <code>StartTime</code> and <code>EndTime</code> based on what
     *        <code>IntervalPeriod</code> is requested.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FIFTEEN_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be
     *        less than 3 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THIRTY_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be
     *        less than 3 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOUR</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     *        than 3 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DAY</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than
     *        35 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WEEK</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     *        than 35 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOTAL</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     *        than 35 days.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntervalPeriod
     */

    public IntervalDetails withIntervalPeriod(String intervalPeriod) {
        setIntervalPeriod(intervalPeriod);
        return this;
    }

    /**
     * <p>
     * <code>IntervalPeriod</code>: An aggregated grouping applied to request metrics. Valid <code>IntervalPeriod</code>
     * values are: <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> | <code>HOUR</code> | <code>DAY</code> |
     * <code>WEEK</code> | <code>TOTAL</code>.
     * </p>
     * <p>
     * For example, if <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code> and
     * <code>EndTime</code> differs by 1 day, then Amazon Connect returns 48 results in the response. Each result is
     * aggregated by the THIRTY_MIN period. By default Amazon Connect aggregates results based on the <code>TOTAL</code>
     * interval period.
     * </p>
     * <p>
     * The following list describes restrictions on <code>StartTime</code> and <code>EndTime</code> based on what
     * <code>IntervalPeriod</code> is requested.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FIFTEEN_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     * than 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>THIRTY_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than
     * 3 days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOUR</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 3
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAY</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEK</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOTAL</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than 35
     * days.
     * </p>
     * </li>
     * </ul>
     * 
     * @param intervalPeriod
     *        <code>IntervalPeriod</code>: An aggregated grouping applied to request metrics. Valid
     *        <code>IntervalPeriod</code> values are: <code>FIFTEEN_MIN</code> | <code>THIRTY_MIN</code> |
     *        <code>HOUR</code> | <code>DAY</code> | <code>WEEK</code> | <code>TOTAL</code>. </p>
     *        <p>
     *        For example, if <code>IntervalPeriod</code> is selected <code>THIRTY_MIN</code>, <code>StartTime</code>
     *        and <code>EndTime</code> differs by 1 day, then Amazon Connect returns 48 results in the response. Each
     *        result is aggregated by the THIRTY_MIN period. By default Amazon Connect aggregates results based on the
     *        <code>TOTAL</code> interval period.
     *        </p>
     *        <p>
     *        The following list describes restrictions on <code>StartTime</code> and <code>EndTime</code> based on what
     *        <code>IntervalPeriod</code> is requested.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FIFTEEN_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be
     *        less than 3 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>THIRTY_MIN</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be
     *        less than 3 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOUR</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     *        than 3 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DAY</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less than
     *        35 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WEEK</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     *        than 35 days.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOTAL</code>: The difference between <code>StartTime</code> and <code>EndTime</code> must be less
     *        than 35 days.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IntervalPeriod
     */

    public IntervalDetails withIntervalPeriod(IntervalPeriod intervalPeriod) {
        this.intervalPeriod = intervalPeriod.toString();
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
        if (getTimeZone() != null)
            sb.append("TimeZone: ").append(getTimeZone()).append(",");
        if (getIntervalPeriod() != null)
            sb.append("IntervalPeriod: ").append(getIntervalPeriod());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IntervalDetails == false)
            return false;
        IntervalDetails other = (IntervalDetails) obj;
        if (other.getTimeZone() == null ^ this.getTimeZone() == null)
            return false;
        if (other.getTimeZone() != null && other.getTimeZone().equals(this.getTimeZone()) == false)
            return false;
        if (other.getIntervalPeriod() == null ^ this.getIntervalPeriod() == null)
            return false;
        if (other.getIntervalPeriod() != null && other.getIntervalPeriod().equals(this.getIntervalPeriod()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeZone() == null) ? 0 : getTimeZone().hashCode());
        hashCode = prime * hashCode + ((getIntervalPeriod() == null) ? 0 : getIntervalPeriod().hashCode());
        return hashCode;
    }

    @Override
    public IntervalDetails clone() {
        try {
            return (IntervalDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.IntervalDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
