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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/ListTrustedTokenIssuers" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrustedTokenIssuersRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ARN of the instance of IAM Identity Center with the trusted token issuer configurations that you
     * want to list.
     * </p>
     */
    private String instanceArn;
    /**
     * <p>
     * Specifies the total number of results that you want included in each response. If additional items exist beyond
     * the number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include
     * the specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next set of results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the ARN of the instance of IAM Identity Center with the trusted token issuer configurations that you
     * want to list.
     * </p>
     * 
     * @param instanceArn
     *        Specifies the ARN of the instance of IAM Identity Center with the trusted token issuer configurations that
     *        you want to list.
     */

    public void setInstanceArn(String instanceArn) {
        this.instanceArn = instanceArn;
    }

    /**
     * <p>
     * Specifies the ARN of the instance of IAM Identity Center with the trusted token issuer configurations that you
     * want to list.
     * </p>
     * 
     * @return Specifies the ARN of the instance of IAM Identity Center with the trusted token issuer configurations
     *         that you want to list.
     */

    public String getInstanceArn() {
        return this.instanceArn;
    }

    /**
     * <p>
     * Specifies the ARN of the instance of IAM Identity Center with the trusted token issuer configurations that you
     * want to list.
     * </p>
     * 
     * @param instanceArn
     *        Specifies the ARN of the instance of IAM Identity Center with the trusted token issuer configurations that
     *        you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrustedTokenIssuersRequest withInstanceArn(String instanceArn) {
        setInstanceArn(instanceArn);
        return this;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included in each response. If additional items exist beyond
     * the number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include
     * the specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next set of results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        Specifies the total number of results that you want included in each response. If additional items exist
     *        beyond the number you specify, the <code>NextToken</code> response element is returned with a value (not
     *        null). Include the specified value as the <code>NextToken</code> request parameter in the next call to the
     *        operation to get the next set of results. Note that the service might return fewer results than the
     *        maximum even when there are more results available. You should check <code>NextToken</code> after every
     *        operation to ensure that you receive all of the results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included in each response. If additional items exist beyond
     * the number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include
     * the specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next set of results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @return Specifies the total number of results that you want included in each response. If additional items exist
     *         beyond the number you specify, the <code>NextToken</code> response element is returned with a value (not
     *         null). Include the specified value as the <code>NextToken</code> request parameter in the next call to
     *         the operation to get the next set of results. Note that the service might return fewer results than the
     *         maximum even when there are more results available. You should check <code>NextToken</code> after every
     *         operation to ensure that you receive all of the results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the total number of results that you want included in each response. If additional items exist beyond
     * the number you specify, the <code>NextToken</code> response element is returned with a value (not null). Include
     * the specified value as the <code>NextToken</code> request parameter in the next call to the operation to get the
     * next set of results. Note that the service might return fewer results than the maximum even when there are more
     * results available. You should check <code>NextToken</code> after every operation to ensure that you receive all
     * of the results.
     * </p>
     * 
     * @param maxResults
     *        Specifies the total number of results that you want included in each response. If additional items exist
     *        beyond the number you specify, the <code>NextToken</code> response element is returned with a value (not
     *        null). Include the specified value as the <code>NextToken</code> request parameter in the next call to the
     *        operation to get the next set of results. Note that the service might return fewer results than the
     *        maximum even when there are more results available. You should check <code>NextToken</code> after every
     *        operation to ensure that you receive all of the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrustedTokenIssuersRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @return Specifies that you want to receive the next page of results. Valid only if you received a
     *         <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *         available. Set this parameter to the value provided by the previous call's <code>NextToken</code>
     *         response to request the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies that you want to receive the next page of results. Valid only if you received a <code>NextToken</code>
     * response in the previous request. If you did, it indicates that more output is available. Set this parameter to
     * the value provided by the previous call's <code>NextToken</code> response to request the next page of results.
     * </p>
     * 
     * @param nextToken
     *        Specifies that you want to receive the next page of results. Valid only if you received a
     *        <code>NextToken</code> response in the previous request. If you did, it indicates that more output is
     *        available. Set this parameter to the value provided by the previous call's <code>NextToken</code> response
     *        to request the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrustedTokenIssuersRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getInstanceArn() != null)
            sb.append("InstanceArn: ").append(getInstanceArn()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrustedTokenIssuersRequest == false)
            return false;
        ListTrustedTokenIssuersRequest other = (ListTrustedTokenIssuersRequest) obj;
        if (other.getInstanceArn() == null ^ this.getInstanceArn() == null)
            return false;
        if (other.getInstanceArn() != null && other.getInstanceArn().equals(this.getInstanceArn()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceArn() == null) ? 0 : getInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTrustedTokenIssuersRequest clone() {
        return (ListTrustedTokenIssuersRequest) super.clone();
    }

}
