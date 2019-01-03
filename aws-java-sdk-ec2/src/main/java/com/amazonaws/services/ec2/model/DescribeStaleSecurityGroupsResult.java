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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStaleSecurityGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Information about the stale security groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StaleSecurityGroup> staleSecurityGroupSet;

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @return The token to use when requesting the next set of items. If there are no additional items to return, the
     *         string is empty.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use when requesting the next set of items. If there are no additional items to return, the string is
     * empty.
     * </p>
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there are no additional items to return, the
     *        string is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStaleSecurityGroupsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Information about the stale security groups.
     * </p>
     * 
     * @return Information about the stale security groups.
     */

    public java.util.List<StaleSecurityGroup> getStaleSecurityGroupSet() {
        if (staleSecurityGroupSet == null) {
            staleSecurityGroupSet = new com.amazonaws.internal.SdkInternalList<StaleSecurityGroup>();
        }
        return staleSecurityGroupSet;
    }

    /**
     * <p>
     * Information about the stale security groups.
     * </p>
     * 
     * @param staleSecurityGroupSet
     *        Information about the stale security groups.
     */

    public void setStaleSecurityGroupSet(java.util.Collection<StaleSecurityGroup> staleSecurityGroupSet) {
        if (staleSecurityGroupSet == null) {
            this.staleSecurityGroupSet = null;
            return;
        }

        this.staleSecurityGroupSet = new com.amazonaws.internal.SdkInternalList<StaleSecurityGroup>(staleSecurityGroupSet);
    }

    /**
     * <p>
     * Information about the stale security groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStaleSecurityGroupSet(java.util.Collection)} or
     * {@link #withStaleSecurityGroupSet(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param staleSecurityGroupSet
     *        Information about the stale security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStaleSecurityGroupsResult withStaleSecurityGroupSet(StaleSecurityGroup... staleSecurityGroupSet) {
        if (this.staleSecurityGroupSet == null) {
            setStaleSecurityGroupSet(new com.amazonaws.internal.SdkInternalList<StaleSecurityGroup>(staleSecurityGroupSet.length));
        }
        for (StaleSecurityGroup ele : staleSecurityGroupSet) {
            this.staleSecurityGroupSet.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the stale security groups.
     * </p>
     * 
     * @param staleSecurityGroupSet
     *        Information about the stale security groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStaleSecurityGroupsResult withStaleSecurityGroupSet(java.util.Collection<StaleSecurityGroup> staleSecurityGroupSet) {
        setStaleSecurityGroupSet(staleSecurityGroupSet);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getStaleSecurityGroupSet() != null)
            sb.append("StaleSecurityGroupSet: ").append(getStaleSecurityGroupSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStaleSecurityGroupsResult == false)
            return false;
        DescribeStaleSecurityGroupsResult other = (DescribeStaleSecurityGroupsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getStaleSecurityGroupSet() == null ^ this.getStaleSecurityGroupSet() == null)
            return false;
        if (other.getStaleSecurityGroupSet() != null && other.getStaleSecurityGroupSet().equals(this.getStaleSecurityGroupSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStaleSecurityGroupSet() == null) ? 0 : getStaleSecurityGroupSet().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStaleSecurityGroupsResult clone() {
        try {
            return (DescribeStaleSecurityGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
