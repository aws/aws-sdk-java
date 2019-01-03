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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/UpdateNotificationSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateNotificationSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the HIT type whose notification specification is being updated.
     * </p>
     */
    private String hITTypeId;
    /**
     * <p>
     * The notification specification for the HIT type.
     * </p>
     */
    private NotificationSpecification notification;
    /**
     * <p>
     * Specifies whether notifications are sent for HITs of this HIT type, according to the notification specification.
     * You must specify either the Notification parameter or the Active parameter for the call to
     * UpdateNotificationSettings to succeed.
     * </p>
     */
    private Boolean active;

    /**
     * <p>
     * The ID of the HIT type whose notification specification is being updated.
     * </p>
     * 
     * @param hITTypeId
     *        The ID of the HIT type whose notification specification is being updated.
     */

    public void setHITTypeId(String hITTypeId) {
        this.hITTypeId = hITTypeId;
    }

    /**
     * <p>
     * The ID of the HIT type whose notification specification is being updated.
     * </p>
     * 
     * @return The ID of the HIT type whose notification specification is being updated.
     */

    public String getHITTypeId() {
        return this.hITTypeId;
    }

    /**
     * <p>
     * The ID of the HIT type whose notification specification is being updated.
     * </p>
     * 
     * @param hITTypeId
     *        The ID of the HIT type whose notification specification is being updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationSettingsRequest withHITTypeId(String hITTypeId) {
        setHITTypeId(hITTypeId);
        return this;
    }

    /**
     * <p>
     * The notification specification for the HIT type.
     * </p>
     * 
     * @param notification
     *        The notification specification for the HIT type.
     */

    public void setNotification(NotificationSpecification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The notification specification for the HIT type.
     * </p>
     * 
     * @return The notification specification for the HIT type.
     */

    public NotificationSpecification getNotification() {
        return this.notification;
    }

    /**
     * <p>
     * The notification specification for the HIT type.
     * </p>
     * 
     * @param notification
     *        The notification specification for the HIT type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationSettingsRequest withNotification(NotificationSpecification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * Specifies whether notifications are sent for HITs of this HIT type, according to the notification specification.
     * You must specify either the Notification parameter or the Active parameter for the call to
     * UpdateNotificationSettings to succeed.
     * </p>
     * 
     * @param active
     *        Specifies whether notifications are sent for HITs of this HIT type, according to the notification
     *        specification. You must specify either the Notification parameter or the Active parameter for the call to
     *        UpdateNotificationSettings to succeed.
     */

    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * <p>
     * Specifies whether notifications are sent for HITs of this HIT type, according to the notification specification.
     * You must specify either the Notification parameter or the Active parameter for the call to
     * UpdateNotificationSettings to succeed.
     * </p>
     * 
     * @return Specifies whether notifications are sent for HITs of this HIT type, according to the notification
     *         specification. You must specify either the Notification parameter or the Active parameter for the call to
     *         UpdateNotificationSettings to succeed.
     */

    public Boolean getActive() {
        return this.active;
    }

    /**
     * <p>
     * Specifies whether notifications are sent for HITs of this HIT type, according to the notification specification.
     * You must specify either the Notification parameter or the Active parameter for the call to
     * UpdateNotificationSettings to succeed.
     * </p>
     * 
     * @param active
     *        Specifies whether notifications are sent for HITs of this HIT type, according to the notification
     *        specification. You must specify either the Notification parameter or the Active parameter for the call to
     *        UpdateNotificationSettings to succeed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateNotificationSettingsRequest withActive(Boolean active) {
        setActive(active);
        return this;
    }

    /**
     * <p>
     * Specifies whether notifications are sent for HITs of this HIT type, according to the notification specification.
     * You must specify either the Notification parameter or the Active parameter for the call to
     * UpdateNotificationSettings to succeed.
     * </p>
     * 
     * @return Specifies whether notifications are sent for HITs of this HIT type, according to the notification
     *         specification. You must specify either the Notification parameter or the Active parameter for the call to
     *         UpdateNotificationSettings to succeed.
     */

    public Boolean isActive() {
        return this.active;
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
        if (getHITTypeId() != null)
            sb.append("HITTypeId: ").append(getHITTypeId()).append(",");
        if (getNotification() != null)
            sb.append("Notification: ").append(getNotification()).append(",");
        if (getActive() != null)
            sb.append("Active: ").append(getActive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateNotificationSettingsRequest == false)
            return false;
        UpdateNotificationSettingsRequest other = (UpdateNotificationSettingsRequest) obj;
        if (other.getHITTypeId() == null ^ this.getHITTypeId() == null)
            return false;
        if (other.getHITTypeId() != null && other.getHITTypeId().equals(this.getHITTypeId()) == false)
            return false;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null && other.getNotification().equals(this.getNotification()) == false)
            return false;
        if (other.getActive() == null ^ this.getActive() == null)
            return false;
        if (other.getActive() != null && other.getActive().equals(this.getActive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHITTypeId() == null) ? 0 : getHITTypeId().hashCode());
        hashCode = prime * hashCode + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getActive() == null) ? 0 : getActive().hashCode());
        return hashCode;
    }

    @Override
    public UpdateNotificationSettingsRequest clone() {
        return (UpdateNotificationSettingsRequest) super.clone();
    }

}
