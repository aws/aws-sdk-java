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
package com.amazonaws.services.ram.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ram-2018-01-04/GetResourceShares" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceSharesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     */
    private java.util.List<String> resourceShareArns;
    /**
     * <p>
     * The status of the resource share.
     * </p>
     */
    private String resourceShareStatus;
    /**
     * <p>
     * The type of owner.
     * </p>
     */
    private String resourceOwner;
    /**
     * <p>
     * The name of the resource share.
     * </p>
     */
    private String name;
    /**
     * <p>
     * One or more tag filters.
     * </p>
     */
    private java.util.List<TagFilter> tagFilters;
    /**
     * <p>
     * The token for the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * 
     * @return The Amazon Resource Names (ARN) of the resource shares.
     */

    public java.util.List<String> getResourceShareArns() {
        return resourceShareArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * 
     * @param resourceShareArns
     *        The Amazon Resource Names (ARN) of the resource shares.
     */

    public void setResourceShareArns(java.util.Collection<String> resourceShareArns) {
        if (resourceShareArns == null) {
            this.resourceShareArns = null;
            return;
        }

        this.resourceShareArns = new java.util.ArrayList<String>(resourceShareArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceShareArns(java.util.Collection)} or {@link #withResourceShareArns(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceShareArns
     *        The Amazon Resource Names (ARN) of the resource shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesRequest withResourceShareArns(String... resourceShareArns) {
        if (this.resourceShareArns == null) {
            setResourceShareArns(new java.util.ArrayList<String>(resourceShareArns.length));
        }
        for (String ele : resourceShareArns) {
            this.resourceShareArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARN) of the resource shares.
     * </p>
     * 
     * @param resourceShareArns
     *        The Amazon Resource Names (ARN) of the resource shares.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesRequest withResourceShareArns(java.util.Collection<String> resourceShareArns) {
        setResourceShareArns(resourceShareArns);
        return this;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * 
     * @param resourceShareStatus
     *        The status of the resource share.
     * @see ResourceShareStatus
     */

    public void setResourceShareStatus(String resourceShareStatus) {
        this.resourceShareStatus = resourceShareStatus;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * 
     * @return The status of the resource share.
     * @see ResourceShareStatus
     */

    public String getResourceShareStatus() {
        return this.resourceShareStatus;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * 
     * @param resourceShareStatus
     *        The status of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareStatus
     */

    public GetResourceSharesRequest withResourceShareStatus(String resourceShareStatus) {
        setResourceShareStatus(resourceShareStatus);
        return this;
    }

    /**
     * <p>
     * The status of the resource share.
     * </p>
     * 
     * @param resourceShareStatus
     *        The status of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceShareStatus
     */

    public GetResourceSharesRequest withResourceShareStatus(ResourceShareStatus resourceShareStatus) {
        this.resourceShareStatus = resourceShareStatus.toString();
        return this;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * 
     * @param resourceOwner
     *        The type of owner.
     * @see ResourceOwner
     */

    public void setResourceOwner(String resourceOwner) {
        this.resourceOwner = resourceOwner;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * 
     * @return The type of owner.
     * @see ResourceOwner
     */

    public String getResourceOwner() {
        return this.resourceOwner;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * 
     * @param resourceOwner
     *        The type of owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceOwner
     */

    public GetResourceSharesRequest withResourceOwner(String resourceOwner) {
        setResourceOwner(resourceOwner);
        return this;
    }

    /**
     * <p>
     * The type of owner.
     * </p>
     * 
     * @param resourceOwner
     *        The type of owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ResourceOwner
     */

    public GetResourceSharesRequest withResourceOwner(ResourceOwner resourceOwner) {
        this.resourceOwner = resourceOwner.toString();
        return this;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param name
     *        The name of the resource share.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @return The name of the resource share.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the resource share.
     * </p>
     * 
     * @param name
     *        The name of the resource share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * One or more tag filters.
     * </p>
     * 
     * @return One or more tag filters.
     */

    public java.util.List<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * <p>
     * One or more tag filters.
     * </p>
     * 
     * @param tagFilters
     *        One or more tag filters.
     */

    public void setTagFilters(java.util.Collection<TagFilter> tagFilters) {
        if (tagFilters == null) {
            this.tagFilters = null;
            return;
        }

        this.tagFilters = new java.util.ArrayList<TagFilter>(tagFilters);
    }

    /**
     * <p>
     * One or more tag filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagFilters(java.util.Collection)} or {@link #withTagFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param tagFilters
     *        One or more tag filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesRequest withTagFilters(TagFilter... tagFilters) {
        if (this.tagFilters == null) {
            setTagFilters(new java.util.ArrayList<TagFilter>(tagFilters.length));
        }
        for (TagFilter ele : tagFilters) {
            this.tagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more tag filters.
     * </p>
     * 
     * @param tagFilters
     *        One or more tag filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesRequest withTagFilters(java.util.Collection<TagFilter> tagFilters) {
        setTagFilters(tagFilters);
        return this;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @return The token for the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token for the next page of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @return The maximum number of results to return with a single call. To retrieve the remaining results, make
     *         another call with the returned <code>nextToken</code> value.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return with a single call. To retrieve the remaining results, make another call
     * with the returned <code>nextToken</code> value.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return with a single call. To retrieve the remaining results, make
     *        another call with the returned <code>nextToken</code> value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceSharesRequest withMaxResults(Integer maxResults) {
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
        if (getResourceShareArns() != null)
            sb.append("ResourceShareArns: ").append(getResourceShareArns()).append(",");
        if (getResourceShareStatus() != null)
            sb.append("ResourceShareStatus: ").append(getResourceShareStatus()).append(",");
        if (getResourceOwner() != null)
            sb.append("ResourceOwner: ").append(getResourceOwner()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getTagFilters() != null)
            sb.append("TagFilters: ").append(getTagFilters()).append(",");
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

        if (obj instanceof GetResourceSharesRequest == false)
            return false;
        GetResourceSharesRequest other = (GetResourceSharesRequest) obj;
        if (other.getResourceShareArns() == null ^ this.getResourceShareArns() == null)
            return false;
        if (other.getResourceShareArns() != null && other.getResourceShareArns().equals(this.getResourceShareArns()) == false)
            return false;
        if (other.getResourceShareStatus() == null ^ this.getResourceShareStatus() == null)
            return false;
        if (other.getResourceShareStatus() != null && other.getResourceShareStatus().equals(this.getResourceShareStatus()) == false)
            return false;
        if (other.getResourceOwner() == null ^ this.getResourceOwner() == null)
            return false;
        if (other.getResourceOwner() != null && other.getResourceOwner().equals(this.getResourceOwner()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTagFilters() == null ^ this.getTagFilters() == null)
            return false;
        if (other.getTagFilters() != null && other.getTagFilters().equals(this.getTagFilters()) == false)
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

        hashCode = prime * hashCode + ((getResourceShareArns() == null) ? 0 : getResourceShareArns().hashCode());
        hashCode = prime * hashCode + ((getResourceShareStatus() == null) ? 0 : getResourceShareStatus().hashCode());
        hashCode = prime * hashCode + ((getResourceOwner() == null) ? 0 : getResourceOwner().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTagFilters() == null) ? 0 : getTagFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceSharesRequest clone() {
        return (GetResourceSharesRequest) super.clone();
    }

}
