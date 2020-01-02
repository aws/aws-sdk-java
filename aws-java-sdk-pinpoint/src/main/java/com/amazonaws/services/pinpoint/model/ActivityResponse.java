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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an activity that was performed by a campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ActivityResponse" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivityResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the application that the campaign applies to.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The unique identifier for the campaign that the activity applies to.
     * </p>
     */
    private String campaignId;
    /**
     * <p>
     * The actual time, in ISO 8601 format, when the activity was marked CANCELLED or COMPLETED.
     * </p>
     */
    private String end;
    /**
     * <p>
     * The unique identifier for the activity.
     * </p>
     */
    private String id;
    /**
     * <p>
     * Specifies whether the activity succeeded. Possible values are SUCCESS and FAIL.
     * </p>
     */
    private String result;
    /**
     * <p>
     * The scheduled start time, in ISO 8601 format, for the activity.
     * </p>
     */
    private String scheduledStart;
    /**
     * <p>
     * The actual start time, in ISO 8601 format, of the activity.
     * </p>
     */
    private String start;
    /**
     * <p>
     * The current status of the activity. Possible values are: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, and
     * COMPLETED.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The total number of endpoints that the campaign successfully delivered messages to.
     * </p>
     */
    private Integer successfulEndpointCount;
    /**
     * <p>
     * The total number of time zones that were completed.
     * </p>
     */
    private Integer timezonesCompletedCount;
    /**
     * <p>
     * The total number of unique time zones that are in the segment for the campaign.
     * </p>
     */
    private Integer timezonesTotalCount;
    /**
     * <p>
     * The total number of endpoints that the campaign attempted to deliver messages to.
     * </p>
     */
    private Integer totalEndpointCount;
    /**
     * <p>
     * The unique identifier for the campaign treatment that the activity applies to. A treatment is a variation of a
     * campaign that's used for A/B testing of a campaign.
     * </p>
     */
    private String treatmentId;

    /**
     * <p>
     * The unique identifier for the application that the campaign applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the campaign applies to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the campaign applies to.
     * </p>
     * 
     * @return The unique identifier for the application that the campaign applies to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the campaign applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the campaign applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the campaign that the activity applies to.
     * </p>
     * 
     * @param campaignId
     *        The unique identifier for the campaign that the activity applies to.
     */

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign that the activity applies to.
     * </p>
     * 
     * @return The unique identifier for the campaign that the activity applies to.
     */

    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * <p>
     * The unique identifier for the campaign that the activity applies to.
     * </p>
     * 
     * @param campaignId
     *        The unique identifier for the campaign that the activity applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityResponse withCampaignId(String campaignId) {
        setCampaignId(campaignId);
        return this;
    }

    /**
     * <p>
     * The actual time, in ISO 8601 format, when the activity was marked CANCELLED or COMPLETED.
     * </p>
     * 
     * @param end
     *        The actual time, in ISO 8601 format, when the activity was marked CANCELLED or COMPLETED.
     */

    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * <p>
     * The actual time, in ISO 8601 format, when the activity was marked CANCELLED or COMPLETED.
     * </p>
     * 
     * @return The actual time, in ISO 8601 format, when the activity was marked CANCELLED or COMPLETED.
     */

    public String getEnd() {
        return this.end;
    }

    /**
     * <p>
     * The actual time, in ISO 8601 format, when the activity was marked CANCELLED or COMPLETED.
     * </p>
     * 
     * @param end
     *        The actual time, in ISO 8601 format, when the activity was marked CANCELLED or COMPLETED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityResponse withEnd(String end) {
        setEnd(end);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the activity.
     * </p>
     * 
     * @param id
     *        The unique identifier for the activity.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the activity.
     * </p>
     * 
     * @return The unique identifier for the activity.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the activity.
     * </p>
     * 
     * @param id
     *        The unique identifier for the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityResponse withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * Specifies whether the activity succeeded. Possible values are SUCCESS and FAIL.
     * </p>
     * 
     * @param result
     *        Specifies whether the activity succeeded. Possible values are SUCCESS and FAIL.
     */

    public void setResult(String result) {
        this.result = result;
    }

    /**
     * <p>
     * Specifies whether the activity succeeded. Possible values are SUCCESS and FAIL.
     * </p>
     * 
     * @return Specifies whether the activity succeeded. Possible values are SUCCESS and FAIL.
     */

    public String getResult() {
        return this.result;
    }

    /**
     * <p>
     * Specifies whether the activity succeeded. Possible values are SUCCESS and FAIL.
     * </p>
     * 
     * @param result
     *        Specifies whether the activity succeeded. Possible values are SUCCESS and FAIL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityResponse withResult(String result) {
        setResult(result);
        return this;
    }

    /**
     * <p>
     * The scheduled start time, in ISO 8601 format, for the activity.
     * </p>
     * 
     * @param scheduledStart
     *        The scheduled start time, in ISO 8601 format, for the activity.
     */

    public void setScheduledStart(String scheduledStart) {
        this.scheduledStart = scheduledStart;
    }

    /**
     * <p>
     * The scheduled start time, in ISO 8601 format, for the activity.
     * </p>
     * 
     * @return The scheduled start time, in ISO 8601 format, for the activity.
     */

    public String getScheduledStart() {
        return this.scheduledStart;
    }

    /**
     * <p>
     * The scheduled start time, in ISO 8601 format, for the activity.
     * </p>
     * 
     * @param scheduledStart
     *        The scheduled start time, in ISO 8601 format, for the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityResponse withScheduledStart(String scheduledStart) {
        setScheduledStart(scheduledStart);
        return this;
    }

    /**
     * <p>
     * The actual start time, in ISO 8601 format, of the activity.
     * </p>
     * 
     * @param start
     *        The actual start time, in ISO 8601 format, of the activity.
     */

    public void setStart(String start) {
        this.start = start;
    }

    /**
     * <p>
     * The actual start time, in ISO 8601 format, of the activity.
     * </p>
     * 
     * @return The actual start time, in ISO 8601 format, of the activity.
     */

    public String getStart() {
        return this.start;
    }

    /**
     * <p>
     * The actual start time, in ISO 8601 format, of the activity.
     * </p>
     * 
     * @param start
     *        The actual start time, in ISO 8601 format, of the activity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityResponse withStart(String start) {
        setStart(start);
        return this;
    }

    /**
     * <p>
     * The current status of the activity. Possible values are: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, and
     * COMPLETED.
     * </p>
     * 
     * @param state
     *        The current status of the activity. Possible values are: PENDING, INITIALIZING, RUNNING, PAUSED,
     *        CANCELLED, and COMPLETED.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current status of the activity. Possible values are: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, and
     * COMPLETED.
     * </p>
     * 
     * @return The current status of the activity. Possible values are: PENDING, INITIALIZING, RUNNING, PAUSED,
     *         CANCELLED, and COMPLETED.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current status of the activity. Possible values are: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, and
     * COMPLETED.
     * </p>
     * 
     * @param state
     *        The current status of the activity. Possible values are: PENDING, INITIALIZING, RUNNING, PAUSED,
     *        CANCELLED, and COMPLETED.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityResponse withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The total number of endpoints that the campaign successfully delivered messages to.
     * </p>
     * 
     * @param successfulEndpointCount
     *        The total number of endpoints that the campaign successfully delivered messages to.
     */

    public void setSuccessfulEndpointCount(Integer successfulEndpointCount) {
        this.successfulEndpointCount = successfulEndpointCount;
    }

    /**
     * <p>
     * The total number of endpoints that the campaign successfully delivered messages to.
     * </p>
     * 
     * @return The total number of endpoints that the campaign successfully delivered messages to.
     */

    public Integer getSuccessfulEndpointCount() {
        return this.successfulEndpointCount;
    }

    /**
     * <p>
     * The total number of endpoints that the campaign successfully delivered messages to.
     * </p>
     * 
     * @param successfulEndpointCount
     *        The total number of endpoints that the campaign successfully delivered messages to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityResponse withSuccessfulEndpointCount(Integer successfulEndpointCount) {
        setSuccessfulEndpointCount(successfulEndpointCount);
        return this;
    }

    /**
     * <p>
     * The total number of time zones that were completed.
     * </p>
     * 
     * @param timezonesCompletedCount
     *        The total number of time zones that were completed.
     */

    public void setTimezonesCompletedCount(Integer timezonesCompletedCount) {
        this.timezonesCompletedCount = timezonesCompletedCount;
    }

    /**
     * <p>
     * The total number of time zones that were completed.
     * </p>
     * 
     * @return The total number of time zones that were completed.
     */

    public Integer getTimezonesCompletedCount() {
        return this.timezonesCompletedCount;
    }

    /**
     * <p>
     * The total number of time zones that were completed.
     * </p>
     * 
     * @param timezonesCompletedCount
     *        The total number of time zones that were completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityResponse withTimezonesCompletedCount(Integer timezonesCompletedCount) {
        setTimezonesCompletedCount(timezonesCompletedCount);
        return this;
    }

    /**
     * <p>
     * The total number of unique time zones that are in the segment for the campaign.
     * </p>
     * 
     * @param timezonesTotalCount
     *        The total number of unique time zones that are in the segment for the campaign.
     */

    public void setTimezonesTotalCount(Integer timezonesTotalCount) {
        this.timezonesTotalCount = timezonesTotalCount;
    }

    /**
     * <p>
     * The total number of unique time zones that are in the segment for the campaign.
     * </p>
     * 
     * @return The total number of unique time zones that are in the segment for the campaign.
     */

    public Integer getTimezonesTotalCount() {
        return this.timezonesTotalCount;
    }

    /**
     * <p>
     * The total number of unique time zones that are in the segment for the campaign.
     * </p>
     * 
     * @param timezonesTotalCount
     *        The total number of unique time zones that are in the segment for the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityResponse withTimezonesTotalCount(Integer timezonesTotalCount) {
        setTimezonesTotalCount(timezonesTotalCount);
        return this;
    }

    /**
     * <p>
     * The total number of endpoints that the campaign attempted to deliver messages to.
     * </p>
     * 
     * @param totalEndpointCount
     *        The total number of endpoints that the campaign attempted to deliver messages to.
     */

    public void setTotalEndpointCount(Integer totalEndpointCount) {
        this.totalEndpointCount = totalEndpointCount;
    }

    /**
     * <p>
     * The total number of endpoints that the campaign attempted to deliver messages to.
     * </p>
     * 
     * @return The total number of endpoints that the campaign attempted to deliver messages to.
     */

    public Integer getTotalEndpointCount() {
        return this.totalEndpointCount;
    }

    /**
     * <p>
     * The total number of endpoints that the campaign attempted to deliver messages to.
     * </p>
     * 
     * @param totalEndpointCount
     *        The total number of endpoints that the campaign attempted to deliver messages to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityResponse withTotalEndpointCount(Integer totalEndpointCount) {
        setTotalEndpointCount(totalEndpointCount);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the campaign treatment that the activity applies to. A treatment is a variation of a
     * campaign that's used for A/B testing of a campaign.
     * </p>
     * 
     * @param treatmentId
     *        The unique identifier for the campaign treatment that the activity applies to. A treatment is a variation
     *        of a campaign that's used for A/B testing of a campaign.
     */

    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
    }

    /**
     * <p>
     * The unique identifier for the campaign treatment that the activity applies to. A treatment is a variation of a
     * campaign that's used for A/B testing of a campaign.
     * </p>
     * 
     * @return The unique identifier for the campaign treatment that the activity applies to. A treatment is a variation
     *         of a campaign that's used for A/B testing of a campaign.
     */

    public String getTreatmentId() {
        return this.treatmentId;
    }

    /**
     * <p>
     * The unique identifier for the campaign treatment that the activity applies to. A treatment is a variation of a
     * campaign that's used for A/B testing of a campaign.
     * </p>
     * 
     * @param treatmentId
     *        The unique identifier for the campaign treatment that the activity applies to. A treatment is a variation
     *        of a campaign that's used for A/B testing of a campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityResponse withTreatmentId(String treatmentId) {
        setTreatmentId(treatmentId);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCampaignId() != null)
            sb.append("CampaignId: ").append(getCampaignId()).append(",");
        if (getEnd() != null)
            sb.append("End: ").append(getEnd()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getResult() != null)
            sb.append("Result: ").append(getResult()).append(",");
        if (getScheduledStart() != null)
            sb.append("ScheduledStart: ").append(getScheduledStart()).append(",");
        if (getStart() != null)
            sb.append("Start: ").append(getStart()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getSuccessfulEndpointCount() != null)
            sb.append("SuccessfulEndpointCount: ").append(getSuccessfulEndpointCount()).append(",");
        if (getTimezonesCompletedCount() != null)
            sb.append("TimezonesCompletedCount: ").append(getTimezonesCompletedCount()).append(",");
        if (getTimezonesTotalCount() != null)
            sb.append("TimezonesTotalCount: ").append(getTimezonesTotalCount()).append(",");
        if (getTotalEndpointCount() != null)
            sb.append("TotalEndpointCount: ").append(getTotalEndpointCount()).append(",");
        if (getTreatmentId() != null)
            sb.append("TreatmentId: ").append(getTreatmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivityResponse == false)
            return false;
        ActivityResponse other = (ActivityResponse) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCampaignId() == null ^ this.getCampaignId() == null)
            return false;
        if (other.getCampaignId() != null && other.getCampaignId().equals(this.getCampaignId()) == false)
            return false;
        if (other.getEnd() == null ^ this.getEnd() == null)
            return false;
        if (other.getEnd() != null && other.getEnd().equals(this.getEnd()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getResult() == null ^ this.getResult() == null)
            return false;
        if (other.getResult() != null && other.getResult().equals(this.getResult()) == false)
            return false;
        if (other.getScheduledStart() == null ^ this.getScheduledStart() == null)
            return false;
        if (other.getScheduledStart() != null && other.getScheduledStart().equals(this.getScheduledStart()) == false)
            return false;
        if (other.getStart() == null ^ this.getStart() == null)
            return false;
        if (other.getStart() != null && other.getStart().equals(this.getStart()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getSuccessfulEndpointCount() == null ^ this.getSuccessfulEndpointCount() == null)
            return false;
        if (other.getSuccessfulEndpointCount() != null && other.getSuccessfulEndpointCount().equals(this.getSuccessfulEndpointCount()) == false)
            return false;
        if (other.getTimezonesCompletedCount() == null ^ this.getTimezonesCompletedCount() == null)
            return false;
        if (other.getTimezonesCompletedCount() != null && other.getTimezonesCompletedCount().equals(this.getTimezonesCompletedCount()) == false)
            return false;
        if (other.getTimezonesTotalCount() == null ^ this.getTimezonesTotalCount() == null)
            return false;
        if (other.getTimezonesTotalCount() != null && other.getTimezonesTotalCount().equals(this.getTimezonesTotalCount()) == false)
            return false;
        if (other.getTotalEndpointCount() == null ^ this.getTotalEndpointCount() == null)
            return false;
        if (other.getTotalEndpointCount() != null && other.getTotalEndpointCount().equals(this.getTotalEndpointCount()) == false)
            return false;
        if (other.getTreatmentId() == null ^ this.getTreatmentId() == null)
            return false;
        if (other.getTreatmentId() != null && other.getTreatmentId().equals(this.getTreatmentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        hashCode = prime * hashCode + ((getEnd() == null) ? 0 : getEnd().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getResult() == null) ? 0 : getResult().hashCode());
        hashCode = prime * hashCode + ((getScheduledStart() == null) ? 0 : getScheduledStart().hashCode());
        hashCode = prime * hashCode + ((getStart() == null) ? 0 : getStart().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getSuccessfulEndpointCount() == null) ? 0 : getSuccessfulEndpointCount().hashCode());
        hashCode = prime * hashCode + ((getTimezonesCompletedCount() == null) ? 0 : getTimezonesCompletedCount().hashCode());
        hashCode = prime * hashCode + ((getTimezonesTotalCount() == null) ? 0 : getTimezonesTotalCount().hashCode());
        hashCode = prime * hashCode + ((getTotalEndpointCount() == null) ? 0 : getTotalEndpointCount().hashCode());
        hashCode = prime * hashCode + ((getTreatmentId() == null) ? 0 : getTreatmentId().hashCode());
        return hashCode;
    }

    @Override
    public ActivityResponse clone() {
        try {
            return (ActivityResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ActivityResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
