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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceMetricsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The start time for the returned metrics, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of the
     * user-specified <code>StartTime</code>.
     * </p>
     */
    private java.util.Date alignedStartTime;
    /**
     * <p>
     * The end time for the returned metrics, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of the
     * user-specified <code>Endtime</code>.
     * </p>
     */
    private java.util.Date alignedEndTime;
    /**
     * <p>
     * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data
     * source.
     * </p>
     * <p>
     * To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for example:
     * <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * An array of metric results,, where each array element contains all of the data points for a particular dimension.
     * </p>
     */
    private java.util.List<MetricKeyDataPoints> metricList;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The start time for the returned metrics, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of the
     * user-specified <code>StartTime</code>.
     * </p>
     * 
     * @param alignedStartTime
     *        The start time for the returned metrics, after alignment to a granular boundary (as specified by
     *        <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of
     *        the user-specified <code>StartTime</code>.
     */

    public void setAlignedStartTime(java.util.Date alignedStartTime) {
        this.alignedStartTime = alignedStartTime;
    }

    /**
     * <p>
     * The start time for the returned metrics, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of the
     * user-specified <code>StartTime</code>.
     * </p>
     * 
     * @return The start time for the returned metrics, after alignment to a granular boundary (as specified by
     *         <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of
     *         the user-specified <code>StartTime</code>.
     */

    public java.util.Date getAlignedStartTime() {
        return this.alignedStartTime;
    }

    /**
     * <p>
     * The start time for the returned metrics, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of the
     * user-specified <code>StartTime</code>.
     * </p>
     * 
     * @param alignedStartTime
     *        The start time for the returned metrics, after alignment to a granular boundary (as specified by
     *        <code>PeriodInSeconds</code>). <code>AlignedStartTime</code> will be less than or equal to the value of
     *        the user-specified <code>StartTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsResult withAlignedStartTime(java.util.Date alignedStartTime) {
        setAlignedStartTime(alignedStartTime);
        return this;
    }

    /**
     * <p>
     * The end time for the returned metrics, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of the
     * user-specified <code>Endtime</code>.
     * </p>
     * 
     * @param alignedEndTime
     *        The end time for the returned metrics, after alignment to a granular boundary (as specified by
     *        <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of
     *        the user-specified <code>Endtime</code>.
     */

    public void setAlignedEndTime(java.util.Date alignedEndTime) {
        this.alignedEndTime = alignedEndTime;
    }

    /**
     * <p>
     * The end time for the returned metrics, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of the
     * user-specified <code>Endtime</code>.
     * </p>
     * 
     * @return The end time for the returned metrics, after alignment to a granular boundary (as specified by
     *         <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of
     *         the user-specified <code>Endtime</code>.
     */

    public java.util.Date getAlignedEndTime() {
        return this.alignedEndTime;
    }

    /**
     * <p>
     * The end time for the returned metrics, after alignment to a granular boundary (as specified by
     * <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of the
     * user-specified <code>Endtime</code>.
     * </p>
     * 
     * @param alignedEndTime
     *        The end time for the returned metrics, after alignment to a granular boundary (as specified by
     *        <code>PeriodInSeconds</code>). <code>AlignedEndTime</code> will be greater than or equal to the value of
     *        the user-specified <code>Endtime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsResult withAlignedEndTime(java.util.Date alignedEndTime) {
        setAlignedEndTime(alignedEndTime);
        return this;
    }

    /**
     * <p>
     * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data
     * source.
     * </p>
     * <p>
     * To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for example:
     * <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     * </p>
     * 
     * @param identifier
     *        An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from
     *        this data source.</p>
     *        <p>
     *        To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for
     *        example: <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data
     * source.
     * </p>
     * <p>
     * To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for example:
     * <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     * </p>
     * 
     * @return An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from
     *         this data source.</p>
     *         <p>
     *         To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for
     *         example: <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data
     * source.
     * </p>
     * <p>
     * To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for example:
     * <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     * </p>
     * 
     * @param identifier
     *        An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from
     *        this data source.</p>
     *        <p>
     *        To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for
     *        example: <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsResult withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * An array of metric results,, where each array element contains all of the data points for a particular dimension.
     * </p>
     * 
     * @return An array of metric results,, where each array element contains all of the data points for a particular
     *         dimension.
     */

    public java.util.List<MetricKeyDataPoints> getMetricList() {
        return metricList;
    }

    /**
     * <p>
     * An array of metric results,, where each array element contains all of the data points for a particular dimension.
     * </p>
     * 
     * @param metricList
     *        An array of metric results,, where each array element contains all of the data points for a particular
     *        dimension.
     */

    public void setMetricList(java.util.Collection<MetricKeyDataPoints> metricList) {
        if (metricList == null) {
            this.metricList = null;
            return;
        }

        this.metricList = new java.util.ArrayList<MetricKeyDataPoints>(metricList);
    }

    /**
     * <p>
     * An array of metric results,, where each array element contains all of the data points for a particular dimension.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricList(java.util.Collection)} or {@link #withMetricList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param metricList
     *        An array of metric results,, where each array element contains all of the data points for a particular
     *        dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsResult withMetricList(MetricKeyDataPoints... metricList) {
        if (this.metricList == null) {
            setMetricList(new java.util.ArrayList<MetricKeyDataPoints>(metricList.length));
        }
        for (MetricKeyDataPoints ele : metricList) {
            this.metricList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of metric results,, where each array element contains all of the data points for a particular dimension.
     * </p>
     * 
     * @param metricList
     *        An array of metric results,, where each array element contains all of the data points for a particular
     *        dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsResult withMetricList(java.util.Collection<MetricKeyDataPoints> metricList) {
        setMetricList(metricList);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsResult withNextToken(String nextToken) {
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
        if (getAlignedStartTime() != null)
            sb.append("AlignedStartTime: ").append(getAlignedStartTime()).append(",");
        if (getAlignedEndTime() != null)
            sb.append("AlignedEndTime: ").append(getAlignedEndTime()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getMetricList() != null)
            sb.append("MetricList: ").append(getMetricList()).append(",");
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

        if (obj instanceof GetResourceMetricsResult == false)
            return false;
        GetResourceMetricsResult other = (GetResourceMetricsResult) obj;
        if (other.getAlignedStartTime() == null ^ this.getAlignedStartTime() == null)
            return false;
        if (other.getAlignedStartTime() != null && other.getAlignedStartTime().equals(this.getAlignedStartTime()) == false)
            return false;
        if (other.getAlignedEndTime() == null ^ this.getAlignedEndTime() == null)
            return false;
        if (other.getAlignedEndTime() != null && other.getAlignedEndTime().equals(this.getAlignedEndTime()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getMetricList() == null ^ this.getMetricList() == null)
            return false;
        if (other.getMetricList() != null && other.getMetricList().equals(this.getMetricList()) == false)
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

        hashCode = prime * hashCode + ((getAlignedStartTime() == null) ? 0 : getAlignedStartTime().hashCode());
        hashCode = prime * hashCode + ((getAlignedEndTime() == null) ? 0 : getAlignedEndTime().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMetricList() == null) ? 0 : getMetricList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceMetricsResult clone() {
        try {
            return (GetResourceMetricsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
