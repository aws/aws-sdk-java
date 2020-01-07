/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/GetTimeSeriesServiceStatistics"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTimeSeriesServiceStatisticsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The start of the time frame for which to aggregate statistics.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time frame for which to aggregate statistics.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The case-sensitive name of the group for which to pull statistics from.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The ARN of the group for which to pull statistics from.
     * </p>
     */
    private String groupARN;
    /**
     * <p>
     * A filter expression defining entities that will be aggregated for statistics. Supports ID, service, and edge
     * functions. If no selector expression is specified, edge statistics are returned.
     * </p>
     */
    private String entitySelectorExpression;
    /**
     * <p>
     * Aggregation period in seconds.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * Pagination token.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The start of the time frame for which to aggregate statistics.
     * </p>
     * 
     * @param startTime
     *        The start of the time frame for which to aggregate statistics.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time frame for which to aggregate statistics.
     * </p>
     * 
     * @return The start of the time frame for which to aggregate statistics.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time frame for which to aggregate statistics.
     * </p>
     * 
     * @param startTime
     *        The start of the time frame for which to aggregate statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesServiceStatisticsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time frame for which to aggregate statistics.
     * </p>
     * 
     * @param endTime
     *        The end of the time frame for which to aggregate statistics.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time frame for which to aggregate statistics.
     * </p>
     * 
     * @return The end of the time frame for which to aggregate statistics.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time frame for which to aggregate statistics.
     * </p>
     * 
     * @param endTime
     *        The end of the time frame for which to aggregate statistics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesServiceStatisticsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The case-sensitive name of the group for which to pull statistics from.
     * </p>
     * 
     * @param groupName
     *        The case-sensitive name of the group for which to pull statistics from.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The case-sensitive name of the group for which to pull statistics from.
     * </p>
     * 
     * @return The case-sensitive name of the group for which to pull statistics from.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The case-sensitive name of the group for which to pull statistics from.
     * </p>
     * 
     * @param groupName
     *        The case-sensitive name of the group for which to pull statistics from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesServiceStatisticsRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The ARN of the group for which to pull statistics from.
     * </p>
     * 
     * @param groupARN
     *        The ARN of the group for which to pull statistics from.
     */

    public void setGroupARN(String groupARN) {
        this.groupARN = groupARN;
    }

    /**
     * <p>
     * The ARN of the group for which to pull statistics from.
     * </p>
     * 
     * @return The ARN of the group for which to pull statistics from.
     */

    public String getGroupARN() {
        return this.groupARN;
    }

    /**
     * <p>
     * The ARN of the group for which to pull statistics from.
     * </p>
     * 
     * @param groupARN
     *        The ARN of the group for which to pull statistics from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesServiceStatisticsRequest withGroupARN(String groupARN) {
        setGroupARN(groupARN);
        return this;
    }

    /**
     * <p>
     * A filter expression defining entities that will be aggregated for statistics. Supports ID, service, and edge
     * functions. If no selector expression is specified, edge statistics are returned.
     * </p>
     * 
     * @param entitySelectorExpression
     *        A filter expression defining entities that will be aggregated for statistics. Supports ID, service, and
     *        edge functions. If no selector expression is specified, edge statistics are returned.
     */

    public void setEntitySelectorExpression(String entitySelectorExpression) {
        this.entitySelectorExpression = entitySelectorExpression;
    }

    /**
     * <p>
     * A filter expression defining entities that will be aggregated for statistics. Supports ID, service, and edge
     * functions. If no selector expression is specified, edge statistics are returned.
     * </p>
     * 
     * @return A filter expression defining entities that will be aggregated for statistics. Supports ID, service, and
     *         edge functions. If no selector expression is specified, edge statistics are returned.
     */

    public String getEntitySelectorExpression() {
        return this.entitySelectorExpression;
    }

    /**
     * <p>
     * A filter expression defining entities that will be aggregated for statistics. Supports ID, service, and edge
     * functions. If no selector expression is specified, edge statistics are returned.
     * </p>
     * 
     * @param entitySelectorExpression
     *        A filter expression defining entities that will be aggregated for statistics. Supports ID, service, and
     *        edge functions. If no selector expression is specified, edge statistics are returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesServiceStatisticsRequest withEntitySelectorExpression(String entitySelectorExpression) {
        setEntitySelectorExpression(entitySelectorExpression);
        return this;
    }

    /**
     * <p>
     * Aggregation period in seconds.
     * </p>
     * 
     * @param period
     *        Aggregation period in seconds.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * Aggregation period in seconds.
     * </p>
     * 
     * @return Aggregation period in seconds.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * Aggregation period in seconds.
     * </p>
     * 
     * @param period
     *        Aggregation period in seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesServiceStatisticsRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @return Pagination token.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Pagination token.
     * </p>
     * 
     * @param nextToken
     *        Pagination token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTimeSeriesServiceStatisticsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getGroupARN() != null)
            sb.append("GroupARN: ").append(getGroupARN()).append(",");
        if (getEntitySelectorExpression() != null)
            sb.append("EntitySelectorExpression: ").append(getEntitySelectorExpression()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTimeSeriesServiceStatisticsRequest == false)
            return false;
        GetTimeSeriesServiceStatisticsRequest other = (GetTimeSeriesServiceStatisticsRequest) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getGroupARN() == null ^ this.getGroupARN() == null)
            return false;
        if (other.getGroupARN() != null && other.getGroupARN().equals(this.getGroupARN()) == false)
            return false;
        if (other.getEntitySelectorExpression() == null ^ this.getEntitySelectorExpression() == null)
            return false;
        if (other.getEntitySelectorExpression() != null && other.getEntitySelectorExpression().equals(this.getEntitySelectorExpression()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getGroupARN() == null) ? 0 : getGroupARN().hashCode());
        hashCode = prime * hashCode + ((getEntitySelectorExpression() == null) ? 0 : getEntitySelectorExpression().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTimeSeriesServiceStatisticsRequest clone() {
        return (GetTimeSeriesServiceStatisticsRequest) super.clone();
    }

}
