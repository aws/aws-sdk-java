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
package com.amazonaws.services.finspace.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that stores metadata for a kdb node.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/KxNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KxNode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the node.
     * </p>
     */
    private String nodeId;
    /**
     * <p>
     * The identifier of the availability zones where subnets for the environment are created.
     * </p>
     */
    private String availabilityZoneId;
    /**
     * <p>
     * The time when a particular node is started. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     */
    private java.util.Date launchTime;
    /**
     * <p>
     * Specifies the status of the cluster nodes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> – The node is actively serving.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code> – The node is being prepared.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * A unique identifier for the node.
     * </p>
     * 
     * @param nodeId
     *        A unique identifier for the node.
     */

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * <p>
     * A unique identifier for the node.
     * </p>
     * 
     * @return A unique identifier for the node.
     */

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * <p>
     * A unique identifier for the node.
     * </p>
     * 
     * @param nodeId
     *        A unique identifier for the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxNode withNodeId(String nodeId) {
        setNodeId(nodeId);
        return this;
    }

    /**
     * <p>
     * The identifier of the availability zones where subnets for the environment are created.
     * </p>
     * 
     * @param availabilityZoneId
     *        The identifier of the availability zones where subnets for the environment are created.
     */

    public void setAvailabilityZoneId(String availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the availability zones where subnets for the environment are created.
     * </p>
     * 
     * @return The identifier of the availability zones where subnets for the environment are created.
     */

    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }

    /**
     * <p>
     * The identifier of the availability zones where subnets for the environment are created.
     * </p>
     * 
     * @param availabilityZoneId
     *        The identifier of the availability zones where subnets for the environment are created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxNode withAvailabilityZoneId(String availabilityZoneId) {
        setAvailabilityZoneId(availabilityZoneId);
        return this;
    }

    /**
     * <p>
     * The time when a particular node is started. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param launchTime
     *        The time when a particular node is started. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public void setLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * <p>
     * The time when a particular node is started. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @return The time when a particular node is started. The value is determined as epoch time in milliseconds. For
     *         example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     */

    public java.util.Date getLaunchTime() {
        return this.launchTime;
    }

    /**
     * <p>
     * The time when a particular node is started. The value is determined as epoch time in milliseconds. For example,
     * the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * </p>
     * 
     * @param launchTime
     *        The time when a particular node is started. The value is determined as epoch time in milliseconds. For
     *        example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KxNode withLaunchTime(java.util.Date launchTime) {
        setLaunchTime(launchTime);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the cluster nodes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> – The node is actively serving.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code> – The node is being prepared.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Specifies the status of the cluster nodes. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> – The node is actively serving.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code> – The node is being prepared.
     *        </p>
     *        </li>
     * @see KxNodeStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of the cluster nodes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> – The node is actively serving.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code> – The node is being prepared.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Specifies the status of the cluster nodes. </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>RUNNING</code> – The node is actively serving.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PROVISIONING</code> – The node is being prepared.
     *         </p>
     *         </li>
     * @see KxNodeStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Specifies the status of the cluster nodes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> – The node is actively serving.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code> – The node is being prepared.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Specifies the status of the cluster nodes. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> – The node is actively serving.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code> – The node is being prepared.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxNodeStatus
     */

    public KxNode withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the cluster nodes.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>RUNNING</code> – The node is actively serving.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PROVISIONING</code> – The node is being prepared.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Specifies the status of the cluster nodes. </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> – The node is actively serving.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code> – The node is being prepared.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KxNodeStatus
     */

    public KxNode withStatus(KxNodeStatus status) {
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
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId()).append(",");
        if (getAvailabilityZoneId() != null)
            sb.append("AvailabilityZoneId: ").append(getAvailabilityZoneId()).append(",");
        if (getLaunchTime() != null)
            sb.append("LaunchTime: ").append(getLaunchTime()).append(",");
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

        if (obj instanceof KxNode == false)
            return false;
        KxNode other = (KxNode) obj;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        if (other.getAvailabilityZoneId() == null ^ this.getAvailabilityZoneId() == null)
            return false;
        if (other.getAvailabilityZoneId() != null && other.getAvailabilityZoneId().equals(this.getAvailabilityZoneId()) == false)
            return false;
        if (other.getLaunchTime() == null ^ this.getLaunchTime() == null)
            return false;
        if (other.getLaunchTime() != null && other.getLaunchTime().equals(this.getLaunchTime()) == false)
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

        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZoneId() == null) ? 0 : getAvailabilityZoneId().hashCode());
        hashCode = prime * hashCode + ((getLaunchTime() == null) ? 0 : getLaunchTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public KxNode clone() {
        try {
            return (KxNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.KxNodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
