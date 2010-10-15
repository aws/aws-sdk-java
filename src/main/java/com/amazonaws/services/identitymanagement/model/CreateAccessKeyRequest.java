/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createAccessKey(CreateAccessKeyRequest) CreateAccessKey operation}.
 * <p>
 * Creates a new AWS Secret Access Key and corresponding AWS Access Key
 * ID for the specified User. The default status for new keys is
 * <code>Active</code> .
 * </p>
 * <p>
 * If you do not specify a User name, IAM determines the User name
 * implicitly based on the AWS Access Key ID signing the request. Because
 * this action works for access keys under the AWS Account, you can use
 * this API to manage root credentials even if the AWS Account has no
 * associated Users.
 * </p>
 * <p>
 * For information about limits on the number of keys you can create, see
 * <a
 * s.com/IAM/2010-05-08/UserGuide/index.html?LimitationsOnEntities.html">
 * Limitations on IAM Entities </a> in <i>Using AWS Identity and Access
 * Management</i> .
 * </p>
 * <p>
 * <b>IMPORTANT:</b>To ensure the security of your AWS Account, the
 * Secret Access Key is accessible only during key and User creation.
 * You must save the key (for example, in a text file) if you want to be
 * able to access it again. If a secret key is lost, you can delete the
 * access keys for the associated User and then create new keys.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createAccessKey(CreateAccessKeyRequest)
 */
public class CreateAccessKeyRequest extends AmazonWebServiceRequest {

    /**
     * The User name that the new key will belong to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The User name that the new key will belong to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The User name that the new key will belong to.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The User name that the new key will belong to.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The User name that the new key will belong to.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The User name that the new key will belong to.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The User name that the new key will belong to.
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
        sb.append("UserName: " + userName + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    