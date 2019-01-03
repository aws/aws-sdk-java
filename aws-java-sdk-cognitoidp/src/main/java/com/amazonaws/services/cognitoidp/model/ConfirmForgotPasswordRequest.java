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
 * <p>
 * The request representing the confirmation for a password reset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmForgotPassword" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfirmForgotPasswordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The app client ID of the app associated with the user pool.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and
     * username plus the client ID in the message.
     * </p>
     */
    private String secretHash;
    /**
     * <p>
     * The user name of the user for whom you want to enter a code to retrieve a forgotten password.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The confirmation code sent by a user's request to retrieve a forgotten password. For more information, see
     * </p>
     */
    private String confirmationCode;
    /**
     * <p>
     * The password sent by a user's request to retrieve a forgotten password.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmForgotPassword</code> calls.
     * </p>
     */
    private AnalyticsMetadataType analyticsMetadata;
    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an
     * unexpected event by Amazon Cognito advanced security.
     * </p>
     */
    private UserContextDataType userContextData;

    /**
     * <p>
     * The app client ID of the app associated with the user pool.
     * </p>
     * 
     * @param clientId
     *        The app client ID of the app associated with the user pool.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The app client ID of the app associated with the user pool.
     * </p>
     * 
     * @return The app client ID of the app associated with the user pool.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The app client ID of the app associated with the user pool.
     * </p>
     * 
     * @param clientId
     *        The app client ID of the app associated with the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmForgotPasswordRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and
     * username plus the client ID in the message.
     * </p>
     * 
     * @param secretHash
     *        A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and
     *        username plus the client ID in the message.
     */

    public void setSecretHash(String secretHash) {
        this.secretHash = secretHash;
    }

    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and
     * username plus the client ID in the message.
     * </p>
     * 
     * @return A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and
     *         username plus the client ID in the message.
     */

    public String getSecretHash() {
        return this.secretHash;
    }

    /**
     * <p>
     * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and
     * username plus the client ID in the message.
     * </p>
     * 
     * @param secretHash
     *        A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and
     *        username plus the client ID in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmForgotPasswordRequest withSecretHash(String secretHash) {
        setSecretHash(secretHash);
        return this;
    }

    /**
     * <p>
     * The user name of the user for whom you want to enter a code to retrieve a forgotten password.
     * </p>
     * 
     * @param username
     *        The user name of the user for whom you want to enter a code to retrieve a forgotten password.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user for whom you want to enter a code to retrieve a forgotten password.
     * </p>
     * 
     * @return The user name of the user for whom you want to enter a code to retrieve a forgotten password.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name of the user for whom you want to enter a code to retrieve a forgotten password.
     * </p>
     * 
     * @param username
     *        The user name of the user for whom you want to enter a code to retrieve a forgotten password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmForgotPasswordRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The confirmation code sent by a user's request to retrieve a forgotten password. For more information, see
     * </p>
     * 
     * @param confirmationCode
     *        The confirmation code sent by a user's request to retrieve a forgotten password. For more information, see
     */

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }

    /**
     * <p>
     * The confirmation code sent by a user's request to retrieve a forgotten password. For more information, see
     * </p>
     * 
     * @return The confirmation code sent by a user's request to retrieve a forgotten password. For more information,
     *         see
     */

    public String getConfirmationCode() {
        return this.confirmationCode;
    }

    /**
     * <p>
     * The confirmation code sent by a user's request to retrieve a forgotten password. For more information, see
     * </p>
     * 
     * @param confirmationCode
     *        The confirmation code sent by a user's request to retrieve a forgotten password. For more information, see
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmForgotPasswordRequest withConfirmationCode(String confirmationCode) {
        setConfirmationCode(confirmationCode);
        return this;
    }

    /**
     * <p>
     * The password sent by a user's request to retrieve a forgotten password.
     * </p>
     * 
     * @param password
     *        The password sent by a user's request to retrieve a forgotten password.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password sent by a user's request to retrieve a forgotten password.
     * </p>
     * 
     * @return The password sent by a user's request to retrieve a forgotten password.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password sent by a user's request to retrieve a forgotten password.
     * </p>
     * 
     * @param password
     *        The password sent by a user's request to retrieve a forgotten password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmForgotPasswordRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmForgotPassword</code> calls.
     * </p>
     * 
     * @param analyticsMetadata
     *        The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmForgotPassword</code>
     *        calls.
     */

    public void setAnalyticsMetadata(AnalyticsMetadataType analyticsMetadata) {
        this.analyticsMetadata = analyticsMetadata;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmForgotPassword</code> calls.
     * </p>
     * 
     * @return The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmForgotPassword</code>
     *         calls.
     */

    public AnalyticsMetadataType getAnalyticsMetadata() {
        return this.analyticsMetadata;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmForgotPassword</code> calls.
     * </p>
     * 
     * @param analyticsMetadata
     *        The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmForgotPassword</code>
     *        calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmForgotPasswordRequest withAnalyticsMetadata(AnalyticsMetadataType analyticsMetadata) {
        setAnalyticsMetadata(analyticsMetadata);
        return this;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an
     * unexpected event by Amazon Cognito advanced security.
     * </p>
     * 
     * @param userContextData
     *        Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the
     *        risk of an unexpected event by Amazon Cognito advanced security.
     */

    public void setUserContextData(UserContextDataType userContextData) {
        this.userContextData = userContextData;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an
     * unexpected event by Amazon Cognito advanced security.
     * </p>
     * 
     * @return Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the
     *         risk of an unexpected event by Amazon Cognito advanced security.
     */

    public UserContextDataType getUserContextData() {
        return this.userContextData;
    }

    /**
     * <p>
     * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an
     * unexpected event by Amazon Cognito advanced security.
     * </p>
     * 
     * @param userContextData
     *        Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the
     *        risk of an unexpected event by Amazon Cognito advanced security.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmForgotPasswordRequest withUserContextData(UserContextDataType userContextData) {
        setUserContextData(userContextData);
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
        if (getClientId() != null)
            sb.append("ClientId: ").append("***Sensitive Data Redacted***").append(",");
        if (getSecretHash() != null)
            sb.append("SecretHash: ").append("***Sensitive Data Redacted***").append(",");
        if (getUsername() != null)
            sb.append("Username: ").append("***Sensitive Data Redacted***").append(",");
        if (getConfirmationCode() != null)
            sb.append("ConfirmationCode: ").append(getConfirmationCode()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getAnalyticsMetadata() != null)
            sb.append("AnalyticsMetadata: ").append(getAnalyticsMetadata()).append(",");
        if (getUserContextData() != null)
            sb.append("UserContextData: ").append(getUserContextData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfirmForgotPasswordRequest == false)
            return false;
        ConfirmForgotPasswordRequest other = (ConfirmForgotPasswordRequest) obj;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getSecretHash() == null ^ this.getSecretHash() == null)
            return false;
        if (other.getSecretHash() != null && other.getSecretHash().equals(this.getSecretHash()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getConfirmationCode() == null ^ this.getConfirmationCode() == null)
            return false;
        if (other.getConfirmationCode() != null && other.getConfirmationCode().equals(this.getConfirmationCode()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getAnalyticsMetadata() == null ^ this.getAnalyticsMetadata() == null)
            return false;
        if (other.getAnalyticsMetadata() != null && other.getAnalyticsMetadata().equals(this.getAnalyticsMetadata()) == false)
            return false;
        if (other.getUserContextData() == null ^ this.getUserContextData() == null)
            return false;
        if (other.getUserContextData() != null && other.getUserContextData().equals(this.getUserContextData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getSecretHash() == null) ? 0 : getSecretHash().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getConfirmationCode() == null) ? 0 : getConfirmationCode().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getAnalyticsMetadata() == null) ? 0 : getAnalyticsMetadata().hashCode());
        hashCode = prime * hashCode + ((getUserContextData() == null) ? 0 : getUserContextData().hashCode());
        return hashCode;
    }

    @Override
    public ConfirmForgotPasswordRequest clone() {
        return (ConfirmForgotPasswordRequest) super.clone();
    }

}
