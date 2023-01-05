/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ValidateResourcePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This field is reserved for internal use.
     * </p>
     */
    private String secretId;
    /**
     * <p>
     * A JSON-formatted string that contains an Amazon Web Services resource-based policy. The policy in the string
     * identifies who can access or manage this secret and its versions. For example policies, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     * policy examples</a>.
     * </p>
     */
    private String resourcePolicy;

    /**
     * <p>
     * This field is reserved for internal use.
     * </p>
     * 
     * @param secretId
     *        This field is reserved for internal use.
     */

    public void setSecretId(String secretId) {
        this.secretId = secretId;
    }

    /**
     * <p>
     * This field is reserved for internal use.
     * </p>
     * 
     * @return This field is reserved for internal use.
     */

    public String getSecretId() {
        return this.secretId;
    }

    /**
     * <p>
     * This field is reserved for internal use.
     * </p>
     * 
     * @param secretId
     *        This field is reserved for internal use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateResourcePolicyRequest withSecretId(String secretId) {
        setSecretId(secretId);
        return this;
    }

    /**
     * <p>
     * A JSON-formatted string that contains an Amazon Web Services resource-based policy. The policy in the string
     * identifies who can access or manage this secret and its versions. For example policies, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     * policy examples</a>.
     * </p>
     * 
     * @param resourcePolicy
     *        A JSON-formatted string that contains an Amazon Web Services resource-based policy. The policy in the
     *        string identifies who can access or manage this secret and its versions. For example policies, see <a
     *        href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     *        policy examples</a>.
     */

    public void setResourcePolicy(String resourcePolicy) {
        this.resourcePolicy = resourcePolicy;
    }

    /**
     * <p>
     * A JSON-formatted string that contains an Amazon Web Services resource-based policy. The policy in the string
     * identifies who can access or manage this secret and its versions. For example policies, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     * policy examples</a>.
     * </p>
     * 
     * @return A JSON-formatted string that contains an Amazon Web Services resource-based policy. The policy in the
     *         string identifies who can access or manage this secret and its versions. For example policies, see <a
     *         href
     *         ="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     *         policy examples</a>.
     */

    public String getResourcePolicy() {
        return this.resourcePolicy;
    }

    /**
     * <p>
     * A JSON-formatted string that contains an Amazon Web Services resource-based policy. The policy in the string
     * identifies who can access or manage this secret and its versions. For example policies, see <a
     * href="https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     * policy examples</a>.
     * </p>
     * 
     * @param resourcePolicy
     *        A JSON-formatted string that contains an Amazon Web Services resource-based policy. The policy in the
     *        string identifies who can access or manage this secret and its versions. For example policies, see <a
     *        href=
     *        "https://docs.aws.amazon.com/secretsmanager/latest/userguide/auth-and-access_examples.html">Permissions
     *        policy examples</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateResourcePolicyRequest withResourcePolicy(String resourcePolicy) {
        setResourcePolicy(resourcePolicy);
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
        if (getSecretId() != null)
            sb.append("SecretId: ").append(getSecretId()).append(",");
        if (getResourcePolicy() != null)
            sb.append("ResourcePolicy: ").append(getResourcePolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateResourcePolicyRequest == false)
            return false;
        ValidateResourcePolicyRequest other = (ValidateResourcePolicyRequest) obj;
        if (other.getSecretId() == null ^ this.getSecretId() == null)
            return false;
        if (other.getSecretId() != null && other.getSecretId().equals(this.getSecretId()) == false)
            return false;
        if (other.getResourcePolicy() == null ^ this.getResourcePolicy() == null)
            return false;
        if (other.getResourcePolicy() != null && other.getResourcePolicy().equals(this.getResourcePolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSecretId() == null) ? 0 : getSecretId().hashCode());
        hashCode = prime * hashCode + ((getResourcePolicy() == null) ? 0 : getResourcePolicy().hashCode());
        return hashCode;
    }

    @Override
    public ValidateResourcePolicyRequest clone() {
        return (ValidateResourcePolicyRequest) super.clone();
    }

}
