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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/PutPolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA to associate with the policy. The ARN of the CA can be found
     * by calling the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     * >ListCertificateAuthorities</a> action.
     * </p>
     * <p/>
     */
    private String resourceArn;
    /**
     * <p>
     * The path and file name of a JSON-formatted IAM policy to attach to the specified private CA resource. If this
     * policy does not contain all required statements or if it includes any statement that is not allowed, the
     * <code>PutPolicy</code> action returns an <code>InvalidPolicyException</code>. For information about IAM policy
     * and statement structure, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json">Overview of
     * JSON Policies</a>.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA to associate with the policy. The ARN of the CA can be found
     * by calling the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     * >ListCertificateAuthorities</a> action.
     * </p>
     * <p/>
     * 
     * @param resourceArn
     *        The Amazon Resource Number (ARN) of the private CA to associate with the policy. The ARN of the CA can be
     *        found by calling the <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     *        >ListCertificateAuthorities</a> action.
     *        </p>
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA to associate with the policy. The ARN of the CA can be found
     * by calling the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     * >ListCertificateAuthorities</a> action.
     * </p>
     * <p/>
     * 
     * @return The Amazon Resource Number (ARN) of the private CA to associate with the policy. The ARN of the CA can be
     *         found by calling the <a
     *         href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     *         >ListCertificateAuthorities</a> action.
     *         </p>
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA to associate with the policy. The ARN of the CA can be found
     * by calling the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     * >ListCertificateAuthorities</a> action.
     * </p>
     * <p/>
     * 
     * @param resourceArn
     *        The Amazon Resource Number (ARN) of the private CA to associate with the policy. The ARN of the CA can be
     *        found by calling the <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     *        >ListCertificateAuthorities</a> action.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPolicyRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The path and file name of a JSON-formatted IAM policy to attach to the specified private CA resource. If this
     * policy does not contain all required statements or if it includes any statement that is not allowed, the
     * <code>PutPolicy</code> action returns an <code>InvalidPolicyException</code>. For information about IAM policy
     * and statement structure, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json">Overview of
     * JSON Policies</a>.
     * </p>
     * 
     * @param policy
     *        The path and file name of a JSON-formatted IAM policy to attach to the specified private CA resource. If
     *        this policy does not contain all required statements or if it includes any statement that is not allowed,
     *        the <code>PutPolicy</code> action returns an <code>InvalidPolicyException</code>. For information about
     *        IAM policy and statement structure, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json">Overview
     *        of JSON Policies</a>.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The path and file name of a JSON-formatted IAM policy to attach to the specified private CA resource. If this
     * policy does not contain all required statements or if it includes any statement that is not allowed, the
     * <code>PutPolicy</code> action returns an <code>InvalidPolicyException</code>. For information about IAM policy
     * and statement structure, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json">Overview of
     * JSON Policies</a>.
     * </p>
     * 
     * @return The path and file name of a JSON-formatted IAM policy to attach to the specified private CA resource. If
     *         this policy does not contain all required statements or if it includes any statement that is not allowed,
     *         the <code>PutPolicy</code> action returns an <code>InvalidPolicyException</code>. For information about
     *         IAM policy and statement structure, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json"
     *         >Overview of JSON Policies</a>.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The path and file name of a JSON-formatted IAM policy to attach to the specified private CA resource. If this
     * policy does not contain all required statements or if it includes any statement that is not allowed, the
     * <code>PutPolicy</code> action returns an <code>InvalidPolicyException</code>. For information about IAM policy
     * and statement structure, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json">Overview of
     * JSON Policies</a>.
     * </p>
     * 
     * @param policy
     *        The path and file name of a JSON-formatted IAM policy to attach to the specified private CA resource. If
     *        this policy does not contain all required statements or if it includes any statement that is not allowed,
     *        the <code>PutPolicy</code> action returns an <code>InvalidPolicyException</code>. For information about
     *        IAM policy and statement structure, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html#access_policies-json">Overview
     *        of JSON Policies</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPolicyRequest withPolicy(String policy) {
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

        if (obj instanceof PutPolicyRequest == false)
            return false;
        PutPolicyRequest other = (PutPolicyRequest) obj;
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
    public PutPolicyRequest clone() {
        return (PutPolicyRequest) super.clone();
    }

}
