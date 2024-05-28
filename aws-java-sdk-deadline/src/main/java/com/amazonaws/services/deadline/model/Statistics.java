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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of statistics for a session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/Statistics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Statistics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The end time for the aggregation.
     * </p>
     */
    private java.util.Date aggregationEndTime;
    /**
     * <p>
     * The start time for the aggregation.
     * </p>
     */
    private java.util.Date aggregationStartTime;
    /**
     * <p>
     * How the statistics should appear in USD. Options include: minimum, maximum, average or sum.
     * </p>
     */
    private Stats costInUsd;
    /**
     * <p>
     * The number of instances in a list of statistics.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * The fleet ID.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The type of instance.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The job ID.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The job name.
     * </p>
     */
    private String jobName;
    /**
     * <p>
     * The licensed product.
     * </p>
     */
    private String licenseProduct;
    /**
     * <p>
     * The queue ID.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The total aggregated runtime.
     * </p>
     */
    private Stats runtimeInSeconds;
    /**
     * <p>
     * The type of usage for the statistics.
     * </p>
     */
    private String usageType;
    /**
     * <p>
     * The user ID.
     * </p>
     */
    private String userId;

    /**
     * <p>
     * The end time for the aggregation.
     * </p>
     * 
     * @param aggregationEndTime
     *        The end time for the aggregation.
     */

    public void setAggregationEndTime(java.util.Date aggregationEndTime) {
        this.aggregationEndTime = aggregationEndTime;
    }

    /**
     * <p>
     * The end time for the aggregation.
     * </p>
     * 
     * @return The end time for the aggregation.
     */

    public java.util.Date getAggregationEndTime() {
        return this.aggregationEndTime;
    }

    /**
     * <p>
     * The end time for the aggregation.
     * </p>
     * 
     * @param aggregationEndTime
     *        The end time for the aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withAggregationEndTime(java.util.Date aggregationEndTime) {
        setAggregationEndTime(aggregationEndTime);
        return this;
    }

    /**
     * <p>
     * The start time for the aggregation.
     * </p>
     * 
     * @param aggregationStartTime
     *        The start time for the aggregation.
     */

    public void setAggregationStartTime(java.util.Date aggregationStartTime) {
        this.aggregationStartTime = aggregationStartTime;
    }

    /**
     * <p>
     * The start time for the aggregation.
     * </p>
     * 
     * @return The start time for the aggregation.
     */

    public java.util.Date getAggregationStartTime() {
        return this.aggregationStartTime;
    }

    /**
     * <p>
     * The start time for the aggregation.
     * </p>
     * 
     * @param aggregationStartTime
     *        The start time for the aggregation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withAggregationStartTime(java.util.Date aggregationStartTime) {
        setAggregationStartTime(aggregationStartTime);
        return this;
    }

    /**
     * <p>
     * How the statistics should appear in USD. Options include: minimum, maximum, average or sum.
     * </p>
     * 
     * @param costInUsd
     *        How the statistics should appear in USD. Options include: minimum, maximum, average or sum.
     */

    public void setCostInUsd(Stats costInUsd) {
        this.costInUsd = costInUsd;
    }

    /**
     * <p>
     * How the statistics should appear in USD. Options include: minimum, maximum, average or sum.
     * </p>
     * 
     * @return How the statistics should appear in USD. Options include: minimum, maximum, average or sum.
     */

    public Stats getCostInUsd() {
        return this.costInUsd;
    }

    /**
     * <p>
     * How the statistics should appear in USD. Options include: minimum, maximum, average or sum.
     * </p>
     * 
     * @param costInUsd
     *        How the statistics should appear in USD. Options include: minimum, maximum, average or sum.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withCostInUsd(Stats costInUsd) {
        setCostInUsd(costInUsd);
        return this;
    }

    /**
     * <p>
     * The number of instances in a list of statistics.
     * </p>
     * 
     * @param count
     *        The number of instances in a list of statistics.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of instances in a list of statistics.
     * </p>
     * 
     * @return The number of instances in a list of statistics.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of instances in a list of statistics.
     * </p>
     * 
     * @param count
     *        The number of instances in a list of statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * The fleet ID.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * The fleet ID.
     * </p>
     * 
     * @return The fleet ID.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * The fleet ID.
     * </p>
     * 
     * @param fleetId
     *        The fleet ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The type of instance.
     * </p>
     * 
     * @param instanceType
     *        The type of instance.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of instance.
     * </p>
     * 
     * @return The type of instance.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of instance.
     * </p>
     * 
     * @param instanceType
     *        The type of instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The job ID.
     * </p>
     * 
     * @param jobId
     *        The job ID.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID.
     * </p>
     * 
     * @return The job ID.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID.
     * </p>
     * 
     * @param jobId
     *        The job ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The job name.
     * </p>
     * 
     * @param jobName
     *        The job name.
     */

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    /**
     * <p>
     * The job name.
     * </p>
     * 
     * @return The job name.
     */

    public String getJobName() {
        return this.jobName;
    }

    /**
     * <p>
     * The job name.
     * </p>
     * 
     * @param jobName
     *        The job name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withJobName(String jobName) {
        setJobName(jobName);
        return this;
    }

    /**
     * <p>
     * The licensed product.
     * </p>
     * 
     * @param licenseProduct
     *        The licensed product.
     */

    public void setLicenseProduct(String licenseProduct) {
        this.licenseProduct = licenseProduct;
    }

    /**
     * <p>
     * The licensed product.
     * </p>
     * 
     * @return The licensed product.
     */

    public String getLicenseProduct() {
        return this.licenseProduct;
    }

    /**
     * <p>
     * The licensed product.
     * </p>
     * 
     * @param licenseProduct
     *        The licensed product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withLicenseProduct(String licenseProduct) {
        setLicenseProduct(licenseProduct);
        return this;
    }

    /**
     * <p>
     * The queue ID.
     * </p>
     * 
     * @param queueId
     *        The queue ID.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID.
     * </p>
     * 
     * @return The queue ID.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID.
     * </p>
     * 
     * @param queueId
     *        The queue ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The total aggregated runtime.
     * </p>
     * 
     * @param runtimeInSeconds
     *        The total aggregated runtime.
     */

    public void setRuntimeInSeconds(Stats runtimeInSeconds) {
        this.runtimeInSeconds = runtimeInSeconds;
    }

    /**
     * <p>
     * The total aggregated runtime.
     * </p>
     * 
     * @return The total aggregated runtime.
     */

    public Stats getRuntimeInSeconds() {
        return this.runtimeInSeconds;
    }

    /**
     * <p>
     * The total aggregated runtime.
     * </p>
     * 
     * @param runtimeInSeconds
     *        The total aggregated runtime.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withRuntimeInSeconds(Stats runtimeInSeconds) {
        setRuntimeInSeconds(runtimeInSeconds);
        return this;
    }

    /**
     * <p>
     * The type of usage for the statistics.
     * </p>
     * 
     * @param usageType
     *        The type of usage for the statistics.
     * @see UsageType
     */

    public void setUsageType(String usageType) {
        this.usageType = usageType;
    }

    /**
     * <p>
     * The type of usage for the statistics.
     * </p>
     * 
     * @return The type of usage for the statistics.
     * @see UsageType
     */

    public String getUsageType() {
        return this.usageType;
    }

    /**
     * <p>
     * The type of usage for the statistics.
     * </p>
     * 
     * @param usageType
     *        The type of usage for the statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageType
     */

    public Statistics withUsageType(String usageType) {
        setUsageType(usageType);
        return this;
    }

    /**
     * <p>
     * The type of usage for the statistics.
     * </p>
     * 
     * @param usageType
     *        The type of usage for the statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageType
     */

    public Statistics withUsageType(UsageType usageType) {
        this.usageType = usageType.toString();
        return this;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @param userId
     *        The user ID.
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @return The user ID.
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user ID.
     * </p>
     * 
     * @param userId
     *        The user ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Statistics withUserId(String userId) {
        setUserId(userId);
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
        if (getAggregationEndTime() != null)
            sb.append("AggregationEndTime: ").append(getAggregationEndTime()).append(",");
        if (getAggregationStartTime() != null)
            sb.append("AggregationStartTime: ").append(getAggregationStartTime()).append(",");
        if (getCostInUsd() != null)
            sb.append("CostInUsd: ").append(getCostInUsd()).append(",");
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getJobName() != null)
            sb.append("JobName: ").append(getJobName()).append(",");
        if (getLicenseProduct() != null)
            sb.append("LicenseProduct: ").append(getLicenseProduct()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getRuntimeInSeconds() != null)
            sb.append("RuntimeInSeconds: ").append(getRuntimeInSeconds()).append(",");
        if (getUsageType() != null)
            sb.append("UsageType: ").append(getUsageType()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Statistics == false)
            return false;
        Statistics other = (Statistics) obj;
        if (other.getAggregationEndTime() == null ^ this.getAggregationEndTime() == null)
            return false;
        if (other.getAggregationEndTime() != null && other.getAggregationEndTime().equals(this.getAggregationEndTime()) == false)
            return false;
        if (other.getAggregationStartTime() == null ^ this.getAggregationStartTime() == null)
            return false;
        if (other.getAggregationStartTime() != null && other.getAggregationStartTime().equals(this.getAggregationStartTime()) == false)
            return false;
        if (other.getCostInUsd() == null ^ this.getCostInUsd() == null)
            return false;
        if (other.getCostInUsd() != null && other.getCostInUsd().equals(this.getCostInUsd()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getJobName() == null ^ this.getJobName() == null)
            return false;
        if (other.getJobName() != null && other.getJobName().equals(this.getJobName()) == false)
            return false;
        if (other.getLicenseProduct() == null ^ this.getLicenseProduct() == null)
            return false;
        if (other.getLicenseProduct() != null && other.getLicenseProduct().equals(this.getLicenseProduct()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getRuntimeInSeconds() == null ^ this.getRuntimeInSeconds() == null)
            return false;
        if (other.getRuntimeInSeconds() != null && other.getRuntimeInSeconds().equals(this.getRuntimeInSeconds()) == false)
            return false;
        if (other.getUsageType() == null ^ this.getUsageType() == null)
            return false;
        if (other.getUsageType() != null && other.getUsageType().equals(this.getUsageType()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAggregationEndTime() == null) ? 0 : getAggregationEndTime().hashCode());
        hashCode = prime * hashCode + ((getAggregationStartTime() == null) ? 0 : getAggregationStartTime().hashCode());
        hashCode = prime * hashCode + ((getCostInUsd() == null) ? 0 : getCostInUsd().hashCode());
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getJobName() == null) ? 0 : getJobName().hashCode());
        hashCode = prime * hashCode + ((getLicenseProduct() == null) ? 0 : getLicenseProduct().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getRuntimeInSeconds() == null) ? 0 : getRuntimeInSeconds().hashCode());
        hashCode = prime * hashCode + ((getUsageType() == null) ? 0 : getUsageType().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public Statistics clone() {
        try {
            return (Statistics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.StatisticsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
