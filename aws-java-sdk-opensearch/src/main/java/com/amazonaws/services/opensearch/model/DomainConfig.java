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
package com.amazonaws.services.opensearch.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Container for the configuration of an OpenSearch Service domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The OpenSearch or Elasticsearch version that the domain is running.
     * </p>
     */
    private VersionStatus engineVersion;
    /**
     * <p>
     * Container for the cluster configuration of a the domain.
     * </p>
     */
    private ClusterConfigStatus clusterConfig;
    /**
     * <p>
     * Container for EBS options configured for an OpenSearch Service domain.
     * </p>
     */
    private EBSOptionsStatus eBSOptions;
    /**
     * <p>
     * Specifies the access policies for the domain.
     * </p>
     */
    private AccessPoliciesStatus accessPolicies;
    /**
     * <p>
     * DEPRECATED. Container for parameters required to configure automated snapshots of domain indexes.
     * </p>
     */
    private SnapshotOptionsStatus snapshotOptions;
    /**
     * <p>
     * The current VPC options for the domain and the status of any updates to their configuration.
     * </p>
     */
    private VPCDerivedInfoStatus vPCOptions;
    /**
     * <p>
     * Container for Amazon Cognito options for the domain.
     * </p>
     */
    private CognitoOptionsStatus cognitoOptions;
    /**
     * <p>
     * Key-value pairs to enable encryption at rest.
     * </p>
     */
    private EncryptionAtRestOptionsStatus encryptionAtRestOptions;
    /**
     * <p>
     * Whether node-to-node encryption is enabled or disabled.
     * </p>
     */
    private NodeToNodeEncryptionOptionsStatus nodeToNodeEncryptionOptions;
    /**
     * <p>
     * Key-value pairs to specify advanced configuration options. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * >Advanced options</a>.
     * </p>
     */
    private AdvancedOptionsStatus advancedOptions;
    /**
     * <p>
     * Key-value pairs to configure slow log publishing.
     * </p>
     */
    private LogPublishingOptionsStatus logPublishingOptions;
    /**
     * <p>
     * Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
     * </p>
     */
    private DomainEndpointOptionsStatus domainEndpointOptions;
    /**
     * <p>
     * Container for fine-grained access control settings for the domain.
     * </p>
     */
    private AdvancedSecurityOptionsStatus advancedSecurityOptions;
    /**
     * <p>
     * Container for Auto-Tune settings for the domain.
     * </p>
     */
    private AutoTuneOptionsStatus autoTuneOptions;
    /**
     * <p>
     * Container for information about the progress of an existing configuration change.
     * </p>
     */
    private ChangeProgressDetails changeProgressDetails;

    /**
     * <p>
     * The OpenSearch or Elasticsearch version that the domain is running.
     * </p>
     * 
     * @param engineVersion
     *        The OpenSearch or Elasticsearch version that the domain is running.
     */

    public void setEngineVersion(VersionStatus engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The OpenSearch or Elasticsearch version that the domain is running.
     * </p>
     * 
     * @return The OpenSearch or Elasticsearch version that the domain is running.
     */

    public VersionStatus getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The OpenSearch or Elasticsearch version that the domain is running.
     * </p>
     * 
     * @param engineVersion
     *        The OpenSearch or Elasticsearch version that the domain is running.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withEngineVersion(VersionStatus engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Container for the cluster configuration of a the domain.
     * </p>
     * 
     * @param clusterConfig
     *        Container for the cluster configuration of a the domain.
     */

    public void setClusterConfig(ClusterConfigStatus clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    /**
     * <p>
     * Container for the cluster configuration of a the domain.
     * </p>
     * 
     * @return Container for the cluster configuration of a the domain.
     */

    public ClusterConfigStatus getClusterConfig() {
        return this.clusterConfig;
    }

    /**
     * <p>
     * Container for the cluster configuration of a the domain.
     * </p>
     * 
     * @param clusterConfig
     *        Container for the cluster configuration of a the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withClusterConfig(ClusterConfigStatus clusterConfig) {
        setClusterConfig(clusterConfig);
        return this;
    }

    /**
     * <p>
     * Container for EBS options configured for an OpenSearch Service domain.
     * </p>
     * 
     * @param eBSOptions
     *        Container for EBS options configured for an OpenSearch Service domain.
     */

    public void setEBSOptions(EBSOptionsStatus eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    /**
     * <p>
     * Container for EBS options configured for an OpenSearch Service domain.
     * </p>
     * 
     * @return Container for EBS options configured for an OpenSearch Service domain.
     */

    public EBSOptionsStatus getEBSOptions() {
        return this.eBSOptions;
    }

    /**
     * <p>
     * Container for EBS options configured for an OpenSearch Service domain.
     * </p>
     * 
     * @param eBSOptions
     *        Container for EBS options configured for an OpenSearch Service domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withEBSOptions(EBSOptionsStatus eBSOptions) {
        setEBSOptions(eBSOptions);
        return this;
    }

    /**
     * <p>
     * Specifies the access policies for the domain.
     * </p>
     * 
     * @param accessPolicies
     *        Specifies the access policies for the domain.
     */

    public void setAccessPolicies(AccessPoliciesStatus accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * Specifies the access policies for the domain.
     * </p>
     * 
     * @return Specifies the access policies for the domain.
     */

    public AccessPoliciesStatus getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * <p>
     * Specifies the access policies for the domain.
     * </p>
     * 
     * @param accessPolicies
     *        Specifies the access policies for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withAccessPolicies(AccessPoliciesStatus accessPolicies) {
        setAccessPolicies(accessPolicies);
        return this;
    }

    /**
     * <p>
     * DEPRECATED. Container for parameters required to configure automated snapshots of domain indexes.
     * </p>
     * 
     * @param snapshotOptions
     *        DEPRECATED. Container for parameters required to configure automated snapshots of domain indexes.
     */

    public void setSnapshotOptions(SnapshotOptionsStatus snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    /**
     * <p>
     * DEPRECATED. Container for parameters required to configure automated snapshots of domain indexes.
     * </p>
     * 
     * @return DEPRECATED. Container for parameters required to configure automated snapshots of domain indexes.
     */

    public SnapshotOptionsStatus getSnapshotOptions() {
        return this.snapshotOptions;
    }

    /**
     * <p>
     * DEPRECATED. Container for parameters required to configure automated snapshots of domain indexes.
     * </p>
     * 
     * @param snapshotOptions
     *        DEPRECATED. Container for parameters required to configure automated snapshots of domain indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withSnapshotOptions(SnapshotOptionsStatus snapshotOptions) {
        setSnapshotOptions(snapshotOptions);
        return this;
    }

    /**
     * <p>
     * The current VPC options for the domain and the status of any updates to their configuration.
     * </p>
     * 
     * @param vPCOptions
     *        The current VPC options for the domain and the status of any updates to their configuration.
     */

    public void setVPCOptions(VPCDerivedInfoStatus vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    /**
     * <p>
     * The current VPC options for the domain and the status of any updates to their configuration.
     * </p>
     * 
     * @return The current VPC options for the domain and the status of any updates to their configuration.
     */

    public VPCDerivedInfoStatus getVPCOptions() {
        return this.vPCOptions;
    }

    /**
     * <p>
     * The current VPC options for the domain and the status of any updates to their configuration.
     * </p>
     * 
     * @param vPCOptions
     *        The current VPC options for the domain and the status of any updates to their configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withVPCOptions(VPCDerivedInfoStatus vPCOptions) {
        setVPCOptions(vPCOptions);
        return this;
    }

    /**
     * <p>
     * Container for Amazon Cognito options for the domain.
     * </p>
     * 
     * @param cognitoOptions
     *        Container for Amazon Cognito options for the domain.
     */

    public void setCognitoOptions(CognitoOptionsStatus cognitoOptions) {
        this.cognitoOptions = cognitoOptions;
    }

    /**
     * <p>
     * Container for Amazon Cognito options for the domain.
     * </p>
     * 
     * @return Container for Amazon Cognito options for the domain.
     */

    public CognitoOptionsStatus getCognitoOptions() {
        return this.cognitoOptions;
    }

    /**
     * <p>
     * Container for Amazon Cognito options for the domain.
     * </p>
     * 
     * @param cognitoOptions
     *        Container for Amazon Cognito options for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withCognitoOptions(CognitoOptionsStatus cognitoOptions) {
        setCognitoOptions(cognitoOptions);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to enable encryption at rest.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Key-value pairs to enable encryption at rest.
     */

    public void setEncryptionAtRestOptions(EncryptionAtRestOptionsStatus encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Key-value pairs to enable encryption at rest.
     * </p>
     * 
     * @return Key-value pairs to enable encryption at rest.
     */

    public EncryptionAtRestOptionsStatus getEncryptionAtRestOptions() {
        return this.encryptionAtRestOptions;
    }

    /**
     * <p>
     * Key-value pairs to enable encryption at rest.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Key-value pairs to enable encryption at rest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withEncryptionAtRestOptions(EncryptionAtRestOptionsStatus encryptionAtRestOptions) {
        setEncryptionAtRestOptions(encryptionAtRestOptions);
        return this;
    }

    /**
     * <p>
     * Whether node-to-node encryption is enabled or disabled.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Whether node-to-node encryption is enabled or disabled.
     */

    public void setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsStatus nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Whether node-to-node encryption is enabled or disabled.
     * </p>
     * 
     * @return Whether node-to-node encryption is enabled or disabled.
     */

    public NodeToNodeEncryptionOptionsStatus getNodeToNodeEncryptionOptions() {
        return this.nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Whether node-to-node encryption is enabled or disabled.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Whether node-to-node encryption is enabled or disabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptionsStatus nodeToNodeEncryptionOptions) {
        setNodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to specify advanced configuration options. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * >Advanced options</a>.
     * </p>
     * 
     * @param advancedOptions
     *        Key-value pairs to specify advanced configuration options. For more information, see <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     *        >Advanced options</a>.
     */

    public void setAdvancedOptions(AdvancedOptionsStatus advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * <p>
     * Key-value pairs to specify advanced configuration options. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * >Advanced options</a>.
     * </p>
     * 
     * @return Key-value pairs to specify advanced configuration options. For more information, see <a href=
     *         "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     *         >Advanced options</a>.
     */

    public AdvancedOptionsStatus getAdvancedOptions() {
        return this.advancedOptions;
    }

    /**
     * <p>
     * Key-value pairs to specify advanced configuration options. For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * >Advanced options</a>.
     * </p>
     * 
     * @param advancedOptions
     *        Key-value pairs to specify advanced configuration options. For more information, see <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     *        >Advanced options</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withAdvancedOptions(AdvancedOptionsStatus advancedOptions) {
        setAdvancedOptions(advancedOptions);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to configure slow log publishing.
     * </p>
     * 
     * @param logPublishingOptions
     *        Key-value pairs to configure slow log publishing.
     */

    public void setLogPublishingOptions(LogPublishingOptionsStatus logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
    }

    /**
     * <p>
     * Key-value pairs to configure slow log publishing.
     * </p>
     * 
     * @return Key-value pairs to configure slow log publishing.
     */

    public LogPublishingOptionsStatus getLogPublishingOptions() {
        return this.logPublishingOptions;
    }

    /**
     * <p>
     * Key-value pairs to configure slow log publishing.
     * </p>
     * 
     * @param logPublishingOptions
     *        Key-value pairs to configure slow log publishing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withLogPublishingOptions(LogPublishingOptionsStatus logPublishingOptions) {
        setLogPublishingOptions(logPublishingOptions);
        return this;
    }

    /**
     * <p>
     * Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
     * </p>
     * 
     * @param domainEndpointOptions
     *        Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
     */

    public void setDomainEndpointOptions(DomainEndpointOptionsStatus domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
    }

    /**
     * <p>
     * Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
     * </p>
     * 
     * @return Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
     */

    public DomainEndpointOptionsStatus getDomainEndpointOptions() {
        return this.domainEndpointOptions;
    }

    /**
     * <p>
     * Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
     * </p>
     * 
     * @param domainEndpointOptions
     *        Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withDomainEndpointOptions(DomainEndpointOptionsStatus domainEndpointOptions) {
        setDomainEndpointOptions(domainEndpointOptions);
        return this;
    }

    /**
     * <p>
     * Container for fine-grained access control settings for the domain.
     * </p>
     * 
     * @param advancedSecurityOptions
     *        Container for fine-grained access control settings for the domain.
     */

    public void setAdvancedSecurityOptions(AdvancedSecurityOptionsStatus advancedSecurityOptions) {
        this.advancedSecurityOptions = advancedSecurityOptions;
    }

    /**
     * <p>
     * Container for fine-grained access control settings for the domain.
     * </p>
     * 
     * @return Container for fine-grained access control settings for the domain.
     */

    public AdvancedSecurityOptionsStatus getAdvancedSecurityOptions() {
        return this.advancedSecurityOptions;
    }

    /**
     * <p>
     * Container for fine-grained access control settings for the domain.
     * </p>
     * 
     * @param advancedSecurityOptions
     *        Container for fine-grained access control settings for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withAdvancedSecurityOptions(AdvancedSecurityOptionsStatus advancedSecurityOptions) {
        setAdvancedSecurityOptions(advancedSecurityOptions);
        return this;
    }

    /**
     * <p>
     * Container for Auto-Tune settings for the domain.
     * </p>
     * 
     * @param autoTuneOptions
     *        Container for Auto-Tune settings for the domain.
     */

    public void setAutoTuneOptions(AutoTuneOptionsStatus autoTuneOptions) {
        this.autoTuneOptions = autoTuneOptions;
    }

    /**
     * <p>
     * Container for Auto-Tune settings for the domain.
     * </p>
     * 
     * @return Container for Auto-Tune settings for the domain.
     */

    public AutoTuneOptionsStatus getAutoTuneOptions() {
        return this.autoTuneOptions;
    }

    /**
     * <p>
     * Container for Auto-Tune settings for the domain.
     * </p>
     * 
     * @param autoTuneOptions
     *        Container for Auto-Tune settings for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withAutoTuneOptions(AutoTuneOptionsStatus autoTuneOptions) {
        setAutoTuneOptions(autoTuneOptions);
        return this;
    }

    /**
     * <p>
     * Container for information about the progress of an existing configuration change.
     * </p>
     * 
     * @param changeProgressDetails
     *        Container for information about the progress of an existing configuration change.
     */

    public void setChangeProgressDetails(ChangeProgressDetails changeProgressDetails) {
        this.changeProgressDetails = changeProgressDetails;
    }

    /**
     * <p>
     * Container for information about the progress of an existing configuration change.
     * </p>
     * 
     * @return Container for information about the progress of an existing configuration change.
     */

    public ChangeProgressDetails getChangeProgressDetails() {
        return this.changeProgressDetails;
    }

    /**
     * <p>
     * Container for information about the progress of an existing configuration change.
     * </p>
     * 
     * @param changeProgressDetails
     *        Container for information about the progress of an existing configuration change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainConfig withChangeProgressDetails(ChangeProgressDetails changeProgressDetails) {
        setChangeProgressDetails(changeProgressDetails);
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
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getClusterConfig() != null)
            sb.append("ClusterConfig: ").append(getClusterConfig()).append(",");
        if (getEBSOptions() != null)
            sb.append("EBSOptions: ").append(getEBSOptions()).append(",");
        if (getAccessPolicies() != null)
            sb.append("AccessPolicies: ").append(getAccessPolicies()).append(",");
        if (getSnapshotOptions() != null)
            sb.append("SnapshotOptions: ").append(getSnapshotOptions()).append(",");
        if (getVPCOptions() != null)
            sb.append("VPCOptions: ").append(getVPCOptions()).append(",");
        if (getCognitoOptions() != null)
            sb.append("CognitoOptions: ").append(getCognitoOptions()).append(",");
        if (getEncryptionAtRestOptions() != null)
            sb.append("EncryptionAtRestOptions: ").append(getEncryptionAtRestOptions()).append(",");
        if (getNodeToNodeEncryptionOptions() != null)
            sb.append("NodeToNodeEncryptionOptions: ").append(getNodeToNodeEncryptionOptions()).append(",");
        if (getAdvancedOptions() != null)
            sb.append("AdvancedOptions: ").append(getAdvancedOptions()).append(",");
        if (getLogPublishingOptions() != null)
            sb.append("LogPublishingOptions: ").append(getLogPublishingOptions()).append(",");
        if (getDomainEndpointOptions() != null)
            sb.append("DomainEndpointOptions: ").append(getDomainEndpointOptions()).append(",");
        if (getAdvancedSecurityOptions() != null)
            sb.append("AdvancedSecurityOptions: ").append(getAdvancedSecurityOptions()).append(",");
        if (getAutoTuneOptions() != null)
            sb.append("AutoTuneOptions: ").append(getAutoTuneOptions()).append(",");
        if (getChangeProgressDetails() != null)
            sb.append("ChangeProgressDetails: ").append(getChangeProgressDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DomainConfig == false)
            return false;
        DomainConfig other = (DomainConfig) obj;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getClusterConfig() == null ^ this.getClusterConfig() == null)
            return false;
        if (other.getClusterConfig() != null && other.getClusterConfig().equals(this.getClusterConfig()) == false)
            return false;
        if (other.getEBSOptions() == null ^ this.getEBSOptions() == null)
            return false;
        if (other.getEBSOptions() != null && other.getEBSOptions().equals(this.getEBSOptions()) == false)
            return false;
        if (other.getAccessPolicies() == null ^ this.getAccessPolicies() == null)
            return false;
        if (other.getAccessPolicies() != null && other.getAccessPolicies().equals(this.getAccessPolicies()) == false)
            return false;
        if (other.getSnapshotOptions() == null ^ this.getSnapshotOptions() == null)
            return false;
        if (other.getSnapshotOptions() != null && other.getSnapshotOptions().equals(this.getSnapshotOptions()) == false)
            return false;
        if (other.getVPCOptions() == null ^ this.getVPCOptions() == null)
            return false;
        if (other.getVPCOptions() != null && other.getVPCOptions().equals(this.getVPCOptions()) == false)
            return false;
        if (other.getCognitoOptions() == null ^ this.getCognitoOptions() == null)
            return false;
        if (other.getCognitoOptions() != null && other.getCognitoOptions().equals(this.getCognitoOptions()) == false)
            return false;
        if (other.getEncryptionAtRestOptions() == null ^ this.getEncryptionAtRestOptions() == null)
            return false;
        if (other.getEncryptionAtRestOptions() != null && other.getEncryptionAtRestOptions().equals(this.getEncryptionAtRestOptions()) == false)
            return false;
        if (other.getNodeToNodeEncryptionOptions() == null ^ this.getNodeToNodeEncryptionOptions() == null)
            return false;
        if (other.getNodeToNodeEncryptionOptions() != null && other.getNodeToNodeEncryptionOptions().equals(this.getNodeToNodeEncryptionOptions()) == false)
            return false;
        if (other.getAdvancedOptions() == null ^ this.getAdvancedOptions() == null)
            return false;
        if (other.getAdvancedOptions() != null && other.getAdvancedOptions().equals(this.getAdvancedOptions()) == false)
            return false;
        if (other.getLogPublishingOptions() == null ^ this.getLogPublishingOptions() == null)
            return false;
        if (other.getLogPublishingOptions() != null && other.getLogPublishingOptions().equals(this.getLogPublishingOptions()) == false)
            return false;
        if (other.getDomainEndpointOptions() == null ^ this.getDomainEndpointOptions() == null)
            return false;
        if (other.getDomainEndpointOptions() != null && other.getDomainEndpointOptions().equals(this.getDomainEndpointOptions()) == false)
            return false;
        if (other.getAdvancedSecurityOptions() == null ^ this.getAdvancedSecurityOptions() == null)
            return false;
        if (other.getAdvancedSecurityOptions() != null && other.getAdvancedSecurityOptions().equals(this.getAdvancedSecurityOptions()) == false)
            return false;
        if (other.getAutoTuneOptions() == null ^ this.getAutoTuneOptions() == null)
            return false;
        if (other.getAutoTuneOptions() != null && other.getAutoTuneOptions().equals(this.getAutoTuneOptions()) == false)
            return false;
        if (other.getChangeProgressDetails() == null ^ this.getChangeProgressDetails() == null)
            return false;
        if (other.getChangeProgressDetails() != null && other.getChangeProgressDetails().equals(this.getChangeProgressDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getClusterConfig() == null) ? 0 : getClusterConfig().hashCode());
        hashCode = prime * hashCode + ((getEBSOptions() == null) ? 0 : getEBSOptions().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicies() == null) ? 0 : getAccessPolicies().hashCode());
        hashCode = prime * hashCode + ((getSnapshotOptions() == null) ? 0 : getSnapshotOptions().hashCode());
        hashCode = prime * hashCode + ((getVPCOptions() == null) ? 0 : getVPCOptions().hashCode());
        hashCode = prime * hashCode + ((getCognitoOptions() == null) ? 0 : getCognitoOptions().hashCode());
        hashCode = prime * hashCode + ((getEncryptionAtRestOptions() == null) ? 0 : getEncryptionAtRestOptions().hashCode());
        hashCode = prime * hashCode + ((getNodeToNodeEncryptionOptions() == null) ? 0 : getNodeToNodeEncryptionOptions().hashCode());
        hashCode = prime * hashCode + ((getAdvancedOptions() == null) ? 0 : getAdvancedOptions().hashCode());
        hashCode = prime * hashCode + ((getLogPublishingOptions() == null) ? 0 : getLogPublishingOptions().hashCode());
        hashCode = prime * hashCode + ((getDomainEndpointOptions() == null) ? 0 : getDomainEndpointOptions().hashCode());
        hashCode = prime * hashCode + ((getAdvancedSecurityOptions() == null) ? 0 : getAdvancedSecurityOptions().hashCode());
        hashCode = prime * hashCode + ((getAutoTuneOptions() == null) ? 0 : getAutoTuneOptions().hashCode());
        hashCode = prime * hashCode + ((getChangeProgressDetails() == null) ? 0 : getChangeProgressDetails().hashCode());
        return hashCode;
    }

    @Override
    public DomainConfig clone() {
        try {
            return (DomainConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.DomainConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
