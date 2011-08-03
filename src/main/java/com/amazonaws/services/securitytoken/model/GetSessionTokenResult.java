/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Contains the result of a successful invocation of the GetSessionToken
 * action.
 * </p>
 */
public class GetSessionTokenResult {

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
        sb.append("Credentials: " + credentials + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    