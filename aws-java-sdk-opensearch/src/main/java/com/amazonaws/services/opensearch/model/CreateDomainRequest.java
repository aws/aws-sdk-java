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

import com.amazonaws.AmazonWebServiceRequest;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDomainRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the OpenSearch Service domain to create. Domain names are unique across the domains owned by an account
     * within an Amazon Web Services Region.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch Service
     * domain. For example, <code>OpenSearch_1.0</code> or <code>Elasticsearch_7.9</code>. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     * >Creating and managing Amazon OpenSearch Service domains</a>.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Container for the cluster configuration of a domain.
     * </p>
     */
    private ClusterConfig clusterConfig;
    /**
     * <p>
     * Container for the parameters required to enable EBS-based storage for an OpenSearch Service domain.
     * </p>
     */
    private EBSOptions eBSOptions;
    /**
     * <p>
     * Identity and Access Management (IAM) policy document specifying the access policies for the new domain.
     * </p>
     */
    private String accessPolicies;
    /**
     * <p>
     * DEPRECATED. Container for the parameters required to configure automated snapshots of domain indexes.
     * </p>
     */
    private SnapshotOptions snapshotOptions;
    /**
     * <p>
     * Container for the values required to configure VPC access domains. If you don't specify these values, OpenSearch
     * Service creates the domain with a public endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your Amazon
     * OpenSearch Service domains using a VPC</a>.
     * </p>
     */
    private VPCOptions vPCOptions;
    /**
     * <p>
     * Key-value pairs to configure Amazon Cognito authentication. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html">Configuring Amazon
     * Cognito authentication for OpenSearch Dashboards</a>.
     * </p>
     */
    private CognitoOptions cognitoOptions;
    /**
     * <p>
     * Key-value pairs to enable encryption at rest.
     * </p>
     */
    private EncryptionAtRestOptions encryptionAtRestOptions;
    /**
     * <p>
     * Enables node-to-node encryption.
     * </p>
     */
    private NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;
    /**
     * <p>
     * Key-value pairs to specify advanced configuration options. The following key-value pairs are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"rest.action.multi.allow_explicit_index": "true" | "false"</code> - Note the use of a string rather than a
     * boolean. Specifies whether explicit references to indexes are allowed inside the body of HTTP requests. If you
     * want to configure access policies for domain sub-resources, such as specific indexes and domain APIs, you must
     * disable this property. Default is true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"indices.fielddata.cache.size": "80" </code> - Note the use of a string rather than a boolean. Specifies
     * the percentage of heap space allocated to field data. Default is unbounded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"indices.query.bool.max_clause_count": "1024"</code> - Note the use of a string rather than a boolean.
     * Specifies the maximum number of clauses allowed in a Lucene boolean query. Default is 1,024. Queries with more
     * than the permitted number of clauses result in a <code>TooManyClauses</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"override_main_response_version": "true" | "false"</code> - Note the use of a string rather than a boolean.
     * Specifies whether the domain reports its version as 7.10 to allow Elasticsearch OSS clients and plugins to
     * continue working with it. Default is false when creating a domain and true when upgrading a domain.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * >Advanced cluster parameters</a>.
     * </p>
     */
    private java.util.Map<String, String> advancedOptions;
    /**
     * <p>
     * Key-value pairs to configure slow log publishing.
     * </p>
     */
    private java.util.Map<String, LogPublishingOption> logPublishingOptions;
    /**
     * <p>
     * Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
     * </p>
     */
    private DomainEndpointOptions domainEndpointOptions;
    /**
     * <p>
     * Options for fine-grained access control.
     * </p>
     */
    private AdvancedSecurityOptionsInput advancedSecurityOptions;
    /**
     * <p>
     * List of tags to add to the domain upon creation.
     * </p>
     */
    private java.util.List<Tag> tagList;
    /**
     * <p>
     * Options for Auto-Tune.
     * </p>
     */
    private AutoTuneOptionsInput autoTuneOptions;

    /**
     * <p>
     * Name of the OpenSearch Service domain to create. Domain names are unique across the domains owned by an account
     * within an Amazon Web Services Region.
     * </p>
     * 
     * @param domainName
     *        Name of the OpenSearch Service domain to create. Domain names are unique across the domains owned by an
     *        account within an Amazon Web Services Region.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of the OpenSearch Service domain to create. Domain names are unique across the domains owned by an account
     * within an Amazon Web Services Region.
     * </p>
     * 
     * @return Name of the OpenSearch Service domain to create. Domain names are unique across the domains owned by an
     *         account within an Amazon Web Services Region.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Name of the OpenSearch Service domain to create. Domain names are unique across the domains owned by an account
     * within an Amazon Web Services Region.
     * </p>
     * 
     * @param domainName
     *        Name of the OpenSearch Service domain to create. Domain names are unique across the domains owned by an
     *        account within an Amazon Web Services Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch Service
     * domain. For example, <code>OpenSearch_1.0</code> or <code>Elasticsearch_7.9</code>. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     * >Creating and managing Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param engineVersion
     *        String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch
     *        Service domain. For example, <code>OpenSearch_1.0</code> or <code>Elasticsearch_7.9</code>. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     *        >Creating and managing Amazon OpenSearch Service domains</a>.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch Service
     * domain. For example, <code>OpenSearch_1.0</code> or <code>Elasticsearch_7.9</code>. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     * >Creating and managing Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @return String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch
     *         Service domain. For example, <code>OpenSearch_1.0</code> or <code>Elasticsearch_7.9</code>. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     *         >Creating and managing Amazon OpenSearch Service domains</a>.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch Service
     * domain. For example, <code>OpenSearch_1.0</code> or <code>Elasticsearch_7.9</code>. For more information, see <a
     * href
     * ="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     * >Creating and managing Amazon OpenSearch Service domains</a>.
     * </p>
     * 
     * @param engineVersion
     *        String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch
     *        Service domain. For example, <code>OpenSearch_1.0</code> or <code>Elasticsearch_7.9</code>. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomains"
     *        >Creating and managing Amazon OpenSearch Service domains</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * Container for the cluster configuration of a domain.
     * </p>
     * 
     * @param clusterConfig
     *        Container for the cluster configuration of a domain.
     */

    public void setClusterConfig(ClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    /**
     * <p>
     * Container for the cluster configuration of a domain.
     * </p>
     * 
     * @return Container for the cluster configuration of a domain.
     */

    public ClusterConfig getClusterConfig() {
        return this.clusterConfig;
    }

    /**
     * <p>
     * Container for the cluster configuration of a domain.
     * </p>
     * 
     * @param clusterConfig
     *        Container for the cluster configuration of a domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withClusterConfig(ClusterConfig clusterConfig) {
        setClusterConfig(clusterConfig);
        return this;
    }

    /**
     * <p>
     * Container for the parameters required to enable EBS-based storage for an OpenSearch Service domain.
     * </p>
     * 
     * @param eBSOptions
     *        Container for the parameters required to enable EBS-based storage for an OpenSearch Service domain.
     */

    public void setEBSOptions(EBSOptions eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    /**
     * <p>
     * Container for the parameters required to enable EBS-based storage for an OpenSearch Service domain.
     * </p>
     * 
     * @return Container for the parameters required to enable EBS-based storage for an OpenSearch Service domain.
     */

    public EBSOptions getEBSOptions() {
        return this.eBSOptions;
    }

    /**
     * <p>
     * Container for the parameters required to enable EBS-based storage for an OpenSearch Service domain.
     * </p>
     * 
     * @param eBSOptions
     *        Container for the parameters required to enable EBS-based storage for an OpenSearch Service domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withEBSOptions(EBSOptions eBSOptions) {
        setEBSOptions(eBSOptions);
        return this;
    }

    /**
     * <p>
     * Identity and Access Management (IAM) policy document specifying the access policies for the new domain.
     * </p>
     * 
     * @param accessPolicies
     *        Identity and Access Management (IAM) policy document specifying the access policies for the new domain.
     */

    public void setAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * Identity and Access Management (IAM) policy document specifying the access policies for the new domain.
     * </p>
     * 
     * @return Identity and Access Management (IAM) policy document specifying the access policies for the new domain.
     */

    public String getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * <p>
     * Identity and Access Management (IAM) policy document specifying the access policies for the new domain.
     * </p>
     * 
     * @param accessPolicies
     *        Identity and Access Management (IAM) policy document specifying the access policies for the new domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withAccessPolicies(String accessPolicies) {
        setAccessPolicies(accessPolicies);
        return this;
    }

    /**
     * <p>
     * DEPRECATED. Container for the parameters required to configure automated snapshots of domain indexes.
     * </p>
     * 
     * @param snapshotOptions
     *        DEPRECATED. Container for the parameters required to configure automated snapshots of domain indexes.
     */

    public void setSnapshotOptions(SnapshotOptions snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    /**
     * <p>
     * DEPRECATED. Container for the parameters required to configure automated snapshots of domain indexes.
     * </p>
     * 
     * @return DEPRECATED. Container for the parameters required to configure automated snapshots of domain indexes.
     */

    public SnapshotOptions getSnapshotOptions() {
        return this.snapshotOptions;
    }

    /**
     * <p>
     * DEPRECATED. Container for the parameters required to configure automated snapshots of domain indexes.
     * </p>
     * 
     * @param snapshotOptions
     *        DEPRECATED. Container for the parameters required to configure automated snapshots of domain indexes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withSnapshotOptions(SnapshotOptions snapshotOptions) {
        setSnapshotOptions(snapshotOptions);
        return this;
    }

    /**
     * <p>
     * Container for the values required to configure VPC access domains. If you don't specify these values, OpenSearch
     * Service creates the domain with a public endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your Amazon
     * OpenSearch Service domains using a VPC</a>.
     * </p>
     * 
     * @param vPCOptions
     *        Container for the values required to configure VPC access domains. If you don't specify these values,
     *        OpenSearch Service creates the domain with a public endpoint. For more information, see <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your Amazon
     *        OpenSearch Service domains using a VPC</a>.
     */

    public void setVPCOptions(VPCOptions vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    /**
     * <p>
     * Container for the values required to configure VPC access domains. If you don't specify these values, OpenSearch
     * Service creates the domain with a public endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your Amazon
     * OpenSearch Service domains using a VPC</a>.
     * </p>
     * 
     * @return Container for the values required to configure VPC access domains. If you don't specify these values,
     *         OpenSearch Service creates the domain with a public endpoint. For more information, see <a
     *         href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your
     *         Amazon OpenSearch Service domains using a VPC</a>.
     */

    public VPCOptions getVPCOptions() {
        return this.vPCOptions;
    }

    /**
     * <p>
     * Container for the values required to configure VPC access domains. If you don't specify these values, OpenSearch
     * Service creates the domain with a public endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your Amazon
     * OpenSearch Service domains using a VPC</a>.
     * </p>
     * 
     * @param vPCOptions
     *        Container for the values required to configure VPC access domains. If you don't specify these values,
     *        OpenSearch Service creates the domain with a public endpoint. For more information, see <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your Amazon
     *        OpenSearch Service domains using a VPC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withVPCOptions(VPCOptions vPCOptions) {
        setVPCOptions(vPCOptions);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to configure Amazon Cognito authentication. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html">Configuring Amazon
     * Cognito authentication for OpenSearch Dashboards</a>.
     * </p>
     * 
     * @param cognitoOptions
     *        Key-value pairs to configure Amazon Cognito authentication. For more information, see <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html">Configuring
     *        Amazon Cognito authentication for OpenSearch Dashboards</a>.
     */

    public void setCognitoOptions(CognitoOptions cognitoOptions) {
        this.cognitoOptions = cognitoOptions;
    }

    /**
     * <p>
     * Key-value pairs to configure Amazon Cognito authentication. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html">Configuring Amazon
     * Cognito authentication for OpenSearch Dashboards</a>.
     * </p>
     * 
     * @return Key-value pairs to configure Amazon Cognito authentication. For more information, see <a
     *         href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html">Configuring
     *         Amazon Cognito authentication for OpenSearch Dashboards</a>.
     */

    public CognitoOptions getCognitoOptions() {
        return this.cognitoOptions;
    }

    /**
     * <p>
     * Key-value pairs to configure Amazon Cognito authentication. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html">Configuring Amazon
     * Cognito authentication for OpenSearch Dashboards</a>.
     * </p>
     * 
     * @param cognitoOptions
     *        Key-value pairs to configure Amazon Cognito authentication. For more information, see <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/cognito-auth.html">Configuring
     *        Amazon Cognito authentication for OpenSearch Dashboards</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withCognitoOptions(CognitoOptions cognitoOptions) {
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

    public void setEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Key-value pairs to enable encryption at rest.
     * </p>
     * 
     * @return Key-value pairs to enable encryption at rest.
     */

    public EncryptionAtRestOptions getEncryptionAtRestOptions() {
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

    public CreateDomainRequest withEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        setEncryptionAtRestOptions(encryptionAtRestOptions);
        return this;
    }

    /**
     * <p>
     * Enables node-to-node encryption.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Enables node-to-node encryption.
     */

    public void setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Enables node-to-node encryption.
     * </p>
     * 
     * @return Enables node-to-node encryption.
     */

    public NodeToNodeEncryptionOptions getNodeToNodeEncryptionOptions() {
        return this.nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Enables node-to-node encryption.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Enables node-to-node encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        setNodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions);
        return this;
    }

    /**
     * <p>
     * Key-value pairs to specify advanced configuration options. The following key-value pairs are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"rest.action.multi.allow_explicit_index": "true" | "false"</code> - Note the use of a string rather than a
     * boolean. Specifies whether explicit references to indexes are allowed inside the body of HTTP requests. If you
     * want to configure access policies for domain sub-resources, such as specific indexes and domain APIs, you must
     * disable this property. Default is true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"indices.fielddata.cache.size": "80" </code> - Note the use of a string rather than a boolean. Specifies
     * the percentage of heap space allocated to field data. Default is unbounded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"indices.query.bool.max_clause_count": "1024"</code> - Note the use of a string rather than a boolean.
     * Specifies the maximum number of clauses allowed in a Lucene boolean query. Default is 1,024. Queries with more
     * than the permitted number of clauses result in a <code>TooManyClauses</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"override_main_response_version": "true" | "false"</code> - Note the use of a string rather than a boolean.
     * Specifies whether the domain reports its version as 7.10 to allow Elasticsearch OSS clients and plugins to
     * continue working with it. Default is false when creating a domain and true when upgrading a domain.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * >Advanced cluster parameters</a>.
     * </p>
     * 
     * @return Key-value pairs to specify advanced configuration options. The following key-value pairs are
     *         supported:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>"rest.action.multi.allow_explicit_index": "true" | "false"</code> - Note the use of a string rather
     *         than a boolean. Specifies whether explicit references to indexes are allowed inside the body of HTTP
     *         requests. If you want to configure access policies for domain sub-resources, such as specific indexes and
     *         domain APIs, you must disable this property. Default is true.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"indices.fielddata.cache.size": "80" </code> - Note the use of a string rather than a boolean.
     *         Specifies the percentage of heap space allocated to field data. Default is unbounded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"indices.query.bool.max_clause_count": "1024"</code> - Note the use of a string rather than a
     *         boolean. Specifies the maximum number of clauses allowed in a Lucene boolean query. Default is 1,024.
     *         Queries with more than the permitted number of clauses result in a <code>TooManyClauses</code> error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>"override_main_response_version": "true" | "false"</code> - Note the use of a string rather than a
     *         boolean. Specifies whether the domain reports its version as 7.10 to allow Elasticsearch OSS clients and
     *         plugins to continue working with it. Default is false when creating a domain and true when upgrading a
     *         domain.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     *         >Advanced cluster parameters</a>.
     */

    public java.util.Map<String, String> getAdvancedOptions() {
        return advancedOptions;
    }

    /**
     * <p>
     * Key-value pairs to specify advanced configuration options. The following key-value pairs are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"rest.action.multi.allow_explicit_index": "true" | "false"</code> - Note the use of a string rather than a
     * boolean. Specifies whether explicit references to indexes are allowed inside the body of HTTP requests. If you
     * want to configure access policies for domain sub-resources, such as specific indexes and domain APIs, you must
     * disable this property. Default is true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"indices.fielddata.cache.size": "80" </code> - Note the use of a string rather than a boolean. Specifies
     * the percentage of heap space allocated to field data. Default is unbounded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"indices.query.bool.max_clause_count": "1024"</code> - Note the use of a string rather than a boolean.
     * Specifies the maximum number of clauses allowed in a Lucene boolean query. Default is 1,024. Queries with more
     * than the permitted number of clauses result in a <code>TooManyClauses</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"override_main_response_version": "true" | "false"</code> - Note the use of a string rather than a boolean.
     * Specifies whether the domain reports its version as 7.10 to allow Elasticsearch OSS clients and plugins to
     * continue working with it. Default is false when creating a domain and true when upgrading a domain.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * >Advanced cluster parameters</a>.
     * </p>
     * 
     * @param advancedOptions
     *        Key-value pairs to specify advanced configuration options. The following key-value pairs are
     *        supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"rest.action.multi.allow_explicit_index": "true" | "false"</code> - Note the use of a string rather
     *        than a boolean. Specifies whether explicit references to indexes are allowed inside the body of HTTP
     *        requests. If you want to configure access policies for domain sub-resources, such as specific indexes and
     *        domain APIs, you must disable this property. Default is true.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"indices.fielddata.cache.size": "80" </code> - Note the use of a string rather than a boolean.
     *        Specifies the percentage of heap space allocated to field data. Default is unbounded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"indices.query.bool.max_clause_count": "1024"</code> - Note the use of a string rather than a
     *        boolean. Specifies the maximum number of clauses allowed in a Lucene boolean query. Default is 1,024.
     *        Queries with more than the permitted number of clauses result in a <code>TooManyClauses</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"override_main_response_version": "true" | "false"</code> - Note the use of a string rather than a
     *        boolean. Specifies whether the domain reports its version as 7.10 to allow Elasticsearch OSS clients and
     *        plugins to continue working with it. Default is false when creating a domain and true when upgrading a
     *        domain.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     *        >Advanced cluster parameters</a>.
     */

    public void setAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        this.advancedOptions = advancedOptions;
    }

    /**
     * <p>
     * Key-value pairs to specify advanced configuration options. The following key-value pairs are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>"rest.action.multi.allow_explicit_index": "true" | "false"</code> - Note the use of a string rather than a
     * boolean. Specifies whether explicit references to indexes are allowed inside the body of HTTP requests. If you
     * want to configure access policies for domain sub-resources, such as specific indexes and domain APIs, you must
     * disable this property. Default is true.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"indices.fielddata.cache.size": "80" </code> - Note the use of a string rather than a boolean. Specifies
     * the percentage of heap space allocated to field data. Default is unbounded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"indices.query.bool.max_clause_count": "1024"</code> - Note the use of a string rather than a boolean.
     * Specifies the maximum number of clauses allowed in a Lucene boolean query. Default is 1,024. Queries with more
     * than the permitted number of clauses result in a <code>TooManyClauses</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>"override_main_response_version": "true" | "false"</code> - Note the use of a string rather than a boolean.
     * Specifies whether the domain reports its version as 7.10 to allow Elasticsearch OSS clients and plugins to
     * continue working with it. Default is false when creating a domain and true when upgrading a domain.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     * >Advanced cluster parameters</a>.
     * </p>
     * 
     * @param advancedOptions
     *        Key-value pairs to specify advanced configuration options. The following key-value pairs are
     *        supported:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>"rest.action.multi.allow_explicit_index": "true" | "false"</code> - Note the use of a string rather
     *        than a boolean. Specifies whether explicit references to indexes are allowed inside the body of HTTP
     *        requests. If you want to configure access policies for domain sub-resources, such as specific indexes and
     *        domain APIs, you must disable this property. Default is true.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"indices.fielddata.cache.size": "80" </code> - Note the use of a string rather than a boolean.
     *        Specifies the percentage of heap space allocated to field data. Default is unbounded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"indices.query.bool.max_clause_count": "1024"</code> - Note the use of a string rather than a
     *        boolean. Specifies the maximum number of clauses allowed in a Lucene boolean query. Default is 1,024.
     *        Queries with more than the permitted number of clauses result in a <code>TooManyClauses</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>"override_main_response_version": "true" | "false"</code> - Note the use of a string rather than a
     *        boolean. Specifies whether the domain reports its version as 7.10 to allow Elasticsearch OSS clients and
     *        plugins to continue working with it. Default is false when creating a domain and true when upgrading a
     *        domain.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/opensearch-service/latest/developerguide/createupdatedomains.html#createdomain-configure-advanced-options"
     *        >Advanced cluster parameters</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        setAdvancedOptions(advancedOptions);
        return this;
    }

    /**
     * Add a single AdvancedOptions entry
     *
     * @see CreateDomainRequest#withAdvancedOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest addAdvancedOptionsEntry(String key, String value) {
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

    public CreateDomainRequest clearAdvancedOptionsEntries() {
        this.advancedOptions = null;
        return this;
    }

    /**
     * <p>
     * Key-value pairs to configure slow log publishing.
     * </p>
     * 
     * @return Key-value pairs to configure slow log publishing.
     */

    public java.util.Map<String, LogPublishingOption> getLogPublishingOptions() {
        return logPublishingOptions;
    }

    /**
     * <p>
     * Key-value pairs to configure slow log publishing.
     * </p>
     * 
     * @param logPublishingOptions
     *        Key-value pairs to configure slow log publishing.
     */

    public void setLogPublishingOptions(java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
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

    public CreateDomainRequest withLogPublishingOptions(java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        setLogPublishingOptions(logPublishingOptions);
        return this;
    }

    /**
     * Add a single LogPublishingOptions entry
     *
     * @see CreateDomainRequest#withLogPublishingOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest addLogPublishingOptionsEntry(String key, LogPublishingOption value) {
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

    public CreateDomainRequest clearLogPublishingOptionsEntries() {
        this.logPublishingOptions = null;
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

    public CreateDomainRequest withDomainEndpointOptions(DomainEndpointOptions domainEndpointOptions) {
        setDomainEndpointOptions(domainEndpointOptions);
        return this;
    }

    /**
     * <p>
     * Options for fine-grained access control.
     * </p>
     * 
     * @param advancedSecurityOptions
     *        Options for fine-grained access control.
     */

    public void setAdvancedSecurityOptions(AdvancedSecurityOptionsInput advancedSecurityOptions) {
        this.advancedSecurityOptions = advancedSecurityOptions;
    }

    /**
     * <p>
     * Options for fine-grained access control.
     * </p>
     * 
     * @return Options for fine-grained access control.
     */

    public AdvancedSecurityOptionsInput getAdvancedSecurityOptions() {
        return this.advancedSecurityOptions;
    }

    /**
     * <p>
     * Options for fine-grained access control.
     * </p>
     * 
     * @param advancedSecurityOptions
     *        Options for fine-grained access control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withAdvancedSecurityOptions(AdvancedSecurityOptionsInput advancedSecurityOptions) {
        setAdvancedSecurityOptions(advancedSecurityOptions);
        return this;
    }

    /**
     * <p>
     * List of tags to add to the domain upon creation.
     * </p>
     * 
     * @return List of tags to add to the domain upon creation.
     */

    public java.util.List<Tag> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * List of tags to add to the domain upon creation.
     * </p>
     * 
     * @param tagList
     *        List of tags to add to the domain upon creation.
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<Tag>(tagList);
    }

    /**
     * <p>
     * List of tags to add to the domain upon creation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        List of tags to add to the domain upon creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new java.util.ArrayList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of tags to add to the domain upon creation.
     * </p>
     * 
     * @param tagList
     *        List of tags to add to the domain upon creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
        return this;
    }

    /**
     * <p>
     * Options for Auto-Tune.
     * </p>
     * 
     * @param autoTuneOptions
     *        Options for Auto-Tune.
     */

    public void setAutoTuneOptions(AutoTuneOptionsInput autoTuneOptions) {
        this.autoTuneOptions = autoTuneOptions;
    }

    /**
     * <p>
     * Options for Auto-Tune.
     * </p>
     * 
     * @return Options for Auto-Tune.
     */

    public AutoTuneOptionsInput getAutoTuneOptions() {
        return this.autoTuneOptions;
    }

    /**
     * <p>
     * Options for Auto-Tune.
     * </p>
     * 
     * @param autoTuneOptions
     *        Options for Auto-Tune.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDomainRequest withAutoTuneOptions(AutoTuneOptionsInput autoTuneOptions) {
        setAutoTuneOptions(autoTuneOptions);
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
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList()).append(",");
        if (getAutoTuneOptions() != null)
            sb.append("AutoTuneOptions: ").append(getAutoTuneOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDomainRequest == false)
            return false;
        CreateDomainRequest other = (CreateDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
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
        if (other.getDomainEndpointOptions() == null ^ this.getDomainEndpointOptions() == null)
            return false;
        if (other.getDomainEndpointOptions() != null && other.getDomainEndpointOptions().equals(this.getDomainEndpointOptions()) == false)
            return false;
        if (other.getAdvancedSecurityOptions() == null ^ this.getAdvancedSecurityOptions() == null)
            return false;
        if (other.getAdvancedSecurityOptions() != null && other.getAdvancedSecurityOptions().equals(this.getAdvancedSecurityOptions()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        if (other.getAutoTuneOptions() == null ^ this.getAutoTuneOptions() == null)
            return false;
        if (other.getAutoTuneOptions() != null && other.getAutoTuneOptions().equals(this.getAutoTuneOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
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
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        hashCode = prime * hashCode + ((getAutoTuneOptions() == null) ? 0 : getAutoTuneOptions().hashCode());
        return hashCode;
    }

    @Override
    public CreateDomainRequest clone() {
        return (CreateDomainRequest) super.clone();
    }

}
