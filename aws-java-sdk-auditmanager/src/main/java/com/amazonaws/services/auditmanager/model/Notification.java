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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The notification used to inform a user of an update in AWS Audit Manager. For example, this includes the notification
 * that is sent when a control set is delegated for review.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/Notification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Notification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the notification.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The name of the related assessment.
     * </p>
     */
    private String assessmentName;
    /**
     * <p>
     * The identifier for the specified control set.
     * </p>
     */
    private String controlSetId;
    /**
     * <p>
     * Specifies the name of the control set that the notification is about.
     * </p>
     */
    private String controlSetName;
    /**
     * <p>
     * The description of the notification.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The time when the notification was sent.
     * </p>
     */
    private java.util.Date eventTime;
    /**
     * <p>
     * The sender of the notification.
     * </p>
     */
    private String source;

    /**
     * <p>
     * The unique identifier for the notification.
     * </p>
     * 
     * @param id
     *        The unique identifier for the notification.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the notification.
     * </p>
     * 
     * @return The unique identifier for the notification.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the notification.
     * </p>
     * 
     * @param id
     *        The unique identifier for the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notification withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the specified assessment.
     */

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @return The identifier for the specified assessment.
     */

    public String getAssessmentId() {
        return this.assessmentId;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notification withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
        return this;
    }

    /**
     * <p>
     * The name of the related assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name of the related assessment.
     */

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    /**
     * <p>
     * The name of the related assessment.
     * </p>
     * 
     * @return The name of the related assessment.
     */

    public String getAssessmentName() {
        return this.assessmentName;
    }

    /**
     * <p>
     * The name of the related assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name of the related assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notification withAssessmentName(String assessmentName) {
        setAssessmentName(assessmentName);
        return this;
    }

    /**
     * <p>
     * The identifier for the specified control set.
     * </p>
     * 
     * @param controlSetId
     *        The identifier for the specified control set.
     */

    public void setControlSetId(String controlSetId) {
        this.controlSetId = controlSetId;
    }

    /**
     * <p>
     * The identifier for the specified control set.
     * </p>
     * 
     * @return The identifier for the specified control set.
     */

    public String getControlSetId() {
        return this.controlSetId;
    }

    /**
     * <p>
     * The identifier for the specified control set.
     * </p>
     * 
     * @param controlSetId
     *        The identifier for the specified control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notification withControlSetId(String controlSetId) {
        setControlSetId(controlSetId);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the control set that the notification is about.
     * </p>
     * 
     * @param controlSetName
     *        Specifies the name of the control set that the notification is about.
     */

    public void setControlSetName(String controlSetName) {
        this.controlSetName = controlSetName;
    }

    /**
     * <p>
     * Specifies the name of the control set that the notification is about.
     * </p>
     * 
     * @return Specifies the name of the control set that the notification is about.
     */

    public String getControlSetName() {
        return this.controlSetName;
    }

    /**
     * <p>
     * Specifies the name of the control set that the notification is about.
     * </p>
     * 
     * @param controlSetName
     *        Specifies the name of the control set that the notification is about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notification withControlSetName(String controlSetName) {
        setControlSetName(controlSetName);
        return this;
    }

    /**
     * <p>
     * The description of the notification.
     * </p>
     * 
     * @param description
     *        The description of the notification.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the notification.
     * </p>
     * 
     * @return The description of the notification.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the notification.
     * </p>
     * 
     * @param description
     *        The description of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notification withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The time when the notification was sent.
     * </p>
     * 
     * @param eventTime
     *        The time when the notification was sent.
     */

    public void setEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * <p>
     * The time when the notification was sent.
     * </p>
     * 
     * @return The time when the notification was sent.
     */

    public java.util.Date getEventTime() {
        return this.eventTime;
    }

    /**
     * <p>
     * The time when the notification was sent.
     * </p>
     * 
     * @param eventTime
     *        The time when the notification was sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notification withEventTime(java.util.Date eventTime) {
        setEventTime(eventTime);
        return this;
    }

    /**
     * <p>
     * The sender of the notification.
     * </p>
     * 
     * @param source
     *        The sender of the notification.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The sender of the notification.
     * </p>
     * 
     * @return The sender of the notification.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The sender of the notification.
     * </p>
     * 
     * @param source
     *        The sender of the notification.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Notification withSource(String source) {
        setSource(source);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getAssessmentId() != null)
            sb.append("AssessmentId: ").append(getAssessmentId()).append(",");
        if (getAssessmentName() != null)
            sb.append("AssessmentName: ").append(getAssessmentName()).append(",");
        if (getControlSetId() != null)
            sb.append("ControlSetId: ").append(getControlSetId()).append(",");
        if (getControlSetName() != null)
            sb.append("ControlSetName: ").append(getControlSetName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEventTime() != null)
            sb.append("EventTime: ").append(getEventTime()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Notification == false)
            return false;
        Notification other = (Notification) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
            return false;
        if (other.getAssessmentName() == null ^ this.getAssessmentName() == null)
            return false;
        if (other.getAssessmentName() != null && other.getAssessmentName().equals(this.getAssessmentName()) == false)
            return false;
        if (other.getControlSetId() == null ^ this.getControlSetId() == null)
            return false;
        if (other.getControlSetId() != null && other.getControlSetId().equals(this.getControlSetId()) == false)
            return false;
        if (other.getControlSetName() == null ^ this.getControlSetName() == null)
            return false;
        if (other.getControlSetName() != null && other.getControlSetName().equals(this.getControlSetName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEventTime() == null ^ this.getEventTime() == null)
            return false;
        if (other.getEventTime() != null && other.getEventTime().equals(this.getEventTime()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        hashCode = prime * hashCode + ((getAssessmentName() == null) ? 0 : getAssessmentName().hashCode());
        hashCode = prime * hashCode + ((getControlSetId() == null) ? 0 : getControlSetId().hashCode());
        hashCode = prime * hashCode + ((getControlSetName() == null) ? 0 : getControlSetName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        return hashCode;
    }

    @Override
    public Notification clone() {
        try {
            return (Notification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.NotificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
