/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createLoginProfile(CreateLoginProfileRequest) CreateLoginProfile operation}.
 * <p>
 * Creates a password for the specified user, giving the user the
 * ability to access AWS services through the AWS Management Console. For
 * more information about managing passwords, see
 * <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"> Managing Passwords </a>
 * in the <i>Using IAM</i> guide.
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#createLoginProfile(CreateLoginProfileRequest)
 */
public class CreateLoginProfileRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the user to create a password for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     */
    private String userName;

    /**
     * The new password for the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     */
    private String password;

    /**
     * Specifies whether the user is required to set a new password on next
     * sign-in.
     */
    private Boolean passwordResetRequired;

    /**
     * Default constructor for a new CreateLoginProfileRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public CreateLoginProfileRequest() {}
    
    /**
     * Constructs a new CreateLoginProfileRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param userName The name of the user to create a password for.
     * @param password The new password for the user.
     */
    public CreateLoginProfileRequest(String userName, String password) {
        setUserName(userName);
        setPassword(password);
    }

    /**
     * The name of the user to create a password for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @return The name of the user to create a password for.
     */
    public String getUserName() {
        return userName;
    }
    
    /**
     * The name of the user to create a password for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The name of the user to create a password for.
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    /**
     * The name of the user to create a password for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[\w+=,.@-]*<br/>
     *
     * @param userName The name of the user to create a password for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoginProfileRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * The new password for the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @return The new password for the user.
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * The new password for the user.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param password The new password for the user.
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * The new password for the user.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[&#92;u0009&#92;u000A&#92;u000D&#92;u0020-&#92;u00FF]+<br/>
     *
     * @param password The new password for the user.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoginProfileRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Specifies whether the user is required to set a new password on next
     * sign-in.
     *
     * @return Specifies whether the user is required to set a new password on next
     *         sign-in.
     */
    public Boolean isPasswordResetRequired() {
        return passwordResetRequired;
    }
    
    /**
     * Specifies whether the user is required to set a new password on next
     * sign-in.
     *
     * @param passwordResetRequired Specifies whether the user is required to set a new password on next
     *         sign-in.
     */
    public void setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
    }
    
    /**
     * Specifies whether the user is required to set a new password on next
     * sign-in.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param passwordResetRequired Specifies whether the user is required to set a new password on next
     *         sign-in.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateLoginProfileRequest withPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
        return this;
    }

    /**
     * Specifies whether the user is required to set a new password on next
     * sign-in.
     *
     * @return Specifies whether the user is required to set a new password on next
     *         sign-in.
     */
    public Boolean getPasswordResetRequired() {
        return passwordResetRequired;
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
        if (getUserName() != null) sb.append("UserName: " + getUserName() + ",");
        if (getPassword() != null) sb.append("Password: " + getPassword() + ",");
        if (isPasswordResetRequired() != null) sb.append("PasswordResetRequired: " + isPasswordResetRequired() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode()); 
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode()); 
        hashCode = prime * hashCode + ((isPasswordResetRequired() == null) ? 0 : isPasswordResetRequired().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateLoginProfileRequest == false) return false;
        CreateLoginProfileRequest other = (CreateLoginProfileRequest)obj;
        
        if (other.getUserName() == null ^ this.getUserName() == null) return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false) return false; 
        if (other.getPassword() == null ^ this.getPassword() == null) return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false) return false; 
        if (other.isPasswordResetRequired() == null ^ this.isPasswordResetRequired() == null) return false;
        if (other.isPasswordResetRequired() != null && other.isPasswordResetRequired().equals(this.isPasswordResetRequired()) == false) return false; 
        return true;
    }
    
}
    