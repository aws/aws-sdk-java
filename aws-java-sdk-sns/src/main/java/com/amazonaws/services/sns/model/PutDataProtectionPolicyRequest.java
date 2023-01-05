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
package com.amazonaws.services.sns.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sns-2010-03-31/PutDataProtectionPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutDataProtectionPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the topic whose <code>DataProtectionPolicy</code> you want to add or update.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the Amazon Web Services General Reference.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The JSON serialization of the topic's <code>DataProtectionPolicy</code>.
     * </p>
     * <p>
     * The <code>DataProtectionPolicy</code> must be in JSON string format.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 30,720.
     * </p>
     */
    private String dataProtectionPolicy;

    /**
     * <p>
     * The ARN of the topic whose <code>DataProtectionPolicy</code> you want to add or update.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the topic whose <code>DataProtectionPolicy</code> you want to add or update.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the Amazon Web Services General Reference.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the topic whose <code>DataProtectionPolicy</code> you want to add or update.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @return The ARN of the topic whose <code>DataProtectionPolicy</code> you want to add or update.</p>
     *         <p>
     *         For more information about ARNs, see <a
     *         href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs)</a> in the Amazon Web Services General Reference.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the topic whose <code>DataProtectionPolicy</code> you want to add or update.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     * (ARNs)</a> in the Amazon Web Services General Reference.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the topic whose <code>DataProtectionPolicy</code> you want to add or update.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs)</a> in the Amazon Web Services General Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDataProtectionPolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The JSON serialization of the topic's <code>DataProtectionPolicy</code>.
     * </p>
     * <p>
     * The <code>DataProtectionPolicy</code> must be in JSON string format.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 30,720.
     * </p>
     * 
     * @param dataProtectionPolicy
     *        The JSON serialization of the topic's <code>DataProtectionPolicy</code>.</p>
     *        <p>
     *        The <code>DataProtectionPolicy</code> must be in JSON string format.
     *        </p>
     *        <p>
     *        Length Constraints: Maximum length of 30,720.
     */

    public void setDataProtectionPolicy(String dataProtectionPolicy) {
        this.dataProtectionPolicy = dataProtectionPolicy;
    }

    /**
     * <p>
     * The JSON serialization of the topic's <code>DataProtectionPolicy</code>.
     * </p>
     * <p>
     * The <code>DataProtectionPolicy</code> must be in JSON string format.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 30,720.
     * </p>
     * 
     * @return The JSON serialization of the topic's <code>DataProtectionPolicy</code>.</p>
     *         <p>
     *         The <code>DataProtectionPolicy</code> must be in JSON string format.
     *         </p>
     *         <p>
     *         Length Constraints: Maximum length of 30,720.
     */

    public String getDataProtectionPolicy() {
        return this.dataProtectionPolicy;
    }

    /**
     * <p>
     * The JSON serialization of the topic's <code>DataProtectionPolicy</code>.
     * </p>
     * <p>
     * The <code>DataProtectionPolicy</code> must be in JSON string format.
     * </p>
     * <p>
     * Length Constraints: Maximum length of 30,720.
     * </p>
     * 
     * @param dataProtectionPolicy
     *        The JSON serialization of the topic's <code>DataProtectionPolicy</code>.</p>
     *        <p>
     *        The <code>DataProtectionPolicy</code> must be in JSON string format.
     *        </p>
     *        <p>
     *        Length Constraints: Maximum length of 30,720.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutDataProtectionPolicyRequest withDataProtectionPolicy(String dataProtectionPolicy) {
        setDataProtectionPolicy(dataProtectionPolicy);
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
        if (getDataProtectionPolicy() != null)
            sb.append("DataProtectionPolicy: ").append(getDataProtectionPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDataProtectionPolicyRequest == false)
            return false;
        PutDataProtectionPolicyRequest other = (PutDataProtectionPolicyRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getDataProtectionPolicy() == null ^ this.getDataProtectionPolicy() == null)
            return false;
        if (other.getDataProtectionPolicy() != null && other.getDataProtectionPolicy().equals(this.getDataProtectionPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getDataProtectionPolicy() == null) ? 0 : getDataProtectionPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutDataProtectionPolicyRequest clone() {
        return (PutDataProtectionPolicyRequest) super.clone();
    }

}
