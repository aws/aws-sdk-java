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
package com.amazonaws.services.iamrolesanywhere.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rolesanywhere-2018-05-10/PutNotificationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutNotificationSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of notification settings to be associated to the trust anchor.
     * </p>
     */
    private java.util.List<NotificationSetting> notificationSettings;
    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     */
    private String trustAnchorId;

    /**
     * <p>
     * A list of notification settings to be associated to the trust anchor.
     * </p>
     * 
     * @return A list of notification settings to be associated to the trust anchor.
     */

    public java.util.List<NotificationSetting> getNotificationSettings() {
        return notificationSettings;
    }

    /**
     * <p>
     * A list of notification settings to be associated to the trust anchor.
     * </p>
     * 
     * @param notificationSettings
     *        A list of notification settings to be associated to the trust anchor.
     */

    public void setNotificationSettings(java.util.Collection<NotificationSetting> notificationSettings) {
        if (notificationSettings == null) {
            this.notificationSettings = null;
            return;
        }

        this.notificationSettings = new java.util.ArrayList<NotificationSetting>(notificationSettings);
    }

    /**
     * <p>
     * A list of notification settings to be associated to the trust anchor.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationSettings(java.util.Collection)} or {@link #withNotificationSettings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param notificationSettings
     *        A list of notification settings to be associated to the trust anchor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutNotificationSettingsRequest withNotificationSettings(NotificationSetting... notificationSettings) {
        if (this.notificationSettings == null) {
            setNotificationSettings(new java.util.ArrayList<NotificationSetting>(notificationSettings.length));
        }
        for (NotificationSetting ele : notificationSettings) {
            this.notificationSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of notification settings to be associated to the trust anchor.
     * </p>
     * 
     * @param notificationSettings
     *        A list of notification settings to be associated to the trust anchor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutNotificationSettingsRequest withNotificationSettings(java.util.Collection<NotificationSetting> notificationSettings) {
        setNotificationSettings(notificationSettings);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     * 
     * @param trustAnchorId
     *        The unique identifier of the trust anchor.
     */

    public void setTrustAnchorId(String trustAnchorId) {
        this.trustAnchorId = trustAnchorId;
    }

    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     * 
     * @return The unique identifier of the trust anchor.
     */

    public String getTrustAnchorId() {
        return this.trustAnchorId;
    }

    /**
     * <p>
     * The unique identifier of the trust anchor.
     * </p>
     * 
     * @param trustAnchorId
     *        The unique identifier of the trust anchor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutNotificationSettingsRequest withTrustAnchorId(String trustAnchorId) {
        setTrustAnchorId(trustAnchorId);
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
        if (getNotificationSettings() != null)
            sb.append("NotificationSettings: ").append(getNotificationSettings()).append(",");
        if (getTrustAnchorId() != null)
            sb.append("TrustAnchorId: ").append(getTrustAnchorId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutNotificationSettingsRequest == false)
            return false;
        PutNotificationSettingsRequest other = (PutNotificationSettingsRequest) obj;
        if (other.getNotificationSettings() == null ^ this.getNotificationSettings() == null)
            return false;
        if (other.getNotificationSettings() != null && other.getNotificationSettings().equals(this.getNotificationSettings()) == false)
            return false;
        if (other.getTrustAnchorId() == null ^ this.getTrustAnchorId() == null)
            return false;
        if (other.getTrustAnchorId() != null && other.getTrustAnchorId().equals(this.getTrustAnchorId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotificationSettings() == null) ? 0 : getNotificationSettings().hashCode());
        hashCode = prime * hashCode + ((getTrustAnchorId() == null) ? 0 : getTrustAnchorId().hashCode());
        return hashCode;
    }

    @Override
    public PutNotificationSettingsRequest clone() {
        return (PutNotificationSettingsRequest) super.clone();
    }

}
