/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticfilesystem.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticfilesystem-2015-02-01/ListTagsForResource"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the EFS resource you want to retrieve tags for. You can retrieve tags for EFS file systems and access
     * points using this API endpoint.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * (Optional) Specifies the maximum number of tag objects to return in the response. The default value is 100.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * You can use <code>NextToken</code> in a subsequent request to fetch the next page of access point descriptions if
     * the response payload was paginated.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the EFS resource you want to retrieve tags for. You can retrieve tags for EFS file systems and access
     * points using this API endpoint.
     * </p>
     * 
     * @param resourceId
     *        Specifies the EFS resource you want to retrieve tags for. You can retrieve tags for EFS file systems and
     *        access points using this API endpoint.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * Specifies the EFS resource you want to retrieve tags for. You can retrieve tags for EFS file systems and access
     * points using this API endpoint.
     * </p>
     * 
     * @return Specifies the EFS resource you want to retrieve tags for. You can retrieve tags for EFS file systems and
     *         access points using this API endpoint.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * Specifies the EFS resource you want to retrieve tags for. You can retrieve tags for EFS file systems and access
     * points using this API endpoint.
     * </p>
     * 
     * @param resourceId
     *        Specifies the EFS resource you want to retrieve tags for. You can retrieve tags for EFS file systems and
     *        access points using this API endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * (Optional) Specifies the maximum number of tag objects to return in the response. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Specifies the maximum number of tag objects to return in the response. The default value is
     *        100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) Specifies the maximum number of tag objects to return in the response. The default value is 100.
     * </p>
     * 
     * @return (Optional) Specifies the maximum number of tag objects to return in the response. The default value is
     *         100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * (Optional) Specifies the maximum number of tag objects to return in the response. The default value is 100.
     * </p>
     * 
     * @param maxResults
     *        (Optional) Specifies the maximum number of tag objects to return in the response. The default value is
     *        100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * You can use <code>NextToken</code> in a subsequent request to fetch the next page of access point descriptions if
     * the response payload was paginated.
     * </p>
     * 
     * @param nextToken
     *        You can use <code>NextToken</code> in a subsequent request to fetch the next page of access point
     *        descriptions if the response payload was paginated.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * You can use <code>NextToken</code> in a subsequent request to fetch the next page of access point descriptions if
     * the response payload was paginated.
     * </p>
     * 
     * @return You can use <code>NextToken</code> in a subsequent request to fetch the next page of access point
     *         descriptions if the response payload was paginated.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * You can use <code>NextToken</code> in a subsequent request to fetch the next page of access point descriptions if
     * the response payload was paginated.
     * </p>
     * 
     * @param nextToken
     *        You can use <code>NextToken</code> in a subsequent request to fetch the next page of access point
     *        descriptions if the response payload was paginated.
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
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
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
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

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }

}
