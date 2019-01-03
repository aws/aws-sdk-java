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
package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/DescribeReplicationTaskAssessmentResults"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeReplicationTaskAssessmentResultsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * - The Amazon S3 bucket where the task assessment report is located.
     * </p>
     */
    private String bucketName;
    /**
     * <p>
     * The task assessment report.
     * </p>
     */
    private java.util.List<ReplicationTaskAssessmentResult> replicationTaskAssessmentResults;

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param marker
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the marker, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTaskAssessmentResultsResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * - The Amazon S3 bucket where the task assessment report is located.
     * </p>
     * 
     * @param bucketName
     *        - The Amazon S3 bucket where the task assessment report is located.
     */

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    /**
     * <p>
     * - The Amazon S3 bucket where the task assessment report is located.
     * </p>
     * 
     * @return - The Amazon S3 bucket where the task assessment report is located.
     */

    public String getBucketName() {
        return this.bucketName;
    }

    /**
     * <p>
     * - The Amazon S3 bucket where the task assessment report is located.
     * </p>
     * 
     * @param bucketName
     *        - The Amazon S3 bucket where the task assessment report is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTaskAssessmentResultsResult withBucketName(String bucketName) {
        setBucketName(bucketName);
        return this;
    }

    /**
     * <p>
     * The task assessment report.
     * </p>
     * 
     * @return The task assessment report.
     */

    public java.util.List<ReplicationTaskAssessmentResult> getReplicationTaskAssessmentResults() {
        return replicationTaskAssessmentResults;
    }

    /**
     * <p>
     * The task assessment report.
     * </p>
     * 
     * @param replicationTaskAssessmentResults
     *        The task assessment report.
     */

    public void setReplicationTaskAssessmentResults(java.util.Collection<ReplicationTaskAssessmentResult> replicationTaskAssessmentResults) {
        if (replicationTaskAssessmentResults == null) {
            this.replicationTaskAssessmentResults = null;
            return;
        }

        this.replicationTaskAssessmentResults = new java.util.ArrayList<ReplicationTaskAssessmentResult>(replicationTaskAssessmentResults);
    }

    /**
     * <p>
     * The task assessment report.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReplicationTaskAssessmentResults(java.util.Collection)} or
     * {@link #withReplicationTaskAssessmentResults(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param replicationTaskAssessmentResults
     *        The task assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTaskAssessmentResultsResult withReplicationTaskAssessmentResults(
            ReplicationTaskAssessmentResult... replicationTaskAssessmentResults) {
        if (this.replicationTaskAssessmentResults == null) {
            setReplicationTaskAssessmentResults(new java.util.ArrayList<ReplicationTaskAssessmentResult>(replicationTaskAssessmentResults.length));
        }
        for (ReplicationTaskAssessmentResult ele : replicationTaskAssessmentResults) {
            this.replicationTaskAssessmentResults.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The task assessment report.
     * </p>
     * 
     * @param replicationTaskAssessmentResults
     *        The task assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeReplicationTaskAssessmentResultsResult withReplicationTaskAssessmentResults(
            java.util.Collection<ReplicationTaskAssessmentResult> replicationTaskAssessmentResults) {
        setReplicationTaskAssessmentResults(replicationTaskAssessmentResults);
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
        if (getBucketName() != null)
            sb.append("BucketName: ").append(getBucketName()).append(",");
        if (getReplicationTaskAssessmentResults() != null)
            sb.append("ReplicationTaskAssessmentResults: ").append(getReplicationTaskAssessmentResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReplicationTaskAssessmentResultsResult == false)
            return false;
        DescribeReplicationTaskAssessmentResultsResult other = (DescribeReplicationTaskAssessmentResultsResult) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getBucketName() == null ^ this.getBucketName() == null)
            return false;
        if (other.getBucketName() != null && other.getBucketName().equals(this.getBucketName()) == false)
            return false;
        if (other.getReplicationTaskAssessmentResults() == null ^ this.getReplicationTaskAssessmentResults() == null)
            return false;
        if (other.getReplicationTaskAssessmentResults() != null
                && other.getReplicationTaskAssessmentResults().equals(this.getReplicationTaskAssessmentResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getBucketName() == null) ? 0 : getBucketName().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskAssessmentResults() == null) ? 0 : getReplicationTaskAssessmentResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReplicationTaskAssessmentResultsResult clone() {
        try {
            return (DescribeReplicationTaskAssessmentResultsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
