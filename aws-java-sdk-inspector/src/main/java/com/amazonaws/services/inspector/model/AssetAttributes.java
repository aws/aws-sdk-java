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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of attributes of the host from which the finding is generated.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/AssetAttributes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The schema version of this data type.
     * </p>
     */
    private Integer schemaVersion;
    /**
     * <p>
     * The ID of the agent that is installed on the EC2 instance where the finding is generated.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The Auto Scaling group of the EC2 instance where the finding is generated.
     * </p>
     */
    private String autoScalingGroup;
    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is generated.
     * </p>
     */
    private String amiId;
    /**
     * <p>
     * The hostname of the EC2 instance where the finding is generated.
     * </p>
     */
    private String hostname;
    /**
     * <p>
     * The list of IP v4 addresses of the EC2 instance where the finding is generated.
     * </p>
     */
    private java.util.List<String> ipv4Addresses;
    /**
     * <p>
     * The tags related to the EC2 instance where the finding is generated.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * An array of the network interfaces interacting with the EC2 instance where the finding is generated.
     * </p>
     */
    private java.util.List<NetworkInterface> networkInterfaces;

    /**
     * <p>
     * The schema version of this data type.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version of this data type.
     */

    public void setSchemaVersion(Integer schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    /**
     * <p>
     * The schema version of this data type.
     * </p>
     * 
     * @return The schema version of this data type.
     */

    public Integer getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * <p>
     * The schema version of this data type.
     * </p>
     * 
     * @param schemaVersion
     *        The schema version of this data type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetAttributes withSchemaVersion(Integer schemaVersion) {
        setSchemaVersion(schemaVersion);
        return this;
    }

    /**
     * <p>
     * The ID of the agent that is installed on the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param agentId
     *        The ID of the agent that is installed on the EC2 instance where the finding is generated.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * The ID of the agent that is installed on the EC2 instance where the finding is generated.
     * </p>
     * 
     * @return The ID of the agent that is installed on the EC2 instance where the finding is generated.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * The ID of the agent that is installed on the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param agentId
     *        The ID of the agent that is installed on the EC2 instance where the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetAttributes withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The Auto Scaling group of the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param autoScalingGroup
     *        The Auto Scaling group of the EC2 instance where the finding is generated.
     */

    public void setAutoScalingGroup(String autoScalingGroup) {
        this.autoScalingGroup = autoScalingGroup;
    }

    /**
     * <p>
     * The Auto Scaling group of the EC2 instance where the finding is generated.
     * </p>
     * 
     * @return The Auto Scaling group of the EC2 instance where the finding is generated.
     */

    public String getAutoScalingGroup() {
        return this.autoScalingGroup;
    }

    /**
     * <p>
     * The Auto Scaling group of the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param autoScalingGroup
     *        The Auto Scaling group of the EC2 instance where the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetAttributes withAutoScalingGroup(String autoScalingGroup) {
        setAutoScalingGroup(autoScalingGroup);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param amiId
     *        The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is
     *        generated.
     */

    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is generated.
     * </p>
     * 
     * @return The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is
     *         generated.
     */

    public String getAmiId() {
        return this.amiId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param amiId
     *        The ID of the Amazon Machine Image (AMI) that is installed on the EC2 instance where the finding is
     *        generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetAttributes withAmiId(String amiId) {
        setAmiId(amiId);
        return this;
    }

    /**
     * <p>
     * The hostname of the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param hostname
     *        The hostname of the EC2 instance where the finding is generated.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The hostname of the EC2 instance where the finding is generated.
     * </p>
     * 
     * @return The hostname of the EC2 instance where the finding is generated.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The hostname of the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param hostname
     *        The hostname of the EC2 instance where the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetAttributes withHostname(String hostname) {
        setHostname(hostname);
        return this;
    }

    /**
     * <p>
     * The list of IP v4 addresses of the EC2 instance where the finding is generated.
     * </p>
     * 
     * @return The list of IP v4 addresses of the EC2 instance where the finding is generated.
     */

    public java.util.List<String> getIpv4Addresses() {
        return ipv4Addresses;
    }

    /**
     * <p>
     * The list of IP v4 addresses of the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param ipv4Addresses
     *        The list of IP v4 addresses of the EC2 instance where the finding is generated.
     */

    public void setIpv4Addresses(java.util.Collection<String> ipv4Addresses) {
        if (ipv4Addresses == null) {
            this.ipv4Addresses = null;
            return;
        }

        this.ipv4Addresses = new java.util.ArrayList<String>(ipv4Addresses);
    }

    /**
     * <p>
     * The list of IP v4 addresses of the EC2 instance where the finding is generated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv4Addresses(java.util.Collection)} or {@link #withIpv4Addresses(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ipv4Addresses
     *        The list of IP v4 addresses of the EC2 instance where the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetAttributes withIpv4Addresses(String... ipv4Addresses) {
        if (this.ipv4Addresses == null) {
            setIpv4Addresses(new java.util.ArrayList<String>(ipv4Addresses.length));
        }
        for (String ele : ipv4Addresses) {
            this.ipv4Addresses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of IP v4 addresses of the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param ipv4Addresses
     *        The list of IP v4 addresses of the EC2 instance where the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetAttributes withIpv4Addresses(java.util.Collection<String> ipv4Addresses) {
        setIpv4Addresses(ipv4Addresses);
        return this;
    }

    /**
     * <p>
     * The tags related to the EC2 instance where the finding is generated.
     * </p>
     * 
     * @return The tags related to the EC2 instance where the finding is generated.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags related to the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param tags
     *        The tags related to the EC2 instance where the finding is generated.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags related to the EC2 instance where the finding is generated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags related to the EC2 instance where the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetAttributes withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags related to the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param tags
     *        The tags related to the EC2 instance where the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetAttributes withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * An array of the network interfaces interacting with the EC2 instance where the finding is generated.
     * </p>
     * 
     * @return An array of the network interfaces interacting with the EC2 instance where the finding is generated.
     */

    public java.util.List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * <p>
     * An array of the network interfaces interacting with the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param networkInterfaces
     *        An array of the network interfaces interacting with the EC2 instance where the finding is generated.
     */

    public void setNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        if (networkInterfaces == null) {
            this.networkInterfaces = null;
            return;
        }

        this.networkInterfaces = new java.util.ArrayList<NetworkInterface>(networkInterfaces);
    }

    /**
     * <p>
     * An array of the network interfaces interacting with the EC2 instance where the finding is generated.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkInterfaces(java.util.Collection)} or {@link #withNetworkInterfaces(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param networkInterfaces
     *        An array of the network interfaces interacting with the EC2 instance where the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetAttributes withNetworkInterfaces(NetworkInterface... networkInterfaces) {
        if (this.networkInterfaces == null) {
            setNetworkInterfaces(new java.util.ArrayList<NetworkInterface>(networkInterfaces.length));
        }
        for (NetworkInterface ele : networkInterfaces) {
            this.networkInterfaces.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the network interfaces interacting with the EC2 instance where the finding is generated.
     * </p>
     * 
     * @param networkInterfaces
     *        An array of the network interfaces interacting with the EC2 instance where the finding is generated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetAttributes withNetworkInterfaces(java.util.Collection<NetworkInterface> networkInterfaces) {
        setNetworkInterfaces(networkInterfaces);
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
        if (getSchemaVersion() != null)
            sb.append("SchemaVersion: ").append(getSchemaVersion()).append(",");
        if (getAgentId() != null)
            sb.append("AgentId: ").append(getAgentId()).append(",");
        if (getAutoScalingGroup() != null)
            sb.append("AutoScalingGroup: ").append(getAutoScalingGroup()).append(",");
        if (getAmiId() != null)
            sb.append("AmiId: ").append(getAmiId()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname()).append(",");
        if (getIpv4Addresses() != null)
            sb.append("Ipv4Addresses: ").append(getIpv4Addresses()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getNetworkInterfaces() != null)
            sb.append("NetworkInterfaces: ").append(getNetworkInterfaces());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetAttributes == false)
            return false;
        AssetAttributes other = (AssetAttributes) obj;
        if (other.getSchemaVersion() == null ^ this.getSchemaVersion() == null)
            return false;
        if (other.getSchemaVersion() != null && other.getSchemaVersion().equals(this.getSchemaVersion()) == false)
            return false;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAutoScalingGroup() == null ^ this.getAutoScalingGroup() == null)
            return false;
        if (other.getAutoScalingGroup() != null && other.getAutoScalingGroup().equals(this.getAutoScalingGroup()) == false)
            return false;
        if (other.getAmiId() == null ^ this.getAmiId() == null)
            return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        if (other.getIpv4Addresses() == null ^ this.getIpv4Addresses() == null)
            return false;
        if (other.getIpv4Addresses() != null && other.getIpv4Addresses().equals(this.getIpv4Addresses()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getNetworkInterfaces() == null ^ this.getNetworkInterfaces() == null)
            return false;
        if (other.getNetworkInterfaces() != null && other.getNetworkInterfaces().equals(this.getNetworkInterfaces()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaVersion() == null) ? 0 : getSchemaVersion().hashCode());
        hashCode = prime * hashCode + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroup() == null) ? 0 : getAutoScalingGroup().hashCode());
        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode());
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode());
        hashCode = prime * hashCode + ((getIpv4Addresses() == null) ? 0 : getIpv4Addresses().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getNetworkInterfaces() == null) ? 0 : getNetworkInterfaces().hashCode());
        return hashCode;
    }

    @Override
    public AssetAttributes clone() {
        try {
            return (AssetAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.AssetAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
