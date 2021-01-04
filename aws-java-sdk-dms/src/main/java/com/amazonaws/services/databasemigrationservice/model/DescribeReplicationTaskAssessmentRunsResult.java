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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTaskAssessmentRuns"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationTaskAssessmentRunsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A pagination token returned for you to pass to a subsequent request. If you pass this token as the
     * <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker, up to
     * the value specified in the request by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * One or more premigration assessment runs as specified by <code>Filters</code>.
     * </p>
     */
    private java.util.List<ReplicationTaskAssessmentRun> replicationTaskAssessmentRuns;

    /**
     * <p>
     * A pagination token returned for you to pass to a subsequent request. If you pass this token as the
     * <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker, up to
     * the value specified in the request by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        A pagination token returned for you to pass to a subsequent request. If you pass this token as the
     *        <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker,
     *        up to the value specified in the request by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * A pagination token returned for you to pass to a subsequent request. If you pass this token as the
     * <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker, up to
     * the value specified in the request by <code>MaxRecords</code>.
     * </p>
     * 
     * @return A pagination token returned for you to pass to a subsequent request. If you pass this token as the
     *         <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker,
     *         up to the value specified in the request by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * A pagination token returned for you to pass to a subsequent request. If you pass this token as the
     * <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker, up to
     * the value specified in the request by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        A pagination token returned for you to pass to a subsequent request. If you pass this token as the
     *        <code>Marker</code> value in a subsequent request, the response includes only records beyond the marker,
     *        up to the value specified in the request by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTaskAssessmentRunsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * One or more premigration assessment runs as specified by <code>Filters</code>.
     * </p>
     * 
     * @return One or more premigration assessment runs as specified by <code>Filters</code>.
     */

    public java.util.List<ReplicationTaskAssessmentRun> getReplicationTaskAssessmentRuns() {
        return replicationTaskAssessmentRuns;
    }

    /**
     * <p>
     * One or more premigration assessment runs as specified by <code>Filters</code>.
     * </p>
     * 
     * @param replicationTaskAssessmentRuns
     *        One or more premigration assessment runs as specified by <code>Filters</code>.
     */

    public void setReplicationTaskAssessmentRuns(java.util.Collection<ReplicationTaskAssessmentRun> replicationTaskAssessmentRuns) {
        if (replicationTaskAssessmentRuns == null) {
            this.replicationTaskAssessmentRuns = null;
            return;
        }

        this.replicationTaskAssessmentRuns = new java.util.ArrayList<ReplicationTaskAssessmentRun>(replicationTaskAssessmentRuns);
    }

    /**
     * <p>
     * One or more premigration assessment runs as specified by <code>Filters</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationTaskAssessmentRuns(java.util.Collection)} or
     * {@link #withReplicationTaskAssessmentRuns(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replicationTaskAssessmentRuns
     *        One or more premigration assessment runs as specified by <code>Filters</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTaskAssessmentRunsResult withReplicationTaskAssessmentRuns(ReplicationTaskAssessmentRun... replicationTaskAssessmentRuns) {
        if (this.replicationTaskAssessmentRuns == null) {
            setReplicationTaskAssessmentRuns(new java.util.ArrayList<ReplicationTaskAssessmentRun>(replicationTaskAssessmentRuns.length));
        }
        for (ReplicationTaskAssessmentRun ele : replicationTaskAssessmentRuns) {
            this.replicationTaskAssessmentRuns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more premigration assessment runs as specified by <code>Filters</code>.
     * </p>
     * 
     * @param replicationTaskAssessmentRuns
     *        One or more premigration assessment runs as specified by <code>Filters</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTaskAssessmentRunsResult withReplicationTaskAssessmentRuns(
            java.util.Collection<ReplicationTaskAssessmentRun> replicationTaskAssessmentRuns) {
        setReplicationTaskAssessmentRuns(replicationTaskAssessmentRuns);
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
        if (getReplicationTaskAssessmentRuns() != null)
            sb.append("ReplicationTaskAssessmentRuns: ").append(getReplicationTaskAssessmentRuns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationTaskAssessmentRunsResult == false)
            return false;
        DescribeReplicationTaskAssessmentRunsResult other = (DescribeReplicationTaskAssessmentRunsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReplicationTaskAssessmentRuns() == null ^ this.getReplicationTaskAssessmentRuns() == null)
            return false;
        if (other.getReplicationTaskAssessmentRuns() != null
                && other.getReplicationTaskAssessmentRuns().equals(this.getReplicationTaskAssessmentRuns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskAssessmentRuns() == null) ? 0 : getReplicationTaskAssessmentRuns().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationTaskAssessmentRunsResult clone() {
        try {
            return (DescribeReplicationTaskAssessmentRunsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
