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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/StartDashboardSnapshotJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartDashboardSnapshotJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Amazon Web Services account that the dashboard snapshot job is executed in.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The ID of the dashboard that you want to start a snapshot job for.
     * </p>
     */
    private String dashboardId;
    /**
     * <p>
     * An ID for the dashboard snapshot job. This ID is unique to the dashboard while the job is running. This ID can be
     * used to poll the status of a job with a <code>DescribeDashboardSnapshotJob</code> while the job runs. You can
     * reuse this ID for another job 24 hours after the current job is completed.
     * </p>
     */
    private String snapshotJobId;
    /**
     * <p>
     * A structure that contains information about the anonymous users that the generated snapshot is for. This API will
     * not return information about registered Amazon QuickSight.
     * </p>
     */
    private SnapshotUserConfiguration userConfiguration;
    /**
     * <p>
     * A structure that describes the configuration of the dashboard snapshot.
     * </p>
     */
    private SnapshotConfiguration snapshotConfiguration;

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

    public StartDashboardSnapshotJobRequest withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
        return this;
    }

    /**
     * <p>
     * The ID of the dashboard that you want to start a snapshot job for.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard that you want to start a snapshot job for.
     */

    public void setDashboardId(String dashboardId) {
        this.dashboardId = dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard that you want to start a snapshot job for.
     * </p>
     * 
     * @return The ID of the dashboard that you want to start a snapshot job for.
     */

    public String getDashboardId() {
        return this.dashboardId;
    }

    /**
     * <p>
     * The ID of the dashboard that you want to start a snapshot job for.
     * </p>
     * 
     * @param dashboardId
     *        The ID of the dashboard that you want to start a snapshot job for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDashboardSnapshotJobRequest withDashboardId(String dashboardId) {
        setDashboardId(dashboardId);
        return this;
    }

    /**
     * <p>
     * An ID for the dashboard snapshot job. This ID is unique to the dashboard while the job is running. This ID can be
     * used to poll the status of a job with a <code>DescribeDashboardSnapshotJob</code> while the job runs. You can
     * reuse this ID for another job 24 hours after the current job is completed.
     * </p>
     * 
     * @param snapshotJobId
     *        An ID for the dashboard snapshot job. This ID is unique to the dashboard while the job is running. This ID
     *        can be used to poll the status of a job with a <code>DescribeDashboardSnapshotJob</code> while the job
     *        runs. You can reuse this ID for another job 24 hours after the current job is completed.
     */

    public void setSnapshotJobId(String snapshotJobId) {
        this.snapshotJobId = snapshotJobId;
    }

    /**
     * <p>
     * An ID for the dashboard snapshot job. This ID is unique to the dashboard while the job is running. This ID can be
     * used to poll the status of a job with a <code>DescribeDashboardSnapshotJob</code> while the job runs. You can
     * reuse this ID for another job 24 hours after the current job is completed.
     * </p>
     * 
     * @return An ID for the dashboard snapshot job. This ID is unique to the dashboard while the job is running. This
     *         ID can be used to poll the status of a job with a <code>DescribeDashboardSnapshotJob</code> while the job
     *         runs. You can reuse this ID for another job 24 hours after the current job is completed.
     */

    public String getSnapshotJobId() {
        return this.snapshotJobId;
    }

    /**
     * <p>
     * An ID for the dashboard snapshot job. This ID is unique to the dashboard while the job is running. This ID can be
     * used to poll the status of a job with a <code>DescribeDashboardSnapshotJob</code> while the job runs. You can
     * reuse this ID for another job 24 hours after the current job is completed.
     * </p>
     * 
     * @param snapshotJobId
     *        An ID for the dashboard snapshot job. This ID is unique to the dashboard while the job is running. This ID
     *        can be used to poll the status of a job with a <code>DescribeDashboardSnapshotJob</code> while the job
     *        runs. You can reuse this ID for another job 24 hours after the current job is completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDashboardSnapshotJobRequest withSnapshotJobId(String snapshotJobId) {
        setSnapshotJobId(snapshotJobId);
        return this;
    }

    /**
     * <p>
     * A structure that contains information about the anonymous users that the generated snapshot is for. This API will
     * not return information about registered Amazon QuickSight.
     * </p>
     * 
     * @param userConfiguration
     *        A structure that contains information about the anonymous users that the generated snapshot is for. This
     *        API will not return information about registered Amazon QuickSight.
     */

    public void setUserConfiguration(SnapshotUserConfiguration userConfiguration) {
        this.userConfiguration = userConfiguration;
    }

    /**
     * <p>
     * A structure that contains information about the anonymous users that the generated snapshot is for. This API will
     * not return information about registered Amazon QuickSight.
     * </p>
     * 
     * @return A structure that contains information about the anonymous users that the generated snapshot is for. This
     *         API will not return information about registered Amazon QuickSight.
     */

    public SnapshotUserConfiguration getUserConfiguration() {
        return this.userConfiguration;
    }

    /**
     * <p>
     * A structure that contains information about the anonymous users that the generated snapshot is for. This API will
     * not return information about registered Amazon QuickSight.
     * </p>
     * 
     * @param userConfiguration
     *        A structure that contains information about the anonymous users that the generated snapshot is for. This
     *        API will not return information about registered Amazon QuickSight.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDashboardSnapshotJobRequest withUserConfiguration(SnapshotUserConfiguration userConfiguration) {
        setUserConfiguration(userConfiguration);
        return this;
    }

    /**
     * <p>
     * A structure that describes the configuration of the dashboard snapshot.
     * </p>
     * 
     * @param snapshotConfiguration
     *        A structure that describes the configuration of the dashboard snapshot.
     */

    public void setSnapshotConfiguration(SnapshotConfiguration snapshotConfiguration) {
        this.snapshotConfiguration = snapshotConfiguration;
    }

    /**
     * <p>
     * A structure that describes the configuration of the dashboard snapshot.
     * </p>
     * 
     * @return A structure that describes the configuration of the dashboard snapshot.
     */

    public SnapshotConfiguration getSnapshotConfiguration() {
        return this.snapshotConfiguration;
    }

    /**
     * <p>
     * A structure that describes the configuration of the dashboard snapshot.
     * </p>
     * 
     * @param snapshotConfiguration
     *        A structure that describes the configuration of the dashboard snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartDashboardSnapshotJobRequest withSnapshotConfiguration(SnapshotConfiguration snapshotConfiguration) {
        setSnapshotConfiguration(snapshotConfiguration);
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
            sb.append("SnapshotJobId: ").append(getSnapshotJobId()).append(",");
        if (getUserConfiguration() != null)
            sb.append("UserConfiguration: ").append(getUserConfiguration()).append(",");
        if (getSnapshotConfiguration() != null)
            sb.append("SnapshotConfiguration: ").append(getSnapshotConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartDashboardSnapshotJobRequest == false)
            return false;
        StartDashboardSnapshotJobRequest other = (StartDashboardSnapshotJobRequest) obj;
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
        if (other.getUserConfiguration() == null ^ this.getUserConfiguration() == null)
            return false;
        if (other.getUserConfiguration() != null && other.getUserConfiguration().equals(this.getUserConfiguration()) == false)
            return false;
        if (other.getSnapshotConfiguration() == null ^ this.getSnapshotConfiguration() == null)
            return false;
        if (other.getSnapshotConfiguration() != null && other.getSnapshotConfiguration().equals(this.getSnapshotConfiguration()) == false)
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
        hashCode = prime * hashCode + ((getUserConfiguration() == null) ? 0 : getUserConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSnapshotConfiguration() == null) ? 0 : getSnapshotConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public StartDashboardSnapshotJobRequest clone() {
        return (StartDashboardSnapshotJobRequest) super.clone();
    }

}
