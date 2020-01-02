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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/PutComponentPolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutComponentPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component that this policy should be applied to.
     * </p>
     */
    private String componentArn;
    /**
     * <p>
     * The policy to apply.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component that this policy should be applied to.
     * </p>
     * 
     * @param componentArn
     *        The Amazon Resource Name (ARN) of the component that this policy should be applied to.
     */

    public void setComponentArn(String componentArn) {
        this.componentArn = componentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component that this policy should be applied to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the component that this policy should be applied to.
     */

    public String getComponentArn() {
        return this.componentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component that this policy should be applied to.
     * </p>
     * 
     * @param componentArn
     *        The Amazon Resource Name (ARN) of the component that this policy should be applied to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutComponentPolicyRequest withComponentArn(String componentArn) {
        setComponentArn(componentArn);
        return this;
    }

    /**
     * <p>
     * The policy to apply.
     * </p>
     * 
     * @param policy
     *        The policy to apply.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The policy to apply.
     * </p>
     * 
     * @return The policy to apply.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The policy to apply.
     * </p>
     * 
     * @param policy
     *        The policy to apply.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutComponentPolicyRequest withPolicy(String policy) {
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
        if (getComponentArn() != null)
            sb.append("ComponentArn: ").append(getComponentArn()).append(",");
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

        if (obj instanceof PutComponentPolicyRequest == false)
            return false;
        PutComponentPolicyRequest other = (PutComponentPolicyRequest) obj;
        if (other.getComponentArn() == null ^ this.getComponentArn() == null)
            return false;
        if (other.getComponentArn() != null && other.getComponentArn().equals(this.getComponentArn()) == false)
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

        hashCode = prime * hashCode + ((getComponentArn() == null) ? 0 : getComponentArn().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutComponentPolicyRequest clone() {
        return (PutComponentPolicyRequest) super.clone();
    }

}
