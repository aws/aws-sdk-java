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
package com.amazonaws.services.tnb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The metadata of a network function.
 * </p>
 * <p>
 * A network instance is a single network created in Amazon Web Services TNB that can be deployed and on which
 * life-cycle operations (like terminate, update, and delete) can be performed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/tnb-2008-10-21/GetSolVnfcResourceInfoMetadata" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSolVnfcResourceInfoMetadata implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Information about the cluster.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * Information about the helm chart.
     * </p>
     */
    private String helmChart;
    /**
     * <p>
     * Information about the node group.
     * </p>
     */
    private String nodeGroup;

    /**
     * <p>
     * Information about the cluster.
     * </p>
     * 
     * @param cluster
     *        Information about the cluster.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * Information about the cluster.
     * </p>
     * 
     * @return Information about the cluster.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * Information about the cluster.
     * </p>
     * 
     * @param cluster
     *        Information about the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolVnfcResourceInfoMetadata withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * Information about the helm chart.
     * </p>
     * 
     * @param helmChart
     *        Information about the helm chart.
     */

    public void setHelmChart(String helmChart) {
        this.helmChart = helmChart;
    }

    /**
     * <p>
     * Information about the helm chart.
     * </p>
     * 
     * @return Information about the helm chart.
     */

    public String getHelmChart() {
        return this.helmChart;
    }

    /**
     * <p>
     * Information about the helm chart.
     * </p>
     * 
     * @param helmChart
     *        Information about the helm chart.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolVnfcResourceInfoMetadata withHelmChart(String helmChart) {
        setHelmChart(helmChart);
        return this;
    }

    /**
     * <p>
     * Information about the node group.
     * </p>
     * 
     * @param nodeGroup
     *        Information about the node group.
     */

    public void setNodeGroup(String nodeGroup) {
        this.nodeGroup = nodeGroup;
    }

    /**
     * <p>
     * Information about the node group.
     * </p>
     * 
     * @return Information about the node group.
     */

    public String getNodeGroup() {
        return this.nodeGroup;
    }

    /**
     * <p>
     * Information about the node group.
     * </p>
     * 
     * @param nodeGroup
     *        Information about the node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSolVnfcResourceInfoMetadata withNodeGroup(String nodeGroup) {
        setNodeGroup(nodeGroup);
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
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getHelmChart() != null)
            sb.append("HelmChart: ").append(getHelmChart()).append(",");
        if (getNodeGroup() != null)
            sb.append("NodeGroup: ").append(getNodeGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSolVnfcResourceInfoMetadata == false)
            return false;
        GetSolVnfcResourceInfoMetadata other = (GetSolVnfcResourceInfoMetadata) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getHelmChart() == null ^ this.getHelmChart() == null)
            return false;
        if (other.getHelmChart() != null && other.getHelmChart().equals(this.getHelmChart()) == false)
            return false;
        if (other.getNodeGroup() == null ^ this.getNodeGroup() == null)
            return false;
        if (other.getNodeGroup() != null && other.getNodeGroup().equals(this.getNodeGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getHelmChart() == null) ? 0 : getHelmChart().hashCode());
        hashCode = prime * hashCode + ((getNodeGroup() == null) ? 0 : getNodeGroup().hashCode());
        return hashCode;
    }

    @Override
    public GetSolVnfcResourceInfoMetadata clone() {
        try {
            return (GetSolVnfcResourceInfoMetadata) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.tnb.model.transform.GetSolVnfcResourceInfoMetadataMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
