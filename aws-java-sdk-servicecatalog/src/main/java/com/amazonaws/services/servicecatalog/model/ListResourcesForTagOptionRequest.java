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
package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/servicecatalog-2015-12-10/ListResourcesForTagOption"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesForTagOptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The TagOption identifier.
     * </p>
     */
    private String tagOptionId;
    /**
     * <p>
     * The resource type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Portfolio</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Product</code>
     * </p>
     * </li>
     * </ul>
     */
    private String resourceType;
    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     */
    private String pageToken;

    /**
     * <p>
     * The TagOption identifier.
     * </p>
     * 
     * @param tagOptionId
     *        The TagOption identifier.
     */

    public void setTagOptionId(String tagOptionId) {
        this.tagOptionId = tagOptionId;
    }

    /**
     * <p>
     * The TagOption identifier.
     * </p>
     * 
     * @return The TagOption identifier.
     */

    public String getTagOptionId() {
        return this.tagOptionId;
    }

    /**
     * <p>
     * The TagOption identifier.
     * </p>
     * 
     * @param tagOptionId
     *        The TagOption identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesForTagOptionRequest withTagOptionId(String tagOptionId) {
        setTagOptionId(tagOptionId);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Portfolio</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Product</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        The resource type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Portfolio</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Product</code>
     *        </p>
     *        </li>
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Portfolio</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Product</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The resource type.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Portfolio</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Product</code>
     *         </p>
     *         </li>
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Portfolio</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Product</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param resourceType
     *        The resource type.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Portfolio</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Product</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesForTagOptionRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to return with this call.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @return The maximum number of items to return with this call.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to return with this call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesForTagOptionRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @param pageToken
     *        The page token for the next set of results. To retrieve the first set of results, use null.
     */

    public void setPageToken(String pageToken) {
        this.pageToken = pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @return The page token for the next set of results. To retrieve the first set of results, use null.
     */

    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * <p>
     * The page token for the next set of results. To retrieve the first set of results, use null.
     * </p>
     * 
     * @param pageToken
     *        The page token for the next set of results. To retrieve the first set of results, use null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesForTagOptionRequest withPageToken(String pageToken) {
        setPageToken(pageToken);
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
        if (getTagOptionId() != null)
            sb.append("TagOptionId: ").append(getTagOptionId()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getPageToken() != null)
            sb.append("PageToken: ").append(getPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourcesForTagOptionRequest == false)
            return false;
        ListResourcesForTagOptionRequest other = (ListResourcesForTagOptionRequest) obj;
        if (other.getTagOptionId() == null ^ this.getTagOptionId() == null)
            return false;
        if (other.getTagOptionId() != null && other.getTagOptionId().equals(this.getTagOptionId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getPageToken() == null ^ this.getPageToken() == null)
            return false;
        if (other.getPageToken() != null && other.getPageToken().equals(this.getPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTagOptionId() == null) ? 0 : getTagOptionId().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getPageToken() == null) ? 0 : getPageToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesForTagOptionRequest clone() {
        return (ListResourcesForTagOptionRequest) super.clone();
    }

}
