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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/DescribeSnapshots" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeSnapshotsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of snapshots.
     * </p>
     */
    private java.util.List<Snapshot> snapshots;

    private String nextToken;

    /**
     * <p>
     * An array of snapshots.
     * </p>
     * 
     * @return An array of snapshots.
     */

    public java.util.List<Snapshot> getSnapshots() {
        return snapshots;
    }

    /**
     * <p>
     * An array of snapshots.
     * </p>
     * 
     * @param snapshots
     *        An array of snapshots.
     */

    public void setSnapshots(java.util.Collection<Snapshot> snapshots) {
        if (snapshots == null) {
            this.snapshots = null;
            return;
        }

        this.snapshots = new java.util.ArrayList<Snapshot>(snapshots);
    }

    /**
     * <p>
     * An array of snapshots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSnapshots(java.util.Collection)} or {@link #withSnapshots(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snapshots
     *        An array of snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsResult withSnapshots(Snapshot... snapshots) {
        if (this.snapshots == null) {
            setSnapshots(new java.util.ArrayList<Snapshot>(snapshots.length));
        }
        for (Snapshot ele : snapshots) {
            this.snapshots.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of snapshots.
     * </p>
     * 
     * @param snapshots
     *        An array of snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsResult withSnapshots(java.util.Collection<Snapshot> snapshots) {
        setSnapshots(snapshots);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeSnapshotsResult withNextToken(String nextToken) {
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
        if (getSnapshots() != null)
            sb.append("Snapshots: ").append(getSnapshots()).append(",");
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

        if (obj instanceof DescribeSnapshotsResult == false)
            return false;
        DescribeSnapshotsResult other = (DescribeSnapshotsResult) obj;
        if (other.getSnapshots() == null ^ this.getSnapshots() == null)
            return false;
        if (other.getSnapshots() != null && other.getSnapshots().equals(this.getSnapshots()) == false)
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

        hashCode = prime * hashCode + ((getSnapshots() == null) ? 0 : getSnapshots().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotsResult clone() {
        try {
            return (DescribeSnapshotsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
