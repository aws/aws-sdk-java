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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This entity represents the endpoint that is managed by Amazon EMR on EKS.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/emr-containers-2020-10-01/Endpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Endpoint implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the endpoint.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the endpoint.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The ID of the endpoint's virtual cluster.
     * </p>
     */
    private String virtualClusterId;
    /**
     * <p>
     * The type of the endpoint.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The state of the endpoint.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The EMR release version to be used for the endpoint.
     * </p>
     */
    private String releaseLabel;
    /**
     * <p>
     * The execution role ARN of the endpoint.
     * </p>
     */
    private String executionRoleArn;
    /**
     * <p>
     * The certificate ARN of the endpoint.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The configuration settings that are used to override existing configurations for endpoints.
     * </p>
     */
    private ConfigurationOverrides configurationOverrides;
    /**
     * <p>
     * The server URL of the endpoint.
     * </p>
     */
    private String serverUrl;
    /**
     * <p>
     * The date and time when the endpoint was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The security group configuration of the endpoint.
     * </p>
     */
    private String securityGroup;
    /**
     * <p>
     * The subnet IDs of the endpoint.
     * </p>
     */
    private java.util.List<String> subnetIds;
    /**
     * <p>
     * The tags of the endpoint.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * 
     * @param id
     *        The ID of the endpoint.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * 
     * @return The ID of the endpoint.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the endpoint.
     * </p>
     * 
     * @param id
     *        The ID of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param name
     *        The name of the endpoint.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @return The name of the endpoint.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param name
     *        The name of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the endpoint.
     * </p>
     * 
     * @param arn
     *        The ARN of the endpoint.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the endpoint.
     * </p>
     * 
     * @return The ARN of the endpoint.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the endpoint.
     * </p>
     * 
     * @param arn
     *        The ARN of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The ID of the endpoint's virtual cluster.
     * </p>
     * 
     * @param virtualClusterId
     *        The ID of the endpoint's virtual cluster.
     */

    public void setVirtualClusterId(String virtualClusterId) {
        this.virtualClusterId = virtualClusterId;
    }

    /**
     * <p>
     * The ID of the endpoint's virtual cluster.
     * </p>
     * 
     * @return The ID of the endpoint's virtual cluster.
     */

    public String getVirtualClusterId() {
        return this.virtualClusterId;
    }

    /**
     * <p>
     * The ID of the endpoint's virtual cluster.
     * </p>
     * 
     * @param virtualClusterId
     *        The ID of the endpoint's virtual cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withVirtualClusterId(String virtualClusterId) {
        setVirtualClusterId(virtualClusterId);
        return this;
    }

    /**
     * <p>
     * The type of the endpoint.
     * </p>
     * 
     * @param type
     *        The type of the endpoint.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the endpoint.
     * </p>
     * 
     * @return The type of the endpoint.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the endpoint.
     * </p>
     * 
     * @param type
     *        The type of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The state of the endpoint.
     * </p>
     * 
     * @param state
     *        The state of the endpoint.
     * @see EndpointState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the endpoint.
     * </p>
     * 
     * @return The state of the endpoint.
     * @see EndpointState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the endpoint.
     * </p>
     * 
     * @param state
     *        The state of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointState
     */

    public Endpoint withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the endpoint.
     * </p>
     * 
     * @param state
     *        The state of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointState
     */

    public Endpoint withState(EndpointState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The EMR release version to be used for the endpoint.
     * </p>
     * 
     * @param releaseLabel
     *        The EMR release version to be used for the endpoint.
     */

    public void setReleaseLabel(String releaseLabel) {
        this.releaseLabel = releaseLabel;
    }

    /**
     * <p>
     * The EMR release version to be used for the endpoint.
     * </p>
     * 
     * @return The EMR release version to be used for the endpoint.
     */

    public String getReleaseLabel() {
        return this.releaseLabel;
    }

    /**
     * <p>
     * The EMR release version to be used for the endpoint.
     * </p>
     * 
     * @param releaseLabel
     *        The EMR release version to be used for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withReleaseLabel(String releaseLabel) {
        setReleaseLabel(releaseLabel);
        return this;
    }

    /**
     * <p>
     * The execution role ARN of the endpoint.
     * </p>
     * 
     * @param executionRoleArn
     *        The execution role ARN of the endpoint.
     */

    public void setExecutionRoleArn(String executionRoleArn) {
        this.executionRoleArn = executionRoleArn;
    }

    /**
     * <p>
     * The execution role ARN of the endpoint.
     * </p>
     * 
     * @return The execution role ARN of the endpoint.
     */

    public String getExecutionRoleArn() {
        return this.executionRoleArn;
    }

    /**
     * <p>
     * The execution role ARN of the endpoint.
     * </p>
     * 
     * @param executionRoleArn
     *        The execution role ARN of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withExecutionRoleArn(String executionRoleArn) {
        setExecutionRoleArn(executionRoleArn);
        return this;
    }

    /**
     * <p>
     * The certificate ARN of the endpoint.
     * </p>
     * 
     * @param certificateArn
     *        The certificate ARN of the endpoint.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The certificate ARN of the endpoint.
     * </p>
     * 
     * @return The certificate ARN of the endpoint.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The certificate ARN of the endpoint.
     * </p>
     * 
     * @param certificateArn
     *        The certificate ARN of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The configuration settings that are used to override existing configurations for endpoints.
     * </p>
     * 
     * @param configurationOverrides
     *        The configuration settings that are used to override existing configurations for endpoints.
     */

    public void setConfigurationOverrides(ConfigurationOverrides configurationOverrides) {
        this.configurationOverrides = configurationOverrides;
    }

    /**
     * <p>
     * The configuration settings that are used to override existing configurations for endpoints.
     * </p>
     * 
     * @return The configuration settings that are used to override existing configurations for endpoints.
     */

    public ConfigurationOverrides getConfigurationOverrides() {
        return this.configurationOverrides;
    }

    /**
     * <p>
     * The configuration settings that are used to override existing configurations for endpoints.
     * </p>
     * 
     * @param configurationOverrides
     *        The configuration settings that are used to override existing configurations for endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withConfigurationOverrides(ConfigurationOverrides configurationOverrides) {
        setConfigurationOverrides(configurationOverrides);
        return this;
    }

    /**
     * <p>
     * The server URL of the endpoint.
     * </p>
     * 
     * @param serverUrl
     *        The server URL of the endpoint.
     */

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    /**
     * <p>
     * The server URL of the endpoint.
     * </p>
     * 
     * @return The server URL of the endpoint.
     */

    public String getServerUrl() {
        return this.serverUrl;
    }

    /**
     * <p>
     * The server URL of the endpoint.
     * </p>
     * 
     * @param serverUrl
     *        The server URL of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withServerUrl(String serverUrl) {
        setServerUrl(serverUrl);
        return this;
    }

    /**
     * <p>
     * The date and time when the endpoint was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the endpoint was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The date and time when the endpoint was created.
     * </p>
     * 
     * @return The date and time when the endpoint was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The date and time when the endpoint was created.
     * </p>
     * 
     * @param createdAt
     *        The date and time when the endpoint was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The security group configuration of the endpoint.
     * </p>
     * 
     * @param securityGroup
     *        The security group configuration of the endpoint.
     */

    public void setSecurityGroup(String securityGroup) {
        this.securityGroup = securityGroup;
    }

    /**
     * <p>
     * The security group configuration of the endpoint.
     * </p>
     * 
     * @return The security group configuration of the endpoint.
     */

    public String getSecurityGroup() {
        return this.securityGroup;
    }

    /**
     * <p>
     * The security group configuration of the endpoint.
     * </p>
     * 
     * @param securityGroup
     *        The security group configuration of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withSecurityGroup(String securityGroup) {
        setSecurityGroup(securityGroup);
        return this;
    }

    /**
     * <p>
     * The subnet IDs of the endpoint.
     * </p>
     * 
     * @return The subnet IDs of the endpoint.
     */

    public java.util.List<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * <p>
     * The subnet IDs of the endpoint.
     * </p>
     * 
     * @param subnetIds
     *        The subnet IDs of the endpoint.
     */

    public void setSubnetIds(java.util.Collection<String> subnetIds) {
        if (subnetIds == null) {
            this.subnetIds = null;
            return;
        }

        this.subnetIds = new java.util.ArrayList<String>(subnetIds);
    }

    /**
     * <p>
     * The subnet IDs of the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubnetIds(java.util.Collection)} or {@link #withSubnetIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subnetIds
     *        The subnet IDs of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withSubnetIds(String... subnetIds) {
        if (this.subnetIds == null) {
            setSubnetIds(new java.util.ArrayList<String>(subnetIds.length));
        }
        for (String ele : subnetIds) {
            this.subnetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subnet IDs of the endpoint.
     * </p>
     * 
     * @param subnetIds
     *        The subnet IDs of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withSubnetIds(java.util.Collection<String> subnetIds) {
        setSubnetIds(subnetIds);
        return this;
    }

    /**
     * <p>
     * The tags of the endpoint.
     * </p>
     * 
     * @return The tags of the endpoint.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of the endpoint.
     * </p>
     * 
     * @param tags
     *        The tags of the endpoint.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags of the endpoint.
     * </p>
     * 
     * @param tags
     *        The tags of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see Endpoint#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Endpoint addTagsEntry(String key, String value) {
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

    public Endpoint clearTagsEntries() {
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getVirtualClusterId() != null)
            sb.append("VirtualClusterId: ").append(getVirtualClusterId()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getReleaseLabel() != null)
            sb.append("ReleaseLabel: ").append(getReleaseLabel()).append(",");
        if (getExecutionRoleArn() != null)
            sb.append("ExecutionRoleArn: ").append(getExecutionRoleArn()).append(",");
        if (getCertificateArn() != null)
            sb.append("CertificateArn: ").append(getCertificateArn()).append(",");
        if (getConfigurationOverrides() != null)
            sb.append("ConfigurationOverrides: ").append(getConfigurationOverrides()).append(",");
        if (getServerUrl() != null)
            sb.append("ServerUrl: ").append(getServerUrl()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getSecurityGroup() != null)
            sb.append("SecurityGroup: ").append(getSecurityGroup()).append(",");
        if (getSubnetIds() != null)
            sb.append("SubnetIds: ").append(getSubnetIds()).append(",");
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

        if (obj instanceof Endpoint == false)
            return false;
        Endpoint other = (Endpoint) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getVirtualClusterId() == null ^ this.getVirtualClusterId() == null)
            return false;
        if (other.getVirtualClusterId() != null && other.getVirtualClusterId().equals(this.getVirtualClusterId()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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
        if (other.getServerUrl() == null ^ this.getServerUrl() == null)
            return false;
        if (other.getServerUrl() != null && other.getServerUrl().equals(this.getServerUrl()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getSecurityGroup() == null ^ this.getSecurityGroup() == null)
            return false;
        if (other.getSecurityGroup() != null && other.getSecurityGroup().equals(this.getSecurityGroup()) == false)
            return false;
        if (other.getSubnetIds() == null ^ this.getSubnetIds() == null)
            return false;
        if (other.getSubnetIds() != null && other.getSubnetIds().equals(this.getSubnetIds()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getVirtualClusterId() == null) ? 0 : getVirtualClusterId().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getReleaseLabel() == null) ? 0 : getReleaseLabel().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleArn() == null) ? 0 : getExecutionRoleArn().hashCode());
        hashCode = prime * hashCode + ((getCertificateArn() == null) ? 0 : getCertificateArn().hashCode());
        hashCode = prime * hashCode + ((getConfigurationOverrides() == null) ? 0 : getConfigurationOverrides().hashCode());
        hashCode = prime * hashCode + ((getServerUrl() == null) ? 0 : getServerUrl().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroup() == null) ? 0 : getSecurityGroup().hashCode());
        hashCode = prime * hashCode + ((getSubnetIds() == null) ? 0 : getSubnetIds().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public Endpoint clone() {
        try {
            return (Endpoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.emrcontainers.model.transform.EndpointMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
