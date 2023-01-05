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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details about the configuration of an OpenSearch cluster.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsOpenSearchServiceDomainClusterConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsOpenSearchServiceDomainClusterConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of data nodes to use in the OpenSearch domain.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * Whether UltraWarm is enabled.
     * </p>
     */
    private Boolean warmEnabled;
    /**
     * <p>
     * The number of UltraWarm instances.
     * </p>
     */
    private Integer warmCount;
    /**
     * <p>
     * Whether to use a dedicated master node for the OpenSearch domain. A dedicated master node performs cluster
     * management tasks, but does not hold data or respond to data upload requests.
     * </p>
     */
    private Boolean dedicatedMasterEnabled;
    /**
     * <p>
     * Configuration options for zone awareness. Provided if <code>ZoneAwarenessEnabled</code> is <code>true</code>.
     * </p>
     */
    private AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails zoneAwarenessConfig;
    /**
     * <p>
     * The number of instances to use for the master node. If this attribute is specified, then
     * <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     * </p>
     */
    private Integer dedicatedMasterCount;
    /**
     * <p>
     * The instance type for your data nodes.
     * </p>
     * <p>
     * For a list of valid values, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     * >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     * Guide</i>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The type of UltraWarm instance.
     * </p>
     */
    private String warmType;
    /**
     * <p>
     * Whether to enable zone awareness for the OpenSearch domain. When zone awareness is enabled, OpenSearch Service
     * allocates the cluster's nodes and replica index shards across Availability Zones (AZs) in the same Region. This
     * prevents data loss and minimizes downtime if a node or data center fails.
     * </p>
     */
    private Boolean zoneAwarenessEnabled;
    /**
     * <p>
     * The hardware configuration of the computer that hosts the dedicated master node.
     * </p>
     * <p>
     * If this attribute is specified, then <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     * </p>
     */
    private String dedicatedMasterType;

    /**
     * <p>
     * The number of data nodes to use in the OpenSearch domain.
     * </p>
     * 
     * @param instanceCount
     *        The number of data nodes to use in the OpenSearch domain.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of data nodes to use in the OpenSearch domain.
     * </p>
     * 
     * @return The number of data nodes to use in the OpenSearch domain.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of data nodes to use in the OpenSearch domain.
     * </p>
     * 
     * @param instanceCount
     *        The number of data nodes to use in the OpenSearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainClusterConfigDetails withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * Whether UltraWarm is enabled.
     * </p>
     * 
     * @param warmEnabled
     *        Whether UltraWarm is enabled.
     */

    public void setWarmEnabled(Boolean warmEnabled) {
        this.warmEnabled = warmEnabled;
    }

    /**
     * <p>
     * Whether UltraWarm is enabled.
     * </p>
     * 
     * @return Whether UltraWarm is enabled.
     */

    public Boolean getWarmEnabled() {
        return this.warmEnabled;
    }

    /**
     * <p>
     * Whether UltraWarm is enabled.
     * </p>
     * 
     * @param warmEnabled
     *        Whether UltraWarm is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainClusterConfigDetails withWarmEnabled(Boolean warmEnabled) {
        setWarmEnabled(warmEnabled);
        return this;
    }

    /**
     * <p>
     * Whether UltraWarm is enabled.
     * </p>
     * 
     * @return Whether UltraWarm is enabled.
     */

    public Boolean isWarmEnabled() {
        return this.warmEnabled;
    }

    /**
     * <p>
     * The number of UltraWarm instances.
     * </p>
     * 
     * @param warmCount
     *        The number of UltraWarm instances.
     */

    public void setWarmCount(Integer warmCount) {
        this.warmCount = warmCount;
    }

    /**
     * <p>
     * The number of UltraWarm instances.
     * </p>
     * 
     * @return The number of UltraWarm instances.
     */

    public Integer getWarmCount() {
        return this.warmCount;
    }

    /**
     * <p>
     * The number of UltraWarm instances.
     * </p>
     * 
     * @param warmCount
     *        The number of UltraWarm instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainClusterConfigDetails withWarmCount(Integer warmCount) {
        setWarmCount(warmCount);
        return this;
    }

    /**
     * <p>
     * Whether to use a dedicated master node for the OpenSearch domain. A dedicated master node performs cluster
     * management tasks, but does not hold data or respond to data upload requests.
     * </p>
     * 
     * @param dedicatedMasterEnabled
     *        Whether to use a dedicated master node for the OpenSearch domain. A dedicated master node performs cluster
     *        management tasks, but does not hold data or respond to data upload requests.
     */

    public void setDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
    }

    /**
     * <p>
     * Whether to use a dedicated master node for the OpenSearch domain. A dedicated master node performs cluster
     * management tasks, but does not hold data or respond to data upload requests.
     * </p>
     * 
     * @return Whether to use a dedicated master node for the OpenSearch domain. A dedicated master node performs
     *         cluster management tasks, but does not hold data or respond to data upload requests.
     */

    public Boolean getDedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled;
    }

    /**
     * <p>
     * Whether to use a dedicated master node for the OpenSearch domain. A dedicated master node performs cluster
     * management tasks, but does not hold data or respond to data upload requests.
     * </p>
     * 
     * @param dedicatedMasterEnabled
     *        Whether to use a dedicated master node for the OpenSearch domain. A dedicated master node performs cluster
     *        management tasks, but does not hold data or respond to data upload requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainClusterConfigDetails withDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
        setDedicatedMasterEnabled(dedicatedMasterEnabled);
        return this;
    }

    /**
     * <p>
     * Whether to use a dedicated master node for the OpenSearch domain. A dedicated master node performs cluster
     * management tasks, but does not hold data or respond to data upload requests.
     * </p>
     * 
     * @return Whether to use a dedicated master node for the OpenSearch domain. A dedicated master node performs
     *         cluster management tasks, but does not hold data or respond to data upload requests.
     */

    public Boolean isDedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled;
    }

    /**
     * <p>
     * Configuration options for zone awareness. Provided if <code>ZoneAwarenessEnabled</code> is <code>true</code>.
     * </p>
     * 
     * @param zoneAwarenessConfig
     *        Configuration options for zone awareness. Provided if <code>ZoneAwarenessEnabled</code> is
     *        <code>true</code>.
     */

    public void setZoneAwarenessConfig(AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails zoneAwarenessConfig) {
        this.zoneAwarenessConfig = zoneAwarenessConfig;
    }

    /**
     * <p>
     * Configuration options for zone awareness. Provided if <code>ZoneAwarenessEnabled</code> is <code>true</code>.
     * </p>
     * 
     * @return Configuration options for zone awareness. Provided if <code>ZoneAwarenessEnabled</code> is
     *         <code>true</code>.
     */

    public AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails getZoneAwarenessConfig() {
        return this.zoneAwarenessConfig;
    }

    /**
     * <p>
     * Configuration options for zone awareness. Provided if <code>ZoneAwarenessEnabled</code> is <code>true</code>.
     * </p>
     * 
     * @param zoneAwarenessConfig
     *        Configuration options for zone awareness. Provided if <code>ZoneAwarenessEnabled</code> is
     *        <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainClusterConfigDetails withZoneAwarenessConfig(
            AwsOpenSearchServiceDomainClusterConfigZoneAwarenessConfigDetails zoneAwarenessConfig) {
        setZoneAwarenessConfig(zoneAwarenessConfig);
        return this;
    }

    /**
     * <p>
     * The number of instances to use for the master node. If this attribute is specified, then
     * <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     * </p>
     * 
     * @param dedicatedMasterCount
     *        The number of instances to use for the master node. If this attribute is specified, then
     *        <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     */

    public void setDedicatedMasterCount(Integer dedicatedMasterCount) {
        this.dedicatedMasterCount = dedicatedMasterCount;
    }

    /**
     * <p>
     * The number of instances to use for the master node. If this attribute is specified, then
     * <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     * </p>
     * 
     * @return The number of instances to use for the master node. If this attribute is specified, then
     *         <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     */

    public Integer getDedicatedMasterCount() {
        return this.dedicatedMasterCount;
    }

    /**
     * <p>
     * The number of instances to use for the master node. If this attribute is specified, then
     * <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     * </p>
     * 
     * @param dedicatedMasterCount
     *        The number of instances to use for the master node. If this attribute is specified, then
     *        <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainClusterConfigDetails withDedicatedMasterCount(Integer dedicatedMasterCount) {
        setDedicatedMasterCount(dedicatedMasterCount);
        return this;
    }

    /**
     * <p>
     * The instance type for your data nodes.
     * </p>
     * <p>
     * For a list of valid values, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     * >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type for your data nodes.</p>
     *        <p>
     *        For a list of valid values, see <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     *        >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     *        Guide</i>.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type for your data nodes.
     * </p>
     * <p>
     * For a list of valid values, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     * >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     * Guide</i>.
     * </p>
     * 
     * @return The instance type for your data nodes.</p>
     *         <p>
     *         For a list of valid values, see <a href=
     *         "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     *         >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     *         Guide</i>.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type for your data nodes.
     * </p>
     * <p>
     * For a list of valid values, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     * >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type for your data nodes.</p>
     *        <p>
     *        For a list of valid values, see <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     *        >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainClusterConfigDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The type of UltraWarm instance.
     * </p>
     * 
     * @param warmType
     *        The type of UltraWarm instance.
     */

    public void setWarmType(String warmType) {
        this.warmType = warmType;
    }

    /**
     * <p>
     * The type of UltraWarm instance.
     * </p>
     * 
     * @return The type of UltraWarm instance.
     */

    public String getWarmType() {
        return this.warmType;
    }

    /**
     * <p>
     * The type of UltraWarm instance.
     * </p>
     * 
     * @param warmType
     *        The type of UltraWarm instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainClusterConfigDetails withWarmType(String warmType) {
        setWarmType(warmType);
        return this;
    }

    /**
     * <p>
     * Whether to enable zone awareness for the OpenSearch domain. When zone awareness is enabled, OpenSearch Service
     * allocates the cluster's nodes and replica index shards across Availability Zones (AZs) in the same Region. This
     * prevents data loss and minimizes downtime if a node or data center fails.
     * </p>
     * 
     * @param zoneAwarenessEnabled
     *        Whether to enable zone awareness for the OpenSearch domain. When zone awareness is enabled, OpenSearch
     *        Service allocates the cluster's nodes and replica index shards across Availability Zones (AZs) in the same
     *        Region. This prevents data loss and minimizes downtime if a node or data center fails.
     */

    public void setZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    }

    /**
     * <p>
     * Whether to enable zone awareness for the OpenSearch domain. When zone awareness is enabled, OpenSearch Service
     * allocates the cluster's nodes and replica index shards across Availability Zones (AZs) in the same Region. This
     * prevents data loss and minimizes downtime if a node or data center fails.
     * </p>
     * 
     * @return Whether to enable zone awareness for the OpenSearch domain. When zone awareness is enabled, OpenSearch
     *         Service allocates the cluster's nodes and replica index shards across Availability Zones (AZs) in the
     *         same Region. This prevents data loss and minimizes downtime if a node or data center fails.
     */

    public Boolean getZoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled;
    }

    /**
     * <p>
     * Whether to enable zone awareness for the OpenSearch domain. When zone awareness is enabled, OpenSearch Service
     * allocates the cluster's nodes and replica index shards across Availability Zones (AZs) in the same Region. This
     * prevents data loss and minimizes downtime if a node or data center fails.
     * </p>
     * 
     * @param zoneAwarenessEnabled
     *        Whether to enable zone awareness for the OpenSearch domain. When zone awareness is enabled, OpenSearch
     *        Service allocates the cluster's nodes and replica index shards across Availability Zones (AZs) in the same
     *        Region. This prevents data loss and minimizes downtime if a node or data center fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainClusterConfigDetails withZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
        setZoneAwarenessEnabled(zoneAwarenessEnabled);
        return this;
    }

    /**
     * <p>
     * Whether to enable zone awareness for the OpenSearch domain. When zone awareness is enabled, OpenSearch Service
     * allocates the cluster's nodes and replica index shards across Availability Zones (AZs) in the same Region. This
     * prevents data loss and minimizes downtime if a node or data center fails.
     * </p>
     * 
     * @return Whether to enable zone awareness for the OpenSearch domain. When zone awareness is enabled, OpenSearch
     *         Service allocates the cluster's nodes and replica index shards across Availability Zones (AZs) in the
     *         same Region. This prevents data loss and minimizes downtime if a node or data center fails.
     */

    public Boolean isZoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled;
    }

    /**
     * <p>
     * The hardware configuration of the computer that hosts the dedicated master node.
     * </p>
     * <p>
     * If this attribute is specified, then <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     * </p>
     * 
     * @param dedicatedMasterType
     *        The hardware configuration of the computer that hosts the dedicated master node.</p>
     *        <p>
     *        If this attribute is specified, then <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     */

    public void setDedicatedMasterType(String dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType;
    }

    /**
     * <p>
     * The hardware configuration of the computer that hosts the dedicated master node.
     * </p>
     * <p>
     * If this attribute is specified, then <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     * </p>
     * 
     * @return The hardware configuration of the computer that hosts the dedicated master node.</p>
     *         <p>
     *         If this attribute is specified, then <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     */

    public String getDedicatedMasterType() {
        return this.dedicatedMasterType;
    }

    /**
     * <p>
     * The hardware configuration of the computer that hosts the dedicated master node.
     * </p>
     * <p>
     * If this attribute is specified, then <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     * </p>
     * 
     * @param dedicatedMasterType
     *        The hardware configuration of the computer that hosts the dedicated master node.</p>
     *        <p>
     *        If this attribute is specified, then <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainClusterConfigDetails withDedicatedMasterType(String dedicatedMasterType) {
        setDedicatedMasterType(dedicatedMasterType);
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
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getWarmEnabled() != null)
            sb.append("WarmEnabled: ").append(getWarmEnabled()).append(",");
        if (getWarmCount() != null)
            sb.append("WarmCount: ").append(getWarmCount()).append(",");
        if (getDedicatedMasterEnabled() != null)
            sb.append("DedicatedMasterEnabled: ").append(getDedicatedMasterEnabled()).append(",");
        if (getZoneAwarenessConfig() != null)
            sb.append("ZoneAwarenessConfig: ").append(getZoneAwarenessConfig()).append(",");
        if (getDedicatedMasterCount() != null)
            sb.append("DedicatedMasterCount: ").append(getDedicatedMasterCount()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getWarmType() != null)
            sb.append("WarmType: ").append(getWarmType()).append(",");
        if (getZoneAwarenessEnabled() != null)
            sb.append("ZoneAwarenessEnabled: ").append(getZoneAwarenessEnabled()).append(",");
        if (getDedicatedMasterType() != null)
            sb.append("DedicatedMasterType: ").append(getDedicatedMasterType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsOpenSearchServiceDomainClusterConfigDetails == false)
            return false;
        AwsOpenSearchServiceDomainClusterConfigDetails other = (AwsOpenSearchServiceDomainClusterConfigDetails) obj;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getWarmEnabled() == null ^ this.getWarmEnabled() == null)
            return false;
        if (other.getWarmEnabled() != null && other.getWarmEnabled().equals(this.getWarmEnabled()) == false)
            return false;
        if (other.getWarmCount() == null ^ this.getWarmCount() == null)
            return false;
        if (other.getWarmCount() != null && other.getWarmCount().equals(this.getWarmCount()) == false)
            return false;
        if (other.getDedicatedMasterEnabled() == null ^ this.getDedicatedMasterEnabled() == null)
            return false;
        if (other.getDedicatedMasterEnabled() != null && other.getDedicatedMasterEnabled().equals(this.getDedicatedMasterEnabled()) == false)
            return false;
        if (other.getZoneAwarenessConfig() == null ^ this.getZoneAwarenessConfig() == null)
            return false;
        if (other.getZoneAwarenessConfig() != null && other.getZoneAwarenessConfig().equals(this.getZoneAwarenessConfig()) == false)
            return false;
        if (other.getDedicatedMasterCount() == null ^ this.getDedicatedMasterCount() == null)
            return false;
        if (other.getDedicatedMasterCount() != null && other.getDedicatedMasterCount().equals(this.getDedicatedMasterCount()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getWarmType() == null ^ this.getWarmType() == null)
            return false;
        if (other.getWarmType() != null && other.getWarmType().equals(this.getWarmType()) == false)
            return false;
        if (other.getZoneAwarenessEnabled() == null ^ this.getZoneAwarenessEnabled() == null)
            return false;
        if (other.getZoneAwarenessEnabled() != null && other.getZoneAwarenessEnabled().equals(this.getZoneAwarenessEnabled()) == false)
            return false;
        if (other.getDedicatedMasterType() == null ^ this.getDedicatedMasterType() == null)
            return false;
        if (other.getDedicatedMasterType() != null && other.getDedicatedMasterType().equals(this.getDedicatedMasterType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getWarmEnabled() == null) ? 0 : getWarmEnabled().hashCode());
        hashCode = prime * hashCode + ((getWarmCount() == null) ? 0 : getWarmCount().hashCode());
        hashCode = prime * hashCode + ((getDedicatedMasterEnabled() == null) ? 0 : getDedicatedMasterEnabled().hashCode());
        hashCode = prime * hashCode + ((getZoneAwarenessConfig() == null) ? 0 : getZoneAwarenessConfig().hashCode());
        hashCode = prime * hashCode + ((getDedicatedMasterCount() == null) ? 0 : getDedicatedMasterCount().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getWarmType() == null) ? 0 : getWarmType().hashCode());
        hashCode = prime * hashCode + ((getZoneAwarenessEnabled() == null) ? 0 : getZoneAwarenessEnabled().hashCode());
        hashCode = prime * hashCode + ((getDedicatedMasterType() == null) ? 0 : getDedicatedMasterType().hashCode());
        return hashCode;
    }

    @Override
    public AwsOpenSearchServiceDomainClusterConfigDetails clone() {
        try {
            return (AwsOpenSearchServiceDomainClusterConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsOpenSearchServiceDomainClusterConfigDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
