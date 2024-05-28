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
package com.amazonaws.services.vpclattice.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a target.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/vpc-lattice-2022-11-30/TargetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TargetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the target
     * group type is <code>IP</code>, this is an IP address. If the target group type is <code>LAMBDA</code>, this is
     * the ARN of a Lambda function. If the target type is <code>ALB</code>, this is the ARN of an Application Load
     * Balancer.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The port on which the target is listening.
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The code for why the target status is what it is.
     * </p>
     */
    private String reasonCode;
    /**
     * <p>
     * The status of the target.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRAINING</code>: The target is being deregistered. No new connections are sent to this target while current
     * connections are being drained. The default draining time is 5 minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code>: Health checks are unavailable for the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code>: The target is healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code>: The target is unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INITIAL</code>: Initial health checks on the target are being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNUSED</code>: Target group is not used in a service.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the target
     * group type is <code>IP</code>, this is an IP address. If the target group type is <code>LAMBDA</code>, this is
     * the ARN of a Lambda function. If the target type is <code>ALB</code>, this is the ARN of an Application Load
     * Balancer.
     * </p>
     * 
     * @param id
     *        The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the
     *        target group type is <code>IP</code>, this is an IP address. If the target group type is
     *        <code>LAMBDA</code>, this is the ARN of a Lambda function. If the target type is <code>ALB</code>, this is
     *        the ARN of an Application Load Balancer.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the target
     * group type is <code>IP</code>, this is an IP address. If the target group type is <code>LAMBDA</code>, this is
     * the ARN of a Lambda function. If the target type is <code>ALB</code>, this is the ARN of an Application Load
     * Balancer.
     * </p>
     * 
     * @return The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the
     *         target group type is <code>IP</code>, this is an IP address. If the target group type is
     *         <code>LAMBDA</code>, this is the ARN of a Lambda function. If the target type is <code>ALB</code>, this
     *         is the ARN of an Application Load Balancer.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the target
     * group type is <code>IP</code>, this is an IP address. If the target group type is <code>LAMBDA</code>, this is
     * the ARN of a Lambda function. If the target type is <code>ALB</code>, this is the ARN of an Application Load
     * Balancer.
     * </p>
     * 
     * @param id
     *        The ID of the target. If the target group type is <code>INSTANCE</code>, this is an instance ID. If the
     *        target group type is <code>IP</code>, this is an IP address. If the target group type is
     *        <code>LAMBDA</code>, this is the ARN of a Lambda function. If the target type is <code>ALB</code>, this is
     *        the ARN of an Application Load Balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetSummary withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The port on which the target is listening.
     * </p>
     * 
     * @param port
     *        The port on which the target is listening.
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port on which the target is listening.
     * </p>
     * 
     * @return The port on which the target is listening.
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port on which the target is listening.
     * </p>
     * 
     * @param port
     *        The port on which the target is listening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetSummary withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The code for why the target status is what it is.
     * </p>
     * 
     * @param reasonCode
     *        The code for why the target status is what it is.
     */

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * <p>
     * The code for why the target status is what it is.
     * </p>
     * 
     * @return The code for why the target status is what it is.
     */

    public String getReasonCode() {
        return this.reasonCode;
    }

    /**
     * <p>
     * The code for why the target status is what it is.
     * </p>
     * 
     * @param reasonCode
     *        The code for why the target status is what it is.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TargetSummary withReasonCode(String reasonCode) {
        setReasonCode(reasonCode);
        return this;
    }

    /**
     * <p>
     * The status of the target.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRAINING</code>: The target is being deregistered. No new connections are sent to this target while current
     * connections are being drained. The default draining time is 5 minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code>: Health checks are unavailable for the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code>: The target is healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code>: The target is unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INITIAL</code>: Initial health checks on the target are being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNUSED</code>: Target group is not used in a service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the target.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRAINING</code>: The target is being deregistered. No new connections are sent to this target while
     *        current connections are being drained. The default draining time is 5 minutes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNAVAILABLE</code>: Health checks are unavailable for the target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code>: The target is healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code>: The target is unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INITIAL</code>: Initial health checks on the target are being performed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNUSED</code>: Target group is not used in a service.
     *        </p>
     *        </li>
     * @see TargetStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the target.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRAINING</code>: The target is being deregistered. No new connections are sent to this target while current
     * connections are being drained. The default draining time is 5 minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code>: Health checks are unavailable for the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code>: The target is healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code>: The target is unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INITIAL</code>: Initial health checks on the target are being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNUSED</code>: Target group is not used in a service.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the target.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>DRAINING</code>: The target is being deregistered. No new connections are sent to this target while
     *         current connections are being drained. The default draining time is 5 minutes.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNAVAILABLE</code>: Health checks are unavailable for the target group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>HEALTHY</code>: The target is healthy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNHEALTHY</code>: The target is unhealthy.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INITIAL</code>: Initial health checks on the target are being performed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UNUSED</code>: Target group is not used in a service.
     *         </p>
     *         </li>
     * @see TargetStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the target.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRAINING</code>: The target is being deregistered. No new connections are sent to this target while current
     * connections are being drained. The default draining time is 5 minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code>: Health checks are unavailable for the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code>: The target is healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code>: The target is unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INITIAL</code>: Initial health checks on the target are being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNUSED</code>: Target group is not used in a service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the target.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRAINING</code>: The target is being deregistered. No new connections are sent to this target while
     *        current connections are being drained. The default draining time is 5 minutes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNAVAILABLE</code>: Health checks are unavailable for the target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code>: The target is healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code>: The target is unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INITIAL</code>: Initial health checks on the target are being performed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNUSED</code>: Target group is not used in a service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetStatus
     */

    public TargetSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the target.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>DRAINING</code>: The target is being deregistered. No new connections are sent to this target while current
     * connections are being drained. The default draining time is 5 minutes.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNAVAILABLE</code>: Health checks are unavailable for the target group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>HEALTHY</code>: The target is healthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNHEALTHY</code>: The target is unhealthy.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INITIAL</code>: Initial health checks on the target are being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UNUSED</code>: Target group is not used in a service.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the target.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>DRAINING</code>: The target is being deregistered. No new connections are sent to this target while
     *        current connections are being drained. The default draining time is 5 minutes.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNAVAILABLE</code>: Health checks are unavailable for the target group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>HEALTHY</code>: The target is healthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNHEALTHY</code>: The target is unhealthy.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INITIAL</code>: Initial health checks on the target are being performed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UNUSED</code>: Target group is not used in a service.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetStatus
     */

    public TargetSummary withStatus(TargetStatus status) {
        this.status = status.toString();
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getReasonCode() != null)
            sb.append("ReasonCode: ").append(getReasonCode()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TargetSummary == false)
            return false;
        TargetSummary other = (TargetSummary) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getReasonCode() == null ^ this.getReasonCode() == null)
            return false;
        if (other.getReasonCode() != null && other.getReasonCode().equals(this.getReasonCode()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getReasonCode() == null) ? 0 : getReasonCode().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public TargetSummary clone() {
        try {
            return (TargetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.vpclattice.model.transform.TargetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
