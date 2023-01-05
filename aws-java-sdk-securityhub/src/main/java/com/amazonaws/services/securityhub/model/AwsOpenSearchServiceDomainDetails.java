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
 * Information about an Amazon OpenSearch Service domain.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsOpenSearchServiceDomainDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsOpenSearchServiceDomainDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the OpenSearch Service domain.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * IAM policy document that specifies the access policies for the OpenSearch Service domain.
     * </p>
     */
    private String accessPolicies;
    /**
     * <p>
     * The name of the endpoint.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The identifier of the domain.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The domain endpoint.
     * </p>
     */
    private String domainEndpoint;
    /**
     * <p>
     * The version of the domain engine.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * Details about the configuration for encryption at rest.
     * </p>
     */
    private AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails encryptionAtRestOptions;
    /**
     * <p>
     * Details about the configuration for node-to-node encryption.
     * </p>
     */
    private AwsOpenSearchServiceDomainNodeToNodeEncryptionOptionsDetails nodeToNodeEncryptionOptions;
    /**
     * <p>
     * Information about the status of a domain relative to the latest service software.
     * </p>
     */
    private AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails serviceSoftwareOptions;
    /**
     * <p>
     * Details about the configuration of an OpenSearch cluster.
     * </p>
     */
    private AwsOpenSearchServiceDomainClusterConfigDetails clusterConfig;
    /**
     * <p>
     * Additional options for the domain endpoint.
     * </p>
     */
    private AwsOpenSearchServiceDomainDomainEndpointOptionsDetails domainEndpointOptions;
    /**
     * <p>
     * Information that OpenSearch Service derives based on <code>VPCOptions</code> for the domain.
     * </p>
     */
    private AwsOpenSearchServiceDomainVpcOptionsDetails vpcOptions;
    /**
     * <p>
     * Configures the CloudWatch Logs to publish for the OpenSearch domain.
     * </p>
     */
    private AwsOpenSearchServiceDomainLogPublishingOptionsDetails logPublishingOptions;
    /**
     * <p>
     * The domain endpoints. Used if the OpenSearch domain resides in a VPC.
     * </p>
     * <p>
     * This is a map of key-value pairs. The key is always <code>vpc</code>. The value is the endpoint.
     * </p>
     */
    private java.util.Map<String, String> domainEndpoints;
    /**
     * <p>
     * Specifies options for fine-grained access control.
     * </p>
     */
    private AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails advancedSecurityOptions;

    /**
     * <p>
     * The ARN of the OpenSearch Service domain.
     * </p>
     * 
     * @param arn
     *        The ARN of the OpenSearch Service domain.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the OpenSearch Service domain.
     * </p>
     * 
     * @return The ARN of the OpenSearch Service domain.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the OpenSearch Service domain.
     * </p>
     * 
     * @param arn
     *        The ARN of the OpenSearch Service domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * IAM policy document that specifies the access policies for the OpenSearch Service domain.
     * </p>
     * 
     * @param accessPolicies
     *        IAM policy document that specifies the access policies for the OpenSearch Service domain.
     */

    public void setAccessPolicies(String accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    /**
     * <p>
     * IAM policy document that specifies the access policies for the OpenSearch Service domain.
     * </p>
     * 
     * @return IAM policy document that specifies the access policies for the OpenSearch Service domain.
     */

    public String getAccessPolicies() {
        return this.accessPolicies;
    }

    /**
     * <p>
     * IAM policy document that specifies the access policies for the OpenSearch Service domain.
     * </p>
     * 
     * @param accessPolicies
     *        IAM policy document that specifies the access policies for the OpenSearch Service domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails withAccessPolicies(String accessPolicies) {
        setAccessPolicies(accessPolicies);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param domainName
     *        The name of the endpoint.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @return The name of the endpoint.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param domainName
     *        The name of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The identifier of the domain.
     * </p>
     * 
     * @param id
     *        The identifier of the domain.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the domain.
     * </p>
     * 
     * @return The identifier of the domain.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the domain.
     * </p>
     * 
     * @param id
     *        The identifier of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The domain endpoint.
     * </p>
     * 
     * @param domainEndpoint
     *        The domain endpoint.
     */

    public void setDomainEndpoint(String domainEndpoint) {
        this.domainEndpoint = domainEndpoint;
    }

    /**
     * <p>
     * The domain endpoint.
     * </p>
     * 
     * @return The domain endpoint.
     */

    public String getDomainEndpoint() {
        return this.domainEndpoint;
    }

    /**
     * <p>
     * The domain endpoint.
     * </p>
     * 
     * @param domainEndpoint
     *        The domain endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails withDomainEndpoint(String domainEndpoint) {
        setDomainEndpoint(domainEndpoint);
        return this;
    }

    /**
     * <p>
     * The version of the domain engine.
     * </p>
     * 
     * @param engineVersion
     *        The version of the domain engine.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the domain engine.
     * </p>
     * 
     * @return The version of the domain engine.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The version of the domain engine.
     * </p>
     * 
     * @param engineVersion
     *        The version of the domain engine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
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

    public void setEncryptionAtRestOptions(AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails encryptionAtRestOptions) {
        this.encryptionAtRestOptions = encryptionAtRestOptions;
    }

    /**
     * <p>
     * Details about the configuration for encryption at rest.
     * </p>
     * 
     * @return Details about the configuration for encryption at rest.
     */

    public AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails getEncryptionAtRestOptions() {
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

    public AwsOpenSearchServiceDomainDetails withEncryptionAtRestOptions(AwsOpenSearchServiceDomainEncryptionAtRestOptionsDetails encryptionAtRestOptions) {
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

    public void setNodeToNodeEncryptionOptions(AwsOpenSearchServiceDomainNodeToNodeEncryptionOptionsDetails nodeToNodeEncryptionOptions) {
        this.nodeToNodeEncryptionOptions = nodeToNodeEncryptionOptions;
    }

    /**
     * <p>
     * Details about the configuration for node-to-node encryption.
     * </p>
     * 
     * @return Details about the configuration for node-to-node encryption.
     */

    public AwsOpenSearchServiceDomainNodeToNodeEncryptionOptionsDetails getNodeToNodeEncryptionOptions() {
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

    public AwsOpenSearchServiceDomainDetails withNodeToNodeEncryptionOptions(
            AwsOpenSearchServiceDomainNodeToNodeEncryptionOptionsDetails nodeToNodeEncryptionOptions) {
        setNodeToNodeEncryptionOptions(nodeToNodeEncryptionOptions);
        return this;
    }

    /**
     * <p>
     * Information about the status of a domain relative to the latest service software.
     * </p>
     * 
     * @param serviceSoftwareOptions
     *        Information about the status of a domain relative to the latest service software.
     */

    public void setServiceSoftwareOptions(AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails serviceSoftwareOptions) {
        this.serviceSoftwareOptions = serviceSoftwareOptions;
    }

    /**
     * <p>
     * Information about the status of a domain relative to the latest service software.
     * </p>
     * 
     * @return Information about the status of a domain relative to the latest service software.
     */

    public AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails getServiceSoftwareOptions() {
        return this.serviceSoftwareOptions;
    }

    /**
     * <p>
     * Information about the status of a domain relative to the latest service software.
     * </p>
     * 
     * @param serviceSoftwareOptions
     *        Information about the status of a domain relative to the latest service software.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails withServiceSoftwareOptions(AwsOpenSearchServiceDomainServiceSoftwareOptionsDetails serviceSoftwareOptions) {
        setServiceSoftwareOptions(serviceSoftwareOptions);
        return this;
    }

    /**
     * <p>
     * Details about the configuration of an OpenSearch cluster.
     * </p>
     * 
     * @param clusterConfig
     *        Details about the configuration of an OpenSearch cluster.
     */

    public void setClusterConfig(AwsOpenSearchServiceDomainClusterConfigDetails clusterConfig) {
        this.clusterConfig = clusterConfig;
    }

    /**
     * <p>
     * Details about the configuration of an OpenSearch cluster.
     * </p>
     * 
     * @return Details about the configuration of an OpenSearch cluster.
     */

    public AwsOpenSearchServiceDomainClusterConfigDetails getClusterConfig() {
        return this.clusterConfig;
    }

    /**
     * <p>
     * Details about the configuration of an OpenSearch cluster.
     * </p>
     * 
     * @param clusterConfig
     *        Details about the configuration of an OpenSearch cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails withClusterConfig(AwsOpenSearchServiceDomainClusterConfigDetails clusterConfig) {
        setClusterConfig(clusterConfig);
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

    public void setDomainEndpointOptions(AwsOpenSearchServiceDomainDomainEndpointOptionsDetails domainEndpointOptions) {
        this.domainEndpointOptions = domainEndpointOptions;
    }

    /**
     * <p>
     * Additional options for the domain endpoint.
     * </p>
     * 
     * @return Additional options for the domain endpoint.
     */

    public AwsOpenSearchServiceDomainDomainEndpointOptionsDetails getDomainEndpointOptions() {
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

    public AwsOpenSearchServiceDomainDetails withDomainEndpointOptions(AwsOpenSearchServiceDomainDomainEndpointOptionsDetails domainEndpointOptions) {
        setDomainEndpointOptions(domainEndpointOptions);
        return this;
    }

    /**
     * <p>
     * Information that OpenSearch Service derives based on <code>VPCOptions</code> for the domain.
     * </p>
     * 
     * @param vpcOptions
     *        Information that OpenSearch Service derives based on <code>VPCOptions</code> for the domain.
     */

    public void setVpcOptions(AwsOpenSearchServiceDomainVpcOptionsDetails vpcOptions) {
        this.vpcOptions = vpcOptions;
    }

    /**
     * <p>
     * Information that OpenSearch Service derives based on <code>VPCOptions</code> for the domain.
     * </p>
     * 
     * @return Information that OpenSearch Service derives based on <code>VPCOptions</code> for the domain.
     */

    public AwsOpenSearchServiceDomainVpcOptionsDetails getVpcOptions() {
        return this.vpcOptions;
    }

    /**
     * <p>
     * Information that OpenSearch Service derives based on <code>VPCOptions</code> for the domain.
     * </p>
     * 
     * @param vpcOptions
     *        Information that OpenSearch Service derives based on <code>VPCOptions</code> for the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails withVpcOptions(AwsOpenSearchServiceDomainVpcOptionsDetails vpcOptions) {
        setVpcOptions(vpcOptions);
        return this;
    }

    /**
     * <p>
     * Configures the CloudWatch Logs to publish for the OpenSearch domain.
     * </p>
     * 
     * @param logPublishingOptions
     *        Configures the CloudWatch Logs to publish for the OpenSearch domain.
     */

    public void setLogPublishingOptions(AwsOpenSearchServiceDomainLogPublishingOptionsDetails logPublishingOptions) {
        this.logPublishingOptions = logPublishingOptions;
    }

    /**
     * <p>
     * Configures the CloudWatch Logs to publish for the OpenSearch domain.
     * </p>
     * 
     * @return Configures the CloudWatch Logs to publish for the OpenSearch domain.
     */

    public AwsOpenSearchServiceDomainLogPublishingOptionsDetails getLogPublishingOptions() {
        return this.logPublishingOptions;
    }

    /**
     * <p>
     * Configures the CloudWatch Logs to publish for the OpenSearch domain.
     * </p>
     * 
     * @param logPublishingOptions
     *        Configures the CloudWatch Logs to publish for the OpenSearch domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails withLogPublishingOptions(AwsOpenSearchServiceDomainLogPublishingOptionsDetails logPublishingOptions) {
        setLogPublishingOptions(logPublishingOptions);
        return this;
    }

    /**
     * <p>
     * The domain endpoints. Used if the OpenSearch domain resides in a VPC.
     * </p>
     * <p>
     * This is a map of key-value pairs. The key is always <code>vpc</code>. The value is the endpoint.
     * </p>
     * 
     * @return The domain endpoints. Used if the OpenSearch domain resides in a VPC.</p>
     *         <p>
     *         This is a map of key-value pairs. The key is always <code>vpc</code>. The value is the endpoint.
     */

    public java.util.Map<String, String> getDomainEndpoints() {
        return domainEndpoints;
    }

    /**
     * <p>
     * The domain endpoints. Used if the OpenSearch domain resides in a VPC.
     * </p>
     * <p>
     * This is a map of key-value pairs. The key is always <code>vpc</code>. The value is the endpoint.
     * </p>
     * 
     * @param domainEndpoints
     *        The domain endpoints. Used if the OpenSearch domain resides in a VPC.</p>
     *        <p>
     *        This is a map of key-value pairs. The key is always <code>vpc</code>. The value is the endpoint.
     */

    public void setDomainEndpoints(java.util.Map<String, String> domainEndpoints) {
        this.domainEndpoints = domainEndpoints;
    }

    /**
     * <p>
     * The domain endpoints. Used if the OpenSearch domain resides in a VPC.
     * </p>
     * <p>
     * This is a map of key-value pairs. The key is always <code>vpc</code>. The value is the endpoint.
     * </p>
     * 
     * @param domainEndpoints
     *        The domain endpoints. Used if the OpenSearch domain resides in a VPC.</p>
     *        <p>
     *        This is a map of key-value pairs. The key is always <code>vpc</code>. The value is the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails withDomainEndpoints(java.util.Map<String, String> domainEndpoints) {
        setDomainEndpoints(domainEndpoints);
        return this;
    }

    /**
     * Add a single DomainEndpoints entry
     *
     * @see AwsOpenSearchServiceDomainDetails#withDomainEndpoints
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails addDomainEndpointsEntry(String key, String value) {
        if (null == this.domainEndpoints) {
            this.domainEndpoints = new java.util.HashMap<String, String>();
        }
        if (this.domainEndpoints.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.domainEndpoints.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into DomainEndpoints.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails clearDomainEndpointsEntries() {
        this.domainEndpoints = null;
        return this;
    }

    /**
     * <p>
     * Specifies options for fine-grained access control.
     * </p>
     * 
     * @param advancedSecurityOptions
     *        Specifies options for fine-grained access control.
     */

    public void setAdvancedSecurityOptions(AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails advancedSecurityOptions) {
        this.advancedSecurityOptions = advancedSecurityOptions;
    }

    /**
     * <p>
     * Specifies options for fine-grained access control.
     * </p>
     * 
     * @return Specifies options for fine-grained access control.
     */

    public AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails getAdvancedSecurityOptions() {
        return this.advancedSecurityOptions;
    }

    /**
     * <p>
     * Specifies options for fine-grained access control.
     * </p>
     * 
     * @param advancedSecurityOptions
     *        Specifies options for fine-grained access control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsOpenSearchServiceDomainDetails withAdvancedSecurityOptions(AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails advancedSecurityOptions) {
        setAdvancedSecurityOptions(advancedSecurityOptions);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getAccessPolicies() != null)
            sb.append("AccessPolicies: ").append(getAccessPolicies()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDomainEndpoint() != null)
            sb.append("DomainEndpoint: ").append(getDomainEndpoint()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getEncryptionAtRestOptions() != null)
            sb.append("EncryptionAtRestOptions: ").append(getEncryptionAtRestOptions()).append(",");
        if (getNodeToNodeEncryptionOptions() != null)
            sb.append("NodeToNodeEncryptionOptions: ").append(getNodeToNodeEncryptionOptions()).append(",");
        if (getServiceSoftwareOptions() != null)
            sb.append("ServiceSoftwareOptions: ").append(getServiceSoftwareOptions()).append(",");
        if (getClusterConfig() != null)
            sb.append("ClusterConfig: ").append(getClusterConfig()).append(",");
        if (getDomainEndpointOptions() != null)
            sb.append("DomainEndpointOptions: ").append(getDomainEndpointOptions()).append(",");
        if (getVpcOptions() != null)
            sb.append("VpcOptions: ").append(getVpcOptions()).append(",");
        if (getLogPublishingOptions() != null)
            sb.append("LogPublishingOptions: ").append(getLogPublishingOptions()).append(",");
        if (getDomainEndpoints() != null)
            sb.append("DomainEndpoints: ").append(getDomainEndpoints()).append(",");
        if (getAdvancedSecurityOptions() != null)
            sb.append("AdvancedSecurityOptions: ").append(getAdvancedSecurityOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsOpenSearchServiceDomainDetails == false)
            return false;
        AwsOpenSearchServiceDomainDetails other = (AwsOpenSearchServiceDomainDetails) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getAccessPolicies() == null ^ this.getAccessPolicies() == null)
            return false;
        if (other.getAccessPolicies() != null && other.getAccessPolicies().equals(this.getAccessPolicies()) == false)
            return false;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDomainEndpoint() == null ^ this.getDomainEndpoint() == null)
            return false;
        if (other.getDomainEndpoint() != null && other.getDomainEndpoint().equals(this.getDomainEndpoint()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getEncryptionAtRestOptions() == null ^ this.getEncryptionAtRestOptions() == null)
            return false;
        if (other.getEncryptionAtRestOptions() != null && other.getEncryptionAtRestOptions().equals(this.getEncryptionAtRestOptions()) == false)
            return false;
        if (other.getNodeToNodeEncryptionOptions() == null ^ this.getNodeToNodeEncryptionOptions() == null)
            return false;
        if (other.getNodeToNodeEncryptionOptions() != null && other.getNodeToNodeEncryptionOptions().equals(this.getNodeToNodeEncryptionOptions()) == false)
            return false;
        if (other.getServiceSoftwareOptions() == null ^ this.getServiceSoftwareOptions() == null)
            return false;
        if (other.getServiceSoftwareOptions() != null && other.getServiceSoftwareOptions().equals(this.getServiceSoftwareOptions()) == false)
            return false;
        if (other.getClusterConfig() == null ^ this.getClusterConfig() == null)
            return false;
        if (other.getClusterConfig() != null && other.getClusterConfig().equals(this.getClusterConfig()) == false)
            return false;
        if (other.getDomainEndpointOptions() == null ^ this.getDomainEndpointOptions() == null)
            return false;
        if (other.getDomainEndpointOptions() != null && other.getDomainEndpointOptions().equals(this.getDomainEndpointOptions()) == false)
            return false;
        if (other.getVpcOptions() == null ^ this.getVpcOptions() == null)
            return false;
        if (other.getVpcOptions() != null && other.getVpcOptions().equals(this.getVpcOptions()) == false)
            return false;
        if (other.getLogPublishingOptions() == null ^ this.getLogPublishingOptions() == null)
            return false;
        if (other.getLogPublishingOptions() != null && other.getLogPublishingOptions().equals(this.getLogPublishingOptions()) == false)
            return false;
        if (other.getDomainEndpoints() == null ^ this.getDomainEndpoints() == null)
            return false;
        if (other.getDomainEndpoints() != null && other.getDomainEndpoints().equals(this.getDomainEndpoints()) == false)
            return false;
        if (other.getAdvancedSecurityOptions() == null ^ this.getAdvancedSecurityOptions() == null)
            return false;
        if (other.getAdvancedSecurityOptions() != null && other.getAdvancedSecurityOptions().equals(this.getAdvancedSecurityOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getAccessPolicies() == null) ? 0 : getAccessPolicies().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDomainEndpoint() == null) ? 0 : getDomainEndpoint().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getEncryptionAtRestOptions() == null) ? 0 : getEncryptionAtRestOptions().hashCode());
        hashCode = prime * hashCode + ((getNodeToNodeEncryptionOptions() == null) ? 0 : getNodeToNodeEncryptionOptions().hashCode());
        hashCode = prime * hashCode + ((getServiceSoftwareOptions() == null) ? 0 : getServiceSoftwareOptions().hashCode());
        hashCode = prime * hashCode + ((getClusterConfig() == null) ? 0 : getClusterConfig().hashCode());
        hashCode = prime * hashCode + ((getDomainEndpointOptions() == null) ? 0 : getDomainEndpointOptions().hashCode());
        hashCode = prime * hashCode + ((getVpcOptions() == null) ? 0 : getVpcOptions().hashCode());
        hashCode = prime * hashCode + ((getLogPublishingOptions() == null) ? 0 : getLogPublishingOptions().hashCode());
        hashCode = prime * hashCode + ((getDomainEndpoints() == null) ? 0 : getDomainEndpoints().hashCode());
        hashCode = prime * hashCode + ((getAdvancedSecurityOptions() == null) ? 0 : getAdvancedSecurityOptions().hashCode());
        return hashCode;
    }

    @Override
    public AwsOpenSearchServiceDomainDetails clone() {
        try {
            return (AwsOpenSearchServiceDomainDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsOpenSearchServiceDomainDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
