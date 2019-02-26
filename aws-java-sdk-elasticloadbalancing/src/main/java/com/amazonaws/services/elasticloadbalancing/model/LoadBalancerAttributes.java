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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The attributes for a load balancer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/LoadBalancerAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoadBalancerAttributes implements Serializable, Cloneable {

    /**
     * <p>
     * If enabled, the load balancer routes the request traffic evenly across all instances regardless of the
     * Availability Zones.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html">Configure
     * Cross-Zone Load Balancing</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     */
    private CrossZoneLoadBalancing crossZoneLoadBalancing;
    /**
     * <p>
     * If enabled, the load balancer captures detailed information of all requests and delivers the information to the
     * Amazon S3 bucket that you specify.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html">Enable Access
     * Logs</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     */
    private AccessLog accessLog;
    /**
     * <p>
     * If enabled, the load balancer allows existing requests to complete before the load balancer shifts traffic away
     * from a deregistered or unhealthy instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html">Configure Connection
     * Draining</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     */
    private ConnectionDraining connectionDraining;
    /**
     * <p>
     * If enabled, the load balancer allows the connections to remain idle (no data is sent over the connection) for the
     * specified duration.
     * </p>
     * <p>
     * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both front-end and back-end
     * connections of your load balancer. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html">Configure Idle
     * Connection Timeout</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     */
    private ConnectionSettings connectionSettings;
    /**
     * <p>
     * This parameter is reserved.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AdditionalAttribute> additionalAttributes;

    /**
     * <p>
     * If enabled, the load balancer routes the request traffic evenly across all instances regardless of the
     * Availability Zones.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html">Configure
     * Cross-Zone Load Balancing</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param crossZoneLoadBalancing
     *        If enabled, the load balancer routes the request traffic evenly across all instances regardless of the
     *        Availability Zones.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html"
     *        >Configure Cross-Zone Load Balancing</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public void setCrossZoneLoadBalancing(CrossZoneLoadBalancing crossZoneLoadBalancing) {
        this.crossZoneLoadBalancing = crossZoneLoadBalancing;
    }

    /**
     * <p>
     * If enabled, the load balancer routes the request traffic evenly across all instances regardless of the
     * Availability Zones.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html">Configure
     * Cross-Zone Load Balancing</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @return If enabled, the load balancer routes the request traffic evenly across all instances regardless of the
     *         Availability Zones.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html"
     *         >Configure Cross-Zone Load Balancing</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public CrossZoneLoadBalancing getCrossZoneLoadBalancing() {
        return this.crossZoneLoadBalancing;
    }

    /**
     * <p>
     * If enabled, the load balancer routes the request traffic evenly across all instances regardless of the
     * Availability Zones.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html">Configure
     * Cross-Zone Load Balancing</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param crossZoneLoadBalancing
     *        If enabled, the load balancer routes the request traffic evenly across all instances regardless of the
     *        Availability Zones.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html"
     *        >Configure Cross-Zone Load Balancing</a> in the <i>Classic Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAttributes withCrossZoneLoadBalancing(CrossZoneLoadBalancing crossZoneLoadBalancing) {
        setCrossZoneLoadBalancing(crossZoneLoadBalancing);
        return this;
    }

    /**
     * <p>
     * If enabled, the load balancer captures detailed information of all requests and delivers the information to the
     * Amazon S3 bucket that you specify.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html">Enable Access
     * Logs</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param accessLog
     *        If enabled, the load balancer captures detailed information of all requests and delivers the information
     *        to the Amazon S3 bucket that you specify.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html">Enable
     *        Access Logs</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public void setAccessLog(AccessLog accessLog) {
        this.accessLog = accessLog;
    }

    /**
     * <p>
     * If enabled, the load balancer captures detailed information of all requests and delivers the information to the
     * Amazon S3 bucket that you specify.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html">Enable Access
     * Logs</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @return If enabled, the load balancer captures detailed information of all requests and delivers the information
     *         to the Amazon S3 bucket that you specify.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html">Enable
     *         Access Logs</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public AccessLog getAccessLog() {
        return this.accessLog;
    }

    /**
     * <p>
     * If enabled, the load balancer captures detailed information of all requests and delivers the information to the
     * Amazon S3 bucket that you specify.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html">Enable Access
     * Logs</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param accessLog
     *        If enabled, the load balancer captures detailed information of all requests and delivers the information
     *        to the Amazon S3 bucket that you specify.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-access-logs.html">Enable
     *        Access Logs</a> in the <i>Classic Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAttributes withAccessLog(AccessLog accessLog) {
        setAccessLog(accessLog);
        return this;
    }

    /**
     * <p>
     * If enabled, the load balancer allows existing requests to complete before the load balancer shifts traffic away
     * from a deregistered or unhealthy instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html">Configure Connection
     * Draining</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param connectionDraining
     *        If enabled, the load balancer allows existing requests to complete before the load balancer shifts traffic
     *        away from a deregistered or unhealthy instance.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html">Configure
     *        Connection Draining</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public void setConnectionDraining(ConnectionDraining connectionDraining) {
        this.connectionDraining = connectionDraining;
    }

    /**
     * <p>
     * If enabled, the load balancer allows existing requests to complete before the load balancer shifts traffic away
     * from a deregistered or unhealthy instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html">Configure Connection
     * Draining</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @return If enabled, the load balancer allows existing requests to complete before the load balancer shifts
     *         traffic away from a deregistered or unhealthy instance.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html">Configure
     *         Connection Draining</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public ConnectionDraining getConnectionDraining() {
        return this.connectionDraining;
    }

    /**
     * <p>
     * If enabled, the load balancer allows existing requests to complete before the load balancer shifts traffic away
     * from a deregistered or unhealthy instance.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html">Configure Connection
     * Draining</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param connectionDraining
     *        If enabled, the load balancer allows existing requests to complete before the load balancer shifts traffic
     *        away from a deregistered or unhealthy instance.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html">Configure
     *        Connection Draining</a> in the <i>Classic Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAttributes withConnectionDraining(ConnectionDraining connectionDraining) {
        setConnectionDraining(connectionDraining);
        return this;
    }

    /**
     * <p>
     * If enabled, the load balancer allows the connections to remain idle (no data is sent over the connection) for the
     * specified duration.
     * </p>
     * <p>
     * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both front-end and back-end
     * connections of your load balancer. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html">Configure Idle
     * Connection Timeout</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param connectionSettings
     *        If enabled, the load balancer allows the connections to remain idle (no data is sent over the connection)
     *        for the specified duration.</p>
     *        <p>
     *        By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both front-end and
     *        back-end connections of your load balancer. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html">Configure
     *        Idle Connection Timeout</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public void setConnectionSettings(ConnectionSettings connectionSettings) {
        this.connectionSettings = connectionSettings;
    }

    /**
     * <p>
     * If enabled, the load balancer allows the connections to remain idle (no data is sent over the connection) for the
     * specified duration.
     * </p>
     * <p>
     * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both front-end and back-end
     * connections of your load balancer. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html">Configure Idle
     * Connection Timeout</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @return If enabled, the load balancer allows the connections to remain idle (no data is sent over the connection)
     *         for the specified duration.</p>
     *         <p>
     *         By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both front-end and
     *         back-end connections of your load balancer. For more information, see <a
     *         href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html">Configure
     *         Idle Connection Timeout</a> in the <i>Classic Load Balancers Guide</i>.
     */

    public ConnectionSettings getConnectionSettings() {
        return this.connectionSettings;
    }

    /**
     * <p>
     * If enabled, the load balancer allows the connections to remain idle (no data is sent over the connection) for the
     * specified duration.
     * </p>
     * <p>
     * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both front-end and back-end
     * connections of your load balancer. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html">Configure Idle
     * Connection Timeout</a> in the <i>Classic Load Balancers Guide</i>.
     * </p>
     * 
     * @param connectionSettings
     *        If enabled, the load balancer allows the connections to remain idle (no data is sent over the connection)
     *        for the specified duration.</p>
     *        <p>
     *        By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both front-end and
     *        back-end connections of your load balancer. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html">Configure
     *        Idle Connection Timeout</a> in the <i>Classic Load Balancers Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAttributes withConnectionSettings(ConnectionSettings connectionSettings) {
        setConnectionSettings(connectionSettings);
        return this;
    }

    /**
     * <p>
     * This parameter is reserved.
     * </p>
     * 
     * @return This parameter is reserved.
     */

    public java.util.List<AdditionalAttribute> getAdditionalAttributes() {
        if (additionalAttributes == null) {
            additionalAttributes = new com.amazonaws.internal.SdkInternalList<AdditionalAttribute>();
        }
        return additionalAttributes;
    }

    /**
     * <p>
     * This parameter is reserved.
     * </p>
     * 
     * @param additionalAttributes
     *        This parameter is reserved.
     */

    public void setAdditionalAttributes(java.util.Collection<AdditionalAttribute> additionalAttributes) {
        if (additionalAttributes == null) {
            this.additionalAttributes = null;
            return;
        }

        this.additionalAttributes = new com.amazonaws.internal.SdkInternalList<AdditionalAttribute>(additionalAttributes);
    }

    /**
     * <p>
     * This parameter is reserved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdditionalAttributes(java.util.Collection)} or {@link #withAdditionalAttributes(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param additionalAttributes
     *        This parameter is reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAttributes withAdditionalAttributes(AdditionalAttribute... additionalAttributes) {
        if (this.additionalAttributes == null) {
            setAdditionalAttributes(new com.amazonaws.internal.SdkInternalList<AdditionalAttribute>(additionalAttributes.length));
        }
        for (AdditionalAttribute ele : additionalAttributes) {
            this.additionalAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * This parameter is reserved.
     * </p>
     * 
     * @param additionalAttributes
     *        This parameter is reserved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoadBalancerAttributes withAdditionalAttributes(java.util.Collection<AdditionalAttribute> additionalAttributes) {
        setAdditionalAttributes(additionalAttributes);
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
        if (getCrossZoneLoadBalancing() != null)
            sb.append("CrossZoneLoadBalancing: ").append(getCrossZoneLoadBalancing()).append(",");
        if (getAccessLog() != null)
            sb.append("AccessLog: ").append(getAccessLog()).append(",");
        if (getConnectionDraining() != null)
            sb.append("ConnectionDraining: ").append(getConnectionDraining()).append(",");
        if (getConnectionSettings() != null)
            sb.append("ConnectionSettings: ").append(getConnectionSettings()).append(",");
        if (getAdditionalAttributes() != null)
            sb.append("AdditionalAttributes: ").append(getAdditionalAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerAttributes == false)
            return false;
        LoadBalancerAttributes other = (LoadBalancerAttributes) obj;
        if (other.getCrossZoneLoadBalancing() == null ^ this.getCrossZoneLoadBalancing() == null)
            return false;
        if (other.getCrossZoneLoadBalancing() != null && other.getCrossZoneLoadBalancing().equals(this.getCrossZoneLoadBalancing()) == false)
            return false;
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
        if (other.getAdditionalAttributes() == null ^ this.getAdditionalAttributes() == null)
            return false;
        if (other.getAdditionalAttributes() != null && other.getAdditionalAttributes().equals(this.getAdditionalAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCrossZoneLoadBalancing() == null) ? 0 : getCrossZoneLoadBalancing().hashCode());
        hashCode = prime * hashCode + ((getAccessLog() == null) ? 0 : getAccessLog().hashCode());
        hashCode = prime * hashCode + ((getConnectionDraining() == null) ? 0 : getConnectionDraining().hashCode());
        hashCode = prime * hashCode + ((getConnectionSettings() == null) ? 0 : getConnectionSettings().hashCode());
        hashCode = prime * hashCode + ((getAdditionalAttributes() == null) ? 0 : getAdditionalAttributes().hashCode());
        return hashCode;
    }

    @Override
    public LoadBalancerAttributes clone() {
        try {
            return (LoadBalancerAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
