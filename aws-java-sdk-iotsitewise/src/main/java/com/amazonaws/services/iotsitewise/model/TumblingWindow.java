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
package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains a tumbling window, which is a repeating fixed-sized, non-overlapping, and contiguous time window. You can
 * use this window in metrics to aggregate data from properties and other assets.
 * </p>
 * <p>
 * You can use <code>m</code>, <code>h</code>, <code>d</code>, and <code>w</code> when you specify an interval or
 * offset. Note that <code>m</code> represents minutes, <code>h</code> represents hours, <code>d</code> represents days,
 * and <code>w</code> represents weeks. You can also use <code>s</code> to represent seconds in <code>offset</code>.
 * </p>
 * <p>
 * The <code>interval</code> and <code>offset</code> parameters support the <a
 * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601 format</a>. For example, <code>PT5S</code> represents 5
 * seconds, <code>PT5M</code> represents 5 minutes, and <code>PT5H</code> represents 5 hours.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotsitewise-2019-12-02/TumblingWindow" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TumblingWindow implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time interval for the tumbling window. The interval time must be between 1 minute and 1 week.
     * </p>
     * <p>
     * IoT SiteWise computes the <code>1w</code> interval the end of Sunday at midnight each week (UTC), the
     * <code>1d</code> interval at the end of each day at midnight (UTC), the <code>1h</code> interval at the end of
     * each hour, and so on.
     * </p>
     * <p>
     * When IoT SiteWise aggregates data points for metric computations, the start of each interval is exclusive and the
     * end of each interval is inclusive. IoT SiteWise places the computed data point at the end of the interval.
     * </p>
     */
    private String interval;
    /**
     * <p>
     * The offset for the tumbling window. The <code>offset</code> parameter accepts the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The offset time.
     * </p>
     * <p>
     * For example, if you specify <code>18h</code> for <code>offset</code> and <code>1d</code> for
     * <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on the day
     * when you create the metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next day.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The ISO 8601 format.
     * </p>
     * <p>
     * For example, if you specify <code>PT18H</code> for <code>offset</code> and <code>1d</code> for
     * <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on the day
     * when you create the metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next day.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The 24-hour clock.
     * </p>
     * <p>
     * For example, if you specify <code>00:03:00</code> for <code>offset</code>, <code>5m</code> for
     * <code>interval</code>, and you create the metric at 2 PM (UTC), you get the first aggregation result at 2:03 PM
     * (UTC). You get the second aggregation result at 2:08 PM (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * The offset time zone.
     * </p>
     * <p>
     * For example, if you specify <code>2021-07-23T18:00-08</code> for <code>offset</code> and <code>1d</code> for
     * <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you create the metric before or at 6 PM (PST), you get the first aggregation result at 6 PM (PST) on the day
     * when you create the metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create the metric after 6 PM (PST), you get the first aggregation result at 6 PM (PST) the next day.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String offset;

    /**
     * <p>
     * The time interval for the tumbling window. The interval time must be between 1 minute and 1 week.
     * </p>
     * <p>
     * IoT SiteWise computes the <code>1w</code> interval the end of Sunday at midnight each week (UTC), the
     * <code>1d</code> interval at the end of each day at midnight (UTC), the <code>1h</code> interval at the end of
     * each hour, and so on.
     * </p>
     * <p>
     * When IoT SiteWise aggregates data points for metric computations, the start of each interval is exclusive and the
     * end of each interval is inclusive. IoT SiteWise places the computed data point at the end of the interval.
     * </p>
     * 
     * @param interval
     *        The time interval for the tumbling window. The interval time must be between 1 minute and 1 week.</p>
     *        <p>
     *        IoT SiteWise computes the <code>1w</code> interval the end of Sunday at midnight each week (UTC), the
     *        <code>1d</code> interval at the end of each day at midnight (UTC), the <code>1h</code> interval at the end
     *        of each hour, and so on.
     *        </p>
     *        <p>
     *        When IoT SiteWise aggregates data points for metric computations, the start of each interval is exclusive
     *        and the end of each interval is inclusive. IoT SiteWise places the computed data point at the end of the
     *        interval.
     */

    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The time interval for the tumbling window. The interval time must be between 1 minute and 1 week.
     * </p>
     * <p>
     * IoT SiteWise computes the <code>1w</code> interval the end of Sunday at midnight each week (UTC), the
     * <code>1d</code> interval at the end of each day at midnight (UTC), the <code>1h</code> interval at the end of
     * each hour, and so on.
     * </p>
     * <p>
     * When IoT SiteWise aggregates data points for metric computations, the start of each interval is exclusive and the
     * end of each interval is inclusive. IoT SiteWise places the computed data point at the end of the interval.
     * </p>
     * 
     * @return The time interval for the tumbling window. The interval time must be between 1 minute and 1 week.</p>
     *         <p>
     *         IoT SiteWise computes the <code>1w</code> interval the end of Sunday at midnight each week (UTC), the
     *         <code>1d</code> interval at the end of each day at midnight (UTC), the <code>1h</code> interval at the
     *         end of each hour, and so on.
     *         </p>
     *         <p>
     *         When IoT SiteWise aggregates data points for metric computations, the start of each interval is exclusive
     *         and the end of each interval is inclusive. IoT SiteWise places the computed data point at the end of the
     *         interval.
     */

    public String getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The time interval for the tumbling window. The interval time must be between 1 minute and 1 week.
     * </p>
     * <p>
     * IoT SiteWise computes the <code>1w</code> interval the end of Sunday at midnight each week (UTC), the
     * <code>1d</code> interval at the end of each day at midnight (UTC), the <code>1h</code> interval at the end of
     * each hour, and so on.
     * </p>
     * <p>
     * When IoT SiteWise aggregates data points for metric computations, the start of each interval is exclusive and the
     * end of each interval is inclusive. IoT SiteWise places the computed data point at the end of the interval.
     * </p>
     * 
     * @param interval
     *        The time interval for the tumbling window. The interval time must be between 1 minute and 1 week.</p>
     *        <p>
     *        IoT SiteWise computes the <code>1w</code> interval the end of Sunday at midnight each week (UTC), the
     *        <code>1d</code> interval at the end of each day at midnight (UTC), the <code>1h</code> interval at the end
     *        of each hour, and so on.
     *        </p>
     *        <p>
     *        When IoT SiteWise aggregates data points for metric computations, the start of each interval is exclusive
     *        and the end of each interval is inclusive. IoT SiteWise places the computed data point at the end of the
     *        interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TumblingWindow withInterval(String interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The offset for the tumbling window. The <code>offset</code> parameter accepts the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The offset time.
     * </p>
     * <p>
     * For example, if you specify <code>18h</code> for <code>offset</code> and <code>1d</code> for
     * <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on the day
     * when you create the metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next day.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The ISO 8601 format.
     * </p>
     * <p>
     * For example, if you specify <code>PT18H</code> for <code>offset</code> and <code>1d</code> for
     * <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on the day
     * when you create the metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next day.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The 24-hour clock.
     * </p>
     * <p>
     * For example, if you specify <code>00:03:00</code> for <code>offset</code>, <code>5m</code> for
     * <code>interval</code>, and you create the metric at 2 PM (UTC), you get the first aggregation result at 2:03 PM
     * (UTC). You get the second aggregation result at 2:08 PM (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * The offset time zone.
     * </p>
     * <p>
     * For example, if you specify <code>2021-07-23T18:00-08</code> for <code>offset</code> and <code>1d</code> for
     * <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you create the metric before or at 6 PM (PST), you get the first aggregation result at 6 PM (PST) on the day
     * when you create the metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create the metric after 6 PM (PST), you get the first aggregation result at 6 PM (PST) the next day.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param offset
     *        The offset for the tumbling window. The <code>offset</code> parameter accepts the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The offset time.
     *        </p>
     *        <p>
     *        For example, if you specify <code>18h</code> for <code>offset</code> and <code>1d</code> for
     *        <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on
     *        the day when you create the metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next
     *        day.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        The ISO 8601 format.
     *        </p>
     *        <p>
     *        For example, if you specify <code>PT18H</code> for <code>offset</code> and <code>1d</code> for
     *        <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on
     *        the day when you create the metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next
     *        day.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        The 24-hour clock.
     *        </p>
     *        <p>
     *        For example, if you specify <code>00:03:00</code> for <code>offset</code>, <code>5m</code> for
     *        <code>interval</code>, and you create the metric at 2 PM (UTC), you get the first aggregation result at
     *        2:03 PM (UTC). You get the second aggregation result at 2:08 PM (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The offset time zone.
     *        </p>
     *        <p>
     *        For example, if you specify <code>2021-07-23T18:00-08</code> for <code>offset</code> and <code>1d</code>
     *        for <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you create the metric before or at 6 PM (PST), you get the first aggregation result at 6 PM (PST) on
     *        the day when you create the metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you create the metric after 6 PM (PST), you get the first aggregation result at 6 PM (PST) the next
     *        day.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     */

    public void setOffset(String offset) {
        this.offset = offset;
    }

    /**
     * <p>
     * The offset for the tumbling window. The <code>offset</code> parameter accepts the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The offset time.
     * </p>
     * <p>
     * For example, if you specify <code>18h</code> for <code>offset</code> and <code>1d</code> for
     * <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on the day
     * when you create the metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next day.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The ISO 8601 format.
     * </p>
     * <p>
     * For example, if you specify <code>PT18H</code> for <code>offset</code> and <code>1d</code> for
     * <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on the day
     * when you create the metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next day.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The 24-hour clock.
     * </p>
     * <p>
     * For example, if you specify <code>00:03:00</code> for <code>offset</code>, <code>5m</code> for
     * <code>interval</code>, and you create the metric at 2 PM (UTC), you get the first aggregation result at 2:03 PM
     * (UTC). You get the second aggregation result at 2:08 PM (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * The offset time zone.
     * </p>
     * <p>
     * For example, if you specify <code>2021-07-23T18:00-08</code> for <code>offset</code> and <code>1d</code> for
     * <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you create the metric before or at 6 PM (PST), you get the first aggregation result at 6 PM (PST) on the day
     * when you create the metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create the metric after 6 PM (PST), you get the first aggregation result at 6 PM (PST) the next day.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The offset for the tumbling window. The <code>offset</code> parameter accepts the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The offset time.
     *         </p>
     *         <p>
     *         For example, if you specify <code>18h</code> for <code>offset</code> and <code>1d</code> for
     *         <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on
     *         the day when you create the metric.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next
     *         day.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         The ISO 8601 format.
     *         </p>
     *         <p>
     *         For example, if you specify <code>PT18H</code> for <code>offset</code> and <code>1d</code> for
     *         <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on
     *         the day when you create the metric.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next
     *         day.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         The 24-hour clock.
     *         </p>
     *         <p>
     *         For example, if you specify <code>00:03:00</code> for <code>offset</code>, <code>5m</code> for
     *         <code>interval</code>, and you create the metric at 2 PM (UTC), you get the first aggregation result at
     *         2:03 PM (UTC). You get the second aggregation result at 2:08 PM (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The offset time zone.
     *         </p>
     *         <p>
     *         For example, if you specify <code>2021-07-23T18:00-08</code> for <code>offset</code> and <code>1d</code>
     *         for <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If you create the metric before or at 6 PM (PST), you get the first aggregation result at 6 PM (PST) on
     *         the day when you create the metric.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you create the metric after 6 PM (PST), you get the first aggregation result at 6 PM (PST) the next
     *         day.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     */

    public String getOffset() {
        return this.offset;
    }

    /**
     * <p>
     * The offset for the tumbling window. The <code>offset</code> parameter accepts the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The offset time.
     * </p>
     * <p>
     * For example, if you specify <code>18h</code> for <code>offset</code> and <code>1d</code> for
     * <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on the day
     * when you create the metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next day.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The ISO 8601 format.
     * </p>
     * <p>
     * For example, if you specify <code>PT18H</code> for <code>offset</code> and <code>1d</code> for
     * <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on the day
     * when you create the metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next day.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * The 24-hour clock.
     * </p>
     * <p>
     * For example, if you specify <code>00:03:00</code> for <code>offset</code>, <code>5m</code> for
     * <code>interval</code>, and you create the metric at 2 PM (UTC), you get the first aggregation result at 2:03 PM
     * (UTC). You get the second aggregation result at 2:08 PM (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * The offset time zone.
     * </p>
     * <p>
     * For example, if you specify <code>2021-07-23T18:00-08</code> for <code>offset</code> and <code>1d</code> for
     * <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If you create the metric before or at 6 PM (PST), you get the first aggregation result at 6 PM (PST) on the day
     * when you create the metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you create the metric after 6 PM (PST), you get the first aggregation result at 6 PM (PST) the next day.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param offset
     *        The offset for the tumbling window. The <code>offset</code> parameter accepts the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The offset time.
     *        </p>
     *        <p>
     *        For example, if you specify <code>18h</code> for <code>offset</code> and <code>1d</code> for
     *        <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on
     *        the day when you create the metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next
     *        day.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        The ISO 8601 format.
     *        </p>
     *        <p>
     *        For example, if you specify <code>PT18H</code> for <code>offset</code> and <code>1d</code> for
     *        <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you create the metric before or at 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) on
     *        the day when you create the metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you create the metric after 6 PM (UTC), you get the first aggregation result at 6 PM (UTC) the next
     *        day.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        The 24-hour clock.
     *        </p>
     *        <p>
     *        For example, if you specify <code>00:03:00</code> for <code>offset</code>, <code>5m</code> for
     *        <code>interval</code>, and you create the metric at 2 PM (UTC), you get the first aggregation result at
     *        2:03 PM (UTC). You get the second aggregation result at 2:08 PM (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The offset time zone.
     *        </p>
     *        <p>
     *        For example, if you specify <code>2021-07-23T18:00-08</code> for <code>offset</code> and <code>1d</code>
     *        for <code>interval</code>, IoT SiteWise aggregates data in one of the following ways:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        If you create the metric before or at 6 PM (PST), you get the first aggregation result at 6 PM (PST) on
     *        the day when you create the metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If you create the metric after 6 PM (PST), you get the first aggregation result at 6 PM (PST) the next
     *        day.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TumblingWindow withOffset(String offset) {
        setOffset(offset);
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
            sb.append("Interval: ").append(getInterval()).append(",");
        if (getOffset() != null)
            sb.append("Offset: ").append(getOffset());
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
        if (other.getOffset() == null ^ this.getOffset() == null)
            return false;
        if (other.getOffset() != null && other.getOffset().equals(this.getOffset()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getOffset() == null) ? 0 : getOffset().hashCode());
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
