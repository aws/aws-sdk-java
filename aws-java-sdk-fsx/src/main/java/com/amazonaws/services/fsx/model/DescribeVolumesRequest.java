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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeVolumes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeVolumesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The IDs of the volumes whose descriptions you want to retrieve.
     * </p>
     */
    private java.util.List<String> volumeIds;
    /**
     * <p>
     * Enter a filter <code>Name</code> and <code>Values</code> pair to view a select set of volumes.
     * </p>
     */
    private java.util.List<VolumeFilter> filters;

    private Integer maxResults;

    private String nextToken;

    /**
     * <p>
     * The IDs of the volumes whose descriptions you want to retrieve.
     * </p>
     * 
     * @return The IDs of the volumes whose descriptions you want to retrieve.
     */

    public java.util.List<String> getVolumeIds() {
        return volumeIds;
    }

    /**
     * <p>
     * The IDs of the volumes whose descriptions you want to retrieve.
     * </p>
     * 
     * @param volumeIds
     *        The IDs of the volumes whose descriptions you want to retrieve.
     */

    public void setVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
            return;
        }

        this.volumeIds = new java.util.ArrayList<String>(volumeIds);
    }

    /**
     * <p>
     * The IDs of the volumes whose descriptions you want to retrieve.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumeIds(java.util.Collection)} or {@link #withVolumeIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param volumeIds
     *        The IDs of the volumes whose descriptions you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withVolumeIds(String... volumeIds) {
        if (this.volumeIds == null) {
            setVolumeIds(new java.util.ArrayList<String>(volumeIds.length));
        }
        for (String ele : volumeIds) {
            this.volumeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IDs of the volumes whose descriptions you want to retrieve.
     * </p>
     * 
     * @param volumeIds
     *        The IDs of the volumes whose descriptions you want to retrieve.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withVolumeIds(java.util.Collection<String> volumeIds) {
        setVolumeIds(volumeIds);
        return this;
    }

    /**
     * <p>
     * Enter a filter <code>Name</code> and <code>Values</code> pair to view a select set of volumes.
     * </p>
     * 
     * @return Enter a filter <code>Name</code> and <code>Values</code> pair to view a select set of volumes.
     */

    public java.util.List<VolumeFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Enter a filter <code>Name</code> and <code>Values</code> pair to view a select set of volumes.
     * </p>
     * 
     * @param filters
     *        Enter a filter <code>Name</code> and <code>Values</code> pair to view a select set of volumes.
     */

    public void setFilters(java.util.Collection<VolumeFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<VolumeFilter>(filters);
    }

    /**
     * <p>
     * Enter a filter <code>Name</code> and <code>Values</code> pair to view a select set of volumes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Enter a filter <code>Name</code> and <code>Values</code> pair to view a select set of volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withFilters(VolumeFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<VolumeFilter>(filters.length));
        }
        for (VolumeFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Enter a filter <code>Name</code> and <code>Values</code> pair to view a select set of volumes.
     * </p>
     * 
     * @param filters
     *        Enter a filter <code>Name</code> and <code>Values</code> pair to view a select set of volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesRequest withFilters(java.util.Collection<VolumeFilter> filters) {
        setFilters(filters);
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

    public DescribeVolumesRequest withMaxResults(Integer maxResults) {
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

    public DescribeVolumesRequest withNextToken(String nextToken) {
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
        if (getVolumeIds() != null)
            sb.append("VolumeIds: ").append(getVolumeIds()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof DescribeVolumesRequest == false)
            return false;
        DescribeVolumesRequest other = (DescribeVolumesRequest) obj;
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null)
            return false;
        if (other.getVolumeIds() != null && other.getVolumeIds().equals(this.getVolumeIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getVolumeIds() == null) ? 0 : getVolumeIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVolumesRequest clone() {
        return (DescribeVolumesRequest) super.clone();
    }

}
