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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateElasticsearchDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Elasticsearch domain that you are creating. Domain names are unique across the domains owned by
     * an account within an AWS region. Domain names must start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain eg. "1.5" or "2.3". For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon Elasticsearch Service Developer Guide</i>.
     * </p>
     */
    private String elasticsearchVersion;
    /**
     * <p>
     * Configuration options for an Elasticsearch domain. Specifies the instance type and number of instances in the
     * domain cluster.
     * </p>
     */
    private ElasticsearchClusterConfig elasticsearchClusterConfig;
    /**
     * <p>
     * Options to enable, disable and specify the type and size of EBS storage volumes.
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
     * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     * </p>
     */
    private SnapshotOptions snapshotOptions;
    /**
     * <p>
     * Options to specify the subnets and security groups for VPC endpoint. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     * target="_blank">Creating a VPC</a> in <i>VPC Endpoints for Amazon Elasticsearch Service Domains</i>
     * </p>
     */
    private VPCOptions vPCOptions;
    /**
     * <p>
     * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     */
    private CognitoOptions cognitoOptions;
    /**
     * <p>
     * Specifies the Encryption At Rest Options.
     * </p>
     */
    private EncryptionAtRestOptions encryptionAtRestOptions;
    /**
     * <p>
     * Specifies the NodeToNodeEncryptionOptions.
     * </p>
     */
    private NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;
    /**
     * <p>
     * Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring access
     * to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuration Advanced Options</a> for more information.
     * </p>
     */
    private java.util.Map<String, String> advancedOptions;
    /**
     * <p>
     * Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a given type
     * of Elasticsearch log.
     * </p>
     */
    private java.util.Map<String, LogPublishingOption> logPublishingOptions;

    /**
     * <p>
     * The name of the Elasticsearch domain that you are creating. Domain names are unique across the domains owned by
     * an account within an AWS region. Domain names must start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * </p>
     * 
     * @param domainName
     *        The name of the Elasticsearch domain that you are creating. Domain names are unique across the domains
     *        owned by an account within an AWS region. Domain names must start with a letter or number and can contain
     *        the following characters: a-z (lowercase), 0-9, and - (hyphen).
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the Elasticsearch domain that you are creating. Domain names are unique across the domains owned by
     * an account within an AWS region. Domain names must start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * </p>
     * 
     * @return The name of the Elasticsearch domain that you are creating. Domain names are unique across the domains
     *         owned by an account within an AWS region. Domain names must start with a letter or number and can contain
     *         the following characters: a-z (lowercase), 0-9, and - (hyphen).
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the Elasticsearch domain that you are creating. Domain names are unique across the domains owned by
     * an account within an AWS region. Domain names must start with a letter or number and can contain the following
     * characters: a-z (lowercase), 0-9, and - (hyphen).
     * </p>
     * 
     * @param domainName
     *        The name of the Elasticsearch domain that you are creating. Domain names are unique across the domains
     *        owned by an account within an AWS region. Domain names must start with a letter or number and can contain
     *        the following characters: a-z (lowercase), 0-9, and - (hyphen).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateElasticsearchDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain eg. "1.5" or "2.3". For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon Elasticsearch Service Developer Guide</i>.
     * </p>
     * 
     * @param elasticsearchVersion
     *        String of format X.Y to specify version for the Elasticsearch domain eg. "1.5" or "2.3". For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     *        target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon Elasticsearch Service Developer
     *        Guide</i>.
     */

    public void setElasticsearchVersion(String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain eg. "1.5" or "2.3". For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon Elasticsearch Service Developer Guide</i>.
     * </p>
     * 
     * @return String of format X.Y to specify version for the Elasticsearch domain eg. "1.5" or "2.3". For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     *         target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon Elasticsearch Service Developer
     *         Guide</i>.
     */

    public String getElasticsearchVersion() {
        return this.elasticsearchVersion;
    }

    /**
     * <p>
     * String of format X.Y to specify version for the Elasticsearch domain eg. "1.5" or "2.3". For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     * target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon Elasticsearch Service Developer Guide</i>.
     * </p>
     * 
     * @param elasticsearchVersion
     *        String of format X.Y to specify version for the Elasticsearch domain eg. "1.5" or "2.3". For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomains"
     *        target="_blank">Creating Elasticsearch Domains</a> in the <i>Amazon Elasticsearch Service Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateElasticsearchDomainRequest withElasticsearchVersion(String elasticsearchVersion) {
        setElasticsearchVersion(elasticsearchVersion);
        return this;
    }

    /**
     * <p>
     * Configuration options for an Elasticsearch domain. Specifies the instance type and number of instances in the
     * domain cluster.
     * </p>
     * 
     * @param elasticsearchClusterConfig
     *        Configuration options for an Elasticsearch domain. Specifies the instance type and number of instances in
     *        the domain cluster.
     */

    public void setElasticsearchClusterConfig(ElasticsearchClusterConfig elasticsearchClusterConfig) {
        this.elasticsearchClusterConfig = elasticsearchClusterConfig;
    }

    /**
     * <p>
     * Configuration options for an Elasticsearch domain. Specifies the instance type and number of instances in the
     * domain cluster.
     * </p>
     * 
     * @return Configuration options for an Elasticsearch domain. Specifies the instance type and number of instances in
     *         the domain cluster.
     */

    public ElasticsearchClusterConfig getElasticsearchClusterConfig() {
        return this.elasticsearchClusterConfig;
    }

    /**
     * <p>
     * Configuration options for an Elasticsearch domain. Specifies the instance type and number of instances in the
     * domain cluster.
     * </p>
     * 
     * @param elasticsearchClusterConfig
     *        Configuration options for an Elasticsearch domain. Specifies the instance type and number of instances in
     *        the domain cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateElasticsearchDomainRequest withElasticsearchClusterConfig(ElasticsearchClusterConfig elasticsearchClusterConfig) {
        setElasticsearchClusterConfig(elasticsearchClusterConfig);
        return this;
    }

    /**
     * <p>
     * Options to enable, disable and specify the type and size of EBS storage volumes.
     * </p>
     * 
     * @param eBSOptions
     *        Options to enable, disable and specify the type and size of EBS storage volumes.
     */

    public void setEBSOptions(EBSOptions eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    /**
     * <p>
     * Options to enable, disable and specify the type and size of EBS storage volumes.
     * </p>
     * 
     * @return Options to enable, disable and specify the type and size of EBS storage volumes.
     */

    public EBSOptions getEBSOptions() {
        return this.eBSOptions;
    }

    /**
     * <p>
     * Options to enable, disable and specify the type and size of EBS storage volumes.
     * </p>
     * 
     * @param eBSOptions
     *        Options to enable, disable and specify the type and size of EBS storage volumes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateElasticsearchDomainRequest withEBSOptions(EBSOptions eBSOptions) {
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

    public CreateElasticsearchDomainRequest withAccessPolicies(String accessPolicies) {
        setAccessPolicies(accessPolicies);
        return this;
    }

    /**
     * <p>
     * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     * </p>
     * 
     * @param snapshotOptions
     *        Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     */

    public void setSnapshotOptions(SnapshotOptions snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    /**
     * <p>
     * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     * </p>
     * 
     * @return Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     */

    public SnapshotOptions getSnapshotOptions() {
        return this.snapshotOptions;
    }

    /**
     * <p>
     * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     * </p>
     * 
     * @param snapshotOptions
     *        Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateElasticsearchDomainRequest withSnapshotOptions(SnapshotOptions snapshotOptions) {
        setSnapshotOptions(snapshotOptions);
        return this;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for VPC endpoint. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     * target="_blank">Creating a VPC</a> in <i>VPC Endpoints for Amazon Elasticsearch Service Domains</i>
     * </p>
     * 
     * @param vPCOptions
     *        Options to specify the subnets and security groups for VPC endpoint. For more information, see <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     *        target="_blank">Creating a VPC</a> in <i>VPC Endpoints for Amazon Elasticsearch Service Domains</i>
     */

    public void setVPCOptions(VPCOptions vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for VPC endpoint. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     * target="_blank">Creating a VPC</a> in <i>VPC Endpoints for Amazon Elasticsearch Service Domains</i>
     * </p>
     * 
     * @return Options to specify the subnets and security groups for VPC endpoint. For more information, see <a
     *         href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     *         target="_blank">Creating a VPC</a> in <i>VPC Endpoints for Amazon Elasticsearch Service Domains</i>
     */

    public VPCOptions getVPCOptions() {
        return this.vPCOptions;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for VPC endpoint. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     * target="_blank">Creating a VPC</a> in <i>VPC Endpoints for Amazon Elasticsearch Service Domains</i>
     * </p>
     * 
     * @param vPCOptions
     *        Options to specify the subnets and security groups for VPC endpoint. For more information, see <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-creating-vpc"
     *        target="_blank">Creating a VPC</a> in <i>VPC Endpoints for Amazon Elasticsearch Service Domains</i>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateElasticsearchDomainRequest withVPCOptions(VPCOptions vPCOptions) {
        setVPCOptions(vPCOptions);
        return this;
    }

    /**
     * <p>
     * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     * 
     * @param cognitoOptions
     *        Options to specify the Cognito user and identity pools for Kibana authentication. For more information,
     *        see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     *        target="_blank">Amazon Cognito Authentication for Kibana</a>.
     */

    public void setCognitoOptions(CognitoOptions cognitoOptions) {
        this.cognitoOptions = cognitoOptions;
    }

    /**
     * <p>
     * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     * 
     * @return Options to specify the Cognito user and identity pools for Kibana authentication. For more information,
     *         see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     *         target="_blank">Amazon Cognito Authentication for Kibana</a>.
     */

    public CognitoOptions getCognitoOptions() {
        return this.cognitoOptions;
    }

    /**
     * <p>
     * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see <a
     * href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     * target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * </p>
     * 
     * @param cognitoOptions
     *        Options to specify the Cognito user and identity pools for Kibana authentication. For more information,
     *        see <a href="http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-cognito-auth.html"
     *        target="_blank">Amazon Cognito Authentication for Kibana</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateElasticsearchDomainRequest withCognitoOptions(CognitoOptions cognitoOptions) {
        setCognitoOptions(cognitoOptions);
        return this;
    }

    /**
     * <p>
     * Specifies the Encryption At Rest Options.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Specifies the Encryption At Rest Options.
     */

    public void setEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Specifies the Encryption At Rest Options.
     * </p>
     * 
     * @return Specifies the Encryption At Rest Options.
     */

    public EncryptionAtRestOptions getEncryptionAtRestOptions() {
        return this.encryptionAtRestOptions;
    }

    /**
     * <p>
     * Specifies the Encryption At Rest Options.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Specifies the Encryption At Rest Options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateElasticsearchDomainRequest withEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        setEncryptionAtRestOptions(encryptionAtRestOptions);
        return this;
    }

    /**
     * <p>
     * Specifies the NodeToNodeEncryptionOptions.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Specifies the NodeToNodeEncryptionOptions.
     */

    public void setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Specifies the NodeToNodeEncryptionOptions.
     * </p>
     * 
     * @return Specifies the NodeToNodeEncryptionOptions.
     */

    public NodeToNodeEncryptionOptions getNodeToNodeEncryptionOptions() {
        return this.nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Specifies the NodeToNodeEncryptionOptions.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Specifies the NodeToNodeEncryptionOptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateElasticsearchDomainRequest withNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        setNodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions);
        return this;
    }

    /**
     * <p>
     * Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring access
     * to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuration Advanced Options</a> for more information.
     * </p>
     * 
     * @return Option to allow references to indices in an HTTP request body. Must be <code>false</code> when
     *         configuring access to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     *         "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     *         target="_blank">Configuration Advanced Options</a> for more information.
     */

    public java.util.Map<String, String> getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * <p>
     * Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring access
     * to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuration Advanced Options</a> for more information.
     * </p>
     * 
     * @param advancedOptions
     *        Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring
     *        access to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     *        target="_blank">Configuration Advanced Options</a> for more information.
     */

    public void setAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * <p>
     * Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring access
     * to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     * "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     * target="_blank">Configuration Advanced Options</a> for more information.
     * </p>
     * 
     * @param advancedOptions
     *        Option to allow references to indices in an HTTP request body. Must be <code>false</code> when configuring
     *        access to individual sub-resources. By default, the value is <code>true</code>. See <a href=
     *        "http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-createupdatedomains.html#es-createdomain-configure-advanced-options"
     *        target="_blank">Configuration Advanced Options</a> for more information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateElasticsearchDomainRequest withAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        setAdvancedOptions(advancedOptions);
        return this;
    }

    public CreateElasticsearchDomainRequest addAdvancedOptionsEntry(String key, String value) {
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

    public CreateElasticsearchDomainRequest clearAdvancedOptionsEntries() {
        this.advancedOptions = null;
        return this;
    }

    /**
     * <p>
     * Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a given type
     * of Elasticsearch log.
     * </p>
     * 
     * @return Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a
     *         given type of Elasticsearch log.
     */

    public java.util.Map<String, LogPublishingOption> getLogPublishingOptions() {
        return logPublishingOptions;
    }

    /**
     * <p>
     * Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a given type
     * of Elasticsearch log.
     * </p>
     * 
     * @param logPublishingOptions
     *        Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a
     *        given type of Elasticsearch log.
     */

    public void setLogPublishingOptions(java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
    }

    /**
     * <p>
     * Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a given type
     * of Elasticsearch log.
     * </p>
     * 
     * @param logPublishingOptions
     *        Map of <code>LogType</code> and <code>LogPublishingOption</code>, each containing options to publish a
     *        given type of Elasticsearch log.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateElasticsearchDomainRequest withLogPublishingOptions(java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        setLogPublishingOptions(logPublishingOptions);
        return this;
    }

    public CreateElasticsearchDomainRequest addLogPublishingOptionsEntry(String key, LogPublishingOption value) {
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

    public CreateElasticsearchDomainRequest clearLogPublishingOptionsEntries() {
        this.logPublishingOptions = null;
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
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
            sb.append("LogPublishingOptions: ").append(getLogPublishingOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateElasticsearchDomainRequest == false)
            return false;
        CreateElasticsearchDomainRequest other = (CreateElasticsearchDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
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
        return hashCode;
    }

    @Override
    public CreateElasticsearchDomainRequest clone() {
        return (CreateElasticsearchDomainRequest) super.clone();
    }

}
