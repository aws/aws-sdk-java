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
 * Provides information about an application, including the default settings for an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ApplicationSettingsResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSettingsResource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The settings for the AWS Lambda function to use by default as a code hook for campaigns in the application.
     * </p>
     */
    private CampaignHook campaignHook;
    /**
     * <p>
     * The date and time, in ISO 8601 format, when the application's settings were last modified.
     * </p>
     */
    private String lastModifiedDate;
    /**
     * <p>
     * The default sending limits for campaigns in the application.
     * </p>
     */
    private CampaignLimits limits;
    /**
     * <p>
     * The default quiet time for campaigns in the application. Quiet time is a specific time range when campaigns don't
     * send messages to endpoints, if all the following conditions are met:
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
     * property for the application (or a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End
     * property for the application (or a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive messages from a campaign, even if quiet
     * time is enabled.
     * </p>
     */
    private QuietTime quietTime;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @return The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *         Amazon Pinpoint console.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsResource withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The settings for the AWS Lambda function to use by default as a code hook for campaigns in the application.
     * </p>
     * 
     * @param campaignHook
     *        The settings for the AWS Lambda function to use by default as a code hook for campaigns in the
     *        application.
     */

    public void setCampaignHook(CampaignHook campaignHook) {
        this.campaignHook = campaignHook;
    }

    /**
     * <p>
     * The settings for the AWS Lambda function to use by default as a code hook for campaigns in the application.
     * </p>
     * 
     * @return The settings for the AWS Lambda function to use by default as a code hook for campaigns in the
     *         application.
     */

    public CampaignHook getCampaignHook() {
        return this.campaignHook;
    }

    /**
     * <p>
     * The settings for the AWS Lambda function to use by default as a code hook for campaigns in the application.
     * </p>
     * 
     * @param campaignHook
     *        The settings for the AWS Lambda function to use by default as a code hook for campaigns in the
     *        application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsResource withCampaignHook(CampaignHook campaignHook) {
        setCampaignHook(campaignHook);
        return this;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the application's settings were last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time, in ISO 8601 format, when the application's settings were last modified.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the application's settings were last modified.
     * </p>
     * 
     * @return The date and time, in ISO 8601 format, when the application's settings were last modified.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time, in ISO 8601 format, when the application's settings were last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time, in ISO 8601 format, when the application's settings were last modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsResource withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The default sending limits for campaigns in the application.
     * </p>
     * 
     * @param limits
     *        The default sending limits for campaigns in the application.
     */

    public void setLimits(CampaignLimits limits) {
        this.limits = limits;
    }

    /**
     * <p>
     * The default sending limits for campaigns in the application.
     * </p>
     * 
     * @return The default sending limits for campaigns in the application.
     */

    public CampaignLimits getLimits() {
        return this.limits;
    }

    /**
     * <p>
     * The default sending limits for campaigns in the application.
     * </p>
     * 
     * @param limits
     *        The default sending limits for campaigns in the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsResource withLimits(CampaignLimits limits) {
        setLimits(limits);
        return this;
    }

    /**
     * <p>
     * The default quiet time for campaigns in the application. Quiet time is a specific time range when campaigns don't
     * send messages to endpoints, if all the following conditions are met:
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
     * property for the application (or a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End
     * property for the application (or a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive messages from a campaign, even if quiet
     * time is enabled.
     * </p>
     * 
     * @param quietTime
     *        The default quiet time for campaigns in the application. Quiet time is a specific time range when
     *        campaigns don't send messages to endpoints, if all the following conditions are met:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The EndpointDemographic.Timezone property of the endpoint is set to a valid value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The current time in the endpoint's time zone is later than or equal to the time specified by the
     *        QuietTime.Start property for the application (or a campaign that has custom quiet time settings).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The current time in the endpoint's time zone is earlier than or equal to the time specified by the
     *        QuietTime.End property for the application (or a campaign that has custom quiet time settings).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If any of the preceding conditions isn't met, the endpoint will receive messages from a campaign, even if
     *        quiet time is enabled.
     */

    public void setQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
    }

    /**
     * <p>
     * The default quiet time for campaigns in the application. Quiet time is a specific time range when campaigns don't
     * send messages to endpoints, if all the following conditions are met:
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
     * property for the application (or a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End
     * property for the application (or a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive messages from a campaign, even if quiet
     * time is enabled.
     * </p>
     * 
     * @return The default quiet time for campaigns in the application. Quiet time is a specific time range when
     *         campaigns don't send messages to endpoints, if all the following conditions are met:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         The EndpointDemographic.Timezone property of the endpoint is set to a valid value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The current time in the endpoint's time zone is later than or equal to the time specified by the
     *         QuietTime.Start property for the application (or a campaign that has custom quiet time settings).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The current time in the endpoint's time zone is earlier than or equal to the time specified by the
     *         QuietTime.End property for the application (or a campaign that has custom quiet time settings).
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If any of the preceding conditions isn't met, the endpoint will receive messages from a campaign, even if
     *         quiet time is enabled.
     */

    public QuietTime getQuietTime() {
        return this.quietTime;
    }

    /**
     * <p>
     * The default quiet time for campaigns in the application. Quiet time is a specific time range when campaigns don't
     * send messages to endpoints, if all the following conditions are met:
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
     * property for the application (or a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * <li>
     * <p>
     * The current time in the endpoint's time zone is earlier than or equal to the time specified by the QuietTime.End
     * property for the application (or a campaign that has custom quiet time settings).
     * </p>
     * </li>
     * </ul>
     * <p>
     * If any of the preceding conditions isn't met, the endpoint will receive messages from a campaign, even if quiet
     * time is enabled.
     * </p>
     * 
     * @param quietTime
     *        The default quiet time for campaigns in the application. Quiet time is a specific time range when
     *        campaigns don't send messages to endpoints, if all the following conditions are met:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        The EndpointDemographic.Timezone property of the endpoint is set to a valid value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The current time in the endpoint's time zone is later than or equal to the time specified by the
     *        QuietTime.Start property for the application (or a campaign that has custom quiet time settings).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The current time in the endpoint's time zone is earlier than or equal to the time specified by the
     *        QuietTime.End property for the application (or a campaign that has custom quiet time settings).
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If any of the preceding conditions isn't met, the endpoint will receive messages from a campaign, even if
     *        quiet time is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsResource withQuietTime(QuietTime quietTime) {
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getCampaignHook() != null)
            sb.append("CampaignHook: ").append(getCampaignHook()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getLimits() != null)
            sb.append("Limits: ").append(getLimits()).append(",");
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

        if (obj instanceof ApplicationSettingsResource == false)
            return false;
        ApplicationSettingsResource other = (ApplicationSettingsResource) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getCampaignHook() == null ^ this.getCampaignHook() == null)
            return false;
        if (other.getCampaignHook() != null && other.getCampaignHook().equals(this.getCampaignHook()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getLimits() == null ^ this.getLimits() == null)
            return false;
        if (other.getLimits() != null && other.getLimits().equals(this.getLimits()) == false)
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

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getCampaignHook() == null) ? 0 : getCampaignHook().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getLimits() == null) ? 0 : getLimits().hashCode());
        hashCode = prime * hashCode + ((getQuietTime() == null) ? 0 : getQuietTime().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSettingsResource clone() {
        try {
            return (ApplicationSettingsResource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ApplicationSettingsResourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
