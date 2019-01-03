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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * This data type is used as a response element in the <a>DescribeEvents</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/Event" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Event implements Serializable, Cloneable {

    /**
     * <p>
     * Provides the identifier for the source of the event.
     * </p>
     */
    private String sourceIdentifier;
    /**
     * <p>
     * Specifies the source type for this event.
     * </p>
     */
    private String sourceType;
    /**
     * <p>
     * Provides the text of this event.
     * </p>
     */
    private String message;
    /**
     * <p>
     * Specifies the category for the event.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> eventCategories;
    /**
     * <p>
     * Specifies the date and time of the event.
     * </p>
     */
    private java.util.Date date;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the event.
     * </p>
     */
    private String sourceArn;

    /**
     * <p>
     * Provides the identifier for the source of the event.
     * </p>
     * 
     * @param sourceIdentifier
     *        Provides the identifier for the source of the event.
     */

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    /**
     * <p>
     * Provides the identifier for the source of the event.
     * </p>
     * 
     * @return Provides the identifier for the source of the event.
     */

    public String getSourceIdentifier() {
        return this.sourceIdentifier;
    }

    /**
     * <p>
     * Provides the identifier for the source of the event.
     * </p>
     * 
     * @param sourceIdentifier
     *        Provides the identifier for the source of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withSourceIdentifier(String sourceIdentifier) {
        setSourceIdentifier(sourceIdentifier);
        return this;
    }

    /**
     * <p>
     * Specifies the source type for this event.
     * </p>
     * 
     * @param sourceType
     *        Specifies the source type for this event.
     * @see SourceType
     */

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    /**
     * <p>
     * Specifies the source type for this event.
     * </p>
     * 
     * @return Specifies the source type for this event.
     * @see SourceType
     */

    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * <p>
     * Specifies the source type for this event.
     * </p>
     * 
     * @param sourceType
     *        Specifies the source type for this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public Event withSourceType(String sourceType) {
        setSourceType(sourceType);
        return this;
    }

    /**
     * <p>
     * Specifies the source type for this event.
     * </p>
     * 
     * @param sourceType
     *        Specifies the source type for this event.
     * @see SourceType
     */

    public void setSourceType(SourceType sourceType) {
        withSourceType(sourceType);
    }

    /**
     * <p>
     * Specifies the source type for this event.
     * </p>
     * 
     * @param sourceType
     *        Specifies the source type for this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SourceType
     */

    public Event withSourceType(SourceType sourceType) {
        this.sourceType = sourceType.toString();
        return this;
    }

    /**
     * <p>
     * Provides the text of this event.
     * </p>
     * 
     * @param message
     *        Provides the text of this event.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * Provides the text of this event.
     * </p>
     * 
     * @return Provides the text of this event.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * Provides the text of this event.
     * </p>
     * 
     * @param message
     *        Provides the text of this event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * Specifies the category for the event.
     * </p>
     * 
     * @return Specifies the category for the event.
     */

    public java.util.List<String> getEventCategories() {
        if (eventCategories == null) {
            eventCategories = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return eventCategories;
    }

    /**
     * <p>
     * Specifies the category for the event.
     * </p>
     * 
     * @param eventCategories
     *        Specifies the category for the event.
     */

    public void setEventCategories(java.util.Collection<String> eventCategories) {
        if (eventCategories == null) {
            this.eventCategories = null;
            return;
        }

        this.eventCategories = new com.amazonaws.internal.SdkInternalList<String>(eventCategories);
    }

    /**
     * <p>
     * Specifies the category for the event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventCategories(java.util.Collection)} or {@link #withEventCategories(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param eventCategories
     *        Specifies the category for the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventCategories(String... eventCategories) {
        if (this.eventCategories == null) {
            setEventCategories(new com.amazonaws.internal.SdkInternalList<String>(eventCategories.length));
        }
        for (String ele : eventCategories) {
            this.eventCategories.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the category for the event.
     * </p>
     * 
     * @param eventCategories
     *        Specifies the category for the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withEventCategories(java.util.Collection<String> eventCategories) {
        setEventCategories(eventCategories);
        return this;
    }

    /**
     * <p>
     * Specifies the date and time of the event.
     * </p>
     * 
     * @param date
     *        Specifies the date and time of the event.
     */

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    /**
     * <p>
     * Specifies the date and time of the event.
     * </p>
     * 
     * @return Specifies the date and time of the event.
     */

    public java.util.Date getDate() {
        return this.date;
    }

    /**
     * <p>
     * Specifies the date and time of the event.
     * </p>
     * 
     * @param date
     *        Specifies the date and time of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withDate(java.util.Date date) {
        setDate(date);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the event.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) for the event.
     */

    public void setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the event.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the event.
     */

    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the event.
     * </p>
     * 
     * @param sourceArn
     *        The Amazon Resource Name (ARN) for the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Event withSourceArn(String sourceArn) {
        setSourceArn(sourceArn);
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
        if (getSourceIdentifier() != null)
            sb.append("SourceIdentifier: ").append(getSourceIdentifier()).append(",");
        if (getSourceType() != null)
            sb.append("SourceType: ").append(getSourceType()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getEventCategories() != null)
            sb.append("EventCategories: ").append(getEventCategories()).append(",");
        if (getDate() != null)
            sb.append("Date: ").append(getDate()).append(",");
        if (getSourceArn() != null)
            sb.append("SourceArn: ").append(getSourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;
        if (other.getSourceIdentifier() == null ^ this.getSourceIdentifier() == null)
            return false;
        if (other.getSourceIdentifier() != null && other.getSourceIdentifier().equals(this.getSourceIdentifier()) == false)
            return false;
        if (other.getSourceType() == null ^ this.getSourceType() == null)
            return false;
        if (other.getSourceType() != null && other.getSourceType().equals(this.getSourceType()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getEventCategories() == null ^ this.getEventCategories() == null)
            return false;
        if (other.getEventCategories() != null && other.getEventCategories().equals(this.getEventCategories()) == false)
            return false;
        if (other.getDate() == null ^ this.getDate() == null)
            return false;
        if (other.getDate() != null && other.getDate().equals(this.getDate()) == false)
            return false;
        if (other.getSourceArn() == null ^ this.getSourceArn() == null)
            return false;
        if (other.getSourceArn() != null && other.getSourceArn().equals(this.getSourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSourceIdentifier() == null) ? 0 : getSourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getSourceType() == null) ? 0 : getSourceType().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getEventCategories() == null) ? 0 : getEventCategories().hashCode());
        hashCode = prime * hashCode + ((getDate() == null) ? 0 : getDate().hashCode());
        hashCode = prime * hashCode + ((getSourceArn() == null) ? 0 : getSourceArn().hashCode());
        return hashCode;
    }

    @Override
    public Event clone() {
        try {
            return (Event) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
