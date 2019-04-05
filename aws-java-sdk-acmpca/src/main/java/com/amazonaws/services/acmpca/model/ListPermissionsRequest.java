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
package com.amazonaws.services.acmpca.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListPermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPermissionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA to inspect. You can find the ARN by calling the
     * <a>ListCertificateAuthorities</a> operation. This must be of the form:
     * <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code> You can
     * get a private CA's ARN by running the <a>ListCertificateAuthorities</a> operation.
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * When paginating results, use this parameter in a subsequent request after you receive a response with truncated
     * results. Set it to the value of <b>NextToken</b> from the response you just received.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * When paginating results, use this parameter to specify the maximum number of items to return in the response. If
     * additional items exist beyond the number you specify, the <b>NextToken</b> element is sent in the response. Use
     * this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA to inspect. You can find the ARN by calling the
     * <a>ListCertificateAuthorities</a> operation. This must be of the form:
     * <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code> You can
     * get a private CA's ARN by running the <a>ListCertificateAuthorities</a> operation.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Number (ARN) of the private CA to inspect. You can find the ARN by calling the
     *        <a>ListCertificateAuthorities</a> operation. This must be of the form:
     *        <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code> You
     *        can get a private CA's ARN by running the <a>ListCertificateAuthorities</a> operation.
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA to inspect. You can find the ARN by calling the
     * <a>ListCertificateAuthorities</a> operation. This must be of the form:
     * <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code> You can
     * get a private CA's ARN by running the <a>ListCertificateAuthorities</a> operation.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the private CA to inspect. You can find the ARN by calling the
     *         <a>ListCertificateAuthorities</a> operation. This must be of the form:
     *         <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code>
     *         You can get a private CA's ARN by running the <a>ListCertificateAuthorities</a> operation.
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the private CA to inspect. You can find the ARN by calling the
     * <a>ListCertificateAuthorities</a> operation. This must be of the form:
     * <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code> You can
     * get a private CA's ARN by running the <a>ListCertificateAuthorities</a> operation.
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Number (ARN) of the private CA to inspect. You can find the ARN by calling the
     *        <a>ListCertificateAuthorities</a> operation. This must be of the form:
     *        <code>arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012</code> You
     *        can get a private CA's ARN by running the <a>ListCertificateAuthorities</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsRequest withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * When paginating results, use this parameter in a subsequent request after you receive a response with truncated
     * results. Set it to the value of <b>NextToken</b> from the response you just received.
     * </p>
     * 
     * @param nextToken
     *        When paginating results, use this parameter in a subsequent request after you receive a response with
     *        truncated results. Set it to the value of <b>NextToken</b> from the response you just received.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When paginating results, use this parameter in a subsequent request after you receive a response with truncated
     * results. Set it to the value of <b>NextToken</b> from the response you just received.
     * </p>
     * 
     * @return When paginating results, use this parameter in a subsequent request after you receive a response with
     *         truncated results. Set it to the value of <b>NextToken</b> from the response you just received.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When paginating results, use this parameter in a subsequent request after you receive a response with truncated
     * results. Set it to the value of <b>NextToken</b> from the response you just received.
     * </p>
     * 
     * @param nextToken
     *        When paginating results, use this parameter in a subsequent request after you receive a response with
     *        truncated results. Set it to the value of <b>NextToken</b> from the response you just received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * When paginating results, use this parameter to specify the maximum number of items to return in the response. If
     * additional items exist beyond the number you specify, the <b>NextToken</b> element is sent in the response. Use
     * this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @param maxResults
     *        When paginating results, use this parameter to specify the maximum number of items to return in the
     *        response. If additional items exist beyond the number you specify, the <b>NextToken</b> element is sent in
     *        the response. Use this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * When paginating results, use this parameter to specify the maximum number of items to return in the response. If
     * additional items exist beyond the number you specify, the <b>NextToken</b> element is sent in the response. Use
     * this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @return When paginating results, use this parameter to specify the maximum number of items to return in the
     *         response. If additional items exist beyond the number you specify, the <b>NextToken</b> element is sent
     *         in the response. Use this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * When paginating results, use this parameter to specify the maximum number of items to return in the response. If
     * additional items exist beyond the number you specify, the <b>NextToken</b> element is sent in the response. Use
     * this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @param maxResults
     *        When paginating results, use this parameter to specify the maximum number of items to return in the
     *        response. If additional items exist beyond the number you specify, the <b>NextToken</b> element is sent in
     *        the response. Use this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPermissionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getCertificateAuthorityArn() != null)
            sb.append("CertificateAuthorityArn: ").append(getCertificateAuthorityArn()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPermissionsRequest == false)
            return false;
        ListPermissionsRequest other = (ListPermissionsRequest) obj;
        if (other.getCertificateAuthorityArn() == null ^ this.getCertificateAuthorityArn() == null)
            return false;
        if (other.getCertificateAuthorityArn() != null && other.getCertificateAuthorityArn().equals(this.getCertificateAuthorityArn()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCertificateAuthorityArn() == null) ? 0 : getCertificateAuthorityArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPermissionsRequest clone() {
        return (ListPermissionsRequest) super.clone();
    }

}
