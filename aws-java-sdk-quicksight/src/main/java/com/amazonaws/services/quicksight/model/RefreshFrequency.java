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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the interval between each scheduled refresh of a dataset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/RefreshFrequency" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RefreshFrequency implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The interval between scheduled refreshes. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MINUTE15</code>: The dataset refreshes every 15 minutes. This value is only supported for incremental
     * refreshes. This interval can only be used for one schedule per dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MINUTE30</code>:The dataset refreshes every 30 minutes. This value is only supported for incremental
     * refreshes. This interval can only be used for one schedule per dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOURLY</code>: The dataset refreshes every hour. This interval can only be used for one schedule per
     * dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAILY</code>: The dataset refreshes every day.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEKLY</code>: The dataset refreshes every week.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MONTHLY</code>: The dataset refreshes every month.
     * </p>
     * </li>
     * </ul>
     */
    private String interval;
    /**
     * <p>
     * The day of the week that you want to schedule the refresh on. This value is required for weekly and monthly
     * refresh intervals.
     * </p>
     */
    private ScheduleRefreshOnEntity refreshOnDay;
    /**
     * <p>
     * The timezone that you want the refresh schedule to use. The timezone ID must match a corresponding ID found on
     * <code>java.util.time.getAvailableIDs()</code>.
     * </p>
     */
    private String timezone;
    /**
     * <p>
     * The time of day that you want the datset to refresh. This value is expressed in HH:MM format. This field is not
     * required for schedules that refresh hourly.
     * </p>
     */
    private String timeOfTheDay;

    /**
     * <p>
     * The interval between scheduled refreshes. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MINUTE15</code>: The dataset refreshes every 15 minutes. This value is only supported for incremental
     * refreshes. This interval can only be used for one schedule per dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MINUTE30</code>:The dataset refreshes every 30 minutes. This value is only supported for incremental
     * refreshes. This interval can only be used for one schedule per dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOURLY</code>: The dataset refreshes every hour. This interval can only be used for one schedule per
     * dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAILY</code>: The dataset refreshes every day.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEKLY</code>: The dataset refreshes every week.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MONTHLY</code>: The dataset refreshes every month.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interval
     *        The interval between scheduled refreshes. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MINUTE15</code>: The dataset refreshes every 15 minutes. This value is only supported for
     *        incremental refreshes. This interval can only be used for one schedule per dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MINUTE30</code>:The dataset refreshes every 30 minutes. This value is only supported for incremental
     *        refreshes. This interval can only be used for one schedule per dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOURLY</code>: The dataset refreshes every hour. This interval can only be used for one schedule per
     *        dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DAILY</code>: The dataset refreshes every day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WEEKLY</code>: The dataset refreshes every week.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MONTHLY</code>: The dataset refreshes every month.
     *        </p>
     *        </li>
     * @see RefreshInterval
     */

    public void setInterval(String interval) {
        this.interval = interval;
    }

    /**
     * <p>
     * The interval between scheduled refreshes. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MINUTE15</code>: The dataset refreshes every 15 minutes. This value is only supported for incremental
     * refreshes. This interval can only be used for one schedule per dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MINUTE30</code>:The dataset refreshes every 30 minutes. This value is only supported for incremental
     * refreshes. This interval can only be used for one schedule per dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOURLY</code>: The dataset refreshes every hour. This interval can only be used for one schedule per
     * dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAILY</code>: The dataset refreshes every day.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEKLY</code>: The dataset refreshes every week.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MONTHLY</code>: The dataset refreshes every month.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The interval between scheduled refreshes. Valid values are as follows:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MINUTE15</code>: The dataset refreshes every 15 minutes. This value is only supported for
     *         incremental refreshes. This interval can only be used for one schedule per dataset.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MINUTE30</code>:The dataset refreshes every 30 minutes. This value is only supported for
     *         incremental refreshes. This interval can only be used for one schedule per dataset.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HOURLY</code>: The dataset refreshes every hour. This interval can only be used for one schedule
     *         per dataset.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DAILY</code>: The dataset refreshes every day.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WEEKLY</code>: The dataset refreshes every week.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MONTHLY</code>: The dataset refreshes every month.
     *         </p>
     *         </li>
     * @see RefreshInterval
     */

    public String getInterval() {
        return this.interval;
    }

    /**
     * <p>
     * The interval between scheduled refreshes. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MINUTE15</code>: The dataset refreshes every 15 minutes. This value is only supported for incremental
     * refreshes. This interval can only be used for one schedule per dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MINUTE30</code>:The dataset refreshes every 30 minutes. This value is only supported for incremental
     * refreshes. This interval can only be used for one schedule per dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOURLY</code>: The dataset refreshes every hour. This interval can only be used for one schedule per
     * dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAILY</code>: The dataset refreshes every day.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEKLY</code>: The dataset refreshes every week.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MONTHLY</code>: The dataset refreshes every month.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interval
     *        The interval between scheduled refreshes. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MINUTE15</code>: The dataset refreshes every 15 minutes. This value is only supported for
     *        incremental refreshes. This interval can only be used for one schedule per dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MINUTE30</code>:The dataset refreshes every 30 minutes. This value is only supported for incremental
     *        refreshes. This interval can only be used for one schedule per dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOURLY</code>: The dataset refreshes every hour. This interval can only be used for one schedule per
     *        dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DAILY</code>: The dataset refreshes every day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WEEKLY</code>: The dataset refreshes every week.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MONTHLY</code>: The dataset refreshes every month.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RefreshInterval
     */

    public RefreshFrequency withInterval(String interval) {
        setInterval(interval);
        return this;
    }

    /**
     * <p>
     * The interval between scheduled refreshes. Valid values are as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MINUTE15</code>: The dataset refreshes every 15 minutes. This value is only supported for incremental
     * refreshes. This interval can only be used for one schedule per dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MINUTE30</code>:The dataset refreshes every 30 minutes. This value is only supported for incremental
     * refreshes. This interval can only be used for one schedule per dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HOURLY</code>: The dataset refreshes every hour. This interval can only be used for one schedule per
     * dataset.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAILY</code>: The dataset refreshes every day.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WEEKLY</code>: The dataset refreshes every week.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MONTHLY</code>: The dataset refreshes every month.
     * </p>
     * </li>
     * </ul>
     * 
     * @param interval
     *        The interval between scheduled refreshes. Valid values are as follows:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MINUTE15</code>: The dataset refreshes every 15 minutes. This value is only supported for
     *        incremental refreshes. This interval can only be used for one schedule per dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MINUTE30</code>:The dataset refreshes every 30 minutes. This value is only supported for incremental
     *        refreshes. This interval can only be used for one schedule per dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HOURLY</code>: The dataset refreshes every hour. This interval can only be used for one schedule per
     *        dataset.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DAILY</code>: The dataset refreshes every day.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WEEKLY</code>: The dataset refreshes every week.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MONTHLY</code>: The dataset refreshes every month.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RefreshInterval
     */

    public RefreshFrequency withInterval(RefreshInterval interval) {
        this.interval = interval.toString();
        return this;
    }

    /**
     * <p>
     * The day of the week that you want to schedule the refresh on. This value is required for weekly and monthly
     * refresh intervals.
     * </p>
     * 
     * @param refreshOnDay
     *        The day of the week that you want to schedule the refresh on. This value is required for weekly and
     *        monthly refresh intervals.
     */

    public void setRefreshOnDay(ScheduleRefreshOnEntity refreshOnDay) {
        this.refreshOnDay = refreshOnDay;
    }

    /**
     * <p>
     * The day of the week that you want to schedule the refresh on. This value is required for weekly and monthly
     * refresh intervals.
     * </p>
     * 
     * @return The day of the week that you want to schedule the refresh on. This value is required for weekly and
     *         monthly refresh intervals.
     */

    public ScheduleRefreshOnEntity getRefreshOnDay() {
        return this.refreshOnDay;
    }

    /**
     * <p>
     * The day of the week that you want to schedule the refresh on. This value is required for weekly and monthly
     * refresh intervals.
     * </p>
     * 
     * @param refreshOnDay
     *        The day of the week that you want to schedule the refresh on. This value is required for weekly and
     *        monthly refresh intervals.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshFrequency withRefreshOnDay(ScheduleRefreshOnEntity refreshOnDay) {
        setRefreshOnDay(refreshOnDay);
        return this;
    }

    /**
     * <p>
     * The timezone that you want the refresh schedule to use. The timezone ID must match a corresponding ID found on
     * <code>java.util.time.getAvailableIDs()</code>.
     * </p>
     * 
     * @param timezone
     *        The timezone that you want the refresh schedule to use. The timezone ID must match a corresponding ID
     *        found on <code>java.util.time.getAvailableIDs()</code>.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The timezone that you want the refresh schedule to use. The timezone ID must match a corresponding ID found on
     * <code>java.util.time.getAvailableIDs()</code>.
     * </p>
     * 
     * @return The timezone that you want the refresh schedule to use. The timezone ID must match a corresponding ID
     *         found on <code>java.util.time.getAvailableIDs()</code>.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The timezone that you want the refresh schedule to use. The timezone ID must match a corresponding ID found on
     * <code>java.util.time.getAvailableIDs()</code>.
     * </p>
     * 
     * @param timezone
     *        The timezone that you want the refresh schedule to use. The timezone ID must match a corresponding ID
     *        found on <code>java.util.time.getAvailableIDs()</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshFrequency withTimezone(String timezone) {
        setTimezone(timezone);
        return this;
    }

    /**
     * <p>
     * The time of day that you want the datset to refresh. This value is expressed in HH:MM format. This field is not
     * required for schedules that refresh hourly.
     * </p>
     * 
     * @param timeOfTheDay
     *        The time of day that you want the datset to refresh. This value is expressed in HH:MM format. This field
     *        is not required for schedules that refresh hourly.
     */

    public void setTimeOfTheDay(String timeOfTheDay) {
        this.timeOfTheDay = timeOfTheDay;
    }

    /**
     * <p>
     * The time of day that you want the datset to refresh. This value is expressed in HH:MM format. This field is not
     * required for schedules that refresh hourly.
     * </p>
     * 
     * @return The time of day that you want the datset to refresh. This value is expressed in HH:MM format. This field
     *         is not required for schedules that refresh hourly.
     */

    public String getTimeOfTheDay() {
        return this.timeOfTheDay;
    }

    /**
     * <p>
     * The time of day that you want the datset to refresh. This value is expressed in HH:MM format. This field is not
     * required for schedules that refresh hourly.
     * </p>
     * 
     * @param timeOfTheDay
     *        The time of day that you want the datset to refresh. This value is expressed in HH:MM format. This field
     *        is not required for schedules that refresh hourly.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RefreshFrequency withTimeOfTheDay(String timeOfTheDay) {
        setTimeOfTheDay(timeOfTheDay);
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
        if (getRefreshOnDay() != null)
            sb.append("RefreshOnDay: ").append(getRefreshOnDay()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone()).append(",");
        if (getTimeOfTheDay() != null)
            sb.append("TimeOfTheDay: ").append(getTimeOfTheDay());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshFrequency == false)
            return false;
        RefreshFrequency other = (RefreshFrequency) obj;
        if (other.getInterval() == null ^ this.getInterval() == null)
            return false;
        if (other.getInterval() != null && other.getInterval().equals(this.getInterval()) == false)
            return false;
        if (other.getRefreshOnDay() == null ^ this.getRefreshOnDay() == null)
            return false;
        if (other.getRefreshOnDay() != null && other.getRefreshOnDay().equals(this.getRefreshOnDay()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getTimeOfTheDay() == null ^ this.getTimeOfTheDay() == null)
            return false;
        if (other.getTimeOfTheDay() != null && other.getTimeOfTheDay().equals(this.getTimeOfTheDay()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInterval() == null) ? 0 : getInterval().hashCode());
        hashCode = prime * hashCode + ((getRefreshOnDay() == null) ? 0 : getRefreshOnDay().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime * hashCode + ((getTimeOfTheDay() == null) ? 0 : getTimeOfTheDay().hashCode());
        return hashCode;
    }

    @Override
    public RefreshFrequency clone() {
        try {
            return (RefreshFrequency) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.RefreshFrequencyMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
