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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartExportTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The file format for the returned export data. Default value is <code>CSV</code>. <b>Note:</b> <i>The</i>
     * <code>GRAPHML</code> <i>option has been deprecated.</i>
     * </p>
     */
    private java.util.List<String> exportDataFormat;
    /**
     * <p>
     * If a filter is present, it selects the single <code>agentId</code> of the Application Discovery Agent for which
     * data is exported. The <code>agentId</code> can be found in the results of the <code>DescribeAgents</code> API or
     * CLI. If no filter is present, <code>startTime</code> and <code>endTime</code> are ignored and exported data
     * includes both Agentless Discovery Connector data and summary data from Application Discovery agents.
     * </p>
     */
    private java.util.List<ExportFilter> filters;
    /**
     * <p>
     * The start timestamp for exported data from the single Application Discovery Agent selected in the filters. If no
     * value is specified, data is exported starting from the first data collected by the agent.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end timestamp for exported data from the single Application Discovery Agent selected in the filters. If no
     * value is specified, exported data includes the most recent data collected by the agent.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The file format for the returned export data. Default value is <code>CSV</code>. <b>Note:</b> <i>The</i>
     * <code>GRAPHML</code> <i>option has been deprecated.</i>
     * </p>
     * 
     * @return The file format for the returned export data. Default value is <code>CSV</code>. <b>Note:</b> <i>The</i>
     *         <code>GRAPHML</code> <i>option has been deprecated.</i>
     * @see ExportDataFormat
     */

    public java.util.List<String> getExportDataFormat() {
        return exportDataFormat;
    }

    /**
     * <p>
     * The file format for the returned export data. Default value is <code>CSV</code>. <b>Note:</b> <i>The</i>
     * <code>GRAPHML</code> <i>option has been deprecated.</i>
     * </p>
     * 
     * @param exportDataFormat
     *        The file format for the returned export data. Default value is <code>CSV</code>. <b>Note:</b> <i>The</i>
     *        <code>GRAPHML</code> <i>option has been deprecated.</i>
     * @see ExportDataFormat
     */

    public void setExportDataFormat(java.util.Collection<String> exportDataFormat) {
        if (exportDataFormat == null) {
            this.exportDataFormat = null;
            return;
        }

        this.exportDataFormat = new java.util.ArrayList<String>(exportDataFormat);
    }

    /**
     * <p>
     * The file format for the returned export data. Default value is <code>CSV</code>. <b>Note:</b> <i>The</i>
     * <code>GRAPHML</code> <i>option has been deprecated.</i>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExportDataFormat(java.util.Collection)} or {@link #withExportDataFormat(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param exportDataFormat
     *        The file format for the returned export data. Default value is <code>CSV</code>. <b>Note:</b> <i>The</i>
     *        <code>GRAPHML</code> <i>option has been deprecated.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportDataFormat
     */

    public StartExportTaskRequest withExportDataFormat(String... exportDataFormat) {
        if (this.exportDataFormat == null) {
            setExportDataFormat(new java.util.ArrayList<String>(exportDataFormat.length));
        }
        for (String ele : exportDataFormat) {
            this.exportDataFormat.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The file format for the returned export data. Default value is <code>CSV</code>. <b>Note:</b> <i>The</i>
     * <code>GRAPHML</code> <i>option has been deprecated.</i>
     * </p>
     * 
     * @param exportDataFormat
     *        The file format for the returned export data. Default value is <code>CSV</code>. <b>Note:</b> <i>The</i>
     *        <code>GRAPHML</code> <i>option has been deprecated.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportDataFormat
     */

    public StartExportTaskRequest withExportDataFormat(java.util.Collection<String> exportDataFormat) {
        setExportDataFormat(exportDataFormat);
        return this;
    }

    /**
     * <p>
     * The file format for the returned export data. Default value is <code>CSV</code>. <b>Note:</b> <i>The</i>
     * <code>GRAPHML</code> <i>option has been deprecated.</i>
     * </p>
     * 
     * @param exportDataFormat
     *        The file format for the returned export data. Default value is <code>CSV</code>. <b>Note:</b> <i>The</i>
     *        <code>GRAPHML</code> <i>option has been deprecated.</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportDataFormat
     */

    public StartExportTaskRequest withExportDataFormat(ExportDataFormat... exportDataFormat) {
        java.util.ArrayList<String> exportDataFormatCopy = new java.util.ArrayList<String>(exportDataFormat.length);
        for (ExportDataFormat value : exportDataFormat) {
            exportDataFormatCopy.add(value.toString());
        }
        if (getExportDataFormat() == null) {
            setExportDataFormat(exportDataFormatCopy);
        } else {
            getExportDataFormat().addAll(exportDataFormatCopy);
        }
        return this;
    }

    /**
     * <p>
     * If a filter is present, it selects the single <code>agentId</code> of the Application Discovery Agent for which
     * data is exported. The <code>agentId</code> can be found in the results of the <code>DescribeAgents</code> API or
     * CLI. If no filter is present, <code>startTime</code> and <code>endTime</code> are ignored and exported data
     * includes both Agentless Discovery Connector data and summary data from Application Discovery agents.
     * </p>
     * 
     * @return If a filter is present, it selects the single <code>agentId</code> of the Application Discovery Agent for
     *         which data is exported. The <code>agentId</code> can be found in the results of the
     *         <code>DescribeAgents</code> API or CLI. If no filter is present, <code>startTime</code> and
     *         <code>endTime</code> are ignored and exported data includes both Agentless Discovery Connector data and
     *         summary data from Application Discovery agents.
     */

    public java.util.List<ExportFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * If a filter is present, it selects the single <code>agentId</code> of the Application Discovery Agent for which
     * data is exported. The <code>agentId</code> can be found in the results of the <code>DescribeAgents</code> API or
     * CLI. If no filter is present, <code>startTime</code> and <code>endTime</code> are ignored and exported data
     * includes both Agentless Discovery Connector data and summary data from Application Discovery agents.
     * </p>
     * 
     * @param filters
     *        If a filter is present, it selects the single <code>agentId</code> of the Application Discovery Agent for
     *        which data is exported. The <code>agentId</code> can be found in the results of the
     *        <code>DescribeAgents</code> API or CLI. If no filter is present, <code>startTime</code> and
     *        <code>endTime</code> are ignored and exported data includes both Agentless Discovery Connector data and
     *        summary data from Application Discovery agents.
     */

    public void setFilters(java.util.Collection<ExportFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<ExportFilter>(filters);
    }

    /**
     * <p>
     * If a filter is present, it selects the single <code>agentId</code> of the Application Discovery Agent for which
     * data is exported. The <code>agentId</code> can be found in the results of the <code>DescribeAgents</code> API or
     * CLI. If no filter is present, <code>startTime</code> and <code>endTime</code> are ignored and exported data
     * includes both Agentless Discovery Connector data and summary data from Application Discovery agents.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        If a filter is present, it selects the single <code>agentId</code> of the Application Discovery Agent for
     *        which data is exported. The <code>agentId</code> can be found in the results of the
     *        <code>DescribeAgents</code> API or CLI. If no filter is present, <code>startTime</code> and
     *        <code>endTime</code> are ignored and exported data includes both Agentless Discovery Connector data and
     *        summary data from Application Discovery agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportTaskRequest withFilters(ExportFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<ExportFilter>(filters.length));
        }
        for (ExportFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If a filter is present, it selects the single <code>agentId</code> of the Application Discovery Agent for which
     * data is exported. The <code>agentId</code> can be found in the results of the <code>DescribeAgents</code> API or
     * CLI. If no filter is present, <code>startTime</code> and <code>endTime</code> are ignored and exported data
     * includes both Agentless Discovery Connector data and summary data from Application Discovery agents.
     * </p>
     * 
     * @param filters
     *        If a filter is present, it selects the single <code>agentId</code> of the Application Discovery Agent for
     *        which data is exported. The <code>agentId</code> can be found in the results of the
     *        <code>DescribeAgents</code> API or CLI. If no filter is present, <code>startTime</code> and
     *        <code>endTime</code> are ignored and exported data includes both Agentless Discovery Connector data and
     *        summary data from Application Discovery agents.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportTaskRequest withFilters(java.util.Collection<ExportFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The start timestamp for exported data from the single Application Discovery Agent selected in the filters. If no
     * value is specified, data is exported starting from the first data collected by the agent.
     * </p>
     * 
     * @param startTime
     *        The start timestamp for exported data from the single Application Discovery Agent selected in the filters.
     *        If no value is specified, data is exported starting from the first data collected by the agent.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start timestamp for exported data from the single Application Discovery Agent selected in the filters. If no
     * value is specified, data is exported starting from the first data collected by the agent.
     * </p>
     * 
     * @return The start timestamp for exported data from the single Application Discovery Agent selected in the
     *         filters. If no value is specified, data is exported starting from the first data collected by the agent.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start timestamp for exported data from the single Application Discovery Agent selected in the filters. If no
     * value is specified, data is exported starting from the first data collected by the agent.
     * </p>
     * 
     * @param startTime
     *        The start timestamp for exported data from the single Application Discovery Agent selected in the filters.
     *        If no value is specified, data is exported starting from the first data collected by the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportTaskRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end timestamp for exported data from the single Application Discovery Agent selected in the filters. If no
     * value is specified, exported data includes the most recent data collected by the agent.
     * </p>
     * 
     * @param endTime
     *        The end timestamp for exported data from the single Application Discovery Agent selected in the filters.
     *        If no value is specified, exported data includes the most recent data collected by the agent.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end timestamp for exported data from the single Application Discovery Agent selected in the filters. If no
     * value is specified, exported data includes the most recent data collected by the agent.
     * </p>
     * 
     * @return The end timestamp for exported data from the single Application Discovery Agent selected in the filters.
     *         If no value is specified, exported data includes the most recent data collected by the agent.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end timestamp for exported data from the single Application Discovery Agent selected in the filters. If no
     * value is specified, exported data includes the most recent data collected by the agent.
     * </p>
     * 
     * @param endTime
     *        The end timestamp for exported data from the single Application Discovery Agent selected in the filters.
     *        If no value is specified, exported data includes the most recent data collected by the agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartExportTaskRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getExportDataFormat() != null)
            sb.append("ExportDataFormat: ").append(getExportDataFormat()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartExportTaskRequest == false)
            return false;
        StartExportTaskRequest other = (StartExportTaskRequest) obj;
        if (other.getExportDataFormat() == null ^ this.getExportDataFormat() == null)
            return false;
        if (other.getExportDataFormat() != null && other.getExportDataFormat().equals(this.getExportDataFormat()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportDataFormat() == null) ? 0 : getExportDataFormat().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public StartExportTaskRequest clone() {
        return (StartExportTaskRequest) super.clone();
    }

}
