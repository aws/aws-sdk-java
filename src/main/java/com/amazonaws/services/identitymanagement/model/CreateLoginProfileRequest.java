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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createLoginProfile(CreateLoginProfileRequest) CreateLoginProfile operation}.
 * <p>
 * Creates a login profile for the specified User, giving the User the
 * ability to access AWS services such as the AWS Management Console.
 * For more information about login profiles, see <a
 * .com/IAM/latest/UserGuide/index.html?Using_ManagingLoginsAndMFA.html">
 * Managing Login Profiles and MFA Devices </a> in <i>Using AWS Identity
 * and Access Management</i> .
 * </p>
 * <p>
 * <b>NOTE:</b>In the full release you will be able to use IAM to access
 * your services through the AWS Management Console. Although this
 * feature is not currently available, you can create login profiles for
 * your Users now. Then, when this feature is implemented, your Users can
 * use IAM to access your services through the AWS Management Console.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createLoginProfile(CreateLoginProfileRequest)
 */
public class CreateLoginProfileRequest extends AmazonWebServiceRequest {

    /**
     * Name of the User to create a login profile for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The new password for the User name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     */
    private String password;

    /**
     * Name of the User to create a login profile for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return Name of the User to create a login profile for.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * Name of the User to create a login profile for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User to create a login profile for.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * Name of the User to create a login profile for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName Name of the User to create a login profile for.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoginProfileRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }
    
    
    /**
     * The new password for the User name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @return The new password for the User name.
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * The new password for the User name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param password The new password for the User name.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * The new password for the User name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param password The new password for the User name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoginProfileRequest withPassword(String password) {
        this.password = password;
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
        sb.append("Password: " + password + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    