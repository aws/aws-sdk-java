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
package com.amazonaws.services.athena.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/athena-2017-05-18/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Lists the tags for the workgroup resource with the specified ARN.
     * </p>
     */
    private String resourceARN;
    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results for this request, where the
     * request lists the tags for the workgroup resource with the specified ARN.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to be returned per request that lists the tags for the workgroup resource.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Lists the tags for the workgroup resource with the specified ARN.
     * </p>
     * 
     * @param resourceARN
     *        Lists the tags for the workgroup resource with the specified ARN.
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * <p>
     * Lists the tags for the workgroup resource with the specified ARN.
     * </p>
     * 
     * @return Lists the tags for the workgroup resource with the specified ARN.
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * <p>
     * Lists the tags for the workgroup resource with the specified ARN.
     * </p>
     * 
     * @param resourceARN
     *        Lists the tags for the workgroup resource with the specified ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results for this request, where the
     * request lists the tags for the workgroup resource with the specified ARN.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results for this request, where
     *        the request lists the tags for the workgroup resource with the specified ARN.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results for this request, where the
     * request lists the tags for the workgroup resource with the specified ARN.
     * </p>
     * 
     * @return The token for the next set of results, or null if there are no additional results for this request, where
     *         the request lists the tags for the workgroup resource with the specified ARN.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of results, or null if there are no additional results for this request, where the
     * request lists the tags for the workgroup resource with the specified ARN.
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of results, or null if there are no additional results for this request, where
     *        the request lists the tags for the workgroup resource with the specified ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request that lists the tags for the workgroup resource.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request that lists the tags for the workgroup resource.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request that lists the tags for the workgroup resource.
     * </p>
     * 
     * @return The maximum number of results to be returned per request that lists the tags for the workgroup resource.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to be returned per request that lists the tags for the workgroup resource.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to be returned per request that lists the tags for the workgroup resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withMaxResults(Integer maxResults) {
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
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
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

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
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

        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
