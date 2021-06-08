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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/DeleteResourcePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the resource policy you're deleting.
     * </p>
     */
    private String policyId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource you're deleting the policy from.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The ID of the resource policy you're deleting.
     * </p>
     * 
     * @param policyId
     *        The ID of the resource policy you're deleting.
     */

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    /**
     * <p>
     * The ID of the resource policy you're deleting.
     * </p>
     * 
     * @return The ID of the resource policy you're deleting.
     */

    public String getPolicyId() {
        return this.policyId;
    }

    /**
     * <p>
     * The ID of the resource policy you're deleting.
     * </p>
     * 
     * @param policyId
     *        The ID of the resource policy you're deleting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourcePolicyRequest withPolicyId(String policyId) {
        setPolicyId(policyId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource you're deleting the policy from.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource you're deleting the policy from.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource you're deleting the policy from.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource you're deleting the policy from.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource you're deleting the policy from.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource you're deleting the policy from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteResourcePolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
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
        if (getPolicyId() != null)
            sb.append("PolicyId: ").append(getPolicyId()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteResourcePolicyRequest == false)
            return false;
        DeleteResourcePolicyRequest other = (DeleteResourcePolicyRequest) obj;
        if (other.getPolicyId() == null ^ this.getPolicyId() == null)
            return false;
        if (other.getPolicyId() != null && other.getPolicyId().equals(this.getPolicyId()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyId() == null) ? 0 : getPolicyId().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteResourcePolicyRequest clone() {
        return (DeleteResourcePolicyRequest) super.clone();
    }

}
