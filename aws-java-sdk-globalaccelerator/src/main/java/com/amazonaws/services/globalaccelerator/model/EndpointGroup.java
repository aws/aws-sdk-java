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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A complex type for the endpoint group. An AWS Region can have only one endpoint group for a specific listener.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/globalaccelerator-2018-08-08/EndpointGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointGroup implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint group.
     * </p>
     */
    private String endpointGroupArn;
    /**
     * <p>
     * The AWS Region that this endpoint group belongs.
     * </p>
     */
    private String endpointGroupRegion;
    /**
     * <p>
     * The list of endpoint objects.
     * </p>
     */
    private java.util.List<EndpointDescription> endpointDescriptions;
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
     * The port that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group.
     * </p>
     * <p>
     * The default port is the port for the listener that this endpoint group is associated with. If the listener port
     * is a list, Global Accelerator uses the first specified port in the list of ports.
     * </p>
     */
    private Integer healthCheckPort;
    /**
     * <p>
     * The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint
     * group. The default value is TCP.
     * </p>
     */
    private String healthCheckProtocol;
    /**
     * <p>
     * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses for the
     * destination on the endpoints for health checks. The default is slash (/).
     * </p>
     */
    private String healthCheckPath;
    /**
     * <p>
     * The time—10 seconds or 30 seconds—between health checks for each endpoint. The default value is 30.
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

    public EndpointGroup withEndpointGroupArn(String endpointGroupArn) {
        setEndpointGroupArn(endpointGroupArn);
        return this;
    }

    /**
     * <p>
     * The AWS Region that this endpoint group belongs.
     * </p>
     * 
     * @param endpointGroupRegion
     *        The AWS Region that this endpoint group belongs.
     */

    public void setEndpointGroupRegion(String endpointGroupRegion) {
        this.endpointGroupRegion = endpointGroupRegion;
    }

    /**
     * <p>
     * The AWS Region that this endpoint group belongs.
     * </p>
     * 
     * @return The AWS Region that this endpoint group belongs.
     */

    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    /**
     * <p>
     * The AWS Region that this endpoint group belongs.
     * </p>
     * 
     * @param endpointGroupRegion
     *        The AWS Region that this endpoint group belongs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointGroup withEndpointGroupRegion(String endpointGroupRegion) {
        setEndpointGroupRegion(endpointGroupRegion);
        return this;
    }

    /**
     * <p>
     * The list of endpoint objects.
     * </p>
     * 
     * @return The list of endpoint objects.
     */

    public java.util.List<EndpointDescription> getEndpointDescriptions() {
        return endpointDescriptions;
    }

    /**
     * <p>
     * The list of endpoint objects.
     * </p>
     * 
     * @param endpointDescriptions
     *        The list of endpoint objects.
     */

    public void setEndpointDescriptions(java.util.Collection<EndpointDescription> endpointDescriptions) {
        if (endpointDescriptions == null) {
            this.endpointDescriptions = null;
            return;
        }

        this.endpointDescriptions = new java.util.ArrayList<EndpointDescription>(endpointDescriptions);
    }

    /**
     * <p>
     * The list of endpoint objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpointDescriptions(java.util.Collection)} or {@link #withEndpointDescriptions(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param endpointDescriptions
     *        The list of endpoint objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointGroup withEndpointDescriptions(EndpointDescription... endpointDescriptions) {
        if (this.endpointDescriptions == null) {
            setEndpointDescriptions(new java.util.ArrayList<EndpointDescription>(endpointDescriptions.length));
        }
        for (EndpointDescription ele : endpointDescriptions) {
            this.endpointDescriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of endpoint objects.
     * </p>
     * 
     * @param endpointDescriptions
     *        The list of endpoint objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointGroup withEndpointDescriptions(java.util.Collection<EndpointDescription> endpointDescriptions) {
        setEndpointDescriptions(endpointDescriptions);
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

    public EndpointGroup withTrafficDialPercentage(Float trafficDialPercentage) {
        setTrafficDialPercentage(trafficDialPercentage);
        return this;
    }

    /**
     * <p>
     * The port that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group.
     * </p>
     * <p>
     * The default port is the port for the listener that this endpoint group is associated with. If the listener port
     * is a list, Global Accelerator uses the first specified port in the list of ports.
     * </p>
     * 
     * @param healthCheckPort
     *        The port that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint
     *        group. </p>
     *        <p>
     *        The default port is the port for the listener that this endpoint group is associated with. If the listener
     *        port is a list, Global Accelerator uses the first specified port in the list of ports.
     */

    public void setHealthCheckPort(Integer healthCheckPort) {
        this.healthCheckPort = healthCheckPort;
    }

    /**
     * <p>
     * The port that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group.
     * </p>
     * <p>
     * The default port is the port for the listener that this endpoint group is associated with. If the listener port
     * is a list, Global Accelerator uses the first specified port in the list of ports.
     * </p>
     * 
     * @return The port that Global Accelerator uses to perform health checks on endpoints that are part of this
     *         endpoint group. </p>
     *         <p>
     *         The default port is the port for the listener that this endpoint group is associated with. If the
     *         listener port is a list, Global Accelerator uses the first specified port in the list of ports.
     */

    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    /**
     * <p>
     * The port that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint group.
     * </p>
     * <p>
     * The default port is the port for the listener that this endpoint group is associated with. If the listener port
     * is a list, Global Accelerator uses the first specified port in the list of ports.
     * </p>
     * 
     * @param healthCheckPort
     *        The port that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint
     *        group. </p>
     *        <p>
     *        The default port is the port for the listener that this endpoint group is associated with. If the listener
     *        port is a list, Global Accelerator uses the first specified port in the list of ports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointGroup withHealthCheckPort(Integer healthCheckPort) {
        setHealthCheckPort(healthCheckPort);
        return this;
    }

    /**
     * <p>
     * The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint
     * group. The default value is TCP.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this
     *        endpoint group. The default value is TCP.
     * @see HealthCheckProtocol
     */

    public void setHealthCheckProtocol(String healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol;
    }

    /**
     * <p>
     * The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint
     * group. The default value is TCP.
     * </p>
     * 
     * @return The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this
     *         endpoint group. The default value is TCP.
     * @see HealthCheckProtocol
     */

    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    /**
     * <p>
     * The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint
     * group. The default value is TCP.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this
     *        endpoint group. The default value is TCP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckProtocol
     */

    public EndpointGroup withHealthCheckProtocol(String healthCheckProtocol) {
        setHealthCheckProtocol(healthCheckProtocol);
        return this;
    }

    /**
     * <p>
     * The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this endpoint
     * group. The default value is TCP.
     * </p>
     * 
     * @param healthCheckProtocol
     *        The protocol that Global Accelerator uses to perform health checks on endpoints that are part of this
     *        endpoint group. The default value is TCP.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthCheckProtocol
     */

    public EndpointGroup withHealthCheckProtocol(HealthCheckProtocol healthCheckProtocol) {
        this.healthCheckProtocol = healthCheckProtocol.toString();
        return this;
    }

    /**
     * <p>
     * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses for the
     * destination on the endpoints for health checks. The default is slash (/).
     * </p>
     * 
     * @param healthCheckPath
     *        If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses for the
     *        destination on the endpoints for health checks. The default is slash (/).
     */

    public void setHealthCheckPath(String healthCheckPath) {
        this.healthCheckPath = healthCheckPath;
    }

    /**
     * <p>
     * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses for the
     * destination on the endpoints for health checks. The default is slash (/).
     * </p>
     * 
     * @return If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses for the
     *         destination on the endpoints for health checks. The default is slash (/).
     */

    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    /**
     * <p>
     * If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses for the
     * destination on the endpoints for health checks. The default is slash (/).
     * </p>
     * 
     * @param healthCheckPath
     *        If the protocol is HTTP/S, then this value provides the ping path that Global Accelerator uses for the
     *        destination on the endpoints for health checks. The default is slash (/).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointGroup withHealthCheckPath(String healthCheckPath) {
        setHealthCheckPath(healthCheckPath);
        return this;
    }

    /**
     * <p>
     * The time—10 seconds or 30 seconds—between health checks for each endpoint. The default value is 30.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The time—10 seconds or 30 seconds—between health checks for each endpoint. The default value is 30.
     */

    public void setHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
        this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The time—10 seconds or 30 seconds—between health checks for each endpoint. The default value is 30.
     * </p>
     * 
     * @return The time—10 seconds or 30 seconds—between health checks for each endpoint. The default value is 30.
     */

    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    /**
     * <p>
     * The time—10 seconds or 30 seconds—between health checks for each endpoint. The default value is 30.
     * </p>
     * 
     * @param healthCheckIntervalSeconds
     *        The time—10 seconds or 30 seconds—between health checks for each endpoint. The default value is 30.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointGroup withHealthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
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

    public EndpointGroup withThresholdCount(Integer thresholdCount) {
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
        if (getEndpointGroupRegion() != null)
            sb.append("EndpointGroupRegion: ").append(getEndpointGroupRegion()).append(",");
        if (getEndpointDescriptions() != null)
            sb.append("EndpointDescriptions: ").append(getEndpointDescriptions()).append(",");
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

        if (obj instanceof EndpointGroup == false)
            return false;
        EndpointGroup other = (EndpointGroup) obj;
        if (other.getEndpointGroupArn() == null ^ this.getEndpointGroupArn() == null)
            return false;
        if (other.getEndpointGroupArn() != null && other.getEndpointGroupArn().equals(this.getEndpointGroupArn()) == false)
            return false;
        if (other.getEndpointGroupRegion() == null ^ this.getEndpointGroupRegion() == null)
            return false;
        if (other.getEndpointGroupRegion() != null && other.getEndpointGroupRegion().equals(this.getEndpointGroupRegion()) == false)
            return false;
        if (other.getEndpointDescriptions() == null ^ this.getEndpointDescriptions() == null)
            return false;
        if (other.getEndpointDescriptions() != null && other.getEndpointDescriptions().equals(this.getEndpointDescriptions()) == false)
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
        hashCode = prime * hashCode + ((getEndpointGroupRegion() == null) ? 0 : getEndpointGroupRegion().hashCode());
        hashCode = prime * hashCode + ((getEndpointDescriptions() == null) ? 0 : getEndpointDescriptions().hashCode());
        hashCode = prime * hashCode + ((getTrafficDialPercentage() == null) ? 0 : getTrafficDialPercentage().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckPort() == null) ? 0 : getHealthCheckPort().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckProtocol() == null) ? 0 : getHealthCheckProtocol().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckPath() == null) ? 0 : getHealthCheckPath().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckIntervalSeconds() == null) ? 0 : getHealthCheckIntervalSeconds().hashCode());
        hashCode = prime * hashCode + ((getThresholdCount() == null) ? 0 : getThresholdCount().hashCode());
        return hashCode;
    }

    @Override
    public EndpointGroup clone() {
        try {
            return (EndpointGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.globalaccelerator.model.transform.EndpointGroupMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
