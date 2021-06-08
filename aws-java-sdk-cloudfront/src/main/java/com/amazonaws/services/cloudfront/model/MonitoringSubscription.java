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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are
 * enabled for a given CloudFront distribution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/MonitoringSubscription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MonitoringSubscription implements Serializable, Cloneable {

    /**
     * <p>
     * A subscription configuration for additional CloudWatch metrics.
     * </p>
     */
    private RealtimeMetricsSubscriptionConfig realtimeMetricsSubscriptionConfig;

    /**
     * <p>
     * A subscription configuration for additional CloudWatch metrics.
     * </p>
     * 
     * @param realtimeMetricsSubscriptionConfig
     *        A subscription configuration for additional CloudWatch metrics.
     */

    public void setRealtimeMetricsSubscriptionConfig(RealtimeMetricsSubscriptionConfig realtimeMetricsSubscriptionConfig) {
        this.realtimeMetricsSubscriptionConfig = realtimeMetricsSubscriptionConfig;
    }

    /**
     * <p>
     * A subscription configuration for additional CloudWatch metrics.
     * </p>
     * 
     * @return A subscription configuration for additional CloudWatch metrics.
     */

    public RealtimeMetricsSubscriptionConfig getRealtimeMetricsSubscriptionConfig() {
        return this.realtimeMetricsSubscriptionConfig;
    }

    /**
     * <p>
     * A subscription configuration for additional CloudWatch metrics.
     * </p>
     * 
     * @param realtimeMetricsSubscriptionConfig
     *        A subscription configuration for additional CloudWatch metrics.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MonitoringSubscription withRealtimeMetricsSubscriptionConfig(RealtimeMetricsSubscriptionConfig realtimeMetricsSubscriptionConfig) {
        setRealtimeMetricsSubscriptionConfig(realtimeMetricsSubscriptionConfig);
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
        if (getRealtimeMetricsSubscriptionConfig() != null)
            sb.append("RealtimeMetricsSubscriptionConfig: ").append(getRealtimeMetricsSubscriptionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MonitoringSubscription == false)
            return false;
        MonitoringSubscription other = (MonitoringSubscription) obj;
        if (other.getRealtimeMetricsSubscriptionConfig() == null ^ this.getRealtimeMetricsSubscriptionConfig() == null)
            return false;
        if (other.getRealtimeMetricsSubscriptionConfig() != null
                && other.getRealtimeMetricsSubscriptionConfig().equals(this.getRealtimeMetricsSubscriptionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRealtimeMetricsSubscriptionConfig() == null) ? 0 : getRealtimeMetricsSubscriptionConfig().hashCode());
        return hashCode;
    }

    @Override
    public MonitoringSubscription clone() {
        try {
            return (MonitoringSubscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
