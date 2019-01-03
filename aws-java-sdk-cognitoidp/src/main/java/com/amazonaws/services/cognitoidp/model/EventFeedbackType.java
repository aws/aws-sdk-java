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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the event feedback type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/EventFeedbackType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventFeedbackType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The event feedback value.
     * </p>
     */
    private String feedbackValue;
    /**
     * <p>
     * The provider.
     * </p>
     */
    private String provider;
    /**
     * <p>
     * The event feedback date.
     * </p>
     */
    private java.util.Date feedbackDate;

    /**
     * <p>
     * The event feedback value.
     * </p>
     * 
     * @param feedbackValue
     *        The event feedback value.
     * @see FeedbackValueType
     */

    public void setFeedbackValue(String feedbackValue) {
        this.feedbackValue = feedbackValue;
    }

    /**
     * <p>
     * The event feedback value.
     * </p>
     * 
     * @return The event feedback value.
     * @see FeedbackValueType
     */

    public String getFeedbackValue() {
        return this.feedbackValue;
    }

    /**
     * <p>
     * The event feedback value.
     * </p>
     * 
     * @param feedbackValue
     *        The event feedback value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeedbackValueType
     */

    public EventFeedbackType withFeedbackValue(String feedbackValue) {
        setFeedbackValue(feedbackValue);
        return this;
    }

    /**
     * <p>
     * The event feedback value.
     * </p>
     * 
     * @param feedbackValue
     *        The event feedback value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeedbackValueType
     */

    public EventFeedbackType withFeedbackValue(FeedbackValueType feedbackValue) {
        this.feedbackValue = feedbackValue.toString();
        return this;
    }

    /**
     * <p>
     * The provider.
     * </p>
     * 
     * @param provider
     *        The provider.
     */

    public void setProvider(String provider) {
        this.provider = provider;
    }

    /**
     * <p>
     * The provider.
     * </p>
     * 
     * @return The provider.
     */

    public String getProvider() {
        return this.provider;
    }

    /**
     * <p>
     * The provider.
     * </p>
     * 
     * @param provider
     *        The provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFeedbackType withProvider(String provider) {
        setProvider(provider);
        return this;
    }

    /**
     * <p>
     * The event feedback date.
     * </p>
     * 
     * @param feedbackDate
     *        The event feedback date.
     */

    public void setFeedbackDate(java.util.Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    /**
     * <p>
     * The event feedback date.
     * </p>
     * 
     * @return The event feedback date.
     */

    public java.util.Date getFeedbackDate() {
        return this.feedbackDate;
    }

    /**
     * <p>
     * The event feedback date.
     * </p>
     * 
     * @param feedbackDate
     *        The event feedback date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventFeedbackType withFeedbackDate(java.util.Date feedbackDate) {
        setFeedbackDate(feedbackDate);
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
        if (getFeedbackValue() != null)
            sb.append("FeedbackValue: ").append(getFeedbackValue()).append(",");
        if (getProvider() != null)
            sb.append("Provider: ").append(getProvider()).append(",");
        if (getFeedbackDate() != null)
            sb.append("FeedbackDate: ").append(getFeedbackDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventFeedbackType == false)
            return false;
        EventFeedbackType other = (EventFeedbackType) obj;
        if (other.getFeedbackValue() == null ^ this.getFeedbackValue() == null)
            return false;
        if (other.getFeedbackValue() != null && other.getFeedbackValue().equals(this.getFeedbackValue()) == false)
            return false;
        if (other.getProvider() == null ^ this.getProvider() == null)
            return false;
        if (other.getProvider() != null && other.getProvider().equals(this.getProvider()) == false)
            return false;
        if (other.getFeedbackDate() == null ^ this.getFeedbackDate() == null)
            return false;
        if (other.getFeedbackDate() != null && other.getFeedbackDate().equals(this.getFeedbackDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeedbackValue() == null) ? 0 : getFeedbackValue().hashCode());
        hashCode = prime * hashCode + ((getProvider() == null) ? 0 : getProvider().hashCode());
        hashCode = prime * hashCode + ((getFeedbackDate() == null) ? 0 : getFeedbackDate().hashCode());
        return hashCode;
    }

    @Override
    public EventFeedbackType clone() {
        try {
            return (EventFeedbackType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.EventFeedbackTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
