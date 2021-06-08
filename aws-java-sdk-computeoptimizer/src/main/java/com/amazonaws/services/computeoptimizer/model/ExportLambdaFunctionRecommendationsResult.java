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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/ExportLambdaFunctionRecommendations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportLambdaFunctionRecommendationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The identification number of the export job.
     * </p>
     * <p>
     * Use the <code>DescribeRecommendationExportJobs</code> action, and specify the job ID to view the status of an
     * export job.
     * </p>
     */
    private String jobId;

    private S3Destination s3Destination;

    /**
     * <p>
     * The identification number of the export job.
     * </p>
     * <p>
     * Use the <code>DescribeRecommendationExportJobs</code> action, and specify the job ID to view the status of an
     * export job.
     * </p>
     * 
     * @param jobId
     *        The identification number of the export job.</p>
     *        <p>
     *        Use the <code>DescribeRecommendationExportJobs</code> action, and specify the job ID to view the status of
     *        an export job.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The identification number of the export job.
     * </p>
     * <p>
     * Use the <code>DescribeRecommendationExportJobs</code> action, and specify the job ID to view the status of an
     * export job.
     * </p>
     * 
     * @return The identification number of the export job.</p>
     *         <p>
     *         Use the <code>DescribeRecommendationExportJobs</code> action, and specify the job ID to view the status
     *         of an export job.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The identification number of the export job.
     * </p>
     * <p>
     * Use the <code>DescribeRecommendationExportJobs</code> action, and specify the job ID to view the status of an
     * export job.
     * </p>
     * 
     * @param jobId
     *        The identification number of the export job.</p>
     *        <p>
     *        Use the <code>DescribeRecommendationExportJobs</code> action, and specify the job ID to view the status of
     *        an export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportLambdaFunctionRecommendationsResult withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * @param s3Destination
     */

    public void setS3Destination(S3Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * @return
     */

    public S3Destination getS3Destination() {
        return this.s3Destination;
    }

    /**
     * @param s3Destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportLambdaFunctionRecommendationsResult withS3Destination(S3Destination s3Destination) {
        setS3Destination(s3Destination);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getS3Destination() != null)
            sb.append("S3Destination: ").append(getS3Destination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportLambdaFunctionRecommendationsResult == false)
            return false;
        ExportLambdaFunctionRecommendationsResult other = (ExportLambdaFunctionRecommendationsResult) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getS3Destination() == null ^ this.getS3Destination() == null)
            return false;
        if (other.getS3Destination() != null && other.getS3Destination().equals(this.getS3Destination()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        return hashCode;
    }

    @Override
    public ExportLambdaFunctionRecommendationsResult clone() {
        try {
            return (ExportLambdaFunctionRecommendationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
