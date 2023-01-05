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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/ListUsageLimits"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUsageLimitsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results. The default is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If your initial <code>ListUsageLimits</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in following <code>ListUsageLimits</code> operations, which returns results in
     * the next page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource whose usage limits you want to list.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The Amazon Redshift Serverless feature whose limits you want to see.
     * </p>
     */
    private String usageType;

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results. The default is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results. The default is 100.
     * </p>
     * 
     * @return An optional parameter that specifies the maximum number of results to return. You can use
     *         <code>nextToken</code> to get the next page of results. The default is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * An optional parameter that specifies the maximum number of results to return. You can use <code>nextToken</code>
     * to get the next page of results. The default is 100.
     * </p>
     * 
     * @param maxResults
     *        An optional parameter that specifies the maximum number of results to return. You can use
     *        <code>nextToken</code> to get the next page of results. The default is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageLimitsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If your initial <code>ListUsageLimits</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in following <code>ListUsageLimits</code> operations, which returns results in
     * the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListUsageLimits</code> operation returns a <code>nextToken</code>, you can include
     *        the returned <code>nextToken</code> in following <code>ListUsageLimits</code> operations, which returns
     *        results in the next page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListUsageLimits</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in following <code>ListUsageLimits</code> operations, which returns results in
     * the next page.
     * </p>
     * 
     * @return If your initial <code>ListUsageLimits</code> operation returns a <code>nextToken</code>, you can include
     *         the returned <code>nextToken</code> in following <code>ListUsageLimits</code> operations, which returns
     *         results in the next page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If your initial <code>ListUsageLimits</code> operation returns a <code>nextToken</code>, you can include the
     * returned <code>nextToken</code> in following <code>ListUsageLimits</code> operations, which returns results in
     * the next page.
     * </p>
     * 
     * @param nextToken
     *        If your initial <code>ListUsageLimits</code> operation returns a <code>nextToken</code>, you can include
     *        the returned <code>nextToken</code> in following <code>ListUsageLimits</code> operations, which returns
     *        results in the next page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageLimitsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource whose usage limits you want to list.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) associated with the resource whose usage limits you want to list.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource whose usage limits you want to list.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) associated with the resource whose usage limits you want to list.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) associated with the resource whose usage limits you want to list.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) associated with the resource whose usage limits you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUsageLimitsRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift Serverless feature whose limits you want to see.
     * </p>
     * 
     * @param usageType
     *        The Amazon Redshift Serverless feature whose limits you want to see.
     * @see UsageLimitUsageType
     */

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    /**
     * <p>
     * The Amazon Redshift Serverless feature whose limits you want to see.
     * </p>
     * 
     * @return The Amazon Redshift Serverless feature whose limits you want to see.
     * @see UsageLimitUsageType
     */

    public String getUsageType() {
        return this.usageType;
    }

    /**
     * <p>
     * The Amazon Redshift Serverless feature whose limits you want to see.
     * </p>
     * 
     * @param usageType
     *        The Amazon Redshift Serverless feature whose limits you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitUsageType
     */

    public ListUsageLimitsRequest withUsageType(String usageType) {
        setUsageType(usageType);
        return this;
    }

    /**
     * <p>
     * The Amazon Redshift Serverless feature whose limits you want to see.
     * </p>
     * 
     * @param usageType
     *        The Amazon Redshift Serverless feature whose limits you want to see.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageLimitUsageType
     */

    public ListUsageLimitsRequest withUsageType(UsageLimitUsageType usageType) {
        this.usageType = usageType.toString();
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
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getUsageType() != null)
            sb.append("UsageType: ").append(getUsageType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUsageLimitsRequest == false)
            return false;
        ListUsageLimitsRequest other = (ListUsageLimitsRequest) obj;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getUsageType() == null ^ this.getUsageType() == null)
            return false;
        if (other.getUsageType() != null && other.getUsageType().equals(this.getUsageType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getUsageType() == null) ? 0 : getUsageType().hashCode());
        return hashCode;
    }

    @Override
    public ListUsageLimitsRequest clone() {
        return (ListUsageLimitsRequest) super.clone();
    }

}
