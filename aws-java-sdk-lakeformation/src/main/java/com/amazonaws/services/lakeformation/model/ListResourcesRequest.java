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
package com.amazonaws.services.lakeformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lakeformation-2017-03-31/ListResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourcesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Any applicable row-level and/or column-level filtering conditions for the resources.
     * </p>
     */
    private java.util.List<FilterCondition> filterConditionList;
    /**
     * <p>
     * The maximum number of resource results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve these resources.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Any applicable row-level and/or column-level filtering conditions for the resources.
     * </p>
     * 
     * @return Any applicable row-level and/or column-level filtering conditions for the resources.
     */

    public java.util.List<FilterCondition> getFilterConditionList() {
        return filterConditionList;
    }

    /**
     * <p>
     * Any applicable row-level and/or column-level filtering conditions for the resources.
     * </p>
     * 
     * @param filterConditionList
     *        Any applicable row-level and/or column-level filtering conditions for the resources.
     */

    public void setFilterConditionList(java.util.Collection<FilterCondition> filterConditionList) {
        if (filterConditionList == null) {
            this.filterConditionList = null;
            return;
        }

        this.filterConditionList = new java.util.ArrayList<FilterCondition>(filterConditionList);
    }

    /**
     * <p>
     * Any applicable row-level and/or column-level filtering conditions for the resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterConditionList(java.util.Collection)} or {@link #withFilterConditionList(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param filterConditionList
     *        Any applicable row-level and/or column-level filtering conditions for the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withFilterConditionList(FilterCondition... filterConditionList) {
        if (this.filterConditionList == null) {
            setFilterConditionList(new java.util.ArrayList<FilterCondition>(filterConditionList.length));
        }
        for (FilterCondition ele : filterConditionList) {
            this.filterConditionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any applicable row-level and/or column-level filtering conditions for the resources.
     * </p>
     * 
     * @param filterConditionList
     *        Any applicable row-level and/or column-level filtering conditions for the resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withFilterConditionList(java.util.Collection<FilterCondition> filterConditionList) {
        setFilterConditionList(filterConditionList);
        return this;
    }

    /**
     * <p>
     * The maximum number of resource results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resource results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of resource results.
     * </p>
     * 
     * @return The maximum number of resource results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of resource results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of resource results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve these resources.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve these resources.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve these resources.
     * </p>
     * 
     * @return A continuation token, if this is not the first call to retrieve these resources.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A continuation token, if this is not the first call to retrieve these resources.
     * </p>
     * 
     * @param nextToken
     *        A continuation token, if this is not the first call to retrieve these resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourcesRequest withNextToken(String nextToken) {
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
        if (getFilterConditionList() != null)
            sb.append("FilterConditionList: ").append(getFilterConditionList()).append(",");
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

        if (obj instanceof ListResourcesRequest == false)
            return false;
        ListResourcesRequest other = (ListResourcesRequest) obj;
        if (other.getFilterConditionList() == null ^ this.getFilterConditionList() == null)
            return false;
        if (other.getFilterConditionList() != null && other.getFilterConditionList().equals(this.getFilterConditionList()) == false)
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

        hashCode = prime * hashCode + ((getFilterConditionList() == null) ? 0 : getFilterConditionList().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListResourcesRequest clone() {
        return (ListResourcesRequest) super.clone();
    }

}
