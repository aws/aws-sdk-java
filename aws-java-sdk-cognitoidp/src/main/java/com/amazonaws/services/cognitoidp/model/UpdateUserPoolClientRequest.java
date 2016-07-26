/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not
 * use this file except in compliance with the License. A copy of the License is
 * located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to update the user pool client.
 * </p>
 */
public class UpdateUserPoolClientRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool where you want to update the user pool
     * client.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The ID of the client associated with the user pool.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The client name from the update user pool client request.
     * </p>
     */
    private String clientName;

    /**
     * <p>
     * The user pool ID for the user pool where you want to update the user pool
     * client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to update the
     *        user pool client.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to update the user pool
     * client.
     * </p>
     * 
     * @return The user pool ID for the user pool where you want to update the
     *         user pool client.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to update the user pool
     * client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to update the
     *        user pool client.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateUserPoolClientRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
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

    public UpdateUserPoolClientRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The client name from the update user pool client request.
     * </p>
     * 
     * @param clientName
     *        The client name from the update user pool client request.
     */

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * <p>
     * The client name from the update user pool client request.
     * </p>
     * 
     * @return The client name from the update user pool client request.
     */

    public String getClientName() {
        return this.clientName;
    }

    /**
     * <p>
     * The client name from the update user pool client request.
     * </p>
     * 
     * @param clientName
     *        The client name from the update user pool client request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateUserPoolClientRequest withClientName(String clientName) {
        setClientName(clientName);
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
        if (getClientId() != null)
            sb.append("ClientId: " + getClientId() + ",");
        if (getClientName() != null)
            sb.append("ClientName: " + getClientName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateUserPoolClientRequest == false)
            return false;
        UpdateUserPoolClientRequest other = (UpdateUserPoolClientRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null
                && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null
                && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientName() == null ^ this.getClientName() == null)
            return false;
        if (other.getClientName() != null
                && other.getClientName().equals(this.getClientName()) == false)
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
                + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode
                + ((getClientName() == null) ? 0 : getClientName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserPoolClientRequest clone() {
        return (UpdateUserPoolClientRequest) super.clone();
    }
}
