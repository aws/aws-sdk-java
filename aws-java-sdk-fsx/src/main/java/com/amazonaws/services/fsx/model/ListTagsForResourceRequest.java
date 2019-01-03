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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request object for <code>ListTagsForResource</code> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the Amazon FSx resource that will have its tags listed.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * (Optional) Maximum number of tags to return in the response (integer). This parameter value must be greater than
     * 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code> parameter specified
     * in the request and the service's internal maximum number of items per page.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>ListTagsForResource</code> operation (String).
     * If a token present, the action continues the list from where the returning call left off.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The ARN of the Amazon FSx resource that will have its tags listed.
     * </p>
     * 
     * @param resourceARN
     *        The ARN of the Amazon FSx resource that will have its tags listed.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * The ARN of the Amazon FSx resource that will have its tags listed.
     * </p>
     * 
     * @return The ARN of the Amazon FSx resource that will have its tags listed.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * The ARN of the Amazon FSx resource that will have its tags listed.
     * </p>
     * 
     * @param resourceARN
     *        The ARN of the Amazon FSx resource that will have its tags listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * (Optional) Maximum number of tags to return in the response (integer). This parameter value must be greater than
     * 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code> parameter specified
     * in the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Maximum number of tags to return in the response (integer). This parameter value must be
     *        greater than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code>
     *        parameter specified in the request and the service's internal maximum number of items per page.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) Maximum number of tags to return in the response (integer). This parameter value must be greater than
     * 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code> parameter specified
     * in the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @return (Optional) Maximum number of tags to return in the response (integer). This parameter value must be
     *         greater than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code>
     *         parameter specified in the request and the service's internal maximum number of items per page.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * (Optional) Maximum number of tags to return in the response (integer). This parameter value must be greater than
     * 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code> parameter specified
     * in the request and the service's internal maximum number of items per page.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Maximum number of tags to return in the response (integer). This parameter value must be
     *        greater than 0. The number of items that Amazon FSx returns is the minimum of the <code>MaxResults</code>
     *        parameter specified in the request and the service's internal maximum number of items per page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>ListTagsForResource</code> operation (String).
     * If a token present, the action continues the list from where the returning call left off.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Opaque pagination token returned from a previous <code>ListTagsForResource</code> operation
     *        (String). If a token present, the action continues the list from where the returning call left off.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>ListTagsForResource</code> operation (String).
     * If a token present, the action continues the list from where the returning call left off.
     * </p>
     * 
     * @return (Optional) Opaque pagination token returned from a previous <code>ListTagsForResource</code> operation
     *         (String). If a token present, the action continues the list from where the returning call left off.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * (Optional) Opaque pagination token returned from a previous <code>ListTagsForResource</code> operation (String).
     * If a token present, the action continues the list from where the returning call left off.
     * </p>
     * 
     * @param nextToken
     *        (Optional) Opaque pagination token returned from a previous <code>ListTagsForResource</code> operation
     *        (String). If a token present, the action continues the list from where the returning call left off.
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
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
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
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

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
