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
package com.amazonaws.services.codestar.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codestar-2017-04-19/DeleteUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteUserProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user to delete from AWS CodeStar.
     * </p>
     */
    private String userArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user to delete from AWS CodeStar.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the user to delete from AWS CodeStar.
     */

    public void setUserArn(String userArn) {
        this.userArn = userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user to delete from AWS CodeStar.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the user to delete from AWS CodeStar.
     */

    public String getUserArn() {
        return this.userArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the user to delete from AWS CodeStar.
     * </p>
     * 
     * @param userArn
     *        The Amazon Resource Name (ARN) of the user to delete from AWS CodeStar.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUserProfileRequest withUserArn(String userArn) {
        setUserArn(userArn);
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
        if (getUserArn() != null)
            sb.append("UserArn: ").append(getUserArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteUserProfileRequest == false)
            return false;
        DeleteUserProfileRequest other = (DeleteUserProfileRequest) obj;
        if (other.getUserArn() == null ^ this.getUserArn() == null)
            return false;
        if (other.getUserArn() != null && other.getUserArn().equals(this.getUserArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserArn() == null) ? 0 : getUserArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteUserProfileRequest clone() {
        return (DeleteUserProfileRequest) super.clone();
    }

}
