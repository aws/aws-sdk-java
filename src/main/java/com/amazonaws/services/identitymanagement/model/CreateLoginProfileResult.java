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

/**
 * <p>
 * Contains the result of a successful invocation of the
 * CreateLoginProfile action.
 * </p>
 */
public class CreateLoginProfileResult {

    /**
     * The new login profile.
     */
    private LoginProfile loginProfile;

    /**
     * The new login profile.
     *
     * @return The new login profile.
     */
    public LoginProfile getLoginProfile() {
        return loginProfile;
    }
    
    /**
     * The new login profile.
     *
     * @param loginProfile The new login profile.
     */
    public void setLoginProfile(LoginProfile loginProfile) {
        this.loginProfile = loginProfile;
    }
    
    /**
     * The new login profile.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loginProfile The new login profile.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public CreateLoginProfileResult withLoginProfile(LoginProfile loginProfile) {
        this.loginProfile = loginProfile;
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
        sb.append("LoginProfile: " + loginProfile + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    