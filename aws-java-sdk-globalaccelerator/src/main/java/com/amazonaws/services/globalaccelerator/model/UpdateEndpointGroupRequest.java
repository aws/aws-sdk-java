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
package com.amazonaws.services.globalaccelerator.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/UpdateEndpointGroup"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEndpointGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     */
    private String endpointGroupArn;
    /**
     * <p>
     * The list of endpoint objects.
     * </p>
     */
    private java.util.List<EndpointConfiguration> endpointConfigurations;
    /**
     * <p>
     * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups
     * for this listener.
     * </p>
     * <p>
     * Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is
     * applied to the traffic that would otherwise have been routed to the Region based on optimal routing.
     * </p>
     * <p>
     * The default value is 100.
     * </p>
     */
    private Float trafficDialPercentage;
    /**
     * <p>
     * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group.
     * The default port is the listener port that this endpoint group is associated with. If the listener port is a list
     * of ports, Global Accelerator uses the first port in the list.
     * </p>
     */
    private Integer healthCheckPort;
    /**
     * <p>
     * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint
     * group. The default value is TCP.
     * </p>
     */
    private String healthCheckProtocol;
    /**
     * <p>
     * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The
     * default value is slash (/).
     * </p>
     */
    private String healthCheckPath;
    /**
     * <p>
     * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     * </p>
     */
    private Integer healthCheckIntervalSeconds;
    /**
     * <p>
     * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set
     * an unhealthy endpoint to healthy. The default value is 3.
     * </p>
     */
    private Integer thresholdCount;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group.
     */

    public void setEndpointGroupArn(String endpointGroupArn) {
        this.endpointGroupArn = endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint group.
     */

    public String getEndpointGroupArn() {
        return this.endpointGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     * 
     * @param endpointGroupArn
     *        The Amazon Resource Name (ARN) of the endpoint group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointGroupRequest withEndpointGroupArn(String endpointGroupArn) {
        setEndpointGroupArn(endpointGroupArn);
        return this;
    }

    /**
     * <p>
     * The list of endpoint objects.
     * </p>
     * 
     * @return The list of endpoint objects.
     */

    public java.util.List<EndpointConfiguration> getEndpointConfigurations() {
        return endpointConfigurations;
    }

    /**
     * <p>
     * The list of endpoint objects.
     * </p>
     * 
     * @param endpointConfigurations
     *        The list of endpoint objects.
     */

    public void setEndpointConfigurations(java.util.Collection<EndpointConfiguration> endpointConfigurations) {
        if (endpointConfigurations == null) {
            this.endpointConfigurations = null;
            return;
        }

        this.endpointConfigurations = new java.util.ArrayList<EndpointConfiguration>(endpointConfigurations);
    }

    /**
     * <p>
     * The list of endpoint objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointConfigurations(java.util.Collection)} or
     * {@link #withEndpointConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param endpointConfigurations
     *        The list of endpoint objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointGroupRequest withEndpointConfigurations(EndpointConfiguration... endpointConfigurations) {
        if (this.endpointConfigurations == null) {
            setEndpointConfigurations(new java.util.ArrayList<EndpointConfiguration>(endpointConfigurations.length));
        }
        for (EndpointConfiguration ele : endpointConfigurations) {
            this.endpointConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of endpoint objects.
     * </p>
     * 
     * @param endpointConfigurations
     *        The list of endpoint objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointGroupRequest withEndpointConfigurations(java.util.Collection<EndpointConfiguration> endpointConfigurations) {
        setEndpointConfigurations(endpointConfigurations);
        return this;
    }

    /**
     * <p>
     * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups
     * for this listener.
     * </p>
     * <p>
     * Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is
     * applied to the traffic that would otherwise have been routed to the Region based on optimal routing.
     * </p>
     * <p>
     * The default value is 100.
     * </p>
     * 
     * @param trafficDialPercentage
     *        The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint
     *        groups for this listener. </p>
     *        <p>
     *        Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage
     *        is applied to the traffic that would otherwise have been routed to the Region based on optimal routing.
     *        </p>
     *        <p>
     *        The default value is 100.
     */

    public void setTrafficDialPercentage(Float trafficDialPercentage) {
        this.trafficDialPercentage = trafficDialPercentage;
    }

    /**
     * <p>
     * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups
     * for this listener.
     * </p>
     * <p>
     * Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is
     * applied to the traffic that would otherwise have been routed to the Region based on optimal routing.
     * </p>
     * <p>
     * The default value is 100.
     * </p>
     * 
     * @return The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint
     *         groups for this listener. </p>
     *         <p>
     *         Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The
     *         percentage is applied to the traffic that would otherwise have been routed to the Region based on optimal
     *         routing.
     *         </p>
     *         <p>
     *         The default value is 100.
     */

    public Float getTrafficDialPercentage() {
        return this.trafficDialPercentage;
    }

    /**
     * <p>
     * The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint groups
     * for this listener.
     * </p>
     * <p>
     * Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage is
     * applied to the traffic that would otherwise have been routed to the Region based on optimal routing.
     * </p>
     * <p>
     * The default value is 100.
     * </p>
     * 
     * @param trafficDialPercentage
     *        The percentage of traffic to send to an AWS Region. Additional traffic is distributed to other endpoint
     *        groups for this listener. </p>
     *        <p>
     *        Use this action to increase (dial up) or decrease (dial down) traffic to a specific Region. The percentage
     *        is applied to the traffic that would otherwise have been routed to the Region based on optimal routing.
     *        </p>
     *        <p>
     *        The default value is 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointGroupRequest withTrafficDialPercentage(Float trafficDialPercentage) {
        setTrafficDialPercentage(trafficDialPercentage);
        return this;
    }

    /**
     * <p>
     * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group.
     * The default port is the listener port that this endpoint group is associated with. If the listener port is a list
     * of ports, Global Accelerator uses the first port in the list.
     * </p>
     * 
     * @param healthCheckPort
     *        The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint
     *        group. The default port is the listener port that this endpoint group is associated with. If the listener
     *        port is a list of ports, Global Accelerator uses the first port in the list.
     */

    public void setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
    }

    /**
     * <p>
     * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group.
     * The default port is the listener port that this endpoint group is associated with. If the listener port is a list
     * of ports, Global Accelerator uses the first port in the list.
     * </p>
     * 
     * @return The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint
     *         group. The default port is the listener port that this endpoint group is associated with. If the listener
     *         port is a list of ports, Global Accelerator uses the first port in the list.
     */

    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    /**
     * <p>
     * The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint group.
     * The default port is the listener port that this endpoint group is associated with. If the listener port is a list
     * of ports, Global Accelerator uses the first port in the list.
     * </p>
     * 
     * @param healthCheckPort
     *        The port that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint
     *        group. The default port is the listener port that this endpoint group is associated with. If the listener
     *        port is a list of ports, Global Accelerator uses the first port in the list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointGroupRequest withHealthCheckPort(Integer healthCheckPort) {
        setHealthCheckPort(healthCheckPort);
        return this;
    }

    /**
     * <p>
     * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint
     * group. The default value is TCP.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this
     *        endpoint group. The default value is TCP.
     * @see HealthCheckProtocol
     */

    public void setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
    }

    /**
     * <p>
     * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint
     * group. The default value is TCP.
     * </p>
     * 
     * @return The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this
     *         endpoint group. The default value is TCP.
     * @see HealthCheckProtocol
     */

    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    /**
     * <p>
     * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint
     * group. The default value is TCP.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this
     *        endpoint group. The default value is TCP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckProtocol
     */

    public UpdateEndpointGroupRequest withHealthCheckProtocol(String healthCheckProtocol) {
        setHealthCheckProtocol(healthCheckProtocol);
        return this;
    }

    /**
     * <p>
     * The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this endpoint
     * group. The default value is TCP.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol that AWS Global Accelerator uses to check the health of endpoints that are part of this
     *        endpoint group. The default value is TCP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckProtocol
     */

    public UpdateEndpointGroupRequest withHealthCheckProtocol(HealthCheckProtocol healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol.toString();
        return this;
    }

    /**
     * <p>
     * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The
     * default value is slash (/).
     * </p>
     * 
     * @param healthCheckPath
     *        If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets.
     *        The default value is slash (/).
     */

    public void setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
    }

    /**
     * <p>
     * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The
     * default value is slash (/).
     * </p>
     * 
     * @return If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets.
     *         The default value is slash (/).
     */

    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    /**
     * <p>
     * If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets. The
     * default value is slash (/).
     * </p>
     * 
     * @param healthCheckPath
     *        If the protocol is HTTP/S, then this specifies the path that is the destination for health check targets.
     *        The default value is slash (/).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointGroupRequest withHealthCheckPath(String healthCheckPath) {
        setHealthCheckPath(healthCheckPath);
        return this;
    }

    /**
     * <p>
     * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     */

    public void setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     * </p>
     * 
     * @return The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     */

    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The time—10 seconds or 30 seconds—between each health check for an endpoint. The default value is 30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointGroupRequest withHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        setHealthCheckIntervalSeconds(healthCheckIntervalSeconds);
        return this;
    }

    /**
     * <p>
     * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set
     * an unhealthy endpoint to healthy. The default value is 3.
     * </p>
     * 
     * @param thresholdCount
     *        The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or
     *        to set an unhealthy endpoint to healthy. The default value is 3.
     */

    public void setThresholdCount(Integer thresholdCount) {
        this.thresholdCount = thresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set
     * an unhealthy endpoint to healthy. The default value is 3.
     * </p>
     * 
     * @return The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or
     *         to set an unhealthy endpoint to healthy. The default value is 3.
     */

    public Integer getThresholdCount() {
        return this.thresholdCount;
    }

    /**
     * <p>
     * The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or to set
     * an unhealthy endpoint to healthy. The default value is 3.
     * </p>
     * 
     * @param thresholdCount
     *        The number of consecutive health checks required to set the state of a healthy endpoint to unhealthy, or
     *        to set an unhealthy endpoint to healthy. The default value is 3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointGroupRequest withThresholdCount(Integer thresholdCount) {
        setThresholdCount(thresholdCount);
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
        if (getEndpointGroupArn() != null)
            sb.append("EndpointGroupArn: ").append(getEndpointGroupArn()).append(",");
        if (getEndpointConfigurations() != null)
            sb.append("EndpointConfigurations: ").append(getEndpointConfigurations()).append(",");
        if (getTrafficDialPercentage() != null)
            sb.append("TrafficDialPercentage: ").append(getTrafficDialPercentage()).append(",");
        if (getHealthCheckPort() != null)
            sb.append("HealthCheckPort: ").append(getHealthCheckPort()).append(",");
        if (getHealthCheckProtocol() != null)
            sb.append("HealthCheckProtocol: ").append(getHealthCheckProtocol()).append(",");
        if (getHealthCheckPath() != null)
            sb.append("HealthCheckPath: ").append(getHealthCheckPath()).append(",");
        if (getHealthCheckIntervalSeconds() != null)
            sb.append("HealthCheckIntervalSeconds: ").append(getHealthCheckIntervalSeconds()).append(",");
        if (getThresholdCount() != null)
            sb.append("ThresholdCount: ").append(getThresholdCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointGroupRequest == false)
            return false;
        UpdateEndpointGroupRequest other = (UpdateEndpointGroupRequest) obj;
        if (other.getEndpointGroupArn() == null ^ this.getEndpointGroupArn() == null)
            return false;
        if (other.getEndpointGroupArn() != null && other.getEndpointGroupArn().equals(this.getEndpointGroupArn()) == false)
            return false;
        if (other.getEndpointConfigurations() == null ^ this.getEndpointConfigurations() == null)
            return false;
        if (other.getEndpointConfigurations() != null && other.getEndpointConfigurations().equals(this.getEndpointConfigurations()) == false)
            return false;
        if (other.getTrafficDialPercentage() == null ^ this.getTrafficDialPercentage() == null)
            return false;
        if (other.getTrafficDialPercentage() != null && other.getTrafficDialPercentage().equals(this.getTrafficDialPercentage()) == false)
            return false;
        if (other.getHealthCheckPort() == null ^ this.getHealthCheckPort() == null)
            return false;
        if (other.getHealthCheckPort() != null && other.getHealthCheckPort().equals(this.getHealthCheckPort()) == false)
            return false;
        if (other.getHealthCheckProtocol() == null ^ this.getHealthCheckProtocol() == null)
            return false;
        if (other.getHealthCheckProtocol() != null && other.getHealthCheckProtocol().equals(this.getHealthCheckProtocol()) == false)
            return false;
        if (other.getHealthCheckPath() == null ^ this.getHealthCheckPath() == null)
            return false;
        if (other.getHealthCheckPath() != null && other.getHealthCheckPath().equals(this.getHealthCheckPath()) == false)
            return false;
        if (other.getHealthCheckIntervalSeconds() == null ^ this.getHealthCheckIntervalSeconds() == null)
            return false;
        if (other.getHealthCheckIntervalSeconds() != null && other.getHealthCheckIntervalSeconds().equals(this.getHealthCheckIntervalSeconds()) == false)
            return false;
        if (other.getThresholdCount() == null ^ this.getThresholdCount() == null)
            return false;
        if (other.getThresholdCount() != null && other.getThresholdCount().equals(this.getThresholdCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndpointGroupArn() == null) ? 0 : getEndpointGroupArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointConfigurations() == null) ? 0 : getEndpointConfigurations().hashCode());
        hashCode = prime * hashCode + ((getTrafficDialPercentage() == null) ? 0 : getTrafficDialPercentage().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckPort() == null) ? 0 : getHealthCheckPort().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckProtocol() == null) ? 0 : getHealthCheckProtocol().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckPath() == null) ? 0 : getHealthCheckPath().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckIntervalSeconds() == null) ? 0 : getHealthCheckIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getThresholdCount() == null) ? 0 : getThresholdCount().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEndpointGroupRequest clone() {
        return (UpdateEndpointGroupRequest) super.clone();
    }

}
