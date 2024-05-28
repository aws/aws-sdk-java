/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DescribeDBShardGroups" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDBShardGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Contains a list of DB shard groups for the user.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DBShardGroup> dBShardGroups;
    /**
     * <p>
     * A pagination token that can be used in a later <code>DescribeDBClusters</code> request.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * Contains a list of DB shard groups for the user.
     * </p>
     * 
     * @return Contains a list of DB shard groups for the user.
     */

    public java.util.List<DBShardGroup> getDBShardGroups() {
        if (dBShardGroups == null) {
            dBShardGroups = new com.amazonaws.internal.SdkInternalList<DBShardGroup>();
        }
        return dBShardGroups;
    }

    /**
     * <p>
     * Contains a list of DB shard groups for the user.
     * </p>
     * 
     * @param dBShardGroups
     *        Contains a list of DB shard groups for the user.
     */

    public void setDBShardGroups(java.util.Collection<DBShardGroup> dBShardGroups) {
        if (dBShardGroups == null) {
            this.dBShardGroups = null;
            return;
        }

        this.dBShardGroups = new com.amazonaws.internal.SdkInternalList<DBShardGroup>(dBShardGroups);
    }

    /**
     * <p>
     * Contains a list of DB shard groups for the user.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDBShardGroups(java.util.Collection)} or {@link #withDBShardGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dBShardGroups
     *        Contains a list of DB shard groups for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBShardGroupsResult withDBShardGroups(DBShardGroup... dBShardGroups) {
        if (this.dBShardGroups == null) {
            setDBShardGroups(new com.amazonaws.internal.SdkInternalList<DBShardGroup>(dBShardGroups.length));
        }
        for (DBShardGroup ele : dBShardGroups) {
            this.dBShardGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a list of DB shard groups for the user.
     * </p>
     * 
     * @param dBShardGroups
     *        Contains a list of DB shard groups for the user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBShardGroupsResult withDBShardGroups(java.util.Collection<DBShardGroup> dBShardGroups) {
        setDBShardGroups(dBShardGroups);
        return this;
    }

    /**
     * <p>
     * A pagination token that can be used in a later <code>DescribeDBClusters</code> request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a later <code>DescribeDBClusters</code> request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later <code>DescribeDBClusters</code> request.
     * </p>
     * 
     * @return A pagination token that can be used in a later <code>DescribeDBClusters</code> request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token that can be used in a later <code>DescribeDBClusters</code> request.
     * </p>
     * 
     * @param marker
     *        A pagination token that can be used in a later <code>DescribeDBClusters</code> request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDBShardGroupsResult withMarker(String marker) {
        setMarker(marker);
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
        if (getDBShardGroups() != null)
            sb.append("DBShardGroups: ").append(getDBShardGroups()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDBShardGroupsResult == false)
            return false;
        DescribeDBShardGroupsResult other = (DescribeDBShardGroupsResult) obj;
        if (other.getDBShardGroups() == null ^ this.getDBShardGroups() == null)
            return false;
        if (other.getDBShardGroups() != null && other.getDBShardGroups().equals(this.getDBShardGroups()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBShardGroups() == null) ? 0 : getDBShardGroups().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDBShardGroupsResult clone() {
        try {
            return (DescribeDBShardGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
