/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the response to a successful <a>CreateLoginProfile</a> request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iam-2010-05-08/CreateLoginProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLoginProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure containing the user name and password create date.
     * </p>
     */
    private LoginProfile loginProfile;

    /**
     * <p>
     * A structure containing the user name and password create date.
     * </p>
     * 
     * @param loginProfile
     *        A structure containing the user name and password create date.
     */

    public void setLoginProfile(LoginProfile loginProfile) {
        this.loginProfile = loginProfile;
    }

    /**
     * <p>
     * A structure containing the user name and password create date.
     * </p>
     * 
     * @return A structure containing the user name and password create date.
     */

    public LoginProfile getLoginProfile() {
        return this.loginProfile;
    }

    /**
     * <p>
     * A structure containing the user name and password create date.
     * </p>
     * 
     * @param loginProfile
     *        A structure containing the user name and password create date.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLoginProfileResult withLoginProfile(LoginProfile loginProfile) {
        setLoginProfile(loginProfile);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getLoginProfile() != null)
            sb.append("LoginProfile: ").append(getLoginProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLoginProfileResult == false)
            return false;
        CreateLoginProfileResult other = (CreateLoginProfileResult) obj;
        if (other.getLoginProfile() == null ^ this.getLoginProfile() == null)
            return false;
        if (other.getLoginProfile() != null && other.getLoginProfile().equals(this.getLoginProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLoginProfile() == null) ? 0 : getLoginProfile().hashCode());
        return hashCode;
    }

    @Override
    public CreateLoginProfileResult clone() {
        try {
            return (CreateLoginProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
