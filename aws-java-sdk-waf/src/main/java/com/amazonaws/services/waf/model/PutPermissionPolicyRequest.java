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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/PutPermissionPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPermissionPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RuleGroup to which you want to attach the policy.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The policy to attach to the specified RuleGroup.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RuleGroup to which you want to attach the policy.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the RuleGroup to which you want to attach the policy.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RuleGroup to which you want to attach the policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the RuleGroup to which you want to attach the policy.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the RuleGroup to which you want to attach the policy.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the RuleGroup to which you want to attach the policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionPolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The policy to attach to the specified RuleGroup.
     * </p>
     * 
     * @param policy
     *        The policy to attach to the specified RuleGroup.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The policy to attach to the specified RuleGroup.
     * </p>
     * 
     * @return The policy to attach to the specified RuleGroup.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The policy to attach to the specified RuleGroup.
     * </p>
     * 
     * @param policy
     *        The policy to attach to the specified RuleGroup.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPermissionPolicyRequest withPolicy(String policy) {
        setPolicy(policy);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPermissionPolicyRequest == false)
            return false;
        PutPermissionPolicyRequest other = (PutPermissionPolicyRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutPermissionPolicyRequest clone() {
        return (PutPermissionPolicyRequest) super.clone();
    }

}
