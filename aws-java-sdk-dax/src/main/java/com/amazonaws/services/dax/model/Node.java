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
package com.amazonaws.services.dax.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents an individual node within a DAX cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/Node" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Node implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A system-generated identifier for the node.
     * </p>
     */
    private String nodeId;
    /**
     * <p>
     * The endpoint for the node, consisting of a DNS name and a port number. Client applications can connect directly
     * to a node endpoint, if desired (as an alternative to allowing DAX client software to intelligently route requests
     * and responses to nodes in the DAX cluster.
     * </p>
     */
    private Endpoint endpoint;
    /**
     * <p>
     * The date and time (in UNIX epoch format) when the node was launched.
     * </p>
     */
    private java.util.Date nodeCreateTime;
    /**
     * <p>
     * The Availability Zone (AZ) in which the node has been deployed.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The current status of the node. For example: <code>available</code>.
     * </p>
     */
    private String nodeStatus;
    /**
     * <p>
     * The status of the parameter group associated with this node. For example, <code>in-sync</code>.
     * </p>
     */
    private String parameterGroupStatus;

    /**
     * <p>
     * A system-generated identifier for the node.
     * </p>
     * 
     * @param nodeId
     *        A system-generated identifier for the node.
     */

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * <p>
     * A system-generated identifier for the node.
     * </p>
     * 
     * @return A system-generated identifier for the node.
     */

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * <p>
     * A system-generated identifier for the node.
     * </p>
     * 
     * @param nodeId
     *        A system-generated identifier for the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withNodeId(String nodeId) {
        setNodeId(nodeId);
        return this;
    }

    /**
     * <p>
     * The endpoint for the node, consisting of a DNS name and a port number. Client applications can connect directly
     * to a node endpoint, if desired (as an alternative to allowing DAX client software to intelligently route requests
     * and responses to nodes in the DAX cluster.
     * </p>
     * 
     * @param endpoint
     *        The endpoint for the node, consisting of a DNS name and a port number. Client applications can connect
     *        directly to a node endpoint, if desired (as an alternative to allowing DAX client software to
     *        intelligently route requests and responses to nodes in the DAX cluster.
     */

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint for the node, consisting of a DNS name and a port number. Client applications can connect directly
     * to a node endpoint, if desired (as an alternative to allowing DAX client software to intelligently route requests
     * and responses to nodes in the DAX cluster.
     * </p>
     * 
     * @return The endpoint for the node, consisting of a DNS name and a port number. Client applications can connect
     *         directly to a node endpoint, if desired (as an alternative to allowing DAX client software to
     *         intelligently route requests and responses to nodes in the DAX cluster.
     */

    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint for the node, consisting of a DNS name and a port number. Client applications can connect directly
     * to a node endpoint, if desired (as an alternative to allowing DAX client software to intelligently route requests
     * and responses to nodes in the DAX cluster.
     * </p>
     * 
     * @param endpoint
     *        The endpoint for the node, consisting of a DNS name and a port number. Client applications can connect
     *        directly to a node endpoint, if desired (as an alternative to allowing DAX client software to
     *        intelligently route requests and responses to nodes in the DAX cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withEndpoint(Endpoint endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The date and time (in UNIX epoch format) when the node was launched.
     * </p>
     * 
     * @param nodeCreateTime
     *        The date and time (in UNIX epoch format) when the node was launched.
     */

    public void setNodeCreateTime(java.util.Date nodeCreateTime) {
        this.nodeCreateTime = nodeCreateTime;
    }

    /**
     * <p>
     * The date and time (in UNIX epoch format) when the node was launched.
     * </p>
     * 
     * @return The date and time (in UNIX epoch format) when the node was launched.
     */

    public java.util.Date getNodeCreateTime() {
        return this.nodeCreateTime;
    }

    /**
     * <p>
     * The date and time (in UNIX epoch format) when the node was launched.
     * </p>
     * 
     * @param nodeCreateTime
     *        The date and time (in UNIX epoch format) when the node was launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withNodeCreateTime(java.util.Date nodeCreateTime) {
        setNodeCreateTime(nodeCreateTime);
        return this;
    }

    /**
     * <p>
     * The Availability Zone (AZ) in which the node has been deployed.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone (AZ) in which the node has been deployed.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) in which the node has been deployed.
     * </p>
     * 
     * @return The Availability Zone (AZ) in which the node has been deployed.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) in which the node has been deployed.
     * </p>
     * 
     * @param availabilityZone
     *        The Availability Zone (AZ) in which the node has been deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The current status of the node. For example: <code>available</code>.
     * </p>
     * 
     * @param nodeStatus
     *        The current status of the node. For example: <code>available</code>.
     */

    public void setNodeStatus(String nodeStatus) {
        this.nodeStatus = nodeStatus;
    }

    /**
     * <p>
     * The current status of the node. For example: <code>available</code>.
     * </p>
     * 
     * @return The current status of the node. For example: <code>available</code>.
     */

    public String getNodeStatus() {
        return this.nodeStatus;
    }

    /**
     * <p>
     * The current status of the node. For example: <code>available</code>.
     * </p>
     * 
     * @param nodeStatus
     *        The current status of the node. For example: <code>available</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withNodeStatus(String nodeStatus) {
        setNodeStatus(nodeStatus);
        return this;
    }

    /**
     * <p>
     * The status of the parameter group associated with this node. For example, <code>in-sync</code>.
     * </p>
     * 
     * @param parameterGroupStatus
     *        The status of the parameter group associated with this node. For example, <code>in-sync</code>.
     */

    public void setParameterGroupStatus(String parameterGroupStatus) {
        this.parameterGroupStatus = parameterGroupStatus;
    }

    /**
     * <p>
     * The status of the parameter group associated with this node. For example, <code>in-sync</code>.
     * </p>
     * 
     * @return The status of the parameter group associated with this node. For example, <code>in-sync</code>.
     */

    public String getParameterGroupStatus() {
        return this.parameterGroupStatus;
    }

    /**
     * <p>
     * The status of the parameter group associated with this node. For example, <code>in-sync</code>.
     * </p>
     * 
     * @param parameterGroupStatus
     *        The status of the parameter group associated with this node. For example, <code>in-sync</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Node withParameterGroupStatus(String parameterGroupStatus) {
        setParameterGroupStatus(parameterGroupStatus);
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
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getNodeCreateTime() != null)
            sb.append("NodeCreateTime: ").append(getNodeCreateTime()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getNodeStatus() != null)
            sb.append("NodeStatus: ").append(getNodeStatus()).append(",");
        if (getParameterGroupStatus() != null)
            sb.append("ParameterGroupStatus: ").append(getParameterGroupStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Node == false)
            return false;
        Node other = (Node) obj;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getNodeCreateTime() == null ^ this.getNodeCreateTime() == null)
            return false;
        if (other.getNodeCreateTime() != null && other.getNodeCreateTime().equals(this.getNodeCreateTime()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getNodeStatus() == null ^ this.getNodeStatus() == null)
            return false;
        if (other.getNodeStatus() != null && other.getNodeStatus().equals(this.getNodeStatus()) == false)
            return false;
        if (other.getParameterGroupStatus() == null ^ this.getParameterGroupStatus() == null)
            return false;
        if (other.getParameterGroupStatus() != null && other.getParameterGroupStatus().equals(this.getParameterGroupStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getNodeCreateTime() == null) ? 0 : getNodeCreateTime().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getNodeStatus() == null) ? 0 : getNodeStatus().hashCode());
        hashCode = prime * hashCode + ((getParameterGroupStatus() == null) ? 0 : getParameterGroupStatus().hashCode());
        return hashCode;
    }

    @Override
    public Node clone() {
        try {
            return (Node) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.dax.model.transform.NodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
