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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTaskIndividualAssessments"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationTaskIndividualAssessmentsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

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
     * One or more individual assessments as specified by <code>Filters</code>.
     * </p>
     */
    private java.util.List<ReplicationTaskIndividualAssessment> replicationTaskIndividualAssessments;

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

    public DescribeReplicationTaskIndividualAssessmentsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * One or more individual assessments as specified by <code>Filters</code>.
     * </p>
     * 
     * @return One or more individual assessments as specified by <code>Filters</code>.
     */

    public java.util.List<ReplicationTaskIndividualAssessment> getReplicationTaskIndividualAssessments() {
        return replicationTaskIndividualAssessments;
    }

    /**
     * <p>
     * One or more individual assessments as specified by <code>Filters</code>.
     * </p>
     * 
     * @param replicationTaskIndividualAssessments
     *        One or more individual assessments as specified by <code>Filters</code>.
     */

    public void setReplicationTaskIndividualAssessments(java.util.Collection<ReplicationTaskIndividualAssessment> replicationTaskIndividualAssessments) {
        if (replicationTaskIndividualAssessments == null) {
            this.replicationTaskIndividualAssessments = null;
            return;
        }

        this.replicationTaskIndividualAssessments = new java.util.ArrayList<ReplicationTaskIndividualAssessment>(replicationTaskIndividualAssessments);
    }

    /**
     * <p>
     * One or more individual assessments as specified by <code>Filters</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationTaskIndividualAssessments(java.util.Collection)} or
     * {@link #withReplicationTaskIndividualAssessments(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param replicationTaskIndividualAssessments
     *        One or more individual assessments as specified by <code>Filters</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTaskIndividualAssessmentsResult withReplicationTaskIndividualAssessments(
            ReplicationTaskIndividualAssessment... replicationTaskIndividualAssessments) {
        if (this.replicationTaskIndividualAssessments == null) {
            setReplicationTaskIndividualAssessments(new java.util.ArrayList<ReplicationTaskIndividualAssessment>(replicationTaskIndividualAssessments.length));
        }
        for (ReplicationTaskIndividualAssessment ele : replicationTaskIndividualAssessments) {
            this.replicationTaskIndividualAssessments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more individual assessments as specified by <code>Filters</code>.
     * </p>
     * 
     * @param replicationTaskIndividualAssessments
     *        One or more individual assessments as specified by <code>Filters</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTaskIndividualAssessmentsResult withReplicationTaskIndividualAssessments(
            java.util.Collection<ReplicationTaskIndividualAssessment> replicationTaskIndividualAssessments) {
        setReplicationTaskIndividualAssessments(replicationTaskIndividualAssessments);
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
        if (getReplicationTaskIndividualAssessments() != null)
            sb.append("ReplicationTaskIndividualAssessments: ").append(getReplicationTaskIndividualAssessments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationTaskIndividualAssessmentsResult == false)
            return false;
        DescribeReplicationTaskIndividualAssessmentsResult other = (DescribeReplicationTaskIndividualAssessmentsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getReplicationTaskIndividualAssessments() == null ^ this.getReplicationTaskIndividualAssessments() == null)
            return false;
        if (other.getReplicationTaskIndividualAssessments() != null
                && other.getReplicationTaskIndividualAssessments().equals(this.getReplicationTaskIndividualAssessments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskIndividualAssessments() == null) ? 0 : getReplicationTaskIndividualAssessments().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationTaskIndividualAssessmentsResult clone() {
        try {
            return (DescribeReplicationTaskIndividualAssessmentsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
