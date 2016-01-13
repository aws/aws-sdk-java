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

/**
 * 
 */
public class DescribeInstanceInformationResult implements Serializable,
        Cloneable {

    /** The instance information list. */
    private com.amazonaws.internal.SdkInternalList<InstanceInformation> instanceInformationList;
    /**
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     */
    private String nextToken;

    /**
     * The instance information list.
     * 
     * @return The instance information list.
     */
    public java.util.List<InstanceInformation> getInstanceInformationList() {
        if (instanceInformationList == null) {
            instanceInformationList = new com.amazonaws.internal.SdkInternalList<InstanceInformation>();
        }
        return instanceInformationList;
    }

    /**
     * The instance information list.
     * 
     * @param instanceInformationList
     *        The instance information list.
     */
    public void setInstanceInformationList(
            java.util.Collection<InstanceInformation> instanceInformationList) {
        if (instanceInformationList == null) {
            this.instanceInformationList = null;
            return;
        }

        this.instanceInformationList = new com.amazonaws.internal.SdkInternalList<InstanceInformation>(
                instanceInformationList);
    }

    /**
     * The instance information list.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceInformationList(java.util.Collection)} or
     * {@link #withInstanceInformationList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceInformationList
     *        The instance information list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceInformationResult withInstanceInformationList(
            InstanceInformation... instanceInformationList) {
        if (this.instanceInformationList == null) {
            setInstanceInformationList(new com.amazonaws.internal.SdkInternalList<InstanceInformation>(
                    instanceInformationList.length));
        }
        for (InstanceInformation ele : instanceInformationList) {
            this.instanceInformationList.add(ele);
        }
        return this;
    }

    /**
     * The instance information list.
     * 
     * @param instanceInformationList
     *        The instance information list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceInformationResult withInstanceInformationList(
            java.util.Collection<InstanceInformation> instanceInformationList) {
        setInstanceInformationList(instanceInformationList);
        return this;
    }

    /**
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there
     *        are no additional items to return, the string is empty.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * 
     * @return The token to use when requesting the next set of items. If there
     *         are no additional items to return, the string is empty.
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * The token to use when requesting the next set of items. If there are no
     * additional items to return, the string is empty.
     * 
     * @param nextToken
     *        The token to use when requesting the next set of items. If there
     *        are no additional items to return, the string is empty.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public DescribeInstanceInformationResult withNextToken(String nextToken) {
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
        if (getInstanceInformationList() != null)
            sb.append("InstanceInformationList: "
                    + getInstanceInformationList() + ",");
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

        if (obj instanceof DescribeInstanceInformationResult == false)
            return false;
        DescribeInstanceInformationResult other = (DescribeInstanceInformationResult) obj;
        if (other.getInstanceInformationList() == null
                ^ this.getInstanceInformationList() == null)
            return false;
        if (other.getInstanceInformationList() != null
                && other.getInstanceInformationList().equals(
                        this.getInstanceInformationList()) == false)
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
                + ((getInstanceInformationList() == null) ? 0
                        : getInstanceInformationList().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceInformationResult clone() {
        try {
            return (DescribeInstanceInformationResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}