/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.outposts.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/outposts-2019-12-03/ListAssets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAssetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     */
    private String outpostIdentifier;
    /**
     * <p>
     * Filters the results by the host ID of a Dedicated Host.
     * </p>
     */
    private java.util.List<String> hostIdFilter;

    private Integer maxResults;

    private String nextToken;
    /**
     * <p>
     * Filters the results by state.
     * </p>
     */
    private java.util.List<String> statusFilter;

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostIdentifier
     *        The ID or the Amazon Resource Name (ARN) of the Outpost.
     */

    public void setOutpostIdentifier(String outpostIdentifier) {
        this.outpostIdentifier = outpostIdentifier;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @return The ID or the Amazon Resource Name (ARN) of the Outpost.
     */

    public String getOutpostIdentifier() {
        return this.outpostIdentifier;
    }

    /**
     * <p>
     * The ID or the Amazon Resource Name (ARN) of the Outpost.
     * </p>
     * 
     * @param outpostIdentifier
     *        The ID or the Amazon Resource Name (ARN) of the Outpost.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetsRequest withOutpostIdentifier(String outpostIdentifier) {
        setOutpostIdentifier(outpostIdentifier);
        return this;
    }

    /**
     * <p>
     * Filters the results by the host ID of a Dedicated Host.
     * </p>
     * 
     * @return Filters the results by the host ID of a Dedicated Host.
     */

    public java.util.List<String> getHostIdFilter() {
        return hostIdFilter;
    }

    /**
     * <p>
     * Filters the results by the host ID of a Dedicated Host.
     * </p>
     * 
     * @param hostIdFilter
     *        Filters the results by the host ID of a Dedicated Host.
     */

    public void setHostIdFilter(java.util.Collection<String> hostIdFilter) {
        if (hostIdFilter == null) {
            this.hostIdFilter = null;
            return;
        }

        this.hostIdFilter = new java.util.ArrayList<String>(hostIdFilter);
    }

    /**
     * <p>
     * Filters the results by the host ID of a Dedicated Host.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostIdFilter(java.util.Collection)} or {@link #withHostIdFilter(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hostIdFilter
     *        Filters the results by the host ID of a Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetsRequest withHostIdFilter(String... hostIdFilter) {
        if (this.hostIdFilter == null) {
            setHostIdFilter(new java.util.ArrayList<String>(hostIdFilter.length));
        }
        for (String ele : hostIdFilter) {
            this.hostIdFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by the host ID of a Dedicated Host.
     * </p>
     * 
     * @param hostIdFilter
     *        Filters the results by the host ID of a Dedicated Host.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetsRequest withHostIdFilter(java.util.Collection<String> hostIdFilter) {
        setHostIdFilter(hostIdFilter);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAssetsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Filters the results by state.
     * </p>
     * 
     * @return Filters the results by state.
     * @see AssetState
     */

    public java.util.List<String> getStatusFilter() {
        return statusFilter;
    }

    /**
     * <p>
     * Filters the results by state.
     * </p>
     * 
     * @param statusFilter
     *        Filters the results by state.
     * @see AssetState
     */

    public void setStatusFilter(java.util.Collection<String> statusFilter) {
        if (statusFilter == null) {
            this.statusFilter = null;
            return;
        }

        this.statusFilter = new java.util.ArrayList<String>(statusFilter);
    }

    /**
     * <p>
     * Filters the results by state.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatusFilter(java.util.Collection)} or {@link #withStatusFilter(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statusFilter
     *        Filters the results by state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetState
     */

    public ListAssetsRequest withStatusFilter(String... statusFilter) {
        if (this.statusFilter == null) {
            setStatusFilter(new java.util.ArrayList<String>(statusFilter.length));
        }
        for (String ele : statusFilter) {
            this.statusFilter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Filters the results by state.
     * </p>
     * 
     * @param statusFilter
     *        Filters the results by state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetState
     */

    public ListAssetsRequest withStatusFilter(java.util.Collection<String> statusFilter) {
        setStatusFilter(statusFilter);
        return this;
    }

    /**
     * <p>
     * Filters the results by state.
     * </p>
     * 
     * @param statusFilter
     *        Filters the results by state.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssetState
     */

    public ListAssetsRequest withStatusFilter(AssetState... statusFilter) {
        java.util.ArrayList<String> statusFilterCopy = new java.util.ArrayList<String>(statusFilter.length);
        for (AssetState value : statusFilter) {
            statusFilterCopy.add(value.toString());
        }
        if (getStatusFilter() == null) {
            setStatusFilter(statusFilterCopy);
        } else {
            getStatusFilter().addAll(statusFilterCopy);
        }
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
        if (getOutpostIdentifier() != null)
            sb.append("OutpostIdentifier: ").append(getOutpostIdentifier()).append(",");
        if (getHostIdFilter() != null)
            sb.append("HostIdFilter: ").append(getHostIdFilter()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStatusFilter() != null)
            sb.append("StatusFilter: ").append(getStatusFilter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAssetsRequest == false)
            return false;
        ListAssetsRequest other = (ListAssetsRequest) obj;
        if (other.getOutpostIdentifier() == null ^ this.getOutpostIdentifier() == null)
            return false;
        if (other.getOutpostIdentifier() != null && other.getOutpostIdentifier().equals(this.getOutpostIdentifier()) == false)
            return false;
        if (other.getHostIdFilter() == null ^ this.getHostIdFilter() == null)
            return false;
        if (other.getHostIdFilter() != null && other.getHostIdFilter().equals(this.getHostIdFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStatusFilter() == null ^ this.getStatusFilter() == null)
            return false;
        if (other.getStatusFilter() != null && other.getStatusFilter().equals(this.getStatusFilter()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOutpostIdentifier() == null) ? 0 : getOutpostIdentifier().hashCode());
        hashCode = prime * hashCode + ((getHostIdFilter() == null) ? 0 : getHostIdFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStatusFilter() == null) ? 0 : getStatusFilter().hashCode());
        return hashCode;
    }

    @Override
    public ListAssetsRequest clone() {
        return (ListAssetsRequest) super.clone();
    }

}
