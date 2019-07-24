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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/GetApplicationDateRangeKpi"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetApplicationDateRangeKpiRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The last date to retrieve data for, as part of an inclusive date range that filters the query results. This value
     * should be in ISO 8601 format, for example: 2019-07-19 for July 19, 2019. To define a date range that ends at a
     * specific time, specify the date and time in ISO 8601 format, for example: 2019-07-19T20:00Z for 8:00 PM July 19,
     * 2019.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, to retrieve data for. This
     * value describes the associated metric and consists of two or more terms, which are comprised of lowercase
     * alphanumeric characters, separated by a hyphen. Examples are attempted-deliveries and successful-deliveries. For
     * a list of valid values, see the <a href="developerguide.html">Amazon Pinpoint Developer Guide</a>.
     * </p>
     */
    private String kpiName;
    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a paginated response. This parameter is
     * currently not supported by the App Metrics and Campaign Metrics resources.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported by the App Metrics and Campaign Metrics resources.
     * </p>
     */
    private String pageSize;
    /**
     * <p>
     * The first date to retrieve data for, as part of an inclusive date range that filters the query results. This
     * value should be in ISO 8601 format, for example: 2019-07-15 for July 15, 2019. To define a date range that begins
     * at a specific time, specify the date and time in ISO 8601 format, for example: 2019-07-15T16:00Z for 4:00 PM July
     * 15, 2019.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @return The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *         Amazon Pinpoint console.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the Amazon
     * Pinpoint console.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application. This identifier is displayed as the <b>Project ID</b> on the
     *        Amazon Pinpoint console.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationDateRangeKpiRequest withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The last date to retrieve data for, as part of an inclusive date range that filters the query results. This value
     * should be in ISO 8601 format, for example: 2019-07-19 for July 19, 2019. To define a date range that ends at a
     * specific time, specify the date and time in ISO 8601 format, for example: 2019-07-19T20:00Z for 8:00 PM July 19,
     * 2019.
     * </p>
     * 
     * @param endTime
     *        The last date to retrieve data for, as part of an inclusive date range that filters the query results.
     *        This value should be in ISO 8601 format, for example: 2019-07-19 for July 19, 2019. To define a date range
     *        that ends at a specific time, specify the date and time in ISO 8601 format, for example: 2019-07-19T20:00Z
     *        for 8:00 PM July 19, 2019.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The last date to retrieve data for, as part of an inclusive date range that filters the query results. This value
     * should be in ISO 8601 format, for example: 2019-07-19 for July 19, 2019. To define a date range that ends at a
     * specific time, specify the date and time in ISO 8601 format, for example: 2019-07-19T20:00Z for 8:00 PM July 19,
     * 2019.
     * </p>
     * 
     * @return The last date to retrieve data for, as part of an inclusive date range that filters the query results.
     *         This value should be in ISO 8601 format, for example: 2019-07-19 for July 19, 2019. To define a date
     *         range that ends at a specific time, specify the date and time in ISO 8601 format, for example:
     *         2019-07-19T20:00Z for 8:00 PM July 19, 2019.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The last date to retrieve data for, as part of an inclusive date range that filters the query results. This value
     * should be in ISO 8601 format, for example: 2019-07-19 for July 19, 2019. To define a date range that ends at a
     * specific time, specify the date and time in ISO 8601 format, for example: 2019-07-19T20:00Z for 8:00 PM July 19,
     * 2019.
     * </p>
     * 
     * @param endTime
     *        The last date to retrieve data for, as part of an inclusive date range that filters the query results.
     *        This value should be in ISO 8601 format, for example: 2019-07-19 for July 19, 2019. To define a date range
     *        that ends at a specific time, specify the date and time in ISO 8601 format, for example: 2019-07-19T20:00Z
     *        for 8:00 PM July 19, 2019.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationDateRangeKpiRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, to retrieve data for. This
     * value describes the associated metric and consists of two or more terms, which are comprised of lowercase
     * alphanumeric characters, separated by a hyphen. Examples are attempted-deliveries and successful-deliveries. For
     * a list of valid values, see the <a href="developerguide.html">Amazon Pinpoint Developer Guide</a>.
     * </p>
     * 
     * @param kpiName
     *        The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, to retrieve data
     *        for. This value describes the associated metric and consists of two or more terms, which are comprised of
     *        lowercase alphanumeric characters, separated by a hyphen. Examples are attempted-deliveries and
     *        successful-deliveries. For a list of valid values, see the <a href="developerguide.html">Amazon Pinpoint
     *        Developer Guide</a>.
     */

    public void setKpiName(String kpiName) {
        this.kpiName = kpiName;
    }

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, to retrieve data for. This
     * value describes the associated metric and consists of two or more terms, which are comprised of lowercase
     * alphanumeric characters, separated by a hyphen. Examples are attempted-deliveries and successful-deliveries. For
     * a list of valid values, see the <a href="developerguide.html">Amazon Pinpoint Developer Guide</a>.
     * </p>
     * 
     * @return The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, to retrieve data
     *         for. This value describes the associated metric and consists of two or more terms, which are comprised of
     *         lowercase alphanumeric characters, separated by a hyphen. Examples are attempted-deliveries and
     *         successful-deliveries. For a list of valid values, see the <a href="developerguide.html">Amazon Pinpoint
     *         Developer Guide</a>.
     */

    public String getKpiName() {
        return this.kpiName;
    }

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, to retrieve data for. This
     * value describes the associated metric and consists of two or more terms, which are comprised of lowercase
     * alphanumeric characters, separated by a hyphen. Examples are attempted-deliveries and successful-deliveries. For
     * a list of valid values, see the <a href="developerguide.html">Amazon Pinpoint Developer Guide</a>.
     * </p>
     * 
     * @param kpiName
     *        The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, to retrieve data
     *        for. This value describes the associated metric and consists of two or more terms, which are comprised of
     *        lowercase alphanumeric characters, separated by a hyphen. Examples are attempted-deliveries and
     *        successful-deliveries. For a list of valid values, see the <a href="developerguide.html">Amazon Pinpoint
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationDateRangeKpiRequest withKpiName(String kpiName) {
        setKpiName(kpiName);
        return this;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a paginated response. This parameter is
     * currently not supported by the App Metrics and Campaign Metrics resources.
     * </p>
     * 
     * @param nextToken
     *        The NextToken string that specifies which page of results to return in a paginated response. This
     *        parameter is currently not supported by the App Metrics and Campaign Metrics resources.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a paginated response. This parameter is
     * currently not supported by the App Metrics and Campaign Metrics resources.
     * </p>
     * 
     * @return The NextToken string that specifies which page of results to return in a paginated response. This
     *         parameter is currently not supported by the App Metrics and Campaign Metrics resources.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The NextToken string that specifies which page of results to return in a paginated response. This parameter is
     * currently not supported by the App Metrics and Campaign Metrics resources.
     * </p>
     * 
     * @param nextToken
     *        The NextToken string that specifies which page of results to return in a paginated response. This
     *        parameter is currently not supported by the App Metrics and Campaign Metrics resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationDateRangeKpiRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported by the App Metrics and Campaign Metrics resources.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to include in each page of a paginated response. This parameter is currently
     *        not supported by the App Metrics and Campaign Metrics resources.
     */

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported by the App Metrics and Campaign Metrics resources.
     * </p>
     * 
     * @return The maximum number of items to include in each page of a paginated response. This parameter is currently
     *         not supported by the App Metrics and Campaign Metrics resources.
     */

    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * The maximum number of items to include in each page of a paginated response. This parameter is currently not
     * supported by the App Metrics and Campaign Metrics resources.
     * </p>
     * 
     * @param pageSize
     *        The maximum number of items to include in each page of a paginated response. This parameter is currently
     *        not supported by the App Metrics and Campaign Metrics resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationDateRangeKpiRequest withPageSize(String pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The first date to retrieve data for, as part of an inclusive date range that filters the query results. This
     * value should be in ISO 8601 format, for example: 2019-07-15 for July 15, 2019. To define a date range that begins
     * at a specific time, specify the date and time in ISO 8601 format, for example: 2019-07-15T16:00Z for 4:00 PM July
     * 15, 2019.
     * </p>
     * 
     * @param startTime
     *        The first date to retrieve data for, as part of an inclusive date range that filters the query results.
     *        This value should be in ISO 8601 format, for example: 2019-07-15 for July 15, 2019. To define a date range
     *        that begins at a specific time, specify the date and time in ISO 8601 format, for example:
     *        2019-07-15T16:00Z for 4:00 PM July 15, 2019.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The first date to retrieve data for, as part of an inclusive date range that filters the query results. This
     * value should be in ISO 8601 format, for example: 2019-07-15 for July 15, 2019. To define a date range that begins
     * at a specific time, specify the date and time in ISO 8601 format, for example: 2019-07-15T16:00Z for 4:00 PM July
     * 15, 2019.
     * </p>
     * 
     * @return The first date to retrieve data for, as part of an inclusive date range that filters the query results.
     *         This value should be in ISO 8601 format, for example: 2019-07-15 for July 15, 2019. To define a date
     *         range that begins at a specific time, specify the date and time in ISO 8601 format, for example:
     *         2019-07-15T16:00Z for 4:00 PM July 15, 2019.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The first date to retrieve data for, as part of an inclusive date range that filters the query results. This
     * value should be in ISO 8601 format, for example: 2019-07-15 for July 15, 2019. To define a date range that begins
     * at a specific time, specify the date and time in ISO 8601 format, for example: 2019-07-15T16:00Z for 4:00 PM July
     * 15, 2019.
     * </p>
     * 
     * @param startTime
     *        The first date to retrieve data for, as part of an inclusive date range that filters the query results.
     *        This value should be in ISO 8601 format, for example: 2019-07-15 for July 15, 2019. To define a date range
     *        that begins at a specific time, specify the date and time in ISO 8601 format, for example:
     *        2019-07-15T16:00Z for 4:00 PM July 15, 2019.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetApplicationDateRangeKpiRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getApplicationId() != null)
            sb.append("ApplicationId: ").append(getApplicationId()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getKpiName() != null)
            sb.append("KpiName: ").append(getKpiName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetApplicationDateRangeKpiRequest == false)
            return false;
        GetApplicationDateRangeKpiRequest other = (GetApplicationDateRangeKpiRequest) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getKpiName() == null ^ this.getKpiName() == null)
            return false;
        if (other.getKpiName() != null && other.getKpiName().equals(this.getKpiName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getKpiName() == null) ? 0 : getKpiName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public GetApplicationDateRangeKpiRequest clone() {
        return (GetApplicationDateRangeKpiRequest) super.clone();
    }

}
