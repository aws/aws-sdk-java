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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeStorageVirtualMachines" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStorageVirtualMachinesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Enter the ID of one or more SVMs that you want to view.
     * </p>
     */
    private java.util.List<String> storageVirtualMachineIds;
    /**
     * <p>
     * Enter a filter name:value pair to view a select set of SVMs.
     * </p>
     */
    private java.util.List<StorageVirtualMachineFilter> filters;

    private Integer maxResults;

    private String nextToken;

    /**
     * <p>
     * Enter the ID of one or more SVMs that you want to view.
     * </p>
     * 
     * @return Enter the ID of one or more SVMs that you want to view.
     */

    public java.util.List<String> getStorageVirtualMachineIds() {
        return storageVirtualMachineIds;
    }

    /**
     * <p>
     * Enter the ID of one or more SVMs that you want to view.
     * </p>
     * 
     * @param storageVirtualMachineIds
     *        Enter the ID of one or more SVMs that you want to view.
     */

    public void setStorageVirtualMachineIds(java.util.Collection<String> storageVirtualMachineIds) {
        if (storageVirtualMachineIds == null) {
            this.storageVirtualMachineIds = null;
            return;
        }

        this.storageVirtualMachineIds = new java.util.ArrayList<String>(storageVirtualMachineIds);
    }

    /**
     * <p>
     * Enter the ID of one or more SVMs that you want to view.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorageVirtualMachineIds(java.util.Collection)} or
     * {@link #withStorageVirtualMachineIds(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param storageVirtualMachineIds
     *        Enter the ID of one or more SVMs that you want to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageVirtualMachinesRequest withStorageVirtualMachineIds(String... storageVirtualMachineIds) {
        if (this.storageVirtualMachineIds == null) {
            setStorageVirtualMachineIds(new java.util.ArrayList<String>(storageVirtualMachineIds.length));
        }
        for (String ele : storageVirtualMachineIds) {
            this.storageVirtualMachineIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Enter the ID of one or more SVMs that you want to view.
     * </p>
     * 
     * @param storageVirtualMachineIds
     *        Enter the ID of one or more SVMs that you want to view.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageVirtualMachinesRequest withStorageVirtualMachineIds(java.util.Collection<String> storageVirtualMachineIds) {
        setStorageVirtualMachineIds(storageVirtualMachineIds);
        return this;
    }

    /**
     * <p>
     * Enter a filter name:value pair to view a select set of SVMs.
     * </p>
     * 
     * @return Enter a filter name:value pair to view a select set of SVMs.
     */

    public java.util.List<StorageVirtualMachineFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Enter a filter name:value pair to view a select set of SVMs.
     * </p>
     * 
     * @param filters
     *        Enter a filter name:value pair to view a select set of SVMs.
     */

    public void setFilters(java.util.Collection<StorageVirtualMachineFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<StorageVirtualMachineFilter>(filters);
    }

    /**
     * <p>
     * Enter a filter name:value pair to view a select set of SVMs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Enter a filter name:value pair to view a select set of SVMs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageVirtualMachinesRequest withFilters(StorageVirtualMachineFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<StorageVirtualMachineFilter>(filters.length));
        }
        for (StorageVirtualMachineFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Enter a filter name:value pair to view a select set of SVMs.
     * </p>
     * 
     * @param filters
     *        Enter a filter name:value pair to view a select set of SVMs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageVirtualMachinesRequest withFilters(java.util.Collection<StorageVirtualMachineFilter> filters) {
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

    public DescribeStorageVirtualMachinesRequest withMaxResults(Integer maxResults) {
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

    public DescribeStorageVirtualMachinesRequest withNextToken(String nextToken) {
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
        if (getStorageVirtualMachineIds() != null)
            sb.append("StorageVirtualMachineIds: ").append(getStorageVirtualMachineIds()).append(",");
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

        if (obj instanceof DescribeStorageVirtualMachinesRequest == false)
            return false;
        DescribeStorageVirtualMachinesRequest other = (DescribeStorageVirtualMachinesRequest) obj;
        if (other.getStorageVirtualMachineIds() == null ^ this.getStorageVirtualMachineIds() == null)
            return false;
        if (other.getStorageVirtualMachineIds() != null && other.getStorageVirtualMachineIds().equals(this.getStorageVirtualMachineIds()) == false)
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

        hashCode = prime * hashCode + ((getStorageVirtualMachineIds() == null) ? 0 : getStorageVirtualMachineIds().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStorageVirtualMachinesRequest clone() {
        return (DescribeStorageVirtualMachinesRequest) super.clone();
    }

}
