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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource whose tags you want to retrieve.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * If the response to the previous <code>ListTags</code> request is truncated, Amazon SageMaker returns this token.
     * To retrieve the next set of tags, use it in the subsequent request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of tags to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource whose tags you want to retrieve.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource whose tags you want to retrieve.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource whose tags you want to retrieve.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource whose tags you want to retrieve.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource whose tags you want to retrieve.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource whose tags you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * If the response to the previous <code>ListTags</code> request is truncated, Amazon SageMaker returns this token.
     * To retrieve the next set of tags, use it in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response to the previous <code>ListTags</code> request is truncated, Amazon SageMaker returns this
     *        token. To retrieve the next set of tags, use it in the subsequent request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to the previous <code>ListTags</code> request is truncated, Amazon SageMaker returns this token.
     * To retrieve the next set of tags, use it in the subsequent request.
     * </p>
     * 
     * @return If the response to the previous <code>ListTags</code> request is truncated, Amazon SageMaker returns this
     *         token. To retrieve the next set of tags, use it in the subsequent request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response to the previous <code>ListTags</code> request is truncated, Amazon SageMaker returns this token.
     * To retrieve the next set of tags, use it in the subsequent request.
     * </p>
     * 
     * @param nextToken
     *        If the response to the previous <code>ListTags</code> request is truncated, Amazon SageMaker returns this
     *        token. To retrieve the next set of tags, use it in the subsequent request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of tags to return.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of tags to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of tags to return.
     * </p>
     * 
     * @return Maximum number of tags to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of tags to return.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of tags to return.
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsRequest clone() {
        return (ListTagsRequest) super.clone();
    }

}
