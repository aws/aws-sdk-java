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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/dax-2017-04-19/RebootNode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RebootNodeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the DAX cluster containing the node to be rebooted.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The system-assigned ID of the node to be rebooted.
     * </p>
     */
    private String nodeId;

    /**
     * <p>
     * The name of the DAX cluster containing the node to be rebooted.
     * </p>
     * 
     * @param clusterName
     *        The name of the DAX cluster containing the node to be rebooted.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of the DAX cluster containing the node to be rebooted.
     * </p>
     * 
     * @return The name of the DAX cluster containing the node to be rebooted.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of the DAX cluster containing the node to be rebooted.
     * </p>
     * 
     * @param clusterName
     *        The name of the DAX cluster containing the node to be rebooted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootNodeRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The system-assigned ID of the node to be rebooted.
     * </p>
     * 
     * @param nodeId
     *        The system-assigned ID of the node to be rebooted.
     */

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    /**
     * <p>
     * The system-assigned ID of the node to be rebooted.
     * </p>
     * 
     * @return The system-assigned ID of the node to be rebooted.
     */

    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * <p>
     * The system-assigned ID of the node to be rebooted.
     * </p>
     * 
     * @param nodeId
     *        The system-assigned ID of the node to be rebooted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RebootNodeRequest withNodeId(String nodeId) {
        setNodeId(nodeId);
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getNodeId() != null)
            sb.append("NodeId: ").append(getNodeId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RebootNodeRequest == false)
            return false;
        RebootNodeRequest other = (RebootNodeRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getNodeId() == null ^ this.getNodeId() == null)
            return false;
        if (other.getNodeId() != null && other.getNodeId().equals(this.getNodeId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getNodeId() == null) ? 0 : getNodeId().hashCode());
        return hashCode;
    }

    @Override
    public RebootNodeRequest clone() {
        return (RebootNodeRequest) super.clone();
    }

}
