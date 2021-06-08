/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.emrcontainers.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/CreateManagedEndpoint"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateManagedEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the managed endpoint.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the virtual cluster for which a managed endpoint is created.
     * </p>
     */
    private String virtualClusterId;
    /**
     * <p>
     * The type of the managed endpoint.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon EMR release version.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * The ARN of the execution role.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The certificate ARN of the managed endpoint.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The configuration settings that will be used to override existing configurations.
     * </p>
     */
    private ConfigurationOverrides configurationOverrides;
    /**
     * <p>
     * The client idempotency token for this create call.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The tags of the managed endpoint.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of the managed endpoint.
     * </p>
     * 
     * @param name
     *        The name of the managed endpoint.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the managed endpoint.
     * </p>
     * 
     * @return The name of the managed endpoint.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the managed endpoint.
     * </p>
     * 
     * @param name
     *        The name of the managed endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedEndpointRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual cluster for which a managed endpoint is created.
     * </p>
     * 
     * @param virtualClusterId
     *        The ID of the virtual cluster for which a managed endpoint is created.
     */

    public void setVirtualClusterId(String virtualClusterId) {
        this.virtualClusterId = virtualClusterId;
    }

    /**
     * <p>
     * The ID of the virtual cluster for which a managed endpoint is created.
     * </p>
     * 
     * @return The ID of the virtual cluster for which a managed endpoint is created.
     */

    public String getVirtualClusterId() {
        return this.virtualClusterId;
    }

    /**
     * <p>
     * The ID of the virtual cluster for which a managed endpoint is created.
     * </p>
     * 
     * @param virtualClusterId
     *        The ID of the virtual cluster for which a managed endpoint is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedEndpointRequest withVirtualClusterId(String virtualClusterId) {
        setVirtualClusterId(virtualClusterId);
        return this;
    }

    /**
     * <p>
     * The type of the managed endpoint.
     * </p>
     * 
     * @param type
     *        The type of the managed endpoint.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the managed endpoint.
     * </p>
     * 
     * @return The type of the managed endpoint.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the managed endpoint.
     * </p>
     * 
     * @param type
     *        The type of the managed endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedEndpointRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The Amazon EMR release version.
     * </p>
     * 
     * @param releaseLabel
     *        The Amazon EMR release version.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The Amazon EMR release version.
     * </p>
     * 
     * @return The Amazon EMR release version.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The Amazon EMR release version.
     * </p>
     * 
     * @param releaseLabel
     *        The Amazon EMR release version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedEndpointRequest withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * The ARN of the execution role.
     * </p>
     * 
     * @param executionRoleArn
     *        The ARN of the execution role.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the execution role.
     * </p>
     * 
     * @return The ARN of the execution role.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The ARN of the execution role.
     * </p>
     * 
     * @param executionRoleArn
     *        The ARN of the execution role.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedEndpointRequest withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The certificate ARN of the managed endpoint.
     * </p>
     * 
     * @param certificateArn
     *        The certificate ARN of the managed endpoint.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The certificate ARN of the managed endpoint.
     * </p>
     * 
     * @return The certificate ARN of the managed endpoint.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The certificate ARN of the managed endpoint.
     * </p>
     * 
     * @param certificateArn
     *        The certificate ARN of the managed endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedEndpointRequest withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The configuration settings that will be used to override existing configurations.
     * </p>
     * 
     * @param configurationOverrides
     *        The configuration settings that will be used to override existing configurations.
     */

    public void setConfigurationOverrides(ConfigurationOverrides configurationOverrides) {
        this.configurationOverrides = configurationOverrides;
    }

    /**
     * <p>
     * The configuration settings that will be used to override existing configurations.
     * </p>
     * 
     * @return The configuration settings that will be used to override existing configurations.
     */

    public ConfigurationOverrides getConfigurationOverrides() {
        return this.configurationOverrides;
    }

    /**
     * <p>
     * The configuration settings that will be used to override existing configurations.
     * </p>
     * 
     * @param configurationOverrides
     *        The configuration settings that will be used to override existing configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedEndpointRequest withConfigurationOverrides(ConfigurationOverrides configurationOverrides) {
        setConfigurationOverrides(configurationOverrides);
        return this;
    }

    /**
     * <p>
     * The client idempotency token for this create call.
     * </p>
     * 
     * @param clientToken
     *        The client idempotency token for this create call.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The client idempotency token for this create call.
     * </p>
     * 
     * @return The client idempotency token for this create call.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The client idempotency token for this create call.
     * </p>
     * 
     * @param clientToken
     *        The client idempotency token for this create call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedEndpointRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The tags of the managed endpoint.
     * </p>
     * 
     * @return The tags of the managed endpoint.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the managed endpoint.
     * </p>
     * 
     * @param tags
     *        The tags of the managed endpoint.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the managed endpoint.
     * </p>
     * 
     * @param tags
     *        The tags of the managed endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedEndpointRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateManagedEndpointRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedEndpointRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateManagedEndpointRequest clearTagsEntries() {
        this.tags = null;
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getVirtualClusterId() != null)
            sb.append("VirtualClusterId: ").append(getVirtualClusterId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getConfigurationOverrides() != null)
            sb.append("ConfigurationOverrides: ").append(getConfigurationOverrides()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateManagedEndpointRequest == false)
            return false;
        CreateManagedEndpointRequest other = (CreateManagedEndpointRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVirtualClusterId() == null ^ this.getVirtualClusterId() == null)
            return false;
        if (other.getVirtualClusterId() != null && other.getVirtualClusterId().equals(this.getVirtualClusterId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getReleaseLabel() == null ^ this.getReleaseLabel() == null)
            return false;
        if (other.getReleaseLabel() != null && other.getReleaseLabel().equals(this.getReleaseLabel()) == false)
            return false;
        if (other.getExecutionRoleArn() == null ^ this.getExecutionRoleArn() == null)
            return false;
        if (other.getExecutionRoleArn() != null && other.getExecutionRoleArn().equals(this.getExecutionRoleArn()) == false)
            return false;
        if (other.getCertificateArn() == null ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getConfigurationOverrides() == null ^ this.getConfigurationOverrides() == null)
            return false;
        if (other.getConfigurationOverrides() != null && other.getConfigurationOverrides().equals(this.getConfigurationOverrides()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVirtualClusterId() == null) ? 0 : getVirtualClusterId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getConfigurationOverrides() == null) ? 0 : getConfigurationOverrides().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateManagedEndpointRequest clone() {
        return (CreateManagedEndpointRequest) super.clone();
    }

}
