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
 * Container for the parameters to the {@link com.amazonaws.services.identitymanagement.AmazonIdentityManagement#changePassword(ChangePasswordRequest) ChangePassword operation}.
 * <p>
 * Changes the password of the IAM user calling <code>ChangePassword</code> . The root account password is not affected by this action. For information
 * about modifying passwords, see <a href="http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"> Managing Passwords </a> .
 * </p>
 *
 * @see com.amazonaws.services.identitymanagement.AmazonIdentityManagement#changePassword(ChangePasswordRequest)
 */
public class ChangePasswordRequest extends AmazonWebServiceRequest implements Serializable {

    private String oldPassword;

    private String newPassword;

    /**
     * Returns the value of the OldPassword property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @return The value of the OldPassword property for this object.
     */
    public String getOldPassword() {
        return oldPassword;
    }
    
    /**
     * Sets the value of the OldPassword property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param oldPassword The new value for the OldPassword property for this object.
     */
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
    
    /**
     * Sets the value of the OldPassword property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param oldPassword The new value for the OldPassword property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChangePasswordRequest withOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
        return this;
    }

    /**
     * Returns the value of the NewPassword property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @return The value of the NewPassword property for this object.
     */
    public String getNewPassword() {
        return newPassword;
    }
    
    /**
     * Sets the value of the NewPassword property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param newPassword The new value for the NewPassword property for this object.
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    
    /**
     * Sets the value of the NewPassword property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\u0009\u000A\u000D\u0020-\u00FF]+<br/>
     *
     * @param newPassword The new value for the NewPassword property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ChangePasswordRequest withNewPassword(String newPassword) {
        this.newPassword = newPassword;
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
        if (getOldPassword() != null) sb.append("OldPassword: " + getOldPassword() + ",");
        if (getNewPassword() != null) sb.append("NewPassword: " + getNewPassword() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOldPassword() == null) ? 0 : getOldPassword().hashCode()); 
        hashCode = prime * hashCode + ((getNewPassword() == null) ? 0 : getNewPassword().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ChangePasswordRequest == false) return false;
        ChangePasswordRequest other = (ChangePasswordRequest)obj;
        
        if (other.getOldPassword() == null ^ this.getOldPassword() == null) return false;
        if (other.getOldPassword() != null && other.getOldPassword().equals(this.getOldPassword()) == false) return false; 
        if (other.getNewPassword() == null ^ this.getNewPassword() == null) return false;
        if (other.getNewPassword() != null && other.getNewPassword().equals(this.getNewPassword()) == false) return false; 
        return true;
    }
    
}
    