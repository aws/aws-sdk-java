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
 * details about the configuration of an OpenSearch cluster.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElasticsearchDomainElasticsearchClusterConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElasticsearchDomainElasticsearchClusterConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of instances to use for the master node. If this attribute is specified, then
     * <code>DedicatedMasterEnabled</code> must be <code>true</code>.
     * </p>
     */
    private Integer dedicatedMasterCount;
    /**
     * <p>
     * Whether to use a dedicated master node for the Elasticsearch domain. A dedicated master node performs cluster
     * management tasks, but doesn't hold data or respond to data upload requests.
     * </p>
     */
    private Boolean dedicatedMasterEnabled;
    /**
     * <p>
     * The hardware configuration of the computer that hosts the dedicated master node. A sample value is
     * <code>m3.medium.elasticsearch</code>. If this attribute is specified, then <code>DedicatedMasterEnabled</code>
     * must be <code>true</code>.
     * </p>
     * <p>
     * For a list of valid values, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     * >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     * Guide</i>.
     * </p>
     */
    private String dedicatedMasterType;
    /**
     * <p>
     * The number of data nodes to use in the Elasticsearch domain.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * The instance type for your data nodes. For example, <code>m3.medium.elasticsearch</code>.
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
     * Configuration options for zone awareness. Provided if <code>ZoneAwarenessEnabled</code> is <code>true</code>.
     * </p>
     */
    private AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails zoneAwarenessConfig;
    /**
     * <p>
     * Whether to enable zone awareness for the Elasticsearch domain. When zone awareness is enabled, OpenSearch
     * allocates the cluster's nodes and replica index shards across Availability Zones in the same Region. This
     * prevents data loss and minimizes downtime if a node or data center fails.
     * </p>
     */
    private Boolean zoneAwarenessEnabled;

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

    public AwsElasticsearchDomainElasticsearchClusterConfigDetails withDedicatedMasterCount(Integer dedicatedMasterCount) {
        setDedicatedMasterCount(dedicatedMasterCount);
        return this;
    }

    /**
     * <p>
     * Whether to use a dedicated master node for the Elasticsearch domain. A dedicated master node performs cluster
     * management tasks, but doesn't hold data or respond to data upload requests.
     * </p>
     * 
     * @param dedicatedMasterEnabled
     *        Whether to use a dedicated master node for the Elasticsearch domain. A dedicated master node performs
     *        cluster management tasks, but doesn't hold data or respond to data upload requests.
     */

    public void setDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
        this.dedicatedMasterEnabled = dedicatedMasterEnabled;
    }

    /**
     * <p>
     * Whether to use a dedicated master node for the Elasticsearch domain. A dedicated master node performs cluster
     * management tasks, but doesn't hold data or respond to data upload requests.
     * </p>
     * 
     * @return Whether to use a dedicated master node for the Elasticsearch domain. A dedicated master node performs
     *         cluster management tasks, but doesn't hold data or respond to data upload requests.
     */

    public Boolean getDedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled;
    }

    /**
     * <p>
     * Whether to use a dedicated master node for the Elasticsearch domain. A dedicated master node performs cluster
     * management tasks, but doesn't hold data or respond to data upload requests.
     * </p>
     * 
     * @param dedicatedMasterEnabled
     *        Whether to use a dedicated master node for the Elasticsearch domain. A dedicated master node performs
     *        cluster management tasks, but doesn't hold data or respond to data upload requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainElasticsearchClusterConfigDetails withDedicatedMasterEnabled(Boolean dedicatedMasterEnabled) {
        setDedicatedMasterEnabled(dedicatedMasterEnabled);
        return this;
    }

    /**
     * <p>
     * Whether to use a dedicated master node for the Elasticsearch domain. A dedicated master node performs cluster
     * management tasks, but doesn't hold data or respond to data upload requests.
     * </p>
     * 
     * @return Whether to use a dedicated master node for the Elasticsearch domain. A dedicated master node performs
     *         cluster management tasks, but doesn't hold data or respond to data upload requests.
     */

    public Boolean isDedicatedMasterEnabled() {
        return this.dedicatedMasterEnabled;
    }

    /**
     * <p>
     * The hardware configuration of the computer that hosts the dedicated master node. A sample value is
     * <code>m3.medium.elasticsearch</code>. If this attribute is specified, then <code>DedicatedMasterEnabled</code>
     * must be <code>true</code>.
     * </p>
     * <p>
     * For a list of valid values, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     * >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param dedicatedMasterType
     *        The hardware configuration of the computer that hosts the dedicated master node. A sample value is
     *        <code>m3.medium.elasticsearch</code>. If this attribute is specified, then
     *        <code>DedicatedMasterEnabled</code> must be <code>true</code>.</p>
     *        <p>
     *        For a list of valid values, see <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     *        >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     *        Guide</i>.
     */

    public void setDedicatedMasterType(String dedicatedMasterType) {
        this.dedicatedMasterType = dedicatedMasterType;
    }

    /**
     * <p>
     * The hardware configuration of the computer that hosts the dedicated master node. A sample value is
     * <code>m3.medium.elasticsearch</code>. If this attribute is specified, then <code>DedicatedMasterEnabled</code>
     * must be <code>true</code>.
     * </p>
     * <p>
     * For a list of valid values, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     * >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     * Guide</i>.
     * </p>
     * 
     * @return The hardware configuration of the computer that hosts the dedicated master node. A sample value is
     *         <code>m3.medium.elasticsearch</code>. If this attribute is specified, then
     *         <code>DedicatedMasterEnabled</code> must be <code>true</code>.</p>
     *         <p>
     *         For a list of valid values, see <a href=
     *         "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     *         >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     *         Guide</i>.
     */

    public String getDedicatedMasterType() {
        return this.dedicatedMasterType;
    }

    /**
     * <p>
     * The hardware configuration of the computer that hosts the dedicated master node. A sample value is
     * <code>m3.medium.elasticsearch</code>. If this attribute is specified, then <code>DedicatedMasterEnabled</code>
     * must be <code>true</code>.
     * </p>
     * <p>
     * For a list of valid values, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     * >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param dedicatedMasterType
     *        The hardware configuration of the computer that hosts the dedicated master node. A sample value is
     *        <code>m3.medium.elasticsearch</code>. If this attribute is specified, then
     *        <code>DedicatedMasterEnabled</code> must be <code>true</code>.</p>
     *        <p>
     *        For a list of valid values, see <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     *        >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainElasticsearchClusterConfigDetails withDedicatedMasterType(String dedicatedMasterType) {
        setDedicatedMasterType(dedicatedMasterType);
        return this;
    }

    /**
     * <p>
     * The number of data nodes to use in the Elasticsearch domain.
     * </p>
     * 
     * @param instanceCount
     *        The number of data nodes to use in the Elasticsearch domain.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of data nodes to use in the Elasticsearch domain.
     * </p>
     * 
     * @return The number of data nodes to use in the Elasticsearch domain.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of data nodes to use in the Elasticsearch domain.
     * </p>
     * 
     * @param instanceCount
     *        The number of data nodes to use in the Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainElasticsearchClusterConfigDetails withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * The instance type for your data nodes. For example, <code>m3.medium.elasticsearch</code>.
     * </p>
     * <p>
     * For a list of valid values, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     * >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type for your data nodes. For example, <code>m3.medium.elasticsearch</code>.</p>
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
     * The instance type for your data nodes. For example, <code>m3.medium.elasticsearch</code>.
     * </p>
     * <p>
     * For a list of valid values, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     * >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     * Guide</i>.
     * </p>
     * 
     * @return The instance type for your data nodes. For example, <code>m3.medium.elasticsearch</code>.</p>
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
     * The instance type for your data nodes. For example, <code>m3.medium.elasticsearch</code>.
     * </p>
     * <p>
     * For a list of valid values, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     * >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param instanceType
     *        The instance type for your data nodes. For example, <code>m3.medium.elasticsearch</code>.</p>
     *        <p>
     *        For a list of valid values, see <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/supported-instance-types.html"
     *        >Supported instance types in Amazon OpenSearch Service</a> in the <i>Amazon OpenSearch Service Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainElasticsearchClusterConfigDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
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

    public void setZoneAwarenessConfig(AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails zoneAwarenessConfig) {
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

    public AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails getZoneAwarenessConfig() {
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

    public AwsElasticsearchDomainElasticsearchClusterConfigDetails withZoneAwarenessConfig(
            AwsElasticsearchDomainElasticsearchClusterConfigZoneAwarenessConfigDetails zoneAwarenessConfig) {
        setZoneAwarenessConfig(zoneAwarenessConfig);
        return this;
    }

    /**
     * <p>
     * Whether to enable zone awareness for the Elasticsearch domain. When zone awareness is enabled, OpenSearch
     * allocates the cluster's nodes and replica index shards across Availability Zones in the same Region. This
     * prevents data loss and minimizes downtime if a node or data center fails.
     * </p>
     * 
     * @param zoneAwarenessEnabled
     *        Whether to enable zone awareness for the Elasticsearch domain. When zone awareness is enabled, OpenSearch
     *        allocates the cluster's nodes and replica index shards across Availability Zones in the same Region. This
     *        prevents data loss and minimizes downtime if a node or data center fails.
     */

    public void setZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
        this.zoneAwarenessEnabled = zoneAwarenessEnabled;
    }

    /**
     * <p>
     * Whether to enable zone awareness for the Elasticsearch domain. When zone awareness is enabled, OpenSearch
     * allocates the cluster's nodes and replica index shards across Availability Zones in the same Region. This
     * prevents data loss and minimizes downtime if a node or data center fails.
     * </p>
     * 
     * @return Whether to enable zone awareness for the Elasticsearch domain. When zone awareness is enabled, OpenSearch
     *         allocates the cluster's nodes and replica index shards across Availability Zones in the same Region. This
     *         prevents data loss and minimizes downtime if a node or data center fails.
     */

    public Boolean getZoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled;
    }

    /**
     * <p>
     * Whether to enable zone awareness for the Elasticsearch domain. When zone awareness is enabled, OpenSearch
     * allocates the cluster's nodes and replica index shards across Availability Zones in the same Region. This
     * prevents data loss and minimizes downtime if a node or data center fails.
     * </p>
     * 
     * @param zoneAwarenessEnabled
     *        Whether to enable zone awareness for the Elasticsearch domain. When zone awareness is enabled, OpenSearch
     *        allocates the cluster's nodes and replica index shards across Availability Zones in the same Region. This
     *        prevents data loss and minimizes downtime if a node or data center fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainElasticsearchClusterConfigDetails withZoneAwarenessEnabled(Boolean zoneAwarenessEnabled) {
        setZoneAwarenessEnabled(zoneAwarenessEnabled);
        return this;
    }

    /**
     * <p>
     * Whether to enable zone awareness for the Elasticsearch domain. When zone awareness is enabled, OpenSearch
     * allocates the cluster's nodes and replica index shards across Availability Zones in the same Region. This
     * prevents data loss and minimizes downtime if a node or data center fails.
     * </p>
     * 
     * @return Whether to enable zone awareness for the Elasticsearch domain. When zone awareness is enabled, OpenSearch
     *         allocates the cluster's nodes and replica index shards across Availability Zones in the same Region. This
     *         prevents data loss and minimizes downtime if a node or data center fails.
     */

    public Boolean isZoneAwarenessEnabled() {
        return this.zoneAwarenessEnabled;
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
        if (getDedicatedMasterCount() != null)
            sb.append("DedicatedMasterCount: ").append(getDedicatedMasterCount()).append(",");
        if (getDedicatedMasterEnabled() != null)
            sb.append("DedicatedMasterEnabled: ").append(getDedicatedMasterEnabled()).append(",");
        if (getDedicatedMasterType() != null)
            sb.append("DedicatedMasterType: ").append(getDedicatedMasterType()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getZoneAwarenessConfig() != null)
            sb.append("ZoneAwarenessConfig: ").append(getZoneAwarenessConfig()).append(",");
        if (getZoneAwarenessEnabled() != null)
            sb.append("ZoneAwarenessEnabled: ").append(getZoneAwarenessEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElasticsearchDomainElasticsearchClusterConfigDetails == false)
            return false;
        AwsElasticsearchDomainElasticsearchClusterConfigDetails other = (AwsElasticsearchDomainElasticsearchClusterConfigDetails) obj;
        if (other.getDedicatedMasterCount() == null ^ this.getDedicatedMasterCount() == null)
            return false;
        if (other.getDedicatedMasterCount() != null && other.getDedicatedMasterCount().equals(this.getDedicatedMasterCount()) == false)
            return false;
        if (other.getDedicatedMasterEnabled() == null ^ this.getDedicatedMasterEnabled() == null)
            return false;
        if (other.getDedicatedMasterEnabled() != null && other.getDedicatedMasterEnabled().equals(this.getDedicatedMasterEnabled()) == false)
            return false;
        if (other.getDedicatedMasterType() == null ^ this.getDedicatedMasterType() == null)
            return false;
        if (other.getDedicatedMasterType() != null && other.getDedicatedMasterType().equals(this.getDedicatedMasterType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getZoneAwarenessConfig() == null ^ this.getZoneAwarenessConfig() == null)
            return false;
        if (other.getZoneAwarenessConfig() != null && other.getZoneAwarenessConfig().equals(this.getZoneAwarenessConfig()) == false)
            return false;
        if (other.getZoneAwarenessEnabled() == null ^ this.getZoneAwarenessEnabled() == null)
            return false;
        if (other.getZoneAwarenessEnabled() != null && other.getZoneAwarenessEnabled().equals(this.getZoneAwarenessEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDedicatedMasterCount() == null) ? 0 : getDedicatedMasterCount().hashCode());
        hashCode = prime * hashCode + ((getDedicatedMasterEnabled() == null) ? 0 : getDedicatedMasterEnabled().hashCode());
        hashCode = prime * hashCode + ((getDedicatedMasterType() == null) ? 0 : getDedicatedMasterType().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getZoneAwarenessConfig() == null) ? 0 : getZoneAwarenessConfig().hashCode());
        hashCode = prime * hashCode + ((getZoneAwarenessEnabled() == null) ? 0 : getZoneAwarenessEnabled().hashCode());
        return hashCode;
    }

    @Override
    public AwsElasticsearchDomainElasticsearchClusterConfigDetails clone() {
        try {
            return (AwsElasticsearchDomainElasticsearchClusterConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElasticsearchDomainElasticsearchClusterConfigDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
