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
 * A structure for the metadata of a cluster. It includes information like the CPUs needed, memory of instances, and
 * number of instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/finspace-2021-03-12/CapacityConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CapacityConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type that determines the hardware of the host computer used for your cluster instance. Each node type offers
     * different memory and storage capabilities. Choose a node type based on the requirements of the application or
     * software that you plan to run on your instance.
     * </p>
     * <p>
     * You can only specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kx.s.large</code> – The node type with a configuration of 12 GiB memory and 2 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.xlarge</code> – The node type with a configuration of 27 GiB memory and 4 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.2xlarge</code> – The node type with a configuration of 54 GiB memory and 8 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.4xlarge</code> – The node type with a configuration of 108 GiB memory and 16 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.8xlarge</code> – The node type with a configuration of 216 GiB memory and 32 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.16xlarge</code> – The node type with a configuration of 432 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.32xlarge</code> – The node type with a configuration of 864 GiB memory and 128 vCPUs.
     * </p>
     * </li>
     * </ul>
     */
    private String nodeType;
    /**
     * <p>
     * The number of instances running in a cluster.
     * </p>
     */
    private Integer nodeCount;

    /**
     * <p>
     * The type that determines the hardware of the host computer used for your cluster instance. Each node type offers
     * different memory and storage capabilities. Choose a node type based on the requirements of the application or
     * software that you plan to run on your instance.
     * </p>
     * <p>
     * You can only specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kx.s.large</code> – The node type with a configuration of 12 GiB memory and 2 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.xlarge</code> – The node type with a configuration of 27 GiB memory and 4 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.2xlarge</code> – The node type with a configuration of 54 GiB memory and 8 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.4xlarge</code> – The node type with a configuration of 108 GiB memory and 16 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.8xlarge</code> – The node type with a configuration of 216 GiB memory and 32 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.16xlarge</code> – The node type with a configuration of 432 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.32xlarge</code> – The node type with a configuration of 864 GiB memory and 128 vCPUs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nodeType
     *        The type that determines the hardware of the host computer used for your cluster instance. Each node type
     *        offers different memory and storage capabilities. Choose a node type based on the requirements of the
     *        application or software that you plan to run on your instance.</p>
     *        <p>
     *        You can only specify one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>kx.s.large</code> – The node type with a configuration of 12 GiB memory and 2 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.s.xlarge</code> – The node type with a configuration of 27 GiB memory and 4 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.s.2xlarge</code> – The node type with a configuration of 54 GiB memory and 8 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.s.4xlarge</code> – The node type with a configuration of 108 GiB memory and 16 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.s.8xlarge</code> – The node type with a configuration of 216 GiB memory and 32 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.s.16xlarge</code> – The node type with a configuration of 432 GiB memory and 64 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.s.32xlarge</code> – The node type with a configuration of 864 GiB memory and 128 vCPUs.
     *        </p>
     *        </li>
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The type that determines the hardware of the host computer used for your cluster instance. Each node type offers
     * different memory and storage capabilities. Choose a node type based on the requirements of the application or
     * software that you plan to run on your instance.
     * </p>
     * <p>
     * You can only specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kx.s.large</code> – The node type with a configuration of 12 GiB memory and 2 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.xlarge</code> – The node type with a configuration of 27 GiB memory and 4 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.2xlarge</code> – The node type with a configuration of 54 GiB memory and 8 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.4xlarge</code> – The node type with a configuration of 108 GiB memory and 16 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.8xlarge</code> – The node type with a configuration of 216 GiB memory and 32 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.16xlarge</code> – The node type with a configuration of 432 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.32xlarge</code> – The node type with a configuration of 864 GiB memory and 128 vCPUs.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type that determines the hardware of the host computer used for your cluster instance. Each node type
     *         offers different memory and storage capabilities. Choose a node type based on the requirements of the
     *         application or software that you plan to run on your instance.</p>
     *         <p>
     *         You can only specify one of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>kx.s.large</code> – The node type with a configuration of 12 GiB memory and 2 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.s.xlarge</code> – The node type with a configuration of 27 GiB memory and 4 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.s.2xlarge</code> – The node type with a configuration of 54 GiB memory and 8 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.s.4xlarge</code> – The node type with a configuration of 108 GiB memory and 16 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.s.8xlarge</code> – The node type with a configuration of 216 GiB memory and 32 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.s.16xlarge</code> – The node type with a configuration of 432 GiB memory and 64 vCPUs.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>kx.s.32xlarge</code> – The node type with a configuration of 864 GiB memory and 128 vCPUs.
     *         </p>
     *         </li>
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The type that determines the hardware of the host computer used for your cluster instance. Each node type offers
     * different memory and storage capabilities. Choose a node type based on the requirements of the application or
     * software that you plan to run on your instance.
     * </p>
     * <p>
     * You can only specify one of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>kx.s.large</code> – The node type with a configuration of 12 GiB memory and 2 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.xlarge</code> – The node type with a configuration of 27 GiB memory and 4 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.2xlarge</code> – The node type with a configuration of 54 GiB memory and 8 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.4xlarge</code> – The node type with a configuration of 108 GiB memory and 16 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.8xlarge</code> – The node type with a configuration of 216 GiB memory and 32 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.16xlarge</code> – The node type with a configuration of 432 GiB memory and 64 vCPUs.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>kx.s.32xlarge</code> – The node type with a configuration of 864 GiB memory and 128 vCPUs.
     * </p>
     * </li>
     * </ul>
     * 
     * @param nodeType
     *        The type that determines the hardware of the host computer used for your cluster instance. Each node type
     *        offers different memory and storage capabilities. Choose a node type based on the requirements of the
     *        application or software that you plan to run on your instance.</p>
     *        <p>
     *        You can only specify one of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>kx.s.large</code> – The node type with a configuration of 12 GiB memory and 2 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.s.xlarge</code> – The node type with a configuration of 27 GiB memory and 4 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.s.2xlarge</code> – The node type with a configuration of 54 GiB memory and 8 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.s.4xlarge</code> – The node type with a configuration of 108 GiB memory and 16 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.s.8xlarge</code> – The node type with a configuration of 216 GiB memory and 32 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.s.16xlarge</code> – The node type with a configuration of 432 GiB memory and 64 vCPUs.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>kx.s.32xlarge</code> – The node type with a configuration of 864 GiB memory and 128 vCPUs.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityConfiguration withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The number of instances running in a cluster.
     * </p>
     * 
     * @param nodeCount
     *        The number of instances running in a cluster.
     */

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    /**
     * <p>
     * The number of instances running in a cluster.
     * </p>
     * 
     * @return The number of instances running in a cluster.
     */

    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * <p>
     * The number of instances running in a cluster.
     * </p>
     * 
     * @param nodeCount
     *        The number of instances running in a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CapacityConfiguration withNodeCount(Integer nodeCount) {
        setNodeCount(nodeCount);
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
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getNodeCount() != null)
            sb.append("NodeCount: ").append(getNodeCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CapacityConfiguration == false)
            return false;
        CapacityConfiguration other = (CapacityConfiguration) obj;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getNodeCount() == null ^ this.getNodeCount() == null)
            return false;
        if (other.getNodeCount() != null && other.getNodeCount().equals(this.getNodeCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getNodeCount() == null) ? 0 : getNodeCount().hashCode());
        return hashCode;
    }

    @Override
    public CapacityConfiguration clone() {
        try {
            return (CapacityConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.finspace.model.transform.CapacityConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
