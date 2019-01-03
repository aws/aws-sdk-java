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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/DescribeInstanceInformation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceInformationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * This is a legacy method. We recommend that you don't use this method. Instead, use the
     * <a>InstanceInformationFilter</a> action. The <code>InstanceInformationFilter</code> action enables you to return
     * instance information by using tags that are specified as a key-value mapping.
     * </p>
     * <p>
     * If you do use this method, then you can't use the <code>InstanceInformationFilter</code> action. Using this
     * method and the <code>InstanceInformationFilter</code> action causes an exception error.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceInformationFilter> instanceInformationFilterList;
    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of instances. You can filter on Amazon EC2 tag.
     * Specify tags by using a key-value mapping.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceInformationStringFilter> filters;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * This is a legacy method. We recommend that you don't use this method. Instead, use the
     * <a>InstanceInformationFilter</a> action. The <code>InstanceInformationFilter</code> action enables you to return
     * instance information by using tags that are specified as a key-value mapping.
     * </p>
     * <p>
     * If you do use this method, then you can't use the <code>InstanceInformationFilter</code> action. Using this
     * method and the <code>InstanceInformationFilter</code> action causes an exception error.
     * </p>
     * 
     * @return This is a legacy method. We recommend that you don't use this method. Instead, use the
     *         <a>InstanceInformationFilter</a> action. The <code>InstanceInformationFilter</code> action enables you to
     *         return instance information by using tags that are specified as a key-value mapping. </p>
     *         <p>
     *         If you do use this method, then you can't use the <code>InstanceInformationFilter</code> action. Using
     *         this method and the <code>InstanceInformationFilter</code> action causes an exception error.
     */

    public java.util.List<InstanceInformationFilter> getInstanceInformationFilterList() {
        if (instanceInformationFilterList == null) {
            instanceInformationFilterList = new com.amazonaws.internal.SdkInternalList<InstanceInformationFilter>();
        }
        return instanceInformationFilterList;
    }

    /**
     * <p>
     * This is a legacy method. We recommend that you don't use this method. Instead, use the
     * <a>InstanceInformationFilter</a> action. The <code>InstanceInformationFilter</code> action enables you to return
     * instance information by using tags that are specified as a key-value mapping.
     * </p>
     * <p>
     * If you do use this method, then you can't use the <code>InstanceInformationFilter</code> action. Using this
     * method and the <code>InstanceInformationFilter</code> action causes an exception error.
     * </p>
     * 
     * @param instanceInformationFilterList
     *        This is a legacy method. We recommend that you don't use this method. Instead, use the
     *        <a>InstanceInformationFilter</a> action. The <code>InstanceInformationFilter</code> action enables you to
     *        return instance information by using tags that are specified as a key-value mapping. </p>
     *        <p>
     *        If you do use this method, then you can't use the <code>InstanceInformationFilter</code> action. Using
     *        this method and the <code>InstanceInformationFilter</code> action causes an exception error.
     */

    public void setInstanceInformationFilterList(java.util.Collection<InstanceInformationFilter> instanceInformationFilterList) {
        if (instanceInformationFilterList == null) {
            this.instanceInformationFilterList = null;
            return;
        }

        this.instanceInformationFilterList = new com.amazonaws.internal.SdkInternalList<InstanceInformationFilter>(instanceInformationFilterList);
    }

    /**
     * <p>
     * This is a legacy method. We recommend that you don't use this method. Instead, use the
     * <a>InstanceInformationFilter</a> action. The <code>InstanceInformationFilter</code> action enables you to return
     * instance information by using tags that are specified as a key-value mapping.
     * </p>
     * <p>
     * If you do use this method, then you can't use the <code>InstanceInformationFilter</code> action. Using this
     * method and the <code>InstanceInformationFilter</code> action causes an exception error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceInformationFilterList(java.util.Collection)} or
     * {@link #withInstanceInformationFilterList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param instanceInformationFilterList
     *        This is a legacy method. We recommend that you don't use this method. Instead, use the
     *        <a>InstanceInformationFilter</a> action. The <code>InstanceInformationFilter</code> action enables you to
     *        return instance information by using tags that are specified as a key-value mapping. </p>
     *        <p>
     *        If you do use this method, then you can't use the <code>InstanceInformationFilter</code> action. Using
     *        this method and the <code>InstanceInformationFilter</code> action causes an exception error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceInformationRequest withInstanceInformationFilterList(InstanceInformationFilter... instanceInformationFilterList) {
        if (this.instanceInformationFilterList == null) {
            setInstanceInformationFilterList(new com.amazonaws.internal.SdkInternalList<InstanceInformationFilter>(instanceInformationFilterList.length));
        }
        for (InstanceInformationFilter ele : instanceInformationFilterList) {
            this.instanceInformationFilterList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This is a legacy method. We recommend that you don't use this method. Instead, use the
     * <a>InstanceInformationFilter</a> action. The <code>InstanceInformationFilter</code> action enables you to return
     * instance information by using tags that are specified as a key-value mapping.
     * </p>
     * <p>
     * If you do use this method, then you can't use the <code>InstanceInformationFilter</code> action. Using this
     * method and the <code>InstanceInformationFilter</code> action causes an exception error.
     * </p>
     * 
     * @param instanceInformationFilterList
     *        This is a legacy method. We recommend that you don't use this method. Instead, use the
     *        <a>InstanceInformationFilter</a> action. The <code>InstanceInformationFilter</code> action enables you to
     *        return instance information by using tags that are specified as a key-value mapping. </p>
     *        <p>
     *        If you do use this method, then you can't use the <code>InstanceInformationFilter</code> action. Using
     *        this method and the <code>InstanceInformationFilter</code> action causes an exception error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceInformationRequest withInstanceInformationFilterList(java.util.Collection<InstanceInformationFilter> instanceInformationFilterList) {
        setInstanceInformationFilterList(instanceInformationFilterList);
        return this;
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of instances. You can filter on Amazon EC2 tag.
     * Specify tags by using a key-value mapping.
     * </p>
     * 
     * @return One or more filters. Use a filter to return a more specific list of instances. You can filter on Amazon
     *         EC2 tag. Specify tags by using a key-value mapping.
     */

    public java.util.List<InstanceInformationStringFilter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<InstanceInformationStringFilter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of instances. You can filter on Amazon EC2 tag.
     * Specify tags by using a key-value mapping.
     * </p>
     * 
     * @param filters
     *        One or more filters. Use a filter to return a more specific list of instances. You can filter on Amazon
     *        EC2 tag. Specify tags by using a key-value mapping.
     */

    public void setFilters(java.util.Collection<InstanceInformationStringFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<InstanceInformationStringFilter>(filters);
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of instances. You can filter on Amazon EC2 tag.
     * Specify tags by using a key-value mapping.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters. Use a filter to return a more specific list of instances. You can filter on Amazon
     *        EC2 tag. Specify tags by using a key-value mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceInformationRequest withFilters(InstanceInformationStringFilter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<InstanceInformationStringFilter>(filters.length));
        }
        for (InstanceInformationStringFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of instances. You can filter on Amazon EC2 tag.
     * Specify tags by using a key-value mapping.
     * </p>
     * 
     * @param filters
     *        One or more filters. Use a filter to return a more specific list of instances. You can filter on Amazon
     *        EC2 tag. Specify tags by using a key-value mapping.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceInformationRequest withFilters(java.util.Collection<InstanceInformationStringFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call also returns a token that you can specify
     *         in a subsequent call to get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also returns a token that you can specify in a
     * subsequent call to get the next set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also returns a token that you can specify in
     *        a subsequent call to get the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceInformationRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this token from a previous call.)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceInformationRequest withNextToken(String nextToken) {
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
        if (getInstanceInformationFilterList() != null)
            sb.append("InstanceInformationFilterList: ").append(getInstanceInformationFilterList()).append(",");
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

        if (obj instanceof DescribeInstanceInformationRequest == false)
            return false;
        DescribeInstanceInformationRequest other = (DescribeInstanceInformationRequest) obj;
        if (other.getInstanceInformationFilterList() == null ^ this.getInstanceInformationFilterList() == null)
            return false;
        if (other.getInstanceInformationFilterList() != null
                && other.getInstanceInformationFilterList().equals(this.getInstanceInformationFilterList()) == false)
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

        hashCode = prime * hashCode + ((getInstanceInformationFilterList() == null) ? 0 : getInstanceInformationFilterList().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceInformationRequest clone() {
        return (DescribeInstanceInformationRequest) super.clone();
    }

}
