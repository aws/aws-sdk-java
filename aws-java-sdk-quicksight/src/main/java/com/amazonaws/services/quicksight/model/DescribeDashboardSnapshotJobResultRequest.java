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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/DescribeDashboardSnapshotJobResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDashboardSnapshotJobResultRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the dashboard that you have started a snapshot job for.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * The ID of the job to be described. The job ID is set when you start a new job with a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     */
    private String snapshotJobId;

    /**
     * <p>
     * The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     * </p>
     * 
     * @return The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     * </p>
     * 
     * @param awsAccountId
     *        The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResultRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the dashboard that you have started a snapshot job for.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard that you have started a snapshot job for.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard that you have started a snapshot job for.
     * </p>
     * 
     * @return The ID of the dashboard that you have started a snapshot job for.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard that you have started a snapshot job for.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard that you have started a snapshot job for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResultRequest withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * The ID of the job to be described. The job ID is set when you start a new job with a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @param snapshotJobId
     *        The ID of the job to be described. The job ID is set when you start a new job with a
     *        <code>StartDashboardSnapshotJob</code> API call.
     */

    public void setSnapshotJobId(String snapshotJobId) {
        this.snapshotJobId = snapshotJobId;
    }

    /**
     * <p>
     * The ID of the job to be described. The job ID is set when you start a new job with a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @return The ID of the job to be described. The job ID is set when you start a new job with a
     *         <code>StartDashboardSnapshotJob</code> API call.
     */

    public String getSnapshotJobId() {
        return this.snapshotJobId;
    }

    /**
     * <p>
     * The ID of the job to be described. The job ID is set when you start a new job with a
     * <code>StartDashboardSnapshotJob</code> API call.
     * </p>
     * 
     * @param snapshotJobId
     *        The ID of the job to be described. The job ID is set when you start a new job with a
     *        <code>StartDashboardSnapshotJob</code> API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDashboardSnapshotJobResultRequest withSnapshotJobId(String snapshotJobId) {
        setSnapshotJobId(snapshotJobId);
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
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getDashboardId() != null)
            sb.append("DashboardId: ").append(getDashboardId()).append(",");
        if (getSnapshotJobId() != null)
            sb.append("SnapshotJobId: ").append(getSnapshotJobId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDashboardSnapshotJobResultRequest == false)
            return false;
        DescribeDashboardSnapshotJobResultRequest other = (DescribeDashboardSnapshotJobResultRequest) obj;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getDashboardId() == null ^ this.getDashboardId() == null)
            return false;
        if (other.getDashboardId() != null && other.getDashboardId().equals(this.getDashboardId()) == false)
            return false;
        if (other.getSnapshotJobId() == null ^ this.getSnapshotJobId() == null)
            return false;
        if (other.getSnapshotJobId() != null && other.getSnapshotJobId().equals(this.getSnapshotJobId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getDashboardId() == null) ? 0 : getDashboardId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotJobId() == null) ? 0 : getSnapshotJobId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDashboardSnapshotJobResultRequest clone() {
        return (DescribeDashboardSnapshotJobResultRequest) super.clone();
    }

}
