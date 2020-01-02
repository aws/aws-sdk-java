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
package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges to
 * exclude from use for training the model and the time zone to use for the metric.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/monitoring-2010-08-01/AnomalyDetectorConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AnomalyDetectorConfiguration implements Serializable, Cloneable {

    /**
     * <p>
     * An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make sure
     * that events that could cause unusual values for the metric, such as deployments, aren't used when CloudWatch
     * creates the model.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Range> excludedTimeRanges;
    /**
     * <p>
     * The time zone to use for the metric. This is useful to enable the model to automatically account for daylight
     * savings time changes if the metric is sensitive to such time changes.
     * </p>
     * <p>
     * To specify a time zone, use the name of the time zone as specified in the standard tz database. For more
     * information, see <a href="https://en.wikipedia.org/wiki/Tz_database">tz database</a>.
     * </p>
     */
    private String metricTimezone;

    /**
     * <p>
     * An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make sure
     * that events that could cause unusual values for the metric, such as deployments, aren't used when CloudWatch
     * creates the model.
     * </p>
     * 
     * @return An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make
     *         sure that events that could cause unusual values for the metric, such as deployments, aren't used when
     *         CloudWatch creates the model.
     */

    public java.util.List<Range> getExcludedTimeRanges() {
        if (excludedTimeRanges == null) {
            excludedTimeRanges = new com.amazonaws.internal.SdkInternalList<Range>();
        }
        return excludedTimeRanges;
    }

    /**
     * <p>
     * An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make sure
     * that events that could cause unusual values for the metric, such as deployments, aren't used when CloudWatch
     * creates the model.
     * </p>
     * 
     * @param excludedTimeRanges
     *        An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make
     *        sure that events that could cause unusual values for the metric, such as deployments, aren't used when
     *        CloudWatch creates the model.
     */

    public void setExcludedTimeRanges(java.util.Collection<Range> excludedTimeRanges) {
        if (excludedTimeRanges == null) {
            this.excludedTimeRanges = null;
            return;
        }

        this.excludedTimeRanges = new com.amazonaws.internal.SdkInternalList<Range>(excludedTimeRanges);
    }

    /**
     * <p>
     * An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make sure
     * that events that could cause unusual values for the metric, such as deployments, aren't used when CloudWatch
     * creates the model.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExcludedTimeRanges(java.util.Collection)} or {@link #withExcludedTimeRanges(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param excludedTimeRanges
     *        An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make
     *        sure that events that could cause unusual values for the metric, such as deployments, aren't used when
     *        CloudWatch creates the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetectorConfiguration withExcludedTimeRanges(Range... excludedTimeRanges) {
        if (this.excludedTimeRanges == null) {
            setExcludedTimeRanges(new com.amazonaws.internal.SdkInternalList<Range>(excludedTimeRanges.length));
        }
        for (Range ele : excludedTimeRanges) {
            this.excludedTimeRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make sure
     * that events that could cause unusual values for the metric, such as deployments, aren't used when CloudWatch
     * creates the model.
     * </p>
     * 
     * @param excludedTimeRanges
     *        An array of time ranges to exclude from use when the anomaly detection model is trained. Use this to make
     *        sure that events that could cause unusual values for the metric, such as deployments, aren't used when
     *        CloudWatch creates the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetectorConfiguration withExcludedTimeRanges(java.util.Collection<Range> excludedTimeRanges) {
        setExcludedTimeRanges(excludedTimeRanges);
        return this;
    }

    /**
     * <p>
     * The time zone to use for the metric. This is useful to enable the model to automatically account for daylight
     * savings time changes if the metric is sensitive to such time changes.
     * </p>
     * <p>
     * To specify a time zone, use the name of the time zone as specified in the standard tz database. For more
     * information, see <a href="https://en.wikipedia.org/wiki/Tz_database">tz database</a>.
     * </p>
     * 
     * @param metricTimezone
     *        The time zone to use for the metric. This is useful to enable the model to automatically account for
     *        daylight savings time changes if the metric is sensitive to such time changes.</p>
     *        <p>
     *        To specify a time zone, use the name of the time zone as specified in the standard tz database. For more
     *        information, see <a href="https://en.wikipedia.org/wiki/Tz_database">tz database</a>.
     */

    public void setMetricTimezone(String metricTimezone) {
        this.metricTimezone = metricTimezone;
    }

    /**
     * <p>
     * The time zone to use for the metric. This is useful to enable the model to automatically account for daylight
     * savings time changes if the metric is sensitive to such time changes.
     * </p>
     * <p>
     * To specify a time zone, use the name of the time zone as specified in the standard tz database. For more
     * information, see <a href="https://en.wikipedia.org/wiki/Tz_database">tz database</a>.
     * </p>
     * 
     * @return The time zone to use for the metric. This is useful to enable the model to automatically account for
     *         daylight savings time changes if the metric is sensitive to such time changes.</p>
     *         <p>
     *         To specify a time zone, use the name of the time zone as specified in the standard tz database. For more
     *         information, see <a href="https://en.wikipedia.org/wiki/Tz_database">tz database</a>.
     */

    public String getMetricTimezone() {
        return this.metricTimezone;
    }

    /**
     * <p>
     * The time zone to use for the metric. This is useful to enable the model to automatically account for daylight
     * savings time changes if the metric is sensitive to such time changes.
     * </p>
     * <p>
     * To specify a time zone, use the name of the time zone as specified in the standard tz database. For more
     * information, see <a href="https://en.wikipedia.org/wiki/Tz_database">tz database</a>.
     * </p>
     * 
     * @param metricTimezone
     *        The time zone to use for the metric. This is useful to enable the model to automatically account for
     *        daylight savings time changes if the metric is sensitive to such time changes.</p>
     *        <p>
     *        To specify a time zone, use the name of the time zone as specified in the standard tz database. For more
     *        information, see <a href="https://en.wikipedia.org/wiki/Tz_database">tz database</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AnomalyDetectorConfiguration withMetricTimezone(String metricTimezone) {
        setMetricTimezone(metricTimezone);
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
        if (getExcludedTimeRanges() != null)
            sb.append("ExcludedTimeRanges: ").append(getExcludedTimeRanges()).append(",");
        if (getMetricTimezone() != null)
            sb.append("MetricTimezone: ").append(getMetricTimezone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AnomalyDetectorConfiguration == false)
            return false;
        AnomalyDetectorConfiguration other = (AnomalyDetectorConfiguration) obj;
        if (other.getExcludedTimeRanges() == null ^ this.getExcludedTimeRanges() == null)
            return false;
        if (other.getExcludedTimeRanges() != null && other.getExcludedTimeRanges().equals(this.getExcludedTimeRanges()) == false)
            return false;
        if (other.getMetricTimezone() == null ^ this.getMetricTimezone() == null)
            return false;
        if (other.getMetricTimezone() != null && other.getMetricTimezone().equals(this.getMetricTimezone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExcludedTimeRanges() == null) ? 0 : getExcludedTimeRanges().hashCode());
        hashCode = prime * hashCode + ((getMetricTimezone() == null) ? 0 : getMetricTimezone().hashCode());
        return hashCode;
    }

    @Override
    public AnomalyDetectorConfiguration clone() {
        try {
            return (AnomalyDetectorConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
