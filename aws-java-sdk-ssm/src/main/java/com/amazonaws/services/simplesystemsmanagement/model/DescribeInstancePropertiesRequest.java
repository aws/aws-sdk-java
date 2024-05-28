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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstanceProperties" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstancePropertiesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * An array of instance property filters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstancePropertyFilter> instancePropertyFilterList;
    /**
     * <p>
     * The request filters to use with the operator.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstancePropertyStringFilter> filtersWithOperator;
    /**
     * <p>
     * The maximum number of items to return for the call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token provided by a previous request to use to return the next set of properties.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * An array of instance property filters.
     * </p>
     * 
     * @return An array of instance property filters.
     */

    public java.util.List<InstancePropertyFilter> getInstancePropertyFilterList() {
        if (instancePropertyFilterList == null) {
            instancePropertyFilterList = new com.amazonaws.internal.SdkInternalList<InstancePropertyFilter>();
        }
        return instancePropertyFilterList;
    }

    /**
     * <p>
     * An array of instance property filters.
     * </p>
     * 
     * @param instancePropertyFilterList
     *        An array of instance property filters.
     */

    public void setInstancePropertyFilterList(java.util.Collection<InstancePropertyFilter> instancePropertyFilterList) {
        if (instancePropertyFilterList == null) {
            this.instancePropertyFilterList = null;
            return;
        }

        this.instancePropertyFilterList = new com.amazonaws.internal.SdkInternalList<InstancePropertyFilter>(instancePropertyFilterList);
    }

    /**
     * <p>
     * An array of instance property filters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstancePropertyFilterList(java.util.Collection)} or
     * {@link #withInstancePropertyFilterList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instancePropertyFilterList
     *        An array of instance property filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePropertiesRequest withInstancePropertyFilterList(InstancePropertyFilter... instancePropertyFilterList) {
        if (this.instancePropertyFilterList == null) {
            setInstancePropertyFilterList(new com.amazonaws.internal.SdkInternalList<InstancePropertyFilter>(instancePropertyFilterList.length));
        }
        for (InstancePropertyFilter ele : instancePropertyFilterList) {
            this.instancePropertyFilterList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of instance property filters.
     * </p>
     * 
     * @param instancePropertyFilterList
     *        An array of instance property filters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePropertiesRequest withInstancePropertyFilterList(java.util.Collection<InstancePropertyFilter> instancePropertyFilterList) {
        setInstancePropertyFilterList(instancePropertyFilterList);
        return this;
    }

    /**
     * <p>
     * The request filters to use with the operator.
     * </p>
     * 
     * @return The request filters to use with the operator.
     */

    public java.util.List<InstancePropertyStringFilter> getFiltersWithOperator() {
        if (filtersWithOperator == null) {
            filtersWithOperator = new com.amazonaws.internal.SdkInternalList<InstancePropertyStringFilter>();
        }
        return filtersWithOperator;
    }

    /**
     * <p>
     * The request filters to use with the operator.
     * </p>
     * 
     * @param filtersWithOperator
     *        The request filters to use with the operator.
     */

    public void setFiltersWithOperator(java.util.Collection<InstancePropertyStringFilter> filtersWithOperator) {
        if (filtersWithOperator == null) {
            this.filtersWithOperator = null;
            return;
        }

        this.filtersWithOperator = new com.amazonaws.internal.SdkInternalList<InstancePropertyStringFilter>(filtersWithOperator);
    }

    /**
     * <p>
     * The request filters to use with the operator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFiltersWithOperator(java.util.Collection)} or {@link #withFiltersWithOperator(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param filtersWithOperator
     *        The request filters to use with the operator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePropertiesRequest withFiltersWithOperator(InstancePropertyStringFilter... filtersWithOperator) {
        if (this.filtersWithOperator == null) {
            setFiltersWithOperator(new com.amazonaws.internal.SdkInternalList<InstancePropertyStringFilter>(filtersWithOperator.length));
        }
        for (InstancePropertyStringFilter ele : filtersWithOperator) {
            this.filtersWithOperator.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The request filters to use with the operator.
     * </p>
     * 
     * @param filtersWithOperator
     *        The request filters to use with the operator.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePropertiesRequest withFiltersWithOperator(java.util.Collection<InstancePropertyStringFilter> filtersWithOperator) {
        setFiltersWithOperator(filtersWithOperator);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for the call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for the call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for the call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for the call. The call also returns a token that you can specify in
     *         a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for the call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for the call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePropertiesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token provided by a previous request to use to return the next set of properties.
     * </p>
     * 
     * @param nextToken
     *        The token provided by a previous request to use to return the next set of properties.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token provided by a previous request to use to return the next set of properties.
     * </p>
     * 
     * @return The token provided by a previous request to use to return the next set of properties.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token provided by a previous request to use to return the next set of properties.
     * </p>
     * 
     * @param nextToken
     *        The token provided by a previous request to use to return the next set of properties.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstancePropertiesRequest withNextToken(String nextToken) {
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
        if (getInstancePropertyFilterList() != null)
            sb.append("InstancePropertyFilterList: ").append(getInstancePropertyFilterList()).append(",");
        if (getFiltersWithOperator() != null)
            sb.append("FiltersWithOperator: ").append(getFiltersWithOperator()).append(",");
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

        if (obj instanceof DescribeInstancePropertiesRequest == false)
            return false;
        DescribeInstancePropertiesRequest other = (DescribeInstancePropertiesRequest) obj;
        if (other.getInstancePropertyFilterList() == null ^ this.getInstancePropertyFilterList() == null)
            return false;
        if (other.getInstancePropertyFilterList() != null && other.getInstancePropertyFilterList().equals(this.getInstancePropertyFilterList()) == false)
            return false;
        if (other.getFiltersWithOperator() == null ^ this.getFiltersWithOperator() == null)
            return false;
        if (other.getFiltersWithOperator() != null && other.getFiltersWithOperator().equals(this.getFiltersWithOperator()) == false)
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

        hashCode = prime * hashCode + ((getInstancePropertyFilterList() == null) ? 0 : getInstancePropertyFilterList().hashCode());
        hashCode = prime * hashCode + ((getFiltersWithOperator() == null) ? 0 : getFiltersWithOperator().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstancePropertiesRequest clone() {
        return (DescribeInstancePropertiesRequest) super.clone();
    }

}
