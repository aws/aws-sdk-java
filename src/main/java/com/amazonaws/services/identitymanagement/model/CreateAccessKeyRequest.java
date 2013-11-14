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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createAccessKey(CreateAccessKeyRequest) CreateAccessKey operation}.
 * <p>
 * Creates a new AWS secret access key and corresponding AWS access key ID for the specified user. The default status for new keys is <code>Active</code>
 * .
 * </p>
 * <p>
 * If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing the request. Because this action
 * works for access keys under the AWS account, you can use this API to manage root credentials even if the AWS account has no associated users.
 * </p>
 * <p>
 * For information about limits on the number of keys you can create, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?LimitationsOnEntities.html"> Limitations on IAM Entities </a> in <i>Using AWS
 * Identity and Access Management</i> .
 * </p>
 * <p>
 * <b>IMPORTANT:</b>To ensure the security of your AWS account, the secret access key is accessible only during key and user creation. You must save the
 * key (for example, in a text file) if you want to be able to access it again. If a secret key is lost, you can delete the access keys for the
 * associated user and then create new keys.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createAccessKey(CreateAccessKeyRequest)
 */
public class CreateAccessKeyRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The user name that the new key will belong to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * Default constructor for a new CreateAccessKeyRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateAccessKeyRequest() {}
    
    /**
     * The user name that the new key will belong to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The user name that the new key will belong to.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The user name that the new key will belong to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The user name that the new key will belong to.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The user name that the new key will belong to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The user name that the new key will belong to.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateAccessKeyRequest withUserName(String userName) {
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

        if (obj instanceof CreateAccessKeyRequest == false) return false;
        CreateAccessKeyRequest other = (CreateAccessKeyRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        return true;
    }
    
}
    