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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The identifier of a node in a cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ClusterNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterNode implements Serializable, Cloneable {

    /**
     * <p>
     * Whether the node is a leader node or a compute node.
     * </p>
     */
    private String nodeRole;
    /**
     * <p>
     * The private IP address of a node within a cluster.
     * </p>
     */
    private String privateIPAddress;
    /**
     * <p>
     * The public IP address of a node within a cluster.
     * </p>
     */
    private String publicIPAddress;

    /**
     * <p>
     * Whether the node is a leader node or a compute node.
     * </p>
     * 
     * @param nodeRole
     *        Whether the node is a leader node or a compute node.
     */

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    /**
     * <p>
     * Whether the node is a leader node or a compute node.
     * </p>
     * 
     * @return Whether the node is a leader node or a compute node.
     */

    public String getNodeRole() {
        return this.nodeRole;
    }

    /**
     * <p>
     * Whether the node is a leader node or a compute node.
     * </p>
     * 
     * @param nodeRole
     *        Whether the node is a leader node or a compute node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterNode withNodeRole(String nodeRole) {
        setNodeRole(nodeRole);
        return this;
    }

    /**
     * <p>
     * The private IP address of a node within a cluster.
     * </p>
     * 
     * @param privateIPAddress
     *        The private IP address of a node within a cluster.
     */

    public void setPrivateIPAddress(String privateIPAddress) {
        this.privateIPAddress = privateIPAddress;
    }

    /**
     * <p>
     * The private IP address of a node within a cluster.
     * </p>
     * 
     * @return The private IP address of a node within a cluster.
     */

    public String getPrivateIPAddress() {
        return this.privateIPAddress;
    }

    /**
     * <p>
     * The private IP address of a node within a cluster.
     * </p>
     * 
     * @param privateIPAddress
     *        The private IP address of a node within a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterNode withPrivateIPAddress(String privateIPAddress) {
        setPrivateIPAddress(privateIPAddress);
        return this;
    }

    /**
     * <p>
     * The public IP address of a node within a cluster.
     * </p>
     * 
     * @param publicIPAddress
     *        The public IP address of a node within a cluster.
     */

    public void setPublicIPAddress(String publicIPAddress) {
        this.publicIPAddress = publicIPAddress;
    }

    /**
     * <p>
     * The public IP address of a node within a cluster.
     * </p>
     * 
     * @return The public IP address of a node within a cluster.
     */

    public String getPublicIPAddress() {
        return this.publicIPAddress;
    }

    /**
     * <p>
     * The public IP address of a node within a cluster.
     * </p>
     * 
     * @param publicIPAddress
     *        The public IP address of a node within a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterNode withPublicIPAddress(String publicIPAddress) {
        setPublicIPAddress(publicIPAddress);
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
        if (getNodeRole() != null)
            sb.append("NodeRole: ").append(getNodeRole()).append(",");
        if (getPrivateIPAddress() != null)
            sb.append("PrivateIPAddress: ").append(getPrivateIPAddress()).append(",");
        if (getPublicIPAddress() != null)
            sb.append("PublicIPAddress: ").append(getPublicIPAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterNode == false)
            return false;
        ClusterNode other = (ClusterNode) obj;
        if (other.getNodeRole() == null ^ this.getNodeRole() == null)
            return false;
        if (other.getNodeRole() != null && other.getNodeRole().equals(this.getNodeRole()) == false)
            return false;
        if (other.getPrivateIPAddress() == null ^ this.getPrivateIPAddress() == null)
            return false;
        if (other.getPrivateIPAddress() != null && other.getPrivateIPAddress().equals(this.getPrivateIPAddress()) == false)
            return false;
        if (other.getPublicIPAddress() == null ^ this.getPublicIPAddress() == null)
            return false;
        if (other.getPublicIPAddress() != null && other.getPublicIPAddress().equals(this.getPublicIPAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeRole() == null) ? 0 : getNodeRole().hashCode());
        hashCode = prime * hashCode + ((getPrivateIPAddress() == null) ? 0 : getPrivateIPAddress().hashCode());
        hashCode = prime * hashCode + ((getPublicIPAddress() == null) ? 0 : getPublicIPAddress().hashCode());
        return hashCode;
    }

    @Override
    public ClusterNode clone() {
        try {
            return (ClusterNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
