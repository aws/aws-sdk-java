/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the result of a successful invocation of the CreateUser action.
 * </p>
 */
public class CreateUserResult implements Serializable {

    /**
     * Information about the user.
     */
    private User user;

    /**
     * Information about the user.
     *
     * @return Information about the user.
     */
    public User getUser() {
        return user;
    }
    
    /**
     * Information about the user.
     *
     * @param user Information about the user.
     */
    public void setUser(User user) {
        this.user = user;
    }
    
    /**
     * Information about the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param user Information about the user.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateUserResult withUser(User user) {
        this.user = user;
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
        if (getUser() != null) sb.append("User: " + getUser() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateUserResult == false) return false;
        CreateUserResult other = (CreateUserResult)obj;
        
        if (other.getUser() == null ^ this.getUser() == null) return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false) return false; 
        return true;
    }
    
}
    