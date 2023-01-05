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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/DescribeMultiRegionAccessPointOperation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMultiRegionAccessPointOperationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The request token associated with the request you want to know about. This request token is returned as part of
     * the response when you make an asynchronous request. You provide this token to query about the status of the
     * asynchronous action.
     * </p>
     */
    private String requestTokenARN;

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     * 
     * @return The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMultiRegionAccessPointOperationRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The request token associated with the request you want to know about. This request token is returned as part of
     * the response when you make an asynchronous request. You provide this token to query about the status of the
     * asynchronous action.
     * </p>
     * 
     * @param requestTokenARN
     *        The request token associated with the request you want to know about. This request token is returned as
     *        part of the response when you make an asynchronous request. You provide this token to query about the
     *        status of the asynchronous action.
     */

    public void setRequestTokenARN(String requestTokenARN) {
        this.requestTokenARN = requestTokenARN;
    }

    /**
     * <p>
     * The request token associated with the request you want to know about. This request token is returned as part of
     * the response when you make an asynchronous request. You provide this token to query about the status of the
     * asynchronous action.
     * </p>
     * 
     * @return The request token associated with the request you want to know about. This request token is returned as
     *         part of the response when you make an asynchronous request. You provide this token to query about the
     *         status of the asynchronous action.
     */

    public String getRequestTokenARN() {
        return this.requestTokenARN;
    }

    /**
     * <p>
     * The request token associated with the request you want to know about. This request token is returned as part of
     * the response when you make an asynchronous request. You provide this token to query about the status of the
     * asynchronous action.
     * </p>
     * 
     * @param requestTokenARN
     *        The request token associated with the request you want to know about. This request token is returned as
     *        part of the response when you make an asynchronous request. You provide this token to query about the
     *        status of the asynchronous action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMultiRegionAccessPointOperationRequest withRequestTokenARN(String requestTokenARN) {
        setRequestTokenARN(requestTokenARN);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getRequestTokenARN() != null)
            sb.append("RequestTokenARN: ").append(getRequestTokenARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMultiRegionAccessPointOperationRequest == false)
            return false;
        DescribeMultiRegionAccessPointOperationRequest other = (DescribeMultiRegionAccessPointOperationRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getRequestTokenARN() == null ^ this.getRequestTokenARN() == null)
            return false;
        if (other.getRequestTokenARN() != null && other.getRequestTokenARN().equals(this.getRequestTokenARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getRequestTokenARN() == null) ? 0 : getRequestTokenARN().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMultiRegionAccessPointOperationRequest clone() {
        return (DescribeMultiRegionAccessPointOperationRequest) super.clone();
    }

}
