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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/autoscaling-2011-01-01/DescribeInstanceRefreshes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceRefreshesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The instance refreshes for the specified group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceRefresh> instanceRefreshes;
    /**
     * <p>
     * A string that indicates that the response contains more items than can be returned in a single response. To
     * receive additional items, specify this string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The instance refreshes for the specified group.
     * </p>
     * 
     * @return The instance refreshes for the specified group.
     */

    public java.util.List<InstanceRefresh> getInstanceRefreshes() {
        if (instanceRefreshes == null) {
            instanceRefreshes = new com.amazonaws.internal.SdkInternalList<InstanceRefresh>();
        }
        return instanceRefreshes;
    }

    /**
     * <p>
     * The instance refreshes for the specified group.
     * </p>
     * 
     * @param instanceRefreshes
     *        The instance refreshes for the specified group.
     */

    public void setInstanceRefreshes(java.util.Collection<InstanceRefresh> instanceRefreshes) {
        if (instanceRefreshes == null) {
            this.instanceRefreshes = null;
            return;
        }

        this.instanceRefreshes = new com.amazonaws.internal.SdkInternalList<InstanceRefresh>(instanceRefreshes);
    }

    /**
     * <p>
     * The instance refreshes for the specified group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceRefreshes(java.util.Collection)} or {@link #withInstanceRefreshes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param instanceRefreshes
     *        The instance refreshes for the specified group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceRefreshesResult withInstanceRefreshes(InstanceRefresh... instanceRefreshes) {
        if (this.instanceRefreshes == null) {
            setInstanceRefreshes(new com.amazonaws.internal.SdkInternalList<InstanceRefresh>(instanceRefreshes.length));
        }
        for (InstanceRefresh ele : instanceRefreshes) {
            this.instanceRefreshes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The instance refreshes for the specified group.
     * </p>
     * 
     * @param instanceRefreshes
     *        The instance refreshes for the specified group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceRefreshesResult withInstanceRefreshes(java.util.Collection<InstanceRefresh> instanceRefreshes) {
        setInstanceRefreshes(instanceRefreshes);
        return this;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be returned in a single response. To
     * receive additional items, specify this string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        A string that indicates that the response contains more items than can be returned in a single response.
     *        To receive additional items, specify this string for the <code>NextToken</code> value when requesting the
     *        next set of items. This value is null when there are no more items to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be returned in a single response. To
     * receive additional items, specify this string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * 
     * @return A string that indicates that the response contains more items than can be returned in a single response.
     *         To receive additional items, specify this string for the <code>NextToken</code> value when requesting the
     *         next set of items. This value is null when there are no more items to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string that indicates that the response contains more items than can be returned in a single response. To
     * receive additional items, specify this string for the <code>NextToken</code> value when requesting the next set
     * of items. This value is null when there are no more items to return.
     * </p>
     * 
     * @param nextToken
     *        A string that indicates that the response contains more items than can be returned in a single response.
     *        To receive additional items, specify this string for the <code>NextToken</code> value when requesting the
     *        next set of items. This value is null when there are no more items to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceRefreshesResult withNextToken(String nextToken) {
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
        if (getInstanceRefreshes() != null)
            sb.append("InstanceRefreshes: ").append(getInstanceRefreshes()).append(",");
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

        if (obj instanceof DescribeInstanceRefreshesResult == false)
            return false;
        DescribeInstanceRefreshesResult other = (DescribeInstanceRefreshesResult) obj;
        if (other.getInstanceRefreshes() == null ^ this.getInstanceRefreshes() == null)
            return false;
        if (other.getInstanceRefreshes() != null && other.getInstanceRefreshes().equals(this.getInstanceRefreshes()) == false)
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

        hashCode = prime * hashCode + ((getInstanceRefreshes() == null) ? 0 : getInstanceRefreshes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceRefreshesResult clone() {
        try {
            return (DescribeInstanceRefreshesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
