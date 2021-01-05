/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostCategories" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCostCategoriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If the number of objects that are still available for retrieval exceeds the limit, AWS returns a NextPageToken
     * value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     * request.
     * </p>
     */
    private String nextPageToken;
    /**
     * <p>
     * The names of the Cost Categories.
     * </p>
     */
    private java.util.List<String> costCategoryNames;
    /**
     * <p>
     * The Cost Category values.
     * </p>
     * <p>
     * <code>CostCategoryValues</code> are not returned if <code>CostCategoryName</code> is not specified in the
     * request.
     * </p>
     */
    private java.util.List<String> costCategoryValues;
    /**
     * <p>
     * The number of objects returned.
     * </p>
     */
    private Integer returnSize;
    /**
     * <p>
     * The total number of objects.
     * </p>
     */
    private Integer totalSize;

    /**
     * <p>
     * If the number of objects that are still available for retrieval exceeds the limit, AWS returns a NextPageToken
     * value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     * request.
     * </p>
     * 
     * @param nextPageToken
     *        If the number of objects that are still available for retrieval exceeds the limit, AWS returns a
     *        NextPageToken value in the response. To retrieve the next batch of objects, provide the marker from the
     *        prior call in your next request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * If the number of objects that are still available for retrieval exceeds the limit, AWS returns a NextPageToken
     * value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     * request.
     * </p>
     * 
     * @return If the number of objects that are still available for retrieval exceeds the limit, AWS returns a
     *         NextPageToken value in the response. To retrieve the next batch of objects, provide the marker from the
     *         prior call in your next request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * If the number of objects that are still available for retrieval exceeds the limit, AWS returns a NextPageToken
     * value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next
     * request.
     * </p>
     * 
     * @param nextPageToken
     *        If the number of objects that are still available for retrieval exceeds the limit, AWS returns a
     *        NextPageToken value in the response. To retrieve the next batch of objects, provide the marker from the
     *        prior call in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesResult withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
        return this;
    }

    /**
     * <p>
     * The names of the Cost Categories.
     * </p>
     * 
     * @return The names of the Cost Categories.
     */

    public java.util.List<String> getCostCategoryNames() {
        return costCategoryNames;
    }

    /**
     * <p>
     * The names of the Cost Categories.
     * </p>
     * 
     * @param costCategoryNames
     *        The names of the Cost Categories.
     */

    public void setCostCategoryNames(java.util.Collection<String> costCategoryNames) {
        if (costCategoryNames == null) {
            this.costCategoryNames = null;
            return;
        }

        this.costCategoryNames = new java.util.ArrayList<String>(costCategoryNames);
    }

    /**
     * <p>
     * The names of the Cost Categories.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCostCategoryNames(java.util.Collection)} or {@link #withCostCategoryNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param costCategoryNames
     *        The names of the Cost Categories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesResult withCostCategoryNames(String... costCategoryNames) {
        if (this.costCategoryNames == null) {
            setCostCategoryNames(new java.util.ArrayList<String>(costCategoryNames.length));
        }
        for (String ele : costCategoryNames) {
            this.costCategoryNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the Cost Categories.
     * </p>
     * 
     * @param costCategoryNames
     *        The names of the Cost Categories.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesResult withCostCategoryNames(java.util.Collection<String> costCategoryNames) {
        setCostCategoryNames(costCategoryNames);
        return this;
    }

    /**
     * <p>
     * The Cost Category values.
     * </p>
     * <p>
     * <code>CostCategoryValues</code> are not returned if <code>CostCategoryName</code> is not specified in the
     * request.
     * </p>
     * 
     * @return The Cost Category values.</p>
     *         <p>
     *         <code>CostCategoryValues</code> are not returned if <code>CostCategoryName</code> is not specified in the
     *         request.
     */

    public java.util.List<String> getCostCategoryValues() {
        return costCategoryValues;
    }

    /**
     * <p>
     * The Cost Category values.
     * </p>
     * <p>
     * <code>CostCategoryValues</code> are not returned if <code>CostCategoryName</code> is not specified in the
     * request.
     * </p>
     * 
     * @param costCategoryValues
     *        The Cost Category values.</p>
     *        <p>
     *        <code>CostCategoryValues</code> are not returned if <code>CostCategoryName</code> is not specified in the
     *        request.
     */

    public void setCostCategoryValues(java.util.Collection<String> costCategoryValues) {
        if (costCategoryValues == null) {
            this.costCategoryValues = null;
            return;
        }

        this.costCategoryValues = new java.util.ArrayList<String>(costCategoryValues);
    }

    /**
     * <p>
     * The Cost Category values.
     * </p>
     * <p>
     * <code>CostCategoryValues</code> are not returned if <code>CostCategoryName</code> is not specified in the
     * request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCostCategoryValues(java.util.Collection)} or {@link #withCostCategoryValues(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param costCategoryValues
     *        The Cost Category values.</p>
     *        <p>
     *        <code>CostCategoryValues</code> are not returned if <code>CostCategoryName</code> is not specified in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesResult withCostCategoryValues(String... costCategoryValues) {
        if (this.costCategoryValues == null) {
            setCostCategoryValues(new java.util.ArrayList<String>(costCategoryValues.length));
        }
        for (String ele : costCategoryValues) {
            this.costCategoryValues.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Cost Category values.
     * </p>
     * <p>
     * <code>CostCategoryValues</code> are not returned if <code>CostCategoryName</code> is not specified in the
     * request.
     * </p>
     * 
     * @param costCategoryValues
     *        The Cost Category values.</p>
     *        <p>
     *        <code>CostCategoryValues</code> are not returned if <code>CostCategoryName</code> is not specified in the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesResult withCostCategoryValues(java.util.Collection<String> costCategoryValues) {
        setCostCategoryValues(costCategoryValues);
        return this;
    }

    /**
     * <p>
     * The number of objects returned.
     * </p>
     * 
     * @param returnSize
     *        The number of objects returned.
     */

    public void setReturnSize(Integer returnSize) {
        this.returnSize = returnSize;
    }

    /**
     * <p>
     * The number of objects returned.
     * </p>
     * 
     * @return The number of objects returned.
     */

    public Integer getReturnSize() {
        return this.returnSize;
    }

    /**
     * <p>
     * The number of objects returned.
     * </p>
     * 
     * @param returnSize
     *        The number of objects returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesResult withReturnSize(Integer returnSize) {
        setReturnSize(returnSize);
        return this;
    }

    /**
     * <p>
     * The total number of objects.
     * </p>
     * 
     * @param totalSize
     *        The total number of objects.
     */

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * <p>
     * The total number of objects.
     * </p>
     * 
     * @return The total number of objects.
     */

    public Integer getTotalSize() {
        return this.totalSize;
    }

    /**
     * <p>
     * The total number of objects.
     * </p>
     * 
     * @param totalSize
     *        The total number of objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesResult withTotalSize(Integer totalSize) {
        setTotalSize(totalSize);
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
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken()).append(",");
        if (getCostCategoryNames() != null)
            sb.append("CostCategoryNames: ").append(getCostCategoryNames()).append(",");
        if (getCostCategoryValues() != null)
            sb.append("CostCategoryValues: ").append(getCostCategoryValues()).append(",");
        if (getReturnSize() != null)
            sb.append("ReturnSize: ").append(getReturnSize()).append(",");
        if (getTotalSize() != null)
            sb.append("TotalSize: ").append(getTotalSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCostCategoriesResult == false)
            return false;
        GetCostCategoriesResult other = (GetCostCategoriesResult) obj;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        if (other.getCostCategoryNames() == null ^ this.getCostCategoryNames() == null)
            return false;
        if (other.getCostCategoryNames() != null && other.getCostCategoryNames().equals(this.getCostCategoryNames()) == false)
            return false;
        if (other.getCostCategoryValues() == null ^ this.getCostCategoryValues() == null)
            return false;
        if (other.getCostCategoryValues() != null && other.getCostCategoryValues().equals(this.getCostCategoryValues()) == false)
            return false;
        if (other.getReturnSize() == null ^ this.getReturnSize() == null)
            return false;
        if (other.getReturnSize() != null && other.getReturnSize().equals(this.getReturnSize()) == false)
            return false;
        if (other.getTotalSize() == null ^ this.getTotalSize() == null)
            return false;
        if (other.getTotalSize() != null && other.getTotalSize().equals(this.getTotalSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        hashCode = prime * hashCode + ((getCostCategoryNames() == null) ? 0 : getCostCategoryNames().hashCode());
        hashCode = prime * hashCode + ((getCostCategoryValues() == null) ? 0 : getCostCategoryValues().hashCode());
        hashCode = prime * hashCode + ((getReturnSize() == null) ? 0 : getReturnSize().hashCode());
        hashCode = prime * hashCode + ((getTotalSize() == null) ? 0 : getTotalSize().hashCode());
        return hashCode;
    }

    @Override
    public GetCostCategoriesResult clone() {
        try {
            return (GetCostCategoriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
