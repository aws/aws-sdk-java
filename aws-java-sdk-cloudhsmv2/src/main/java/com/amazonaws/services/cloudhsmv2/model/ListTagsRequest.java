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
package com.amazonaws.services.cloudhsmv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudhsmv2-2017-04-28/ListTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The cluster identifier (ID) for the cluster whose tags you are getting. To find the cluster ID, use
     * <a>DescribeClusters</a>.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The <code>NextToken</code> value that you received in the previous response. Use this value to get more tags.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of tags to return in the response. When there are more tags than the number you specify, the
     * response contains a <code>NextToken</code> value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The cluster identifier (ID) for the cluster whose tags you are getting. To find the cluster ID, use
     * <a>DescribeClusters</a>.
     * </p>
     * 
     * @param resourceId
     *        The cluster identifier (ID) for the cluster whose tags you are getting. To find the cluster ID, use
     *        <a>DescribeClusters</a>.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The cluster identifier (ID) for the cluster whose tags you are getting. To find the cluster ID, use
     * <a>DescribeClusters</a>.
     * </p>
     * 
     * @return The cluster identifier (ID) for the cluster whose tags you are getting. To find the cluster ID, use
     *         <a>DescribeClusters</a>.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The cluster identifier (ID) for the cluster whose tags you are getting. To find the cluster ID, use
     * <a>DescribeClusters</a>.
     * </p>
     * 
     * @param resourceId
     *        The cluster identifier (ID) for the cluster whose tags you are getting. To find the cluster ID, use
     *        <a>DescribeClusters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value that you received in the previous response. Use this value to get more tags.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value that you received in the previous response. Use this value to get more
     *        tags.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value that you received in the previous response. Use this value to get more tags.
     * </p>
     * 
     * @return The <code>NextToken</code> value that you received in the previous response. Use this value to get more
     *         tags.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value that you received in the previous response. Use this value to get more tags.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value that you received in the previous response. Use this value to get more
     *        tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of tags to return in the response. When there are more tags than the number you specify, the
     * response contains a <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tags to return in the response. When there are more tags than the number you
     *        specify, the response contains a <code>NextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of tags to return in the response. When there are more tags than the number you specify, the
     * response contains a <code>NextToken</code> value.
     * </p>
     * 
     * @return The maximum number of tags to return in the response. When there are more tags than the number you
     *         specify, the response contains a <code>NextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of tags to return in the response. When there are more tags than the number you specify, the
     * response contains a <code>NextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tags to return in the response. When there are more tags than the number you
     *        specify, the response contains a <code>NextToken</code> value.
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
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
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
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

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsRequest clone() {
        return (ListTagsRequest) super.clone();
    }

}
