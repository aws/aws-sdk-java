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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a collection of route settings.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RouteSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies whether (true) or not (false) data trace logging is enabled for this route. This property affects the
     * log entries pushed to Amazon CloudWatch Logs.
     * </p>
     */
    private Boolean dataTraceEnabled;
    /**
     * <p>
     * Specifies whether detailed metrics are enabled.
     * </p>
     */
    private Boolean detailedMetricsEnabled;
    /**
     * <p>
     * Specifies the logging level for this route: DEBUG, INFO, or WARN. This property affects the log entries pushed to
     * Amazon CloudWatch Logs.
     * </p>
     */
    private String loggingLevel;
    /**
     * <p>
     * Specifies the throttling burst limit.
     * </p>
     */
    private Integer throttlingBurstLimit;
    /**
     * <p>
     * Specifies the throttling rate limit.
     * </p>
     */
    private Double throttlingRateLimit;

    /**
     * <p>
     * Specifies whether (true) or not (false) data trace logging is enabled for this route. This property affects the
     * log entries pushed to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param dataTraceEnabled
     *        Specifies whether (true) or not (false) data trace logging is enabled for this route. This property
     *        affects the log entries pushed to Amazon CloudWatch Logs.
     */

    public void setDataTraceEnabled(Boolean dataTraceEnabled) {
        this.dataTraceEnabled = dataTraceEnabled;
    }

    /**
     * <p>
     * Specifies whether (true) or not (false) data trace logging is enabled for this route. This property affects the
     * log entries pushed to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return Specifies whether (true) or not (false) data trace logging is enabled for this route. This property
     *         affects the log entries pushed to Amazon CloudWatch Logs.
     */

    public Boolean getDataTraceEnabled() {
        return this.dataTraceEnabled;
    }

    /**
     * <p>
     * Specifies whether (true) or not (false) data trace logging is enabled for this route. This property affects the
     * log entries pushed to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param dataTraceEnabled
     *        Specifies whether (true) or not (false) data trace logging is enabled for this route. This property
     *        affects the log entries pushed to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteSettings withDataTraceEnabled(Boolean dataTraceEnabled) {
        setDataTraceEnabled(dataTraceEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether (true) or not (false) data trace logging is enabled for this route. This property affects the
     * log entries pushed to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return Specifies whether (true) or not (false) data trace logging is enabled for this route. This property
     *         affects the log entries pushed to Amazon CloudWatch Logs.
     */

    public Boolean isDataTraceEnabled() {
        return this.dataTraceEnabled;
    }

    /**
     * <p>
     * Specifies whether detailed metrics are enabled.
     * </p>
     * 
     * @param detailedMetricsEnabled
     *        Specifies whether detailed metrics are enabled.
     */

    public void setDetailedMetricsEnabled(Boolean detailedMetricsEnabled) {
        this.detailedMetricsEnabled = detailedMetricsEnabled;
    }

    /**
     * <p>
     * Specifies whether detailed metrics are enabled.
     * </p>
     * 
     * @return Specifies whether detailed metrics are enabled.
     */

    public Boolean getDetailedMetricsEnabled() {
        return this.detailedMetricsEnabled;
    }

    /**
     * <p>
     * Specifies whether detailed metrics are enabled.
     * </p>
     * 
     * @param detailedMetricsEnabled
     *        Specifies whether detailed metrics are enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteSettings withDetailedMetricsEnabled(Boolean detailedMetricsEnabled) {
        setDetailedMetricsEnabled(detailedMetricsEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether detailed metrics are enabled.
     * </p>
     * 
     * @return Specifies whether detailed metrics are enabled.
     */

    public Boolean isDetailedMetricsEnabled() {
        return this.detailedMetricsEnabled;
    }

    /**
     * <p>
     * Specifies the logging level for this route: DEBUG, INFO, or WARN. This property affects the log entries pushed to
     * Amazon CloudWatch Logs.
     * </p>
     * 
     * @param loggingLevel
     *        Specifies the logging level for this route: DEBUG, INFO, or WARN. This property affects the log entries
     *        pushed to Amazon CloudWatch Logs.
     * @see LoggingLevel
     */

    public void setLoggingLevel(String loggingLevel) {
        this.loggingLevel = loggingLevel;
    }

    /**
     * <p>
     * Specifies the logging level for this route: DEBUG, INFO, or WARN. This property affects the log entries pushed to
     * Amazon CloudWatch Logs.
     * </p>
     * 
     * @return Specifies the logging level for this route: DEBUG, INFO, or WARN. This property affects the log entries
     *         pushed to Amazon CloudWatch Logs.
     * @see LoggingLevel
     */

    public String getLoggingLevel() {
        return this.loggingLevel;
    }

    /**
     * <p>
     * Specifies the logging level for this route: DEBUG, INFO, or WARN. This property affects the log entries pushed to
     * Amazon CloudWatch Logs.
     * </p>
     * 
     * @param loggingLevel
     *        Specifies the logging level for this route: DEBUG, INFO, or WARN. This property affects the log entries
     *        pushed to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggingLevel
     */

    public RouteSettings withLoggingLevel(String loggingLevel) {
        setLoggingLevel(loggingLevel);
        return this;
    }

    /**
     * <p>
     * Specifies the logging level for this route: DEBUG, INFO, or WARN. This property affects the log entries pushed to
     * Amazon CloudWatch Logs.
     * </p>
     * 
     * @param loggingLevel
     *        Specifies the logging level for this route: DEBUG, INFO, or WARN. This property affects the log entries
     *        pushed to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LoggingLevel
     */

    public RouteSettings withLoggingLevel(LoggingLevel loggingLevel) {
        this.loggingLevel = loggingLevel.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the throttling burst limit.
     * </p>
     * 
     * @param throttlingBurstLimit
     *        Specifies the throttling burst limit.
     */

    public void setThrottlingBurstLimit(Integer throttlingBurstLimit) {
        this.throttlingBurstLimit = throttlingBurstLimit;
    }

    /**
     * <p>
     * Specifies the throttling burst limit.
     * </p>
     * 
     * @return Specifies the throttling burst limit.
     */

    public Integer getThrottlingBurstLimit() {
        return this.throttlingBurstLimit;
    }

    /**
     * <p>
     * Specifies the throttling burst limit.
     * </p>
     * 
     * @param throttlingBurstLimit
     *        Specifies the throttling burst limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteSettings withThrottlingBurstLimit(Integer throttlingBurstLimit) {
        setThrottlingBurstLimit(throttlingBurstLimit);
        return this;
    }

    /**
     * <p>
     * Specifies the throttling rate limit.
     * </p>
     * 
     * @param throttlingRateLimit
     *        Specifies the throttling rate limit.
     */

    public void setThrottlingRateLimit(Double throttlingRateLimit) {
        this.throttlingRateLimit = throttlingRateLimit;
    }

    /**
     * <p>
     * Specifies the throttling rate limit.
     * </p>
     * 
     * @return Specifies the throttling rate limit.
     */

    public Double getThrottlingRateLimit() {
        return this.throttlingRateLimit;
    }

    /**
     * <p>
     * Specifies the throttling rate limit.
     * </p>
     * 
     * @param throttlingRateLimit
     *        Specifies the throttling rate limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RouteSettings withThrottlingRateLimit(Double throttlingRateLimit) {
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
        if (getDataTraceEnabled() != null)
            sb.append("DataTraceEnabled: ").append(getDataTraceEnabled()).append(",");
        if (getDetailedMetricsEnabled() != null)
            sb.append("DetailedMetricsEnabled: ").append(getDetailedMetricsEnabled()).append(",");
        if (getLoggingLevel() != null)
            sb.append("LoggingLevel: ").append(getLoggingLevel()).append(",");
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

        if (obj instanceof RouteSettings == false)
            return false;
        RouteSettings other = (RouteSettings) obj;
        if (other.getDataTraceEnabled() == null ^ this.getDataTraceEnabled() == null)
            return false;
        if (other.getDataTraceEnabled() != null && other.getDataTraceEnabled().equals(this.getDataTraceEnabled()) == false)
            return false;
        if (other.getDetailedMetricsEnabled() == null ^ this.getDetailedMetricsEnabled() == null)
            return false;
        if (other.getDetailedMetricsEnabled() != null && other.getDetailedMetricsEnabled().equals(this.getDetailedMetricsEnabled()) == false)
            return false;
        if (other.getLoggingLevel() == null ^ this.getLoggingLevel() == null)
            return false;
        if (other.getLoggingLevel() != null && other.getLoggingLevel().equals(this.getLoggingLevel()) == false)
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

        hashCode = prime * hashCode + ((getDataTraceEnabled() == null) ? 0 : getDataTraceEnabled().hashCode());
        hashCode = prime * hashCode + ((getDetailedMetricsEnabled() == null) ? 0 : getDetailedMetricsEnabled().hashCode());
        hashCode = prime * hashCode + ((getLoggingLevel() == null) ? 0 : getLoggingLevel().hashCode());
        hashCode = prime * hashCode + ((getThrottlingBurstLimit() == null) ? 0 : getThrottlingBurstLimit().hashCode());
        hashCode = prime * hashCode + ((getThrottlingRateLimit() == null) ? 0 : getThrottlingRateLimit().hashCode());
        return hashCode;
    }

    @Override
    public RouteSettings clone() {
        try {
            return (RouteSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigatewayv2.model.transform.RouteSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
