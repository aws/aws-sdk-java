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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a tumbling window, which is a repeating fixed-sized, non-overlapping, and contiguous time interval. This
 * window is used in metric and aggregation computations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/TumblingWindow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TumblingWindow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time interval for the tumbling window. Note that <code>w</code> represents weeks, <code>d</code> represents
     * days, <code>h</code> represents hours, and <code>m</code> represents minutes. AWS IoT SiteWise computes the
     * <code>1w</code> interval the end of Sunday at midnight each week (UTC), the <code>1d</code> interval at the end
     * of each day at midnight (UTC), the <code>1h</code> interval at the end of each hour, and so on.
     * </p>
     * <p>
     * When AWS IoT SiteWise aggregates data points for metric computations, the start of each interval is exclusive and
     * the end of each interval is inclusive. AWS IoT SiteWise places the computed data point at the end of the
     * interval.
     * </p>
     */
    private String interval;

    /**
     * <p>
     * The time interval for the tumbling window. Note that <code>w</code> represents weeks, <code>d</code> represents
     * days, <code>h</code> represents hours, and <code>m</code> represents minutes. AWS IoT SiteWise computes the
     * <code>1w</code> interval the end of Sunday at midnight each week (UTC), the <code>1d</code> interval at the end
     * of each day at midnight (UTC), the <code>1h</code> interval at the end of each hour, and so on.
     * </p>
     * <p>
     * When AWS IoT SiteWise aggregates data points for metric computations, the start of each interval is exclusive and
     * the end of each interval is inclusive. AWS IoT SiteWise places the computed data point at the end of the
     * interval.
     * </p>
     * 
     * @param interval
     *        The time interval for the tumbling window. Note that <code>w</code> represents weeks, <code>d</code>
     *        represents days, <code>h</code> represents hours, and <code>m</code> represents minutes. AWS IoT SiteWise
     *        computes the <code>1w</code> interval the end of Sunday at midnight each week (UTC), the <code>1d</code>
     *        interval at the end of each day at midnight (UTC), the <code>1h</code> interval at the end of each hour,
     *        and so on. </p>
     *        <p>
     *        When AWS IoT SiteWise aggregates data points for metric computations, the start of each interval is
     *        exclusive and the end of each interval is inclusive. AWS IoT SiteWise places the computed data point at
     *        the end of the interval.
     */

    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The time interval for the tumbling window. Note that <code>w</code> represents weeks, <code>d</code> represents
     * days, <code>h</code> represents hours, and <code>m</code> represents minutes. AWS IoT SiteWise computes the
     * <code>1w</code> interval the end of Sunday at midnight each week (UTC), the <code>1d</code> interval at the end
     * of each day at midnight (UTC), the <code>1h</code> interval at the end of each hour, and so on.
     * </p>
     * <p>
     * When AWS IoT SiteWise aggregates data points for metric computations, the start of each interval is exclusive and
     * the end of each interval is inclusive. AWS IoT SiteWise places the computed data point at the end of the
     * interval.
     * </p>
     * 
     * @return The time interval for the tumbling window. Note that <code>w</code> represents weeks, <code>d</code>
     *         represents days, <code>h</code> represents hours, and <code>m</code> represents minutes. AWS IoT SiteWise
     *         computes the <code>1w</code> interval the end of Sunday at midnight each week (UTC), the <code>1d</code>
     *         interval at the end of each day at midnight (UTC), the <code>1h</code> interval at the end of each hour,
     *         and so on. </p>
     *         <p>
     *         When AWS IoT SiteWise aggregates data points for metric computations, the start of each interval is
     *         exclusive and the end of each interval is inclusive. AWS IoT SiteWise places the computed data point at
     *         the end of the interval.
     */

    public String getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The time interval for the tumbling window. Note that <code>w</code> represents weeks, <code>d</code> represents
     * days, <code>h</code> represents hours, and <code>m</code> represents minutes. AWS IoT SiteWise computes the
     * <code>1w</code> interval the end of Sunday at midnight each week (UTC), the <code>1d</code> interval at the end
     * of each day at midnight (UTC), the <code>1h</code> interval at the end of each hour, and so on.
     * </p>
     * <p>
     * When AWS IoT SiteWise aggregates data points for metric computations, the start of each interval is exclusive and
     * the end of each interval is inclusive. AWS IoT SiteWise places the computed data point at the end of the
     * interval.
     * </p>
     * 
     * @param interval
     *        The time interval for the tumbling window. Note that <code>w</code> represents weeks, <code>d</code>
     *        represents days, <code>h</code> represents hours, and <code>m</code> represents minutes. AWS IoT SiteWise
     *        computes the <code>1w</code> interval the end of Sunday at midnight each week (UTC), the <code>1d</code>
     *        interval at the end of each day at midnight (UTC), the <code>1h</code> interval at the end of each hour,
     *        and so on. </p>
     *        <p>
     *        When AWS IoT SiteWise aggregates data points for metric computations, the start of each interval is
     *        exclusive and the end of each interval is inclusive. AWS IoT SiteWise places the computed data point at
     *        the end of the interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TumblingWindow withInterval(String interval) {
        setInterval(interval);
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
        if (getInterval() != null)
            sb.append("Interval: ").append(getInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TumblingWindow == false)
            return false;
        TumblingWindow other = (TumblingWindow) obj;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        return hashCode;
    }

    @Override
    public TumblingWindow clone() {
        try {
            return (TumblingWindow) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iotsitewise.model.transform.TumblingWindowMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
