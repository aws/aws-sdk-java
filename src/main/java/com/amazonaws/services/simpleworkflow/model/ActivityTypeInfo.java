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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;


/**
 * <p>
 * Detailed information about an activity type.
 * </p>
 */
public class ActivityTypeInfo implements Serializable {

    /**
     * The <a>ActivityType</a> type structure representing the activity type.
     */
    private ActivityType activityType;

    /**
     * The current status of the activity type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     */
    private String status;

    /**
     * The description of the activity type provided in
     * <a>RegisterActivityType</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * The date and time this activity type was created through
     * <a>RegisterActivityType</a>.
     */
    private java.util.Date creationDate;

    /**
     * If DEPRECATED, the date and time <a>DeprecateActivityType</a> was
     * called.
     */
    private java.util.Date deprecationDate;

    /**
     * The <a>ActivityType</a> type structure representing the activity type.
     *
     * @return The <a>ActivityType</a> type structure representing the activity type.
     */
    public ActivityType getActivityType() {
        return activityType;
    }
    
    /**
     * The <a>ActivityType</a> type structure representing the activity type.
     *
     * @param activityType The <a>ActivityType</a> type structure representing the activity type.
     */
    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }
    
    /**
     * The <a>ActivityType</a> type structure representing the activity type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param activityType The <a>ActivityType</a> type structure representing the activity type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTypeInfo withActivityType(ActivityType activityType) {
        this.activityType = activityType;
        return this;
    }

    /**
     * The current status of the activity type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @return The current status of the activity type.
     *
     * @see RegistrationStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The current status of the activity type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param status The current status of the activity type.
     *
     * @see RegistrationStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The current status of the activity type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param status The current status of the activity type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RegistrationStatus
     */
    public ActivityTypeInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The current status of the activity type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param status The current status of the activity type.
     *
     * @see RegistrationStatus
     */
    public void setStatus(RegistrationStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The current status of the activity type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>REGISTERED, DEPRECATED
     *
     * @param status The current status of the activity type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RegistrationStatus
     */
    public ActivityTypeInfo withStatus(RegistrationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * The description of the activity type provided in
     * <a>RegisterActivityType</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The description of the activity type provided in
     *         <a>RegisterActivityType</a>.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the activity type provided in
     * <a>RegisterActivityType</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description The description of the activity type provided in
     *         <a>RegisterActivityType</a>.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the activity type provided in
     * <a>RegisterActivityType</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description The description of the activity type provided in
     *         <a>RegisterActivityType</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTypeInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The date and time this activity type was created through
     * <a>RegisterActivityType</a>.
     *
     * @return The date and time this activity type was created through
     *         <a>RegisterActivityType</a>.
     */
    public java.util.Date getCreationDate() {
        return creationDate;
    }
    
    /**
     * The date and time this activity type was created through
     * <a>RegisterActivityType</a>.
     *
     * @param creationDate The date and time this activity type was created through
     *         <a>RegisterActivityType</a>.
     */
    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }
    
    /**
     * The date and time this activity type was created through
     * <a>RegisterActivityType</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param creationDate The date and time this activity type was created through
     *         <a>RegisterActivityType</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTypeInfo withCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    /**
     * If DEPRECATED, the date and time <a>DeprecateActivityType</a> was
     * called.
     *
     * @return If DEPRECATED, the date and time <a>DeprecateActivityType</a> was
     *         called.
     */
    public java.util.Date getDeprecationDate() {
        return deprecationDate;
    }
    
    /**
     * If DEPRECATED, the date and time <a>DeprecateActivityType</a> was
     * called.
     *
     * @param deprecationDate If DEPRECATED, the date and time <a>DeprecateActivityType</a> was
     *         called.
     */
    public void setDeprecationDate(java.util.Date deprecationDate) {
        this.deprecationDate = deprecationDate;
    }
    
    /**
     * If DEPRECATED, the date and time <a>DeprecateActivityType</a> was
     * called.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deprecationDate If DEPRECATED, the date and time <a>DeprecateActivityType</a> was
     *         called.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ActivityTypeInfo withDeprecationDate(java.util.Date deprecationDate) {
        this.deprecationDate = deprecationDate;
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
        if (getActivityType() != null) sb.append("ActivityType: " + getActivityType() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getCreationDate() != null) sb.append("CreationDate: " + getCreationDate() + ",");
        if (getDeprecationDate() != null) sb.append("DeprecationDate: " + getDeprecationDate() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getActivityType() == null) ? 0 : getActivityType().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode()); 
        hashCode = prime * hashCode + ((getDeprecationDate() == null) ? 0 : getDeprecationDate().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ActivityTypeInfo == false) return false;
        ActivityTypeInfo other = (ActivityTypeInfo)obj;
        
        if (other.getActivityType() == null ^ this.getActivityType() == null) return false;
        if (other.getActivityType() != null && other.getActivityType().equals(this.getActivityType()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getCreationDate() == null ^ this.getCreationDate() == null) return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false) return false; 
        if (other.getDeprecationDate() == null ^ this.getDeprecationDate() == null) return false;
        if (other.getDeprecationDate() != null && other.getDeprecationDate().equals(this.getDeprecationDate()) == false) return false; 
        return true;
    }
    
}
    