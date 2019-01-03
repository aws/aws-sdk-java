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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called the <a>CreateCertificateAuthority</a> operation.
     * This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     */
    private String certificateAuthorityArn;
    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of <b>NextToken</b> from the response you just received.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Use this parameter when paginating results to specify the maximum number of items to return in the response. If
     * additional items exist beyond the number you specify, the <b>NextToken</b> element is sent in the response. Use
     * this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called the <a>CreateCertificateAuthority</a> operation.
     * This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) that was returned when you called the <a>CreateCertificateAuthority</a>
     *        operation. This must be of the form: </p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     */

    public void setCertificateAuthorityArn(String certificateAuthorityArn) {
        this.certificateAuthorityArn = certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called the <a>CreateCertificateAuthority</a> operation.
     * This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that was returned when you called the <a>CreateCertificateAuthority</a>
     *         operation. This must be of the form: </p>
     *         <p>
     *         <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     */

    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that was returned when you called the <a>CreateCertificateAuthority</a> operation.
     * This must be of the form:
     * </p>
     * <p>
     * <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * </p>
     * 
     * @param certificateAuthorityArn
     *        The Amazon Resource Name (ARN) that was returned when you called the <a>CreateCertificateAuthority</a>
     *        operation. This must be of the form: </p>
     *        <p>
     *        <code>arn:aws:acm-pca:<i>region</i>:<i>account</i>:certificate-authority/<i>12345678-1234-1234-1234-123456789012</i> </code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsRequest withCertificateAuthorityArn(String certificateAuthorityArn) {
        setCertificateAuthorityArn(certificateAuthorityArn);
        return this;
    }

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of <b>NextToken</b> from the response you just received.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter when paginating results in a subsequent request after you receive a response with
     *        truncated results. Set it to the value of <b>NextToken</b> from the response you just received.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of <b>NextToken</b> from the response you just received.
     * </p>
     * 
     * @return Use this parameter when paginating results in a subsequent request after you receive a response with
     *         truncated results. Set it to the value of <b>NextToken</b> from the response you just received.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of <b>NextToken</b> from the response you just received.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter when paginating results in a subsequent request after you receive a response with
     *        truncated results. Set it to the value of <b>NextToken</b> from the response you just received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Use this parameter when paginating results to specify the maximum number of items to return in the response. If
     * additional items exist beyond the number you specify, the <b>NextToken</b> element is sent in the response. Use
     * this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @param maxResults
     *        Use this parameter when paginating results to specify the maximum number of items to return in the
     *        response. If additional items exist beyond the number you specify, the <b>NextToken</b> element is sent in
     *        the response. Use this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Use this parameter when paginating results to specify the maximum number of items to return in the response. If
     * additional items exist beyond the number you specify, the <b>NextToken</b> element is sent in the response. Use
     * this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @return Use this parameter when paginating results to specify the maximum number of items to return in the
     *         response. If additional items exist beyond the number you specify, the <b>NextToken</b> element is sent
     *         in the response. Use this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Use this parameter when paginating results to specify the maximum number of items to return in the response. If
     * additional items exist beyond the number you specify, the <b>NextToken</b> element is sent in the response. Use
     * this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @param maxResults
     *        Use this parameter when paginating results to specify the maximum number of items to return in the
     *        response. If additional items exist beyond the number you specify, the <b>NextToken</b> element is sent in
     *        the response. Use this <b>NextToken</b> value in a subsequent request to retrieve additional items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListTagsRequest == false)
            return false;
        ListTagsRequest other = (ListTagsRequest) obj;
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
    public ListTagsRequest clone() {
        return (ListTagsRequest) super.clone();
    }

}
