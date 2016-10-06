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

/**
 * <p>
 * Represents the response from the server to the request to create the user.
 * </p>
 */
public class AdminCreateUserResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The user returned in the request to create a new user.
     * </p>
     */
    private UserType user;

    /**
     * <p>
     * The user returned in the request to create a new user.
     * </p>
     * 
     * @param user
     *        The user returned in the request to create a new user.
     */

    public void setUser(UserType user) {
        this.user = user;
    }

    /**
     * <p>
     * The user returned in the request to create a new user.
     * </p>
     * 
     * @return The user returned in the request to create a new user.
     */

    public UserType getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user returned in the request to create a new user.
     * </p>
     * 
     * @param user
     *        The user returned in the request to create a new user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AdminCreateUserResult withUser(UserType user) {
        setUser(user);
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
        if (getUser() != null)
            sb.append("User: " + getUser());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdminCreateUserResult == false)
            return false;
        AdminCreateUserResult other = (AdminCreateUserResult) obj;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        return hashCode;
    }

    @Override
    public AdminCreateUserResult clone() {
        try {
            return (AdminCreateUserResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
