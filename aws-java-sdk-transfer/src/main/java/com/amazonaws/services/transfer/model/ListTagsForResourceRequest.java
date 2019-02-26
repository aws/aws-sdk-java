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
package com.amazonaws.services.transfer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/transfer-2018-11-05/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Requests the tags associated with a particular Amazon Resource Name (ARN). An ARN is an identifier for a specific
     * AWS resource, such as a server, user, or role.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * Specifies the number of tags to return as a response to the <code>ListTagsForResource</code> request.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * When you request additional results from the <code>ListTagsForResource</code> call, a <code>NextToken</code>
     * parameter is returned in the input. You can then pass in a subsequent command the <code>NextToken</code>
     * parameter to continue listing additional tags.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Requests the tags associated with a particular Amazon Resource Name (ARN). An ARN is an identifier for a specific
     * AWS resource, such as a server, user, or role.
     * </p>
     * 
     * @param arn
     *        Requests the tags associated with a particular Amazon Resource Name (ARN). An ARN is an identifier for a
     *        specific AWS resource, such as a server, user, or role.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * Requests the tags associated with a particular Amazon Resource Name (ARN). An ARN is an identifier for a specific
     * AWS resource, such as a server, user, or role.
     * </p>
     * 
     * @return Requests the tags associated with a particular Amazon Resource Name (ARN). An ARN is an identifier for a
     *         specific AWS resource, such as a server, user, or role.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * Requests the tags associated with a particular Amazon Resource Name (ARN). An ARN is an identifier for a specific
     * AWS resource, such as a server, user, or role.
     * </p>
     * 
     * @param arn
     *        Requests the tags associated with a particular Amazon Resource Name (ARN). An ARN is an identifier for a
     *        specific AWS resource, such as a server, user, or role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * Specifies the number of tags to return as a response to the <code>ListTagsForResource</code> request.
     * </p>
     * 
     * @param maxResults
     *        Specifies the number of tags to return as a response to the <code>ListTagsForResource</code> request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the number of tags to return as a response to the <code>ListTagsForResource</code> request.
     * </p>
     * 
     * @return Specifies the number of tags to return as a response to the <code>ListTagsForResource</code> request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the number of tags to return as a response to the <code>ListTagsForResource</code> request.
     * </p>
     * 
     * @param maxResults
     *        Specifies the number of tags to return as a response to the <code>ListTagsForResource</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * When you request additional results from the <code>ListTagsForResource</code> call, a <code>NextToken</code>
     * parameter is returned in the input. You can then pass in a subsequent command the <code>NextToken</code>
     * parameter to continue listing additional tags.
     * </p>
     * 
     * @param nextToken
     *        When you request additional results from the <code>ListTagsForResource</code> call, a
     *        <code>NextToken</code> parameter is returned in the input. You can then pass in a subsequent command the
     *        <code>NextToken</code> parameter to continue listing additional tags.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When you request additional results from the <code>ListTagsForResource</code> call, a <code>NextToken</code>
     * parameter is returned in the input. You can then pass in a subsequent command the <code>NextToken</code>
     * parameter to continue listing additional tags.
     * </p>
     * 
     * @return When you request additional results from the <code>ListTagsForResource</code> call, a
     *         <code>NextToken</code> parameter is returned in the input. You can then pass in a subsequent command the
     *         <code>NextToken</code> parameter to continue listing additional tags.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * When you request additional results from the <code>ListTagsForResource</code> call, a <code>NextToken</code>
     * parameter is returned in the input. You can then pass in a subsequent command the <code>NextToken</code>
     * parameter to continue listing additional tags.
     * </p>
     * 
     * @param nextToken
     *        When you request additional results from the <code>ListTagsForResource</code> call, a
     *        <code>NextToken</code> parameter is returned in the input. You can then pass in a subsequent command the
     *        <code>NextToken</code> parameter to continue listing additional tags.
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
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
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
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

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
