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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/DeletePolicy" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeletePolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA that will have its policy deleted. You can find the CA's ARN
     * by calling the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     * >ListCertificateAuthorities</a> action. The ARN value must have the form
     * <code>arn:aws:acm-pca:region:account:certificate-authority/01234567-89ab-cdef-0123-0123456789ab</code>.
     * </p>
     */
    private String resourceArn;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA that will have its policy deleted. You can find the CA's ARN
     * by calling the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     * >ListCertificateAuthorities</a> action. The ARN value must have the form
     * <code>arn:aws:acm-pca:region:account:certificate-authority/01234567-89ab-cdef-0123-0123456789ab</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Number (ARN) of the private CA that will have its policy deleted. You can find the
     *        CA's ARN by calling the <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     *        >ListCertificateAuthorities</a> action. The ARN value must have the form
     *        <code>arn:aws:acm-pca:region:account:certificate-authority/01234567-89ab-cdef-0123-0123456789ab</code>.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA that will have its policy deleted. You can find the CA's ARN
     * by calling the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     * >ListCertificateAuthorities</a> action. The ARN value must have the form
     * <code>arn:aws:acm-pca:region:account:certificate-authority/01234567-89ab-cdef-0123-0123456789ab</code>.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the private CA that will have its policy deleted. You can find the
     *         CA's ARN by calling the <a
     *         href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     *         >ListCertificateAuthorities</a> action. The ARN value must have the form
     *         <code>arn:aws:acm-pca:region:account:certificate-authority/01234567-89ab-cdef-0123-0123456789ab</code>.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA that will have its policy deleted. You can find the CA's ARN
     * by calling the <a
     * href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     * >ListCertificateAuthorities</a> action. The ARN value must have the form
     * <code>arn:aws:acm-pca:region:account:certificate-authority/01234567-89ab-cdef-0123-0123456789ab</code>.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Number (ARN) of the private CA that will have its policy deleted. You can find the
     *        CA's ARN by calling the <a
     *        href="https://docs.aws.amazon.com/acm-pca/latest/APIReference/API_ListCertificateAuthorities.html"
     *        >ListCertificateAuthorities</a> action. The ARN value must have the form
     *        <code>arn:aws:acm-pca:region:account:certificate-authority/01234567-89ab-cdef-0123-0123456789ab</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeletePolicyRequest withResourceArn(String resourceArn) {
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

        if (obj instanceof DeletePolicyRequest == false)
            return false;
        DeletePolicyRequest other = (DeletePolicyRequest) obj;
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

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        return hashCode;
    }

    @Override
    public DeletePolicyRequest clone() {
        return (DeletePolicyRequest) super.clone();
    }

}
