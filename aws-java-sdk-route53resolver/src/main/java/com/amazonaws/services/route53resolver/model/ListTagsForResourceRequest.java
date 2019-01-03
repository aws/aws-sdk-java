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
package com.amazonaws.services.route53resolver.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53resolver-2018-04-01/ListTagsForResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the resource that you want to list tags for.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The maximum number of tags that you want to return in the response to a <code>ListTagsForResource</code> request.
     * If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 tags.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * For the first <code>ListTagsForResource</code> request, omit this value.
     * </p>
     * <p>
     * If you have more than <code>MaxResults</code> tags, you can submit another <code>ListTagsForResource</code>
     * request to get the next group of tags for the resource. In the next request, specify the value of
     * <code>NextToken</code> from the previous response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the resource that you want to list tags for.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) for the resource that you want to list tags for.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the resource that you want to list tags for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the resource that you want to list tags for.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the resource that you want to list tags for.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) for the resource that you want to list tags for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The maximum number of tags that you want to return in the response to a <code>ListTagsForResource</code> request.
     * If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 tags.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tags that you want to return in the response to a <code>ListTagsForResource</code>
     *        request. If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 tags.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of tags that you want to return in the response to a <code>ListTagsForResource</code> request.
     * If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 tags.
     * </p>
     * 
     * @return The maximum number of tags that you want to return in the response to a <code>ListTagsForResource</code>
     *         request. If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 tags.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of tags that you want to return in the response to a <code>ListTagsForResource</code> request.
     * If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 tags.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tags that you want to return in the response to a <code>ListTagsForResource</code>
     *        request. If you don't specify a value for <code>MaxResults</code>, Resolver returns up to 100 tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * For the first <code>ListTagsForResource</code> request, omit this value.
     * </p>
     * <p>
     * If you have more than <code>MaxResults</code> tags, you can submit another <code>ListTagsForResource</code>
     * request to get the next group of tags for the resource. In the next request, specify the value of
     * <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        For the first <code>ListTagsForResource</code> request, omit this value.</p>
     *        <p>
     *        If you have more than <code>MaxResults</code> tags, you can submit another
     *        <code>ListTagsForResource</code> request to get the next group of tags for the resource. In the next
     *        request, specify the value of <code>NextToken</code> from the previous response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * For the first <code>ListTagsForResource</code> request, omit this value.
     * </p>
     * <p>
     * If you have more than <code>MaxResults</code> tags, you can submit another <code>ListTagsForResource</code>
     * request to get the next group of tags for the resource. In the next request, specify the value of
     * <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @return For the first <code>ListTagsForResource</code> request, omit this value.</p>
     *         <p>
     *         If you have more than <code>MaxResults</code> tags, you can submit another
     *         <code>ListTagsForResource</code> request to get the next group of tags for the resource. In the next
     *         request, specify the value of <code>NextToken</code> from the previous response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * For the first <code>ListTagsForResource</code> request, omit this value.
     * </p>
     * <p>
     * If you have more than <code>MaxResults</code> tags, you can submit another <code>ListTagsForResource</code>
     * request to get the next group of tags for the resource. In the next request, specify the value of
     * <code>NextToken</code> from the previous response.
     * </p>
     * 
     * @param nextToken
     *        For the first <code>ListTagsForResource</code> request, omit this value.</p>
     *        <p>
     *        If you have more than <code>MaxResults</code> tags, you can submit another
     *        <code>ListTagsForResource</code> request to get the next group of tags for the resource. In the next
     *        request, specify the value of <code>NextToken</code> from the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withNextToken(String nextToken) {
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
