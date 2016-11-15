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
 * Represents the request to reset a user's password.
 * </p>
 */
public class ForgotPasswordRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The user name of the user for whom you want to enter a code to reset a forgotten password.
     * </p>
     */
    private String username;

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

    public ForgotPasswordRequest withClientId(String clientId) {
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

    public ForgotPasswordRequest withSecretHash(String secretHash) {
        setSecretHash(secretHash);
        return this;
    }

    /**
     * <p>
     * The user name of the user for whom you want to enter a code to reset a forgotten password.
     * </p>
     * 
     * @param username
     *        The user name of the user for whom you want to enter a code to reset a forgotten password.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The user name of the user for whom you want to enter a code to reset a forgotten password.
     * </p>
     * 
     * @return The user name of the user for whom you want to enter a code to reset a forgotten password.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The user name of the user for whom you want to enter a code to reset a forgotten password.
     * </p>
     * 
     * @param username
     *        The user name of the user for whom you want to enter a code to reset a forgotten password.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ForgotPasswordRequest withUsername(String username) {
        setUsername(username);
        return this;
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
            sb.append("Username: " + getUsername());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ForgotPasswordRequest == false)
            return false;
        ForgotPasswordRequest other = (ForgotPasswordRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getSecretHash() == null) ? 0 : getSecretHash().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        return hashCode;
    }

    @Override
    public ForgotPasswordRequest clone() {
        return (ForgotPasswordRequest) super.clone();
    }
}
