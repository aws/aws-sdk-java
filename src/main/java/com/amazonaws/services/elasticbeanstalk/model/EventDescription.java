/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes an event.
 * </p>
 */
public class EventDescription {

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
        sb.append("EventDate: " + eventDate + ", ");
        sb.append("Message: " + message + ", ");
        sb.append("ApplicationName: " + applicationName + ", ");
        sb.append("VersionLabel: " + versionLabel + ", ");
        sb.append("TemplateName: " + templateName + ", ");
        sb.append("EnvironmentName: " + environmentName + ", ");
        sb.append("RequestId: " + requestId + ", ");
        sb.append("Severity: " + severity + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    