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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Shcedule that defines when a campaign is run.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/Schedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Schedule implements Serializable, Cloneable, StructuredPojo {

    /** The scheduled time that the campaign ends in ISO 8601 format. */
    private String endTime;
    /** Defines the type of events that can trigger the campaign. Used when the Frequency is set to EVENT. */
    private CampaignEventFilter eventFilter;
    /**
     * How often the campaign delivers messages.
     * 
     * Valid values:
     * 
     * ONCE
     * 
     * HOURLY
     * 
     * DAILY
     * 
     * WEEKLY
     * 
     * MONTHLY
     * 
     * EVENT
     */
    private String frequency;
    /** Indicates whether the campaign schedule takes effect according to each user's local time. */
    private Boolean isLocalTime;
    /**
     * The default quiet time for the campaign. The campaign doesn't send messages to endpoints during the quiet time.
     * 
     * Note: Make sure that your endpoints include the Demographics.Timezone attribute if you plan to enable a quiet
     * time for your campaign. If your endpoints don't include this attribute, they'll receive the messages that you
     * send them, even if quiet time is enabled.
     * 
     * When you set up a campaign to use quiet time, the campaign doesn't send messages during the time range you
     * specified, as long as all of the following are true: - The endpoint includes a valid Demographic.Timezone
     * attribute. - The current time in the endpoint's time zone is later than or equal to the time specified in the
     * QuietTime.Start attribute for the campaign. - The current time in the endpoint's time zone is earlier than or
     * equal to the time specified in the QuietTime.End attribute for the campaign.
     */
    private QuietTime quietTime;
    /** The scheduled time that the campaign begins in ISO 8601 format. */
    private String startTime;
    /**
     * The starting UTC offset for the schedule if the value for isLocalTime is true
     * 
     * Valid values: UTC UTC+01 UTC+02 UTC+03 UTC+03:30 UTC+04 UTC+04:30 UTC+05 UTC+05:30 UTC+05:45 UTC+06 UTC+06:30
     * UTC+07 UTC+08 UTC+09 UTC+09:30 UTC+10 UTC+10:30 UTC+11 UTC+12 UTC+13 UTC-02 UTC-03 UTC-04 UTC-05 UTC-06 UTC-07
     * UTC-08 UTC-09 UTC-10 UTC-11
     */
    private String timezone;

    /**
     * The scheduled time that the campaign ends in ISO 8601 format.
     * 
     * @param endTime
     *        The scheduled time that the campaign ends in ISO 8601 format.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * The scheduled time that the campaign ends in ISO 8601 format.
     * 
     * @return The scheduled time that the campaign ends in ISO 8601 format.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * The scheduled time that the campaign ends in ISO 8601 format.
     * 
     * @param endTime
     *        The scheduled time that the campaign ends in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withEndTime(String endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * Defines the type of events that can trigger the campaign. Used when the Frequency is set to EVENT.
     * 
     * @param eventFilter
     *        Defines the type of events that can trigger the campaign. Used when the Frequency is set to EVENT.
     */

    public void setEventFilter(CampaignEventFilter eventFilter) {
        this.eventFilter = eventFilter;
    }

    /**
     * Defines the type of events that can trigger the campaign. Used when the Frequency is set to EVENT.
     * 
     * @return Defines the type of events that can trigger the campaign. Used when the Frequency is set to EVENT.
     */

    public CampaignEventFilter getEventFilter() {
        return this.eventFilter;
    }

    /**
     * Defines the type of events that can trigger the campaign. Used when the Frequency is set to EVENT.
     * 
     * @param eventFilter
     *        Defines the type of events that can trigger the campaign. Used when the Frequency is set to EVENT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withEventFilter(CampaignEventFilter eventFilter) {
        setEventFilter(eventFilter);
        return this;
    }

    /**
     * How often the campaign delivers messages.
     * 
     * Valid values:
     * 
     * ONCE
     * 
     * HOURLY
     * 
     * DAILY
     * 
     * WEEKLY
     * 
     * MONTHLY
     * 
     * EVENT
     * 
     * @param frequency
     *        How often the campaign delivers messages.
     * 
     *        Valid values:
     * 
     *        ONCE
     * 
     *        HOURLY
     * 
     *        DAILY
     * 
     *        WEEKLY
     * 
     *        MONTHLY
     * 
     *        EVENT
     * @see Frequency
     */

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * How often the campaign delivers messages.
     * 
     * Valid values:
     * 
     * ONCE
     * 
     * HOURLY
     * 
     * DAILY
     * 
     * WEEKLY
     * 
     * MONTHLY
     * 
     * EVENT
     * 
     * @return How often the campaign delivers messages.
     * 
     *         Valid values:
     * 
     *         ONCE
     * 
     *         HOURLY
     * 
     *         DAILY
     * 
     *         WEEKLY
     * 
     *         MONTHLY
     * 
     *         EVENT
     * @see Frequency
     */

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * How often the campaign delivers messages.
     * 
     * Valid values:
     * 
     * ONCE
     * 
     * HOURLY
     * 
     * DAILY
     * 
     * WEEKLY
     * 
     * MONTHLY
     * 
     * EVENT
     * 
     * @param frequency
     *        How often the campaign delivers messages.
     * 
     *        Valid values:
     * 
     *        ONCE
     * 
     *        HOURLY
     * 
     *        DAILY
     * 
     *        WEEKLY
     * 
     *        MONTHLY
     * 
     *        EVENT
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Frequency
     */

    public Schedule withFrequency(String frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * How often the campaign delivers messages.
     * 
     * Valid values:
     * 
     * ONCE
     * 
     * HOURLY
     * 
     * DAILY
     * 
     * WEEKLY
     * 
     * MONTHLY
     * 
     * EVENT
     * 
     * @param frequency
     *        How often the campaign delivers messages.
     * 
     *        Valid values:
     * 
     *        ONCE
     * 
     *        HOURLY
     * 
     *        DAILY
     * 
     *        WEEKLY
     * 
     *        MONTHLY
     * 
     *        EVENT
     * @see Frequency
     */

    public void setFrequency(Frequency frequency) {
        withFrequency(frequency);
    }

    /**
     * How often the campaign delivers messages.
     * 
     * Valid values:
     * 
     * ONCE
     * 
     * HOURLY
     * 
     * DAILY
     * 
     * WEEKLY
     * 
     * MONTHLY
     * 
     * EVENT
     * 
     * @param frequency
     *        How often the campaign delivers messages.
     * 
     *        Valid values:
     * 
     *        ONCE
     * 
     *        HOURLY
     * 
     *        DAILY
     * 
     *        WEEKLY
     * 
     *        MONTHLY
     * 
     *        EVENT
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Frequency
     */

    public Schedule withFrequency(Frequency frequency) {
        this.frequency = frequency.toString();
        return this;
    }

    /**
     * Indicates whether the campaign schedule takes effect according to each user's local time.
     * 
     * @param isLocalTime
     *        Indicates whether the campaign schedule takes effect according to each user's local time.
     */

    public void setIsLocalTime(Boolean isLocalTime) {
        this.isLocalTime = isLocalTime;
    }

    /**
     * Indicates whether the campaign schedule takes effect according to each user's local time.
     * 
     * @return Indicates whether the campaign schedule takes effect according to each user's local time.
     */

    public Boolean getIsLocalTime() {
        return this.isLocalTime;
    }

    /**
     * Indicates whether the campaign schedule takes effect according to each user's local time.
     * 
     * @param isLocalTime
     *        Indicates whether the campaign schedule takes effect according to each user's local time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withIsLocalTime(Boolean isLocalTime) {
        setIsLocalTime(isLocalTime);
        return this;
    }

    /**
     * Indicates whether the campaign schedule takes effect according to each user's local time.
     * 
     * @return Indicates whether the campaign schedule takes effect according to each user's local time.
     */

    public Boolean isLocalTime() {
        return this.isLocalTime;
    }

    /**
     * The default quiet time for the campaign. The campaign doesn't send messages to endpoints during the quiet time.
     * 
     * Note: Make sure that your endpoints include the Demographics.Timezone attribute if you plan to enable a quiet
     * time for your campaign. If your endpoints don't include this attribute, they'll receive the messages that you
     * send them, even if quiet time is enabled.
     * 
     * When you set up a campaign to use quiet time, the campaign doesn't send messages during the time range you
     * specified, as long as all of the following are true: - The endpoint includes a valid Demographic.Timezone
     * attribute. - The current time in the endpoint's time zone is later than or equal to the time specified in the
     * QuietTime.Start attribute for the campaign. - The current time in the endpoint's time zone is earlier than or
     * equal to the time specified in the QuietTime.End attribute for the campaign.
     * 
     * @param quietTime
     *        The default quiet time for the campaign. The campaign doesn't send messages to endpoints during the quiet
     *        time.
     * 
     *        Note: Make sure that your endpoints include the Demographics.Timezone attribute if you plan to enable a
     *        quiet time for your campaign. If your endpoints don't include this attribute, they'll receive the messages
     *        that you send them, even if quiet time is enabled.
     * 
     *        When you set up a campaign to use quiet time, the campaign doesn't send messages during the time range you
     *        specified, as long as all of the following are true: - The endpoint includes a valid Demographic.Timezone
     *        attribute. - The current time in the endpoint's time zone is later than or equal to the time specified in
     *        the QuietTime.Start attribute for the campaign. - The current time in the endpoint's time zone is earlier
     *        than or equal to the time specified in the QuietTime.End attribute for the campaign.
     */

    public void setQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
    }

    /**
     * The default quiet time for the campaign. The campaign doesn't send messages to endpoints during the quiet time.
     * 
     * Note: Make sure that your endpoints include the Demographics.Timezone attribute if you plan to enable a quiet
     * time for your campaign. If your endpoints don't include this attribute, they'll receive the messages that you
     * send them, even if quiet time is enabled.
     * 
     * When you set up a campaign to use quiet time, the campaign doesn't send messages during the time range you
     * specified, as long as all of the following are true: - The endpoint includes a valid Demographic.Timezone
     * attribute. - The current time in the endpoint's time zone is later than or equal to the time specified in the
     * QuietTime.Start attribute for the campaign. - The current time in the endpoint's time zone is earlier than or
     * equal to the time specified in the QuietTime.End attribute for the campaign.
     * 
     * @return The default quiet time for the campaign. The campaign doesn't send messages to endpoints during the quiet
     *         time.
     * 
     *         Note: Make sure that your endpoints include the Demographics.Timezone attribute if you plan to enable a
     *         quiet time for your campaign. If your endpoints don't include this attribute, they'll receive the
     *         messages that you send them, even if quiet time is enabled.
     * 
     *         When you set up a campaign to use quiet time, the campaign doesn't send messages during the time range
     *         you specified, as long as all of the following are true: - The endpoint includes a valid
     *         Demographic.Timezone attribute. - The current time in the endpoint's time zone is later than or equal to
     *         the time specified in the QuietTime.Start attribute for the campaign. - The current time in the
     *         endpoint's time zone is earlier than or equal to the time specified in the QuietTime.End attribute for
     *         the campaign.
     */

    public QuietTime getQuietTime() {
        return this.quietTime;
    }

    /**
     * The default quiet time for the campaign. The campaign doesn't send messages to endpoints during the quiet time.
     * 
     * Note: Make sure that your endpoints include the Demographics.Timezone attribute if you plan to enable a quiet
     * time for your campaign. If your endpoints don't include this attribute, they'll receive the messages that you
     * send them, even if quiet time is enabled.
     * 
     * When you set up a campaign to use quiet time, the campaign doesn't send messages during the time range you
     * specified, as long as all of the following are true: - The endpoint includes a valid Demographic.Timezone
     * attribute. - The current time in the endpoint's time zone is later than or equal to the time specified in the
     * QuietTime.Start attribute for the campaign. - The current time in the endpoint's time zone is earlier than or
     * equal to the time specified in the QuietTime.End attribute for the campaign.
     * 
     * @param quietTime
     *        The default quiet time for the campaign. The campaign doesn't send messages to endpoints during the quiet
     *        time.
     * 
     *        Note: Make sure that your endpoints include the Demographics.Timezone attribute if you plan to enable a
     *        quiet time for your campaign. If your endpoints don't include this attribute, they'll receive the messages
     *        that you send them, even if quiet time is enabled.
     * 
     *        When you set up a campaign to use quiet time, the campaign doesn't send messages during the time range you
     *        specified, as long as all of the following are true: - The endpoint includes a valid Demographic.Timezone
     *        attribute. - The current time in the endpoint's time zone is later than or equal to the time specified in
     *        the QuietTime.Start attribute for the campaign. - The current time in the endpoint's time zone is earlier
     *        than or equal to the time specified in the QuietTime.End attribute for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withQuietTime(QuietTime quietTime) {
        setQuietTime(quietTime);
        return this;
    }

    /**
     * The scheduled time that the campaign begins in ISO 8601 format.
     * 
     * @param startTime
     *        The scheduled time that the campaign begins in ISO 8601 format.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * The scheduled time that the campaign begins in ISO 8601 format.
     * 
     * @return The scheduled time that the campaign begins in ISO 8601 format.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * The scheduled time that the campaign begins in ISO 8601 format.
     * 
     * @param startTime
     *        The scheduled time that the campaign begins in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * The starting UTC offset for the schedule if the value for isLocalTime is true
     * 
     * Valid values: UTC UTC+01 UTC+02 UTC+03 UTC+03:30 UTC+04 UTC+04:30 UTC+05 UTC+05:30 UTC+05:45 UTC+06 UTC+06:30
     * UTC+07 UTC+08 UTC+09 UTC+09:30 UTC+10 UTC+10:30 UTC+11 UTC+12 UTC+13 UTC-02 UTC-03 UTC-04 UTC-05 UTC-06 UTC-07
     * UTC-08 UTC-09 UTC-10 UTC-11
     * 
     * @param timezone
     *        The starting UTC offset for the schedule if the value for isLocalTime is true
     * 
     *        Valid values: UTC UTC+01 UTC+02 UTC+03 UTC+03:30 UTC+04 UTC+04:30 UTC+05 UTC+05:30 UTC+05:45 UTC+06
     *        UTC+06:30 UTC+07 UTC+08 UTC+09 UTC+09:30 UTC+10 UTC+10:30 UTC+11 UTC+12 UTC+13 UTC-02 UTC-03 UTC-04 UTC-05
     *        UTC-06 UTC-07 UTC-08 UTC-09 UTC-10 UTC-11
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * The starting UTC offset for the schedule if the value for isLocalTime is true
     * 
     * Valid values: UTC UTC+01 UTC+02 UTC+03 UTC+03:30 UTC+04 UTC+04:30 UTC+05 UTC+05:30 UTC+05:45 UTC+06 UTC+06:30
     * UTC+07 UTC+08 UTC+09 UTC+09:30 UTC+10 UTC+10:30 UTC+11 UTC+12 UTC+13 UTC-02 UTC-03 UTC-04 UTC-05 UTC-06 UTC-07
     * UTC-08 UTC-09 UTC-10 UTC-11
     * 
     * @return The starting UTC offset for the schedule if the value for isLocalTime is true
     * 
     *         Valid values: UTC UTC+01 UTC+02 UTC+03 UTC+03:30 UTC+04 UTC+04:30 UTC+05 UTC+05:30 UTC+05:45 UTC+06
     *         UTC+06:30 UTC+07 UTC+08 UTC+09 UTC+09:30 UTC+10 UTC+10:30 UTC+11 UTC+12 UTC+13 UTC-02 UTC-03 UTC-04
     *         UTC-05 UTC-06 UTC-07 UTC-08 UTC-09 UTC-10 UTC-11
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * The starting UTC offset for the schedule if the value for isLocalTime is true
     * 
     * Valid values: UTC UTC+01 UTC+02 UTC+03 UTC+03:30 UTC+04 UTC+04:30 UTC+05 UTC+05:30 UTC+05:45 UTC+06 UTC+06:30
     * UTC+07 UTC+08 UTC+09 UTC+09:30 UTC+10 UTC+10:30 UTC+11 UTC+12 UTC+13 UTC-02 UTC-03 UTC-04 UTC-05 UTC-06 UTC-07
     * UTC-08 UTC-09 UTC-10 UTC-11
     * 
     * @param timezone
     *        The starting UTC offset for the schedule if the value for isLocalTime is true
     * 
     *        Valid values: UTC UTC+01 UTC+02 UTC+03 UTC+03:30 UTC+04 UTC+04:30 UTC+05 UTC+05:30 UTC+05:45 UTC+06
     *        UTC+06:30 UTC+07 UTC+08 UTC+09 UTC+09:30 UTC+10 UTC+10:30 UTC+11 UTC+12 UTC+13 UTC-02 UTC-03 UTC-04 UTC-05
     *        UTC-06 UTC-07 UTC-08 UTC-09 UTC-10 UTC-11
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withTimezone(String timezone) {
        setTimezone(timezone);
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getEventFilter() != null)
            sb.append("EventFilter: ").append(getEventFilter()).append(",");
        if (getFrequency() != null)
            sb.append("Frequency: ").append(getFrequency()).append(",");
        if (getIsLocalTime() != null)
            sb.append("IsLocalTime: ").append(getIsLocalTime()).append(",");
        if (getQuietTime() != null)
            sb.append("QuietTime: ").append(getQuietTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Schedule == false)
            return false;
        Schedule other = (Schedule) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getEventFilter() == null ^ this.getEventFilter() == null)
            return false;
        if (other.getEventFilter() != null && other.getEventFilter().equals(this.getEventFilter()) == false)
            return false;
        if (other.getFrequency() == null ^ this.getFrequency() == null)
            return false;
        if (other.getFrequency() != null && other.getFrequency().equals(this.getFrequency()) == false)
            return false;
        if (other.getIsLocalTime() == null ^ this.getIsLocalTime() == null)
            return false;
        if (other.getIsLocalTime() != null && other.getIsLocalTime().equals(this.getIsLocalTime()) == false)
            return false;
        if (other.getQuietTime() == null ^ this.getQuietTime() == null)
            return false;
        if (other.getQuietTime() != null && other.getQuietTime().equals(this.getQuietTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getEventFilter() == null) ? 0 : getEventFilter().hashCode());
        hashCode = prime * hashCode + ((getFrequency() == null) ? 0 : getFrequency().hashCode());
        hashCode = prime * hashCode + ((getIsLocalTime() == null) ? 0 : getIsLocalTime().hashCode());
        hashCode = prime * hashCode + ((getQuietTime() == null) ? 0 : getQuietTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        return hashCode;
    }

    @Override
    public Schedule clone() {
        try {
            return (Schedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
