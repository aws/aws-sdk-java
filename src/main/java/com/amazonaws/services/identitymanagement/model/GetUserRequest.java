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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getUser(GetUserRequest) GetUser operation}.
 * <p>
 * Retrieves information about the specified user, including the user's path, unique ID, and ARN.
 * </p>
 * <p>
 * If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#getUser(GetUserRequest)
 */
public class GetUserRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Name of the user to get information about. <p>This parameter is
     * optional. If it is not included, it defaults to the user making the
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * Default constructor for a new GetUserRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public GetUserRequest() {}
    
    /**
     * Name of the user to get information about. <p>This parameter is
     * optional. If it is not included, it defaults to the user making the
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the user to get information about. <p>This parameter is
     *         optional. If it is not included, it defaults to the user making the
     *         request.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the user to get information about. <p>This parameter is
     * optional. If it is not included, it defaults to the user making the
     * request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user to get information about. <p>This parameter is
     *         optional. If it is not included, it defaults to the user making the
     *         request.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the user to get information about. <p>This parameter is
     * optional. If it is not included, it defaults to the user making the
     * request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the user to get information about. <p>This parameter is
     *         optional. If it is not included, it defaults to the user making the
     *         request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public GetUserRequest withUserName(String userName) {
        this.userName = userName;
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
        if (getUserName() != null) sb.append("UserName: " + getUserName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetUserRequest == false) return false;
        GetUserRequest other = (GetUserRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        return true;
    }
    
}
    