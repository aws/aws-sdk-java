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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInstanceEventWindowsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the event windows.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceEventWindow> instanceEventWindows;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the event windows.
     * </p>
     * 
     * @return Information about the event windows.
     */

    public java.util.List<InstanceEventWindow> getInstanceEventWindows() {
        if (instanceEventWindows == null) {
            instanceEventWindows = new com.amazonaws.internal.SdkInternalList<InstanceEventWindow>();
        }
        return instanceEventWindows;
    }

    /**
     * <p>
     * Information about the event windows.
     * </p>
     * 
     * @param instanceEventWindows
     *        Information about the event windows.
     */

    public void setInstanceEventWindows(java.util.Collection<InstanceEventWindow> instanceEventWindows) {
        if (instanceEventWindows == null) {
            this.instanceEventWindows = null;
            return;
        }

        this.instanceEventWindows = new com.amazonaws.internal.SdkInternalList<InstanceEventWindow>(instanceEventWindows);
    }

    /**
     * <p>
     * Information about the event windows.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInstanceEventWindows(java.util.Collection)} or {@link #withInstanceEventWindows(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param instanceEventWindows
     *        Information about the event windows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceEventWindowsResult withInstanceEventWindows(InstanceEventWindow... instanceEventWindows) {
        if (this.instanceEventWindows == null) {
            setInstanceEventWindows(new com.amazonaws.internal.SdkInternalList<InstanceEventWindow>(instanceEventWindows.length));
        }
        for (InstanceEventWindow ele : instanceEventWindows) {
            this.instanceEventWindows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the event windows.
     * </p>
     * 
     * @param instanceEventWindows
     *        Information about the event windows.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceEventWindowsResult withInstanceEventWindows(java.util.Collection<InstanceEventWindow> instanceEventWindows) {
        setInstanceEventWindows(instanceEventWindows);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *         more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value is <code>null</code> when there are no
     *        more results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInstanceEventWindowsResult withNextToken(String nextToken) {
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
        if (getInstanceEventWindows() != null)
            sb.append("InstanceEventWindows: ").append(getInstanceEventWindows()).append(",");
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

        if (obj instanceof DescribeInstanceEventWindowsResult == false)
            return false;
        DescribeInstanceEventWindowsResult other = (DescribeInstanceEventWindowsResult) obj;
        if (other.getInstanceEventWindows() == null ^ this.getInstanceEventWindows() == null)
            return false;
        if (other.getInstanceEventWindows() != null && other.getInstanceEventWindows().equals(this.getInstanceEventWindows()) == false)
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

        hashCode = prime * hashCode + ((getInstanceEventWindows() == null) ? 0 : getInstanceEventWindows().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceEventWindowsResult clone() {
        try {
            return (DescribeInstanceEventWindowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
