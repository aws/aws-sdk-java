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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/DescribeGlobalReplicationGroups"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGlobalReplicationGroupsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords. &gt;
     * </p>
     */
    private String marker;
    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GlobalReplicationGroup> globalReplicationGroups;

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords. &gt;
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by MaxRecords. &gt;
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords. &gt;
     * </p>
     * 
     * @return An optional marker returned from a prior request. Use this marker for pagination of results from this
     *         operation. If this parameter is specified, the response includes only records beyond the marker, up to
     *         the value specified by MaxRecords. &gt;
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional marker returned from a prior request. Use this marker for pagination of results from this operation.
     * If this parameter is specified, the response includes only records beyond the marker, up to the value specified
     * by MaxRecords. &gt;
     * </p>
     * 
     * @param marker
     *        An optional marker returned from a prior request. Use this marker for pagination of results from this
     *        operation. If this parameter is specified, the response includes only records beyond the marker, up to the
     *        value specified by MaxRecords. &gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalReplicationGroupsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice group.
     * </p>
     * 
     * @return Indicates the slot configuration and global identifier for each slice group.
     */

    public java.util.List<GlobalReplicationGroup> getGlobalReplicationGroups() {
        if (globalReplicationGroups == null) {
            globalReplicationGroups = new com.amazonaws.internal.SdkInternalList<GlobalReplicationGroup>();
        }
        return globalReplicationGroups;
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice group.
     * </p>
     * 
     * @param globalReplicationGroups
     *        Indicates the slot configuration and global identifier for each slice group.
     */

    public void setGlobalReplicationGroups(java.util.Collection<GlobalReplicationGroup> globalReplicationGroups) {
        if (globalReplicationGroups == null) {
            this.globalReplicationGroups = null;
            return;
        }

        this.globalReplicationGroups = new com.amazonaws.internal.SdkInternalList<GlobalReplicationGroup>(globalReplicationGroups);
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGlobalReplicationGroups(java.util.Collection)} or
     * {@link #withGlobalReplicationGroups(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param globalReplicationGroups
     *        Indicates the slot configuration and global identifier for each slice group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalReplicationGroupsResult withGlobalReplicationGroups(GlobalReplicationGroup... globalReplicationGroups) {
        if (this.globalReplicationGroups == null) {
            setGlobalReplicationGroups(new com.amazonaws.internal.SdkInternalList<GlobalReplicationGroup>(globalReplicationGroups.length));
        }
        for (GlobalReplicationGroup ele : globalReplicationGroups) {
            this.globalReplicationGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the slot configuration and global identifier for each slice group.
     * </p>
     * 
     * @param globalReplicationGroups
     *        Indicates the slot configuration and global identifier for each slice group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalReplicationGroupsResult withGlobalReplicationGroups(java.util.Collection<GlobalReplicationGroup> globalReplicationGroups) {
        setGlobalReplicationGroups(globalReplicationGroups);
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getGlobalReplicationGroups() != null)
            sb.append("GlobalReplicationGroups: ").append(getGlobalReplicationGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGlobalReplicationGroupsResult == false)
            return false;
        DescribeGlobalReplicationGroupsResult other = (DescribeGlobalReplicationGroupsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getGlobalReplicationGroups() == null ^ this.getGlobalReplicationGroups() == null)
            return false;
        if (other.getGlobalReplicationGroups() != null && other.getGlobalReplicationGroups().equals(this.getGlobalReplicationGroups()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getGlobalReplicationGroups() == null) ? 0 : getGlobalReplicationGroups().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGlobalReplicationGroupsResult clone() {
        try {
            return (DescribeGlobalReplicationGroupsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
