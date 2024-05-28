/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/UpdateServiceNetwork" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceNetworkRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     */
    private String authType;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network.
     * </p>
     */
    private String serviceNetworkIdentifier;

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authType
     *        The type of IAM policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth
     *        policy is required.
     *        </p>
     *        </li>
     * @see AuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of IAM policy.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an
     *         auth policy is required.
     *         </p>
     *         </li>
     * @see AuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authType
     *        The type of IAM policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth
     *        policy is required.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public UpdateServiceNetworkRequest withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The type of IAM policy.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth policy
     * is required.
     * </p>
     * </li>
     * </ul>
     * 
     * @param authType
     *        The type of IAM policy.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>NONE</code>: The resource does not use an IAM policy. This is the default.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AWS_IAM</code>: The resource uses an IAM policy. When this type is used, auth is enabled and an auth
     *        policy is required.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public UpdateServiceNetworkRequest withAuthType(AuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @param serviceNetworkIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service network.
     */

    public void setServiceNetworkIdentifier(String serviceNetworkIdentifier) {
        this.serviceNetworkIdentifier = serviceNetworkIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the service network.
     */

    public String getServiceNetworkIdentifier() {
        return this.serviceNetworkIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network.
     * </p>
     * 
     * @param serviceNetworkIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceNetworkRequest withServiceNetworkIdentifier(String serviceNetworkIdentifier) {
        setServiceNetworkIdentifier(serviceNetworkIdentifier);
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
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getServiceNetworkIdentifier() != null)
            sb.append("ServiceNetworkIdentifier: ").append(getServiceNetworkIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceNetworkRequest == false)
            return false;
        UpdateServiceNetworkRequest other = (UpdateServiceNetworkRequest) obj;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getServiceNetworkIdentifier() == null ^ this.getServiceNetworkIdentifier() == null)
            return false;
        if (other.getServiceNetworkIdentifier() != null && other.getServiceNetworkIdentifier().equals(this.getServiceNetworkIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getServiceNetworkIdentifier() == null) ? 0 : getServiceNetworkIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceNetworkRequest clone() {
        return (UpdateServiceNetworkRequest) super.clone();
    }

}
