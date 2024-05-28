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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/DescribeStorageSystemResources"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStorageSystemResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that's collecting data from your on-premises
     * storage system.
     * </p>
     */
    private String discoveryJobArn;
    /**
     * <p>
     * Specifies what kind of storage system resources that you want information about.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Specifies the universally unique identifiers (UUIDs) of the storage system resources that you want information
     * about. You can't use this parameter in combination with the <code>Filter</code> parameter.
     * </p>
     */
    private java.util.List<String> resourceIds;
    /**
     * <p>
     * Filters the storage system resources that you want returned. For example, this might be volumes associated with a
     * specific storage virtual machine (SVM).
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> filter;
    /**
     * <p>
     * Specifies the maximum number of storage system resources that you want to list in a response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that's collecting data from your on-premises
     * storage system.
     * </p>
     * 
     * @param discoveryJobArn
     *        Specifies the Amazon Resource Name (ARN) of the discovery job that's collecting data from your on-premises
     *        storage system.
     */

    public void setDiscoveryJobArn(String discoveryJobArn) {
        this.discoveryJobArn = discoveryJobArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that's collecting data from your on-premises
     * storage system.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the discovery job that's collecting data from your
     *         on-premises storage system.
     */

    public String getDiscoveryJobArn() {
        return this.discoveryJobArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the discovery job that's collecting data from your on-premises
     * storage system.
     * </p>
     * 
     * @param discoveryJobArn
     *        Specifies the Amazon Resource Name (ARN) of the discovery job that's collecting data from your on-premises
     *        storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourcesRequest withDiscoveryJobArn(String discoveryJobArn) {
        setDiscoveryJobArn(discoveryJobArn);
        return this;
    }

    /**
     * <p>
     * Specifies what kind of storage system resources that you want information about.
     * </p>
     * 
     * @param resourceType
     *        Specifies what kind of storage system resources that you want information about.
     * @see DiscoveryResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Specifies what kind of storage system resources that you want information about.
     * </p>
     * 
     * @return Specifies what kind of storage system resources that you want information about.
     * @see DiscoveryResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Specifies what kind of storage system resources that you want information about.
     * </p>
     * 
     * @param resourceType
     *        Specifies what kind of storage system resources that you want information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryResourceType
     */

    public DescribeStorageSystemResourcesRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Specifies what kind of storage system resources that you want information about.
     * </p>
     * 
     * @param resourceType
     *        Specifies what kind of storage system resources that you want information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoveryResourceType
     */

    public DescribeStorageSystemResourcesRequest withResourceType(DiscoveryResourceType resourceType) {
        this.resourceType = resourceType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the universally unique identifiers (UUIDs) of the storage system resources that you want information
     * about. You can't use this parameter in combination with the <code>Filter</code> parameter.
     * </p>
     * 
     * @return Specifies the universally unique identifiers (UUIDs) of the storage system resources that you want
     *         information about. You can't use this parameter in combination with the <code>Filter</code> parameter.
     */

    public java.util.List<String> getResourceIds() {
        return resourceIds;
    }

    /**
     * <p>
     * Specifies the universally unique identifiers (UUIDs) of the storage system resources that you want information
     * about. You can't use this parameter in combination with the <code>Filter</code> parameter.
     * </p>
     * 
     * @param resourceIds
     *        Specifies the universally unique identifiers (UUIDs) of the storage system resources that you want
     *        information about. You can't use this parameter in combination with the <code>Filter</code> parameter.
     */

    public void setResourceIds(java.util.Collection<String> resourceIds) {
        if (resourceIds == null) {
            this.resourceIds = null;
            return;
        }

        this.resourceIds = new java.util.ArrayList<String>(resourceIds);
    }

    /**
     * <p>
     * Specifies the universally unique identifiers (UUIDs) of the storage system resources that you want information
     * about. You can't use this parameter in combination with the <code>Filter</code> parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceIds(java.util.Collection)} or {@link #withResourceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param resourceIds
     *        Specifies the universally unique identifiers (UUIDs) of the storage system resources that you want
     *        information about. You can't use this parameter in combination with the <code>Filter</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourcesRequest withResourceIds(String... resourceIds) {
        if (this.resourceIds == null) {
            setResourceIds(new java.util.ArrayList<String>(resourceIds.length));
        }
        for (String ele : resourceIds) {
            this.resourceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the universally unique identifiers (UUIDs) of the storage system resources that you want information
     * about. You can't use this parameter in combination with the <code>Filter</code> parameter.
     * </p>
     * 
     * @param resourceIds
     *        Specifies the universally unique identifiers (UUIDs) of the storage system resources that you want
     *        information about. You can't use this parameter in combination with the <code>Filter</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourcesRequest withResourceIds(java.util.Collection<String> resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * Filters the storage system resources that you want returned. For example, this might be volumes associated with a
     * specific storage virtual machine (SVM).
     * </p>
     * 
     * @return Filters the storage system resources that you want returned. For example, this might be volumes
     *         associated with a specific storage virtual machine (SVM).
     */

    public java.util.Map<String, java.util.List<String>> getFilter() {
        return filter;
    }

    /**
     * <p>
     * Filters the storage system resources that you want returned. For example, this might be volumes associated with a
     * specific storage virtual machine (SVM).
     * </p>
     * 
     * @param filter
     *        Filters the storage system resources that you want returned. For example, this might be volumes associated
     *        with a specific storage virtual machine (SVM).
     */

    public void setFilter(java.util.Map<String, java.util.List<String>> filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * Filters the storage system resources that you want returned. For example, this might be volumes associated with a
     * specific storage virtual machine (SVM).
     * </p>
     * 
     * @param filter
     *        Filters the storage system resources that you want returned. For example, this might be volumes associated
     *        with a specific storage virtual machine (SVM).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourcesRequest withFilter(java.util.Map<String, java.util.List<String>> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Add a single Filter entry
     *
     * @see DescribeStorageSystemResourcesRequest#withFilter
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourcesRequest addFilterEntry(String key, java.util.List<String> value) {
        if (null == this.filter) {
            this.filter = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.filter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filter.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourcesRequest clearFilterEntries() {
        this.filter = null;
        return this;
    }

    /**
     * <p>
     * Specifies the maximum number of storage system resources that you want to list in a response.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of storage system resources that you want to list in a response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of storage system resources that you want to list in a response.
     * </p>
     * 
     * @return Specifies the maximum number of storage system resources that you want to list in a response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Specifies the maximum number of storage system resources that you want to list in a response.
     * </p>
     * 
     * @param maxResults
     *        Specifies the maximum number of storage system resources that you want to list in a response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        Specifies an opaque string that indicates the position to begin the next list of results in the response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @return Specifies an opaque string that indicates the position to begin the next list of results in the response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * </p>
     * 
     * @param nextToken
     *        Specifies an opaque string that indicates the position to begin the next list of results in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageSystemResourcesRequest withNextToken(String nextToken) {
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
        if (getDiscoveryJobArn() != null)
            sb.append("DiscoveryJobArn: ").append(getDiscoveryJobArn()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
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

        if (obj instanceof DescribeStorageSystemResourcesRequest == false)
            return false;
        DescribeStorageSystemResourcesRequest other = (DescribeStorageSystemResourcesRequest) obj;
        if (other.getDiscoveryJobArn() == null ^ this.getDiscoveryJobArn() == null)
            return false;
        if (other.getDiscoveryJobArn() != null && other.getDiscoveryJobArn().equals(this.getDiscoveryJobArn()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
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

        hashCode = prime * hashCode + ((getDiscoveryJobArn() == null) ? 0 : getDiscoveryJobArn().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStorageSystemResourcesRequest clone() {
        return (DescribeStorageSystemResourcesRequest) super.clone();
    }

}
