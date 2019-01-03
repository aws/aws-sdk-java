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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/AdminUpdateAuthEventFeedback"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AdminUpdateAuthEventFeedbackRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The user pool username.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The authentication event ID.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The authentication event feedback value.
     * </p>
     */
    private String feedbackValue;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @return The user pool ID.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminUpdateAuthEventFeedbackRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The user pool username.
     * </p>
     * 
     * @param username
     *        The user pool username.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user pool username.
     * </p>
     * 
     * @return The user pool username.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user pool username.
     * </p>
     * 
     * @param username
     *        The user pool username.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminUpdateAuthEventFeedbackRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The authentication event ID.
     * </p>
     * 
     * @param eventId
     *        The authentication event ID.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The authentication event ID.
     * </p>
     * 
     * @return The authentication event ID.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The authentication event ID.
     * </p>
     * 
     * @param eventId
     *        The authentication event ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminUpdateAuthEventFeedbackRequest withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The authentication event feedback value.
     * </p>
     * 
     * @param feedbackValue
     *        The authentication event feedback value.
     * @see FeedbackValueType
     */

    public void setFeedbackValue(String feedbackValue) {
        this.feedbackValue = feedbackValue;
    }

    /**
     * <p>
     * The authentication event feedback value.
     * </p>
     * 
     * @return The authentication event feedback value.
     * @see FeedbackValueType
     */

    public String getFeedbackValue() {
        return this.feedbackValue;
    }

    /**
     * <p>
     * The authentication event feedback value.
     * </p>
     * 
     * @param feedbackValue
     *        The authentication event feedback value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeedbackValueType
     */

    public AdminUpdateAuthEventFeedbackRequest withFeedbackValue(String feedbackValue) {
        setFeedbackValue(feedbackValue);
        return this;
    }

    /**
     * <p>
     * The authentication event feedback value.
     * </p>
     * 
     * @param feedbackValue
     *        The authentication event feedback value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeedbackValueType
     */

    public AdminUpdateAuthEventFeedbackRequest withFeedbackValue(FeedbackValueType feedbackValue) {
        this.feedbackValue = feedbackValue.toString();
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getFeedbackValue() != null)
            sb.append("FeedbackValue: ").append(getFeedbackValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminUpdateAuthEventFeedbackRequest == false)
            return false;
        AdminUpdateAuthEventFeedbackRequest other = (AdminUpdateAuthEventFeedbackRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getFeedbackValue() == null ^ this.getFeedbackValue() == null)
            return false;
        if (other.getFeedbackValue() != null && other.getFeedbackValue().equals(this.getFeedbackValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getFeedbackValue() == null) ? 0 : getFeedbackValue().hashCode());
        return hashCode;
    }

    @Override
    public AdminUpdateAuthEventFeedbackRequest clone() {
        return (AdminUpdateAuthEventFeedbackRequest) super.clone();
    }

}
