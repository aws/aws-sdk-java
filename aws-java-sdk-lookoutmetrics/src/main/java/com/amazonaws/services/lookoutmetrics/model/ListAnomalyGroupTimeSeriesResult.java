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
package com.amazonaws.services.lookoutmetrics.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutmetrics-2017-07-25/ListAnomalyGroupTimeSeries"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAnomalyGroupTimeSeriesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     */
    private String anomalyGroupId;
    /**
     * <p>
     * The name of the measure field.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * Timestamps for the anomalous metrics.
     * </p>
     */
    private java.util.List<String> timestampList;
    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of anomalous metrics.
     * </p>
     */
    private java.util.List<TimeSeries> timeSeriesList;

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @param anomalyGroupId
     *        The ID of the anomaly group.
     */

    public void setAnomalyGroupId(String anomalyGroupId) {
        this.anomalyGroupId = anomalyGroupId;
    }

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @return The ID of the anomaly group.
     */

    public String getAnomalyGroupId() {
        return this.anomalyGroupId;
    }

    /**
     * <p>
     * The ID of the anomaly group.
     * </p>
     * 
     * @param anomalyGroupId
     *        The ID of the anomaly group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupTimeSeriesResult withAnomalyGroupId(String anomalyGroupId) {
        setAnomalyGroupId(anomalyGroupId);
        return this;
    }

    /**
     * <p>
     * The name of the measure field.
     * </p>
     * 
     * @param metricName
     *        The name of the measure field.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the measure field.
     * </p>
     * 
     * @return The name of the measure field.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the measure field.
     * </p>
     * 
     * @param metricName
     *        The name of the measure field.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupTimeSeriesResult withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * Timestamps for the anomalous metrics.
     * </p>
     * 
     * @return Timestamps for the anomalous metrics.
     */

    public java.util.List<String> getTimestampList() {
        return timestampList;
    }

    /**
     * <p>
     * Timestamps for the anomalous metrics.
     * </p>
     * 
     * @param timestampList
     *        Timestamps for the anomalous metrics.
     */

    public void setTimestampList(java.util.Collection<String> timestampList) {
        if (timestampList == null) {
            this.timestampList = null;
            return;
        }

        this.timestampList = new java.util.ArrayList<String>(timestampList);
    }

    /**
     * <p>
     * Timestamps for the anomalous metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimestampList(java.util.Collection)} or {@link #withTimestampList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param timestampList
     *        Timestamps for the anomalous metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupTimeSeriesResult withTimestampList(String... timestampList) {
        if (this.timestampList == null) {
            setTimestampList(new java.util.ArrayList<String>(timestampList.length));
        }
        for (String ele : timestampList) {
            this.timestampList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Timestamps for the anomalous metrics.
     * </p>
     * 
     * @param timestampList
     *        Timestamps for the anomalous metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupTimeSeriesResult withTimestampList(java.util.Collection<String> timestampList) {
        setTimestampList(timestampList);
        return this;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's included if more results are available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @return The pagination token that's included if more results are available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token that's included if more results are available.
     * </p>
     * 
     * @param nextToken
     *        The pagination token that's included if more results are available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupTimeSeriesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of anomalous metrics.
     * </p>
     * 
     * @return A list of anomalous metrics.
     */

    public java.util.List<TimeSeries> getTimeSeriesList() {
        return timeSeriesList;
    }

    /**
     * <p>
     * A list of anomalous metrics.
     * </p>
     * 
     * @param timeSeriesList
     *        A list of anomalous metrics.
     */

    public void setTimeSeriesList(java.util.Collection<TimeSeries> timeSeriesList) {
        if (timeSeriesList == null) {
            this.timeSeriesList = null;
            return;
        }

        this.timeSeriesList = new java.util.ArrayList<TimeSeries>(timeSeriesList);
    }

    /**
     * <p>
     * A list of anomalous metrics.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTimeSeriesList(java.util.Collection)} or {@link #withTimeSeriesList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param timeSeriesList
     *        A list of anomalous metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupTimeSeriesResult withTimeSeriesList(TimeSeries... timeSeriesList) {
        if (this.timeSeriesList == null) {
            setTimeSeriesList(new java.util.ArrayList<TimeSeries>(timeSeriesList.length));
        }
        for (TimeSeries ele : timeSeriesList) {
            this.timeSeriesList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of anomalous metrics.
     * </p>
     * 
     * @param timeSeriesList
     *        A list of anomalous metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAnomalyGroupTimeSeriesResult withTimeSeriesList(java.util.Collection<TimeSeries> timeSeriesList) {
        setTimeSeriesList(timeSeriesList);
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
        if (getAnomalyGroupId() != null)
            sb.append("AnomalyGroupId: ").append(getAnomalyGroupId()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getTimestampList() != null)
            sb.append("TimestampList: ").append(getTimestampList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getTimeSeriesList() != null)
            sb.append("TimeSeriesList: ").append(getTimeSeriesList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAnomalyGroupTimeSeriesResult == false)
            return false;
        ListAnomalyGroupTimeSeriesResult other = (ListAnomalyGroupTimeSeriesResult) obj;
        if (other.getAnomalyGroupId() == null ^ this.getAnomalyGroupId() == null)
            return false;
        if (other.getAnomalyGroupId() != null && other.getAnomalyGroupId().equals(this.getAnomalyGroupId()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getTimestampList() == null ^ this.getTimestampList() == null)
            return false;
        if (other.getTimestampList() != null && other.getTimestampList().equals(this.getTimestampList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getTimeSeriesList() == null ^ this.getTimeSeriesList() == null)
            return false;
        if (other.getTimeSeriesList() != null && other.getTimeSeriesList().equals(this.getTimeSeriesList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAnomalyGroupId() == null) ? 0 : getAnomalyGroupId().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getTimestampList() == null) ? 0 : getTimestampList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getTimeSeriesList() == null) ? 0 : getTimeSeriesList().hashCode());
        return hashCode;
    }

    @Override
    public ListAnomalyGroupTimeSeriesResult clone() {
        try {
            return (ListAnomalyGroupTimeSeriesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
