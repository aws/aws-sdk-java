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
package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;


/**
 * <p>
 * Contains the result of a successful call to the GetSessionToken action, including temporary AWS credentials that can be used to make AWS requests.
 * </p>
 */
public class GetSessionTokenResult implements Serializable {

    /**
     * The session credentials for API authentication.
     */
    private Credentials credentials;

    /**
     * The session credentials for API authentication.
     *
     * @return The session credentials for API authentication.
     */
    public Credentials getCredentials() {
        return credentials;
    }
    
    /**
     * The session credentials for API authentication.
     *
     * @param credentials The session credentials for API authentication.
     */
    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
    
    /**
     * The session credentials for API authentication.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param credentials The session credentials for API authentication.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetSessionTokenResult withCredentials(Credentials credentials) {
        this.credentials = credentials;
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
        if (getCredentials() != null) sb.append("Credentials: " + getCredentials() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetSessionTokenResult == false) return false;
        GetSessionTokenResult other = (GetSessionTokenResult)obj;
        
        if (other.getCredentials() == null ^ this.getCredentials() == null) return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false) return false; 
        return true;
    }
    
}
    