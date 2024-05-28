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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/StartSessionsStatisticsAggregation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartSessionsStatisticsAggregationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Linux timestamp of the date and time that the statistics end.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The identifier of the farm that contains queues or fleets to return statistics for.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The field to use to group the statistics.
     * </p>
     */
    private java.util.List<String> groupBy;
    /**
     * <p>
     * The period to aggregate the statistics.
     * </p>
     */
    private String period;
    /**
     * <p>
     * A list of fleet IDs or queue IDs to gather statistics for.
     * </p>
     */
    private SessionsStatisticsResources resourceIds;
    /**
     * <p>
     * The Linux timestamp of the date and time that the statistics start.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * One to four statistics to return.
     * </p>
     */
    private java.util.List<String> statistics;
    /**
     * <p>
     * The timezone to use for the statistics. Use UTC notation such as "UTC+8."
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * The Linux timestamp of the date and time that the statistics end.
     * </p>
     * 
     * @param endTime
     *        The Linux timestamp of the date and time that the statistics end.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The Linux timestamp of the date and time that the statistics end.
     * </p>
     * 
     * @return The Linux timestamp of the date and time that the statistics end.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The Linux timestamp of the date and time that the statistics end.
     * </p>
     * 
     * @param endTime
     *        The Linux timestamp of the date and time that the statistics end.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionsStatisticsAggregationRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The identifier of the farm that contains queues or fleets to return statistics for.
     * </p>
     * 
     * @param farmId
     *        The identifier of the farm that contains queues or fleets to return statistics for.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The identifier of the farm that contains queues or fleets to return statistics for.
     * </p>
     * 
     * @return The identifier of the farm that contains queues or fleets to return statistics for.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The identifier of the farm that contains queues or fleets to return statistics for.
     * </p>
     * 
     * @param farmId
     *        The identifier of the farm that contains queues or fleets to return statistics for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionsStatisticsAggregationRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The field to use to group the statistics.
     * </p>
     * 
     * @return The field to use to group the statistics.
     * @see UsageGroupByField
     */

    public java.util.List<String> getGroupBy() {
        return groupBy;
    }

    /**
     * <p>
     * The field to use to group the statistics.
     * </p>
     * 
     * @param groupBy
     *        The field to use to group the statistics.
     * @see UsageGroupByField
     */

    public void setGroupBy(java.util.Collection<String> groupBy) {
        if (groupBy == null) {
            this.groupBy = null;
            return;
        }

        this.groupBy = new java.util.ArrayList<String>(groupBy);
    }

    /**
     * <p>
     * The field to use to group the statistics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGroupBy(java.util.Collection)} or {@link #withGroupBy(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param groupBy
     *        The field to use to group the statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageGroupByField
     */

    public StartSessionsStatisticsAggregationRequest withGroupBy(String... groupBy) {
        if (this.groupBy == null) {
            setGroupBy(new java.util.ArrayList<String>(groupBy.length));
        }
        for (String ele : groupBy) {
            this.groupBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The field to use to group the statistics.
     * </p>
     * 
     * @param groupBy
     *        The field to use to group the statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageGroupByField
     */

    public StartSessionsStatisticsAggregationRequest withGroupBy(java.util.Collection<String> groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * The field to use to group the statistics.
     * </p>
     * 
     * @param groupBy
     *        The field to use to group the statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageGroupByField
     */

    public StartSessionsStatisticsAggregationRequest withGroupBy(UsageGroupByField... groupBy) {
        java.util.ArrayList<String> groupByCopy = new java.util.ArrayList<String>(groupBy.length);
        for (UsageGroupByField value : groupBy) {
            groupByCopy.add(value.toString());
        }
        if (getGroupBy() == null) {
            setGroupBy(groupByCopy);
        } else {
            getGroupBy().addAll(groupByCopy);
        }
        return this;
    }

    /**
     * <p>
     * The period to aggregate the statistics.
     * </p>
     * 
     * @param period
     *        The period to aggregate the statistics.
     * @see Period
     */

    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * <p>
     * The period to aggregate the statistics.
     * </p>
     * 
     * @return The period to aggregate the statistics.
     * @see Period
     */

    public String getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The period to aggregate the statistics.
     * </p>
     * 
     * @param period
     *        The period to aggregate the statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Period
     */

    public StartSessionsStatisticsAggregationRequest withPeriod(String period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The period to aggregate the statistics.
     * </p>
     * 
     * @param period
     *        The period to aggregate the statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Period
     */

    public StartSessionsStatisticsAggregationRequest withPeriod(Period period) {
        this.period = period.toString();
        return this;
    }

    /**
     * <p>
     * A list of fleet IDs or queue IDs to gather statistics for.
     * </p>
     * 
     * @param resourceIds
     *        A list of fleet IDs or queue IDs to gather statistics for.
     */

    public void setResourceIds(SessionsStatisticsResources resourceIds) {
        this.resourceIds = resourceIds;
    }

    /**
     * <p>
     * A list of fleet IDs or queue IDs to gather statistics for.
     * </p>
     * 
     * @return A list of fleet IDs or queue IDs to gather statistics for.
     */

    public SessionsStatisticsResources getResourceIds() {
        return this.resourceIds;
    }

    /**
     * <p>
     * A list of fleet IDs or queue IDs to gather statistics for.
     * </p>
     * 
     * @param resourceIds
     *        A list of fleet IDs or queue IDs to gather statistics for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionsStatisticsAggregationRequest withResourceIds(SessionsStatisticsResources resourceIds) {
        setResourceIds(resourceIds);
        return this;
    }

    /**
     * <p>
     * The Linux timestamp of the date and time that the statistics start.
     * </p>
     * 
     * @param startTime
     *        The Linux timestamp of the date and time that the statistics start.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The Linux timestamp of the date and time that the statistics start.
     * </p>
     * 
     * @return The Linux timestamp of the date and time that the statistics start.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The Linux timestamp of the date and time that the statistics start.
     * </p>
     * 
     * @param startTime
     *        The Linux timestamp of the date and time that the statistics start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionsStatisticsAggregationRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * One to four statistics to return.
     * </p>
     * 
     * @return One to four statistics to return.
     * @see UsageStatistic
     */

    public java.util.List<String> getStatistics() {
        return statistics;
    }

    /**
     * <p>
     * One to four statistics to return.
     * </p>
     * 
     * @param statistics
     *        One to four statistics to return.
     * @see UsageStatistic
     */

    public void setStatistics(java.util.Collection<String> statistics) {
        if (statistics == null) {
            this.statistics = null;
            return;
        }

        this.statistics = new java.util.ArrayList<String>(statistics);
    }

    /**
     * <p>
     * One to four statistics to return.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatistics(java.util.Collection)} or {@link #withStatistics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statistics
     *        One to four statistics to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageStatistic
     */

    public StartSessionsStatisticsAggregationRequest withStatistics(String... statistics) {
        if (this.statistics == null) {
            setStatistics(new java.util.ArrayList<String>(statistics.length));
        }
        for (String ele : statistics) {
            this.statistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One to four statistics to return.
     * </p>
     * 
     * @param statistics
     *        One to four statistics to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageStatistic
     */

    public StartSessionsStatisticsAggregationRequest withStatistics(java.util.Collection<String> statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * One to four statistics to return.
     * </p>
     * 
     * @param statistics
     *        One to four statistics to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UsageStatistic
     */

    public StartSessionsStatisticsAggregationRequest withStatistics(UsageStatistic... statistics) {
        java.util.ArrayList<String> statisticsCopy = new java.util.ArrayList<String>(statistics.length);
        for (UsageStatistic value : statistics) {
            statisticsCopy.add(value.toString());
        }
        if (getStatistics() == null) {
            setStatistics(statisticsCopy);
        } else {
            getStatistics().addAll(statisticsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The timezone to use for the statistics. Use UTC notation such as "UTC+8."
     * </p>
     * 
     * @param timezone
     *        The timezone to use for the statistics. Use UTC notation such as "UTC+8."
     */

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The timezone to use for the statistics. Use UTC notation such as "UTC+8."
     * </p>
     * 
     * @return The timezone to use for the statistics. Use UTC notation such as "UTC+8."
     */

    public String getTimezone() {
        return this.timezone;
    }

    /**
     * <p>
     * The timezone to use for the statistics. Use UTC notation such as "UTC+8."
     * </p>
     * 
     * @param timezone
     *        The timezone to use for the statistics. Use UTC notation such as "UTC+8."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartSessionsStatisticsAggregationRequest withTimezone(String timezone) {
        setTimezone(timezone);
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getResourceIds() != null)
            sb.append("ResourceIds: ").append(getResourceIds()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getTimezone() != null)
            sb.append("Timezone: ").append(getTimezone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartSessionsStatisticsAggregationRequest == false)
            return false;
        StartSessionsStatisticsAggregationRequest other = (StartSessionsStatisticsAggregationRequest) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getResourceIds() == null ^ this.getResourceIds() == null)
            return false;
        if (other.getResourceIds() != null && other.getResourceIds().equals(this.getResourceIds()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        return hashCode;
    }

    @Override
    public StartSessionsStatisticsAggregationRequest clone() {
        return (StartSessionsStatisticsAggregationRequest) super.clone();
    }

}
