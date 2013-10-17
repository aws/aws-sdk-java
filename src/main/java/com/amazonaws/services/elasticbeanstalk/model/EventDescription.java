/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;


/**
 * <p>
 * Describes an event.
 * </p>
 */
public class EventDescription implements Serializable {

    /**
     * The date when the event occurred.
     */
    private java.util.Date eventDate;

    /**
     * The event message.
     */
    private String message;

    /**
     * The application associated with the event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The release label for the application version associated with this
     * event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String versionLabel;

    /**
     * The name of the configuration associated with this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String templateName;

    /**
     * The name of the environment associated with this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     */
    private String environmentName;

    /**
     * The web service request ID for the activity of this event.
     */
    private String requestId;

    /**
     * The severity level of this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     */
    private String severity;

    /**
     * Default constructor for a new EventDescription object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public EventDescription() {}
    
    /**
     * The date when the event occurred.
     *
     * @return The date when the event occurred.
     */
    public java.util.Date getEventDate() {
        return eventDate;
    }
    
    /**
     * The date when the event occurred.
     *
     * @param eventDate The date when the event occurred.
     */
    public void setEventDate(java.util.Date eventDate) {
        this.eventDate = eventDate;
    }
    
    /**
     * The date when the event occurred.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param eventDate The date when the event occurred.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventDescription withEventDate(java.util.Date eventDate) {
        this.eventDate = eventDate;
        return this;
    }

    /**
     * The event message.
     *
     * @return The event message.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * The event message.
     *
     * @param message The event message.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * The event message.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message The event message.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventDescription withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * The application associated with the event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The application associated with the event.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The application associated with the event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The application associated with the event.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The application associated with the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The application associated with the event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventDescription withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The release label for the application version associated with this
     * event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The release label for the application version associated with this
     *         event.
     */
    public String getVersionLabel() {
        return versionLabel;
    }
    
    /**
     * The release label for the application version associated with this
     * event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel The release label for the application version associated with this
     *         event.
     */
    public void setVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
    }
    
    /**
     * The release label for the application version associated with this
     * event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param versionLabel The release label for the application version associated with this
     *         event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventDescription withVersionLabel(String versionLabel) {
        this.versionLabel = versionLabel;
        return this;
    }

    /**
     * The name of the configuration associated with this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The name of the configuration associated with this event.
     */
    public String getTemplateName() {
        return templateName;
    }
    
    /**
     * The name of the configuration associated with this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration associated with this event.
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    
    /**
     * The name of the configuration associated with this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param templateName The name of the configuration associated with this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventDescription withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * The name of the environment associated with this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @return The name of the environment associated with this event.
     */
    public String getEnvironmentName() {
        return environmentName;
    }
    
    /**
     * The name of the environment associated with this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment associated with this event.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }
    
    /**
     * The name of the environment associated with this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 23<br/>
     *
     * @param environmentName The name of the environment associated with this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventDescription withEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * The web service request ID for the activity of this event.
     *
     * @return The web service request ID for the activity of this event.
     */
    public String getRequestId() {
        return requestId;
    }
    
    /**
     * The web service request ID for the activity of this event.
     *
     * @param requestId The web service request ID for the activity of this event.
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    
    /**
     * The web service request ID for the activity of this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param requestId The web service request ID for the activity of this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public EventDescription withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * The severity level of this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     *
     * @return The severity level of this event.
     *
     * @see EventSeverity
     */
    public String getSeverity() {
        return severity;
    }
    
    /**
     * The severity level of this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     *
     * @param severity The severity level of this event.
     *
     * @see EventSeverity
     */
    public void setSeverity(String severity) {
        this.severity = severity;
    }
    
    /**
     * The severity level of this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     *
     * @param severity The severity level of this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see EventSeverity
     */
    public EventDescription withSeverity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * The severity level of this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     *
     * @param severity The severity level of this event.
     *
     * @see EventSeverity
     */
    public void setSeverity(EventSeverity severity) {
        this.severity = severity.toString();
    }
    
    /**
     * The severity level of this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRACE, DEBUG, INFO, WARN, ERROR, FATAL
     *
     * @param severity The severity level of this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see EventSeverity
     */
    public EventDescription withSeverity(EventSeverity severity) {
        this.severity = severity.toString();
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEventDate() != null) sb.append("EventDate: " + getEventDate() + ",");
        if (getMessage() != null) sb.append("Message: " + getMessage() + ",");
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getVersionLabel() != null) sb.append("VersionLabel: " + getVersionLabel() + ",");
        if (getTemplateName() != null) sb.append("TemplateName: " + getTemplateName() + ",");
        if (getEnvironmentName() != null) sb.append("EnvironmentName: " + getEnvironmentName() + ",");
        if (getRequestId() != null) sb.append("RequestId: " + getRequestId() + ",");
        if (getSeverity() != null) sb.append("Severity: " + getSeverity() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode()); 
        hashCode = prime * hashCode + ((getSeverity() == null) ? 0 : getSeverity().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EventDescription == false) return false;
        EventDescription other = (EventDescription)obj;
        
        if (other.getEventDate() == null ^ this.getEventDate() == null) return false;
        if (other.getEventDate() != null && other.getEventDate().equals(this.getEventDate()) == false) return false; 
        if (other.getMessage() == null ^ this.getMessage() == null) return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false) return false; 
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getVersionLabel() == null ^ this.getVersionLabel() == null) return false;
        if (other.getVersionLabel() != null && other.getVersionLabel().equals(this.getVersionLabel()) == false) return false; 
        if (other.getTemplateName() == null ^ this.getTemplateName() == null) return false;
        if (other.getTemplateName() != null && other.getTemplateName().equals(this.getTemplateName()) == false) return false; 
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null) return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false) return false; 
        if (other.getRequestId() == null ^ this.getRequestId() == null) return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false) return false; 
        if (other.getSeverity() == null ^ this.getSeverity() == null) return false;
        if (other.getSeverity() != null && other.getSeverity().equals(this.getSeverity()) == false) return false; 
        return true;
    }
    
}
    