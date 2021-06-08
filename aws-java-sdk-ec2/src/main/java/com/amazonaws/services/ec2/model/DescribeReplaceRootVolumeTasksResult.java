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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceResult;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplaceRootVolumeTasksResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Information about the root volume replacement task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ReplaceRootVolumeTask> replaceRootVolumeTasks;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the root volume replacement task.
     * </p>
     * 
     * @return Information about the root volume replacement task.
     */

    public java.util.List<ReplaceRootVolumeTask> getReplaceRootVolumeTasks() {
        if (replaceRootVolumeTasks == null) {
            replaceRootVolumeTasks = new com.amazonaws.internal.SdkInternalList<ReplaceRootVolumeTask>();
        }
        return replaceRootVolumeTasks;
    }

    /**
     * <p>
     * Information about the root volume replacement task.
     * </p>
     * 
     * @param replaceRootVolumeTasks
     *        Information about the root volume replacement task.
     */

    public void setReplaceRootVolumeTasks(java.util.Collection<ReplaceRootVolumeTask> replaceRootVolumeTasks) {
        if (replaceRootVolumeTasks == null) {
            this.replaceRootVolumeTasks = null;
            return;
        }

        this.replaceRootVolumeTasks = new com.amazonaws.internal.SdkInternalList<ReplaceRootVolumeTask>(replaceRootVolumeTasks);
    }

    /**
     * <p>
     * Information about the root volume replacement task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplaceRootVolumeTasks(java.util.Collection)} or
     * {@link #withReplaceRootVolumeTasks(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replaceRootVolumeTasks
     *        Information about the root volume replacement task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplaceRootVolumeTasksResult withReplaceRootVolumeTasks(ReplaceRootVolumeTask... replaceRootVolumeTasks) {
        if (this.replaceRootVolumeTasks == null) {
            setReplaceRootVolumeTasks(new com.amazonaws.internal.SdkInternalList<ReplaceRootVolumeTask>(replaceRootVolumeTasks.length));
        }
        for (ReplaceRootVolumeTask ele : replaceRootVolumeTasks) {
            this.replaceRootVolumeTasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the root volume replacement task.
     * </p>
     * 
     * @param replaceRootVolumeTasks
     *        Information about the root volume replacement task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplaceRootVolumeTasksResult withReplaceRootVolumeTasks(java.util.Collection<ReplaceRootVolumeTask> replaceRootVolumeTasks) {
        setReplaceRootVolumeTasks(replaceRootVolumeTasks);
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

    public DescribeReplaceRootVolumeTasksResult withNextToken(String nextToken) {
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
        if (getReplaceRootVolumeTasks() != null)
            sb.append("ReplaceRootVolumeTasks: ").append(getReplaceRootVolumeTasks()).append(",");
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

        if (obj instanceof DescribeReplaceRootVolumeTasksResult == false)
            return false;
        DescribeReplaceRootVolumeTasksResult other = (DescribeReplaceRootVolumeTasksResult) obj;
        if (other.getReplaceRootVolumeTasks() == null ^ this.getReplaceRootVolumeTasks() == null)
            return false;
        if (other.getReplaceRootVolumeTasks() != null && other.getReplaceRootVolumeTasks().equals(this.getReplaceRootVolumeTasks()) == false)
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

        hashCode = prime * hashCode + ((getReplaceRootVolumeTasks() == null) ? 0 : getReplaceRootVolumeTasks().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplaceRootVolumeTasksResult clone() {
        try {
            return (DescribeReplaceRootVolumeTasksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
