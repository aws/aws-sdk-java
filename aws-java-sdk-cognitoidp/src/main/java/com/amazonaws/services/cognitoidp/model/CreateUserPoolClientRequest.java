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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to create a user pool client.
 * </p>
 */
public class CreateUserPoolClientRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool
     * client.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     */
    private String clientName;
    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     */
    private Boolean generateSecret;

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool
     * client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to create a user
     *        pool client.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool
     * client.
     * </p>
     * 
     * @return The user pool ID for the user pool where you want to create a
     *         user pool client.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool
     * client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to create a user
     *        pool client.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateUserPoolClientRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * 
     * @param clientName
     *        The client name for the user pool client you would like to create.
     */

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * 
     * @return The client name for the user pool client you would like to
     *         create.
     */

    public String getClientName() {
        return this.clientName;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * 
     * @param clientName
     *        The client name for the user pool client you would like to create.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateUserPoolClientRequest withClientName(String clientName) {
        setClientName(clientName);
        return this;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     * 
     * @param generateSecret
     *        Boolean to specify whether you want to generate a secret for the
     *        user pool client being created.
     */

    public void setGenerateSecret(Boolean generateSecret) {
        this.generateSecret = generateSecret;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     * 
     * @return Boolean to specify whether you want to generate a secret for the
     *         user pool client being created.
     */

    public Boolean getGenerateSecret() {
        return this.generateSecret;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     * 
     * @param generateSecret
     *        Boolean to specify whether you want to generate a secret for the
     *        user pool client being created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateUserPoolClientRequest withGenerateSecret(Boolean generateSecret) {
        setGenerateSecret(generateSecret);
        return this;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user
     * pool client being created.
     * </p>
     * 
     * @return Boolean to specify whether you want to generate a secret for the
     *         user pool client being created.
     */

    public Boolean isGenerateSecret() {
        return this.generateSecret;
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
        if (getGenerateSecret() != null)
            sb.append("GenerateSecret: " + getGenerateSecret());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserPoolClientRequest == false)
            return false;
        CreateUserPoolClientRequest other = (CreateUserPoolClientRequest) obj;
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
        if (other.getGenerateSecret() == null
                ^ this.getGenerateSecret() == null)
            return false;
        if (other.getGenerateSecret() != null
                && other.getGenerateSecret().equals(this.getGenerateSecret()) == false)
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
        hashCode = prime
                * hashCode
                + ((getGenerateSecret() == null) ? 0 : getGenerateSecret()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateUserPoolClientRequest clone() {
        return (CreateUserPoolClientRequest) super.clone();
    }
}