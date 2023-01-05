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

/**
 * <p>
 * Container for the request parameters to the <code>UpdateDomain</code> operation.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDomainConfigRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain that you're updating.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Changes that you want to make to the cluster configuration, such as the instance type and number of EC2
     * instances.
     * </p>
     */
    private ClusterConfig clusterConfig;
    /**
     * <p>
     * The type and size of the EBS volume to attach to instances in the domain.
     * </p>
     */
    private EBSOptions eBSOptions;
    /**
     * <p>
     * Option to set the time, in UTC format, for the daily automated snapshot. Default value is <code>0</code> hours.
     * </p>
     */
    private SnapshotOptions snapshotOptions;
    /**
     * <p>
     * Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your Amazon
     * OpenSearch Service domains using a VPC</a>.
     * </p>
     */
    private VPCOptions vPCOptions;
    /**
     * <p>
     * Key-value pairs to configure Amazon Cognito authentication for OpenSearch Dashboards.
     * </p>
     */
    private CognitoOptions cognitoOptions;
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
     * Identity and Access Management (IAM) access policy as a JSON-formatted string.
     * </p>
     */
    private String accessPolicies;
    /**
     * <p>
     * Options to publish OpenSearch lots to Amazon CloudWatch Logs.
     * </p>
     */
    private java.util.Map<String, LogPublishingOption> logPublishingOptions;
    /**
     * <p>
     * Encryption at rest options for the domain.
     * </p>
     */
    private EncryptionAtRestOptions encryptionAtRestOptions;
    /**
     * <p>
     * Additional options for the domain endpoint, such as whether to require HTTPS for all traffic.
     * </p>
     */
    private DomainEndpointOptions domainEndpointOptions;
    /**
     * <p>
     * Node-To-Node Encryption options for the domain.
     * </p>
     */
    private NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;
    /**
     * <p>
     * Options for fine-grained access control.
     * </p>
     */
    private AdvancedSecurityOptionsInput advancedSecurityOptions;
    /**
     * <p>
     * Options for Auto-Tune.
     * </p>
     */
    private AutoTuneOptions autoTuneOptions;
    /**
     * <p>
     * This flag, when set to True, specifies whether the <code>UpdateDomain</code> request should return the results of
     * validation check without actually applying the change.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The name of the domain that you're updating.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you're updating.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the domain that you're updating.
     * </p>
     * 
     * @return The name of the domain that you're updating.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the domain that you're updating.
     * </p>
     * 
     * @param domainName
     *        The name of the domain that you're updating.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Changes that you want to make to the cluster configuration, such as the instance type and number of EC2
     * instances.
     * </p>
     * 
     * @param clusterConfig
     *        Changes that you want to make to the cluster configuration, such as the instance type and number of EC2
     *        instances.
     */

    public void setClusterConfig(ClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    /**
     * <p>
     * Changes that you want to make to the cluster configuration, such as the instance type and number of EC2
     * instances.
     * </p>
     * 
     * @return Changes that you want to make to the cluster configuration, such as the instance type and number of EC2
     *         instances.
     */

    public ClusterConfig getClusterConfig() {
        return this.clusterConfig;
    }

    /**
     * <p>
     * Changes that you want to make to the cluster configuration, such as the instance type and number of EC2
     * instances.
     * </p>
     * 
     * @param clusterConfig
     *        Changes that you want to make to the cluster configuration, such as the instance type and number of EC2
     *        instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigRequest withClusterConfig(ClusterConfig clusterConfig) {
        setClusterConfig(clusterConfig);
        return this;
    }

    /**
     * <p>
     * The type and size of the EBS volume to attach to instances in the domain.
     * </p>
     * 
     * @param eBSOptions
     *        The type and size of the EBS volume to attach to instances in the domain.
     */

    public void setEBSOptions(EBSOptions eBSOptions) {
        this.eBSOptions = eBSOptions;
    }

    /**
     * <p>
     * The type and size of the EBS volume to attach to instances in the domain.
     * </p>
     * 
     * @return The type and size of the EBS volume to attach to instances in the domain.
     */

    public EBSOptions getEBSOptions() {
        return this.eBSOptions;
    }

    /**
     * <p>
     * The type and size of the EBS volume to attach to instances in the domain.
     * </p>
     * 
     * @param eBSOptions
     *        The type and size of the EBS volume to attach to instances in the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigRequest withEBSOptions(EBSOptions eBSOptions) {
        setEBSOptions(eBSOptions);
        return this;
    }

    /**
     * <p>
     * Option to set the time, in UTC format, for the daily automated snapshot. Default value is <code>0</code> hours.
     * </p>
     * 
     * @param snapshotOptions
     *        Option to set the time, in UTC format, for the daily automated snapshot. Default value is <code>0</code>
     *        hours.
     */

    public void setSnapshotOptions(SnapshotOptions snapshotOptions) {
        this.snapshotOptions = snapshotOptions;
    }

    /**
     * <p>
     * Option to set the time, in UTC format, for the daily automated snapshot. Default value is <code>0</code> hours.
     * </p>
     * 
     * @return Option to set the time, in UTC format, for the daily automated snapshot. Default value is <code>0</code>
     *         hours.
     */

    public SnapshotOptions getSnapshotOptions() {
        return this.snapshotOptions;
    }

    /**
     * <p>
     * Option to set the time, in UTC format, for the daily automated snapshot. Default value is <code>0</code> hours.
     * </p>
     * 
     * @param snapshotOptions
     *        Option to set the time, in UTC format, for the daily automated snapshot. Default value is <code>0</code>
     *        hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigRequest withSnapshotOptions(SnapshotOptions snapshotOptions) {
        setSnapshotOptions(snapshotOptions);
        return this;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your Amazon
     * OpenSearch Service domains using a VPC</a>.
     * </p>
     * 
     * @param vPCOptions
     *        Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your Amazon
     *        OpenSearch Service domains using a VPC</a>.
     */

    public void setVPCOptions(VPCOptions vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your Amazon
     * OpenSearch Service domains using a VPC</a>.
     * </p>
     * 
     * @return Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     *         href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your
     *         Amazon OpenSearch Service domains using a VPC</a>.
     */

    public VPCOptions getVPCOptions() {
        return this.vPCOptions;
    }

    /**
     * <p>
     * Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     * href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your Amazon
     * OpenSearch Service domains using a VPC</a>.
     * </p>
     * 
     * @param vPCOptions
     *        Options to specify the subnets and security groups for a VPC endpoint. For more information, see <a
     *        href="https://docs.aws.amazon.com/opensearch-service/latest/developerguide/vpc.html">Launching your Amazon
     *        OpenSearch Service domains using a VPC</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigRequest withVPCOptions(VPCOptions vPCOptions) {
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

    public UpdateDomainConfigRequest withCognitoOptions(CognitoOptions cognitoOptions) {
        setCognitoOptions(cognitoOptions);
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

    public UpdateDomainConfigRequest withAdvancedOptions(java.util.Map<String, String> advancedOptions) {
        setAdvancedOptions(advancedOptions);
        return this;
    }

    /**
     * Add a single AdvancedOptions entry
     *
     * @see UpdateDomainConfigRequest#withAdvancedOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigRequest addAdvancedOptionsEntry(String key, String value) {
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

    public UpdateDomainConfigRequest clearAdvancedOptionsEntries() {
        this.advancedOptions = null;
        return this;
    }

    /**
     * <p>
     * Identity and Access Management (IAM) access policy as a JSON-formatted string.
     * </p>
     * 
     * @param accessPolicies
     *        Identity and Access Management (IAM) access policy as a JSON-formatted string.
     */

    public void setAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * Identity and Access Management (IAM) access policy as a JSON-formatted string.
     * </p>
     * 
     * @return Identity and Access Management (IAM) access policy as a JSON-formatted string.
     */

    public String getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * <p>
     * Identity and Access Management (IAM) access policy as a JSON-formatted string.
     * </p>
     * 
     * @param accessPolicies
     *        Identity and Access Management (IAM) access policy as a JSON-formatted string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigRequest withAccessPolicies(String accessPolicies) {
        setAccessPolicies(accessPolicies);
        return this;
    }

    /**
     * <p>
     * Options to publish OpenSearch lots to Amazon CloudWatch Logs.
     * </p>
     * 
     * @return Options to publish OpenSearch lots to Amazon CloudWatch Logs.
     */

    public java.util.Map<String, LogPublishingOption> getLogPublishingOptions() {
        return logPublishingOptions;
    }

    /**
     * <p>
     * Options to publish OpenSearch lots to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param logPublishingOptions
     *        Options to publish OpenSearch lots to Amazon CloudWatch Logs.
     */

    public void setLogPublishingOptions(java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
    }

    /**
     * <p>
     * Options to publish OpenSearch lots to Amazon CloudWatch Logs.
     * </p>
     * 
     * @param logPublishingOptions
     *        Options to publish OpenSearch lots to Amazon CloudWatch Logs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigRequest withLogPublishingOptions(java.util.Map<String, LogPublishingOption> logPublishingOptions) {
        setLogPublishingOptions(logPublishingOptions);
        return this;
    }

    /**
     * Add a single LogPublishingOptions entry
     *
     * @see UpdateDomainConfigRequest#withLogPublishingOptions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigRequest addLogPublishingOptionsEntry(String key, LogPublishingOption value) {
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

    public UpdateDomainConfigRequest clearLogPublishingOptionsEntries() {
        this.logPublishingOptions = null;
        return this;
    }

    /**
     * <p>
     * Encryption at rest options for the domain.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Encryption at rest options for the domain.
     */

    public void setEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Encryption at rest options for the domain.
     * </p>
     * 
     * @return Encryption at rest options for the domain.
     */

    public EncryptionAtRestOptions getEncryptionAtRestOptions() {
        return this.encryptionAtRestOptions;
    }

    /**
     * <p>
     * Encryption at rest options for the domain.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Encryption at rest options for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigRequest withEncryptionAtRestOptions(EncryptionAtRestOptions encryptionAtRestOptions) {
        setEncryptionAtRestOptions(encryptionAtRestOptions);
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

    public UpdateDomainConfigRequest withDomainEndpointOptions(DomainEndpointOptions domainEndpointOptions) {
        setDomainEndpointOptions(domainEndpointOptions);
        return this;
    }

    /**
     * <p>
     * Node-To-Node Encryption options for the domain.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Node-To-Node Encryption options for the domain.
     */

    public void setNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Node-To-Node Encryption options for the domain.
     * </p>
     * 
     * @return Node-To-Node Encryption options for the domain.
     */

    public NodeToNodeEncryptionOptions getNodeToNodeEncryptionOptions() {
        return this.nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Node-To-Node Encryption options for the domain.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Node-To-Node Encryption options for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigRequest withNodeToNodeEncryptionOptions(NodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        setNodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions);
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

    public UpdateDomainConfigRequest withAdvancedSecurityOptions(AdvancedSecurityOptionsInput advancedSecurityOptions) {
        setAdvancedSecurityOptions(advancedSecurityOptions);
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

    public void setAutoTuneOptions(AutoTuneOptions autoTuneOptions) {
        this.autoTuneOptions = autoTuneOptions;
    }

    /**
     * <p>
     * Options for Auto-Tune.
     * </p>
     * 
     * @return Options for Auto-Tune.
     */

    public AutoTuneOptions getAutoTuneOptions() {
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

    public UpdateDomainConfigRequest withAutoTuneOptions(AutoTuneOptions autoTuneOptions) {
        setAutoTuneOptions(autoTuneOptions);
        return this;
    }

    /**
     * <p>
     * This flag, when set to True, specifies whether the <code>UpdateDomain</code> request should return the results of
     * validation check without actually applying the change.
     * </p>
     * 
     * @param dryRun
     *        This flag, when set to True, specifies whether the <code>UpdateDomain</code> request should return the
     *        results of validation check without actually applying the change.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * This flag, when set to True, specifies whether the <code>UpdateDomain</code> request should return the results of
     * validation check without actually applying the change.
     * </p>
     * 
     * @return This flag, when set to True, specifies whether the <code>UpdateDomain</code> request should return the
     *         results of validation check without actually applying the change.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * This flag, when set to True, specifies whether the <code>UpdateDomain</code> request should return the results of
     * validation check without actually applying the change.
     * </p>
     * 
     * @param dryRun
     *        This flag, when set to True, specifies whether the <code>UpdateDomain</code> request should return the
     *        results of validation check without actually applying the change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainConfigRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * This flag, when set to True, specifies whether the <code>UpdateDomain</code> request should return the results of
     * validation check without actually applying the change.
     * </p>
     * 
     * @return This flag, when set to True, specifies whether the <code>UpdateDomain</code> request should return the
     *         results of validation check without actually applying the change.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getClusterConfig() != null)
            sb.append("ClusterConfig: ").append(getClusterConfig()).append(",");
        if (getEBSOptions() != null)
            sb.append("EBSOptions: ").append(getEBSOptions()).append(",");
        if (getSnapshotOptions() != null)
            sb.append("SnapshotOptions: ").append(getSnapshotOptions()).append(",");
        if (getVPCOptions() != null)
            sb.append("VPCOptions: ").append(getVPCOptions()).append(",");
        if (getCognitoOptions() != null)
            sb.append("CognitoOptions: ").append(getCognitoOptions()).append(",");
        if (getAdvancedOptions() != null)
            sb.append("AdvancedOptions: ").append(getAdvancedOptions()).append(",");
        if (getAccessPolicies() != null)
            sb.append("AccessPolicies: ").append(getAccessPolicies()).append(",");
        if (getLogPublishingOptions() != null)
            sb.append("LogPublishingOptions: ").append(getLogPublishingOptions()).append(",");
        if (getEncryptionAtRestOptions() != null)
            sb.append("EncryptionAtRestOptions: ").append(getEncryptionAtRestOptions()).append(",");
        if (getDomainEndpointOptions() != null)
            sb.append("DomainEndpointOptions: ").append(getDomainEndpointOptions()).append(",");
        if (getNodeToNodeEncryptionOptions() != null)
            sb.append("NodeToNodeEncryptionOptions: ").append(getNodeToNodeEncryptionOptions()).append(",");
        if (getAdvancedSecurityOptions() != null)
            sb.append("AdvancedSecurityOptions: ").append(getAdvancedSecurityOptions()).append(",");
        if (getAutoTuneOptions() != null)
            sb.append("AutoTuneOptions: ").append(getAutoTuneOptions()).append(",");
        if (getDryRun() != null)
            sb.append("DryRun: ").append(getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainConfigRequest == false)
            return false;
        UpdateDomainConfigRequest other = (UpdateDomainConfigRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getClusterConfig() == null ^ this.getClusterConfig() == null)
            return false;
        if (other.getClusterConfig() != null && other.getClusterConfig().equals(this.getClusterConfig()) == false)
            return false;
        if (other.getEBSOptions() == null ^ this.getEBSOptions() == null)
            return false;
        if (other.getEBSOptions() != null && other.getEBSOptions().equals(this.getEBSOptions()) == false)
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
        if (other.getAdvancedOptions() == null ^ this.getAdvancedOptions() == null)
            return false;
        if (other.getAdvancedOptions() != null && other.getAdvancedOptions().equals(this.getAdvancedOptions()) == false)
            return false;
        if (other.getAccessPolicies() == null ^ this.getAccessPolicies() == null)
            return false;
        if (other.getAccessPolicies() != null && other.getAccessPolicies().equals(this.getAccessPolicies()) == false)
            return false;
        if (other.getLogPublishingOptions() == null ^ this.getLogPublishingOptions() == null)
            return false;
        if (other.getLogPublishingOptions() != null && other.getLogPublishingOptions().equals(this.getLogPublishingOptions()) == false)
            return false;
        if (other.getEncryptionAtRestOptions() == null ^ this.getEncryptionAtRestOptions() == null)
            return false;
        if (other.getEncryptionAtRestOptions() != null && other.getEncryptionAtRestOptions().equals(this.getEncryptionAtRestOptions()) == false)
            return false;
        if (other.getDomainEndpointOptions() == null ^ this.getDomainEndpointOptions() == null)
            return false;
        if (other.getDomainEndpointOptions() != null && other.getDomainEndpointOptions().equals(this.getDomainEndpointOptions()) == false)
            return false;
        if (other.getNodeToNodeEncryptionOptions() == null ^ this.getNodeToNodeEncryptionOptions() == null)
            return false;
        if (other.getNodeToNodeEncryptionOptions() != null && other.getNodeToNodeEncryptionOptions().equals(this.getNodeToNodeEncryptionOptions()) == false)
            return false;
        if (other.getAdvancedSecurityOptions() == null ^ this.getAdvancedSecurityOptions() == null)
            return false;
        if (other.getAdvancedSecurityOptions() != null && other.getAdvancedSecurityOptions().equals(this.getAdvancedSecurityOptions()) == false)
            return false;
        if (other.getAutoTuneOptions() == null ^ this.getAutoTuneOptions() == null)
            return false;
        if (other.getAutoTuneOptions() != null && other.getAutoTuneOptions().equals(this.getAutoTuneOptions()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getClusterConfig() == null) ? 0 : getClusterConfig().hashCode());
        hashCode = prime * hashCode + ((getEBSOptions() == null) ? 0 : getEBSOptions().hashCode());
        hashCode = prime * hashCode + ((getSnapshotOptions() == null) ? 0 : getSnapshotOptions().hashCode());
        hashCode = prime * hashCode + ((getVPCOptions() == null) ? 0 : getVPCOptions().hashCode());
        hashCode = prime * hashCode + ((getCognitoOptions() == null) ? 0 : getCognitoOptions().hashCode());
        hashCode = prime * hashCode + ((getAdvancedOptions() == null) ? 0 : getAdvancedOptions().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicies() == null) ? 0 : getAccessPolicies().hashCode());
        hashCode = prime * hashCode + ((getLogPublishingOptions() == null) ? 0 : getLogPublishingOptions().hashCode());
        hashCode = prime * hashCode + ((getEncryptionAtRestOptions() == null) ? 0 : getEncryptionAtRestOptions().hashCode());
        hashCode = prime * hashCode + ((getDomainEndpointOptions() == null) ? 0 : getDomainEndpointOptions().hashCode());
        hashCode = prime * hashCode + ((getNodeToNodeEncryptionOptions() == null) ? 0 : getNodeToNodeEncryptionOptions().hashCode());
        hashCode = prime * hashCode + ((getAdvancedSecurityOptions() == null) ? 0 : getAdvancedSecurityOptions().hashCode());
        hashCode = prime * hashCode + ((getAutoTuneOptions() == null) ? 0 : getAutoTuneOptions().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainConfigRequest clone() {
        return (UpdateDomainConfigRequest) super.clone();
    }

}
