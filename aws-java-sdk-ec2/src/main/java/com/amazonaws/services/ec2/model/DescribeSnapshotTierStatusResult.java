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
public class DescribeSnapshotTierStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the snapshot's storage tier.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SnapshotTierStatus> snapshotTierStatuses;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is <code>null</code> when there are no more
     * results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the snapshot's storage tier.
     * </p>
     * 
     * @return Information about the snapshot's storage tier.
     */

    public java.util.List<SnapshotTierStatus> getSnapshotTierStatuses() {
        if (snapshotTierStatuses == null) {
            snapshotTierStatuses = new com.amazonaws.internal.SdkInternalList<SnapshotTierStatus>();
        }
        return snapshotTierStatuses;
    }

    /**
     * <p>
     * Information about the snapshot's storage tier.
     * </p>
     * 
     * @param snapshotTierStatuses
     *        Information about the snapshot's storage tier.
     */

    public void setSnapshotTierStatuses(java.util.Collection<SnapshotTierStatus> snapshotTierStatuses) {
        if (snapshotTierStatuses == null) {
            this.snapshotTierStatuses = null;
            return;
        }

        this.snapshotTierStatuses = new com.amazonaws.internal.SdkInternalList<SnapshotTierStatus>(snapshotTierStatuses);
    }

    /**
     * <p>
     * Information about the snapshot's storage tier.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshotTierStatuses(java.util.Collection)} or {@link #withSnapshotTierStatuses(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param snapshotTierStatuses
     *        Information about the snapshot's storage tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotTierStatusResult withSnapshotTierStatuses(SnapshotTierStatus... snapshotTierStatuses) {
        if (this.snapshotTierStatuses == null) {
            setSnapshotTierStatuses(new com.amazonaws.internal.SdkInternalList<SnapshotTierStatus>(snapshotTierStatuses.length));
        }
        for (SnapshotTierStatus ele : snapshotTierStatuses) {
            this.snapshotTierStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the snapshot's storage tier.
     * </p>
     * 
     * @param snapshotTierStatuses
     *        Information about the snapshot's storage tier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotTierStatusResult withSnapshotTierStatuses(java.util.Collection<SnapshotTierStatus> snapshotTierStatuses) {
        setSnapshotTierStatuses(snapshotTierStatuses);
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

    public DescribeSnapshotTierStatusResult withNextToken(String nextToken) {
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
        if (getSnapshotTierStatuses() != null)
            sb.append("SnapshotTierStatuses: ").append(getSnapshotTierStatuses()).append(",");
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

        if (obj instanceof DescribeSnapshotTierStatusResult == false)
            return false;
        DescribeSnapshotTierStatusResult other = (DescribeSnapshotTierStatusResult) obj;
        if (other.getSnapshotTierStatuses() == null ^ this.getSnapshotTierStatuses() == null)
            return false;
        if (other.getSnapshotTierStatuses() != null && other.getSnapshotTierStatuses().equals(this.getSnapshotTierStatuses()) == false)
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

        hashCode = prime * hashCode + ((getSnapshotTierStatuses() == null) ? 0 : getSnapshotTierStatuses().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotTierStatusResult clone() {
        try {
            return (DescribeSnapshotTierStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
