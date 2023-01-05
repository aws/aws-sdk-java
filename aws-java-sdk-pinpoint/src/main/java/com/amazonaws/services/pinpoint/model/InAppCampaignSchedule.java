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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Schedule of the campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/InAppCampaignSchedule" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InAppCampaignSchedule implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The scheduled time after which the in-app message should not be shown. Timestamp is in ISO 8601 format.
     * </p>
     */
    private String endDate;
    /**
     * <p>
     * The event filter the SDK has to use to show the in-app message in the application.
     * </p>
     */
    private CampaignEventFilter eventFilter;
    /**
     * <p>
     * Time during which the in-app message should not be shown to the user.
     * </p>
     */
    private QuietTime quietTime;

    /**
     * <p>
     * The scheduled time after which the in-app message should not be shown. Timestamp is in ISO 8601 format.
     * </p>
     * 
     * @param endDate
     *        The scheduled time after which the in-app message should not be shown. Timestamp is in ISO 8601 format.
     */

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The scheduled time after which the in-app message should not be shown. Timestamp is in ISO 8601 format.
     * </p>
     * 
     * @return The scheduled time after which the in-app message should not be shown. Timestamp is in ISO 8601 format.
     */

    public String getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The scheduled time after which the in-app message should not be shown. Timestamp is in ISO 8601 format.
     * </p>
     * 
     * @param endDate
     *        The scheduled time after which the in-app message should not be shown. Timestamp is in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppCampaignSchedule withEndDate(String endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * The event filter the SDK has to use to show the in-app message in the application.
     * </p>
     * 
     * @param eventFilter
     *        The event filter the SDK has to use to show the in-app message in the application.
     */

    public void setEventFilter(CampaignEventFilter eventFilter) {
        this.eventFilter = eventFilter;
    }

    /**
     * <p>
     * The event filter the SDK has to use to show the in-app message in the application.
     * </p>
     * 
     * @return The event filter the SDK has to use to show the in-app message in the application.
     */

    public CampaignEventFilter getEventFilter() {
        return this.eventFilter;
    }

    /**
     * <p>
     * The event filter the SDK has to use to show the in-app message in the application.
     * </p>
     * 
     * @param eventFilter
     *        The event filter the SDK has to use to show the in-app message in the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppCampaignSchedule withEventFilter(CampaignEventFilter eventFilter) {
        setEventFilter(eventFilter);
        return this;
    }

    /**
     * <p>
     * Time during which the in-app message should not be shown to the user.
     * </p>
     * 
     * @param quietTime
     *        Time during which the in-app message should not be shown to the user.
     */

    public void setQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
    }

    /**
     * <p>
     * Time during which the in-app message should not be shown to the user.
     * </p>
     * 
     * @return Time during which the in-app message should not be shown to the user.
     */

    public QuietTime getQuietTime() {
        return this.quietTime;
    }

    /**
     * <p>
     * Time during which the in-app message should not be shown to the user.
     * </p>
     * 
     * @param quietTime
     *        Time during which the in-app message should not be shown to the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppCampaignSchedule withQuietTime(QuietTime quietTime) {
        setQuietTime(quietTime);
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
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getEventFilter() != null)
            sb.append("EventFilter: ").append(getEventFilter()).append(",");
        if (getQuietTime() != null)
            sb.append("QuietTime: ").append(getQuietTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InAppCampaignSchedule == false)
            return false;
        InAppCampaignSchedule other = (InAppCampaignSchedule) obj;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getEventFilter() == null ^ this.getEventFilter() == null)
            return false;
        if (other.getEventFilter() != null && other.getEventFilter().equals(this.getEventFilter()) == false)
            return false;
        if (other.getQuietTime() == null ^ this.getQuietTime() == null)
            return false;
        if (other.getQuietTime() != null && other.getQuietTime().equals(this.getQuietTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getEventFilter() == null) ? 0 : getEventFilter().hashCode());
        hashCode = prime * hashCode + ((getQuietTime() == null) ? 0 : getQuietTime().hashCode());
        return hashCode;
    }

    @Override
    public InAppCampaignSchedule clone() {
        try {
            return (InAppCampaignSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.InAppCampaignScheduleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
