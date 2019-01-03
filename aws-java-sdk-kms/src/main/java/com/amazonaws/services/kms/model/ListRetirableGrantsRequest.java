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
package com.amazonaws.services.kms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kms-2014-11-01/ListRetirableGrants" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRetirableGrantsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextMarker</code> from the truncated response you just received.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The retiring principal for which to list grants.
     * </p>
     * <p>
     * To specify the retiring principal, use the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
     * of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, federated users, and assumed
     * role users. For examples of the ARN syntax for specifying a principal, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS Identity and
     * Access Management (IAM)</a> in the Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     */
    private String retiringPrincipal;

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     * 
     * @param limit
     *        Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS
     *        does not return more than the specified number of items, but it might return fewer.</p>
     *        <p>
     *        This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not
     *        include a value, it defaults to 50.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     * 
     * @return Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS
     *         does not return more than the specified number of items, but it might return fewer.</p>
     *         <p>
     *         This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not
     *         include a value, it defaults to 50.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS does not
     * return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     * 
     * @param limit
     *        Use this parameter to specify the maximum number of items to return. When this value is present, AWS KMS
     *        does not return more than the specified number of items, but it might return fewer.</p>
     *        <p>
     *        This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not
     *        include a value, it defaults to 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRetirableGrantsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextMarker</code> from the truncated response you just received.
     * </p>
     * 
     * @param marker
     *        Use this parameter in a subsequent request after you receive a response with truncated results. Set it to
     *        the value of <code>NextMarker</code> from the truncated response you just received.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextMarker</code> from the truncated response you just received.
     * </p>
     * 
     * @return Use this parameter in a subsequent request after you receive a response with truncated results. Set it to
     *         the value of <code>NextMarker</code> from the truncated response you just received.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextMarker</code> from the truncated response you just received.
     * </p>
     * 
     * @param marker
     *        Use this parameter in a subsequent request after you receive a response with truncated results. Set it to
     *        the value of <code>NextMarker</code> from the truncated response you just received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRetirableGrantsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The retiring principal for which to list grants.
     * </p>
     * <p>
     * To specify the retiring principal, use the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
     * of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, federated users, and assumed
     * role users. For examples of the ARN syntax for specifying a principal, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS Identity and
     * Access Management (IAM)</a> in the Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param retiringPrincipal
     *        The retiring principal for which to list grants.</p>
     *        <p>
     *        To specify the retiring principal, use the <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *        (ARN)</a> of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, federated
     *        users, and assumed role users. For examples of the ARN syntax for specifying a principal, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS
     *        Identity and Access Management (IAM)</a> in the Example ARNs section of the <i>Amazon Web Services General
     *        Reference</i>.
     */

    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }

    /**
     * <p>
     * The retiring principal for which to list grants.
     * </p>
     * <p>
     * To specify the retiring principal, use the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
     * of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, federated users, and assumed
     * role users. For examples of the ARN syntax for specifying a principal, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS Identity and
     * Access Management (IAM)</a> in the Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @return The retiring principal for which to list grants.</p>
     *         <p>
     *         To specify the retiring principal, use the <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *         (ARN)</a> of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, federated
     *         users, and assumed role users. For examples of the ARN syntax for specifying a principal, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS
     *         Identity and Access Management (IAM)</a> in the Example ARNs section of the <i>Amazon Web Services
     *         General Reference</i>.
     */

    public String getRetiringPrincipal() {
        return this.retiringPrincipal;
    }

    /**
     * <p>
     * The retiring principal for which to list grants.
     * </p>
     * <p>
     * To specify the retiring principal, use the <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name (ARN)</a>
     * of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, federated users, and assumed
     * role users. For examples of the ARN syntax for specifying a principal, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS Identity and
     * Access Management (IAM)</a> in the Example ARNs section of the <i>Amazon Web Services General Reference</i>.
     * </p>
     * 
     * @param retiringPrincipal
     *        The retiring principal for which to list grants.</p>
     *        <p>
     *        To specify the retiring principal, use the <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Name
     *        (ARN)</a> of an AWS principal. Valid AWS principals include AWS accounts (root), IAM users, federated
     *        users, and assumed role users. For examples of the ARN syntax for specifying a principal, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam">AWS
     *        Identity and Access Management (IAM)</a> in the Example ARNs section of the <i>Amazon Web Services General
     *        Reference</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRetirableGrantsRequest withRetiringPrincipal(String retiringPrincipal) {
        setRetiringPrincipal(retiringPrincipal);
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
        if (getLimit() != null)
            sb.append("Limit: ").append(getLimit()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getRetiringPrincipal() != null)
            sb.append("RetiringPrincipal: ").append(getRetiringPrincipal());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRetirableGrantsRequest == false)
            return false;
        ListRetirableGrantsRequest other = (ListRetirableGrantsRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getRetiringPrincipal() == null ^ this.getRetiringPrincipal() == null)
            return false;
        if (other.getRetiringPrincipal() != null && other.getRetiringPrincipal().equals(this.getRetiringPrincipal()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getRetiringPrincipal() == null) ? 0 : getRetiringPrincipal().hashCode());
        return hashCode;
    }

    @Override
    public ListRetirableGrantsRequest clone() {
        return (ListRetirableGrantsRequest) super.clone();
    }

}
