/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;

/**
 * <p>
 * A user pool of the client type.
 * </p>
 */
public class UserPoolClientType implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool client.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The client name from the user pool request of the client type.
     * </p>
     */
    private String clientName;
    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The client secret from the user pool request of the client type.
     * </p>
     */
    private String clientSecret;
    /**
     * <p>
     * The last modified date from the user pool request of the client type.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The creation date from the user pool request of the client type.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The user pool ID for the user pool client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool client.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool client.
     * </p>
     * 
     * @return The user pool ID for the user pool client.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool client.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UserPoolClientType withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The client name from the user pool request of the client type.
     * </p>
     * 
     * @param clientName
     *        The client name from the user pool request of the client type.
     */

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * <p>
     * The client name from the user pool request of the client type.
     * </p>
     * 
     * @return The client name from the user pool request of the client type.
     */

    public String getClientName() {
        return this.clientName;
    }

    /**
     * <p>
     * The client name from the user pool request of the client type.
     * </p>
     * 
     * @param clientName
     *        The client name from the user pool request of the client type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UserPoolClientType withClientName(String clientName) {
        setClientName(clientName);
        return this;
    }

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
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UserPoolClientType withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The client secret from the user pool request of the client type.
     * </p>
     * 
     * @param clientSecret
     *        The client secret from the user pool request of the client type.
     */

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * The client secret from the user pool request of the client type.
     * </p>
     * 
     * @return The client secret from the user pool request of the client type.
     */

    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * <p>
     * The client secret from the user pool request of the client type.
     * </p>
     * 
     * @param clientSecret
     *        The client secret from the user pool request of the client type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UserPoolClientType withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
        return this;
    }

    /**
     * <p>
     * The last modified date from the user pool request of the client type.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modified date from the user pool request of the client
     *        type.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The last modified date from the user pool request of the client type.
     * </p>
     * 
     * @return The last modified date from the user pool request of the client
     *         type.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The last modified date from the user pool request of the client type.
     * </p>
     * 
     * @param lastModifiedDate
     *        The last modified date from the user pool request of the client
     *        type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UserPoolClientType withLastModifiedDate(
            java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The creation date from the user pool request of the client type.
     * </p>
     * 
     * @param creationDate
     *        The creation date from the user pool request of the client type.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The creation date from the user pool request of the client type.
     * </p>
     * 
     * @return The creation date from the user pool request of the client type.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The creation date from the user pool request of the client type.
     * </p>
     * 
     * @param creationDate
     *        The creation date from the user pool request of the client type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UserPoolClientType withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: " + getUserPoolId() + ",");
        if (getClientName() != null)
            sb.append("ClientName: " + getClientName() + ",");
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getClientSecret() != null)
            sb.append("ClientSecret: " + getClientSecret() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UserPoolClientType == false)
            return false;
        UserPoolClientType other = (UserPoolClientType) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientName() == null ^ this.getClientName() == null)
            return false;
        if (other.getClientName() != null
                && other.getClientName().equals(this.getClientName()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null
                && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null
                && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        if (other.getLastModifiedDate() == null
                ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(
                        this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode
                + ((getClientName() == null) ? 0 : getClientName().hashCode());
        hashCode = prime * hashCode
                + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime
                * hashCode
                + ((getClientSecret() == null) ? 0 : getClientSecret()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UserPoolClientType clone() {
        try {
            return (UserPoolClientType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
