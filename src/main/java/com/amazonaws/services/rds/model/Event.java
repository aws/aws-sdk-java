/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

/**
 * <p>
 * 
 * </p>
 */
public class Event {

    /**
     * Provides the identifier for the source of the event.
     */
    private String sourceIdentifier;

    /**
     * Specifies the source type for this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     */
    private String sourceType;

    /**
     * Provides the text of this event.
     */
    private String message;

    /**
     * Specifies the date and time of the event.
     */
    private java.util.Date date;

    /**
     * Provides the identifier for the source of the event.
     *
     * @return Provides the identifier for the source of the event.
     */
    public String getSourceIdentifier() {
        return sourceIdentifier;
    }
    
    /**
     * Provides the identifier for the source of the event.
     *
     * @param sourceIdentifier Provides the identifier for the source of the event.
     */
    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }
    
    /**
     * Provides the identifier for the source of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceIdentifier Provides the identifier for the source of the event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Event withSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }
    
    
    /**
     * Specifies the source type for this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     *
     * @return Specifies the source type for this event.
     *
     * @see SourceType
     */
    public String getSourceType() {
        return sourceType;
    }
    
    /**
     * Specifies the source type for this event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     *
     * @param sourceType Specifies the source type for this event.
     *
     * @see SourceType
     */
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }
    
    /**
     * Specifies the source type for this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>db-instance, db-parameter-group, db-security-group, db-snapshot
     *
     * @param sourceType Specifies the source type for this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see SourceType
     */
    public Event withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    
    
    /**
     * Provides the text of this event.
     *
     * @return Provides the text of this event.
     */
    public String getMessage() {
        return message;
    }
    
    /**
     * Provides the text of this event.
     *
     * @param message Provides the text of this event.
     */
    public void setMessage(String message) {
        this.message = message;
    }
    
    /**
     * Provides the text of this event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param message Provides the text of this event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Event withMessage(String message) {
        this.message = message;
        return this;
    }
    
    
    /**
     * Specifies the date and time of the event.
     *
     * @return Specifies the date and time of the event.
     */
    public java.util.Date getDate() {
        return date;
    }
    
    /**
     * Specifies the date and time of the event.
     *
     * @param date Specifies the date and time of the event.
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }
    
    /**
     * Specifies the date and time of the event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param date Specifies the date and time of the event.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Event withDate(java.util.Date date) {
        this.date = date;
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
        
        sb.append("SourceIdentifier: " + sourceIdentifier + ", ");
        sb.append("SourceType: " + sourceType + ", ");
        sb.append("Message: " + message + ", ");
        sb.append("Date: " + date + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    