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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.opsworks.AWSOpsWorks#createUserProfile(CreateUserProfileRequest) CreateUserProfile operation}.
 * <p>
 * Creates a new user profile.
 * </p>
 *
 * @see com.amazonaws.services.opsworks.AWSOpsWorks#createUserProfile(CreateUserProfileRequest)
 */
public class CreateUserProfileRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The user's IAM ARN.
     */
    private String iamUserArn;

    /**
     * The user's SSH user name.
     */
    private String sshUsername;

    /**
     * The user's public SSH key.
     */
    private String sshPublicKey;

    /**
     * The user's IAM ARN.
     *
     * @return The user's IAM ARN.
     */
    public String getIamUserArn() {
        return iamUserArn;
    }
    
    /**
     * The user's IAM ARN.
     *
     * @param iamUserArn The user's IAM ARN.
     */
    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }
    
    /**
     * The user's IAM ARN.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param iamUserArn The user's IAM ARN.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateUserProfileRequest withIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
        return this;
    }

    /**
     * The user's SSH user name.
     *
     * @return The user's SSH user name.
     */
    public String getSshUsername() {
        return sshUsername;
    }
    
    /**
     * The user's SSH user name.
     *
     * @param sshUsername The user's SSH user name.
     */
    public void setSshUsername(String sshUsername) {
        this.sshUsername = sshUsername;
    }
    
    /**
     * The user's SSH user name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshUsername The user's SSH user name.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateUserProfileRequest withSshUsername(String sshUsername) {
        this.sshUsername = sshUsername;
        return this;
    }

    /**
     * The user's public SSH key.
     *
     * @return The user's public SSH key.
     */
    public String getSshPublicKey() {
        return sshPublicKey;
    }
    
    /**
     * The user's public SSH key.
     *
     * @param sshPublicKey The user's public SSH key.
     */
    public void setSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }
    
    /**
     * The user's public SSH key.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sshPublicKey The user's public SSH key.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public CreateUserProfileRequest withSshPublicKey(String sshPublicKey) {
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
        if (getIamUserArn() != null) sb.append("IamUserArn: " + getIamUserArn() + ",");
        if (getSshUsername() != null) sb.append("SshUsername: " + getSshUsername() + ",");
        if (getSshPublicKey() != null) sb.append("SshPublicKey: " + getSshPublicKey() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIamUserArn() == null) ? 0 : getIamUserArn().hashCode()); 
        hashCode = prime * hashCode + ((getSshUsername() == null) ? 0 : getSshUsername().hashCode()); 
        hashCode = prime * hashCode + ((getSshPublicKey() == null) ? 0 : getSshPublicKey().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateUserProfileRequest == false) return false;
        CreateUserProfileRequest other = (CreateUserProfileRequest)obj;
        
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null) return false;
        if (other.getIamUserArn() != null && other.getIamUserArn().equals(this.getIamUserArn()) == false) return false; 
        if (other.getSshUsername() == null ^ this.getSshUsername() == null) return false;
        if (other.getSshUsername() != null && other.getSshUsername().equals(this.getSshUsername()) == false) return false; 
        if (other.getSshPublicKey() == null ^ this.getSshPublicKey() == null) return false;
        if (other.getSshPublicKey() != null && other.getSshPublicKey().equals(this.getSshPublicKey()) == false) return false; 
        return true;
    }
    
}
    