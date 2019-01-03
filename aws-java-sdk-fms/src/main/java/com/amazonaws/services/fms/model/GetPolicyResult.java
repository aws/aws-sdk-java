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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/GetPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetPolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the specified AWS Firewall Manager policy.
     * </p>
     */
    private Policy policy;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified policy.
     * </p>
     */
    private String policyArn;

    /**
     * <p>
     * Information about the specified AWS Firewall Manager policy.
     * </p>
     * 
     * @param policy
     *        Information about the specified AWS Firewall Manager policy.
     */

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * Information about the specified AWS Firewall Manager policy.
     * </p>
     * 
     * @return Information about the specified AWS Firewall Manager policy.
     */

    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * Information about the specified AWS Firewall Manager policy.
     * </p>
     * 
     * @param policy
     *        Information about the specified AWS Firewall Manager policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyResult withPolicy(Policy policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified policy.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the specified policy.
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified policy.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the specified policy.
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the specified policy.
     * </p>
     * 
     * @param policyArn
     *        The Amazon Resource Name (ARN) of the specified policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetPolicyResult withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
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
        if (getPolicyArn() != null)
            sb.append("PolicyArn: ").append(getPolicyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetPolicyResult == false)
            return false;
        GetPolicyResult other = (GetPolicyResult) obj;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime * hashCode + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        return hashCode;
    }

    @Override
    public GetPolicyResult clone() {
        try {
            return (GetPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
