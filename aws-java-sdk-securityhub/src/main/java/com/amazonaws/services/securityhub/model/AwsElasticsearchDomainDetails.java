/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about an Elasticsearch domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsElasticsearchDomainDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsElasticsearchDomainDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * IAM policy document specifying the access policies for the new Amazon ES domain.
     * </p>
     */
    private String accessPolicies;
    /**
     * <p>
     * Additional options for the domain endpoint.
     * </p>
     */
    private AwsElasticsearchDomainDomainEndpointOptions domainEndpointOptions;
    /**
     * <p>
     * Unique identifier for an Amazon ES domain.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * Name of an Amazon ES domain.
     * </p>
     * <p>
     * Domain names are unique across all domains owned by the same account within an AWS Region.
     * </p>
     * <p>
     * Domain names must start with a lowercase letter and must be between 3 and 28 characters.
     * </p>
     * <p>
     * Valid characters are a-z (lowercase only), 0-9, and – (hyphen).
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Domain-specific endpoint used to submit index, search, and data upload requests to an Amazon ES domain.
     * </p>
     * <p>
     * The endpoint is a service URL.
     * </p>
     */
    private String endpoint;
    /**
     * <p>
     * The key-value pair that exists if the Amazon ES domain uses VPC endpoints.
     * </p>
     */
    private java.util.Map<String, String> endpoints;
    /**
     * <p>
     * Elasticsearch version.
     * </p>
     */
    private String elasticsearchVersion;
    /**
     * <p>
     * Details about the configuration for encryption at rest.
     * </p>
     */
    private AwsElasticsearchDomainEncryptionAtRestOptions encryptionAtRestOptions;
    /**
     * <p>
     * Details about the configuration for node-to-node encryption.
     * </p>
     */
    private AwsElasticsearchDomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions;
    /**
     * <p>
     * Information that Amazon ES derives based on <code>VPCOptions</code> for the domain.
     * </p>
     */
    private AwsElasticsearchDomainVPCOptions vPCOptions;

    /**
     * <p>
     * IAM policy document specifying the access policies for the new Amazon ES domain.
     * </p>
     * 
     * @param accessPolicies
     *        IAM policy document specifying the access policies for the new Amazon ES domain.
     */

    public void setAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * IAM policy document specifying the access policies for the new Amazon ES domain.
     * </p>
     * 
     * @return IAM policy document specifying the access policies for the new Amazon ES domain.
     */

    public String getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * <p>
     * IAM policy document specifying the access policies for the new Amazon ES domain.
     * </p>
     * 
     * @param accessPolicies
     *        IAM policy document specifying the access policies for the new Amazon ES domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainDetails withAccessPolicies(String accessPolicies) {
        setAccessPolicies(accessPolicies);
        return this;
    }

    /**
     * <p>
     * Additional options for the domain endpoint.
     * </p>
     * 
     * @param domainEndpointOptions
     *        Additional options for the domain endpoint.
     */

    public void setDomainEndpointOptions(AwsElasticsearchDomainDomainEndpointOptions domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
    }

    /**
     * <p>
     * Additional options for the domain endpoint.
     * </p>
     * 
     * @return Additional options for the domain endpoint.
     */

    public AwsElasticsearchDomainDomainEndpointOptions getDomainEndpointOptions() {
        return this.domainEndpointOptions;
    }

    /**
     * <p>
     * Additional options for the domain endpoint.
     * </p>
     * 
     * @param domainEndpointOptions
     *        Additional options for the domain endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainDetails withDomainEndpointOptions(AwsElasticsearchDomainDomainEndpointOptions domainEndpointOptions) {
        setDomainEndpointOptions(domainEndpointOptions);
        return this;
    }

    /**
     * <p>
     * Unique identifier for an Amazon ES domain.
     * </p>
     * 
     * @param domainId
     *        Unique identifier for an Amazon ES domain.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * Unique identifier for an Amazon ES domain.
     * </p>
     * 
     * @return Unique identifier for an Amazon ES domain.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * Unique identifier for an Amazon ES domain.
     * </p>
     * 
     * @param domainId
     *        Unique identifier for an Amazon ES domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainDetails withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * Name of an Amazon ES domain.
     * </p>
     * <p>
     * Domain names are unique across all domains owned by the same account within an AWS Region.
     * </p>
     * <p>
     * Domain names must start with a lowercase letter and must be between 3 and 28 characters.
     * </p>
     * <p>
     * Valid characters are a-z (lowercase only), 0-9, and – (hyphen).
     * </p>
     * 
     * @param domainName
     *        Name of an Amazon ES domain.</p>
     *        <p>
     *        Domain names are unique across all domains owned by the same account within an AWS Region.
     *        </p>
     *        <p>
     *        Domain names must start with a lowercase letter and must be between 3 and 28 characters.
     *        </p>
     *        <p>
     *        Valid characters are a-z (lowercase only), 0-9, and – (hyphen).
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Name of an Amazon ES domain.
     * </p>
     * <p>
     * Domain names are unique across all domains owned by the same account within an AWS Region.
     * </p>
     * <p>
     * Domain names must start with a lowercase letter and must be between 3 and 28 characters.
     * </p>
     * <p>
     * Valid characters are a-z (lowercase only), 0-9, and – (hyphen).
     * </p>
     * 
     * @return Name of an Amazon ES domain.</p>
     *         <p>
     *         Domain names are unique across all domains owned by the same account within an AWS Region.
     *         </p>
     *         <p>
     *         Domain names must start with a lowercase letter and must be between 3 and 28 characters.
     *         </p>
     *         <p>
     *         Valid characters are a-z (lowercase only), 0-9, and – (hyphen).
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Name of an Amazon ES domain.
     * </p>
     * <p>
     * Domain names are unique across all domains owned by the same account within an AWS Region.
     * </p>
     * <p>
     * Domain names must start with a lowercase letter and must be between 3 and 28 characters.
     * </p>
     * <p>
     * Valid characters are a-z (lowercase only), 0-9, and – (hyphen).
     * </p>
     * 
     * @param domainName
     *        Name of an Amazon ES domain.</p>
     *        <p>
     *        Domain names are unique across all domains owned by the same account within an AWS Region.
     *        </p>
     *        <p>
     *        Domain names must start with a lowercase letter and must be between 3 and 28 characters.
     *        </p>
     *        <p>
     *        Valid characters are a-z (lowercase only), 0-9, and – (hyphen).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainDetails withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Domain-specific endpoint used to submit index, search, and data upload requests to an Amazon ES domain.
     * </p>
     * <p>
     * The endpoint is a service URL.
     * </p>
     * 
     * @param endpoint
     *        Domain-specific endpoint used to submit index, search, and data upload requests to an Amazon ES
     *        domain.</p>
     *        <p>
     *        The endpoint is a service URL.
     */

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * Domain-specific endpoint used to submit index, search, and data upload requests to an Amazon ES domain.
     * </p>
     * <p>
     * The endpoint is a service URL.
     * </p>
     * 
     * @return Domain-specific endpoint used to submit index, search, and data upload requests to an Amazon ES
     *         domain.</p>
     *         <p>
     *         The endpoint is a service URL.
     */

    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * Domain-specific endpoint used to submit index, search, and data upload requests to an Amazon ES domain.
     * </p>
     * <p>
     * The endpoint is a service URL.
     * </p>
     * 
     * @param endpoint
     *        Domain-specific endpoint used to submit index, search, and data upload requests to an Amazon ES
     *        domain.</p>
     *        <p>
     *        The endpoint is a service URL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainDetails withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        return this;
    }

    /**
     * <p>
     * The key-value pair that exists if the Amazon ES domain uses VPC endpoints.
     * </p>
     * 
     * @return The key-value pair that exists if the Amazon ES domain uses VPC endpoints.
     */

    public java.util.Map<String, String> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * The key-value pair that exists if the Amazon ES domain uses VPC endpoints.
     * </p>
     * 
     * @param endpoints
     *        The key-value pair that exists if the Amazon ES domain uses VPC endpoints.
     */

    public void setEndpoints(java.util.Map<String, String> endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * <p>
     * The key-value pair that exists if the Amazon ES domain uses VPC endpoints.
     * </p>
     * 
     * @param endpoints
     *        The key-value pair that exists if the Amazon ES domain uses VPC endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainDetails withEndpoints(java.util.Map<String, String> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * Add a single Endpoints entry
     *
     * @see AwsElasticsearchDomainDetails#withEndpoints
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainDetails addEndpointsEntry(String key, String value) {
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

    public AwsElasticsearchDomainDetails clearEndpointsEntries() {
        this.endpoints = null;
        return this;
    }

    /**
     * <p>
     * Elasticsearch version.
     * </p>
     * 
     * @param elasticsearchVersion
     *        Elasticsearch version.
     */

    public void setElasticsearchVersion(String elasticsearchVersion) {
        this.elasticsearchVersion = elasticsearchVersion;
    }

    /**
     * <p>
     * Elasticsearch version.
     * </p>
     * 
     * @return Elasticsearch version.
     */

    public String getElasticsearchVersion() {
        return this.elasticsearchVersion;
    }

    /**
     * <p>
     * Elasticsearch version.
     * </p>
     * 
     * @param elasticsearchVersion
     *        Elasticsearch version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainDetails withElasticsearchVersion(String elasticsearchVersion) {
        setElasticsearchVersion(elasticsearchVersion);
        return this;
    }

    /**
     * <p>
     * Details about the configuration for encryption at rest.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Details about the configuration for encryption at rest.
     */

    public void setEncryptionAtRestOptions(AwsElasticsearchDomainEncryptionAtRestOptions encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Details about the configuration for encryption at rest.
     * </p>
     * 
     * @return Details about the configuration for encryption at rest.
     */

    public AwsElasticsearchDomainEncryptionAtRestOptions getEncryptionAtRestOptions() {
        return this.encryptionAtRestOptions;
    }

    /**
     * <p>
     * Details about the configuration for encryption at rest.
     * </p>
     * 
     * @param encryptionAtRestOptions
     *        Details about the configuration for encryption at rest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainDetails withEncryptionAtRestOptions(AwsElasticsearchDomainEncryptionAtRestOptions encryptionAtRestOptions) {
        setEncryptionAtRestOptions(encryptionAtRestOptions);
        return this;
    }

    /**
     * <p>
     * Details about the configuration for node-to-node encryption.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Details about the configuration for node-to-node encryption.
     */

    public void setNodeToNodeEncryptionOptions(AwsElasticsearchDomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Details about the configuration for node-to-node encryption.
     * </p>
     * 
     * @return Details about the configuration for node-to-node encryption.
     */

    public AwsElasticsearchDomainNodeToNodeEncryptionOptions getNodeToNodeEncryptionOptions() {
        return this.nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Details about the configuration for node-to-node encryption.
     * </p>
     * 
     * @param nodeToNodeEncryptionOptions
     *        Details about the configuration for node-to-node encryption.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainDetails withNodeToNodeEncryptionOptions(AwsElasticsearchDomainNodeToNodeEncryptionOptions nodeToNodeEncryptionOptions) {
        setNodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions);
        return this;
    }

    /**
     * <p>
     * Information that Amazon ES derives based on <code>VPCOptions</code> for the domain.
     * </p>
     * 
     * @param vPCOptions
     *        Information that Amazon ES derives based on <code>VPCOptions</code> for the domain.
     */

    public void setVPCOptions(AwsElasticsearchDomainVPCOptions vPCOptions) {
        this.vPCOptions = vPCOptions;
    }

    /**
     * <p>
     * Information that Amazon ES derives based on <code>VPCOptions</code> for the domain.
     * </p>
     * 
     * @return Information that Amazon ES derives based on <code>VPCOptions</code> for the domain.
     */

    public AwsElasticsearchDomainVPCOptions getVPCOptions() {
        return this.vPCOptions;
    }

    /**
     * <p>
     * Information that Amazon ES derives based on <code>VPCOptions</code> for the domain.
     * </p>
     * 
     * @param vPCOptions
     *        Information that Amazon ES derives based on <code>VPCOptions</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsElasticsearchDomainDetails withVPCOptions(AwsElasticsearchDomainVPCOptions vPCOptions) {
        setVPCOptions(vPCOptions);
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
        if (getAccessPolicies() != null)
            sb.append("AccessPolicies: ").append(getAccessPolicies()).append(",");
        if (getDomainEndpointOptions() != null)
            sb.append("DomainEndpointOptions: ").append(getDomainEndpointOptions()).append(",");
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getEndpoint() != null)
            sb.append("Endpoint: ").append(getEndpoint()).append(",");
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints()).append(",");
        if (getElasticsearchVersion() != null)
            sb.append("ElasticsearchVersion: ").append(getElasticsearchVersion()).append(",");
        if (getEncryptionAtRestOptions() != null)
            sb.append("EncryptionAtRestOptions: ").append(getEncryptionAtRestOptions()).append(",");
        if (getNodeToNodeEncryptionOptions() != null)
            sb.append("NodeToNodeEncryptionOptions: ").append(getNodeToNodeEncryptionOptions()).append(",");
        if (getVPCOptions() != null)
            sb.append("VPCOptions: ").append(getVPCOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsElasticsearchDomainDetails == false)
            return false;
        AwsElasticsearchDomainDetails other = (AwsElasticsearchDomainDetails) obj;
        if (other.getAccessPolicies() == null ^ this.getAccessPolicies() == null)
            return false;
        if (other.getAccessPolicies() != null && other.getAccessPolicies().equals(this.getAccessPolicies()) == false)
            return false;
        if (other.getDomainEndpointOptions() == null ^ this.getDomainEndpointOptions() == null)
            return false;
        if (other.getDomainEndpointOptions() != null && other.getDomainEndpointOptions().equals(this.getDomainEndpointOptions()) == false)
            return false;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        if (other.getElasticsearchVersion() == null ^ this.getElasticsearchVersion() == null)
            return false;
        if (other.getElasticsearchVersion() != null && other.getElasticsearchVersion().equals(this.getElasticsearchVersion()) == false)
            return false;
        if (other.getEncryptionAtRestOptions() == null ^ this.getEncryptionAtRestOptions() == null)
            return false;
        if (other.getEncryptionAtRestOptions() != null && other.getEncryptionAtRestOptions().equals(this.getEncryptionAtRestOptions()) == false)
            return false;
        if (other.getNodeToNodeEncryptionOptions() == null ^ this.getNodeToNodeEncryptionOptions() == null)
            return false;
        if (other.getNodeToNodeEncryptionOptions() != null && other.getNodeToNodeEncryptionOptions().equals(this.getNodeToNodeEncryptionOptions()) == false)
            return false;
        if (other.getVPCOptions() == null ^ this.getVPCOptions() == null)
            return false;
        if (other.getVPCOptions() != null && other.getVPCOptions().equals(this.getVPCOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessPolicies() == null) ? 0 : getAccessPolicies().hashCode());
        hashCode = prime * hashCode + ((getDomainEndpointOptions() == null) ? 0 : getDomainEndpointOptions().hashCode());
        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getElasticsearchVersion() == null) ? 0 : getElasticsearchVersion().hashCode());
        hashCode = prime * hashCode + ((getEncryptionAtRestOptions() == null) ? 0 : getEncryptionAtRestOptions().hashCode());
        hashCode = prime * hashCode + ((getNodeToNodeEncryptionOptions() == null) ? 0 : getNodeToNodeEncryptionOptions().hashCode());
        hashCode = prime * hashCode + ((getVPCOptions() == null) ? 0 : getVPCOptions().hashCode());
        return hashCode;
    }

    @Override
    public AwsElasticsearchDomainDetails clone() {
        try {
            return (AwsElasticsearchDomainDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsElasticsearchDomainDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
