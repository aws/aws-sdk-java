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
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about an activity type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ActivityTypeInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ActivityTypeInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a>ActivityType</a> type structure representing the activity type.
     * </p>
     */
    private ActivityType activityType;
    /**
     * <p>
     * The current status of the activity type.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The description of the activity type provided in <a>RegisterActivityType</a>.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time this activity type was created through <a>RegisterActivityType</a>.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * If DEPRECATED, the date and time <a>DeprecateActivityType</a> was called.
     * </p>
     */
    private java.util.Date deprecationDate;

    /**
     * <p>
     * The <a>ActivityType</a> type structure representing the activity type.
     * </p>
     * 
     * @param activityType
     *        The <a>ActivityType</a> type structure representing the activity type.
     */

    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }

    /**
     * <p>
     * The <a>ActivityType</a> type structure representing the activity type.
     * </p>
     * 
     * @return The <a>ActivityType</a> type structure representing the activity type.
     */

    public ActivityType getActivityType() {
        return this.activityType;
    }

    /**
     * <p>
     * The <a>ActivityType</a> type structure representing the activity type.
     * </p>
     * 
     * @param activityType
     *        The <a>ActivityType</a> type structure representing the activity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTypeInfo withActivityType(ActivityType activityType) {
        setActivityType(activityType);
        return this;
    }

    /**
     * <p>
     * The current status of the activity type.
     * </p>
     * 
     * @param status
     *        The current status of the activity type.
     * @see RegistrationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the activity type.
     * </p>
     * 
     * @return The current status of the activity type.
     * @see RegistrationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the activity type.
     * </p>
     * 
     * @param status
     *        The current status of the activity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public ActivityTypeInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the activity type.
     * </p>
     * 
     * @param status
     *        The current status of the activity type.
     * @see RegistrationStatus
     */

    public void setStatus(RegistrationStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The current status of the activity type.
     * </p>
     * 
     * @param status
     *        The current status of the activity type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RegistrationStatus
     */

    public ActivityTypeInfo withStatus(RegistrationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The description of the activity type provided in <a>RegisterActivityType</a>.
     * </p>
     * 
     * @param description
     *        The description of the activity type provided in <a>RegisterActivityType</a>.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the activity type provided in <a>RegisterActivityType</a>.
     * </p>
     * 
     * @return The description of the activity type provided in <a>RegisterActivityType</a>.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the activity type provided in <a>RegisterActivityType</a>.
     * </p>
     * 
     * @param description
     *        The description of the activity type provided in <a>RegisterActivityType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTypeInfo withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time this activity type was created through <a>RegisterActivityType</a>.
     * </p>
     * 
     * @param creationDate
     *        The date and time this activity type was created through <a>RegisterActivityType</a>.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time this activity type was created through <a>RegisterActivityType</a>.
     * </p>
     * 
     * @return The date and time this activity type was created through <a>RegisterActivityType</a>.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time this activity type was created through <a>RegisterActivityType</a>.
     * </p>
     * 
     * @param creationDate
     *        The date and time this activity type was created through <a>RegisterActivityType</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTypeInfo withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * If DEPRECATED, the date and time <a>DeprecateActivityType</a> was called.
     * </p>
     * 
     * @param deprecationDate
     *        If DEPRECATED, the date and time <a>DeprecateActivityType</a> was called.
     */

    public void setDeprecationDate(java.util.Date deprecationDate) {
        this.deprecationDate = deprecationDate;
    }

    /**
     * <p>
     * If DEPRECATED, the date and time <a>DeprecateActivityType</a> was called.
     * </p>
     * 
     * @return If DEPRECATED, the date and time <a>DeprecateActivityType</a> was called.
     */

    public java.util.Date getDeprecationDate() {
        return this.deprecationDate;
    }

    /**
     * <p>
     * If DEPRECATED, the date and time <a>DeprecateActivityType</a> was called.
     * </p>
     * 
     * @param deprecationDate
     *        If DEPRECATED, the date and time <a>DeprecateActivityType</a> was called.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ActivityTypeInfo withDeprecationDate(java.util.Date deprecationDate) {
        setDeprecationDate(deprecationDate);
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
        if (getActivityType() != null)
            sb.append("ActivityType: ").append(getActivityType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getDeprecationDate() != null)
            sb.append("DeprecationDate: ").append(getDeprecationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivityTypeInfo == false)
            return false;
        ActivityTypeInfo other = (ActivityTypeInfo) obj;
        if (other.getActivityType() == null ^ this.getActivityType() == null)
            return false;
        if (other.getActivityType() != null && other.getActivityType().equals(this.getActivityType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getDeprecationDate() == null ^ this.getDeprecationDate() == null)
            return false;
        if (other.getDeprecationDate() != null && other.getDeprecationDate().equals(this.getDeprecationDate()) == false)
            return false;
        return true;
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
    public ActivityTypeInfo clone() {
        try {
            return (ActivityTypeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleworkflow.model.transform.ActivityTypeInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
