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
public class DescribeVolumesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the volumes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Volume> volumes;
    /**
     * <p>
     * The <code>NextToken</code> value to include in a future <code>DescribeVolumes</code> request. When the results of
     * a <code>DescribeVolumes</code> request exceed <code>MaxResults</code>, this value can be used to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the volumes.
     * </p>
     * 
     * @return Information about the volumes.
     */

    public java.util.List<Volume> getVolumes() {
        if (volumes == null) {
            volumes = new com.amazonaws.internal.SdkInternalList<Volume>();
        }
        return volumes;
    }

    /**
     * <p>
     * Information about the volumes.
     * </p>
     * 
     * @param volumes
     *        Information about the volumes.
     */

    public void setVolumes(java.util.Collection<Volume> volumes) {
        if (volumes == null) {
            this.volumes = null;
            return;
        }

        this.volumes = new com.amazonaws.internal.SdkInternalList<Volume>(volumes);
    }

    /**
     * <p>
     * Information about the volumes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVolumes(java.util.Collection)} or {@link #withVolumes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param volumes
     *        Information about the volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesResult withVolumes(Volume... volumes) {
        if (this.volumes == null) {
            setVolumes(new com.amazonaws.internal.SdkInternalList<Volume>(volumes.length));
        }
        for (Volume ele : volumes) {
            this.volumes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the volumes.
     * </p>
     * 
     * @param volumes
     *        Information about the volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesResult withVolumes(java.util.Collection<Volume> volumes) {
        setVolumes(volumes);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future <code>DescribeVolumes</code> request. When the results of
     * a <code>DescribeVolumes</code> request exceed <code>MaxResults</code>, this value can be used to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in a future <code>DescribeVolumes</code> request. When the
     *        results of a <code>DescribeVolumes</code> request exceed <code>MaxResults</code>, this value can be used
     *        to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future <code>DescribeVolumes</code> request. When the results of
     * a <code>DescribeVolumes</code> request exceed <code>MaxResults</code>, this value can be used to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value to include in a future <code>DescribeVolumes</code> request. When the
     *         results of a <code>DescribeVolumes</code> request exceed <code>MaxResults</code>, this value can be used
     *         to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value to include in a future <code>DescribeVolumes</code> request. When the results of
     * a <code>DescribeVolumes</code> request exceed <code>MaxResults</code>, this value can be used to retrieve the
     * next page of results. This value is <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value to include in a future <code>DescribeVolumes</code> request. When the
     *        results of a <code>DescribeVolumes</code> request exceed <code>MaxResults</code>, this value can be used
     *        to retrieve the next page of results. This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeVolumesResult withNextToken(String nextToken) {
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
        if (getVolumes() != null)
            sb.append("Volumes: ").append(getVolumes()).append(",");
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

        if (obj instanceof DescribeVolumesResult == false)
            return false;
        DescribeVolumesResult other = (DescribeVolumesResult) obj;
        if (other.getVolumes() == null ^ this.getVolumes() == null)
            return false;
        if (other.getVolumes() != null && other.getVolumes().equals(this.getVolumes()) == false)
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

        hashCode = prime * hashCode + ((getVolumes() == null) ? 0 : getVolumes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVolumesResult clone() {
        try {
            return (DescribeVolumesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
