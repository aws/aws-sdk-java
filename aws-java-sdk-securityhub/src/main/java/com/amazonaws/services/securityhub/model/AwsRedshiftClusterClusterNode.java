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
 * A node in an Amazon Redshift cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsRedshiftClusterClusterNode"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsRedshiftClusterClusterNode implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The role of the node. A node might be a leader node or a compute node.
     * </p>
     */
    private String nodeRole;
    /**
     * <p>
     * The private IP address of the node.
     * </p>
     */
    private String privateIpAddress;
    /**
     * <p>
     * The public IP address of the node.
     * </p>
     */
    private String publicIpAddress;

    /**
     * <p>
     * The role of the node. A node might be a leader node or a compute node.
     * </p>
     * 
     * @param nodeRole
     *        The role of the node. A node might be a leader node or a compute node.
     */

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    /**
     * <p>
     * The role of the node. A node might be a leader node or a compute node.
     * </p>
     * 
     * @return The role of the node. A node might be a leader node or a compute node.
     */

    public String getNodeRole() {
        return this.nodeRole;
    }

    /**
     * <p>
     * The role of the node. A node might be a leader node or a compute node.
     * </p>
     * 
     * @param nodeRole
     *        The role of the node. A node might be a leader node or a compute node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterClusterNode withNodeRole(String nodeRole) {
        setNodeRole(nodeRole);
        return this;
    }

    /**
     * <p>
     * The private IP address of the node.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address of the node.
     */

    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the node.
     * </p>
     * 
     * @return The private IP address of the node.
     */

    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * <p>
     * The private IP address of the node.
     * </p>
     * 
     * @param privateIpAddress
     *        The private IP address of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterClusterNode withPrivateIpAddress(String privateIpAddress) {
        setPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * <p>
     * The public IP address of the node.
     * </p>
     * 
     * @param publicIpAddress
     *        The public IP address of the node.
     */

    public void setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the node.
     * </p>
     * 
     * @return The public IP address of the node.
     */

    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * <p>
     * The public IP address of the node.
     * </p>
     * 
     * @param publicIpAddress
     *        The public IP address of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsRedshiftClusterClusterNode withPublicIpAddress(String publicIpAddress) {
        setPublicIpAddress(publicIpAddress);
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
        if (getPrivateIpAddress() != null)
            sb.append("PrivateIpAddress: ").append(getPrivateIpAddress()).append(",");
        if (getPublicIpAddress() != null)
            sb.append("PublicIpAddress: ").append(getPublicIpAddress());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRedshiftClusterClusterNode == false)
            return false;
        AwsRedshiftClusterClusterNode other = (AwsRedshiftClusterClusterNode) obj;
        if (other.getNodeRole() == null ^ this.getNodeRole() == null)
            return false;
        if (other.getNodeRole() != null && other.getNodeRole().equals(this.getNodeRole()) == false)
            return false;
        if (other.getPrivateIpAddress() == null ^ this.getPrivateIpAddress() == null)
            return false;
        if (other.getPrivateIpAddress() != null && other.getPrivateIpAddress().equals(this.getPrivateIpAddress()) == false)
            return false;
        if (other.getPublicIpAddress() == null ^ this.getPublicIpAddress() == null)
            return false;
        if (other.getPublicIpAddress() != null && other.getPublicIpAddress().equals(this.getPublicIpAddress()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeRole() == null) ? 0 : getNodeRole().hashCode());
        hashCode = prime * hashCode + ((getPrivateIpAddress() == null) ? 0 : getPrivateIpAddress().hashCode());
        hashCode = prime * hashCode + ((getPublicIpAddress() == null) ? 0 : getPublicIpAddress().hashCode());
        return hashCode;
    }

    @Override
    public AwsRedshiftClusterClusterNode clone() {
        try {
            return (AwsRedshiftClusterClusterNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsRedshiftClusterClusterNodeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
