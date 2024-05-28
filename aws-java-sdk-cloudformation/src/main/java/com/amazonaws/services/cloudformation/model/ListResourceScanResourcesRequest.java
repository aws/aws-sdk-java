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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/ListResourceScanResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceScanResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan.
     * </p>
     */
    private String resourceScanId;
    /**
     * <p>
     * If specified, the returned resources will have the specified resource identifier (or one of them in the case
     * where the resource has multiple identifiers).
     * </p>
     */
    private String resourceIdentifier;
    /**
     * <p>
     * If specified, the returned resources will be of any of the resource types with the specified prefix.
     * </p>
     */
    private String resourceTypePrefix;
    /**
     * <p>
     * If specified, the returned resources will have a matching tag key.
     * </p>
     */
    private String tagKey;
    /**
     * <p>
     * If specified, the returned resources will have a matching tag value.
     * </p>
     */
    private String tagValue;
    /**
     * <p>
     * A string that identifies the next page of resource scan results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * If the number of available results exceeds this maximum, the response includes a <code>NextToken</code> value
     * that you can use for the <code>NextToken</code> parameter to get the next set of results. By default the
     * <code>ListResourceScanResources</code> API action will return at most 100 results in each response. The maximum
     * value is 100.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan.
     * </p>
     * 
     * @param resourceScanId
     *        The Amazon Resource Name (ARN) of the resource scan.
     */

    public void setResourceScanId(String resourceScanId) {
        this.resourceScanId = resourceScanId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource scan.
     */

    public String getResourceScanId() {
        return this.resourceScanId;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource scan.
     * </p>
     * 
     * @param resourceScanId
     *        The Amazon Resource Name (ARN) of the resource scan.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanResourcesRequest withResourceScanId(String resourceScanId) {
        setResourceScanId(resourceScanId);
        return this;
    }

    /**
     * <p>
     * If specified, the returned resources will have the specified resource identifier (or one of them in the case
     * where the resource has multiple identifiers).
     * </p>
     * 
     * @param resourceIdentifier
     *        If specified, the returned resources will have the specified resource identifier (or one of them in the
     *        case where the resource has multiple identifiers).
     */

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * If specified, the returned resources will have the specified resource identifier (or one of them in the case
     * where the resource has multiple identifiers).
     * </p>
     * 
     * @return If specified, the returned resources will have the specified resource identifier (or one of them in the
     *         case where the resource has multiple identifiers).
     */

    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    /**
     * <p>
     * If specified, the returned resources will have the specified resource identifier (or one of them in the case
     * where the resource has multiple identifiers).
     * </p>
     * 
     * @param resourceIdentifier
     *        If specified, the returned resources will have the specified resource identifier (or one of them in the
     *        case where the resource has multiple identifiers).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanResourcesRequest withResourceIdentifier(String resourceIdentifier) {
        setResourceIdentifier(resourceIdentifier);
        return this;
    }

    /**
     * <p>
     * If specified, the returned resources will be of any of the resource types with the specified prefix.
     * </p>
     * 
     * @param resourceTypePrefix
     *        If specified, the returned resources will be of any of the resource types with the specified prefix.
     */

    public void setResourceTypePrefix(String resourceTypePrefix) {
        this.resourceTypePrefix = resourceTypePrefix;
    }

    /**
     * <p>
     * If specified, the returned resources will be of any of the resource types with the specified prefix.
     * </p>
     * 
     * @return If specified, the returned resources will be of any of the resource types with the specified prefix.
     */

    public String getResourceTypePrefix() {
        return this.resourceTypePrefix;
    }

    /**
     * <p>
     * If specified, the returned resources will be of any of the resource types with the specified prefix.
     * </p>
     * 
     * @param resourceTypePrefix
     *        If specified, the returned resources will be of any of the resource types with the specified prefix.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanResourcesRequest withResourceTypePrefix(String resourceTypePrefix) {
        setResourceTypePrefix(resourceTypePrefix);
        return this;
    }

    /**
     * <p>
     * If specified, the returned resources will have a matching tag key.
     * </p>
     * 
     * @param tagKey
     *        If specified, the returned resources will have a matching tag key.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * If specified, the returned resources will have a matching tag key.
     * </p>
     * 
     * @return If specified, the returned resources will have a matching tag key.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * If specified, the returned resources will have a matching tag key.
     * </p>
     * 
     * @param tagKey
     *        If specified, the returned resources will have a matching tag key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanResourcesRequest withTagKey(String tagKey) {
        setTagKey(tagKey);
        return this;
    }

    /**
     * <p>
     * If specified, the returned resources will have a matching tag value.
     * </p>
     * 
     * @param tagValue
     *        If specified, the returned resources will have a matching tag value.
     */

    public void setTagValue(String tagValue) {
        this.tagValue = tagValue;
    }

    /**
     * <p>
     * If specified, the returned resources will have a matching tag value.
     * </p>
     * 
     * @return If specified, the returned resources will have a matching tag value.
     */

    public String getTagValue() {
        return this.tagValue;
    }

    /**
     * <p>
     * If specified, the returned resources will have a matching tag value.
     * </p>
     * 
     * @param tagValue
     *        If specified, the returned resources will have a matching tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanResourcesRequest withTagValue(String tagValue) {
        setTagValue(tagValue);
        return this;
    }

    /**
     * <p>
     * A string that identifies the next page of resource scan results.
     * </p>
     * 
     * @param nextToken
     *        A string that identifies the next page of resource scan results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of resource scan results.
     * </p>
     * 
     * @return A string that identifies the next page of resource scan results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string that identifies the next page of resource scan results.
     * </p>
     * 
     * @param nextToken
     *        A string that identifies the next page of resource scan results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanResourcesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * If the number of available results exceeds this maximum, the response includes a <code>NextToken</code> value
     * that you can use for the <code>NextToken</code> parameter to get the next set of results. By default the
     * <code>ListResourceScanResources</code> API action will return at most 100 results in each response. The maximum
     * value is 100.
     * </p>
     * 
     * @param maxResults
     *        If the number of available results exceeds this maximum, the response includes a <code>NextToken</code>
     *        value that you can use for the <code>NextToken</code> parameter to get the next set of results. By default
     *        the <code>ListResourceScanResources</code> API action will return at most 100 results in each response.
     *        The maximum value is 100.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * If the number of available results exceeds this maximum, the response includes a <code>NextToken</code> value
     * that you can use for the <code>NextToken</code> parameter to get the next set of results. By default the
     * <code>ListResourceScanResources</code> API action will return at most 100 results in each response. The maximum
     * value is 100.
     * </p>
     * 
     * @return If the number of available results exceeds this maximum, the response includes a <code>NextToken</code>
     *         value that you can use for the <code>NextToken</code> parameter to get the next set of results. By
     *         default the <code>ListResourceScanResources</code> API action will return at most 100 results in each
     *         response. The maximum value is 100.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * If the number of available results exceeds this maximum, the response includes a <code>NextToken</code> value
     * that you can use for the <code>NextToken</code> parameter to get the next set of results. By default the
     * <code>ListResourceScanResources</code> API action will return at most 100 results in each response. The maximum
     * value is 100.
     * </p>
     * 
     * @param maxResults
     *        If the number of available results exceeds this maximum, the response includes a <code>NextToken</code>
     *        value that you can use for the <code>NextToken</code> parameter to get the next set of results. By default
     *        the <code>ListResourceScanResources</code> API action will return at most 100 results in each response.
     *        The maximum value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceScanResourcesRequest withMaxResults(Integer maxResults) {
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
        if (getResourceScanId() != null)
            sb.append("ResourceScanId: ").append(getResourceScanId()).append(",");
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: ").append(getResourceIdentifier()).append(",");
        if (getResourceTypePrefix() != null)
            sb.append("ResourceTypePrefix: ").append(getResourceTypePrefix()).append(",");
        if (getTagKey() != null)
            sb.append("TagKey: ").append(getTagKey()).append(",");
        if (getTagValue() != null)
            sb.append("TagValue: ").append(getTagValue()).append(",");
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

        if (obj instanceof ListResourceScanResourcesRequest == false)
            return false;
        ListResourceScanResourcesRequest other = (ListResourceScanResourcesRequest) obj;
        if (other.getResourceScanId() == null ^ this.getResourceScanId() == null)
            return false;
        if (other.getResourceScanId() != null && other.getResourceScanId().equals(this.getResourceScanId()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getResourceTypePrefix() == null ^ this.getResourceTypePrefix() == null)
            return false;
        if (other.getResourceTypePrefix() != null && other.getResourceTypePrefix().equals(this.getResourceTypePrefix()) == false)
            return false;
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
            return false;
        if (other.getTagValue() == null ^ this.getTagValue() == null)
            return false;
        if (other.getTagValue() != null && other.getTagValue().equals(this.getTagValue()) == false)
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

        hashCode = prime * hashCode + ((getResourceScanId() == null) ? 0 : getResourceScanId().hashCode());
        hashCode = prime * hashCode + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getResourceTypePrefix() == null) ? 0 : getResourceTypePrefix().hashCode());
        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getTagValue() == null) ? 0 : getTagValue().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceScanResourcesRequest clone() {
        return (ListResourceScanResourcesRequest) super.clone();
    }

}
