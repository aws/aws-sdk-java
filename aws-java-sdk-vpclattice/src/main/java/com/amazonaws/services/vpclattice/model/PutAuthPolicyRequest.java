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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/PutAuthPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutAuthPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The auth policy. The policy string in JSON must not contain newlines or blank lines.
     * </p>
     */
    private String policy;
    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
     * </p>
     */
    private String resourceIdentifier;

    /**
     * <p>
     * The auth policy. The policy string in JSON must not contain newlines or blank lines.
     * </p>
     * 
     * @param policy
     *        The auth policy. The policy string in JSON must not contain newlines or blank lines.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The auth policy. The policy string in JSON must not contain newlines or blank lines.
     * </p>
     * 
     * @return The auth policy. The policy string in JSON must not contain newlines or blank lines.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The auth policy. The policy string in JSON must not contain newlines or blank lines.
     * </p>
     * 
     * @param policy
     *        The auth policy. The policy string in JSON must not contain newlines or blank lines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAuthPolicyRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
     * </p>
     * 
     * @return The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
     * </p>
     * 
     * @param resourceIdentifier
     *        The ID or Amazon Resource Name (ARN) of the service network or service for which the policy is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutAuthPolicyRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
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
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutAuthPolicyRequest == false)
            return false;
        PutAuthPolicyRequest other = (PutAuthPolicyRequest) obj;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public PutAuthPolicyRequest clone() {
        return (PutAuthPolicyRequest) super.clone();
    }

}
