/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The ExplainabilityConfig data type defines the number of time series and time points included in
 * <a>CreateExplainability</a>.
 * </p>
 * <p>
 * If you provide a predictor ARN for <code>ResourceArn</code>, you must set both <code>TimePointGranularity</code> and
 * <code>TimeSeriesGranularity</code> to “ALL”. When creating Predictor Explainability, Amazon Forecast considers all
 * time series and time points.
 * </p>
 * <p>
 * If you provide a forecast ARN for <code>ResourceArn</code>, you can set <code>TimePointGranularity</code> and
 * <code>TimeSeriesGranularity</code> to either “ALL” or “Specific”.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ExplainabilityConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExplainabilityConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * To create an Explainability for all time series in your datasets, use <code>ALL</code>. To create an
     * Explainability for specific time series in your datasets, use <code>SPECIFIC</code>.
     * </p>
     * <p>
     * Specify time series by uploading a CSV or Parquet file to an Amazon S3 bucket and set the location within the
     * <a>DataDestination</a> data type.
     * </p>
     */
    private String timeSeriesGranularity;
    /**
     * <p>
     * To create an Explainability for all time points in your forecast horizon, use <code>ALL</code>. To create an
     * Explainability for specific time points in your forecast horizon, use <code>SPECIFIC</code>.
     * </p>
     * <p>
     * Specify time points with the <code>StartDateTime</code> and <code>EndDateTime</code> parameters within the
     * <a>CreateExplainability</a> operation.
     * </p>
     */
    private String timePointGranularity;

    /**
     * <p>
     * To create an Explainability for all time series in your datasets, use <code>ALL</code>. To create an
     * Explainability for specific time series in your datasets, use <code>SPECIFIC</code>.
     * </p>
     * <p>
     * Specify time series by uploading a CSV or Parquet file to an Amazon S3 bucket and set the location within the
     * <a>DataDestination</a> data type.
     * </p>
     * 
     * @param timeSeriesGranularity
     *        To create an Explainability for all time series in your datasets, use <code>ALL</code>. To create an
     *        Explainability for specific time series in your datasets, use <code>SPECIFIC</code>.</p>
     *        <p>
     *        Specify time series by uploading a CSV or Parquet file to an Amazon S3 bucket and set the location within
     *        the <a>DataDestination</a> data type.
     * @see TimeSeriesGranularity
     */

    public void setTimeSeriesGranularity(String timeSeriesGranularity) {
        this.timeSeriesGranularity = timeSeriesGranularity;
    }

    /**
     * <p>
     * To create an Explainability for all time series in your datasets, use <code>ALL</code>. To create an
     * Explainability for specific time series in your datasets, use <code>SPECIFIC</code>.
     * </p>
     * <p>
     * Specify time series by uploading a CSV or Parquet file to an Amazon S3 bucket and set the location within the
     * <a>DataDestination</a> data type.
     * </p>
     * 
     * @return To create an Explainability for all time series in your datasets, use <code>ALL</code>. To create an
     *         Explainability for specific time series in your datasets, use <code>SPECIFIC</code>.</p>
     *         <p>
     *         Specify time series by uploading a CSV or Parquet file to an Amazon S3 bucket and set the location within
     *         the <a>DataDestination</a> data type.
     * @see TimeSeriesGranularity
     */

    public String getTimeSeriesGranularity() {
        return this.timeSeriesGranularity;
    }

    /**
     * <p>
     * To create an Explainability for all time series in your datasets, use <code>ALL</code>. To create an
     * Explainability for specific time series in your datasets, use <code>SPECIFIC</code>.
     * </p>
     * <p>
     * Specify time series by uploading a CSV or Parquet file to an Amazon S3 bucket and set the location within the
     * <a>DataDestination</a> data type.
     * </p>
     * 
     * @param timeSeriesGranularity
     *        To create an Explainability for all time series in your datasets, use <code>ALL</code>. To create an
     *        Explainability for specific time series in your datasets, use <code>SPECIFIC</code>.</p>
     *        <p>
     *        Specify time series by uploading a CSV or Parquet file to an Amazon S3 bucket and set the location within
     *        the <a>DataDestination</a> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeSeriesGranularity
     */

    public ExplainabilityConfig withTimeSeriesGranularity(String timeSeriesGranularity) {
        setTimeSeriesGranularity(timeSeriesGranularity);
        return this;
    }

    /**
     * <p>
     * To create an Explainability for all time series in your datasets, use <code>ALL</code>. To create an
     * Explainability for specific time series in your datasets, use <code>SPECIFIC</code>.
     * </p>
     * <p>
     * Specify time series by uploading a CSV or Parquet file to an Amazon S3 bucket and set the location within the
     * <a>DataDestination</a> data type.
     * </p>
     * 
     * @param timeSeriesGranularity
     *        To create an Explainability for all time series in your datasets, use <code>ALL</code>. To create an
     *        Explainability for specific time series in your datasets, use <code>SPECIFIC</code>.</p>
     *        <p>
     *        Specify time series by uploading a CSV or Parquet file to an Amazon S3 bucket and set the location within
     *        the <a>DataDestination</a> data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimeSeriesGranularity
     */

    public ExplainabilityConfig withTimeSeriesGranularity(TimeSeriesGranularity timeSeriesGranularity) {
        this.timeSeriesGranularity = timeSeriesGranularity.toString();
        return this;
    }

    /**
     * <p>
     * To create an Explainability for all time points in your forecast horizon, use <code>ALL</code>. To create an
     * Explainability for specific time points in your forecast horizon, use <code>SPECIFIC</code>.
     * </p>
     * <p>
     * Specify time points with the <code>StartDateTime</code> and <code>EndDateTime</code> parameters within the
     * <a>CreateExplainability</a> operation.
     * </p>
     * 
     * @param timePointGranularity
     *        To create an Explainability for all time points in your forecast horizon, use <code>ALL</code>. To create
     *        an Explainability for specific time points in your forecast horizon, use <code>SPECIFIC</code>.</p>
     *        <p>
     *        Specify time points with the <code>StartDateTime</code> and <code>EndDateTime</code> parameters within the
     *        <a>CreateExplainability</a> operation.
     * @see TimePointGranularity
     */

    public void setTimePointGranularity(String timePointGranularity) {
        this.timePointGranularity = timePointGranularity;
    }

    /**
     * <p>
     * To create an Explainability for all time points in your forecast horizon, use <code>ALL</code>. To create an
     * Explainability for specific time points in your forecast horizon, use <code>SPECIFIC</code>.
     * </p>
     * <p>
     * Specify time points with the <code>StartDateTime</code> and <code>EndDateTime</code> parameters within the
     * <a>CreateExplainability</a> operation.
     * </p>
     * 
     * @return To create an Explainability for all time points in your forecast horizon, use <code>ALL</code>. To create
     *         an Explainability for specific time points in your forecast horizon, use <code>SPECIFIC</code>.</p>
     *         <p>
     *         Specify time points with the <code>StartDateTime</code> and <code>EndDateTime</code> parameters within
     *         the <a>CreateExplainability</a> operation.
     * @see TimePointGranularity
     */

    public String getTimePointGranularity() {
        return this.timePointGranularity;
    }

    /**
     * <p>
     * To create an Explainability for all time points in your forecast horizon, use <code>ALL</code>. To create an
     * Explainability for specific time points in your forecast horizon, use <code>SPECIFIC</code>.
     * </p>
     * <p>
     * Specify time points with the <code>StartDateTime</code> and <code>EndDateTime</code> parameters within the
     * <a>CreateExplainability</a> operation.
     * </p>
     * 
     * @param timePointGranularity
     *        To create an Explainability for all time points in your forecast horizon, use <code>ALL</code>. To create
     *        an Explainability for specific time points in your forecast horizon, use <code>SPECIFIC</code>.</p>
     *        <p>
     *        Specify time points with the <code>StartDateTime</code> and <code>EndDateTime</code> parameters within the
     *        <a>CreateExplainability</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimePointGranularity
     */

    public ExplainabilityConfig withTimePointGranularity(String timePointGranularity) {
        setTimePointGranularity(timePointGranularity);
        return this;
    }

    /**
     * <p>
     * To create an Explainability for all time points in your forecast horizon, use <code>ALL</code>. To create an
     * Explainability for specific time points in your forecast horizon, use <code>SPECIFIC</code>.
     * </p>
     * <p>
     * Specify time points with the <code>StartDateTime</code> and <code>EndDateTime</code> parameters within the
     * <a>CreateExplainability</a> operation.
     * </p>
     * 
     * @param timePointGranularity
     *        To create an Explainability for all time points in your forecast horizon, use <code>ALL</code>. To create
     *        an Explainability for specific time points in your forecast horizon, use <code>SPECIFIC</code>.</p>
     *        <p>
     *        Specify time points with the <code>StartDateTime</code> and <code>EndDateTime</code> parameters within the
     *        <a>CreateExplainability</a> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TimePointGranularity
     */

    public ExplainabilityConfig withTimePointGranularity(TimePointGranularity timePointGranularity) {
        this.timePointGranularity = timePointGranularity.toString();
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
        if (getTimeSeriesGranularity() != null)
            sb.append("TimeSeriesGranularity: ").append(getTimeSeriesGranularity()).append(",");
        if (getTimePointGranularity() != null)
            sb.append("TimePointGranularity: ").append(getTimePointGranularity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExplainabilityConfig == false)
            return false;
        ExplainabilityConfig other = (ExplainabilityConfig) obj;
        if (other.getTimeSeriesGranularity() == null ^ this.getTimeSeriesGranularity() == null)
            return false;
        if (other.getTimeSeriesGranularity() != null && other.getTimeSeriesGranularity().equals(this.getTimeSeriesGranularity()) == false)
            return false;
        if (other.getTimePointGranularity() == null ^ this.getTimePointGranularity() == null)
            return false;
        if (other.getTimePointGranularity() != null && other.getTimePointGranularity().equals(this.getTimePointGranularity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimeSeriesGranularity() == null) ? 0 : getTimeSeriesGranularity().hashCode());
        hashCode = prime * hashCode + ((getTimePointGranularity() == null) ? 0 : getTimePointGranularity().hashCode());
        return hashCode;
    }

    @Override
    public ExplainabilityConfig clone() {
        try {
            return (ExplainabilityConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.ExplainabilityConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
