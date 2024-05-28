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
package com.amazonaws.services.dataexchange.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dataexchange-2017-07-25/SendDataSetNotification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendDataSetNotificationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Affected scope of this notification such as the underlying resources affected by the notification event.
     * </p>
     */
    private ScopeDetails scope;
    /**
     * <p>
     * Idempotency key for the notification, this key allows us to deduplicate notifications that are sent in quick
     * succession erroneously.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Free-form text field for providers to add information about their notifications.
     * </p>
     */
    private String comment;
    /**
     * <p>
     * Affected data set of the notification.
     * </p>
     */
    private String dataSetId;
    /**
     * <p>
     * Extra details specific to this notification type.
     * </p>
     */
    private NotificationDetails details;
    /**
     * <p>
     * The type of the notification. Describing the kind of event the notification is alerting you to.
     * </p>
     */
    private String type;

    /**
     * <p>
     * Affected scope of this notification such as the underlying resources affected by the notification event.
     * </p>
     * 
     * @param scope
     *        Affected scope of this notification such as the underlying resources affected by the notification event.
     */

    public void setScope(ScopeDetails scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * Affected scope of this notification such as the underlying resources affected by the notification event.
     * </p>
     * 
     * @return Affected scope of this notification such as the underlying resources affected by the notification event.
     */

    public ScopeDetails getScope() {
        return this.scope;
    }

    /**
     * <p>
     * Affected scope of this notification such as the underlying resources affected by the notification event.
     * </p>
     * 
     * @param scope
     *        Affected scope of this notification such as the underlying resources affected by the notification event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataSetNotificationRequest withScope(ScopeDetails scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * Idempotency key for the notification, this key allows us to deduplicate notifications that are sent in quick
     * succession erroneously.
     * </p>
     * 
     * @param clientToken
     *        Idempotency key for the notification, this key allows us to deduplicate notifications that are sent in
     *        quick succession erroneously.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Idempotency key for the notification, this key allows us to deduplicate notifications that are sent in quick
     * succession erroneously.
     * </p>
     * 
     * @return Idempotency key for the notification, this key allows us to deduplicate notifications that are sent in
     *         quick succession erroneously.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Idempotency key for the notification, this key allows us to deduplicate notifications that are sent in quick
     * succession erroneously.
     * </p>
     * 
     * @param clientToken
     *        Idempotency key for the notification, this key allows us to deduplicate notifications that are sent in
     *        quick succession erroneously.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataSetNotificationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Free-form text field for providers to add information about their notifications.
     * </p>
     * 
     * @param comment
     *        Free-form text field for providers to add information about their notifications.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Free-form text field for providers to add information about their notifications.
     * </p>
     * 
     * @return Free-form text field for providers to add information about their notifications.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * Free-form text field for providers to add information about their notifications.
     * </p>
     * 
     * @param comment
     *        Free-form text field for providers to add information about their notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataSetNotificationRequest withComment(String comment) {
        setComment(comment);
        return this;
    }

    /**
     * <p>
     * Affected data set of the notification.
     * </p>
     * 
     * @param dataSetId
     *        Affected data set of the notification.
     */

    public void setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
    }

    /**
     * <p>
     * Affected data set of the notification.
     * </p>
     * 
     * @return Affected data set of the notification.
     */

    public String getDataSetId() {
        return this.dataSetId;
    }

    /**
     * <p>
     * Affected data set of the notification.
     * </p>
     * 
     * @param dataSetId
     *        Affected data set of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataSetNotificationRequest withDataSetId(String dataSetId) {
        setDataSetId(dataSetId);
        return this;
    }

    /**
     * <p>
     * Extra details specific to this notification type.
     * </p>
     * 
     * @param details
     *        Extra details specific to this notification type.
     */

    public void setDetails(NotificationDetails details) {
        this.details = details;
    }

    /**
     * <p>
     * Extra details specific to this notification type.
     * </p>
     * 
     * @return Extra details specific to this notification type.
     */

    public NotificationDetails getDetails() {
        return this.details;
    }

    /**
     * <p>
     * Extra details specific to this notification type.
     * </p>
     * 
     * @param details
     *        Extra details specific to this notification type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataSetNotificationRequest withDetails(NotificationDetails details) {
        setDetails(details);
        return this;
    }

    /**
     * <p>
     * The type of the notification. Describing the kind of event the notification is alerting you to.
     * </p>
     * 
     * @param type
     *        The type of the notification. Describing the kind of event the notification is alerting you to.
     * @see NotificationType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the notification. Describing the kind of event the notification is alerting you to.
     * </p>
     * 
     * @return The type of the notification. Describing the kind of event the notification is alerting you to.
     * @see NotificationType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the notification. Describing the kind of event the notification is alerting you to.
     * </p>
     * 
     * @param type
     *        The type of the notification. Describing the kind of event the notification is alerting you to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public SendDataSetNotificationRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the notification. Describing the kind of event the notification is alerting you to.
     * </p>
     * 
     * @param type
     *        The type of the notification. Describing the kind of event the notification is alerting you to.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationType
     */

    public SendDataSetNotificationRequest withType(NotificationType type) {
        this.type = type.toString();
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
        if (getScope() != null)
            sb.append("Scope: ").append(getScope()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getComment() != null)
            sb.append("Comment: ").append(getComment()).append(",");
        if (getDataSetId() != null)
            sb.append("DataSetId: ").append(getDataSetId()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendDataSetNotificationRequest == false)
            return false;
        SendDataSetNotificationRequest other = (SendDataSetNotificationRequest) obj;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null && other.getComment().equals(this.getComment()) == false)
            return false;
        if (other.getDataSetId() == null ^ this.getDataSetId() == null)
            return false;
        if (other.getDataSetId() != null && other.getDataSetId().equals(this.getDataSetId()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getComment() == null) ? 0 : getComment().hashCode());
        hashCode = prime * hashCode + ((getDataSetId() == null) ? 0 : getDataSetId().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public SendDataSetNotificationRequest clone() {
        return (SendDataSetNotificationRequest) super.clone();
    }

}
