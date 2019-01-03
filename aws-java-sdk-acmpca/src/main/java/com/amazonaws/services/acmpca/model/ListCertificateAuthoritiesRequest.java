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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/acm-pca-2017-08-22/ListCertificateAuthorities" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCertificateAuthoritiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Use this parameter when paginating results to specify the maximum number of items to return in the response on
     * each page. If additional items exist beyond the number you specify, the <code>NextToken</code> element is sent in
     * the response. Use this <code>NextToken</code> value in a subsequent request to retrieve additional items.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter when paginating results in a subsequent request after you receive a response with
     *        truncated results. Set it to the value of the <code>NextToken</code> parameter from the response you just
     *        received.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     * 
     * @return Use this parameter when paginating results in a subsequent request after you receive a response with
     *         truncated results. Set it to the value of the <code>NextToken</code> parameter from the response you just
     *         received.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Use this parameter when paginating results in a subsequent request after you receive a response with truncated
     * results. Set it to the value of the <code>NextToken</code> parameter from the response you just received.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter when paginating results in a subsequent request after you receive a response with
     *        truncated results. Set it to the value of the <code>NextToken</code> parameter from the response you just
     *        received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificateAuthoritiesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Use this parameter when paginating results to specify the maximum number of items to return in the response on
     * each page. If additional items exist beyond the number you specify, the <code>NextToken</code> element is sent in
     * the response. Use this <code>NextToken</code> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @param maxResults
     *        Use this parameter when paginating results to specify the maximum number of items to return in the
     *        response on each page. If additional items exist beyond the number you specify, the <code>NextToken</code>
     *        element is sent in the response. Use this <code>NextToken</code> value in a subsequent request to retrieve
     *        additional items.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Use this parameter when paginating results to specify the maximum number of items to return in the response on
     * each page. If additional items exist beyond the number you specify, the <code>NextToken</code> element is sent in
     * the response. Use this <code>NextToken</code> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @return Use this parameter when paginating results to specify the maximum number of items to return in the
     *         response on each page. If additional items exist beyond the number you specify, the
     *         <code>NextToken</code> element is sent in the response. Use this <code>NextToken</code> value in a
     *         subsequent request to retrieve additional items.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Use this parameter when paginating results to specify the maximum number of items to return in the response on
     * each page. If additional items exist beyond the number you specify, the <code>NextToken</code> element is sent in
     * the response. Use this <code>NextToken</code> value in a subsequent request to retrieve additional items.
     * </p>
     * 
     * @param maxResults
     *        Use this parameter when paginating results to specify the maximum number of items to return in the
     *        response on each page. If additional items exist beyond the number you specify, the <code>NextToken</code>
     *        element is sent in the response. Use this <code>NextToken</code> value in a subsequent request to retrieve
     *        additional items.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCertificateAuthoritiesRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListCertificateAuthoritiesRequest == false)
            return false;
        ListCertificateAuthoritiesRequest other = (ListCertificateAuthoritiesRequest) obj;
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

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListCertificateAuthoritiesRequest clone() {
        return (ListCertificateAuthoritiesRequest) super.clone();
    }

}
