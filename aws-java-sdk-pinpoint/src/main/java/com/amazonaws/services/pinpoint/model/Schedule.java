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
 * <p>
 * Specifies the schedule settings for a campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/Schedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Schedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to end.
     * </p>
     */
    private String endTime;
    /**
     * <p>
     * The type of event that causes the campaign to be sent, if the value of the Frequency property is EVENT.
     * </p>
     */
    private CampaignEventFilter eventFilter;
    /**
     * <p>
     * Specifies how often the campaign is sent or whether the campaign is sent in response to a specific event.
     * </p>
     */
    private String frequency;
    /**
     * <p>
     * Specifies whether the start and end times for the campaign schedule use each recipient's local time. To base the
     * schedule on each recipient's local time, set this value to true.
     * </p>
     */
    private Boolean isLocalTime;
    /**
     * <p>
     * The default quiet time for the campaign. Quiet time is a specific time range when a campaign doesn't send
     * messages to endpoints, if all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint is set to a valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is later than or equal to the time specified by the QuietTime.Start
     * property for the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End
     * property for the campaign.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive messages from the campaign, even if quiet
     * time is enabled.
     * </p>
     */
    private QuietTime quietTime;
    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to begin.
     * </p>
     */
    private String startTime;
    /**
     * <p>
     * The starting UTC offset for the campaign schedule, if the value of the IsLocalTime property is true. Valid values
     * are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45, UTC+06, UTC+06:30,
     * UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05,
     * UTC-06, UTC-07, UTC-08, UTC-09, UTC-10, and UTC-11.
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to end.
     * </p>
     * 
     * @param endTime
     *        The scheduled time, in ISO 8601 format, for the campaign to end.
     */

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to end.
     * </p>
     * 
     * @return The scheduled time, in ISO 8601 format, for the campaign to end.
     */

    public String getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to end.
     * </p>
     * 
     * @param endTime
     *        The scheduled time, in ISO 8601 format, for the campaign to end.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withEndTime(String endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent, if the value of the Frequency property is EVENT.
     * </p>
     * 
     * @param eventFilter
     *        The type of event that causes the campaign to be sent, if the value of the Frequency property is EVENT.
     */

    public void setEventFilter(CampaignEventFilter eventFilter) {
        this.eventFilter = eventFilter;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent, if the value of the Frequency property is EVENT.
     * </p>
     * 
     * @return The type of event that causes the campaign to be sent, if the value of the Frequency property is EVENT.
     */

    public CampaignEventFilter getEventFilter() {
        return this.eventFilter;
    }

    /**
     * <p>
     * The type of event that causes the campaign to be sent, if the value of the Frequency property is EVENT.
     * </p>
     * 
     * @param eventFilter
     *        The type of event that causes the campaign to be sent, if the value of the Frequency property is EVENT.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withEventFilter(CampaignEventFilter eventFilter) {
        setEventFilter(eventFilter);
        return this;
    }

    /**
     * <p>
     * Specifies how often the campaign is sent or whether the campaign is sent in response to a specific event.
     * </p>
     * 
     * @param frequency
     *        Specifies how often the campaign is sent or whether the campaign is sent in response to a specific event.
     * @see Frequency
     */

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    /**
     * <p>
     * Specifies how often the campaign is sent or whether the campaign is sent in response to a specific event.
     * </p>
     * 
     * @return Specifies how often the campaign is sent or whether the campaign is sent in response to a specific event.
     * @see Frequency
     */

    public String getFrequency() {
        return this.frequency;
    }

    /**
     * <p>
     * Specifies how often the campaign is sent or whether the campaign is sent in response to a specific event.
     * </p>
     * 
     * @param frequency
     *        Specifies how often the campaign is sent or whether the campaign is sent in response to a specific event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Frequency
     */

    public Schedule withFrequency(String frequency) {
        setFrequency(frequency);
        return this;
    }

    /**
     * <p>
     * Specifies how often the campaign is sent or whether the campaign is sent in response to a specific event.
     * </p>
     * 
     * @param frequency
     *        Specifies how often the campaign is sent or whether the campaign is sent in response to a specific event.
     * @see Frequency
     */

    public void setFrequency(Frequency frequency) {
        withFrequency(frequency);
    }

    /**
     * <p>
     * Specifies how often the campaign is sent or whether the campaign is sent in response to a specific event.
     * </p>
     * 
     * @param frequency
     *        Specifies how often the campaign is sent or whether the campaign is sent in response to a specific event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Frequency
     */

    public Schedule withFrequency(Frequency frequency) {
        this.frequency = frequency.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether the start and end times for the campaign schedule use each recipient's local time. To base the
     * schedule on each recipient's local time, set this value to true.
     * </p>
     * 
     * @param isLocalTime
     *        Specifies whether the start and end times for the campaign schedule use each recipient's local time. To
     *        base the schedule on each recipient's local time, set this value to true.
     */

    public void setIsLocalTime(Boolean isLocalTime) {
        this.isLocalTime = isLocalTime;
    }

    /**
     * <p>
     * Specifies whether the start and end times for the campaign schedule use each recipient's local time. To base the
     * schedule on each recipient's local time, set this value to true.
     * </p>
     * 
     * @return Specifies whether the start and end times for the campaign schedule use each recipient's local time. To
     *         base the schedule on each recipient's local time, set this value to true.
     */

    public Boolean getIsLocalTime() {
        return this.isLocalTime;
    }

    /**
     * <p>
     * Specifies whether the start and end times for the campaign schedule use each recipient's local time. To base the
     * schedule on each recipient's local time, set this value to true.
     * </p>
     * 
     * @param isLocalTime
     *        Specifies whether the start and end times for the campaign schedule use each recipient's local time. To
     *        base the schedule on each recipient's local time, set this value to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withIsLocalTime(Boolean isLocalTime) {
        setIsLocalTime(isLocalTime);
        return this;
    }

    /**
     * <p>
     * Specifies whether the start and end times for the campaign schedule use each recipient's local time. To base the
     * schedule on each recipient's local time, set this value to true.
     * </p>
     * 
     * @return Specifies whether the start and end times for the campaign schedule use each recipient's local time. To
     *         base the schedule on each recipient's local time, set this value to true.
     */

    public Boolean isLocalTime() {
        return this.isLocalTime;
    }

    /**
     * <p>
     * The default quiet time for the campaign. Quiet time is a specific time range when a campaign doesn't send
     * messages to endpoints, if all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint is set to a valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is later than or equal to the time specified by the QuietTime.Start
     * property for the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End
     * property for the campaign.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive messages from the campaign, even if quiet
     * time is enabled.
     * </p>
     * 
     * @param quietTime
     *        The default quiet time for the campaign. Quiet time is a specific time range when a campaign doesn't send
     *        messages to endpoints, if all the following conditions are met:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The EndpointDemographic.Timezone property of the endpoint is set to a valid value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The current time in the endpoint's time zone is later than or equal to the time specified by the
     *        QuietTime.Start property for the campaign.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The current time in the endpoint's time zone is earlier than or equal to the time specified by the
     *        QuietTime.End property for the campaign.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If any of the preceding conditions isn't met, the endpoint will receive messages from the campaign, even
     *        if quiet time is enabled.
     */

    public void setQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
    }

    /**
     * <p>
     * The default quiet time for the campaign. Quiet time is a specific time range when a campaign doesn't send
     * messages to endpoints, if all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint is set to a valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is later than or equal to the time specified by the QuietTime.Start
     * property for the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End
     * property for the campaign.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive messages from the campaign, even if quiet
     * time is enabled.
     * </p>
     * 
     * @return The default quiet time for the campaign. Quiet time is a specific time range when a campaign doesn't send
     *         messages to endpoints, if all the following conditions are met:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The EndpointDemographic.Timezone property of the endpoint is set to a valid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The current time in the endpoint's time zone is later than or equal to the time specified by the
     *         QuietTime.Start property for the campaign.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The current time in the endpoint's time zone is earlier than or equal to the time specified by the
     *         QuietTime.End property for the campaign.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If any of the preceding conditions isn't met, the endpoint will receive messages from the campaign, even
     *         if quiet time is enabled.
     */

    public QuietTime getQuietTime() {
        return this.quietTime;
    }

    /**
     * <p>
     * The default quiet time for the campaign. Quiet time is a specific time range when a campaign doesn't send
     * messages to endpoints, if all the following conditions are met:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The EndpointDemographic.Timezone property of the endpoint is set to a valid value.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is later than or equal to the time specified by the QuietTime.Start
     * property for the campaign.
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End
     * property for the campaign.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive messages from the campaign, even if quiet
     * time is enabled.
     * </p>
     * 
     * @param quietTime
     *        The default quiet time for the campaign. Quiet time is a specific time range when a campaign doesn't send
     *        messages to endpoints, if all the following conditions are met:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The EndpointDemographic.Timezone property of the endpoint is set to a valid value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The current time in the endpoint's time zone is later than or equal to the time specified by the
     *        QuietTime.Start property for the campaign.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The current time in the endpoint's time zone is earlier than or equal to the time specified by the
     *        QuietTime.End property for the campaign.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If any of the preceding conditions isn't met, the endpoint will receive messages from the campaign, even
     *        if quiet time is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withQuietTime(QuietTime quietTime) {
        setQuietTime(quietTime);
        return this;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to begin.
     * </p>
     * 
     * @param startTime
     *        The scheduled time, in ISO 8601 format, for the campaign to begin.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to begin.
     * </p>
     * 
     * @return The scheduled time, in ISO 8601 format, for the campaign to begin.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The scheduled time, in ISO 8601 format, for the campaign to begin.
     * </p>
     * 
     * @param startTime
     *        The scheduled time, in ISO 8601 format, for the campaign to begin.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Schedule withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The starting UTC offset for the campaign schedule, if the value of the IsLocalTime property is true. Valid values
     * are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45, UTC+06, UTC+06:30,
     * UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05,
     * UTC-06, UTC-07, UTC-08, UTC-09, UTC-10, and UTC-11.
     * </p>
     * 
     * @param timezone
     *        The starting UTC offset for the campaign schedule, if the value of the IsLocalTime property is true. Valid
     *        values are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45,
     *        UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+13, UTC-02,
     *        UTC-03, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09, UTC-10, and UTC-11.
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The starting UTC offset for the campaign schedule, if the value of the IsLocalTime property is true. Valid values
     * are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45, UTC+06, UTC+06:30,
     * UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05,
     * UTC-06, UTC-07, UTC-08, UTC-09, UTC-10, and UTC-11.
     * </p>
     * 
     * @return The starting UTC offset for the campaign schedule, if the value of the IsLocalTime property is true.
     *         Valid values are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30,
     *         UTC+05:45, UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12,
     *         UTC+13, UTC-02, UTC-03, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09, UTC-10, and UTC-11.
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The starting UTC offset for the campaign schedule, if the value of the IsLocalTime property is true. Valid values
     * are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45, UTC+06, UTC+06:30,
     * UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+13, UTC-02, UTC-03, UTC-04, UTC-05,
     * UTC-06, UTC-07, UTC-08, UTC-09, UTC-10, and UTC-11.
     * </p>
     * 
     * @param timezone
     *        The starting UTC offset for the campaign schedule, if the value of the IsLocalTime property is true. Valid
     *        values are: UTC, UTC+01, UTC+02, UTC+03, UTC+03:30, UTC+04, UTC+04:30, UTC+05, UTC+05:30, UTC+05:45,
     *        UTC+06, UTC+06:30, UTC+07, UTC+08, UTC+09, UTC+09:30, UTC+10, UTC+10:30, UTC+11, UTC+12, UTC+13, UTC-02,
     *        UTC-03, UTC-04, UTC-05, UTC-06, UTC-07, UTC-08, UTC-09, UTC-10, and UTC-11.
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
