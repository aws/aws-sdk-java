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
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticbeanstalk-2010-12-01/EventDescription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The date when the event occurred.
     * </p>
     */
    private java.util.Date eventDate;
    /**
     * <p>
     * The event message.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The application associated with the event.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The release label for the application version associated with this event.
     * </p>
     */
    private String versionLabel;
    /**
     * <p>
     * The name of the configuration associated with this event.
     * </p>
     */
    private String templateName;
    /**
     * <p>
     * The name of the environment associated with this event.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The ARN of the platform.
     * </p>
     */
    private String platformArn;
    /**
     * <p>
     * The web service request ID for the activity of this event.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The severity level of this event.
     * </p>
     */
    private String severity;

    /**
     * <p>
     * The date when the event occurred.
     * </p>
     * 
     * @param eventDate
     *        The date when the event occurred.
     */

    public void setEventDate(java.util.Date eventDate) {
        this.eventDate = eventDate;
    }

    /**
     * <p>
     * The date when the event occurred.
     * </p>
     * 
     * @return The date when the event occurred.
     */

    public java.util.Date getEventDate() {
        return this.eventDate;
    }

    /**
     * <p>
     * The date when the event occurred.
     * </p>
     * 
     * @param eventDate
     *        The date when the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDescription withEventDate(java.util.Date eventDate) {
        setEventDate(eventDate);
        return this;
    }

    /**
     * <p>
     * The event message.
     * </p>
     * 
     * @param message
     *        The event message.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The event message.
     * </p>
     * 
     * @return The event message.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The event message.
     * </p>
     * 
     * @param message
     *        The event message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDescription withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The application associated with the event.
     * </p>
     * 
     * @param applicationName
     *        The application associated with the event.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The application associated with the event.
     * </p>
     * 
     * @return The application associated with the event.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The application associated with the event.
     * </p>
     * 
     * @param applicationName
     *        The application associated with the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDescription withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The release label for the application version associated with this event.
     * </p>
     * 
     * @param versionLabel
     *        The release label for the application version associated with this event.
     */

    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }

    /**
     * <p>
     * The release label for the application version associated with this event.
     * </p>
     * 
     * @return The release label for the application version associated with this event.
     */

    public String getVersionLabel() {
        return this.versionLabel;
    }

    /**
     * <p>
     * The release label for the application version associated with this event.
     * </p>
     * 
     * @param versionLabel
     *        The release label for the application version associated with this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDescription withVersionLabel(String versionLabel) {
        setVersionLabel(versionLabel);
        return this;
    }

    /**
     * <p>
     * The name of the configuration associated with this event.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration associated with this event.
     */

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * <p>
     * The name of the configuration associated with this event.
     * </p>
     * 
     * @return The name of the configuration associated with this event.
     */

    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * <p>
     * The name of the configuration associated with this event.
     * </p>
     * 
     * @param templateName
     *        The name of the configuration associated with this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDescription withTemplateName(String templateName) {
        setTemplateName(templateName);
        return this;
    }

    /**
     * <p>
     * The name of the environment associated with this event.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment associated with this event.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the environment associated with this event.
     * </p>
     * 
     * @return The name of the environment associated with this event.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the environment associated with this event.
     * </p>
     * 
     * @param environmentName
     *        The name of the environment associated with this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDescription withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The ARN of the platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform.
     */

    public void setPlatformArn(String platformArn) {
        this.platformArn = platformArn;
    }

    /**
     * <p>
     * The ARN of the platform.
     * </p>
     * 
     * @return The ARN of the platform.
     */

    public String getPlatformArn() {
        return this.platformArn;
    }

    /**
     * <p>
     * The ARN of the platform.
     * </p>
     * 
     * @param platformArn
     *        The ARN of the platform.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDescription withPlatformArn(String platformArn) {
        setPlatformArn(platformArn);
        return this;
    }

    /**
     * <p>
     * The web service request ID for the activity of this event.
     * </p>
     * 
     * @param requestId
     *        The web service request ID for the activity of this event.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The web service request ID for the activity of this event.
     * </p>
     * 
     * @return The web service request ID for the activity of this event.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The web service request ID for the activity of this event.
     * </p>
     * 
     * @param requestId
     *        The web service request ID for the activity of this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventDescription withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The severity level of this event.
     * </p>
     * 
     * @param severity
     *        The severity level of this event.
     * @see EventSeverity
     */

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    /**
     * <p>
     * The severity level of this event.
     * </p>
     * 
     * @return The severity level of this event.
     * @see EventSeverity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     * <p>
     * The severity level of this event.
     * </p>
     * 
     * @param severity
     *        The severity level of this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSeverity
     */

    public EventDescription withSeverity(String severity) {
        setSeverity(severity);
        return this;
    }

    /**
     * <p>
     * The severity level of this event.
     * </p>
     * 
     * @param severity
     *        The severity level of this event.
     * @see EventSeverity
     */

    public void setSeverity(EventSeverity severity) {
        withSeverity(severity);
    }

    /**
     * <p>
     * The severity level of this event.
     * </p>
     * 
     * @param severity
     *        The severity level of this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSeverity
     */

    public EventDescription withSeverity(EventSeverity severity) {
        this.severity = severity.toString();
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
        if (getEventDate() != null)
            sb.append("EventDate: ").append(getEventDate()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getVersionLabel() != null)
            sb.append("VersionLabel: ").append(getVersionLabel()).append(",");
        if (getTemplateName() != null)
            sb.append("TemplateName: ").append(getTemplateName()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getPlatformArn() != null)
            sb.append("PlatformArn: ").append(getPlatformArn()).append(",");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getSeverity() != null)
            sb.append("Severity: ").append(getSeverity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventDescription == false)
            return false;
        EventDescription other = (EventDescription) obj;
        if (other.getEventDate() == null ^ this.getEventDate() == null)
            return false;
        if (other.getEventDate() != null && other.getEventDate().equals(this.getEventDate()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null)
            return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false)
            return false;
        if (other.getTemplateName() == null ^ this.getTemplateName() == null)
            return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getPlatformArn() == null ^ this.getPlatformArn() == null)
            return false;
        if (other.getPlatformArn() != null && other.getPlatformArn().equals(this.getPlatformArn()) == false)
            return false;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getSeverity() == null ^ this.getSeverity() == null)
            return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventDate() == null) ? 0 : getEventDate().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getVersionLabel() == null) ? 0 : getVersionLabel().hashCode());
        hashCode = prime * hashCode + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getPlatformArn() == null) ? 0 : getPlatformArn().hashCode());
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        return hashCode;
    }

    @Override
    public EventDescription clone() {
        try {
            return (EventDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
