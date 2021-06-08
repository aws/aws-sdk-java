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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains route settings for a stage.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsApiGatewayV2RouteSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsApiGatewayV2RouteSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether detailed metrics are enabled.
     * </p>
     */
    private Boolean detailedMetricsEnabled;
    /**
     * <p>
     * The logging level. The logging level affects the log entries that are pushed to CloudWatch Logs. Supported only
     * for WebSocket APIs.
     * </p>
     * <p>
     * If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     * </p>
     * <p>
     * If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     * informational events.
     * </p>
     * <p>
     * Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     * </p>
     */
    private String loggingLevel;
    /**
     * <p>
     * Indicates whether data trace logging is enabled. Data trace logging affects the log entries that are pushed to
     * CloudWatch Logs. Supported only for WebSocket APIs.
     * </p>
     */
    private Boolean dataTraceEnabled;
    /**
     * <p>
     * The throttling burst limit.
     * </p>
     */
    private Integer throttlingBurstLimit;
    /**
     * <p>
     * The throttling rate limit.
     * </p>
     */
    private Double throttlingRateLimit;

    /**
     * <p>
     * Indicates whether detailed metrics are enabled.
     * </p>
     * 
     * @param detailedMetricsEnabled
     *        Indicates whether detailed metrics are enabled.
     */

    public void setDetailedMetricsEnabled(Boolean detailedMetricsEnabled) {
        this.detailedMetricsEnabled = detailedMetricsEnabled;
    }

    /**
     * <p>
     * Indicates whether detailed metrics are enabled.
     * </p>
     * 
     * @return Indicates whether detailed metrics are enabled.
     */

    public Boolean getDetailedMetricsEnabled() {
        return this.detailedMetricsEnabled;
    }

    /**
     * <p>
     * Indicates whether detailed metrics are enabled.
     * </p>
     * 
     * @param detailedMetricsEnabled
     *        Indicates whether detailed metrics are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2RouteSettings withDetailedMetricsEnabled(Boolean detailedMetricsEnabled) {
        setDetailedMetricsEnabled(detailedMetricsEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether detailed metrics are enabled.
     * </p>
     * 
     * @return Indicates whether detailed metrics are enabled.
     */

    public Boolean isDetailedMetricsEnabled() {
        return this.detailedMetricsEnabled;
    }

    /**
     * <p>
     * The logging level. The logging level affects the log entries that are pushed to CloudWatch Logs. Supported only
     * for WebSocket APIs.
     * </p>
     * <p>
     * If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     * </p>
     * <p>
     * If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     * informational events.
     * </p>
     * <p>
     * Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     * </p>
     * 
     * @param loggingLevel
     *        The logging level. The logging level affects the log entries that are pushed to CloudWatch Logs. Supported
     *        only for WebSocket APIs.</p>
     *        <p>
     *        If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     *        </p>
     *        <p>
     *        If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     *        informational events.
     *        </p>
     *        <p>
     *        Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     */

    public void setLoggingLevel(String loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    /**
     * <p>
     * The logging level. The logging level affects the log entries that are pushed to CloudWatch Logs. Supported only
     * for WebSocket APIs.
     * </p>
     * <p>
     * If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     * </p>
     * <p>
     * If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     * informational events.
     * </p>
     * <p>
     * Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     * </p>
     * 
     * @return The logging level. The logging level affects the log entries that are pushed to CloudWatch Logs.
     *         Supported only for WebSocket APIs.</p>
     *         <p>
     *         If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     *         </p>
     *         <p>
     *         If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     *         informational events.
     *         </p>
     *         <p>
     *         Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     */

    public String getLoggingLevel() {
        return this.loggingLevel;
    }

    /**
     * <p>
     * The logging level. The logging level affects the log entries that are pushed to CloudWatch Logs. Supported only
     * for WebSocket APIs.
     * </p>
     * <p>
     * If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     * </p>
     * <p>
     * If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     * informational events.
     * </p>
     * <p>
     * Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     * </p>
     * 
     * @param loggingLevel
     *        The logging level. The logging level affects the log entries that are pushed to CloudWatch Logs. Supported
     *        only for WebSocket APIs.</p>
     *        <p>
     *        If the logging level is <code>ERROR</code>, then the logs only include error-level entries.
     *        </p>
     *        <p>
     *        If the logging level is <code>INFO</code>, then the logs include both <code>ERROR</code> events and extra
     *        informational events.
     *        </p>
     *        <p>
     *        Valid values: <code>OFF</code> | <code>ERROR</code> | <code>INFO</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2RouteSettings withLoggingLevel(String loggingLevel) {
        setLoggingLevel(loggingLevel);
        return this;
    }

    /**
     * <p>
     * Indicates whether data trace logging is enabled. Data trace logging affects the log entries that are pushed to
     * CloudWatch Logs. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param dataTraceEnabled
     *        Indicates whether data trace logging is enabled. Data trace logging affects the log entries that are
     *        pushed to CloudWatch Logs. Supported only for WebSocket APIs.
     */

    public void setDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
    }

    /**
     * <p>
     * Indicates whether data trace logging is enabled. Data trace logging affects the log entries that are pushed to
     * CloudWatch Logs. Supported only for WebSocket APIs.
     * </p>
     * 
     * @return Indicates whether data trace logging is enabled. Data trace logging affects the log entries that are
     *         pushed to CloudWatch Logs. Supported only for WebSocket APIs.
     */

    public Boolean getDataTraceEnabled() {
        return this.dataTraceEnabled;
    }

    /**
     * <p>
     * Indicates whether data trace logging is enabled. Data trace logging affects the log entries that are pushed to
     * CloudWatch Logs. Supported only for WebSocket APIs.
     * </p>
     * 
     * @param dataTraceEnabled
     *        Indicates whether data trace logging is enabled. Data trace logging affects the log entries that are
     *        pushed to CloudWatch Logs. Supported only for WebSocket APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2RouteSettings withDataTraceEnabled(Boolean dataTraceEnabled) {
        setDataTraceEnabled(dataTraceEnabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether data trace logging is enabled. Data trace logging affects the log entries that are pushed to
     * CloudWatch Logs. Supported only for WebSocket APIs.
     * </p>
     * 
     * @return Indicates whether data trace logging is enabled. Data trace logging affects the log entries that are
     *         pushed to CloudWatch Logs. Supported only for WebSocket APIs.
     */

    public Boolean isDataTraceEnabled() {
        return this.dataTraceEnabled;
    }

    /**
     * <p>
     * The throttling burst limit.
     * </p>
     * 
     * @param throttlingBurstLimit
     *        The throttling burst limit.
     */

    public void setThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
    }

    /**
     * <p>
     * The throttling burst limit.
     * </p>
     * 
     * @return The throttling burst limit.
     */

    public Integer getThrottlingBurstLimit() {
        return this.throttlingBurstLimit;
    }

    /**
     * <p>
     * The throttling burst limit.
     * </p>
     * 
     * @param throttlingBurstLimit
     *        The throttling burst limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2RouteSettings withThrottlingBurstLimit(Integer throttlingBurstLimit) {
        setThrottlingBurstLimit(throttlingBurstLimit);
        return this;
    }

    /**
     * <p>
     * The throttling rate limit.
     * </p>
     * 
     * @param throttlingRateLimit
     *        The throttling rate limit.
     */

    public void setThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
    }

    /**
     * <p>
     * The throttling rate limit.
     * </p>
     * 
     * @return The throttling rate limit.
     */

    public Double getThrottlingRateLimit() {
        return this.throttlingRateLimit;
    }

    /**
     * <p>
     * The throttling rate limit.
     * </p>
     * 
     * @param throttlingRateLimit
     *        The throttling rate limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsApiGatewayV2RouteSettings withThrottlingRateLimit(Double throttlingRateLimit) {
        setThrottlingRateLimit(throttlingRateLimit);
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
        if (getDetailedMetricsEnabled() != null)
            sb.append("DetailedMetricsEnabled: ").append(getDetailedMetricsEnabled()).append(",");
        if (getLoggingLevel() != null)
            sb.append("LoggingLevel: ").append(getLoggingLevel()).append(",");
        if (getDataTraceEnabled() != null)
            sb.append("DataTraceEnabled: ").append(getDataTraceEnabled()).append(",");
        if (getThrottlingBurstLimit() != null)
            sb.append("ThrottlingBurstLimit: ").append(getThrottlingBurstLimit()).append(",");
        if (getThrottlingRateLimit() != null)
            sb.append("ThrottlingRateLimit: ").append(getThrottlingRateLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsApiGatewayV2RouteSettings == false)
            return false;
        AwsApiGatewayV2RouteSettings other = (AwsApiGatewayV2RouteSettings) obj;
        if (other.getDetailedMetricsEnabled() == null ^ this.getDetailedMetricsEnabled() == null)
            return false;
        if (other.getDetailedMetricsEnabled() != null && other.getDetailedMetricsEnabled().equals(this.getDetailedMetricsEnabled()) == false)
            return false;
        if (other.getLoggingLevel() == null ^ this.getLoggingLevel() == null)
            return false;
        if (other.getLoggingLevel() != null && other.getLoggingLevel().equals(this.getLoggingLevel()) == false)
            return false;
        if (other.getDataTraceEnabled() == null ^ this.getDataTraceEnabled() == null)
            return false;
        if (other.getDataTraceEnabled() != null && other.getDataTraceEnabled().equals(this.getDataTraceEnabled()) == false)
            return false;
        if (other.getThrottlingBurstLimit() == null ^ this.getThrottlingBurstLimit() == null)
            return false;
        if (other.getThrottlingBurstLimit() != null && other.getThrottlingBurstLimit().equals(this.getThrottlingBurstLimit()) == false)
            return false;
        if (other.getThrottlingRateLimit() == null ^ this.getThrottlingRateLimit() == null)
            return false;
        if (other.getThrottlingRateLimit() != null && other.getThrottlingRateLimit().equals(this.getThrottlingRateLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetailedMetricsEnabled() == null) ? 0 : getDetailedMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getLoggingLevel() == null) ? 0 : getLoggingLevel().hashCode());
        hashCode = prime * hashCode + ((getDataTraceEnabled() == null) ? 0 : getDataTraceEnabled().hashCode());
        hashCode = prime * hashCode + ((getThrottlingBurstLimit() == null) ? 0 : getThrottlingBurstLimit().hashCode());
        hashCode = prime * hashCode + ((getThrottlingRateLimit() == null) ? 0 : getThrottlingRateLimit().hashCode());
        return hashCode;
    }

    @Override
    public AwsApiGatewayV2RouteSettings clone() {
        try {
            return (AwsApiGatewayV2RouteSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsApiGatewayV2RouteSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
