/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/GetInlinePolicyForPermissionSet"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInlinePolicyForPermissionSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The IAM inline policy that is attached to the permission set.
     * </p>
     */
    private String inlinePolicy;

    /**
     * <p>
     * The IAM inline policy that is attached to the permission set.
     * </p>
     * 
     * @param inlinePolicy
     *        The IAM inline policy that is attached to the permission set.
     */

    public void setInlinePolicy(String inlinePolicy) {
        this.inlinePolicy = inlinePolicy;
    }

    /**
     * <p>
     * The IAM inline policy that is attached to the permission set.
     * </p>
     * 
     * @return The IAM inline policy that is attached to the permission set.
     */

    public String getInlinePolicy() {
        return this.inlinePolicy;
    }

    /**
     * <p>
     * The IAM inline policy that is attached to the permission set.
     * </p>
     * 
     * @param inlinePolicy
     *        The IAM inline policy that is attached to the permission set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInlinePolicyForPermissionSetResult withInlinePolicy(String inlinePolicy) {
        setInlinePolicy(inlinePolicy);
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
        if (getInlinePolicy() != null)
            sb.append("InlinePolicy: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInlinePolicyForPermissionSetResult == false)
            return false;
        GetInlinePolicyForPermissionSetResult other = (GetInlinePolicyForPermissionSetResult) obj;
        if (other.getInlinePolicy() == null ^ this.getInlinePolicy() == null)
            return false;
        if (other.getInlinePolicy() != null && other.getInlinePolicy().equals(this.getInlinePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInlinePolicy() == null) ? 0 : getInlinePolicy().hashCode());
        return hashCode;
    }

    @Override
    public GetInlinePolicyForPermissionSetResult clone() {
        try {
            return (GetInlinePolicyForPermissionSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
