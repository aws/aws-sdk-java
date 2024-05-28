/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.paymentcryptography.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/payment-cryptography-2021-09-14/ListAliases" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAliasesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextToken</code> from the truncated response you just received.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, Amazon Web
     * Services Payment Cryptography does not return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextToken</code> from the truncated response you just received.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter in a subsequent request after you receive a response with truncated results. Set it to
     *        the value of <code>NextToken</code> from the truncated response you just received.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextToken</code> from the truncated response you just received.
     * </p>
     * 
     * @return Use this parameter in a subsequent request after you receive a response with truncated results. Set it to
     *         the value of <code>NextToken</code> from the truncated response you just received.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Use this parameter in a subsequent request after you receive a response with truncated results. Set it to the
     * value of <code>NextToken</code> from the truncated response you just received.
     * </p>
     * 
     * @param nextToken
     *        Use this parameter in a subsequent request after you receive a response with truncated results. Set it to
     *        the value of <code>NextToken</code> from the truncated response you just received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, Amazon Web
     * Services Payment Cryptography does not return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     * 
     * @param maxResults
     *        Use this parameter to specify the maximum number of items to return. When this value is present, Amazon
     *        Web Services Payment Cryptography does not return more than the specified number of items, but it might
     *        return fewer.</p>
     *        <p>
     *        This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not
     *        include a value, it defaults to 50.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, Amazon Web
     * Services Payment Cryptography does not return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     * 
     * @return Use this parameter to specify the maximum number of items to return. When this value is present, Amazon
     *         Web Services Payment Cryptography does not return more than the specified number of items, but it might
     *         return fewer.</p>
     *         <p>
     *         This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not
     *         include a value, it defaults to 50.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Use this parameter to specify the maximum number of items to return. When this value is present, Amazon Web
     * Services Payment Cryptography does not return more than the specified number of items, but it might return fewer.
     * </p>
     * <p>
     * This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not include a
     * value, it defaults to 50.
     * </p>
     * 
     * @param maxResults
     *        Use this parameter to specify the maximum number of items to return. When this value is present, Amazon
     *        Web Services Payment Cryptography does not return more than the specified number of items, but it might
     *        return fewer.</p>
     *        <p>
     *        This value is optional. If you include a value, it must be between 1 and 100, inclusive. If you do not
     *        include a value, it defaults to 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAliasesRequest withMaxResults(Integer maxResults) {
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

        if (obj instanceof ListAliasesRequest == false)
            return false;
        ListAliasesRequest other = (ListAliasesRequest) obj;
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
    public ListAliasesRequest clone() {
        return (ListAliasesRequest) super.clone();
    }

}
