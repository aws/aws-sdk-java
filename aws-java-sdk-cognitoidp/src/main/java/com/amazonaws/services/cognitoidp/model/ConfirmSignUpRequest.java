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
 * Represents the request to confirm registration of a user.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/ConfirmSignUp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConfirmSignUpRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the app client associated with the user pool.
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
     * The user name of the user whose registration you wish to confirm.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The confirmation code sent by a user's request to confirm registration.
     * </p>
     */
    private String confirmationCode;
    /**
     * <p>
     * Boolean to be specified to force user confirmation irrespective of existing alias. By default set to
     * <code>False</code>. If this parameter is set to <code>True</code> and the phone number/email used for sign up
     * confirmation already exists as an alias with a different user, the API call will migrate the alias from the
     * previous user to the newly created user being confirmed. If set to <code>False</code>, the API will throw an
     * <b>AliasExistsException</b> error.
     * </p>
     */
    private Boolean forceAliasCreation;
    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmSignUp</code> calls.
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
     * The ID of the app client associated with the user pool.
     * </p>
     * 
     * @param clientId
     *        The ID of the app client associated with the user pool.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The ID of the app client associated with the user pool.
     * </p>
     * 
     * @return The ID of the app client associated with the user pool.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The ID of the app client associated with the user pool.
     * </p>
     * 
     * @param clientId
     *        The ID of the app client associated with the user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmSignUpRequest withClientId(String clientId) {
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

    public ConfirmSignUpRequest withSecretHash(String secretHash) {
        setSecretHash(secretHash);
        return this;
    }

    /**
     * <p>
     * The user name of the user whose registration you wish to confirm.
     * </p>
     * 
     * @param username
     *        The user name of the user whose registration you wish to confirm.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user whose registration you wish to confirm.
     * </p>
     * 
     * @return The user name of the user whose registration you wish to confirm.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name of the user whose registration you wish to confirm.
     * </p>
     * 
     * @param username
     *        The user name of the user whose registration you wish to confirm.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmSignUpRequest withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The confirmation code sent by a user's request to confirm registration.
     * </p>
     * 
     * @param confirmationCode
     *        The confirmation code sent by a user's request to confirm registration.
     */

    public void setConfirmationCode(String confirmationCode) {
        this.confirmationCode = confirmationCode;
    }

    /**
     * <p>
     * The confirmation code sent by a user's request to confirm registration.
     * </p>
     * 
     * @return The confirmation code sent by a user's request to confirm registration.
     */

    public String getConfirmationCode() {
        return this.confirmationCode;
    }

    /**
     * <p>
     * The confirmation code sent by a user's request to confirm registration.
     * </p>
     * 
     * @param confirmationCode
     *        The confirmation code sent by a user's request to confirm registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmSignUpRequest withConfirmationCode(String confirmationCode) {
        setConfirmationCode(confirmationCode);
        return this;
    }

    /**
     * <p>
     * Boolean to be specified to force user confirmation irrespective of existing alias. By default set to
     * <code>False</code>. If this parameter is set to <code>True</code> and the phone number/email used for sign up
     * confirmation already exists as an alias with a different user, the API call will migrate the alias from the
     * previous user to the newly created user being confirmed. If set to <code>False</code>, the API will throw an
     * <b>AliasExistsException</b> error.
     * </p>
     * 
     * @param forceAliasCreation
     *        Boolean to be specified to force user confirmation irrespective of existing alias. By default set to
     *        <code>False</code>. If this parameter is set to <code>True</code> and the phone number/email used for sign
     *        up confirmation already exists as an alias with a different user, the API call will migrate the alias from
     *        the previous user to the newly created user being confirmed. If set to <code>False</code>, the API will
     *        throw an <b>AliasExistsException</b> error.
     */

    public void setForceAliasCreation(Boolean forceAliasCreation) {
        this.forceAliasCreation = forceAliasCreation;
    }

    /**
     * <p>
     * Boolean to be specified to force user confirmation irrespective of existing alias. By default set to
     * <code>False</code>. If this parameter is set to <code>True</code> and the phone number/email used for sign up
     * confirmation already exists as an alias with a different user, the API call will migrate the alias from the
     * previous user to the newly created user being confirmed. If set to <code>False</code>, the API will throw an
     * <b>AliasExistsException</b> error.
     * </p>
     * 
     * @return Boolean to be specified to force user confirmation irrespective of existing alias. By default set to
     *         <code>False</code>. If this parameter is set to <code>True</code> and the phone number/email used for
     *         sign up confirmation already exists as an alias with a different user, the API call will migrate the
     *         alias from the previous user to the newly created user being confirmed. If set to <code>False</code>, the
     *         API will throw an <b>AliasExistsException</b> error.
     */

    public Boolean getForceAliasCreation() {
        return this.forceAliasCreation;
    }

    /**
     * <p>
     * Boolean to be specified to force user confirmation irrespective of existing alias. By default set to
     * <code>False</code>. If this parameter is set to <code>True</code> and the phone number/email used for sign up
     * confirmation already exists as an alias with a different user, the API call will migrate the alias from the
     * previous user to the newly created user being confirmed. If set to <code>False</code>, the API will throw an
     * <b>AliasExistsException</b> error.
     * </p>
     * 
     * @param forceAliasCreation
     *        Boolean to be specified to force user confirmation irrespective of existing alias. By default set to
     *        <code>False</code>. If this parameter is set to <code>True</code> and the phone number/email used for sign
     *        up confirmation already exists as an alias with a different user, the API call will migrate the alias from
     *        the previous user to the newly created user being confirmed. If set to <code>False</code>, the API will
     *        throw an <b>AliasExistsException</b> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmSignUpRequest withForceAliasCreation(Boolean forceAliasCreation) {
        setForceAliasCreation(forceAliasCreation);
        return this;
    }

    /**
     * <p>
     * Boolean to be specified to force user confirmation irrespective of existing alias. By default set to
     * <code>False</code>. If this parameter is set to <code>True</code> and the phone number/email used for sign up
     * confirmation already exists as an alias with a different user, the API call will migrate the alias from the
     * previous user to the newly created user being confirmed. If set to <code>False</code>, the API will throw an
     * <b>AliasExistsException</b> error.
     * </p>
     * 
     * @return Boolean to be specified to force user confirmation irrespective of existing alias. By default set to
     *         <code>False</code>. If this parameter is set to <code>True</code> and the phone number/email used for
     *         sign up confirmation already exists as an alias with a different user, the API call will migrate the
     *         alias from the previous user to the newly created user being confirmed. If set to <code>False</code>, the
     *         API will throw an <b>AliasExistsException</b> error.
     */

    public Boolean isForceAliasCreation() {
        return this.forceAliasCreation;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmSignUp</code> calls.
     * </p>
     * 
     * @param analyticsMetadata
     *        The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmSignUp</code> calls.
     */

    public void setAnalyticsMetadata(AnalyticsMetadataType analyticsMetadata) {
        this.analyticsMetadata = analyticsMetadata;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmSignUp</code> calls.
     * </p>
     * 
     * @return The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmSignUp</code> calls.
     */

    public AnalyticsMetadataType getAnalyticsMetadata() {
        return this.analyticsMetadata;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmSignUp</code> calls.
     * </p>
     * 
     * @param analyticsMetadata
     *        The Amazon Pinpoint analytics metadata for collecting metrics for <code>ConfirmSignUp</code> calls.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmSignUpRequest withAnalyticsMetadata(AnalyticsMetadataType analyticsMetadata) {
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

    public ConfirmSignUpRequest withUserContextData(UserContextDataType userContextData) {
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
        if (getForceAliasCreation() != null)
            sb.append("ForceAliasCreation: ").append(getForceAliasCreation()).append(",");
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

        if (obj instanceof ConfirmSignUpRequest == false)
            return false;
        ConfirmSignUpRequest other = (ConfirmSignUpRequest) obj;
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
        if (other.getForceAliasCreation() == null ^ this.getForceAliasCreation() == null)
            return false;
        if (other.getForceAliasCreation() != null && other.getForceAliasCreation().equals(this.getForceAliasCreation()) == false)
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
        hashCode = prime * hashCode + ((getForceAliasCreation() == null) ? 0 : getForceAliasCreation().hashCode());
        hashCode = prime * hashCode + ((getAnalyticsMetadata() == null) ? 0 : getAnalyticsMetadata().hashCode());
        hashCode = prime * hashCode + ((getUserContextData() == null) ? 0 : getUserContextData().hashCode());
        return hashCode;
    }

    @Override
    public ConfirmSignUpRequest clone() {
        return (ConfirmSignUpRequest) super.clone();
    }

}
