/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeInstanceInformationRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * One or more filters. Use a filter to return a more specific list of
     * instances.
     */
    private com.amazonaws.internal.SdkInternalList<InstanceInformationFilter> instanceInformationFilterList;
    /**
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     */
    private Integer maxResults;
    /**
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     */
    private String nextToken;

    /**
     * One or more filters. Use a filter to return a more specific list of
     * instances.
     * 
     * @return One or more filters. Use a filter to return a more specific list
     *         of instances.
     */
    public java.util.List<InstanceInformationFilter> getInstanceInformationFilterList() {
        if (instanceInformationFilterList == null) {
            instanceInformationFilterList = new com.amazonaws.internal.SdkInternalList<InstanceInformationFilter>();
        }
        return instanceInformationFilterList;
    }

    /**
     * One or more filters. Use a filter to return a more specific list of
     * instances.
     * 
     * @param instanceInformationFilterList
     *        One or more filters. Use a filter to return a more specific list
     *        of instances.
     */
    public void setInstanceInformationFilterList(
            java.util.Collection<InstanceInformationFilter> instanceInformationFilterList) {
        if (instanceInformationFilterList == null) {
            this.instanceInformationFilterList = null;
            return;
        }

        this.instanceInformationFilterList = new com.amazonaws.internal.SdkInternalList<InstanceInformationFilter>(
                instanceInformationFilterList);
    }

    /**
     * One or more filters. Use a filter to return a more specific list of
     * instances.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceInformationFilterList(java.util.Collection)}
     * or {@link #withInstanceInformationFilterList(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param instanceInformationFilterList
     *        One or more filters. Use a filter to return a more specific list
     *        of instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceInformationRequest withInstanceInformationFilterList(
            InstanceInformationFilter... instanceInformationFilterList) {
        if (this.instanceInformationFilterList == null) {
            setInstanceInformationFilterList(new com.amazonaws.internal.SdkInternalList<InstanceInformationFilter>(
                    instanceInformationFilterList.length));
        }
        for (InstanceInformationFilter ele : instanceInformationFilterList) {
            this.instanceInformationFilterList.add(ele);
        }
        return this;
    }

    /**
     * One or more filters. Use a filter to return a more specific list of
     * instances.
     * 
     * @param instanceInformationFilterList
     *        One or more filters. Use a filter to return a more specific list
     *        of instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceInformationRequest withInstanceInformationFilterList(
            java.util.Collection<InstanceInformationFilter> instanceInformationFilterList) {
        setInstanceInformationFilterList(instanceInformationFilterList);
        return this;
    }

    /**
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also
     *        returns a token that you can specify in a subsequent call to get
     *        the next set of results.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * 
     * @return The maximum number of items to return for this call. The call
     *         also returns a token that you can specify in a subsequent call to
     *         get the next set of results.
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also
     *        returns a token that you can specify in a subsequent call to get
     *        the next set of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceInformationRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this
     *        token from a previous call.)
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * 
     * @return The token for the next set of items to return. (You received this
     *         token from a previous call.)
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this
     *        token from a previous call.)
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceInformationRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("InstanceInformationFilterList: "
                    + getInstanceInformationFilterList() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
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
        if (other.getInstanceInformationFilterList() == null
                ^ this.getInstanceInformationFilterList() == null)
            return false;
        if (other.getInstanceInformationFilterList() != null
                && other.getInstanceInformationFilterList().equals(
                        this.getInstanceInformationFilterList()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInstanceInformationFilterList() == null) ? 0
                        : getInstanceInformationFilterList().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceInformationRequest clone() {
        return (DescribeInstanceInformationRequest) super.clone();
    }
}