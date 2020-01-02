/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/CreateUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     */
    private String userProfileArn;

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * 
     * @param userProfileArn
     *        The user profile Amazon Resource Name (ARN).
     */

    public void setUserProfileArn(String userProfileArn) {
        this.userProfileArn = userProfileArn;
    }

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The user profile Amazon Resource Name (ARN).
     */

    public String getUserProfileArn() {
        return this.userProfileArn;
    }

    /**
     * <p>
     * The user profile Amazon Resource Name (ARN).
     * </p>
     * 
     * @param userProfileArn
     *        The user profile Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserProfileResult withUserProfileArn(String userProfileArn) {
        setUserProfileArn(userProfileArn);
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
        if (getUserProfileArn() != null)
            sb.append("UserProfileArn: ").append(getUserProfileArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserProfileResult == false)
            return false;
        CreateUserProfileResult other = (CreateUserProfileResult) obj;
        if (other.getUserProfileArn() == null ^ this.getUserProfileArn() == null)
            return false;
        if (other.getUserProfileArn() != null && other.getUserProfileArn().equals(this.getUserProfileArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserProfileArn() == null) ? 0 : getUserProfileArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserProfileResult clone() {
        try {
            return (CreateUserProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
