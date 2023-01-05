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
 * The current status of an OpenSearch Service domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for the domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * Name of the domain. Domain names are unique across all domains owned by the same account within an Amazon Web
     * Services Region.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers </a> in the
     * <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * Creation status of an OpenSearch Service domain. True if domain creation is complete. False if domain creation is
     * still in progress.
     * </p>
     */
    private Boolean created;
    /**
     * <p>
     * Deletion status of an OpenSearch Service domain. True if domain deletion is complete. False if domain deletion is
     * still in progress. Once deletion is complete, the status of the domain is no longer returned.
     * </p>
     */
    private Boolean deleted;
    /**
     * <p>
     * Domain-specific endpoint used to submit index, search, and data upload requests to the domain.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The key-value pair that exists if the OpenSearch Service domain uses VPC endpoints.. Example
     * <code>key, value</code>:
     * <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     * </p>
     */
    private java.util.Map<String, String> endpoints;
    /**
     * <p>
     * The status of the domain configuration. True if OpenSearch Service is processing configuration changes. False if
     * the configuration is active.
     * </p>
     */
    private Boolean processing;
    /**
     * <p>
     * The status of a domain version upgrade to a new version of OpenSearch or Elasticsearch. True if OpenSearch
     * Service is in the process of a version upgrade. False if the configuration is active.
     * </p>
     */
    private Boolean upgradeProcessing;
    /**
     * <p>
     * Version of OpenSearch or Elasticsearch that the domain is running, in the format <code>Elasticsearch_X.Y</code>
     * or <code>OpenSearch_X.Y</code>.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Container for the cluster configuration of the domain.
     * </p>
     */
    private ClusterConfig clusterConfig;
    /**
     * <p>
     * Container for EBS-based storage settings for the domain.
     * </p>
     */
    private EBSOptions eBSOptions;
    /**
     * <p>
     * Identity and Access Management (IAM) policy document specifying the access policies for the domain.
     * </p>
     */
    private String accessPolicies;
    /**
     * <p>
     * DEPRECATED. Container for parameters required to configure automated snapshots of domain indexes.
     * </p>
     */
    private SnapshotOptions snapshotOptions;
    /**
     * <p>
     * The VPC configuration for the domain.
     * </p>
     */
    private VPCDerivedInfo vPCOptions;
    /**
     * <p>
     * Key-value pairs to configure Amazon Cognito authentication for OpenSearch Dashboards.
     * </p>
     */
    private CognitoOptions cognitoOptions;
    /**
     * <p>
     * Encryption at rest settings for the domain.
     * </p>
     */
    private EncryptionAtRestOptions encryptionAtRestOptions;
    /**
     * <p>
     * Whether node-to-node encryption is enabled or disabled.
     * </p>
     */
    private NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;
    /**
     * <p>
     * Key-value pairs that specify advanced configuration options.
     * </p>
     */
    private java.util.Map<String, String> advancedOptions;
    /**
     * <p>
     * Log publishing options for the domain.
     * </p>
     */
    private java.util.Map<String, LogPublishingOption> logPublishingOptions;
    /**
     * <p>
     * The current status of the domain's service software.
     * </p>
     */
    private ServiceSoftwareOptions serviceSoftwareOptions;
    /**
     * <p>
     * Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
     * </p>
     */
    private DomainEndpointOptions domainEndpointOptions;
    /**
     * <p>
     * Settings for fine-grained access control.
     * </p>
     */
    private AdvancedSecurityOptions advancedSecurityOptions;
    /**
     * <p>
     * Auto-Tune settings for the domain.
     * </p>
     */
    private AutoTuneOptionsOutput autoTuneOptions;
    /**
     * <p>
     * Information about a configuration change happening on the domain.
     * </p>
     */
    private ChangeProgressDetails changeProgressDetails;

    /**
     * <p>
     * Unique identifier for the domain.
     * </p>
     * 
     * @param domainId
     *        Unique identifier for the domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * Unique identifier for the domain.
     * </p>
     * 
     * @return Unique identifier for the domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * Unique identifier for the domain.
     * </p>
     * 
     * @param domainId
     *        Unique identifier for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * Name of the domain. Domain names are unique across all domains owned by the same account within an Amazon Web
     * Services Region.
     * </p>
     * 
     * @param domainName
     *        Name of the domain. Domain names are unique across all domains owned by the same account within an Amazon
     *        Web Services Region.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of the domain. Domain names are unique across all domains owned by the same account within an Amazon Web
     * Services Region.
     * </p>
     * 
     * @return Name of the domain. Domain names are unique across all domains owned by the same account within an Amazon
     *         Web Services Region.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Name of the domain. Domain names are unique across all domains owned by the same account within an Amazon Web
     * Services Region.
     * </p>
     * 
     * @param domainName
     *        Name of the domain. Domain names are unique across all domains owned by the same account within an Amazon
     *        Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers </a> in the
     * <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the domain. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers </a> in
     *        the <i>AWS Identity and Access Management User Guide</i>.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers </a> in the
     * <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the domain. For more information, see <a
     *         href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers </a>
     *         in the <i>AWS Identity and Access Management User Guide</i>.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the domain. For more information, see <a
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers </a> in the
     * <i>AWS Identity and Access Management User Guide</i>.
     * </p>
     * 
     * @param aRN
     *        The Amazon Resource Name (ARN) of the domain. For more information, see <a
     *        href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html">IAM identifiers </a> in
     *        the <i>AWS Identity and Access Management User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * Creation status of an OpenSearch Service domain. True if domain creation is complete. False if domain creation is
     * still in progress.
     * </p>
     * 
     * @param created
     *        Creation status of an OpenSearch Service domain. True if domain creation is complete. False if domain
     *        creation is still in progress.
     */

    public void setCreated(Boolean created) {
        this.created = created;
    }

    /**
     * <p>
     * Creation status of an OpenSearch Service domain. True if domain creation is complete. False if domain creation is
     * still in progress.
     * </p>
     * 
     * @return Creation status of an OpenSearch Service domain. True if domain creation is complete. False if domain
     *         creation is still in progress.
     */

    public Boolean getCreated() {
        return this.created;
    }

    /**
     * <p>
     * Creation status of an OpenSearch Service domain. True if domain creation is complete. False if domain creation is
     * still in progress.
     * </p>
     * 
     * @param created
     *        Creation status of an OpenSearch Service domain. True if domain creation is complete. False if domain
     *        creation is still in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withCreated(Boolean created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * Creation status of an OpenSearch Service domain. True if domain creation is complete. False if domain creation is
     * still in progress.
     * </p>
     * 
     * @return Creation status of an OpenSearch Service domain. True if domain creation is complete. False if domain
     *         creation is still in progress.
     */

    public Boolean isCreated() {
        return this.created;
    }

    /**
     * <p>
     * Deletion status of an OpenSearch Service domain. True if domain deletion is complete. False if domain deletion is
     * still in progress. Once deletion is complete, the status of the domain is no longer returned.
     * </p>
     * 
     * @param deleted
     *        Deletion status of an OpenSearch Service domain. True if domain deletion is complete. False if domain
     *        deletion is still in progress. Once deletion is complete, the status of the domain is no longer returned.
     */

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * <p>
     * Deletion status of an OpenSearch Service domain. True if domain deletion is complete. False if domain deletion is
     * still in progress. Once deletion is complete, the status of the domain is no longer returned.
     * </p>
     * 
     * @return Deletion status of an OpenSearch Service domain. True if domain deletion is complete. False if domain
     *         deletion is still in progress. Once deletion is complete, the status of the domain is no longer returned.
     */

    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * Deletion status of an OpenSearch Service domain. True if domain deletion is complete. False if domain deletion is
     * still in progress. Once deletion is complete, the status of the domain is no longer returned.
     * </p>
     * 
     * @param deleted
     *        Deletion status of an OpenSearch Service domain. True if domain deletion is complete. False if domain
     *        deletion is still in progress. Once deletion is complete, the status of the domain is no longer returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withDeleted(Boolean deleted) {
        setDeleted(deleted);
        return this;
    }

    /**
     * <p>
     * Deletion status of an OpenSearch Service domain. True if domain deletion is complete. False if domain deletion is
     * still in progress. Once deletion is complete, the status of the domain is no longer returned.
     * </p>
     * 
     * @return Deletion status of an OpenSearch Service domain. True if domain deletion is complete. False if domain
     *         deletion is still in progress. Once deletion is complete, the status of the domain is no longer returned.
     */

    public Boolean isDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * Domain-specific endpoint used to submit index, search, and data upload requests to the domain.
     * </p>
     * 
     * @param endpoint
     *        Domain-specific endpoint used to submit index, search, and data upload requests to the domain.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * Domain-specific endpoint used to submit index, search, and data upload requests to the domain.
     * </p>
     * 
     * @return Domain-specific endpoint used to submit index, search, and data upload requests to the domain.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * Domain-specific endpoint used to submit index, search, and data upload requests to the domain.
     * </p>
     * 
     * @param endpoint
     *        Domain-specific endpoint used to submit index, search, and data upload requests to the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The key-value pair that exists if the OpenSearch Service domain uses VPC endpoints.. Example
     * <code>key, value</code>:
     * <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     * </p>
     * 
     * @return The key-value pair that exists if the OpenSearch Service domain uses VPC endpoints.. Example
     *         <code>key, value</code>:
     *         <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     */

    public java.util.Map<String, String> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * The key-value pair that exists if the OpenSearch Service domain uses VPC endpoints.. Example
     * <code>key, value</code>:
     * <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     * </p>
     * 
     * @param endpoints
     *        The key-value pair that exists if the OpenSearch Service domain uses VPC endpoints.. Example
     *        <code>key, value</code>:
     *        <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     */

    public void setEndpoints(java.util.Map<String, String> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * <p>
     * The key-value pair that exists if the OpenSearch Service domain uses VPC endpoints.. Example
     * <code>key, value</code>:
     * <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     * </p>
     * 
     * @param endpoints
     *        The key-value pair that exists if the OpenSearch Service domain uses VPC endpoints.. Example
     *        <code>key, value</code>:
     *        <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withEndpoints(java.util.Map<String, String> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * Add a single Endpoints entry
     *
     * @see DomainStatus#withEndpoints
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus addEndpointsEntry(String key, String value) {
        if (null == this.endpoints) {
            this.endpoints = new java.util.HashMap<String, String>();
        }
        if (this.endpoints.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.endpoints.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Endpoints.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus clearEndpointsEntries() {
        this.endpoints = null;
        return this;
    }

    /**
     * <p>
     * The status of the domain configuration. True if OpenSearch Service is processing configuration changes. False if
     * the configuration is active.
     * </p>
     * 
     * @param processing
     *        The status of the domain configuration. True if OpenSearch Service is processing configuration changes.
     *        False if the configuration is active.
     */

    public void setProcessing(Boolean processing) {
        this.processing = processing;
    }

    /**
     * <p>
     * The status of the domain configuration. True if OpenSearch Service is processing configuration changes. False if
     * the configuration is active.
     * </p>
     * 
     * @return The status of the domain configuration. True if OpenSearch Service is processing configuration changes.
     *         False if the configuration is active.
     */

    public Boolean getProcessing() {
        return this.processing;
    }

    /**
     * <p>
     * The status of the domain configuration. True if OpenSearch Service is processing configuration changes. False if
     * the configuration is active.
     * </p>
     * 
     * @param processing
     *        The status of the domain configuration. True if OpenSearch Service is processing configuration changes.
     *        False if the configuration is active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withProcessing(Boolean processing) {
        setProcessing(processing);
        return this;
    }

    /**
     * <p>
     * The status of the domain configuration. True if OpenSearch Service is processing configuration changes. False if
     * the configuration is active.
     * </p>
     * 
     * @return The status of the domain configuration. True if OpenSearch Service is processing configuration changes.
     *         False if the configuration is active.
     */

    public Boolean isProcessing() {
        return this.processing;
    }

    /**
     * <p>
     * The status of a domain version upgrade to a new version of OpenSearch or Elasticsearch. True if OpenSearch
     * Service is in the process of a version upgrade. False if the configuration is active.
     * </p>
     * 
     * @param upgradeProcessing
     *        The status of a domain version upgrade to a new version of OpenSearch or Elasticsearch. True if OpenSearch
     *        Service is in the process of a version upgrade. False if the configuration is active.
     */

    public void setUpgradeProcessing(Boolean upgradeProcessing) {
        this.upgradeProcessing = upgradeProcessing;
    }

    /**
     * <p>
     * The status of a domain version upgrade to a new version of OpenSearch or Elasticsearch. True if OpenSearch
     * Service is in the process of a version upgrade. False if the configuration is active.
     * </p>
     * 
     * @return The status of a domain version upgrade to a new version of OpenSearch or Elasticsearch. True if
     *         OpenSearch Service is in the process of a version upgrade. False if the configuration is active.
     */

    public Boolean getUpgradeProcessing() {
        return this.upgradeProcessing;
    }

    /**
     * <p>
     * The status of a domain version upgrade to a new version of OpenSearch or Elasticsearch. True if OpenSearch
     * Service is in the process of a version upgrade. False if the configuration is active.
     * </p>
     * 
     * @param upgradeProcessing
     *        The status of a domain version upgrade to a new version of OpenSearch or Elasticsearch. True if OpenSearch
     *        Service is in the process of a version upgrade. False if the configuration is active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withUpgradeProcessing(Boolean upgradeProcessing) {
        setUpgradeProcessing(upgradeProcessing);
        return this;
    }

    /**
     * <p>
     * The status of a domain version upgrade to a new version of OpenSearch or Elasticsearch. True if OpenSearch
     * Service is in the process of a version upgrade. False if the configuration is active.
     * </p>
     * 
     * @return The status of a domain version upgrade to a new version of OpenSearch or Elasticsearch. True if
     *         OpenSearch Service is in the process of a version upgrade. False if the configuration is active.
     */

    public Boolean isUpgradeProcessing() {
        return this.upgradeProcessing;
    }

    /**
     * <p>
     * Version of OpenSearch or Elasticsearch that the domain is running, in the format <code>Elasticsearch_X.Y</code>
     * or <code>OpenSearch_X.Y</code>.
     * </p>
     * 
     * @param engineVersion
     *        Version of OpenSearch or Elasticsearch that the domain is running, in the format
     *        <code>Elasticsearch_X.Y</code> or <code>OpenSearch_X.Y</code>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Version of OpenSearch or Elasticsearch that the domain is running, in the format <code>Elasticsearch_X.Y</code>
     * or <code>OpenSearch_X.Y</code>.
     * </p>
     * 
     * @return Version of OpenSearch or Elasticsearch that the domain is running, in the format
     *         <code>Elasticsearch_X.Y</code> or <code>OpenSearch_X.Y</code>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * Version of OpenSearch or Elasticsearch that the domain is running, in the format <code>Elasticsearch_X.Y</code>
     * or <code>OpenSearch_X.Y</code>.
     * </p>
     * 
     * @param engineVersion
     *        Version of OpenSearch or Elasticsearch that the domain is running, in the format
     *        <code>Elasticsearch_X.Y</code> or <code>OpenSearch_X.Y</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Container for the cluster configuration of the domain.
     * </p>
     * 
     * @param clusterConfig
     *        Container for the cluster configuration of the domain.
     */

    public void setClusterConfig(ClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    /**
     * <p>
     * Container for the cluster configuration of the domain.
     * </p>
     * 
     * @return Container for the cluster configuration of the domain.
     */

    public ClusterConfig getClusterConfig() {
        return this.clusterConfig;
    }

    /**
     * <p>
     * Container for the cluster configuration of the domain.
     * </p>
     * 
     * @param clusterConfig
     *        Container for the cluster configuration of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withClusterConfig(ClusterConfig clusterConfig) {
        setClusterConfig(clusterConfig);
        return this;
    }

    /**
     * <p>
     * Container for EBS-based storage settings for the domain.
     * </p>
     * 
     * @param eBSOptions
     *        Container for EBS-based storage settings for the domain.
     */

    public void setEBSOptions(EBSOptions eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    /**
     * <p>
     * Container for EBS-based storage settings for the domain.
     * </p>
     * 
     * @return Container for EBS-based storage settings for the domain.
     */

    public EBSOptions getEBSOptions() {
        return this.eBSOptions;
    }

    /**
     * <p>
     * Container for EBS-based storage settings for the domain.
     * </p>
     * 
     * @param eBSOptions
     *        Container for EBS-based storage settings for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withEBSOptions(EBSOptions eBSOptions) {
        setEBSOptions(eBSOptions);
        return this;
    }

    /**
     * <p>
     * Identity and Access Management (IAM) policy document specifying the access policies for the domain.
     * </p>
     * 
     * @param accessPolicies
     *        Identity and Access Management (IAM) policy document specifying the access policies for the domain.
     */

    public void setAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * Identity and Access Management (IAM) policy document specifying the access policies for the domain.
     * </p>
     * 
     * @return Identity and Access Management (IAM) policy document specifying the access policies for the domain.
     */

    public String getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * <p>
     * Identity and Access Management (IAM) policy document specifying the access policies for the domain.
     * </p>
     * 
     * @param accessPolicies
     *        Identity and Access Management (IAM) policy document specifying the access policies for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withAccessPolicies(String accessPolicies) {
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

    public void setSnapshotOptions(SnapshotOptions snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    /**
     * <p>
     * DEPRECATED. Container for parameters required to configure automated snapshots of domain indexes.
     * </p>
     * 
     * @return DEPRECATED. Container for parameters required to configure automated snapshots of domain indexes.
     */

    public SnapshotOptions getSnapshotOptions() {
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

    public DomainStatus withSnapshotOptions(SnapshotOptions snapshotOptions) {
        setSnapshotOptions(snapshotOptions);
        return this;
    }

    /**
     * <p>
     * The VPC configuration for the domain.
     * </p>
     * 
     * @param vPCOptions
     *        The VPC configuration for the domain.
     */

    public void setVPCOptions(VPCDerivedInfo vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    /**
     * <p>
     * The VPC configuration for the domain.
     * </p>
     * 
     * @return The VPC configuration for the domain.
     */

    public VPCDerivedInfo getVPCOptions() {
        return this.vPCOptions;
    }

    /**
     * <p>
     * The VPC configuration for the domain.
     * </p>
     * 
     * @param vPCOptions
     *        The VPC configuration for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withVPCOptions(VPCDerivedInfo vPCOptions) {
        setVPCOptions(vPCOptions);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to configure Amazon Cognito authentication for OpenSearch Dashboards.
     * </p>
     * 
     * @param cognitoOptions
     *        Key-value pairs to configure Amazon Cognito authentication for OpenSearch Dashboards.
     */

    public void setCognitoOptions(CognitoOptions cognitoOptions) {
        this.cognitoOptions = cognitoOptions;
    }

    /**
     * <p>
     * Key-value pairs to configure Amazon Cognito authentication for OpenSearch Dashboards.
     * </p>
     * 
     * @return Key-value pairs to configure Amazon Cognito authentication for OpenSearch Dashboards.
     */

    public CognitoOptions getCognitoOptions() {
        return this.cognitoOptions;
    }

    /**
     * <p>
     * Key-value pairs to configure Amazon Cognito authentication for OpenSearch Dashboards.
     * </p>
     * 
     * @param cognitoOptions
     *        Key-value pairs to configure Amazon Cognito authentication for OpenSearch Dashboards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withCognitoOptions(CognitoOptions cognitoOptions) {
        setCognitoOptions(cognitoOptions);
        return this;
    }

    /**
     * <p>
     * Encryption at rest settings for the domain.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Encryption at rest settings for the domain.
     */

    public void setEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Encryption at rest settings for the domain.
     * </p>
     * 
     * @return Encryption at rest settings for the domain.
     */

    public EncryptionAtRestOptions getEncryptionAtRestOptions() {
        return this.encryptionAtRestOptions;
    }

    /**
     * <p>
     * Encryption at rest settings for the domain.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Encryption at rest settings for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
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

    public void setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Whether node-to-node encryption is enabled or disabled.
     * </p>
     * 
     * @return Whether node-to-node encryption is enabled or disabled.
     */

    public NodeToNodeEncryptionOptions getNodeToNodeEncryptionOptions() {
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

    public DomainStatus withNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        setNodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions);
        return this;
    }

    /**
     * <p>
     * Key-value pairs that specify advanced configuration options.
     * </p>
     * 
     * @return Key-value pairs that specify advanced configuration options.
     */

    public java.util.Map<String, String> getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * <p>
     * Key-value pairs that specify advanced configuration options.
     * </p>
     * 
     * @param advancedOptions
     *        Key-value pairs that specify advanced configuration options.
     */

    public void setAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * <p>
     * Key-value pairs that specify advanced configuration options.
     * </p>
     * 
     * @param advancedOptions
     *        Key-value pairs that specify advanced configuration options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        setAdvancedOptions(advancedOptions);
        return this;
    }

    /**
     * Add a single AdvancedOptions entry
     *
     * @see DomainStatus#withAdvancedOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus addAdvancedOptionsEntry(String key, String value) {
        if (null == this.advancedOptions) {
            this.advancedOptions = new java.util.HashMap<String, String>();
        }
        if (this.advancedOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.advancedOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AdvancedOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus clearAdvancedOptionsEntries() {
        this.advancedOptions = null;
        return this;
    }

    /**
     * <p>
     * Log publishing options for the domain.
     * </p>
     * 
     * @return Log publishing options for the domain.
     */

    public java.util.Map<String, LogPublishingOption> getLogPublishingOptions() {
        return logPublishingOptions;
    }

    /**
     * <p>
     * Log publishing options for the domain.
     * </p>
     * 
     * @param logPublishingOptions
     *        Log publishing options for the domain.
     */

    public void setLogPublishingOptions(java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
    }

    /**
     * <p>
     * Log publishing options for the domain.
     * </p>
     * 
     * @param logPublishingOptions
     *        Log publishing options for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withLogPublishingOptions(java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        setLogPublishingOptions(logPublishingOptions);
        return this;
    }

    /**
     * Add a single LogPublishingOptions entry
     *
     * @see DomainStatus#withLogPublishingOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus addLogPublishingOptionsEntry(String key, LogPublishingOption value) {
        if (null == this.logPublishingOptions) {
            this.logPublishingOptions = new java.util.HashMap<String, LogPublishingOption>();
        }
        if (this.logPublishingOptions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.logPublishingOptions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into LogPublishingOptions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus clearLogPublishingOptionsEntries() {
        this.logPublishingOptions = null;
        return this;
    }

    /**
     * <p>
     * The current status of the domain's service software.
     * </p>
     * 
     * @param serviceSoftwareOptions
     *        The current status of the domain's service software.
     */

    public void setServiceSoftwareOptions(ServiceSoftwareOptions serviceSoftwareOptions) {
        this.serviceSoftwareOptions = serviceSoftwareOptions;
    }

    /**
     * <p>
     * The current status of the domain's service software.
     * </p>
     * 
     * @return The current status of the domain's service software.
     */

    public ServiceSoftwareOptions getServiceSoftwareOptions() {
        return this.serviceSoftwareOptions;
    }

    /**
     * <p>
     * The current status of the domain's service software.
     * </p>
     * 
     * @param serviceSoftwareOptions
     *        The current status of the domain's service software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withServiceSoftwareOptions(ServiceSoftwareOptions serviceSoftwareOptions) {
        setServiceSoftwareOptions(serviceSoftwareOptions);
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

    public void setDomainEndpointOptions(DomainEndpointOptions domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
    }

    /**
     * <p>
     * Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
     * </p>
     * 
     * @return Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
     */

    public DomainEndpointOptions getDomainEndpointOptions() {
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

    public DomainStatus withDomainEndpointOptions(DomainEndpointOptions domainEndpointOptions) {
        setDomainEndpointOptions(domainEndpointOptions);
        return this;
    }

    /**
     * <p>
     * Settings for fine-grained access control.
     * </p>
     * 
     * @param advancedSecurityOptions
     *        Settings for fine-grained access control.
     */

    public void setAdvancedSecurityOptions(AdvancedSecurityOptions advancedSecurityOptions) {
        this.advancedSecurityOptions = advancedSecurityOptions;
    }

    /**
     * <p>
     * Settings for fine-grained access control.
     * </p>
     * 
     * @return Settings for fine-grained access control.
     */

    public AdvancedSecurityOptions getAdvancedSecurityOptions() {
        return this.advancedSecurityOptions;
    }

    /**
     * <p>
     * Settings for fine-grained access control.
     * </p>
     * 
     * @param advancedSecurityOptions
     *        Settings for fine-grained access control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withAdvancedSecurityOptions(AdvancedSecurityOptions advancedSecurityOptions) {
        setAdvancedSecurityOptions(advancedSecurityOptions);
        return this;
    }

    /**
     * <p>
     * Auto-Tune settings for the domain.
     * </p>
     * 
     * @param autoTuneOptions
     *        Auto-Tune settings for the domain.
     */

    public void setAutoTuneOptions(AutoTuneOptionsOutput autoTuneOptions) {
        this.autoTuneOptions = autoTuneOptions;
    }

    /**
     * <p>
     * Auto-Tune settings for the domain.
     * </p>
     * 
     * @return Auto-Tune settings for the domain.
     */

    public AutoTuneOptionsOutput getAutoTuneOptions() {
        return this.autoTuneOptions;
    }

    /**
     * <p>
     * Auto-Tune settings for the domain.
     * </p>
     * 
     * @param autoTuneOptions
     *        Auto-Tune settings for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withAutoTuneOptions(AutoTuneOptionsOutput autoTuneOptions) {
        setAutoTuneOptions(autoTuneOptions);
        return this;
    }

    /**
     * <p>
     * Information about a configuration change happening on the domain.
     * </p>
     * 
     * @param changeProgressDetails
     *        Information about a configuration change happening on the domain.
     */

    public void setChangeProgressDetails(ChangeProgressDetails changeProgressDetails) {
        this.changeProgressDetails = changeProgressDetails;
    }

    /**
     * <p>
     * Information about a configuration change happening on the domain.
     * </p>
     * 
     * @return Information about a configuration change happening on the domain.
     */

    public ChangeProgressDetails getChangeProgressDetails() {
        return this.changeProgressDetails;
    }

    /**
     * <p>
     * Information about a configuration change happening on the domain.
     * </p>
     * 
     * @param changeProgressDetails
     *        Information about a configuration change happening on the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainStatus withChangeProgressDetails(ChangeProgressDetails changeProgressDetails) {
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getARN() != null)
            sb.append("ARN: ").append(getARN()).append(",");
        if (getCreated() != null)
            sb.append("Created: ").append(getCreated()).append(",");
        if (getDeleted() != null)
            sb.append("Deleted: ").append(getDeleted()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints()).append(",");
        if (getProcessing() != null)
            sb.append("Processing: ").append(getProcessing()).append(",");
        if (getUpgradeProcessing() != null)
            sb.append("UpgradeProcessing: ").append(getUpgradeProcessing()).append(",");
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
        if (getServiceSoftwareOptions() != null)
            sb.append("ServiceSoftwareOptions: ").append(getServiceSoftwareOptions()).append(",");
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

        if (obj instanceof DomainStatus == false)
            return false;
        DomainStatus other = (DomainStatus) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getARN() == null ^ this.getARN() == null)
            return false;
        if (other.getARN() != null && other.getARN().equals(this.getARN()) == false)
            return false;
        if (other.getCreated() == null ^ this.getCreated() == null)
            return false;
        if (other.getCreated() != null && other.getCreated().equals(this.getCreated()) == false)
            return false;
        if (other.getDeleted() == null ^ this.getDeleted() == null)
            return false;
        if (other.getDeleted() != null && other.getDeleted().equals(this.getDeleted()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        if (other.getProcessing() == null ^ this.getProcessing() == null)
            return false;
        if (other.getProcessing() != null && other.getProcessing().equals(this.getProcessing()) == false)
            return false;
        if (other.getUpgradeProcessing() == null ^ this.getUpgradeProcessing() == null)
            return false;
        if (other.getUpgradeProcessing() != null && other.getUpgradeProcessing().equals(this.getUpgradeProcessing()) == false)
            return false;
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
        if (other.getServiceSoftwareOptions() == null ^ this.getServiceSoftwareOptions() == null)
            return false;
        if (other.getServiceSoftwareOptions() != null && other.getServiceSoftwareOptions().equals(this.getServiceSoftwareOptions()) == false)
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

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getARN() == null) ? 0 : getARN().hashCode());
        hashCode = prime * hashCode + ((getCreated() == null) ? 0 : getCreated().hashCode());
        hashCode = prime * hashCode + ((getDeleted() == null) ? 0 : getDeleted().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getProcessing() == null) ? 0 : getProcessing().hashCode());
        hashCode = prime * hashCode + ((getUpgradeProcessing() == null) ? 0 : getUpgradeProcessing().hashCode());
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
        hashCode = prime * hashCode + ((getServiceSoftwareOptions() == null) ? 0 : getServiceSoftwareOptions().hashCode());
        hashCode = prime * hashCode + ((getDomainEndpointOptions() == null) ? 0 : getDomainEndpointOptions().hashCode());
        hashCode = prime * hashCode + ((getAdvancedSecurityOptions() == null) ? 0 : getAdvancedSecurityOptions().hashCode());
        hashCode = prime * hashCode + ((getAutoTuneOptions() == null) ? 0 : getAutoTuneOptions().hashCode());
        hashCode = prime * hashCode + ((getChangeProgressDetails() == null) ? 0 : getChangeProgressDetails().hashCode());
        return hashCode;
    }

    @Override
    public DomainStatus clone() {
        try {
            return (DomainStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.opensearch.model.transform.DomainStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
