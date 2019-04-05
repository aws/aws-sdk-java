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
package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/opsworks-2013-02-18/DeleteUserProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteUserProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user's IAM ARN. This can also be a federated user's ARN.
     * </p>
     */
    private String iamUserArn;

    /**
     * <p>
     * The user's IAM ARN. This can also be a federated user's ARN.
     * </p>
     * 
     * @param iamUserArn
     *        The user's IAM ARN. This can also be a federated user's ARN.
     */

    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }

    /**
     * <p>
     * The user's IAM ARN. This can also be a federated user's ARN.
     * </p>
     * 
     * @return The user's IAM ARN. This can also be a federated user's ARN.
     */

    public String getIamUserArn() {
        return this.iamUserArn;
    }

    /**
     * <p>
     * The user's IAM ARN. This can also be a federated user's ARN.
     * </p>
     * 
     * @param iamUserArn
     *        The user's IAM ARN. This can also be a federated user's ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteUserProfileRequest withIamUserArn(String iamUserArn) {
        setIamUserArn(iamUserArn);
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
        if (getIamUserArn() != null)
            sb.append("IamUserArn: ").append(getIamUserArn());
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
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null)
            return false;
        if (other.getIamUserArn() != null && other.getIamUserArn().equals(this.getIamUserArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIamUserArn() == null) ? 0 : getIamUserArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteUserProfileRequest clone() {
        return (DeleteUserProfileRequest) super.clone();
    }

}
