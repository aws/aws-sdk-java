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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#updateMyUserProfile(UpdateMyUserProfileRequest) UpdateMyUserProfile operation}.
 * <p>
 * Updates a user's SSH public key.
 * </p>
 * <p>
 * <b>Required Permissions</b> : To use this action, an IAM user must
 * have self-management enabled or an attached policy that explicitly
 * grants permissions. For more information on user permissions, see
 * <a href="http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"> Managing User Permissions </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#updateMyUserProfile(UpdateMyUserProfileRequest)
 */
public class UpdateMyUserProfileRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The user's SSH public key.
     */
    private String sshPublicKey;

    /**
     * The user's SSH public key.
     *
     * @return The user's SSH public key.
     */
    public String getSshPublicKey() {
        return sshPublicKey;
    }
    
    /**
     * The user's SSH public key.
     *
     * @param sshPublicKey The user's SSH public key.
     */
    public void setSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }
    
    /**
     * The user's SSH public key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshPublicKey The user's SSH public key.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateMyUserProfileRequest withSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
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
        if (getSshPublicKey() != null) sb.append("SshPublicKey: " + getSshPublicKey() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSshPublicKey() == null) ? 0 : getSshPublicKey().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateMyUserProfileRequest == false) return false;
        UpdateMyUserProfileRequest other = (UpdateMyUserProfileRequest)obj;
        
        if (other.getSshPublicKey() == null ^ this.getSshPublicKey() == null) return false;
        if (other.getSshPublicKey() != null && other.getSshPublicKey().equals(this.getSshPublicKey()) == false) return false; 
        return true;
    }
    
}
    