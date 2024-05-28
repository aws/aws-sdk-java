/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/AddStorageSystem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddStorageSystemRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the server name and network port required to connect with the management interface of your on-premises
     * storage system.
     * </p>
     */
    private DiscoveryServerConfiguration serverConfiguration;
    /**
     * <p>
     * Specifies the type of on-premises storage system that you want DataSync Discovery to collect information about.
     * </p>
     * <note>
     * <p>
     * DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems
     * running ONTAP 9.7 or later.
     * </p>
     * </note>
     */
    private String systemType;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from your on-premises
     * storage system's management interface. You can only specify one ARN.
     * </p>
     */
    private java.util.List<String> agentArns;
    /**
     * <p>
     * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     * </p>
     */
    private String cloudWatchLogGroupArn;
    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your on-premises storage system.
     * </p>
     */
    private java.util.List<TagListEntry> tags;
    /**
     * <p>
     * Specifies a familiar name for your on-premises storage system.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies a client token to make sure requests with this API operation are idempotent. If you don't specify a
     * client token, DataSync generates one for you automatically.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * Specifies the user name and password for accessing your on-premises storage system's management interface.
     * </p>
     */
    private Credentials credentials;

    /**
     * <p>
     * Specifies the server name and network port required to connect with the management interface of your on-premises
     * storage system.
     * </p>
     * 
     * @param serverConfiguration
     *        Specifies the server name and network port required to connect with the management interface of your
     *        on-premises storage system.
     */

    public void setServerConfiguration(DiscoveryServerConfiguration serverConfiguration) {
        this.serverConfiguration = serverConfiguration;
    }

    /**
     * <p>
     * Specifies the server name and network port required to connect with the management interface of your on-premises
     * storage system.
     * </p>
     * 
     * @return Specifies the server name and network port required to connect with the management interface of your
     *         on-premises storage system.
     */

    public DiscoveryServerConfiguration getServerConfiguration() {
        return this.serverConfiguration;
    }

    /**
     * <p>
     * Specifies the server name and network port required to connect with the management interface of your on-premises
     * storage system.
     * </p>
     * 
     * @param serverConfiguration
     *        Specifies the server name and network port required to connect with the management interface of your
     *        on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddStorageSystemRequest withServerConfiguration(DiscoveryServerConfiguration serverConfiguration) {
        setServerConfiguration(serverConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the type of on-premises storage system that you want DataSync Discovery to collect information about.
     * </p>
     * <note>
     * <p>
     * DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems
     * running ONTAP 9.7 or later.
     * </p>
     * </note>
     * 
     * @param systemType
     *        Specifies the type of on-premises storage system that you want DataSync Discovery to collect information
     *        about.</p> <note>
     *        <p>
     *        DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems
     *        running ONTAP 9.7 or later.
     *        </p>
     * @see DiscoverySystemType
     */

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    /**
     * <p>
     * Specifies the type of on-premises storage system that you want DataSync Discovery to collect information about.
     * </p>
     * <note>
     * <p>
     * DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems
     * running ONTAP 9.7 or later.
     * </p>
     * </note>
     * 
     * @return Specifies the type of on-premises storage system that you want DataSync Discovery to collect information
     *         about.</p> <note>
     *         <p>
     *         DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF)
     *         systems running ONTAP 9.7 or later.
     *         </p>
     * @see DiscoverySystemType
     */

    public String getSystemType() {
        return this.systemType;
    }

    /**
     * <p>
     * Specifies the type of on-premises storage system that you want DataSync Discovery to collect information about.
     * </p>
     * <note>
     * <p>
     * DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems
     * running ONTAP 9.7 or later.
     * </p>
     * </note>
     * 
     * @param systemType
     *        Specifies the type of on-premises storage system that you want DataSync Discovery to collect information
     *        about.</p> <note>
     *        <p>
     *        DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems
     *        running ONTAP 9.7 or later.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoverySystemType
     */

    public AddStorageSystemRequest withSystemType(String systemType) {
        setSystemType(systemType);
        return this;
    }

    /**
     * <p>
     * Specifies the type of on-premises storage system that you want DataSync Discovery to collect information about.
     * </p>
     * <note>
     * <p>
     * DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems
     * running ONTAP 9.7 or later.
     * </p>
     * </note>
     * 
     * @param systemType
     *        Specifies the type of on-premises storage system that you want DataSync Discovery to collect information
     *        about.</p> <note>
     *        <p>
     *        DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS (AFF) systems
     *        running ONTAP 9.7 or later.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DiscoverySystemType
     */

    public AddStorageSystemRequest withSystemType(DiscoverySystemType systemType) {
        this.systemType = systemType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from your on-premises
     * storage system's management interface. You can only specify one ARN.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from your
     *         on-premises storage system's management interface. You can only specify one ARN.
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from your on-premises
     * storage system's management interface. You can only specify one ARN.
     * </p>
     * 
     * @param agentArns
     *        Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from your
     *        on-premises storage system's management interface. You can only specify one ARN.
     */

    public void setAgentArns(java.util.Collection<String> agentArns) {
        if (agentArns == null) {
            this.agentArns = null;
            return;
        }

        this.agentArns = new java.util.ArrayList<String>(agentArns);
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from your on-premises
     * storage system's management interface. You can only specify one ARN.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from your
     *        on-premises storage system's management interface. You can only specify one ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddStorageSystemRequest withAgentArns(String... agentArns) {
        if (this.agentArns == null) {
            setAgentArns(new java.util.ArrayList<String>(agentArns.length));
        }
        for (String ele : agentArns) {
            this.agentArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from your on-premises
     * storage system's management interface. You can only specify one ARN.
     * </p>
     * 
     * @param agentArns
     *        Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from your
     *        on-premises storage system's management interface. You can only specify one ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddStorageSystemRequest withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * <p>
     * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     */

    public void setCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     * </p>
     * 
     * @return Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     */

    public String getCloudWatchLogGroupArn() {
        return this.cloudWatchLogGroupArn;
    }

    /**
     * <p>
     * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     * </p>
     * 
     * @param cloudWatchLogGroupArn
     *        Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddStorageSystemRequest withCloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
        setCloudWatchLogGroupArn(cloudWatchLogGroupArn);
        return this;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your on-premises storage system.
     * </p>
     * 
     * @return Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *         recommend creating at least a name tag for your on-premises storage system.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your on-premises storage system.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your on-premises storage system.
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your on-premises storage system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddStorageSystemRequest withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your on-premises storage system.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddStorageSystemRequest withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies a familiar name for your on-premises storage system.
     * </p>
     * 
     * @param name
     *        Specifies a familiar name for your on-premises storage system.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies a familiar name for your on-premises storage system.
     * </p>
     * 
     * @return Specifies a familiar name for your on-premises storage system.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies a familiar name for your on-premises storage system.
     * </p>
     * 
     * @param name
     *        Specifies a familiar name for your on-premises storage system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddStorageSystemRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies a client token to make sure requests with this API operation are idempotent. If you don't specify a
     * client token, DataSync generates one for you automatically.
     * </p>
     * 
     * @param clientToken
     *        Specifies a client token to make sure requests with this API operation are idempotent. If you don't
     *        specify a client token, DataSync generates one for you automatically.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Specifies a client token to make sure requests with this API operation are idempotent. If you don't specify a
     * client token, DataSync generates one for you automatically.
     * </p>
     * 
     * @return Specifies a client token to make sure requests with this API operation are idempotent. If you don't
     *         specify a client token, DataSync generates one for you automatically.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Specifies a client token to make sure requests with this API operation are idempotent. If you don't specify a
     * client token, DataSync generates one for you automatically.
     * </p>
     * 
     * @param clientToken
     *        Specifies a client token to make sure requests with this API operation are idempotent. If you don't
     *        specify a client token, DataSync generates one for you automatically.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddStorageSystemRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * Specifies the user name and password for accessing your on-premises storage system's management interface.
     * </p>
     * 
     * @param credentials
     *        Specifies the user name and password for accessing your on-premises storage system's management interface.
     */

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * Specifies the user name and password for accessing your on-premises storage system's management interface.
     * </p>
     * 
     * @return Specifies the user name and password for accessing your on-premises storage system's management
     *         interface.
     */

    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * Specifies the user name and password for accessing your on-premises storage system's management interface.
     * </p>
     * 
     * @param credentials
     *        Specifies the user name and password for accessing your on-premises storage system's management interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddStorageSystemRequest withCredentials(Credentials credentials) {
        setCredentials(credentials);
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
        if (getServerConfiguration() != null)
            sb.append("ServerConfiguration: ").append(getServerConfiguration()).append(",");
        if (getSystemType() != null)
            sb.append("SystemType: ").append(getSystemType()).append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns()).append(",");
        if (getCloudWatchLogGroupArn() != null)
            sb.append("CloudWatchLogGroupArn: ").append(getCloudWatchLogGroupArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddStorageSystemRequest == false)
            return false;
        AddStorageSystemRequest other = (AddStorageSystemRequest) obj;
        if (other.getServerConfiguration() == null ^ this.getServerConfiguration() == null)
            return false;
        if (other.getServerConfiguration() != null && other.getServerConfiguration().equals(this.getServerConfiguration()) == false)
            return false;
        if (other.getSystemType() == null ^ this.getSystemType() == null)
            return false;
        if (other.getSystemType() != null && other.getSystemType().equals(this.getSystemType()) == false)
            return false;
        if (other.getAgentArns() == null ^ this.getAgentArns() == null)
            return false;
        if (other.getAgentArns() != null && other.getAgentArns().equals(this.getAgentArns()) == false)
            return false;
        if (other.getCloudWatchLogGroupArn() == null ^ this.getCloudWatchLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogGroupArn() != null && other.getCloudWatchLogGroupArn().equals(this.getCloudWatchLogGroupArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getServerConfiguration() == null) ? 0 : getServerConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSystemType() == null) ? 0 : getSystemType().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        hashCode = prime * hashCode + ((getCloudWatchLogGroupArn() == null) ? 0 : getCloudWatchLogGroupArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        return hashCode;
    }

    @Override
    public AddStorageSystemRequest clone() {
        return (AddStorageSystemRequest) super.clone();
    }

}
