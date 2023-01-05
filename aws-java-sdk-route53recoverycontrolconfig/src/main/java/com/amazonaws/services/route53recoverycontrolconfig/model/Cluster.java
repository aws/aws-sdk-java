/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53recoverycontrolconfig.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A set of five redundant Regional endpoints against which you can execute API calls to update or get the state of
 * routing controls. You can host multiple control panels and routing controls on one cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-recovery-control-config-2020-11-02/Cluster"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * Endpoints for a cluster. Specify one of these endpoints when you want to set or retrieve a routing control state
     * in the cluster.
     * </p>
     * <p>
     * To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller Routing
     * Control Actions.
     * </p>
     */
    private java.util.List<ClusterEndpoint> clusterEndpoints;
    /**
     * <p>
     * The name of the cluster.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the cluster.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the cluster.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * Endpoints for a cluster. Specify one of these endpoints when you want to set or retrieve a routing control state
     * in the cluster.
     * </p>
     * <p>
     * To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller Routing
     * Control Actions.
     * </p>
     * 
     * @return Endpoints for a cluster. Specify one of these endpoints when you want to set or retrieve a routing
     *         control state in the cluster.</p>
     *         <p>
     *         To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller
     *         Routing Control Actions.
     */

    public java.util.List<ClusterEndpoint> getClusterEndpoints() {
        return clusterEndpoints;
    }

    /**
     * <p>
     * Endpoints for a cluster. Specify one of these endpoints when you want to set or retrieve a routing control state
     * in the cluster.
     * </p>
     * <p>
     * To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller Routing
     * Control Actions.
     * </p>
     * 
     * @param clusterEndpoints
     *        Endpoints for a cluster. Specify one of these endpoints when you want to set or retrieve a routing control
     *        state in the cluster.</p>
     *        <p>
     *        To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller
     *        Routing Control Actions.
     */

    public void setClusterEndpoints(java.util.Collection<ClusterEndpoint> clusterEndpoints) {
        if (clusterEndpoints == null) {
            this.clusterEndpoints = null;
            return;
        }

        this.clusterEndpoints = new java.util.ArrayList<ClusterEndpoint>(clusterEndpoints);
    }

    /**
     * <p>
     * Endpoints for a cluster. Specify one of these endpoints when you want to set or retrieve a routing control state
     * in the cluster.
     * </p>
     * <p>
     * To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller Routing
     * Control Actions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClusterEndpoints(java.util.Collection)} or {@link #withClusterEndpoints(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param clusterEndpoints
     *        Endpoints for a cluster. Specify one of these endpoints when you want to set or retrieve a routing control
     *        state in the cluster.</p>
     *        <p>
     *        To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller
     *        Routing Control Actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterEndpoints(ClusterEndpoint... clusterEndpoints) {
        if (this.clusterEndpoints == null) {
            setClusterEndpoints(new java.util.ArrayList<ClusterEndpoint>(clusterEndpoints.length));
        }
        for (ClusterEndpoint ele : clusterEndpoints) {
            this.clusterEndpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Endpoints for a cluster. Specify one of these endpoints when you want to set or retrieve a routing control state
     * in the cluster.
     * </p>
     * <p>
     * To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller Routing
     * Control Actions.
     * </p>
     * 
     * @param clusterEndpoints
     *        Endpoints for a cluster. Specify one of these endpoints when you want to set or retrieve a routing control
     *        state in the cluster.</p>
     *        <p>
     *        To get or update the routing control state, see the Amazon Route 53 Application Recovery Controller
     *        Routing Control Actions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterEndpoints(java.util.Collection<ClusterEndpoint> clusterEndpoints) {
        setClusterEndpoints(clusterEndpoints);
        return this;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param name
     *        The name of the cluster.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @return The name of the cluster.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the cluster.
     * </p>
     * 
     * @param name
     *        The name of the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     * 
     * @return Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Cluster withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * </p>
     * 
     * @param status
     *        Deployment status of a resource. Status can be one of the following: PENDING, DEPLOYED, PENDING_DELETION.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public Cluster withStatus(Status status) {
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getClusterEndpoints() != null)
            sb.append("ClusterEndpoints: ").append(getClusterEndpoints()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
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

        if (obj instanceof Cluster == false)
            return false;
        Cluster other = (Cluster) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterEndpoints() == null ^ this.getClusterEndpoints() == null)
            return false;
        if (other.getClusterEndpoints() != null && other.getClusterEndpoints().equals(this.getClusterEndpoints()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
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

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getClusterEndpoints() == null) ? 0 : getClusterEndpoints().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public Cluster clone() {
        try {
            return (Cluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.route53recoverycontrolconfig.model.transform.ClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
