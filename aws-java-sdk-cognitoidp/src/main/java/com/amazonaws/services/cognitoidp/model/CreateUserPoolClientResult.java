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

/**
 * <p>
 * Represents the response from the server to create a user pool client.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPoolClient" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserPoolClientResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool client that was just created.
     * </p>
     */
    private UserPoolClientType userPoolClient;

    /**
     * <p>
     * The user pool client that was just created.
     * </p>
     * 
     * @param userPoolClient
     *        The user pool client that was just created.
     */

    public void setUserPoolClient(UserPoolClientType userPoolClient) {
        this.userPoolClient = userPoolClient;
    }

    /**
     * <p>
     * The user pool client that was just created.
     * </p>
     * 
     * @return The user pool client that was just created.
     */

    public UserPoolClientType getUserPoolClient() {
        return this.userPoolClient;
    }

    /**
     * <p>
     * The user pool client that was just created.
     * </p>
     * 
     * @param userPoolClient
     *        The user pool client that was just created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientResult withUserPoolClient(UserPoolClientType userPoolClient) {
        setUserPoolClient(userPoolClient);
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
        if (getUserPoolClient() != null)
            sb.append("UserPoolClient: ").append(getUserPoolClient());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserPoolClientResult == false)
            return false;
        CreateUserPoolClientResult other = (CreateUserPoolClientResult) obj;
        if (other.getUserPoolClient() == null ^ this.getUserPoolClient() == null)
            return false;
        if (other.getUserPoolClient() != null && other.getUserPoolClient().equals(this.getUserPoolClient()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolClient() == null) ? 0 : getUserPoolClient().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserPoolClientResult clone() {
        try {
            return (CreateUserPoolClientResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
