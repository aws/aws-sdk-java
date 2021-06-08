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
 * Contains attributes for the load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElbLoadBalancerAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElbLoadBalancerAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the access log configuration for the load balancer.
     * </p>
     * <p>
     * If the access log is enabled, the load balancer captures detailed information about all requests. It delivers the
     * information to a specified S3 bucket.
     * </p>
     */
    private AwsElbLoadBalancerAccessLog accessLog;
    /**
     * <p>
     * Information about the connection draining configuration for the load balancer.
     * </p>
     * <p>
     * If connection draining is enabled, the load balancer allows existing requests to complete before it shifts
     * traffic away from a deregistered or unhealthy instance.
     * </p>
     */
    private AwsElbLoadBalancerConnectionDraining connectionDraining;
    /**
     * <p>
     * Connection settings for the load balancer.
     * </p>
     * <p>
     * If an idle timeout is configured, the load balancer allows connections to remain idle for the specified duration.
     * When a connection is idle, no data is sent over the connection.
     * </p>
     */
    private AwsElbLoadBalancerConnectionSettings connectionSettings;
    /**
     * <p>
     * Cross-zone load balancing settings for the load balancer.
     * </p>
     * <p>
     * If cross-zone load balancing is enabled, the load balancer routes the request traffic evenly across all instances
     * regardless of the Availability Zones.
     * </p>
     */
    private AwsElbLoadBalancerCrossZoneLoadBalancing crossZoneLoadBalancing;

    /**
     * <p>
     * Information about the access log configuration for the load balancer.
     * </p>
     * <p>
     * If the access log is enabled, the load balancer captures detailed information about all requests. It delivers the
     * information to a specified S3 bucket.
     * </p>
     * 
     * @param accessLog
     *        Information about the access log configuration for the load balancer.</p>
     *        <p>
     *        If the access log is enabled, the load balancer captures detailed information about all requests. It
     *        delivers the information to a specified S3 bucket.
     */

    public void setAccessLog(AwsElbLoadBalancerAccessLog accessLog) {
        this.accessLog = accessLog;
    }

    /**
     * <p>
     * Information about the access log configuration for the load balancer.
     * </p>
     * <p>
     * If the access log is enabled, the load balancer captures detailed information about all requests. It delivers the
     * information to a specified S3 bucket.
     * </p>
     * 
     * @return Information about the access log configuration for the load balancer.</p>
     *         <p>
     *         If the access log is enabled, the load balancer captures detailed information about all requests. It
     *         delivers the information to a specified S3 bucket.
     */

    public AwsElbLoadBalancerAccessLog getAccessLog() {
        return this.accessLog;
    }

    /**
     * <p>
     * Information about the access log configuration for the load balancer.
     * </p>
     * <p>
     * If the access log is enabled, the load balancer captures detailed information about all requests. It delivers the
     * information to a specified S3 bucket.
     * </p>
     * 
     * @param accessLog
     *        Information about the access log configuration for the load balancer.</p>
     *        <p>
     *        If the access log is enabled, the load balancer captures detailed information about all requests. It
     *        delivers the information to a specified S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerAttributes withAccessLog(AwsElbLoadBalancerAccessLog accessLog) {
        setAccessLog(accessLog);
        return this;
    }

    /**
     * <p>
     * Information about the connection draining configuration for the load balancer.
     * </p>
     * <p>
     * If connection draining is enabled, the load balancer allows existing requests to complete before it shifts
     * traffic away from a deregistered or unhealthy instance.
     * </p>
     * 
     * @param connectionDraining
     *        Information about the connection draining configuration for the load balancer.</p>
     *        <p>
     *        If connection draining is enabled, the load balancer allows existing requests to complete before it shifts
     *        traffic away from a deregistered or unhealthy instance.
     */

    public void setConnectionDraining(AwsElbLoadBalancerConnectionDraining connectionDraining) {
        this.connectionDraining = connectionDraining;
    }

    /**
     * <p>
     * Information about the connection draining configuration for the load balancer.
     * </p>
     * <p>
     * If connection draining is enabled, the load balancer allows existing requests to complete before it shifts
     * traffic away from a deregistered or unhealthy instance.
     * </p>
     * 
     * @return Information about the connection draining configuration for the load balancer.</p>
     *         <p>
     *         If connection draining is enabled, the load balancer allows existing requests to complete before it
     *         shifts traffic away from a deregistered or unhealthy instance.
     */

    public AwsElbLoadBalancerConnectionDraining getConnectionDraining() {
        return this.connectionDraining;
    }

    /**
     * <p>
     * Information about the connection draining configuration for the load balancer.
     * </p>
     * <p>
     * If connection draining is enabled, the load balancer allows existing requests to complete before it shifts
     * traffic away from a deregistered or unhealthy instance.
     * </p>
     * 
     * @param connectionDraining
     *        Information about the connection draining configuration for the load balancer.</p>
     *        <p>
     *        If connection draining is enabled, the load balancer allows existing requests to complete before it shifts
     *        traffic away from a deregistered or unhealthy instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerAttributes withConnectionDraining(AwsElbLoadBalancerConnectionDraining connectionDraining) {
        setConnectionDraining(connectionDraining);
        return this;
    }

    /**
     * <p>
     * Connection settings for the load balancer.
     * </p>
     * <p>
     * If an idle timeout is configured, the load balancer allows connections to remain idle for the specified duration.
     * When a connection is idle, no data is sent over the connection.
     * </p>
     * 
     * @param connectionSettings
     *        Connection settings for the load balancer.</p>
     *        <p>
     *        If an idle timeout is configured, the load balancer allows connections to remain idle for the specified
     *        duration. When a connection is idle, no data is sent over the connection.
     */

    public void setConnectionSettings(AwsElbLoadBalancerConnectionSettings connectionSettings) {
        this.connectionSettings = connectionSettings;
    }

    /**
     * <p>
     * Connection settings for the load balancer.
     * </p>
     * <p>
     * If an idle timeout is configured, the load balancer allows connections to remain idle for the specified duration.
     * When a connection is idle, no data is sent over the connection.
     * </p>
     * 
     * @return Connection settings for the load balancer.</p>
     *         <p>
     *         If an idle timeout is configured, the load balancer allows connections to remain idle for the specified
     *         duration. When a connection is idle, no data is sent over the connection.
     */

    public AwsElbLoadBalancerConnectionSettings getConnectionSettings() {
        return this.connectionSettings;
    }

    /**
     * <p>
     * Connection settings for the load balancer.
     * </p>
     * <p>
     * If an idle timeout is configured, the load balancer allows connections to remain idle for the specified duration.
     * When a connection is idle, no data is sent over the connection.
     * </p>
     * 
     * @param connectionSettings
     *        Connection settings for the load balancer.</p>
     *        <p>
     *        If an idle timeout is configured, the load balancer allows connections to remain idle for the specified
     *        duration. When a connection is idle, no data is sent over the connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerAttributes withConnectionSettings(AwsElbLoadBalancerConnectionSettings connectionSettings) {
        setConnectionSettings(connectionSettings);
        return this;
    }

    /**
     * <p>
     * Cross-zone load balancing settings for the load balancer.
     * </p>
     * <p>
     * If cross-zone load balancing is enabled, the load balancer routes the request traffic evenly across all instances
     * regardless of the Availability Zones.
     * </p>
     * 
     * @param crossZoneLoadBalancing
     *        Cross-zone load balancing settings for the load balancer.</p>
     *        <p>
     *        If cross-zone load balancing is enabled, the load balancer routes the request traffic evenly across all
     *        instances regardless of the Availability Zones.
     */

    public void setCrossZoneLoadBalancing(AwsElbLoadBalancerCrossZoneLoadBalancing crossZoneLoadBalancing) {
        this.crossZoneLoadBalancing = crossZoneLoadBalancing;
    }

    /**
     * <p>
     * Cross-zone load balancing settings for the load balancer.
     * </p>
     * <p>
     * If cross-zone load balancing is enabled, the load balancer routes the request traffic evenly across all instances
     * regardless of the Availability Zones.
     * </p>
     * 
     * @return Cross-zone load balancing settings for the load balancer.</p>
     *         <p>
     *         If cross-zone load balancing is enabled, the load balancer routes the request traffic evenly across all
     *         instances regardless of the Availability Zones.
     */

    public AwsElbLoadBalancerCrossZoneLoadBalancing getCrossZoneLoadBalancing() {
        return this.crossZoneLoadBalancing;
    }

    /**
     * <p>
     * Cross-zone load balancing settings for the load balancer.
     * </p>
     * <p>
     * If cross-zone load balancing is enabled, the load balancer routes the request traffic evenly across all instances
     * regardless of the Availability Zones.
     * </p>
     * 
     * @param crossZoneLoadBalancing
     *        Cross-zone load balancing settings for the load balancer.</p>
     *        <p>
     *        If cross-zone load balancing is enabled, the load balancer routes the request traffic evenly across all
     *        instances regardless of the Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElbLoadBalancerAttributes withCrossZoneLoadBalancing(AwsElbLoadBalancerCrossZoneLoadBalancing crossZoneLoadBalancing) {
        setCrossZoneLoadBalancing(crossZoneLoadBalancing);
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
        if (getAccessLog() != null)
            sb.append("AccessLog: ").append(getAccessLog()).append(",");
        if (getConnectionDraining() != null)
            sb.append("ConnectionDraining: ").append(getConnectionDraining()).append(",");
        if (getConnectionSettings() != null)
            sb.append("ConnectionSettings: ").append(getConnectionSettings()).append(",");
        if (getCrossZoneLoadBalancing() != null)
            sb.append("CrossZoneLoadBalancing: ").append(getCrossZoneLoadBalancing());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElbLoadBalancerAttributes == false)
            return false;
        AwsElbLoadBalancerAttributes other = (AwsElbLoadBalancerAttributes) obj;
        if (other.getAccessLog() == null ^ this.getAccessLog() == null)
            return false;
        if (other.getAccessLog() != null && other.getAccessLog().equals(this.getAccessLog()) == false)
            return false;
        if (other.getConnectionDraining() == null ^ this.getConnectionDraining() == null)
            return false;
        if (other.getConnectionDraining() != null && other.getConnectionDraining().equals(this.getConnectionDraining()) == false)
            return false;
        if (other.getConnectionSettings() == null ^ this.getConnectionSettings() == null)
            return false;
        if (other.getConnectionSettings() != null && other.getConnectionSettings().equals(this.getConnectionSettings()) == false)
            return false;
        if (other.getCrossZoneLoadBalancing() == null ^ this.getCrossZoneLoadBalancing() == null)
            return false;
        if (other.getCrossZoneLoadBalancing() != null && other.getCrossZoneLoadBalancing().equals(this.getCrossZoneLoadBalancing()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessLog() == null) ? 0 : getAccessLog().hashCode());
        hashCode = prime * hashCode + ((getConnectionDraining() == null) ? 0 : getConnectionDraining().hashCode());
        hashCode = prime * hashCode + ((getConnectionSettings() == null) ? 0 : getConnectionSettings().hashCode());
        hashCode = prime * hashCode + ((getCrossZoneLoadBalancing() == null) ? 0 : getCrossZoneLoadBalancing().hashCode());
        return hashCode;
    }

    @Override
    public AwsElbLoadBalancerAttributes clone() {
        try {
            return (AwsElbLoadBalancerAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElbLoadBalancerAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
