/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to confirm registration of a user.
 * </p>
 */
public class ConfirmSignUpRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the client associated with the user pool.
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
     * Boolean to be specified to force user confirmation irrespective of existing alias. By default set to False. If
     * this parameter is set to True and the phone number/email used for sign up confirmation already exists as an alias
     * with a different user, the API call will migrate the alias from the previous user to the newly created user being
     * confirmed. If set to False, the API will throw an <b>AliasExistsException</b> error.
     * </p>
     */
    private Boolean forceAliasCreation;

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * 
     * @param clientId
     *        The ID of the client associated with the user pool.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * 
     * @return The ID of the client associated with the user pool.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     * 
     * @param clientId
     *        The ID of the client associated with the user pool.
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
     * Boolean to be specified to force user confirmation irrespective of existing alias. By default set to False. If
     * this parameter is set to True and the phone number/email used for sign up confirmation already exists as an alias
     * with a different user, the API call will migrate the alias from the previous user to the newly created user being
     * confirmed. If set to False, the API will throw an <b>AliasExistsException</b> error.
     * </p>
     * 
     * @param forceAliasCreation
     *        Boolean to be specified to force user confirmation irrespective of existing alias. By default set to
     *        False. If this parameter is set to True and the phone number/email used for sign up confirmation already
     *        exists as an alias with a different user, the API call will migrate the alias from the previous user to
     *        the newly created user being confirmed. If set to False, the API will throw an <b>AliasExistsException</b>
     *        error.
     */

    public void setForceAliasCreation(Boolean forceAliasCreation) {
        this.forceAliasCreation = forceAliasCreation;
    }

    /**
     * <p>
     * Boolean to be specified to force user confirmation irrespective of existing alias. By default set to False. If
     * this parameter is set to True and the phone number/email used for sign up confirmation already exists as an alias
     * with a different user, the API call will migrate the alias from the previous user to the newly created user being
     * confirmed. If set to False, the API will throw an <b>AliasExistsException</b> error.
     * </p>
     * 
     * @return Boolean to be specified to force user confirmation irrespective of existing alias. By default set to
     *         False. If this parameter is set to True and the phone number/email used for sign up confirmation already
     *         exists as an alias with a different user, the API call will migrate the alias from the previous user to
     *         the newly created user being confirmed. If set to False, the API will throw an
     *         <b>AliasExistsException</b> error.
     */

    public Boolean getForceAliasCreation() {
        return this.forceAliasCreation;
    }

    /**
     * <p>
     * Boolean to be specified to force user confirmation irrespective of existing alias. By default set to False. If
     * this parameter is set to True and the phone number/email used for sign up confirmation already exists as an alias
     * with a different user, the API call will migrate the alias from the previous user to the newly created user being
     * confirmed. If set to False, the API will throw an <b>AliasExistsException</b> error.
     * </p>
     * 
     * @param forceAliasCreation
     *        Boolean to be specified to force user confirmation irrespective of existing alias. By default set to
     *        False. If this parameter is set to True and the phone number/email used for sign up confirmation already
     *        exists as an alias with a different user, the API call will migrate the alias from the previous user to
     *        the newly created user being confirmed. If set to False, the API will throw an <b>AliasExistsException</b>
     *        error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConfirmSignUpRequest withForceAliasCreation(Boolean forceAliasCreation) {
        setForceAliasCreation(forceAliasCreation);
        return this;
    }

    /**
     * <p>
     * Boolean to be specified to force user confirmation irrespective of existing alias. By default set to False. If
     * this parameter is set to True and the phone number/email used for sign up confirmation already exists as an alias
     * with a different user, the API call will migrate the alias from the previous user to the newly created user being
     * confirmed. If set to False, the API will throw an <b>AliasExistsException</b> error.
     * </p>
     * 
     * @return Boolean to be specified to force user confirmation irrespective of existing alias. By default set to
     *         False. If this parameter is set to True and the phone number/email used for sign up confirmation already
     *         exists as an alias with a different user, the API call will migrate the alias from the previous user to
     *         the newly created user being confirmed. If set to False, the API will throw an
     *         <b>AliasExistsException</b> error.
     */

    public Boolean isForceAliasCreation() {
        return this.forceAliasCreation;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ClientId: " + getClientId() + ",");
        if (getSecretHash() != null)
            sb.append("SecretHash: " + getSecretHash() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getConfirmationCode() != null)
            sb.append("ConfirmationCode: " + getConfirmationCode() + ",");
        if (getForceAliasCreation() != null)
            sb.append("ForceAliasCreation: " + getForceAliasCreation());
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
        return hashCode;
    }

    @Override
    public ConfirmSignUpRequest clone() {
        return (ConfirmSignUpRequest) super.clone();
    }
}
