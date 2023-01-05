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
 * Targeted in-app message campaign.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/InAppMessageCampaign" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InAppMessageCampaign implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Campaign id of the corresponding campaign.
     * </p>
     */
    private String campaignId;
    /**
     * <p>
     * Daily cap which controls the number of times any in-app messages can be shown to the endpoint during a day.
     * </p>
     */
    private Integer dailyCap;
    /**
     * <p>
     * In-app message content with all fields required for rendering an in-app message.
     * </p>
     */
    private InAppMessage inAppMessage;
    /**
     * <p>
     * Priority of the in-app message.
     * </p>
     */
    private Integer priority;
    /**
     * <p>
     * Schedule of the campaign.
     * </p>
     */
    private InAppCampaignSchedule schedule;
    /**
     * <p>
     * Session cap which controls the number of times an in-app message can be shown to the endpoint during an
     * application session.
     * </p>
     */
    private Integer sessionCap;
    /**
     * <p>
     * Total cap which controls the number of times an in-app message can be shown to the endpoint.
     * </p>
     */
    private Integer totalCap;
    /**
     * <p>
     * Treatment id of the campaign.
     * </p>
     */
    private String treatmentId;

    /**
     * <p>
     * Campaign id of the corresponding campaign.
     * </p>
     * 
     * @param campaignId
     *        Campaign id of the corresponding campaign.
     */

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * <p>
     * Campaign id of the corresponding campaign.
     * </p>
     * 
     * @return Campaign id of the corresponding campaign.
     */

    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * <p>
     * Campaign id of the corresponding campaign.
     * </p>
     * 
     * @param campaignId
     *        Campaign id of the corresponding campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageCampaign withCampaignId(String campaignId) {
        setCampaignId(campaignId);
        return this;
    }

    /**
     * <p>
     * Daily cap which controls the number of times any in-app messages can be shown to the endpoint during a day.
     * </p>
     * 
     * @param dailyCap
     *        Daily cap which controls the number of times any in-app messages can be shown to the endpoint during a
     *        day.
     */

    public void setDailyCap(Integer dailyCap) {
        this.dailyCap = dailyCap;
    }

    /**
     * <p>
     * Daily cap which controls the number of times any in-app messages can be shown to the endpoint during a day.
     * </p>
     * 
     * @return Daily cap which controls the number of times any in-app messages can be shown to the endpoint during a
     *         day.
     */

    public Integer getDailyCap() {
        return this.dailyCap;
    }

    /**
     * <p>
     * Daily cap which controls the number of times any in-app messages can be shown to the endpoint during a day.
     * </p>
     * 
     * @param dailyCap
     *        Daily cap which controls the number of times any in-app messages can be shown to the endpoint during a
     *        day.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageCampaign withDailyCap(Integer dailyCap) {
        setDailyCap(dailyCap);
        return this;
    }

    /**
     * <p>
     * In-app message content with all fields required for rendering an in-app message.
     * </p>
     * 
     * @param inAppMessage
     *        In-app message content with all fields required for rendering an in-app message.
     */

    public void setInAppMessage(InAppMessage inAppMessage) {
        this.inAppMessage = inAppMessage;
    }

    /**
     * <p>
     * In-app message content with all fields required for rendering an in-app message.
     * </p>
     * 
     * @return In-app message content with all fields required for rendering an in-app message.
     */

    public InAppMessage getInAppMessage() {
        return this.inAppMessage;
    }

    /**
     * <p>
     * In-app message content with all fields required for rendering an in-app message.
     * </p>
     * 
     * @param inAppMessage
     *        In-app message content with all fields required for rendering an in-app message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageCampaign withInAppMessage(InAppMessage inAppMessage) {
        setInAppMessage(inAppMessage);
        return this;
    }

    /**
     * <p>
     * Priority of the in-app message.
     * </p>
     * 
     * @param priority
     *        Priority of the in-app message.
     */

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    /**
     * <p>
     * Priority of the in-app message.
     * </p>
     * 
     * @return Priority of the in-app message.
     */

    public Integer getPriority() {
        return this.priority;
    }

    /**
     * <p>
     * Priority of the in-app message.
     * </p>
     * 
     * @param priority
     *        Priority of the in-app message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageCampaign withPriority(Integer priority) {
        setPriority(priority);
        return this;
    }

    /**
     * <p>
     * Schedule of the campaign.
     * </p>
     * 
     * @param schedule
     *        Schedule of the campaign.
     */

    public void setSchedule(InAppCampaignSchedule schedule) {
        this.schedule = schedule;
    }

    /**
     * <p>
     * Schedule of the campaign.
     * </p>
     * 
     * @return Schedule of the campaign.
     */

    public InAppCampaignSchedule getSchedule() {
        return this.schedule;
    }

    /**
     * <p>
     * Schedule of the campaign.
     * </p>
     * 
     * @param schedule
     *        Schedule of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageCampaign withSchedule(InAppCampaignSchedule schedule) {
        setSchedule(schedule);
        return this;
    }

    /**
     * <p>
     * Session cap which controls the number of times an in-app message can be shown to the endpoint during an
     * application session.
     * </p>
     * 
     * @param sessionCap
     *        Session cap which controls the number of times an in-app message can be shown to the endpoint during an
     *        application session.
     */

    public void setSessionCap(Integer sessionCap) {
        this.sessionCap = sessionCap;
    }

    /**
     * <p>
     * Session cap which controls the number of times an in-app message can be shown to the endpoint during an
     * application session.
     * </p>
     * 
     * @return Session cap which controls the number of times an in-app message can be shown to the endpoint during an
     *         application session.
     */

    public Integer getSessionCap() {
        return this.sessionCap;
    }

    /**
     * <p>
     * Session cap which controls the number of times an in-app message can be shown to the endpoint during an
     * application session.
     * </p>
     * 
     * @param sessionCap
     *        Session cap which controls the number of times an in-app message can be shown to the endpoint during an
     *        application session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageCampaign withSessionCap(Integer sessionCap) {
        setSessionCap(sessionCap);
        return this;
    }

    /**
     * <p>
     * Total cap which controls the number of times an in-app message can be shown to the endpoint.
     * </p>
     * 
     * @param totalCap
     *        Total cap which controls the number of times an in-app message can be shown to the endpoint.
     */

    public void setTotalCap(Integer totalCap) {
        this.totalCap = totalCap;
    }

    /**
     * <p>
     * Total cap which controls the number of times an in-app message can be shown to the endpoint.
     * </p>
     * 
     * @return Total cap which controls the number of times an in-app message can be shown to the endpoint.
     */

    public Integer getTotalCap() {
        return this.totalCap;
    }

    /**
     * <p>
     * Total cap which controls the number of times an in-app message can be shown to the endpoint.
     * </p>
     * 
     * @param totalCap
     *        Total cap which controls the number of times an in-app message can be shown to the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageCampaign withTotalCap(Integer totalCap) {
        setTotalCap(totalCap);
        return this;
    }

    /**
     * <p>
     * Treatment id of the campaign.
     * </p>
     * 
     * @param treatmentId
     *        Treatment id of the campaign.
     */

    public void setTreatmentId(String treatmentId) {
        this.treatmentId = treatmentId;
    }

    /**
     * <p>
     * Treatment id of the campaign.
     * </p>
     * 
     * @return Treatment id of the campaign.
     */

    public String getTreatmentId() {
        return this.treatmentId;
    }

    /**
     * <p>
     * Treatment id of the campaign.
     * </p>
     * 
     * @param treatmentId
     *        Treatment id of the campaign.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InAppMessageCampaign withTreatmentId(String treatmentId) {
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
        if (getCampaignId() != null)
            sb.append("CampaignId: ").append(getCampaignId()).append(",");
        if (getDailyCap() != null)
            sb.append("DailyCap: ").append(getDailyCap()).append(",");
        if (getInAppMessage() != null)
            sb.append("InAppMessage: ").append(getInAppMessage()).append(",");
        if (getPriority() != null)
            sb.append("Priority: ").append(getPriority()).append(",");
        if (getSchedule() != null)
            sb.append("Schedule: ").append(getSchedule()).append(",");
        if (getSessionCap() != null)
            sb.append("SessionCap: ").append(getSessionCap()).append(",");
        if (getTotalCap() != null)
            sb.append("TotalCap: ").append(getTotalCap()).append(",");
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

        if (obj instanceof InAppMessageCampaign == false)
            return false;
        InAppMessageCampaign other = (InAppMessageCampaign) obj;
        if (other.getCampaignId() == null ^ this.getCampaignId() == null)
            return false;
        if (other.getCampaignId() != null && other.getCampaignId().equals(this.getCampaignId()) == false)
            return false;
        if (other.getDailyCap() == null ^ this.getDailyCap() == null)
            return false;
        if (other.getDailyCap() != null && other.getDailyCap().equals(this.getDailyCap()) == false)
            return false;
        if (other.getInAppMessage() == null ^ this.getInAppMessage() == null)
            return false;
        if (other.getInAppMessage() != null && other.getInAppMessage().equals(this.getInAppMessage()) == false)
            return false;
        if (other.getPriority() == null ^ this.getPriority() == null)
            return false;
        if (other.getPriority() != null && other.getPriority().equals(this.getPriority()) == false)
            return false;
        if (other.getSchedule() == null ^ this.getSchedule() == null)
            return false;
        if (other.getSchedule() != null && other.getSchedule().equals(this.getSchedule()) == false)
            return false;
        if (other.getSessionCap() == null ^ this.getSessionCap() == null)
            return false;
        if (other.getSessionCap() != null && other.getSessionCap().equals(this.getSessionCap()) == false)
            return false;
        if (other.getTotalCap() == null ^ this.getTotalCap() == null)
            return false;
        if (other.getTotalCap() != null && other.getTotalCap().equals(this.getTotalCap()) == false)
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

        hashCode = prime * hashCode + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        hashCode = prime * hashCode + ((getDailyCap() == null) ? 0 : getDailyCap().hashCode());
        hashCode = prime * hashCode + ((getInAppMessage() == null) ? 0 : getInAppMessage().hashCode());
        hashCode = prime * hashCode + ((getPriority() == null) ? 0 : getPriority().hashCode());
        hashCode = prime * hashCode + ((getSchedule() == null) ? 0 : getSchedule().hashCode());
        hashCode = prime * hashCode + ((getSessionCap() == null) ? 0 : getSessionCap().hashCode());
        hashCode = prime * hashCode + ((getTotalCap() == null) ? 0 : getTotalCap().hashCode());
        hashCode = prime * hashCode + ((getTreatmentId() == null) ? 0 : getTreatmentId().hashCode());
        return hashCode;
    }

    @Override
    public InAppMessageCampaign clone() {
        try {
            return (InAppMessageCampaign) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.InAppMessageCampaignMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
