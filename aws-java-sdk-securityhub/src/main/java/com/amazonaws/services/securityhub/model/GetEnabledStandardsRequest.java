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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/GetEnabledStandards" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEnabledStandardsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The list of standards subscription ARNS that you want to list and describe.
     * </p>
     */
    private java.util.List<String> standardsSubscriptionArns;
    /**
     * <p>
     * Paginates results. Set the value of this parameter to NULL on your first call to the GetEnabledStandards
     * operation. For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from
     * the previous response to continue listing data.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Indicates the maximum number of items that you want in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The list of standards subscription ARNS that you want to list and describe.
     * </p>
     * 
     * @return The list of standards subscription ARNS that you want to list and describe.
     */

    public java.util.List<String> getStandardsSubscriptionArns() {
        return standardsSubscriptionArns;
    }

    /**
     * <p>
     * The list of standards subscription ARNS that you want to list and describe.
     * </p>
     * 
     * @param standardsSubscriptionArns
     *        The list of standards subscription ARNS that you want to list and describe.
     */

    public void setStandardsSubscriptionArns(java.util.Collection<String> standardsSubscriptionArns) {
        if (standardsSubscriptionArns == null) {
            this.standardsSubscriptionArns = null;
            return;
        }

        this.standardsSubscriptionArns = new java.util.ArrayList<String>(standardsSubscriptionArns);
    }

    /**
     * <p>
     * The list of standards subscription ARNS that you want to list and describe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStandardsSubscriptionArns(java.util.Collection)} or
     * {@link #withStandardsSubscriptionArns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param standardsSubscriptionArns
     *        The list of standards subscription ARNS that you want to list and describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnabledStandardsRequest withStandardsSubscriptionArns(String... standardsSubscriptionArns) {
        if (this.standardsSubscriptionArns == null) {
            setStandardsSubscriptionArns(new java.util.ArrayList<String>(standardsSubscriptionArns.length));
        }
        for (String ele : standardsSubscriptionArns) {
            this.standardsSubscriptionArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of standards subscription ARNS that you want to list and describe.
     * </p>
     * 
     * @param standardsSubscriptionArns
     *        The list of standards subscription ARNS that you want to list and describe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnabledStandardsRequest withStandardsSubscriptionArns(java.util.Collection<String> standardsSubscriptionArns) {
        setStandardsSubscriptionArns(standardsSubscriptionArns);
        return this;
    }

    /**
     * <p>
     * Paginates results. Set the value of this parameter to NULL on your first call to the GetEnabledStandards
     * operation. For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from
     * the previous response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        Paginates results. Set the value of this parameter to NULL on your first call to the GetEnabledStandards
     *        operation. For subsequent calls to the operation, fill nextToken in the request with the value of
     *        nextToken from the previous response to continue listing data.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Paginates results. Set the value of this parameter to NULL on your first call to the GetEnabledStandards
     * operation. For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from
     * the previous response to continue listing data.
     * </p>
     * 
     * @return Paginates results. Set the value of this parameter to NULL on your first call to the GetEnabledStandards
     *         operation. For subsequent calls to the operation, fill nextToken in the request with the value of
     *         nextToken from the previous response to continue listing data.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Paginates results. Set the value of this parameter to NULL on your first call to the GetEnabledStandards
     * operation. For subsequent calls to the operation, fill nextToken in the request with the value of nextToken from
     * the previous response to continue listing data.
     * </p>
     * 
     * @param nextToken
     *        Paginates results. Set the value of this parameter to NULL on your first call to the GetEnabledStandards
     *        operation. For subsequent calls to the operation, fill nextToken in the request with the value of
     *        nextToken from the previous response to continue listing data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnabledStandardsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Indicates the maximum number of items that you want in the response.
     * </p>
     * 
     * @param maxResults
     *        Indicates the maximum number of items that you want in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Indicates the maximum number of items that you want in the response.
     * </p>
     * 
     * @return Indicates the maximum number of items that you want in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Indicates the maximum number of items that you want in the response.
     * </p>
     * 
     * @param maxResults
     *        Indicates the maximum number of items that you want in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEnabledStandardsRequest withMaxResults(Integer maxResults) {
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
        if (getStandardsSubscriptionArns() != null)
            sb.append("StandardsSubscriptionArns: ").append(getStandardsSubscriptionArns()).append(",");
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

        if (obj instanceof GetEnabledStandardsRequest == false)
            return false;
        GetEnabledStandardsRequest other = (GetEnabledStandardsRequest) obj;
        if (other.getStandardsSubscriptionArns() == null ^ this.getStandardsSubscriptionArns() == null)
            return false;
        if (other.getStandardsSubscriptionArns() != null && other.getStandardsSubscriptionArns().equals(this.getStandardsSubscriptionArns()) == false)
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

        hashCode = prime * hashCode + ((getStandardsSubscriptionArns() == null) ? 0 : getStandardsSubscriptionArns().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetEnabledStandardsRequest clone() {
        return (GetEnabledStandardsRequest) super.clone();
    }

}
