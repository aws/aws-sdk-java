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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The task assessment report in JSON format.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dms-2016-01-01/ReplicationTaskAssessmentResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReplicationTaskAssessmentResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The replication task identifier of the task on which the task assessment was run.
     * </p>
     */
    private String replicationTaskIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     */
    private String replicationTaskArn;
    /**
     * <p>
     * The date the task assessment was completed.
     * </p>
     */
    private java.util.Date replicationTaskLastAssessmentDate;
    /**
     * <p>
     * The status of the task assessment.
     * </p>
     */
    private String assessmentStatus;
    /**
     * <p>
     * The file containing the results of the task assessment.
     * </p>
     */
    private String assessmentResultsFile;
    /**
     * <p>
     * The task assessment results in JSON format.
     * </p>
     */
    private String assessmentResults;
    /**
     * <p>
     * The URL of the S3 object containing the task assessment results.
     * </p>
     */
    private String s3ObjectUrl;

    /**
     * <p>
     * The replication task identifier of the task on which the task assessment was run.
     * </p>
     * 
     * @param replicationTaskIdentifier
     *        The replication task identifier of the task on which the task assessment was run.
     */

    public void setReplicationTaskIdentifier(String replicationTaskIdentifier) {
        this.replicationTaskIdentifier = replicationTaskIdentifier;
    }

    /**
     * <p>
     * The replication task identifier of the task on which the task assessment was run.
     * </p>
     * 
     * @return The replication task identifier of the task on which the task assessment was run.
     */

    public String getReplicationTaskIdentifier() {
        return this.replicationTaskIdentifier;
    }

    /**
     * <p>
     * The replication task identifier of the task on which the task assessment was run.
     * </p>
     * 
     * @param replicationTaskIdentifier
     *        The replication task identifier of the task on which the task assessment was run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskAssessmentResult withReplicationTaskIdentifier(String replicationTaskIdentifier) {
        setReplicationTaskIdentifier(replicationTaskIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the replication task.
     */

    public void setReplicationTaskArn(String replicationTaskArn) {
        this.replicationTaskArn = replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the replication task.
     */

    public String getReplicationTaskArn() {
        return this.replicationTaskArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the replication task.
     * </p>
     * 
     * @param replicationTaskArn
     *        The Amazon Resource Name (ARN) of the replication task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskAssessmentResult withReplicationTaskArn(String replicationTaskArn) {
        setReplicationTaskArn(replicationTaskArn);
        return this;
    }

    /**
     * <p>
     * The date the task assessment was completed.
     * </p>
     * 
     * @param replicationTaskLastAssessmentDate
     *        The date the task assessment was completed.
     */

    public void setReplicationTaskLastAssessmentDate(java.util.Date replicationTaskLastAssessmentDate) {
        this.replicationTaskLastAssessmentDate = replicationTaskLastAssessmentDate;
    }

    /**
     * <p>
     * The date the task assessment was completed.
     * </p>
     * 
     * @return The date the task assessment was completed.
     */

    public java.util.Date getReplicationTaskLastAssessmentDate() {
        return this.replicationTaskLastAssessmentDate;
    }

    /**
     * <p>
     * The date the task assessment was completed.
     * </p>
     * 
     * @param replicationTaskLastAssessmentDate
     *        The date the task assessment was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskAssessmentResult withReplicationTaskLastAssessmentDate(java.util.Date replicationTaskLastAssessmentDate) {
        setReplicationTaskLastAssessmentDate(replicationTaskLastAssessmentDate);
        return this;
    }

    /**
     * <p>
     * The status of the task assessment.
     * </p>
     * 
     * @param assessmentStatus
     *        The status of the task assessment.
     */

    public void setAssessmentStatus(String assessmentStatus) {
        this.assessmentStatus = assessmentStatus;
    }

    /**
     * <p>
     * The status of the task assessment.
     * </p>
     * 
     * @return The status of the task assessment.
     */

    public String getAssessmentStatus() {
        return this.assessmentStatus;
    }

    /**
     * <p>
     * The status of the task assessment.
     * </p>
     * 
     * @param assessmentStatus
     *        The status of the task assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskAssessmentResult withAssessmentStatus(String assessmentStatus) {
        setAssessmentStatus(assessmentStatus);
        return this;
    }

    /**
     * <p>
     * The file containing the results of the task assessment.
     * </p>
     * 
     * @param assessmentResultsFile
     *        The file containing the results of the task assessment.
     */

    public void setAssessmentResultsFile(String assessmentResultsFile) {
        this.assessmentResultsFile = assessmentResultsFile;
    }

    /**
     * <p>
     * The file containing the results of the task assessment.
     * </p>
     * 
     * @return The file containing the results of the task assessment.
     */

    public String getAssessmentResultsFile() {
        return this.assessmentResultsFile;
    }

    /**
     * <p>
     * The file containing the results of the task assessment.
     * </p>
     * 
     * @param assessmentResultsFile
     *        The file containing the results of the task assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskAssessmentResult withAssessmentResultsFile(String assessmentResultsFile) {
        setAssessmentResultsFile(assessmentResultsFile);
        return this;
    }

    /**
     * <p>
     * The task assessment results in JSON format.
     * </p>
     * 
     * @param assessmentResults
     *        The task assessment results in JSON format.
     */

    public void setAssessmentResults(String assessmentResults) {
        this.assessmentResults = assessmentResults;
    }

    /**
     * <p>
     * The task assessment results in JSON format.
     * </p>
     * 
     * @return The task assessment results in JSON format.
     */

    public String getAssessmentResults() {
        return this.assessmentResults;
    }

    /**
     * <p>
     * The task assessment results in JSON format.
     * </p>
     * 
     * @param assessmentResults
     *        The task assessment results in JSON format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskAssessmentResult withAssessmentResults(String assessmentResults) {
        setAssessmentResults(assessmentResults);
        return this;
    }

    /**
     * <p>
     * The URL of the S3 object containing the task assessment results.
     * </p>
     * 
     * @param s3ObjectUrl
     *        The URL of the S3 object containing the task assessment results.
     */

    public void setS3ObjectUrl(String s3ObjectUrl) {
        this.s3ObjectUrl = s3ObjectUrl;
    }

    /**
     * <p>
     * The URL of the S3 object containing the task assessment results.
     * </p>
     * 
     * @return The URL of the S3 object containing the task assessment results.
     */

    public String getS3ObjectUrl() {
        return this.s3ObjectUrl;
    }

    /**
     * <p>
     * The URL of the S3 object containing the task assessment results.
     * </p>
     * 
     * @param s3ObjectUrl
     *        The URL of the S3 object containing the task assessment results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReplicationTaskAssessmentResult withS3ObjectUrl(String s3ObjectUrl) {
        setS3ObjectUrl(s3ObjectUrl);
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
        if (getReplicationTaskIdentifier() != null)
            sb.append("ReplicationTaskIdentifier: ").append(getReplicationTaskIdentifier()).append(",");
        if (getReplicationTaskArn() != null)
            sb.append("ReplicationTaskArn: ").append(getReplicationTaskArn()).append(",");
        if (getReplicationTaskLastAssessmentDate() != null)
            sb.append("ReplicationTaskLastAssessmentDate: ").append(getReplicationTaskLastAssessmentDate()).append(",");
        if (getAssessmentStatus() != null)
            sb.append("AssessmentStatus: ").append(getAssessmentStatus()).append(",");
        if (getAssessmentResultsFile() != null)
            sb.append("AssessmentResultsFile: ").append(getAssessmentResultsFile()).append(",");
        if (getAssessmentResults() != null)
            sb.append("AssessmentResults: ").append(getAssessmentResults()).append(",");
        if (getS3ObjectUrl() != null)
            sb.append("S3ObjectUrl: ").append(getS3ObjectUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReplicationTaskAssessmentResult == false)
            return false;
        ReplicationTaskAssessmentResult other = (ReplicationTaskAssessmentResult) obj;
        if (other.getReplicationTaskIdentifier() == null ^ this.getReplicationTaskIdentifier() == null)
            return false;
        if (other.getReplicationTaskIdentifier() != null && other.getReplicationTaskIdentifier().equals(this.getReplicationTaskIdentifier()) == false)
            return false;
        if (other.getReplicationTaskArn() == null ^ this.getReplicationTaskArn() == null)
            return false;
        if (other.getReplicationTaskArn() != null && other.getReplicationTaskArn().equals(this.getReplicationTaskArn()) == false)
            return false;
        if (other.getReplicationTaskLastAssessmentDate() == null ^ this.getReplicationTaskLastAssessmentDate() == null)
            return false;
        if (other.getReplicationTaskLastAssessmentDate() != null
                && other.getReplicationTaskLastAssessmentDate().equals(this.getReplicationTaskLastAssessmentDate()) == false)
            return false;
        if (other.getAssessmentStatus() == null ^ this.getAssessmentStatus() == null)
            return false;
        if (other.getAssessmentStatus() != null && other.getAssessmentStatus().equals(this.getAssessmentStatus()) == false)
            return false;
        if (other.getAssessmentResultsFile() == null ^ this.getAssessmentResultsFile() == null)
            return false;
        if (other.getAssessmentResultsFile() != null && other.getAssessmentResultsFile().equals(this.getAssessmentResultsFile()) == false)
            return false;
        if (other.getAssessmentResults() == null ^ this.getAssessmentResults() == null)
            return false;
        if (other.getAssessmentResults() != null && other.getAssessmentResults().equals(this.getAssessmentResults()) == false)
            return false;
        if (other.getS3ObjectUrl() == null ^ this.getS3ObjectUrl() == null)
            return false;
        if (other.getS3ObjectUrl() != null && other.getS3ObjectUrl().equals(this.getS3ObjectUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getReplicationTaskIdentifier() == null) ? 0 : getReplicationTaskIdentifier().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskArn() == null) ? 0 : getReplicationTaskArn().hashCode());
        hashCode = prime * hashCode + ((getReplicationTaskLastAssessmentDate() == null) ? 0 : getReplicationTaskLastAssessmentDate().hashCode());
        hashCode = prime * hashCode + ((getAssessmentStatus() == null) ? 0 : getAssessmentStatus().hashCode());
        hashCode = prime * hashCode + ((getAssessmentResultsFile() == null) ? 0 : getAssessmentResultsFile().hashCode());
        hashCode = prime * hashCode + ((getAssessmentResults() == null) ? 0 : getAssessmentResults().hashCode());
        hashCode = prime * hashCode + ((getS3ObjectUrl() == null) ? 0 : getS3ObjectUrl().hashCode());
        return hashCode;
    }

    @Override
    public ReplicationTaskAssessmentResult clone() {
        try {
            return (ReplicationTaskAssessmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.databasemigrationservice.model.transform.ReplicationTaskAssessmentResultMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
