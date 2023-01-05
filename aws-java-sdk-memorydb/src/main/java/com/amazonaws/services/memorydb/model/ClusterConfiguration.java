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
package com.amazonaws.services.memorydb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A list of cluster configuration options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/memorydb-2021-01-01/ClusterConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the cluster
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the cluster configuration
     * </p>
     */
    private String description;
    /**
     * <p>
     * The node type used for the cluster
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The Redis engine version used by the cluster
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * The specified maintenance window for the cluster
     * </p>
     */
    private String maintenanceWindow;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS notification topic for the cluster
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * The port used by the cluster
     * </p>
     */
    private Integer port;
    /**
     * <p>
     * The name of parameter group used by the cluster
     * </p>
     */
    private String parameterGroupName;
    /**
     * <p>
     * The name of the subnet group used by the cluster
     * </p>
     */
    private String subnetGroupName;
    /**
     * <p>
     * The ID of the VPC the cluster belongs to
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The snapshot retention limit set by the cluster
     * </p>
     */
    private Integer snapshotRetentionLimit;
    /**
     * <p>
     * The snapshot window set by the cluster
     * </p>
     */
    private String snapshotWindow;
    /**
     * <p>
     * The number of shards in the cluster
     * </p>
     */
    private Integer numShards;
    /**
     * <p>
     * The list of shards in the cluster
     * </p>
     */
    private java.util.List<ShardDetail> shards;

    /**
     * <p>
     * The name of the cluster
     * </p>
     * 
     * @param name
     *        The name of the cluster
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the cluster
     * </p>
     * 
     * @return The name of the cluster
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the cluster
     * </p>
     * 
     * @param name
     *        The name of the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the cluster configuration
     * </p>
     * 
     * @param description
     *        The description of the cluster configuration
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the cluster configuration
     * </p>
     * 
     * @return The description of the cluster configuration
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the cluster configuration
     * </p>
     * 
     * @param description
     *        The description of the cluster configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The node type used for the cluster
     * </p>
     * 
     * @param nodeType
     *        The node type used for the cluster
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type used for the cluster
     * </p>
     * 
     * @return The node type used for the cluster
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type used for the cluster
     * </p>
     * 
     * @param nodeType
     *        The node type used for the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The Redis engine version used by the cluster
     * </p>
     * 
     * @param engineVersion
     *        The Redis engine version used by the cluster
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The Redis engine version used by the cluster
     * </p>
     * 
     * @return The Redis engine version used by the cluster
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The Redis engine version used by the cluster
     * </p>
     * 
     * @param engineVersion
     *        The Redis engine version used by the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * The specified maintenance window for the cluster
     * </p>
     * 
     * @param maintenanceWindow
     *        The specified maintenance window for the cluster
     */

    public void setMaintenanceWindow(String maintenanceWindow) {
        this.maintenanceWindow = maintenanceWindow;
    }

    /**
     * <p>
     * The specified maintenance window for the cluster
     * </p>
     * 
     * @return The specified maintenance window for the cluster
     */

    public String getMaintenanceWindow() {
        return this.maintenanceWindow;
    }

    /**
     * <p>
     * The specified maintenance window for the cluster
     * </p>
     * 
     * @param maintenanceWindow
     *        The specified maintenance window for the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withMaintenanceWindow(String maintenanceWindow) {
        setMaintenanceWindow(maintenanceWindow);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS notification topic for the cluster
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) of the SNS notification topic for the cluster
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS notification topic for the cluster
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SNS notification topic for the cluster
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS notification topic for the cluster
     * </p>
     * 
     * @param topicArn
     *        The Amazon Resource Name (ARN) of the SNS notification topic for the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * The port used by the cluster
     * </p>
     * 
     * @param port
     *        The port used by the cluster
     */

    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port used by the cluster
     * </p>
     * 
     * @return The port used by the cluster
     */

    public Integer getPort() {
        return this.port;
    }

    /**
     * <p>
     * The port used by the cluster
     * </p>
     * 
     * @param port
     *        The port used by the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withPort(Integer port) {
        setPort(port);
        return this;
    }

    /**
     * <p>
     * The name of parameter group used by the cluster
     * </p>
     * 
     * @param parameterGroupName
     *        The name of parameter group used by the cluster
     */

    public void setParameterGroupName(String parameterGroupName) {
        this.parameterGroupName = parameterGroupName;
    }

    /**
     * <p>
     * The name of parameter group used by the cluster
     * </p>
     * 
     * @return The name of parameter group used by the cluster
     */

    public String getParameterGroupName() {
        return this.parameterGroupName;
    }

    /**
     * <p>
     * The name of parameter group used by the cluster
     * </p>
     * 
     * @param parameterGroupName
     *        The name of parameter group used by the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withParameterGroupName(String parameterGroupName) {
        setParameterGroupName(parameterGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the subnet group used by the cluster
     * </p>
     * 
     * @param subnetGroupName
     *        The name of the subnet group used by the cluster
     */

    public void setSubnetGroupName(String subnetGroupName) {
        this.subnetGroupName = subnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group used by the cluster
     * </p>
     * 
     * @return The name of the subnet group used by the cluster
     */

    public String getSubnetGroupName() {
        return this.subnetGroupName;
    }

    /**
     * <p>
     * The name of the subnet group used by the cluster
     * </p>
     * 
     * @param subnetGroupName
     *        The name of the subnet group used by the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withSubnetGroupName(String subnetGroupName) {
        setSubnetGroupName(subnetGroupName);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC the cluster belongs to
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC the cluster belongs to
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC the cluster belongs to
     * </p>
     * 
     * @return The ID of the VPC the cluster belongs to
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC the cluster belongs to
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC the cluster belongs to
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The snapshot retention limit set by the cluster
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The snapshot retention limit set by the cluster
     */

    public void setSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        this.snapshotRetentionLimit = snapshotRetentionLimit;
    }

    /**
     * <p>
     * The snapshot retention limit set by the cluster
     * </p>
     * 
     * @return The snapshot retention limit set by the cluster
     */

    public Integer getSnapshotRetentionLimit() {
        return this.snapshotRetentionLimit;
    }

    /**
     * <p>
     * The snapshot retention limit set by the cluster
     * </p>
     * 
     * @param snapshotRetentionLimit
     *        The snapshot retention limit set by the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withSnapshotRetentionLimit(Integer snapshotRetentionLimit) {
        setSnapshotRetentionLimit(snapshotRetentionLimit);
        return this;
    }

    /**
     * <p>
     * The snapshot window set by the cluster
     * </p>
     * 
     * @param snapshotWindow
     *        The snapshot window set by the cluster
     */

    public void setSnapshotWindow(String snapshotWindow) {
        this.snapshotWindow = snapshotWindow;
    }

    /**
     * <p>
     * The snapshot window set by the cluster
     * </p>
     * 
     * @return The snapshot window set by the cluster
     */

    public String getSnapshotWindow() {
        return this.snapshotWindow;
    }

    /**
     * <p>
     * The snapshot window set by the cluster
     * </p>
     * 
     * @param snapshotWindow
     *        The snapshot window set by the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withSnapshotWindow(String snapshotWindow) {
        setSnapshotWindow(snapshotWindow);
        return this;
    }

    /**
     * <p>
     * The number of shards in the cluster
     * </p>
     * 
     * @param numShards
     *        The number of shards in the cluster
     */

    public void setNumShards(Integer numShards) {
        this.numShards = numShards;
    }

    /**
     * <p>
     * The number of shards in the cluster
     * </p>
     * 
     * @return The number of shards in the cluster
     */

    public Integer getNumShards() {
        return this.numShards;
    }

    /**
     * <p>
     * The number of shards in the cluster
     * </p>
     * 
     * @param numShards
     *        The number of shards in the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withNumShards(Integer numShards) {
        setNumShards(numShards);
        return this;
    }

    /**
     * <p>
     * The list of shards in the cluster
     * </p>
     * 
     * @return The list of shards in the cluster
     */

    public java.util.List<ShardDetail> getShards() {
        return shards;
    }

    /**
     * <p>
     * The list of shards in the cluster
     * </p>
     * 
     * @param shards
     *        The list of shards in the cluster
     */

    public void setShards(java.util.Collection<ShardDetail> shards) {
        if (shards == null) {
            this.shards = null;
            return;
        }

        this.shards = new java.util.ArrayList<ShardDetail>(shards);
    }

    /**
     * <p>
     * The list of shards in the cluster
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShards(java.util.Collection)} or {@link #withShards(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param shards
     *        The list of shards in the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withShards(ShardDetail... shards) {
        if (this.shards == null) {
            setShards(new java.util.ArrayList<ShardDetail>(shards.length));
        }
        for (ShardDetail ele : shards) {
            this.shards.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of shards in the cluster
     * </p>
     * 
     * @param shards
     *        The list of shards in the cluster
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterConfiguration withShards(java.util.Collection<ShardDetail> shards) {
        setShards(shards);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getMaintenanceWindow() != null)
            sb.append("MaintenanceWindow: ").append(getMaintenanceWindow()).append(",");
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getPort() != null)
            sb.append("Port: ").append(getPort()).append(",");
        if (getParameterGroupName() != null)
            sb.append("ParameterGroupName: ").append(getParameterGroupName()).append(",");
        if (getSubnetGroupName() != null)
            sb.append("SubnetGroupName: ").append(getSubnetGroupName()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getSnapshotRetentionLimit() != null)
            sb.append("SnapshotRetentionLimit: ").append(getSnapshotRetentionLimit()).append(",");
        if (getSnapshotWindow() != null)
            sb.append("SnapshotWindow: ").append(getSnapshotWindow()).append(",");
        if (getNumShards() != null)
            sb.append("NumShards: ").append(getNumShards()).append(",");
        if (getShards() != null)
            sb.append("Shards: ").append(getShards());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterConfiguration == false)
            return false;
        ClusterConfiguration other = (ClusterConfiguration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getMaintenanceWindow() == null ^ this.getMaintenanceWindow() == null)
            return false;
        if (other.getMaintenanceWindow() != null && other.getMaintenanceWindow().equals(this.getMaintenanceWindow()) == false)
            return false;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getParameterGroupName() == null ^ this.getParameterGroupName() == null)
            return false;
        if (other.getParameterGroupName() != null && other.getParameterGroupName().equals(this.getParameterGroupName()) == false)
            return false;
        if (other.getSubnetGroupName() == null ^ this.getSubnetGroupName() == null)
            return false;
        if (other.getSubnetGroupName() != null && other.getSubnetGroupName().equals(this.getSubnetGroupName()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getSnapshotRetentionLimit() == null ^ this.getSnapshotRetentionLimit() == null)
            return false;
        if (other.getSnapshotRetentionLimit() != null && other.getSnapshotRetentionLimit().equals(this.getSnapshotRetentionLimit()) == false)
            return false;
        if (other.getSnapshotWindow() == null ^ this.getSnapshotWindow() == null)
            return false;
        if (other.getSnapshotWindow() != null && other.getSnapshotWindow().equals(this.getSnapshotWindow()) == false)
            return false;
        if (other.getNumShards() == null ^ this.getNumShards() == null)
            return false;
        if (other.getNumShards() != null && other.getNumShards().equals(this.getNumShards()) == false)
            return false;
        if (other.getShards() == null ^ this.getShards() == null)
            return false;
        if (other.getShards() != null && other.getShards().equals(this.getShards()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getMaintenanceWindow() == null) ? 0 : getMaintenanceWindow().hashCode());
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getParameterGroupName() == null) ? 0 : getParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getSubnetGroupName() == null) ? 0 : getSubnetGroupName().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getSnapshotRetentionLimit() == null) ? 0 : getSnapshotRetentionLimit().hashCode());
        hashCode = prime * hashCode + ((getSnapshotWindow() == null) ? 0 : getSnapshotWindow().hashCode());
        hashCode = prime * hashCode + ((getNumShards() == null) ? 0 : getNumShards().hashCode());
        hashCode = prime * hashCode + ((getShards() == null) ? 0 : getShards().hashCode());
        return hashCode;
    }

    @Override
    public ClusterConfiguration clone() {
        try {
            return (ClusterConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.memorydb.model.transform.ClusterConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
