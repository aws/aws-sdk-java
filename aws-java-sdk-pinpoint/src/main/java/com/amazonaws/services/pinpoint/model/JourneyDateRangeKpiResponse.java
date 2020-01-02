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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides the results of a query that retrieved the data for a standard engagement metric that applies to a journey,
 * and provides information about that query.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/JourneyDateRangeKpiResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JourneyDateRangeKpiResponse implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the application that the metric applies to.
     * </p>
     */
    private String applicationId;
    /**
     * <p>
     * The last date and time of the date range that was used to filter the query results, in extended ISO 8601 format.
     * The date range is inclusive.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The unique identifier for the journey that the metric applies to.
     * </p>
     */
    private String journeyId;
    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, that the data was retrieved
     * for. This value describes the associated metric and consists of two or more terms, which are comprised of
     * lowercase alphanumeric characters, separated by a hyphen. For a list of possible values, see the <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html">Amazon Pinpoint Developer
     * Guide</a>.
     * </p>
     */
    private String kpiName;
    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the value for the metric and
     * metadata about that value.
     * </p>
     */
    private BaseKpiResult kpiResult;
    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null for the Journey Engagement Metrics resource because the resource returns all results in a single page.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The first date and time of the date range that was used to filter the query results, in extended ISO 8601 format.
     * The date range is inclusive.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The unique identifier for the application that the metric applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the metric applies to.
     */

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the metric applies to.
     * </p>
     * 
     * @return The unique identifier for the application that the metric applies to.
     */

    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * <p>
     * The unique identifier for the application that the metric applies to.
     * </p>
     * 
     * @param applicationId
     *        The unique identifier for the application that the metric applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyDateRangeKpiResponse withApplicationId(String applicationId) {
        setApplicationId(applicationId);
        return this;
    }

    /**
     * <p>
     * The last date and time of the date range that was used to filter the query results, in extended ISO 8601 format.
     * The date range is inclusive.
     * </p>
     * 
     * @param endTime
     *        The last date and time of the date range that was used to filter the query results, in extended ISO 8601
     *        format. The date range is inclusive.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The last date and time of the date range that was used to filter the query results, in extended ISO 8601 format.
     * The date range is inclusive.
     * </p>
     * 
     * @return The last date and time of the date range that was used to filter the query results, in extended ISO 8601
     *         format. The date range is inclusive.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The last date and time of the date range that was used to filter the query results, in extended ISO 8601 format.
     * The date range is inclusive.
     * </p>
     * 
     * @param endTime
     *        The last date and time of the date range that was used to filter the query results, in extended ISO 8601
     *        format. The date range is inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyDateRangeKpiResponse withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the journey that the metric applies to.
     * </p>
     * 
     * @param journeyId
     *        The unique identifier for the journey that the metric applies to.
     */

    public void setJourneyId(String journeyId) {
        this.journeyId = journeyId;
    }

    /**
     * <p>
     * The unique identifier for the journey that the metric applies to.
     * </p>
     * 
     * @return The unique identifier for the journey that the metric applies to.
     */

    public String getJourneyId() {
        return this.journeyId;
    }

    /**
     * <p>
     * The unique identifier for the journey that the metric applies to.
     * </p>
     * 
     * @param journeyId
     *        The unique identifier for the journey that the metric applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyDateRangeKpiResponse withJourneyId(String journeyId) {
        setJourneyId(journeyId);
        return this;
    }

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, that the data was retrieved
     * for. This value describes the associated metric and consists of two or more terms, which are comprised of
     * lowercase alphanumeric characters, separated by a hyphen. For a list of possible values, see the <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html">Amazon Pinpoint Developer
     * Guide</a>.
     * </p>
     * 
     * @param kpiName
     *        The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, that the data was
     *        retrieved for. This value describes the associated metric and consists of two or more terms, which are
     *        comprised of lowercase alphanumeric characters, separated by a hyphen. For a list of possible values, see
     *        the <a href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html">Amazon Pinpoint
     *        Developer Guide</a>.
     */

    public void setKpiName(String kpiName) {
        this.kpiName = kpiName;
    }

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, that the data was retrieved
     * for. This value describes the associated metric and consists of two or more terms, which are comprised of
     * lowercase alphanumeric characters, separated by a hyphen. For a list of possible values, see the <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html">Amazon Pinpoint Developer
     * Guide</a>.
     * </p>
     * 
     * @return The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, that the data was
     *         retrieved for. This value describes the associated metric and consists of two or more terms, which are
     *         comprised of lowercase alphanumeric characters, separated by a hyphen. For a list of possible values, see
     *         the <a href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html">Amazon Pinpoint
     *         Developer Guide</a>.
     */

    public String getKpiName() {
        return this.kpiName;
    }

    /**
     * <p>
     * The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, that the data was retrieved
     * for. This value describes the associated metric and consists of two or more terms, which are comprised of
     * lowercase alphanumeric characters, separated by a hyphen. For a list of possible values, see the <a
     * href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html">Amazon Pinpoint Developer
     * Guide</a>.
     * </p>
     * 
     * @param kpiName
     *        The name of the metric, also referred to as a <i>key performance indicator (KPI)</i>, that the data was
     *        retrieved for. This value describes the associated metric and consists of two or more terms, which are
     *        comprised of lowercase alphanumeric characters, separated by a hyphen. For a list of possible values, see
     *        the <a href="https://docs.aws.amazon.com/pinpoint/latest/developerguide/welcome.html">Amazon Pinpoint
     *        Developer Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyDateRangeKpiResponse withKpiName(String kpiName) {
        setKpiName(kpiName);
        return this;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the value for the metric and
     * metadata about that value.
     * </p>
     * 
     * @param kpiResult
     *        An array of objects that contains the results of the query. Each object contains the value for the metric
     *        and metadata about that value.
     */

    public void setKpiResult(BaseKpiResult kpiResult) {
        this.kpiResult = kpiResult;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the value for the metric and
     * metadata about that value.
     * </p>
     * 
     * @return An array of objects that contains the results of the query. Each object contains the value for the metric
     *         and metadata about that value.
     */

    public BaseKpiResult getKpiResult() {
        return this.kpiResult;
    }

    /**
     * <p>
     * An array of objects that contains the results of the query. Each object contains the value for the metric and
     * metadata about that value.
     * </p>
     * 
     * @param kpiResult
     *        An array of objects that contains the results of the query. Each object contains the value for the metric
     *        and metadata about that value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyDateRangeKpiResponse withKpiResult(BaseKpiResult kpiResult) {
        setKpiResult(kpiResult);
        return this;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null for the Journey Engagement Metrics resource because the resource returns all results in a single page.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null for the Journey Engagement Metrics resource because the resource returns all results in a
     *        single page.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null for the Journey Engagement Metrics resource because the resource returns all results in a single page.
     * </p>
     * 
     * @return The string to use in a subsequent request to get the next page of results in a paginated response. This
     *         value is null for the Journey Engagement Metrics resource because the resource returns all results in a
     *         single page.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string to use in a subsequent request to get the next page of results in a paginated response. This value is
     * null for the Journey Engagement Metrics resource because the resource returns all results in a single page.
     * </p>
     * 
     * @param nextToken
     *        The string to use in a subsequent request to get the next page of results in a paginated response. This
     *        value is null for the Journey Engagement Metrics resource because the resource returns all results in a
     *        single page.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyDateRangeKpiResponse withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The first date and time of the date range that was used to filter the query results, in extended ISO 8601 format.
     * The date range is inclusive.
     * </p>
     * 
     * @param startTime
     *        The first date and time of the date range that was used to filter the query results, in extended ISO 8601
     *        format. The date range is inclusive.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The first date and time of the date range that was used to filter the query results, in extended ISO 8601 format.
     * The date range is inclusive.
     * </p>
     * 
     * @return The first date and time of the date range that was used to filter the query results, in extended ISO 8601
     *         format. The date range is inclusive.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The first date and time of the date range that was used to filter the query results, in extended ISO 8601 format.
     * The date range is inclusive.
     * </p>
     * 
     * @param startTime
     *        The first date and time of the date range that was used to filter the query results, in extended ISO 8601
     *        format. The date range is inclusive.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JourneyDateRangeKpiResponse withStartTime(java.util.Date startTime) {
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
        if (getJourneyId() != null)
            sb.append("JourneyId: ").append(getJourneyId()).append(",");
        if (getKpiName() != null)
            sb.append("KpiName: ").append(getKpiName()).append(",");
        if (getKpiResult() != null)
            sb.append("KpiResult: ").append(getKpiResult()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof JourneyDateRangeKpiResponse == false)
            return false;
        JourneyDateRangeKpiResponse other = (JourneyDateRangeKpiResponse) obj;
        if (other.getApplicationId() == null ^ this.getApplicationId() == null)
            return false;
        if (other.getApplicationId() != null && other.getApplicationId().equals(this.getApplicationId()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getJourneyId() == null ^ this.getJourneyId() == null)
            return false;
        if (other.getJourneyId() != null && other.getJourneyId().equals(this.getJourneyId()) == false)
            return false;
        if (other.getKpiName() == null ^ this.getKpiName() == null)
            return false;
        if (other.getKpiName() != null && other.getKpiName().equals(this.getKpiName()) == false)
            return false;
        if (other.getKpiResult() == null ^ this.getKpiResult() == null)
            return false;
        if (other.getKpiResult() != null && other.getKpiResult().equals(this.getKpiResult()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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
        hashCode = prime * hashCode + ((getJourneyId() == null) ? 0 : getJourneyId().hashCode());
        hashCode = prime * hashCode + ((getKpiName() == null) ? 0 : getKpiName().hashCode());
        hashCode = prime * hashCode + ((getKpiResult() == null) ? 0 : getKpiResult().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public JourneyDateRangeKpiResponse clone() {
        try {
            return (JourneyDateRangeKpiResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.JourneyDateRangeKpiResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
