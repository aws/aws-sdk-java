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
package com.amazonaws.services.timestreaminfluxdb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * All the customer-modifiable InfluxDB v2 parameters in Timestream for InfluxDB.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/timestream-influxdb-2023-01-27/InfluxDBv2Parameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InfluxDBv2Parameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Include option to show detailed logs for Flux queries.
     * </p>
     * <p>
     * Default: false
     * </p>
     */
    private Boolean fluxLogEnabled;
    /**
     * <p>
     * Log output level. InfluxDB outputs log entries with severity levels greater than or equal to the level specified.
     * </p>
     * <p>
     * Default: info
     * </p>
     */
    private String logLevel;
    /**
     * <p>
     * Disable the task scheduler. If problematic tasks prevent InfluxDB from starting, use this option to start
     * InfluxDB without scheduling or executing tasks.
     * </p>
     * <p>
     * Default: false
     * </p>
     */
    private Boolean noTasks;
    /**
     * <p>
     * Number of queries allowed to execute concurrently. Setting to 0 allows an unlimited number of concurrent queries.
     * </p>
     * <p>
     * Default: 0
     * </p>
     */
    private Integer queryConcurrency;
    /**
     * <p>
     * Maximum number of queries allowed in execution queue. When queue limit is reached, new queries are rejected.
     * Setting to 0 allows an unlimited number of queries in the queue.
     * </p>
     * <p>
     * Default: 0
     * </p>
     */
    private Integer queryQueueSize;
    /**
     * <p>
     * Enable tracing in InfluxDB and specifies the tracing type. Tracing is disabled by default.
     * </p>
     */
    private String tracingType;
    /**
     * <p>
     * Disable the HTTP /metrics endpoint which exposes <a
     * href="https://docs.influxdata.com/influxdb/v2/reference/internals/metrics/">internal InfluxDB metrics</a>.
     * </p>
     * <p>
     * Default: false
     * </p>
     */
    private Boolean metricsDisabled;

    /**
     * <p>
     * Include option to show detailed logs for Flux queries.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param fluxLogEnabled
     *        Include option to show detailed logs for Flux queries.</p>
     *        <p>
     *        Default: false
     */

    public void setFluxLogEnabled(Boolean fluxLogEnabled) {
        this.fluxLogEnabled = fluxLogEnabled;
    }

    /**
     * <p>
     * Include option to show detailed logs for Flux queries.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return Include option to show detailed logs for Flux queries.</p>
     *         <p>
     *         Default: false
     */

    public Boolean getFluxLogEnabled() {
        return this.fluxLogEnabled;
    }

    /**
     * <p>
     * Include option to show detailed logs for Flux queries.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param fluxLogEnabled
     *        Include option to show detailed logs for Flux queries.</p>
     *        <p>
     *        Default: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfluxDBv2Parameters withFluxLogEnabled(Boolean fluxLogEnabled) {
        setFluxLogEnabled(fluxLogEnabled);
        return this;
    }

    /**
     * <p>
     * Include option to show detailed logs for Flux queries.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return Include option to show detailed logs for Flux queries.</p>
     *         <p>
     *         Default: false
     */

    public Boolean isFluxLogEnabled() {
        return this.fluxLogEnabled;
    }

    /**
     * <p>
     * Log output level. InfluxDB outputs log entries with severity levels greater than or equal to the level specified.
     * </p>
     * <p>
     * Default: info
     * </p>
     * 
     * @param logLevel
     *        Log output level. InfluxDB outputs log entries with severity levels greater than or equal to the level
     *        specified.</p>
     *        <p>
     *        Default: info
     * @see LogLevel
     */

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }

    /**
     * <p>
     * Log output level. InfluxDB outputs log entries with severity levels greater than or equal to the level specified.
     * </p>
     * <p>
     * Default: info
     * </p>
     * 
     * @return Log output level. InfluxDB outputs log entries with severity levels greater than or equal to the level
     *         specified.</p>
     *         <p>
     *         Default: info
     * @see LogLevel
     */

    public String getLogLevel() {
        return this.logLevel;
    }

    /**
     * <p>
     * Log output level. InfluxDB outputs log entries with severity levels greater than or equal to the level specified.
     * </p>
     * <p>
     * Default: info
     * </p>
     * 
     * @param logLevel
     *        Log output level. InfluxDB outputs log entries with severity levels greater than or equal to the level
     *        specified.</p>
     *        <p>
     *        Default: info
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public InfluxDBv2Parameters withLogLevel(String logLevel) {
        setLogLevel(logLevel);
        return this;
    }

    /**
     * <p>
     * Log output level. InfluxDB outputs log entries with severity levels greater than or equal to the level specified.
     * </p>
     * <p>
     * Default: info
     * </p>
     * 
     * @param logLevel
     *        Log output level. InfluxDB outputs log entries with severity levels greater than or equal to the level
     *        specified.</p>
     *        <p>
     *        Default: info
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LogLevel
     */

    public InfluxDBv2Parameters withLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel.toString();
        return this;
    }

    /**
     * <p>
     * Disable the task scheduler. If problematic tasks prevent InfluxDB from starting, use this option to start
     * InfluxDB without scheduling or executing tasks.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param noTasks
     *        Disable the task scheduler. If problematic tasks prevent InfluxDB from starting, use this option to start
     *        InfluxDB without scheduling or executing tasks.</p>
     *        <p>
     *        Default: false
     */

    public void setNoTasks(Boolean noTasks) {
        this.noTasks = noTasks;
    }

    /**
     * <p>
     * Disable the task scheduler. If problematic tasks prevent InfluxDB from starting, use this option to start
     * InfluxDB without scheduling or executing tasks.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return Disable the task scheduler. If problematic tasks prevent InfluxDB from starting, use this option to start
     *         InfluxDB without scheduling or executing tasks.</p>
     *         <p>
     *         Default: false
     */

    public Boolean getNoTasks() {
        return this.noTasks;
    }

    /**
     * <p>
     * Disable the task scheduler. If problematic tasks prevent InfluxDB from starting, use this option to start
     * InfluxDB without scheduling or executing tasks.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param noTasks
     *        Disable the task scheduler. If problematic tasks prevent InfluxDB from starting, use this option to start
     *        InfluxDB without scheduling or executing tasks.</p>
     *        <p>
     *        Default: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfluxDBv2Parameters withNoTasks(Boolean noTasks) {
        setNoTasks(noTasks);
        return this;
    }

    /**
     * <p>
     * Disable the task scheduler. If problematic tasks prevent InfluxDB from starting, use this option to start
     * InfluxDB without scheduling or executing tasks.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return Disable the task scheduler. If problematic tasks prevent InfluxDB from starting, use this option to start
     *         InfluxDB without scheduling or executing tasks.</p>
     *         <p>
     *         Default: false
     */

    public Boolean isNoTasks() {
        return this.noTasks;
    }

    /**
     * <p>
     * Number of queries allowed to execute concurrently. Setting to 0 allows an unlimited number of concurrent queries.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @param queryConcurrency
     *        Number of queries allowed to execute concurrently. Setting to 0 allows an unlimited number of concurrent
     *        queries.</p>
     *        <p>
     *        Default: 0
     */

    public void setQueryConcurrency(Integer queryConcurrency) {
        this.queryConcurrency = queryConcurrency;
    }

    /**
     * <p>
     * Number of queries allowed to execute concurrently. Setting to 0 allows an unlimited number of concurrent queries.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @return Number of queries allowed to execute concurrently. Setting to 0 allows an unlimited number of concurrent
     *         queries.</p>
     *         <p>
     *         Default: 0
     */

    public Integer getQueryConcurrency() {
        return this.queryConcurrency;
    }

    /**
     * <p>
     * Number of queries allowed to execute concurrently. Setting to 0 allows an unlimited number of concurrent queries.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @param queryConcurrency
     *        Number of queries allowed to execute concurrently. Setting to 0 allows an unlimited number of concurrent
     *        queries.</p>
     *        <p>
     *        Default: 0
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfluxDBv2Parameters withQueryConcurrency(Integer queryConcurrency) {
        setQueryConcurrency(queryConcurrency);
        return this;
    }

    /**
     * <p>
     * Maximum number of queries allowed in execution queue. When queue limit is reached, new queries are rejected.
     * Setting to 0 allows an unlimited number of queries in the queue.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @param queryQueueSize
     *        Maximum number of queries allowed in execution queue. When queue limit is reached, new queries are
     *        rejected. Setting to 0 allows an unlimited number of queries in the queue.</p>
     *        <p>
     *        Default: 0
     */

    public void setQueryQueueSize(Integer queryQueueSize) {
        this.queryQueueSize = queryQueueSize;
    }

    /**
     * <p>
     * Maximum number of queries allowed in execution queue. When queue limit is reached, new queries are rejected.
     * Setting to 0 allows an unlimited number of queries in the queue.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @return Maximum number of queries allowed in execution queue. When queue limit is reached, new queries are
     *         rejected. Setting to 0 allows an unlimited number of queries in the queue.</p>
     *         <p>
     *         Default: 0
     */

    public Integer getQueryQueueSize() {
        return this.queryQueueSize;
    }

    /**
     * <p>
     * Maximum number of queries allowed in execution queue. When queue limit is reached, new queries are rejected.
     * Setting to 0 allows an unlimited number of queries in the queue.
     * </p>
     * <p>
     * Default: 0
     * </p>
     * 
     * @param queryQueueSize
     *        Maximum number of queries allowed in execution queue. When queue limit is reached, new queries are
     *        rejected. Setting to 0 allows an unlimited number of queries in the queue.</p>
     *        <p>
     *        Default: 0
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfluxDBv2Parameters withQueryQueueSize(Integer queryQueueSize) {
        setQueryQueueSize(queryQueueSize);
        return this;
    }

    /**
     * <p>
     * Enable tracing in InfluxDB and specifies the tracing type. Tracing is disabled by default.
     * </p>
     * 
     * @param tracingType
     *        Enable tracing in InfluxDB and specifies the tracing type. Tracing is disabled by default.
     * @see TracingType
     */

    public void setTracingType(String tracingType) {
        this.tracingType = tracingType;
    }

    /**
     * <p>
     * Enable tracing in InfluxDB and specifies the tracing type. Tracing is disabled by default.
     * </p>
     * 
     * @return Enable tracing in InfluxDB and specifies the tracing type. Tracing is disabled by default.
     * @see TracingType
     */

    public String getTracingType() {
        return this.tracingType;
    }

    /**
     * <p>
     * Enable tracing in InfluxDB and specifies the tracing type. Tracing is disabled by default.
     * </p>
     * 
     * @param tracingType
     *        Enable tracing in InfluxDB and specifies the tracing type. Tracing is disabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TracingType
     */

    public InfluxDBv2Parameters withTracingType(String tracingType) {
        setTracingType(tracingType);
        return this;
    }

    /**
     * <p>
     * Enable tracing in InfluxDB and specifies the tracing type. Tracing is disabled by default.
     * </p>
     * 
     * @param tracingType
     *        Enable tracing in InfluxDB and specifies the tracing type. Tracing is disabled by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TracingType
     */

    public InfluxDBv2Parameters withTracingType(TracingType tracingType) {
        this.tracingType = tracingType.toString();
        return this;
    }

    /**
     * <p>
     * Disable the HTTP /metrics endpoint which exposes <a
     * href="https://docs.influxdata.com/influxdb/v2/reference/internals/metrics/">internal InfluxDB metrics</a>.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param metricsDisabled
     *        Disable the HTTP /metrics endpoint which exposes <a
     *        href="https://docs.influxdata.com/influxdb/v2/reference/internals/metrics/">internal InfluxDB
     *        metrics</a>.</p>
     *        <p>
     *        Default: false
     */

    public void setMetricsDisabled(Boolean metricsDisabled) {
        this.metricsDisabled = metricsDisabled;
    }

    /**
     * <p>
     * Disable the HTTP /metrics endpoint which exposes <a
     * href="https://docs.influxdata.com/influxdb/v2/reference/internals/metrics/">internal InfluxDB metrics</a>.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return Disable the HTTP /metrics endpoint which exposes <a
     *         href="https://docs.influxdata.com/influxdb/v2/reference/internals/metrics/">internal InfluxDB
     *         metrics</a>.</p>
     *         <p>
     *         Default: false
     */

    public Boolean getMetricsDisabled() {
        return this.metricsDisabled;
    }

    /**
     * <p>
     * Disable the HTTP /metrics endpoint which exposes <a
     * href="https://docs.influxdata.com/influxdb/v2/reference/internals/metrics/">internal InfluxDB metrics</a>.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @param metricsDisabled
     *        Disable the HTTP /metrics endpoint which exposes <a
     *        href="https://docs.influxdata.com/influxdb/v2/reference/internals/metrics/">internal InfluxDB
     *        metrics</a>.</p>
     *        <p>
     *        Default: false
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InfluxDBv2Parameters withMetricsDisabled(Boolean metricsDisabled) {
        setMetricsDisabled(metricsDisabled);
        return this;
    }

    /**
     * <p>
     * Disable the HTTP /metrics endpoint which exposes <a
     * href="https://docs.influxdata.com/influxdb/v2/reference/internals/metrics/">internal InfluxDB metrics</a>.
     * </p>
     * <p>
     * Default: false
     * </p>
     * 
     * @return Disable the HTTP /metrics endpoint which exposes <a
     *         href="https://docs.influxdata.com/influxdb/v2/reference/internals/metrics/">internal InfluxDB
     *         metrics</a>.</p>
     *         <p>
     *         Default: false
     */

    public Boolean isMetricsDisabled() {
        return this.metricsDisabled;
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
        if (getFluxLogEnabled() != null)
            sb.append("FluxLogEnabled: ").append(getFluxLogEnabled()).append(",");
        if (getLogLevel() != null)
            sb.append("LogLevel: ").append(getLogLevel()).append(",");
        if (getNoTasks() != null)
            sb.append("NoTasks: ").append(getNoTasks()).append(",");
        if (getQueryConcurrency() != null)
            sb.append("QueryConcurrency: ").append(getQueryConcurrency()).append(",");
        if (getQueryQueueSize() != null)
            sb.append("QueryQueueSize: ").append(getQueryQueueSize()).append(",");
        if (getTracingType() != null)
            sb.append("TracingType: ").append(getTracingType()).append(",");
        if (getMetricsDisabled() != null)
            sb.append("MetricsDisabled: ").append(getMetricsDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InfluxDBv2Parameters == false)
            return false;
        InfluxDBv2Parameters other = (InfluxDBv2Parameters) obj;
        if (other.getFluxLogEnabled() == null ^ this.getFluxLogEnabled() == null)
            return false;
        if (other.getFluxLogEnabled() != null && other.getFluxLogEnabled().equals(this.getFluxLogEnabled()) == false)
            return false;
        if (other.getLogLevel() == null ^ this.getLogLevel() == null)
            return false;
        if (other.getLogLevel() != null && other.getLogLevel().equals(this.getLogLevel()) == false)
            return false;
        if (other.getNoTasks() == null ^ this.getNoTasks() == null)
            return false;
        if (other.getNoTasks() != null && other.getNoTasks().equals(this.getNoTasks()) == false)
            return false;
        if (other.getQueryConcurrency() == null ^ this.getQueryConcurrency() == null)
            return false;
        if (other.getQueryConcurrency() != null && other.getQueryConcurrency().equals(this.getQueryConcurrency()) == false)
            return false;
        if (other.getQueryQueueSize() == null ^ this.getQueryQueueSize() == null)
            return false;
        if (other.getQueryQueueSize() != null && other.getQueryQueueSize().equals(this.getQueryQueueSize()) == false)
            return false;
        if (other.getTracingType() == null ^ this.getTracingType() == null)
            return false;
        if (other.getTracingType() != null && other.getTracingType().equals(this.getTracingType()) == false)
            return false;
        if (other.getMetricsDisabled() == null ^ this.getMetricsDisabled() == null)
            return false;
        if (other.getMetricsDisabled() != null && other.getMetricsDisabled().equals(this.getMetricsDisabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFluxLogEnabled() == null) ? 0 : getFluxLogEnabled().hashCode());
        hashCode = prime * hashCode + ((getLogLevel() == null) ? 0 : getLogLevel().hashCode());
        hashCode = prime * hashCode + ((getNoTasks() == null) ? 0 : getNoTasks().hashCode());
        hashCode = prime * hashCode + ((getQueryConcurrency() == null) ? 0 : getQueryConcurrency().hashCode());
        hashCode = prime * hashCode + ((getQueryQueueSize() == null) ? 0 : getQueryQueueSize().hashCode());
        hashCode = prime * hashCode + ((getTracingType() == null) ? 0 : getTracingType().hashCode());
        hashCode = prime * hashCode + ((getMetricsDisabled() == null) ? 0 : getMetricsDisabled().hashCode());
        return hashCode;
    }

    @Override
    public InfluxDBv2Parameters clone() {
        try {
            return (InfluxDBv2Parameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.timestreaminfluxdb.model.transform.InfluxDBv2ParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
