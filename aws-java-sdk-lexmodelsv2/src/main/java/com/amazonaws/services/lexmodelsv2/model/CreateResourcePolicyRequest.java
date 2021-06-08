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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateResourcePolicy" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResourcePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * A resource policy to add to the resource. The policy is a JSON structure that contains one or more statements
     * that define the policy. The policy must follow the IAM syntax. For more information about the contents of a JSON
     * policy document, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"> IAM JSON
     * policy reference </a>.
     * </p>
     * <p>
     * If the policy isn't valid, Amazon Lex returns a validation exception.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the bot or bot alias that the resource policy is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourcePolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * A resource policy to add to the resource. The policy is a JSON structure that contains one or more statements
     * that define the policy. The policy must follow the IAM syntax. For more information about the contents of a JSON
     * policy document, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"> IAM JSON
     * policy reference </a>.
     * </p>
     * <p>
     * If the policy isn't valid, Amazon Lex returns a validation exception.
     * </p>
     * 
     * @param policy
     *        A resource policy to add to the resource. The policy is a JSON structure that contains one or more
     *        statements that define the policy. The policy must follow the IAM syntax. For more information about the
     *        contents of a JSON policy document, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"> IAM JSON policy reference
     *        </a>. </p>
     *        <p>
     *        If the policy isn't valid, Amazon Lex returns a validation exception.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * A resource policy to add to the resource. The policy is a JSON structure that contains one or more statements
     * that define the policy. The policy must follow the IAM syntax. For more information about the contents of a JSON
     * policy document, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"> IAM JSON
     * policy reference </a>.
     * </p>
     * <p>
     * If the policy isn't valid, Amazon Lex returns a validation exception.
     * </p>
     * 
     * @return A resource policy to add to the resource. The policy is a JSON structure that contains one or more
     *         statements that define the policy. The policy must follow the IAM syntax. For more information about the
     *         contents of a JSON policy document, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"> IAM JSON policy
     *         reference </a>. </p>
     *         <p>
     *         If the policy isn't valid, Amazon Lex returns a validation exception.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * A resource policy to add to the resource. The policy is a JSON structure that contains one or more statements
     * that define the policy. The policy must follow the IAM syntax. For more information about the contents of a JSON
     * policy document, see <a href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"> IAM JSON
     * policy reference </a>.
     * </p>
     * <p>
     * If the policy isn't valid, Amazon Lex returns a validation exception.
     * </p>
     * 
     * @param policy
     *        A resource policy to add to the resource. The policy is a JSON structure that contains one or more
     *        statements that define the policy. The policy must follow the IAM syntax. For more information about the
     *        contents of a JSON policy document, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies.html"> IAM JSON policy reference
     *        </a>. </p>
     *        <p>
     *        If the policy isn't valid, Amazon Lex returns a validation exception.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourcePolicyRequest withPolicy(String policy) {
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

        if (obj instanceof CreateResourcePolicyRequest == false)
            return false;
        CreateResourcePolicyRequest other = (CreateResourcePolicyRequest) obj;
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
    public CreateResourcePolicyRequest clone() {
        return (CreateResourcePolicyRequest) super.clone();
    }

}
