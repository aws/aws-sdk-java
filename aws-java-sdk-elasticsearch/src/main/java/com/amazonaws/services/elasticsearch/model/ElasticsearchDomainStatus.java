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
 * The current status of an Elasticsearch domain.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ElasticsearchDomainStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the specified Elasticsearch domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the domains owned by an account within an AWS
     * region. Domain names start with a letter or number and can contain the following characters: a-z (lowercase),
     * 0-9, and - (hyphen).
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The Amazon resource name (ARN) of an Elasticsearch domain. See <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS Identity and Access Management</i> for more
     * information.
     * </p>
     */
    private String aRN;
    /**
     * <p>
     * The domain creation status. <code>True</code> if the creation of an Elasticsearch domain is complete.
     * <code>False</code> if domain creation is still in progress.
     * </p>
     */
    private Boolean created;
    /**
     * <p>
     * The domain deletion status. <code>True</code> if a delete request has been received for the domain but resource
     * cleanup is still in progress. <code>False</code> if the domain has not been deleted. Once domain deletion is
     * complete, the status of the domain is no longer returned.
     * </p>
     */
    private Boolean deleted;
    /**
     * <p>
     * The Elasticsearch domain endpoint that you use to submit index and search requests.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * Map containing the Elasticsearch domain endpoints used to submit index and search requests. Example
     * <code>key, value</code>:
     * <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     * </p>
     */
    private java.util.Map<String, String> endpoints;
    /**
     * <p>
     * The status of the Elasticsearch domain configuration. <code>True</code> if Amazon Elasticsearch Service is
     * processing configuration changes. <code>False</code> if the configuration is active.
     * </p>
     */
    private Boolean processing;
    /**
     * <p>
     * The status of an Elasticsearch domain version upgrade. <code>True</code> if Amazon Elasticsearch Service is
     * undergoing a version upgrade. <code>False</code> if the configuration is active.
     * </p>
     */
    private Boolean upgradeProcessing;

    private String elasticsearchVersion;
    /**
     * <p>
     * The type and number of instances in the domain cluster.
     * </p>
     */
    private ElasticsearchClusterConfig elasticsearchClusterConfig;
    /**
     * <p>
     * The <code>EBSOptions</code> for the specified domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     * target="_blank">Configuring EBS-based Storage</a> for more information.
     * </p>
     */
    private EBSOptions eBSOptions;
    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     */
    private String accessPolicies;
    /**
     * <p>
     * Specifies the status of the <code>SnapshotOptions</code>
     * </p>
     */
    private SnapshotOptions snapshotOptions;
    /**
     * <p>
     * The <code>VPCOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html" target="_blank">VPC
     * Endpoints for Amazon Elasticsearch Service Domains</a>.
     * </p>
     */
    private VPCDerivedInfo vPCOptions;
    /**
     * <p>
     * The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     */
    private CognitoOptions cognitoOptions;
    /**
     * <p>
     * Specifies the status of the <code>EncryptionAtRestOptions</code>.
     * </p>
     */
    private EncryptionAtRestOptions encryptionAtRestOptions;
    /**
     * <p>
     * Specifies the status of the <code>NodeToNodeEncryptionOptions</code>.
     * </p>
     */
    private NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;
    /**
     * <p>
     * Specifies the status of the <code>AdvancedOptions</code>
     * </p>
     */
    private java.util.Map<String, String> advancedOptions;
    /**
     * <p>
     * Log publishing options for the given domain.
     * </p>
     */
    private java.util.Map<String, LogPublishingOption> logPublishingOptions;
    /**
     * <p>
     * The current status of the Elasticsearch domain's service software.
     * </p>
     */
    private ServiceSoftwareOptions serviceSoftwareOptions;

    /**
     * <p>
     * The unique identifier for the specified Elasticsearch domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier for the specified Elasticsearch domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The unique identifier for the specified Elasticsearch domain.
     * </p>
     * 
     * @return The unique identifier for the specified Elasticsearch domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The unique identifier for the specified Elasticsearch domain.
     * </p>
     * 
     * @param domainId
     *        The unique identifier for the specified Elasticsearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the domains owned by an account within an AWS
     * region. Domain names start with a letter or number and can contain the following characters: a-z (lowercase),
     * 0-9, and - (hyphen).
     * </p>
     * 
     * @param domainName
     *        The name of an Elasticsearch domain. Domain names are unique across the domains owned by an account within
     *        an AWS region. Domain names start with a letter or number and can contain the following characters: a-z
     *        (lowercase), 0-9, and - (hyphen).
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the domains owned by an account within an AWS
     * region. Domain names start with a letter or number and can contain the following characters: a-z (lowercase),
     * 0-9, and - (hyphen).
     * </p>
     * 
     * @return The name of an Elasticsearch domain. Domain names are unique across the domains owned by an account
     *         within an AWS region. Domain names start with a letter or number and can contain the following
     *         characters: a-z (lowercase), 0-9, and - (hyphen).
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of an Elasticsearch domain. Domain names are unique across the domains owned by an account within an AWS
     * region. Domain names start with a letter or number and can contain the following characters: a-z (lowercase),
     * 0-9, and - (hyphen).
     * </p>
     * 
     * @param domainName
     *        The name of an Elasticsearch domain. Domain names are unique across the domains owned by an account within
     *        an AWS region. Domain names start with a letter or number and can contain the following characters: a-z
     *        (lowercase), 0-9, and - (hyphen).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of an Elasticsearch domain. See <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS Identity and Access Management</i> for more
     * information.
     * </p>
     * 
     * @param aRN
     *        The Amazon resource name (ARN) of an Elasticsearch domain. See <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *        target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS Identity and Access Management</i> for
     *        more information.
     */

    public void setARN(String aRN) {
        this.aRN = aRN;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of an Elasticsearch domain. See <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS Identity and Access Management</i> for more
     * information.
     * </p>
     * 
     * @return The Amazon resource name (ARN) of an Elasticsearch domain. See <a
     *         href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *         target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS Identity and Access Management</i> for
     *         more information.
     */

    public String getARN() {
        return this.aRN;
    }

    /**
     * <p>
     * The Amazon resource name (ARN) of an Elasticsearch domain. See <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     * target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS Identity and Access Management</i> for more
     * information.
     * </p>
     * 
     * @param aRN
     *        The Amazon resource name (ARN) of an Elasticsearch domain. See <a
     *        href="http://docs.aws.amazon.com/IAM/latest/UserGuide/index.html?Using_Identifiers.html"
     *        target="_blank">Identifiers for IAM Entities</a> in <i>Using AWS Identity and Access Management</i> for
     *        more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withARN(String aRN) {
        setARN(aRN);
        return this;
    }

    /**
     * <p>
     * The domain creation status. <code>True</code> if the creation of an Elasticsearch domain is complete.
     * <code>False</code> if domain creation is still in progress.
     * </p>
     * 
     * @param created
     *        The domain creation status. <code>True</code> if the creation of an Elasticsearch domain is complete.
     *        <code>False</code> if domain creation is still in progress.
     */

    public void setCreated(Boolean created) {
        this.created = created;
    }

    /**
     * <p>
     * The domain creation status. <code>True</code> if the creation of an Elasticsearch domain is complete.
     * <code>False</code> if domain creation is still in progress.
     * </p>
     * 
     * @return The domain creation status. <code>True</code> if the creation of an Elasticsearch domain is complete.
     *         <code>False</code> if domain creation is still in progress.
     */

    public Boolean getCreated() {
        return this.created;
    }

    /**
     * <p>
     * The domain creation status. <code>True</code> if the creation of an Elasticsearch domain is complete.
     * <code>False</code> if domain creation is still in progress.
     * </p>
     * 
     * @param created
     *        The domain creation status. <code>True</code> if the creation of an Elasticsearch domain is complete.
     *        <code>False</code> if domain creation is still in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withCreated(Boolean created) {
        setCreated(created);
        return this;
    }

    /**
     * <p>
     * The domain creation status. <code>True</code> if the creation of an Elasticsearch domain is complete.
     * <code>False</code> if domain creation is still in progress.
     * </p>
     * 
     * @return The domain creation status. <code>True</code> if the creation of an Elasticsearch domain is complete.
     *         <code>False</code> if domain creation is still in progress.
     */

    public Boolean isCreated() {
        return this.created;
    }

    /**
     * <p>
     * The domain deletion status. <code>True</code> if a delete request has been received for the domain but resource
     * cleanup is still in progress. <code>False</code> if the domain has not been deleted. Once domain deletion is
     * complete, the status of the domain is no longer returned.
     * </p>
     * 
     * @param deleted
     *        The domain deletion status. <code>True</code> if a delete request has been received for the domain but
     *        resource cleanup is still in progress. <code>False</code> if the domain has not been deleted. Once domain
     *        deletion is complete, the status of the domain is no longer returned.
     */

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * <p>
     * The domain deletion status. <code>True</code> if a delete request has been received for the domain but resource
     * cleanup is still in progress. <code>False</code> if the domain has not been deleted. Once domain deletion is
     * complete, the status of the domain is no longer returned.
     * </p>
     * 
     * @return The domain deletion status. <code>True</code> if a delete request has been received for the domain but
     *         resource cleanup is still in progress. <code>False</code> if the domain has not been deleted. Once domain
     *         deletion is complete, the status of the domain is no longer returned.
     */

    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * The domain deletion status. <code>True</code> if a delete request has been received for the domain but resource
     * cleanup is still in progress. <code>False</code> if the domain has not been deleted. Once domain deletion is
     * complete, the status of the domain is no longer returned.
     * </p>
     * 
     * @param deleted
     *        The domain deletion status. <code>True</code> if a delete request has been received for the domain but
     *        resource cleanup is still in progress. <code>False</code> if the domain has not been deleted. Once domain
     *        deletion is complete, the status of the domain is no longer returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withDeleted(Boolean deleted) {
        setDeleted(deleted);
        return this;
    }

    /**
     * <p>
     * The domain deletion status. <code>True</code> if a delete request has been received for the domain but resource
     * cleanup is still in progress. <code>False</code> if the domain has not been deleted. Once domain deletion is
     * complete, the status of the domain is no longer returned.
     * </p>
     * 
     * @return The domain deletion status. <code>True</code> if a delete request has been received for the domain but
     *         resource cleanup is still in progress. <code>False</code> if the domain has not been deleted. Once domain
     *         deletion is complete, the status of the domain is no longer returned.
     */

    public Boolean isDeleted() {
        return this.deleted;
    }

    /**
     * <p>
     * The Elasticsearch domain endpoint that you use to submit index and search requests.
     * </p>
     * 
     * @param endpoint
     *        The Elasticsearch domain endpoint that you use to submit index and search requests.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The Elasticsearch domain endpoint that you use to submit index and search requests.
     * </p>
     * 
     * @return The Elasticsearch domain endpoint that you use to submit index and search requests.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The Elasticsearch domain endpoint that you use to submit index and search requests.
     * </p>
     * 
     * @param endpoint
     *        The Elasticsearch domain endpoint that you use to submit index and search requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * Map containing the Elasticsearch domain endpoints used to submit index and search requests. Example
     * <code>key, value</code>:
     * <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     * </p>
     * 
     * @return Map containing the Elasticsearch domain endpoints used to submit index and search requests. Example
     *         <code>key, value</code>:
     *         <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     */

    public java.util.Map<String, String> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * Map containing the Elasticsearch domain endpoints used to submit index and search requests. Example
     * <code>key, value</code>:
     * <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     * </p>
     * 
     * @param endpoints
     *        Map containing the Elasticsearch domain endpoints used to submit index and search requests. Example
     *        <code>key, value</code>:
     *        <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     */

    public void setEndpoints(java.util.Map<String, String> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * <p>
     * Map containing the Elasticsearch domain endpoints used to submit index and search requests. Example
     * <code>key, value</code>:
     * <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     * </p>
     * 
     * @param endpoints
     *        Map containing the Elasticsearch domain endpoints used to submit index and search requests. Example
     *        <code>key, value</code>:
     *        <code>'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withEndpoints(java.util.Map<String, String> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    public ElasticsearchDomainStatus addEndpointsEntry(String key, String value) {
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

    public ElasticsearchDomainStatus clearEndpointsEntries() {
        this.endpoints = null;
        return this;
    }

    /**
     * <p>
     * The status of the Elasticsearch domain configuration. <code>True</code> if Amazon Elasticsearch Service is
     * processing configuration changes. <code>False</code> if the configuration is active.
     * </p>
     * 
     * @param processing
     *        The status of the Elasticsearch domain configuration. <code>True</code> if Amazon Elasticsearch Service is
     *        processing configuration changes. <code>False</code> if the configuration is active.
     */

    public void setProcessing(Boolean processing) {
        this.processing = processing;
    }

    /**
     * <p>
     * The status of the Elasticsearch domain configuration. <code>True</code> if Amazon Elasticsearch Service is
     * processing configuration changes. <code>False</code> if the configuration is active.
     * </p>
     * 
     * @return The status of the Elasticsearch domain configuration. <code>True</code> if Amazon Elasticsearch Service
     *         is processing configuration changes. <code>False</code> if the configuration is active.
     */

    public Boolean getProcessing() {
        return this.processing;
    }

    /**
     * <p>
     * The status of the Elasticsearch domain configuration. <code>True</code> if Amazon Elasticsearch Service is
     * processing configuration changes. <code>False</code> if the configuration is active.
     * </p>
     * 
     * @param processing
     *        The status of the Elasticsearch domain configuration. <code>True</code> if Amazon Elasticsearch Service is
     *        processing configuration changes. <code>False</code> if the configuration is active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withProcessing(Boolean processing) {
        setProcessing(processing);
        return this;
    }

    /**
     * <p>
     * The status of the Elasticsearch domain configuration. <code>True</code> if Amazon Elasticsearch Service is
     * processing configuration changes. <code>False</code> if the configuration is active.
     * </p>
     * 
     * @return The status of the Elasticsearch domain configuration. <code>True</code> if Amazon Elasticsearch Service
     *         is processing configuration changes. <code>False</code> if the configuration is active.
     */

    public Boolean isProcessing() {
        return this.processing;
    }

    /**
     * <p>
     * The status of an Elasticsearch domain version upgrade. <code>True</code> if Amazon Elasticsearch Service is
     * undergoing a version upgrade. <code>False</code> if the configuration is active.
     * </p>
     * 
     * @param upgradeProcessing
     *        The status of an Elasticsearch domain version upgrade. <code>True</code> if Amazon Elasticsearch Service
     *        is undergoing a version upgrade. <code>False</code> if the configuration is active.
     */

    public void setUpgradeProcessing(Boolean upgradeProcessing) {
        this.upgradeProcessing = upgradeProcessing;
    }

    /**
     * <p>
     * The status of an Elasticsearch domain version upgrade. <code>True</code> if Amazon Elasticsearch Service is
     * undergoing a version upgrade. <code>False</code> if the configuration is active.
     * </p>
     * 
     * @return The status of an Elasticsearch domain version upgrade. <code>True</code> if Amazon Elasticsearch Service
     *         is undergoing a version upgrade. <code>False</code> if the configuration is active.
     */

    public Boolean getUpgradeProcessing() {
        return this.upgradeProcessing;
    }

    /**
     * <p>
     * The status of an Elasticsearch domain version upgrade. <code>True</code> if Amazon Elasticsearch Service is
     * undergoing a version upgrade. <code>False</code> if the configuration is active.
     * </p>
     * 
     * @param upgradeProcessing
     *        The status of an Elasticsearch domain version upgrade. <code>True</code> if Amazon Elasticsearch Service
     *        is undergoing a version upgrade. <code>False</code> if the configuration is active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withUpgradeProcessing(Boolean upgradeProcessing) {
        setUpgradeProcessing(upgradeProcessing);
        return this;
    }

    /**
     * <p>
     * The status of an Elasticsearch domain version upgrade. <code>True</code> if Amazon Elasticsearch Service is
     * undergoing a version upgrade. <code>False</code> if the configuration is active.
     * </p>
     * 
     * @return The status of an Elasticsearch domain version upgrade. <code>True</code> if Amazon Elasticsearch Service
     *         is undergoing a version upgrade. <code>False</code> if the configuration is active.
     */

    public Boolean isUpgradeProcessing() {
        return this.upgradeProcessing;
    }

    /**
     * @param elasticsearchVersion
     */

    public void setElasticsearchVersion(String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    /**
     * @return
     */

    public String getElasticsearchVersion() {
        return this.elasticsearchVersion;
    }

    /**
     * @param elasticsearchVersion
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withElasticsearchVersion(String elasticsearchVersion) {
        setElasticsearchVersion(elasticsearchVersion);
        return this;
    }

    /**
     * <p>
     * The type and number of instances in the domain cluster.
     * </p>
     * 
     * @param elasticsearchClusterConfig
     *        The type and number of instances in the domain cluster.
     */

    public void setElasticsearchClusterConfig(ElasticsearchClusterConfig elasticsearchClusterConfig) {
        this.elasticsearchClusterConfig = elasticsearchClusterConfig;
    }

    /**
     * <p>
     * The type and number of instances in the domain cluster.
     * </p>
     * 
     * @return The type and number of instances in the domain cluster.
     */

    public ElasticsearchClusterConfig getElasticsearchClusterConfig() {
        return this.elasticsearchClusterConfig;
    }

    /**
     * <p>
     * The type and number of instances in the domain cluster.
     * </p>
     * 
     * @param elasticsearchClusterConfig
     *        The type and number of instances in the domain cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withElasticsearchClusterConfig(ElasticsearchClusterConfig elasticsearchClusterConfig) {
        setElasticsearchClusterConfig(elasticsearchClusterConfig);
        return this;
    }

    /**
     * <p>
     * The <code>EBSOptions</code> for the specified domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     * target="_blank">Configuring EBS-based Storage</a> for more information.
     * </p>
     * 
     * @param eBSOptions
     *        The <code>EBSOptions</code> for the specified domain. See <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     *        target="_blank">Configuring EBS-based Storage</a> for more information.
     */

    public void setEBSOptions(EBSOptions eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    /**
     * <p>
     * The <code>EBSOptions</code> for the specified domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     * target="_blank">Configuring EBS-based Storage</a> for more information.
     * </p>
     * 
     * @return The <code>EBSOptions</code> for the specified domain. See <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     *         target="_blank">Configuring EBS-based Storage</a> for more information.
     */

    public EBSOptions getEBSOptions() {
        return this.eBSOptions;
    }

    /**
     * <p>
     * The <code>EBSOptions</code> for the specified domain. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     * target="_blank">Configuring EBS-based Storage</a> for more information.
     * </p>
     * 
     * @param eBSOptions
     *        The <code>EBSOptions</code> for the specified domain. See <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-ebs"
     *        target="_blank">Configuring EBS-based Storage</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withEBSOptions(EBSOptions eBSOptions) {
        setEBSOptions(eBSOptions);
        return this;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     * 
     * @param accessPolicies
     *        IAM access policy as a JSON-formatted string.
     */

    public void setAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     * 
     * @return IAM access policy as a JSON-formatted string.
     */

    public String getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * <p>
     * IAM access policy as a JSON-formatted string.
     * </p>
     * 
     * @param accessPolicies
     *        IAM access policy as a JSON-formatted string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withAccessPolicies(String accessPolicies) {
        setAccessPolicies(accessPolicies);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the <code>SnapshotOptions</code>
     * </p>
     * 
     * @param snapshotOptions
     *        Specifies the status of the <code>SnapshotOptions</code>
     */

    public void setSnapshotOptions(SnapshotOptions snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>SnapshotOptions</code>
     * </p>
     * 
     * @return Specifies the status of the <code>SnapshotOptions</code>
     */

    public SnapshotOptions getSnapshotOptions() {
        return this.snapshotOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>SnapshotOptions</code>
     * </p>
     * 
     * @param snapshotOptions
     *        Specifies the status of the <code>SnapshotOptions</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withSnapshotOptions(SnapshotOptions snapshotOptions) {
        setSnapshotOptions(snapshotOptions);
        return this;
    }

    /**
     * <p>
     * The <code>VPCOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html" target="_blank">VPC
     * Endpoints for Amazon Elasticsearch Service Domains</a>.
     * </p>
     * 
     * @param vPCOptions
     *        The <code>VPCOptions</code> for the specified domain. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html"
     *        target="_blank">VPC Endpoints for Amazon Elasticsearch Service Domains</a>.
     */

    public void setVPCOptions(VPCDerivedInfo vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    /**
     * <p>
     * The <code>VPCOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html" target="_blank">VPC
     * Endpoints for Amazon Elasticsearch Service Domains</a>.
     * </p>
     * 
     * @return The <code>VPCOptions</code> for the specified domain. For more information, see <a
     *         href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html"
     *         target="_blank">VPC Endpoints for Amazon Elasticsearch Service Domains</a>.
     */

    public VPCDerivedInfo getVPCOptions() {
        return this.vPCOptions;
    }

    /**
     * <p>
     * The <code>VPCOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html" target="_blank">VPC
     * Endpoints for Amazon Elasticsearch Service Domains</a>.
     * </p>
     * 
     * @param vPCOptions
     *        The <code>VPCOptions</code> for the specified domain. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html"
     *        target="_blank">VPC Endpoints for Amazon Elasticsearch Service Domains</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withVPCOptions(VPCDerivedInfo vPCOptions) {
        setVPCOptions(vPCOptions);
        return this;
    }

    /**
     * <p>
     * The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     * 
     * @param cognitoOptions
     *        The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     *        target="_blank">Amazon Cognito Authentication for Kibana</a>.
     */

    public void setCognitoOptions(CognitoOptions cognitoOptions) {
        this.cognitoOptions = cognitoOptions;
    }

    /**
     * <p>
     * The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     * 
     * @return The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     *         href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     *         target="_blank">Amazon Cognito Authentication for Kibana</a>.
     */

    public CognitoOptions getCognitoOptions() {
        return this.cognitoOptions;
    }

    /**
     * <p>
     * The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     * 
     * @param cognitoOptions
     *        The <code>CognitoOptions</code> for the specified domain. For more information, see <a
     *        href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     *        target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withCognitoOptions(CognitoOptions cognitoOptions) {
        setCognitoOptions(cognitoOptions);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the <code>EncryptionAtRestOptions</code>.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Specifies the status of the <code>EncryptionAtRestOptions</code>.
     */

    public void setEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>EncryptionAtRestOptions</code>.
     * </p>
     * 
     * @return Specifies the status of the <code>EncryptionAtRestOptions</code>.
     */

    public EncryptionAtRestOptions getEncryptionAtRestOptions() {
        return this.encryptionAtRestOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>EncryptionAtRestOptions</code>.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Specifies the status of the <code>EncryptionAtRestOptions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        setEncryptionAtRestOptions(encryptionAtRestOptions);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the <code>NodeToNodeEncryptionOptions</code>.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Specifies the status of the <code>NodeToNodeEncryptionOptions</code>.
     */

    public void setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>NodeToNodeEncryptionOptions</code>.
     * </p>
     * 
     * @return Specifies the status of the <code>NodeToNodeEncryptionOptions</code>.
     */

    public NodeToNodeEncryptionOptions getNodeToNodeEncryptionOptions() {
        return this.nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>NodeToNodeEncryptionOptions</code>.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Specifies the status of the <code>NodeToNodeEncryptionOptions</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        setNodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions);
        return this;
    }

    /**
     * <p>
     * Specifies the status of the <code>AdvancedOptions</code>
     * </p>
     * 
     * @return Specifies the status of the <code>AdvancedOptions</code>
     */

    public java.util.Map<String, String> getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>AdvancedOptions</code>
     * </p>
     * 
     * @param advancedOptions
     *        Specifies the status of the <code>AdvancedOptions</code>
     */

    public void setAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * <p>
     * Specifies the status of the <code>AdvancedOptions</code>
     * </p>
     * 
     * @param advancedOptions
     *        Specifies the status of the <code>AdvancedOptions</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        setAdvancedOptions(advancedOptions);
        return this;
    }

    public ElasticsearchDomainStatus addAdvancedOptionsEntry(String key, String value) {
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

    public ElasticsearchDomainStatus clearAdvancedOptionsEntries() {
        this.advancedOptions = null;
        return this;
    }

    /**
     * <p>
     * Log publishing options for the given domain.
     * </p>
     * 
     * @return Log publishing options for the given domain.
     */

    public java.util.Map<String, LogPublishingOption> getLogPublishingOptions() {
        return logPublishingOptions;
    }

    /**
     * <p>
     * Log publishing options for the given domain.
     * </p>
     * 
     * @param logPublishingOptions
     *        Log publishing options for the given domain.
     */

    public void setLogPublishingOptions(java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
    }

    /**
     * <p>
     * Log publishing options for the given domain.
     * </p>
     * 
     * @param logPublishingOptions
     *        Log publishing options for the given domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withLogPublishingOptions(java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        setLogPublishingOptions(logPublishingOptions);
        return this;
    }

    public ElasticsearchDomainStatus addLogPublishingOptionsEntry(String key, LogPublishingOption value) {
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

    public ElasticsearchDomainStatus clearLogPublishingOptionsEntries() {
        this.logPublishingOptions = null;
        return this;
    }

    /**
     * <p>
     * The current status of the Elasticsearch domain's service software.
     * </p>
     * 
     * @param serviceSoftwareOptions
     *        The current status of the Elasticsearch domain's service software.
     */

    public void setServiceSoftwareOptions(ServiceSoftwareOptions serviceSoftwareOptions) {
        this.serviceSoftwareOptions = serviceSoftwareOptions;
    }

    /**
     * <p>
     * The current status of the Elasticsearch domain's service software.
     * </p>
     * 
     * @return The current status of the Elasticsearch domain's service software.
     */

    public ServiceSoftwareOptions getServiceSoftwareOptions() {
        return this.serviceSoftwareOptions;
    }

    /**
     * <p>
     * The current status of the Elasticsearch domain's service software.
     * </p>
     * 
     * @param serviceSoftwareOptions
     *        The current status of the Elasticsearch domain's service software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ElasticsearchDomainStatus withServiceSoftwareOptions(ServiceSoftwareOptions serviceSoftwareOptions) {
        setServiceSoftwareOptions(serviceSoftwareOptions);
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
        if (getElasticsearchVersion() != null)
            sb.append("ElasticsearchVersion: ").append(getElasticsearchVersion()).append(",");
        if (getElasticsearchClusterConfig() != null)
            sb.append("ElasticsearchClusterConfig: ").append(getElasticsearchClusterConfig()).append(",");
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
            sb.append("ServiceSoftwareOptions: ").append(getServiceSoftwareOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticsearchDomainStatus == false)
            return false;
        ElasticsearchDomainStatus other = (ElasticsearchDomainStatus) obj;
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
        if (other.getElasticsearchVersion() == null ^ this.getElasticsearchVersion() == null)
            return false;
        if (other.getElasticsearchVersion() != null && other.getElasticsearchVersion().equals(this.getElasticsearchVersion()) == false)
            return false;
        if (other.getElasticsearchClusterConfig() == null ^ this.getElasticsearchClusterConfig() == null)
            return false;
        if (other.getElasticsearchClusterConfig() != null && other.getElasticsearchClusterConfig().equals(this.getElasticsearchClusterConfig()) == false)
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
        hashCode = prime * hashCode + ((getElasticsearchVersion() == null) ? 0 : getElasticsearchVersion().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchClusterConfig() == null) ? 0 : getElasticsearchClusterConfig().hashCode());
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
        return hashCode;
    }

    @Override
    public ElasticsearchDomainStatus clone() {
        try {
            return (ElasticsearchDomainStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticsearch.model.transform.ElasticsearchDomainStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
