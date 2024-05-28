/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * The username of the user that you want to query or modify. The value of this parameter is typically your user's
     * username, but it can be any of their alias attributes. If <code>username</code> isn't an alias attribute in your
     * user pool, this value must be the <code>sub</code> of a local user or the username of a user from a third-party
     * IdP.
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
     * The authentication event feedback value. When you provide a <code>FeedbackValue</code> value of
     * <code>valid</code>, you tell Amazon Cognito that you trust a user session where Amazon Cognito has evaluated some
     * level of risk. When you provide a <code>FeedbackValue</code> value of <code>invalid</code>, you tell Amazon
     * Cognito that you don't trust a user session, or you don't believe that Amazon Cognito evaluated a high-enough
     * risk level.
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
     * The username of the user that you want to query or modify. The value of this parameter is typically your user's
     * username, but it can be any of their alias attributes. If <code>username</code> isn't an alias attribute in your
     * user pool, this value must be the <code>sub</code> of a local user or the username of a user from a third-party
     * IdP.
     * </p>
     * 
     * @param username
     *        The username of the user that you want to query or modify. The value of this parameter is typically your
     *        user's username, but it can be any of their alias attributes. If <code>username</code> isn't an alias
     *        attribute in your user pool, this value must be the <code>sub</code> of a local user or the username of a
     *        user from a third-party IdP.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The username of the user that you want to query or modify. The value of this parameter is typically your user's
     * username, but it can be any of their alias attributes. If <code>username</code> isn't an alias attribute in your
     * user pool, this value must be the <code>sub</code> of a local user or the username of a user from a third-party
     * IdP.
     * </p>
     * 
     * @return The username of the user that you want to query or modify. The value of this parameter is typically your
     *         user's username, but it can be any of their alias attributes. If <code>username</code> isn't an alias
     *         attribute in your user pool, this value must be the <code>sub</code> of a local user or the username of a
     *         user from a third-party IdP.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The username of the user that you want to query or modify. The value of this parameter is typically your user's
     * username, but it can be any of their alias attributes. If <code>username</code> isn't an alias attribute in your
     * user pool, this value must be the <code>sub</code> of a local user or the username of a user from a third-party
     * IdP.
     * </p>
     * 
     * @param username
     *        The username of the user that you want to query or modify. The value of this parameter is typically your
     *        user's username, but it can be any of their alias attributes. If <code>username</code> isn't an alias
     *        attribute in your user pool, this value must be the <code>sub</code> of a local user or the username of a
     *        user from a third-party IdP.
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
     * The authentication event feedback value. When you provide a <code>FeedbackValue</code> value of
     * <code>valid</code>, you tell Amazon Cognito that you trust a user session where Amazon Cognito has evaluated some
     * level of risk. When you provide a <code>FeedbackValue</code> value of <code>invalid</code>, you tell Amazon
     * Cognito that you don't trust a user session, or you don't believe that Amazon Cognito evaluated a high-enough
     * risk level.
     * </p>
     * 
     * @param feedbackValue
     *        The authentication event feedback value. When you provide a <code>FeedbackValue</code> value of
     *        <code>valid</code>, you tell Amazon Cognito that you trust a user session where Amazon Cognito has
     *        evaluated some level of risk. When you provide a <code>FeedbackValue</code> value of <code>invalid</code>,
     *        you tell Amazon Cognito that you don't trust a user session, or you don't believe that Amazon Cognito
     *        evaluated a high-enough risk level.
     * @see FeedbackValueType
     */

    public void setFeedbackValue(String feedbackValue) {
        this.feedbackValue = feedbackValue;
    }

    /**
     * <p>
     * The authentication event feedback value. When you provide a <code>FeedbackValue</code> value of
     * <code>valid</code>, you tell Amazon Cognito that you trust a user session where Amazon Cognito has evaluated some
     * level of risk. When you provide a <code>FeedbackValue</code> value of <code>invalid</code>, you tell Amazon
     * Cognito that you don't trust a user session, or you don't believe that Amazon Cognito evaluated a high-enough
     * risk level.
     * </p>
     * 
     * @return The authentication event feedback value. When you provide a <code>FeedbackValue</code> value of
     *         <code>valid</code>, you tell Amazon Cognito that you trust a user session where Amazon Cognito has
     *         evaluated some level of risk. When you provide a <code>FeedbackValue</code> value of <code>invalid</code>
     *         , you tell Amazon Cognito that you don't trust a user session, or you don't believe that Amazon Cognito
     *         evaluated a high-enough risk level.
     * @see FeedbackValueType
     */

    public String getFeedbackValue() {
        return this.feedbackValue;
    }

    /**
     * <p>
     * The authentication event feedback value. When you provide a <code>FeedbackValue</code> value of
     * <code>valid</code>, you tell Amazon Cognito that you trust a user session where Amazon Cognito has evaluated some
     * level of risk. When you provide a <code>FeedbackValue</code> value of <code>invalid</code>, you tell Amazon
     * Cognito that you don't trust a user session, or you don't believe that Amazon Cognito evaluated a high-enough
     * risk level.
     * </p>
     * 
     * @param feedbackValue
     *        The authentication event feedback value. When you provide a <code>FeedbackValue</code> value of
     *        <code>valid</code>, you tell Amazon Cognito that you trust a user session where Amazon Cognito has
     *        evaluated some level of risk. When you provide a <code>FeedbackValue</code> value of <code>invalid</code>,
     *        you tell Amazon Cognito that you don't trust a user session, or you don't believe that Amazon Cognito
     *        evaluated a high-enough risk level.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FeedbackValueType
     */

    public AdminUpdateAuthEventFeedbackRequest withFeedbackValue(String feedbackValue) {
        setFeedbackValue(feedbackValue);
        return this;
    }

    /**
     * <p>
     * The authentication event feedback value. When you provide a <code>FeedbackValue</code> value of
     * <code>valid</code>, you tell Amazon Cognito that you trust a user session where Amazon Cognito has evaluated some
     * level of risk. When you provide a <code>FeedbackValue</code> value of <code>invalid</code>, you tell Amazon
     * Cognito that you don't trust a user session, or you don't believe that Amazon Cognito evaluated a high-enough
     * risk level.
     * </p>
     * 
     * @param feedbackValue
     *        The authentication event feedback value. When you provide a <code>FeedbackValue</code> value of
     *        <code>valid</code>, you tell Amazon Cognito that you trust a user session where Amazon Cognito has
     *        evaluated some level of risk. When you provide a <code>FeedbackValue</code> value of <code>invalid</code>,
     *        you tell Amazon Cognito that you don't trust a user session, or you don't believe that Amazon Cognito
     *        evaluated a high-enough risk level.
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
