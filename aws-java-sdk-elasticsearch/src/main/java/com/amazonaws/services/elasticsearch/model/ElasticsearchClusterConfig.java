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
package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the configuration for the domain cluster, such as the type and number of instances.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticsearchClusterConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The instance type for an Elasticsearch cluster.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of instances in the specified domain cluster.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     * target="_blank">About Dedicated Master Nodes</a> for more information.
     * </p>
     */
    private Boolean dedicatedMasterEnabled;
    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     * target="_blank">About Zone Awareness</a> for more information.
     * </p>
     */
    private Boolean zoneAwarenessEnabled;
    /**
     * <p>
     * Specifies the zone awareness configuration for a domain when zone awareness is enabled.
     * </p>
     */
    private ZoneAwarenessConfig zoneAwarenessConfig;
    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     */
    private String dedicatedMasterType;
    /**
     * <p>
     * Total number of dedicated master nodes, active and on standby, for the cluster.
     * </p>
     */
    private Integer dedicatedMasterCount;

    /**
     * <p>
     * The instance type for an Elasticsearch cluster.
     * </p>
     * 
     * @param instanceType
     *        The instance type for an Elasticsearch cluster.
     * @see ESPartitionInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster.
     * </p>
     * 
     * @return The instance type for an Elasticsearch cluster.
     * @see ESPartitionInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster.
     * </p>
     * 
     * @param instanceType
     *        The instance type for an Elasticsearch cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ESPartitionInstanceType
     */

    public ElasticsearchClusterConfig withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster.
     * </p>
     * 
     * @param instanceType
     *        The instance type for an Elasticsearch cluster.
     * @see ESPartitionInstanceType
     */

    public void setInstanceType(ESPartitionInstanceType instanceType) {
        withInstanceType(instanceType);
    }

    /**
     * <p>
     * The instance type for an Elasticsearch cluster.
     * </p>
     * 
     * @param instanceType
     *        The instance type for an Elasticsearch cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ESPartitionInstanceType
     */

    public ElasticsearchClusterConfig withInstanceType(ESPartitionInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The number of instances in the specified domain cluster.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances in the specified domain cluster.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of instances in the specified domain cluster.
     * </p>
     * 
     * @return The number of instances in the specified domain cluster.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of instances in the specified domain cluster.
     * </p>
     * 
     * @param instanceCount
     *        The number of instances in the specified domain cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchClusterConfig withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     * target="_blank">About Dedicated Master Nodes</a> for more information.
     * </p>
     * 
     * @param dedicatedMasterEnabled
     *        A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     *        target="_blank">About Dedicated Master Nodes</a> for more information.
     */

    public void setDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     * target="_blank">About Dedicated Master Nodes</a> for more information.
     * </p>
     * 
     * @return A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     *         target="_blank">About Dedicated Master Nodes</a> for more information.
     */

    public Boolean getDedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     * target="_blank">About Dedicated Master Nodes</a> for more information.
     * </p>
     * 
     * @param dedicatedMasterEnabled
     *        A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     *        target="_blank">About Dedicated Master Nodes</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchClusterConfig withDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
        setDedicatedMasterEnabled(dedicatedMasterEnabled);
        return this;
    }

    /**
     * <p>
     * A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     * target="_blank">About Dedicated Master Nodes</a> for more information.
     * </p>
     * 
     * @return A boolean value to indicate whether a dedicated master node is enabled. See <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-dedicatedmasternodes"
     *         target="_blank">About Dedicated Master Nodes</a> for more information.
     */

    public Boolean isDedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     * target="_blank">About Zone Awareness</a> for more information.
     * </p>
     * 
     * @param zoneAwarenessEnabled
     *        A boolean value to indicate whether zone awareness is enabled. See <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     *        target="_blank">About Zone Awareness</a> for more information.
     */

    public void setZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     * target="_blank">About Zone Awareness</a> for more information.
     * </p>
     * 
     * @return A boolean value to indicate whether zone awareness is enabled. See <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     *         target="_blank">About Zone Awareness</a> for more information.
     */

    public Boolean getZoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled;
    }

    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     * target="_blank">About Zone Awareness</a> for more information.
     * </p>
     * 
     * @param zoneAwarenessEnabled
     *        A boolean value to indicate whether zone awareness is enabled. See <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     *        target="_blank">About Zone Awareness</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchClusterConfig withZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
        setZoneAwarenessEnabled(zoneAwarenessEnabled);
        return this;
    }

    /**
     * <p>
     * A boolean value to indicate whether zone awareness is enabled. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     * target="_blank">About Zone Awareness</a> for more information.
     * </p>
     * 
     * @return A boolean value to indicate whether zone awareness is enabled. See <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-managedomains.html#es-managedomains-zoneawareness"
     *         target="_blank">About Zone Awareness</a> for more information.
     */

    public Boolean isZoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled;
    }

    /**
     * <p>
     * Specifies the zone awareness configuration for a domain when zone awareness is enabled.
     * </p>
     * 
     * @param zoneAwarenessConfig
     *        Specifies the zone awareness configuration for a domain when zone awareness is enabled.
     */

    public void setZoneAwarenessConfig(ZoneAwarenessConfig zoneAwarenessConfig) {
        this.zoneAwarenessConfig = zoneAwarenessConfig;
    }

    /**
     * <p>
     * Specifies the zone awareness configuration for a domain when zone awareness is enabled.
     * </p>
     * 
     * @return Specifies the zone awareness configuration for a domain when zone awareness is enabled.
     */

    public ZoneAwarenessConfig getZoneAwarenessConfig() {
        return this.zoneAwarenessConfig;
    }

    /**
     * <p>
     * Specifies the zone awareness configuration for a domain when zone awareness is enabled.
     * </p>
     * 
     * @param zoneAwarenessConfig
     *        Specifies the zone awareness configuration for a domain when zone awareness is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchClusterConfig withZoneAwarenessConfig(ZoneAwarenessConfig zoneAwarenessConfig) {
        setZoneAwarenessConfig(zoneAwarenessConfig);
        return this;
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * 
     * @param dedicatedMasterType
     *        The instance type for a dedicated master node.
     * @see ESPartitionInstanceType
     */

    public void setDedicatedMasterType(String dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType;
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * 
     * @return The instance type for a dedicated master node.
     * @see ESPartitionInstanceType
     */

    public String getDedicatedMasterType() {
        return this.dedicatedMasterType;
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * 
     * @param dedicatedMasterType
     *        The instance type for a dedicated master node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ESPartitionInstanceType
     */

    public ElasticsearchClusterConfig withDedicatedMasterType(String dedicatedMasterType) {
        setDedicatedMasterType(dedicatedMasterType);
        return this;
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * 
     * @param dedicatedMasterType
     *        The instance type for a dedicated master node.
     * @see ESPartitionInstanceType
     */

    public void setDedicatedMasterType(ESPartitionInstanceType dedicatedMasterType) {
        withDedicatedMasterType(dedicatedMasterType);
    }

    /**
     * <p>
     * The instance type for a dedicated master node.
     * </p>
     * 
     * @param dedicatedMasterType
     *        The instance type for a dedicated master node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ESPartitionInstanceType
     */

    public ElasticsearchClusterConfig withDedicatedMasterType(ESPartitionInstanceType dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType.toString();
        return this;
    }

    /**
     * <p>
     * Total number of dedicated master nodes, active and on standby, for the cluster.
     * </p>
     * 
     * @param dedicatedMasterCount
     *        Total number of dedicated master nodes, active and on standby, for the cluster.
     */

    public void setDedicatedMasterCount(Integer dedicatedMasterCount) {
        this.dedicatedMasterCount = dedicatedMasterCount;
    }

    /**
     * <p>
     * Total number of dedicated master nodes, active and on standby, for the cluster.
     * </p>
     * 
     * @return Total number of dedicated master nodes, active and on standby, for the cluster.
     */

    public Integer getDedicatedMasterCount() {
        return this.dedicatedMasterCount;
    }

    /**
     * <p>
     * Total number of dedicated master nodes, active and on standby, for the cluster.
     * </p>
     * 
     * @param dedicatedMasterCount
     *        Total number of dedicated master nodes, active and on standby, for the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchClusterConfig withDedicatedMasterCount(Integer dedicatedMasterCount) {
        setDedicatedMasterCount(dedicatedMasterCount);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getDedicatedMasterEnabled() != null)
            sb.append("DedicatedMasterEnabled: ").append(getDedicatedMasterEnabled()).append(",");
        if (getZoneAwarenessEnabled() != null)
            sb.append("ZoneAwarenessEnabled: ").append(getZoneAwarenessEnabled()).append(",");
        if (getZoneAwarenessConfig() != null)
            sb.append("ZoneAwarenessConfig: ").append(getZoneAwarenessConfig()).append(",");
        if (getDedicatedMasterType() != null)
            sb.append("DedicatedMasterType: ").append(getDedicatedMasterType()).append(",");
        if (getDedicatedMasterCount() != null)
            sb.append("DedicatedMasterCount: ").append(getDedicatedMasterCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticsearchClusterConfig == false)
            return false;
        ElasticsearchClusterConfig other = (ElasticsearchClusterConfig) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getDedicatedMasterEnabled() == null ^ this.getDedicatedMasterEnabled() == null)
            return false;
        if (other.getDedicatedMasterEnabled() != null && other.getDedicatedMasterEnabled().equals(this.getDedicatedMasterEnabled()) == false)
            return false;
        if (other.getZoneAwarenessEnabled() == null ^ this.getZoneAwarenessEnabled() == null)
            return false;
        if (other.getZoneAwarenessEnabled() != null && other.getZoneAwarenessEnabled().equals(this.getZoneAwarenessEnabled()) == false)
            return false;
        if (other.getZoneAwarenessConfig() == null ^ this.getZoneAwarenessConfig() == null)
            return false;
        if (other.getZoneAwarenessConfig() != null && other.getZoneAwarenessConfig().equals(this.getZoneAwarenessConfig()) == false)
            return false;
        if (other.getDedicatedMasterType() == null ^ this.getDedicatedMasterType() == null)
            return false;
        if (other.getDedicatedMasterType() != null && other.getDedicatedMasterType().equals(this.getDedicatedMasterType()) == false)
            return false;
        if (other.getDedicatedMasterCount() == null ^ this.getDedicatedMasterCount() == null)
            return false;
        if (other.getDedicatedMasterCount() != null && other.getDedicatedMasterCount().equals(this.getDedicatedMasterCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getDedicatedMasterEnabled() == null) ? 0 : getDedicatedMasterEnabled().hashCode());
        hashCode = prime * hashCode + ((getZoneAwarenessEnabled() == null) ? 0 : getZoneAwarenessEnabled().hashCode());
        hashCode = prime * hashCode + ((getZoneAwarenessConfig() == null) ? 0 : getZoneAwarenessConfig().hashCode());
        hashCode = prime * hashCode + ((getDedicatedMasterType() == null) ? 0 : getDedicatedMasterType().hashCode());
        hashCode = prime * hashCode + ((getDedicatedMasterCount() == null) ? 0 : getDedicatedMasterCount().hashCode());
        return hashCode;
    }

    @Override
    public ElasticsearchClusterConfig clone() {
        try {
            return (ElasticsearchClusterConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.ElasticsearchClusterConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
