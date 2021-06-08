/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.servermigration.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sms-2016-10-24/NotifyAppValidationOutput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotifyAppValidationOutputRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the application.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The notification information.
     * </p>
     */
    private NotificationContext notificationContext;

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param appId
     *        The ID of the application.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @return The ID of the application.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The ID of the application.
     * </p>
     * 
     * @param appId
     *        The ID of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyAppValidationOutputRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The notification information.
     * </p>
     * 
     * @param notificationContext
     *        The notification information.
     */

    public void setNotificationContext(NotificationContext notificationContext) {
        this.notificationContext = notificationContext;
    }

    /**
     * <p>
     * The notification information.
     * </p>
     * 
     * @return The notification information.
     */

    public NotificationContext getNotificationContext() {
        return this.notificationContext;
    }

    /**
     * <p>
     * The notification information.
     * </p>
     * 
     * @param notificationContext
     *        The notification information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotifyAppValidationOutputRequest withNotificationContext(NotificationContext notificationContext) {
        setNotificationContext(notificationContext);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getNotificationContext() != null)
            sb.append("NotificationContext: ").append(getNotificationContext());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotifyAppValidationOutputRequest == false)
            return false;
        NotifyAppValidationOutputRequest other = (NotifyAppValidationOutputRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getNotificationContext() == null ^ this.getNotificationContext() == null)
            return false;
        if (other.getNotificationContext() != null && other.getNotificationContext().equals(this.getNotificationContext()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getNotificationContext() == null) ? 0 : getNotificationContext().hashCode());
        return hashCode;
    }

    @Override
    public NotifyAppValidationOutputRequest clone() {
        return (NotifyAppValidationOutputRequest) super.clone();
    }

}
