/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Application settings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ApplicationSettingsResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSettingsResource implements Serializable, Cloneable, StructuredPojo {

    /** The unique ID for the application. */
    private String applicationId;
    /** The date that the settings were last updated in ISO 8601 format. */
    private String lastModifiedDate;
    /**
     * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign
     * overrides the default with limits of its own.
     */
    private CampaignLimits limits;
    /**
     * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the
     * campaign overrides the default with a quiet time of its own.
     */
    private QuietTime quietTime;

    /**
     * The unique ID for the application.
     * 
     * @param applicationId
     *        The unique ID for the application.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * The unique ID for the application.
     * 
     * @return The unique ID for the application.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * The unique ID for the application.
     * 
     * @param applicationId
     *        The unique ID for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsResource withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * The date that the settings were last updated in ISO 8601 format.
     * 
     * @param lastModifiedDate
     *        The date that the settings were last updated in ISO 8601 format.
     */

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * The date that the settings were last updated in ISO 8601 format.
     * 
     * @return The date that the settings were last updated in ISO 8601 format.
     */

    public String getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * The date that the settings were last updated in ISO 8601 format.
     * 
     * @param lastModifiedDate
     *        The date that the settings were last updated in ISO 8601 format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsResource withLastModifiedDate(String lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign
     * overrides the default with limits of its own.
     * 
     * @param limits
     *        The default campaign limits for the app. These limits apply to each campaign for the app, unless the
     *        campaign overrides the default with limits of its own.
     */

    public void setLimits(CampaignLimits limits) {
        this.limits = limits;
    }

    /**
     * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign
     * overrides the default with limits of its own.
     * 
     * @return The default campaign limits for the app. These limits apply to each campaign for the app, unless the
     *         campaign overrides the default with limits of its own.
     */

    public CampaignLimits getLimits() {
        return this.limits;
    }

    /**
     * The default campaign limits for the app. These limits apply to each campaign for the app, unless the campaign
     * overrides the default with limits of its own.
     * 
     * @param limits
     *        The default campaign limits for the app. These limits apply to each campaign for the app, unless the
     *        campaign overrides the default with limits of its own.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsResource withLimits(CampaignLimits limits) {
        setLimits(limits);
        return this;
    }

    /**
     * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the
     * campaign overrides the default with a quiet time of its own.
     * 
     * @param quietTime
     *        The default quiet time for the app. Each campaign for this app sends no messages during this time unless
     *        the campaign overrides the default with a quiet time of its own.
     */

    public void setQuietTime(QuietTime quietTime) {
        this.quietTime = quietTime;
    }

    /**
     * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the
     * campaign overrides the default with a quiet time of its own.
     * 
     * @return The default quiet time for the app. Each campaign for this app sends no messages during this time unless
     *         the campaign overrides the default with a quiet time of its own.
     */

    public QuietTime getQuietTime() {
        return this.quietTime;
    }

    /**
     * The default quiet time for the app. Each campaign for this app sends no messages during this time unless the
     * campaign overrides the default with a quiet time of its own.
     * 
     * @param quietTime
     *        The default quiet time for the app. Each campaign for this app sends no messages during this time unless
     *        the campaign overrides the default with a quiet time of its own.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettingsResource withQuietTime(QuietTime quietTime) {
        setQuietTime(quietTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
