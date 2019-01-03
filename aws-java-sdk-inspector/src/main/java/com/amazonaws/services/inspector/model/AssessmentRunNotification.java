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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used as one of the elements of the <a>AssessmentRun</a> data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/AssessmentRunNotification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentRunNotification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date of the notification.
     * </p>
     */
    private java.util.Date date;
    /**
     * <p>
     * The event for which a notification is sent.
     * </p>
     */
    private String event;
    /**
     * <p>
     * The message included in the notification.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The Boolean value that specifies whether the notification represents an error.
     * </p>
     */
    private Boolean error;
    /**
     * <p>
     * The SNS topic to which the SNS notification is sent.
     * </p>
     */
    private String snsTopicArn;
    /**
     * <p>
     * The status code of the SNS notification.
     * </p>
     */
    private String snsPublishStatusCode;

    /**
     * <p>
     * The date of the notification.
     * </p>
     * 
     * @param date
     *        The date of the notification.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * The date of the notification.
     * </p>
     * 
     * @return The date of the notification.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * The date of the notification.
     * </p>
     * 
     * @param date
     *        The date of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRunNotification withDate(java.util.Date date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * The event for which a notification is sent.
     * </p>
     * 
     * @param event
     *        The event for which a notification is sent.
     * @see InspectorEvent
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * The event for which a notification is sent.
     * </p>
     * 
     * @return The event for which a notification is sent.
     * @see InspectorEvent
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * The event for which a notification is sent.
     * </p>
     * 
     * @param event
     *        The event for which a notification is sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InspectorEvent
     */

    public AssessmentRunNotification withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The event for which a notification is sent.
     * </p>
     * 
     * @param event
     *        The event for which a notification is sent.
     * @see InspectorEvent
     */

    public void setEvent(InspectorEvent event) {
        withEvent(event);
    }

    /**
     * <p>
     * The event for which a notification is sent.
     * </p>
     * 
     * @param event
     *        The event for which a notification is sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InspectorEvent
     */

    public AssessmentRunNotification withEvent(InspectorEvent event) {
        this.event = event.toString();
        return this;
    }

    /**
     * <p>
     * The message included in the notification.
     * </p>
     * 
     * @param message
     *        The message included in the notification.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message included in the notification.
     * </p>
     * 
     * @return The message included in the notification.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message included in the notification.
     * </p>
     * 
     * @param message
     *        The message included in the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRunNotification withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The Boolean value that specifies whether the notification represents an error.
     * </p>
     * 
     * @param error
     *        The Boolean value that specifies whether the notification represents an error.
     */

    public void setError(Boolean error) {
        this.error = error;
    }

    /**
     * <p>
     * The Boolean value that specifies whether the notification represents an error.
     * </p>
     * 
     * @return The Boolean value that specifies whether the notification represents an error.
     */

    public Boolean getError() {
        return this.error;
    }

    /**
     * <p>
     * The Boolean value that specifies whether the notification represents an error.
     * </p>
     * 
     * @param error
     *        The Boolean value that specifies whether the notification represents an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRunNotification withError(Boolean error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The Boolean value that specifies whether the notification represents an error.
     * </p>
     * 
     * @return The Boolean value that specifies whether the notification represents an error.
     */

    public Boolean isError() {
        return this.error;
    }

    /**
     * <p>
     * The SNS topic to which the SNS notification is sent.
     * </p>
     * 
     * @param snsTopicArn
     *        The SNS topic to which the SNS notification is sent.
     */

    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic to which the SNS notification is sent.
     * </p>
     * 
     * @return The SNS topic to which the SNS notification is sent.
     */

    public String getSnsTopicArn() {
        return this.snsTopicArn;
    }

    /**
     * <p>
     * The SNS topic to which the SNS notification is sent.
     * </p>
     * 
     * @param snsTopicArn
     *        The SNS topic to which the SNS notification is sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentRunNotification withSnsTopicArn(String snsTopicArn) {
        setSnsTopicArn(snsTopicArn);
        return this;
    }

    /**
     * <p>
     * The status code of the SNS notification.
     * </p>
     * 
     * @param snsPublishStatusCode
     *        The status code of the SNS notification.
     * @see AssessmentRunNotificationSnsStatusCode
     */

    public void setSnsPublishStatusCode(String snsPublishStatusCode) {
        this.snsPublishStatusCode = snsPublishStatusCode;
    }

    /**
     * <p>
     * The status code of the SNS notification.
     * </p>
     * 
     * @return The status code of the SNS notification.
     * @see AssessmentRunNotificationSnsStatusCode
     */

    public String getSnsPublishStatusCode() {
        return this.snsPublishStatusCode;
    }

    /**
     * <p>
     * The status code of the SNS notification.
     * </p>
     * 
     * @param snsPublishStatusCode
     *        The status code of the SNS notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentRunNotificationSnsStatusCode
     */

    public AssessmentRunNotification withSnsPublishStatusCode(String snsPublishStatusCode) {
        setSnsPublishStatusCode(snsPublishStatusCode);
        return this;
    }

    /**
     * <p>
     * The status code of the SNS notification.
     * </p>
     * 
     * @param snsPublishStatusCode
     *        The status code of the SNS notification.
     * @see AssessmentRunNotificationSnsStatusCode
     */

    public void setSnsPublishStatusCode(AssessmentRunNotificationSnsStatusCode snsPublishStatusCode) {
        withSnsPublishStatusCode(snsPublishStatusCode);
    }

    /**
     * <p>
     * The status code of the SNS notification.
     * </p>
     * 
     * @param snsPublishStatusCode
     *        The status code of the SNS notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentRunNotificationSnsStatusCode
     */

    public AssessmentRunNotification withSnsPublishStatusCode(AssessmentRunNotificationSnsStatusCode snsPublishStatusCode) {
        this.snsPublishStatusCode = snsPublishStatusCode.toString();
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
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getSnsTopicArn() != null)
            sb.append("SnsTopicArn: ").append(getSnsTopicArn()).append(",");
        if (getSnsPublishStatusCode() != null)
            sb.append("SnsPublishStatusCode: ").append(getSnsPublishStatusCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentRunNotification == false)
            return false;
        AssessmentRunNotification other = (AssessmentRunNotification) obj;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getSnsTopicArn() == null ^ this.getSnsTopicArn() == null)
            return false;
        if (other.getSnsTopicArn() != null && other.getSnsTopicArn().equals(this.getSnsTopicArn()) == false)
            return false;
        if (other.getSnsPublishStatusCode() == null ^ this.getSnsPublishStatusCode() == null)
            return false;
        if (other.getSnsPublishStatusCode() != null && other.getSnsPublishStatusCode().equals(this.getSnsPublishStatusCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicArn() == null) ? 0 : getSnsTopicArn().hashCode());
        hashCode = prime * hashCode + ((getSnsPublishStatusCode() == null) ? 0 : getSnsPublishStatusCode().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentRunNotification clone() {
        try {
            return (AssessmentRunNotification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.AssessmentRunNotificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
